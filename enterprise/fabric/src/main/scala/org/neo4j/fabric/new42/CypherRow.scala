
/*
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.fabric.new42

//import org.neo4j.cypher.internal.expressions.ASTCachedProperty

import org.neo4j.cypher.internal.runtime.EntityById
import org.neo4j.cypher.internal.runtime.MutableMaps
import org.neo4j.cypher.internal.v4_0.expressions.ASTCachedProperty
import org.neo4j.exceptions.InternalException
import org.neo4j.fabric.new42.HeapEstimator.shallowSizeOfInstance
import org.neo4j.fabric.new42.HeapEstimator.shallowSizeOfObjectArray
import org.neo4j.graphdb.NotFoundException
//import org.neo4j.memory.Measurable
import org.neo4j.values.AnyValue
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual.VirtualNodeValue
import org.neo4j.values.virtual.VirtualRelationshipValue

import scala.collection.mutable

object CypherRow {
  def empty: CypherRow = apply()

  def from(x: (String, AnyValue)*): CypherRow = {
    val context = empty
    //context.set(x)
    context
  }

  def apply(m: mutable.Map[String, AnyValue] = MutableMaps.empty): MapCypherRow = new MapCypherRow(m, null)
}

case class ResourceLinenumber(filename: String, linenumber: Long, last: Boolean = false)

trait CypherRow {

  private var linenumber: Option[ResourceLinenumber] = None

  @deprecated
  def containsName(name: String): Boolean

  @deprecated
  def numberOfColumns: Int

  def createClone(): CypherRow

  def copyWith(key: String, value: AnyValue): CypherRow

  def copyWith(key1: String, value1: AnyValue, key2: String, value2: AnyValue): CypherRow

  def copyWith(key1: String, value1: AnyValue, key2: String, value2: AnyValue, key3: String, value3: AnyValue): CypherRow

  def copyWith(newEntries: Seq[(String, AnyValue)]): CypherRow

  def isNull(key: String): Boolean

  def setLinenumber(file: String, line: Long, last: Boolean = false): Unit = {
    // sets the linenumber for the first time, overwrite since it would mean we have a LoadCsv in a LoadCsv
    linenumber = Some(ResourceLinenumber(file, line, last))
  }

  def setLinenumber(line: Option[ResourceLinenumber]): Unit = linenumber match {
    // used to copy the linenumber when copying the ExecutionContext, don't want to overwrite it
    case None => linenumber = line
    case _ =>
  }

  def getLinenumber: Option[ResourceLinenumber] = linenumber
}

object MapCypherRow {
  private final val SHALLOW_SIZE_OF_MUTABLE_MAP = shallowSizeOfInstance(classOf[mutable.OpenHashMap[_, _]])
  private final val SHALLOW_SIZE = shallowSizeOfInstance(classOf[MapCypherRow])
  private final val INITAL_SIZE_OF_MUTABLE_MAP = SHALLOW_SIZE_OF_MUTABLE_MAP + shallowSizeOfObjectArray(8) // OpenHashMap initial size 8
}

class MapCypherRow(private val m: mutable.Map[String, AnyValue], private var cachedProperties: mutable.Map[ASTCachedProperty, Value] = null)
  extends CypherRow {

  def copyAllFrom(input: ReadableRow): Unit = fail()

  def copyFrom(input: ReadableRow, nLongs: Int, nRefs: Int): Unit = fail()

  def copyFromOffset(input: ReadableRow, sourceLongOffset: Int, sourceRefOffset: Int, targetLongOffset: Int, targetRefOffset: Int): Unit = fail()

  def remove(name: String): Option[AnyValue] = m.remove(name)

  //used for testing
  def toMap: Map[String, AnyValue] = m.toMap

  def getByName(name: String): AnyValue = m.getOrElse(name, throw new NotFoundException(s"Unknown variable `$name`."))

  override def containsName(name: String): Boolean = m.contains(name)

  override def numberOfColumns: Int = m.size

  def setLongAt(offset: Int, value: Long): Unit = fail()

  def getLongAt(offset: Int): Long = fail()

  def setRefAt(offset: Int, value: AnyValue): Unit = fail()

  def getRefAt(offset: Int): AnyValue = fail()

  def mergeWith(other: ReadableRow, entityById: EntityById): Unit = other match {
    case otherMapCtx: MapCypherRow =>
      m ++= otherMapCtx.m
      if (otherMapCtx.cachedProperties != null) {
        if (cachedProperties == null) {
          cachedProperties = otherMapCtx.cachedProperties.clone()
        } else {
          cachedProperties ++= otherMapCtx.cachedProperties
        }
      } else {
        //otherMapCtx.cachedProperties is null so do nothing
      }
      setLinenumber(otherMapCtx.getLinenumber)
    case _ => fail()
  }

  def set(newEntries: Seq[(String, AnyValue)]): Unit =
    m ++= newEntries

  def set(key: String, value: AnyValue): Unit =
    m.put(key, value)

  // This may seem silly but it has measurable impact in tight loops

  def set(key1: String, value1: AnyValue, key2: String, value2: AnyValue): Unit = {
    m.put(key1, value1)
    m.put(key2, value2)
  }

  def set(key1: String, value1: AnyValue, key2: String, value2: AnyValue, key3: String, value3: AnyValue): Unit = {
    m.put(key1, value1)
    m.put(key2, value2)
    m.put(key3, value3)
  }

  override def copyWith(key: String, value: AnyValue): CypherRow = {
    val newMap = m.clone()
    newMap.put(key, value)
    cloneFromMap(newMap)
  }

  override def copyWith(key1: String, value1: AnyValue, key2: String, value2: AnyValue): CypherRow = {
    val newMap = m.clone()
    newMap.put(key1, value1)
    newMap.put(key2, value2)
    cloneFromMap(newMap)
  }

  override def copyWith(key1: String, value1: AnyValue,
                        key2: String, value2: AnyValue,
                        key3: String, value3: AnyValue): CypherRow = {
    val newMap = m.clone()
    newMap.put(key1, value1)
    newMap.put(key2, value2)
    newMap.put(key3, value3)
    cloneFromMap(newMap)
  }

  override def copyWith(newEntries: Seq[(String, AnyValue)]): CypherRow = {
    cloneFromMap(m.clone() ++ newEntries)
  }

  override def createClone(): CypherRow = cloneFromMap(m.clone())

  override def isNull(key: String): Boolean =
    m.get(key) match {
      case Some(v) if v eq Values.NO_VALUE => true
      case _ => false
    }

  def setCachedProperty(key: ASTCachedProperty, value: Value): Unit = {
    if (cachedProperties == null) {
      cachedProperties = mutable.Map.empty
    }
    cachedProperties.put(key, value)
  }

  def setCachedPropertyAt(offset: Int, value: Value): Unit = fail()

  def getCachedProperty(key: ASTCachedProperty): Value = {
    if (cachedProperties == null) {
      null
    } else {
      cachedProperties.getOrElse(key, null)
    }
  }

  def getCachedPropertyAt(offset: Int): Value = fail()

  def invalidateCachedNodeProperties(node: Long): Unit = {
    if (cachedProperties != null) {
      cachedProperties.keys.filter(cnp => getByName(cnp.entityName) match {
        case n: VirtualNodeValue => n.id() == node
        case _ => false
      }).foreach(cnp => setCachedProperty(cnp, null))
    }
  }

  def invalidateCachedRelationshipProperties(rel: Long): Unit = {
    if (cachedProperties != null) {
      cachedProperties.keys.filter(cnp => getByName(cnp.entityName) match {
        case r: VirtualRelationshipValue => r.id() == rel
        case _ => false
      }).foreach(cnp => setCachedProperty(cnp, null))
    }
  }

  def estimatedHeapUsage: Long = {
    var total = MapCypherRow.SHALLOW_SIZE + MapCypherRow.INITAL_SIZE_OF_MUTABLE_MAP
    val iterator = m.valuesIterator
    while (iterator.hasNext) {
      val value = iterator.next()
      if (value != null) {
        total += value.estimatedHeapUsage()
      }
    }
    if (cachedProperties != null) {
      total += MapCypherRow.INITAL_SIZE_OF_MUTABLE_MAP
      val iterator = cachedProperties.valuesIterator
      while (iterator.hasNext) {
        val value = iterator.next()
        if (value != null) {
          total += value.estimatedHeapUsage()
        }
      }
    }
    total
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[MapCypherRow]

  override def equals(other: Any): Boolean = other match {
    case that: MapCypherRow =>
      (that canEqual this) &&
        m == that.m
    case _ => false
  }

  override def hashCode(): Int = m.hashCode()

  override def toString: String = s"MapExecutionContext(m=$m, cached=$cachedProperties)"

  private def fail(): Nothing = throw new InternalException("Tried using a map context as a slotted context")

  private def cloneFromMap(newMap: mutable.Map[String, AnyValue]): CypherRow = {
    val newCachedProperties = if (cachedProperties == null) null else cachedProperties.clone()
    val map = new MapCypherRow(newMap, newCachedProperties)
    map.setLinenumber(getLinenumber)
    map
  }
}
