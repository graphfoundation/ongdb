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

package org.neo4j.cypher.internal.runtime.slotted.aggregation

import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.interpreted.GroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.AggregationExpression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.AggregationPipe.AggregationTable
import org.neo4j.cypher.internal.runtime.interpreted.pipes.ExecutionContextFactory
import org.neo4j.cypher.internal.runtime.interpreted.pipes.OrderedAggregationTableFactory
import org.neo4j.cypher.internal.runtime.interpreted.pipes.OrderedChunkReceiver
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState

class SlottedOrderedGroupingAggTable(slots: SlotConfiguration,
                                     orderedGroupingColumns: GroupingExpression,
                                     unorderedGroupingColumns: GroupingExpression,
                                     aggregations: Map[Int, AggregationExpression],
                                     state: QueryState) extends SlottedGroupingAggTable(slots, unorderedGroupingColumns, aggregations, state) with OrderedChunkReceiver {
  override def clear(): Unit = {
    ???
  }

  override def isSameChunk(first: ExecutionContext,
                           current: ExecutionContext): Boolean = {
    ???
  }

  override def result(): Iterator[ExecutionContext] = {
    ???
  }

  override def processNextChunk: Boolean = {
    ???
  }
}

object SlottedOrderedGroupingAggTable {

  case class Factory(slots: SlotConfiguration,
                     orderedGroupingColumns: GroupingExpression,
                     unorderedGroupingColumns: GroupingExpression,
                     aggregations: Map[Int, AggregationExpression]) extends OrderedAggregationTableFactory {
    override def table(state: QueryState,
                       executionContextFactory: ExecutionContextFactory): AggregationTable with OrderedChunkReceiver = {
      ???
    }

    override def registerOwningPipe(pipe: Pipe): Unit = {
      ???
    }
  }

}