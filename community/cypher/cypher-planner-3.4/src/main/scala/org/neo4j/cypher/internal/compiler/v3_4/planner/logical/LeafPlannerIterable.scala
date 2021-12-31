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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.cypher.internal.compiler.v3_4.planner.logical

import org.neo4j.cypher.internal.ir.v3_4.QueryGraph
import org.neo4j.cypher.internal.planner.v3_4.spi.PlanningAttributes.{Cardinalities, Solveds}
import org.neo4j.cypher.internal.v3_4.logical.plans.LogicalPlan

trait LeafPlannerIterable {
  def candidates(qg: QueryGraph,
                 f: (LogicalPlan, QueryGraph) => LogicalPlan = (plan, _) => plan,
                 context: LogicalPlanningContext,
                 solveds: Solveds,
                 cardinalities: Cardinalities): Iterable[Seq[LogicalPlan]]
}

case class LeafPlannerList(leafPlanners: IndexedSeq[LeafPlanner]) extends LeafPlannerIterable {
  def candidates(qg: QueryGraph, f: (LogicalPlan, QueryGraph) => LogicalPlan = (plan, _) => plan, context: LogicalPlanningContext, solveds: Solveds, cardinalities: Cardinalities): Iterable[Seq[LogicalPlan]] = {
    val logicalPlans = leafPlanners.flatMap(_(qg, context, solveds, cardinalities)).map(f(_,qg))
    logicalPlans.groupBy(_.availableSymbols).values
  }
}

case class PriorityLeafPlannerList(priority: LeafPlannerIterable, fallback: LeafPlannerIterable) extends LeafPlannerIterable {

  override def candidates(qg: QueryGraph, f: (LogicalPlan, QueryGraph) => LogicalPlan, context: LogicalPlanningContext, solveds: Solveds, cardinalities: Cardinalities): Iterable[Seq[LogicalPlan]] = {
    val priorityPlans = priority.candidates(qg, f, context, solveds, cardinalities)
    if (priorityPlans.nonEmpty) priorityPlans
    else fallback.candidates(qg, f, context, solveds, cardinalities)
  }
}
