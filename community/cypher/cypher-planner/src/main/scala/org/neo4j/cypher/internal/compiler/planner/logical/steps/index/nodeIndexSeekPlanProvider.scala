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
package org.neo4j.cypher.internal.compiler.planner.logical.steps.index

import org.neo4j.cypher.internal.ast.Hint
import org.neo4j.cypher.internal.compiler.planner.logical.LeafPlanRestrictions
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.EntityIndexSeekPlanProvider.isAllowedByRestrictions
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.NodeIndexLeafPlanner.NodeIndexMatch
import org.neo4j.cypher.internal.logical.plans.LogicalPlan

object nodeIndexSeekPlanProvider extends AbstractNodeIndexSeekPlanProvider {

  override def createPlans(indexMatches: Set[NodeIndexMatch], hints: Set[Hint], argumentIds: Set[String], restrictions: LeafPlanRestrictions, context: LogicalPlanningContext): Set[LogicalPlan] = for {
    solution <- createSolutions(indexMatches, hints, argumentIds, restrictions, context)
  } yield constructPlan(solution, context)

  private def createSolutions(indexMatches: Set[NodeIndexMatch], hints: Set[Hint], argumentIds: Set[String], restrictions: LeafPlanRestrictions, context: LogicalPlanningContext): Set[Solution] = for {
    indexMatch <- indexMatches
    if isAllowedByRestrictions(indexMatch.propertyPredicates, restrictions)
    solution <- createSolution(indexMatch, hints, argumentIds, context)
  } yield solution

  override protected def constructPlan(solution: Solution, context: LogicalPlanningContext): LogicalPlan =
    if (solution.isUnique) {
      context.logicalPlanProducer.planNodeUniqueIndexSeek(
        solution.idName,
        solution.label,
        solution.properties,
        solution.valueExpr,
        solution.solvedPredicates,
        solution.hint,
        solution.argumentIds,
        solution.providedOrder,
        solution.indexOrder,
        context,
        solution.indexType,
      )
    } else {
      context.logicalPlanProducer.planNodeIndexSeek(
        solution.idName,
        solution.label,
        solution.properties,
        solution.valueExpr,
        solution.solvedPredicates,
        solution.hint,
        solution.argumentIds,
        solution.providedOrder,
        solution.indexOrder,
        context,
        solution.indexType,
      )
    }
}

