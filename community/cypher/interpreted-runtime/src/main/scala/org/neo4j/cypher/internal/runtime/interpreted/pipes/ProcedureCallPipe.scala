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

import org.neo4j.cypher.internal.logical.plans.ProcedureSignature
import org.neo4j.cypher.internal.runtime.ClosingIterator
import org.neo4j.cypher.internal.runtime.CypherRow
import org.neo4j.cypher.internal.runtime.ProcedureCallMode
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.cypher.internal.util.symbols.CypherType
import org.neo4j.internal.kernel.api.procs.ProcedureCallContext
import org.neo4j.values.AnyValue

object ProcedureCallRowProcessing {
  def apply(signature: ProcedureSignature): ProcedureCallRowProcessing =
    if (signature.isVoid) PassThroughRow else FlatMapAndAppendToRow
}

sealed trait ProcedureCallRowProcessing

case object FlatMapAndAppendToRow extends ProcedureCallRowProcessing
case object PassThroughRow extends ProcedureCallRowProcessing

case class ProcedureCallPipe(source: Pipe,
                             signature: ProcedureSignature,
                             callMode: ProcedureCallMode,
                             argExprs: Seq[Expression],
                             rowProcessing: ProcedureCallRowProcessing,
                             resultSymbols: Seq[(String, CypherType)],
                             resultIndices: Seq[(Int, (String, String))])
                            (val id: Id = Id.INVALID_ID)

  extends PipeWithSource(source) {

  private val rowProcessor = rowProcessing match {
    case FlatMapAndAppendToRow => internalCreateResultsByAppending _
    case PassThroughRow => internalCreateResultsByPassingThrough _
  }

  private def createProcedureCallContext(qtx: QueryContext): ProcedureCallContext ={
    // getting the original name of the yielded variable
    val originalVariables = resultIndices.map(_._2._2).toArray
    val databaseId = qtx.transactionalContext.databaseId
    new ProcedureCallContext( signature.id, originalVariables, true, databaseId.name(), databaseId.isSystemDatabase )
  }

  override protected def internalCreateResults(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = rowProcessor(input, state)

  private def internalCreateResultsByAppending(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    val qtx = state.query
    val builder = Seq.newBuilder[(String, AnyValue)]
    builder.sizeHint(resultIndices.length)
    input.flatMap { input =>
      val argValues = argExprs.map(arg => arg(input, state)).toArray
      val results: Iterator[Array[AnyValue]] = call(qtx, argValues, createProcedureCallContext(qtx)) // always returns all items from the procedure
      results map { resultValues =>
        resultIndices foreach { case (k, (v, _)) =>
          builder += v -> resultValues(k) // get the output from correct position and add store variable -> value
        }
        val rowEntries = builder.result()
        val output = rowFactory.copyWith(input, rowEntries)
        builder.clear()
        output
      }
    }
  }

  private def call(qtx: QueryContext, argValues: Array[AnyValue], context: ProcedureCallContext): Iterator[Array[AnyValue]] =
    callMode.callProcedure(qtx, signature.id, argValues, context)

  private def internalCreateResultsByPassingThrough(input: ClosingIterator[CypherRow], state: QueryState): ClosingIterator[CypherRow] = {
    val qtx = state.query
    input map { input =>
      val argValues = argExprs.map(arg => arg(input, state)).toArray
      val results = call(qtx, argValues, createProcedureCallContext(qtx))
      // the iterator here should be empty; we'll drain just in case
      while (results.hasNext) results.next()
      input
    }
  }
}
