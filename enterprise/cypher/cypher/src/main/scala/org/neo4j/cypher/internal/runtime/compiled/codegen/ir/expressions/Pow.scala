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
import org.neo4j.cypher.internal.v4_0.util.symbols.CTFloat

case class Pow(lhs: CodeGenExpression, rhs: CodeGenExpression)
  extends CodeGenExpression with BinaryOperator {

  override def nullable(implicit context: CodeGenContext) = lhs.nullable || rhs.nullable

  override def name: String = "pow"

  override def codeGenType(implicit context: CodeGenContext) =
    (lhs.codeGenType.ct, rhs.codeGenType.ct) match {
      case (Number(_), Number(_)) => CypherCodeGenType(CTFloat, ReferenceType)
      case _ => CodeGenType.Any
    }

  override protected def generator[E](structure: MethodStructure[E])(implicit context: CodeGenContext) = structure.powExpression
}
