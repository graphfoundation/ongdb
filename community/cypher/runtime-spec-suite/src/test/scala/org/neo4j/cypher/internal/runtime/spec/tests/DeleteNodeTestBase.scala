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
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RecordingRuntimeResult
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.graphdb.ConstraintViolationException
import org.neo4j.graphdb.RelationshipType

import scala.collection.JavaConverters.asScalaIteratorConverter

abstract class DeleteNodeTestBase[CONTEXT <: RuntimeContext](
  edition: Edition[CONTEXT],
  runtime: CypherRuntime[CONTEXT],
  sizeHint: Int
) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("delete all nodes") {
    given {
      nodeGraph(sizeHint)
    }

    deleteAllTest(sizeHint)
  }

  test("delete all nodes on empty database") {
    deleteAllTest(nodeCount = 0)
  }

  test("delete all nodes with exhaustive limit") {
    val nodeCount = 10

    given {
      nodeGraph(nodeCount)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .exhaustiveLimit(1)
      .deleteNode("n")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withStatistics(nodesDeleted = nodeCount)
    tx.getAllNodes.stream().count() shouldBe 0
    tx.getAllRelationships.stream().count() shouldBe 0
  }

  test("delete some nodes") {
    val nodeCount = sizeHint
    val deleteNodeCount = nodeCount / 3

    given {
      nodeGraph(deleteNodeCount, "DELETE_ME")
      nodeGraph(nodeCount - deleteNodeCount, "SAVE_ME")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .deleteNode("n")
      .nodeByLabelScan("n", "DELETE_ME")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withStatistics(nodesDeleted = deleteNodeCount)
    tx.getAllNodes.stream().count() shouldBe (nodeCount - deleteNodeCount)
  }

  test("duplicate delete") {
    val nodeCount = 10
    given {
      nodeGraph(10)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .deleteNode("n")
      .deleteNode("n")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withStatistics(nodesDeleted = nodeCount)
    tx.getAllNodes.stream().count() shouldBe 0
  }

  test("delete on rhs of apply") {
    val nodeCount = 10
    given {
      nodeGraph(10)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .apply()
      .|.deleteNode("n")
      .|.argument("n")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withStatistics(nodesDeleted = nodeCount)
    tx.getAllNodes.stream().count() shouldBe 0
  }

  test("fail to delete nodes with relationships") {
    val nodeCount = 5
    given {
      val nodes = nodeGraph(nodeCount)
      // Add one relationship
      nodes.head.createRelationshipTo(nodes(1), RelationshipType.withName("KNOWS"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .deleteNode("n")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)

    val thrown = the [ConstraintViolationException] thrownBy restartTx()
    thrown.getMessage should include regex "Cannot delete.*because it still has relationships"

    val tx = runtimeTestSupport.startNewTx()
    // Nodes and relationships should still be there
    tx.getAllNodes.stream().count() shouldBe nodeCount
    tx.getAllRelationships.stream().count() shouldBe 1
  }

  test("should not delete too many nodes if delete is between two loops with continuation") {
    val nodes = given {
      nodeGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .nonFuseable()
      .unwind(s"range(1, 10) AS r2")
      .deleteNode("n")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n")
      .withRows(singleColumn(nodes.flatMap(n => Seq.fill(10)(n))))
      .withStatistics(nodesDeleted = sizeHint)
    tx.getAllNodes.iterator().hasNext shouldBe false
  }

  private def deleteAllTest(nodeCount: Int): Unit = {

    val allNodes = tx.getAllNodes.iterator().asScala.toIndexedSeq.map(n => Array(n))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .deleteNode("n")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n")
      .withRows(allNodes)
      .withStatistics(nodesDeleted = nodeCount)
    tx.getAllNodes.stream().count() shouldBe 0
  }
}
