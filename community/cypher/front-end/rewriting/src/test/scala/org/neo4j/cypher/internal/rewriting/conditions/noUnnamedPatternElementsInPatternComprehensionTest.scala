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
package org.neo4j.cypher.internal.rewriting.conditions

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.PatternComprehension
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.RelationshipsPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class noUnnamedPatternElementsInPatternComprehensionTest extends CypherFunSuite with AstConstructionTestSupport {

  private val condition: Any => Seq[String] = noUnnamedPatternElementsInPatternComprehension

  test("should detect an unnamed pattern element in comprehension") {
    val input: ASTNode = PatternComprehension(None, RelationshipsPattern(
      RelationshipChain(NodePattern(None, Seq.empty, None, None) _,
                        RelationshipPattern(None, Seq.empty, None, None, SemanticDirection.OUTGOING) _,
                        NodePattern(None, Seq.empty, None, None) _) _) _,
      None, literalString("foo"))(pos, Set.empty, "", "")

    condition(input) should equal(Seq(s"Expression $input contains pattern elements which are not named"))
  }

  test("should not react to fully named pattern comprehension") {
    val input: PatternComprehension = PatternComprehension(Some(varFor("p")), RelationshipsPattern(
      RelationshipChain(NodePattern(Some(varFor("a")), Seq.empty, None, None) _,
                        RelationshipPattern(Some(varFor("r")), Seq.empty, None, None, SemanticDirection.OUTGOING) _,
                        NodePattern(Some(varFor("b")), Seq.empty, None, None) _) _) _,
      None, literalString("foo"))(pos, Set.empty, "", "")

    condition(input) shouldBe empty
  }
}
