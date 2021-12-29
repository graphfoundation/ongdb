/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package cypher.features

import java.util.Collection

import cypher.features.ScenarioTestHelper.createTests
import cypher.features.ScenarioTestHelper.printComputedBlacklist
import org.junit.Ignore
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.opencypher.tools.tck.api.CypherTCK
import org.opencypher.tools.tck.api.Scenario

@RunWith(classOf[JUnitPlatform])
class Compatibility31TCKTests extends TCKTests {

  val blocklist: Set[ScenarioIdentity] = Set(
    ScenarioIdentity("TemporalCreateAcceptance", "Should store date time"),
    ScenarioIdentity("TemporalCreateAcceptance", "Should store date"),
    ScenarioIdentity("TemporalCreateAcceptance", "Should store duration"),
    ScenarioIdentity("TemporalCreateAcceptance", "Should store local date time"),
    ScenarioIdentity("TemporalCreateAcceptance", "Should store local time"),
    ScenarioIdentity("TemporalCreateAcceptance", "Should store time")
  )

  @TestFactory
  def runCompatibility31(): Collection[DynamicTest] = {
    createTests(filterBlockedScenarios(scenarios, blocklist), Compatibility31TestConfig)
  }

  @Ignore
  def generateBlacklistCompatibility31(): Unit = {
    printComputedBlacklist(scenarios, Compatibility31TestConfig)
    fail("Do not forget to add @ignore to this method")
  }

}
