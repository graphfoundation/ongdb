/*
 * Copyright (c) 2002-2018 "Neo4j,"
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
package org.neo4j.cypher.internal.runtime.slotted.expressions

//import org.neo4j.cypher.internal.compatibility.v3_5.runtime.SlotAllocation.PhysicalPlan
//import org.neo4j.cypher.internal.compatibility.v3_5.runtime.{ast => runtimeAst}

import org.neo4j.cypher.internal.physicalplanning.PhysicalPlan
import org.neo4j.cypher.internal.runtime.interpreted.CommandProjection
import org.neo4j.cypher.internal.runtime.interpreted.GroupingExpression
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.runtime.interpreted.commands.{expressions => commands}
import org.neo4j.cypher.internal.runtime.slotted.expressions.SlottedProjectedPath._
import org.neo4j.cypher.internal.v4_0.expressions._
import org.neo4j.cypher.internal.v4_0.util.attribution.Id
//import org.neo4j.cypher.internal.v3_5.expressions._
//import org.neo4j.cypher.internal.v3_5.util.attribution.Id
//import org.neo4j.cypher.internal.v3_5.{expressions => ast}

case class SlottedExpressionConverters(physicalPlan: PhysicalPlan) extends ExpressionConverter {

  override def toCommandProjection(id: Id, projections: Map[String, Expression],
                                   self: ExpressionConverters): Option[CommandProjection] = {
    val slots = physicalPlan.slotConfigurations(id)
    val projected = for {(k, v) <- projections} yield slots.get(k).get.offset -> self.toCommandExpression(id, v)
    Some(SlottedCommandProjection(projected))
  }

  override def toCommandExpression(id: Id, expression: Expression, self: ExpressionConverters): Option[commands.Expression] = {
    None
  }

  // TODO: Update null to be toNode...
  def toCommandProjectedPath(id: Id, e: PathExpression, self: ExpressionConverters): SlottedProjectedPath = {
    def project(pathStep: PathStep): Projector = pathStep match {

      case NodePathStep(nodeExpression, next) =>
        singleNodeProjector(toCommandExpression(id, nodeExpression, self).get, project(next))

      case SingleRelationshipPathStep(relExpression, SemanticDirection.INCOMING, null, next) =>
        singleIncomingRelationshipProjector(toCommandExpression(id, relExpression, self).get, project(next))

      case SingleRelationshipPathStep(relExpression, SemanticDirection.OUTGOING, null, next) =>
        singleOutgoingRelationshipProjector(toCommandExpression(id, relExpression, self).get, project(next))

      case SingleRelationshipPathStep(relExpression, SemanticDirection.BOTH, null, next) =>
        singleUndirectedRelationshipProjector(toCommandExpression(id, relExpression, self).get, project(next))

      case MultiRelationshipPathStep(relExpression, SemanticDirection.INCOMING, null, next) =>
        multiIncomingRelationshipProjector(toCommandExpression(id, relExpression, self).get, project(next))

      case MultiRelationshipPathStep(relExpression, SemanticDirection.OUTGOING, null, next) =>
        multiOutgoingRelationshipProjector(toCommandExpression(id, relExpression, self).get, project(next))

      case MultiRelationshipPathStep(relExpression, SemanticDirection.BOTH, null, next) =>
        multiUndirectedRelationshipProjector(toCommandExpression(id, relExpression, self).get, project(next))

      case NilPathStep =>
        nilProjector
    }

    val projector = project(e.step)
    // Symbol table dependencies is only used for runtime expressions by PatternMatcher. It would be nice to
    // get rid of this from runtime expressions.
    val dependencies = e.step.dependencies.flatMap(_.dependencies).map(_.name)

    SlottedProjectedPath(dependencies, projector)
  }

  // TODO: Fix
  override def toGroupingExpression(id: Id,
                                    groupings: Map[String, Expression],
                                    orderToLeverage: Seq[Expression],
                                    self: ExpressionConverters): Option[GroupingExpression] = {
    null;
  }
}
