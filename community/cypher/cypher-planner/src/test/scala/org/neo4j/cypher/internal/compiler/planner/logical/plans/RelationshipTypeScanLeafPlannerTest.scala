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
package org.neo4j.cypher.internal.compiler.planner.logical.plans

import org.mockito.Mockito.when
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.compiler.planner.logical.steps.relationshipTypeScanLeafPlanner
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.SemanticDirection.BOTH
import org.neo4j.cypher.internal.expressions.SemanticDirection.INCOMING
import org.neo4j.cypher.internal.expressions.SemanticDirection.OUTGOING
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.SimplePatternLength
import org.neo4j.cypher.internal.ir.VarPatternLength
import org.neo4j.cypher.internal.ir.ordering.ColumnOrder
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder
import org.neo4j.cypher.internal.ir.ordering.InterestingOrderCandidate
import org.neo4j.cypher.internal.ir.ordering.RequiredOrderCandidate
import org.neo4j.cypher.internal.logical.plans.DirectedRelationshipTypeScan
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderDescending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.UndirectedRelationshipTypeScan
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class RelationshipTypeScanLeafPlannerTest extends CypherFunSuite with LogicalPlanningTestSupport {
  test("simple outgoing directed type scan") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(qg, InterestingOrderConfig.empty, context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderNone)
    ))
  }

  test("simple incoming directed type scan") {
    // given
    val context = planningContext()
    //(a)<-[:R]-(b)
    val qg = pattern("r", "a", "b", INCOMING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(qg, InterestingOrderConfig.empty, context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "b", relTypeName("R"), "a", Set.empty, IndexOrderNone)
    ))
  }

  test("simple undirected type scan") {
    // given
    val context = planningContext()
    //(a)-[:R]-(b)
    val qg = pattern("r", "a", "b", BOTH, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(qg, InterestingOrderConfig.empty, context)

    // then
    resultPlans should equal(Set(
      UndirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderNone)
    ))
  }

  test("should not scan if multiple types") {
    // given
    val context = planningContext()
    //(a)-[:R1|R2]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R1", "R2")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(qg, InterestingOrderConfig.empty, context)

    // then
    resultPlans shouldBe empty
  }

  test("should not scan if variable length pattern") {
    // given
    val context = planningContext()
    //(a)-[:R*]->(b)
    val qg = varPattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(qg, InterestingOrderConfig.empty, context)

    // then
    resultPlans shouldBe empty
  }

  test("should not plan type scan for skipped ids") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // then
    relationshipTypeScanLeafPlanner(Set("r"))(qg, InterestingOrderConfig.empty, context) should be(empty)
    relationshipTypeScanLeafPlanner(Set("a"))(qg, InterestingOrderConfig.empty, context) should be(empty)
    relationshipTypeScanLeafPlanner(Set("b"))(qg, InterestingOrderConfig.empty, context) should be(empty)
  }

  test("should not plan type scan when rel id is in arguments") {
    // given
    //(a)-[:R]->(b)
    val context = planningContext()
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // then
    relationshipTypeScanLeafPlanner(Set.empty)(qg.withArgumentIds(Set("r")), InterestingOrderConfig.empty, context) should be(empty)
  }

  test("should not plan type scan if no type index") {
    // given
    val context = planningContext(typeScanEnabled = false)

    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(qg, InterestingOrderConfig.empty, context)

    // then
    resultPlans shouldBe empty
  }

  test("outgoing directed relationship type scan with required ascending order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = true))))),
      context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderAscending)
    ))
  }

  test("outgoing directed relationship type scan with required descending order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false))))),
      context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderDescending)
    ))
  }

  test("incoming directed relationship type scan with required ascending order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", INCOMING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = true))))),
      context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "b", relTypeName("R"), "a", Set.empty, IndexOrderAscending)
    ))
  }

  test("incoming directed relationship type scan with required descending order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", INCOMING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false))))),
      context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "b", relTypeName("R"), "a", Set.empty, IndexOrderDescending)
    ))
  }

  test("outgoing directed relationship type scan with interesting order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq.empty),
          Seq(InterestingOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false)))))),
      context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderDescending)
    ))
  }

  test("outgoing directed relationship type scan with required and interesting order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", OUTGOING, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(
          RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = true))),
          Seq(InterestingOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false)))))),
      context)

    // then
    resultPlans should equal(Set(
      DirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderAscending)
    ))
  }

  test("undirected relationship type scan with required ascending order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", BOTH, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = true))))),
      context)

    // then
    resultPlans should equal(Set(
      UndirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderAscending)
    ))
  }

  test("undirected relationship type scan with required descending order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", BOTH, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false))))),
      context)

    // then
    resultPlans should equal(Set(
      UndirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderDescending)
    ))
  }

  test("undirected relationship type scan with interesting order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", BOTH, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(RequiredOrderCandidate(Seq.empty),
          Seq(InterestingOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false)))))),
      context)

    // then
    resultPlans should equal(Set(
      UndirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderDescending)
    ))
  }

  test("undirected relationship type scan with required and interesting order") {
    // given
    val context = planningContext()
    //(a)-[:R]->(b)
    val qg = pattern("r", "a", "b", BOTH, "R")

    // when
    val resultPlans = relationshipTypeScanLeafPlanner(Set.empty)(
      qg,
      InterestingOrderConfig(
        InterestingOrder(
          RequiredOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = true))),
          Seq(InterestingOrderCandidate(Seq(ColumnOrder(varFor("r"), ascending = false)))))),
      context)

    // then
    resultPlans should equal(Set(
      UndirectedRelationshipTypeScan("r", "a", relTypeName("R"), "b", Set.empty, IndexOrderAscending)
    ))
  }

  private def pattern(name: String, from: String, to: String, direction: SemanticDirection, types: String*) =
    QueryGraph(
      patternNodes = Set(name, from, to),
      patternRelationships = Set(PatternRelationship(name, (from, to), direction, types.map(relTypeName), SimplePatternLength)))

  private def varPattern(name: String, from: String, to: String, direction: SemanticDirection, types: String*) =
    QueryGraph(
      patternNodes = Set(name, from, to),
      patternRelationships = Set(PatternRelationship(name, (from, to), direction, types.map(relTypeName), VarPatternLength(1, None))))

  def planningContext(typeScanEnabled: Boolean = true): LogicalPlanningContext = {
    val planContext = newMockedPlanContext()
    when(planContext.canLookupRelationshipsByType).thenReturn(typeScanEnabled)
    newMockedLogicalPlanningContext(planContext = planContext, semanticTable = newMockedSemanticTable)
  }

}
