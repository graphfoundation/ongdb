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
import org.neo4j.cypher.internal.util.symbols.CTInteger
import org.neo4j.cypher.internal.util.symbols.CTList

class CollectFunctionTest extends FunctionTestBase("collect") with AggregationFunctionTestBase {

  test("should fail if no arguments") {
    testInvalidApplication()("Insufficient parameters for function 'collect'")
  }
  // Not actually checking the type signature to not break backwards compatibility
  test("should fail too many arguments") {
    testInvalidApplication(CTFloat, CTFloat)("Too many parameters for function 'collect'")
  }

  test("shouldHandleSpecializations") {
    testValidTypes(CTInteger)(CTList(CTInteger))
    testValidTypes(CTFloat)(CTList(CTFloat))
  }

  test("shouldHandleCombinedSpecializations") {
    testValidTypes(CTFloat | CTInteger)(CTList(CTFloat) | CTList(CTInteger))
  }
}

class MaxFunctionTest extends FunctionTestBase("max") with AggregationFunctionTestBase {

  test("should fail if no arguments") {
    testInvalidApplication()("Insufficient parameters for function 'max'")
  }

  // Not actually checking the type signature to not break backwards compatibility
  test("should fail too many arguments") {
    testInvalidApplication(CTFloat, CTFloat)("Too many parameters for function 'max'")
  }

  test("shouldHandleSpecializations") {
    testValidTypes(CTInteger)(CTInteger)
    testValidTypes(CTFloat)(CTFloat)
  }

  test("shouldHandleCombinedSpecializations") {
    testValidTypes(CTFloat | CTInteger)(CTFloat | CTInteger)
  }
}

class MinFunctionTest extends FunctionTestBase("min") with AggregationFunctionTestBase {

  test("should fail if no arguments") {
    testInvalidApplication()("Insufficient parameters for function 'min'")
  }

  // Not actually checking the type signature to not break backwards compatibility
  test("should fail too many arguments") {
    testInvalidApplication(CTFloat, CTFloat)("Too many parameters for function 'min'")
  }

  test("shouldHandleSpecializations") {
    testValidTypes(CTInteger)(CTInteger)
    testValidTypes(CTFloat)(CTFloat)
  }

  test("shouldHandleCombinedSpecializations") {
    testValidTypes(CTFloat | CTInteger)(CTFloat | CTInteger)
  }
}
