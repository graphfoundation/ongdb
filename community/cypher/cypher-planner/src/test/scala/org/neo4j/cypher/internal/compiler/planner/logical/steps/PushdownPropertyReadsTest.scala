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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.compiler.helpers.LogicalPlanBuilder
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanConstructionTestSupport
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanTestOps
import org.neo4j.cypher.internal.compiler.planner.logical.PlanMatchHelp
import org.neo4j.cypher.internal.logical.plans.Ascending
import org.neo4j.cypher.internal.logical.plans.CanGetValue
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.util.attribution.Attributes
import org.neo4j.cypher.internal.util.symbols.CTInteger
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class PushdownPropertyReadsTest
  extends CypherFunSuite
  with PlanMatchHelp
  with LogicalPlanConstructionTestSupport
  with LogicalPlanTestOps {

  test("should pushdown read in projection") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(50)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .allNodeScan("n").withEffectiveCardinality(5)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x")
        .expandAll("(n)-->(m)")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read in projection, but not beyond optimum") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(50)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x")
        .expandAll("(n)-->(m)")
        .cacheProperties("n.prop")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read on top of projection") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .filter("n.prop IS NOT NULL").withEffectiveCardinality(10)
      .expand("(n)--(o)").withEffectiveCardinality(100)
      .expand("(n)--(m)").withEffectiveCardinality(5)
      .projection("n.foo AS x").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(100)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .filter("n.prop IS NOT NULL")
        .expand("(n)--(o)")
        .cacheProperties("n.prop")
        .expand("(n)--(m)")
        .projection("n.foo AS x")
        .allNodeScan("n")
        .build()
  }

  test("should not pushdown read on top of projection if property is available from projection") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .filter("n.prop IS NOT NULL").withEffectiveCardinality(10)
      .expand("(n)--(o)").withEffectiveCardinality(100)
      .expand("(n)--(m)").withEffectiveCardinality(5)
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(100)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read on top of projection if property is available from before projection") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .filter("n.prop IS NOT NULL").withEffectiveCardinality(10)
      .expand("(n)--(o)").withEffectiveCardinality(100)
      .expand("(n)--(m)").withEffectiveCardinality(5)
      .projection("n.foo AS x").withEffectiveCardinality(100)
      .nodeIndexOperator("n:N(prop)", getValue = _ => CanGetValue).withEffectiveCardinality(100)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read on top of projection if property is available from before projection, but entity is renamed in projection") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .filter("x.prop IS NOT NULL").withEffectiveCardinality(10)
      .expand("(n)--(o)").withEffectiveCardinality(100)
      .expand("(n)--(m)").withEffectiveCardinality(5)
      .projection("n AS x").withEffectiveCardinality(100)
      .nodeIndexOperator("n:N(prop)", getValue = _ => CanGetValue).withEffectiveCardinality(100)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown past a leaf") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .nodeIndexOperator("n:N(prop > 0)").withEffectiveCardinality(1)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .nodeIndexOperator("n:N(prop > 0)")
        .build()
  }

  test("should pushdown from RHS to LHS of apply") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .apply().withEffectiveCardinality(50)
      .|.filter("m.prop > 10").withEffectiveCardinality(50)
      .|.allNodeScan("n", "m").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .apply()
        .|.filter("m.prop > 10")
        .|.allNodeScan("n", "m")
        .cacheProperties("m.prop")
        .allNodeScan("m")
        .build()
  }

  test("should not pushdown from the RHS leaf to LHS of apply if cardinalities are the same") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .apply().withEffectiveCardinality(50)
      .|.nodeIndexOperator("n:N(prop > ???)", paramExpr = Some(prop("m", "prop")), argumentIds = Set("m")).withEffectiveCardinality(50)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .apply()
        .|.nodeIndexOperator("n:N(prop > ???)", paramExpr = Some(prop("m", "prop")), argumentIds = Set("m"))
        .allNodeScan("m")
        .build()
  }

  test("should pushdown from the RHS leaf to LHS of apply if beneficial") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .apply().withEffectiveCardinality(55)
      .|.nodeIndexOperator("n:N(prop > ???)", paramExpr = Some(prop("m", "prop")), argumentIds = Set("m")).withEffectiveCardinality(55)
      .expandAll("(m)-->(q)").withEffectiveCardinality(50)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .apply()
        .|.nodeIndexOperator("n:N(prop > ???)", paramExpr = Some(prop("m", "prop")), argumentIds = Set("m"))
        .expandAll("(m)-->(q)")
        .cacheProperties("m.prop")
        .allNodeScan("m")
        .build()
  }

  test("should pushdown past an apply into LHS") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("m.prop > 10").withEffectiveCardinality(50)
      .apply().withEffectiveCardinality(100)
      .|.allNodeScan("n", "m").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .filter("m.prop > 10")
        .apply()
        .|.allNodeScan("n", "m")
        .cacheProperties("m.prop")
        .allNodeScan("m")
        .build()
  }

  test("should pushdown past an apply into RHS") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("m.prop > 10").withEffectiveCardinality(50)
      .apply().withEffectiveCardinality(20)
      .|.expandAll("(m)-->(q)").withEffectiveCardinality(20)
      .|.filter("n.prop > 10").withEffectiveCardinality(2)
      .|.allNodeScan("n", "m").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .filter("m.prop > 10")
        .apply()
        .|.expandAll("(m)-->(q)")
        .|.cacheProperties("m.prop")
        .|.filter("n.prop > 10")
        .|.allNodeScan("n", "m")
        .allNodeScan("m")
        .build()
  }

  test("should pushdown from top to top of Apply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(10)
      .expandAll("(n)-->(x)").withEffectiveCardinality(25)
      .apply().withEffectiveCardinality(20)
      .|.optionalExpandAll("(n)-->(m)").withEffectiveCardinality(100)
      .|.argument().withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(35)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10")
      .expandAll("(n)-->(x)")
      .cacheProperties("n.prop")
      .apply()
      .|.optionalExpandAll("(n)-->(m)")
      .|.argument()
      .allNodeScan("n")
      .build()
  }

  test("should not pushdown from RHS to LHS of cartesian product") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .apply().withEffectiveCardinality(50)
      .|.cartesianProduct().withEffectiveCardinality(50)
      .|.|.filter("n.prop > 10").withEffectiveCardinality(5)
      .|.|.argument("n").withEffectiveCardinality(10)
      .|.expandAll("(n)-->(m)").withEffectiveCardinality(1)
      .|.argument("n").withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown from top to RHS SemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(10)
      .semiApply().withEffectiveCardinality(10)
      .|.optionalExpandAll("(n)-->(m)").withEffectiveCardinality(1)
      .|.argument().withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown from top to LHS of SemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(10)
      .semiApply().withEffectiveCardinality(15)
      .|.optionalExpandAll("(n)-->(m)").withEffectiveCardinality(1)
      .|.argument().withEffectiveCardinality(10)
      .expandAll("(n)-->(x)").withEffectiveCardinality(20)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10")
      .semiApply()
      .|.optionalExpandAll("(n)-->(m)")
      .|.argument()
      .expandAll("(n)-->(x)")
      .cacheProperties("n.prop")
      .allNodeScan("n")
      .build()
  }

  test("should pushdown from top to top of SemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(10)
      .expandAll("(n)-->(x)").withEffectiveCardinality(25)
      .semiApply().withEffectiveCardinality(20)
      .|.optionalExpandAll("(n)-->(m)").withEffectiveCardinality(1)
      .|.argument().withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(35)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10")
      .expandAll("(n)-->(x)")
      .cacheProperties("n.prop")
      .semiApply()
      .|.optionalExpandAll("(n)-->(m)")
      .|.argument()
      .allNodeScan("n")
      .build()
  }

  test("should pushdown in LHS of SemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .semiApply().withEffectiveCardinality(10)
      .|.argument().withEffectiveCardinality(10)
      .filter("n.prop > 10").withEffectiveCardinality(99)
      .expandAll("(n)-->(x)").withEffectiveCardinality(20)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .semiApply()
      .|.argument()
      .filter("n.prop > 10")
      .expandAll("(n)-->(x)")
      .cacheProperties("n.prop")
      .allNodeScan("n")
      .build()
  }

  test("should not pushdown from top to RHS AntiSemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(10)
      .antiSemiApply().withEffectiveCardinality(10)
      .|.optionalExpandAll("(n)-[:INFURIATES]->(m)").withEffectiveCardinality(1)
      .|.argument().withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown in RHS of SemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .semiApply().withEffectiveCardinality(10)
      .|.filter("n.prop > 10").withEffectiveCardinality(99)
      .|.optionalExpandAll("(n)-->(m)").withEffectiveCardinality(100)
      .|.argument().withEffectiveCardinality(10)
      .expandAll("(n)-->(x)").withEffectiveCardinality(20)
      .allNodeScan("n").withEffectiveCardinality(100)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .semiApply()
      .|.filter("n.prop > 10")
      .|.optionalExpandAll("(n)-->(m)")
      .|.cacheProperties("n.prop")
      .|.argument()
      .expandAll("(n)-->(x)")
      .allNodeScan("n")
      .build()
  }

  test("should pushdown from RHS to LHS of SemiApply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .semiApply().withEffectiveCardinality(50)
      .|.filter("m.prop > 10").withEffectiveCardinality(50)
      .|.allNodeScan("n", "m").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .semiApply()
      .|.filter("m.prop > 10")
      .|.allNodeScan("n", "m")
      .cacheProperties("m.prop")
      .allNodeScan("m")
      .build()
  }

  test("should pushdown past a cartesian product into LHS") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("m.prop > 10").withEffectiveCardinality(50)
      .cartesianProduct().withEffectiveCardinality(100)
      .|.allNodeScan("n").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .filter("m.prop > 10")
        .cartesianProduct()
        .|.allNodeScan("n")
        .cacheProperties("m.prop")
        .allNodeScan("m")
        .build()
  }

  test("should pushdown past a cartesian product into RHS") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(50)
      .cartesianProduct().withEffectiveCardinality(20)
      .|.expandAll("(n)-->(q)").withEffectiveCardinality(20)
      .|.filter("1 <> 2").withEffectiveCardinality(2)
      .|.allNodeScan("n").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .filter("n.prop > 10")
        .cartesianProduct()
        .|.expandAll("(n)-->(q)")
        .|.cacheProperties("n.prop")
        .|.filter("1 <> 2")
        .|.allNodeScan("n")
        .allNodeScan("m")
        .build()
  }

  test("should not pushdown from RHS to LHS of join") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .apply().withEffectiveCardinality(50)
      .|.nodeHashJoin("n").withEffectiveCardinality(50)
      .|.|.filter("n.prop > 10").withEffectiveCardinality(5)
      .|.|.argument("n").withEffectiveCardinality(10)
      .|.expandAll("(n)-->(m)").withEffectiveCardinality(1)
      .|.argument("n").withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown from both RHS and LHS of join into LHS of apply") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .apply().withEffectiveCardinality(5)
      .|.nodeHashJoin("n").withEffectiveCardinality(5)
      .|.|.filter("n.prop > 10").withEffectiveCardinality(5)
      .|.|.argument("n").withEffectiveCardinality(100)
      .|.filter("n.foo > 10 AND n.prop < 20").withEffectiveCardinality(1)
      .|.argument("n").withEffectiveCardinality(100)
      .expandAll("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(1)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .apply()
      .|.nodeHashJoin("n")
      .|.|.filter("n.prop > 10")
      .|.|.argument("n")
      .|.filter("n.foo > 10 AND n.prop < 20")
      .|.argument("n")
      .expandAll("(n)-->(m)")
      .cacheProperties("n.prop", "n.foo")
      .allNodeScan("n")
      .build()
  }

  test("should pushdown past a join into LHS and RHS") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .projection("n.prop AS x", "m.prop AS y").withEffectiveCardinality(100)
      .nodeHashJoin("n").withEffectiveCardinality(100)
      .|.expandAll("(m)-->(n)").withEffectiveCardinality(50)
      .|.allNodeScan("m").withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .projection("n.prop AS x", "m.prop AS y")
        .nodeHashJoin("n")
        .|.expandAll("(m)-->(n)")
        .|.cacheProperties("m.prop")
        .|.allNodeScan("m")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should not pushdown past a join into LHS if already cached in RHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .nodeHashJoin("n").withEffectiveCardinality(100)
      .|.filter("n.prop <> 0").withEffectiveCardinality(50)
      .|.expandAll("(m)-->(n)").withEffectiveCardinality(50)
      .|.allNodeScan("m").withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown past a join into RHS if already cached in LHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .nodeHashJoin("n").withEffectiveCardinality(100)
      .|.expandAll("(m)-->(n)").withEffectiveCardinality(50)
      .|.allNodeScan("m").withEffectiveCardinality(10)
      .filter("n.prop <> 0").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(100)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if already cached") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expandAll("(m)-->(q)").withEffectiveCardinality(100)
      .expandAll("(n)-->(m)").withEffectiveCardinality(1)
      .filter("n.prop <> 0").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(100)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown to aggregation even if already cached before aggregation") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .projection("m.prop AS x").withEffectiveCardinality(100)
      .expandAll("(m)-->(q)").withEffectiveCardinality(100)
      .aggregation(Seq("m AS m"), Seq("count(*) AS c")).withEffectiveCardinality(1)
      .filter("m.prop < 5000").withEffectiveCardinality(250)
      .expandAll("(m)-->(r)").withEffectiveCardinality(500)
      .allNodeScan("m").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .projection("m.prop AS x")
      .expandAll("(m)-->(q)")
      .cacheProperties("m.prop")
      .aggregation(Seq("m AS m"), Seq("count(*) AS c"))
      .filter("m.prop < 5000")
      .expandAll("(m)-->(r)")
      .cacheProperties("m.prop")
      .allNodeScan("m")
      .build()
  }

  test("should pushdown read in filter") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 0").withEffectiveCardinality(1)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .allNodeScan("n").withEffectiveCardinality(5)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .filter("n.prop > 0")
        .expandAll("(n)-->(m)")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read in projection with multiple properties") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x", "n.foo AS y", "m.bar AS z").withEffectiveCardinality(50)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x", "n.foo AS y", "m.bar AS z")
        .expandAll("(n)-->(m)")
        .cacheProperties("n.prop", "n.foo")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read in projection with multiple properties to different points") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x", "n.foo AS y", "m.bar AS z").withEffectiveCardinality(100)
      .projection("n.prop AS x0").withEffectiveCardinality(100)
      .expandAll("(m)-->(q)").withEffectiveCardinality(100)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x", "n.foo AS y", "m.bar AS z")
        .projection("n.prop AS x0")
        .expandAll("(m)-->(q)")
        .cacheProperties("m.bar")
        .expandAll("(n)-->(m)")
        .cacheProperties("n.prop", "n.foo")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read in aggregation") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .aggregation(Seq("n.prop AS x"), Seq("count(*) AS c")).withEffectiveCardinality(20)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .aggregation(Seq("n.prop AS x"), Seq("count(*) AS c"))
        .expandAll("(n)-->(m)")
        .cacheProperties("n.prop")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should not pushdown read past aggregation") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expandAll("(n)-->(q)").withEffectiveCardinality(100)
      .aggregation(Seq("n AS n"), Seq("count(*) AS c")).withEffectiveCardinality(10)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x")
        .expandAll("(n)-->(q)")
        .cacheProperties("n.prop")
        .aggregation(Seq("n AS n"), Seq("count(*) AS c"))
        .expandAll("(n)-->(m)")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should not pushdown read past ordered aggregation") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expandAll("(n)-->(q)").withEffectiveCardinality(100)
      .orderedAggregation(Seq("n AS n"), Seq("count(*) AS c"), Seq("n")).withEffectiveCardinality(10)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x")
        .expandAll("(n)-->(q)")
        .cacheProperties("n.prop")
        .orderedAggregation(Seq("n AS n"), Seq("count(*) AS c"), Seq("n"))
        .expandAll("(n)-->(m)")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should ignore expression variable property reads (for now)") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("list")
      .projection("[x IN [n] | x.prop] AS list").withEffectiveCardinality(5).newVar("x", CTNode)
      .allNodeScan("n").withEffectiveCardinality(5)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown from top to top of Union") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expandAll("(n)--(m)").withEffectiveCardinality(100)
      .union().withEffectiveCardinality(80)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(70)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x")
      .expandAll("(n)--(m)")
      .cacheProperties("n.prop")
      .union()
      .|.nodeByLabelScan("n", "A", IndexOrderNone)
      .nodeByLabelScan("n", "B", IndexOrderNone)
      .build()
  }

  test("should not pushdown read past union into LHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .union().withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(90)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown from LHS to LHS of Union") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .union().withEffectiveCardinality(170)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(70)
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expandAll("(n)--(m)").withEffectiveCardinality(100)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("x")
      .union()
      .|.nodeByLabelScan("n", "A", IndexOrderNone)
      .projection("n.prop AS x")
      .expandAll("(n)--(m)")
      .cacheProperties("n.prop")
      .nodeByLabelScan("n", "B", IndexOrderNone)
      .build()
  }

  test("should not pushdown read past union into RHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .union().withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(10)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown from RHS to RHS of Union") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .union().withEffectiveCardinality(170)
      .|.projection("n.prop AS x").withEffectiveCardinality(100)
      .|.expandAll("(n)--(m)").withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(10)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(70)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("x")
      .union()
      .|.projection("n.prop AS x")
      .|.expandAll("(n)--(m)")
      .|.cacheProperties("n.prop")
      .|.nodeByLabelScan("n", "A", IndexOrderNone)
      .nodeByLabelScan("n", "B", IndexOrderNone)
      .build()
  }

  test("should not pushdown read past orderedUnion into LHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .orderedUnion(Seq(Ascending("n"))).withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderAscending).withEffectiveCardinality(90)
      .nodeByLabelScan("n", "B", IndexOrderAscending).withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.cardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read past orderedUnion into RHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .orderedUnion(Seq(Ascending("n"))).withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderAscending).withEffectiveCardinality(10)
      .nodeByLabelScan("n", "B", IndexOrderAscending).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.cardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read past transactionForeach into LHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .transactionForeach().withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(90)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read past transactionForeach into RHS") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .transactionForeach().withEffectiveCardinality(100)
      .|.nodeByLabelScan("n", "A", IndexOrderNone).withEffectiveCardinality(10)
      .nodeByLabelScan("n", "B", IndexOrderNone).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown from RHS to LHS of transactionForeach") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .transactionForeach().withEffectiveCardinality(50)
      .|.filter("m.prop > 10").withEffectiveCardinality(50)
      .|.allNodeScan("n", "m").withEffectiveCardinality(100)
      .allNodeScan("m").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown inside LHS of transactionForeach") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .transactionForeach().withEffectiveCardinality(100)
      .|.filter("n.prop > 10").withEffectiveCardinality(100)
      .|.allNodeScan("o", "n", "m").withEffectiveCardinality(500)
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .transactionForeach()
        .|.filter("n.prop > 10")
        .|.allNodeScan("o", "n", "m")
        .projection("n.prop AS x")
        .expand("(n)-->(m)")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown inside RHS of transactionForeach") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .transactionForeach().withEffectiveCardinality(100)
      .|.filter("n.prop > 10").withEffectiveCardinality(100)
      .|.expand("(n)-->(m)").withEffectiveCardinality(200)
      .|.allNodeScan("n", "o").withEffectiveCardinality(20)
      .allNodeScan("o").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .transactionForeach()
        .|.filter("n.prop > 10")
        .|.expand("(n)-->(m)")
        .|.cacheProperties("n.prop")
        .|.allNodeScan("n", "o")
        .allNodeScan("o")
        .build()
  }

  test("should even pushdown properties inside RHS of transactionForeach that are already read in LHS") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n")
      .transactionForeach().withEffectiveCardinality(100)
      .|.filter("o.prop > 10").withEffectiveCardinality(100)
      .|.expand("(n)-->(m)").withEffectiveCardinality(200)
      .|.allNodeScan("n", "o").withEffectiveCardinality(20)
      .filter("o.prop IS NOT NULL").withEffectiveCardinality(10)
      .allNodeScan("o").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n")
        .transactionForeach()
        .|.filter("o.prop > 10")
        .|.expand("(n)-->(m)")
        .|.cacheProperties("o.prop")
        .|.allNodeScan("n", "o")
        .filter("o.prop IS NOT NULL")
        .allNodeScan("o")
        .build()
  }

  test("should pushdown from top to top of transactionForeach") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10").withEffectiveCardinality(10)
      .expandAll("(n)-->(x)").withEffectiveCardinality(25)
      .transactionForeach().withEffectiveCardinality(20)
      .|.optionalExpandAll("(n)-->(m)").withEffectiveCardinality(1)
      .|.argument().withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(35)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe new LogicalPlanBuilder()
      .produceResults("n")
      .filter("n.prop > 10")
      .expandAll("(n)-->(x)")
      .cacheProperties("n.prop")
      .transactionForeach()
      .|.optionalExpandAll("(n)-->(m)")
      .|.argument()
      .allNodeScan("n")
      .build()
  }

  test("should not pushdown read if property is available from node index") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(235)
      .nodeIndexOperator("n:L(prop > 100)", getValue = _ => CanGetValue).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read if property is available from relationship index") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "o")
      .filter("r.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .expand("(n)-->(o)").withEffectiveCardinality(235)
      .relationshipIndexOperator("(n)-[r:R(prop > 100)]->(m)", getValue = _ => CanGetValue).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should pushdown read through renaming projection") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("mysteryNode.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .projection("n AS mysteryNode").withEffectiveCardinality(235)
      .expand("(n)-->(m)").withEffectiveCardinality(235)
      .allNodeScan("n").withEffectiveCardinality(90)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n", "m")
        .filter("mysteryNode.prop == 'NOT-IMPORTANT'")
        .projection("n AS mysteryNode")
        .expand("(n)-->(m)")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read through 2 renaming projections") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("unknownNode.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .projection("mysteryNode AS unknownNode").withEffectiveCardinality(235)
      .projection("n AS mysteryNode").withEffectiveCardinality(235)
      .expand("(n)-->(m)").withEffectiveCardinality(235)
      .allNodeScan("n").withEffectiveCardinality(90)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n", "m")
        .filter("unknownNode.prop == 'NOT-IMPORTANT'")
        .projection("mysteryNode AS unknownNode")
        .projection("n AS mysteryNode")
        .expand("(n)-->(m)")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown read through unrelated renaming projection") {
    val plan = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .projection("m AS mysteryNode").withEffectiveCardinality(235)
      .expand("(n)-->(m)").withEffectiveCardinality(235)
      .allNodeScan("n").withEffectiveCardinality(90)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("n", "m")
        .filter("n.prop == 'NOT-IMPORTANT'")
        .projection("m AS mysteryNode")
        .expand("(n)-->(m)")
        .cacheProperties("n.prop")
        .allNodeScan("n")
        .build()
  }

  test("should not pushdown read if property is available, but renamed") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("mysteryNode.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .projection("n AS mysteryNode").withEffectiveCardinality(235)
      .expand("(n)-->(m)").withEffectiveCardinality(235)
      .nodeIndexOperator("n:L(prop > 100)", getValue = _ => CanGetValue).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown read if property is available from relationship index, but renamed") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("mysteryRel.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .projection("r AS mysteryRel").withEffectiveCardinality(235)
      .expand("(n)-->(0)").withEffectiveCardinality(235)
      .relationshipIndexOperator("(n)-[r:R(prop > 100)]->(m)", getValue = _ => CanGetValue).withEffectiveCardinality(90)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should ignore unrelated renaming") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .projection("x AS mysteryVariable").withEffectiveCardinality(5)
      .projection("1 AS x").withEffectiveCardinality(5).newVar("x", CTInteger)
      .allNodeScan("n").withEffectiveCardinality(5)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setProperty") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setProperty("n", "prop", "42").withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setNodeProperty") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setNodeProperty("n", "prop", "42").withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setRelationshipProperty") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setRelationshipProperty("n", "prop", "42").withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setProperties") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.p1 == 'NOT-IMPORTANT' && n.p2 == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setProperties("n", ("p1", "42"), ("p2", "42")).withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setNodeProperties") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.p1 == 'NOT-IMPORTANT' && n.p2 == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setNodeProperties("n", ("p1", "42"), ("p2", "42")).withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setRelationshipProperties") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.p1 == 'NOT-IMPORTANT' && n.p2 == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setProperties("n", ("p1", "42"), ("p2", "42")).withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setNodePropertiesFromMap") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setNodePropertiesFromMap("n", "{prop: 42}", removeOtherProps = false).withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if setRelationshipPropertiesFromMap") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("r.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setRelationshipPropertiesFromMap("r", "{prop: 42}", removeOtherProps = false).withEffectiveCardinality(100)
      .expand("(m)-->(k)").withEffectiveCardinality(100)
      .expand("(n)-[r]->(m)").withEffectiveCardinality(20)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if property removed by setNodePropertiesFromMap") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setNodePropertiesFromMap("n", "{otherProp: 42}", removeOtherProps = true).withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if property removed by setRelationshipPropertiesFromMap") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("r")
      .filter("r.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setRelationshipPropertiesFromMap("r", "{otherProp: 42}", removeOtherProps = true).withEffectiveCardinality(100)
      .expand("(m)-->(k)").withEffectiveCardinality(100)
      .expand("(n)-[r]->(m)").withEffectiveCardinality(20)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if property setNodePropertiesFromMap with dynamic map") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("n", "m")
      .filter("n.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setNodePropertiesFromMap("n", "m", removeOtherProps = false).withEffectiveCardinality(100)
      .expand("(n)-->(m)").withEffectiveCardinality(100)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should not pushdown if property setRelationshipPropertiesFromMap with dynamic map") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("r")
      .filter("r.prop == 'NOT-IMPORTANT'").withEffectiveCardinality(100)
      .setRelationshipPropertiesFromMap("r", "r2", removeOtherProps = false).withEffectiveCardinality(100)
      .expand("(m)-[r2]->(k)").withEffectiveCardinality(100)
      .expand("(n)-[r]->(m)").withEffectiveCardinality(20)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  test("should ignore setProperty of non-variable when projecting") {
    val planBuilder = new LogicalPlanBuilder()
      .produceResults("aProp", "bProp")
      .projection("a.prop AS aProp", "b.prop AS bProp").withEffectiveCardinality(10)
      .setProperty("CASE WHEN n.age>m.age THEN n ELSE m END", "prop", "42").withEffectiveCardinality(10)
      .expand("(n)-->(m)").withEffectiveCardinality(10)
      .allNodeScan("n").withEffectiveCardinality(10)

    val plan = planBuilder.build()
    val rewritten = PushdownPropertyReads.pushdown(plan, planBuilder.effectiveCardinalities, Attributes(planBuilder.idGen, planBuilder.effectiveCardinalities), planBuilder.getSemanticTable)
    rewritten shouldBe plan
  }

  // This is a defensive measure, since push down property reads are performed after eagerness analysis (which inserts
  // eager operators to guarantee semantic correctness of read-write queries where we have data dependencies between reads and writes within the query).
  // If we move reads past eager boundaries we _may_ end up breaking correctness in edge-cases.
  test("should not pushdown read past eager") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop AS x").withEffectiveCardinality(100)
      .expandAll("(n)-->(q)").withEffectiveCardinality(100)
      .eager().withEffectiveCardinality(10)
      .expandAll("(n)-->(m)").withEffectiveCardinality(50)
      .filter("id(n) <> 0").withEffectiveCardinality(5)
      .allNodeScan("n").withEffectiveCardinality(10)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop AS x")
        .expandAll("(n)-->(q)")
        .cacheProperties("n.prop")
        .eager()
        .expandAll("(n)-->(m)")
        .filter("id(n) <> 0")
        .allNodeScan("n")
        .build()
  }

  test("should pushdown to the highest step if equal cardinality") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("n.prop as x").withEffectiveCardinality(100)
      .expand("(n)-->(q)").withEffectiveCardinality(100)
      .limit(100).withEffectiveCardinality(1)
      .skip(0).withEffectiveCardinality(1)
      .nodeByLabelScan("n", "JustOne").withEffectiveCardinality(1)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("n.prop as x")
        .expand("(n)-->(q)")
        .cacheProperties("n.prop")
        .limit(100)
        .skip(0)
        .nodeByLabelScan("n", "JustOne")
        .build()
  }

  test("should pushdown ignoring negligible amount of cardinality differences") {
    val plan = new LogicalPlanBuilder()
      .produceResults("x")
      .projection("a.prop as x").withEffectiveCardinality(200)
      .expand("(a)-->(c)").withEffectiveCardinality(200)
      .apply().withEffectiveCardinality(1.00000001)
      .|.nodeByLabelScan("b", "B").withEffectiveCardinality(1)
      .nodeByLabelScan("a", "A").withEffectiveCardinality(1)

    val rewritten = PushdownPropertyReads.pushdown(plan.build(), plan.effectiveCardinalities, Attributes(plan.idGen, plan.effectiveCardinalities), plan.getSemanticTable)
    rewritten shouldBe
      new LogicalPlanBuilder()
        .produceResults("x")
        .projection("a.prop as x")
        .expand("(a)-->(c)")
        .cacheProperties("a.prop")
        .apply()
        .|.nodeByLabelScan("b", "B")
        .nodeByLabelScan("a", "A")
        .build()
  }
}
