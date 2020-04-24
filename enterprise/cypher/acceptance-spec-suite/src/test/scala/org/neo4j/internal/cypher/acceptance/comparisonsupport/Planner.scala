/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.internal.cypher.acceptance.comparisonsupport

case class Planners(planners: Planner*)

object Planners {
  implicit def plannerToPlanners(planner: Planner): Planners = Planners(planner)

  val all = Planners(Cost, Rule)

  def definedBy(preParserArgs: Array[String]): Planners = {
    val planners = all.planners.filter(_.isDefinedBy(preParserArgs))
    if (planners.nonEmpty) Planners(planners: _*) else all
  }

  object Cost extends Planner(Set("COST", "IDP", "PROCEDURE"), "planner=cost")

  object Rule extends Planner(Set("RULE", "PROCEDURE"), "planner=rule")

}

case class Planner(acceptedPlannerNames: Set[String], preparserOption: String) {
  def isDefinedBy(preParserArgs: Array[String]): Boolean = preparserOption.split(" ").forall(preParserArgs.contains(_))
}
