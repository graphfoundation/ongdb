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

import org.neo4j.cypher.internal.expressions
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.util.DummyPosition

class MapProjectionTest extends ParserTest[Any, Any] with Expressions {

  private val t = DummyPosition(0)

  test("testIdentifierCanContainASCII") {
    implicit val parserToTest = MapProjection

    parsing("abc{}") shouldGive expressions.MapProjection(expressions.Variable("abc")(t), Seq.empty)(t)

    parsing("abc{.id}") shouldGive
      expressions.MapProjection(expressions.Variable("abc")(t),
        Seq(expressions.PropertySelector(expressions.Variable("id")(t))(t)))(t)

    parsing("abc{id}") shouldGive
      expressions.MapProjection(expressions.Variable("abc")(t),
        Seq(expressions.VariableSelector(expressions.Variable("id")(t))(t)))(t)

    parsing("abc { id : 42 }") shouldGive
      expressions.MapProjection(expressions.Variable("abc")(t),
        Seq(expressions.LiteralEntry(expressions.PropertyKeyName("id")(t), SignedDecimalIntegerLiteral("42")(t))(t)))(t)

    parsing("abc { `a p a` : 42 }") shouldGive
      expressions.MapProjection(expressions.Variable("abc")(t),
        Seq(expressions.LiteralEntry(expressions.PropertyKeyName("a p a")(t), SignedDecimalIntegerLiteral("42")(t))(t)))(t)

    parsing("abc { id : 42, .foo, bar }") shouldGive
      expressions.MapProjection(expressions.Variable("abc")(t),
        Seq(
          expressions.LiteralEntry(expressions.PropertyKeyName("id")(t), SignedDecimalIntegerLiteral("42")(t))(t),
          expressions.PropertySelector(expressions.Variable("foo")(t))(t),
          expressions.VariableSelector(expressions.Variable("bar")(t))(t)
        )
      )(t)
  }

  def convert(result: Any): Any = result
}
