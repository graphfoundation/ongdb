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
package org.neo4j.cypher.internal.compiler.planner

import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.LogicalPlanToPlanBuilderString
import org.neo4j.cypher.internal.logical.plans.ProduceResult
import org.scalactic.Prettifier

trait LogicalPlanTestOps {

  implicit class LogicalPlanOps(plan: LogicalPlan) {

    def stripProduceResults: LogicalPlan = plan match {
      case p: ProduceResult => p.source
      case p                => p
    }

    def printLogicalPlanBuilderString(): LogicalPlan = {
      println(asLogicalPlanBuilderString())
      plan
    }

    def asLogicalPlanBuilderString(): String =
      LogicalPlanToPlanBuilderString(plan)
  }

  // Gives asLogicalPlanBuilderString:s in ScalaTest error messages
  implicit val logicalPlanScalaTestPrettifier: Prettifier = {

    case plan: LogicalPlan =>
      plan.asLogicalPlanBuilderString()
          .linesIterator.map("  " + _)
          .mkString("\n", "\n", "\n")

    case other =>
      Prettifier.default(other)
  }
}
