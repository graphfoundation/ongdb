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
package org.neo4j.cypher.internal.runtime.compiled.codegen

import java.time.Clock
import java.util

import org.neo4j.cypher.internal.executionplan.GeneratedQuery
import org.neo4j.cypher.internal.executionplan.GeneratedQueryExecution
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ProduceResult
import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Cardinalities
import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.cypher.internal.profiling.ProfilingTracer
import org.neo4j.cypher.internal.profiling.QueryProfiler
import org.neo4j.cypher.internal.runtime.ExecutionMode
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.compiled
import org.neo4j.cypher.internal.runtime.compiled.CompiledExecutionResult
import org.neo4j.cypher.internal.runtime.compiled.CompiledPlan
import org.neo4j.cypher.internal.runtime.compiled.RunnablePlan
import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.Instruction
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.CodeStructure
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.CodeStructureResult
import org.neo4j.cypher.internal.v4_0.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v4_0.util.Eagerly
import org.neo4j.cypher.internal.v4_0.util.attribution.Id
import org.neo4j.cypher.result.QueryProfile
import org.neo4j.cypher.result.RuntimeResult
import org.neo4j.exceptions.CantCompileQueryException
import org.neo4j.kernel.impl.query.QuerySubscriber
import org.neo4j.values.virtual.MapValue

class CodeGenerator(val structure: CodeStructure[GeneratedQuery],
                    clock: Clock,
                    conf: CodeGenConfiguration = CodeGenConfiguration()) {

  import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenerator.generateCode

  def generate(plan: LogicalPlan,
               tokenContext: TokenContext,
               semanticTable: SemanticTable,
               readOnly: Boolean,
               cardinalities: Cardinalities,
               originalReturnColumns: Array[String]
              ): CompiledPlan = {
    plan match {
      case res: ProduceResult =>
        val query: CodeStructureResult[GeneratedQuery] = try {
          generateQuery(plan, semanticTable, res.columns, conf, cardinalities)
        } catch {
          case e: CantCompileQueryException => throw e
          case e: Exception => throw new CantCompileQueryException(e.getMessage, e)
        }

        val builder = new RunnablePlan {

          override def apply(queryContext: QueryContext,
                             execMode: ExecutionMode,
                             tracer: Option[ProfilingTracer],
                             params: MapValue,
                             prePopulateResults: Boolean,
                             subscriber: QuerySubscriber): RuntimeResult = {

            val execution: GeneratedQueryExecution = query.query.execute(queryContext, tracer.getOrElse(QueryProfiler.NONE), params);


            new CompiledExecutionResult(queryContext, execution, tracer.getOrElse(QueryProfile.NONE),
              prePopulateResults,
              subscriber,
              originalReturnColumns)
          }

          def metadata: Seq[Argument] = query.code

        }
        compiled.CompiledPlan(updating = false, res.columns, builder)

      case _ => throw new CantCompileQueryException("Can only compile plans with ProduceResult on top")
    }
  }

  private def generateQuery(plan: LogicalPlan, semantics: SemanticTable,
                            columns: Seq[String], conf: CodeGenConfiguration, cardinalities: Cardinalities): CodeStructureResult[GeneratedQuery] = {
    import org.neo4j.cypher.internal.runtime.compiled.codegen.LogicalPlanConverter._
    val lookup = columns.indices.map(i => columns(i) -> i).toMap
    implicit val context = new CodeGenContext(semantics, lookup)
    val (_, instructions) = asCodeGenPlan(plan).produce(context, cardinalities)
    generateCode(structure)(instructions, context.operatorIds.toMap, columns, conf)
  }

  private def asJavaHashMap(params: scala.collection.Map[String, Any]) = {
    val jMap = new util.HashMap[String, Object]()
    params.foreach {
      case (key, value) => jMap.put(key, javaValue(value))
    }
    jMap
  }

  import scala.collection.JavaConverters._

  private def javaValue(value: Any): Object = value match {
    case null => null
    case iter: Seq[_] => iter.map(javaValue).asJava
    case iter: scala.collection.Map[_, _] => Eagerly.immutableMapValues(iter, javaValue).asJava
    case x: Any => x.asInstanceOf[AnyRef]
  }
}

object CodeGenerator {
  type SourceSink = Option[(String, String) => Unit]

  def generateCode[T](structure: CodeStructure[T])(instructions: Seq[Instruction],
                                                   operatorIds: Map[String, Id],
                                                   columns: Seq[String],
                                                   conf: CodeGenConfiguration)(implicit context: CodeGenContext): CodeStructureResult[T] = {
    structure.generateQuery(Namer.newClassName(), columns, operatorIds, conf) { accept =>
      instructions.foreach(insn => insn.init(accept))
      instructions.foreach(insn => insn.body(accept))
    }
  }
}
