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
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderDescending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite

abstract class LabelScanTestBase[CONTEXT <: RuntimeContext](
                                                             edition: Edition[CONTEXT],
                                                             runtime: CypherRuntime[CONTEXT],
                                                             sizeHint: Int
                                                           ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("should scan all nodes of a label") {
    // given
    val nodes = given {
      nodeGraph(sizeHint, "Butter")
      nodeGraph(sizeHint, "Almond")
      nodeGraph(sizeHint, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeByLabelScan("x", "Honey", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumn(nodes))
  }

  test("should scan all nodes of a label in ascending order") {
    // given
    val nodes = given {
      nodeGraph(sizeHint, "Butter")
      nodeGraph(sizeHint, "Almond")
      nodeGraph(sizeHint, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeByLabelScan("x", "Honey", IndexOrderAscending)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumnInOrder(nodes.sortBy(_.getId)))
  }

  test("should scan all nodes of a label in descending order") {
    // given
    val nodes = given {
      nodeGraph(sizeHint, "Butter")
      nodeGraph(sizeHint, "Almond")
      nodeGraph(sizeHint, "Honey")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeByLabelScan("x", "Honey", IndexOrderDescending)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumnInOrder(nodes.sortBy(_.getId * -1)))
  }

  test("should scan empty graph") {
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeByLabelScan("x", "Honey", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withNoRows()
  }

  test("should handle multiple scans") {
    // given
    val nodes = given { nodeGraph(10, "Honey") }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y", "z", "x")
      .apply()
      .|.nodeByLabelScan("x", "Honey", IndexOrderNone)
      .apply()
      .|.nodeByLabelScan("y", "Honey", IndexOrderNone)
      .nodeByLabelScan("z", "Honey", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {x <- nodes; y <- nodes; z <- nodes} yield Array(y, z, x)
    runtimeResult should beColumns("y", "z", "x").withRows(expected)
  }
}
