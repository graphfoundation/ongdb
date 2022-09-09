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
import org.neo4j.cypher.internal.logical.plans.IndexOrderAscending
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.runtime.spec.Edition
import org.neo4j.cypher.internal.runtime.spec.LogicalQueryBuilder
import org.neo4j.cypher.internal.runtime.spec.RuntimeTestSuite
import org.neo4j.graphdb.Label
import org.neo4j.graphdb.Node

abstract class OrderedUnionTestBase[CONTEXT <: RuntimeContext](
                                                                edition: Edition[CONTEXT],
                                                                runtime: CypherRuntime[CONTEXT],
                                                                sizeHint: Int
                                                              ) extends RuntimeTestSuite[CONTEXT](edition, runtime) {

  test("should union two empty streams") {
    given {
      nodeGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.filter("false")
      .|.allNodeScan("x")
      .filter("false")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    runtimeResult should beColumns("x").withNoRows()
  }

  test("should union single variable") {
    val inputLeft = inputColumns(nBatches = sizeHint / 10, batchSize = 10, x => x * 2)
    val inputRight = (0 until sizeHint).map(x => x * 2 + 1).mkString("[", ",", "]")

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.unwind(s"$inputRight AS x")
      .|.argument()
      .input(variables = Seq("x"))
      .build()

    val runtimeResult = execute(logicalQuery, runtime, inputLeft)

    runtimeResult should beColumns("x").withRows(singleColumnInOrder(0 until sizeHint * 2))
  }

  test("should union single node variable") {
    // given
    val nodes = given {
      val nodes = nodeGraph(Math.sqrt(sizeHint).toInt)
      nodes.zipWithIndex.foreach {
        case (node, i) => node.addLabel(Label.label(if (i % 2 == 0) "A" else "B"))
      }
      nodes
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.nodeByLabelScan("x", "B", IndexOrderAscending)
      .nodeByLabelScan("x", "A", IndexOrderAscending)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x").withRows(singleColumnInOrder(nodes))
  }

  test("should union node and non-node variable") {
    // given
    val (as, bs) = given {
      val nodes = nodeGraph(Math.sqrt(sizeHint).toInt)
      val (asWI, bsWI) = nodes.zipWithIndex.partition(_._2 % 2 == 0)
      val as = asWI.map(_._1)
      val bs = bsWI.map(_._1)

      as.foreach(_.addLabel(Label.label("A")))
      bs.foreach(_.addLabel(Label.label("B")))
      (as, bs)
    }
    val yLeftNums = 0 until 40 by 2
    val yLeft = yLeftNums.mkString("[", ",", "]")
    val yRightNums = 0 until 20
    val yRight = yRightNums.mkString("[", ",", "]")

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"), Ascending("y"))).withLeveragedOrder()
      .|.unwind(s"$yRight as y")
      .|.nodeByLabelScan("x", "B", IndexOrderAscending)
      .unwind(s"$yLeft as y")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    val left = for {
      x <- as ++ bs
      y <- yLeftNums
    } yield Array(x, y)
    val right = for {
      x <- bs
      y <- yRightNums
    } yield Array(x, y)
    val expected = (left ++ right).sortBy(row => (row(0).asInstanceOf[Node].getId, row(1).asInstanceOf[Int]))

    // then
    runtimeResult should beColumns("x", "y").withRows(inOrder(expected))
  }

  test("should union many variables in permuted order") {
    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "y", "z").withLeveragedOrder()
      .orderedUnion(sortedOn = Seq(Ascending("x"), Ascending("y"), Ascending("z"))).withLeveragedOrder()
      .|.projection("a+10 AS x", "a+20 AS y", "a+30 AS z")
      .|.unwind("[1,2,3,4,5,6,7,8,9] AS a")
      .|.argument()
      .projection("'ho' AS y", "'hi' AS x", "'humbug' AS z")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("x", "y", "z").withRows(inOrder(
      Array("hi", "ho", "humbug") +: (1 to 9).map(a => Array[Any](a + 10, a + 20, a + 30))
    ))
  }

  test("should union cached properties") {
    val size = sizeHint / 2
    given {
      val nodes = nodePropertyGraph(size, { case i => Map("prop" -> i) })
      nodes.zipWithIndex.foreach {
        case (node, i) => node.addLabel(Label.label(if (i % 2 == 0) "A" else "B"))
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("prop").withLeveragedOrder()
      .projection("cache[x.prop] AS prop").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.cacheProperties("cache[x.prop]")
      .|.nodeByLabelScan("x", "B")
      .cacheProperties("cache[x.prop]")
      .nodeByLabelScan("x", "A")
      .build()

    val runtimeResult = profile(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("prop").withRows(singleColumnInOrder(0 until size))
    val queryProfile = runtimeResult.runtimeResult.queryProfile()
    queryProfile.operatorProfile(1).dbHits() shouldBe 0 // projection
  }

  test("should union different cached properties from left and right") {
    val size = sizeHint / 2
    given {
      val nodes = nodePropertyGraph(size, { case i => Map("foo" -> s"foo-$i", "bar" -> s"bar-$i") })
      nodes.zipWithIndex.foreach {
        case (node, i) => node.addLabel(Label.label(if (i % 2 == 0) "A" else "B"))
      }
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("foo", "bar").withLeveragedOrder()
      .projection("cache[x.foo] AS foo", "cache[x.bar] AS bar").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.cacheProperties("cache[x.bar]")
      .|.nodeByLabelScan("x", "B")
      .cacheProperties("cache[x.foo]")
      .nodeByLabelScan("x", "A")
      .build()

    val runtimeResult = profile(logicalQuery, runtime)

    val expected = (0 until size).map(i => Array(s"foo-$i", s"bar-$i"))

    // then
    runtimeResult should beColumns("foo", "bar").withRows(inOrder(expected))
  }

  test("should union under apply") {
    assume(!isParallel)

    val size = Math.sqrt(sizeHint).toInt
    // given
    val nodes = given {
      val nodes = nodeGraph(size)
      nodes.zipWithIndex.foreach {
        case (node, i) => node.addLabel(Label.label(if (i % 2 == 0) "Y" else "Z"))
      }
      nodes
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "res2").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.projection("res AS res2").withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("res"))).withLeveragedOrder()
      .|.|.projection("z AS res")
      .|.|.nodeByLabelScan("z", "Z", IndexOrderAscending, "x")
      .|.projection("y AS res")
      .|.nodeByLabelScan("y", "Y", IndexOrderAscending, "x")
      .input(variables = Seq("x"))
      .build()

    val inputVals = randomValues(size)
    val input = inputValues(inputVals.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = for {
      x <- inputVals
      res2 <- nodes
    } yield Array(x, res2)

    runtimeResult should beColumns("x", "res2").withRows(inOrder(expected))
  }

  test("should union with alias under apply") {
    assume(!isParallel)

    val size = Math.sqrt(sizeHint).toInt
    // given
    val nodes = given {
      val nodes = nodeGraph(size)
      nodes.zipWithIndex.foreach {
        case (node, i) => node.addLabel(Label.label(if (i % 2 == 0) "Y" else "Z"))
      }
      nodes
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "res2").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.projection("res AS res2").withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("res"))).withLeveragedOrder()
      .|.|.projection("x AS res")
      .|.|.argument("x")
      .|.projection("y AS res")
      .|.nodeByLabelScan("y", "Y", IndexOrderAscending, "x")
      .input(variables = Seq("x"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = for {
      x <- nodes
      res2 <- (nodes.filter(_.hasLabel(Label.label("Y"))) :+ x).sortBy(_.getId)
    } yield Array(x, res2)

    runtimeResult should beColumns("x", "res2").withRows(inOrder(expected))
  }

  test("should nested union") {
    val size = sizeHint / 2
    // given
    val nodes = given {
      nodeGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.allNodeScan("x")
      .|.allNodeScan("x")
      .input(nodes = Seq("x"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = for {
      x <- nodes.flatMap(n => Seq(n, n, n))
    } yield Array(x)

    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("should nested union under apply") {
    assume(!isParallel)

    val size = Math.max(sizeHint / 100, 10)
    // given
    val nodes = given {
      nodeGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "x").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.allNodeScan("x")
      .|.|.allNodeScan("x")
      .|.allNodeScan("x")
      .input(nodes = Seq("n"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = for {
      n <- nodes
      x <- nodes.flatMap(n => Seq(n, n, n))
    } yield Array(n, x)

    runtimeResult should beColumns("n", "x").withRows(inOrder(expected))
  }

  test("should nested union under apply 2") {
    assume(!isParallel)

    val sizeHint = 10
    val argSize = Math.max(sizeHint / 100, 10)
    val rangeLimit1 = Math.max(sizeHint / 100, 10)
    val rangeLimit2 = rangeLimit1 + Math.max(sizeHint / 100, 10)
    val rangeLimit3 = rangeLimit2 + Math.max(sizeHint / 100, 10)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "x").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.unwind(s"range(${rangeLimit1 + 1},$rangeLimit2) as x")
      .|.|.|.argument()
      .|.|.unwind(s"range(1,$rangeLimit1) as x")
      .|.|.argument()
      .|.unwind(s"range(${rangeLimit2 + 1},$rangeLimit3) as x")
      .|.argument()
      .unwind(s"range(1,$argSize) as n")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      n <- 1 to argSize
      x <- 1 to rangeLimit3
    } yield Array(n, x)

    runtimeResult should beColumns("n", "x").withRows(inOrder(expected))
  }

  test("should nested union under apply 3") {
    assume(!isParallel)

    val sizeHint = 10
    val argSize = Math.max(sizeHint / 100, 10)
    val rangeLimit1 = Math.max(sizeHint / 100, 10)
    val rangeLimit2 = rangeLimit1 + Math.max(sizeHint / 100, 10)
    val rangeLimit3 = rangeLimit2 + Math.max(sizeHint / 100, 10)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "x").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.unwind(s"range(1,$rangeLimit1) as x")
      .|.|.|.argument()
      .|.|.unwind(s"range(${rangeLimit2 + 1},$rangeLimit3) as x")
      .|.|.argument()
      .|.unwind(s"range(${rangeLimit1 + 1},$rangeLimit2) as x")
      .|.argument()
      .unwind(s"range(1,$argSize) as n")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      n <- 1 to argSize
      x <- 1 to rangeLimit3
    } yield Array(n, x)

    runtimeResult should beColumns("n", "x").withRows(inOrder(expected))
  }

  test("should nested union under nested apply") {
    assume(!isParallel)

    val size = Math.max(sizeHint / 100, 10)
    // given
    val nodes = given {
      nodeGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "m", "x").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.apply().withLeveragedOrder()
      .|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.|.allNodeScan("x")
      .|.|.|.allNodeScan("x")
      .|.|.allNodeScan("x")
      .|.unwind("range(1,10) as m")
      .|.argument("n")
      .input(nodes = Seq("n"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = for {
      n <- nodes
      m <- 1 to 10
      x <- nodes.flatMap(n => Seq(n, n, n))
    } yield Array(n, m, x)

    runtimeResult should beColumns("n", "m", "x").withRows(inOrder(expected))
  }

  test("should nested union under nested apply 2") {
    assume(!isParallel)

    val sizeHint = 10
    val argSize = Math.max(sizeHint / 100, 10)
    val rangeLimit = Math.max(sizeHint / 100, 30)

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("n", "m", "x").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.apply().withLeveragedOrder()
      .|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.|.|.unwind(s"range(2,$rangeLimit,3) as x")
      .|.|.|.|.argument()
      .|.|.|.unwind(s"range(0,$rangeLimit,3) as x")
      .|.|.|.argument()
      .|.|.unwind(s"range(1,$rangeLimit, 3) as x")
      .|.|.argument()
      .|.unwind(s"range(1,$argSize) as m")
      .|.argument()
      .unwind(s"range(1,$argSize) as n")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      n <- 1 to argSize
      m <- 1 to argSize
      x <- 0 to rangeLimit
    } yield Array(n, m, x)

    runtimeResult should beColumns("n", "m", "x").withRows(inOrder(expected))
  }

  test("should unwind after union") {
    val size = sizeHint / 2
    // given
    val nodes = given {
      nodeGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "n").withLeveragedOrder()
      .unwind("[1, 2, 3, 4, 5] AS n").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.allNodeScan("x")
      .input(nodes = Seq("x"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = for {
      x <- nodes.flatMap(n => Seq(n, n))
      n <- Seq(1, 2, 3, 4, 5)
    } yield Array(x, n)

    runtimeResult should beColumns("x", "n").withRows(inOrder(expected))
  }

  test("should distinct after union") {
    // given
    val nodes = given {
      nodeGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("res")
      .distinct("res AS res")
      .orderedUnion(Seq(Ascending("res")))
      .|.projection("y AS res")
      .|.unwind("[1, 2, 3, 4, 2, 5, 6, 7, 1] AS y")
      .|.argument()
      .projection("x AS res")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      res <- nodes ++ Seq(1, 2, 3, 4, 5, 6, 7)
    } yield Array(res)

    runtimeResult should beColumns("res").withRows(expected)
  }

  test("should work with limit on RHS") {
    assume(!isParallel) // TODO: Why does this fail with morsel size 1?

    val size = sizeHint / 2
    val nodes = given { nodeGraph(size)}

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.limit(1)
      .|.allNodeScan("x")
      .input(variables = Seq("x"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = Array(nodes.head) +: nodes.map(Array(_))

    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("should work with limit on LHS") {
    val size = sizeHint / 2
    val nodes = given { nodeGraph(size)}

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.allNodeScan("x")
      .limit(1)
      .input(variables = Seq("x"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = Array(nodes.head) +: nodes.map(Array(_))

    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("should work with limit on top") {
    val size = sizeHint / 2
    val nodes = given { nodeGraph(size)}

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .limit(1).withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.allNodeScan("x")
      .input(variables = Seq("x"))
      .build()

    val input = inputValues(nodes.map(Array[Any](_)): _*)
    val runtimeResult = execute(logicalQuery, runtime, input)

    // then
    val expected = Array(Array(nodes.head))

    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("should work with limit under apply") {
    val size = sizeHint / 2
    val nodes = given { nodeGraph(size) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("a").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.limit(1).withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("a"))).withLeveragedOrder()
      .|.|.allNodeScan("a")
      .|.argument()
      .allNodeScan("a")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = Array.fill(size)(Array(nodes.head))
    runtimeResult should beColumns("a").withRows(inOrder(expected))
  }

  test("should union under apply with long slot aliases") {
    assume(!isParallel)

    val size = Math.sqrt(sizeHint).toInt
    // given
    val nodes = given {
      nodeGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("res2").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.projection("res AS res2").withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("res"))).withLeveragedOrder()
      .|.|.projection("x AS res")
      .|.|.argument("x")
      .|.projection("x AS res")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      node <- nodes
      res2 <- Seq(node, node)
    } yield Array(res2)

    runtimeResult should beColumns("res2").withRows(inOrder(expected))
  }

  test("should union under apply with follow-up operator") {
    assume(!isParallel)

    // given
    val nodes = given {
      nodeGraph(sizeHint)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("res").withLeveragedOrder()
      .apply().withLeveragedOrder()
      .|.distinct("res AS res").withLeveragedOrder()
      .|.orderedUnion(Seq(Ascending("res"))).withLeveragedOrder()
      .|.|.projection("y AS res")
      .|.|.unwind("[1, 2, 3, 4, 2, 5, 6, 7, 1] AS y")
      .|.|.argument()
      .|.projection("x AS res")
      .|.argument("x")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      x <- nodes
      res <- x +: Seq(1, 2, 3, 4, 5, 6, 7)
    } yield Array(res)

    runtimeResult should beColumns("res").withRows(inOrder(expected))
  }

  test("should union under cartesian product with follow-up operator") {
    val size = 5 // Math.sqrt(sizeHint).toInt
    // given
    val nodes = given {
      nodeGraph(size)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x", "res")
      .cartesianProduct()
      .|.distinct("res AS res")
      .|.orderedUnion(Seq(Ascending("res")))
      .|.|.projection("y AS res")
      .|.|.unwind("[1, 2, 3, 4, 2, 5, 6, 7, 1] AS y")
      .|.|.argument()
      .|.projection("n AS res")
      .|.allNodeScan("n")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      x <- nodes
      res <- nodes ++ Seq(1, 2, 3, 4, 5, 6, 7)
    } yield Array(x, res)

    runtimeResult should beColumns("x", "res").withRows(expected)
  }

  test("should union with alias on RHS") {
    // given
    val size = sizeHint / 2
    val nodes = given {
      val nodes = nodePropertyGraph(size, { case i => Map("prop" -> i) })
      nodes.zipWithIndex.foreach {
        case (node, i) => node.addLabel(Label.label(if (i % 2 == 0) "A" else "B"))
      }
      nodes
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("a", "x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("a"))).withLeveragedOrder()
      .|.projection("x AS xxx")
      .|.projection("b AS a", "1 AS x")
      .|.nodeByLabelScan("b", "B", IndexOrderAscending)
      .projection("0 AS x")
      .nodeByLabelScan("a", "A", IndexOrderAscending)
      .build()
    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes.zipWithIndex.map {
      case (n, i) => Array(n, i % 2)
    }
    runtimeResult should beColumns("a", "x").withRows(inOrder(expected))
  }

  test("should union with alias on LHS") {
    // given
    val nodes = given {
      nodePropertyGraph(sizeHint, {
        case i => Map("prop" -> i)
      })
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("a", "x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("a"), Ascending("x"))).withLeveragedOrder()
      .|.projection("1 AS x")
      .|.allNodeScan("a")
      .projection("x AS xxx")
      .projection("b AS a", "2 AS x")
      .allNodeScan("b")
      .build()
    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = nodes.flatMap(n => Array(Array(n, 1), Array(n, 2)))
    runtimeResult should beColumns("a", "x").withRows(inOrder(expected))
  }

  test("union with apply on RHS") {
    val size = sizeHint / 2
    // given
    val nodes = given { nodeGraph(size) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.apply()
      .|.|.projection("y AS x")
      .|.|.argument("y")
      .|.allNodeScan("y")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      node <- nodes
      x <- Seq(node, node)
    } yield Array(x)

    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("union with apply on LHS") {
    val size = sizeHint / 2
    // given
    val nodes = given { nodeGraph(size) }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.allNodeScan("x")
      .apply()
      .|.projection("y AS x")
      .|.argument("y")
      .allNodeScan("y")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      node <- nodes
      x <- Seq(node, node)
    } yield Array(x)

    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("should union on the RHS of a hash join") {
    val size = sizeHint / 3
    // given
    val (as, bs) = given {
      val as = nodeGraph(size, "A")
      val bs = nodeGraph(size, "B")
      nodeGraph(size, "C")
      (as, bs)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .nodeHashJoin("x")
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "B")
      .|.nodeByLabelScan("x", "A")
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      x <- as ++ bs
    } yield Array(x)

    runtimeResult should beColumns("x").withRows(expected)
  }

  test("should union with reducers") {
    val size = sizeHint / 3
    // given
    val (as, bs) = given {
      val as = nodeGraph(size, "A")
      val bs = nodeGraph(size, "B")
      nodeGraph(size, "C")
      (as, bs)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("y").withLeveragedOrder()
      .unwind("c as y").withLeveragedOrder()
      .aggregation(Seq.empty, Seq("collect(x) as c")).withLeveragedOrder()
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.nodeByLabelScan("x", "B")
      .nodeByLabelScan("x", "A")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      y <- (as ++ bs).sortBy(_.getId)
    } yield Array(y)

    runtimeResult should beColumns("y").withRows(inOrder(expected))
  }

  test("should nested union of union") {
    val nodes = given {
      nodeGraph(sizeHint)
    }

    // The PrintingProbes are useful for debugging so they are indeed left here commented out on purpose!
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x").withLeveragedOrder()
    //.prober(new PrintingProbe("x")("UTOP - UNION", name = "utop-union")())
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.filter("false")
    //.|.prober(new PrintingProbe("x")("UTOP - RHS", name = "utop-rhs")())
      .|.orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
      .|.|.filter("false")
    //.|.|.prober(new PrintingProbe("x")("URIGHT - RHS", name = "uright-rhs")())
      .|.|.allNodeScan("x")
    //.|.prober(new PrintingProbe("x")("URIGHT - LHS", name = "uright-lhs")())
      .|.allNodeScan("x")
    //.prober(new PrintingProbe("x")("UTOP - LHS", name = "utop-lhs")())
      .orderedUnion(Seq(Ascending("x"))).withLeveragedOrder()
    //.|.prober(new PrintingProbe("x")("ULEFT - RHS", name = "uleft-rhs")())
      .|.allNodeScan("x")
      .filter("false")
    //.prober(new PrintingProbe("x")("ULEFT - LHS", name = "uleft-lhs")())
      .allNodeScan("x")
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    val expected = nodes.map(Array(_))
    runtimeResult should beColumns("x").withRows(inOrder(expected))
  }

  test("should union of ordered union with apply") {
    val size = sizeHint / 4
    // given
    val (as, bs, cs, ds) = given {
      val as = nodeGraph(size, "A")
      val bs = nodeGraph(size, "B")
      val cs = nodeGraph(size, "C")
      val ds = nodeGraph(size, "D")
      (as, bs, cs, ds)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .distinct("x AS x")
      .union()
      .|.projection("x AS x")
      .|.orderedDistinct(Seq("x"), "x AS x")
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "D", IndexOrderAscending)
      .|.nodeByLabelScan("x", "C", IndexOrderAscending)
      .projection("x AS x")
      .apply()
      .|.orderedDistinct(Seq("x"), "y AS y", "x AS x")
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "B", IndexOrderAscending, "y")
      .|.nodeByLabelScan("x", "A", IndexOrderAscending, "y")
      .unwind("[1, 2] AS y")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      y <- as ++ bs ++ cs ++ ds
    } yield Array(y)

    runtimeResult should beColumns("x").withRows(expected)
  }

  test("should union of nested ordered union with apply") {
    val size = sizeHint / 5
    // given
    val (as, bs, cs, ds, es) = given {
      val as = nodeGraph(size, "A")
      val bs = nodeGraph(size, "B")
      val cs = nodeGraph(size, "C")
      val ds = nodeGraph(size, "D")
      val es = nodeGraph(size, "E")
      (as, bs, cs, ds, es)
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("x")
      .distinct("x AS x")
      .union()
      .|.projection("x AS x")
      .|.orderedDistinct(Seq("x"), "x AS x")
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "E", IndexOrderAscending)
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "D", IndexOrderAscending)
      .|.nodeByLabelScan("x", "C", IndexOrderAscending)
      .projection("x AS x")
      .apply()
      .|.orderedDistinct(Seq("x"), "y AS y", "x AS x")
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "B", IndexOrderAscending, "y")
      .|.nodeByLabelScan("x", "A", IndexOrderAscending, "y")
      .unwind("[1, 2] AS y")
      .argument()
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    val expected = for {
      y <- as ++ bs ++ cs ++ ds ++ es
    } yield Array(y)

    runtimeResult should beColumns("x").withRows(expected)
  }

  test("should union of nested ordered union with aggregations") {
    // given
    given {
      nodeGraph(sizeHint, "A", "B", "C", "D", "E", "F", "G", "H")
    }

    // when
    val logicalQuery = new LogicalQueryBuilder(this)
      .produceResults("`size(dst)`")
      .distinct("`size(dst)` AS `size(dst)`")
      .union()
      .|.projection("`size(dst)` AS `size(dst)`")
      .|.projection("size(`dst`) AS `size(dst)`")
      .|.aggregation(Seq("`src` AS `src`", "`y` AS `y`"), Seq("COLLECT(DISTINCT `z`) AS `dst`"))
      .|.apply()
      .|.|.orderedDistinct(Seq("`z`"), "`src` AS `src`", "`y` AS `y`", "`z` AS `z`")
      .|.|.orderedUnion(Seq(Ascending("z")))
      .|.|.|.nodeByLabelScan("z", "H", IndexOrderAscending, "src", "y")
      .|.|.nodeByLabelScan("z", "G", IndexOrderAscending, "src", "y")
      .|.projection("[] AS y")
      .|.aggregation(Seq(), Seq("COLLECT(DISTINCT `x`) AS `src`"))
      .|.orderedDistinct(Seq("`x`"), "`x` AS `x`")
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "F", IndexOrderAscending)
      .|.orderedUnion(Seq(Ascending("x")))
      .|.|.nodeByLabelScan("x", "E", IndexOrderAscending)
      .|.nodeByLabelScan("x", "D", IndexOrderAscending)
      .projection("`size(dst)` AS `size(dst)`")
      .projection("size(`dst`) AS `size(dst)`")
      .aggregation(Seq("`src` AS `src`", "`y` AS `y`"), Seq("COLLECT(DISTINCT `z`) AS `dst`"))
      .apply()
      .|.orderedDistinct(Seq("`z`"), "`src` AS `src`", "`y` AS `y`", "`z` AS `z`")
      .|.orderedUnion(Seq(Ascending("z")))
      .|.|.nodeByLabelScan("z", "C", IndexOrderAscending, "src", "y")
      .|.nodeByLabelScan("z", "B", IndexOrderAscending, "src", "y")
      .projection("[] AS y")
      .aggregation(Seq(), Seq("COLLECT(DISTINCT `x`) AS `src`"))
      .nodeByLabelScan("x", "A", IndexOrderNone)
      .build()

    val runtimeResult = execute(logicalQuery, runtime)

    // then
    runtimeResult should beColumns("size(dst)").withRows(Array(Array(sizeHint)))
  }

}
