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
package org.neo4j.cypher.internal.rewriting

import org.neo4j.cypher.internal.ast.Statement
import org.neo4j.cypher.internal.ast.factory.neo4j.OpenCypherJavaCCParserWithFallback
import org.neo4j.cypher.internal.ast.prettifier.ExpressionStringifier
import org.neo4j.cypher.internal.ast.prettifier.Prettifier
import org.neo4j.cypher.internal.ast.semantics.SemanticChecker
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.OpenCypherExceptionFactory
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

trait RewriteTest {
  self: CypherFunSuite =>

  def rewriterUnderTest: Rewriter

  val prettifier = Prettifier(ExpressionStringifier(_.asCanonicalStringVal))

  protected def assertRewrite(originalQuery: String, expectedQuery: String) {
    val (expected, result) = getRewrite(originalQuery, expectedQuery)
    assert(result === expected, s"\n$originalQuery\nshould be rewritten to:\n$expectedQuery\nbut was rewritten to:\n${prettifier.asString(result.asInstanceOf[Statement])}")
  }

  protected def getRewrite(originalQuery: String, expectedQuery: String): (Statement, AnyRef) = {
    val original = parseForRewriting(originalQuery)
    val expected = parseForRewriting(expectedQuery)
    SemanticChecker.check(original)
    val result = rewrite(original)
    (expected, result)
  }

  protected def parseForRewriting(queryText: String): Statement = {
    val preparedQuery = queryText.replace("\r\n", "\n")
    OpenCypherJavaCCParserWithFallback.parse(preparedQuery, OpenCypherExceptionFactory(None), new AnonymousVariableNameGenerator)
  }

  protected def rewrite(original: Statement): AnyRef =
    original.rewrite(rewriterUnderTest)

  protected def endoRewrite(original: Statement): Statement =
    original.endoRewrite(rewriterUnderTest)

  protected def assertIsNotRewritten(query: String) {
    val original = OpenCypherJavaCCParserWithFallback.parse(query, OpenCypherExceptionFactory(None), new AnonymousVariableNameGenerator)
    val result = original.rewrite(rewriterUnderTest)
    assert(result === original, s"\n$query\nshould not have been rewritten but was to:\n${prettifier.asString(result.asInstanceOf[Statement])}")
  }
}
