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
package org.neo4j.cypher.internal.rewriting.rewriters

import org.neo4j.cypher.internal.ast.AscSortItem
import org.neo4j.cypher.internal.ast.DescSortItem
import org.neo4j.cypher.internal.ast.semantics.SemanticState
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.functions.Id
import org.neo4j.cypher.internal.rewriting.rewriters.factories.ASTRewriterFactory
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.CypherExceptionFactory
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.StepSequencer.Step
import org.neo4j.cypher.internal.util.bottomUp
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.symbols.CTRelationship
import org.neo4j.cypher.internal.util.symbols.CypherType

case object OrderByIdRewritten extends StepSequencer.Condition

/**
 * Rewrites `ORDER BY id(n)` TO `ORDER BY n`.
 * This allows using the order of a label scan or rel-type scan to solve the query.
 */
case class rewriteOrderById(semanticState: SemanticState) extends Rewriter {

  def isEntity(expr: Expression): Boolean =
    semanticState.expressionType(expr).actual == CTNode.invariant ||
      semanticState.expressionType(expr).actual == CTRelationship.invariant

  private val instance = bottomUp(Rewriter.lift {
    case si@AscSortItem(Id(v)) if isEntity(v) => AscSortItem(v)(si.position, si.originalExpression)
    case si@DescSortItem(Id(v)) if isEntity(v) => DescSortItem(v)(si.position, si.originalExpression)
  })

  override def apply(v: AnyRef): AnyRef = instance(v)

}

object rewriteOrderById extends Step with ASTRewriterFactory {

  override def preConditions: Set[StepSequencer.Condition] = Set()

  override def postConditions: Set[StepSequencer.Condition] = Set(OrderByIdRewritten)

  override def invalidatedConditions: Set[StepSequencer.Condition] = Set()

  override def getRewriter(semanticState: SemanticState,
                          parameterTypeMapping: Map[String, CypherType],
                          cypherExceptionFactory: CypherExceptionFactory,
                          anonymousVariableNameGenerator: AnonymousVariableNameGenerator): Rewriter = rewriteOrderById(semanticState)
}
