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
package org.neo4j.cypher.internal.logical.plans

import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.RelationshipTypeToken
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.cypher.internal.util.attribution.SameId
import org.neo4j.graphdb.schema.IndexType

/**
 * For every relationship with the given type and property values, produces two rows for each relationship.
 *
 * Given each found `relationship`, the rows will have the following structure:
 *
 *  - `{idName: relationship, leftNode: relationship.startNode, relationship.endNode}`
 *  - `{idName: relationship, leftNode: relationship.endNode, relationship.startNode}`
 */
case class UndirectedRelationshipIndexSeek(idName: String,
                                           leftNode: String,
                                           rightNode: String,
                                           override val typeToken: RelationshipTypeToken,
                                           properties: Seq[IndexedProperty],
                                           valueExpr: QueryExpression[Expression],
                                           argumentIds: Set[String],
                                           indexOrder: IndexOrder,
                                           override val indexType: IndexType)
                                          (implicit idGen: IdGen) extends RelationshipIndexLeafPlan(idGen) {

  override val availableSymbols: Set[String] = argumentIds ++ Set(idName, leftNode, rightNode)

  override def usedVariables: Set[String] = valueExpr.expressions.flatMap(_.dependencies).map(_.name).toSet

  override def withoutArgumentIds(argsToExclude: Set[String]): UndirectedRelationshipIndexSeek = copy(argumentIds = argumentIds -- argsToExclude)(SameId(this.id))

  override def copyWithoutGettingValues: UndirectedRelationshipIndexSeek =
    copy(properties = properties.map(_.copy(getValueFromIndex = DoNotGetValue)))(SameId(this.id))

  override def withMappedProperties(f: IndexedProperty => IndexedProperty):  UndirectedRelationshipIndexSeek =
    copy(properties = properties.map(f))(SameId(this.id))
}

object UndirectedRelationshipIndexSeek extends IndexSeekNames {
  override val PLAN_DESCRIPTION_INDEX_SCAN_NAME = "UndirectedRelationshipIndexScan"
  override val PLAN_DESCRIPTION_INDEX_SEEK_NAME = "UndirectedRelationshipIndexSeek"
  override val PLAN_DESCRIPTION_INDEX_SEEK_RANGE_NAME = "UndirectedRelationshipIndexSeekByRange"
}