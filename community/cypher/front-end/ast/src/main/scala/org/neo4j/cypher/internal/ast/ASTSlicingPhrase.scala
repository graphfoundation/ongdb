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
package org.neo4j.cypher.internal.ast

import org.neo4j.cypher.internal.ast.ASTSlicingPhrase.checkExpressionIsStaticInt
import org.neo4j.cypher.internal.ast.semantics.SemanticAnalysisTooling
import org.neo4j.cypher.internal.ast.semantics.SemanticCheck
import org.neo4j.cypher.internal.ast.semantics.SemanticCheckResult
import org.neo4j.cypher.internal.ast.semantics.SemanticCheckable
import org.neo4j.cypher.internal.ast.semantics.SemanticExpressionCheck
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.Literal
import org.neo4j.cypher.internal.expressions.PathExpression
import org.neo4j.cypher.internal.expressions.PatternComprehension
import org.neo4j.cypher.internal.expressions.PatternExpression
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.expressions.UnsignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.symbols.CTInteger

// Skip/Limit
trait ASTSlicingPhrase extends SemanticCheckable with SemanticAnalysisTooling {
  self: ASTNode =>
  def name: String
  def expression: Expression
  def semanticCheck: SemanticCheck = checkExpressionIsStaticInt(expression, name, acceptsZero = true)
}

object ASTSlicingPhrase extends SemanticAnalysisTooling {

  /**
   * Checks that the given expression
   *
   *  - contains no variable references
   *  - does not try to read the graph
   *  - is a CTInteger
   *  - is either non-negative or positive, depending on `acceptsZero`
   *
   * @param expression  the expression to check
   * @param name        the name of the construct. Used for error messages.
   * @param acceptsZero if `true` then 0 is an accepted value, otherwise not.
   * @return a SemanticCheck
   */
  def checkExpressionIsStaticInt(expression: Expression, name: String, acceptsZero: Boolean): SemanticCheck =
    containsNoVariables(expression, name) chain
      doesNotTouchTheGraph(expression, name) chain
      literalShouldBeUnsignedInteger(expression, name, acceptsZero) chain
      SemanticExpressionCheck.simple(expression) chain
      expectType(CTInteger.covariant, expression)

  private def containsNoVariables(expression: Expression, name: String): SemanticCheck = {
    val deps = expression.dependencies
    if (deps.nonEmpty) {
      val id = deps.toSeq.minBy(_.position)
      error(s"It is not allowed to refer to variables in $name", id.position)
    }
    else SemanticCheckResult.success
  }

  private def doesNotTouchTheGraph(expression: Expression, name: String): SemanticCheck = {
    val badExpressionFound = expression.treeExists {
      case _: PatternComprehension |
           _: PatternExpression |
           _: PathExpression =>
        true
    }
    when(badExpressionFound) {
      error(s"It is not allowed to refer to variables in $name", expression.position)
    }
  }

  private def literalShouldBeUnsignedInteger(expression: Expression, name: String, acceptsZero: Boolean): SemanticCheck = {
    try {
      expression match {
        case _: UnsignedDecimalIntegerLiteral => SemanticCheckResult.success
        case i: SignedDecimalIntegerLiteral if i.value > 0 => SemanticCheckResult.success
        case i: SignedDecimalIntegerLiteral if i.value == 0 && acceptsZero => SemanticCheckResult.success
        case lit: Literal =>
          val accepted = if (acceptsZero) "non-negative" else "positive"
          error(s"Invalid input. '${lit.asCanonicalStringVal}' is not a valid value. Must be a $accepted integer.", lit.position)
        case _ => SemanticCheckResult.success
      }
    } catch {
      case _: NumberFormatException =>
        // We rely on getting a SemanticError from SemanticExpressionCheck.simple(expression)
        SemanticCheckResult.success
    }
  }
}
