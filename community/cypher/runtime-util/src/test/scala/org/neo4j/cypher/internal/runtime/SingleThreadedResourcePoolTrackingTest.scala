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
package org.neo4j.cypher.internal.runtime

import java.util.concurrent.ThreadLocalRandom

import org.github.jamm.MemoryMeter
import org.neo4j.cypher.internal.runtime.SingleThreadedResourcePoolTrackingTest.TestResource
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.internal.kernel.api.AutoCloseablePlus
import org.neo4j.internal.kernel.api.CloseListener
import org.neo4j.memory.LocalMemoryTracker

/**
 * NOTE: This test needs to be run with a -javaagent. The easiest way to accomplish that is to run as
 * junit test rather than as a scalatest.
 */
class SingleThreadedResourcePoolTrackingTest extends CypherFunSuite {

  private val random = ThreadLocalRandom.current()

  test("add and measure") {
    //given
    val meter = new MemoryMeter()
    val memoryTracker = new LocalMemoryTracker()
    val pool = new SingleThreadedResourcePool(16, ResourceMonitor.NOOP, memoryTracker)
    val iterations = random.nextInt(10, 1000)

    //when
    (0 until iterations).foreach(_ => pool.add(new TestResource))

    //then
    val itemSize = meter.measure(new TestResource) * iterations
    val actualSize = meter.measureDeep(pool) - meter.measureDeep(memoryTracker) - meter.measureDeep(ResourceMonitor.NOOP) - itemSize

    actualSize should equal(memoryTracker.estimatedHeapMemory())

    //make sure we are not leaking memory
    pool.closeAll()
    memoryTracker.estimatedHeapMemory() shouldBe 0L
  }
}

object SingleThreadedResourcePoolTrackingTest {
  class TestResource extends AutoCloseablePlus {
    override def close(): Unit = {}
    override def closeInternal(): Unit = {}
    override def isClosed: Boolean = false
    override def setCloseListener(closeListener: CloseListener): Unit = {}
    override def setToken(token: Int): Unit = {}
    override def getToken: Int = ???
  }
}
