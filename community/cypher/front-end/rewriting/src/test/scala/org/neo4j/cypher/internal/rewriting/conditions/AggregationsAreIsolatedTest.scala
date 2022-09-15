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
package org.neo4j.cypher.internal.rewriting.conditions

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.expressions.CountStar
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class AggregationsAreIsolatedTest extends CypherFunSuite with AstConstructionTestSupport {

  private val condition: Any => Seq[String] = aggregationsAreIsolated

  test("happy when aggregation are top level in expressions") {
    val ast = CountStar()_

    condition(ast) shouldBe empty
  }

  test("unhappy when aggregation is sub-expression of the expressions") {
    val ast = equals(CountStar()_, literalUnsignedInt(42))

    condition(ast) should equal(Seq(s"Expression $ast contains child expressions which are aggregations"))
  }

  test("unhappy when aggregations are both top-level and sub-expression of the expression") {
    val innerEquals = equals(CountStar()_, literalUnsignedInt(42))
    val ast = count(innerEquals)

    condition(ast) should equal(Seq(s"Expression $innerEquals contains child expressions which are aggregations"))
  }
}
