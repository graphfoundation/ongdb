/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.cypher.internal.runtime.interpreted.commands

import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.interpreted.QueryStateHelper
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.ExpressionVariable
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Literal
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.CoercedPredicate
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.Predicate
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.kernel.impl.util.ValueUtils
import org.neo4j.values.storable.Values.FALSE
import org.neo4j.values.storable.Values.NO_VALUE
import org.neo4j.values.storable.Values.TRUE
import org.neo4j.values.virtual.VirtualValues

class ListLiteralTest extends CypherFunSuite {

  test("any") {
    Seq() any FALSE
    Seq(true) any TRUE
    Seq(false) any FALSE
    Seq(null) any NO_VALUE
    Seq(null, true) any TRUE
    Seq(null, false) any NO_VALUE
    Seq(false, null) any NO_VALUE
    Seq(true, null) any TRUE
  }

  test("all") {
    Seq() all TRUE
    Seq(true) all TRUE
    Seq(false) all FALSE
    Seq(null) all NO_VALUE
    Seq(null, true) all NO_VALUE
    Seq(null, false) all FALSE
    Seq(false, null) all FALSE
    Seq(true, null) all NO_VALUE
  }

  test("single") {
    Seq() single FALSE
    Seq(true) single TRUE
    Seq(false) single FALSE
    Seq(null) single NO_VALUE
    Seq(null, true) single NO_VALUE
    Seq(null, false) single NO_VALUE
    Seq(false, null) single NO_VALUE
    Seq(true, null) single NO_VALUE
    Seq(true, false) single TRUE
    Seq(false, true) single TRUE
    Seq(true, true) single FALSE
    Seq(false, true, true) single FALSE
    Seq(false, true, false) single TRUE
    Seq(false, true, null) single NO_VALUE
  }

  test("none") {
    Seq() none TRUE
    Seq(true) none FALSE
    Seq(false) none TRUE
    Seq(null) none NO_VALUE
    Seq(null, true) none FALSE
    Seq(null, false) none NO_VALUE
    Seq(false, null) none NO_VALUE
    Seq(true, null) none FALSE
    Seq(true, false) none FALSE
    Seq(false, true) none FALSE
    Seq(true, true) none FALSE
    Seq(false, true, true) none FALSE
    Seq(false, true, false) none FALSE
    Seq(false, true, null) none FALSE
  }

  implicit class Check(values: Seq[_]) {

    def any(expected: Any) = check(expected, AnyInList.apply)

    def all(expected: Any) = check(expected, AllInList.apply)

    def single(expected: Any) = check(expected, SingleInList.apply)

    def none(expected: Any) = check(expected, NoneInList.apply)

    private def check(expected: Any,
                      collectionFunction: (Expression, String, Int, Predicate) => InList) {

      val function = collectionFunction(Literal(VirtualValues.list(values.map(ValueUtils.of):_*)), "x", 0, CoercedPredicate(ExpressionVariable(0, "x")))
      val result = function(CypherRow.empty, QueryStateHelper.emptyWith(expressionVariables = new Array(1)))
      result should equal(expected)
    }
  }
}
