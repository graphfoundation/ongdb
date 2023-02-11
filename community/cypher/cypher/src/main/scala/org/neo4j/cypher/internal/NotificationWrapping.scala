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
package org.neo4j.cypher.internal

import org.neo4j.common.EntityType
import org.neo4j.cypher.internal.ast.UsingAnyIndexType
import org.neo4j.cypher.internal.ast.UsingBtreeIndexType
import org.neo4j.cypher.internal.ast.UsingTextIndexType
import org.neo4j.cypher.internal.compiler.CodeGenerationFailedNotification
import org.neo4j.cypher.internal.compiler.DeprecatedFieldNotification
import org.neo4j.cypher.internal.compiler.DeprecatedProcedureNotification
import org.neo4j.cypher.internal.compiler.EagerLoadCsvNotification
import org.neo4j.cypher.internal.compiler.ExhaustiveShortestPathForbiddenNotification
import org.neo4j.cypher.internal.compiler.ExperimentalFeatureNotification
import org.neo4j.cypher.internal.compiler.IndexHintUnfulfillableNotification
import org.neo4j.cypher.internal.compiler.IndexLookupUnfulfillableNotification
import org.neo4j.cypher.internal.compiler.JoinHintUnfulfillableNotification
import org.neo4j.cypher.internal.compiler.LargeLabelWithLoadCsvNotification
import org.neo4j.cypher.internal.compiler.MissingLabelNotification
import org.neo4j.cypher.internal.compiler.MissingParametersNotification
import org.neo4j.cypher.internal.compiler.MissingPropertyNameNotification
import org.neo4j.cypher.internal.compiler.MissingRelTypeNotification
import org.neo4j.cypher.internal.compiler.ProcedureWarningNotification
import org.neo4j.cypher.internal.compiler.RuntimeUnsupportedNotification
import org.neo4j.cypher.internal.compiler.SuboptimalIndexForConstainsQueryNotification
import org.neo4j.cypher.internal.compiler.SuboptimalIndexForEndsWithQueryNotification
import org.neo4j.cypher.internal.util.CartesianProductNotification
import org.neo4j.cypher.internal.util.DeprecatedAmbiguousGroupingNotification
import org.neo4j.cypher.internal.util.DeprecatedBtreeIndexSyntax
import org.neo4j.cypher.internal.util.DeprecatedCatalogKeywordForAdminCommandSyntax
import org.neo4j.cypher.internal.util.DeprecatedCoercionOfListToBoolean
import org.neo4j.cypher.internal.util.DeprecatedCreateConstraintOnAssertSyntax
import org.neo4j.cypher.internal.util.DeprecatedCreateIndexSyntax
import org.neo4j.cypher.internal.util.DeprecatedCreatePropertyExistenceConstraintSyntax
import org.neo4j.cypher.internal.util.DeprecatedDefaultDatabaseSyntax
import org.neo4j.cypher.internal.util.DeprecatedDefaultGraphSyntax
import org.neo4j.cypher.internal.util.DeprecatedDropConstraintSyntax
import org.neo4j.cypher.internal.util.DeprecatedDropIndexSyntax
import org.neo4j.cypher.internal.util.DeprecatedFunctionNotification
import org.neo4j.cypher.internal.util.DeprecatedHexLiteralSyntax
import org.neo4j.cypher.internal.util.DeprecatedOctalLiteralSyntax
import org.neo4j.cypher.internal.util.DeprecatedParameterSyntax
import org.neo4j.cypher.internal.util.DeprecatedPatternExpressionOutsideExistsSyntax
import org.neo4j.cypher.internal.util.DeprecatedPeriodicCommit
import org.neo4j.cypher.internal.util.DeprecatedPointsComparison
import org.neo4j.cypher.internal.util.DeprecatedPropertyExistenceSyntax
import org.neo4j.cypher.internal.util.DeprecatedRelTypeSeparatorNotification
import org.neo4j.cypher.internal.util.DeprecatedRepeatedRelVarInPatternExpression
import org.neo4j.cypher.internal.util.DeprecatedSelfReferenceToVariableInCreatePattern
import org.neo4j.cypher.internal.util.DeprecatedShowExistenceConstraintSyntax
import org.neo4j.cypher.internal.util.DeprecatedShowSchemaSyntax
import org.neo4j.cypher.internal.util.DeprecatedUseOfNullInCaseExpression
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.InternalNotification
import org.neo4j.cypher.internal.util.LengthOnNonPathNotification
import org.neo4j.cypher.internal.util.MissingAliasNotification
import org.neo4j.cypher.internal.util.SubqueryVariableShadowing
import org.neo4j.cypher.internal.util.UnboundedShortestPathNotification
import org.neo4j.graphdb
import org.neo4j.graphdb.impl.notification.NotificationCode
import org.neo4j.graphdb.impl.notification.NotificationDetail

import scala.collection.JavaConverters.seqAsJavaListConverter
import scala.collection.JavaConverters.setAsJavaSetConverter

object NotificationWrapping {

