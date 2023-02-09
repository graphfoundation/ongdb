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

import org.neo4j.configuration.GraphDatabaseSettings.SchemaIndex
import org.neo4j.cypher.internal.CypherRuntime
import org.neo4j.cypher.internal.RuntimeContext
import org.neo4j.cypher.internal.logical.plans.GetValue
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderDescending
import org.neo4j.cypher.internal.logical.plans.ManyQueryExpression
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RandomValuesTestSupport
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.graphdb.Label
import org.neo4j.graphdb.Node
import org.neo4j.graphdb.RelationshipType
import org.neo4j.graphdb.schema.IndexType
import org.neo4j.lock.LockType.EXCLUSIVE
import org.neo4j.lock.LockType.SHARED
import org.neo4j.lock.ResourceTypes.INDEX_ENTRY
import org.neo4j.lock.ResourceTypes.LABEL
import org.neo4j.values.storable.ValueType

import scala.util.Random

// Supported by all runtimes
abstract class NodeIndexSeekTestBase[CONTEXT <: RuntimeContext](
                                                                 edition: Edition[CONTEXT],
                                                                 runtime: CypherRuntime[CONTEXT],
                                                                 val sizeHint: Int
                                                               )
  extends RuntimeTestSuite[CONTEXT](
    runtime = runtime,
    edition = edition
  )
  with RandomValuesTestSupport
{

  for (indexProvider <- Seq(SchemaIndex.NATIVE30, SchemaIndex.NATIVE_BTREE10)) {

    test(s"should exact (single) seek nodes of an index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultRandomIndexedNodePropertyGraph())
      val lookFor = randomAmong(nodes).getProperty("prop")

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ???)", paramExpr = Some(toExpression(lookFor)))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](_ == lookFor))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should exact (single) seek nodes of an index with a property with multiple matches (${indexProvider.providerName()})") {
      val numMatches = sizeHint / 5
      val propertyValue = randomValue(randomPropertyType()).asObject()
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop") {
          case (n, i) if i < numMatches => n.setProperty("prop", propertyValue)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ???)", paramExpr = Some(toExpression(propertyValue)))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(singleColumn(nodes))
    }

    test(s"exact single seek should handle null (${indexProvider.providerName()})") {
      given(defaultRandomIndexedNodePropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ???)", paramExpr = Some(nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should exact (multiple) seek nodes of an index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultRandomIndexedNodePropertyGraph())
      val lookFor = Seq(randomAmong(nodes), randomAmong(nodes)).map(_.getProperty("prop"))

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ??? OR ???)", paramExpr = lookFor.map(toExpression))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](lookFor.contains))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should handle null in exact multiple seek (${indexProvider.providerName()})") {
      given(defaultRandomIndexedNodePropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop IN ???)", paramExpr = Some(nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should handle null in exact multiple seek 2 (${indexProvider.providerName()})") {
      given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop IN ???)", paramExpr = Some(listOf(literalString("a"), nullLiteral, literalString("c"))))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should handle null in exact multiple seek 3 (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop IN ???)", paramExpr = Some(listOf(literalInt(10), nullLiteral, literalString("c"))))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withSingleRow(nodes(10 / 10))
    }

    test(s"should exact (multiple, but empty) seek nodes of an index with a property (${indexProvider.providerName()})") {
      given(defaultRandomIndexedNodePropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop)", customQueryExpression = Some(ManyQueryExpression(listOf())))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should exact (multiple, with null) seek nodes of an index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultRandomIndexedNodePropertyGraph())
      val lookFor = randomAmong(nodes).getProperty("prop")

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ??? OR ???)", paramExpr = Seq(toExpression(lookFor), nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](_ == lookFor))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should exact (multiple, but identical) seek nodes of an index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultRandomIndexedNodePropertyGraph())
      val lookFor = randomAmong(nodes).getProperty("prop")

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ??? OR ???)", paramExpr = Seq(toExpression(lookFor), toExpression(lookFor)))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](_ == lookFor))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should exact seek nodes of a unique index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())
      val lookFor = randomAmong(nodes).getProperty("prop")

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ???)", unique = true, paramExpr = Some(toExpression(lookFor)))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](_ == lookFor))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should exact (multiple, but identical) seek nodes of a unique index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())
      val lookFor = randomAmong(nodes).getProperty("prop")

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ??? OR ???)", unique = true, paramExpr = Seq(toExpression(lookFor), toExpression(lookFor)))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](_ == lookFor))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should exact (multiple, with null) seek nodes of a unique index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())
      val lookFor = randomAmong(nodes).getProperty("prop")

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ??? OR ???)", paramExpr = Seq(toExpression(lookFor), nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Any](_ == lookFor))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    // RANGE queries
    test(s"should seek nodes of an index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(prop > ${sizeHint / 2})")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > sizeHint / 2))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should handle range seeks: > false (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean > ???)", paramExpr = Some(falseLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(3))
    }

    test(s"should handle range seeks: >= false (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean >= ???)", paramExpr = Some(falseLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(5))
    }

    test(s"should handle range seeks: < false (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean < ???)", paramExpr = Some(falseLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should handle range seeks: <= false (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean <= ???)", paramExpr = Some(falseLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(2))
    }

    test(s"should handle range seeks: > true (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean > ???)", paramExpr = Some(trueLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should handle range seeks: >= true (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean >= ???)", paramExpr = Some(trueLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(3))
    }

    test(s"should handle range seeks: < true (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", 42)
        tx.createNode(Label.label("L")).setProperty("boolean", "wut!")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean < ???)", paramExpr = Some(trueLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(2))
    }

    test(s"should handle range seeks: <= true (${indexProvider.providerName()})") {
      given {
        nodeIndexWithProvider(indexProvider.providerName(), "L", "boolean")
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", false)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
        tx.createNode(Label.label("L")).setProperty("boolean", true)
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:L(boolean <= ???)", paramExpr = Some(trueLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(5))
    }

    test(s"should seek nodes with multiple less than bounds (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        nodeGraph(5, "Honey")
        indexedNodeGraph("Honey", "prop") { case (node, i) => node.setProperty("prop", i) }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(1 > prop < 2)")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](p => p < 1))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should seek nodes with multiple less than bounds with different types (${indexProvider.providerName()})") {
      given {
        nodeGraph(5, "Milk")
        nodeGraph(5, "Honey")
        indexedNodeGraph("Honey", "prop") { case (node, i) => node.setProperty("prop", i) }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(1 > prop < 'foo')")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should seek nodes with multiple less than bounds one inclusive (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        nodeGraph(5, "Honey")
        indexedNodeGraph("Honey", "prop") { case (node, i) => node.setProperty("prop", i) }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(2 >= prop < 2)")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ < 2))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should seek nodes with multiple greater than bounds (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        nodeGraph(5, "Honey")
        indexedNodeGraph("Honey", "prop") { case (node, i) => node.setProperty("prop", i) }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(1 < prop > 2)")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > 2))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should seek nodes with multiple greater than bounds with different types (${indexProvider.providerName()})") {
      given {
        nodeGraph(5, "Milk")
        nodeGraph(5, "Honey")
        indexedNodeGraph("Honey", "prop") { case (node, i) => node.setProperty("prop", i) }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(1 < prop > 'foo')")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should seek nodes with multiple greater than bounds one inclusive (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        nodeGraph(5, "Honey")
        indexedNodeGraph("Honey", "prop") { case (node, i) => node.setProperty("prop", i) }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(2 <= prop > 2)")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > 2))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should support composite index (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 10 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = 10, prop2 = '10')")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withSingleRow(nodes(10 / 10))
    }

    test(s"should support composite index (multiple results) (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 2 == 0 =>
            node.setProperty("prop", (i % 5).toString)
            node.setProperty("prop2", (i % 3).toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = '0', prop2 = '0')")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(n => n.getProperty("prop") == "0" && n.getProperty("prop2") == "0")
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should support composite index (multiple values) (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 10 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = 10 OR 20, prop2 = '10' OR '30')")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withSingleRow(nodes(10 / 10))
    }

    test(s"should support composite index with equality and existence check (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 3 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
          case (node, i) =>
            node.setProperty("prop", i % 20)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = 10, prop2)")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(n => n.hasProperty("prop2") && n.getProperty("prop") == 10)
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should support composite index with equality and range check (${indexProvider.providerName()})") {
      given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) =>
            node.setProperty("prop", i.toString)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = '10', prop2 > '10')")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should support composite index with range check and existence check (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) =>
            node.setProperty("prop", i)
            if (i % 3 == 0) node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop > 10, prop2)")
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(n => n.getProperty("prop").asInstanceOf[Int] > 10 && n.hasProperty("prop2"))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should support composite index seek with null (${indexProvider.providerName()})") {
      given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 10 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = 10, prop2 = ???)", paramExpr = Some(nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should support composite index seek with null 2 (${indexProvider.providerName()})") {
      given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 10 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = 10, prop2 > ???)", paramExpr = Some(nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withNoRows()
    }

    test(s"should support composite index (multiple values) and null (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 10 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = 10 OR ???, prop2)", paramExpr = Some(nullLiteral))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withSingleRow(nodes(10 / 10))
    }

    test(s"should cache properties (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x", "prop")
        .projection("cache[x.prop] AS prop")
        .nodeIndexOperator(s"x:Honey(prop > ${sizeHint / 2})", _ => GetValue)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > sizeHint / 2)).map(n => Array(n, n.getProperty("prop")))
      runtimeResult should beColumns("x", "prop").withRows(expected)
    }

    test(s"should cache properties in composite index (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop", "prop2") {
          case (node, i) if i % 10 == 0 =>
            node.setProperty("prop", i)
            node.setProperty("prop2", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x", "prop", "prop2")
        .projection("cache[x.prop] AS prop", "cache[x.prop2] AS prop2")
        .nodeIndexOperator("x:Honey(prop = 10, prop2 = '10')", _ => GetValue)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x", "prop", "prop2").withSingleRow(nodes(10 / 10), 10, "10")
    }

    test(s"should use existing values from arguments when available (${indexProvider.providerName()})") {
      val nodes = given {
        indexedNodeGraph("Honey", "prop") {
          case (node, i) if i % 10 == 0 => node.setProperty("prop", i.toString)
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .apply()
        .|.nodeIndexOperator("x:Honey(prop = ???)", _ => GetValue, paramExpr = Some(varFor("value")), argumentIds = Set("value"))
        .input(variables = Seq("value"))
        .build()

      val input = inputValues(Array("20"), Array("50"))

      val runtimeResult = execute(logicalQuery, runtime, input)

      // then
      runtimeResult should beColumns("x").withRows(singleColumn(Seq(nodes(20 / 10), nodes(50 / 10))))
    }

    test(s"should seek nodes of an index with a property in ascending order (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(prop > ${sizeHint / 2})", indexOrder = IndexOrderAscending)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > sizeHint / 2))
      runtimeResult should beColumns("x").withRows(singleColumnInOrder(expected))
    }

    test(s"should seek nodes of an index with a property in descending order (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(prop > ${sizeHint / 2})", indexOrder = IndexOrderDescending)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > sizeHint / 2)).reverse
      runtimeResult should beColumns("x").withRows(singleColumnInOrder(expected))
    }

    test(s"should handle order in multiple index seek, int ascending (${indexProvider.providerName()})") {
      val nodes =
        given {
          nodeGraph(5, "Milk")
          indexedNodeGraph("Honey", "prop") {
            case (node, i) => node.setProperty("prop", i % 10)
          }
        }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("prop")
        .projection("x.prop AS prop")
        .nodeIndexOperator("x:Honey(prop)",
          customQueryExpression = Some(ManyQueryExpression(listOf(literalInt(7), literalInt(2), literalInt(3)))),
          indexOrder = IndexOrderAscending)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes
        .collect(collectProp[Int](Set(7, 2, 3).contains))
        .sorted
      runtimeResult should beColumns("prop").withRows(singleColumnInOrder(expected))
    }

    test(s"should handle order in multiple index seek, string ascending (${indexProvider.providerName()})") {
      val nodes =
        given {
          nodeGraph(5, "Milk")
          indexedNodeGraph("Honey", "prop") {
            case (node, i) => node.setProperty("prop", (i % 10).toString)
          }
        }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("prop")
        .projection("x.prop AS prop")
        .nodeIndexOperator("x:Honey(prop)",
          customQueryExpression = Some(ManyQueryExpression(listOf(literal("7"), literal("2"), literal("3")))),
          indexOrder = IndexOrderAscending)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes
        .collect(collectProp[String](Set("7", "2", "3").contains))
        .sorted
      runtimeResult should beColumns("prop").withRows(singleColumnInOrder(expected))
    }

    test(s"should handle order in multiple index seek, int descending (${indexProvider.providerName()})") {
      val nodes =
        given {
          nodeGraph(5, "Milk")
          indexedNodeGraph("Honey", "prop") {
            case (node, i) => node.setProperty("prop", i % 10)
          }
        }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("prop")
        .projection("x.prop AS prop")
        .nodeIndexOperator("x:Honey(prop)",
          customQueryExpression = Some(ManyQueryExpression(listOf(literalInt(7), literalInt(2), literalInt(3)))),
          indexOrder = IndexOrderDescending)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes
        .collect(collectProp[Int](Set(7, 2, 3).contains))
        .sorted(Ordering.Int.reverse)
      runtimeResult should beColumns("prop").withRows(singleColumnInOrder(expected))
    }

    test(s"should handle order in multiple index seek, string descending (${indexProvider.providerName()})") {
      val nodes =
        given {
          nodeGraph(5, "Milk")
          indexedNodeGraph("Honey", "prop") {
            case (node, i) => node.setProperty("prop", (i % 10).toString)
          }
        }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("prop")
        .projection("x.prop AS prop")
        .nodeIndexOperator("x:Honey(prop)",
          customQueryExpression = Some(ManyQueryExpression(listOf(literal("7"), literal("2"), literal("3")))),
          indexOrder = IndexOrderDescending)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes
        .collect(collectProp[String](Set("7", "2", "3").contains))
        .sorted(Ordering.String.reverse)
      runtimeResult should beColumns("prop").withRows(singleColumnInOrder(expected))
    }

    //array properties
    test(s"should handle multiple index seek with overflowing morsels (${indexProvider.providerName()})") {
      // given
      given {
        indexedNodeGraph("A", "prop") { case (node, i) =>
          if (i % 2 == 0) node.setProperty("prop", 42)
          else node.setProperty("prop", 1337)
          node.createRelationshipTo(tx.createNode(), RelationshipType.withName("R1"))
          node.createRelationshipTo(tx.createNode(), RelationshipType.withName("R2"))
          node.createRelationshipTo(tx.createNode(), RelationshipType.withName("R3"))
          node.createRelationshipTo(tx.createNode(), RelationshipType.withName("R4"))
          node.createRelationshipTo(tx.createNode(), RelationshipType.withName("R5"))
        }
      }

      //when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nonFuseable()
        .expandAll("(x)-->(y)")
        .nodeIndexOperator("x:A(prop = 42 OR 1337)")
        .build()
      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withRows(rowCount(sizeHint * 5))
    }

    test(s"should exact (single) seek nodes of an index with an array property (${indexProvider.providerName()})") {
      val nodes = given {
        nodeGraph(5, "Milk")
        indexedNodeGraph("Honey", "prop") {
          case (node, i) if i % 10 == 0 => node.setProperty("prop", Array[Int](i))
        }
      }

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop = ???)", paramExpr = Some(listOf(literalInt(20))))
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      runtimeResult should beColumns("x").withSingleRow(nodes(20 / 10))
    }

    test(s"should seek nodes of a unique index with a property (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator(s"x:Honey(prop > ${sizeHint / 2})", unique = true)
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](_ > sizeHint / 2))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    test(s"should multi seek nodes of a unique index with property (${indexProvider.providerName()})") {
      val nodes = given(defaultIndexedNodeIntPropertyGraph())

      // when
      val logicalQuery = new LogicalQueryBuilder(this)
        .produceResults("x")
        .nodeIndexOperator("x:Honey(prop)",
          customQueryExpression = Some(ManyQueryExpression(listOf(Seq(-1L, 2L, -2L, 3L, 4L, 5L).map(literalInt):_*))),
          unique = true
        )
        .build()

      val runtimeResult = execute(logicalQuery, runtime)

      // then
      val expected = nodes.filter(propFilter[Int](Seq(2, 3, 4, 5).contains))
      runtimeResult should beColumns("x").withRows(singleColumn(expected))
    }

    def defaultRandomIndexedNodePropertyGraph(): Seq[Node] = {
      val propertyType = randomPropertyType()
      indexedNodeGraph("Honey", "prop") {
        case (n, i) if i % 10 == 0 => n.setProperty("prop", randomValue(propertyType).asObject())
      }
    }

    def defaultIndexedNodeIntPropertyGraph(): Seq[Node] = {
      nodeGraph(5, "Milk") // Unrelated label
      indexedNodeGraph("Honey", "prop") { case (n, i) if i % 10 == 0 => n.setProperty("prop", i) }
    }

    def indexedNodeGraph(indexedLabel: String, indexedProperties: String*)(propFunction: PartialFunction[(Node, Int), Unit]): Seq[Node] = {
      nodeIndexWithProvider(indexProvider.providerName(), indexedLabel, indexedProperties:_*)
      nodeGraph(sizeHint, indexedLabel).zipWithIndex.collect {
        case t@(n, _) if propFunction.isDefinedAt(t) =>
          propFunction.apply(t)
          n
      }
    }

  }

  test("should work with multiple index types") {
    val nodes = given {
      nodeIndex(IndexType.RANGE, "Label", "prop")
      nodeIndex(IndexType.TEXT, "Label", "prop")

      nodePropertyGraph(sizeHint, {
        case i if i % 2 == 0 => Map("prop" -> i)
        case i if i % 2 == 1 => Map("prop" -> i.toString)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .union()
      .|.nodeIndexOperator("x:Label(prop > 42)", indexType = IndexType.RANGE)
      .nodeIndexOperator("x:Label(prop CONTAINS '1')", indexType = IndexType.TEXT)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes.filter { n =>
      n.getProperty("prop") match {
        case s: String => s.contains("1")
        case i: Integer => i > 42
        case _ => false
      }
    }

    runtimeResult should beColumns("x").withRows(singleColumn(expected))
  }

  private def propFilter[T](predicate: T => Boolean): Node => Boolean = {
    n => predicate.apply(n.getProperty("prop").asInstanceOf[T])
  }

  private def collectProp[T](predicate: T => Boolean): PartialFunction[Node, T] = {
    case n if predicate(n.getProperty("prop").asInstanceOf[T]) => n.getProperty("prop").asInstanceOf[T]
  }
}

// Supported by interpreted, slotted, pipelined, not by parallel
trait NodeLockingUniqueIndexSeekTestBase[CONTEXT <: RuntimeContext] {
  self: NodeIndexSeekTestBase[CONTEXT] =>

  test("should grab shared lock when finding a node") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "Honey")
    }
    val propToFind = Random.nextInt(sizeHint)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator(s"x:Honey(prop = $propToFind)", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(propToFind)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should grab shared lock when finding a node (multiple properties)") {
    val nodes = given {
      uniqueIndex("Honey", "prop1", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop1" -> i, "prop2" -> s"$i")
      }, "Honey")
    }
    val propToFind = Random.nextInt(sizeHint)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator(s"x:Honey(prop1 = $propToFind, prop2 = '$propToFind')", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(propToFind)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should grab an exclusive lock when not finding a node") {
    given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "Honey")
    }
    val propToFind = sizeHint + 1

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator(s"x:Honey(prop = $propToFind)", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withNoRows().withLocks((EXCLUSIVE, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should not grab any lock when readOnly = true") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "Honey")
    }
    val propToFind = Random.nextInt(sizeHint)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator(s"x:Honey(prop = $propToFind)", unique = true)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(propToFind)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks()
  }

  test("should exact seek nodes of a locking unique index with a property") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop" -> i)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop = 20)", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(20)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should exact seek nodes of a locking composite unique index with properties") {
    val nodes = given {
      uniqueIndex("Honey", "prop1", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop1" -> i, "prop2" -> s"$i")
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop1 = 20, prop2 = '20')", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(20)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should exact (multiple, but identical) seek nodes of a locking unique index with a property") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop" -> i)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop = 20 OR 20)", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = Seq(nodes(20))
    runtimeResult should beColumns("x").withRows(singleColumn(expected)).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should exact seek nodes of a composite unique index with properties") {
    val nodes = given {
      uniqueIndex("Honey", "prop1", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop1" -> i, "prop2" -> s"$i")
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop1 = 20, prop2 = '20')", unique = true)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(20)
    runtimeResult should beColumns("x").withSingleRow(expected)
  }

  test("should seek nodes of a composite unique index with properties") {
    val nodes = given {
      uniqueIndex("Honey", "prop1", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop1" -> i, "prop2" -> s"$i")
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator(s"x:Honey(prop1 > ${sizeHint / 2}, prop2)", unique = true)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes.zipWithIndex.filter{ case (_, i) => i % 10 == 0 && i > sizeHint / 2}.map(_._1)
    runtimeResult should beColumns("x").withRows(singleColumn(expected))
  }

  test("should exact (multiple, not identical) seek nodes of a locking unique index with a property") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop" -> i)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop = 20 OR 30)", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = Seq(nodes(20), nodes(30))
    runtimeResult should beColumns("x").withRows(singleColumn(expected)).withLocks((SHARED, INDEX_ENTRY), (SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should support composite index and unique locking") {
    val nodes = given {
      nodeIndex("Honey", "prop", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop" -> i, "prop2" -> i.toString)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop = 10, prop2 = '10')", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(10)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should support composite unique index and unique locking") {
    val nodes = given {
      uniqueIndex("Honey", "prop", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop" -> i, "prop2" -> i.toString)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop = 10, prop2 = '10')", unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(10)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should cache properties in locking unique index") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i if i % 10 == 0 => Map("prop" -> i)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "prop")
      .projection("cache[x.prop] AS prop")
      .nodeIndexOperator("x:Honey(prop = 10)", _ => GetValue, unique = true)
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x", "prop").withSingleRow(nodes(10), 10).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test("should verify that two nodes are identical with locking reads") {
    // Temporarily disabled: AssertingMultiNodeSeekOperator is broken
    assume(runtime.name != "Pipelined")

    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .assertSameNode("x")
      .|.nodeIndexOperator("x:Honey(prop = 20)", unique = true)
      .nodeIndexOperator("x:Honey(prop = 20)", unique = true)
      .build(false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes(20)
    runtimeResult should beColumns("x").withSingleRow(expected).withLocks((SHARED, INDEX_ENTRY), (SHARED, LABEL))
  }

  test(s"should multi seek nodes of a unique index with locking") {
    val nodes = given {
      uniqueIndex("Honey", "prop")
      nodePropertyGraph(sizeHint, { case i if i % 10 == 0 => Map("prop" -> i) }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop)",
        customQueryExpression = Some(ManyQueryExpression(listOf(Seq(-1L, 0L, 1L, 10L, 20L).map(literalInt):_*))),
        unique = true
      )
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expectedLocks = Seq((EXCLUSIVE,INDEX_ENTRY), (EXCLUSIVE,INDEX_ENTRY), (SHARED,INDEX_ENTRY), (SHARED,INDEX_ENTRY), (SHARED,INDEX_ENTRY), (SHARED,LABEL))
    val expected = Seq(Array(nodes(0)), Array(nodes(10)), Array(nodes(20)))
    runtimeResult should beColumns("x").withRows(expected).withLocks(expectedLocks:_*)
  }
}

// Supported by slotted, pipelined, parallel (not compiled though because of composite index)
trait EnterpriseNodeIndexSeekTestBase[CONTEXT <: RuntimeContext] {
  self: NodeIndexSeekTestBase[CONTEXT] =>

  test("should support composite index with equality and equality check on the RHS of Apply with Node Key constraint") {
    val (milk, honey) = given {
      nodeKey("Honey", "prop", "prop2")
      val milk = nodeGraph(5, "Milk")
      val honey = nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i, "prop2" -> i.toString)
      }, "Honey")
      (milk, honey)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .projection("'borked' AS borked")
      .apply()
      .|.nodeIndexOperator("x:Honey(prop = 10, prop2 = '10')", unique = true, getValue = _ => GetValue, argumentIds = Set("a"))
      .distinct("a AS a")
      .nodeByLabelScan("a", "Milk", IndexOrderAscending)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected: Seq[Node] = for {
      _ <- milk
    } yield honey(10)
    runtimeResult should beColumns("x").withRows(singleColumn(expected))
  }
}

// Supported by slotted, pipelined, parallel (not compiled though because of composite index)
trait SerialEnterpriseNodeIndexSeekTestBase[CONTEXT <: RuntimeContext] {
  self: NodeIndexSeekTestBase[CONTEXT] =>

  test("should handle null in exact unique multiple seek") {
    given {
      nodeKey("Honey", "prop1", "prop2")
      nodeGraph(5, "Milk")
      nodePropertyGraph(sizeHint, {
        case i => Map("prop1" -> i, "prop2" -> i)
      }, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeIndexOperator("x:Honey(prop1 = 10, prop2 = ???)",  unique = true, paramExpr = Some(nullLiteral))
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withNoRows()
  }
}

abstract class ParallelNodeIndexSeekTestBase[CONTEXT <: RuntimeContext](
  edition: Edition[CONTEXT],
  runtime: CypherRuntime[CONTEXT],
  sizeHint: Int
) extends NodeIndexSeekTestBase[CONTEXT](edition, runtime, sizeHint) {
  private val supportedPropertyTypes: Array[ValueType] = {
    stringValueTypes ++ numericValueTypes :+ ValueType.BOOLEAN
  }

  // Parallel does not support functions at the moment so we can only use properties that have literals
  override def propertyValueTypes: Array[ValueType] = supportedPropertyTypes
}
