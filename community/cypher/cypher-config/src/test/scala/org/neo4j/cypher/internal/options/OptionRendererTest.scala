/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.options

import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

import scala.language.higherKinds

class OptionRendererTest extends CypherFunSuite {

  test("Can render any case class") {
    case class MyOuter(
      inner: MyInner,
      someInt: Int,
    )
    case class MyInner(
      someString: String,
      anotherString: String,
    )

    implicit val renderInts: OptionRenderer[Int] = OptionRenderer.create(value => s"the number $value")
    implicit val renderStrings: OptionRenderer[String] = OptionRenderer.create(value => s"text $value")
    implicit val renderInner: OptionRenderer[MyInner] = OptionRenderer.derive[MyInner]
    implicit val renderOuter: OptionRenderer[MyOuter] = OptionRenderer.derive[MyOuter]

    renderOuter.render(MyOuter(MyInner("abc", "foo"), 123))
               .shouldEqual("text abc text foo the number 123")
  }

}
