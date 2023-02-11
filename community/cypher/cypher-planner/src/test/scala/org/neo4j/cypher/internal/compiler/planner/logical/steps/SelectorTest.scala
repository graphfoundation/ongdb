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

import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.SelectorHeuristic
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.PatternExpression
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.RelationshipsPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.functions.Exists
import org.neo4j.cypher.internal.ir.Predicate
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.RegularSinglePlannerQuery
import org.neo4j.cypher.internal.ir.Selections
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.NodeHashJoin
import org.neo4j.cypher.internal.logical.plans.Selection
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class SelectorTest extends CypherFunSuite with LogicalPlanningTestSupport {
  private val planContext = newMockedPlanContext()

  test("when a predicate that isn't already solved is solvable it should be applied") {
    // Given
    val context = newMockedLogicalPlanningContext(planContext)

    val predicate = equals(literalInt(10), literalInt(10))
    val inner = newMockedLogicalPlan(context.planningAttributes, "x")
    val selections = Selections(Set(Predicate(inner.availableSymbols, predicate)))

    val qg = QueryGraph(selections = selections)
    val selector = Selector(pickBestPlanUsingHintsAndCost, selectCovered)

    // When
    val result = selector(inner, qg, InterestingOrderConfig.empty, context)

    // Then
    result should equal(Selection(Seq(predicate), inner))
  }

  test("should not try to solve predicates with unmet dependencies") {
    // Given
    val context = newMockedLogicalPlanningContext(planContext)

    val predicate = propEquality(variable = "n", propKey = "prop", intValue = 42)

    val selections = Selections.from(predicate)
    val inner = newMockedLogicalPlanWithProjections(context.planningAttributes, "x")

    val qg = QueryGraph(selections = selections)
    val selector = Selector(pickBestPlanUsingHintsAndCost, selectCovered)

    // When
    val result = selector(inner, qg, InterestingOrderConfig.empty, context)

    // Then
    result should equal(inner)
  }

  test("when two predicates not already solved are solvable, they should be applied") {
    // Given
    val context = newMockedLogicalPlanningContext(planContext)

    val predicate1 = equals(literalInt(10), literalInt(10))
    val predicate2 = equals(literalInt(30), literalInt(10))

    val selections = Selections.from(Seq(predicate1, predicate2))
    val inner = newMockedLogicalPlanWithProjections(context.planningAttributes, "x")

    val qg = QueryGraph(selections = selections)
    val selector = Selector(pickBestPlanUsingHintsAndCost, selectCovered)

    // When
    val result = selector(inner, qg, InterestingOrderConfig.empty, context)

    // Then
    result should equal(Selection(Seq(predicate1, predicate2), inner))
  }

  test("when two predicates not already solved are solvable, should not greedily pick the first but cost compare the alternative orders") {
    // Given
    val context = newMockedLogicalPlanningContext(planContext)

    val eqs = equals(prop("x", "prop"), literalInt(10))
    val hl = hasLabels("x", "X")

    val selections = Selections.from(Seq(eqs, hl))
    val inner = newMockedLogicalPlanWithProjections(context.planningAttributes, "x")

    val qg = QueryGraph(patternNodes = Set("x"), selections = selections)
    val selector = Selector(pickBestPlanUsingHintsAndCost, selectCovered, selectHasLabelWithJoin)

    val expectedPlan = Selection(Seq(eqs, hl), inner)

    var didVerify = false
    val verifyingContext = context.copy(
      costComparisonListener = new CostComparisonListener {
        override def report[X](projector: X => LogicalPlan,
                               input: Iterable[X],
                               inputOrdering: Ordering[X],
                               context: LogicalPlanningContext,
                               resolved: => String,
                               resolvedPerPlan: LogicalPlan => String,
                               heuristic: SelectorHeuristic): Unit = {
          val plans = input.map(projector).toSet
          plans should equal(Set(
            expectedPlan,
            Selection(Seq(eqs), NodeHashJoin(Set("x"), inner, NodeByLabelScan("x", labelName("X"), Set.empty, IndexOrderNone)))
          ))
          didVerify = true
        }
      }
    )

    // When
    val result = selector(inner, qg, InterestingOrderConfig.empty, verifyingContext)

    // Then
    result should equal(expectedPlan)
    didVerify should be(true)
  }

  test("when a predicate is already solved, it should not be applied again") {
    // Given
    val context = newMockedLogicalPlanningContext(planContext)

    val coveredIds = Set("x")
    val qg = QueryGraph(selections = Selections(Set(Predicate(coveredIds, literalInt(1)))))
    val solved = RegularSinglePlannerQuery(qg)
    val inner = newMockedLogicalPlanWithSolved(context.planningAttributes, idNames = Set("x"), solved = solved)
    val selector = Selector(pickBestPlanUsingHintsAndCost, selectCovered)

    // When
    val result = selector(inner, qg, InterestingOrderConfig.empty, context)

    // Then
    result should equal(inner)
  }

  test("a predicate without all dependencies covered should not be applied ") {
    // Given
    val context = newMockedLogicalPlanningContext(planContext)

    val predicate = mock[Expression]
    val selections = Selections(Set(Predicate(Set("x", "y"), predicate)))
    val inner = newMockedLogicalPlanWithProjections(context.planningAttributes, "x")
    val qg = QueryGraph(selections = selections)
    val selector = Selector(pickBestPlanUsingHintsAndCost, selectCovered)

    // When
    val result = selector(inner, qg, InterestingOrderConfig.empty, context)

    // Then
    result should equal(inner)
  }

  test("should not introduce semi apply for unsolved exclusive pattern predicate when nodes not applicable") {
    // MATCH (a) WHERE (a)-->()
    val relChain = RelationshipChain(
      NodePattern(Some(varFor("a")), Seq(), None, None)_,
      RelationshipPattern(Some(varFor("  UNNAMED1")), Seq.empty[RelTypeName], None, None, SemanticDirection.OUTGOING) _,
      NodePattern(Some(varFor("  UNNAMED2")), Seq(), None, None)_
    )_

    val patternExp = Exists(PatternExpression(RelationshipsPattern(relChain)_)(Set(varFor("a")), "", ""))_

    val predicate = Predicate(Set("a"), patternExp)
    val selections = Selections(Set(predicate))

    val qg = QueryGraph(
      patternNodes = Set("b"),
      selections = selections
    )

    val context = newMockedLogicalPlanningContext(planContext = newMockedPlanContext())

    val bPlan = newMockedLogicalPlan(context.planningAttributes, "b")
    val selector = Selector(pickBestPlanUsingHintsAndCost, SelectPatternPredicates)
    // When
    val result = selector(bPlan, qg, InterestingOrderConfig.empty, context)

    // Then
    result should equal(bPlan)
  }
}
