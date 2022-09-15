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
package org.neo4j.cypher.internal.compiler.phases

import org.neo4j.cypher.internal.ast.AdministrationCommand
import org.neo4j.cypher.internal.ast.Query
import org.neo4j.cypher.internal.ast.UnionAll
import org.neo4j.cypher.internal.ast.UnionDistinct
import org.neo4j.cypher.internal.ast.semantics.SemanticFeature
import org.neo4j.cypher.internal.compiler.ast.convert.plannerQuery.StatementConverters.toPlannerQuery
import org.neo4j.cypher.internal.frontend.phases.AmbiguousNamesDisambiguated
import org.neo4j.cypher.internal.frontend.phases.BaseContext
import org.neo4j.cypher.internal.frontend.phases.BaseState
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer.CompilationPhase.LOGICAL_PLANNING
import org.neo4j.cypher.internal.frontend.phases.InPredicatesCollapsed
import org.neo4j.cypher.internal.frontend.phases.Phase
import org.neo4j.cypher.internal.frontend.phases.StatementCondition
import org.neo4j.cypher.internal.frontend.phases.Transformer
import org.neo4j.cypher.internal.frontend.phases.factories.PlanPipelineTransformerFactory
import org.neo4j.cypher.internal.frontend.phases.rewriting.cnf.CNFNormalizer.PredicatesInCNF
import org.neo4j.cypher.internal.ir.PlannerQuery
import org.neo4j.cypher.internal.ir.UnionQuery
import org.neo4j.cypher.internal.rewriting.conditions.SemanticInfoAvailable
import org.neo4j.cypher.internal.rewriting.conditions.aggregationsAreIsolated
import org.neo4j.cypher.internal.rewriting.conditions.containsNamedPathOnlyForShortestPath
import org.neo4j.cypher.internal.rewriting.conditions.containsNoNodesOfType
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.exceptions.DatabaseAdministrationException
import org.neo4j.exceptions.InternalException

/**
 * From the normalized ast, create the corresponding PlannerQuery.
 */
case object CreatePlannerQuery extends Phase[BaseContext, BaseState, LogicalPlanState] with StepSequencer.Step with PlanPipelineTransformerFactory {
  override def phase = LOGICAL_PLANNING

  override def process(from: BaseState, context: BaseContext): LogicalPlanState = from.statement() match {
    case query: Query =>
      val plannerQuery: PlannerQuery = toPlannerQuery(query, from.semanticTable(), from.anonymousVariableNameGenerator)
      LogicalPlanState(from).copy(maybeQuery = Some(plannerQuery))

    case command: AdministrationCommand => throw new DatabaseAdministrationException(
      s"This is an administration command and it should be executed against the system database: ${command.name}")

    case x => throw new InternalException(s"Expected a Query and not `$x`")
  }

  override def preConditions: Set[StepSequencer.Condition] = Set(
    // We would get MatchErrors if the first 3 conditions would not be met.
    StatementCondition(containsNamedPathOnlyForShortestPath),
    StatementCondition(containsNoNodesOfType[UnionAll]),
    StatementCondition(containsNoNodesOfType[UnionDistinct]),
    // The PlannerQuery we create should already contain disambiguated names
    AmbiguousNamesDisambiguated,
    // and we want to take advantage of isolated aggregations in the planner
    StatementCondition(aggregationsAreIsolated),
    InPredicatesCollapsed
  ) ++
    // The PlannerQuery should be created based on normalised predicates
    PredicatesInCNF ++
    // We look up semantic info during PlannerQuery building
    SemanticInfoAvailable

  override def postConditions = Set(CompilationContains[UnionQuery])

  override def invalidatedConditions: Set[StepSequencer.Condition] = Set.empty

  override def getTransformer(pushdownPropertyReads: Boolean, semanticFeatures: Seq[SemanticFeature]): Transformer[BaseContext, BaseState, LogicalPlanState] = this
}
