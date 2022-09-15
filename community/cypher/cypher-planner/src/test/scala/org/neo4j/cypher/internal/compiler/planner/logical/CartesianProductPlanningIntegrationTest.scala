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

import org.neo4j.cypher.internal.compiler.ExecutionModel.Batched
import org.neo4j.cypher.internal.compiler.ExecutionModel.Volcano
import org.neo4j.cypher.internal.compiler.planner.BeLikeMatcher.beLike
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningIntegrationTestSupport
import org.neo4j.cypher.internal.compiler.planner.StatisticsBackedLogicalPlanningConfigurationBuilder
import org.neo4j.cypher.internal.compiler.planner.logical.idp.cartesianProductsOrValueJoins.COMPONENT_THRESHOLD_FOR_CARTESIAN_PRODUCT
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.NodeIndexScan
import org.neo4j.cypher.internal.planner.spi.IndexOrderCapability
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

/**
 * This class tests only greedy - the idp counterpart is tested in [[ConnectComponentsPlanningIntegrationTest]]
 */
class CartesianProductPlanningIntegrationTest extends CypherFunSuite with LogicalPlanningIntegrationTestSupport {

  override protected def plannerBuilder(): StatisticsBackedLogicalPlanningConfigurationBuilder =
    super.plannerBuilder().enableConnectComponentsPlanner(false)

  test("should build cartesian product with sorted plan left for many disconnected components") {
    val nodes = (0 until COMPONENT_THRESHOLD_FOR_CARTESIAN_PRODUCT).map(i => s"(n$i:Few)").mkString(",")
    val orderedNode = s"n$COMPONENT_THRESHOLD_FOR_CARTESIAN_PRODUCT"

    val cfg = plannerBuilder()
      .setAllNodesCardinality(1500)
      .setLabelCardinality("Few", 2)
      .setLabelCardinality("Many", 1000)
      .addNodeIndex("Many", Seq("prop"), existsSelectivity = 1.0, uniqueSelectivity = 0.1, providesOrder = IndexOrderCapability.BOTH)
      .build()

    val plan = cfg.plan(s"MATCH $nodes, ($orderedNode:Many) WHERE $orderedNode.prop IS NOT NULL RETURN * ORDER BY $orderedNode.prop").stripProduceResults

    // We do not want a Sort
    plan shouldBe a[CartesianProduct]
    // Sorted index should be placed on the left of the cartesian products
    plan.leftmostLeaf should beLike {
      case NodeIndexScan(`orderedNode`, _, _, _, _, _) => ()
    }
  }

