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
package org.neo4j.cypher.internal.runtime.spec.tests

import org.neo4j.cypher.internal.CypherRuntime
import org.neo4j.cypher.internal.RuntimeContext
import org.neo4j.cypher.internal.logical.plans.Ascending
import org.neo4j.cypher.internal.logical.plans.Descending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.graphdb.Direction

import scala.collection.JavaConverters.iterableAsScalaIterableConverter

abstract class NodeHashJoinTestBase[CONTEXT <: RuntimeContext](edition: Edition[CONTEXT],
                                                               runtime: CypherRuntime[CONTEXT],
                                                               sizeHint: Int
                                                              ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("should join after expand on empty lhs") {
    // given
    given { circleGraph(sizeHint) }
    val lhsRows = inputValues()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    runtimeResult should beColumns("x", "y").withNoRows()
  }

  test("should join on empty rhs") {
    // given
    val nodes = given { nodeGraph(sizeHint) }
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    // because graph contains no relationships, the expand will return no rows
    runtimeResult should beColumns("x", "y").withNoRows()
  }

  test("should join on empty lhs and rhs") {
    // given
    given { nodeGraph(sizeHint) }
    val lhsRows = inputValues()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    // because graph contains no relationships, the expand will return no rows
    runtimeResult should beColumns("x", "y").withNoRows()
  }

  test("should join with nulls in lhs and rhs") {
    // given
    val nodes = given { nodeGraph(1) }
    val lhsRows = inputValues()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeHashJoin("x")
      .|.injectValue("x", "null")
      .|.allNodeScan("x")
      .injectValue("x", "null")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    // because graph contains no relationships, the expand will return no rows
    runtimeResult should beColumns("x").withSingleRow(nodes.head)
  }

  test("should join with nodes in ref slots") {
    // given
    val nodes = given { nodeGraph(1) }
    val lhsRows = inputValues()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeHashJoin("x")
      // Adding in a string and then filtering it out should cause
      // the nodes to be passed in a ref slot
      .|.filter("x <> 'foo'")
      .|.injectValue("x", "'foo'")
      .|.allNodeScan("x")
      .filter("x <> 'foo'")
      .injectValue("x", "'foo'")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    // because graph contains no relationships, the expand will return no rows
    runtimeResult should beColumns("x").withSingleRow(nodes.head)
  }

  test("should join after expand on rhs") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(node, otherNode)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }

  test("should join after expand on lhs") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.allNodeScan("x")
      .expand("(y)--(x)")
      .input(nodes = Seq("y"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(otherNode, node)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }

  test("should join after expand on both sides") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x", "y")
      .|.expand("(x)--(y)")
      .|.allNodeScan("x")
      .expand("(y)--(x)")
      .input(nodes = Seq("y"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(otherNode, node)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }

  test("should join nested") {
    val withAllLabels = given {
      nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) }, "A", "C")
      nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) }, "A", "B")
      nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) }, "A", "B", "C", "D")
    }

    // when
    /*
      pipeline 0 => input =>       RegularBufferVariant
                                    * id = BufferId(1)
                                    * reducers = ASM(0)
                                    * workCanceller = ASM(0)
                    output =>      MorselArgumentStateBufferOutput
                                    * id = BufferId(3)
                                    * nextPipelineHeadPlanId = 7
                    WorkLimiter => ASM(0)
      pipeline 1 => input =>       RegularBufferVariant
                                    * id = BufferId(2)
                                    * reducers = ASM(1), ASM(4)
                                    * workCanceller = ASM(1), ASM(4)
                    output =>      MorselArgumentStateBufferOutput
                                    * id = BufferId(4)
                                    * nextPipelineHeadPlanId = 7
                    WorkLimiter => ASM(1)
      pipeline 2 => lhs         => pipeline 0
                    rhs         => pipeline 1
                    input       => LHSAccumulatingRHSStreamingBufferVariant(InnerVariant)
                                    * id = BufferId(5)
                                    * reducers = ASM(4)
                                    * workCanceller = ASM(4)
                                    * lhsSink = BufferId(3) / ASM(0)
                                      * reducers = ASM(4)
                                      * workCanceller = ASM(4)
                                    * rhsSink = BufferId(4) / ASM(1)
                                      * reducers = ASM(4)
                                      * workCanceller = ASM(4)
                    output      => MorselArgumentStateBufferOutput
                                    * id = BufferId(11)
                                    * nextPipelineHeadPlanId = 1
                    WorkLimiter => ASM(4)
      pipeline 3 => input       => RegularBufferVariant
                                    * id = BufferId(6)
                                    * reducers = ASM(2)
                                    * workCanceller = ASM(2)
                    output      => MorselArgumentStateBufferOutput
                                    * id = BufferId(8)
                                    * nextPipelineHeadPlanId = 2
                    WorkLimiter => ASM(2)
      pipeline 4 => input       => RegularBufferVariant
                                    * id = BufferId(7)
                                    * reducers = ASM(3), ASM(5)
                                    * workCanceller = ASM(3), ASM(5)
                    output      => MorselArgumentStateBufferOutput
                                    * id = BufferId(9)
                                    * nextPipelineHeadPlanId = 2
                    WorkLimiter => ASM(3)
      pipeline 5 => lhs         => pipeline 3
                    rhs         => pipeline 4
                    input       => LHSAccumulatingRHSStreamingBufferVariant(InnerVariant)
                                    * id = BufferId(10)
                                    * reducers = ASM(5)
                                    * workCanceller = ASM(5)
                                    * lhsSink = BufferId(8) / ASM(2)
                                      * reducers = ASM(5)
                                      * workCanceller = ASM(5)
                                    * rhsSink = BufferId(9) / ASM(3)
                                      * reducers = ASM(5)
                                      * workCanceller = ASM(5)
                    output      => MorselArgumentStateBufferOutput
                                    * id = BufferId(12)
                                    * nextPipelineHeadPlanId = 1
                    WorkLimiter => ASM(5)
      pipeline 6 => lhs         => pipeline 2
                    rhs         => pipeline 5
                    input       => LHSAccumulatingRHSStreamingBufferVariant(InnerVariant)
                                    * id = BufferId(13)
                                    * reducers =
                                    * workCanceller =
                                    * lhsSink = BufferId(11) / ASM(4)
                                      * reducers =
                                      * workCanceller =
                                    * rhsSink = BufferId(12) / ASM(5)
                                      * reducers =
                                      * workCanceller =
                    output      => ProduceResultOutput
                    WorkLimiter =>
     */
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("a") // pipeline 6
      .nodeHashJoin("a") // pipeline 6
      .|.nodeHashJoin("a") // pipeline 5
      .|.|.filter("a:D", "a.prop % 20 = 0") // pipeline 4
      .|.|.allNodeScan("a") // pipeline 4
      .|.filter("a:C", "a.prop <= 80") // pipeline 3
      .|.allNodeScan("a") // pipeline 3
      .nodeHashJoin("a") // pipeline 2
      .|.filter("a:B", "a.prop % 10 = 0") // pipeline 1
      .|.allNodeScan("a")  // pipeline 1
      .filter("a:A", "a.prop < 100") // pipeline 0
      .allNodeScan("a") // pipeline 0
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expectedResultRows = for {node <- withAllLabels
                                  i = node.getProperty("prop").asInstanceOf[Int]
                                  if i % 20 == 0 && i <= 80
    } yield Array(node)

    runtimeResult should beColumns("a").withRows(expectedResultRows)
  }

  test("should join below an apply") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = inputValues(nodes.map(n => Array[Any](n)): _*)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z")
      .apply()
      .|.nodeHashJoin("x")
      .|.|.expand("(x)<--(z)")
      .|.|.argument("x")
      .|.expand("(x)-->(y)")
      .|.argument("x")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {x <- nodes if x != null
                                  rel1 <- x.getRelationships(Direction.OUTGOING).asScala
                                  rel2 <- x.getRelationships(Direction.INCOMING).asScala
                                  y = rel1.getOtherNode(x)
                                  z = rel2.getOtherNode(x)
                                  } yield Array(x, y, z)

    runtimeResult should beColumns("x", "y", "z").withRows(expectedResultRows)
  }

  test("should join below an apply and sort") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = inputValues(nodes.map(n => Array[Any](n)): _*)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z")
      .sort(Seq(Descending("x"), Descending("y"), Descending("z")))
      .apply()
      .|.nodeHashJoin("x")
      .|.|.expand("(x)<--(z)")
      .|.|.argument("x")
      .|.expand("(x)-->(y)")
      .|.argument("x")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val unsortedExpectedResult = for {x <- nodes if x != null
                                      rel1 <- x.getRelationships(Direction.OUTGOING).asScala
                                      rel2 <- x.getRelationships(Direction.INCOMING).asScala
                                      y = rel1.getOtherNode(x)
                                      z = rel2.getOtherNode(x)
                                      } yield Array(x, y, z)
    val expectedResult = unsortedExpectedResult.sortBy(arr => (-arr(0).getId, -arr(1).getId, -arr(2).getId))

    runtimeResult should beColumns("x", "y", "z").withRows(expectedResult)
  }

  test("should join with double sort and limit after join") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()
    val limitCount = nodes.size / 2

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .limit(count = limitCount)
      .sort(sortItems = Seq(Descending("x"), Ascending("y")))
      .sort(sortItems = Seq(Ascending("x"), Descending("y")))
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val allRows = for {node <- nodes if node != null
                       rel <- node.getRelationships().asScala
                       otherNode = rel.getOtherNode(node)
                       } yield Array(node, otherNode)
    val expectedResultRows = allRows.sortBy(arr => (-arr(0).getId, arr(1).getId)).take(limitCount)

    runtimeResult should beColumns("x", "y").withRows(inOrder(expectedResultRows))
  }

  test("should join with sort and limit after join") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()
    val limitCount = nodes.size / 2

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .limit(count = limitCount)
      .sort(sortItems = Seq(Descending("x"), Ascending("y")))
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val allRows = for {node <- nodes if node != null
                       rel <- node.getRelationships().asScala
                       otherNode = rel.getOtherNode(node)
                       } yield Array(node, otherNode)
    val expectedResultRows = allRows.sortBy(arr => (-arr(0).getId, arr(1).getId)).take(limitCount)

    runtimeResult should beColumns("x", "y").withRows(inOrder(expectedResultRows))
  }

  test("should join with sort and limit on lhs") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()
    val limitCount = nodes.size / 2

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .limit(count = limitCount)
      .sort(sortItems = Seq(Ascending("x")))
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes.filter(_ != null).sortBy(_.getId).take(limitCount)
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(node, otherNode)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }

  test("should join with limit after join") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()
    val limitCount = nodes.size / 2

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .limit(count = limitCount)
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    runtimeResult should beColumns("x", "y").withRows(rowCount(limitCount))
  }

  test("should join with limit on lhs") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    // We cannot have a nullProbability in this test. Otherwise we would not know if null-rows survive through the limit or not,
    // and that influences the number of result rows.
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5)
    val lhsRows = inputColumns(100000, 3, i => nodes(i % nodes.size)).stream() // setting it high so the last assertion is not flaky
    val limitCount = 10 // setting it low so the last assertion is not flaky

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .limit(count = limitCount)
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    runtimeResult should beColumns("x", "y").withRows(rowCount(limitCount * 2))

    lhsRows.hasMore should be(true)
  }

  test("should join with sort and limit on rhs") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()
    val limitCount = nodes.size / 2

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.limit(count = limitCount)
      .|.sort(sortItems = Seq(Descending("x"), Descending("y")))
      .|.expand("(y)-->(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val rhsRows = {
      for {y <- unfilteredNodes
           rel <- y.getRelationships(Direction.OUTGOING).asScala
           rhsX = rel.getOtherNode(y)
           } yield (rhsX, y)
      }.sortBy {
      case (rhsX, y) => (-rhsX.getId, -y.getId)
    }.take(limitCount)
    val expectedResultRows = for {(rhsX, y) <- rhsRows
                                  lhsX <- nodes.filter(_ == rhsX)
                                  } yield Array(lhsX, y)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }

  test("should join with limit on rhs") {
    // given
    val (nodes, _) = given { circleGraph(sizeHint) }
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()
    val limitCount = nodes.size / 2

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x")
      .|.limit(count = limitCount)
      .|.expand("(y)-->(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    runtimeResult should beColumns("x", "y").withRows(rowCount(limitCount))
  }

  test("should join on more than 5 variables") {
    // given
    given { circleGraph(sizeHint, "A", "B") }
    val limitCount = 1

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x1")
      .limit(count = limitCount)
      .nodeHashJoin("x1", "x2", "x3", "x4", "x5", "x6")
      .|.expand("(x5)-->(x6)")
      .|.expand("(x4)-->(x5)")
      .|.expand("(x3)-->(x4)")
      .|.expand("(x2)-->(x3)")
      .|.expand("(x1)-->(x2)")
      .|.expand("(y)-->(x1)")
      .|.nodeByLabelScan("y", "B", IndexOrderNone)
      .expand("(x6)-->(z)")
      .expand("(x5)-->(x6)")
      .expand("(x4)-->(x5)")
      .expand("(x3)-->(x4)")
      .expand("(x2)-->(x3)")
      .expand("(x1)-->(x2)")
      .nodeByLabelScan("x1", "A", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x1").withRows(rowCount(limitCount))
  }

  test("should pass cached properties through after join") {
    val nodes = given {
      nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("cache[a.prop] AS prop")
      .nodeHashJoin("a")
      .|.filter("cache[a.prop] % 10 = 0")
      .|.cacheProperties("cache[a.prop]")
      .|.allNodeScan("a")
      .filter("cache[a.prop] < 100")
      .allNodeScan("a")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expectedResultRows = for {n <- nodes
                                  i = n.getProperty("prop").asInstanceOf[Int]
                                  if i % 10 == 0 && i < 100
                                  } yield Array(i)

    runtimeResult should beColumns("prop").withRows(expectedResultRows)
  }

  test("should join with alias on non-join-key on RHS") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "y2")
      .nodeHashJoin("x")
      .|.projection("y AS y2")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(node, otherNode, otherNode)
    runtimeResult should beColumns("x", "y", "y2").withRows(expectedResultRows)
  }

  test("should join on nodes with different types on rhs and lhs") {
    // given
    val (nodes, _) = given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeHashJoin("x")
      .|.unwind("[xLong] as x") // refslot
      .|.allNodeScan("xLong")
      .allNodeScan("x") // longslot
      .build()

    val runtimeResult = execute(logicalQuery, runtime, NO_INPUT)

    // then
    val expectedResultRows = nodes.map(Array(_))
    runtimeResult should beColumns("x").withRows(expectedResultRows)
  }

  test("nested joins on nodes with different types and different nullability") {
    // given
    val (nodes, _) = given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .nodeHashJoin("y")
      .|.unwind("[x] as y")
      .|.nodeHashJoin("x")
      .|.|.allNodeScan("x")
      .|.unwind("[xLong] as x")
      .|.allNodeScan("xLong")
      .nodeHashJoin("y")
      .|.unwind("[yLong] as y")
      .|.allNodeScan("yLong")
      .allNodeScan("y")

      .build()

    val runtimeResult = execute(logicalQuery, runtime, NO_INPUT)

    // then
    val expectedResultRows = nodes.map(Array(_))
    runtimeResult should beColumns("y").withRows(expectedResultRows)
  }

  test("should join with alias on join-key on RHS") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "x2", "y")
      .nodeHashJoin("x")
      .|.projection("x AS x2")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(node, node, otherNode)
    runtimeResult should beColumns("x", "x2", "y").withRows(expectedResultRows)
  }

  test("should join with alias on non-join-key on LHS") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "y2")
      .nodeHashJoin("x")
      .|.allNodeScan("x")
      .projection("y AS y2")
      .expand("(x)--(y)")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(node, otherNode, otherNode)
    runtimeResult should beColumns("x", "y", "y2").withRows(expectedResultRows)
  }

  test("should join with alias on join-key on LHS") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "x2", "y")
      .nodeHashJoin("x")
      .|.expand("(y)--(x)")
      .|.allNodeScan("y")
      .projection("x AS x2")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(node, node, otherNode)
    runtimeResult should beColumns("x", "x2", "y").withRows(expectedResultRows)
  }

  test("should join after expand and apply on both sides") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .nodeHashJoin("x", "y")
      .|.expand("(x)--(y)")
      .|.apply()
      .|.|.argument("x")
      .|.allNodeScan("x")
      .expand("(y)--(x)")
      .apply()
      .|.argument("y")
      .input(nodes = Seq("y"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(otherNode, node)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }

  test("should join after expand and apply on both sides with aggregation on top") {
    // given
    val (unfilteredNodes, _) = given { circleGraph(sizeHint) }
    val nodes = select(unfilteredNodes, selectivity = 0.5, duplicateProbability = 0.5, nullProbability = 0.1)
    val lhsRows = batchedInputValues(sizeHint / 8, nodes.map(n => Array[Any](n)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .projection("r[0] as x", "r[1] as y")
      .unwind("c as r")
      .aggregation(Seq.empty, Seq("collect([x, y]) as c"))
      .nodeHashJoin("x", "y")
      .|.expand("(x)--(y)")
      .|.apply()
      .|.|.argument("x")
      .|.allNodeScan("x")
      .expand("(y)--(x)")
      .apply()
      .|.argument("y")
      .input(nodes = Seq("y"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, lhsRows)

    // then
    val expectedResultRows = for {node <- nodes if node != null
                                  rel <- node.getRelationships().asScala
                                  otherNode = rel.getOtherNode(node)
                                  } yield Array(otherNode, node)

    runtimeResult should beColumns("x", "y").withRows(expectedResultRows)
  }
}
