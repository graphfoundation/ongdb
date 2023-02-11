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
package org.neo4j.cypher.internal.ast.semantics

import org.neo4j.cypher.internal.expressions
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.PatternComprehension
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.RelationshipsPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.util.symbols.CTBoolean
import org.neo4j.cypher.internal.util.symbols.CTList
import org.neo4j.cypher.internal.util.symbols.CTString
import org.neo4j.cypher.internal.util.symbols.StorableType

class PatternComprehensionTest extends SemanticFunSuite {

  val n = NodePattern(Some(variable("n")), Seq.empty, None, None)(pos)
  val x = expressions.NodePattern(Some(variable("x")), Seq.empty, None, None)(pos)
  val r = RelationshipPattern(None, Seq.empty, None, None, SemanticDirection.OUTGOING)(pos)
  val pattern = RelationshipsPattern(RelationshipChain(n, r, x)(pos))(pos)
  val property = Property(variable("x"), PropertyKeyName("prop")(pos))(pos)
  val failingProperty = Property(variable("missing"), PropertyKeyName("prop")(pos))(pos)
  val stringLiteral = StringLiteral("APA")(pos)

  test("pattern comprehension on a property returns the expected type") {
    val expression = PatternComprehension(None, pattern, None, property)(pos, Set.empty, "", "")

    val result = SemanticExpressionCheck.simple(expression)(SemanticState.clean)

    result.errors shouldBe empty
    types(expression)(result.state) should equal(StorableType.storableType.wrapInList)
  }

  test("pattern comprehension with literal string projection has correct type") {
    val expression = PatternComprehension(None, pattern, None, stringLiteral)(pos, Set.empty, "", "")

    val result = SemanticExpressionCheck.simple(expression)(SemanticState.clean)

    result.errors shouldBe empty
    types(expression)(result.state) should equal(CTList(CTString).invariant)
  }

  test("inner projection using missing identifier reports error") {
    val expression = PatternComprehension(None, pattern, None, failingProperty)(pos, Set.empty, "", "")

    val result = SemanticExpressionCheck.simple(expression)(SemanticState.clean)

    result.errors shouldBe Seq(SemanticError("Variable `missing` not defined", pos))
  }

  test("inner filter using missing identifier reports error") {
    val expression = PatternComprehension(None, pattern, Some(failingProperty), stringLiteral)(pos, Set.empty, "", "")

    val result = SemanticExpressionCheck.simple(expression)(SemanticState.clean)

    result.errors shouldBe Seq(SemanticError("Variable `missing` not defined", pos))
  }

  test("pattern can't reuse identifier with different type") {
    val expression = PatternComprehension(None, pattern, None, stringLiteral)(pos, Set.empty, "", "")

    val semanticState = SemanticState.clean.declareVariable(variable("n"), CTBoolean).right.get
    val result = SemanticExpressionCheck.simple(expression)(semanticState)

    result.errors shouldBe Seq(
      SemanticError("Type mismatch: n defined with conflicting type Boolean (expected Node)", pos)
    )
  }
}
