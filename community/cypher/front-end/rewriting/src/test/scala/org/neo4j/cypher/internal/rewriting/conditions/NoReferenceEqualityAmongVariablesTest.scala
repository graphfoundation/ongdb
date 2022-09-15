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
import org.neo4j.cypher.internal.ast.Match
import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class NoReferenceEqualityAmongVariablesTest extends CypherFunSuite with AstConstructionTestSupport {

  private val collector: Any => Seq[String] = noReferenceEqualityAmongVariables

  test("unhappy when same Variable instance is used multiple times") {
    val id = varFor("a")
    val ast: ASTNode = Match(optional = false, Pattern(Seq(EveryPath(NodePattern(Some(id), Seq(), Some(id), None)_)))_, Seq(), None)_

    collector(ast) should equal(Seq(s"The instance $id is used 2 times"))
  }

  test("happy when all variable are no reference equal") {
    val ast: ASTNode = Match(optional = false, Pattern(Seq(EveryPath(NodePattern(Some(varFor("a")), Seq(), Some(varFor("a")), None)_)))_, Seq(), None)_

    collector(ast) shouldBe empty
  }
}
