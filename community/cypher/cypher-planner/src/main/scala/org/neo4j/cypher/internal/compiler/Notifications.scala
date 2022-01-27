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
package org.neo4j.cypher.internal.compiler

import org.neo4j.common.EntityType
import org.neo4j.cypher.internal.ast.UsingIndexHintType
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.InternalNotification

case class SuboptimalIndexForConstainsQueryNotification(variableName: String, labelOrRelType: String, propertyKeys: Seq[String], entityType: EntityType) extends InternalNotification

case class SuboptimalIndexForEndsWithQueryNotification(variableName: String, labelOrRelType: String, propertyKeys: Seq[String], entityType: EntityType) extends InternalNotification

case object StartUnavailableFallback extends InternalNotification

case class RuntimeUnsupportedNotification(msg: String) extends InternalNotification

case class IndexHintUnfulfillableNotification(variableName: String, labelOrRelType: String, propertyKeys: Seq[String], entityType: EntityType, indexType: UsingIndexHintType) extends InternalNotification

case class JoinHintUnfulfillableNotification(identified: Seq[String]) extends InternalNotification

case class IndexLookupUnfulfillableNotification(labels: Set[String]) extends InternalNotification

case object EagerLoadCsvNotification extends InternalNotification

case object LargeLabelWithLoadCsvNotification extends InternalNotification

case class MissingLabelNotification(position: InputPosition, label: String) extends InternalNotification

case class MissingRelTypeNotification(position: InputPosition, relType: String) extends InternalNotification

case class MissingPropertyNameNotification(position: InputPosition, name: String) extends InternalNotification

case class ExhaustiveShortestPathForbiddenNotification(position: InputPosition) extends InternalNotification

case class DeprecatedProcedureNotification(position: InputPosition, oldName: String, newName: String) extends InternalNotification

case class ProcedureWarningNotification(position: InputPosition, procedure: String, warning: String) extends InternalNotification

case class DeprecatedFieldNotification(position: InputPosition, procedure: String, field: String) extends InternalNotification

case class MissingParametersNotification(parameters: Seq[String]) extends InternalNotification

case class ExperimentalFeatureNotification(msg: String) extends InternalNotification

case class CodeGenerationFailedNotification(msg: String) extends InternalNotification
