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
package org.neo4j.cypher.internal.runtime.compiled.codegen.ir.functions

//import org.neo4j.cypher.internal.v3_6.util.InternalException

import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.expressions._
import org.neo4j.exceptions.InternalException

sealed trait CodeGenFunction1 {
  def apply(arg: CodeGenExpression): CodeGenExpression
}

case object IdCodeGenFunction extends CodeGenFunction1 {

  override def apply(arg: CodeGenExpression): CodeGenExpression = arg match {
    case NodeExpression(n) => IdOf(n)
    case NodeProjection(n) => IdOf(n)
    case RelationshipExpression(r) => IdOf(r)
    case RelationshipProjection(r) => IdOf(r)
    case e => throw new InternalException(s"id function only accepts nodes or relationships not $e")
  }
}

case object TypeCodeGenFunction extends CodeGenFunction1 {

  override def apply(arg: CodeGenExpression): CodeGenExpression = arg match {
    case r: RelationshipExpression => TypeOf(r.relId)
    case r: RelationshipProjection => TypeOf(r.relId)
    case e => throw new InternalException(s"type function only accepts relationships $e")
  }
}
