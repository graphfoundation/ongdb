/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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

import org.neo4j.cypher.internal.ast.factory.neo4j.JavaCCParser
import org.neo4j.cypher.internal.rewriting.rewriters.nameAllPatternElements
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.OpenCypherExceptionFactory
import org.neo4j.cypher.internal.util.helpers.NameDeduplicator.removeGeneratedNamesAndParamsOnTree
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class nameAllPatternElementsTest extends CypherFunSuite {

  private val exceptionFactory = OpenCypherExceptionFactory(None)

  private val parser = JavaCCParser

  private def assertRewrite(originalQuery: String, expectedQuery: String): Unit = {
    val nameGenerator = new AnonymousVariableNameGenerator()
    val original = parser.parse(originalQuery, exceptionFactory, new AnonymousVariableNameGenerator)
    val expected = removeGeneratedNamesAndParamsOnTree(parser.parse(expectedQuery, exceptionFactory, new AnonymousVariableNameGenerator))
    val result = removeGeneratedNamesAndParamsOnTree(original.rewrite(nameAllPatternElements(nameGenerator)))

    assert(result === expected)
  }

  test("name all NodePatterns in Query") {
    assertRewrite(
      "MATCH (n)-[r:Foo]->() RETURN n",
      "MATCH (n)-[r:Foo]->(`  UNNAMED0`) RETURN n")
  }

  test("name all RelationshipPatterns in Query") {
    assertRewrite(
      "MATCH (n)-[:Foo]->(m) WHERE (n)-[:Bar]->(m) RETURN n",
    "MATCH (n)-[`  UNNAMED0`:Foo]->(m) WHERE (n)-[`  UNNAMED1`:Bar]->(m) RETURN n")
  }

  test("rename unnamed varlength paths") {
    assertRewrite(
      "MATCH (n)-[:Foo*]->(m) RETURN n",
    "MATCH (n)-[`  UNNAMED0`:Foo*]->(m) RETURN n")
  }

  test("match (a) create (a)-[:X]->() return a") {
    assertRewrite(
      "match (a) create (a)-[:X]->() return a",
    "match (a) create (a)-[`  UNNAMED0`:X]->(`  UNNAMED1`) return a")
  }

  test("merge (a) merge p = (a)-[:R]->() return p") {
    assertRewrite(
      "merge (a) merge p = (a)-[:R]->() return p",
    "merge (a) merge p = (a)-[`  UNNAMED0`:R]->(`  UNNAMED1`) return p")
  }

  test("merge (a)-[:R]->() return a") {
    assertRewrite(
      "merge (a)-[:R]->() return a",
    "merge (a)-[`  UNNAMED0`:R]->(`  UNNAMED1`) return a")
  }

  test("does not touch parameters") {
    assertRewrite(
      "MATCH (n)-[r:Foo]->($p) RETURN n",
    "MATCH (n)-[r:Foo]->(`  UNNAMED0` $p) RETURN n")
  }

  test("names all unnamed var length relationships") {
    assertRewrite(
      "MATCH (a:Artist)-[:WORKED_WITH* { year: 1988 }]->(b:Artist) RETURN *",
    "MATCH (a:Artist)-[`  UNNAMED0`:WORKED_WITH* { year: 1988 }]->(b:Artist) RETURN *")
  }

  test("should name all pattern elements in a pattern comprehension") {
    assertRewrite(
      "RETURN [()-->() | 'foo'] AS foo",
    "RETURN [(`  UNNAMED0`)-[`  UNNAMED1`]->(`  UNNAMED2`) | 'foo'] AS foo")
  }

  test("should name all pattern elements in a pattern expressions") {
    assertRewrite(
      "MATCH (a) WHERE (a)-[:R]->()",
    "MATCH (a) WHERE (a)-[`  UNNAMED0`:R]->(`  UNNAMED1`)")
  }

  test("should name all pattern elements in a EXISTS") {
    assertRewrite(
      "MATCH (a) WHERE EXISTS { MATCH (a)-[:R]->() }",
    "MATCH (a) WHERE EXISTS { MATCH (a)-[`  UNNAMED0`:R]->(`  UNNAMED1`) }")
  }

  test("should not change names of already named things") {
    val original = parser.parse("RETURN [p=(a)-[r]->(b) | 'foo'] AS foo", exceptionFactory, new AnonymousVariableNameGenerator)

    val result = original.rewrite(nameAllPatternElements(new AnonymousVariableNameGenerator))
    assert(result === original)
  }

  test("should not name in shortest path expressions") {
    val original = parser.parse(
      """
        |MATCH (a:A), (b:B)
        |WITH shortestPath((a)-[:REL]->(b)) AS x
        |RETURN x AS x""".stripMargin, exceptionFactory, new AnonymousVariableNameGenerator)

    val result = original.rewrite(nameAllPatternElements(new AnonymousVariableNameGenerator))
    assert(result === original)
  }
}
