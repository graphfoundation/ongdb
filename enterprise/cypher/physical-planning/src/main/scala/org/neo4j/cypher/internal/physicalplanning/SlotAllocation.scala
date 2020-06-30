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
package org.neo4j.cypher.internal.physicalplanning

import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanningAttributes.ApplyPlans
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanningAttributes.ArgumentSizes
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanningAttributes.NestedPlanArgumentConfigurations
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanningAttributes.SlotConfigurations
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration.Size
import org.neo4j.cypher.internal.runtime.expressionVariableAllocation.AvailableExpressionVariables
import org.neo4j.cypher.internal.v4_0.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v4_0.util.attribution.Id
import org.neo4j.exceptions.InternalException

/**
 * This object knows how to configure slots for a logical plan tree.
 *
 * The structure of the code is built this maybe weird way instead of being recursive to avoid the JVM execution stack
 * and instead handle the stacks manually here. Some queries we have seen are deep enough to crash the VM if not
 * configured carefully.
 *
 * The knowledge about how to actually allocate slots for each logical plan lives in the three `allocate` methods,
 * whereas the knowledge of how to traverse the plan tree is store in the while loops and stacks in the `populate`
 * method.
 **/

// TODO: Implement
//noinspection NameBooleanParameters

object SlotAllocation {

  val INITIAL_SLOT_CONFIGURATION = NO_ARGUMENT(true)

  def allocateSlots(lp: LogicalPlan,
                    semanticTable: SemanticTable,
                    breakingPolicy: PipelineBreakingPolicy,
                    availableExpressionVariables: AvailableExpressionVariables,
                    allocateArgumentSlots: Boolean = {
                      false
                    }): SlotAllocation.SlotMetaData = {
    null
  }

  private def NO_ARGUMENT(allocateArgumentSlots: Boolean) = SlotsAndArgument(SlotConfiguration.empty, Size.zero, Id.INVALID_ID)

  case class SlotsAndArgument(slotConfiguration: SlotConfiguration, argumentSize: Size, argumentPlan: Id)

  case class SlotMetaData(slotConfigurations: SlotConfigurations,
                          argumentSizes: ArgumentSizes,
                          applyPlans: ApplyPlans,
                          val nestedPlanArgumentConfigurations: NestedPlanArgumentConfigurations)

}

class SlotAllocationFailed(str: String) extends InternalException(str)



