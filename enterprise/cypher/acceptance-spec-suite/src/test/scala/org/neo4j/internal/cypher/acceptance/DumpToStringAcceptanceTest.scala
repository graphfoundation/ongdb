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
package org.neo4j.internal.cypher.acceptance

import org.neo4j.cypher.ExecutionEngineFunSuite
import org.neo4j.internal.cypher.acceptance.comparisonsupport.CypherComparisonSupport
import org.neo4j.cypher.internal.v3_6.util.test_helpers.WindowsStringSafe

class DumpToStringAcceptanceTest extends ExecutionEngineFunSuite with CypherComparisonSupport {

  implicit val windowsSafe = WindowsStringSafe

  test("basic dumpToString") {
    dumpToString(
      """UNWIND [
        |  {a:1,                b:true },
        |  {a:'Hello there...', b:5.467},
        |  {a:[1,2],            b:'Hi!'}
        |  ] AS map
        |RETURN map.a AS a, map.b AS bColumn""".stripMargin) should
      equal("""+----------------------------+
              || a                | bColumn |
              |+----------------------------+
              || 1                | true    |
              || "Hello there..." | 5.467   |
              || [1,2]            | "Hi!"   |
              |+----------------------------+
              |3 rows
              |""".stripMargin)
  }

  test("format node") {
    createNode(Map("prop" -> "A"))

    dumpToString("match (n) return n, 2 AS int") should
      equal("""+-------------------------+
              || n                 | int |
              |+-------------------------+
              || Node[0]{prop:"A"} | 2   |
              |+-------------------------+
              |1 row
              |""".stripMargin)
  }

  test("format relationship") {
    relate(createNode(), createNode(), "T", Map("prop" -> "A"))

    dumpToString("match ()-[r]->() return r") should
        equal("""+-----------------+
                || r               |
                |+-----------------+
                || :T[0]{prop:"A"} |
                |+-----------------+
                |1 row
                |""".stripMargin)

  }

  test("format collection of maps") {
    dumpToString( """RETURN [{ inner: 'Map1' }, { inner: 'Map2' }]""") should
      equal(
        """+----------------------------------------+
          || [{ inner: 'Map1' }, { inner: 'Map2' }] |
          |+----------------------------------------+
          || [{inner -> "Map1"},{inner -> "Map2"}]  |
          |+----------------------------------------+
          |1 row
          |""".stripMargin)
  }
}
