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

import org.neo4j.cypher.internal.expressions.DummyExpression
import org.neo4j.cypher.internal.expressions.ListComprehension
import org.neo4j.cypher.internal.util.symbols.CTBoolean
import org.neo4j.cypher.internal.util.symbols.CTList
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.symbols.CTString

class FilteringExpressionTest extends SemanticFunSuite {

  test("shouldSemanticCheckPredicateInStateContainingTypedVariable") {
    val expression = DummyExpression(CTList(CTNode) | CTBoolean | CTList(CTString), pos)

    val error = SemanticError("dummy error", pos)
    val predicate = CustomExpression(
      (ctx, self) => s => {
        s.symbolTypes("x") should equal(CTNode | CTString)
        SemanticCheckResult.error(s, error)
      }
    )

    val filter = ListComprehension(variable("x"), expression, Some(predicate), None)(pos)
    val result = SemanticExpressionCheck.simple(filter)(SemanticState.clean)
    result.errors should equal(Seq(error))
    result.state.symbol("x") should equal(None)
  }
}
