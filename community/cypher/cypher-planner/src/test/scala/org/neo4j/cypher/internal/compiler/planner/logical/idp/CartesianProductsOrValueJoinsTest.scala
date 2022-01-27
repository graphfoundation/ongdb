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
package org.neo4j.cypher.internal.compiler.planner.logical.idp

import org.neo4j.cypher.internal.compiler.ExecutionModel.Batched
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.LabelToken
import org.neo4j.cypher.internal.expressions.NODE_TYPE
import org.neo4j.cypher.internal.expressions.PropertyKeyToken
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.RegularSinglePlannerQuery
import org.neo4j.cypher.internal.ir.Selections
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.ir.ordering.RequiredOrderCandidate
import org.neo4j.cypher.internal.logical.plans.AllNodesScan
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.DoNotGetValue
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.IndexedProperty
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.NodeIndexScan
import org.neo4j.cypher.internal.logical.plans.NodeLogicalLeafPlan
import org.neo4j.cypher.internal.logical.plans.Selection
import org.neo4j.cypher.internal.logical.plans.ValueHashJoin
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.PropertyKeyId
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.graphdb.schema.IndexType

class CartesianProductsOrValueJoinsTest extends CypherFunSuite with LogicalPlanningTestSupport2 {
  private val planA = allNodesScan("a")
  private val planB = allNodesScan("b")
  private val planC = allNodesScan("c")

  private def setPlanningAttributes(qg: QueryGraph, plan: LogicalPlan, cardinality: Double, planningAttributes: PlanningAttributes): Unit = {
    val solved = RegularSinglePlannerQuery(queryGraph = qg)
    planningAttributes.solveds.set(plan.id, solved)
    planningAttributes.cardinalities.set(plan.id, cardinality)
    planningAttributes.providedOrders.set(plan.id, ProvidedOrder.empty)
  }

  private def allNodesScan(n: String, planningAttributes: PlanningAttributes = PlanningAttributes.newAttributes): LogicalPlan = {
    val plan = AllNodesScan(n, Set.empty)
    setPlanningAttributes(QueryGraph(patternNodes = Set(n)), plan, 0.0, planningAttributes)
    plan
  }

  private def nodeIndexScan(n: String, label: String, cardinality: Double, planningAttributes: PlanningAttributes = PlanningAttributes.newAttributes): LogicalPlan = {
    val plan = NodeIndexScan(n, LabelToken(label, LabelId(0)), Seq(IndexedProperty(PropertyKeyToken("prop", PropertyKeyId(0)), DoNotGetValue, NODE_TYPE)), Set.empty, IndexOrderAscending, IndexType.BTREE)
    setPlanningAttributes(QueryGraph(patternNodes = Set(n)), plan, cardinality, planningAttributes)
    plan
  }

  private def nodeByLabelScan(n: String, label: String, cardinality: Double, planningAttributes: PlanningAttributes = PlanningAttributes.newAttributes): LogicalPlan = {
    val plan = NodeByLabelScan(n, LabelName(label)(pos), Set.empty, IndexOrderNone)
    setPlanningAttributes(QueryGraph(patternNodes = Set(n)), plan, cardinality, planningAttributes)
    plan
  }

  test("should plan cartesian product between 2 pattern nodes") {
    val expectedPlans = List(planA, planB).permutations.map { l =>
      val (a, b) = (l.head, l(1))
      CartesianProduct(
        a,
        b
      )
    }.toSeq

    testThis(
      graph = QueryGraph(patternNodes = Set("a", "b")),
      input = (planningAttributes: PlanningAttributes) => Set(
        PlannedComponent(QueryGraph(patternNodes = Set("a")), BestResults(allNodesScan("a", planningAttributes), None)),
        PlannedComponent(QueryGraph(patternNodes = Set("b")), BestResults(allNodesScan("b", planningAttributes), None))),
      expectedPlans = expectedPlans)
  }

  test("should plan cartesian product between 3 pattern nodes") {
    testThis(
      graph = QueryGraph(patternNodes = Set("a", "b", "c")),
      input = (planningAttributes: PlanningAttributes) => Set(
        PlannedComponent(QueryGraph(patternNodes = Set("a")), BestResults(allNodesScan("a", planningAttributes), None)),
        PlannedComponent(QueryGraph(patternNodes = Set("b")), BestResults(allNodesScan("b", planningAttributes), None)),
        PlannedComponent(QueryGraph(patternNodes = Set("c")), BestResults(allNodesScan("c", planningAttributes), None))),
      expectedPlans = List(planA, planB, planC).permutations.map { l =>
        val (a, b, c) = (l.head, l(1), l(2))
        CartesianProduct(
          b,
          CartesianProduct(
            a,
            c
          )
        )
      }.toSeq)
  }

