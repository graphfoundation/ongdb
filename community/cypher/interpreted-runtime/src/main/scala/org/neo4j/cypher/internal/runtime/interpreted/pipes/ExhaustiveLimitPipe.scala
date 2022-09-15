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
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.Id

import scala.collection.Iterator.empty

case class ExhaustiveLimitPipe(source: Pipe, exp: Expression)
                              (val id: Id = Id.INVALID_ID)
  extends PipeWithSource(source) {

  protected def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    val limit = SkipPipe.evaluateStaticSkipOrLimitNumberOrThrow(exp, state, "LIMIT")

    if (limit == 0) {
      while (input.hasNext) {
        input.next()
      }
      return ClosingIterator.empty
    }

    new ClosingIterator[CypherRow] {
      private var remaining = limit

      override def closeMore(): Unit = input.close()

      override def innerHasNext: Boolean = remaining > 0 && input.hasNext

      override def next(): CypherRow = {
        if (remaining > 0L) {
          remaining -= 1L
          val row = input.next()
          if (remaining == 0L) {
            while (input.hasNext) {
              input.next()
            }
          }
          row
        } else {
          empty.next()
        }
      }
    }
  }
}
