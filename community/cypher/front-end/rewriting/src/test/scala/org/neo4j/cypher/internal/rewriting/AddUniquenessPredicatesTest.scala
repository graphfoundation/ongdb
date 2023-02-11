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
package org.neo4j.cypher.internal.rewriting

import org.neo4j.cypher.internal.rewriting.rewriters.AddUniquenessPredicates
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class AddUniquenessPredicatesTest extends CypherFunSuite with RewriteTest {

  test("does not introduce predicate not needed") {
    assertIsNotRewritten("RETURN 42")
    assertIsNotRewritten("MATCH (n) RETURN n")
    assertIsNotRewritten("MATCH (n)-[r1]->(m) RETURN n")
    assertIsNotRewritten("MATCH (n)-[r1]->(m) MATCH (m)-[r2]->(x) RETURN x")
  }

  test("uniqueness check is done between relationships of simple and variable pattern lengths") {
    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2*0..1]->(c) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2*0..1]->(c) WHERE NONE(`  UNNAMED0` IN r2 WHERE `  UNNAMED0` = r1) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1*0..1]->(b)-[r2]->(c) RETURN *",
      "MATCH (a)-[r1*0..1]->(b)-[r2]->(c) WHERE NONE(`  UNNAMED0` IN r1 WHERE r2 = `  UNNAMED0`) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1*0..1]->(b)-[r2*0..1]->(c) RETURN *",
      "MATCH (a)-[r1*0..1]->(b)-[r2*0..1]->(c) WHERE NONE(`  UNNAMED0` IN r2 WHERE ANY(`  UNNAMED1` IN r1 WHERE `  UNNAMED0` = `  UNNAMED1`)) RETURN *")
  }

  test("uniqueness check is done for the same repeated variable length relationship") {
    assertRewrite(
      "MATCH (a)-[r1*0..1]->(b)-[r1*0..1]->(c) RETURN *",
      s"""MATCH (a)-[r1*0..1]->(b)-[r1*0..1]->(c)
         |WHERE NONE(`  UNNAMED0` IN r1 WHERE ANY(`  UNNAMED1` IN r1 WHERE `  UNNAMED0` = `  UNNAMED1`))
         |RETURN *""".stripMargin
    )
  }

  test("uniqueness check is done between relationships") {
    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2]->(c) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2]->(c) WHERE not(r2 = r1) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2]->(c)-[r3]->(d) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2]->(c)-[r3]->(d) WHERE not(r3 = r2) AND not(r3 = r1) AND not(r2 = r1) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1]->(b), (b)-[r2]->(c), (c)-[r3]->(d) RETURN *",
      "MATCH (a)-[r1]->(b), (b)-[r2]->(c), (c)-[r3]->(d) WHERE not(r1 = r2) AND not(r1 = r3) AND not(r2 = r3) RETURN *")
  }

  test("no uniqueness check between relationships of different type") {
    assertRewrite(
      "MATCH (a)-[r1:X]->(b)-[r2:Y]->(c) RETURN *",
      "MATCH (a)-[r1:X]->(b)-[r2:Y]->(c) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1:X]->(b)-[r2:X|Y]->(c) RETURN *",
      "MATCH (a)-[r1:X]->(b)-[r2:X|Y]->(c) WHERE not(r2 = r1) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2:X]->(c) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2:X]->(c) WHERE not(r2 = r1) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2]->(c) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2]->(c) WHERE not(r2 = r1) RETURN *")
  }

  test("ignores shortestPath relationships for uniqueness") {
    assertRewrite(
      "MATCH (a)-[r1]->(b), shortestPath((a)-[r]->(b)) RETURN *",
      "MATCH (a)-[r1]->(b), shortestPath((a)-[r]->(b)) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2]->(c), shortestPath((a)-[r]->(b)) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2]->(c), shortestPath((a)-[r]->(b)) WHERE not(r2 = r1) RETURN *")
  }

  test("ignores allShortestPaths relationships for uniqueness") {
    assertRewrite(
      "MATCH (a)-[r1]->(b), allShortestPaths((a)-[r]->(b)) RETURN *",
      "MATCH (a)-[r1]->(b), allShortestPaths((a)-[r]->(b)) RETURN *")

    assertRewrite(
      "MATCH (a)-[r1]->(b)-[r2]->(c), allShortestPaths((a)-[r]->(b)) RETURN *",
      "MATCH (a)-[r1]->(b)-[r2]->(c), allShortestPaths((a)-[r]->(b)) WHERE not(r2 = r1) RETURN *")
  }

  def rewriterUnderTest: Rewriter = AddUniquenessPredicates(new AnonymousVariableNameGenerator)
}
