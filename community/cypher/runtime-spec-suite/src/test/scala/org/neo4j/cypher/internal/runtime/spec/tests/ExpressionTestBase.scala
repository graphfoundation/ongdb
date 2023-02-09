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

import org.mockito.Mockito.when
import org.neo4j.cypher.internal.CypherRuntime
import org.neo4j.cypher.internal.RuntimeContext
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.exceptions.EntityNotFoundException
import org.neo4j.graphdb.Label.label
import org.neo4j.graphdb.Node
import org.neo4j.graphdb.Relationship
import org.neo4j.graphdb.RelationshipType
import org.neo4j.values.storable.Values.NO_VALUE
import org.neo4j.values.storable.Values.intValue
import org.neo4j.values.virtual.VirtualValues.list

abstract class ExpressionTestBase[CONTEXT <: RuntimeContext](edition: Edition[CONTEXT],
                                                             runtime: CypherRuntime[CONTEXT]) extends RuntimeTestSuite(edition, runtime) {
  test("hasLabel on top of allNodeScan") {
    // given
    val size = 100
    given {
      for (i <- 0 until size) {
        if (i % 2 == 0) {
          tx.createNode(label("Label"))
        } else {
          tx.createNode()
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasLabel")
      .projection("x:Label AS hasLabel")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasLabel").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("hasLabel on top of indexScan") {
    // given
    val size = 100
    given {
      nodeIndex("Label", "prop")
      for (i <- 0 until size) {
        if (i % 2 == 0) {
          tx.createNode(label("Label"), label("Other")).setProperty("prop", i)
        } else {
          tx.createNode(label("Label")).setProperty("prop", i)
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasLabel")
      .projection("x:Other AS hasLabel")
      .nodeIndexOperator("x:Label(prop)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasLabel").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("hasLabel on top of labelNodeScan") {
    // given
    val size = 100
    given {
      nodeIndex("Label", "prop")
      for (i <- 0 until size) {
        if (i % 2 == 0) {
          tx.createNode(label("Label"), label("Other")).setProperty("prop", i)
        } else {
          tx.createNode(label("Label")).setProperty("prop", i)
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasLabel")
      .projection("x:Other AS hasLabel")
      .nodeByLabelScan("x", "Label", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasLabel").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("hasLabel is false on non-existing node") {
    // given
    given { tx.createNode(label("Label")) }
    val node = mock[Node]
    when(node.getId).thenReturn(1337L)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasLabel")
      .projection("x:Label AS hasLabel")
      .input(nodes = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array(node)))

    // then
    runtimeResult should beColumns("hasLabel").withRows(singleColumn(Seq(false)))
  }

  test("should handle node property access on top of allNode") {
    // given
    val size = 100
    given {
      nodePropertyGraph(size, {
        case i: Int => Map("prop" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn(0 until size))
  }

  test("should handle node property access on top of labelScan") {
    // given
    val size = 100
    given {
      nodePropertyGraph(size, {
        case i: Int => Map("prop" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .nodeByLabelScan("x", "Label", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn(0 until size))
  }

  test("should handle node property access on top of indexScan") {
    // given
    val size = 100
    given {
      nodeIndex("Label", "prop")
      nodePropertyGraph(size, {
        case i: Int => Map("prop" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .nodeIndexOperator("x:Label(prop)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn(0 until size))
  }

  test("should handle hasProperty on top of allNode") {
    // given
    val size = 100
    given {
      nodePropertyGraph(size, {
        case i if i % 2 == 0 => Map("prop" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasProp")
      .projection("x.prop IS NOT NULL AS hasProp")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasProp").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("should handle hasProperty on top of labelScan") {
    // given
    val size = 100
    given {
      nodePropertyGraph(size, {
        case i if i % 2 == 0 => Map("prop" -> i)
      }, "Label")
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasProp")
      .projection("x.prop IS NOT NULL AS hasProp")
      .nodeByLabelScan("x", "Label", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasProp").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("should handle hasProperty on top of indexScan") {
    // given
    val size = 100
    given {
      nodeIndex("Label", "other")
      nodePropertyGraph(size, {
        case i if i % 2 == 0 => Map("prop" -> i, "other" -> i)
        case i => Map("other" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasProp")
      .projection("x.prop IS NOT NULL AS hasProp")
      .nodeIndexOperator("x:Label(other)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasProp").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("should handle relationship property exists - fuseable with expand") {
    val size = 100
    given {
      val (_, rels) = circleGraph(size, "Label")
      var i = 0
      rels.foreach { r =>
        if (i % 2 == 0) {
          r.setProperty("prop", i)
        }
        i += 1
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasProp")
      .projection("r.prop IS NOT NULL AS hasProp")
      .expandAll("(n)-[r]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasProp").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("should handle relationship property exists - separate pipeline") {
    val size = 100
    given {
      val (_, rels) = circleGraph(size, "Label")
      var i = 0
      rels.foreach { r =>
        if (i % 2 == 0) {
          r.setProperty("prop", i)
        }
        i += 1
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasProp")
      .apply()
      .|.projection("r.prop IS NOT NULL AS hasProp")
      .|.argument("r")
      .nonFuseable()
      .expandAll("(n)-[r]->(m)")
      .allNodeScan("n")
      .build(readOnly = false)

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasProp").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("should return null if node property is not there") {
    // given
    val size = 100
    given {
      nodePropertyGraph(size, {
        case i: Int => Map("prop" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.other AS prop")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn((0 until size).map(_ => null)))
  }

  test("should ignore if trying to get node property from node that isn't there") {
    // given
    given { nodePropertyGraph(1, { case i: Int => Map("prop" -> i)}, "Label") }
    val node = mock[Node]
    when(node.getId).thenReturn(1337L)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .input(nodes = Seq("x"))
      .build()
    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array(node)))

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn(Seq(null)))
  }

  test("should handle relationship property access") {
    // given
    val size = 100
    val  rels = given {
      val (_, rels) = circleGraph(size, "L")
      rels.foreach(_.setProperty("prop", 42))
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .input(relationships = Seq("x"))
      .build()
    val input = inputValues(rels.map(r => Array[Any](r)): _*).stream()
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn((0 until size).map(_ => 42)))
  }

  test("should return null if relationship property is not there") {
    // given
    val size = 100
    val  rels = given {
      val (_, rels) = circleGraph(size, "L")
      rels.foreach(_.setProperty("prop", 42))
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.other AS prop")
      .input(relationships = Seq("x"))
      .build()

    val input = inputValues(rels.map(r => Array[Any](r)): _*).stream()
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn((0 until size).map(_ => null)))
  }

  test("should ignore if trying to get relationship property from relationship that isn't there") {
    // given
    given { nodePropertyGraph(1, { case i: Int => Map("prop" -> i)}, "Label") }
    val relationship = mock[Relationship]
    when(relationship.getId).thenReturn(1337L)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .input(relationships = Seq("x"))
      .build()
    val input = inputValues(Array(relationship))
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumn(Seq(null)))
  }

  test("should read property from correct entity (rel/long slot)") {
    // given
    val size = 100
    val halfSize = size / 2
    val nodes =
      given {
        nodePropertyGraph(size, { case i => Map("prop" -> i) })
      }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("longNodeProp", "refNodeProp")
      .projection("longNode.prop AS longNodeProp", "refNode.prop AS refNodeProp")
      .input(nodes = Seq("longNode"), variables = Seq("refNode"))
      .build()

    val input = inputColumns(1, halfSize, i => nodes(i), i => nodes(halfSize + i))
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = (0 until halfSize).map(i => Array[Any](i, halfSize+i))
    runtimeResult should beColumns("longNodeProp", "refNodeProp").withRows(expected)
  }

  test("should read cached property from correct entity (rel/long slot)") {
    // given
    val size = 100
    val halfSize = size / 2
    val nodes =
      given {
        nodePropertyGraph(size, { case i => Map("prop" -> i) })
      }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("longNodeProp", "refNodeProp")
      .projection("cache[longNode.prop] AS longNodeProp", "cache[refNode.prop] AS refNodeProp")
      .input(nodes = Seq("longNode"), variables = Seq("refNode"))
      .build()

    val input = inputColumns(1, halfSize, i => nodes(i), i => nodes(halfSize + i))
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = (0 until halfSize).map(i => Array[Any](i, halfSize+i))
    runtimeResult should beColumns("longNodeProp", "refNodeProp").withRows(expected)
  }

  test("result of all function should be a boolean") {
    // given
    val size = 100
    val input = for (i <- 0 until size) yield Array[Any](i)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .projection("all(a IN [x] WHERE [1,2,3]) AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for (i <- 0 until size) yield Array[Any](i, true)
    runtimeResult should beColumns("x", "y").withRows(expected)
  }

  test("result of none function should be a boolean") {
    // given
    val size = 100
    val input = for (i <- 0 until size) yield Array[Any](i)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .projection("none(a IN [x] WHERE [1,2,3]) AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for (i <- 0 until size) yield Array[Any](i, false)
    runtimeResult should beColumns("x", "y").withRows(expected)
  }

  test("result of any function should be a boolean") {
    // given
    val size = 100
    val input = for (i <- 0 until size) yield Array[Any](i)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .projection("any(a IN [x] WHERE [1,2,3]) AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for (i <- 0 until size) yield Array[Any](i, true)
    runtimeResult should beColumns("x", "y").withRows(expected)
  }

  test("result of single function should be a boolean") {
    // given
    val size = 100
    val input = for (i <- 0 until size) yield Array[Any](i)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .projection("single(a IN [x] WHERE [1,2,3]) AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for (i <- 0 until size) yield Array[Any](i, true)
    runtimeResult should beColumns("x", "y").withRows(expected)
  }

  test("AND: should fail if all predicates fail for some input") {

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("1/x > 1 AND 1/x > 1 AND 1/x > 1 AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array[Any](1), Array[Any](0), Array[Any](1)))

    an[org.neo4j.exceptions.ArithmeticException] should be thrownBy consume(runtimeResult)
  }

  test("AND: should return FALSE if at least one predicate is FALSE") {

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("1/x > 1 AND TRUE AND FALSE AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array[Any](1), Array[Any](0), Array[Any](1)))

    runtimeResult should beColumns("y").withRows(singleColumn(List(false, false, false)))
  }

  test("AND: should fail if one predicate fails and no other is FALSE") {

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("1/x > 1 AND TRUE AND TRUE AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array[Any](1), Array[Any](0), Array[Any](1)))

    an[org.neo4j.exceptions.ArithmeticException] should be thrownBy consume(runtimeResult)
  }

  test("OR: should fail if all predicates fail for some input") {

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("1/x > 0 OR 1/x > 0 OR 1/x > 0 AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array[Any](1), Array[Any](0), Array[Any](1)))

    an[org.neo4j.exceptions.ArithmeticException] should be thrownBy consume(runtimeResult)
  }

  test("OR: should return TRUE if at least one predicate is TRUE") {

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("1/x > 0 OR FALSE OR TRUE AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array[Any](1), Array[Any](0), Array[Any](1)))

    runtimeResult should beColumns("y").withRows(singleColumn(List(true, true, true)))
  }

  test("OR: should fail if one predicate fails and no other is FALSE") {

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("1/x > 0 OR FALSE OR FALSE AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array[Any](1), Array[Any](0), Array[Any](1)))

    an[org.neo4j.exceptions.ArithmeticException] should be thrownBy consume(runtimeResult)
  }

  test("should filter with has any label predicate") {
    // given
    val size = 100
    val nodes = given {
      Range(0, size).map {
        case i if i % 5 == 0 => runtimeTestSupport.tx.createNode()
        case i if i % 5 == 1 => runtimeTestSupport.tx.createNode(label("A"))
        case i if i % 5 == 2 => runtimeTestSupport.tx.createNode(label("B"))
        case i if i % 5 == 3 => runtimeTestSupport.tx.createNode(label("C"))
        case i if i % 5 == 4 => runtimeTestSupport.tx.createNode(label("A"), label("B"), label("C"))
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .filterExpression(hasAnyLabel(varFor("n"), "C", "B"))
      .allNodeScan("n")
      .build()

    val result = execute(logicalQuery, runtime)
    consume(result)

    // then
    val expected = nodes.filter(n => n.hasLabel(label("C")) || n.hasLabel(label("B")))
    result should beColumns("n").withRows(singleColumn(expected))
  }

  test("should filter with has any label predicate and input nodes") {
    // given
    val size = 100
    val nodes = given {
      Range(0, size).map {
        case i if i % 5 == 0 => runtimeTestSupport.tx.createNode()
        case i if i % 5 == 1 => runtimeTestSupport.tx.createNode(label("A"))
        case i if i % 5 == 2 => runtimeTestSupport.tx.createNode(label("B"))
        case i if i % 5 == 3 => runtimeTestSupport.tx.createNode(label("C"))
        case i if i % 5 == 4 => runtimeTestSupport.tx.createNode(label("A"), label("B"), label("C"))
      }
    }

    val input = inputValues(nodes.map(r => Array[Any](r)): _*).stream()

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .filterExpression(hasAnyLabel(varFor("n"), "C", "B"))
      .input(nodes = Seq("n"))
      .build()

    val result = execute(logicalQuery, runtime, input)
    consume(result)

    // then
    val expected = nodes.filter(n => n.hasLabel(label("C")) || n.hasLabel(label("B")))
    result should beColumns("n").withRows(singleColumn(expected))
  }

  test("should handle non-existing node with has any label expression") {
    // given
    given { tx.createNode(label("Label")) }
    val node = mock[Node]
    when(node.getId).thenReturn(1337L)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n")
      .filterExpression(hasAnyLabel("n", "Label"))
      .input(nodes = Seq("n"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array(node)))

    // then
    runtimeResult should beColumns("n").withNoRows()
  }
}

// Supported by all non-parallel runtimes
trait ThreadUnsafeExpressionTests[CONTEXT <: RuntimeContext] {
  self: ExpressionTestBase[CONTEXT] =>

  test("should get type of relationship") {
    // given
    val size = 11
    given { chainGraphs(size, "TO") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("t")
      .projection("type(r) AS t")
      .expand("(x)-[r]->(y)")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("t").withRows(singleColumn((1 to size).map(_ => "TO")))
  }
}

// Supported by all runtimes that can deal with changes in the tx-state
trait ExpressionWithTxStateChangesTests[CONTEXT <: RuntimeContext] {
  self: ExpressionTestBase[CONTEXT] =>

  test("hasLabel is false on deleted node") {
    // given
    val node = given { tx.createNode(label("Label")) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasLabel")
      .projection("x:Label AS hasLabel")
      .input(nodes = Seq("x"))
      .build()

    node.delete()
    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array(node)))

    // then
    runtimeResult should beColumns("hasLabel").withRows(singleColumn(Seq(false)))
  }

  test("should throw if node was deleted before accessing node property") {
    // given
    val nodes = given {
      nodePropertyGraph(1, {
        case i: Int => Map("prop" -> i)
      }, "Label")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .input(nodes = Seq("x"))
      .build()
    nodes.head.delete()
    val input = inputValues(nodes.map(n => Array[Any](n)): _*).stream()

    // then
    an [EntityNotFoundException] should be thrownBy consume(execute(logicalQuery, runtime, input))
  }

  test("should throw if relationship was deleted before accessing relationship property") {
    // given
    val  rels = given {
      val (_, rels) = circleGraph(2, "L")
      rels.foreach(_.setProperty("prop", 42))
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop")
      .projection("x.prop AS prop")
      .input(relationships = Seq("x"))
      .build()
    rels.head.delete()
    val input = inputValues(rels.map(r => Array[Any](r)): _*).stream()

    // then
    an [EntityNotFoundException] should be thrownBy consume(execute(logicalQuery, runtime, input))
  }

  test("should handle IN list") {
    // given
    val size = 100
    val input = for (i <- 0 until size) yield Array[Any](list((0 to i).map(intValue):_*))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y")
      .projection("5 IN x AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for (i <- 0 until size) yield Array[Any]((0 to i).toArray, i >= 5)
    runtimeResult should beColumns("x", "y").withRows(expected)
  }

  test("should handle IN list where list contains nulls") {
    // given
    val size = 100
    val input = for (s <- 0 until size) yield Array[Any](list((0 to s).map(i => if (i % 2 == 0) NO_VALUE else intValue(i)):_*))

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y")
      .projection("5 IN x AS y")
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for (i <- 0 until size) yield Array[Any](if (i >= 5) true else null)
    runtimeResult should beColumns("y").withRows(expected)
  }

  test("hasType on top of expand all") {
    // given
    val size = 100
    given {
      for (i <- 0 until size) {
        if (i % 2 == 0) {
          tx.createNode().createRelationshipTo(tx.createNode(), RelationshipType.withName("A"))
        } else {
          tx.createNode().createRelationshipTo(tx.createNode(), RelationshipType.withName("B"))
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasType")
      .projection("r:A AS hasType")
      .expand("(x)-[r]->(y)")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasType").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("hasType on top of expand into") {
    // given
    val size = 100
    given {
      for (i <- 0 until size) {
        if (i % 2 == 0) {
          tx.createNode(label("START")).createRelationshipTo(tx.createNode(label("END")), RelationshipType.withName("A"))
        } else {
          tx.createNode(label("START")).createRelationshipTo(tx.createNode(label("END")), RelationshipType.withName("B"))
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasType")
      .projection("r:A AS hasType")
      .expandInto("(x)-[r]->(y)")
      .cartesianProduct()
      .|.nodeByLabelScan("y", "END")
      .nodeByLabelScan("x", "START")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("hasType").withRows(singleColumn((0 until size).map(_ % 2 == 0)))
  }

  test("hasType on top of optional expand all") {
    // given
    val size = 100
    given {
      for (i <- 0 until size) {
        if (i % 3 == 0) {
          tx.createNode(label("START")).createRelationshipTo(tx.createNode(), RelationshipType.withName("A"))
        } else if (i % 3 == 1) {
          tx.createNode(label("START")).createRelationshipTo(tx.createNode(), RelationshipType.withName("B"))
        } else {
          tx.createNode(label("START"))
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasType")
      .projection("r:A AS hasType")
      .optionalExpandAll("(x)-[r]->(y)")
      .nodeByLabelScan("x", "START")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    runtimeResult should beColumns("hasType").withRows(singleColumn((0 until size).map {
      case i if i % 3 == 0 => true
      case i if i % 3 == 1 => false
      case i => null
    }))
  }

  test("hasType on top of optional expand into") {
    // given
    val size = 100
    given {
      for (i <- 0 until size) {
        if (i % 3 == 0) {
          tx.createNode(label("START")).createRelationshipTo(tx.createNode(label("END")), RelationshipType.withName("A"))
        } else if (i % 3 == 1) {
          tx.createNode(label("START")).createRelationshipTo(tx.createNode(label("END")), RelationshipType.withName("B"))
        } else {
          tx.createNode(label("START"))
          tx.createNode(label("END"))
        }
      }
    }
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasType")
      .projection("r:A AS hasType")
      .optionalExpandInto("(x)-[r]->(y)")
      .cartesianProduct()
      .|.nodeByLabelScan("y", "END")
      .nodeByLabelScan("x", "START")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    runtimeResult should beColumns("hasType").withRows(singleColumn((0 until size*size).map {
      case i if i >= size => null
      case i if i % 3 == 0 => true
      case i if i % 3 == 1 => false
      case _ => null
    }))
  }

  test("should handle deleted node with has any label expression") {
    // given
    val node = given { tx.createNode(label("Label")) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("hasLabel")
      .projection(Map("hasLabel" -> hasAnyLabel("x", "Label")))
      .input(nodes = Seq("x"))
      .build()

    node.delete()
    val runtimeResult = execute(logicalQuery, runtime, inputValues(Array(node)))

    // then
    runtimeResult should beColumns("hasLabel").withRows(singleColumn(Seq(false)))
  }
}
