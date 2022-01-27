/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypher.internal.frontend.phases

import org.neo4j.cypher.internal.ast.Where
import org.neo4j.cypher.internal.ast.semantics.SemanticFeature
import org.neo4j.cypher.internal.expressions.And
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.ExistsSubClause
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Not
import org.neo4j.cypher.internal.expressions.Or
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.frontend.phases.factories.PlanPipelineTransformerFactory
import org.neo4j.cypher.internal.frontend.phases.rewriting.cnf.AndRewrittenToAnds
import org.neo4j.cypher.internal.rewriting.conditions.SemanticInfoAvailable
import org.neo4j.cypher.internal.util.Foldable.SkipChildren
import org.neo4j.cypher.internal.util.Foldable.TraverseChildren
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.bottomUp
import org.neo4j.cypher.internal.util.helpers.fixedPoint


case object TransitiveClosureAppliedToWhereClauses extends StepSequencer.Condition

/**
 * Transitive closure of where clauses.
 *
 * Given a where clause, `WHERE a.prop = b.prop AND b.prop = 42` we rewrite the query
 * into `WHERE a.prop = 42 AND b.prop = 42`
 */
case object transitiveClosure extends StatementRewriter with StepSequencer.Step with PlanPipelineTransformerFactory {

  override def instance(from: BaseState, ignored: BaseContext): Rewriter = transitiveClosureRewriter

  private case object transitiveClosureRewriter extends Rewriter {

    def apply(that: AnyRef): AnyRef = instance.apply(that)

    private val instance: Rewriter = bottomUp(Rewriter.lift {
      case where: Where => fixedPoint((w: Where) => w.endoRewrite(whereRewriter))(where)
    })

    //Collects property equalities, e.g `a.prop = 42`
    private def collect(e: Expression): Closures = e.treeFold(Closures.empty) {
      case _: Or => acc => SkipChildren(acc)
      case _: And => acc => TraverseChildren(acc)
      case Equals(p1: Property, p2: Property) => acc => SkipChildren(acc.withEquivalence(p1 -> p2))
      case Equals(p: Property, other) => acc => SkipChildren(acc.withMapping(p -> other))
      case Not(Equals(_,_)) => acc => SkipChildren(acc)
    }

    //NOTE that this might introduce duplicate predicates, however at a later rewrite
    //when AND is turned into ANDS we remove all duplicates
    private val whereRewriter: Rewriter = bottomUp(Rewriter.lift {
      case and@(And(_, _: ExistsSubClause) | And(_: ExistsSubClause, _)) =>
        and
      case and@And(lhs, rhs) =>
        val closures = collect(lhs) ++ collect(rhs)
        val inner = andRewriter(closures)
        val newAnd = and.copy(lhs = lhs.endoRewrite(inner), rhs = rhs.endoRewrite(inner))(and.position)

        //ALSO take care of case WHERE b.prop = a.prop AND b.prop = 42
        //turns into WHERE b.prop = a.prop AND b.prop = 42 AND a.prop = 42
        closures.emergentEqualities.foldLeft(newAnd) {
          case (acc, (prop, expr)) =>
            And(acc, Equals(prop, expr)(acc.position))(acc.position)
        }
    })

    private def andRewriter(closures: Closures): Rewriter = {
      val stopOnNotEquals: AnyRef => Boolean = {
        case Not(Equals(_, _)) => true
        case _ => false
      }

      bottomUp(Rewriter.lift {
        case equals@Equals(p1: Property, p2: Property) if closures.mapping.contains(p2) =>
          equals.copy(rhs = closures.mapping(p2))(equals.position)
      }, stopOnNotEquals)
    }
  }

  case class Closures(mapping: Map[Property, Expression] = Map.empty,
                      equivalence: Map[Property, Property] = Map.empty) {

    def withMapping(e:(Property,Expression)): Closures = copy(mapping = mapping + e)
    def withEquivalence(e:(Property,Property)): Closures = copy(equivalence = equivalence + e )

    def emergentEqualities: Map[Property, Expression] = {
      val sharedKeys = equivalence.keySet.intersect(mapping.keySet)

      sharedKeys.map(k => equivalence(k) -> mapping(k)).toMap -- mapping.keySet
    }

    def ++(other: Closures): Closures = copy(mapping ++ other.mapping, equivalence ++ other.equivalence)
  }

  object Closures {
    def empty: Closures = Closures()
  }

  override def preConditions: Set[StepSequencer.Condition] = Set(
    // This rewriter matches on Equals, so it must run before that is rewritten to In
    !EqualityRewrittenToIn,
    // This rewriter matches on And, so it must run before that is rewritten to Ands
    !AndRewrittenToAnds
  )

  override def postConditions: Set[StepSequencer.Condition] = Set(TransitiveClosureAppliedToWhereClauses)

  override def invalidatedConditions: Set[StepSequencer.Condition] = Set(
    // This Rewriter creates Equals AST nodes.
    EqualityRewrittenToIn
  ) ++ SemanticInfoAvailable // Introduces new AST nodes

  override def getTransformer(pushdownPropertyReads: Boolean,
                              semanticFeatures: Seq[SemanticFeature]): Transformer[BaseContext, BaseState, BaseState] = this
}
