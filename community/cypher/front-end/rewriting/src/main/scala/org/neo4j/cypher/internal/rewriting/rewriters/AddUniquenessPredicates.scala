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
package org.neo4j.cypher.internal.rewriting.rewriters

import org.neo4j.cypher.internal.ast.Clause
import org.neo4j.cypher.internal.ast.Match
import org.neo4j.cypher.internal.ast.Merge
import org.neo4j.cypher.internal.ast.Where
import org.neo4j.cypher.internal.ast.semantics.SemanticState
import org.neo4j.cypher.internal.expressions
import org.neo4j.cypher.internal.expressions.And
import org.neo4j.cypher.internal.expressions.AnyIterablePredicate
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LogicalVariable
import org.neo4j.cypher.internal.expressions.NoneIterablePredicate
import org.neo4j.cypher.internal.expressions.Not
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.ScopeExpression
import org.neo4j.cypher.internal.expressions.ShortestPaths
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.rewriting.conditions.PatternExpressionsHaveSemanticInfo
import org.neo4j.cypher.internal.rewriting.conditions.noUnnamedPatternElementsInMatch
import org.neo4j.cypher.internal.rewriting.conditions.noUnnamedPatternElementsInPatternComprehension
import org.neo4j.cypher.internal.rewriting.rewriters.factories.ASTRewriterFactory
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.CypherExceptionFactory
import org.neo4j.cypher.internal.util.Foldable.SkipChildren
import org.neo4j.cypher.internal.util.Foldable.TraverseChildren
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.StepSequencer.Step
import org.neo4j.cypher.internal.util.bottomUp
import org.neo4j.cypher.internal.util.symbols.CypherType

case object RelationshipUniquenessPredicatesInMatchAndMerge extends StepSequencer.Condition

case class AddUniquenessPredicates(anonymousVariableNameGenerator: AnonymousVariableNameGenerator) extends Rewriter {

  override def apply(that: AnyRef): AnyRef = instance(that)

  private val rewriter = Rewriter.lift {
    case m@Match(_, pattern: Pattern, _, where: Option[Where]) =>
      val uniqueRels: Seq[UniqueRel] = collectUniqueRels(pattern)
      if (uniqueRels.size < 2) {
        m
      } else {
        val newWhere = addPredicate(m, uniqueRels, where)
        m.copy(where = newWhere)(m.position)
      }
    case m@Merge(pattern: Pattern, _, where: Option[Where]) =>
      val uniqueRels: Seq[UniqueRel] = collectUniqueRels(pattern)
      if (uniqueRels.size < 2) {
        m
      } else {
        val newWhere = addPredicate(m, uniqueRels, where)
        m.copy(where = newWhere)(m.position)
      }
  }

  private def addPredicate(clause: Clause, uniqueRels:  Seq[UniqueRel], where: Option[Where]): Option[Where] = {
    val maybePredicate: Option[Expression] = createPredicateFor(uniqueRels, clause.position)
    val newWhere: Option[Where] = (where, maybePredicate) match {
      case (Some(oldWhere), Some(newPredicate)) =>
        Some(oldWhere.copy(expression = And(oldWhere.expression, newPredicate)(clause.position))(clause.position))

      case (None, Some(newPredicate)) =>
        Some(Where(expression = newPredicate)(clause.position))

      case (oldWhere, None) => oldWhere
    }
    newWhere
  }

  private val instance = bottomUp(rewriter, _.isInstanceOf[Expression])

  def collectUniqueRels(pattern: ASTNode): Seq[UniqueRel] =
    pattern.folder.treeFold(Seq.empty[UniqueRel]) {
      case _:ScopeExpression =>
        acc => SkipChildren(acc)

      case _: ShortestPaths =>
        acc => SkipChildren(acc)

      case RelationshipChain(_, patRel@RelationshipPattern(optIdent, types, _, _, _, _), _) =>
        acc => {
          val ident = optIdent.getOrElse(throw new IllegalStateException("This rewriter cannot work with unnamed patterns"))
          TraverseChildren(acc :+ UniqueRel(ident, types.toSet, patRel.isSingleLength))
        }
    }

  private def createPredicateFor(uniqueRels: Seq[UniqueRel], pos: InputPosition): Option[Expression] = {
    createPredicatesFor(uniqueRels, pos).reduceOption(expressions.And(_, _)(pos))
  }

  def createPredicatesFor(uniqueRels: Seq[UniqueRel], pos: InputPosition): Seq[Expression] =
    for {
      x <- uniqueRels
      y <- uniqueRels if x.name < y.name && !x.isAlwaysDifferentFrom(y)
    } yield {
      (x.singleLength, y.singleLength) match {
        case (true, true) =>
          Not(Equals(x.variable.copyId, y.variable.copyId)(pos))(pos)

        case (true, false) =>
          val innerY = Variable(anonymousVariableNameGenerator.nextName)(y.variable.position)
          NoneIterablePredicate(innerY, y.variable.copyId, Some(Equals(x.variable.copyId, innerY.copyId)(pos)))(pos)

        case (false, true) =>
          val innerX = Variable(anonymousVariableNameGenerator.nextName)(x.variable.position)
          NoneIterablePredicate(innerX, x.variable.copyId, Some(Equals(innerX.copyId, y.variable.copyId)(pos)))(pos)

        case (false, false) =>
          val innerX = Variable(anonymousVariableNameGenerator.nextName)(x.variable.position)
          val innerY = Variable(anonymousVariableNameGenerator.nextName)(y.variable.position)
          NoneIterablePredicate(innerX, x.variable.copyId, Some(AnyIterablePredicate(innerY, y.variable.copyId, Some(Equals(innerX.copyId, innerY.copyId)(pos)))(pos)))(pos)
      }
    }

  case class UniqueRel(variable: LogicalVariable, types: Set[RelTypeName], singleLength: Boolean) {
    def name: String = variable.name

    def isAlwaysDifferentFrom(other: UniqueRel): Boolean =
      types.nonEmpty && other.types.nonEmpty && (types intersect other.types).isEmpty
  }
}

object AddUniquenessPredicates extends Step with ASTRewriterFactory {
  override def preConditions: Set[StepSequencer.Condition] = Set(
    noUnnamedPatternElementsInMatch,
    noUnnamedPatternElementsInPatternComprehension
  )

  override def postConditions: Set[StepSequencer.Condition] = Set(RelationshipUniquenessPredicatesInMatchAndMerge)

  override def invalidatedConditions: Set[StepSequencer.Condition] = Set(
    ProjectionClausesHaveSemanticInfo, // It can invalidate this condition by rewriting things inside WITH/RETURN.
    PatternExpressionsHaveSemanticInfo, // It can invalidate this condition by rewriting things inside PatternExpressions.
  )

  override def getRewriter(semanticState: SemanticState,
                           parameterTypeMapping: Map[String, CypherType],
                           cypherExceptionFactory: CypherExceptionFactory,
                           anonymousVariableNameGenerator: AnonymousVariableNameGenerator): Rewriter = AddUniquenessPredicates(anonymousVariableNameGenerator)
}
