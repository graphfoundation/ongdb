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
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.graphdb.Label

abstract class NodeCountFromCountStoreTestBase[CONTEXT <: RuntimeContext](
                                                                           edition: Edition[CONTEXT],
                                                                           runtime: CypherRuntime[CONTEXT]
                                                                         ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {
  private val actualSize = 11

  test("should get count for single label node") {
    // given
    val nodes = given { nodeGraph(actualSize, "LabelA") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("LabelA")))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(nodes.size)))
  }

  test("should get count for label wildcard") {
    // given
    val nodes = given { nodeGraph(actualSize, "LabelA") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(None))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(nodes.size)))
  }

  test("should return zero for count when non-existent label") {
    // given
    given { nodeGraph(actualSize, "LabelA") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("NoLabel")))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(0)))
  }

  test("should handle label not present at compile time") {
    // given
    given { nodeGraph(actualSize, "LabelA") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("NotThereYet")))
      .build()

    val plan = buildPlan(logicalQuery, runtime)
    execute(plan) should beColumns("x").withRows(singleColumn(Seq(0)))

    given { tx.createNode(Label.label("NotThereYet")) }

    // then
    execute(plan) should beColumns("x").withRows(singleColumn(Seq(1)))
  }

  test("should return zero for count when one label is non-existent") {
    // given
    given { nodeGraph(actualSize, "LabelA") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("LabelA"), Some("NoLabel")))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(0)))
  }

  test("should get count for cartesian product of labels") {
    // given
    val nodes = given { nodeGraph(actualSize, "LabelA", "LabelB") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("LabelA"), Some("LabelB")))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(nodes.size * nodes.size)))
  }

  test("should work when followed by other operators") {
    // given
    val nodes = given { nodeGraph(actualSize, "LabelA", "LabelB") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .filter("x > 0")
      .nodeCountFromCountStore("x", List(Some("LabelA"), Some("LabelB")))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(nodes.size * nodes.size)))
  }

  test("should work on rhs of apply") {
    // given
    val nodes = given { nodeGraph(actualSize, "LabelA", "LabelB") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .filter("x > 0")
      .apply()
      .|.nodeCountFromCountStore("x", List(Some("LabelA"), Some("LabelB")))
      .nodeByLabelScan("n", "LabelA", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expectedCount: Long = nodes.size * nodes.size
    val expectedRows = nodes.map(_ => expectedCount)
    runtimeResult should beColumns("x").withRows(singleColumn(expectedRows))
  }

  test("should get count for cartesian product of identical labels") {
    // given
    val nodes = given { nodeGraph(actualSize, "LabelA") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("LabelA"), Some("LabelA"), Some("LabelA")))
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(Seq(nodes.size * nodes.size * nodes.size)))
  }

  test("should get count for cartesian product of identical labels not there at compile time") {
    // given an empty dn

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeCountFromCountStore("x", List(Some("NotThereYet"), Some("NotThereYet"), Some("NotThereYet")))
      .build()
    val plan = buildPlan(logicalQuery, runtime)

    //then count should be 0
    execute(plan) should beColumns("x").withRows(singleColumn(Seq(0)))

    //when we later create nodes with the label
    val nodes = given { nodeGraph(actualSize, "NotThereYet") }

    // then we should get the correct count
    execute(plan) should beColumns("x").withRows(singleColumn(Seq(nodes.size * nodes.size * nodes.size)))
  }
}
