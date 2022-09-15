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
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.NestedPlanExistsExpression
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.cypher.internal.util.attribution.SequentialIdGen
import org.neo4j.graphdb.Label
import org.neo4j.graphdb.Node
import org.neo4j.graphdb.RelationshipType

import java.util.Collections
import scala.collection.JavaConverters.seqAsJavaListConverter

abstract class NestedPlanExpressionTestBase[CONTEXT <: RuntimeContext](
                                                               edition: Edition[CONTEXT],
                                                               runtime: CypherRuntime[CONTEXT],
                                                               sizeHint: Int
                                                             ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("should support nested plan collect with no rows") {
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanCollectExpressionProjection("x", "b.prop")
      .|.expand("(a)-->(b)")
      .|.allNodeScan("a")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(Seq(Array(Collections.emptyList())), listInAnyOrder = true)
  }

  test("should support nested plan collect with rows") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanCollectExpressionProjection("x", "b.prop")
      .|.expand("(a)-->(b)")
      .|.allNodeScan("a")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected =
      (0 until size).flatMap(_ => (0 until size)).toList.asJava
    runtimeResult should beColumns("x").withRows(Seq(Array(expected)), listInAnyOrder = true)
  }

  test("should support nested plan collect with null dependency") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanCollectExpressionProjection("x", "b.prop")
      .|.expand("(a)-->(b)")
      .|.argument("a")
      .optionalExpandAll("(b)-->(a)")
      .nodeByLabelScan("b", "B", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = (0 until size).map(_ => Array[Any](Collections.emptyList()))
    runtimeResult should beColumns("x").withRows(expected, listInAnyOrder = true)
  }

  test("should support nested plan collect with dependency") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanCollectExpressionProjection("x", "b.prop")
      .|.expand("(a)-->(b)")
      .|.argument("a")
      .nodeByLabelScan("a", "A", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected =
      (0 until size).map(_ => Array[Any]((0 until size).toList.asJava))
    runtimeResult should beColumns("x").withRows(expected, listInAnyOrder = true)
  }

  test("should support nested plan collect with var-expand") {
    // given
    val size = 10
    val (nodes, rels) = given { circleGraph(size) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanCollectExpressionProjection("x", "b")
      .|.expand("(a)-[*1..2]->(b)")
      .|.argument("a")
      .allNodeScan("a")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val relMap = rels.map(r => r.getStartNode -> r.getEndNode).toMap
    def varExpand(start: Node): Seq[Node] = {
      val hop1 = relMap(start)
      val hop2 = relMap(hop1)
      Seq(hop1, hop2)
    }
    val expected = nodes.map(a => Array[Any](varExpand(a).asJava))
    runtimeResult should beColumns("x").withRows(expected, listInAnyOrder = true)
  }

  test("should support nested plan exists with no rows") {
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanExistsExpressionProjection("x")
      .|.expand("(a)-->(b)")
      .|.allNodeScan("a")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withSingleRow(false)
  }

  test("should support nested plan exists with rows") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanExistsExpressionProjection("x")
      .|.expand("(a)-->(b)")
      .|.allNodeScan("a")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withSingleRow(true)
  }

  test("should support nested plan exists with index seek") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      nodeIndex("B", "prop")
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanExistsExpressionProjection("x")
      .|.expand("(b)<--(a)")
      .|.nodeIndexOperator(s"b:B(prop > 0)")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withSingleRow(true)
  }

  test("should support nested plan exists with null dependency") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanExistsExpressionProjection("x")
      .|.expand("(a)-->(b)")
      .|.argument("a")
      .optionalExpandAll("(b)-->(a)")
      .nodeByLabelScan("b", "B", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = (0 until size).map(_ => Array[Any](false))
    runtimeResult should beColumns("x").withRows(expected)
  }

  test("should support nested plan exists with dependency") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanExistsExpressionProjection("x")
      .|.expand("(a)-->(b)")
      .|.argument("a")
      .nodeByLabelScan("a", "A", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = (0 until size).map(_ => Array[Any](true))
    runtimeResult should beColumns("x").withRows(expected)
  }

  test("should support nested plan exists under nested apply") {
    // given
    val size = Math.sqrt(sizeHint).toInt
    given {
      bipartiteGraph(size, "A", "B", "R", PartialFunction.empty, { case i => Map("prop" -> i) })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .apply()
      .|.apply()
      .|.|.nestedPlanExistsExpressionProjection("x")
      .|.|.|.expand("(a)-->(b)")
      .|.|.|.argument("a")
      .|.|.argument()
      .|.argument()
      .nodeByLabelScan("a", "A", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = (0 until size).map(_ => Array[Any](true))
    runtimeResult should beColumns("x").withRows(expected)
  }

  test("should support nested plan exists as predicate of SelectOrSemiApply") {
    // given
    val seas = given {
      val seas = nodeGraph(7, "Sea")
      seas.zipWithIndex.foreach {
        case (sea, seaNumber) =>
          nodePropertyGraph(10, { case i => Map("isPirate" -> (seaNumber == 2 && i == 9))}, "Ship")
            .foreach(ship => ship.createRelationshipTo(sea, RelationshipType.withName("SAILS")))
      }
      seas
    }

    val idGen = new SequentialIdGen()

    val nestedPlan = new LogicalQueryBuilder(this, false, idGen = idGen, wholePlan = false)
      .filter("seaworthy.isPirate")
      .projection("ship as seaworthy")
      .expand("(sea)<-[:SAILS]-(ship)")
      .argument()
      .build()
      .logicalPlan

    val logicalQuery = new LogicalQueryBuilder(this, idGen = idGen)
      .produceResults("sea")
      .selectOrSemiApply(NestedPlanExistsExpression(nestedPlan, "exists(...)")(pos))
      .|.emptyResult()
      .|.argument()
      .nodeByLabelScan("sea", "Sea")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("sea").withRows(singleColumn(Seq(seas(2))))
  }

  test("should support cartesianProduct inside nestedPlan") {
    given {
      nodeIndex("A", "p")
      nodeIndex("B", "p")
      val a = tx.createNode(Label.label("A"))
      a.setProperty("p", 1)
      val b = tx.createNode(Label.label("B"))
      b.setProperty("p", 1)
      a.createRelationshipTo(b, RelationshipType.withName("R"))
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nestedPlanExistsExpressionProjection("x")
      .|.expandInto("(a)-->(b)")
      .|.cartesianProduct()
      .|.|.nodeIndexOperator("b:B(p=1)")
      .|.nodeIndexOperator("a:A(p=1)")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withSingleRow(true)
  }
}
