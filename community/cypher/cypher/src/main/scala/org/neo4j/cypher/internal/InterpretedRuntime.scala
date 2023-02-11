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

import org.neo4j.cypher.internal.logical.plans.TransactionApply
import org.neo4j.cypher.internal.logical.plans.TransactionForeach
import org.neo4j.cypher.internal.options.CypherRuntimeOption
import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.runtime.ExecutionMode
import org.neo4j.cypher.internal.runtime.ExplainMode
import org.neo4j.cypher.internal.runtime.InputDataStream
import org.neo4j.cypher.internal.runtime.ProfileMode
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.QueryIndexRegistrator
import org.neo4j.cypher.internal.runtime.expressionVariableAllocation
import org.neo4j.cypher.internal.runtime.expressionVariableAllocation.Result
import org.neo4j.cypher.internal.runtime.interpreted.ExecutionResultBuilderFactory
import org.neo4j.cypher.internal.runtime.interpreted.InterpretedExecutionResultBuilderFactory
import org.neo4j.cypher.internal.runtime.interpreted.InterpretedPipeMapper
import org.neo4j.cypher.internal.runtime.interpreted.TransactionsCountingQueryContext
import org.neo4j.cypher.internal.runtime.interpreted.UpdateCountingQueryContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.CommunityExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.runtime.interpreted.pipes.NestedPipeExpressions
import org.neo4j.cypher.internal.runtime.interpreted.pipes.PipeTreeBuilder
import org.neo4j.cypher.internal.runtime.interpreted.profiler.InterpretedProfileInformation
import org.neo4j.cypher.internal.runtime.interpreted.profiler.Profiler
import org.neo4j.cypher.internal.runtime.slottedParameters
import org.neo4j.cypher.internal.util.InternalNotification
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.exceptions.PeriodicCommitInOpenTransactionException
import org.neo4j.kernel.impl.query.QuerySubscriber
import org.neo4j.values.virtual.MapValue

object InterpretedRuntime extends CypherRuntime[RuntimeContext] {
  override def name: String = "interpreted"

  override def correspondingRuntimeOption: Option[CypherRuntimeOption] = Some(CypherRuntimeOption.interpreted)

  override def compileToExecutable(query: LogicalQuery, context: RuntimeContext): ExecutionPlan = {
    val Result(logicalPlan, nExpressionSlots, availableExpressionVars) = expressionVariableAllocation.allocate(query.logicalPlan)
    val (withSlottedParameters, parameterMapping) = slottedParameters(logicalPlan)

    val converters = new ExpressionConverters(CommunityExpressionConverter(context.tokenContext, context.anonymousVariableNameGenerator))
    val queryIndexRegistrator = new QueryIndexRegistrator(context.schemaRead)
    val pipeMapper = InterpretedPipeMapper(query.readOnly, converters, context.tokenContext, queryIndexRegistrator, context.anonymousVariableNameGenerator)(query.semanticTable)
    val pipeTreeBuilder = PipeTreeBuilder(pipeMapper)
    val logicalPlanWithConvertedNestedPlans = NestedPipeExpressions.build(pipeTreeBuilder, withSlottedParameters, availableExpressionVars)
    val pipe = pipeTreeBuilder.build(logicalPlanWithConvertedNestedPlans)
    val columns = query.resultColumns

    val startsTransactions = doesStartTransactions(query)

    val resultBuilderFactory = InterpretedExecutionResultBuilderFactory(pipe,
      queryIndexRegistrator.result(),
      nExpressionSlots,
      parameterMapping,
      columns,
      context.config.lenientCreateRelationship,
      context.config.memoryTrackingController,
      query.hasLoadCSV,
      startsTransactions)

    new InterpretedExecutionPlan(query.periodicCommitInfo,
      resultBuilderFactory,
      InterpretedRuntimeName,
      query.readOnly,
      startsTransactions,
      IndexedSeq.empty,
      Set.empty)
  }

  def doesStartTransactions(query: LogicalQuery): Boolean =
    query.logicalPlan.folder.treeExists {
      case _: TransactionForeach | _: TransactionApply => true // CALL { ... } IN TRANSACTIONS
    } || query.periodicCommitInfo.isDefined // USING PERIODIC COMMIT

  /**
   * Executable plan for a single cypher query. Warning, this class will get cached! Do not leak transaction objects
   * or other resources in here.
   */
  class InterpretedExecutionPlan(periodicCommit: Option[PeriodicCommitInfo],
                                 resultBuilderFactory: ExecutionResultBuilderFactory,
                                 override val runtimeName: RuntimeName,
                                 readOnly: Boolean,
                                 startsTransactions: Boolean,
                                 override val metadata: Seq[Argument],
                                 warnings: Set[InternalNotification]) extends ExecutionPlan {

    override def run(queryContext: QueryContext,
                     executionMode: ExecutionMode,
                     params: MapValue,
                     prePopulateResults: Boolean,
                     input: InputDataStream,
                     subscriber: QuerySubscriber): RuntimeResult = {
      val doProfile = executionMode == ProfileMode
      val wrappedContext = if (!readOnly || doProfile) new UpdateCountingQueryContext(queryContext) else queryContext
      val builderContext = if (startsTransactions) new TransactionsCountingQueryContext(wrappedContext) else wrappedContext
      val builder = resultBuilderFactory.create(builderContext)

      val profileInformation = new InterpretedProfileInformation

      if (periodicCommit.isDefined && executionMode != ExplainMode) {
        if (!builderContext.transactionalContext.isTopLevelTx)
          throw new PeriodicCommitInOpenTransactionException()
        builder.setLoadCsvPeriodicCommitObserver(periodicCommit.get.batchRowCount)
      }

      if (doProfile)
        builder.addProfileDecorator(new Profiler(queryContext.transactionalContext.dbmsInfo, profileInformation))

      builder.build(params, profileInformation, prePopulateResults, input, subscriber, doProfile)
    }

    override def notifications: Set[InternalNotification] = warnings
  }
}
