/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.cypher.internal.physicalplanning

case class BufferDefinition(id: BufferId,
                            reducers: Array[ArgumentStateMapId],
                            workCancellers: Array[ArgumentStateMapId],
                            downstreamStates: Array[ArgumentStateMapId],
                            variant: BufferVariant)
                           (bufferSlotConfiguration: SlotConfiguration) {
  def withReducers(reducers: IndexedSeq[ArgumentStateMapId]): BufferDefinition = {
    ???
  }

  def withWorkCancellers(workCancellers: IndexedSeq[ArgumentStateMapId]): BufferDefinition = {
    ???
  }

  override def canEqual(that: Any): Boolean = {
    false
  }

  override def equals(obj: Any): Boolean = {
    false
  }

  override def hashCode(): Int = {
    0
  }

  override def toString(): String = {
    ???
  }
}

final case class BufferId(x: Int) {
}



sealed trait BufferVariant {
}

case class ApplyBufferVariant(argumentSlotOffset: Int,
                              reducersOnRHSReversed: Array[ArgumentStateMapId],
                              delegates: Array[BufferId]) extends BufferVariant {
  override def canEqual(that: Any): Boolean = {
    false
  }

  override def equals(obj: Any): Boolean = {
    false
  }

  override def hashCode(): Int = {
    0
  }

  override def toString(): String = {
    null
  }
}

case class ArgumentStateBufferVariant(argumentStateMapId: ArgumentStateMapId) extends BufferVariant {
}

case class AttachBufferVariant(applyBuffer: BufferDefinition,
                               outputSlots: SlotConfiguration,
                               argumentSlotOffset: Int,
                               argumentSize: SlotConfiguration.Size) extends BufferVariant {
}

case class LHSAccumulatingRHSStreamingBufferVariant(lhsPipelineId: PipelineId,
                                                    rhsPipelineId: PipelineId,
                                                    lhsArgumentStateMapId: ArgumentStateMapId,
                                                    rhsArgumentStateMapId: ArgumentStateMapId) extends BufferVariant {
}

case class OptionalBufferVariant(argumentStateMapId: ArgumentStateMapId) extends BufferVariant {
}

case object RegularBufferVariant extends BufferVariant {
}

