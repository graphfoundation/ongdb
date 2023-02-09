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

import org.neo4j.cypher.internal.ast.AliasedReturnItem
import org.neo4j.cypher.internal.ast.AscSortItem
import org.neo4j.cypher.internal.ast.Match
import org.neo4j.cypher.internal.ast.OrderBy
import org.neo4j.cypher.internal.ast.Query
import org.neo4j.cypher.internal.ast.Return
import org.neo4j.cypher.internal.ast.ReturnItems
import org.neo4j.cypher.internal.ast.SingleQuery
import org.neo4j.cypher.internal.ast.SubqueryCall
import org.neo4j.cypher.internal.ast.UnionDistinct
import org.neo4j.cypher.internal.ast.Where
import org.neo4j.cypher.internal.ast.With
import org.neo4j.cypher.internal.ast.semantics.SemanticState
import org.neo4j.cypher.internal.expressions.CountStar
import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.MultiRelationshipPathStep
import org.neo4j.cypher.internal.expressions.NilPathStep
import org.neo4j.cypher.internal.expressions.NodePathStep
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.PathExpression
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.SingleRelationshipPathStep
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.rewriting.rewriters.expandStar
import org.neo4j.cypher.internal.rewriting.rewriters.normalizeWithAndReturnClauses
import org.neo4j.cypher.internal.rewriting.rewriters.projectNamedPaths
import org.neo4j.cypher.internal.util.AnonymousVariableNameGenerator
import org.neo4j.cypher.internal.util.OpenCypherExceptionFactory
import org.neo4j.cypher.internal.util.devNullLogger
import org.neo4j.cypher.internal.util.inSequence
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.cypher.internal.util.test_helpers.TestName

class ProjectNamedPathsTest extends CypherFunSuite with AstRewritingTestSupport with TestName {

  private def projectionInlinedAst(queryText: String) = ast(queryText).endoRewrite(projectNamedPaths)

  private def ast(queryText: String) = {
    val nameGenerator = new AnonymousVariableNameGenerator
    val parsed = parser.parse(queryText, OpenCypherExceptionFactory(None), nameGenerator)
    val exceptionFactory = OpenCypherExceptionFactory(Some(pos))
    val normalized = parsed.endoRewrite(inSequence(normalizeWithAndReturnClauses(exceptionFactory, devNullLogger)))
    val checkResult = normalized.semanticCheck(SemanticState.clean)
    normalized.endoRewrite(inSequence(expandStar(checkResult.state)))
  }

  private def parseReturnedExpr(queryText: String) = {
    val query = projectionInlinedAst(queryText).asInstanceOf[Query]
    query.part.asInstanceOf[SingleQuery].clauses.last.asInstanceOf[Return].returnItems.items.collectFirst {
      case AliasedReturnItem(expr, Variable("p")) => expr
    }.get
  }

  test("MATCH p = (a) RETURN p" ) {
    val returns = parseReturnedExpr("MATCH p = (a) RETURN p")

    val expected = PathExpression(
      NodePathStep(varFor("a"), NilPathStep()(pos))(pos)
    )_

    returns should equal(expected: PathExpression)
  }

  test("MATCH p = (a) CALL {RETURN 1} RETURN p" ) {
      val returns = parseReturnedExpr(testName)

      val expected = PathExpression(
        NodePathStep(varFor("a"), NilPathStep()(pos))(pos)
      )_

      returns should equal(expected: PathExpression)
  }

  test("MATCH p = (a) CALL {WITH a RETURN 1} RETURN p" ) {
      val returns = parseReturnedExpr(testName)

      val expected = PathExpression(
        NodePathStep(varFor("a"), NilPathStep()(pos))(pos)
      )_

      returns should equal(expected: PathExpression)
  }

  test("MATCH p = (a) CALL {RETURN 1 AS one UNION RETURN 2 as one} RETURN p" ) {
      val returns = parseReturnedExpr(testName)

      val expected = PathExpression(
        NodePathStep(varFor("a"), NilPathStep()(pos))(pos)
      )_

      returns should equal(expected: PathExpression)
  }

  test("MATCH p = (a) CALL {WITH a RETURN 1 AS one UNION WITH a RETURN 2 as one} RETURN p" ) {
      val returns = parseReturnedExpr(testName)

      val expected = PathExpression(
        NodePathStep(varFor("a"), NilPathStep()(pos))(pos)
      )_

      returns should equal(expected: PathExpression)
  }

