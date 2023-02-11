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
package org.neo4j.cypher.internal.runtime.interpreted.pipes

import org.neo4j.cypher.internal.runtime.ClosingIterator
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.pipes.SkipPipe.evaluateStaticSkipOrLimitNumberOrThrow
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.exceptions.InvalidArgumentException

case class SkipPipe(source: Pipe, exp: Expression)
                   (val id: Id = Id.INVALID_ID)
  extends PipeWithSource(source) {

  protected def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    val skip = evaluateStaticSkipOrLimitNumberOrThrow(exp, state, "SKIP")
    SkipPipe.drop[CypherRow, ClosingIterator[CypherRow]](skip, input)
  }

}

object SkipPipe {
  def drop[T, ITER <: Iterator[T]](n: Long, iterator: ITER): ITER = {
    var j = 0L
    while (j < n && iterator.hasNext) {
      iterator.next()
      j += 1
    }
    iterator
  }

  def evaluateStaticSkipOrLimitNumberOrThrow(skipExp: Expression, state: QueryState, prefix: String): Long = {
    PipeHelper.evaluateStaticLongOrThrow(skipExp, _ >= 0, state, prefix, " Must be a non-negative integer.")
  }
}
