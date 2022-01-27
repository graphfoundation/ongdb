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

import org.neo4j.cypher.internal.ast.Hint
import org.neo4j.cypher.internal.ast.UsingIndexHint
import org.neo4j.cypher.internal.ast.UsingJoinHint
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.SimplePatternLength
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.Expand
import org.neo4j.cypher.internal.logical.plans.ExpandAll
import org.neo4j.cypher.internal.logical.plans.ExpandInto
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeHashJoin
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Solveds
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class SingleComponentPlannerTest extends CypherFunSuite with LogicalPlanningTestSupport {
  test("plans expands for queries with single pattern rel") {
    // given
    val aNode = "a"
    val bNode = "b"
    val pattern = PatternRelationship("r1", (aNode, bNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(patternRelationships = Set(pattern), patternNodes = Set(aNode, bNode))
    val context = newMockedLogicalPlanningContext(planContext = mock[PlanContext])
    val aPlan = newMockedLogicalPlan(context.planningAttributes,  "a")
    val bPlan = newMockedLogicalPlan(context.planningAttributes, "b")

    // when
    val logicalPlans = SingleComponentPlanner.planSinglePattern(qg, pattern, Set(aPlan, bPlan), context)

    // then
    val plan1 = Expand(aPlan, "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandAll)
    val plan2 = Expand(bPlan, "b", SemanticDirection.INCOMING, Seq.empty, "a", "r1", ExpandAll)
    val plan3 = Expand(CartesianProduct(aPlan, bPlan), "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandInto)
    assertPlansMatch(Set(plan1, plan2, plan3), logicalPlans.toSet)
  }

  test("does not plan Expand on top of relationship leaf plan for queries with more than one pattern rel") {
    // given
    val aNode = "a"
    val bNode = "b"
    val cNode = "c"
    val rel1 = PatternRelationship("r1", (aNode, bNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val rel2 = PatternRelationship("r2", (bNode, cNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(patternRelationships = Set(rel1, rel2), patternNodes = Set(aNode, bNode, cNode))
    val context = newMockedLogicalPlanningContext(planContext = mock[PlanContext])
    val r1Plan = newMockedLogicalPlanWithPatterns(context.planningAttributes, Set(rel1.name, rel1.left, rel1.right), Seq(rel1))
    val r2Plan = newMockedLogicalPlanWithPatterns(context.planningAttributes, Set(rel2.name, rel2.left, rel2.right), Seq(rel2))

    // when
    val logicalPlans = SingleComponentPlanner.planSinglePattern(qg, rel1, Set(r1Plan, r2Plan), context)

    // then
    assertPlansMatch(Set(r1Plan), logicalPlans.toSet)
  }

  test("plans hashjoins and cartesian product for queries with single pattern rel and multiple index hints") {
    // given
    val aNode = "a"
    val bNode = "b"
    val pattern = PatternRelationship("r1", (aNode, bNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val hint1 = UsingIndexHint(varFor("a"), labelOrRelTypeName("X"), Seq(PropertyKeyName("p")(pos)))(pos)
    val hint2 = UsingIndexHint(varFor("b"), labelOrRelTypeName("X"), Seq(PropertyKeyName("p")(pos)))(pos)
    val qg = QueryGraph(patternRelationships = Set(pattern), patternNodes = Set(aNode, bNode), hints = Set(hint1, hint2))
    val context = newMockedLogicalPlanningContext(planContext = mock[PlanContext])
    val aPlan = newMockedLogicalPlan(context.planningAttributes, "a")
    val bPlan = newMockedLogicalPlan(context.planningAttributes, "b")

    // when
    val logicalPlans = SingleComponentPlanner.planSinglePattern(qg, pattern, Set(aPlan, bPlan), context)

    // then

    val plan1 = Expand(aPlan, "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandAll)
    val plan2 = Expand(bPlan, "b", SemanticDirection.INCOMING, Seq.empty, "a", "r1", ExpandAll)
    val plan3a = NodeHashJoin(Set(bNode), plan1, bPlan)
    val plan3b = NodeHashJoin(Set(bNode), bPlan, plan1)
    val plan4a = NodeHashJoin(Set(aNode), plan2, aPlan)
    val plan4b = NodeHashJoin(Set(aNode), aPlan, plan2)
    val plan5 = Expand(CartesianProduct(aPlan, bPlan), "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandInto)
    assertPlansMatch(logicalPlans.toSet, Set(plan1, plan2, plan3a, plan3b, plan4a, plan4b, plan5))
  }

  test("plans hashjoins and cartesian product for queries with single pattern rel and a join hint") {
    // given
    val aNode = "a"
    val bNode = "b"
    val pattern = PatternRelationship("r1", (aNode, bNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val hint = UsingJoinHint(Seq(varFor("a")))(pos)
    val qg = QueryGraph(patternRelationships = Set(pattern), patternNodes = Set(aNode, bNode), hints = Set(hint))
    val context = newMockedLogicalPlanningContext(planContext = mock[PlanContext])
    val aPlan = newMockedLogicalPlan(context.planningAttributes, "a")
    val bPlan = newMockedLogicalPlan(context.planningAttributes, "b")

    // when
    val logicalPlans = SingleComponentPlanner.planSinglePattern(qg, pattern, Set(aPlan, bPlan), context)

    // then
    val plan1 = Expand(aPlan, "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandAll)
    val plan2 = Expand(bPlan, "b", SemanticDirection.INCOMING, Seq.empty, "a", "r1", ExpandAll)
    val plan3a = NodeHashJoin(Set(bNode), plan1, bPlan)
    val plan3b = NodeHashJoin(Set(bNode), bPlan, plan1)
    val plan4a = NodeHashJoin(Set(aNode), plan2, aPlan)
    val plan4b = NodeHashJoin(Set(aNode), aPlan, plan2)
    val plan5 = Expand(CartesianProduct(aPlan, bPlan), "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandInto)
    assertPlansMatch(logicalPlans.toSet, Set(plan1, plan2, plan3a, plan3b, plan4a, plan4b, plan5))

    assertPlanSolvesHints(logicalPlans.filter {
      case join: NodeHashJoin if join.nodes == Set(aNode) => true
      case _ => false
    }, context.planningAttributes.solveds, hint)
  }

  test("does not plan hashjoins and cartesian product if start and end node are the same") {
    // given
    val aNode = "a"
    val pattern = PatternRelationship("r1", (aNode, aNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val hint = UsingJoinHint(Seq(varFor("a")))(pos)
    val qg = QueryGraph(patternRelationships = Set(pattern), patternNodes = Set(aNode, aNode), hints = Set(hint))
    val context = newMockedLogicalPlanningContext(planContext = mock[PlanContext])
    val aPlan = newMockedLogicalPlan(context.planningAttributes, "a")

    // when
    val logicalPlans = SingleComponentPlanner.planSinglePattern(qg, pattern, Set(aPlan), context)

    // then
    val plan1 = Expand(aPlan, "a", SemanticDirection.OUTGOING, Seq.empty, "a", "r1", ExpandInto)
    assertPlansMatch(logicalPlans.toSet, Set(plan1))
  }

  test("plans hashjoins and cartesian product for queries with single pattern rel and a join hint on the end node") {
    // given
    val aNode = "a"
    val bNode = "b"
    val pattern = PatternRelationship("r1", (aNode, bNode), SemanticDirection.OUTGOING, Seq.empty, SimplePatternLength)
    val hint = UsingJoinHint(Seq(varFor("b")))(pos)
    val qg = QueryGraph(patternRelationships = Set(pattern), patternNodes = Set(aNode, bNode), hints = Set(hint))
    val context = newMockedLogicalPlanningContext(planContext = mock[PlanContext])
    val aPlan = newMockedLogicalPlan(context.planningAttributes, "a")
    val bPlan = newMockedLogicalPlan(context.planningAttributes, "b")

    // when
    val logicalPlans = SingleComponentPlanner.planSinglePattern(qg, pattern, Set(aPlan, bPlan), context)

    // then
    val plan1 = Expand(aPlan, "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandAll)
    val plan2 = Expand(bPlan, "b", SemanticDirection.INCOMING, Seq.empty, "a", "r1", ExpandAll)
    val plan3a = NodeHashJoin(Set(bNode), plan1, bPlan)
    val plan3b = NodeHashJoin(Set(bNode), bPlan, plan1)
    val plan4a = NodeHashJoin(Set(aNode), plan2, aPlan)
    val plan4b = NodeHashJoin(Set(aNode), aPlan, plan2)
    val plan5 = Expand(CartesianProduct(aPlan, bPlan), "a", SemanticDirection.OUTGOING, Seq.empty, "b", "r1", ExpandInto)
    assertPlansMatch(logicalPlans.toSet, Set(plan1, plan2, plan3a, plan3b, plan4a, plan4b, plan5))

    assertPlanSolvesHints(logicalPlans.filter {
      case join: NodeHashJoin if join.nodes == Set(bNode) => true
      case _ => false
    }, context.planningAttributes.solveds, hint)
  }

  private def assertPlansMatch(expected: Set[LogicalPlan], actualPlans: Set[LogicalPlan]) {
    actualPlans should equal(expected)
  }

  private def assertPlanSolvesHints(plans: Iterable[LogicalPlan], solveds: Solveds, hints: Hint*) {
    for (h <- hints;
         p <- plans) {
      solveds.get(p.id).asSinglePlannerQuery.lastQueryGraph.hints should contain(h)
    }
  }
}
