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

import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.ir.Predicate
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.Selections
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ValueHashJoin
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class ValueHashJoinComponentConnectorTest extends CypherFunSuite with LogicalPlanningTestSupport2 {

  private def register[X](registry: IdRegistry[X], elements: X*): Goal = Goal(registry.registerAll(elements))

  test("produces value hash join of two components connected by property equality") {
    val table = IDPTable.empty[LogicalPlan]
    val registry: DefaultIdRegistry[QueryGraph] = IdRegistry[QueryGraph]

    val joinPred = equals(prop("n", "prop"), prop("m", "prop"))
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val order = InterestingOrderConfig.empty
      val kit = ctx.config.toKit(order, ctx)
      val nQg = QueryGraph(patternNodes = Set("n"))
      val mQg = QueryGraph(patternNodes = Set("m"))
      val fullQg = (nQg ++ mQg).withSelections(Selections(Set(Predicate(Set("n", "m"), joinPred))))

      val nPlan = fakeLogicalPlanFor(ctx.planningAttributes, "n")
      val mPlan = fakeLogicalPlanFor(ctx.planningAttributes, "m")
      table.put(register(registry, nQg), sorted = false, nPlan)
      table.put(register(registry, mQg), sorted = false, mPlan)
      val goal = register(registry, nQg, mQg)

      val step = ValueHashJoinComponentConnector.solverStep(GoalBitAllocation(2, 0, Seq.empty), fullQg, order, kit, ctx)
      val plans = step(registry, goal, table, ctx).toSeq
      plans should contain theSameElementsAs (Seq(
        ValueHashJoin(nPlan, mPlan, joinPred),
        ValueHashJoin(mPlan, nPlan, joinPred.switchSides),
      ))
      // We should be able to call step twice and get the same result
      step(registry, goal, table, ctx).toSeq should contain theSameElementsAs plans
    }
  }

  test("produces value hash join of three components") {
    val table = IDPTable.empty[LogicalPlan]
    val registry: DefaultIdRegistry[QueryGraph] = IdRegistry[QueryGraph]

    val joinPred1 = equals(prop("n", "prop"), prop("m", "prop"))
    val joinPred2 = equals(prop("m", "prop"), prop("o", "prop"))
    val joinPred3 = equals(prop("n", "prop"), prop("o", "prop"))
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val order = InterestingOrderConfig.empty
      val kit = ctx.config.toKit(order, ctx)
      val nQg = QueryGraph(patternNodes = Set("n"))
      val mQg = QueryGraph(patternNodes = Set("m"))
      val oQg = QueryGraph(patternNodes = Set("o"))
      val fullQg = (nQg ++ mQg ++ oQg).withSelections(Selections(Set(
        Predicate(Set("n", "m"), joinPred1),
        Predicate(Set("m", "o"), joinPred2),
        Predicate(Set("n", "o"), joinPred3),
      )))

      val nPlan = fakeLogicalPlanFor(ctx.planningAttributes, "n")
      val mPlan = fakeLogicalPlanFor(ctx.planningAttributes, "m")
      val oPlan = fakeLogicalPlanFor(ctx.planningAttributes, "o")
      val nmPlan = fakeLogicalPlanFor(ctx.planningAttributes, "n", "m")
      val moPlan = fakeLogicalPlanFor(ctx.planningAttributes, "m", "o")
      val noPlan = fakeLogicalPlanFor(ctx.planningAttributes, "n", "o")
      table.put(register(registry, nQg), sorted = false, nPlan)
      table.put(register(registry, mQg), sorted = false, mPlan)
      table.put(register(registry, oQg), sorted = false, oPlan)
      table.put(register(registry, nQg, mQg), sorted = false, nmPlan)
      table.put(register(registry, mQg, oQg), sorted = false, moPlan)
      table.put(register(registry, nQg, oQg), sorted = false, noPlan)
      val goal = register(registry, nQg, mQg, oQg)

      val step = ValueHashJoinComponentConnector.solverStep(GoalBitAllocation(3, 0, Seq.empty), fullQg, order, kit, ctx)
      val plans = step(registry, goal, table, ctx).toSeq
      plans should contain theSameElementsAs (Seq(
        ValueHashJoin(nPlan, moPlan, joinPred1),
        ValueHashJoin(moPlan, nPlan, joinPred1.switchSides),
        ValueHashJoin(nPlan, moPlan, joinPred3),
        ValueHashJoin(moPlan, nPlan, joinPred3.switchSides),

        ValueHashJoin(oPlan, nmPlan, joinPred2.switchSides),
        ValueHashJoin(nmPlan, oPlan, joinPred2),
        ValueHashJoin(oPlan, nmPlan, joinPred3.switchSides),
        ValueHashJoin(nmPlan, oPlan, joinPred3),

        ValueHashJoin(mPlan, noPlan, joinPred1.switchSides),
        ValueHashJoin(noPlan, mPlan, joinPred1),
        ValueHashJoin(mPlan, noPlan, joinPred2),
        ValueHashJoin(noPlan, mPlan, joinPred2.switchSides),
      ))
    }
  }

  test("produces no value hash join of two components that are not connected") {
    val table = IDPTable.empty[LogicalPlan]
    val registry: DefaultIdRegistry[QueryGraph] = IdRegistry[QueryGraph]

    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val order = InterestingOrderConfig.empty
      val kit = ctx.config.toKit(order, ctx)
      val nQg = QueryGraph(patternNodes = Set("n"))
      val mQg = QueryGraph(patternNodes = Set("m"))
      val fullQg = (nQg ++ mQg)

      val nPlan = fakeLogicalPlanFor(ctx.planningAttributes, "n")
      val mPlan = fakeLogicalPlanFor(ctx.planningAttributes, "m")
      table.put(register(registry, nQg), sorted = false, nPlan)
      table.put(register(registry, mQg), sorted = false, mPlan)
      val goal = register(registry, nQg, mQg)

      val step = ValueHashJoinComponentConnector.solverStep(GoalBitAllocation(2, 0, Seq.empty), fullQg, order, kit, ctx)
      val plans = step(registry, goal, table, ctx).toSeq
      plans shouldBe empty
    }
  }
}
