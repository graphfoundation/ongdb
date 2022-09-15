/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
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
/*
 * Copyright (c) "Neo4j"
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
package org.neo4j.cypher.internal.runtime.interpreted.commands

import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Literal
import org.neo4j.kernel.impl.util.ValueUtils
import org.neo4j.values.virtual.MapValueBuilder
import org.neo4j.values.virtual.VirtualValues

object LiteralHelper {
  def literal(any: Any): Literal = any match {
    case seq: Seq[_] => literal(seq)
    case map: Map[_, _] => literal(map.asInstanceOf[Map[String,_]])
    case _ => Literal (ValueUtils.of (any) )
  }
  def literal(anys: Seq[_]): Literal = Literal(VirtualValues.list(anys.map(ValueUtils.of):_*))
  def literal(map: Map[String, _]): Literal = {
    val mapBuilder = new MapValueBuilder()
    map.foreach{
      case (k, v) => mapBuilder.add(k, ValueUtils.of(v))
    }
    Literal(mapBuilder.build())
  }
}
