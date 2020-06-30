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
package org.neo4j.cypher.internal.runtime.compiled.codegen.ir

import org.neo4j.cypher.internal.runtime.compiled.codegen._
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi._

sealed trait BuildProbeTable extends Instruction {

  protected val name: String

  override def init[E](generator: MethodStructure[E])(implicit context: CodeGenContext) =
    generator.allocateProbeTable(name, tableType)

  def joinData: JoinData

  def tableType: JoinTableType

  override protected def children = Seq.empty
}

object BuildProbeTable {

  def apply(id: String, name: String, nodes: Set[Variable], valueSymbols: Map[String, Variable])(implicit context: CodeGenContext): BuildProbeTable = {
    if (valueSymbols.isEmpty) {
      BuildCountingProbeTable(id, name, nodes)
    } else {
      BuildRecordingProbeTable(id, name, nodes, valueSymbols)
    }
  }
}

case class BuildRecordingProbeTable(id: String, name: String, nodes: Set[Variable], valueSymbols: Map[String, Variable])
                                   (implicit context: CodeGenContext)
  extends BuildProbeTable {

  override val tableType = if (nodes.size == 1) {
    LongToListTable(tupleDescriptor, varNameToField)
  } else {
    LongsToListTable(tupleDescriptor, varNameToField)
  }
  val joinData: JoinData = JoinData(fieldToVarName, name, tableType, id)
  private val fieldToVarName = valueSymbols.map {
    case (variable, incoming) => (context.namer.newVarName(), VariableData(variable, incoming, incoming.copy(name = context.namer.newVarName())))
  }

  private val varNameToField = fieldToVarName.map {
    case (fieldName, localName) => localName.outgoing.name -> fieldName
  }

  private val tupleDescriptor = SimpleTupleDescriptor(fieldToVarName.mapValues(c => c.outgoing.codeGenType))

  override def body[E](generator: MethodStructure[E])(implicit ignored: CodeGenContext): Unit = {
    generator.trace(id, Some(this.getClass.getSimpleName)) { body =>
      val tuple = body.newTableValue(context.namer.newVarName(), tupleDescriptor)
      fieldToVarName.foreach {
        case (fieldName, localName) => body.putField(tupleDescriptor, tuple, fieldName, localName.incoming.name)
      }
      body.updateProbeTable(tupleDescriptor, name, tableType.asInstanceOf[RecordingJoinTableType], keyVars = nodes.toIndexedSeq.map(_.name), tuple)
    }
  }

  override protected def operatorId = Set(id)
}

case class BuildCountingProbeTable(id: String, name: String, nodes: Set[Variable]) extends BuildProbeTable {

  override val tableType = if (nodes.size == 1) LongToCountTable else LongsToCountTable

  override def body[E](generator: MethodStructure[E])(implicit context: CodeGenContext) =
    generator.trace(id, Some(this.getClass.getSimpleName)) { body =>
      body.updateProbeTableCount(name, tableType.asInstanceOf[CountingJoinTableType], nodes.toIndexedSeq.map(_.name))
    }

  override def joinData = {
    JoinData(Map.empty, name, tableType, id)
  }

  override protected def operatorId = Set(id)
}

case class VariableData(variable: String, incoming: Variable, outgoing: Variable)

case class JoinData(vars: Map[String, VariableData], tableVar: String, tableType: JoinTableType, id: String)
