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
package org.neo4j.cypher.internal.ast.semantics.functions

import org.neo4j.cypher.internal.util.symbols.CTFloat
import org.neo4j.cypher.internal.util.symbols.CTGeometry
import org.neo4j.cypher.internal.util.symbols.CTInteger
import org.neo4j.cypher.internal.util.symbols.CTMap
import org.neo4j.cypher.internal.util.symbols.CTPoint

class DistanceTest extends FunctionTestBase("point.distance")  {

  test("should accept correct types") {
    testValidTypes(CTGeometry, CTGeometry)(CTFloat)
    testValidTypes(CTPoint, CTGeometry)(CTFloat)
    testValidTypes(CTGeometry, CTPoint)(CTFloat)
    testValidTypes(CTPoint, CTPoint)(CTFloat)
    // Distance produces null for invalid arguments, but never throws exceptions
    testValidTypes(CTPoint, CTInteger)(CTFloat)
    testValidTypes(CTInteger, CTPoint)(CTFloat)
    testValidTypes(CTInteger, CTInteger)(CTFloat)
  }

  test("should fail if wrong number of arguments") {
    testInvalidApplication()(
      "Insufficient parameters for function 'point.distance'"
    )
    testInvalidApplication(CTMap)(
      "Insufficient parameters for function 'point.distance'"
    )
    testInvalidApplication(CTGeometry, CTGeometry, CTGeometry)(
      "Too many parameters for function 'point.distance'"
    )
  }
}
