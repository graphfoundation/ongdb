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
package org.neo4j.cypher.internal.compiler.planner

import org.neo4j.cypher.internal.ast.semantics.SemanticFeature
import org.neo4j.cypher.internal.compiler.MissingLabelNotification
import org.neo4j.cypher.internal.compiler.MissingPropertyNameNotification
import org.neo4j.cypher.internal.compiler.MissingRelTypeNotification
import org.neo4j.cypher.internal.compiler.phases.CompilationContains
import org.neo4j.cypher.internal.compiler.phases.LogicalPlanState
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.frontend.phases.BaseContext
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer.CompilationPhase.LOGICAL_PLANNING
import org.neo4j.cypher.internal.frontend.phases.TokensResolved
import org.neo4j.cypher.internal.frontend.phases.VisitorPhase
import org.neo4j.cypher.internal.frontend.phases.factories.PlanPipelineTransformerFactory
import org.neo4j.cypher.internal.ir.UnionQuery
import org.neo4j.cypher.internal.util.Foldable.TraverseChildren
import org.neo4j.cypher.internal.util.InternalNotification
import org.neo4j.cypher.internal.util.StepSequencer

case object NotificationsForUnresolvedTokensGenerated extends StepSequencer.Condition

/**
 * Find labels, relationships types and property keys that do not exist in the db and issue warnings.
 */
case object CheckForUnresolvedTokens extends VisitorPhase[BaseContext, LogicalPlanState] with StepSequencer.Step with PlanPipelineTransformerFactory {

  override def visit(value: LogicalPlanState, context: BaseContext): Unit = {
    if(value.query.readOnly) {
      val table = value.semanticTable()
      def isEmptyLabel(label: String) = !table.resolvedLabelNames.contains(label)
      def isEmptyRelType(relType: String) = !table.resolvedRelTypeNames.contains(relType)
      def isEmptyPropertyName(name: String) = !table.resolvedPropertyKeyNames.contains(name)
      def isNodeOrRelationship(variable: Expression) = table.isNodeNoFail(variable) || table.isRelationshipNoFail(variable)

      val notifications = value.statement().folder.treeFold(Seq.empty[InternalNotification]) {
        case label@LabelName(name) if isEmptyLabel(name) => acc =>
          TraverseChildren(acc :+ MissingLabelNotification(label.position, name))

        case rel@RelTypeName(name) if isEmptyRelType(name) => acc =>
          TraverseChildren(acc :+ MissingRelTypeNotification(rel.position, name))

        case Property(variable, prop@PropertyKeyName(name)) if isNodeOrRelationship(variable) && isEmptyPropertyName(name) => acc =>
          TraverseChildren(acc :+ MissingPropertyNameNotification(prop.position, name))
      }

      notifications foreach context.notificationLogger.log
    }
  }

  override def phase = LOGICAL_PLANNING

  override def preConditions: Set[StepSequencer.Condition] = Set(
    TokensResolved,
    CompilationContains[UnionQuery]
  )

  override def postConditions: Set[StepSequencer.Condition] = Set(NotificationsForUnresolvedTokensGenerated)

  override def invalidatedConditions: Set[StepSequencer.Condition] = Set.empty

  override def getTransformer(pushdownPropertyReads: Boolean,
                              semanticFeatures: Seq[SemanticFeature]): VisitorPhase[BaseContext, LogicalPlanState] = this
}
