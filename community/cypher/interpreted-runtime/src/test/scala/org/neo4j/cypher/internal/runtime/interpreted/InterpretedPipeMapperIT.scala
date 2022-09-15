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
package org.neo4j.cypher.internal.runtime.interpreted

import org.mockito.Mockito.atLeastOnce
import org.mockito.Mockito.verify
import org.mockito.Mockito.when
import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.logical.plans.Aggregation
import org.neo4j.cypher.internal.logical.plans.AllNodesScan
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.DirectedRelationshipByIdSeek
import org.neo4j.cypher.internal.logical.plans.Expand
import org.neo4j.cypher.internal.logical.plans.ExpandInto
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ManySeekableArgs
import org.neo4j.cypher.internal.logical.plans.NodeByIdSeek
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.NodeHashJoin
import org.neo4j.cypher.internal.logical.plans.OptionalExpand
import org.neo4j.cypher.internal.logical.plans.Projection
import org.neo4j.cypher.internal.logical.plans.UndirectedRelationshipByIdSeek
import org.neo4j.cypher.internal.planner.spi.PlanContext
import org.neo4j.cypher.internal.planner.spi.ReadTokenContext
import org.neo4j.cypher.internal.runtime.QueryIndexRegistrator
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.CommunityExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.runtime.interpreted.commands.values.KeyToken.Resolved
import org.neo4j.cypher.internal.runtime.interpreted.commands.values.TokenType
import org.neo4j.cypher.internal.runtime.interpreted.pipes.AllNodesScanPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ArgumentPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.CartesianProductPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.DirectedRelationshipByIdSeekPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.DistinctPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ExpandAllPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ExpandIntoPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.LazyLabel
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ManySeekArgs
import org.neo4j.cypher.internal.runtime.interpreted.pipes.NodeByIdSeekPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.NodeByLabelScanPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.NodeHashJoinPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.OptionalExpandIntoPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.PipeTreeBuilder
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ProjectionPipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.RelationshipTypes
import org.neo4j.cypher.internal.runtime.interpreted.pipes.SingleSeekArg
import org.neo4j.cypher.internal.runtime.interpreted.pipes.UndirectedRelationshipByIdSeekPipe
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.RelTypeId
import org.neo4j.cypher.internal.util.attribution.SequentialIdGen
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.values.storable.Values.intValue

import scala.collection.mutable

class InterpretedPipeMapperIT extends CypherFunSuite with AstConstructionTestSupport {
  private implicit val idGen: SequentialIdGen = new SequentialIdGen()

  private val planContext: PlanContext = mock[PlanContext]
  private val semanticTable = new SemanticTable(resolvedRelTypeNames =
    mutable.Map("existing1" -> RelTypeId(1),
      "existing2" -> RelTypeId(2),
      "existing3" -> RelTypeId(3)))

  private val converters = new ExpressionConverters(CommunityExpressionConverter(ReadTokenContext.EMPTY, new AnonymousVariableNameGenerator()))
  private val pipeMapper =
    InterpretedPipeMapper(readOnly = true, converters, planContext, mock[QueryIndexRegistrator], new AnonymousVariableNameGenerator())(semanticTable)

  private def build(logicalPlan: LogicalPlan): Pipe =
    PipeTreeBuilder(pipeMapper).build(logicalPlan)

  test("projection only query") {
    val logicalPlan = Projection(
      Argument(), Map("42" -> literalInt(42)))
    val pipe = build(logicalPlan)

    pipe should equal(ProjectionPipe(ArgumentPipe()(), Map("42" -> commands.expressions.Literal(intValue(42)))))
  }

  test("simple pattern query") {
    val logicalPlan = AllNodesScan("n", Set.empty)
    val pipe = build(logicalPlan)

    pipe should equal(AllNodesScanPipe("n")())
  }

  test("simple label scan query") {
    val logicalPlan = NodeByLabelScan("n", labelName("Foo"), Set.empty, IndexOrderAscending)
    val pipe = build(logicalPlan)

    pipe should equal(NodeByLabelScanPipe("n", LazyLabel("Foo"), IndexOrderAscending)())
  }

  test("simple node by id seek query") {
    val astLiteral = listOfInt(42)
    val logicalPlan = NodeByIdSeek("n", ManySeekableArgs(astLiteral), Set.empty)
    val pipe = build(logicalPlan)

    pipe should equal(NodeByIdSeekPipe("n", SingleSeekArg(commands.expressions.Literal(intValue(42))))())
  }

  test("simple node by id seek query with multiple values") {
    val astCollection = listOfInt(42, 43, 43)
    val logicalPlan = NodeByIdSeek("n", ManySeekableArgs(astCollection), Set.empty)
    val pipe = build(logicalPlan)

    pipe should equal(NodeByIdSeekPipe("n", ManySeekArgs(converters.toCommandExpression(logicalPlan.id, astCollection)))())
  }

