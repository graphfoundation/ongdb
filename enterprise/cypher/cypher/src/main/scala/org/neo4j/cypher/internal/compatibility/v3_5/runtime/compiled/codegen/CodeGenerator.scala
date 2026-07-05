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
package org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen

import org.neo4j.cypher.internal.compatibility.v3_5.runtime.CompiledRuntimeName
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.executionplan.Provider
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.{CompiledExecutionResult, CompiledPlan, RunnablePlan}
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.ExecutionPlanBuilder.DescriptionProvider
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen.ir.Instruction
import org.neo4j.cypher.internal.compatibility.v3_5.runtime.compiled.codegen.spi.{CodeStructure, CodeStructureResult}
import org.neo4j.cypher.internal.compiler.v3_5.planner.CantCompileQueryException
import org.neo4j.cypher.internal.planner.v3_5.spi.PlanningAttributes.{Cardinalities, ProvidedOrders}
import org.neo4j.cypher.internal.runtime.{ExecutionMode, QueryContext}
import org.neo4j.cypher.internal.runtime.planDescription.{InternalPlanDescription, LogicalPlan2PlanDescription}
import org.neo4j.cypher.internal.runtime.planDescription.InternalPlanDescription.Arguments.{Runtime, RuntimeImpl}
import org.neo4j.cypher.internal.v3_5.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.v3_5.codegen.QueryExecutionTracer
import org.neo4j.cypher.internal.v3_5.executionplan.{GeneratedQuery, GeneratedQueryExecution}
import org.neo4j.cypher.internal.v3_5.frontend.PlannerName
import org.neo4j.cypher.internal.v3_5.logical.plans.{LogicalPlan, ProduceResult}
import org.neo4j.cypher.internal.v3_5.util.Eagerly
import org.neo4j.cypher.internal.v3_5.util.attribution.Id
import org.neo4j.cypher.result.{QueryProfile, RuntimeResult}
import org.neo4j.values.virtual.MapValue

class CodeGenerator(val structure: CodeStructure[GeneratedQuery],
                    conf: CodeGenConfiguration = CodeGenConfiguration()
                   ) {

  import CodeGenerator.generateCode

  def generate(plan: LogicalPlan,
               semanticTable: SemanticTable,
               plannerName: PlannerName,
               readOnly: Boolean,
               cardinalities: Cardinalities,
               providedOrders: ProvidedOrders
              ): CompiledPlan = {
    plan match {
      case res: ProduceResult =>
        val query: CodeStructureResult[GeneratedQuery] = try {
          generateQuery(plan, semanticTable, res.columns, conf, cardinalities)
        } catch {
          case e: CantCompileQueryException => throw e
          case e: Exception => throw new CantCompileQueryException(cause = e)
        }

        val description = new Provider[InternalPlanDescription] {
          override def get(): InternalPlanDescription = {
            val d = LogicalPlan2PlanDescription(plan, plannerName, readOnly, cardinalities, providedOrders)
            query.code.foldLeft(d) {
              case (descriptionRoot, code) => descriptionRoot.addArgument(code)
            }.addArgument(Runtime(CompiledRuntimeName.toTextOutput))
              .addArgument(RuntimeImpl(CompiledRuntimeName.name))
          }
        }

        val builder = new RunnablePlan {
          def apply(queryContext: QueryContext,
                    execMode: ExecutionMode,
                    descriptionProvider: DescriptionProvider,
                    params: MapValue): RuntimeResult = {

            val (provider, tracer) = descriptionProvider(description)
            val execution: GeneratedQueryExecution = query.query.execute(queryContext, execMode, provider,
                                                                         tracer.getOrElse(QueryExecutionTracer.NONE), params)
            val profile = tracer.collect { case profile: QueryProfile => profile }.getOrElse(QueryProfile.NONE)
            new CompiledExecutionResult(execution, profile)
          }
        }

        CompiledPlan(updating = false, description, res.columns, builder)

      case _ => throw new CantCompileQueryException("Can only compile plans with ProduceResult on top")
    }
  }

  private def generateQuery(plan: LogicalPlan, semantics: SemanticTable,
                            columns: Seq[String], conf: CodeGenConfiguration, cardinalities: Cardinalities): CodeStructureResult[GeneratedQuery] = {
    import LogicalPlanConverter._
    val lookup = columns.indices.map(i => columns(i) -> i).toMap
    implicit val context: CodeGenContext = new CodeGenContext(semantics, lookup)
    val (_, instructions) = asCodeGenPlan(plan).produce(context, cardinalities)
    generateCode(structure)(instructions, context.operatorIds.map {
      case (id: Id, field: String) => field -> id
    }.toMap, columns, conf)
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

  def generateCode[T](structure: CodeStructure[T])(instructions: Seq[Instruction],
                                                   operatorIds: Map[String, Id],
                                                   columns: Seq[String],
                                                   conf: CodeGenConfiguration)(implicit context: CodeGenContext): CodeStructureResult[T] = {
    structure.generateQuery(Namer.newClassName(), columns, operatorIds, conf) { accept =>
      instructions.foreach(instruction => instruction.init(accept))
      instructions.foreach(instruction => instruction.body(accept))
    }
  }
}
