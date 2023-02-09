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
package org.neo4j.cypher.internal.runtime.interpreted.load_csv

import java.net.URL

import org.mockito.ArgumentMatchers
import org.mockito.ArgumentMatchers.any
import org.mockito.ArgumentMatchers.anyBoolean
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mockito.never
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.when
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.QueryTransactionalContext
import org.neo4j.cypher.internal.runtime.ResourceManager
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ExternalCSVResource
import org.neo4j.cypher.internal.runtime.interpreted.pipes.LoadCsvIterator
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values

class LoadCsvPeriodicCommitObserverTest extends CypherFunSuite {
  private val DEFAULT_BUFFER_SIZE = 4 * 1024 * 1024

  var resourceUnderTest: LoadCsvPeriodicCommitObserver = _
  var transactionalContext: QueryTransactionalContext = _
  var resource: ExternalCSVResource = _
  val url: URL = new URL("file:///tmp/something.csv")

  test("should not trigger tx restart until after first batch has been processed") {
    // Given
    when(resource.getCsvIterator(ArgumentMatchers.eq(url), ArgumentMatchers.eq(List.empty), any(), anyBoolean(), anyInt(), anyBoolean())).thenReturn(getIterator(Iterator(
      Array("Row1"),
      Array("Row2"))))

    // When
    val iterator = resourceUnderTest.getCsvIterator(url, List.empty, None, legacyCsvQuoteEscaping = false, DEFAULT_BUFFER_SIZE)

    // Then
    iterator.next() should equal(Array[Value](Values.stringValue("Row1")))
    verify(transactionalContext, never()).commitAndRestartTx()
    iterator.next() should equal(Array[Value](Values.stringValue("Row2")))
    verify(transactionalContext).commitAndRestartTx()
  }

  test("headers should not count") {
    // given
    when(resource.getCsvIterator(ArgumentMatchers.eq(url), ArgumentMatchers.eq(List.empty), any(), anyBoolean(), anyInt(), ArgumentMatchers.eq(true))).thenReturn(getIterator(Iterator(
      Array("header"),
      Array("Row1"),
      Array("Row2"),
      Array("Row3"))))

    // when
    val iterator = resourceUnderTest.getCsvIterator(url, List.empty, fieldTerminator = None, legacyCsvQuoteEscaping = false,
      DEFAULT_BUFFER_SIZE, headers = true)
    verify(transactionalContext, never()).commitAndRestartTx()

    iterator.next() should equal(Array[Value](Values.stringValue("header")))
    verify(transactionalContext, never()).commitAndRestartTx()

    iterator.next() should equal(Array[Value](Values.stringValue("Row1")))
    verify(transactionalContext, never()).commitAndRestartTx()

    iterator.next() should equal(Array[Value](Values.stringValue("Row2")))
    verify(transactionalContext).commitAndRestartTx()

    iterator.next() should equal(Array[Value](Values.stringValue("Row3")))
    verify(transactionalContext, times(2)).commitAndRestartTx()
  }

  test("multiple iterators are still handled correctly only commit when the first iterator advances") {
    // Given
    when(resource.getCsvIterator(ArgumentMatchers.eq(url), ArgumentMatchers.eq(List.empty), any(), anyBoolean(), anyInt(), anyBoolean())).
      thenReturn(getIterator(Iterator(Array("outer1"),Array("outer2")))).
      thenReturn(getIterator(Iterator(Array("inner1"),Array("inner2"),Array("inner3"),Array("inner4"))))
    val iterator1 = resourceUnderTest.getCsvIterator(url, List.empty, fieldTerminator = None, legacyCsvQuoteEscaping = false,
      DEFAULT_BUFFER_SIZE)
    val iterator2 = resourceUnderTest.getCsvIterator(url, List.empty, fieldTerminator = None, legacyCsvQuoteEscaping = false,
      DEFAULT_BUFFER_SIZE)

    // When
    iterator1.next()
    iterator2.next()
    iterator2.next()
    iterator2.next()

    verify(transactionalContext, never()).commitAndRestartTx()

    iterator1.next()
    verify(transactionalContext).commitAndRestartTx()
  }

  test("if a custom separator is specified it should be passed to the wrapped resource") {
    // Given
    resourceUnderTest.getCsvIterator(url, List.empty, Some(";"), legacyCsvQuoteEscaping = false,  DEFAULT_BUFFER_SIZE)

    // When
    verify(resource).getCsvIterator(url, List.empty, Some(";"), legacyCsvQuoteEscaping = false,
      DEFAULT_BUFFER_SIZE, false)
  }

  override protected def beforeEach() {
    val queryContext = mock[QueryContext]
    transactionalContext = mock[QueryTransactionalContext]
    val manager = new ResourceManager
    when(queryContext.resources).thenReturn(manager)
    when(queryContext.transactionalContext).thenReturn(transactionalContext)
    resource = mock[ExternalCSVResource]
    resourceUnderTest = new LoadCsvPeriodicCommitObserver(1, resource, queryContext)
  }

  private def getIterator(inner: Iterator[Array[String]]): LoadCsvIterator = {
    val valueInner = inner.map(_.map(Values.stringValue(_).asInstanceOf[Value]))
    new LoadCsvIterator{
      var lastProcessed: Long = 0L
      var readAll: Boolean = false

      override protected[this] def closeMore(): Unit = ()

      override def innerHasNext: Boolean = valueInner.hasNext

      override def next(): Array[Value] = {
        val next = valueInner.next()
        lastProcessed += 1
        readAll = !hasNext
        next
      }
    }
  }
}
