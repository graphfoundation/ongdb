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
package org.neo4j.cypher.internal.frontend.phases.rewriting.cnf

import org.neo4j.cypher.internal.ast.semantics.SemanticFeature
import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.expressions.DeterministicFunctionInvocation
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.In
import org.neo4j.cypher.internal.expressions.ListLiteral
import org.neo4j.cypher.internal.expressions.LogicalVariable
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.frontend.phases.BaseContext
import org.neo4j.cypher.internal.frontend.phases.BaseState
import org.neo4j.cypher.internal.frontend.phases.EqualityRewrittenToIn
import org.neo4j.cypher.internal.frontend.phases.StatementRewriter
import org.neo4j.cypher.internal.frontend.phases.Transformer
import org.neo4j.cypher.internal.frontend.phases.factories.PlanPipelineTransformerFactory
import org.neo4j.cypher.internal.rewriting.conditions.SemanticInfoAvailable
import org.neo4j.cypher.internal.rewriting.conditions.normalizedEqualsArguments
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.bottomUp

/**
 * Normalize equality predicates into IN comparisons.
 */
case class rewriteEqualityToInPredicate(semanticTable: SemanticTable) extends Rewriter {

  val instance: Rewriter = bottomUp(Rewriter.lift {
    // if this Equals is comparing values derived from two entities, we might use it for a value hash join
    case predicate @ Equals(lhs, rhs) if lhs.dependencies.exists(isEntity) && rhs.dependencies.exists(isEntity) =>
      predicate

    // if f is deterministic: f(a) = value => f(a) IN [value]
    case predicate @ Equals(DeterministicFunctionInvocation(invocation), value) =>
      In(invocation, ListLiteral(Seq(value))(value.position))(predicate.position)

    // Equality between two property lookups should not be rewritten
    case predicate @ Equals(_: Property, _: Property) =>
      predicate

    // a.prop = value => a.prop IN [value]
    case predicate @ Equals(prop @ Property(_: Variable, _), idValueExpr) =>
      In(prop, ListLiteral(Seq(idValueExpr))(idValueExpr.position))(predicate.position)
  })

  private def isEntity(variable: LogicalVariable) =
    semanticTable.isNode(variable) || semanticTable.isRelationship(variable)

  def apply(that: AnyRef): AnyRef = {
    instance.apply(that)
  }
}

case object rewriteEqualityToInPredicate extends StatementRewriter with StepSequencer.Step
    with PlanPipelineTransformerFactory {

  override def instance(from: BaseState, ignored: BaseContext): Rewriter =
    rewriteEqualityToInPredicate(from.semanticTable())

  override def preConditions: Set[StepSequencer.Condition] = SemanticInfoAvailable

  override def postConditions: Set[StepSequencer.Condition] = Set(EqualityRewrittenToIn)

  override def invalidatedConditions: Set[StepSequencer.Condition] = SemanticInfoAvailable // Introduces new AST nodes

  override def getTransformer(
    pushdownPropertyReads: Boolean,
    semanticFeatures: Seq[SemanticFeature]
  ): Transformer[BaseContext, BaseState, BaseState] = this
}
