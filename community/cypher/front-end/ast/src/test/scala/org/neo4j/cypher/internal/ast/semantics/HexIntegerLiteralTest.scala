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

import org.neo4j.cypher.internal.expressions.Expression.SemanticContext
import org.neo4j.cypher.internal.expressions.SignedHexIntegerLiteral
import org.neo4j.cypher.internal.util.DummyPosition

class HexIntegerLiteralTest extends SemanticFunSuite {
  test("correctly parses hexadecimal numbers") {
    assert(SignedHexIntegerLiteral("0x22")(DummyPosition(0)).value === 0x22)
    assert(SignedHexIntegerLiteral("0x0")(DummyPosition(0)).value === 0)
    assert(SignedHexIntegerLiteral("0xffFF")(DummyPosition(0)).value === 0xffff)
    assert(SignedHexIntegerLiteral("-0x9abc")(DummyPosition(0)).value === -0x9abc)
  }

  test("throws error for invalid hexadecimal numbers") {
    assertSemanticError("0x12g3", "invalid literal number")
    assertSemanticError("0x", "invalid literal number")
    assertSemanticError("0x33Y23", "invalid literal number")
    assertSemanticError("-0x12g3", "invalid literal number")
    assertSemanticError("-0x", "invalid literal number")
  }

  test("throws error for too large hexadecimal numbers") {
    assertSemanticError("0xfffffffffffffffff", "integer is too large")
  }

  test("correctly parse hexadecimal Long.MIN_VALUE") {
    assert(SignedHexIntegerLiteral("-0x8000000000000000")(DummyPosition(0)).value === Long.MinValue)
  }

  private def assertSemanticError(stringValue: String, errorMessage: String) {
    val literal = SignedHexIntegerLiteral(stringValue)(DummyPosition(4))
    val result = SemanticExpressionCheck.check(SemanticContext.Simple, literal)(SemanticState.clean)
    assert(result.errors === Vector(SemanticError(errorMessage, DummyPosition(4))))
  }
}
