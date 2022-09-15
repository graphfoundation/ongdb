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
package org.neo4j.cypher.internal.frontend.phases.rewriting.cnf

import org.mockito.Mockito.verify
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.rewriting.AstRewritingMonitor
import org.neo4j.cypher.internal.rewriting.PredicateTestSupport
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

import scala.annotation.tailrec

class DistributeLawRewriterTest extends CypherFunSuite with PredicateTestSupport {

  val monitor: AstRewritingMonitor = mock[AstRewritingMonitor]
  val rewriter: Rewriter = distributeLawsRewriter()(monitor)

  test("(P or (Q and R))  iff  (P or Q) and (P or R)") {
    or(P, and(Q, R)) <=> and(or(P, Q), or(P, R))
  }

  test("((Q and R) or P)  iff  (Q or P) and (R or P)") {
    or(and(Q, R), P) <=> and(or(Q, P), or(R, P))
  }

  test("((Q and R and S) or P)  iff  (Q or P) and (R or P) and (S or P)") {
    or(and(Q, and(R, S)), P) <=> and(or(Q, P), and(or(R, P), or(S, P)))
  }

  test("should not rewrite DNF predicates larger than the limit") {
    // given
    val start = or(and(P, Q), and(Q, R))
    val fullOr = combineUntilLimit(start, distributeLawsRewriter.DNF_CONVERSION_LIMIT - 2)

    // when
    val result = rewriter.apply(fullOr)

    // then result should be the same and aborted due to DNF-limit
    if (result == fullOr) verify(monitor).abortedRewritingDueToLargeDNF(fullOr)
    else fail(s"result was different: $result")
  }

  test("should rewrite DNF predicates smaller than the limit") {
    // given
    val start = or(and(P, Q), and(Q, R))
    val fullOr = combineUntilLimit(start, distributeLawsRewriter.DNF_CONVERSION_LIMIT - 3)

    // when
    val result = rewriter.apply(fullOr)

    // then result should be different, or equal but aborted due to repeatWithSizeLimit
    if (result == fullOr) verify(monitor).abortedRewriting(fullOr)
  }

  @tailrec
  private def combineUntilLimit(start: Expression, limit: Int): Expression =
    if (limit > 0)
      combineUntilLimit(or(start, and(P, Q)), limit - 1)
    else
      start
}
