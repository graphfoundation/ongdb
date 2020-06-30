/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.cypher.internal.runtime.slotted

import org.neo4j.cypher.internal.runtime.EntityById
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.ResourceLinenumber
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.v4_0.expressions.ASTCachedProperty
import org.neo4j.cypher.result.QueryResult
import org.neo4j.exceptions.InternalException
import org.neo4j.values.AnyValue
import org.neo4j.values.storable.Value

import scala.collection.mutable

case class ArrayResultExecutionContext(resultArray: Array[AnyValue],
                                       columnIndexMap: scala.collection.Map[String, Int],
                                       factory: ArrayResultExecutionContextFactory)
  extends ExecutionContext with QueryResult.Record {

  override def release(): Unit = factory.releaseExecutionContext(this)

  override def getByName(key: String): AnyValue = {
    columnIndexMap.get(key) match {
      case Some(index) => resultArray(index)
      case _ => None.asInstanceOf[AnyValue]
    }
  }

  override def fields(): Array[AnyValue] = {
    resultArray
  }

  override def copyTo(target: ExecutionContext, fromLongOffset: Int, fromRefOffset: Int, toLongOffset: Int, toRefOffset: Int): Unit = fail()

  override def copyFrom(input: ExecutionContext, nLongs: Int, nRefs: Int): Unit = fail()

  override def setLongAt(offset: Int, value: Long): Unit = fail()

  override def getLongAt(offset: Int): Long = fail()

  override def setRefAt(offset: Int, value: AnyValue): Unit = fail()

  override def getRefAt(offset: Int): AnyValue = fail()

  override def set(newEntries: Seq[(String, AnyValue)]): Unit = fail()

  override def set(key: String, value: AnyValue): Unit = fail()

  override def set(key1: String, value1: AnyValue, key2: String, value2: AnyValue): Unit = fail()

  override def set(key1: String, value1: AnyValue, key2: String, value2: AnyValue, key3: String, value3: AnyValue): Unit = fail()

  override def mergeWith(other: ExecutionContext, entityById: EntityById): Unit = fail()

  override def createClone(): ExecutionContext = fail()

  override def copyWith(key: String, value: AnyValue): ExecutionContext = fail()

  override def copyWith(key1: String, value1: AnyValue, key2: String, value2: AnyValue): ExecutionContext = fail()

  override def copyWith(key1: String, value1: AnyValue, key2: String, value2: AnyValue, key3: String, value3: AnyValue): ExecutionContext = fail()

  override def copyWith(newEntries: Seq[(String, AnyValue)]): ExecutionContext = fail()

  override def boundEntities(materializeNode: Long => AnyValue, materializeRelationship: Long => AnyValue): Map[String, AnyValue] = fail()

  override def isNull(key: String): Boolean = fail()

  override def setCachedProperty(key: ASTCachedProperty, value: Value): Unit = fail()

  override def setCachedPropertyAt(offset: Int, value: Value): Unit = fail()

  override def getCachedProperty(key: ASTCachedProperty): Value = fail()

  override def getCachedPropertyAt(offset: Int): Value = fail()

  override def containsName(name: String): Boolean = ???

  override def numberOfColumns: Int = ???

  override def getLinenumber: Option[ResourceLinenumber] = {
    null
  }

  override def setLinenumber(line: Option[ResourceLinenumber]): Unit = {
    null
  }

  override def estimatedHeapUsage: Long = {
    0
  }

  override def invalidateCachedNodeProperties(node: Long): Unit = ???

  override def invalidateCachedRelationshipProperties(rel: Long): Unit = ???

  //---------------------------------------------------------------------------
  // This is an ExecutionContext by name only and does not support the full API
  // The methods below should never be called on a produced result
  private def fail(): Nothing = throw new InternalException("Tried using a result context as an execution context")
}

case class ArrayResultExecutionContextFactory(columns: Seq[(String, Expression)]) {
  private val columnExpressionArray = columns.map(_._2).toArray
  private val columnArraySize = columnExpressionArray.size
  private val columnIndexMap = {
    val m = new mutable.OpenHashMap[String, Int](columns.length)
    var index = 0
    columns.foreach {
      case (name, exp) => m.put(name, index)
        index += 1
    }
    m
  }
  //---------------------------------------------------------------------------
  // Instance cache of size 1. Reuses the last created ArrayResultExecutionContext
  private var freeExecutionContextInstance: ArrayResultExecutionContext = null

  def newResult(context: ExecutionContext, state: QueryState): ArrayResultExecutionContext = {
    val result = allocateExecutionContext

    // Apply the expressions that materializes the result values and fill in the result array
    val resultArray = result.resultArray
    var index = 0
    while (index < columnArraySize) {
      resultArray(index) = columnExpressionArray(index).apply(context, state)
      index += 1
    }
    result
  }

  def releaseExecutionContext(executionContext: ArrayResultExecutionContext) = {
    freeExecutionContextInstance = executionContext
  }

  private def allocateExecutionContext: ArrayResultExecutionContext = {
    if (freeExecutionContextInstance != null) {
      val context = freeExecutionContextInstance
      freeExecutionContextInstance = null
      context
    }
    else {
      createNewExecutionContext
    }
  }

  private def createNewExecutionContext: ArrayResultExecutionContext = {
    val resultArray = new Array[AnyValue](columnArraySize)
    ArrayResultExecutionContext(resultArray, columnIndexMap, this)
  }

  //---------------------------------------------------------------------------
}

