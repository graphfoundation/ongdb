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
import org.neo4j.cypher.internal.logical.plans.GetValue
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite

abstract class RelationshipIndexEndsWithScanTestBase[CONTEXT <: RuntimeContext](
                                                             edition: Edition[CONTEXT],
                                                             runtime: CypherRuntime[CONTEXT],
                                                             sizeHint: Int
                                                           ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("should be case sensitive for ENDS WITH with directed index scan") {
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) if i % 2 == 0 => r.setProperty("text", "CASE")
        case (r, _) => r.setProperty("text", "case")
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("text")
      .projection("r.text AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'se')]->(y)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = List.fill(sizeHint / 2)("case")
    runtimeResult should beColumns("text").withRows(singleColumn(expected))
  }

  test("should be case sensitive for ENDS WITH with undirected index scan") {
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) if i % 2 == 0 => r.setProperty("text", "CASE")
        case (r, _) => r.setProperty("text", "case")
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("text")
      .projection("r.text AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'se')]-(y)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = List.fill(sizeHint)("case")
    runtimeResult should beColumns("text").withRows(singleColumn(expected))
  }

  test("should handle null input with direction") {
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) if i % 2 == 0 => r.setProperty("text", "CASE")
        case (r, _) => r.setProperty("text", "case")
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("text")
      .projection("r.text AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH ???)]->(y)", paramExpr = Some(nullLiteral))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("text").withNoRows()
  }

  test("should handle null input with no direction") {
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) if i % 2 == 0 => r.setProperty("text", "CASE")
        case (r, _) => r.setProperty("text", "case")
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("text")
      .projection("r.text AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH ???)]-(y)", paramExpr = Some(nullLiteral))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("text").withNoRows()
  }

  test("directed scan should handle non-text input") {
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) if i % 2 == 0 => r.setProperty("text", "CASE")
        case (r, _) => r.setProperty("text", "case")
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("text")
      .projection("x.text AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH 1337)]->(y)")
      .build()

    execute(logicalQuery, runtime) should beColumns("text").withNoRows()
  }

  test("undirected scan should handle non-text input") {
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) if i % 2 == 0 => r.setProperty("text", "CASE")
        case (r, _) => r.setProperty("text", "case")
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("text")
      .projection("x.text AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH 1337)]-(y)")
      .build()

    execute(logicalQuery, runtime) should beColumns("text").withNoRows()
  }

  test("directed scan should cache properties") {
    val rels = given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("text", i.toString)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r", "text")
      .projection("cacheR[r.text] AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH '1')]->(y)", _ => GetValue)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = rels.zipWithIndex.collect { case (r, i) if i.toString.endsWith("1") => Array(r, i.toString) }
    runtimeResult should beColumns("r", "text").withRows(expected)
  }

  test("undirected scan should cache properties") {
    val rels = given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("text", i.toString)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "text")
      .projection("cacheR[r.text] AS text")
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH '1')]-(y)", _ => GetValue)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = rels.zipWithIndex.flatMap {
      case (r, i) if i.toString.endsWith("1") =>
        Seq(
          Array(r.getStartNode, r.getEndNode, i.toString),
          Array(r.getEndNode, r.getStartNode, i.toString)
        )
      case _ => Seq.empty
    }
    runtimeResult should beColumns("x", "y", "text").withRows(expected)
  }

  test("should handle directed scan on the RHS of an Apply") {
    val rels = given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("text", i.toString)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "r", "y")
      .apply()
      .|.relationshipIndexOperator("(x)-[r:R(text ENDS WITH '1')]->(y)")
      .input(variables = Seq("i"))
      .build()

    val input = (1 to 10).map(i => Array[Any](i))
    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for {_ <- 1 to 10
                        r <- rels.filter(_.getProperty("text").asInstanceOf[String].endsWith("1"))} yield Array(r.getStartNode, r, r.getEndNode)

    runtimeResult should beColumns("x", "r", "y").withRows(expected)
  }

  test("should handle undirected scan on the RHS of an Apply") {
    val rels = given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("text", i.toString)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "r", "y")
      .apply()
      .|.relationshipIndexOperator("(x)-[r:R(text ENDS WITH '1')]-(y)")
      .input(variables = Seq("i"))
      .build()

    val input = (1 to 10).map(i => Array[Any](i))
    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    // then
    val expected = for {_ <- 1 to 10
                        r <- rels.filter(_.getProperty("text").asInstanceOf[String].endsWith("1"))} yield Seq(Array(r.getStartNode, r, r.getEndNode), Array(r.getEndNode, r, r.getStartNode))

    runtimeResult should beColumns("x", "r", "y").withRows(expected.flatten)
  }

  test("should handle directed scan and cartesian product") {
    val rels = given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("text", i.toString)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r1", "r2")
      .cartesianProduct()
      .|.relationshipIndexOperator("(x2)-[r2:R(text ENDS WITH '2')]->(y2)")
      .relationshipIndexOperator("(x1)-[r1:R(text ENDS WITH '1')]->(y1)")
      .build()
    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {r1 <- rels.filter(_.getProperty("text").asInstanceOf[String].endsWith("1"))
                        r2 <- rels.filter(_.getProperty("text").asInstanceOf[String].endsWith("2"))} yield Array(r1, r2)

    runtimeResult should beColumns("r1", "r2").withRows(expected)
  }

  test("should handle undirected scan and cartesian product") {
    val rels = given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, i) => r.setProperty("text", i.toString)
      }
      rels
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("r1", "r2")
      .cartesianProduct()
      .|.relationshipIndexOperator("(x2)-[r2:R(text ENDS WITH '2')]-(y2)")
      .relationshipIndexOperator("(x1)-[r1:R(text ENDS WITH '1')]-(y1)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {r1 <- rels.filter(_.getProperty("text").asInstanceOf[String].endsWith("1"))
                        r2 <- rels.filter(_.getProperty("text").asInstanceOf[String].endsWith("2"))} yield Seq.fill(4)(Array(r1, r2))
    runtimeResult should beColumns("r1", "r2").withRows(expected.flatten)
  }

  test("aggregation and limit on top of directed scan") {
    // given
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, _) => r.setProperty("text", "value")
      }
      rels
    }
    val limit = sizeHint / 10

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("c")
      .aggregation(Seq.empty, Seq("count(*) AS c"))
      .limit(limit)
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'ue')]->(y)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("c").withRows(singleRow(limit))
  }

  test("aggregation and limit on top of undirected scan") {
    // given
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, _) => r.setProperty("text", "value")
      }
      rels
    }
    val limit = sizeHint / 10

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("c")
      .aggregation(Seq.empty, Seq("count(*) AS c"))
      .limit(limit)
      .relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'ue')]->(y)")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("c").withRows(singleRow(limit))
  }

  test("limit and directed scan on the RHS of an apply") {
    // given
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, _) => r.setProperty("text", "value")
      }
    }
    val limit = 10

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("value")
      .apply()
      .|.projection("r.text AS value")
      .|.limit(limit)
      .|.relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'alue')]->(y)", argumentIds = Set("i"))
      .input(variables = Seq("i"))
      .build()

    val input = (1 to 100).map(i => Array[Any](i))
    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    //then
    runtimeResult should beColumns("value").withRows(rowCount(limit * 100 ))
  }

  test("limit and undirected scan on the RHS of an apply") {
    // given
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, _) => r.setProperty("text", "value")
      }
    }
    val limit = 10

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("value")
      .apply()
      .|.projection("r.text AS value")
      .|.limit(limit)
      .|.relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'alue')]-(y)", argumentIds = Set("i"))
      .input(variables = Seq("i"))
      .build()

    val input = (1 to 100).map(i => Array[Any](i))
    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    //then
    runtimeResult should beColumns("value").withRows(rowCount(limit * 100 ))
  }

  test("limit on top of apply with directed scan on the RHS of an apply") {
    // given
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, _) => r.setProperty("text", "value")
      }
    }
    val limit = 10

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("value")
      .limit(limit)
      .apply()
      .|.projection("r.text AS value")
      .|.relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'alue')]->(y)", argumentIds = Set("i"))
      .input(variables = Seq("i"))
      .build()

    val input = (1 to 100).map(i => Array[Any](i))
    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    //then
    runtimeResult should beColumns("value").withRows(rowCount(limit))
  }

  test("limit on top of apply with undirected scan on the RHS of an apply") {
    // given
    given {
      relationshipIndex("R", "text")
      val (_, rels) = circleGraph(sizeHint)
      rels.zipWithIndex.foreach {
        case (r, _) => r.setProperty("text", "value")
      }
    }
    val limit = 10

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("value")
      .limit(limit)
      .apply()
      .|.projection("r.text AS value")
      .|.relationshipIndexOperator("(x)-[r:R(text ENDS WITH 'alue')]-(y)", argumentIds = Set("i"))
      .input(variables = Seq("i"))
      .build()

    val input = (1 to 100).map(i => Array[Any](i))
    val runtimeResult = execute(logicalQuery, runtime, inputValues(input:_*))

    //then
    runtimeResult should beColumns("value").withRows(rowCount(limit))
  }
}