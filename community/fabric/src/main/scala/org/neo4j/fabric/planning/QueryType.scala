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
package org.neo4j.fabric.planning

import org.neo4j.cypher.internal.ast.AdministrationCommand
import org.neo4j.cypher.internal.ast.CallClause
import org.neo4j.cypher.internal.ast.Clause
import org.neo4j.cypher.internal.ast.SchemaCommand
import org.neo4j.cypher.internal.ast.UnresolvedCall
import org.neo4j.cypher.internal.ast.UpdateClause
import org.neo4j.cypher.internal.logical.plans.ResolvedCall
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.fabric.util.Folded.FoldableOps
import org.neo4j.fabric.util.Folded.Stop


sealed trait QueryType

object QueryType {

  case object Read extends QueryType {
    override def toString: String = "Read query"
  }
  case object ReadPlusUnresolved extends QueryType {
    override def toString: String = "Read query (with unresolved procedures)"
  }
  case object Write extends QueryType {
    override def toString: String = "Write query"
  }

  // Java access helpers
  val READ: QueryType = Read
  val READ_PLUS_UNRESOLVED: QueryType = ReadPlusUnresolved
  val WRITE: QueryType = Write

  val default: QueryType = Read

  def of(ast: ASTNode): QueryType =
    ast.folded(default)(merge) {
      case _: UpdateClause                => Stop(Write)
      case c: CallClause                  => Stop(of(c))
      case _: SchemaCommand               => Stop(Write)
      case a: AdministrationCommand       => Stop(if (a.isReadOnly) Read else Write)
    }

  def of(ast: Seq[Clause]): QueryType =
    ast.map(of).fold(default)(merge)

  def of(ast: CallClause): QueryType = ast match {
    case _: UnresolvedCall => ReadPlusUnresolved
    case c: ResolvedCall if c.containsNoUpdates => Read
    case _ => Write
  }

  def recursive(fragment: Fragment): QueryType =
    fragment match {
      case _: Fragment.Init          => default
      case apply: Fragment.Apply     => merge(recursive(apply.input), recursive(apply.inner))
      case union: Fragment.Union     => merge(recursive(union.lhs), recursive(union.rhs))
      case leaf: Fragment.Leaf       => merge(recursive(leaf.input), leaf.queryType)
      case exec: Fragment.Exec       => merge(recursive(exec.input), exec.queryType)
      case command: Fragment.Command => command.queryType
    }

  def local(fragment: Fragment): QueryType =
    fragment match {
      case _: Fragment.Init          => default
      case apply: Fragment.Apply     => local(apply.inner)
      case union: Fragment.Union     => merge(local(union.lhs), local(union.rhs))
      case leaf: Fragment.Leaf       => leaf.queryType
      case exec: Fragment.Exec       => exec.queryType
      case command: Fragment.Command => command.queryType
    }

  def merge(a: QueryType, b: QueryType): QueryType =
    Seq(a, b).maxBy {
      case Read               => 1
      case ReadPlusUnresolved => 2
      case Write              => 3
    }

  def sensitive(fragment: Fragment): Boolean =
    fragment match {
      case apply: Fragment.Apply     => sensitive(apply.input) || sensitive(apply.inner)
      case union: Fragment.Union     => sensitive(union.input) || sensitive(union.lhs) || sensitive(union.rhs)
      case exec: Fragment.Exec       => sensitive(exec.input) || exec.sensitive
      case _ => false
    }
}
