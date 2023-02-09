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
package org.neo4j.cypher.internal.spi

import org.neo4j.cypher.internal.planner.spi.GraphStatistics
import org.neo4j.cypher.internal.planner.spi.IndexDescriptor
import org.neo4j.cypher.internal.planner.spi.MinimumGraphStatistics
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.RelTypeId
import org.neo4j.cypher.internal.util.Selectivity
import org.neo4j.internal.kernel.api.Read
import org.neo4j.internal.kernel.api.SchemaRead
import org.neo4j.internal.kernel.api.TokenRead
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException
import org.neo4j.internal.schema
import org.neo4j.kernel.impl.query.TransactionalContext
import org.neo4j.logging.Log

import java.lang.Math.min

object TransactionBoundGraphStatistics {
  def apply(transactionalContext: TransactionalContext, log: Log): MinimumGraphStatistics =
    apply(transactionalContext.kernelTransaction().dataRead(),
      transactionalContext.kernelTransaction().schemaRead(),
      log)

  def apply(read: Read, schemaRead: SchemaRead, log: Log): MinimumGraphStatistics = {
    new MinimumGraphStatistics(new BaseTransactionBoundGraphStatistics(read, schemaRead, log))
  }

  private class BaseTransactionBoundGraphStatistics(read: Read, schemaRead: SchemaRead, log: Log) extends GraphStatistics with IndexDescriptorCompatibility {

    override def uniqueValueSelectivity(index: IndexDescriptor): Option[Selectivity] =
      try {
        val maybeIndexDescriptor = maybeKernelIndexDescriptor(index)
        maybeIndexDescriptor.map { indexDescriptor =>
          val indexSize = schemaRead.indexSize(indexDescriptor)
          if (indexSize == 0)
            Selectivity.ZERO

          else {
            // Probability of any entity in the index, to have a property with a given value
            val indexEntrySelectivity = schemaRead.indexUniqueValuesSelectivity(indexDescriptor)
            if (indexEntrySelectivity == 0.0) {
              Selectivity.ZERO
            } else {
              val frequencyOfEntitiesWithSameValue = 1.0 / indexEntrySelectivity

              // This is = 1 / number of unique values
              val indexSelectivity = frequencyOfEntitiesWithSameValue / indexSize

              Selectivity(min(indexSelectivity, 1.0))
            }
          }
        }
      }
      catch {
        case e: IndexNotFoundKernelException =>
          log.debug("Index not found for uniqueValueSelectivity", e)
          None
      }

    override def indexPropertyIsNotNullSelectivity(index: IndexDescriptor): Option[Selectivity] =
      try {
        val entitiesCount = index.entityType match {
          case IndexDescriptor.EntityType.Node(label) =>
            read.countsForNodeWithoutTxState(label).toDouble
          case IndexDescriptor.EntityType.Relationship(relType) =>
            read.countsForRelationshipWithoutTxState(TokenRead.ANY_LABEL, relType, TokenRead.ANY_LABEL).toDouble
        }

        if (entitiesCount == 0)
          Some(Selectivity.ZERO)
        else {
          // Probability of any entity with the given type, to have a given property
          val maybeIndexDescriptor = maybeKernelIndexDescriptor(index)
          maybeIndexDescriptor.map { indexDescriptor =>
            val indexSize = schemaRead.indexSize(indexDescriptor)
            val indexSelectivity = indexSize / entitiesCount

            //Even though semantically impossible the index can get into a state where
            //the indexSize > entitiesCount
            Selectivity(min(indexSelectivity, 1.0))
          }
        }
      }
      catch {
        case e: IndexNotFoundKernelException =>
          log.debug("Index not found for indexPropertyExistsSelectivity", e)
          None
      }

    override def nodesAllCardinality(): Cardinality =
      Cardinality(read.countsForNodeWithoutTxState(TokenRead.ANY_LABEL))

    override def nodesWithLabelCardinality(maybeLabelId: Option[LabelId]): Cardinality = {
      val count: Long = maybeLabelId.map(labelId => read.countsForNodeWithoutTxState(labelId.id)).getOrElse(0L)
      Cardinality(count)
    }

    override def patternStepCardinality(fromLabel: Option[LabelId], relTypeId: Option[RelTypeId], toLabel: Option[LabelId]): Cardinality =
      Cardinality(read.countsForRelationshipWithoutTxState(fromLabel, relTypeId, toLabel))

    private def maybeKernelIndexDescriptor(indexDescriptor: IndexDescriptor): Option[schema.IndexDescriptor] = {
      Option(schemaRead.index(cypherToKernelSchema(indexDescriptor), cypherToKernel(indexDescriptor.indexType)))
        .filter(_ != schema.IndexDescriptor.NO_INDEX)
    }
  }
}
