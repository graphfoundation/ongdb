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
package org.neo4j.cypher.internal.ast

import org.neo4j.cypher.internal.ast.semantics.SemanticState
import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.expressions.SignedIntegerLiteral
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.util.DummyPosition
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class PeriodicCommitHintTest extends CypherFunSuite with Positional {
  test("negative values should fail") {
    // Given
    val sizePosition: InputPosition = pos
    val input = "-1"
    val value: SignedIntegerLiteral = SignedDecimalIntegerLiteral(input)(sizePosition)
    val hint = PeriodicCommitHint(Some(value))(pos)

    // When
    val result = hint.semanticCheck(SemanticState.clean)

    // Then
    assert(result.errors.size === 1)
    assert(result.errors.head.msg === s"Commit size error - expected positive value larger than zero, got $input")
    assert(result.errors.head.position === sizePosition)
  }

  test("no periodic commit size is ok") {
    // Given
    val hint = PeriodicCommitHint(None)(pos)

    // When
    val result = hint.semanticCheck(SemanticState.clean)

    // Then
    assert(result.errors.size === 0)
  }

  test("positive values are OK") {
    // Given
    val sizePosition: InputPosition = pos
    val input = "1"
    val value: SignedIntegerLiteral = SignedDecimalIntegerLiteral(input)(sizePosition)
    val hint = PeriodicCommitHint(Some(value))(pos)

    // When
    val result = hint.semanticCheck(SemanticState.clean)

    // Then
    assert(result.errors.size === 0)
  }

  test("queries with periodic commit and no updates are not OK") {
    // Given USING PERIODIC COMMIT RETURN "Hello World!"

    val value: SignedIntegerLiteral = SignedDecimalIntegerLiteral("1")(pos)
    val periodicCommitPos: InputPosition = pos
    val hint = PeriodicCommitHint(Some(value))(periodicCommitPos)
    val literal: StringLiteral = StringLiteral("Hello world!")(pos)
    val returnItem = AliasedReturnItem(literal, Variable("Hello world!")(pos))(pos, isAutoAliased = false)
    val returnItems = ReturnItems(includeExisting = false, Seq(returnItem))(pos)
    val returns: Return = Return(distinct = false, returnItems, None, None, None)(pos)
    val queryPart = SingleQuery(Seq(returns))(pos)
    val query = Query(Some(hint), queryPart)(pos)

    // When
    val result = query.semanticCheck(SemanticState.clean)

    // Then
    assert(result.errors.size === 1)
    assert(result.errors.head.msg === "Cannot use periodic commit in a non-updating query")
    assert(result.errors.head.position === periodicCommitPos)
  }

  test("queries with periodic commit and updates are OK") {

    // Given USING PERIODIC COMMIT CREATE ()

    val value: SignedIntegerLiteral = SignedDecimalIntegerLiteral("1")(pos)
    val hint = PeriodicCommitHint(Some(value))(pos)
    val nodePattern = NodePattern(None,Seq.empty,None,None)(pos)
    val pattern = Pattern(Seq(EveryPath(nodePattern)))(pos)
    val create = Create(pattern)(pos)
    val queryPart = SingleQuery(Seq(create))(pos)
    val query = Query(Some(hint), queryPart)(pos)

    // When
    val result = query.semanticCheck(SemanticState.clean)

    // Then
    assert(result.errors.size === 0)
  }
}

trait Positional {
  var currentPos = 0
  def pos = {
    currentPos += 1
    DummyPosition(currentPos)
  }
}
