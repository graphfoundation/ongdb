/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.cypher.internal.runtime.vectorized.operators

import org.neo4j.cypher.internal.compatibility.v3_6.runtime.Slot
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression

/**
  *
  * @param mapperOutputSlot
  * Slot from AggregationMapper's pipeline where grouping is written to by the Mapper and read from by the Reducer.
  * @param reducerOutputSlot
  * Slot from AggregationReducers's pipeline where grouping is written to by the Reducer.
  * @param expression
  * Grouping expression to be operated on by the Mapper.
  */
case class GroupingOffsets(mapperOutputSlot: Slot, reducerOutputSlot: Slot, expression: Expression)
