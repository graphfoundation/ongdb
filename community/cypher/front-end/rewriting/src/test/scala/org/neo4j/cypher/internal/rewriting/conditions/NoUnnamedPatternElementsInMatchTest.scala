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
package org.neo4j.cypher.internal.rewriting.conditions

import org.neo4j.cypher.internal.ast.AliasedReturnItem
import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.ast.Match
import org.neo4j.cypher.internal.ast.Return
import org.neo4j.cypher.internal.ast.ReturnItems
import org.neo4j.cypher.internal.ast.SingleQuery
import org.neo4j.cypher.internal.ast.Where
import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.expressions.PatternElement
import org.neo4j.cypher.internal.expressions.PatternExpression
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.RelationshipsPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.util.ASTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class NoUnnamedPatternElementsInMatchTest extends CypherFunSuite with AstConstructionTestSupport {

  private val condition: Any => Seq[String] = noUnnamedPatternElementsInMatch

  test("unhappy when a node pattern is unnamed") {
    val nodePattern: NodePattern = node(None)
    val ast: ASTNode = SingleQuery(Seq(
      Match(optional = false, Pattern(Seq(EveryPath(chain(chain(node(Some(varFor("n"))), relationship(Some(varFor("p"))), nodePattern), relationship(Some(varFor("r"))), node(Some(varFor("m")))))))_, Seq.empty, None)_,
      Return(distinct = false, ReturnItems(includeExisting = false, Seq(AliasedReturnItem(varFor("n"), varFor("n"))(pos, isAutoAliased = false)))_, None, None, None)_
    ))_

    condition(ast) shouldBe Seq(s"NodePattern at ${nodePattern.position} is unnamed")
  }

  test("unhappy when a relationship pattern is unnamed") {
    val relationshipPattern: RelationshipPattern = relationship(None)
    val ast: ASTNode = SingleQuery(Seq(
      Match(optional = false, Pattern(Seq(EveryPath(chain(chain(node(Some(varFor("n"))), relationship(Some(varFor("p"))), node(Some(varFor("k")))), relationshipPattern, node(Some(varFor("m")))))))_, Seq.empty, None)_,
      Return(distinct = false, ReturnItems(includeExisting = false, Seq(AliasedReturnItem(varFor("n"), varFor("n"))(pos, isAutoAliased = false)))_, None, None, None)_
    ))_

    condition(ast) shouldBe Seq(s"RelationshipPattern at ${relationshipPattern.position} is unnamed")
  }

  test("unhappy when there are unnamed node and relationship patterns") {
    val nodePattern: NodePattern = node(None)
    val relationshipPattern: RelationshipPattern = relationship(None)
    val ast: ASTNode = SingleQuery(Seq(
      Match(optional = false, Pattern(Seq(EveryPath(chain(chain(node(Some(varFor("n"))), relationshipPattern, node(Some(varFor("k")))), relationship(Some(varFor("r"))), nodePattern))))_, Seq.empty, None)_,
      Return(distinct = false, ReturnItems(includeExisting = false, Seq(AliasedReturnItem(varFor("n"), varFor("n"))(pos, isAutoAliased = false)))_, None, None, None)_
    ))_

    condition(ast) shouldBe Seq(s"NodePattern at ${nodePattern.position} is unnamed", s"RelationshipPattern at ${relationshipPattern.position} is unnamed")
  }

  test("happy when all elements in pattern are named") {
    val ast: ASTNode = SingleQuery(Seq(
      Match(optional = false, Pattern(Seq(EveryPath(chain(chain(node(Some(varFor("n"))), relationship(Some(varFor("p"))), node(Some(varFor("k")))), relationship(Some(varFor("r"))), node(Some(varFor("m")))))))_, Seq.empty, None)_,
      Return(distinct = false, ReturnItems(includeExisting = false, Seq(AliasedReturnItem(varFor("n"), varFor("n"))(pos, isAutoAliased = false)))_, None, None, None)_
    ))_

    condition(ast) shouldBe empty
  }

  test("should leave where clause alone") {
    val where: Where = Where(PatternExpression(RelationshipsPattern(chain(node(None), relationship(None), node(None)))_)(Set.empty, "", ""))_
    val ast: ASTNode = SingleQuery(Seq(
      Match(optional = false, Pattern(Seq(EveryPath(chain(chain(node(Some(varFor("n"))), relationship(Some(varFor("p"))), node(Some(varFor("k")))), relationship(Some(varFor("r"))), node(Some(varFor("m")))))))_, Seq.empty, Some(where))_,
      Return(distinct = false, ReturnItems(includeExisting = false, Seq(AliasedReturnItem(varFor("n"), varFor("n"))(pos, isAutoAliased = false)))_, None, None, None)_
    ))_

    condition(ast) shouldBe empty
  }

  private def chain(left: PatternElement, rel: RelationshipPattern, right: NodePattern): RelationshipChain = {
    RelationshipChain(left, rel, right)_
  }

  private def relationship(id: Option[Variable]): RelationshipPattern = {
    RelationshipPattern(id, Seq.empty, None, None, SemanticDirection.OUTGOING)_
  }

  private def node(id: Option[Variable]): NodePattern = {
    NodePattern(id, Seq.empty, None, None)_
  }
}
