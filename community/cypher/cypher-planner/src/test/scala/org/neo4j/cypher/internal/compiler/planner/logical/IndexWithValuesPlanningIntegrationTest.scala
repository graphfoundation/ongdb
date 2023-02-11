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
package org.neo4j.cypher.internal.compiler.planner.logical

import org.neo4j.cypher.internal.ast.ProcedureResultItem
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningIntegrationTestSupport
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.StatisticsBackedLogicalPlanningConfiguration
import org.neo4j.cypher.internal.expressions.LabelToken
import org.neo4j.cypher.internal.expressions.NODE_TYPE
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.ir.CreateNode
import org.neo4j.cypher.internal.logical.plans.Aggregation
import org.neo4j.cypher.internal.logical.plans.Ascending
import org.neo4j.cypher.internal.logical.plans.CacheProperties
import org.neo4j.cypher.internal.logical.plans.DirectedRelationshipIndexSeek
import org.neo4j.cypher.internal.logical.plans.Distinct
import org.neo4j.cypher.internal.logical.plans.DoNotGetValue
import org.neo4j.cypher.internal.logical.plans.Expand
import org.neo4j.cypher.internal.logical.plans.FieldSignature
import org.neo4j.cypher.internal.logical.plans.GetValue
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.IndexSeek.nodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.Merge
import org.neo4j.cypher.internal.logical.plans.NodeIndexScan
import org.neo4j.cypher.internal.logical.plans.NodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.NodeUniqueIndexSeek
import org.neo4j.cypher.internal.logical.plans.ProcedureCall
import org.neo4j.cypher.internal.logical.plans.ProcedureReadOnlyAccess
import org.neo4j.cypher.internal.logical.plans.ProcedureSignature
import org.neo4j.cypher.internal.logical.plans.Projection
import org.neo4j.cypher.internal.logical.plans.QualifiedName
import org.neo4j.cypher.internal.logical.plans.ResolvedCall
import org.neo4j.cypher.internal.logical.plans.Selection
import org.neo4j.cypher.internal.logical.plans.SingleQueryExpression
import org.neo4j.cypher.internal.logical.plans.Sort
import org.neo4j.cypher.internal.logical.plans.Union
import org.neo4j.cypher.internal.logical.plans.UnwindCollection
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.symbols.CTString
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.graphdb.schema.IndexType

class IndexWithValuesPlanningIntegrationTest extends CypherFunSuite with LogicalPlanningTestSupport2 with LogicalPlanningIntegrationTestSupport with PlanMatchHelp {

  // or planner between two indexes

