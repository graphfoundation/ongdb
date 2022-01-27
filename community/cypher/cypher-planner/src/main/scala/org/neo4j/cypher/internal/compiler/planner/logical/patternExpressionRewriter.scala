/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.compiler.planner.logical

import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.PathExpression
import org.neo4j.cypher.internal.expressions.PathStep
import org.neo4j.cypher.internal.expressions.PatternComprehension
import org.neo4j.cypher.internal.expressions.PatternExpression
import org.neo4j.cypher.internal.expressions.RelationshipsPattern
import org.neo4j.cypher.internal.expressions.functions.Exists
import org.neo4j.cypher.internal.logical.plans.NestedPlanCollectExpression
import org.neo4j.cypher.internal.logical.plans.NestedPlanExpression
import org.neo4j.cypher.internal.rewriting.rewriters.projectNamedPaths
import org.neo4j.cypher.internal.util.Foldable.FoldableAny
import org.neo4j.cypher.internal.util.Foldable.TraverseChildren
import org.neo4j.cypher.internal.util.IdentityMap
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.topDown

/*
Rewrite pattern expressions and pattern comprehensions to nested plan expressions by planning them using the given context.
This is only done for expressions that have not already been unnested.

We don't pass in the interesting order because
  i) There is no way of expressing order within a pattern comprehension
  ii) It can lead to endless recursion in case the sort expression contains the subquery we are solving
 */
case class patternExpressionRewriter(planArguments: Set[String], context: LogicalPlanningContext) extends Rewriter {

  override def apply(that: AnyRef): AnyRef = that match {
    case expression: Expression =>
      val scopeMap = computeScopeMap(expression)

      // build an identity map of replacements
      val replacements = computeReplacements(scopeMap, that)

      // apply replacements, descending into the replacements themselves recursively
      val rewriter = createRewriter(replacements)

      expression.endoRewrite(rewriter)
  }

  private def computeScopeMap(expression: Expression) = {
    val exprScopes = expression.inputs.map {
      case (k, v) => k -> v.map(_.name)
    }
    IdentityMap(exprScopes: _*)
  }

  private def computeReplacements(scopeMap: IdentityMap[Expression, Set[String]], that: AnyRef): IdentityMap[AnyRef, AnyRef] = {
    that.treeFold(IdentityMap.empty[AnyRef, AnyRef]) {

      case expr@Exists(pattern@PatternExpression(_: RelationshipsPattern)) =>
        acc =>
          val newAcc = if (acc.contains(expr)) {
            acc
          } else {
            val arguments = planArguments ++ scopeMap(pattern)
            val plan = context.strategy.planPatternExpression(arguments, pattern, context)
            val rewrittenExpression = NestedPlanExpression.exists(plan, expr)(pattern.position)
            acc.updated(expr, rewrittenExpression)
               .updated(pattern, ERROR("Should never attempt to rewrite pattern in exists(PatternExpression) on it's own"))
          }

          TraverseChildren(newAcc)

      // replace pattern expressions with their plan and also register
      // the contained pattern expression for no further processing
      // by this tree fold
      case expr@PatternExpression(_: RelationshipsPattern) =>
        acc =>
          // only process pattern expressions that were not contained in previously seen nested plans
          val newAcc = if (acc.contains(expr)) {
            acc
          } else {
            val arguments = planArguments ++ scopeMap(expr)
            val plan = context.strategy.planPatternExpression(arguments, expr, context)
            val path = EveryPath(expr.pattern.element)
            val step: PathStep = projectNamedPaths.patternPartPathExpression(path)
            val pathExpression: PathExpression = PathExpression(step)(expr.position)

            val rewrittenExpression = NestedPlanExpression.collect(plan, pathExpression, expr)(expr.position)
            acc.updated(expr, rewrittenExpression)
          }

          TraverseChildren(newAcc)

      // replace pattern comprehension
      case expr@PatternComprehension(namedPath, _, _, projection) =>
        acc =>
          require(namedPath.isEmpty, "Named paths in pattern comprehensions should have been rewritten away already")
          // only process pattern expressions that were not contained in previously seen nested plans
          val newAcc = if (acc.contains(expr)) {
            acc
          } else {
            val arguments = planArguments ++ scopeMap(expr)
            val plan = context.strategy.planPatternComprehension(arguments, expr, context)
            val uniqueNamedExpr = expr.copy()(expr.position, expr.outerScope, expr.variableToCollectName, expr.collectionName)

            val rewrittenExpression = NestedPlanExpression.collect(plan, projection, expr)(uniqueNamedExpr.position)
            acc.updated(expr, rewrittenExpression)
          }

          TraverseChildren(newAcc)

      // Never ever replace pattern expressions in nested plan expressions in the original expression
      case NestedPlanCollectExpression(_, pattern, _) =>
        acc => TraverseChildren(acc.updated(pattern, pattern))
    }
  }

  private def createRewriter(replacements: IdentityMap[AnyRef, AnyRef]): Rewriter = {
    val rewriter = Rewriter.lift {
      case that => replacements.getOrElse(that, that)
    }
    topDown(rewriter, _.isInstanceOf[NestedPlanExpression])
  }

  case class ERROR(msg: String)
}
