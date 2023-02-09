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
import org.neo4j.cypher.internal.runtime.TestSubscriber
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.exceptions.ArithmeticException
import org.neo4j.graphdb.Node
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual.VirtualNodeValue

abstract class OptionalTestBase[CONTEXT <: RuntimeContext](
                                                            edition: Edition[CONTEXT],
                                                            runtime: CypherRuntime[CONTEXT],
                                                            val sizeHint: Int
                                                          ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("should optional expand") {
    // given
    val n = sizeHint

    val nodeConnections = given {
      val nodes = nodeGraph(n)
      randomlyConnect(nodes, Connectivity(0, 5, "OTHER"), Connectivity(0, 5, "NEXT"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z")
      .apply()
      .|.optional("x")
      .|.expandAll("(x)-[:NEXT]->(z)")
      .|.expandAll("(x)-[:OTHER]->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      NodeConnections(x, connections) <- nodeConnections
      y <- if (connections.size == 2) connections("OTHER") else Seq(null)
      z <- if (connections.size == 2) connections("NEXT") else Seq(null)
    } yield Array(x, y, z)

    runtimeResult should beColumns("x", "y", "z").withRows(expected)
  }

  test("should optional expand - all nulls") {
    // given
    val n = sizeHint
    val nodes = given { nodeGraph(n) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .apply()
      .|.optional("x")
      .|.expandAll("(x)-[:OTHER]->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      x <-nodes
    } yield Array(x, null)
    runtimeResult should beColumns("x", "y").withRows(expected)
  }

  test("should support chained optionals") {
    // given
    val n = sizeHint

    val nodeConnections = given {
      val nodes = nodeGraph(n)
      randomlyConnect(nodes, Connectivity(0, 5, "OTHER"), Connectivity(0, 5, "NEXT"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z")
      .apply()
      .|.optional("x")
      .|.optional("x")
      .|.expandAll("(x)-[:NEXT]->(z)")
      .|.expandAll("(x)-[:OTHER]->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      NodeConnections(x, connections) <- nodeConnections
      y <- if (connections.size == 2) connections("OTHER") else Seq(null)
      z <- if (connections.size == 2) connections("NEXT") else Seq(null)
    } yield Array(x, y, z)

    runtimeResult should beColumns("x", "y", "z").withRows(expected)
  }

  test("should support optional under nested apply") {
    // given
    val n = Math.sqrt(sizeHint).toInt

    val nodeConnections = given {
      val nodes = nodeGraph(n, "Honey")
      randomlyConnect(nodes, Connectivity(0, 5, "NEXT"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z1", "z2")
      .apply()
      .|.apply()
      .|.|.optional("x", "y")
      .|.|.expandAll("(y)-[:NEXT]->(z2)")
      .|.|.optional("x", "y")
      .|.|.expandAll("(x)-[:NEXT]->(z1)")
      .|.|.argument("x", "y")
      .|.allNodeScan("y")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      NodeConnections(x, xConnections) <- nodeConnections
      NodeConnections(y, yConnections) <- nodeConnections
      z1 <- if (xConnections.nonEmpty && yConnections.nonEmpty) xConnections("NEXT") else Seq(null)
      z2 <- if (yConnections.nonEmpty) yConnections("NEXT") else Seq(null)
    } yield Array(x, y, z1, z2)

    runtimeResult should beColumns("x", "y", "z1", "z2").withRows(expected)
  }

  test("should support optional with hash join") {
    // given
    val n = Math.sqrt(sizeHint).toInt

    val nodeConnections = given {
      val nodes = nodeGraph(n, "Honey")
      randomlyConnect(nodes, Connectivity(0, 5, "OTHER"), Connectivity(0, 5, "NEXT"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "z1", "z2")
      .apply()
      .|.nodeHashJoin("x")
      .|.|.optional("x")
      .|.|.expandAll("(x)-[:NEXT]->(z2)")
      .|.|.argument("x")
      .|.optional("x")
      .|.expandAll("(x)-[:OTHER]->(z1)")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      NodeConnections(x, connections) <- nodeConnections
      z1 <- if (connections.contains("OTHER")) connections("OTHER") else Seq(null)
      z2 <- if (connections.contains("NEXT")) connections("NEXT") else Seq(null)
    } yield Array(x,  z1, z2)

    runtimeResult should beColumns("x", "z1", "z2").withRows(expected)
  }

  // This test failed because of expand+limit
  test("should support optional with limit") {
    // given
    val n = sizeHint

    val nodeConnections = given {
      val nodes = nodeGraph(n, "Honey")
      randomlyConnect(nodes, Connectivity(0, 5, "OTHER")).map {
        case NodeConnections(node, connections) => (node.getId, connections)
      }.toMap
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .apply()
      .|.limit(1)
      .|.optional("x")
      .|.expandAll("(x)-->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x", "y").withRows(matching {
      case rows:Seq[_] if rows.forall {
        case Array(x, y) =>
          val xid = x.asInstanceOf[VirtualNodeValue].id()
          val connections = nodeConnections(xid)
          if (connections.isEmpty) {
            y == Values.NO_VALUE
          } else {
            withClue(s"x id: $xid --") {
              val yid = y match {
                case node: VirtualNodeValue => node.id()
                case _ => y shouldBe a[VirtualNodeValue]
              }
              connections.values.flatten.exists(_.getId == yid)
            }
          }
      } && {
        val xs = rows.map(_.asInstanceOf[Array[_]](0))
        xs.distinct.size == xs.size // Check that there is at most one row per x
      } =>
    })
  }

  test("should stream") {
    // given
    val stream = batchedInputValues(10, (0 until sizeHint).map(Array[Any](_)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .optional()
      .input(variables = Seq("x"))
      .build()

    val subscriber = TestSubscriber.concurrent
    val runtimeResult = execute(logicalQuery, runtime, stream, subscriber)

    runtimeResult.request(1)
    runtimeResult.await()

    // then
    subscriber.allSeen should have size 1
    stream.hasMore should be(true)
  }

  test("should support optional under nested apply with sort after apply") {
    // given
    val n = sizeHint

    val  nodeConnections = given {
      val nodes = nodeGraph(n)
      randomlyConnect(nodes, Connectivity(0, 5, "OTHER"), Connectivity(0, 5, "NEXT"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z")
      .sort(Seq(Ascending("z"), Descending("x"), Ascending("y")))
      .apply()
      .|.optional("x")
      .|.expandAll("(x)-[:NEXT]->(z)")
      .|.expandAll("(x)-[:OTHER]->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    def id(node: Node): Long = if (node == null) Long.MaxValue else node.getId

    // then
    val expected = for {
      NodeConnections(x, connections) <- nodeConnections
      y <- if (connections.size == 2) connections("OTHER") else Seq(null)
      z <- if (connections.size == 2) connections("NEXT") else Seq(null)
    } yield Array(x, y, z)
    val expectedInOrder = expected.sortBy(row => (id(row(2)), -id(row(0)), id(row(1))))

    runtimeResult should beColumns("x", "y", "z").withRows(inOrder(expectedInOrder))
  }

  test("should work on top of distinct") {
    // given
    val stream = batchedInputValues(10, (0 until sizeHint).map(Array[Any](_)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .optional()
      .distinct("x AS x")
      .input(variables = Seq("x"))
      .build()

    val subscriber = TestSubscriber.concurrent
    val runtimeResult = execute(logicalQuery, runtime, stream, subscriber)

    runtimeResult.request(1)
    runtimeResult.await()

    // then
    subscriber.allSeen should have size 1
    stream.hasMore should be(true)
  }

}

// Supported by interpreted, slotted, pipelined
trait OptionalFailureTestBase[CONTEXT <: RuntimeContext] {
  self: OptionalTestBase[CONTEXT] =>

  test("should cancel outstanding work") {
    // given
    val stream = batchedInputValues(10, (0 until sizeHint).map(Array[Any](_)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .filter("x / 0 == 0")
      .optional()
      .input(variables = Seq("x"))
      .build()

    intercept[ArithmeticException] {
      consume(execute(logicalQuery, runtime, stream))
    }
  }

}
