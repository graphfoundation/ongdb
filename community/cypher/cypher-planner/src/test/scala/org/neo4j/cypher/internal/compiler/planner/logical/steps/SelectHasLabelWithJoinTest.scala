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

import org.mockito.Mockito.when
import org.neo4j.cypher.internal.compiler.planner.BeLikeMatcher.beLike
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.expressions.Ands
import org.neo4j.cypher.internal.expressions.HasLabelsOrTypes
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.logical.plans.Apply
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.Expand
import org.neo4j.cypher.internal.logical.plans.FieldSignature
import org.neo4j.cypher.internal.logical.plans.LeftOuterHashJoin
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.NodeHashJoin
import org.neo4j.cypher.internal.logical.plans.Optional
import org.neo4j.cypher.internal.logical.plans.ProcedureCall
import org.neo4j.cypher.internal.logical.plans.ProcedureReadOnlyAccess
import org.neo4j.cypher.internal.logical.plans.ProcedureSignature
import org.neo4j.cypher.internal.logical.plans.QualifiedName
import org.neo4j.cypher.internal.logical.plans.RightOuterHashJoin
import org.neo4j.cypher.internal.logical.plans.Selection
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.scalatest.Inside.inside

class SelectHasLabelWithJoinTest extends CypherFunSuite with LogicalPlanningTestSupport2 {
  test("should solve labels with joins") {

    val plan = new given {
      cost = {
        case (_: Selection, _, _, _) => 1000.0
        case (_: NodeHashJoin, _, _, _) => 20.0
        case (_: NodeByLabelScan, _, _, _) => 20.0
      }
    } getLogicalPlanFor "MATCH (n:Foo:Bar:Baz) RETURN n"

    plan._2 match {
      case NodeHashJoin(_,
      NodeHashJoin(_,
      NodeByLabelScan(_, _, _, _),
      NodeByLabelScan(_, _, _, _)),
      NodeByLabelScan(_, _, _, _)) => ()
      case _ => fail("Not what we expected!")
    }
  }

  test("should not solve has-labels check on procedure result with joins") {
    val signature = ProcedureSignature(
      QualifiedName(Seq.empty, "getNode"),
      IndexedSeq.empty,
      Some(IndexedSeq(FieldSignature("node", CTNode))),
      None,
      ProcedureReadOnlyAccess,
      id = 0)

    val plan = new given {
      procedure(signature)
      cost = {
        case (_: Selection, _, _, _) => 1000.0
        case (_: NodeHashJoin, _, _, _) => 20.0
        case (_: NodeByLabelScan, _, _, _) => 20.0
      }
    } getLogicalPlanFor "CALL getNode() YIELD node WHERE node:Label RETURN node"

    inside(plan._2) {
      case Selection(Ands(exprs), ProcedureCall(Argument(_), _)) =>
        exprs.toList should matchPattern {
          case List(HasLabelsOrTypes(_, _)) => ()
        }
    }
  }

  test("should plan label scan with argument") {
    val query =
      """MATCH (n:N)
        |OPTIONAL MATCH (n)-[:REL]->(m:M)
        |RETURN n, m
        |""".stripMargin

    val plan = new given {
      cost = {
        case (_: Selection, _, _, _) => 1000.0
        case (_: RightOuterHashJoin, _, _, _) => 1000.0
        case (_: LeftOuterHashJoin, _, _, _) => 1000.0
        case (_: NodeHashJoin, _, _, _) => 20.0
        case (_: NodeByLabelScan, _, _, _) => 20.0
      }
    } getLogicalPlanFor query

    plan._2 should beLike {
      case
        Apply
          (NodeByLabelScan("n", _, _, _),
          Optional
            (Expand
              (NodeByLabelScan("m", _, args, _), _, _, _, _, _, _), _), _)
        if args == Set("n") => ()
    }
  }

  test("should not plan NodeHashJoin with label scan for same variable as argument") {
    val query =
      """MATCH (n:N)
        |OPTIONAL MATCH (n:M)
        |RETURN n
        |""".stripMargin

    val plan = new given {
      cost = {
        case (_: Selection, _, _, _) => 1000.0
        case (_: NodeHashJoin, _, _, _) => 20.0
        case (_: NodeByLabelScan, _, _, _) => 20.0
      }
    } getLogicalPlanFor query

    plan._2 should beLike {
      case
        Apply
          (NodeByLabelScan("n", _, _, _),
          Optional
            (Selection(_,
            Argument(args)), _), _)
        if args == Set("n") => ()
    }
  }

  test("should not produce any candidates when node by label lookup is disabled") {
    val planContext = mock[PlanContext]
    when(planContext.canLookupNodesByLabel).thenReturn(false)

    val ctx = mock[LogicalPlanningContext]
    when(ctx.planContext).thenReturn(planContext)

    val candidates = selectHasLabelWithJoin(
      mock[LogicalPlan],
      Set(hasLabels("n", "Label")),
      QueryGraph.empty.addPatternNodes("n"),
      InterestingOrderConfig.empty,
      ctx
    )

    candidates shouldBe empty
  }
}