  test("should build plans for simple cartesian product") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n), (m) RETURN n, m").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .cartesianProduct()
      .|.allNodeScan("m")
      .allNodeScan("n")
      .build()
  }

  test("should build plans so the overall cost is minimized (lhsCost + lhsCardinality * rhsCost)") {
    val cfg = plannerBuilder()
      .setAllNodesCardinality(1000)
      .setLabelCardinality("Label", 1000 * PlannerDefaults.DEFAULT_PROPERTY_SELECTIVITY.factor) // to get the same cardinality on both sides of cartesian
      .build()

    val plan = cfg.plan("MATCH (n), (m) WHERE n.prop is not null AND m:Label RETURN n, m").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .cartesianProduct()
      .|.nodeByLabelScan("m", "Label")
      .filter("n.prop IS NOT NULL")
      .allNodeScan("n")
      .build()
  }

  test("should plan cartesian product of three plans so the cost is minimized") {
    val builder = plannerBuilder()
      .setAllNodesCardinality(1000)
      .setLabelCardinality("A", 30)
      .setLabelCardinality("B", 20)
      .setLabelCardinality("C", 10)

    val volcano = builder
      .setExecutionModel(Volcano)
      .build()

    val batched = builder
      .setExecutionModel(Batched.default)
      .build()

    val query =
      """MATCH (a:A), (b:B), (c:C)
        |RETURN a, b, c
        |""".stripMargin
    val volcanoPlan = volcano.plan(query)
    val batchedPlan = batched.plan(query)


    // Volcano:
    // A x B = 30 + 30 * 20 = 630
    // A x C = 30 + 30 * 10 = 330
    // B x A = 20 + 20 * 30 = 620
    // B x C = 20 + 20 * 10 = 220
    // C x A = 10 + 10 * 30 = 310
    // C x B = 10 + 10 * 20 = 210 // greedily pick the cheapest here

    // A x (C x B) = 30 + 30 * 210 = 6330
    // (C x B) x A = 210 + 200 * 30 = 6210 // winner

    volcanoPlan shouldEqual volcano.planBuilder()
      .produceResults("a", "b", "c")
      .cartesianProduct()
      .|.nodeByLabelScan("a", "A", IndexOrderNone)
      .cartesianProduct()
      .|.nodeByLabelScan("b", "B", IndexOrderNone)
      .nodeByLabelScan("c", "C", IndexOrderNone)
      .build()

    // Batched:
    // A x B = 30 + 20 = 50
    // A x C = 30 + 10 = 40
    // B x A = 20 + 30 = 50
    // B x C = 20 + 10 = 30 // greedily pick the cheapest here
    // C x A = 10 + 30 = 40
    // C x B = 10 + 20 = 30 // or here

    // A x (BC) = 30 + 30 = 60 // winner
    // (BC) x A = 30 + 30 = 60 // or winner

    batchedPlan should (equal(batched.planBuilder()
      .produceResults("a", "b", "c")
      .cartesianProduct()
      .|.cartesianProduct()
      .|.|.nodeByLabelScan("c", "C")
      .|.nodeByLabelScan("b", "B")
      .nodeByLabelScan("a", "A")
      .build()
    ) or equal(batched.planBuilder()
      .produceResults("a", "b", "c")
      .cartesianProduct()
      .|.cartesianProduct()
      .|.|.nodeByLabelScan("b", "B")
      .|.nodeByLabelScan("c", "C")
      .nodeByLabelScan("a", "A")
      .build()
    ) or equal(batched.planBuilder()
      .produceResults("a", "b", "c")
      .cartesianProduct()
      .|.nodeByLabelScan("a", "A")
      .cartesianProduct()
      .|.nodeByLabelScan("c", "C")
      .nodeByLabelScan("b", "B")
      .build()
    ) or equal(batched.planBuilder()
      .produceResults("a", "b", "c")
      .cartesianProduct()
      .|.nodeByLabelScan("a", "A")
      .cartesianProduct()
      .|.nodeByLabelScan("b", "B")
      .nodeByLabelScan("c", "C")
      .build()
    ))
  }

  test("should plan cartesian product of two plans so the cost is minimized") {
    val builder = plannerBuilder()
      .setAllNodesCardinality(100)
      .setLabelCardinality("A", 30)
      .setLabelCardinality("B", 20)

    val volcano = builder
      .setExecutionModel(Volcano)
      .build()

    val batched = builder
      .setExecutionModel(Batched.default)
      .build()

    val query =
      """MATCH (a:A), (b:B)
        |RETURN a, b
        |""".stripMargin
    val volcanoPlan = volcano.plan(query)
    val batchedPlan = batched.plan(query)

    // Volcano:
    // A x B = 30 + 30 * 20 = 630
    // B x A = 20 + 20 * 30 = 620 // winner

    volcanoPlan shouldEqual volcano.planBuilder()
      .produceResults("a", "b")
      .cartesianProduct()
      .|.nodeByLabelScan("a", "A")
      .nodeByLabelScan("b", "B")
      .build()

    // Batched:
    // A x B = 30 + 20 = 50
    // B x A = 20 + 30 = 50

    batchedPlan should (equal(batched.planBuilder()
      .produceResults("a", "b")
      .cartesianProduct()
      .|.nodeByLabelScan("a", "A")
      .nodeByLabelScan("b", "B")
      .build()
    ) or equal(batched.planBuilder()
      .produceResults("a", "b")
      .cartesianProduct()
      .|.nodeByLabelScan("b", "B")
      .nodeByLabelScan("a", "A")
      .build()
    ))
  }
}
