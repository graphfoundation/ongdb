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
package org.neo4j.cypher.internal.ast.semantics

import org.neo4j.cypher.internal.expressions.Pow
import org.neo4j.cypher.internal.util.DummyPosition
import org.neo4j.cypher.internal.util.symbols.CTBoolean
import org.neo4j.cypher.internal.util.symbols.CTFloat
import org.neo4j.cypher.internal.util.symbols.CTInteger

class PowTest extends InfixExpressionTestBase(Pow(_, _)(DummyPosition(0))) {

  // Infix specializations:
  // 1 ^ 1 => 1
  // 1 ^ 1.1 => 1
  // 1.1 ^ 1 => 1.1
  // 1.1 ^ 1.1 => 1.1105

  test("shouldHandleAllSpecializations") {
    testValidTypes(CTInteger, CTInteger)(CTFloat)
    testValidTypes(CTInteger, CTFloat)(CTFloat)
    testValidTypes(CTFloat, CTInteger)(CTFloat)
    testValidTypes(CTFloat, CTFloat)(CTFloat)
  }

  test("shouldHandleCombinedSpecializations") {
    testValidTypes(CTFloat | CTInteger, CTFloat | CTInteger)(CTFloat)
  }

  test("shouldFailTypeCheckWhenAddingIncompatible") {
    testInvalidApplication(CTInteger, CTBoolean)(
      "Type mismatch: expected Float but was Boolean"
    )
    testInvalidApplication(CTBoolean, CTInteger)(
      "Type mismatch: expected Float but was Boolean"
    )
  }
}
