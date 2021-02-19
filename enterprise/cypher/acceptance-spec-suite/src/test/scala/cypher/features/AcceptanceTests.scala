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

import java.io.File
import java.net.URI

import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Test
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.opencypher.tools.tck.api.CypherTCK
import org.opencypher.tools.tck.api.Scenario

@RunWith(classOf[JUnitPlatform])
class AcceptanceTests extends BaseFeatureTest {

  // these two should be empty on commit!
  // Use a substring match, for example "UnwindAcceptance"
  val featureToRun = ""
  val scenarioToRun = ""

  val featuresURI: URI = getClass.getResource("/cypher/features").toURI

  val scenarios: Seq[Scenario] = {
    val all = CypherTCK.parseFilesystemFeatures(new File(featuresURI)).flatMap(_.scenarios)
    filterScenarios(all, featureToRun, scenarioToRun)
  }

  @Test
  def debugTokensNeedToBeEmpty(): Unit = {
    // besides the obvious reason this test is also here (and not using assert)
    // to ensure that any import optimizer doesn't remove the correct import for fail (used by the commented out methods further down)
    if (!scenarioToRun.equals("")) {
      fail("scenarioToRun is only for debugging and should not be committed")
    }
    if (!featureToRun.equals("")) {
      fail("featureToRun is only for debugging and should not be committed")
    }
  }

}
