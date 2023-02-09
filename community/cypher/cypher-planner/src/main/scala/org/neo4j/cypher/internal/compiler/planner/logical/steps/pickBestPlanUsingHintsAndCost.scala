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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.compiler.planner.logical.CandidateSelector
import org.neo4j.cypher.internal.compiler.planner.logical.CostModelMonitor
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.SelectorHeuristic
import org.neo4j.cypher.internal.logical.plans.LogicalPlan

trait CandidateSelectorFactory {
  def apply(context: LogicalPlanningContext): CandidateSelector
}

object pickBestPlanUsingHintsAndCost extends CandidateSelectorFactory {
  private val baseOrdering = implicitly[Ordering[(Int, Double, Int)]]

  override def apply(context: LogicalPlanningContext): CandidateSelector =
    new CandidateSelector {
      override def applyWithResolvedPerPlan[X](projector: X => LogicalPlan, input: Iterable[X], resolved: => String, resolvedPerPlan: LogicalPlan => String, heuristic: SelectorHeuristic): Option[X] = {

        val inputOrdering = new Ordering[X] {
          override def compare(x: X, y: X): Int = {
            val xCost = score(projector, x, heuristic, context)
            val yCost = score(projector, y, heuristic, context)
            baseOrdering.compare(xCost, yCost)
          }
        }

        context.costComparisonListener.report(projector, input, inputOrdering, context, resolved, resolvedPerPlan, heuristic)

        if (input.isEmpty) None else Some(input.min(inputOrdering))
      }
    }

  private def score[X](projector: X => LogicalPlan, input: X, heuristic: SelectorHeuristic, context: LogicalPlanningContext) = {
    val costs = context.cost
    val plan = projector(input)
    val cost = costs.costFor(plan, context.input, context.semanticTable, context.planningAttributes.cardinalities, context.planningAttributes.providedOrders, CostModelMonitor.DEFAULT).gummyBears
    val hints = context.planningAttributes.solveds.get(plan.id).numHints
    val tieBreaker = heuristic.tieBreaker(plan)
    (-hints, cost, -tieBreaker)
  }
}
