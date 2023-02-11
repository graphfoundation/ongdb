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

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningIntegrationTestSupport
import org.neo4j.cypher.internal.logical.plans.CacheProperties
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class CachedPropertiesPlanningIntegrationTest extends CypherFunSuite with LogicalPlanningIntegrationTestSupport with AstConstructionTestSupport {

  test("should cache node property on multiple usages") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n) WHERE n.prop1 > 42 RETURN n.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .projection("cacheN[n.prop1] AS `n.prop1`")
      .filter("cacheNFromStore[n.prop1] > 42")
      .allNodeScan("n")
      .build()
  }

  test("should cache node property on multiple usages without return") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n) WHERE n.prop1 > 42 SET n.prop2 = n.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .emptyResult()
      .setNodeProperty("n", "prop2", "cacheN[n.prop1]")
      .filter("cacheNFromStore[n.prop1] > 42")
      .allNodeScan("n")
      .build()
  }

  test("should not rewrite node property if there is only one usage") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n) RETURN n.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .projection("n.prop1 AS `n.prop1`")
      .allNodeScan("n")
      .build()
  }

  test("should not rewrite node property if there is only one usage in selection") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n) WHERE n.prop1 > 42 RETURN n").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .filter("n.prop1 > 42")
      .allNodeScan("n")
      .build()
  }

  test("should cache relationship property on multiple usages") {
    val cfg = plannerBuilder()
      .setAllNodesCardinality(100)
      .setRelationshipCardinality("()-[]-()", 50)
      .build()

    val plan = cfg.plan("MATCH (a)-[r]-(b) WHERE r.prop1 > 42 RETURN r.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .projection("cacheR[r.prop1] AS `r.prop1`")
      .filter("cacheRFromStore[r.prop1] > 42")
      .expandAll("(a)-[r]-(b)")
      .allNodeScan("a")
      .build()
  }

  test("should not rewrite relationship property if there is only one usage") {
    val cfg = plannerBuilder()
      .setAllNodesCardinality(100)
      .setRelationshipCardinality("()-[]-()", 50)
      .build()

    val plan = cfg.plan("MATCH (a)-[r]-(b) RETURN r.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .projection("r.prop1 AS `r.prop1`")
      .expandAll("(a)-[r]-(b)")
      .allNodeScan("a")
      .build()
  }

  test("should cache renamed variable: n AS x") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n) WHERE n.prop1 > 42 WITH n AS x RETURN x.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .projection(Map("x.prop1" -> cachedNodeProp("n", "prop1", "x")))
      .projection("n AS x")
      .filter("cacheNFromStore[n.prop1] > 42")
      .allNodeScan("n")
      .build()
  }

  test("should cache renamed variable: n AS x with predicate in between") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n) WHERE n.prop1 > 42 WITH n AS x WHERE x.prop1 > 42 RETURN x").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .filterExpression(greaterThan(cachedNodeProp("n", "prop1", "x"), literalInt(42)))
      .projection("n AS x")
      .filter("cacheNFromStore[n.prop1] > 42")
      .allNodeScan("n")
      .build()
  }

  test("should cache with byzantine renaming: n AS m, m AS x") {
    val cfg = plannerBuilder().setAllNodesCardinality(100).build()
    val plan = cfg.plan("MATCH (n), (m) WHERE n.prop1 > 42 AND m.prop1 > 42 WITH n AS m, m AS x RETURN m.prop1, x.prop1").stripProduceResults
    plan shouldEqual cfg.subPlanBuilder()
      .projection(Map(
        "m.prop1" -> cachedNodeProp("n", "prop1", "m"),
        "x.prop1" -> cachedNodeProp("m", "prop1", "x")))
      .projection("n AS m", "m AS x")
      .cartesianProduct()
      .|.filter("cacheNFromStore[m.prop1] > 42")
      .|.allNodeScan("m")
      .filter("cacheNFromStore[n.prop1] > 42")
      .allNodeScan("n")
      .build()
  }

  test("should not push down property reads into RHS of apply unnecessarily") {
    val cfg = plannerBuilder()
      .setAllNodesCardinality(1023)
      .setLabelCardinality("N", 12)
      .setLabelCardinality("M", 11)
      .setRelationshipCardinality("(:N)-[]->()", 1000)
      .setRelationshipCardinality("(:N)-[]->(:M)", 2)
      .setRelationshipCardinality("()-[]->(:M)", 2)
      .build()

    val plan = cfg.plan(
      """MATCH (n:N)
        |CALL {
        |  WITH n
        |  MATCH (n)-->(m:M)
        |  CALL {
        |    WITH n
        |    MATCH (n)-->(o:M)
        |    RETURN o
        |  }
        |  RETURN m, o
        |}
        |RETURN m.prop
        |""".stripMargin)

    val cachePropertyPlans = plan.folder.treeCount {
      case _: CacheProperties => true
    }

    withClue(plan) {
      cachePropertyPlans should be(0)
    }
  }

  test("should push down property reads past a LIMIT if work is reduced by the LIMIT") {
    val cfg = plannerBuilder()
      .setAllNodesCardinality(500)
      .setLabelCardinality("N", 500)
      .setRelationshipCardinality("()-[]->()", 1000)
      .setRelationshipCardinality("(:N)-[]->()", 1000)
      .build()

    val plan = cfg.plan(
      """MATCH (n:N)-[rel]->(m)
        |WITH * LIMIT 10
        |RETURN n.prop AS foo
        |""".stripMargin)

    plan shouldEqual cfg.planBuilder()
      .produceResults("foo")
      .projection("cacheN[n.prop] AS foo") // 10 rows
      .limit(10) // 10 rows
      .expandAll("(n)-[rel]->(m)") // 1000 rows, effective 10
      .cacheProperties("cacheNFromStore[n.prop]")
      .nodeByLabelScan("n", "N") // 500 rows, effective 5
      .build()
  }
}
