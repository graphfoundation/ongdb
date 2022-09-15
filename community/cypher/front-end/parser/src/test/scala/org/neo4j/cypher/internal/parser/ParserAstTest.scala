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
package org.neo4j.cypher.internal.parser

import org.neo4j.cypher.internal.expressions
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.test_helpers.TestName
import org.parboiled.scala.Rule1

trait ParserAstTest[AST] extends ParserTest[AST, AST] with TestName {
  final override def convert(ast: AST): AST = ast

  final def yields(expr: InputPosition => AST)(implicit parser: Rule1[AST]): Unit = parsing(testName) shouldGive expr

  final def gives(ast: AST)(implicit parser: Rule1[AST]): Unit = parsing(testName) shouldGive ast

  final def failsToParse(implicit parser: Rule1[AST]): Unit = assertFails(testName)

  private type Expression = InputPosition => expressions.Expression

  final def id(id: String): InputPosition => expressions.Variable = expressions.Variable(id)(_)

  final def lt(lhs: Expression, rhs: Expression): Expression = { pos => expressions.LessThan(lhs(pos), rhs(pos))(pos) }

  final def lte(lhs: Expression, rhs: Expression): Expression = { pos => expressions.LessThanOrEqual(lhs(pos), rhs(pos))(pos) }

  final def gt(lhs: Expression, rhs: Expression): Expression = { pos => expressions.GreaterThan(lhs(pos), rhs(pos))(pos) }

  final def gte(lhs: Expression, rhs: Expression): Expression = { pos => expressions.GreaterThanOrEqual(lhs(pos), rhs(pos))(pos) }

  final def eq(lhs: Expression, rhs: Expression): Expression = { pos => expressions.Equals(lhs(pos), rhs(pos))(pos) }

  final def ne(lhs: Expression, rhs: Expression): Expression = { pos => expressions.NotEquals(lhs(pos), rhs(pos))(pos) }

  final def and(lhs: Expression, rhs: Expression): Expression = { pos => expressions.And(lhs(pos), rhs(pos))(pos) }

  final def ands(parts: Expression*): Expression = { pos => expressions.Ands(parts.map(_(pos)))(pos) }
}
