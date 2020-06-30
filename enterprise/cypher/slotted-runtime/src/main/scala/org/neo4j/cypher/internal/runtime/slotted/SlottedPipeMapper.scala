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

import org.neo4j.cypher.internal.logical.plans._
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlan
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.physicalplanning.SlotConfigurationUtils
import org.neo4j.cypher.internal.physicalplanning.SlottedIndexedProperty
import org.neo4j.cypher.internal.runtime.QueryIndexRegistrator
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.IndexSeekModeFactory
import org.neo4j.cypher.internal.runtime.interpreted.pipes._
import org.neo4j.cypher.internal.runtime.slotted.pipes._
import org.neo4j.cypher.internal.v4_0.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v4_0.expressions.{Expression => ASTExpression}

class SlottedPipeMapper(fallback: PipeMapper,
                        expressionConverters: ExpressionConverters,
                        physicalPlan: PhysicalPlan,
                        readOnly: Boolean,
                        indexRegistrator: QueryIndexRegistrator)(implicit semanticTable: SemanticTable) extends PipeMapper {

  override def onLeaf(plan: LogicalPlan): Pipe = {

    val id = plan.id

    def convertExpressions = ((e: ASTExpression) => expressionConverters.toCommandExpression(id, e))

    val slots = physicalPlan.slotConfigurations(id)
    val argumentSize = physicalPlan.argumentSizes(id)
    SlotConfigurationUtils.generateSlotAccessorFunctions(slots)

    val pipe = plan match {
      case AllNodesScan(column, _) =>
        AllNodesScanSlottedPipe(column, slots, argumentSize)(id)

      case NodeIndexScan(column, label, properties, _, indexOrder) =>

        NodeIndexScanSlottedPipe(column, label, properties.map { p => SlottedIndexedProperty(column, p, slots) }, indexRegistrator.registerQueryIndex(label, properties), indexOrder, slots, argumentSize)(id)

      case NodeIndexSeek(column, label, properties, valueExpr, _, indexOrder) =>
        val indexSeekMode = IndexSeekModeFactory(unique = false, readOnly = readOnly).fromQueryExpression(valueExpr)
        NodeIndexSeekSlottedPipe(column, label, properties.map(SlottedIndexedProperty(column, _, slots)).toIndexedSeq, indexRegistrator.registerQueryIndex(label, properties), valueExpr.map(convertExpressions), indexSeekMode, indexOrder, slots, argumentSize)(id)

      case NodeUniqueIndexSeek(column, label, properties, valueExpr, _, indexOrder) =>
        val indexSeekMode = IndexSeekModeFactory(unique = true, readOnly = readOnly).fromQueryExpression(valueExpr)
        NodeIndexSeekSlottedPipe(column, label, properties.map(SlottedIndexedProperty(column, _, slots)).toIndexedSeq, indexRegistrator.registerQueryIndex(label, properties),
          valueExpr.map(convertExpressions), indexSeekMode, indexOrder, slots, argumentSize)(id = id)

      case NodeByLabelScan(column, label, _) =>
        NodesByLabelScanSlottedPipe(column, LazyLabel(label), slots, argumentSize)(id)

      case _: Argument =>
        ArgumentSlottedPipe(slots, argumentSize)(id)

      case _ =>
        fallback.onLeaf(plan)
    }

    pipe.executionContextFactory.eq(SlottedExecutionContextFactory(slots))
    pipe
  }

  override def onOneChildPlan(plan: org.neo4j.cypher.internal.logical.plans.LogicalPlan,
                              source: Pipe): Pipe = {
    ???
  }

  override def onTwoChildPlan(plan: org.neo4j.cypher.internal.logical.plans.LogicalPlan,
                              lhs: Pipe,
                              rhs: Pipe): Pipe = {
    ???
  }
}

object SlottedPipeMapper {
  def createProjectionsForResult(columns: Seq[String],
                                 slots: SlotConfiguration): Seq[Tuple2[String, Expression]] = {
    ???
  }

  def computeUnionMapping(in: SlotConfiguration,
                          out: SlotConfiguration): UnionSlottedPipe.RowMapping = {
    ???
  }

  def translateColumnOrder(slots: SlotConfiguration,
                           s: ColumnOrder): ColumnOrder = {
    ???
  }
}
