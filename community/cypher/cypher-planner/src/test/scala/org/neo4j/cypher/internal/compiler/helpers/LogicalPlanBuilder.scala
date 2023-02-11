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
package org.neo4j.cypher.internal.compiler.helpers

import org.neo4j.cypher.internal.ast.semantics.ExpressionTypeInfo
import org.neo4j.cypher.internal.compiler.helpers.LogicalPlanBuilder.FakeLeafPlan
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder
import org.neo4j.cypher.internal.logical.builder.AbstractLogicalPlanBuilder.pos
import org.neo4j.cypher.internal.logical.builder.Resolver
import org.neo4j.cypher.internal.logical.plans.LogicalLeafPlan
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Cardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.EffectiveCardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.ProvidedOrders
import org.neo4j.cypher.internal.rewriting.rewriters.HasLabelsAndHasTypeNormalizer
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.EffectiveCardinality
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.attribution.Default
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.cypher.internal.util.attribution.SameId
import org.neo4j.cypher.internal.util.symbols.CypherType

class LogicalPlanBuilder(wholePlan: Boolean = true, resolver: Resolver = new LogicalPlanResolver) extends AbstractLogicalPlanBuilder[LogicalPlan, LogicalPlanBuilder](resolver, wholePlan) {

  val cardinalities: Cardinalities = new Cardinalities with Default[LogicalPlan, Cardinality] {
    override protected def defaultValue: Cardinality = Cardinality.SINGLE
  }

  val effectiveCardinalities: EffectiveCardinalities = new EffectiveCardinalities with Default[LogicalPlan, EffectiveCardinality] {
    override protected def defaultValue: EffectiveCardinality = EffectiveCardinality(Cardinality.SINGLE.amount)
  }

  val providedOrders: ProvidedOrders = new ProvidedOrders with Default[LogicalPlan, ProvidedOrder] {
    override protected def defaultValue: ProvidedOrder = ProvidedOrder.empty
  }

  def fakeLeafPlan(args: String*): LogicalPlanBuilder = appendAtCurrentIndent(LeafOperator(FakeLeafPlan(args.toSet)(_)))

  private val hasLabelsAndHasTypeNormalizer = new HasLabelsAndHasTypeNormalizer {
    override def isNode(expr: Expression): Boolean = semanticTable.isNodeNoFail(expr)
    override def isRelationship(expr: Expression): Boolean = semanticTable.isRelationshipNoFail(expr)
  }

  override protected def rewriteExpression(expr: Expression): Expression =
    hasLabelsAndHasTypeNormalizer.rewrite(expr)

  def withCardinality(x: Double): LogicalPlanBuilder = {
    cardinalities.set(idOfLastPlan, Cardinality(x))
    this
  }

  def withEffectiveCardinality(x: Double): LogicalPlanBuilder = {
    effectiveCardinalities.set(idOfLastPlan, EffectiveCardinality(x))
    this
  }

  def withProvidedOrder(order: ProvidedOrder): LogicalPlanBuilder = {
    providedOrders.set(idOfLastPlan, order)
    this
  }

  def newVar(name: String, typ: CypherType): LogicalPlanBuilder = {
    newVar(name, pos, typ)
  }

  def newVar(name: String, inputPosition: InputPosition, typ: CypherType): LogicalPlanBuilder = {
    val variable = Variable(name)(inputPosition)
    semanticTable = semanticTable.copy(types = semanticTable.types.updated(variable, ExpressionTypeInfo(typ.invariant, None)))
    this
  }

  def build(readOnly: Boolean = true): LogicalPlan = {
    buildLogicalPlan()
  }
}

object LogicalPlanBuilder {
  case class FakeLeafPlan(argumentIds: Set[String] = Set.empty)(implicit idGen: IdGen) extends LogicalLeafPlan(idGen) {
    override val availableSymbols: Set[String] = argumentIds
    override def usedVariables: Set[String] = Set.empty
    override def withoutArgumentIds(argsToExclude: Set[String]): LogicalLeafPlan = copy(argumentIds = argumentIds -- argsToExclude)(SameId(this.id))
  }
}