  test("in an OR index plan should use cached values outside union for range predicates") {
    val plan = new given {
      indexOn("Awesome", "prop1").providesValues()
      indexOn("Awesome", "prop2").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop1 > 42 OR n.prop2 > 3 RETURN n.prop1, n.prop2"

    Seq(
      nodeIndexSeek("n:Awesome(prop1 > 42)", _ => GetValue),
      nodeIndexSeek("n:Awesome(prop2 > 3)", _ => GetValue, propIds = Some(Map("prop2" -> 1)))
    ).permutations.map {
      case Seq(seek1, seek2) =>
        Projection(
          Distinct(
            Union(
              seek1,
              seek2
            ),
            Map("n" -> varFor("n"))
          ),
          Map("n.prop1" -> cachedNodeProp("n", "prop1"), "n.prop2" -> cachedNodeProp("n", "prop2"))
        )
    }.toSeq should contain(plan._2)
  }

  test("in an OR index plan should use cached values outside union for range predicates if they are on the same property") {
    val plan = new given {
      indexOn("Awesome", "prop1").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop1 > 42 OR n.prop1 < 3 RETURN n.prop1, n.prop2"
    Seq(
      nodeIndexSeek("n:Awesome(prop1 > 42)", _ => GetValue),
      nodeIndexSeek("n:Awesome(prop1 < 3)", _ => GetValue)
    ).permutations.map {
      case Seq(seek1, seek2) =>
        Projection(
          Distinct(
            Union(
              seek1,
              seek2
            ),
            Map("n" -> varFor("n"))
          ),
          Map(cachedNodePropertyProj("n", "prop1"), "n.prop2" -> prop("n", "prop2"))
        )
    }.toSeq should contain(plan._2)
  }

  test("in an OR index plan should use cached values outside union for equality predicates") {
    val plan = new given {
      indexOn("Awesome", "prop1").providesValues()
      indexOn("Awesome", "prop2").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop1 = 42 OR n.prop2 = 3 RETURN n.prop1, n.prop2"

    Seq(
      nodeIndexSeek("n:Awesome(prop2 = 3)", _ => GetValue, propIds = Some(Map("prop2" -> 1))),
      nodeIndexSeek("n:Awesome(prop1 = 42)", _ => GetValue, propIds = Some(Map("prop1" -> 0)))
    ).permutations.map {
      case Seq(seek1, seek2) =>
        Projection(
          Distinct(
            Union(
              seek1,
              seek2
            ),
            Map("n" -> varFor("n"))
          ),
          Map("n.prop1" -> cachedNodeProp("n", "prop1"), "n.prop2" -> cachedNodeProp("n", "prop2"))
        )
    }.toSeq should contain(plan._2)
  }

  test("in an OR index plan with 4 indexes should get values for equality predicates") {
    val plan = new given {
      indexOn("Awesome", "prop1").providesValues()
      indexOn("Awesome", "prop2").providesValues()
      indexOn("Awesome2", "prop1").providesValues()
      indexOn("Awesome2", "prop2").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome:Awesome2) WHERE n.prop1 = 42 OR n.prop2 = 3 RETURN n.prop1, n.prop2"

    // We don't want to assert on the produce results or the projection in this test
    val Projection(unionPlan, _) = plan._2

    val hasLabel1 = hasLabels("n", "Awesome")
    val hasLabel2 = hasLabels("n", "Awesome2")
    val seekLabel1Prop1 = nodeIndexSeek("n:Awesome(prop1 = 42)", _ => GetValue, propIds = Some(Map("prop1" -> 0)))
    val seekLabel1Prop2 = nodeIndexSeek("n:Awesome(prop2 = 3)", _ => GetValue, propIds = Some(Map("prop2" -> 1)))
    val seekLabel2Prop1 = nodeIndexSeek("n:Awesome2(prop1 = 42)", _ => GetValue, propIds = Some(Map("prop1" -> 0)), labelId = 1)
    val seekLabel2Prop2 = nodeIndexSeek("n:Awesome2(prop2 = 3)", _ => GetValue, propIds = Some(Map("prop2" -> 1)), labelId = 1)

    val coveringCombinations = Seq(
      (seekLabel1Prop1, hasLabel2),
      (seekLabel1Prop2, hasLabel2),
      (seekLabel2Prop1, hasLabel1),
      (seekLabel2Prop2, hasLabel1),
    )

    val planAlternatives = for {
      Seq((seek1, filter1), (seek2, filter2)) <- coveringCombinations.permutations.map(_.take(2)).toSeq
    } yield Distinct(Union(Selection(Seq(filter1), seek1), Selection(Seq(filter2), seek2)), Map("n" -> varFor("n")))

    planAlternatives should contain(unionPlan)

  }

  // Index exact seeks

  test("should plan index seek with GetValue when the property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("for exact seeks, should even plan index seek with GetValue when the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and index seek with DoNotGetValue when another property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      indexOn("Awesome", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => DoNotGetValue),
        Map(propertyProj("n", "foo")))
    )
  }

  test("should plan projection and index seek with GetValue when two properties are projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      indexOn("Awesome", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN n.foo, n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
        Map(propertyProj("n", "foo"), cachedNodePropertyProj("n", "prop")))
    )
  }

  test("should plan projection and index seek with GetValue when another predicate uses the property") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop <= 42 AND n.prop % 2 = 0 RETURN n.foo"

    plan._2 should equal(
      Projection(
        Selection(ands(equals(modulo(cachedNodeProp("n", "prop"), literalInt(2)), literalInt(0))),
          nodeIndexSeek("n:Awesome(prop <= 42)", _ => GetValue)),
        Map(propertyProj("n", "foo")))
    )
  }

  test("should plan projection and index seek with GetValue when another predicate uses the property 2") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome)-[r]->(m) WHERE n.prop <= 42 AND n.prop % m.foo = 0 RETURN n.foo"

    plan._2 should equal(
      Projection(
        Selection(ands(equals(modulo(cachedNodeProp("n", "prop"), prop("m", "foo")), literalInt(0))),
          Expand(
            CacheProperties(
              nodeIndexSeek("n:Awesome(prop <= 42)", _ => GetValue),
              Set(cachedNodePropFromStore("n", "foo"))
            ),
            "n", SemanticDirection.OUTGOING, Seq.empty, "m", "r")
        ),
        Map("n.foo" -> cachedNodeProp("n", "foo")))
    )
  }

  test("should plan index seek with GetValue when the property is projected after a renaming projection") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 WITH n AS m MATCH (m)-[r]-(o) RETURN m.prop"

    plan._2 should equal(
      Projection(
        Expand(
          Projection(
            NodeIndexSeek(
              "n",
              LabelToken("Awesome", LabelId(0)),
              Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
              SingleQueryExpression(literalInt(42)),
              Set.empty,
              IndexOrderNone,
              IndexType.BTREE),
            Map("m" -> varFor("n"))),
          "m", SemanticDirection.BOTH, Seq.empty, "o", "r"),
        Map("m.prop" -> cachedNodeProp("n", "prop", "m")))
    )
  }

  test("should plan index seek with GetValue when the property is used in a predicate after a renaming projection") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 42 WITH n AS m MATCH (m)-[r]-(o) WHERE m.prop < 50 RETURN o"

    plan._2 should equal(
      Expand(
        Selection(ands(lessThan(cachedNodeProp("n", "prop", "m"), literalInt(50))),
          Projection(
            nodeIndexSeek("n:Awesome(prop > 42)", _ => GetValue),
            Map("m" -> varFor("n")))),
        "m", SemanticDirection.BOTH, Seq.empty, "o", "r")
    )
  }

  test("should plan index seek with GetValue when the property is projected and renamed in a RETURN") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN n.prop AS foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
        Map(cachedNodePropertyProj("foo", "n", "prop")))
    )
  }

  test("should plan index seek with GetValue when the property is projected and renamed in a WITH") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 WITH n.prop AS foo, true AS bar RETURN foo, bar AS baz"

    plan._2 should equal(
      Projection(
        Projection(
          nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
          Map(cachedNodePropertyProj("foo", "n", "prop"), "bar" -> trueLiteral)),
        Map("baz" -> varFor("bar")))
    )
  }

  test("should not be fooled to use a variable when the node variable is defined twice") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 WITH n as m MATCH (m)-[r]-(n) RETURN n.prop"

    plan._2 should equal(
      Projection(
        Expand(
          Projection(
            NodeIndexSeek(
              "n",
              LabelToken("Awesome", LabelId(0)),
              Seq(indexedProperty("prop", 0, DoNotGetValue, NODE_TYPE)),
              SingleQueryExpression(literalInt(42)),
              Set.empty,
              IndexOrderNone,
              IndexType.BTREE),
            Map("m" -> varFor("n"))),
          "m", SemanticDirection.BOTH, Seq.empty, "n", "r"),
        Map("n.prop" -> prop("n", "prop"))
      )
    )
  }

  test("should plan index seek with GetValue when the property is projected before the property access") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 WITH n MATCH (m)-[r]-(n) RETURN n.prop"

    plan._2 should equal(
      Projection(
        Expand(
          nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
          "n", SemanticDirection.BOTH, Seq.empty, "m", "r"),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and index seek with GetValue when the property is projected inside of a function") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 'foo' RETURN toUpper(n.prop)"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 'foo')", _ => GetValue),
        Map("toUpper(n.prop)" -> function("toUpper", cachedNodeProp("n", "prop")))
      )
    )
  }

  test("should plan projection and index seek with GetValue when the property is used in ORDER BY") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 'foo' RETURN n.foo ORDER BY toUpper(n.prop)"

    plan._2 should equal(
      Projection(
        Sort(
          Projection(
            nodeIndexSeek(
              "n:Awesome(prop = 'foo')", _ => GetValue),
            Map("toUpper(n.prop)" -> function("toUpper", cachedNodeProp("n", "prop")))),
          Seq(Ascending("toUpper(n.prop)"))),
        Map("n.foo" -> prop("n", "foo"))
      )
    )
  }

  test("should plan index seek with GetValue when the property is part of an aggregating column") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN sum(n.prop), n.foo AS nums"

    plan._2 should equal(
      Aggregation(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
        Map("nums" -> prop("n", "foo")),
        Map("sum(n.prop)" -> sum(cachedNodeProp("n", "prop")))
      )
    )
  }

  test("should plan projection and index seek with GetValue when the property is used in key column of an aggregation and in ORDER BY") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 'foo' RETURN sum(n.foo), n.prop ORDER BY n.prop"

    plan._2 should equal(
      Sort(
        Aggregation(
          nodeIndexSeek("n:Awesome(prop = 'foo')", _ => GetValue),
          Map(cachedNodePropertyProj("n.prop", "n", "prop")),
          Map("sum(n.foo)" -> sum(prop("n", "foo")))
        ),
        Seq(Ascending("n.prop")))
    )
  }

  test("should plan index seek with GetValue when the property is part of a distinct column") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 RETURN DISTINCT n.prop"

    plan._2 should equal(
      Distinct(
        nodeIndexSeek("n:Awesome(prop = 42)", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop")))
    )
  }

  test("should plan projection and index seek with GetValue when the property is used in an unwind projection") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 'foo' UNWIND [n.prop] AS foo RETURN foo"

    plan._2 should equal(
      UnwindCollection(
        nodeIndexSeek("n:Awesome(prop = 'foo')", _ => GetValue),
        "foo", listOf(cachedNodeProp("n", "prop"))
      )
    )
  }

  test("should plan projection and index seek with GetValue when the property is used in a procedure call") {
    val signature = ProcedureSignature(QualifiedName(Seq.empty, "fooProcedure"),
      IndexedSeq(FieldSignature("input", CTString)),
      Some(IndexedSeq(FieldSignature("value", CTString))),
      None,
      ProcedureReadOnlyAccess,
      id = 42)

    val plan = new given {
      procedure(signature)
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 'foo' CALL fooProcedure(n.prop) YIELD value RETURN value"

    plan._2 should equal(
      ProcedureCall(
        nodeIndexSeek("n:Awesome(prop = 'foo')", _ => GetValue),
        ResolvedCall(signature,
          IndexedSeq(coerceTo(cachedNodeProp("n", "prop"), CTString)),
          IndexedSeq(ProcedureResultItem(None, varFor("value"))(pos)))(pos))
    )
  }

  // STARTS WITH seek

  test("should plan starts with seek with GetValue when the property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop STARTS WITH 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop STARTS WITH 'foo')", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and starts with seek with DoNotGetValue when the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop STARTS WITH 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop STARTS WITH 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "prop")))
    )
  }

  test("should plan projection and starts with seek with DoNotGetValue when another property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      indexOn("Awesome", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop STARTS WITH 'foo' RETURN n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop STARTS WITH 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "foo")))
    )
  }

  // RANGE seek

  test("should plan range seek with GetValue when the property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop > 'foo')", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and range seek with DoNotGetValue when the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop > 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "prop")))
    )
  }

  test("should plan projection and range seek with DoNotGetValue when another property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop")
      indexOn("Awesome", "foo")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 'foo' RETURN n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop > 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "foo")))
    )
  }

  // RANGE seek on unique index

  test("should plan range seek with GetValue when the property is projected (unique index)") {
    val plan = new given {
      uniqueIndexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop > 'foo')", _ => GetValue, unique = true),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and range seek with DoNotGetValue when the index does not provide values (unique index)") {
    val plan = new given {
      uniqueIndexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop > 'foo')", _ => DoNotGetValue, unique = true),
        Map(propertyProj("n", "prop")))
    )
  }

  test("should plan projection and range seek with DoNotGetValue when another property is projected (unique index)") {
    val plan = new given {
      uniqueIndexOn("Awesome", "prop")
      uniqueIndexOn("Awesome", "foo")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop > 'foo' RETURN n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop > 'foo')", _ => DoNotGetValue, unique = true),
        Map(propertyProj("n", "foo")))
    )
  }

  // seek on merge unique index

  test("should plan seek with GetValue when the property is projected (merge unique index), but need a projection because of the Optional") {
    val plan = new given {
      uniqueIndexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MERGE (n:Awesome {prop: 'foo'}) RETURN n.prop"

    plan._2 should equal(
      Projection(
        Merge(
          NodeUniqueIndexSeek(
            "n",
            LabelToken("Awesome", LabelId(0)),
            Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
            SingleQueryExpression(literalString("foo")),
            Set.empty,
            IndexOrderNone,
            IndexType.BTREE),
          Seq(CreateNode("n", Seq(labelName("Awesome")), Some(mapOf(("prop", literalString("foo")))))), Seq.empty, Seq.empty, Seq.empty, Set.empty
        ),
        Map("n.prop" -> cachedNodeProp("n", "prop")))
    )
  }

  test("for exact seeks, should even plan index seek with GetValue when the index does not provide values (merge unique index), but need a projection because of the Optional") {
    val plan = new given {
      uniqueIndexOn("Awesome", "prop")
    } getLogicalPlanFor "MERGE (n:Awesome {prop: 'foo'}) RETURN n.prop"

    plan._2 should equal(
      Projection(
        Merge(
          NodeUniqueIndexSeek(
            "n",
            LabelToken("Awesome", LabelId(0)),
            Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
            SingleQueryExpression(literalString("foo")),
            Set.empty,
            IndexOrderNone,
            IndexType.BTREE),
          Seq(CreateNode("n", Seq(labelName("Awesome")), Some(mapOf(("prop", literalString("foo")))))), Seq.empty, Seq.empty, Seq.empty, Set.empty
        ),
        Map("n.prop" -> cachedNodeProp("n", "prop")))
    )
  }

  test("should plan projection and range seek with DoNotGetValue when another property is projected (merge unique index)") {
    val plan = new given {
      uniqueIndexOn("Awesome", "prop")
      uniqueIndexOn("Awesome", "foo")
    } getLogicalPlanFor "MERGE (n:Awesome {prop: 'foo'}) RETURN n.foo"

    plan._2 should equal(
      Projection(
        Merge(
          NodeUniqueIndexSeek(
            "n",
            LabelToken("Awesome", LabelId(0)),
            Seq(indexedProperty("prop", 0, DoNotGetValue, NODE_TYPE)),
            SingleQueryExpression(literalString("foo")),
            Set.empty,
            IndexOrderNone,
            IndexType.BTREE),
          Seq(CreateNode("n", Seq(labelName("Awesome")), Some(mapOf(("prop", literalString("foo")))))), Seq.empty, Seq.empty, Seq.empty, Set.empty
        ),
        Map(propertyProj("n", "foo")))
    )
  }

  // composite index

  test("should plan index seek with GetValue when the property is projected (composite index)") {
    val plan = new given {
      indexOn("Awesome", "prop", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 AND n.foo = 21 RETURN n.prop, n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42, foo = 21)", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"), cachedNodePropertyProj("n", "foo"))
      )
    )
  }

  test("for exact seeks, should even plan index seek with GetValue when the index does not provide values (composite index)") {
    val plan = new given {
      indexOn("Awesome", "prop", "foo")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 AND n.foo = 21 RETURN n.prop, n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42, foo = 21)", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"), cachedNodePropertyProj("n", "foo"))
      )
    )
  }

  test("should plan projection and index seek with DoNotGetValue when another property is projected (composite index)") {
    val plan = new given {
      indexOn("Awesome", "prop", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 AND n.foo = 21 RETURN n.bar"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42, foo = 21)", _ => DoNotGetValue),
        Map("n.bar" -> prop("n", "bar")))
    )
  }

  test("should plan index seek with GetValue and DoNotGetValue when only one property is projected (composite index)") {
    val plan = new given {
      indexOn("Awesome", "prop", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop = 42 AND n.foo = 21 RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop = 42, foo = 21)", Map("prop" -> GetValue, "foo" -> DoNotGetValue)),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  // CONTAINS scan

  test("should plan index contains scan with GetValue when the property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop CONTAINS 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop CONTAINS 'foo')", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and index contains scan with DoNotGetValue when the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop CONTAINS 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop CONTAINS 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "prop")))
    )
  }

  test("should plan projection and index contains scan with DoNotGetValue when another property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      indexOn("Awesome", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop CONTAINS 'foo' RETURN n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop CONTAINS 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "foo")))
    )
  }

  test("should plan index contains scan with GetValue when the relationship property is projected") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop CONTAINS 'foo' RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 100)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    planner.plan(query) should equal(
      planner.planBuilder()
        .produceResults("`r.prop`")
        .projection("cacheR[r.prop] AS `r.prop`")
        .relationshipIndexOperator("(a)-[r:REL(prop CONTAINS 'foo')]-(b)", indexOrder = IndexOrderNone, argumentIds = Set(), getValue = _ => GetValue)
        .build()
    )
  }

  test("should plan relationship projection and index contains scan with DoNotGetValue when the index does not provide values") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop CONTAINS 'foo' RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 100)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01)
      .build()

    planner.plan(query) should equal(
      planner.planBuilder()
        .produceResults("`r.prop`")
        .projection("r.prop AS `r.prop`")
        .relationshipIndexOperator("(a)-[r:REL(prop CONTAINS 'foo')]-(b)", indexOrder = IndexOrderNone, argumentIds = Set(), getValue = _ => DoNotGetValue)
        .build()
    )
  }

  test("should plan relationship projection and index contains scan with DoNotGetValue when another property is projected") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop CONTAINS 'foo' RETURN r.foo"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 100)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    planner.plan(query) should equal(
      planner.planBuilder()
        .produceResults("`r.foo`")
        .projection("r.foo AS `r.foo`")
        .relationshipIndexOperator("(a)-[r:REL(prop CONTAINS 'foo')]-(b)", indexOrder = IndexOrderNone, argumentIds = Set(), getValue = _ => DoNotGetValue)
        .build()
    )
  }

  // EXISTS

  test("should plan exists scan with GetValue when the property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop IS NOT NULL RETURN n.prop"

    plan._2 should equal(
      Projection(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test(s"should plan exists scan with GetValue when the relationship property is projected") {
    val query = s"MATCH (a)-[r:REL]-(b) WHERE r.prop IS NOT NULL RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(10)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("cacheR[r.prop] AS `r.prop`")
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test(s"should plan exists scan with DoNotGetValue when the a relationship property is projected, but from a different variable") {
    val query = s"MATCH (a)-[r:REL]-(b) WHERE r.prop IS NOT NULL WITH count(*) AS count MATCH (a)-[r]-(b) RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(10)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop AS `r.prop`")
      .expandAll("(a)-[r]-(b)")
      .apply()
      .|.allNodeScan("a", "count")
      .aggregation(Seq(), Seq("count(*) AS count"))
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  test("should plan exists scan with DoNotGetValue when the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop IS NOT NULL RETURN n.prop"

    plan._2 should equal(
      Projection(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, DoNotGetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map(propertyProj("n", "prop"))
      )
    )
  }

  test(s"should plan exists scan with DoNotGetValue when the relationship index does not provide values") {
    val query = s"MATCH (a)-[r:REL]-(b) WHERE r.prop IS NOT NULL RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(10)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop AS `r.prop`")
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  // EXISTENCE / NODE KEY CONSTRAINT

  test("should plan scan with GetValue when existence constraint on projected property") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      nodePropertyExistenceConstraintOn("Awesome", Set("prop"))
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN n.prop"

    plan._2 should equal(
      Projection(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan scan (relationship) with GetValue when existence constraint on projected property") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .addRelationshipExistenceConstraint("REL", "prop")
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("cacheR[r.prop] AS `r.prop`")
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test("should plan scan with DoNotGetValue when existence constraint but the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
      nodePropertyExistenceConstraintOn("Awesome", Set("prop"))
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN n.prop"

    plan._2 should equal(
      Projection(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, DoNotGetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map(propertyProj("n", "prop"))
      )
    )
  }

  test("should plan scan (relationship) with DoNotGetValue when existence constraint  but the index does not provide values") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01)
      .addRelationshipExistenceConstraint("REL", "prop")
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop AS `r.prop`")
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  test("should plan scan with GetValue when composite existence constraint on projected property") {
    val plan = new given {
      indexOn("Awesome", "prop2").providesValues()
      nodePropertyExistenceConstraintOn("Awesome", Set("prop1", "prop2"))
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN n.prop2"

    plan._2 should equal(
      Projection(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop2", 0, GetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map(cachedNodePropertyProj("n", "prop2"))
      )
    )
  }

  test("should plan scan (relationship) with GetValue when composite existence constraint on projected property") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN r.prop2"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop1", "prop2"), 1.0, 0.01, withValues = true)
      .addRelationshipExistenceConstraint("REL", "prop1")
      .addRelationshipExistenceConstraint("REL", "prop2")
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    withClue("Index scan on two properties should be planned if they are only available through constraint") {
      plan should equal(planner.subPlanBuilder()
        .projection("cacheR[r.prop2] AS `r.prop2`")
        .relationshipIndexOperator("(a)-[r:REL(prop1, prop2)]-(b)", getValue = Map("prop1" -> DoNotGetValue, "prop2" -> GetValue))
        .build()
      )
    }

  }

  test("should plan scan (node) with GetValue when composite existence constraint on projected property") {
    val query = s"MATCH (a:A) RETURN a.prop2"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setLabelCardinality("A", 10)
      .addNodeIndex("A", Seq("prop1", "prop2"), 1.0, 0.01, withValues = true)
      .addNodeExistenceConstraint("A", "prop1")
      .addNodeExistenceConstraint("A", "prop2")
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    withClue("Index scan on two properties should be planned if they are only available through constraint") {
      plan should equal(planner.subPlanBuilder()
        .projection("cacheN[a.prop2] AS `a.prop2`")
        .nodeIndexOperator("a:A(prop1, prop2)", getValue = Map("prop1" -> DoNotGetValue, "prop2" -> GetValue))
        .build()
      )
    }
  }

  test("should plan scan with DoNotGetValue when composite existence constraint but the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop2")
      nodePropertyExistenceConstraintOn("Awesome", Set("prop1", "prop2"))
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN n.prop2"

    plan._2 should equal(
      Projection(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop2", 0, DoNotGetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map(propertyProj("n", "prop2"))
      )
    )
  }

  test("should plan scan (relationship) with DoNotGetValue when composite existence constraint but the index does not provide values") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN r.prop2"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop1", "prop2"), 1.0, 0.01)
      .addRelationshipExistenceConstraint("REL", "prop1")
      .addRelationshipExistenceConstraint("REL", "prop2")
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop2 AS `r.prop2`")
      .relationshipIndexOperator("(a)-[r:REL(prop1, prop2)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  // ENDS WITH scan

  test("should plan index ends with scan with GetValue when the property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop ENDS WITH 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop ENDS WITH 'foo')", _ => GetValue),
        Map(cachedNodePropertyProj("n", "prop"))
      )
    )
  }

  test("should plan projection and index ends with scan with DoNotGetValue when the index does not provide values") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop ENDS WITH 'foo' RETURN n.prop"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop ENDS WITH 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "prop")))
    )
  }

  test("should plan projection and index ends with scan with DoNotGetValue when another property is projected") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      indexOn("Awesome", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop ENDS WITH 'foo' RETURN n.foo"

    plan._2 should equal(
      Projection(
        nodeIndexSeek("n:Awesome(prop ENDS WITH 'foo')", _ => DoNotGetValue),
        Map(propertyProj("n", "foo")))
    )
  }

  test("should use cached access after projection of non returned property") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
      indexOn("Awesome", "foo").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) WHERE n.prop < 2 RETURN n.prop ORDER BY n.foo"

    plan._2 should equal(
      Projection(
        Sort(
          Projection(
            nodeIndexSeek("n:Awesome(prop < 2)", _ => GetValue),
            Map("n.foo" -> prop("n", "foo"))),
          Seq(Ascending("n.foo"))
        ),
        Map("n.prop" -> cachedNodeProp("n", "prop"))
      )
    )
  }

  test("should plan index ends with scan with GetValue when the relationship property is projected") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop ENDS WITH 'foo' RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 100)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    planner.plan(query) should equal(
      planner.planBuilder()
        .produceResults("`r.prop`")
        .projection("cacheR[r.prop] AS `r.prop`")
        .relationshipIndexOperator("(a)-[r:REL(prop ENDS WITH 'foo')]-(b)", indexOrder = IndexOrderNone, argumentIds = Set(), getValue = _ => GetValue)
        .build()
    )
  }

  test("should plan relationship projection and index ends with scan with DoNotGetValue when the index does not provide values") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop ENDS WITH 'foo' RETURN r.prop"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 100)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01)
      .build()

    planner.plan(query) should equal(
      planner.planBuilder()
        .produceResults("`r.prop`")
        .projection("r.prop AS `r.prop`")
        .relationshipIndexOperator("(a)-[r:REL(prop ENDS WITH 'foo')]-(b)", indexOrder = IndexOrderNone, argumentIds = Set(), getValue = _ => DoNotGetValue)
        .build()
    )
  }

  test("should plan relationship projection and index ends with scan with DoNotGetValue when another property is projected") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop ENDS WITH 'foo' RETURN r.foo"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 100)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    planner.plan(query) should equal(
      planner.planBuilder()
        .produceResults("`r.foo`")
        .projection("r.foo AS `r.foo`")
        .relationshipIndexOperator("(a)-[r:REL(prop ENDS WITH 'foo')]-(b)", indexOrder = IndexOrderNone, argumentIds = Set(), getValue = _ => DoNotGetValue)
        .build()
    )
  }

  // AGGREGATIONS (=> implicit exists)

  test("should plan scan with GetValue when the property is used in avg function") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN avg(n.prop)"

    plan._2 should equal(
      Aggregation(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map.empty,
        Map(s"avg(n.prop)" -> avg(cachedNodeProp("n", "prop")))
      )
    )
  }

  test("should plan scan (relationship) with GetValue when the property is used in avg function") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN avg(r.prop)"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("avg(cacheR[r.prop]) AS `avg(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test("should plan scan with DoNotGetValue when the property is used in avg function") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN avg(n.prop)"

    plan._2 should equal(
      Aggregation(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, DoNotGetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map.empty,
        Map("avg(n.prop)" -> avg(prop("n", "prop")))
      )
    )
  }

  test("should plan scan (relationship) with DoNotGetValue when the property is used in avg function") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN avg(r.prop)"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("avg(r.prop) AS `avg(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)")
      .build()
    )
  }

  test("should plan scan with GetValue when the property is used in sum function") {
    val plan = new given {
      indexOn("Awesome", "prop").providesValues()
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN sum(n.prop)"

    plan._2 should equal(
      Aggregation(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, GetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map.empty,
        Map("sum(n.prop)" -> sum(cachedNodeProp("n", "prop")))
      )
    )
  }

  test("should plan scan (relationship) with GetValue when the property is used in sum function") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN sum(r.prop)"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = true)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("sum(cacheR[r.prop]) AS `sum(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test("should plan scan with DoNotGetValue when the property is used in sum function") {
    val plan = new given {
      indexOn("Awesome", "prop")
    } getLogicalPlanFor "MATCH (n:Awesome) RETURN sum(n.prop)"

    plan._2 should equal(
      Aggregation(
        NodeIndexScan(
          "n",
          LabelToken("Awesome", LabelId(0)),
          Seq(indexedProperty("prop", 0, DoNotGetValue, NODE_TYPE)),
          Set.empty,
          IndexOrderNone,
          IndexType.BTREE),
        Map.empty,
        Map("sum(n.prop)" -> sum(prop("n", "prop")))
      )
    )
  }

  test("should plan scan (relationship) with DoNotGetValue when the property is used in sum function") {
    val query = s"MATCH (a)-[r:REL]-(b) RETURN sum(r.prop)"

    val planner = plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01)
      .build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("sum(r.prop) AS `sum(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop)]-(b)")
      .build()
    )
  }

  private def relIndexSeekConfig(withValues: Boolean) =
    plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(10)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop"), 1.0, 0.01, withValues = withValues)

  test("should plan seek with GetValue when the relationship property is projected") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop = 123 RETURN r.prop"

    val planner = relIndexSeekConfig(withValues = true).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("cacheR[r.prop] AS `r.prop`")
      .relationshipIndexOperator("(a)-[r:REL(prop = 123)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test("should plan seek with DoNotGetValue when the a relationship property is projected, but from a different variable") {
    val query =
      """MATCH (a)-[r:REL]-(b)
        |WHERE r.prop = 123
        |WITH count(*) AS count
        |MATCH (a)-[r]-(b)
        |RETURN r.prop""".stripMargin

    val planner = relIndexSeekConfig(withValues = true).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop AS `r.prop`")
      .expandAll("(a)-[r]-(b)")
      .apply()
      .|.allNodeScan("a", "count")
      .aggregation(Seq(), Seq("count(*) AS count"))
      .relationshipIndexOperator("(a)-[r:REL(prop = 123)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  test("should plan seek with DoNotGetValue when the relationship index does not provide values") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop > 123 RETURN r.prop"

    val planner = relIndexSeekConfig(withValues = false).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop AS `r.prop`")
      .relationshipIndexOperator("(a)-[r:REL(prop > 123)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  test("should plan seek (relationship) with GetValue when the property is used in avg function") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop > 123 RETURN avg(r.prop)"

    val planner = relIndexSeekConfig(withValues = true).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("avg(cacheR[r.prop]) AS `avg(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop > 123)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test("should plan seek (relationship) with DoNotGetValue when the property is used in avg function") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop > 123 RETURN avg(r.prop)"

    val planner = relIndexSeekConfig(withValues = false).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("avg(r.prop) AS `avg(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop > 123)]-(b)")
      .build()
    )
  }

  test("should plan seek (relationship) with GetValue when the property is used in sum function") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop > 123 RETURN sum(r.prop)"

    val planner = relIndexSeekConfig(withValues = true).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("sum(cacheR[r.prop]) AS `sum(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop > 123)]-(b)", getValue = _ => GetValue)
      .build()
    )
  }

  test("should plan seek (relationship) with DoNotGetValue when the property is used in sum function") {
    val query = s"MATCH (a)-[r:REL]-(b) WHERE r.prop > 123 RETURN sum(r.prop)"

    val planner = relIndexSeekConfig(withValues = false).build()

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .aggregation(Seq(), Seq("sum(r.prop) AS `sum(r.prop)`"))
      .relationshipIndexOperator("(a)-[r:REL(prop > 123)]-(b)")
      .build()
    )
  }

  private def relCompositeIndexSeekConfig(withValues: Boolean): StatisticsBackedLogicalPlanningConfiguration =
    plannerBuilder()
      .setAllNodesCardinality(100)
      .setAllRelationshipsCardinality(100)
      .setRelationshipCardinality("()-[:REL]-()", 10)
      .addRelationshipIndex("REL", Seq("prop1", "prop2"), 1.0, 0.01, withValues = withValues)
      .addRelationshipExistenceConstraint("REL", "prop1")
      .addRelationshipExistenceConstraint("REL", "prop2")
      .build()

  test("should plan seek (relationship) with GetValue when composite existence constraint on projected property") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop1 > 123 RETURN r.prop2"

    val planner = relCompositeIndexSeekConfig(withValues = true)

    val plan = planner
      .plan(query)
      .stripProduceResults

    withClue("Index seek on two properties should be planned if they are only available through constraint") {
       plan shouldBe planner.subPlanBuilder()
         .projection("cacheR[r.prop2] AS `r.prop2`")
         .relationshipIndexOperator("(a)-[r:REL(prop1 > 123, prop2)]-(b)", getValue = Map("prop1" -> DoNotGetValue, "prop2" -> GetValue))
         .build()
    }
  }

  test("should plan seek (relationship) with DoNotGetValue when composite existence constraint but the index does not provide values") {
    val query = "MATCH (a)-[r:REL]-(b) WHERE r.prop1 = 123 RETURN r.prop2"

    val planner = relCompositeIndexSeekConfig(withValues = false)

    val plan = planner
      .plan(query)
      .stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .projection("r.prop2 AS `r.prop2`")
      .relationshipIndexOperator("(a)-[r:REL(prop1 = 123, prop2)]-(b)", getValue = _ => DoNotGetValue)
      .build()
    )
  }

  test("should plan relationship index seek with GetValue when the property is projected (composite index)") {
    val planner = relCompositeIndexSeekConfig(withValues = true)
    val q = "MATCH (a)-[r:REL]->(b) WHERE r.prop1 = 42 AND r.prop2 = 21 RETURN r.prop1, r.prop2"
    val plan = planner.plan(q).stripProduceResults

    plan shouldBe planner.subPlanBuilder()
      .projection("cacheR[r.prop1] AS `r.prop1`", "cacheR[r.prop2] AS `r.prop2`")
      .relationshipIndexOperator("(a)-[r:REL(prop1 = 42, prop2 = 21)]->(b)", getValue = _ => GetValue)
      .build()
  }

  test("for exact seeks, should even plan relationship index seek with GetValue when the index does not provide values (composite index)") {
    val planner = relCompositeIndexSeekConfig(withValues = false)
    val q = "MATCH (a)-[r:REL]->(b) WHERE r.prop1 = 42 AND r.prop2 = 21 RETURN r.prop1, r.prop2"
    val plan = planner.plan(q).stripProduceResults

    plan shouldBe planner.subPlanBuilder()
      .projection("cacheR[r.prop1] AS `r.prop1`", "cacheR[r.prop2] AS `r.prop2`")
      .relationshipIndexOperator("(a)-[r:REL(prop1 = 42, prop2 = 21)]->(b)", getValue = _ => GetValue)
      .build()
  }

  test("should plan projection and index seek with DoNotGetValue when another property is projected (composite relationship index)") {
    val planner = relCompositeIndexSeekConfig(withValues = true)
    val q = "MATCH (a)-[r:REL]->(b) WHERE r.prop1 = 42 AND r.prop2 = 21 RETURN r.otherProp"
    val plan = planner.plan(q).stripProduceResults

    plan shouldBe planner.subPlanBuilder()
      .projection("r.otherProp AS `r.otherProp`")
      .relationshipIndexOperator("(a)-[r:REL(prop1 = 42, prop2 = 21)]->(b)", getValue = _ => DoNotGetValue)
      .build()
  }

  test("should plan relationship index seek with GetValue and DoNotGetValue when only one property is projected (composite index)") {
    val planner = relCompositeIndexSeekConfig(withValues = true)
    val q = "MATCH (a)-[r:REL]->(b) WHERE r.prop1 = 42 AND r.prop2 = 21 RETURN r.prop2"
    val plan = planner.plan(q).stripProduceResults

    plan.leftmostLeaf should matchPattern {
      case d: DirectedRelationshipIndexSeek
        if d.properties.map(p => p.propertyKeyToken.name -> p.getValueFromIndex) ==
          Seq("prop1" -> DoNotGetValue, "prop2" -> GetValue)
      => ()
    }
  }

  private def cachedNodePropertyProj(node: String, property: String) =
    s"$node.$property" -> cachedNodeProp(node, property)

  private def cachedNodePropertyProj(alias: String, node: String, property: String ) =
    alias -> cachedNodeProp(node, property)

  private def propertyProj(node: String, property: String ) =
    s"$node.$property" -> prop(node, property)

}
