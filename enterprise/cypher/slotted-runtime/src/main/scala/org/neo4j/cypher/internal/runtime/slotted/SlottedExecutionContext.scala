/*
 * Copyright (c) 2002-2018 "Neo4j,"
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
package org.neo4j.cypher.internal.runtime.slotted

//import org.neo4j.cypher.internal.compatibility.v4_0.runtime.{LongSlot, RefSlot, SlotConfiguration}

import org.neo4j.cypher.internal.physicalplanning.LongSlot
import org.neo4j.cypher.internal.physicalplanning.RefSlot
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.v4_0.expressions.ASTCachedProperty
//import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.CachedNodeProperty
import org.neo4j.cypher.internal.runtime.EntityById
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.exceptions.InternalException
//import org.neo4j.cypher.internal.runtime.interpreted.ExecutionContext
import org.neo4j.cypher.internal.runtime.slotted.helpers.NullChecker.entityIsNull
//import org.neo4j.cypher.internal.v4_0.logical.plans.CachedNodeProperty
import org.neo4j.cypher.internal.v4_0.util.AssertionUtils._
//import org.neo4j.cypher.internal.v4_0.util.InternalException
import org.neo4j.cypher.internal.v4_0.util.symbols.CTNode
import org.neo4j.cypher.internal.v4_0.util.symbols.CTRelationship
import org.neo4j.values.AnyValue
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual._

import scala.collection.mutable

object SlottedExecutionContext {
  def empty = new SlottedExecutionContext(SlotConfiguration.empty)
}

/**
 * Execution context which uses a slot configuration to store values in two arrays.
 *
 * @param slots the slot configuration to use.
 */
