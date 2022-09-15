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
package org.neo4j.cypher.internal.compiler.planner.logical

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.compiler.planner.BeLikeMatcher.beLike
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningIntegrationTestSupport
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.createNode
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.createNodeWithProperties
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setLabel
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setNodeProperty
import org.neo4j.cypher.internal.logical.plans.Apply
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.AssertSameNode
import org.neo4j.cypher.internal.logical.plans.Merge
import org.neo4j.cypher.internal.logical.plans.NodeUniqueIndexSeek
import org.neo4j.cypher.internal.logical.plans.RollUpApply
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.cypher.internal.util.test_helpers.Extractors.SetExtractor

class MergeNodePlanningIntegrationTest extends CypherFunSuite with LogicalPlanningIntegrationTestSupport with AstConstructionTestSupport {
  test("should plan single merge node") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MERGE (a)").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .merge(nodes = Seq(createNode("a")))
      .allNodeScan("a")
      .build()
  }

  test("should plan single merge node from a label scan") {
    val cfg = plannerBuilder()
      .setAllNodesCardinality(100)
      .setLabelCardinality("X", 30)
      .build()

    val plan = cfg.plan("MERGE (a:X)").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .merge(nodes = Seq(createNode("a", "X")))
      .nodeByLabelScan("a", "X")
      .build()
  }

  test("should plan single merge node with properties") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MERGE (a {prop: 42})").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .merge(nodes = Seq(createNodeWithProperties("a", Seq.empty, "{prop: 42}")))
      .filter("a.prop = 42")
      .allNodeScan("a")
      .build()
  }

  test("should plan create followed by merge") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("CREATE (a) MERGE (b)").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .apply()
      .|.merge(nodes = Seq(createNode("b")))
      .|.allNodeScan("b")
      .create(createNode("a"))
      .argument()
      .build()
  }

  test("should plan merge followed by create") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MERGE(a) CREATE (b)").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .create(createNode("b"))
      .eager()
      .merge(nodes = Seq(createNode("a")))
      .allNodeScan("a")
      .build()
  }

  test("should use AssertSameNode when multiple unique indexes match") {
    val planner = plannerBuilder()
      .setAllNodesCardinality(10)
      .setLabelCardinality("X", 5)
      .setLabelCardinality("Y", 5)
      .addNodeIndex("X", Seq("prop"), 1.0, 0.1, isUnique = true)
      .addNodeIndex("Y", Seq("prop"), 1.0, 0.1, isUnique = true)
      .build()

    val plan = planner.plan("MERGE (a:X:Y {prop: 42})").stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .emptyResult()
      .merge(Seq(createNodeWithProperties("a", Seq("X", "Y"), "{prop: 42}")), Seq(), Seq(), Seq())
      .assertSameNode("a")
      .|.nodeIndexOperator("a:Y(prop = 42)", unique = true)
      .nodeIndexOperator("a:X(prop = 42)", unique = true)
      .build()
    )
  }

  test("should use AssertSameNode when multiple unique indexes match, after a MATCH clause") {
    val planner = plannerBuilder()
      .setAllNodesCardinality(10)
      .setLabelCardinality("X", 5)
      .setLabelCardinality("Y", 5)
      .setLabelCardinality("Z", 5)
      .addNodeIndex("X", Seq("prop"), 1.0, 0.1, isUnique = true)
      .addNodeIndex("Y", Seq("prop"), 1.0, 0.1, isUnique = true)
      .build()

    val plan = planner.plan("MATCH (n:Z) MERGE (a:X:Y {prop: n.prop})").stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .emptyResult()
      .apply()
      .|.merge(Seq(createNodeWithProperties("a", Seq("X", "Y"), "{prop: cacheNFromStore[n.prop]}")), Seq(), Seq(), Seq())
      .|.assertSameNode("a")
      .|.|.nodeIndexOperator("a:Y(prop = ???)", argumentIds = Set("n"), paramExpr = Some(cachedNodePropFromStore("n", "prop")), unique = true)
      .|.nodeIndexOperator("a:X(prop = ???)", argumentIds = Set("n"), paramExpr = Some(cachedNodePropFromStore("n", "prop")), unique = true)
      .nodeByLabelScan("n", "Z")
      .build()
    )
  }

  test("should not use AssertSameNode when one unique index matches") {
    val planner = plannerBuilder()
      .setAllNodesCardinality(10)
      .setLabelCardinality("X", 5)
      .setLabelCardinality("Y", 5)
      .addNodeIndex("X", Seq("prop"), 1.0, 0.1, isUnique = true)
      .build()

    val plan = planner.plan("MERGE (a:X:Y {prop: 42})").stripProduceResults

    plan should equal(planner.subPlanBuilder()
      .emptyResult()
      .merge(Seq(createNodeWithProperties("a", Seq("X", "Y"), "{prop: 42}")), Seq(), Seq(), Seq())
      .filter("a:Y")
      .nodeIndexOperator("a:X(prop = 42)", unique = true)
      .build()
    )
  }

  test("should use AssertSameNode with PatternComprehension") {
    val query =
      """
        |MERGE (n:X:Y {prop: reduce(sum=0, x IN [(a)-->(b) | b.age] | sum + x)})
        |RETURN n
      """.stripMargin

    val planner = plannerBuilder()
      .setAllNodesCardinality(10)
      .setLabelCardinality("X", 5)
      .setLabelCardinality("Y", 5)
      .setAllRelationshipsCardinality(10)
      .addNodeIndex("X", Seq("prop"), 1.0, 0.1, isUnique = true)
      .addNodeIndex("Y", Seq("prop"), 1.0, 0.1, isUnique = true)
      .build()

    val plan = planner.plan(query).stripProduceResults

    plan should beLike {
      case Merge(
      AssertSameNode("n",
      Apply(
      RollUpApply(Argument(SetExtractor()), _/* <- This is the subQuery */, collectionName1, _),
      NodeUniqueIndexSeek("n", _, _, _, SetExtractor(argumentName1), _, _), _
      ),
      Apply(
      RollUpApply(Argument(SetExtractor()), _/* <- This is the subQuery */, collectionName2, _),
      NodeUniqueIndexSeek("n", _, _, _, SetExtractor(argumentName2), _, _), _
      ))
      , _, _, _, _, _) if collectionName1 == argumentName1 && collectionName2 == argumentName2 => ()
    }
  }

  test("should plan merge node with on create and on match ") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MERGE (a) ON CREATE SET a.prop = 1 ON MATCH SET a:L").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .merge(
        nodes = Seq(createNode("a")),
        onMatch = Seq(setLabel("a", "L")),
        onCreate = Seq(setNodeProperty("a", "prop", "1")))
      .allNodeScan("a")
      .build()
  }

}
