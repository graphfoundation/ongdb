/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.cypher.internal.frontend.phases

import org.neo4j.cypher.internal.ast.prettifier.ExpressionStringifier
import org.neo4j.cypher.internal.ast.prettifier.Prettifier
import org.neo4j.cypher.internal.macros.AssertMacros.checkOnlyWhenAssertionsAreEnabled
import org.neo4j.cypher.internal.rewriting.ValidatingCondition
import org.neo4j.cypher.internal.util.StepSequencer

trait Transformer[-C <: BaseContext, -FROM, +TO] {
  def transform(from: FROM, context: C): TO

  def andThen[D <: C, TO2](other: Transformer[D, TO, TO2]): Transformer[D, FROM, TO2] =
    new PipeLine(this, other)

  def name: String

  def postConditions: Set[StepSequencer.Condition]

  final protected[Transformer] def checkConditions(state: Any, conditions: Set[StepSequencer.Condition]): Boolean = {
    val messages: Seq[String] = conditions.toSeq.collect {
      case v:ValidatingCondition => v(state)
    }.flatten
    if (messages.nonEmpty) {
      val prefix = s"Conditions started failing after running these phases: $name\n"
      throw new IllegalStateException(prefix + messages.mkString(", "))
    }
    true
  }
}

object Transformer {
  def identity[C <: BaseContext, FROM]: Transformer[C, FROM, FROM] = new Transformer[C, FROM, FROM] {
    override def transform(from: FROM, context: C): FROM = from

    override def name: String = "identity"

    override def postConditions: Set[StepSequencer.Condition] = Set.empty
  }

  /**
   * Transformer that can be inserted when debugging, to help detect
   * what part of the compilation introduces an ast issue.
   */
  def printAst(tag: String): Transformer[BaseContext, BaseState, BaseState] = new Transformer[BaseContext, BaseState, BaseState] {
    override def transform(from: BaseState, context: BaseContext): BaseState = {
      println("     |||||||| PRINT AST: "+tag)
      println(Prettifier(ExpressionStringifier()).asString(from.maybeStatement.get))
      from
    }

    override def postConditions: Set[StepSequencer.Condition] = Set.empty

    override def name: String = "print ast"
  }
}

class PipeLine[-C <: BaseContext, FROM, MID, TO](first: Transformer[C, FROM, MID], after: Transformer[C, MID, TO]) extends Transformer[C, FROM, TO] {

  override def postConditions: Set[StepSequencer.Condition] = first.postConditions ++ after.postConditions

  override def transform(from: FROM, context: C): TO = {
    val step1 = first.transform(from, context)
    val step2 = after.transform(step1, context)

    // Checking conditions inside assert so they are not run in production
    checkOnlyWhenAssertionsAreEnabled(checkConditions(step2, first.postConditions))

    step2
  }

  override def name: String = first.name + ", " + after.name

  override def toString: String = name
}


case class If[-C <: BaseContext, FROM, STATE <: FROM](f: STATE => Boolean)(thenT: Transformer[C, FROM, STATE]) extends Transformer[C, STATE, STATE] {
  override def transform(from: STATE, context: C): STATE = {
    if (f(from))
      thenT.transform(from, context)
    else
      from
  }

  override def name: String = s"if(<f>) ${thenT.name}"

  override def postConditions: Set[StepSequencer.Condition] = thenT.postConditions
}
