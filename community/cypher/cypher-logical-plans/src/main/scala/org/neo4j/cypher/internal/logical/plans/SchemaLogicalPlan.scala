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

import org.neo4j.common.EntityType
import org.neo4j.cypher.internal.ast.Options
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.graphdb.schema.IndexType

abstract class SchemaLogicalPlan(idGen: IdGen) extends LogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = None

  override def rhs: Option[LogicalPlan] = None

  override val availableSymbols: Set[String] = Set.empty
}

case class CreateNodeKeyConstraint(source: Option[DoNothingIfExistsForConstraint], node: String, label: LabelName, props: Seq[Property], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}
case class DropNodeKeyConstraint(label: LabelName, props: Seq[Property])(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

case class CreateUniquePropertyConstraint(source: Option[DoNothingIfExistsForConstraint], node: String, label: LabelName, props: Seq[Property], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}
case class DropUniquePropertyConstraint(label: LabelName, props: Seq[Property])(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

case class CreateNodePropertyExistenceConstraint(source: Option[DoNothingIfExistsForConstraint], label: LabelName, prop: Property, name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}
case class DropNodePropertyExistenceConstraint(label: LabelName, prop: Property)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

case class CreateRelationshipPropertyExistenceConstraint(source: Option[DoNothingIfExistsForConstraint], typeName: RelTypeName, prop: Property, name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}
case class DropRelationshipPropertyExistenceConstraint(typeName: RelTypeName, prop: Property)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

case class DropConstraintOnName(name: String, ifExists: Boolean)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

case class CreateBtreeIndex(source: Option[DoNothingIfExistsForIndex], entityName: Either[LabelName, RelTypeName], propertyKeyNames: List[PropertyKeyName], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}

case class CreateRangeIndex(source: Option[DoNothingIfExistsForIndex], entityName: Either[LabelName, RelTypeName], propertyKeyNames: List[PropertyKeyName], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}

case class CreateLookupIndex(source: Option[DoNothingIfExistsForLookupIndex], entityType: EntityType, name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}

case class CreateFulltextIndex(source: Option[DoNothingIfExistsForFulltextIndex], entityNames: Either[List[LabelName], List[RelTypeName]], propertyKeyNames: List[PropertyKeyName], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}

case class CreateTextIndex(source: Option[DoNothingIfExistsForIndex], entityName: Either[LabelName, RelTypeName], propertyKeyNames: List[PropertyKeyName], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}

case class CreatePointIndex(source: Option[DoNothingIfExistsForIndex], entityName: Either[LabelName, RelTypeName], propertyKeyNames: List[PropertyKeyName], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen) {
  override def lhs: Option[LogicalPlan] = source
}

case class DropIndex(label: LabelName, propertyKeyNames: List[PropertyKeyName])(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)
case class DropIndexOnName(name: String, ifExists: Boolean)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

case class DoNothingIfExistsForIndex(entityName: Either[LabelName, RelTypeName], propertyKeyNames: List[PropertyKeyName], indexType: IndexType, name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)
case class DoNothingIfExistsForLookupIndex(entityType: EntityType, name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)
case class DoNothingIfExistsForFulltextIndex(entityNames: Either[List[LabelName], List[RelTypeName]], propertyKeyNames: List[PropertyKeyName], name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)
case class DoNothingIfExistsForConstraint(entity: String, entityName: Either[LabelName, RelTypeName], props: Seq[Property], assertion: ConstraintType, name: Option[String], options: Options)(implicit idGen: IdGen) extends SchemaLogicalPlan(idGen)

sealed trait ConstraintType
case object NodeKey extends ConstraintType
case object Uniqueness extends ConstraintType
case object NodePropertyExistence extends ConstraintType
case object RelationshipPropertyExistence extends ConstraintType
