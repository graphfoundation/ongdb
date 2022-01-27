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
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.RegularSinglePlannerQuery
import org.neo4j.cypher.internal.ir.SimplePatternLength
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeHashJoin
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

import scala.collection.immutable.BitSet
import scala.language.implicitConversions

class JoinSolverStepTest extends CypherFunSuite with LogicalPlanningTestSupport2 {

  implicit def converter(s: Symbol): String = s.toString()

  val pattern1 = PatternRelationship("r1", ("a", "b"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
  val pattern2 = PatternRelationship("r2", ("b", "c"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)

  val table = IDPTable.empty[LogicalPlan]

  test("does not join based on empty table") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c")
      joinSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx) should be(empty)
    }
  }

  test("joins plans that solve a single pattern relationship") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]

    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes, "b", "r2", "c")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("b", "c")))

      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c")

      table.put(register(pattern1), sorted = false, plan1)
      table.put(register(pattern2), sorted = false, plan2)

      joinSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx).toSet should equal(Set(
        NodeHashJoin(Set("b"), plan1, plan2),
        NodeHashJoin(Set("b"), plan2, plan1)
      ))
    }
  }

  test("can produce a join for a single pattern relationship") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes,"b")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("b")))

      val qg = QueryGraph.empty.addPatternNodes("a", "b")

      table.put(register(pattern1), sorted = false, plan1)
      table.put(register(pattern2), sorted = false, plan2)

      joinSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx).toSet should equal(Set(
        NodeHashJoin(Set("b"), plan1, plan2),
        NodeHashJoin(Set("b"), plan2, plan1)
      ))
    }
  }

  test("does not join plans that do not overlap") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes,"a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes,"c", "r2", "d")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("c", "d")))

      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c", "d")

      table.put(register(pattern1), sorted = false, plan1)
      table.put(register(pattern2), sorted = false, plan2)

      joinSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx) should be(empty)
    }
  }

  test("does join plans where available nodes are subset of available symbols") {
    implicit val registry = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b", "c") // those will become available symbols
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("b"))) // those will become available nodes
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes,"b", "c")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("b")))
      // overlapping symbols plan1& plan2 => (b,c)
      // overlapping nodes   plan1&plan2  => (b)

      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c")

      table.put(register(pattern1), sorted = false, plan1)
      table.put(register(pattern2), sorted = false, plan2)

      joinSolverStep(qg, IGNORE_EXPAND_SOLUTIONS_FOR_TEST = true)(registry, register(pattern1, pattern2), table, ctx).toSet should equal(Set(
        NodeHashJoin(Set("b"), plan1, plan2),
        NodeHashJoin(Set("b"), plan2, plan1)
      ))
    }
  }

  test("does not join plans that overlap on non-nodes") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]

    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes,"a", "r1", "b", "x")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes,"c", "r2", "d", "x")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("c", "d")))

      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c", "d")

      table.put(register(pattern1), sorted = false, plan1)
      table.put(register(pattern2), sorted = false, plan2)

      joinSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx) should be(empty)
    }
  }

  test("does not join plans that overlap on nodes that are arguments") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes,"a", "r1", "b", "x")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b", 'x).addArgumentIds(Seq('x))))
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes,"c", "r2", "d", "x")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("c", "d", 'x).addArgumentIds(Seq('x))))

      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c", "d").addArgumentIds(Seq('x))

      table.put(register(pattern1), sorted = false, plan1)
      table.put(register(pattern2), sorted = false, plan2)

      joinSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx) should be(empty)
    }
  }

  test("does join plans that overlap on arguments if all of the goal is compacted") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (_, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b", "c") // symbols
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("b").addArgumentIds(Seq("b")))) // nodes
      val plan2 = fakeLogicalPlanFor(ctx.planningAttributes,"b", "c")
      ctx.planningAttributes.solveds.set(plan2.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("b").addArgumentIds(Seq("b"))))

      val qg = QueryGraph.empty.addPatternNodes("a", "b", "c").addArgumentIds(Seq("b"))

      val id1: Goal = register(pattern1)
      val id2: Goal = register(pattern2)

      // Compact goals
      val compactedId1 = Goal(BitSet(registry.compact(id1.bitSet)))
      val compactedId2 = Goal(BitSet(registry.compact(id2.bitSet)))
      table.removeAllTracesOf(id1)

      // Table is not completely compacted
      table.put(id2, sorted = false, plan2)
      table.put(compactedId1, sorted = false, plan1)
      table.put(compactedId2, sorted = false, plan2)

      // Goal is completely compacted - should result in expandStillPossible == false
      joinSolverStep(qg)(registry, Goal(compactedId1.bitSet ++ compactedId2.bitSet), table, ctx).toSet should equal(Set(
        NodeHashJoin(Set("b"), plan1, plan2),
        NodeHashJoin(Set("b"), plan2, plan1)
      ))
    }
  }

  def register[X](patRels: X*)(implicit registry: IdRegistry[X]): Goal = Goal(registry.registerAll(patRels))
}