  test("CALL {MATCH p = (a) RETURN p} RETURN p" ) {
    val rewritten = projectionInlinedAst(testName)

    val a = varFor("a")
    val p = varFor("p")
    val CALL = {
      val MATCH = Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(a), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(MATCH, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(p, p)(pos, isAutoAliased = false)
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a) CALL {WITH p RETURN 1 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val a = varFor("a")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(
            NodePattern(Some(a), List(), None, None)(pos)
          )
      ))(pos), List(), None)(pos)

    val CALL = {
      val WITH1 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val WITH2 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(WITH1, WITH2, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  // We can assume that nameAllPatternParts has already run.
  test("MATCH p = (a)-[r]->(b) CALL {WITH p RETURN 1 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val a = varFor("a")
    val r = varFor("r")
    val b = varFor("b")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(
          RelationshipChain(
            NodePattern(Some(a), List(), None, None)(pos),
            RelationshipPattern(Some(r), Seq.empty, None, None, SemanticDirection.OUTGOING)(pos),
            NodePattern(Some(b), List(), None, None)(pos)
          )(pos))
      ))(pos), List(), None)(pos)

    val CALL = {
      val WITH1 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(b, b)(pos, isAutoAliased = false),
            AliasedReturnItem(r, r)(pos, isAutoAliased = false),
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val WITH2 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(NodePathStep(a, SingleRelationshipPathStep(r, SemanticDirection.OUTGOING, Some(b), NilPathStep()(pos))(pos))(pos))(pos), p)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(WITH1, WITH2, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, SingleRelationshipPathStep(r, SemanticDirection.OUTGOING, Some(b), NilPathStep()(pos))(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a)-[r]->(b), q = (b)-[s]->(c) CALL {WITH p, q RETURN 1 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val q = varFor("q")
    val a = varFor("a")
    val r = varFor("r")
    val b = varFor("b")
    val s = varFor("s")
    val c = varFor("c")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(
          RelationshipChain(
            NodePattern(Some(a), List(), None, None)(pos),
            RelationshipPattern(Some(r), Seq.empty, None, None, SemanticDirection.OUTGOING)(pos),
            NodePattern(Some(b), List(), None, None)(pos)
          )(pos)),
        EveryPath(
          RelationshipChain(
            NodePattern(Some(b), List(), None, None)(pos),
            RelationshipPattern(Some(s), Seq.empty, None, None, SemanticDirection.OUTGOING)(pos),
            NodePattern(Some(c), List(), None, None)(pos)
          )(pos))
      ))(pos), List(), None)(pos)

    val CALL = {
      val WITH1 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(b, b)(pos, isAutoAliased = false),
            AliasedReturnItem(r, r)(pos, isAutoAliased = false),
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
            AliasedReturnItem(c, c)(pos, isAutoAliased = false),
            AliasedReturnItem(s, s)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val WITH2 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(NodePathStep(a, SingleRelationshipPathStep(r, SemanticDirection.OUTGOING, Some(b), NilPathStep()(pos))(pos))(pos))(pos), p)(pos, isAutoAliased = false),
            AliasedReturnItem(PathExpression(NodePathStep(b, SingleRelationshipPathStep(s, SemanticDirection.OUTGOING, Some(c), NilPathStep()(pos))(pos))(pos))(pos), q)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(WITH1, WITH2, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, SingleRelationshipPathStep(r, SemanticDirection.OUTGOING, Some(b), NilPathStep()(pos))(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a)-[r]->(b)<-[s]-(c) CALL {WITH p RETURN 1 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val a = varFor("a")
    val r = varFor("r")
    val b = varFor("b")
    val s = varFor("s")
    val c = varFor("c")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(
          RelationshipChain(
            RelationshipChain(
              NodePattern(Some(a), List(), None, None)(pos),
              RelationshipPattern(Some(r), Seq.empty, None, None, SemanticDirection.OUTGOING)(pos),
              NodePattern(Some(b), List(), None, None)(pos)
            )(pos),
            RelationshipPattern(Some(s), Seq.empty, None, None, SemanticDirection.INCOMING)(pos),
            NodePattern(Some(c), List(), None, None)(pos)
          )(pos)))
      )(pos), List(), None)(pos)

    val CALL = {
      val WITH1 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
            AliasedReturnItem(s, s)(pos, isAutoAliased = false),
            AliasedReturnItem(b, b)(pos, isAutoAliased = false),
            AliasedReturnItem(c, c)(pos, isAutoAliased = false),
            AliasedReturnItem(r, r)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val WITH2 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(
              NodePathStep(a,
              SingleRelationshipPathStep(r, SemanticDirection.OUTGOING, Some(b),
              SingleRelationshipPathStep(s, SemanticDirection.INCOMING, Some(c), NilPathStep()(pos))(pos))(pos))(pos))(pos), p)(pos, isAutoAliased = false)
          ))(pos), None, None, None, None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(WITH1, WITH2, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(
            NodePathStep(a,
            SingleRelationshipPathStep(r, SemanticDirection.OUTGOING, Some(b),
            SingleRelationshipPathStep(s, SemanticDirection.INCOMING, Some(c), NilPathStep()(pos))(pos))(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a) CALL {WITH p, a RETURN 1 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val a = varFor("a")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(
          NodePattern(Some(a), List(), None, None)(pos)
        )
      ))(pos), List(), None)(pos)

    val CALL = {
      val WITH1 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val WITH2 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(WITH1, WITH2, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a), (b) CALL {WITH p, b RETURN 1 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val a = varFor("a")
    val b = varFor("b")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(NodePattern(Some(a), List(), None, None)(pos)),
        EveryPath(NodePattern(Some(b), List(), None, None)(pos)),
      ))(pos), List(), None)(pos)

    val CALL = {
      val WITH1 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(a, a)(pos, isAutoAliased = false),
            AliasedReturnItem(b, b)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val WITH2 =
        With(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
            AliasedReturnItem(b, b)(pos, isAutoAliased = false),
          ))(pos), None, None, None, None)(pos)

      val RETURN =
        Return(distinct = false,
          ReturnItems(includeExisting = false, Seq(
            AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
          ))(pos), None, None, None)(pos)

      SubqueryCall(SingleQuery(List(WITH1, WITH2, RETURN))(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a) CALL {WITH p RETURN 1 AS one UNION WITH p RETURN 2 AS one} RETURN p") {
    val rewritten = projectionInlinedAst(testName)

    val p = varFor("p")
    val a = varFor("a")
    val one = varFor("one")

    val MATCH = Match(optional = false,
      Pattern(List(
        EveryPath(
          NodePattern(Some(a), List(), None, None)(pos)
        )
      ))(pos), List(), None)(pos)

    val CALL = {
      val LEFT = {
        val WITH1 =
          With(distinct = false,
            ReturnItems(includeExisting = false, Seq(
              AliasedReturnItem(a, a)(pos, isAutoAliased = false),
            ))(pos), None, None, None, None)(pos)

        val WITH2 =
          With(distinct = false,
            ReturnItems(includeExisting = false, Seq(
              AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
            ))(pos), None, None, None, None)(pos)

        val RETURN =
          Return(distinct = false,
            ReturnItems(includeExisting = false, Seq(
              AliasedReturnItem(literalInt(1), one)(pos, isAutoAliased = false)
            ))(pos), None, None, None)(pos)

        SingleQuery(List(WITH1, WITH2, RETURN))(pos)
      }
      val RIGHT = {
        val WITH1 =
          With(distinct = false,
            ReturnItems(includeExisting = false, Seq(
              AliasedReturnItem(a, a)(pos, isAutoAliased = false),
            ))(pos), None, None, None, None)(pos)

        val WITH2 =
          With(distinct = false,
            ReturnItems(includeExisting = false, Seq(
              AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
            ))(pos), None, None, None, None)(pos)

        val RETURN =
          Return(distinct = false,
            ReturnItems(includeExisting = false, Seq(
              AliasedReturnItem(literalInt(2), one)(pos, isAutoAliased = false)
            ))(pos), None, None, None)(pos)

        SingleQuery(List(WITH1, WITH2, RETURN))(pos)
      }
      SubqueryCall(UnionDistinct(LEFT, RIGHT)(pos), None)(pos)
    }

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, CALL, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a) WITH p RETURN p" ) {
    val rewritten = projectionInlinedAst("MATCH p = (a) WITH p RETURN p")
    val a = varFor("a")
    val p = varFor("p")
    val MATCH =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(a), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

    val WITH =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false)
        ))(pos), None, None, None, None)(pos)

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(p, p)(pos, isAutoAliased = false)
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, WITH, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  //don't project what is already projected
  test("MATCH p = (a) WITH p, a RETURN p" ) {
    val rewritten = projectionInlinedAst("MATCH p = (a) WITH p, a RETURN p")
    val a = varFor("a")
    val p = varFor("p")
    val MATCH =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(a), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

    val WITH =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false),
          AliasedReturnItem(a, a)(pos, isAutoAliased = false)
        ))(pos), None, None, None, None)(pos)

    val RETURN=
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(p, p)(pos, isAutoAliased = false)
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, WITH, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a) WITH p MATCH q = (b) RETURN p, q" ) {
    val rewritten = projectionInlinedAst("MATCH p = (a) WITH p MATCH q = (b) WITH p, q RETURN p, q")
    val a = varFor("a")
    val b = varFor("b")
    val p = varFor("p")
    val q = varFor("q")

    val MATCH1 =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(a), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

    val WITH1 =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos), p)(pos, isAutoAliased = false)
        ))(pos), None, None, None, None)(pos)

    val MATCH2 =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(b), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

    val WITH2 =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(p, p)(pos, isAutoAliased = false),
          AliasedReturnItem(PathExpression(NodePathStep(b, NilPathStep()(pos))(pos))(pos), q)(pos, isAutoAliased = false)
        ))(pos), None, None, None, None)(pos)

    val RETURN=
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(p, p)(pos, isAutoAliased = false),
          AliasedReturnItem(q, q)(pos, isAutoAliased = false)
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH1, WITH1, MATCH2, WITH2, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a)-[r]->(b) RETURN p" ) {
    val returns = parseReturnedExpr("MATCH p = (a)-[r]->(b) RETURN p")

    val expected = PathExpression(
      NodePathStep(varFor("a"), SingleRelationshipPathStep(varFor("r"), SemanticDirection.OUTGOING, Some(varFor("b")), NilPathStep()(pos))(pos))(pos)
    )_

    returns should equal(expected: PathExpression)
  }

  test("MATCH p = (b)<-[r]->(a) RETURN p" ) {
    val returns = parseReturnedExpr("MATCH p = (b)<-[r]-(a) RETURN p")

    val expected = PathExpression(
      NodePathStep(varFor("b"), SingleRelationshipPathStep(varFor("r"), SemanticDirection.INCOMING, Some(varFor("a")), NilPathStep()(pos))(pos))(pos)
    )_

    returns should equal(expected: PathExpression)
  }

  test("MATCH p = (a)-[r*]->(b) RETURN p" ) {
    val returns = parseReturnedExpr("MATCH p = (a)-[r*]->(b) RETURN p")

    val expected = PathExpression(
      NodePathStep(varFor("a"), MultiRelationshipPathStep(varFor("r"), SemanticDirection.OUTGOING, Some(varFor("b")), NilPathStep()(pos))(pos))(pos)
    )_

    returns should equal(expected: PathExpression)
  }

  test("MATCH p = (b)<-[r*]-(a) RETURN p AS p" ) {
    val returns = parseReturnedExpr("MATCH p = (b)<-[r*]-(a) RETURN p AS p")

    val expected = PathExpression(
      NodePathStep(varFor("b"), MultiRelationshipPathStep(varFor("r"), SemanticDirection.INCOMING, Some(varFor("a")), NilPathStep()(pos))(pos))(pos)
    )_

    returns should equal(expected: PathExpression)
  }

  test("MATCH p = (a)-[r]->(b) RETURN p, 42 as order ORDER BY order") {
    val rewritten = projectionInlinedAst("MATCH p = (a)-[r]->(b) RETURN p, 42 as order ORDER BY order")

    val aId = varFor("a")
    val orderId = varFor("order")
    val rId = varFor("r")
    val pId = varFor("p")
    val bId = varFor("b")

    val MATCH =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            RelationshipChain(
              NodePattern(Some(aId), List(), None, None)(pos),
              RelationshipPattern(Some(rId), List(), None, None, SemanticDirection.OUTGOING)(pos), NodePattern(Some(bId), List(), None, None)(pos)
            )(pos))
        ))(pos), List(), None)(pos)

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(PathExpression(NodePathStep(aId, SingleRelationshipPathStep(rId, SemanticDirection.OUTGOING, Some(varFor("b")),
            NilPathStep()(pos))(pos))(pos))(pos), pId)(pos, isAutoAliased = false),
          AliasedReturnItem(literalInt(42), orderId)(pos, isAutoAliased = false)
        ))(pos),
        Some(OrderBy(List(AscSortItem(orderId)(pos)))(pos)),
        None, None
      )(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("MATCH p = (a)-[r]->(b) WHERE length(p) > 10 RETURN 1") {
    val rewritten = projectionInlinedAst("MATCH p = (a)-[r]->(b) WHERE length(p) > 10 RETURN 1 as x")

    val aId = varFor("a")
    val rId = varFor("r")
    val bId = varFor("b")

    val WHERE =
      Where(
        greaterThan(
          function("length", PathExpression(NodePathStep(aId, SingleRelationshipPathStep(rId, SemanticDirection.OUTGOING, Some(varFor("b")), NilPathStep()(pos))(pos))(pos))(pos)),
          literalInt(10)
        )
      )(pos)

    val MATCH =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            RelationshipChain(
              NodePattern(Some(aId), List(), None, None)(pos),
              RelationshipPattern(Some(rId), List(), None, None, SemanticDirection.OUTGOING)(pos), NodePattern(Some(bId), List(), None, None)(pos)
            )(pos))
        ))(pos), List(), Some(WHERE))(pos)

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, List(
          AliasedReturnItem(literalInt(1), varFor("x"))(pos, isAutoAliased = false)
        ))(pos),
        None, None, None
      )(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("Aggregating WITH downstreams" ) {
    val rewritten = projectionInlinedAst("MATCH p = (a) WITH length(p) as l, count(*) as x WITH l, x RETURN l + x")
    val a = varFor("a")
    val l = varFor("l")
    val x = varFor("x")
    val MATCH =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(a), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

    val pathExpression = PathExpression(NodePathStep(a, NilPathStep()(pos))(pos))(pos)
    val WITH1 =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(function("length", pathExpression), l)(pos, isAutoAliased = false),
          AliasedReturnItem(CountStar()(pos), x)(pos, isAutoAliased = false)
        ))(pos), None, None, None, None)(pos)

    val WITH2 =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(l, l)(pos, isAutoAliased = false),
          AliasedReturnItem(x, x)(pos, isAutoAliased = false)
        ))(pos), None, None, None, None)(pos)

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(add(l, x), varFor("l + x"))(pos, isAutoAliased = false)
        ))(pos), None, None, None)(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, WITH1, WITH2, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }

  test("WHERE and ORDER BY on WITH clauses should be rewritten" ) {
    val rewritten = projectionInlinedAst("MATCH p = (a) WITH a ORDER BY p WHERE length(p) = 1 RETURN a")

    val aId = varFor("a")

    val MATCH =
      Match(optional = false,
        Pattern(List(
          EveryPath(
            NodePattern(Some(aId), List(), None, None)(pos))
        ))(pos), List(), None)(pos)

    val pathExpression = PathExpression(NodePathStep(aId, NilPathStep()(pos))(pos))(pos)

    val WHERE =
      Where(
        equals(
          function("length", pathExpression),
          literalInt(1)
        )
      )(pos)

    val WITH =
      With(distinct = false,
        ReturnItems(includeExisting = false, Seq(
          AliasedReturnItem(aId, aId)(pos, isAutoAliased = false)
        ))(pos),
        Some(OrderBy(List(AscSortItem(pathExpression)(pos)))(pos)),
        None, None,
        Some(WHERE)
      )(pos)

    val RETURN =
      Return(distinct = false,
        ReturnItems(includeExisting = false, List(
          AliasedReturnItem(aId, aId)(pos, isAutoAliased = false)
        ))(pos),
        None, None, None
      )(pos)

    val expected: Query = Query(None, SingleQuery(List(MATCH, WITH, RETURN))(pos))(pos)

    rewritten should equal(expected)
  }
}
