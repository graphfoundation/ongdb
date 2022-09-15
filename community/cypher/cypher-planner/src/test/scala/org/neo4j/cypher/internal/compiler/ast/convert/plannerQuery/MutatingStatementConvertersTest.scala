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
package org.neo4j.cypher.internal.compiler.ast.convert.plannerQuery

import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.SemanticDirection.OUTGOING
import org.neo4j.cypher.internal.ir.CallSubqueryHorizon
import org.neo4j.cypher.internal.ir.CreateNode
import org.neo4j.cypher.internal.ir.CreatePattern
import org.neo4j.cypher.internal.ir.CreateRelationship
import org.neo4j.cypher.internal.ir.ForeachPattern
import org.neo4j.cypher.internal.ir.PassthroughAllHorizon
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.RegularQueryProjection
import org.neo4j.cypher.internal.ir.RegularSinglePlannerQuery
import org.neo4j.cypher.internal.ir.Selections
import org.neo4j.cypher.internal.ir.SetNodePropertyPattern
import org.neo4j.cypher.internal.ir.SetRelationshipPropertyPattern
import org.neo4j.cypher.internal.ir.SimplePatternLength
import org.neo4j.cypher.internal.ir.UnwindProjection
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.scalatest.AppendedClues

class MutatingStatementConvertersTest extends CypherFunSuite with LogicalPlanningTestSupport with AppendedClues {

  test("setting a node property: MATCH (n) SET n.prop = 42 RETURN n") {
    val query = buildSinglePlannerQuery("MATCH (n) SET n.prop = 42 RETURN n")
    query.horizon should equal(RegularQueryProjection(
      projections = Map("n" -> varFor("n"))
    ))

    query.queryGraph.patternNodes should equal(Set("n"))
    query.queryGraph.mutatingPatterns should equal(List(
      SetNodePropertyPattern("n", PropertyKeyName("prop")(pos), literalInt(42))
    ))
  }

  test("removing a node property should look like setting a property to null") {
    val query = buildSinglePlannerQuery("MATCH (n) REMOVE n.prop RETURN n")
    query.horizon should equal(RegularQueryProjection(
      projections = Map("n" -> varFor("n"))
    ))

    query.queryGraph.patternNodes should equal(Set("n"))
    query.queryGraph.mutatingPatterns should equal(List(
      SetNodePropertyPattern("n", PropertyKeyName("prop")(pos), nullLiteral)
    ))
  }

  test("setting a relationship property: MATCH (a)-[r]->(b) SET r.prop = 42 RETURN r") {
    val query = buildSinglePlannerQuery("MATCH (a)-[r]->(b) SET r.prop = 42 RETURN r")
    query.horizon should equal(RegularQueryProjection(
      projections = Map("r" -> varFor("r"))
    ))

    query.queryGraph.patternRelationships should equal(Set(
      PatternRelationship("r", ("a", "b"), OUTGOING, List(), SimplePatternLength)
    ))
    query.queryGraph.mutatingPatterns should equal(List(
      SetRelationshipPropertyPattern("r", PropertyKeyName("prop")(pos), literalInt(42))
    ))
  }

  test("removing a relationship property should look like setting a property to null") {
    val query = buildSinglePlannerQuery("MATCH (a)-[r]->(b) REMOVE r.prop RETURN r")
    query.horizon should equal(RegularQueryProjection(
      projections = Map("r" -> varFor("r"))
    ))

    query.queryGraph.patternRelationships should equal(Set(
      PatternRelationship("r", ("a", "b"), OUTGOING, List(), SimplePatternLength)
    ))
    query.queryGraph.mutatingPatterns should equal(List(
      SetRelationshipPropertyPattern("r", PropertyKeyName("prop")(pos), nullLiteral)
    ))
  }

