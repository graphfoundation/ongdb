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
package org.neo4j.cypher.internal.util

import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class IdentityMapTest extends CypherFunSuite {

  case class Val()

  test("should store and retrieve based on object identity") {
    val x = Val()
    val y = Val()
    assert(x === y)

    val map = IdentityMap(x -> "x", y -> "y")
    assert(map.get(x) === Some("x"))
    assert(map.get(y) === Some("y"))
  }

  test("should not overwrite equal key") {
    val x = Val()
    val y = Val()
    assert(x === y)

    val map = IdentityMap(x -> "x")
    val updatedMap = map.updated(y, "y")
    assert(updatedMap.get(x) === Some("x"))
    assert(updatedMap.get(y) === Some("y"))
  }

  test("should overwrite eq key") {
    val x = Val()
    val map = IdentityMap(x -> "x")
    val updatedMap = map.updated(x, "x'")
    assert(updatedMap.get(x) === Some("x'"))
  }

  test("should be immutable when updating") {
    val x = Val()
    val y = Val()
    val map = IdentityMap(x -> "x")
    val updatedMap = map.updated(x, "x'").updated(y, "y")
    assert(map.get(x) === Some("x"))
    assert(map.get(y) === None)
    assert(updatedMap.get(x) === Some("x'"))
    assert(updatedMap.get(y) === Some("y"))
  }

  test("should know contained keys") {
    val k1 = Val()
    val k2 = Val()
    val map = IdentityMap(k1 -> "x")

    assert(map.contains(k1))
    assert(!map.contains(k2))
  }
}
