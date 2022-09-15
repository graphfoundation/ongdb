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
import org.neo4j.cypher.internal.compiler.helpers.PredicateHelper.isPredicate
import org.neo4j.cypher.internal.expressions.GetDegree
import org.neo4j.cypher.internal.expressions.GreaterThan
import org.neo4j.cypher.internal.expressions.HasLabels
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class PredicateHelperTest extends CypherFunSuite with AstConstructionTestSupport{

  test("isPredicate tests") {
    isPredicate(HasLabels(varFor("n"), Seq(LabelName("L")(pos)))(pos)) shouldBe true
    isPredicate(GetDegree(varFor("n"), None, SemanticDirection.OUTGOING)(pos)) shouldBe false
    isPredicate(function("exists", varFor("x"))) shouldBe true
    isPredicate(function("toBoolean", varFor("x"))) shouldBe true
    isPredicate(function("isEmpty", varFor("x"))) shouldBe true
    isPredicate(function("collect", varFor("x"))) shouldBe false
    isPredicate(GreaterThan(varFor("a"), varFor("b"))(pos)) shouldBe true
  }
}
