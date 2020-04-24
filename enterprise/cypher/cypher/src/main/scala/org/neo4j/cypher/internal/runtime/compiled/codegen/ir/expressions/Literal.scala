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
package org.neo4j.cypher.internal.runtime.compiled.codegen.ir.expressions

import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenContext
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.MethodStructure
import org.neo4j.cypher.internal.runtime.compiled.helpers.LiteralTypeSupport

case class Literal(value: Object) extends CodeGenExpression {

  override def init[E](generator: MethodStructure[E])(implicit context: CodeGenContext) = {}

  override def generateExpression[E](structure: MethodStructure[E])(implicit context: CodeGenContext) = {
    // When the literal value comes from the AST it should already have been converted
    assert({
      val needsConverison = value match {
        case n: java.lang.Byte => true // n.longValue()
        case n: java.lang.Short => true // n.longValue()
        case n: java.lang.Character => true // n.toString
        case n: java.lang.Integer => true // n.longValue()
        case n: java.lang.Float => true // n.doubleValue()
        case _ => false
      }
      !needsConverison
    })
    val ct = codeGenType
    if (value == null)
      structure.noValue()
    else if (ct.isPrimitive)
      structure.constantExpression(value)
    else
      structure.constantValueExpression(value, ct)
  }

  override def nullable(implicit context: CodeGenContext) = value == null

  override def codeGenType(implicit context: CodeGenContext) = LiteralTypeSupport.deriveCodeGenType(value)
}
