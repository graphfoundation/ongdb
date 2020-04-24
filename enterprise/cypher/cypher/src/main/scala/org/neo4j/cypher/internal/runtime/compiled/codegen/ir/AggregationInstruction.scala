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

import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenContext
import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.aggregation.AggregateExpression
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.MethodStructure

case class AggregationInstruction(opName: String, aggregationFunctions: Iterable[AggregateExpression])
  extends Instruction {

  override def init[E](generator: MethodStructure[E])(implicit context: CodeGenContext) {
    aggregationFunctions.foreach(_.init(generator))
  }

  override def body[E](generator: MethodStructure[E])(implicit context: CodeGenContext) = {
    generator.trace(opName) { l1 =>
      aggregationFunctions.foreach(_.update(l1))
    }
  }

  override protected def children: Seq[Instruction] = Seq.empty

  override protected def operatorId = Set(opName)
}
