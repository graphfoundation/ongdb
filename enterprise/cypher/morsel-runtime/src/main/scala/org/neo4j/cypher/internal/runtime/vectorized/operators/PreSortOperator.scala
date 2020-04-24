/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.cypher.internal.runtime.vectorized.operators

import java.util.Comparator

import org.neo4j.cypher.internal.DefaultComparatorTopTable
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.{QueryState => OldQueryState}
import org.neo4j.cypher.internal.runtime.slotted.pipes.ColumnOrder
import org.neo4j.cypher.internal.runtime.vectorized._
import org.neo4j.values.storable.NumberValue

import scala.collection.JavaConverters._

/*
 * Responsible for sorting the Morsel in place, which will then be merged together with other sorted Morsels
 * If countExpression != None, this sorts the first N rows of the morsel in place. If N > morselSize, this is equivalent to sorting everything.
 */
class PreSortOperator(orderBy: Seq[ColumnOrder],
                      countExpression: Option[Expression] = None) extends StatelessOperator {

    override def operate(currentRow: MorselExecutionContext,
                         context: QueryContext,
                         state: QueryState): Unit = {

      val rowCloneForComparators = currentRow.createClone()
      val comparator: Comparator[Integer] = orderBy
        .map(MorselSorting.compareMorselIndexesByColumnOrder(rowCloneForComparators))
        .reduce((a, b) => a.thenComparing(b))

      // First we create an array of the same size as the rows in the morsel that we'll sort.
      // This array contains only the pointers to the morsel rows
      var outputToInputIndexes: Array[Integer] = MorselSorting.createMorselIndexesArray(currentRow)

      // potentially calculate the limit
      val maybeLimit = countExpression.map { count =>
        val queryState = new OldQueryState(context, resources = null, params = state.params)
        count(currentRow, queryState).asInstanceOf[NumberValue].longValue().toInt
      }

      maybeLimit match {
        case Some(limit) if limit < currentRow.numberOfRows =>
          // a table to hold the top n entries
          val topTable = new DefaultComparatorTopTable(comparator, limit)

          while (currentRow.hasMoreRows) {
            topTable.add(outputToInputIndexes(currentRow.getCurrentRow))
            currentRow.moveToNextRow()
          }

          topTable.sort()

          outputToInputIndexes = topTable.iterator.asScala.toArray

          // only the first count elements stay valid
          currentRow.moveToRow(limit)
          currentRow.finishedWriting()

        case _ =>
          // We have to sort everything
          java.util.Arrays.sort(outputToInputIndexes, comparator)
      }

      // Now that we have a sorted array, we need to shuffle the morsel rows around until they follow the same order
      // as the sorted array
      MorselSorting.createSortedMorselData(currentRow, outputToInputIndexes)
  }
}
