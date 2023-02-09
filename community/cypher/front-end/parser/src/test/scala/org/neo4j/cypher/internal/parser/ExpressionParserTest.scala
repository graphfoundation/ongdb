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
package org.neo4j.cypher.internal.parser

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.expressions
import org.parboiled.scala.Rule1

class ExpressionParserTest
  extends ParserAstTest[expressions.Expression]
    with Expressions
    with AstConstructionTestSupport {

  implicit val parser: Rule1[expressions.Expression] = Expression

  test("thing CONTAINS 'a' + 'b'") {
    yields(expressions.Contains(varFor("thing"), add(literalString("a"), literalString("b"))))
  }

  test("thing STARTS WITH 'a' + 'b'") {
    yields(expressions.StartsWith(varFor("thing"), add(literalString("a"), literalString("b"))))
  }

  test("thing ENDS WITH 'a' + 'b'") {
    yields(expressions.EndsWith(varFor("thing"), add(literalString("a"), literalString("b"))))
  }

  test("[true IN [1, 2]]") {
    yields(expressions.ListComprehension(varFor("true"), listOf(literalInt(1), literalInt(2)), None, None))
  }

  test("[(true IN [1, 2])]") {
    yields(expressions.ListLiteral(Seq(in(trueLiteral, listOf(literalInt(1), literalInt(2))))))
  }

  test("[create IN [1, 2]]") {
    yields(expressions.ListComprehension(varFor("create"), listOf(literalInt(1), literalInt(2)), None, None))
  }

  test("[not IN [1, 2]]") {
    yields(expressions.ListComprehension(varFor("not"), listOf(literalInt(1), literalInt(2)), None, None))
  }

  test("[starts IN [1, 2]]") {
    yields(expressions.ListComprehension(varFor("starts"), listOf(literalInt(1), literalInt(2)), None, None))
  }

  test("[true IN [ true, false ], false]") {
    yields(expressions.ListLiteral(Seq(in(trueLiteral, listOf(trueLiteral, falseLiteral)), falseLiteral)))
  }

}
