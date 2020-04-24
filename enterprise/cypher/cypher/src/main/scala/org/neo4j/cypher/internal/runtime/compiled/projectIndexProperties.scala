/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.cypher.internal.runtime.compiled

import org.neo4j.cypher.internal.v3_6.logical.plans._
import org.neo4j.cypher.internal.v3_6.ast.semantics.{ExpressionTypeInfo, SemanticTable}
import org.neo4j.cypher.internal.v3_6.util.attribution.SameId
import org.neo4j.cypher.internal.v3_6.util.symbols.CTNode
import org.neo4j.cypher.internal.v3_6.util.{Rewriter, topDown}

/**
  * Replace index plans that have indexed properties with `GetValue` by plans
  * that have `DoNotGetValue` instead, with a projection to get the values on
  * top of the index plan.
  */
case object projectIndexProperties {

  def apply(plan: LogicalPlan, semanticTable: SemanticTable): (LogicalPlan, SemanticTable) = {
    var currentTypes = semanticTable.types

    val rewriter = topDown(Rewriter.lift {
      case indexLeafPlan: IndexLeafPlan if indexLeafPlan.cachedNodeProperties.nonEmpty =>
        val projections = indexLeafPlan.availableCachedNodeProperties.map {
          case (prop, cachedNodeProperty) => (cachedNodeProperty.cacheKey, prop)
        }
        // Register all variables in the property lookups as nodes
        projections.values.foreach { prop =>
          currentTypes = currentTypes.updated(prop.map, ExpressionTypeInfo(CTNode.invariant, None))
        }

        val newIndexPlan = indexLeafPlan.copyWithoutGettingValues
        Projection(newIndexPlan, projections)(SameId(indexLeafPlan.id))
    })

    val rewrittenPlan = rewriter(plan).asInstanceOf[LogicalPlan]
    val newSemanticTable = if(currentTypes == semanticTable.types) semanticTable else semanticTable.copy(types = currentTypes)
    (rewrittenPlan, newSemanticTable)
  }
}
