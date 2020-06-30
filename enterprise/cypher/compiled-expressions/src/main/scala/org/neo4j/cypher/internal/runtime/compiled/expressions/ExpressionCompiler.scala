/*
 *   Copyright (c) 2002-2018 "Neo4j"
 *   Neo4j Sweden AB [http://neo4j.com]
 *
 *   Copyright (c) 2018-2020 "Graph Foundation"
 *   Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.cypher.internal.runtime.compiled.expressions

import org.neo4j.codegen.MethodDeclaration.method
import org.neo4j.codegen.Parameter.param
import org.neo4j.codegen._
import org.neo4j.codegen.api.CodeGeneration.CodeGenerationMode
import org.neo4j.codegen.api.IntermediateRepresentation
import org.neo4j.cypher.internal.physicalplanning.SlotConfiguration
import org.neo4j.cypher.internal.v4_0.expressions.Expression
import org.neo4j.cypher.internal.runtime.DbAccess
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.internal.kernel.api.NodeCursor
import org.neo4j.values.AnyValue
import org.neo4j.values.storable._
import org.neo4j.values.virtual.MapValue

import scala.reflect.ManifestFactory
import org.neo4j.cypher.internal.runtime.ExpressionCursors;
/**
 *
 * Produces runnable code from an IntermediateRepresentation
 * Changed name from CodeGeneration to ExpressionCompiler
 *
 *
 * TODO: Implement using See 3.5 org.neo4j.cypher.internal.runtime.compiled.expressions.CodeGeneration.scala
 * @param slots
 * @param readOnly
 * @param codeGenerationMode
 * @param namer
 */
