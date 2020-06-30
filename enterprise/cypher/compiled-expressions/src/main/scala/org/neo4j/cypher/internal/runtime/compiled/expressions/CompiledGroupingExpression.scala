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
package org.neo4j.cypher.internal.runtime.compiled.expressions

import org.neo4j.cypher.internal.runtime.DbAccess
import org.neo4j.cypher.internal.runtime.ExecutionContext
import org.neo4j.cypher.internal.runtime.ExpressionCursors
import org.neo4j.values.AnyValue

/**
 * Abstraction for grouping expressions used for aggregation and distinct.
 * See Community GroupingExpression.
 */
trait CompiledGroupingExpression {
  type KeyType <: AnyValue

  def projectGroupingKey(context: ExecutionContext, params: AnyValue): Unit

  /**
   * Computes the grouping key, it will either be a single AnyValue or a SequenceValue of AnyValues
   *
   * @param executionContext
   * @param dbAccess
   * @param params
   * @param cursors
   * @param expressionVariables
   * @return
   */
  def computeGroupingKey(
                          executionContext: ExecutionContext,
                          dbAccess: DbAccess,
                          params: Array[AnyValue],
                          cursors: ExpressionCursors,
                          expressionVariables: Array[AnyValue]
                        ): AnyValue

  /**
   * Retrieves an already computed and projected key. Can be called after a call to project grouping key.
   *
   * @param context The context to get the values for the key
   * @return The grouping key as read from the context
   */
  def getGroupingKey(context: ExecutionContext): KeyType

  /**
   * Projects a computed key to the context
   *
   * @param context     The context where to project.
   * @param groupingKey The computed grouping key to project
   */
  def project(context: ExecutionContext, groupingKey: KeyType): Unit

  /**
   * @return `true` if there is no grouping, `false` otherwise.
   */
  def isEmpty: Boolean
}
