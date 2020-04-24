/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package cypher.features

import cypher.features.ScenarioTestHelper.printComputedBlacklist
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Disabled
import org.neo4j.test.TestEnterpriseGraphDatabaseFactory

class CostMorselAcceptanceTests extends EnterpriseBaseAcceptanceTest {

  // If you want to only run a specific feature or scenario, go to the BaseAcceptanceTest

  //  @TestFactory
  //  def runCostMorselSingleThreaded(): util.Collection[DynamicTest] = {
  //    createTests(scenarios, CostMorselTestConfigSingleThreaded)
  //  }
  //
  //  @TestFactory
  //  def runCostMorsel(): util.Collection[DynamicTest] = {
  //    createTests(scenarios, CostMorselTestConfig)
  //  }
  // If you want to only run a specific feature or scenario, go to the BaseTCKTests
  // Note: CostMorselTestConfig was removed from TestConfig.scala in 3.5.2  See: community/cypher/spec-suite-tools/src/test/scala/cypher/features/TestConfig.scala
  case object CostMorselTestConfig extends TestConfig(Some("cost-morsel.txt"), "CYPHER planner=cost runtime=morsel")


  @Disabled
  def generateBlacklistTCKTestCostMorsel(): Unit = {
    printComputedBlacklist(scenarios, CostMorselTestConfig, new TestEnterpriseGraphDatabaseFactory())
    fail("Do not forget to add @Disabled to this method")
  }
}
