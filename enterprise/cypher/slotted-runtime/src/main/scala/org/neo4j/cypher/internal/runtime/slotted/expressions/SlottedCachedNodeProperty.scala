/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.runtime.slotted.expressions

//import org.neo4j.cypher.internal.planner.v3_5.spi.TokenContext
//import org.neo4j.cypher.internal.runtime.interpreted.ExecutionContext

import org.neo4j.cypher.internal.planner.spi.TokenContext
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.AbstractCachedNodeProperty
import org.neo4j.kernel.api.StatementConstants
import org.neo4j.values.storable.Value
import org.neo4j.values.virtual.VirtualNodeValue

case class SlottedCachedNodeProperty(nodeOffset: Int,
                                     offsetIsForLongSlot: Boolean,
                                     propertyKey: Int,
                                     cachedPropertyOffset: Int) extends AbstractCachedNodeProperty with SlottedExpression {

  override def getCachedProperty(ctx: ExecutionContext): Value = ctx.getCachedPropertyAt(cachedPropertyOffset)

  override def getPropertyKey(tokenContext: TokenContext): Int = propertyKey

  override def children: Seq[AstNode[_]] = Seq.empty

  override def getId(ctx: ExecutionContext): Long = {
    if (this.offsetIsForLongSlot) {
      return ctx.getLongAt(this.nodeOffset)
    } else {
      return ctx.getRefAt(this.nodeOffset).asInstanceOf[VirtualNodeValue].id
    }
  }

  override def setCachedProperty(ctx: ExecutionContext, value: Value): Unit = ???
}

case class SlottedCachedNodePropertyLate(nodeOffset: Int,
                                         offsetIsForLongSlot: Boolean,
                                         propertyKey: String,
                                         cachedPropertyOffset: Int) extends AbstractCachedNodeProperty with SlottedExpression {

  override def getCachedProperty(ctx: ExecutionContext): Value = ctx.getCachedPropertyAt(cachedPropertyOffset)

  override def getPropertyKey(tokenContext: TokenContext): Int =
    tokenContext.getOptPropertyKeyId(propertyKey).getOrElse(StatementConstants.NO_SUCH_PROPERTY_KEY)

  override def children: Seq[AstNode[_]] = Seq.empty

  override def getId(ctx: ExecutionContext): Long = {
    if (this.offsetIsForLongSlot) {
      return ctx.getLongAt(this.nodeOffset)
    } else {
      return ctx.getRefAt(this.nodeOffset).asInstanceOf[VirtualNodeValue].id
    }
  }

  override def setCachedProperty(ctx: ExecutionContext, value: Value): Unit = ???
}
