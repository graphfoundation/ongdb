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
import org.neo4j.cypher.internal.logical.plans.Expand
import org.neo4j.cypher.internal.logical.plans.ExpandAll
import org.neo4j.cypher.internal.logical.plans.ExpandInto
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

import scala.collection.immutable.BitSet
import scala.language.implicitConversions

class ExpandSolverStepTest extends CypherFunSuite with LogicalPlanningTestSupport2 {

  implicit def converter(s: Symbol): String = s.toString()

  private val pattern1 = PatternRelationship("r1", ("a", "b"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
  private val pattern2 = PatternRelationship("r2", ("b", "c"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)

  private val table = IDPTable.empty[LogicalPlan]
  private val qg = mock[QueryGraph]

  test("does not expand based on empty table") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      expandSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx) should be(empty)
    }
  }

  test("expands if an unsolved pattern relationship overlaps once with a single solved plan") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]

    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      table.put(register(pattern1), sorted = false, plan1)

      expandSolverStep(qg)(registry, register(pattern1, pattern2), table, ctx).toSet should equal(Set(
        Expand(plan1, "b", SemanticDirection.OUTGOING, Seq.empty, "c", "r2", ExpandAll)
      ))
    }
  }

  test("expands if an unsolved pattern relationships overlaps twice with a single solved plan") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]

    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      table.put(register(pattern1), sorted = false, plan1)  // a - [r1] - b

      val patternX = PatternRelationship("r2", ("a", "b"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength) // a - [r2] -> b

      expandSolverStep(qg)(registry, register(pattern1, patternX), table, ctx).toSet should equal(Set(
        Expand(plan1, "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r2", ExpandInto),
        Expand(plan1, "b", SemanticDirection.INCOMING, Seq.empty, "a", "r2", ExpandInto)
      ))
    }
  }

  test("does not expand if an unsolved pattern relationship does not overlap with a solved plan") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]
    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))
      table.put(register(pattern1), sorted = false, plan1)

      val patternX = PatternRelationship("r2", ("x", "y"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)

      expandSolverStep(qg)(registry, register(pattern1, patternX), table, ctx).toSet should be(empty)
    }

  }

  test("expands if an unsolved pattern relationship overlaps with multiple solved plans") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]

    new given().withLogicalPlanningContext { (cfg, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b", "c", "r2", "d")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b", "c", "d")))
      table.put(register(pattern1, pattern2), sorted = false, plan1)

      val pattern3 = PatternRelationship("r3", ("b", "c"), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)

      expandSolverStep(qg)(registry, register(pattern1, pattern2, pattern3), table, ctx).toSet should equal(Set(
        Expand(plan1, "b", SemanticDirection.OUTGOING, Seq.empty, "c", "r3", ExpandInto),
        Expand(plan1, "c", SemanticDirection.INCOMING, Seq.empty, "b", "r3", ExpandInto)
      ))
    }
  }

  test("does not expand if goal is entirely compacted") {
    implicit val registry: DefaultIdRegistry[PatternRelationship] = IdRegistry[PatternRelationship]

    new given().withLogicalPlanningContext { (_, ctx) =>
      val plan1 = fakeLogicalPlanFor(ctx.planningAttributes, "a", "r1", "b")
      ctx.planningAttributes.solveds.set(plan1.id, RegularSinglePlannerQuery(QueryGraph.empty.addPatternNodes("a", "b")))

      val compactedPattern1 = Goal(BitSet(registry.compact(register(pattern1).bitSet)))
      val compactedPattern2 = Goal(BitSet(registry.compact(register(pattern2).bitSet)))

      table.put(compactedPattern1, sorted = false, plan1)

      expandSolverStep(qg)(registry, Goal(compactedPattern1.bitSet ++ compactedPattern2.bitSet), table, ctx).toSet should be(empty)
    }
  }


  def register[X](patRels: X*)(implicit registry: IdRegistry[X]): Goal = Goal(registry.registerAll(patRels))
}
