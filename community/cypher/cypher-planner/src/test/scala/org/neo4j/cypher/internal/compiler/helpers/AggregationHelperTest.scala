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
package org.neo4j.cypher.internal.compiler.helpers

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.compiler.helpers.AggregationHelper.extractPropertyForValue
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class AggregationHelperTest extends CypherFunSuite with AstConstructionTestSupport {

  test("extractPropertyForValue") {
    extractPropertyForValue(varFor("x"), Map.empty) should be(None)
    extractPropertyForValue(prop("x", "prop"), Map.empty) should be(Some(prop("x", "prop")))
    extractPropertyForValue(prop("x", "prop"), Map("x" -> varFor("y"))) should be(Some(prop("y", "prop")))
    extractPropertyForValue(varFor("x"), Map("x" -> prop("y", "prop"))) should be(Some(prop("y", "prop")))
    extractPropertyForValue(varFor("x"), Map("x" -> varFor("z"),  "z" -> prop("y", "prop"))) should be(Some(prop("y", "prop")))
    extractPropertyForValue(function("foo", prop("x", "prop")), Map.empty) should be(Some(prop("x", "prop")))
    extractPropertyForValue(function("foo", varFor("x"), prop("x", "prop")), Map.empty) should be(None)
    extractPropertyForValue(function("foo", function("bar", prop("x", "prop"))), Map.empty) should be(None)
  }
}