  test("Query with single CREATE clause") {
    val query = buildSinglePlannerQuery("CREATE (a), (b), (a)-[r:X]->(b) RETURN a, r, b")
    query.horizon should equal(RegularQueryProjection(
      projections = Map("a" -> varFor("a"), "r" -> varFor("r"), "b" -> varFor("b"))
    ))

    query.queryGraph.mutatingPatterns should equal(Seq(
      CreatePattern(
        nodes("a", "b"),
        relationship("r", "a", "X", "b"))
    ))

    query.queryGraph.containsReads should be (false)
  }

  test("Read write and read again") {
    val query = buildSinglePlannerQuery("MATCH (n) CREATE (m) WITH * MATCH (o) RETURN *")
    query.horizon should equal(RegularQueryProjection(
      projections = Map("n" -> varFor("n"), "m" -> varFor("m"))
    ))

    query.queryGraph.patternNodes should equal(Set("n"))
    query.queryGraph.mutatingPatterns should equal(Seq(CreatePattern(nodes("m"), Nil)))

    val next = query.tail.get

    next.queryGraph.patternNodes should equal(Set("o"))
    next.queryGraph.readOnly should be(true)
  }

  test("Unwind, read write and read again") {
    val query = buildSinglePlannerQuery("UNWIND [1] as i MATCH (n) CREATE (m) WITH * MATCH (o) RETURN *")
    query.horizon should equal(UnwindProjection("i", listOfInt(1)))
    query.queryGraph shouldBe 'isEmpty

    val second = query.tail.get

    second.queryGraph.patternNodes should equal(Set("n"))
    second.queryGraph.mutatingPatterns should equal(IndexedSeq(CreatePattern(nodes("m"), Nil)))

    val third = second.tail.get

    third.queryGraph.patternNodes should equal(Set("o"))
    third.queryGraph.readOnly should be(true)
  }

  test("Foreach with create node") {
    val query = buildSinglePlannerQuery("FOREACH (i in [1] | CREATE (a))")
    query.queryGraph shouldBe 'isEmpty
    val second = query.tail.get
    second.queryGraph.mutatingPatterns should equal(
      Seq(ForeachPattern("i",
        listOfInt(1),
        RegularSinglePlannerQuery(QueryGraph(Set.empty, Set.empty, Set("i"),
          Selections(Set.empty), Vector.empty, Set.empty, Set.empty,
          IndexedSeq(CreatePattern(nodes("a"), Nil))),
          InterestingOrder.empty,
          PassthroughAllHorizon(), None)))
    )
  }

  test("correlated subquery with create node") {
    val query = buildSinglePlannerQuery("MATCH (n) CALL { WITH n CREATE (m) RETURN m } RETURN n, m")
    query.readOnly shouldBe false withClue "(query should not be readonly)"
    query.horizon shouldEqual CallSubqueryHorizon(
      correlated = true,
      yielding = true,
      inTransactionsParameters = None,
      callSubquery = RegularSinglePlannerQuery(
        queryGraph = QueryGraph(
          argumentIds = Set("n"),
          mutatingPatterns = IndexedSeq(
            CreatePattern(nodes("m"), Seq.empty))),
        horizon = RegularQueryProjection(
          projections = Map("m" -> varFor("m"))))
    )
  }

  test("correlated subquery with create node without return") {
    val query = buildSinglePlannerQuery("MATCH (n) CALL { WITH n CREATE (m) } RETURN n")
    query.readOnly shouldBe false withClue "(query should not be readonly)"
    query.horizon shouldEqual CallSubqueryHorizon(
      correlated = true,
      yielding = false,
      inTransactionsParameters = None,
      callSubquery = RegularSinglePlannerQuery(
        queryGraph = QueryGraph(
          argumentIds = Set("n"),
          mutatingPatterns = IndexedSeq(
            CreatePattern(nodes("m"), Seq.empty))))
    )
  }

  private def nodes(names: String*) = {
    names.map(name => CreateNode(name, Seq.empty, None))
  }

  private def relationship(name: String, startNode: String, relType:String, endNode: String) = {
    List(CreateRelationship(name, startNode, RelTypeName(relType)(pos), endNode, OUTGOING, None))
  }
}
