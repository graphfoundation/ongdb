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
package org.neo4j.cypher.internal.ast.factory.neo4j

import org.opencypher.tools.tck.api.CypherTCK
import org.opencypher.tools.tck.api.Execute
import org.opencypher.tools.tck.api.Scenario
import org.scalatest.FunSpecLike

/**
 * Compares the parboiled and JavaCC parsers with all TCK scenarios.
 */
class ParserComparisonTCKTest extends ParserComparisonTestBase with FunSpecLike {

  val scenariosPerFeature: Map[String, Seq[Scenario]] =
    CypherTCK.allTckScenarios.foldLeft(Map.empty[String, Seq[Scenario]]) {
      case (acc, scenario: Scenario) =>
        val soFar: Seq[Scenario] = acc.getOrElse(scenario.featureName, Seq.empty[Scenario])
        acc + (scenario.featureName -> (soFar :+ scenario))
    }
  var x = 0

  val DENYLIST: Set[String] = Set[String](
    // defers to semantic checking
    """Feature "Literals3 - Hexadecimal integer": Scenario "Fail on an incomplete hexadecimal integer"""",

    // Failing with M16 TCK - require investigation
    """Feature "Literals7 - List": Scenario "Fail on a nested list with non-matching brackets"""",
    """Feature "Literals7 - List": Scenario "Fail on a list containing only a comma"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing only a comma"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing key starting with a number"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing key with dot"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing a list without key"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing a value without key"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing a map without key"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a nested map with non-matching braces"""",
    """Feature "Literals8 - Maps": Scenario "Fail on a map containing key with symbol"""",
  )

  val positionAcceptanceList = Seq(
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling string ranges 1\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling string ranges 4\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling numerical ranges 1\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling numerical ranges 3\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling string ranges 3\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling string ranges 3\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling string ranges 2\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling numerical ranges 4\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling empty range\"",
    "Feature \"Comparison3 - Full-Bound Range\": Scenario \"Handling numerical ranges 2\"",
    "Feature \"Comparison4 - Combination of Comparisons\": Scenario \"Handling long chains of operators\""
  )

  scenariosPerFeature foreach {
    case (featureName, scenarios) =>
      describe(featureName) {
        scenarios
          .filterNot(scenarioObj => DENYLIST(denyListEntry(scenarioObj)))
          .foreach {
            scenarioObj =>
              val testName = denyListEntry(scenarioObj)
              describe(testName) {
                scenarioObj.steps foreach {
                  case Execute(query, _, _) =>
                    x = x + 1
                    it(s"[$x]\n$query") {
                      withClue(testName) {
                        try {
                          if(testName.contains("Bound Range")) {
                            val t = testName
                          }
                          assertSameAST(query, !positionAcceptanceList.contains(testName))
                        } catch {
                          // Allow withClue to populate the testcase name
                          case e: Exception => fail(e.getMessage, e)
                        }
                      }
                    }
                  case _ =>
                }
              }
        }
      }
    case _ =>
  }

  // Use the same denylist format as the other TCK tests
  private def denyListEntry(scenario:Scenario): String =
    s"""Feature "${scenario.featureName}": Scenario "${scenario.name}"""" + scenario.exampleIndex.map(ix => s""": Example "$ix"""").getOrElse("")

}

