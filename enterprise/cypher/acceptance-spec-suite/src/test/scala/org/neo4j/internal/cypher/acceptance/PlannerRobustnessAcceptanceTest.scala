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
package org.neo4j.internal.cypher.acceptance

import org.neo4j.cypher.ExecutionEngineFunSuite
import org.neo4j.internal.cypher.acceptance.comparisonsupport.CypherComparisonSupport

class PlannerRobustnessAcceptanceTest extends ExecutionEngineFunSuite with CypherComparisonSupport {

  private val t0 = System.nanoTime() / 1000

  test("should plan query of 100 patterns in reasonable time") {
    val query =
      "MATCH " + (1 to 100).map(i => s"(user$i:User {userId:$i})").mkString(", ") +
      "RETURN count(*)"

    graph.execute("""FOREACH (n IN range(1, 100) | CREATE (:User {userId: n}))""")
    graph.createIndex("User", "userId")

    val t1 = System.nanoTime() / 1000
    val result = graph.execute(query)
    while (result.hasNext) result.next()
    val t2 = System.nanoTime() / 1000

    val setupTime = t1 - t0
    val queryTime = t2 - t1

    if (queryTime > setupTime) {
      fail(
        """Query time for 100-pattern query is too long (bigger that time to start entire db and build index).
          |  Setup time: %10d us
          |  Query time: %10d us
        """.stripMargin.format(setupTime, queryTime))
    }
  }
}
