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
package org.neo4j.cypher.internal.runtime.spec.tests

import org.neo4j.cypher.internal.CypherRuntime
import org.neo4j.cypher.internal.RuntimeContext
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.createNode
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.createNodeWithProperties
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.createRelationship
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setLabel
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setNodeProperties
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setNodePropertiesFromMap
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setNodeProperty
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setProperties
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setRelationshipProperties
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.setRelationshipPropertiesFromMap
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RecordingRuntimeResult
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.exceptions.CantCompileQueryException
import org.neo4j.exceptions.InvalidSemanticsException
import org.neo4j.graphdb.Label.label
import org.neo4j.graphdb.RelationshipType
import org.neo4j.internal.helpers.collection.Iterables
import org.neo4j.internal.helpers.collection.Iterators

import scala.collection.JavaConverters.iterableAsScalaIterableConverter

abstract class MergeTestBase[CONTEXT <: RuntimeContext](
                                                               edition: Edition[CONTEXT],
                                                               runtime: CypherRuntime[CONTEXT],
                                                               val sizeHint: Int,
                                                               useWritesWithProfiling: Boolean = false
                                                             ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {
  test("merge should create node with empty all node scan") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterables.single(tx.getAllNodes)
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1)
  }

  test("merge should fail to create nodes with null property") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    an[InvalidSemanticsException] shouldBe thrownBy(consume(runtimeResult))
  }

  test("merge should fail to create nodes with NaN property") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: sqrt(-1)}")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    an[InvalidSemanticsException] shouldBe thrownBy(consume(runtimeResult))
  }

  test("merge should fail to create relationship with null property") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(
        nodes = Seq(createNode("n")),
        relationships = Seq(createRelationship("r", "n", "R", "n", properties = Some("{prop1: 1, prop2: null}"))))
      .expandInto("(n)-[r:R]->(n)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    an[InvalidSemanticsException] shouldBe thrownBy(consume(runtimeResult))
  }

  test("merge should fail to create relationship with NaN property") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(
        nodes = Seq(createNode("n")),
        relationships = Seq(createRelationship("r", "n", "R", "n", properties = Some("{prop1: 1, prop2: sqrt(-1)}"))))
      .expandInto("(n)-[r:R]->(n)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    an[InvalidSemanticsException] shouldBe thrownBy(consume(runtimeResult))
  }

  test("merge should not create node with non-empty all node scan") {
    val nodes = given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withRows(singleColumn(nodes)).withNoUpdates()
  }

  test("merge should create node with empty label scan") {
    given {
      nodeGraph(sizeHint, "L")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n", "M")))
      .nodeByLabelScan("n", "M")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterators.single(tx.findNodes(label("M")))
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, labelsAdded = 1)
  }

  test("merge should not create node with non-empty label scan") {
    val nodes = given(
      nodeGraph(sizeHint, "L")
    )

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")))
      .nodeByLabelScan("n", "L")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withRows(singleColumn(nodes)).withNoUpdates()
  }


  test("merge should not create node with non-empty index scan") {
    val nodes = given {
      nodeIndex("L", "prop")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "L")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{prop: 42}")))
      .nodeIndexOperator("n:L(prop)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withRows(singleColumn(nodes)).withNoUpdates()
  }

  test("merge should create node with empty index scan") {
    given {
      nodeIndex("L", "prop")
      nodeGraph(sizeHint, "L")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{prop: 42}")))
      .nodeIndexOperator("n:L(prop)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterators.single(tx.findNodes(label("L")).stream().filter(n => n.hasProperty("prop")).iterator())
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, labelsAdded = 1, propertiesSet = 1)
  }

  test("merge should not create node with non-empty index seek") {
    val nodes = given {
      nodeIndex("L", "prop")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "L")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{prop: 42}")))
      .nodeIndexOperator("n:L(prop=42)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("n").withSingleRow(nodes(42)).withNoUpdates()
  }

  test("merge should create node with empty index seek") {
    given {
      nodeIndex("L", "prop")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "L")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{prop: 'hello'}")))
      .nodeIndexOperator("n:L(prop = 'hello')")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterators.single(tx.findNodes(label("L"), "prop", "hello"))
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, labelsAdded = 1, propertiesSet = 1)
  }

  test("merge should not create node nor relationships with non-empty relationship index seek") {
    val rels = given {
      relationshipIndex("R", "prop")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("prop", i)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
              relationships = Seq(createRelationship("r", "n", "R", "m", properties = Some("{prop:42}"))))
      .relationshipIndexOperator("(n)-[r:R(prop=42)]->(m)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("r").withSingleRow(rels(42)).withNoUpdates()
  }

  test("merge should create nodes and relationship with empty relationship index seek") {
    given {
      relationshipIndex("R", "prop")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("prop", i)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m", properties = Some("{prop:'hello'}"))))
      .relationshipIndexOperator("(n)-[r:R(prop='hello')]->(m)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val r = tx.findRelationship(RelationshipType.withName("R"), "prop", "hello")
    runtimeResult should beColumns("r").withSingleRow(r).withStatistics(nodesCreated = 2, relationshipsCreated = 1, propertiesSet = 1)
  }

  test("merge should not create node nor relationships with non-empty relationship index scan") {
    val rels = given {
      relationshipIndex("R", "prop")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("prop", i)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .relationshipIndexOperator("(n)-[r:R(prop)]->(m)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("r").withRows(singleColumn(rels)).withNoUpdates()
  }

  test("merge should create nodes and relationship with empty relationship index scan") {
    given {
      relationshipIndex("S", "prop")
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "S", "m")))
      .relationshipIndexOperator("(n)-[r:S(prop)]->(m)")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val r = Iterators.single(tx.getAllRelationships.stream().filter(r => r.isType(RelationshipType.withName("S"))).iterator())
    runtimeResult should beColumns("r").withSingleRow(r).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should create nodes and relationships when there are nodes but no relationships, all node scan + expand") {
    // given nodes with no relationships
    given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .expand("(n)-[r:R]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should create nodes and relationships when there are no nodes nor relationships, all node scan + expand") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .expand("(n)-[r:R]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should not create nodes nor relationships when there are nodes with relationships, all node scan + expand") {
    given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .expand("(n)-[r:R]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rels = tx.getAllRelationships.asScala
    runtimeResult should beColumns("n", "r", "m")
      .withRows(rels.map(rel => Array(rel.getStartNode, rel, rel.getEndNode))).withNoUpdates()
  }

  test("merge should create nodes and relationships when there are nodes but no relationships, expand into") {
    // given nodes with no relationships
    given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r")
      .merge(nodes = Seq(createNode("n")),
        relationships = Seq(createRelationship("r", "n", "R", "n")))
      .expandInto("(n)-[r:R]->(n)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r").withSingleRow(rel.getStartNode, rel).withStatistics(nodesCreated = 1, relationshipsCreated = 1)
  }

  test("merge should create nodes and relationships when there are no nodes nor relationships, expand into") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r")
      .merge(nodes = Seq(createNode("n")),
        relationships = Seq(createRelationship("r", "n", "R", "n")))
      .expandInto("(n)-[r:R]->(n)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r").withSingleRow(rel.getStartNode, rel).withStatistics(nodesCreated = 1, relationshipsCreated = 1)
  }

  test("merge should not create nodes nor relationships when there are nodes with relationships, expand into") {
    given {
      val nodes = nodeGraph(sizeHint)
      nodes.foreach(n => n.createRelationshipTo(n, RelationshipType.withName("R")))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r")
      .merge(nodes = Seq(createNode("n")),
        relationships = Seq(createRelationship("r", "n", "R", "n")))
      .expand("(n)-[r:R]->(n)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rels = tx.getAllRelationships.asScala
    runtimeResult should beColumns("n", "r")
      .withRows(rels.map(rel => Array(rel.getStartNode, rel))).withNoUpdates()
  }

  test("merge should create nodes and relationships when there are nodes but no relationships, all node scan + expand + project endpoints (start in scope)") {
    // given nodes with no relationships
    given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = true, endInScope = false)
      .expandAll("(n)-[r:R]->()")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should create nodes and relationships when there are no nodes nor relationships, all node scan + expand + project endpoints (start in scope)") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = true, endInScope = false)
      .expandAll("(n)-[r:R]->()")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should not create nodes nor relationships when there are nodes with relationships, all node scan + expand + project endpoints (start in scope)") {
    given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = true, endInScope = false)
      .expand("(n)-[r:R]->()")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rels = tx.getAllRelationships.asScala
    runtimeResult should beColumns("n", "r", "m")
      .withRows(rels.map(rel => Array(rel.getStartNode, rel, rel.getEndNode))).withNoUpdates()
  }

  test("merge should create nodes and relationships when there are nodes but no relationships, all node scan + expand + project endpoints (end in scope)") {
    // given nodes with no relationships
    given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(m)-[r]->(n)", startInScope = false, endInScope = true)
      .expandAll("(n)<-[r:R]-()")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should create nodes and relationships when there are no nodes nor relationships, all node scan + expand + project endpoints (end in scope)") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(m)-[r]->(n)", startInScope = false, endInScope = true)
      .expandAll("(n)<-[r:R]-()")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should not create nodes nor relationships when there are nodes with relationships, all node scan + expand + project endpoints (end in scope)") {
    given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(m)-[r]->(n)", startInScope = false, endInScope = true)
      .expand("(n)<-[r:R]-()")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rels = tx.getAllRelationships.asScala
    runtimeResult should beColumns("n", "r", "m")
      .withRows(rels.map(rel => Array(rel.getEndNode, rel, rel.getStartNode))).withNoUpdates()
  }

  test("merge should create nodes and relationships when there are nodes but no relationships, all node scan + expand + project endpoints (nothing in scope)") {
    // given nodes with no relationships
    given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = false, endInScope = false)
      .expandAll("(x)-[r:R]->()")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should create nodes and relationships when there are no nodes nor relationships, all node scan + expand + project endpoints (nothing in scope)") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = false, endInScope = false)
      .expandAll("(x)-[r:R]->()")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge should not create nodes nor relationships when there are nodes with relationships, all node scan + expand + project endpoints (nothing in scope)") {
    given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = false, endInScope = false)
      .expand("(x)-[r:R]->()")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rels = tx.getAllRelationships.asScala
    runtimeResult should beColumns("n", "r", "m")
      .withRows(rels.map(rel => Array(rel.getStartNode, rel, rel.getEndNode))).withNoUpdates()
  }

  test("merge and project endpoints with empty input") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r]->(m)", startInScope = false, endInScope = false)
      .input(relationships = Seq("r"))
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime, inputValues())
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge and project endpoints with non-matching type input") {

    val (_, rels) = given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "S", "m")))
      .projectEndpoints("(n)-[r:S]->(m)", startInScope = false, endInScope = false)
      .input(relationships = Seq("r"))
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime, inputValues(rels.map(r => Array[Any](r)):_*))
    consume(runtimeResult)
    val rel = Iterators.single(tx.getAllRelationships.stream().filter(r => r.isType(RelationshipType.withName("S"))).iterator())
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, relationshipsCreated = 1)
  }

  test("merge and project endpoints with matching type input") {

    val (_, rels) = given {
      circleGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")))
      .projectEndpoints("(n)-[r:R]->(m)", startInScope = false, endInScope = false)
      .input(relationships = Seq("r"))
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime, inputValues(rels.map(r => Array[Any](r)):_*))
    consume(runtimeResult)
    runtimeResult should beColumns("n", "r", "m").withRows(rels.map(r => Array(r.getStartNode, r, r.getEndNode))).withNoUpdates()
  }

    test("merge should create node with multiple labels when no nodes") {
      // given no nodes

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("n")
        .merge(nodes = Seq(createNode("n", "L", "M")))
        .filter("n:M")
        .nodeByLabelScan("n", "L")
        .build(readOnly = false)

      // then
      val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
      consume(runtimeResult)
      val node = Iterables.single(tx.getAllNodes)
      runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, labelsAdded = 2)
    }

  test("merge should create node with multiple labels when no nodes with both types") {
    given(
      nodeGraph(sizeHint, "L")
    )

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n", "L", "M")))
      .filter("n:M")
      .nodeByLabelScan("n", "L")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterators.single(tx.findNodes(label("M")))
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, labelsAdded = 2)
  }

  test("merge scan + filter + expand + filter") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "r", "m")
      .merge(nodes = Seq(createNode("n", "L"), createNode("m", "M")),
            relationships = Seq(createRelationship("r", "n", "R", "m")))
      .filter("m:M")
      .expand("(n)-[r:R]->(m)")
      .filter("n:L")
      .nodeByLabelScan("n", "L")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    runtimeResult should beColumns("n", "r", "m").withSingleRow(rel.getStartNode, rel, rel.getEndNode).withStatistics(nodesCreated = 2, labelsAdded = 2, relationshipsCreated = 1)
  }

  test("merge on the RHS of an apply") {
    val nodes = given(nodePropertyGraph(sizeHint, {
      case i if i % 2 == 0 => Map("prop" -> i)
    }, "L"))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("res")
      .projection("n.prop AS res")
      .apply()
      .|.merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{prop: x}")))
      .|.filter("n.prop = x")
      .|.nodeByLabelScan("n", "L", "x")
      .input(variables = Seq("x"))
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime, inputValues((1 to 10).map(i => Array[Any](i)):_*))
    consume(runtimeResult)
    runtimeResult should beColumns("res").withRows(singleColumn(1 to 10)).withStatistics(nodesCreated = 5, labelsAdded = 5, propertiesSet = 5)
  }

  test("merge should perform on create side effect") {
    // given no nodes

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")), onCreate = Seq(setLabel("n", "L", "M"), setNodeProperty("n", "prop", "42")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterables.single(tx.getAllNodes)
    node.hasLabel(label("L")) shouldBe true
    node.hasLabel(label("M")) shouldBe true
    node.getProperty("prop") should equal(42)
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, labelsAdded = 2, propertiesSet = 1)
  }

  test("merge should perform on match side effect") {
    val nodes = given(nodeGraph(sizeHint))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")), onMatch = Seq(setLabel("n", "L", "M"), setNodeProperty("n", "prop", "42")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)

    nodes.foreach(node => {
      node.hasLabel(label("L")) shouldBe true
      node.hasLabel(label("M")) shouldBe true
      node.getProperty("prop") should equal(42)
    })
    runtimeResult should beColumns("n").withRows(singleColumn(nodes)).withStatistics(labelsAdded = 2 * sizeHint, propertiesSet = sizeHint)
  }

  test("merge should handle set node property from map") {
    //given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r")
      .merge(
        nodes = Seq(createNode("n"), createNode("m")),
        relationships = Seq(createRelationship("r", "n", "R", "m")),
        onCreate = Seq(setNodePropertiesFromMap("n", "{prop: 42}"), setRelationshipPropertiesFromMap("r", "{prop: 1337}")))
      .expand("(n)-[r]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)

    val relationship = Iterables.single(tx.getAllRelationships)
    relationship.getProperty("prop") should equal(1337)
    relationship.getStartNode.getProperty("prop") should equal(42)
    runtimeResult should beColumns("r").withSingleRow(relationship).withStatistics(nodesCreated = 2, relationshipsCreated = 1, propertiesSet = 2)
  }

  test("merge followed by non-fuseable with continuations should  create nodes on no matches") {
    //given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nonFuseable()
      .merge(nodes = Seq(createNode("x")))
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterables.single(tx.getAllNodes)
    runtimeResult should beColumns("x").withSingleRow(node).withStatistics(nodesCreated = 1)
  }

  test("merge followed by non-fuseable with continuations should not create nodes on matches") {
    val nodes = given {
      nodeGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nonFuseable()
      .merge(nodes = Seq(createNode("x")))
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("x").withRows(singleColumn(nodes)).withNoUpdates()
  }

  test("merge followed by optional expand into with no updates") {
    val size = Math.sqrt(sizeHint).intValue()
    val (nodes, rels) = given {
      circleGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "r",  "y")
      .optionalExpandInto("(x)-[r]->(y)")
      .apply()
      .|.merge(nodes = Seq(createNode("y")))
      .|.allNodeScan("y", "x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)

    consume(runtimeResult)
    val expected = for {i <- 0 until size
                        j <- 0 until size} yield if (j == (i + 1) % size) Array(nodes(i), rels(i), nodes(j)) else Array(nodes(i), null, nodes(j))
    runtimeResult should beColumns("x", "r", "y").withRows(expected).withNoUpdates()
  }

  test("merge followed by optional expand into with updates") {
    val size = Math.sqrt(sizeHint).intValue()
    val (nodes, _) = given {
      circleGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "r",  "y")
      .optionalExpandInto("(x)-[r]->(y)")
      .apply()
      .|.merge(nodes = Seq(createNode("y", "N")))
      .|.nodeByLabelScan("y", "N", "x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)

    consume(runtimeResult)
    val y = Iterators.single(tx.findNodes(label("N")))
    val expected = for {x <- nodes} yield  Array[Any](x, null, y)

    runtimeResult should beColumns("x", "r", "y").withRows(expected).withStatistics(nodesCreated = 1, labelsAdded = 1)
  }

  test("merge followed by aggregation into with no updates") {
    val size = Math.sqrt(sizeHint).intValue()
    given {
      circleGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("count")
      .aggregation(Seq(), Seq("count(r) AS count"))
      .optionalExpandInto("(x)-[r]->(y)")
      .apply()
      .|.merge(nodes = Seq(createNode("y")))
      .|.allNodeScan("y", "x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)

    consume(runtimeResult)
    runtimeResult should beColumns("count").withSingleRow(size).withNoUpdates()
  }

  test("merge followed by aggregation into with updates") {
    val size = Math.sqrt(sizeHint).intValue()
    given {
      circleGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("count")
      .aggregation(Seq(), Seq("count(x) AS count"))
      .optionalExpandInto("(x)-[r]->(y)")
      .apply()
      .|.merge(nodes = Seq(createNode("y", "L")))
      .|.nodeByLabelScan("y", "L", "x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)

    consume(runtimeResult)
    runtimeResult should beColumns("count").withSingleRow(size).withStatistics(nodesCreated = 1, labelsAdded = 1)
  }

  test("merge followed by limit with no updates") {
    val size = Math.sqrt(sizeHint).intValue()
    given {
      circleGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .limit(5)
      .optionalExpandInto("(x)-[r]->(y)")
      .apply()
      .|.merge(nodes = Seq(createNode("y")))
      .|.allNodeScan("y", "x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)

    consume(runtimeResult)
    runtimeResult should beColumns("x").withRows(rowCount(5)).withNoUpdates()
  }

  test("merge followed by limit with no updates not fused to produce results") {
    val size = Math.sqrt(sizeHint).intValue()
    given {
      circleGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nonFuseable()
      .limit(5)
      .optionalExpandInto("(x)-[r]->(y)")
      .apply()
      .|.merge(nodes = Seq(createNode("y")))
      .|.allNodeScan("y", "x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)

    consume(runtimeResult)
    runtimeResult should beColumns("x").withRows(rowCount(5)).withNoUpdates()
  }

  test("handle continuations from rhs of apply") {
    val size = Math.sqrt(sizeHint).toInt
    given(nodeGraph(size))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("b")
      .nonFuseable()
      .apply()
      .|.merge(nodes = Seq(createNodeWithProperties("b", Seq.empty, "{prop: 1}")))
      .|.filter("b.prop = 1")
      .|.allNodeScan("b")
      .allNodeScan("a")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val b = Iterators.single(tx.getAllNodes.stream().filter(n => n.getProperty("prop", null) == 1).iterator())
    runtimeResult should beColumns("b").withRows((1 to size).map(_ => Array[Any](b))).withStatistics(nodesCreated = 1, propertiesSet = 1)
  }

  test("should lock nodes if no matches") {
    // given
    val nodes = given {
      nodeGraph(sizeHint)
    }

    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .apply()
      .|.merge(nodes = Seq(createNode("y")),
               relationships = Seq(createRelationship("r", "x", "R", "y")),
               lockNodes = Set("x"))
      .|.expand("(x)-[r:R]->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("x")
      .withRows(nodes.map(Array(_)))
      .withStatistics(nodesCreated = sizeHint, relationshipsCreated = sizeHint)
      .withLockedNodes(nodes.map(_.getId).toSet)
  }

  test("should not lock nodes if on matches") {
    // given
    val (nodes, _) = given {
      circleGraph(sizeHint)
    }

    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .apply()
      .|.merge(nodes = Seq(createNode("y")),
               relationships = Seq(createRelationship("r", "x", "R", "y")),
               lockNodes = Set("x"))
      .|.expand("(x)-[r:R]->(y)")
      .|.argument("x")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("x")
      .withRows(nodes.map(Array(_)))
      .withNoUpdates()
      .withLockedNodes(Set.empty)
  }

  test("should lock refslot nodes") {
    // given
    val nodes = given {
      nodeGraph(sizeHint)
    }

    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("xRef")
      .apply()
      .|.merge(nodes = Seq(createNode("y")),
               relationships = Seq(createRelationship("r", "x", "R", "y")),
              lockNodes = Set("xRef"))
      .|.expand("(xRef)-[r:R]->(y)")
      .|.argument("xRef")
      .unwind("[x] as xRef")
      .allNodeScan("x")
      .build(readOnly = false)

    // then
    val runtimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("xRef")
      .withRows(nodes.map(Array(_)))
      .withStatistics(nodesCreated = sizeHint, relationshipsCreated = sizeHint)
      .withLockedNodes(nodes.map(_.getId).toSet)
  }

  test("should profile rows and dbhits of merge correctly") {
    // given
    given {
      bipartiteGraph(sizeHint, "A", "B", "R")
    }

    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .merge(nodes = Seq(createNode("x")), onMatch = Seq(setNodeProperty("x", "prop", "42")))
      .nodeByLabelScan("x", "A")
      .build(readOnly = false)

    val runtimeResult = profile(logicalQuery, runtime)
    consume(runtimeResult)

    // then
    val queryProfile = runtimeResult.runtimeResult.queryProfile()
    val produceResultProfile = queryProfile.operatorProfile(0)
    val mergeProfile = queryProfile.operatorProfile(1)

    val expectedDBHits = if (useWritesWithProfiling) {
      val propertyTokenDbHits = sizeHint
      val writeNodePropertyDbHits = sizeHint
      propertyTokenDbHits + writeNodePropertyDbHits
    } else {
      3 + sizeHint
    }

    mergeProfile.rows() shouldBe sizeHint
    mergeProfile.dbHits() shouldBe expectedDBHits
    produceResultProfile.rows() shouldBe sizeHint
    produceResultProfile.dbHits() shouldBe sizeHint * 2
  }

  test("merge on the RHS of an apply with Unwind on top of apply") {
    //given empty database

    //when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("idB")
      .nonFuseable()
      .unwind("[1,2,3] AS idB")
      .apply()
      .|.merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{id: idA}")))
      .|.filter("n.id = idA")
      .|.allNodeScan("n")
      .unwind("[1,2] AS idA")
      .argument()
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    runtimeResult should beColumns("idB").withRows(Seq(Array(1), Array(2), Array(3), Array(1), Array(2), Array(3))).withStatistics(nodesCreated = 2, labelsAdded = 2, propertiesSet = 2)
  }

  test("merge on the RHS of an apply with Unwind on top of apply using created variables") {
    //given empty database

    //when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("ns")
      .nonFuseable()
      .unwind("[n,n,n] AS ns")
      .apply()
      .|.merge(nodes = Seq(createNodeWithProperties("n", Seq("L"), "{id: idA}")))
      .|.filter("n.id = idA")
      .|.allNodeScan("n")
      .unwind("[1,2] AS idA")
      .argument()
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)

    val Seq(n1, n2) = tx.getAllNodes.asScala.toSeq
    runtimeResult should beColumns("ns").withRows(Seq(Array(n1), Array(n1), Array(n1), Array(n2), Array(n2), Array(n2))).withStatistics(nodesCreated = 2, labelsAdded = 2, propertiesSet = 2)
  }
}

// Supported by pipelined only
trait PipelinedMergeTestBase[CONTEXT <: RuntimeContext] {
  self: MergeTestBase[CONTEXT] =>

  test("merge should fail if deeply nested in pipelined runtime") {
    // given no nodes

    // when
    // query with 21 merges
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .merge(nodes = Seq(createNodeWithProperties("n", Seq.empty, "{prop1: 1, prop2: null}")))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    a[CantCompileQueryException] shouldBe thrownBy(execute(logicalQuery, runtime))
  }

  test("merge should not create node with non-empty multi index seek") {
    val (drunkNodes, childNodes) = given {
      nodeIndex("Drunk", "prop")
      nodeIndex("Child", "prop")
      val drunks = nodePropertyGraph(sizeHint, { case i => Map("prop" -> i ) }, "Drunk")
      val children = nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) }, "Child")
      (drunks, children)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("d", "c")
      .merge(
        nodes = Seq(
          createNodeWithProperties("d", Seq("Drunk"), "{prop: 42}"),
          createNodeWithProperties("c", Seq("Child"), "{prop: 42}")
        )
      )
      .multiNodeIndexSeekOperator(
        _.nodeIndexSeek("d:Drunk(prop=42)"),
        _.nodeIndexSeek("c:Child(prop=42)")
      )
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)

    runtimeResult should beColumns("d", "c").withSingleRow(drunkNodes(42), childNodes(42)).withNoUpdates()
  }

  test("merge should create node with empty multi index seek") {
    given {
      nodeIndex("Drunk", "prop")
      nodeIndex("Child", "prop")
      nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) }, "Drunk")
      nodePropertyGraph(sizeHint, { case i => Map("prop" -> i) }, "Child")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("d", "c")
      .merge(
        nodes = Seq(
          createNodeWithProperties("d", Seq("Drunk"), "{prop: 'hello'}"),
          createNodeWithProperties("c", Seq("Child"), "{prop: 'hello'}")
        )
      )
      .multiNodeIndexSeekOperator(
        _.nodeIndexSeek("d:Drunk(prop='hello')"),
        _.nodeIndexSeek("c:Child(prop='hello')")
      )
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val drunkNode = Iterators.single(tx.findNodes(label("Drunk"), "prop", "hello"))
    val childNode = Iterators.single(tx.findNodes(label("Child"), "prop", "hello"))
    runtimeResult should beColumns("d", "c").withSingleRow(drunkNode, childNode).withStatistics(nodesCreated = 2, labelsAdded = 2, propertiesSet = 2)
  }

  test("merge with setNodeProperties") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")), onCreate = Seq(setNodeProperties("n", ("p1", "42"), ("p2", "43"))))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterables.single(tx.getAllNodes)
    node.getProperty("p1") should equal(42)
    node.getProperty("p2") should equal(43)
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, propertiesSet = 2)
  }

  test("merge with setProperties") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .merge(nodes = Seq(createNode("n")), onCreate = Seq(setProperties("n", ("p1", "42"), ("p2", "43"))))
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val node = Iterables.single(tx.getAllNodes)
    node.getProperty("p1") should equal(42)
    node.getProperty("p2") should equal(43)
    runtimeResult should beColumns("n").withSingleRow(node).withStatistics(nodesCreated = 1, propertiesSet = 2)
  }

  test("merge with setRelationshipProperties") {
    // given empty db

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r")
      .merge(nodes = Seq(createNode("n"), createNode("m")), relationships = Seq(createRelationship("r", "n", "R", "m")),
        onCreate = Seq(setRelationshipProperties("r", ("p1", "42"), ("p2", "43"))))
      .expand("(n)-[r:R]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    // then
    val runtimeResult: RecordingRuntimeResult = execute(logicalQuery, runtime)
    consume(runtimeResult)
    val rel = Iterables.single(tx.getAllRelationships)
    rel.getProperty("p1") should equal(42)
    rel.getProperty("p2") should equal(43)
    runtimeResult should beColumns("r").withSingleRow(rel).withStatistics(nodesCreated = 2, relationshipsCreated = 1, propertiesSet = 2)
  }
}

