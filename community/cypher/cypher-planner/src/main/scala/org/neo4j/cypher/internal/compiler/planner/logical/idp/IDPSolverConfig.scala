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
package org.neo4j.cypher.internal.compiler.planner.logical.idp

import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.logical.plans.LogicalPlan

/**
 * The IDP inner loop can be optimized and tweaked in several ways, and this trait encapsulates those settings
 */
trait IDPSolverConfig {
  def maxTableSize: Int = 128
  def iterationDurationLimit: Long = 1000
}

trait SingleComponentIDPSolverConfig extends IDPSolverConfig {
  def solvers(queryGraph: QueryGraph): Seq[QueryGraph => IDPSolverStep[PatternRelationship, LogicalPlan, LogicalPlanningContext]]
}

/* The default settings for IDP uses a maxTableSize and a inner loop duration threshold
   to improve planning performance with minimal impact of plan quality */
case object DefaultIDPSolverConfig extends SingleComponentIDPSolverConfig {
  override def solvers(queryGraph: QueryGraph) = Seq(joinSolverStep(_), expandSolverStep(_))
}

/* The Dynamic Programming (DP) approach is IDP with no optimizations */
case object DPSolverConfig extends SingleComponentIDPSolverConfig {
  override def maxTableSize: Int = Integer.MAX_VALUE
  override def iterationDurationLimit: Long = Long.MaxValue
  override def solvers(queryGraph: QueryGraph) = Seq(joinSolverStep(_), expandSolverStep(_))
}


/* The default settings for IDP uses a maxTableSize and a inner loop duration threshold
   to improve planning performance with minimal impact of plan quality */
class ConfigurableIDPSolverConfig(override val maxTableSize: Int,
                                  override val iterationDurationLimit: Long) extends SingleComponentIDPSolverConfig {
  override def solvers(queryGraph: QueryGraph) = Seq(joinSolverStep(_), expandSolverStep(_))

  override def toString: String = s"${this.getClass.getSimpleName}(maxTableSize = $maxTableSize, iterationDurationLimit = $iterationDurationLimit})"
}

/* For testing IDP we sometimes limit the solver to expands only */
case object ExpandOnlyIDPSolverConfig extends ConfigurableIDPSolverConfig(256, Long.MaxValue) {
  override def solvers(queryGraph: QueryGraph) = Seq(expandSolverStep(_))
}

/* For testing IDP we sometimes limit the solver to joins only */
case object JoinOnlyIDPSolverConfig extends ConfigurableIDPSolverConfig(256, Long.MaxValue) {
  override def solvers(queryGraph: QueryGraph) = Seq(joinSolverStep(_))
}

/* One more advanced approach is to allow the inner loop to automatically switch from
   expands-only to expands and joins when the problem size becomes smaller.
   This is a good compromise between performance and quality, however it is not clear
   where best to draw the line, and it is probable that the joins might be planned in
   sub-optimal positions. We should consider this for a future default once we have the
   time to develop more confidence in the approach. */
case class AdaptiveChainPatternConfig(patternLengthThreshold: Int) extends SingleComponentIDPSolverConfig {
  override def solvers(queryGraph: QueryGraph) =
    Seq(AdaptiveSolverStep(_, (qg, goal) => goal.size >= patternLengthThreshold))
}

case class AdaptiveSolverStep(qg: QueryGraph, predicate: (QueryGraph, Goal) => Boolean) extends IDPSolverStep[PatternRelationship, LogicalPlan, LogicalPlanningContext] {

  private val join = joinSolverStep(qg)
  private val expand = expandSolverStep(qg)

  override def apply(registry: IdRegistry[PatternRelationship], goal: Goal, table: IDPCache[LogicalPlan], context: LogicalPlanningContext): Iterator[LogicalPlan] = {
    if (!registry.compacted() && predicate(qg, goal))
      expand(registry, goal, table, context)
    else
      expand(registry, goal, table, context) ++ join(registry, goal, table, context)
  }
}