  def asKernelNotification(offset: Option[InputPosition])(notification: InternalNotification): NotificationCode#Notification = notification match {
    case CartesianProductNotification(pos, variables) =>
      NotificationCode.CARTESIAN_PRODUCT.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.cartesianProduct(variables.asJava))
    case LengthOnNonPathNotification(pos) =>
      NotificationCode.LENGTH_ON_NON_PATH.notification(pos.withOffset(offset).asInputPosition)
    case RuntimeUnsupportedNotification(msg) =>
      NotificationCode.RUNTIME_UNSUPPORTED.notification(graphdb.InputPosition.empty, NotificationDetail.Factory.message("Runtime unsupported", msg))
    case IndexHintUnfulfillableNotification(variableName, label, propertyKeys, entityType, indexType) =>
      val detail = entityType match {
        case EntityType.NODE => indexType match {
            case UsingAnyIndexType => NotificationDetail.Factory.nodeAnyIndex(variableName, label, propertyKeys: _*)
            case UsingBtreeIndexType => NotificationDetail.Factory.nodeBtreeIndex(variableName, label, propertyKeys: _*)
            case UsingTextIndexType => NotificationDetail.Factory.nodeTextIndex(variableName, label, propertyKeys: _*)
          }
        case EntityType.RELATIONSHIP => indexType match {
          case UsingAnyIndexType => NotificationDetail.Factory.relationshipAnyIndex(variableName, label, propertyKeys: _*)
          case UsingBtreeIndexType => NotificationDetail.Factory.relationshipBtreeIndex(variableName, label, propertyKeys: _*)
          case UsingTextIndexType => NotificationDetail.Factory.relationshipTextIndex(variableName, label, propertyKeys: _*)
        }
      }
      NotificationCode.INDEX_HINT_UNFULFILLABLE.notification(graphdb.InputPosition.empty, detail)
    case JoinHintUnfulfillableNotification(variables) =>
      NotificationCode.JOIN_HINT_UNFULFILLABLE.notification(graphdb.InputPosition.empty, NotificationDetail.Factory.joinKey(variables.asJava))
    case IndexLookupUnfulfillableNotification(labels) =>
      NotificationCode.INDEX_LOOKUP_FOR_DYNAMIC_PROPERTY.notification(graphdb.InputPosition.empty, NotificationDetail.Factory.indexSeekOrScan(labels.asJava))
    case EagerLoadCsvNotification =>
      NotificationCode.EAGER_LOAD_CSV.notification(graphdb.InputPosition.empty)
    case LargeLabelWithLoadCsvNotification =>
      NotificationCode.LARGE_LABEL_LOAD_CSV.notification(graphdb.InputPosition.empty)
    case MissingLabelNotification(pos, label) =>
      NotificationCode.MISSING_LABEL.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.label(label))
    case MissingRelTypeNotification(pos, relType) =>
      NotificationCode.MISSING_REL_TYPE.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.relationshipType(relType))
    case MissingPropertyNameNotification(pos, name) =>
      NotificationCode.MISSING_PROPERTY_NAME.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.propertyName(name))
    case UnboundedShortestPathNotification(pos) =>
      NotificationCode.UNBOUNDED_SHORTEST_PATH.notification(pos.withOffset(offset).asInputPosition)
    case ExhaustiveShortestPathForbiddenNotification(pos) =>
      NotificationCode.EXHAUSTIVE_SHORTEST_PATH.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedFunctionNotification(pos, oldName, newName) =>
      NotificationCode.DEPRECATED_FUNCTION.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.deprecatedName(oldName, newName))
    case DeprecatedProcedureNotification(pos, oldName, newName) =>
      NotificationCode.DEPRECATED_PROCEDURE.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.deprecatedName(oldName, newName))
    case DeprecatedFieldNotification(pos, procedure, field) =>
      NotificationCode.DEPRECATED_PROCEDURE_RETURN_FIELD.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.deprecatedField(procedure, field))
    case DeprecatedRelTypeSeparatorNotification(pos) =>
      NotificationCode.DEPRECATED_RELATIONSHIP_TYPE_SEPARATOR.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedParameterSyntax(pos) =>
      NotificationCode.DEPRECATED_PARAMETER_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedCreateIndexSyntax(pos) =>
      NotificationCode.DEPRECATED_CREATE_INDEX_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedBtreeIndexSyntax(pos) =>
      NotificationCode.DEPRECATED_BTREE_INDEX_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedDropIndexSyntax(pos) =>
      NotificationCode.DEPRECATED_DROP_INDEX_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedDropConstraintSyntax(pos) =>
      NotificationCode.DEPRECATED_DROP_CONSTRAINT_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedCreatePropertyExistenceConstraintSyntax(pos) =>
      NotificationCode.DEPRECATED_CREATE_PROPERTY_EXISTENCE_CONSTRAINT_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedCreateConstraintOnAssertSyntax(pos) =>
      NotificationCode.DEPRECATED_CREATE_CONSTRAINT_ON_ASSERT_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedShowSchemaSyntax(pos) =>
      NotificationCode.DEPRECATED_SHOW_SCHEMA_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedShowExistenceConstraintSyntax(pos) =>
      NotificationCode.DEPRECATED_SHOW_EXISTENCE_CONSTRAINT_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedPropertyExistenceSyntax(pos) =>
      NotificationCode.DEPRECATED_PROPERTY_EXISTENCE_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedDefaultDatabaseSyntax(pos) =>
      NotificationCode.DEPRECATED_DEFAULT_DATABASE_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedDefaultGraphSyntax(pos) =>
      NotificationCode.DEPRECATED_DEFAULT_GRAPH_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedCatalogKeywordForAdminCommandSyntax(pos) =>
      NotificationCode.DEPRECATED_CATALOG_KEYWORD_FOR_ADMIN_COMMAND_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedPeriodicCommit(pos) =>
      NotificationCode.DEPRECATED_PERIODIC_COMMIT.notification(pos.withOffset(offset).asInputPosition)
    case ProcedureWarningNotification(pos, name, warning) =>
      NotificationCode.PROCEDURE_WARNING.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.procedureWarning(name, warning))
    case ExperimentalFeatureNotification(msg) =>
      NotificationCode.EXPERIMENTAL_FEATURE.notification(graphdb.InputPosition.empty, NotificationDetail.Factory.message("PARALLEL", msg))
    case SuboptimalIndexForConstainsQueryNotification(variableName, label, propertyKeys, entityType) =>
      val detail = entityType match {
        case EntityType.NODE => NotificationDetail.Factory.nodeAnyIndex(variableName, label, propertyKeys: _*)
        case EntityType.RELATIONSHIP => NotificationDetail.Factory.relationshipAnyIndex(variableName, label, propertyKeys: _*)
      }
      NotificationCode.SUBOPTIMAL_INDEX_FOR_CONTAINS_QUERY.notification(graphdb.InputPosition.empty, detail)
    case SuboptimalIndexForEndsWithQueryNotification(variableName, label, propertyKeys, entityType) =>
      val detail = entityType match {
        case EntityType.NODE => NotificationDetail.Factory.nodeAnyIndex(variableName, label, propertyKeys: _*)
        case EntityType.RELATIONSHIP => NotificationDetail.Factory.relationshipAnyIndex(variableName, label, propertyKeys: _*)
      }
      NotificationCode.SUBOPTIMAL_INDEX_FOR_ENDS_WITH_QUERY.notification(graphdb.InputPosition.empty, detail)
    case MissingParametersNotification(names) =>
      NotificationCode.MISSING_PARAMETERS_FOR_EXPLAIN.notification(graphdb.InputPosition.empty, NotificationDetail.Factory.message("Explain with missing parameters", names.mkString("Missing parameters: ",", ","")))
    case CodeGenerationFailedNotification(msg) =>
      NotificationCode.CODE_GENERATION_FAILED.notification(graphdb.InputPosition.empty, NotificationDetail.Factory.message("Error from code generation", msg))
    case DeprecatedRepeatedRelVarInPatternExpression(pos, relName) =>
      NotificationCode.REPEATED_REL_IN_PATTERN_EXPRESSION.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.repeatedRel(relName))
    case DeprecatedOctalLiteralSyntax(pos) =>
      NotificationCode.DEPRECATED_OCTAL_LITERAL_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedHexLiteralSyntax(pos)                     =>
      NotificationCode.DEPRECATED_HEX_LITERAL_SYNTAX.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedPatternExpressionOutsideExistsSyntax(pos) =>
      NotificationCode.DEPRECATED_USE_OF_PATTERN_EXPRESSION.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedCoercionOfListToBoolean(pos) =>
      NotificationCode.DEPRECATED_COERCION_OF_LIST_TO_BOOLEAN.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedSelfReferenceToVariableInCreatePattern(pos) =>
      NotificationCode.DEPRECATED_SELF_REFERENCE_TO_VARIABLE_IN_CREATE_PATTERN.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedPointsComparison(pos) =>
      NotificationCode.DEPRECATED_POINTS_COMPARE.notification(pos.withOffset(offset).asInputPosition)
    case SubqueryVariableShadowing(pos, varName)             =>
      NotificationCode.SUBQUERY_VARIABLE_SHADOWING.notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.shadowingVariable(varName))
    case MissingAliasNotification(pos) =>
      NotificationCode.MISSING_ALIAS.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedUseOfNullInCaseExpression(pos) =>
      NotificationCode.DEPRECATED_CASE_EXPRESSION.notification(pos.withOffset(offset).asInputPosition)
    case DeprecatedAmbiguousGroupingNotification(pos, maybeHint) =>
      maybeHint match {
        case Some(hint) => NotificationCode.DEPRECATED_AMBIGUOUS_GROUPING_NOTIFICATION
          .notification(pos.withOffset(offset).asInputPosition, NotificationDetail.Factory.message("Hint", s"Hint: $hint"))
        case _ => NotificationCode.DEPRECATED_AMBIGUOUS_GROUPING_NOTIFICATION.notification(pos.withOffset(offset).asInputPosition)      }
  }

  private implicit class ConvertibleCompilerInputPosition(pos: InputPosition) {
    def asInputPosition = new graphdb.InputPosition(pos.offset, pos.line, pos.column)
  }
}