  test("should plan cartesian product between lots of pattern nodes") {
    val chars = 'a' to 'z'
    testThis(
      graph = QueryGraph(patternNodes = Set("a", "b", "c")),
      input = (planningAttributes: PlanningAttributes) => (chars map { x =>
        PlannedComponent(QueryGraph(patternNodes = Set(x.toString)), BestResults(allNodesScan(x.toString, planningAttributes), None))
      }).toSet,
      assertion = (x: LogicalPlan) => {
        val leaves = x.leaves
        leaves.toSet should equal((chars map { x => allNodesScan(x.toString) }).toSet)
        leaves.size should equal(chars.size)
      }
    )
  }

  test("should plan cartesian product between lots of pattern nodes where one node ordered") {
    val nodesWithCardinality = (0 until 3).map(i => (s"n$i", Batched.default.bigBatchSize * (3 - i))).toSet
    val orderedNode = "n3"
    val graph = QueryGraph()

    new given {
      qg = graph
    }.withLogicalPlanningContext { (cfg, context) =>
      val interestingOrder = InterestingOrderConfig(InterestingOrder.required(RequiredOrderCandidate.asc(varFor(orderedNode))))
      val kit = context.config.toKit(interestingOrder, context)
      val nodeIndexScanPlan = nodeIndexScan(orderedNode, "MANY", 10000.0, context.planningAttributes)

      val bestSortedPlanComponent = PlannedComponent(
        QueryGraph(patternNodes = Set(orderedNode)),
        BestResults(nodeByLabelScan(orderedNode, "MANY", 10000.0,
          context.planningAttributes),
          Some(nodeIndexScanPlan)
        ))
      val bestPlanComponents = nodesWithCardinality
        .map { case (n, c) => nodeByLabelScan(n, "FEW", c, context.planningAttributes) }
        .map(plan => PlannedComponent(QueryGraph(patternNodes = plan.availableSymbols), BestResults(plan, None)))
      val plans: Set[PlannedComponent] = bestPlanComponents + bestSortedPlanComponent

      val result = cartesianProductsOrValueJoins.planLotsOfCartesianProducts(plans, cfg.qg, interestingOrder, context, kit, considerSelections = false)

      // The cost of label scans is n2 < n1 < n0 < n3. Thus, this is the order we expect in the CartesianProducts.
      result.plan.bestResult.findAllByClass[NodeByLabelScan].map(_.idName) shouldEqual Seq("n2", "n1", "n0", "n3")

      // n3 needs to be on left, so that its sort order is kept. The rest should still be sorted by cost.
      result.plan.bestResultFulfillingReq.get.findAllByClass[NodeLogicalLeafPlan].map(_.idName) shouldEqual Seq("n3", "n2", "n1", "n0")
    }
  }

  test("should plan hash join between 2 pattern nodes") {
    testThis(
      graph = QueryGraph(
        patternNodes = Set("a", "b"),
        selections = Selections.from(equals(prop("a", "id"), prop("b", "id")))),
      input = (planningAttributes: PlanningAttributes) =>  Set(
        PlannedComponent(QueryGraph(patternNodes = Set("a")), BestResults(allNodesScan("a", planningAttributes), None)),
        PlannedComponent(QueryGraph(patternNodes = Set("b")), BestResults(allNodesScan("b", planningAttributes), None))),
      expectedPlans =
        List((planA, "a"), (planB, "b")).permutations.map { l =>
          val ((a, aName), (b, bName)) = (l.head, l(1))
          ValueHashJoin(a, b, equals(prop(aName, "id"), prop(bName, "id")))
        }.toSeq)
  }

  test("should plan hash joins between 3 pattern nodes") {
    val eq1 = equals(prop("b", "id"), prop("a", "id"))
    val eq2 = equals(prop("b", "id"), prop("c", "id"))
    val eq3 = equals(prop("a", "id"), prop("c", "id"))

    testThis(
      graph = QueryGraph(
        patternNodes = Set("a", "b", "c"),
        selections = Selections.from(Seq(eq1, eq2, eq3))),
      input = (planningAttributes: PlanningAttributes) =>  Set(
        PlannedComponent(QueryGraph(patternNodes = Set("a")), BestResults(allNodesScan("a", planningAttributes), None)),
        PlannedComponent(QueryGraph(patternNodes = Set("b")), BestResults(allNodesScan("b", planningAttributes), None)),
        PlannedComponent(QueryGraph(patternNodes = Set("c")), BestResults(allNodesScan("c", planningAttributes), None))),
      expectedPlans = for {
        List((xPlan, xProp), (yPlan, yProp), (zPlan, zProp)) <- List((planA, prop("a", "id")), (planB, prop("b", "id")), (planC, prop("c", "id"))).permutations.toSeq
        xyEq <- List(equals(xProp, yProp), equals(yProp, xProp))
        yzEq = equals(yProp, zProp)
        xzEq = equals(xProp, zProp)
        allEqs = Set(xyEq, yzEq, xzEq)
        if Set(eq1, eq2, eq3).forall(eq => allEqs(eq) || allEqs(eq.switchSides))
        } yield Selection(
          Seq(xyEq),
          ValueHashJoin(
            xPlan,
            ValueHashJoin(yPlan, zPlan, yzEq),
            xzEq
          )
        )
    )
  }

