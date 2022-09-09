/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypher.internal.frontend.phases.rewriting

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.ast.Statement
import org.neo4j.cypher.internal.frontend.helpers.TestState
import org.neo4j.cypher.internal.frontend.phases.Monitors
import org.neo4j.cypher.internal.frontend.phases.isolateAggregation
import org.neo4j.cypher.internal.frontend.phases.rewriting.cnf.TestContext
import org.neo4j.cypher.internal.rewriting.RewriteTest
import org.neo4j.cypher.internal.rewriting.rewriters.normalizeWithAndReturnClauses
import org.neo4j.cypher.internal.util.OpenCypherExceptionFactory
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.devNullLogger
import org.neo4j.cypher.internal.util.inSequence
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class IsolateAggregationTest extends CypherFunSuite with RewriteTest with AstConstructionTestSupport {
  def rewriterUnderTest: Rewriter = isolateAggregation.instance(TestState(None), new TestContext(mock[Monitors]))

  test("refers to renamed variable in where clause") {
    assertRewrite(
      """
        |MATCH (owner)
        |WITH owner, count(*) > 0 AS collected
        |WHERE (owner)-->()
        |RETURN owner
      """.stripMargin,
      """
        |MATCH (owner)
        |WITH owner AS `  UNNAMED0`, count(*) AS `  UNNAMED1`
        |WITH `  UNNAMED0` AS owner, `  UNNAMED1` > 0 AS collected
        |  WHERE (owner)-->()
        |RETURN owner AS owner
      """.stripMargin)
  }

  test("refers to renamed variable in order by clause") {
    assertRewrite(
      """
        |MATCH (owner)
        |WITH owner, count(*) > 0 AS collected
        |ORDER BY owner.foo
        |RETURN owner
      """.stripMargin,
      """
        |MATCH (owner)
        |WITH owner AS `  UNNAMED0`, count(*) AS `  UNNAMED1`
        |WITH `  UNNAMED0` AS owner, `  UNNAMED1` > 0 AS collected
        |  ORDER BY owner.foo
        |RETURN owner AS owner
      """.stripMargin)
  }

  test("does not rewrite things that should not be rewritten") {
    assertIsNotRewritten("MATCH (n) RETURN n AS n")
    assertIsNotRewritten("MATCH (n) RETURN n AS n, count(*) AS count, max(n.prop) AS max")
  }

  test("MATCH (n) RETURN { name: n.name, count: count(*) } AS result") {
    assertRewrite(
      "MATCH (n) RETURN { name: n.name, count: count(*) } AS result",
      "MATCH (n) WITH n.name AS `  UNNAMED0`, count(*) AS `  UNNAMED1` RETURN { name: `  UNNAMED0`, count: `  UNNAMED1` } AS result")
  }

  test("MATCH (n) RETURN n.foo + count(*) AS result") {
    assertRewrite(
      "MATCH (n) RETURN n.foo + count(*) AS result",
      "MATCH (n) WITH n.foo AS `  UNNAMED0`, count(*) AS `  UNNAMED1` RETURN `  UNNAMED0` + `  UNNAMED1` AS result")
  }

  test("MATCH (n) RETURN count(*)/60/42 AS result") {
    assertRewrite(
      "MATCH (n) RETURN count(*)/60/42 AS result",
      "MATCH (n) WITH count(*) AS `  UNNAMED0` RETURN `  UNNAMED0`/60/42 AS result")
  }

  test("WITH 60 as sixty, 42 as fortytwo MATCH (n) RETURN count(*)/sixty/fortytwo AS result") {
    assertRewrite(
      "WITH 60 as sixty, 42 as fortytwo MATCH (n) RETURN count(*)/sixty/fortytwo AS result",
      "WITH 60 as sixty, 42 as fortytwo MATCH (n) WITH count(*) AS `  UNNAMED0`, sixty AS `  UNNAMED1`, fortytwo AS `  UNNAMED2` RETURN `  UNNAMED0`/`  UNNAMED1`/`  UNNAMED2` AS result")
  }

  test("WITH 1 AS node, [] AS nodes1 RETURN ANY (n IN collect(distinct node) WHERE n IN nodes1) as count") {
    assertRewrite(
      """WITH 1 AS node, [] AS nodes1
        |RETURN ANY (n IN collect(distinct node) WHERE n IN nodes1) as count""".stripMargin,
      """WITH 1 AS node, [] AS nodes1
        |WITH collect(distinct node) AS `  UNNAMED0`, nodes1 AS `  UNNAMED1`
        |RETURN ANY (n IN `  UNNAMED0` WHERE n IN `  UNNAMED1`) as count""".stripMargin)
  }

  test("WITH 1 AS node, [] AS nodes1 RETURN NONE(n IN collect(distinct node) WHERE n IN nodes1) as count") {
    assertRewrite(
      """WITH 1 AS node, [] AS nodes1
        |RETURN NONE(n IN collect(distinct node) WHERE n IN nodes1) as count""".stripMargin,
      """WITH 1 AS node, [] AS nodes1
        |WITH collect(distinct node) AS `  UNNAMED0`, nodes1 AS `  UNNAMED1`
        |RETURN NONE(n IN `  UNNAMED0` WHERE n IN `  UNNAMED1`) as count""".stripMargin)
  }

  test("MATCH (n)-->() RETURN (n)-->({k: count(*)}) AS result") {
    assertRewrite(
      "MATCH (n)-->() RETURN (n)-->({k: count(*)}) AS result",
      "MATCH (n)-->() WITH n as `  UNNAMED0`, count(*) AS `  UNNAMED1` RETURN (`  UNNAMED0`)-->({k:`  UNNAMED1`}) AS result")
  }

  test("MATCH (n) RETURN n.prop AS prop, n.foo + count(*) AS count") {
    assertRewrite(
      "MATCH (n) RETURN n.prop AS prop, n.foo + count(*) AS count",
      "MATCH (n) WITH n.prop AS `  UNNAMED0`, n.foo AS `  UNNAMED1`, count(*) AS `  UNNAMED2` RETURN `  UNNAMED0` AS prop, `  UNNAMED1` + `  UNNAMED2` AS count")
  }

  test("MATCH (n) RETURN n AS n, count(n) + 3 AS count") {
    assertRewrite(
      "MATCH (n) RETURN n AS n, count(n) + 3 AS count",
      "MATCH (n) WITH n AS `  UNNAMED0`, count(n) as `  UNNAMED1`  RETURN `  UNNAMED0` AS n, `  UNNAMED1` + 3 AS count")
  }

  test("UNWIND [1,2,3] AS a RETURN reduce(y=0, x IN collect(a) | x) AS z") {
    assertRewrite(
      "UNWIND [1,2,3] AS a RETURN reduce(y=0, x IN collect(a) | x) AS z",
      "UNWIND [1,2,3] AS a WITH collect(a) AS `  UNNAMED0` RETURN reduce(y=0, x IN `  UNNAMED0` | x) AS z")
  }

  test("UNWIND [1,2,3] AS a RETURN [x IN collect(a) | x] AS z") {
    assertRewrite(
      "UNWIND [1,2,3] AS a RETURN [x IN collect(a) | x] AS z",
      "UNWIND [1,2,3] AS a WITH collect(a) AS `  UNNAMED0` RETURN [x IN `  UNNAMED0` | x] AS z")
  }

  test("Nodes that are needed in the projection are also added to the WITH in a list comprehension") {
    assertRewrite(
      "MATCH (v:player)--(n:team) return [x in collect(v.age) where x>40| x+n.age] as res",
      "MATCH (v:player)--(n:team) WITH collect(v.age) AS `  UNNAMED0`, n as `  UNNAMED1` return [x in `  UNNAMED0` where x>40| x+`  UNNAMED1`.age] as res"
    )
  }

  test("Nodes that are needed in the projection are also added to the WITH in a reduce expression") {
    assertRewrite(
      "MATCH (k:player) RETURN reduce(totalAge = 0, n IN collect(k.age) | totalAge + k.age) AS reduction",
      "MATCH (k:player) WITH collect(k.age) AS `  UNNAMED0`, k as `  UNNAMED1` RETURN reduce(totalAge = 0, n IN `  UNNAMED0` | totalAge + `  UNNAMED1`.age) AS reduction"
    )
  }

  test("MATCH (n) WITH 60/60/count(*) AS x RETURN x AS x") {
    assertRewrite(
      "MATCH (n) WITH 60/60/count(*) AS x RETURN x AS x",
      "MATCH (n) WITH count(*) AS `  UNNAMED0` WITH 60/60/`  UNNAMED0` AS x RETURN x AS x")
  }

  test("MATCH (a:Start)<-[:R]-(b) RETURN { foo:a.prop=42, bar:collect(b.prop2) } AS result") {
    assertRewrite(
      "MATCH (a:Start)<-[:R]-(b) " +
        "RETURN { foo:a.prop=42, bar:collect(b.prop2) } AS result",

      "MATCH (a:Start)<-[:R]-(b) " +
        "WITH a.prop=42 AS `  UNNAMED0`, collect(b.prop2) AS `  UNNAMED1` " +
        "RETURN { foo:`  UNNAMED0`, bar:`  UNNAMED1`} AS result")
  }

  test("MATCH (n) RETURN count(*) + max(id(n)) AS r") {
    assertRewrite(
      "MATCH (n) RETURN count(*) + max(id(n)) AS r",
      "MATCH (n) WITH count(*) AS `  UNNAMED0`, max(id(n)) AS `  UNNAMED1` RETURN `  UNNAMED0`+`  UNNAMED1` AS r")
  }

  test("MATCH (a) RETURN size(collect(a)) AS size") {
    assertRewrite(
      "MATCH (a) RETURN size(collect(a)) AS size",
      "MATCH (a) WITH collect(a) AS `  UNNAMED0` RETURN size(`  UNNAMED0`) AS size")
  }

  test("MATCH (a) RETURN count(a) > 0 AS bool") {
    assertRewrite(
      "MATCH (a) RETURN count(a) > 0 AS bool",
      "MATCH (a) WITH count(a) AS `  UNNAMED0` RETURN `  UNNAMED0` > 0 AS bool")
  }

  test("MATCH (a) RETURN count(a) > $param AS bool") {
    assertRewrite(
      "MATCH (a) RETURN count(a) > $param AS bool",
      "MATCH (a) WITH count(a) AS `  UNNAMED0` RETURN `  UNNAMED0` > $param AS bool")
  }

  test("should not introduce multiple return items for the same expression") {
    assertRewrite(
      "WITH 1 AS x, 2 AS y RETURN sum(x)*y AS a, sum(x)*y AS b",
      "WITH 1 AS x, 2 AS y WITH sum(x) as `  UNNAMED0`, y as `  UNNAMED1` RETURN `  UNNAMED0`* `  UNNAMED1` AS a, `  UNNAMED0`*`  UNNAMED1` AS b")
  }

  test("MATCH (a), (b) RETURN coalesce(a.prop, b.prop), b.prop, { x: count(b) }") {
    assertRewrite(
      """MATCH (a), (b)
        |RETURN coalesce(a.prop, b.prop), b.prop, { x: count(b) }""".stripMargin,
      """MATCH (a), (b)
        |WITH coalesce(a.prop, b.prop) AS `  UNNAMED0`,
        |     b.prop AS `  UNNAMED1`,
        |     count(b) AS `  UNNAMED2`
        |RETURN `  UNNAMED0` AS `coalesce(a.prop, b.prop)`,
        |       `  UNNAMED1` AS `b.prop`,
        |       { x: `  UNNAMED2` } AS `{ x: count(b) }`""".stripMargin)
  }

  test("should not extract expressions that do not contain on variables as implicit grouping key") {
    assertRewrite(
      """MATCH (user:User {userId: 11})-[friendship:FRIEND]-()
        |WITH user AS user, collect(friendship)[toInteger(rand() * count(friendship))] AS selectedFriendship
        |RETURN id(selectedFriendship) AS friendshipId, selectedFriendship.propFive AS propertyValue""".stripMargin,
      """MATCH (user:User {userId: 11})-[friendship:FRIEND]-()
        |WITH user AS `  UNNAMED0`, collect(friendship) AS `  UNNAMED1`, count(friendship) AS `  UNNAMED2`
        |WITH `  UNNAMED0` AS user, `  UNNAMED1`[toInteger(rand() * `  UNNAMED2`)] AS selectedFriendship
        |RETURN id(selectedFriendship) AS friendshipId, selectedFriendship.propFive AS propertyValue""".stripMargin
    )
  }

  override protected def parseForRewriting(queryText: String): Statement = {
    val exceptionFactory = OpenCypherExceptionFactory(Some(pos))
    super.parseForRewriting(queryText).endoRewrite(inSequence(normalizeWithAndReturnClauses(exceptionFactory, devNullLogger)))
  }
}
