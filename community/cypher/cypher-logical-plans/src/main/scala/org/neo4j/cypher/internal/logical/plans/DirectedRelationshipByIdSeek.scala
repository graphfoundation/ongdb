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
package org.neo4j.cypher.internal.logical.plans

import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.cypher.internal.util.attribution.SameId

/**
 * For each relationship id in 'relIds', fetch the corresponding relationship. For each relationship,
 * produce one row containing:
 *   - argument
 *   - the relationship as 'idName'
 *   - the start node as 'startNode'
 *   - the end node as 'endNode'
 */
case class DirectedRelationshipByIdSeek(idName: String,
                                        relIds: SeekableArgs,
                                        startNode: String,
                                        endNode: String,
                                        argumentIds: Set[String])(implicit idGen: IdGen)
  extends RelationshipLogicalLeafPlan(idGen) {

  val availableSymbols: Set[String] = argumentIds ++ Set(idName, leftNode, rightNode)

  override def usedVariables: Set[String] = relIds.expr.dependencies.map(_.name)

  override def withoutArgumentIds(argsToExclude: Set[String]): DirectedRelationshipByIdSeek = copy(argumentIds = argumentIds -- argsToExclude)(SameId(this.id))

  override def leftNode: String = startNode

  override def rightNode: String = endNode
}
