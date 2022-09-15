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
package org.neo4j.cypher.internal.planner.spi

import org.neo4j.cypher.internal.ir.PlannerQueryPart
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Cardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.EffectiveCardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.LeveragedOrders
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.ProvidedOrders
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Solveds
import org.neo4j.cypher.internal.util.Cardinality
import org.neo4j.cypher.internal.util.EffectiveCardinality
import org.neo4j.cypher.internal.util.attribution.Attribute
import org.neo4j.cypher.internal.util.attribution.Attributes
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.cypher.internal.util.attribution.PartialAttribute

object PlanningAttributes {
  class Solveds extends Attribute[LogicalPlan, PlannerQueryPart]
  class Cardinalities extends Attribute[LogicalPlan, Cardinality]
  class EffectiveCardinalities extends Attribute[LogicalPlan, EffectiveCardinality]
  class ProvidedOrders extends Attribute[LogicalPlan, ProvidedOrder]
  class LeveragedOrders extends PartialAttribute[LogicalPlan, Boolean](false)

  def newAttributes: PlanningAttributes = PlanningAttributes(new Solveds, new Cardinalities, new EffectiveCardinalities, new ProvidedOrders, new LeveragedOrders)
}

case class PlanningAttributes(solveds: Solveds, cardinalities: Cardinalities, effectiveCardinalities: EffectiveCardinalities, providedOrders: ProvidedOrders, leveragedOrders: LeveragedOrders) {
  private val attributes = productIterator.asInstanceOf[Iterator[Attribute[LogicalPlan, _]]].toSeq

  def asAttributes(idGen: IdGen): Attributes[LogicalPlan] = Attributes[LogicalPlan](idGen, attributes: _*)

  // Let's not override the copy method of case classes
  def createCopy() : PlanningAttributes =
    PlanningAttributes(solveds.clone[Solveds],
      cardinalities.clone[Cardinalities],
      effectiveCardinalities.clone[EffectiveCardinalities],
      providedOrders.clone[ProvidedOrders],
      leveragedOrders.clone[LeveragedOrders]
    )

  def hasEqualSizeAttributes: Boolean = {
    val fullAttributes = attributes.filter(!_.isInstanceOf[PartialAttribute[_, _]])
    fullAttributes.tail.forall(_.size == fullAttributes.head.size)
  }

  def cacheKey: PlanningAttributesCacheKey = {
    PlanningAttributesCacheKey(cardinalities, effectiveCardinalities, providedOrders, leveragedOrders)
  }
}

case class PlanningAttributesCacheKey(cardinalities: Cardinalities, effectiveCardinalities: EffectiveCardinalities, providedOrders: ProvidedOrders, leveragedOrders: LeveragedOrders)
