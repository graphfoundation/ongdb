/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.neo4j.cypher.internal.expressions

import org.neo4j.cypher.internal.expressions.functions.DeterministicFunction
import org.neo4j.cypher.internal.expressions.functions.UnresolvedFunction
import org.neo4j.cypher.internal.util.InputPosition

object FunctionInvocation {
  def apply(name: FunctionName, argument: Expression)(position: InputPosition): FunctionInvocation =
    FunctionInvocation(Namespace()(position), name, distinct = false, IndexedSeq(argument))(position)
  def apply(ns: Namespace, name: FunctionName, argument: Expression)(position: InputPosition): FunctionInvocation =
    FunctionInvocation(ns, name, distinct = false, IndexedSeq(argument))(position)
  def apply(left: Expression, name: FunctionName, right: Expression): FunctionInvocation =
    FunctionInvocation(Namespace()(name.position), name, distinct = false, IndexedSeq(left, right))(name.position)
  def apply(expression: Expression, name: FunctionName): FunctionInvocation =
    FunctionInvocation(Namespace()(name.position), name, distinct = false, IndexedSeq(expression))(name.position)
  def apply(functionName: FunctionName, distinct: Boolean, args: IndexedSeq[Expression])(position: InputPosition): FunctionInvocation =
  FunctionInvocation(Namespace()(position), functionName, distinct, args)(position)
}

/**
 * Deterministic function invocation, see [[DeterministicFunction]].
 */
object DeterministicFunctionInvocation {
  def unapply(expr: FunctionInvocation): Option[FunctionInvocation] = {
    expr.function match {
      case DeterministicFunction(_) => Some(expr)
      case _ => None
    }
  }
}

case class FunctionInvocation(namespace: Namespace, functionName: FunctionName, distinct: Boolean, args: IndexedSeq[Expression])
                             (val position: InputPosition) extends Expression {
  val name: String = (namespace.parts :+ functionName.name).mkString(".")
  val function: functions.Function = functions.Function.lookup.getOrElse(name.toLowerCase, UnresolvedFunction)

  def needsToBeResolved: Boolean = function match {
    case UnresolvedFunction => true
    case _ => false
  }

  override def asCanonicalStringVal = s"$name(${args.map(_.asCanonicalStringVal).mkString(",")})"
}

case class FunctionName(name: String)(val position: InputPosition) extends SymbolicName {
  override def equals(x: Any): Boolean = x match {
    case FunctionName(other) => other.toLowerCase == name.toLowerCase
    case _ => false
  }
  override def hashCode = name.toLowerCase.hashCode
}