case class SlottedExecutionContext(slots: SlotConfiguration) extends ExecutionContext {

  private val longs = new Array[Long](slots.numberOfLongs)
  //java.util.Arrays.fill(longs, -2L) // When debugging long slot issues you can uncomment this to check for uninitialized long slots (also in getLongAt below)
  private val refs = new Array[AnyValue](slots.numberOfReferences)

  override def toString(): String = {
    val iter = this.iterator
    val s: StringBuilder = StringBuilder.newBuilder
    s ++= s"\nSlottedExecutionContext {\n    $slots"
    while (iter.hasNext) {
      val slotValue = iter.next
      s ++= f"\n    ${slotValue._1}%-40s = ${slotValue._2}"
    }
    s ++= "\n}\n"
    s.result
  }

  override def copyTo(target: ExecutionContext,
                      sourceLongOffset: Int = 0,
                      sourceRefOffset: Int = 0,
                      targetLongOffset: Int = 0,
                      targetRefOffset: Int = 0): Unit =
    target match {
      case other@SlottedExecutionContext(otherPipeline) =>
        if (slots.numberOfLongs > otherPipeline.numberOfLongs ||
          slots.numberOfReferences > otherPipeline.numberOfReferences) {
          throw new InternalException(
            s"""Tried to copy more data into less:
               |From : ${slots}
               |To :   ${otherPipeline}""".stripMargin)
        } else {
          System.arraycopy(longs, sourceLongOffset, other.longs, targetLongOffset, slots.numberOfLongs - sourceLongOffset)
          System.arraycopy(refs, sourceRefOffset, other.refs, targetRefOffset, slots.numberOfReferences - sourceRefOffset)
        }
      case _ => fail()
    }

  override def copyFrom(input: ExecutionContext, nLongs: Int, nRefs: Int): Unit = input match {
    case other@SlottedExecutionContext(otherPipeline) =>
      if (nLongs > slots.numberOfLongs || nRefs > slots.numberOfReferences) {
        throw new InternalException("Tried to copy more data into less.")
      } else {
        System.arraycopy(other.longs, 0, longs, 0, nLongs)
        System.arraycopy(other.refs, 0, refs, 0, nRefs)
      }
    case _ => fail()
  }

  override def setLongAt(offset: Int, value: Long): Unit =
    longs(offset) = value

  override def getLongAt(offset: Int): Long =
    longs(offset)

  // When debugging long slot issues you can uncomment and replace with this to check for uninitialized long slots
  //  {
  //    val value = longs(offset)
  //    if (value == -2L)
  //      throw new InternalException(s"Long value not initialised at offset $offset in $this")
  //    value
  //  }

  override def setRefAt(offset: Int, value: AnyValue): Unit = refs(offset) = value

  override def getRefAt(offset: Int): AnyValue = {
    val value = refs(offset)
    if (value == null) {
      throw new InternalException(s"Reference value not initialised at offset $offset in $this")
    }
    value
  }

  def -=(key: String): Nothing = fail() // We do not expect this to be used

  def iterator: Iterator[(String, AnyValue)] = {
    // This method implementation is for debug usage only (the debugger will invoke it when stepping).
    // Please do not use in production code.
    val longSlots = slots.getLongSlots
    val longSlotValues = for (x <- longSlots)
      yield (x.toString, Values.longValue(longs(x.slot.offset)))

    val refSlots = slots.getRefSlots
    val refSlotValues = for (x <- refSlots)
      yield (x.toString, refs(x.slot.offset))

    val cachedSlots = slots.getCachedPropertySlots
    val cachedPropertySlotValues = for (x <- cachedSlots)
      yield (x.toString, refs(x.slot.offset))

    (longSlotValues ++ refSlotValues ++ cachedPropertySlotValues).iterator
  }

  override def setCachedPropertyAt(offset: Int, value: Value): Unit = refs(offset) = value

  override def setCachedProperty(key: ASTCachedProperty, value: Value): Unit =
    setCachedPropertyAt(slots.getCachedPropertyOffsetFor(key), value)

  override def getCachedPropertyAt(offset: Int): Value = refs(offset).asInstanceOf[Value]

  override def getCachedProperty(key: ASTCachedProperty): Value = fail()

  def get(key: String): Option[AnyValue] = {
    slots.maybeGetter(key).map(g => g(this))
  }

  //-----------------------------------------------------------------------------------------------------------
  // Compatibility implementations of the old ExecutionContext API used by Community interpreted runtime pipes
  //-----------------------------------------------------------------------------------------------------------

  def +=(kv: (String, AnyValue)): this.type = {
    setValue(kv._1, kv._2)
    this
  }

  def getOrElse[B1 >: AnyValue](key: String, default: => B1): Any = this.get(key) match {
    case Some(v) => v
    case None => default
  }

  // The newWith methods are called from Community pipes. We should already have allocated slots for the given keys,
  // so we just set the values in the existing slots instead of creating a new context like in the MapExecutionContext.
  override def set(newEntries: Seq[(String, AnyValue)]): Unit =
    newEntries.foreach {
      case (k, v) =>
        setValue(k, v)
    }

  override def set(key1: String, value1: AnyValue): Unit =
    setValue(key1, value1)

  override def set(key1: String, value1: AnyValue, key2: String, value2: AnyValue): Unit = {
    setValue(key1, value1)
    setValue(key2, value2)
  }

  override def set(key1: String, value1: AnyValue, key2: String, value2: AnyValue, key3: String, value3: AnyValue): Unit = {
    setValue(key1, value1)
    setValue(key2, value2)
    setValue(key3, value3)
  }

  override def copyWith(key1: String, value1: AnyValue): ExecutionContext = {
    // This method should throw like its siblings below as soon as reduce is changed to not use it.
    val newCopy = SlottedExecutionContext(slots)
    copyTo(newCopy)
    newCopy.setValue(key1, value1)
    newCopy
  }

  override def copyWith(key1: String, value1: AnyValue, key2: String, value2: AnyValue): ExecutionContext = {
    throw new UnsupportedOperationException(
      "Use ExecutionContextFactory.copyWith instead to get the correct slot configuration"
    )
  }

  override def copyWith(key1: String, value1: AnyValue,
                        key2: String, value2: AnyValue,
                        key3: String, value3: AnyValue): ExecutionContext = {
    throw new UnsupportedOperationException(
      "Use ExecutionContextFactory.copyWith instead to get the correct slot configuration"
    )
  }

  override def copyWith(newEntries: Seq[(String, AnyValue)]): ExecutionContext = {
    throw new UnsupportedOperationException(
      "Use ExecutionContextFactory.copyWith instead to get the correct slot configuration"
    )
  }

  def isRefInitialized(offset: Int): Boolean = {
    refs(offset) != null
  }

  def getRefAtWithoutCheckingInitialized(offset: Int): AnyValue =
    refs(offset)

  // Added entityById: EntityById to the signature to make it work... TODO: Did not implement this.
  override def mergeWith(other: ExecutionContext, entityById: EntityById): Unit = other match {
    case slottedOther: SlottedExecutionContext =>
      slottedOther.slots.foreachSlot({
        case (key, otherSlot@LongSlot(offset, _, CTNode)) =>
          val thisSlotSetter = slots.maybePrimitiveNodeSetter(key).getOrElse(
            throw new InternalException(s"Tried to merge primitive node slot $otherSlot from $other but it is missing from $this." +
              "Looks like something needs to be fixed in slot allocation.")
          )
          //thisSlotSetter.apply(this, other.getLongAt(offset), entityById)
          thisSlotSetter.apply(this, other.getLongAt(offset)) // , entityById
        case (key, otherSlot@LongSlot(offset, _, CTRelationship)) =>
          val thisSlotSetter = slots.maybePrimitiveRelationshipSetter(key).getOrElse(
            throw new InternalException(s"Tried to merge primitive relationship slot $otherSlot from $other but it is missing from $this." +
              "Looks like something needs to be fixed in slot allocation.")
          )
          thisSlotSetter.apply(this, other.getLongAt(offset)) // , entityById

        case (key, otherSlot@RefSlot(offset, _, _)) if slottedOther.isRefInitialized(offset) || otherSlot.nullable =>
          val thisSlotSetter = slots.maybeSetter(key).getOrElse(
            throw new InternalException(s"Tried to merge slot $otherSlot from $other but it is missing from $this." +
              "Looks like something needs to be fixed in slot allocation.")
          )

          ifAssertionsEnabled {
            val thisSlot = slots.get(key).get
            // This should be guaranteed by slot allocation or else we could get incorrect results
            if (!thisSlot.nullable && otherSlot.nullable) {
              throw new InternalException(s"Tried to merge slot $otherSlot into $thisSlot but its nullability is incompatible")
            }
          }

          val otherValue = slottedOther.getRefAtWithoutCheckingInitialized(offset)
          thisSlotSetter.apply(this, otherValue)

        case (key, otherSlot@RefSlot(offset, _, _)) =>
          val thisSlot = slots.get(key).get
          throw new InternalException(s"Tried to merge slot $otherSlot from $other into $thisSlot from $this, but ref is not initialized.")
      }, {
        case (cachedNodeProperty, refSlot) =>
          setCachedProperty(cachedNodeProperty, other.getCachedPropertyAt(refSlot.offset))
      })

    case _ =>
      throw new InternalException("Well well, isn't this a delicate situation?")
  }

  override def createClone(): ExecutionContext = {
    val clone = SlottedExecutionContext(slots)
    copyTo(clone)
    clone
  }

  // TODO: If we save currently utilized slot size per logical plan this could be simplified to checking
  // if the slot offset is less than the current size.
  // This is also the only way that we could detect if a LongSlot was not initialized
  override def boundEntities(materializeNode: Long => AnyValue, materializeRelationship: Long => AnyValue): Map[String, AnyValue] = {
    var entities = mutable.Map.empty[String, AnyValue]
    slots.foreachSlot({
      case (key, RefSlot(offset, _, _)) =>
        if (isRefInitialized(offset)) {
          val entity = getRefAtWithoutCheckingInitialized(offset)
          entity match {
            case _: NodeValue | _: RelationshipValue =>
              entities += key -> entity
            case nodeRef: NodeReference =>
              entities += key -> materializeNode(nodeRef.id())
            case relRef: RelationshipReference =>
              entities += key -> materializeRelationship(relRef.id())
            case _ => // Do nothing
          }
        }
      case (key, LongSlot(offset, false, CTNode)) =>
        entities += key -> materializeNode(getLongAt(offset))
      case (key, LongSlot(offset, false, CTRelationship)) =>
        entities += key -> materializeRelationship(getLongAt(offset))
      case (key, LongSlot(offset, true, CTNode)) =>
        val entityId = getLongAt(offset)
        if (entityId >= 0) {
          entities += key -> materializeNode(getLongAt(offset))
        }
      case (key, LongSlot(offset, true, CTRelationship)) =>
        val entityId = getLongAt(offset)
        if (entityId >= 0) {
          entities += key -> materializeRelationship(getLongAt(offset))
        }
      case _ => // Do nothing
    }, ignoreCachedNodeProperties => null)
    entities.toMap
  }

  override def isNull(key: String): Boolean =
    slots.get(key) match {
      case Some(RefSlot(offset, true, _)) if isRefInitialized(offset) =>
        getRefAtWithoutCheckingInitialized(offset) == Values.NO_VALUE
      case Some(LongSlot(offset, true, CTNode)) =>
        entityIsNull(getLongAt(offset))
      case Some(LongSlot(offset, true, CTRelationship)) =>
        entityIsNull(getLongAt(offset))
      case _ =>
        false
    }

  /**
   *
   * @param node
   */

  override def invalidateCachedNodeProperties(node: Long): Unit = {
    slots.foreachCachedSlot({
      case (cachedNodeProperty, refSlot) =>
        setCachedPropertyAt(refSlot.offset, null)
    })
  }

  override def invalidateCachedRelationshipProperties(rel: Long): Unit = {
    slots.foreachCachedSlot({
      case (cachedRelationshipProperty, refSlot) =>
        setCachedPropertyAt(refSlot.offset, null)
    })
  }

  // Overriding the 2 methods below.
  // See: https://github.com/neo4j/neo4j/blob/3.5.1/community/cypher/interpreted-runtime/src/main/scala/org/neo4j/cypher/internal/runtime/interpreted/ExecutionContext.scala

  override def getByName(name: String): AnyValue = this.slots.maybeGetter(name).get.apply(this)

  override def containsName(name: String): Boolean = this.slots.maybeGetter(name).isDefined

  override def numberOfColumns: Int = this.refs.length + this.longs.length

  override def estimatedHeapUsage: Long = {
    var usage = this.longs.length.asInstanceOf[Long] * 8L
    var i = 0
    while ( {
      i < this.refs.length
    }) {
      val ref = this.refs(i)
      if (ref != null) usage += ref.estimatedHeapUsage

      i += 1
    }
    usage
  }

  private def fail(): Nothing = throw new InternalException("Tried using a slotted context as a map")

  private def setValue(key1: String, value1: AnyValue): Unit = {
    slots.maybeSetter(key1)
      .getOrElse(throw new InternalException(s"Ouch, no suitable slot for key $key1 = $value1\nSlots: $slots"))
      .apply(this, value1)
  }
}
