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
package org.neo4j.cypher.internal

import org.neo4j.codegen.api.CodeGeneration.CodeGenerationMode
import org.neo4j.cypher.internal.InterpretedRuntime.InterpretedExecutionPlan
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlan
import org.neo4j.cypher.internal.physicalplanning.PhysicalPlanner
import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.runtime.QueryIndexRegistrator
import org.neo4j.cypher.internal.runtime.interpreted.InterpretedPipeMapper
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.CommunityExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverter
import org.neo4j.cypher.internal.runtime.interpreted.commands.convert.ExpressionConverters
import org.neo4j.cypher.internal.runtime.interpreted.pipes.NestedPipeExpressions
import org.neo4j.cypher.internal.runtime.interpreted.pipes.Pipe
import org.neo4j.cypher.internal.runtime.interpreted.pipes.PipeTreeBuilder
import org.neo4j.cypher.internal.runtime.slotted.SlottedExecutionResultBuilderFactory
import org.neo4j.cypher.internal.runtime.slotted.SlottedPipeMapper
import org.neo4j.cypher.internal.runtime.slotted.SlottedPipelineBreakingPolicy
import org.neo4j.cypher.internal.runtime.slotted.expressions.CompiledExpressionConverter
import org.neo4j.cypher.internal.runtime.slotted.expressions.MaterializedEntitiesExpressionConverter
import org.neo4j.cypher.internal.runtime.slotted.expressions.SlottedExpressionConverters
import org.neo4j.cypher.internal.util.CodeGenUtils
import org.neo4j.cypher.internal.v4_0.util.CypherException
import org.neo4j.exceptions.CantCompileQueryException
import org.neo4j.internal.kernel.api.security.SecurityContext

object SlottedRuntime extends CypherRuntime[EnterpriseRuntimeContext] with DebugPrettyPrinter {

  override val PRINT_QUERY_TEXT = true
  override val PRINT_LOGICAL_PLAN = true
  override val PRINT_REWRITTEN_LOGICAL_PLAN = true
  override val PRINT_PIPELINE_INFO = true
  override val PRINT_FAILURE_STACK_TRACE = true
  val ENABLE_DEBUG_PRINTS = false // NOTE: false toggles all debug prints off, overriding the individual settings below
  // Should we print query text and logical plan before we see any exceptions from execution plan building?
  // Setting this to true is useful if you want to see the query and logical plan while debugging a failure
  // Setting this to false is useful if you want to quickly spot the failure reason at the top of the output from tests
  val PRINT_PLAN_INFO_EARLY = true

  /*

   */
  @throws[CantCompileQueryException]
  override def compileToExecutable(query: LogicalQuery, context: EnterpriseRuntimeContext, securityContext: SecurityContext): ExecutionPlan = {
    try {
      if (ENABLE_DEBUG_PRINTS && PRINT_PLAN_INFO_EARLY) {
        printPlanInfo(query)
      }

      val physicalPlan: PhysicalPlan = PhysicalPlanner.plan(context.tokenContext, query.logicalPlan, query.semanticTable, SlottedPipelineBreakingPolicy,
        false);
      if (ENABLE_DEBUG_PRINTS && PRINT_PLAN_INFO_EARLY) {
        printRewrittenPlanInfo(physicalPlan.logicalPlan)
      }
      val codeGenerationMode: CodeGenerationMode = CodeGenerationMode.fromDebugOptions(context.debugOptions)

      val baseConverters = new ExpressionConverters(
        SlottedExpressionConverters(physicalPlan),
        CommunityExpressionConverter(context.tokenContext))

      val converter = if (context.materializedEntitiesMode) {
        new MaterializedEntitiesExpressionConverter(context.tokenContext);

      }
      else if (context.compileExpressions) {
        new CompiledExpressionConverter(context.log, physicalPlan, context.tokenContext,
          query.readOnly, codeGenerationMode,
          false);
      }
      else {
        baseConverters
      }
      val allConverters: ExpressionConverter = converter.asInstanceOf[ExpressionConverter];

      val converters = new ExpressionConverters(allConverters);
      val queryIndexRegistrator: QueryIndexRegistrator = new QueryIndexRegistrator(context.schemaRead);
      val fallback: InterpretedPipeMapper =
        new InterpretedPipeMapper(query.readOnly, converters, context.tokenContext, queryIndexRegistrator)(query.semanticTable)

      val pipeBuilder: SlottedPipeMapper =
        new SlottedPipeMapper(fallback, converters, physicalPlan, query.readOnly, queryIndexRegistrator)(query.semanticTable)
      val pipeTreeBuilder: PipeTreeBuilder = new PipeTreeBuilder(pipeBuilder);
      val logicalPlanWithConvertedNestedPlans: LogicalPlan = NestedPipeExpressions.build(pipeTreeBuilder, physicalPlan.logicalPlan,
        physicalPlan.availableExpressionVariables);
      val pipe: Pipe = pipeTreeBuilder.build(logicalPlanWithConvertedNestedPlans);
      val columns: Array[String] = query.resultColumns;

      val resultBuilderFactory: SlottedExecutionResultBuilderFactory =
        new SlottedExecutionResultBuilderFactory(pipe, queryIndexRegistrator.result(), physicalPlan.nExpressionSlots, query.readOnly,
          columns, physicalPlan.
            logicalPlan, physicalPlan.slotConfigurations, physicalPlan.parameterMapping,
          context.config.lenientCreateRelationship, context.config.memoryTrackingController,
          query.hasLoadCSV)

      if (this.ENABLE_DEBUG_PRINTS) {
        if (!this.PRINT_PLAN_INFO_EARLY) {
          this.printPlanInfo(query);
          this.printRewrittenPlanInfo(physicalPlan.logicalPlan);
        }

        this.printPipe(physicalPlan.slotConfigurations, pipe);
      }

      val metadata: Seq[Argument] = CodeGenUtils.metadata(codeGenerationMode.saver);

      // Return
      new InterpretedExecutionPlan(query.periodicCommitInfo, resultBuilderFactory, SlottedRuntimeName,
        query.readOnly, metadata);

    }
    catch {
      case e: CypherException =>
        if (ENABLE_DEBUG_PRINTS) {
          printFailureStackTrace(e)
          if (!PRINT_PLAN_INFO_EARLY) {
            printPlanInfo(query)
          }
        }
        throw e
    }
  }

  override def name: String = "slotted"
}
