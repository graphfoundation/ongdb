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

import org.neo4j.cypher.internal.ast.UsingIndexHint
import org.neo4j.cypher.internal.compiler.ExecutionModel
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.steps.LogicalPlanProducer
import org.neo4j.cypher.internal.compiler.planner.logical.steps.devNullListener
import org.neo4j.cypher.internal.compiler.planner.logical.steps.pickBestPlanUsingHintsAndCost
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.ir.SinglePlannerQuery
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.options.CypherDebugOptions
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Solveds
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.CancellationChecker
import org.neo4j.cypher.internal.util.Cost
import org.neo4j.cypher.internal.util.devNullLogger
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class PickBestPlanUsingHintsAndCostTest extends CypherFunSuite with LogicalPlanningTestSupport2 {

  private val GIVEN_FIXED_COST = new given {
    cost = {
      case _ => Cost(100)
    }
  }

  private val hint1: UsingIndexHint = UsingIndexHint(varFor("n"), labelOrRelTypeName("Person"), Seq(PropertyKeyName("name")_))_
  private val hint2: UsingIndexHint = UsingIndexHint(varFor("n"), labelOrRelTypeName("Person"), Seq(PropertyKeyName("age")_))_

  test("picks the right plan by cost, no matter the cardinality") {
    val a = fakeLogicalPlanFor("a")
    val b = fakeLogicalPlanFor("b")

    assertTopPlan(winner = b, newStubbedPlanningAttributes, Seq(a, b))(new given {
      cost = {
        case (p, _, _, _) if p == a => Cost(100)
        case (p, _, _, _) if p == b => Cost(50)
      }
    })
  }

  test("Prefers plans that solves a hint over plan that solves no hint") {
    val solveds = new Solveds
    val a = fakeLogicalPlanFor("a")
    solveds.set(a.id, SinglePlannerQuery.empty.amendQueryGraph(_.addHints(Some(hint1))))
    val b = fakeLogicalPlanFor("a")
    solveds.set(b.id, SinglePlannerQuery.empty)

    assertTopPlan(winner = a, PlanningAttributes(solveds, new StubCardinalities, new StubEffectiveCardinalities, new StubProvidedOrders, new StubLeveragedOrders), Seq(a, b))(GIVEN_FIXED_COST)
  }

  test("Prefers plans that solve more hints") {
    val solveds = new Solveds
    val a = fakeLogicalPlanFor("a")
    solveds.set(a.id, SinglePlannerQuery.empty.amendQueryGraph(_.addHints(Some(hint1))))
    val b = fakeLogicalPlanFor("a")
    solveds.set(b.id, SinglePlannerQuery.empty.amendQueryGraph(_.addHints(Set(hint1, hint2))))

    assertTopPlan(winner = b, PlanningAttributes(solveds, new StubCardinalities, new StubEffectiveCardinalities, new StubProvidedOrders, new StubLeveragedOrders), Seq(a, b))(GIVEN_FIXED_COST)
  }

  test("Prefers plans that solve more hints in tails") {
    val solveds = new Solveds
    val a = fakeLogicalPlanFor("a")
    solveds.set(a.id, SinglePlannerQuery.empty.amendQueryGraph(_.addHints(Some(hint1))))
    val b = fakeLogicalPlanFor("a")
    solveds.set(b.id, SinglePlannerQuery.empty.withTail(SinglePlannerQuery.empty.amendQueryGraph(_.addHints(Set(hint1, hint2)))))

    assertTopPlan(winner = b, PlanningAttributes(solveds, new StubCardinalities, new StubEffectiveCardinalities, new StubProvidedOrders, new StubLeveragedOrders), Seq(a, b))(GIVEN_FIXED_COST)
  }

  test("Orders by heuristic on ties") {
    val a = fakeLogicalPlanFor("a")
    val b = fakeLogicalPlanFor("b")
    val c = fakeLogicalPlanFor("c")
    val d = fakeLogicalPlanFor("d")

    def preferPlanB(p: LogicalPlan): Int = p match {
      case `a` => 3
      case `b` => 4
      case `c` => 1
      case `d` => 2
    }

    assertTopPlan(winner = b, newStubbedPlanningAttributes, Seq(a, b, c, d), preferPlanB)(GIVEN_FIXED_COST)
  }

  test("Orders by hints before heuristic") {
    val a = fakeLogicalPlanFor("a")
    val b = fakeLogicalPlanFor("b")
    val c = fakeLogicalPlanFor("c")
    val d = fakeLogicalPlanFor("d")

    val solveds = new Solveds
    solveds.set(a.id, SinglePlannerQuery.empty.amendQueryGraph(_.addHints(Some(hint1))))
    solveds.set(b.id, SinglePlannerQuery.empty)
    solveds.set(c.id, SinglePlannerQuery.empty)
    solveds.set(d.id, SinglePlannerQuery.empty)

    def preferPlanB(p: LogicalPlan): Int = p match {
      case `a` => 3
      case `b` => 4
      case `c` => 1
      case `d` => 2
    }

    assertTopPlan(winner = a, newStubbedPlanningAttributes.copy(solveds = solveds), Seq(a, b, c, d), preferPlanB)(GIVEN_FIXED_COST)
  }

  test("Orders by cost before heuristic") {
    val a = fakeLogicalPlanFor("a")
    val b = fakeLogicalPlanFor("b")
    val c = fakeLogicalPlanFor("c")
    val d = fakeLogicalPlanFor("d")

    def preferPlanB(p: LogicalPlan): Int = p match {
      case `a` => 3
      case `b` => 4
      case `c` => 1
      case `d` => 2
    }

    assertTopPlan(winner = d, newStubbedPlanningAttributes, Seq(a, b, c, d), preferPlanB)(new given {
      cost = {
        case (`a`, _, _, _) => Cost(100)
        case (`b`, _, _, _) => Cost(100)
        case (`c`, _, _, _) => Cost(100)
        case (`d`, _, _, _) => Cost(99)
      }
    })
  }

  private def assertTopPlan(winner: LogicalPlan, planningAttributes: PlanningAttributes, candidates: Seq[LogicalPlan], heuristic: SelectorHeuristic = SelectorHeuristic.constant)(GIVEN: given): Unit = {
    val environment = LogicalPlanningEnvironment(GIVEN)
    val metrics: Metrics = environment.metricsFactory.newMetrics(GIVEN.planContext, GIVEN.expressionEvaluator, ExecutionModel.default, planningTextIndexesEnabled = false)
    val producer = LogicalPlanProducer(metrics.cardinality, planningAttributes, idGen)
    val context = LogicalPlanningContext(null,
      producer,
      metrics,
      null,
      null,
      predicatesAsUnionMaxSize = cypherCompilerConfig.predicatesAsUnionMaxSize,
      notificationLogger = devNullLogger,
      costComparisonListener = devNullListener,
      planningAttributes = planningAttributes,
      idGen = idGen,
      executionModel = ExecutionModel.default,
      debugOptions = CypherDebugOptions.default,
      anonymousVariableNameGenerator = new AnonymousVariableNameGenerator(),
      cancellationChecker = CancellationChecker.NeverCancelled,
    )
    pickBestPlanUsingHintsAndCost(context)(candidates, heuristic, "").get shouldBe theSameInstanceAs(winner)
    pickBestPlanUsingHintsAndCost(context)(candidates.reverse, heuristic, "").get shouldBe theSameInstanceAs(winner)
  }
}


