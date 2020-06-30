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

import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanningAttributes._
import org.neo4j.cypher.internal.physicalplanning.PipelineTreeBuilder.ExecutionStateDefinitionBuild
import org.neo4j.cypher.internal.physicalplanning.PipelineTreeBuilder.PipelineDefinitionBuild
import org.neo4j.cypher.internal.v4_0.util.attribution.Id

class PipelineTreeBuilder(breakingPolicy: PipelineBreakingPolicy,
                          operatorFusionPolicy: OperatorFusionPolicy,
                          stateDefinition: ExecutionStateDefinitionBuild,
                          slotConfigurations: SlotConfigurations,
                          argumentSizes: ArgumentSizes) extends TreeBuilder[PipelineTreeBuilder.PipelineDefinitionBuild, PipelineTreeBuilder.ApplyBufferDefinitionBuild] {
  private[physicalplanning] val pipelines: collection.mutable.ArrayBuffer[PipelineDefinitionBuild] = {
    ???
  }
  private[physicalplanning] val applyRhsPlans: collection.mutable.HashMap[Int, Int] = {
    ???
  }

  protected override def validatePlan(plan: LogicalPlan): Unit = {
    ???
  }

  protected override def initialArgument(leftLeaf: LogicalPlan): PipelineTreeBuilder.ApplyBufferDefinitionBuild = {
    ???
  }

  protected override def onLeaf(plan: LogicalPlan,
                                argument: PipelineTreeBuilder.ApplyBufferDefinitionBuild): PipelineDefinitionBuild = {
    ???
  }

  protected override def onOneChildPlan(plan: LogicalPlan,
                                        source: PipelineTreeBuilder.PipelineDefinitionBuild,
                                        argument: PipelineTreeBuilder.ApplyBufferDefinitionBuild): PipelineTreeBuilder.PipelineDefinitionBuild = {
    ???
  }

  protected override def onTwoChildPlanComingFromLeft(plan: LogicalPlan,
                                                      lhs: PipelineTreeBuilder.PipelineDefinitionBuild,
                                                      argument: PipelineTreeBuilder.ApplyBufferDefinitionBuild): PipelineTreeBuilder.ApplyBufferDefinitionBuild = {
    ???
  }

  protected override def onTwoChildPlanComingFromRight(plan: LogicalPlan,
                                                       lhs: PipelineTreeBuilder.PipelineDefinitionBuild,
                                                       rhs: PipelineTreeBuilder.PipelineDefinitionBuild,
                                                       argument: PipelineTreeBuilder.ApplyBufferDefinitionBuild): PipelineTreeBuilder.PipelineDefinitionBuild = {
    ???
  }
}

object PipelineTreeBuilder {

  val NO_PIPELINE_BUILD: PipelineTreeBuilder.PipelineDefinitionBuild = {
    ???
  }

  sealed trait DownstreamStateOperator {
  }

  abstract class BufferDefinitionBuild(val id: BufferId,
                                       val bufferConfiguration: SlotConfiguration) {
    val downstreamStates: collection.mutable.ArrayBuffer[PipelineTreeBuilder.DownstreamStateOperator] = {
      ???
    }
  }

  class PipelineDefinitionBuild(val id: PipelineId,
                                val headPlan: LogicalPlan) {
    val fusedPlans: collection.mutable.ArrayBuffer[LogicalPlan] = {
      ???
    }
    val middlePlans: collection.mutable.ArrayBuffer[LogicalPlan] = {
      ???
    }
    var lhs: PipelineId = {
      ???.asInstanceOf[PipelineId]
    }
    var rhs: PipelineId = {
      ???.asInstanceOf[PipelineId]
    }
    var inputBuffer: PipelineTreeBuilder.BufferDefinitionBuild = {
      ???
    }
    var outputDefinition: OutputDefinition = {
      ???
    }
    var serial: Boolean = {
      false
    }
  }

  case class DownstreamReduce(val id: ArgumentStateMapId) extends PipelineTreeBuilder.DownstreamStateOperator {
  }

  case class DownstreamState(val id: ArgumentStateMapId) extends PipelineTreeBuilder.DownstreamStateOperator {
  }

  case class DownstreamWorkCanceller(val id: ArgumentStateMapId) extends PipelineTreeBuilder.DownstreamStateOperator {
  }

  case class ArgumentStateDefinitionBuild(val id: ArgumentStateMapId,
                                          val planId: Id,
                                          val argumentSlotOffset: Int,
                                          val counts: Boolean) {
  }

  class MorselBufferDefinitionBuild(id: BufferId,
                                    val producingPipelineId: PipelineId,
                                    bufferConfiguration: SlotConfiguration) extends PipelineTreeBuilder.BufferDefinitionBuild(id, bufferConfiguration) {
  }

  class OptionalMorselBufferDefinitionBuild(id: BufferId,
                                            val producingPipelineId: PipelineId,
                                            val argumentStateMapId: ArgumentStateMapId,
                                            val argumentSlotOffset: Int,
                                            bufferConfiguration: SlotConfiguration) extends PipelineTreeBuilder.BufferDefinitionBuild(id, bufferConfiguration) {
  }

