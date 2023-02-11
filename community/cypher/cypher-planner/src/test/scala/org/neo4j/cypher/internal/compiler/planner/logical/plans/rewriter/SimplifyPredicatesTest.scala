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
package org.neo4j.cypher.internal.compiler.planner.logical.plans.rewriter

import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport
import org.neo4j.cypher.internal.expressions.AndedPropertyInequalities
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.Selection
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class SimplifyPredicatesTest extends CypherFunSuite with LogicalPlanningTestSupport {
  test("should rewrite WHERE x.prop in [1] to WHERE x.prop = 1") {
    val argument: LogicalPlan = Argument(Set("a"))
    val predicate = in(prop("x", "prop"), listOfInt(1))
    val cleanPredicate = propEquality("x", "prop", 1)
    val selection = Selection(Seq(predicate), argument)

    selection.endoRewrite(simplifyPredicates) should equal(
      Selection(Seq(cleanPredicate), argument))
  }

  test("should not rewrite WHERE x.prop in [1, 2]") {
    val argument: LogicalPlan = Argument(Set("a"))
    val orgPredicate = in(prop("x", "prop"), listOfInt(1, 2))
    val selection = Selection(Seq(orgPredicate), argument)

    selection.endoRewrite(simplifyPredicates) should equal(selection)
  }

  test("should rewrite WHERE AndedPropertyInequality(x.prop, 1) to WHERE x.prop > 42") {
    val argument: LogicalPlan = Argument(Set("x"))
    val predicate = propGreaterThan("x", "prop", 42)
    val complexForm = AndedPropertyInequalities(varFor("x"), prop("x", "prop"), NonEmptyList(predicate))
    val selection = Selection(Seq(complexForm), argument)
    val expectedSelection = Selection(Seq(predicate), argument)

    selection.endoRewrite(simplifyPredicates) should equal(expectedSelection)
  }

  test("should rewrite WHERE AndedPropertyInequality into multiple predicates") {
    val argument: LogicalPlan = Argument(Set("x"))
    val predicateGT = propGreaterThan("x", "prop", 42)
    val predicateLT = propLessThan("x", "prop", 321)
    val complexForm = AndedPropertyInequalities(varFor("x"), prop("x", "prop"), NonEmptyList(predicateGT, predicateLT))
    val selection = Selection(Seq(complexForm), argument)
    val expectedSelection = Selection(Seq(predicateGT, predicateLT), argument)

    selection.endoRewrite(simplifyPredicates) should equal(expectedSelection)
  }
}