abstract class ExpressionCompiler(
                                   val slots: SlotConfiguration,
                                   val readOnly: Boolean,
                                   val codeGenerationMode: CodeGenerationMode,
                                   val namer: VariableNamer
                                 ) {

  private val DEBUG = false
  private val VALUES = classOf[Values]
  private val LONG = classOf[LongValue]
  private val DOUBLE = classOf[DoubleValue]
  private val TEXT = classOf[TextValue]
  private val PACKAGE_NAME = "org.neo4j.codegen"
  private val EXPRESSION = classOf[CompiledExpression]
  private val PROJECTION = classOf[CompiledProjection]
  private val COMPUTE_METHOD: MethodDeclaration.Builder = method(classOf[AnyValue], "evaluate",
    param(classOf[ExecutionContext], "context"),
    param(classOf[DbAccess], "dbAccess"),
    param(classOf[MapValue], "params"))
  private val PROJECT_METHOD: MethodDeclaration.Builder = method(classOf[Unit], "project",
    param(classOf[ExecutionContext], "context"),
    param(classOf[DbAccess], "dbAccess"),
    param(classOf[MapValue], "params"))




  private def className(): String = "Expression" + System.nanoTime()



  def compileExpression(expression: Expression): Option[CompiledExpression] = {

    null
  }

  def compileProjection(projections: Map[String, Expression]): Option[CompiledProjection] = {
    null
  }

  def compileGrouping(
                       orderedGroupings: Function1[SlotConfiguration, Seq[Tuple3[String, Expression, Boolean]]]
                     ): Option[CompiledGroupingExpression] = {
    null
  }

  def intermediateCompileGroupingKey(
                                      orderedGroupings: scala.Seq[org.neo4j.cypher.internal.v4_0.expressions.Expression]
                                    ): Option[org.neo4j.cypher.internal.runtime.compiled.expressions.IntermediateExpression] = {
    null
  }

  def intermediateCompileExpression(
                                     expression: org.neo4j.cypher.internal.v4_0.expressions.Expression
                                   ): Option[org.neo4j.cypher.internal.runtime.compiled.expressions.IntermediateExpression] = {
    null
  }

  def compileFunction(
                       c: org.neo4j.cypher.internal.v4_0.expressions.FunctionInvocation
                     ): Option[org.neo4j.cypher.internal.runtime.compiled.expressions.IntermediateExpression] = {
    null
  }

  def intermediateCompileProjection(
                                     projections: Map[
                                       String,
                                       org.neo4j.cypher.internal.v4_0.expressions.Expression
                                     ]
                                   ): Option[org.neo4j.cypher.internal.runtime.compiled.expressions.IntermediateExpression] = {
    null
  }

  def getArgumentAt(offset: Int): org.neo4j.codegen.api.IntermediateRepresentation = {
    null
  }

  final def getLongFromExecutionContext(
                                         offset: Int,
                                         context: org.neo4j.codegen.api.IntermediateRepresentation = {
                                           ???
                                         }
                                       ): org.neo4j.codegen.api.IntermediateRepresentation = {
    null
  }

  final def getRefFromExecutionContext(
                                        offset: Int,
                                        context: org.neo4j.codegen.api.IntermediateRepresentation = {
                                          ???
                                        }
                                      ): org.neo4j.codegen.api.IntermediateRepresentation = {
    null
  }

  final def getCachedPropertyFromExecutionContext(
                                                   offset: Int,
                                                   context: org.neo4j.codegen.api.IntermediateRepresentation = {
                                                     ???
                                                   }
                                                 ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  final def setRefInExecutionContext(
                                      offset: Int,
                                      value: org.neo4j.codegen.api.IntermediateRepresentation
                                    ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  final def setLongInExecutionContext(
                                       offset: Int,
                                       value: org.neo4j.codegen.api.IntermediateRepresentation
                                     ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected def getLongAt(offset: Int): org.neo4j.codegen.api.IntermediateRepresentation

  protected def getRefAt(offset: Int): org.neo4j.codegen.api.IntermediateRepresentation

  protected def setRefAt(
                          offset: Int,
                          value: org.neo4j.codegen.api.IntermediateRepresentation
                        ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def setLongAt(
                           offset: Int,
                           value: org.neo4j.codegen.api.IntermediateRepresentation
                         ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def setCachedPropertyAt(
                                     offset: Int,
                                     value: org.neo4j.codegen.api.IntermediateRepresentation
                                   ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def getCachedPropertyAt(
                                     property: org.neo4j.cypher.internal.physicalplanning.ast.SlottedCachedProperty,
                                     getFromStore: org.neo4j.codegen.api.IntermediateRepresentation
                                   ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def isLabelSetOnNode(
                                  labelToken: org.neo4j.codegen.api.IntermediateRepresentation,
                                  offset: Int
                                ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def getNodeProperty(
                                 propertyToken: org.neo4j.codegen.api.IntermediateRepresentation,
                                 offset: Int
                               ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def getRelationshipProperty(
                                         propertyToken: org.neo4j.codegen.api.IntermediateRepresentation,
                                         offset: Int
                                       ): org.neo4j.codegen.api.IntermediateRepresentation

  protected def getProperty(
                             key: String,
                             container: org.neo4j.codegen.api.IntermediateRepresentation
                           ): org.neo4j.codegen.api.IntermediateRepresentation

  protected final def setCachedPropertyInExecutionContext(
                                                           offset: Int,
                                                           value: org.neo4j.codegen.api.IntermediateRepresentation
                                                         ): org.neo4j.codegen.api.IntermediateRepresentation = {
   ???
  }
}

class DefaultExpressionCompiler(
                                 slots: org.neo4j.cypher.internal.physicalplanning.SlotConfiguration,
                                 readOnly: Boolean,
                                 codeGenerationMode: org.neo4j.codegen.api.CodeGeneration.CodeGenerationMode,
                                 namer: org.neo4j.cypher.internal.runtime.compiled.expressions.VariableNamer
                               ) extends org.neo4j.cypher.internal.runtime.compiled.expressions.ExpressionCompiler(
  slots,
  readOnly,
  codeGenerationMode,
  namer
) {
  protected override def getLongAt(
                                    offset: Int
                                  ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def getRefAt(
                                   offset: Int
                                 ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def setRefAt(
                                   offset: Int,
                                   value: org.neo4j.codegen.api.IntermediateRepresentation
                                 ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def setLongAt(
                                    offset: Int,
                                    value: org.neo4j.codegen.api.IntermediateRepresentation
                                  ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def setCachedPropertyAt(
                                              offset: Int,
                                              value: org.neo4j.codegen.api.IntermediateRepresentation
                                            ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def getCachedPropertyAt(
                                              property: org.neo4j.cypher.internal.physicalplanning.ast.SlottedCachedProperty,
                                              getFromStore: org.neo4j.codegen.api.IntermediateRepresentation
                                            ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def isLabelSetOnNode(
                                           labelToken: org.neo4j.codegen.api.IntermediateRepresentation,
                                           offset: Int
                                         ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def getNodeProperty(
                                          propertyToken: org.neo4j.codegen.api.IntermediateRepresentation,
                                          offset: Int
                                        ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def getRelationshipProperty(
                                                  propertyToken: org.neo4j.codegen.api.IntermediateRepresentation,
                                                  offset: Int
                                                ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }

  protected override def getProperty(
                                      key: String,
                                      container: org.neo4j.codegen.api.IntermediateRepresentation
                                    ): org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }
}

object ExpressionCompiler extends scala.AnyRef {

  // TODO: Fix
  val DB_ACCESS: IntermediateRepresentation = {
    IntermediateRepresentation.load("dbAccess")
  }
  // TODO: Fix
  val NODE_CURSOR: IntermediateRepresentation = {
    IntermediateRepresentation.load("nodeCursor")
  }
  // TODO: Fix



  val vNODE_CURSOR: LocalVariable = {
    createNodeCursorVariable("nodeCursor", ManifestFactory.classType(classOf[NodeCursor]));

  }
  // TODO: Fix
  val RELATIONSHIP_CURSOR: org.neo4j.codegen.api.IntermediateRepresentation = {
    IntermediateRepresentation.load("relationshipScanCursor")
  }
  // TODO: Implement
  val vRELATIONSHIP_CURSOR: org.neo4j.codegen.api.LocalVariable = {
    ???
  }
  // TODO: Implement
  val PROPERTY_CURSOR: org.neo4j.codegen.api.IntermediateRepresentation = {
    ???
  }
  // TODO: Implement
  val vPROPERTY_CURSOR: org.neo4j.codegen.api.LocalVariable = {
    ???
  }
  // TODO: Implement
  val NODE_PROPERTY: org.neo4j.codegen.api.Method = {
    ???
  }
  // TODO: Implement
  val RELATIONSHIP_PROPERTY: org.neo4j.codegen.api.Method = {
    ???
  }




  private def className(): String = "Expression" + System.nanoTime()
  /**
   *
   * @param name
   * @param value
   * @return
   */
  def createNodeCursorVariable(name: String, value: Manifest[Nothing]): LocalVariable = {
    ???
    //IntermediateRepresentation.variable(name,
    //                                      IntermediateRepresentation.invoke(IntermediateRepresentation.load("cursors"),
    //                                        IntermediateRepresentation.method(....)
    //                                      )
  }

}