  class DelegateBufferDefinitionBuild(id: org.neo4j.cypher.internal.physicalplanning.BufferId,
                                      val applyBuffer: PipelineTreeBuilder.ApplyBufferDefinitionBuild,
                                      bufferConfiguration: SlotConfiguration) extends PipelineTreeBuilder.BufferDefinitionBuild(id, bufferConfiguration) {
  }

  class ApplyBufferDefinitionBuild(id: org.neo4j.cypher.internal.physicalplanning.BufferId,
                                   producingPipelineId: PipelineId,
                                   val argumentSlotOffset: Int,
                                   bufferSlotConfiguration: SlotConfiguration) extends PipelineTreeBuilder.MorselBufferDefinitionBuild(id, producingPipelineId, bufferSlotConfiguration) {
    val reducersOnRHS: collection.mutable.ArrayBuffer[PipelineTreeBuilder.ArgumentStateDefinitionBuild] = {
      ???
    }
    val delegates: collection.mutable.ArrayBuffer[BufferId] = {
      ???
    }
  }

  class AttachBufferDefinitionBuild(id: BufferId,
                                    inputSlotConfiguration: SlotConfiguration,
                                    val outputSlotConfiguration: SlotConfiguration,
                                    val argumentSlotOffset: Int,
                                    val argumentSize: SlotConfiguration.Size) extends PipelineTreeBuilder.BufferDefinitionBuild(id, inputSlotConfiguration) {
    var applyBuffer: PipelineTreeBuilder.ApplyBufferDefinitionBuild = {
      ???
    }
  }

  class ArgumentStateBufferDefinitionBuild(id: BufferId,
                                           producingPipelineId: PipelineId,
                                           val argumentStateMapId: ArgumentStateMapId,
                                           bufferSlotConfiguration: SlotConfiguration) extends PipelineTreeBuilder.MorselBufferDefinitionBuild(id, producingPipelineId, bufferSlotConfiguration) {
  }

  class LHSAccumulatingRHSStreamingBufferDefinitionBuild(id: org.neo4j.cypher.internal.physicalplanning.BufferId,
                                                         val lhsPipelineId: PipelineId,
                                                         val rhsPipelineId: PipelineId,
                                                         val lhsArgumentStateMapId: ArgumentStateMapId,
                                                         val rhsArgumentStateMapId: ArgumentStateMapId,
                                                         bufferSlotConfiguration: SlotConfiguration) extends PipelineTreeBuilder.BufferDefinitionBuild(id, bufferSlotConfiguration) {
  }

  class ExecutionStateDefinitionBuild(val physicalPlan: PhysicalPlan) {
    val buffers: collection.mutable.ArrayBuffer[PipelineTreeBuilder.BufferDefinitionBuild] = {
      ???
    }
    val argumentStateMaps: collection.mutable.ArrayBuffer[PipelineTreeBuilder.ArgumentStateDefinitionBuild] = {
      ???
    }
    var initBuffer: PipelineTreeBuilder.ApplyBufferDefinitionBuild = {
      ???
    }

    def newArgumentStateMap(planId: Id,
                            argumentSlotOffset: Int,
                            counts: Boolean): PipelineTreeBuilder.ArgumentStateDefinitionBuild = {
      ???
    }

    def newBuffer(producingPipelineId: PipelineId,
                  bufferSlotConfiguration: SlotConfiguration): PipelineTreeBuilder.MorselBufferDefinitionBuild = {
      ???
    }

    def newOptionalBuffer(producingPipelineId: PipelineId,
                          argumentStateMapId: ArgumentStateMapId,
                          argumentSlotOffset: Int,
                          bufferSlotConfiguration: SlotConfiguration): PipelineTreeBuilder.OptionalMorselBufferDefinitionBuild = {
      ???
    }

    def newDelegateBuffer(applyBufferDefinition: PipelineTreeBuilder.ApplyBufferDefinitionBuild,
                          bufferSlotConfiguration: SlotConfiguration): PipelineTreeBuilder.DelegateBufferDefinitionBuild = {
      ???
    }

    def newApplyBuffer(producingPipelineId: PipelineId,
                       argumentSlotOffset: Int,
                       bufferSlotConfiguration: SlotConfiguration): PipelineTreeBuilder.ApplyBufferDefinitionBuild = {
      ???
    }

    def newAttachBuffer(producingPipelineId: PipelineId,
                        inputSlotConfiguration: SlotConfiguration,
                        postAttachSlotConfiguration: SlotConfiguration,
                        outerArgumentSlotOffset: Int,
                        outerArgumentSize: SlotConfiguration.Size): PipelineTreeBuilder.AttachBufferDefinitionBuild = {
      ???
    }

    def newArgumentStateBuffer(producingPipelineId: PipelineId,
                               argumentStateMapId: ArgumentStateMapId,
                               bufferSlotConfiguration: SlotConfiguration): PipelineTreeBuilder.ArgumentStateBufferDefinitionBuild = {
      ???
    }

    def newLhsAccumulatingRhsStreamingBuffer(lhsProducingPipelineId: PipelineId,
                                             rhsProducingPipelineId: PipelineId,
                                             lhsargumentStateMapId: ArgumentStateMapId,
                                             rhsargumentStateMapId: ArgumentStateMapId,
                                             bufferSlotConfiguration: SlotConfiguration): PipelineTreeBuilder.LHSAccumulatingRHSStreamingBufferDefinitionBuild = {
      ???
    }
  }

}