  test("should recognize value joins") {
    // given WHERE x.id = z.id
    val lhs = prop("x", "id")
    val rhs = prop("z", "id")
    val equalityComparison = equals(lhs, rhs)

    // when
    val result = cartesianProductsOrValueJoins.joinPredicateCandidates(Seq(equalityComparison))

    // then
    result should equal(Set(equalityComparison))
  }

  test("if one side is a literal, it's not a value join") {
    // given WHERE x.id = 42
    val equalityComparison = propEquality("x","id", 42)

    // when
    val result = cartesianProductsOrValueJoins.joinPredicateCandidates(Seq(equalityComparison))

    // then
    result should be(empty)
  }

  test("if both lhs and rhs come from the same variable, it's not a value join") {
    // given WHERE x.id1 = x.id2
    val lhs = prop("x", "id1")
    val rhs = prop("x", "id2")
    val equalityComparison = equals(lhs, rhs)

    // when
    val result = cartesianProductsOrValueJoins.joinPredicateCandidates(Seq(equalityComparison))

    // then
    result should be(empty)
  }

  test("combination of predicates is not a problem") {
    // given WHERE x.id1 = z.id AND x.id1 = x.id2 AND x.id2 = 42
    val x_id1 = prop("x", "id1")
    val x_id2 = prop("x", "id2")
    val z_id = prop("z", "id")
    val lit = literalInt(42)

    val pred1 = equals(x_id1, x_id2)
    val pred2 = equals(x_id1, z_id)
    val pred3 = equals(x_id2, lit)

    // when
    val result = cartesianProductsOrValueJoins.joinPredicateCandidates(Seq(pred1, pred2, pred3))

    // then
    result should be(Set(pred2))
  }

  test("find predicates that depend on two different qgs is possible") {
    // given WHERE n.prop CONTAINS x.prop
    val nProp = prop("n", "prop")
    val xProp = prop("x", "prop")

    val predicate1 = contains(nProp, xProp) -> Array("n", "x")
    val predicate2 = propEquality("n", "prop", 42) -> Array("n")

    val idsFromLeft = Set("n")
    val idsFromRight = Set("x")

    // when
    val result = cartesianProductsOrValueJoins.predicatesDependendingOnBothSides(Array(predicate1, predicate2), idsFromLeft, idsFromRight)

    // then
    result should be(List(predicate1._1))
  }

  private def testThis(graph: QueryGraph, input: PlanningAttributes => Set[PlannedComponent], assertion: LogicalPlan => Unit): Unit = {
    new given {
      qg = graph
      cardinality = mapCardinality {
        case RegularSinglePlannerQuery(queryGraph, _, _, _, _) if queryGraph.patternNodes == Set("a") => 1000.0
        case RegularSinglePlannerQuery(queryGraph, _, _, _, _) if queryGraph.patternNodes == Set("b") => 2000.0
        case RegularSinglePlannerQuery(queryGraph, _, _, _, _) if queryGraph.patternNodes == Set("c") => 3000.0
        case _ => 100.0
      }
      addTypeToSemanticTable(varFor("a"), CTNode)
      addTypeToSemanticTable(varFor("b"), CTNode)
      addTypeToSemanticTable(varFor("c"), CTNode)
    }.withLogicalPlanningContext { (cfg, context) =>
      val kit = context.config.toKit(InterestingOrderConfig.empty, context)

      val singleComponents = input(context.planningAttributes)
      val result = cartesianProductsOrValueJoins.connectComponentsAndSolveOptionalMatch(singleComponents, cfg.qg, InterestingOrderConfig.empty, context, kit, SingleComponentPlanner()(mock[IDPQueryGraphSolverMonitor]))

      assertion(result.result)
    }
  }

  private def testThis(graph: QueryGraph, input: PlanningAttributes => Set[PlannedComponent], expectedPlans: Seq[LogicalPlan]): Unit =
    testThis(graph, input, (result: LogicalPlan) => {expectedPlans should contain(result);()})
}
