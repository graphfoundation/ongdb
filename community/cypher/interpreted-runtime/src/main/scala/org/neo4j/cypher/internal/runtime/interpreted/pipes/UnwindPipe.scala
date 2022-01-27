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
import org.neo4j.cypher.internal.runtime.ListSupport
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.values.AnyValue

import scala.annotation.tailrec
import scala.collection.JavaConverters.asScalaIteratorConverter

case class UnwindPipe(source: Pipe, collection: Expression, variable: String)
                     (val id: Id = Id.INVALID_ID)
  extends PipeWithSource(source) with ListSupport {

  protected def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    if (input.hasNext) ClosingIterator(new UnwindIterator(input, state)) else ClosingIterator.empty
  }

  private class UnwindIterator(input: Iterator[CypherRow], state: QueryState) extends Iterator[CypherRow] {
    private var context: CypherRow = _
    private var unwindIterator: Iterator[AnyValue] = _
    private var nextItem: CypherRow = _

    prefetch()

    override def hasNext: Boolean = nextItem != null

    override def next(): CypherRow = {
      if (hasNext) {
        val ret = nextItem
        prefetch()
        ret
      } else Iterator.empty.next()
    }

    @tailrec
    private def prefetch() {
      nextItem = null
      if (unwindIterator != null && unwindIterator.hasNext) {
        nextItem = rowFactory.copyWith(context, variable, unwindIterator.next())
      } else {
        if (input.hasNext) {
          context = input.next()
          unwindIterator = makeTraversable(collection(context, state)).iterator.asScala
          prefetch()
        }
      }
    }
  }
}
