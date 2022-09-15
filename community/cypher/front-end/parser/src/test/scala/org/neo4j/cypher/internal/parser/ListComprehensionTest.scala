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
import org.neo4j.cypher.internal.expressions.ExtractScope
import org.neo4j.cypher.internal.expressions.GreaterThan
import org.neo4j.cypher.internal.expressions.ListComprehension
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.util.DummyPosition
import org.parboiled.scala.EOI
import org.parboiled.scala.Rule1

class ListComprehensionTest extends ParserTest[expressions.ListComprehension, Any] with Expressions {
  implicit val parserToTest: Rule1[ListComprehension] = ListComprehension ~ EOI
  val t = DummyPosition(0)

  test("tests") {

    parsing("[ a in p WHERE a.foo > 123 ]") shouldGive
      expressions.ListComprehension(ExtractScope(expressions.Variable("a")(t),
                                         Some(GreaterThan(
                                           Property(expressions.Variable("a")(t),
                                                    expressions.PropertyKeyName("foo")(t))(t),
                                           SignedDecimalIntegerLiteral("123")(t))(t)),
                                         None)(t),
                            expressions.Variable("p")(t))(t)

    parsing("[ a in p | a.foo ]") shouldGive
      expressions.ListComprehension(ExtractScope(expressions.Variable("a")(t),
                                         None,
                                         Some(Property(expressions.Variable("a")(t),expressions.PropertyKeyName("foo")(t))(t))
                                        )(t),
                            expressions.Variable("p")(t))(t)

    parsing("[ a in p WHERE a.foo > 123 | a.foo ]") shouldGive
      expressions.ListComprehension(ExtractScope(expressions.Variable("a")(t),
                                         Some(GreaterThan(
                                           Property(expressions.Variable("a")(t),
                                                    expressions.PropertyKeyName("foo")(t))(t),
                                           SignedDecimalIntegerLiteral("123")(t))(t)),
                                         Some(Property(expressions.Variable("a")(t),expressions.PropertyKeyName("foo")(t))(t))
                                        )(t),
                            expressions.Variable("p")(t))(t)
  }

  def convert(result: expressions.ListComprehension): Any = result
}
