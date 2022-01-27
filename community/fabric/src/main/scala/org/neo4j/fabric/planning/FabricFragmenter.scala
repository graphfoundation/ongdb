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
package org.neo4j.fabric.planning

import org.neo4j.configuration.GraphDatabaseSettings
import org.neo4j.cypher.internal.ast
import org.neo4j.cypher.internal.ast.UseGraph
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.fabric.planning.Fragment.Apply
import org.neo4j.fabric.planning.Fragment.Init
import org.neo4j.fabric.planning.Fragment.Leaf
import org.neo4j.fabric.planning.Fragment.Union
import org.neo4j.fabric.util.Errors

class FabricFragmenter(
  defaultGraphName: String,
  queryString: String,
  queryStatement: ast.Statement,
  semantics: ast.semantics.SemanticState,
) {

  private val defaultUse: Use = makeDefaultUse(defaultGraphName, InputPosition.NONE)
  private val systemUse: Use = makeDefaultUse(GraphDatabaseSettings.SYSTEM_DATABASE_NAME, InputPosition.NONE)
  private val start = Init(defaultUse)

  def fragment: Fragment = queryStatement match {
    case query: ast.Query  => fragmentPart(start, query.part)
    case command: ast.AdministrationCommand =>
      Fragment.AdminCommand(systemUse, command)
    case command: ast.SchemaCommand =>
      val use = command.useGraph.map(Use.Declared).getOrElse(defaultUse)
      Fragment.SchemaCommand(use, command)
  }

  def periodicCommitHint: Option[ast.PeriodicCommitHint] = queryStatement match {
    case query: ast.Query => query.periodicCommitHint
    case _                => None
  }

  private def fragmentPart(
    input: Fragment.Init,
    part: ast.QueryPart,
  ): Fragment = part match {
    case sq: ast.SingleQuery => fragmentSingle(input, sq)
    case uq: ast.Union       => Union(input, isDistinct(uq), fragmentPart(input, uq.part), fragmentSingle(input, uq.query))(uq.position)
  }

  private def fragmentSingle(
    input: Fragment.Chain,
    sq: ast.SingleQuery,
  ): Fragment.Chain = {
    val parts = partitioned(sq.clauses)
    parts.foldLeft(input) { case (previous, part) =>

      val input = previous match {
        case init: Init =>
          // Previous is Init which means that we are at the start of a chain
          // Inherit or declare new Use
          val use = leadingUse(sq).map(Use.Declared).getOrElse(init.use)
          Init(use, previous.argumentColumns, sq.importColumns)

        case other => other
      }

      part match {
        case Right(clauses) =>
          // Section of normal clauses
          Leaf(input, clauses, produced(clauses))(clauses.headOption.map(_.position).getOrElse(sq.position))

        case Left(subquery) =>
          // Subquery: Recurse and start the child chain with Init
          val use = Use.Inherited(input.use)(subquery.part.position)
          Apply(input, fragmentPart(Init(use, input.outputColumns, Seq.empty), subquery.part), subquery.inTransactionsParameters)(subquery.position)
      }
    }
  }

  private def isDistinct(uq: ast.Union) =
    uq match {
      case _: ast.UnionAll      => false
      case _: ast.UnionDistinct => true
    }

  private def leadingUse(sq: ast.SingleQuery): Option[ast.GraphSelection] = {
    val clauses = sq.clausesExceptImportWith
    val (use, rest) = clauses.headOption match {
      case Some(u: ast.UseGraph) => (Some(u), clauses.tail)
      case _                     => (None, clauses)
    }

    rest.filter(_.isInstanceOf[ast.UseGraph])
      .map(clause => Errors.syntax("USE can only appear at the beginning of a (sub-)query", queryString, clause.position))

    use
  }

  private def makeDefaultUse(graphName: String, pos: InputPosition) =
    Use.Inherited(Use.Default(UseGraph(Variable(graphName)(pos))(pos)))(pos)

  private def produced(clauses: Seq[ast.Clause]): Seq[String] =
    produced(clauses.last)

  private def produced(clause: ast.Clause): Seq[String] = clause match {
    case r: ast.Return => r.returnColumns.map(_.name)
    case c             => semantics.scope(c).get.symbolNames.toSeq
  }

  /**
   * Returns a sequence where each element is either a subquery clause
   * or a segment of clauses with no subqueries
   */
  private def partitioned(clauses: Seq[ast.Clause]) =
    partition(clauses) {
      case s: ast.SubqueryCall => Left(s)
      case c                   => Right(c)
    }

  /**
   * Partitions the elements of a sequence depending on a predicate.
   * The predicate returns either Left[H] or Right[M] for each element
   * Running lengths of Right[M]'s gets aggregated into sub-sequences
   * while Left[H]'s are left singular
   */
  private def partition[E, H, M](es: Seq[E])(pred: E => Either[H, M]): Seq[Either[H, Seq[M]]] = {
    es.map(pred).foldLeft(Seq[Either[H, Seq[M]]]()) {
      case (seq, Left(hit))   => seq :+ Left(hit)
      case (seq, Right(miss)) => seq.lastOption match {
        case None            => seq :+ Right(Seq(miss))
        case Some(Left(_))   => seq :+ Right(Seq(miss))
        case Some(Right(ms)) => seq.init :+ Right(ms :+ miss)
      }
    }
  }

}
