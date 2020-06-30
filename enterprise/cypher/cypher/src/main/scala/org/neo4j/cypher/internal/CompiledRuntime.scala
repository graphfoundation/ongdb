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

import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.profiling.ProfilingTracer
import org.neo4j.cypher.internal.runtime._
import org.neo4j.cypher.internal.runtime.compiled.CompiledPlan
import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenConfiguration
import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenerator
import org.neo4j.cypher.internal.v4_0.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v4_0.util.InternalNotification
import org.neo4j.exceptions.CantCompileQueryException
import org.neo4j.internal.kernel.api.security.SecurityContext
import org.neo4j.kernel.impl.query.QuerySubscriber
//import org.neo4j.cypher.internal.runtime.compiled.{CompiledPlan, projectIndexProperties}
//import org.neo4j.cypher.internal.runtime.planDescription.Argument
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.values.virtual.MapValue

object CompiledRuntime extends CypherRuntime[EnterpriseRuntimeContext] {

  @throws[CantCompileQueryException]
  override def compileToExecutable(logicalQuery: LogicalQuery, context: EnterpriseRuntimeContext, securityContext: SecurityContext): ExecutionPlan = {
    val (newPlan, newSemanticTable) = removeCachedProperties(logicalQuery.logicalPlan, logicalQuery.semanticTable)

    val codeGen = new CodeGenerator(context.codeStructure, context.clock, CodeGenConfiguration(context.debugOptions))

    val compiled: CompiledPlan = codeGen.generate(
      newPlan,
      context.tokenContext,
      newSemanticTable,
      logicalQuery.readOnly,

      logicalQuery.cardinalities, logicalQuery.resultColumns)
    new CompiledExecutionPlan(compiled)
  }

  override def name: String = "legacy_compiled"

  /**
   * Execution plan for compiled runtime. Beware: will be cached.
   */
  class CompiledExecutionPlan(val compiled: CompiledPlan) extends ExecutionPlan {

    override val runtimeName: RuntimeName = CompiledRuntimeName

    override def run(queryContext: QueryContext,
                     executionMode: ExecutionMode,
                     params: MapValue,
                     prePopulateResults: Boolean,
                     input: InputDataStream,
                     subscriber: QuerySubscriber
                    ): RuntimeResult = {
      val doProfile = executionMode == ProfileMode

      val tracer =
        if (doProfile) {
          Some(new ProfilingTracer(queryContext.transactionalContext.kernelStatisticProvider))
        } else {
          None
        }
      compiled.executionResultBuilder(queryContext, executionMode, tracer, params, prePopulateResults, subscriber)
    }

    override def metadata: Seq[Argument] = compiled.executionResultBuilder.metadata

    override def notifications: Set[InternalNotification] = Set.empty
  }

}

/**
 * // NOTE: This is only used by a top-down rewriter (removeCachedProperties).
 * // Since our generalized tree rewriters will descend into children (including Seq) we do not need to do anything
 */
case object removeCachedProperties {
  /**
   * TODO: Implement.
   *
   * @param plan
   * @param semanticTable
   * @return
   */
  def apply(plan: LogicalPlan, semanticTable: SemanticTable): Tuple2[LogicalPlan, SemanticTable] = {
    ???
  }
}

