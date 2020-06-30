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

import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanningAttributes.SlotConfigurations
import org.neo4j.cypher.internal.runtime._
import org.neo4j.cypher.internal.runtime.interpreted.BaseExecutionResultBuilderFactory
import org.neo4j.cypher.internal.runtime.interpreted.ExecutionResultBuilder
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.InCheckContainer
import org.neo4j.cypher.internal.runtime.interpreted.commands.predicates.SingleThreadedLRUCache
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.kernel.impl.query.QuerySubscriber
import org.neo4j.values.AnyValue
//import org.neo4j.cypher.internal.v3_5.logical.plans.LogicalPlan
import org.neo4j.values.virtual.MapValue

class SlottedExecutionResultBuilderFactory(pipe: Pipe,
                                           queryIndexes: QueryIndexes,
                                           nExpressionSlots: Int,
                                           readOnly: Boolean,
                                           columns: Array[String],
                                           logicalPlan: LogicalPlan,
                                           pipelines: SlotConfigurations,
                                           parameterMapping: ParameterMapping,
                                           lenientCreateRelationship: Boolean,
                                           memoryTrackingController: MemoryTrackingController,
                                           hasLoadCSV: Boolean

                                          )
  extends BaseExecutionResultBuilderFactory(pipe, readOnly, columns, logicalPlan, hasLoadCSV) {
  override def create(queryContext: QueryContext): ExecutionResultBuilder = SlottedExecutionResultBuilder(queryContext)

  def cursors(): ExpressionCursors = {
    this.cursors()
  }

  case class SlottedExecutionResultBuilder(queryContext: QueryContext) extends BaseExecutionResultBuilder {

    override protected def createQueryState(params: MapValue,
                                            prePopulateResults: Boolean,
                                            input: InputDataStream,
                                            subscriber: QuerySubscriber): SlottedQueryState = {

      var memoryTracker: QueryMemoryTracker = QueryMemoryTracker(memoryTrackingController.memoryTracking);
      var initialContext: Option[ExecutionContext] = None; // TODO: Fix
      var cachedIn: SingleThreadedLRUCache[Any, InCheckContainer] = new SingleThreadedLRUCache(maxSize = 16) // TODO: Fix

      new SlottedQueryState(queryContext,
        externalResource,
        createParameterArray(params, parameterMapping),
        cursors(),
        queryIndexes.initiateLabelAndSchemaIndexes(queryContext),
        new Array[AnyValue](nExpressionSlots),
        subscriber,
        memoryTracker,
        pipeDecorator,
        initialContext,
        cachedIn,
        lenientCreateRelationship,
        prePopulateResults,
        input

      )
    }

  }

}
