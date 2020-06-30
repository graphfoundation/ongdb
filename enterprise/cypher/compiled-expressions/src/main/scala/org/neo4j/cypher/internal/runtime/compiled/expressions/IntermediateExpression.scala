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

import org.neo4j.codegen.api.Field
import org.neo4j.codegen.api.IntermediateRepresentation
import org.neo4j.codegen.api.LocalVariable

import scala.collection.mutable

/**
 * See See: IntermediateCodeGeneration from 3.x
 * @param ir
 * @param fields
 * @param variables
 * @param nullChecks
 * @param requiresNullCheck
 */
case class IntermediateExpression(
                                   ir: IntermediateRepresentation,
                                   fields: Seq[Field],
                                   variables: Seq[LocalVariable],
                                   nullChecks: Set[IntermediateRepresentation],
                                   requiresNullCheck: Boolean
                                 )

case class IntermediateGroupingExpression(
                                           projectKey: IntermediateExpression,
                                           computeKey: IntermediateExpression,
                                           getKey: IntermediateExpression
                                         )

/**
 * Produces IntermediateRepresentation from a Cypher Expression
 * See: IntermediateCodeGeneration from 3.x
 */
class VariableNamer {
  private val parameters = mutable.Map.empty[String, String]
  private val variables = mutable.Map.empty[String, String]
  private var counter: Int = 0

  def nextVariableName(): String = {
    val nextName = s"v$counter"
    counter += 1
    nextName
  }

  def parameterName(name: String): String = parameters.getOrElseUpdate(name, nextVariableName())

  def variableName(name: String): String = variables.getOrElseUpdate(name, nextVariableName())
}