  test("simple relationship by id seek query") {
    val astLiteral = listOfInt(42)
    val fromNode = "from"
    val toNode = "to"
    val logicalPlan = DirectedRelationshipByIdSeek("r", ManySeekableArgs(astLiteral), fromNode, toNode, Set.empty)
    val pipe = build(logicalPlan)

    pipe should equal(DirectedRelationshipByIdSeekPipe("r", SingleSeekArg(commands.expressions.Literal(intValue(42))), toNode, fromNode)())
  }

  test("simple relationship by id seek query with multiple values") {
    val astCollection = listOfInt(42, 43, 43)

    val fromNode = "from"
    val toNode = "to"
    val logicalPlan = DirectedRelationshipByIdSeek("r", ManySeekableArgs(astCollection), fromNode, toNode, Set.empty)
    val pipe = build(logicalPlan)

    pipe should equal(DirectedRelationshipByIdSeekPipe("r", ManySeekArgs(converters.toCommandExpression(logicalPlan.id, astCollection)), toNode, fromNode)())
  }

  test("simple undirected relationship by id seek query with multiple values") {
    val astCollection = listOfInt(42, 43, 43)

    val fromNode = "from"
    val toNode = "to"
    val logicalPlan = UndirectedRelationshipByIdSeek("r", ManySeekableArgs(astCollection), fromNode, toNode, Set.empty)
    val pipe = build(logicalPlan)

    pipe should equal(UndirectedRelationshipByIdSeekPipe("r", ManySeekArgs(converters.toCommandExpression(logicalPlan.id, astCollection)), toNode, fromNode)())
  }

  test("simple cartesian product") {
    val lhs = AllNodesScan("n", Set.empty)
    val rhs = AllNodesScan("m", Set.empty)
    val logicalPlan = CartesianProduct(lhs, rhs)
    val pipe = build(logicalPlan)

    pipe should equal(CartesianProductPipe(AllNodesScanPipe("n")(), AllNodesScanPipe("m")())())
  }

  test("simple expand") {
    val logicalPlan = Expand(AllNodesScan("a", Set.empty), "a", SemanticDirection.INCOMING, Seq(), "b", "r1")(idGen)
    val pipe = build(logicalPlan)

    pipe should equal(ExpandAllPipe(AllNodesScanPipe("a")(), "a", "r1", "b", SemanticDirection.INCOMING, RelationshipTypes.empty)())
  }

  test("simple expand into existing variable MATCH a-[r]->a ") {
    val logicalPlan = Expand(AllNodesScan("a", Set.empty), "a", SemanticDirection.INCOMING, Seq(), "a", "r", ExpandInto)(idGen)
    val pipe = build(logicalPlan)

    val inner: Pipe = ExpandIntoPipe(AllNodesScanPipe("a")(), "a", "r", "a", SemanticDirection.INCOMING, RelationshipTypes.empty)()

    pipe should equal(inner)
  }

  test("optional expand into existing variable MATCH a OPTIONAL MATCH a-[r]->a ") {
    val logicalPlan = OptionalExpand(AllNodesScan("a", Set.empty), "a", SemanticDirection.INCOMING, Seq(), "a", "r", ExpandInto)(idGen)
    val pipe = build(logicalPlan)

    pipe should equal(
      OptionalExpandIntoPipe(AllNodesScanPipe("a")(), "a", "r", "a", SemanticDirection.INCOMING, RelationshipTypes.empty, None)())
  }

  test("simple hash join") {
    val logicalPlan =
      NodeHashJoin(
        Set("b"),
        Expand(AllNodesScan("a", Set.empty), "a", SemanticDirection.INCOMING, Seq(), "b", "r1"),
        Expand(AllNodesScan("c", Set.empty), "c", SemanticDirection.INCOMING, Seq(), "b", "r2")
      )
    val pipe = build(logicalPlan)

    pipe should equal(NodeHashJoinPipe(
      Set("b"),
      ExpandAllPipe(AllNodesScanPipe("a")(), "a", "r1", "b", SemanticDirection.INCOMING, RelationshipTypes.empty)(),
      ExpandAllPipe(AllNodesScanPipe("c")(), "c", "r2", "b", SemanticDirection.INCOMING, RelationshipTypes.empty)()
    )())
  }

  test("Aggregation with no aggregating columns => DistinctPipe with resolved expressions") {
    // GIVEN
    val token = 42
    when(planContext.getOptPropertyKeyId("prop")).thenReturn(Some(token))
    val allNodesScan = AllNodesScan("n", Set.empty)
    val expressions = Map("n.prop" -> prop("n", "prop"))
    val aggregation = Aggregation(allNodesScan, expressions, Map.empty)

    // WHEN
    val pipe = build(aggregation)

    // THEN
    verify(planContext, atLeastOnce()).getOptPropertyKeyId("prop")
    pipe should equal(
      DistinctPipe(
        AllNodesScanPipe("n")(),
        Array(DistinctPipe.GroupingCol("n.prop", commands.expressions.Property(commands.expressions.Variable("n"),
          Resolved("prop", token, TokenType.PropertyKey)))))())
  }
}
