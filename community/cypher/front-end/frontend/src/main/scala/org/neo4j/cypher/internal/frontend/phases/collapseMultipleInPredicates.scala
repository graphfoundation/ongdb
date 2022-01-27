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

import org.neo4j.cypher.internal.ast.semantics.SemanticFeature
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.In
import org.neo4j.cypher.internal.expressions.ListLiteral
import org.neo4j.cypher.internal.expressions.Ors
import org.neo4j.cypher.internal.frontend.phases.factories.PlanPipelineTransformerFactory
import org.neo4j.cypher.internal.frontend.phases.rewriting.cnf.CNFNormalizer.PredicatesInCNF
import org.neo4j.cypher.internal.rewriting.conditions.SemanticInfoAvailable
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.bottomUp

import scala.collection.immutable.Iterable

case object EqualityRewrittenToIn extends StepSequencer.Condition
case object InPredicatesCollapsed extends StepSequencer.Condition

/**
 * This class merges multiple IN predicates into larger ones.
 * These can later be turned into index lookups or node-by-id ops.
 */
case object collapseMultipleInPredicates extends StatementRewriter with StepSequencer.Step with PlanPipelineTransformerFactory {
  case class InValue(lhs: Expression, expr: Expression)

  override def instance(from: BaseState, ignored: BaseContext): Rewriter = bottomUp(Rewriter.lift {
    case predicate@Ors(booleanExpressions) =>
      val (expressionsToRewrite: Seq[Expression], nonRewritable: Seq[Expression]) = booleanExpressions.partition {
        case In(_, _: ListLiteral) => true
        case _ => false
      }

      // We regroup the expressions by their left hand side
      val insByLhs = expressionsToRewrite.flatMap {
        case In(lhs, rhs: ListLiteral) =>
          rhs.expressions.map(expr => InValue(lhs, expr))
      }.groupBy(_.lhs)

      // Find all IN-expressions with the same left hand side and rebuild the expressions
      val reorderedInExpressions: Iterable[In] = insByLhs.map {
        case (lhs, values) =>
          val pos = lhs.position
          In(lhs, ListLiteral(values.map(_.expr).toIndexedSeq)(pos))(pos)
      }

      // Return the original non-rewritten expressions together with our new ones
      val allNewExpressions = nonRewritable ++ reorderedInExpressions
      allNewExpressions match {
        case head :: Nil if !reorderedInExpressions.isEmpty =>
          // we only have one element from reorderedInExpressions
          head
        case l => Ors(l)(predicate.position)
      }
  })

  override def preConditions: Set[StepSequencer.Condition] = Set(EqualityRewrittenToIn) ++ PredicatesInCNF

  override def postConditions: Set[StepSequencer.Condition] = Set(InPredicatesCollapsed)

  override def invalidatedConditions: Set[StepSequencer.Condition] = SemanticInfoAvailable // Introduces new AST nodes

  override def getTransformer(pushdownPropertyReads: Boolean,
                              semanticFeatures: Seq[SemanticFeature]): Transformer[BaseContext, BaseState, BaseState] = this
}
