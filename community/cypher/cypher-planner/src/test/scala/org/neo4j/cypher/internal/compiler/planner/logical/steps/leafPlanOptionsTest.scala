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

import org.neo4j.cypher.internal.compiler.defaultUpdateStrategy
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.CandidateSelector
import org.neo4j.cypher.internal.compiler.planner.logical.LeafPlanner
import org.neo4j.cypher.internal.compiler.planner.logical.LeafPlannerList
import org.neo4j.cypher.internal.compiler.planner.logical.QueryPlannerConfiguration
import org.neo4j.cypher.internal.compiler.planner.logical.SelectorHeuristic
import org.neo4j.cypher.internal.compiler.planner.logical.idp.BestResults
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.ir.ordering.RequiredOrderCandidate
import org.neo4j.cypher.internal.logical.plans.AllNodesScan
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.Ascending
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.Projection
import org.neo4j.cypher.internal.logical.plans.Sort
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class leafPlanOptionsTest extends CypherFunSuite with LogicalPlanningTestSupport2 {
  private val allNodesScanLeafPlanner: LeafPlanner = (qg, _, context) =>
    qg.patternNodes.map(node => context.logicalPlanProducer.planAllNodesScan(node, Set.empty, context))
  private val labelScanLeafPlanner: LeafPlanner = (qg, _, context) =>
    qg.patternNodes.map(node =>
      context.logicalPlanProducer.planNodeByLabelScan(
        varFor(node),
        LabelName(node.toUpperCase())(pos),
        Seq.empty,
        None,
        Set.empty,
        ProvidedOrder.asc(varFor(node)),
        context
      ))
  private val queryPlanConfig = (planner: IndexedSeq[LeafPlanner]) =>  QueryPlannerConfiguration(
    pickBestCandidate = _ =>
      new CandidateSelector {

        // cost(AllNodesScan) < cost(NodeByLabelScan)
        // cost(Sort(AllNodesScan)) > cost(NodeByLabelScan)
        override def applyWithResolvedPerPlan[X](projector: X => LogicalPlan, input: Iterable[X], resolved: => String, resolvedPerPlan: LogicalPlan => String, heuristic: SelectorHeuristic): Option[X] = {
          val logicalPlans = input.map(i => (i, projector(i))).toSeq
              .sortBy{
                case (_, _: AllNodesScan) => 10
                case (_, _: NodeByLabelScan) => 100
                case (_, _: Sort) => 1000
              }

          logicalPlans.headOption.map(_._1)
        }
      },
    applySelections = (plan, _, _, _) => plan,
    optionalSolvers = Seq.empty,
    leafPlanners = LeafPlannerList(planner),
    updateStrategy = defaultUpdateStrategy
  )

  test("empty query graph") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner)),
        QueryGraph(patternNodes = Set()),
        InterestingOrderConfig.empty,
        ctx
      )

      options.shouldEqual(List())
    }
  }

  test("query graph with single node and no interesting order") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner)),
        QueryGraph(patternNodes = Set("a")),
        InterestingOrderConfig.empty,
        ctx
      )

      options.shouldEqual(List(BestResults(AllNodesScan("a", Set.empty), None)))
    }
  }

  test("query graph with single node and interesting order") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner)),
        QueryGraph(patternNodes = Set("a")),
        InterestingOrderConfig(
          InterestingOrder.required(RequiredOrderCandidate.asc(varFor("a")))),
        ctx
      )

      options.shouldEqual(List(BestResults(AllNodesScan("a", Set.empty), Some(Sort(AllNodesScan("a", Set.empty), List(Ascending("a")))))))
    }
  }

  test("query graph with single node and label, without interesting order") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner, labelScanLeafPlanner)),
        QueryGraph(patternNodes = Set("a")),
        InterestingOrderConfig.empty,
        ctx
      )

      options.shouldEqual(List(BestResults(AllNodesScan("a", Set.empty), None)))
    }
  }

  test("query graph with single node and label, with interesting order") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner, labelScanLeafPlanner)),
        QueryGraph(patternNodes = Set("a")),
        InterestingOrderConfig(
          InterestingOrder.required(RequiredOrderCandidate.asc(varFor("a")))),
        ctx
      )

      options.shouldEqual(List(
        BestResults(AllNodesScan("a", Set.empty), Some(NodeByLabelScan("a", LabelName("A")(pos), Set.empty, IndexOrderAscending)))
      ))
    }
  }

  test("query graph with multiple nodes and no interesting order") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner, labelScanLeafPlanner)),
        QueryGraph(patternNodes = Set("a", "b")),
        InterestingOrderConfig.empty,
        ctx
      )

      options.shouldEqual(List(
        BestResults(AllNodesScan("a", Set.empty), None),
        BestResults(AllNodesScan("b", Set.empty), None))
      )
    }
  }

  test("query graph with multiple nodes and interesting order") {
    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig(IndexedSeq(allNodesScanLeafPlanner, labelScanLeafPlanner)),
        QueryGraph(patternNodes = Set("a", "b")),
        InterestingOrderConfig(
          InterestingOrder.required(RequiredOrderCandidate.asc(varFor("a")))),
        ctx
      )

      options.shouldEqual(List(
        BestResults(AllNodesScan("a", Set.empty), Some(NodeByLabelScan("a", LabelName("A")(pos), Set.empty, IndexOrderAscending))),
        BestResults(AllNodesScan("b", Set.empty), None)
      ))
    }
  }

  test("should group plans with same available symbols after selection") {
    val plan: LogicalPlan = Projection(AllNodesScan("a", Set.empty), Map("b" -> varFor("a")))
    val projectionPlanner: LeafPlanner = (_, _, _) => Set(plan)
    val queryPlanConfig = QueryPlannerConfiguration(
      pickBestCandidate = _ =>
        new CandidateSelector {
          override def applyWithResolvedPerPlan[X](projector: X => LogicalPlan, input: Iterable[X], resolved: => String, resolvedPerPlan: LogicalPlan => String, heuristic: SelectorHeuristic): Option[X] = input.headOption
        },
      applySelections = (_, _, _, _) => plan,
      optionalSolvers = Seq.empty,
      leafPlanners = LeafPlannerList(IndexedSeq(allNodesScanLeafPlanner, projectionPlanner)),
      updateStrategy = defaultUpdateStrategy
    )

    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig,
        QueryGraph(patternNodes = Set("a")),
        InterestingOrderConfig.empty,
        ctx
      )

      options.shouldEqual(List(
        BestResults(plan, None)
      ))
    }
  }

  test("should group plans with same available symbols not considering generated variables that are not part of the queryGraph") {
    val anonymousVariableNameGenerator = new AnonymousVariableNameGenerator
    val plans = Set[LogicalPlan](
     Argument(Set("a", anonymousVariableNameGenerator.nextName)),
     Argument(Set("a", anonymousVariableNameGenerator.nextName))
    )
    val customLeafPlanner: LeafPlanner = (_, _, _) => plans
    val queryPlanConfig = QueryPlannerConfiguration(
      pickBestCandidate = _ =>
        new CandidateSelector {
          override def applyWithResolvedPerPlan[X](projector: X => LogicalPlan, input: Iterable[X], resolved: => String, resolvedPerPlan: LogicalPlan => String, heuristic: SelectorHeuristic): Option[X] = input.headOption
        },
      applySelections = (plan, _, _, _) => plan,
      optionalSolvers = Seq.empty,
      leafPlanners = LeafPlannerList(IndexedSeq(customLeafPlanner)),
      updateStrategy = defaultUpdateStrategy
    )

    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig,
        QueryGraph(patternNodes = Set("a")),
        InterestingOrderConfig.empty,
        ctx
      )

      options.shouldEqual(List(
        BestResults(plans.head, None)
      ))
    }
  }

  test("should group plans with same available symbols considering generated variables that are part of the queryGraph") {
    val anonymousVariableNameGenerator = new AnonymousVariableNameGenerator
    val fresh1 = anonymousVariableNameGenerator.nextName
    val fresh2 = anonymousVariableNameGenerator.nextName
    val plans = Set[LogicalPlan](
     Argument(Set("a", fresh1)),
     Argument(Set("a", fresh2))
    )
    val customLeafPlanner: LeafPlanner = (_, _, _) => plans
    val queryPlanConfig = QueryPlannerConfiguration(
      pickBestCandidate = _ =>
        new CandidateSelector {
          override def applyWithResolvedPerPlan[X](projector: X => LogicalPlan, input: Iterable[X], resolved: => String, resolvedPerPlan: LogicalPlan => String, heuristic: SelectorHeuristic): Option[X] = input.headOption
        },
      applySelections = (plan, _, _, _) => plan,
      optionalSolvers = Seq.empty,
      leafPlanners = LeafPlannerList(IndexedSeq(customLeafPlanner)),
      updateStrategy = defaultUpdateStrategy
    )

    new given().withLogicalPlanningContext { (_, ctx) =>
      val options = leafPlanOptions(
        queryPlanConfig,
        QueryGraph(patternNodes = Set("a", fresh1, fresh2)),
        InterestingOrderConfig.empty,
        ctx
      )

      options should contain theSameElementsAs plans.map(p => BestResults(p, None))
    }
  }

}
