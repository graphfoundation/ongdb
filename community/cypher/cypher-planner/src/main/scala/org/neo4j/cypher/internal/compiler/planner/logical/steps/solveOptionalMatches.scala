/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.ast.Hint
import org.neo4j.cypher.internal.ast.UsingJoinHint
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.idp.BestResults
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.compiler.planner.logical.plans.rewriter.unnestOptional
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.logical.plans.LogicalPlan

trait OptionalSolver {
  /**
   * Return a Solver for an OPTIONAL MATCH.
   *
   * @param optionalQg             the query graph of the OPTIONAL MATCH
   * @param enclosingQg            the query graph enclosing the `optionalQg`
   * @param interestingOrderConfig the InterestingOrderConfig
   * @param context                the LogicalPlanningContext
   * @return a Solver that given a plan for the `enclosingQg` and any so far connected components or other OPTIONAL MATCHES
   *         returns an Iterator of plan candidates solving the OPTIONAL MATCH.
   */
  def solver(optionalQg: QueryGraph,
            enclosingQg: QueryGraph,
            interestingOrderConfig: InterestingOrderConfig,
            context: LogicalPlanningContext): OptionalSolver.Solver
}

object OptionalSolver {
  trait Solver {
    /**
     * Solve an OPTIONAL MATCH.
     *
     * @param lp the plan for `enclosingQg` and any so far connected components or other OPTIONAL MATCHES
     * @return an Iterator of plan candidates solving the OPTIONAL MATCH.
     */
    def connect(lp: LogicalPlan): Iterator[LogicalPlan]
  }
}


case object applyOptional extends OptionalSolver {
  override def solver(optionalQg: QueryGraph,
                     enclosingQg: QueryGraph,
                     interestingOrderConfig: InterestingOrderConfig,
                     context: LogicalPlanningContext): OptionalSolver.Solver = {
    val innerContext: LogicalPlanningContext = context.withFusedLabelInfo(enclosingQg.selections.labelInfo)
    val inner = context.strategy.plan(optionalQg, interestingOrderConfig, innerContext)
    (lhs: LogicalPlan) => inner.allResults.map { inner =>
      val rhs = context.logicalPlanProducer.planOptional(inner, lhs.availableSymbols, innerContext, optionalQg)
      val applied = context.logicalPlanProducer.planApply(lhs, rhs, context)

      // Often the Apply can be rewritten into an OptionalExpand. We want to do that before cost estimating against the hash joins, otherwise that
      // is not a fair comparison (as they cannot be rewritten to something cheaper).
      unnestOptional(applied).asInstanceOf[LogicalPlan]
    }
  }
}

case object outerHashJoin extends OptionalSolver {
  override def solver(optionalQg: QueryGraph,
                     enclosingQg: QueryGraph,
                     interestingOrderConfig: InterestingOrderConfig,
                     context: LogicalPlanningContext): OptionalSolver.Solver = {
    val joinNodes = optionalQg.argumentIds

    // It is not allowed to plan a join on the RHS of an Apply if any of the nodes we are joining on comes from the LHS of the Apply.
    // The easiest way to ensure that this doesn't happen is to check that we are in the "first part" of a query (i.e. not planning a tail).
    // We can check this with "context.outerPlan.isEmpty".
    if (
      joinNodes.intersect(enclosingQg.argumentIds).isEmpty && joinNodes.nonEmpty && joinNodes.forall(
        optionalQg.patternNodes
      )
    ) {
      val solvedHints = optionalQg.joinHints.filter { hint =>
        val hintVariables = hint.variables.map(_.name).toSet
        hintVariables.subsetOf(joinNodes)
      }
      val rhsQG = optionalQg.withoutArguments().withoutHints(solvedHints.map(_.asInstanceOf[Hint]))

      val BestResults(side2Plan, side2SortedPlan) = context.strategy.plan(rhsQG, interestingOrderConfig, context)

      (side1Plan: LogicalPlan) => {
        if (joinNodes.forall(side1Plan.availableSymbols)) {
          Iterator(
            leftOuterJoin(context, joinNodes, side1Plan, side2Plan, solvedHints),
            rightOuterJoin(context, joinNodes, side1Plan, side2Plan, solvedHints)
          ) ++ side2SortedPlan.map(leftOuterJoin(context, joinNodes, side1Plan, _, solvedHints))
        } else {
          Iterator.empty
        }
      }
    } else {
      (_: LogicalPlan) => Iterator.empty
    }
  }

  private def leftOuterJoin(context: LogicalPlanningContext, joinNodes: Set[String], lhs: LogicalPlan, rhs: LogicalPlan, solvedHints: Set[UsingJoinHint]): LogicalPlan =
    context.logicalPlanProducer.planLeftOuterHashJoin(joinNodes, lhs, rhs, solvedHints, context)

  private def rightOuterJoin(context: LogicalPlanningContext, joinNodes: Set[String], rhs: LogicalPlan, lhs: LogicalPlan, solvedHints: Set[UsingJoinHint]): LogicalPlan =
    context.logicalPlanProducer.planRightOuterHashJoin(joinNodes, lhs, rhs, solvedHints, context)
}
