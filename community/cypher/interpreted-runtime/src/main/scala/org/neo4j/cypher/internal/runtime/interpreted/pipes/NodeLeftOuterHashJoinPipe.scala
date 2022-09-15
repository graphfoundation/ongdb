/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.cypher.internal.runtime.interpreted.pipes

import org.neo4j.cypher.internal.runtime.ClosingIterator
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.values.storable.LongArray

import scala.collection.JavaConverters.asScalaIteratorConverter
import scala.collection.JavaConverters.asScalaSetConverter
import scala.collection.mutable

case class NodeLeftOuterHashJoinPipe(nodeVariables: Set[String],
                                     lhs: Pipe,
                                     rhs: Pipe,
                                     nullableVariables: Set[String])
                                    (val id: Id = Id.INVALID_ID)
  extends NodeOuterHashJoinPipe(nodeVariables, lhs, nullableVariables) {

  protected def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    if (input.isEmpty)
      return ClosingIterator.empty

    val probeTable = buildProbeTableAndFindNullRows(input, state.memoryTrackerForOperatorProvider.memoryTrackerForOperator(id.x), withNulls = true)
    state.query.resources.trace(probeTable)
    val rhsIterator = rhs.createResults(state)

    val rhsKeys = mutable.Set[LongArray]()
    val lhsKeys: collection.Set[LongArray] = probeTable.keySet.asScala
    val joinedRows = for {
      rhsRow <- rhsIterator
      joinKey <- computeKey(rhsRow).toIterator
      _ = rhsKeys.add(joinKey)
      lhsRow <- probeTable(joinKey).asScala
    } yield {
      val outputRow = rowFactory.copyWith(lhsRow)
      // lhs and rhs might have different nullability - should use nullability on lhs
      outputRow.mergeWith(rhsRow, state.query, false)
      outputRow
    }

    // This must not be eagerly consumed, it can only be iterated after joinedRows is exhausted,
    // otherwise the result is wrong.
    def rowsWithoutRhsMatch: Iterator[CypherRow] = {
      (lhsKeys -- rhsKeys).iterator.flatMap {
        x => probeTable(x).asScala.map(addNulls)
      }
    }

    val rowsWithNullAsJoinKey = probeTable.nullRows.map(addNulls)

    (joinedRows ++ rowsWithNullAsJoinKey ++ rowsWithoutRhsMatch).closing(probeTable)
  }
}
