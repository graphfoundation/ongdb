/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.compiled_runtime.v3_5.codegen.ir

import java.util.concurrent.atomic.AtomicInteger

import org.mockito.Mockito._
import org.neo4j.cypher.internal.RewindableExecutionResult
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.{CompiledExecutionResult, CompiledPlan}
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen._
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen.ir.Instruction
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.ExecutionPlanBuilder.tracer
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.executionplan.Provider
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen.setStaticField
import org.neo4j.cypher.internal.compiler.v3_5.planner.LogicalPlanConstructionTestSupport
import org.neo4j.cypher.internal.planner.v3_5.spi.InstrumentedGraphStatistics
import org.neo4j.cypher.internal.planner.v3_5.spi.{CostBasedPlannerName, PlanContext}
import org.neo4j.cypher.internal.runtime.ProfileMode
import org.neo4j.cypher.internal.runtime.interpreted.TransactionBoundQueryContext.IndexSearchMonitor
import org.neo4j.cypher.internal.runtime.interpreted.{TransactionBoundQueryContext, TransactionalContextWrapper}
import org.neo4j.cypher.internal.runtime.planDescription.InternalPlanDescription
import org.neo4j.cypher.internal.runtime.{ExecutionMode, NormalMode, QueryContext}
import org.neo4j.cypher.internal.spi.v3_5.codegen.GeneratedQueryStructure
import org.neo4j.cypher.internal.v3_5.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.v3_5.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v3_5.util.attribution.Id
import org.neo4j.cypher.internal.v3_5.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.v3_5.codegen.QueryExecutionTracer
import org.neo4j.cypher.internal.v3_5.executionplan.{GeneratedQuery, GeneratedQueryExecution}
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.internal.kernel.api.Transaction.Type
import org.neo4j.kernel.GraphDatabaseQueryService
import org.neo4j.kernel.api.security.AnonymousContext
import org.neo4j.kernel.impl.coreapi.PropertyContainerLocker
import org.neo4j.kernel.impl.query.Neo4jTransactionalContextFactory
import org.neo4j.kernel.impl.query.clientconnection.ClientConnectionInfo
import org.neo4j.values.virtual.MapValue
import org.neo4j.values.virtual.VirtualValues.EMPTY_MAP
import org.scalatest.mock.MockitoSugar

trait CodeGenSugar extends MockitoSugar with LogicalPlanConstructionTestSupport with AstConstructionTestSupport {

  private val semanticTable = mock[SemanticTable]

  def compile(plan: LogicalPlan): CompiledPlan = {
    val statistics = mock[InstrumentedGraphStatistics]
    val context = mock[PlanContext]
    doReturn(statistics, Nil: _*).when(context).statistics
    new CodeGenerator(GeneratedQueryStructure)
      .generate(plan, semanticTable, CostBasedPlannerName.default, readOnly = true, new StubCardinalities, new StubProvidedOrders)
  }

  def compileAndExecute(plan: LogicalPlan,
                        graphDb: GraphDatabaseQueryService,
                        mode: ExecutionMode = NormalMode): RuntimeResult = {
    executeCompiled(compile(plan), graphDb, mode)
  }

  def executeCompiled(plan: CompiledPlan,
                      graphDb: GraphDatabaseQueryService,
                      mode: ExecutionMode = NormalMode): RuntimeResult = {
    val tx = graphDb.beginTransaction(Type.explicit, AnonymousContext.read())
    var transactionalContext: TransactionalContextWrapper = null
    try {
      val locker: PropertyContainerLocker = new PropertyContainerLocker
      val contextFactory = Neo4jTransactionalContextFactory.create(graphDb, locker)
      transactionalContext = TransactionalContextWrapper(
        contextFactory.newContext(ClientConnectionInfo.EMBEDDED_CONNECTION, tx,
          "no query text exists for this test", EMPTY_MAP))
      val queryContext = new TransactionBoundQueryContext(transactionalContext)(mock[IndexSearchMonitor])
      val result = plan.executionResultBuilder(queryContext, ProfileMode, tracer(mode, queryContext), EMPTY_MAP)
      tx.success()
      result
    } finally {
      transactionalContext.close(true)
      tx.close()
    }
  }

  def evaluate(instructions: Seq[Instruction],
               qtx: QueryContext = mockQueryContext(),
               columns: Seq[String] = Seq.empty,
               params: MapValue = EMPTY_MAP,
               operatorIds: Map[String, Id] = Map.empty): List[Map[String, Object]] = {
    val clazz = compile(instructions, columns, operatorIds)
    newInstance(clazz, queryContext = qtx, params = params).toList
  }

  def codeGenConfiguration: CodeGenConfiguration = CodeGenConfiguration(mode = ByteCodeMode)

  def compile(instructions: Seq[Instruction], columns: Seq[String],
              operatorIds: Map[String, Id] = Map.empty): GeneratedQuery = {
    // In reality the same namer should be used for construction Instruction as in generating code
    // these tests separate the concerns so we give this namer non-standard prefixes
    CodeGenerator.generateCode(GeneratedQueryStructure)(instructions, operatorIds, columns, codeGenConfiguration)(
      new CodeGenContext(new SemanticTable(), columns.indices.map(i => columns(i) -> i).toMap, new Namer(
        new AtomicInteger(0), varPrefix = "TEST_VAR", methodPrefix = "TEST_METHOD"))).query
  }

  def newInstance(clazz: GeneratedQuery,
                  queryContext: QueryContext = mockQueryContext(),
                  executionMode: ExecutionMode = null,
                  provider: Provider[InternalPlanDescription] = null,
                  queryExecutionTracer: QueryExecutionTracer = QueryExecutionTracer.NONE,
                  params: MapValue = EMPTY_MAP): RewindableExecutionResult = {

    val generated = clazz.execute(queryContext, executionMode, provider, queryExecutionTracer, params)
    val executionResult = new CompiledExecutionResult(generated, org.neo4j.cypher.result.QueryProfile.NONE)
    RewindableExecutionResult(executionResult, queryContext)
  }

  def insertStatic(clazz: Class[GeneratedQueryExecution], mappings: (String, Id)*): Unit = mappings.foreach {
    case (name, id) => setStaticField(clazz, name, id.asInstanceOf[AnyRef])
  }

  private def mockQueryContext() = {
    val qc = mock[QueryContext]
    val transactionalContext = mock[TransactionalContextWrapper]
    when(qc.transactionalContext).thenReturn(transactionalContext)

    qc
  }
}
