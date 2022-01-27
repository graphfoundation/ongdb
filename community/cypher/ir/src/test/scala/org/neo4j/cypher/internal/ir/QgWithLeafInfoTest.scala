/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.ir
import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.expressions.MapExpression
import org.neo4j.cypher.internal.expressions.NodePattern
import org.neo4j.cypher.internal.expressions.PatternComprehension
import org.neo4j.cypher.internal.expressions.PatternExpression
import org.neo4j.cypher.internal.expressions.RelationshipChain
import org.neo4j.cypher.internal.expressions.RelationshipPattern
import org.neo4j.cypher.internal.expressions.RelationshipsPattern
import org.neo4j.cypher.internal.expressions.SemanticDirection.BOTH
import org.neo4j.cypher.internal.expressions.SemanticDirection.OUTGOING
import org.neo4j.cypher.internal.ir.QgWithLeafInfo.StableIdentifier
import org.neo4j.cypher.internal.ir.QgWithLeafInfo.UnstableIdentifier
import org.neo4j.cypher.internal.ir.helpers.ExpressionConverters.PredicateConverter
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class QgWithLeafInfoTest extends CypherFunSuite with AstConstructionTestSupport {

  private val semanticTable = SemanticTable()

  test("unstablePatternNodes includes only nodes excluding stable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))
    qgWithLeafInfo.unstablePatternNodes should equal(Set("a", "c"))
  }

  test("unstablePatternNodes includes optional match nodes") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a"),
      patternRelationships = Set(r),
      optionalMatches = IndexedSeq(QueryGraph(patternNodes = Set("b")))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, None)
    qgWithLeafInfo.unstablePatternNodes should equal(Set("a", "b"))
  }

  test("unstablePatternRelationships excludes stable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val r2 = PatternRelationship("r2", ("b", "c"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r, r2)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("r", isIdStable = false)))
    qgWithLeafInfo.unstablePatternRelationships should equal(Set(r2))
  }

  test("unstablePatternRelationships includes optional match relationships") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val r2 = PatternRelationship("r2", ("b", "c"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      optionalMatches = IndexedSeq(QueryGraph(patternRelationships = Set(r2)))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, None)
    qgWithLeafInfo.unstablePatternRelationships should equal(Set(r, r2))
  }

  test("unstablePatternRelationships includes shortest path relationships") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val spp = ShortestPathPattern(None, r, single = true)(null)

    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      shortestPathPatterns = Set(spp)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, None)
    qgWithLeafInfo.unstablePatternRelationships should equal(Set(r))
  }

  test("patternNodes includes unstable and stable identifiers") {
    val a = UnstableIdentifier("a")
    val b = StableIdentifier("b", isIdStable = false)
    val c = UnstableIdentifier("c")
    val qg = QueryGraph(patternNodes = Set("a", "b", "c"))
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(b))
    qgWithLeafInfo.patternNodes should equal(Set(a, b, c))
  }

  test("patternNodes should not include stable relationship identifiers") {
    val a = UnstableIdentifier("a")
    val b = UnstableIdentifier("b")
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val rIdent = StableIdentifier("r", isIdStable = false)
    val qg = QueryGraph(
      patternNodes = Set("a", "b"),
      patternRelationships = Set(r)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(rIdent))

    qgWithLeafInfo.patternNodes should equal(Set(a, b))
  }

  test("leafPatternNodes should include only leaves (unstable and stable)") {
    val a = UnstableIdentifier("a")
    val b = StableIdentifier("b", isIdStable = false)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set("a"), Some(b))

    qgWithLeafInfo.leafPatternNodes should equal(Set(a, b))
  }

  test("nonArgumentPatternNodes should exclude arguments") {
    val a = UnstableIdentifier("a")
    val b = StableIdentifier("b", isIdStable = false)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      argumentIds = Set("b"),
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set("a"), Some(b))

    qgWithLeafInfo.leafPatternNodes should equal(Set(a, b))
  }

  test("patternRelationships should not include stable node identifiers") {
    val b = StableIdentifier("b", isIdStable = false)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val r2 = PatternRelationship("r2", ("b", "c"), OUTGOING, Seq.empty, SimplePatternLength)
    val rIdent = UnstableIdentifier("r")
    val r2Ident = UnstableIdentifier("r2")

    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r, r2)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(b))
    qgWithLeafInfo.patternRelationships should equal(Set(rIdent, r2Ident))
  }

  test("patternRelationships includes unstable and stable identifiers") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val r2 = PatternRelationship("r2", ("b", "c"), OUTGOING, Seq.empty, SimplePatternLength)
    val rIdent = StableIdentifier("r", isIdStable = false)
    val r2Ident = UnstableIdentifier("r2")

    val qg = QueryGraph(
      patternNodes = Set("a", "b"),
      patternRelationships = Set(r, r2),
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(rIdent))

    qgWithLeafInfo.patternRelationships should equal(Set(rIdent, r2Ident))
  }

  test("allKnownUnstableNodeLabelsFor should include all labels for unstable identifier") {
    val a = UnstableIdentifier("a")
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(hasLabels("a", "A"), or(hasLabels("a", "A2"), hasLabels("a", "A3"))))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allKnownUnstableNodeLabelsFor(a) should equal(Set(labelName("A"), labelName("A2"), labelName("A3")))
  }

  test("allKnownUnstableNodeLabelsFor should include labels from HasLabelsOrTypes") {
    val a = UnstableIdentifier("a")
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(hasLabelsOrTypes("a", "A")))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allKnownUnstableNodeLabelsFor(a) should equal(Set(labelName("A")))
  }

  test("allKnownUnstableNodeLabelsFor should include all labels from optional matches") {
    val a = UnstableIdentifier("a")
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      optionalMatches = IndexedSeq(QueryGraph(
        patternNodes = Set("a"),
        selections = Selections.from(hasLabels("a", "A"))
      ))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allKnownUnstableNodeLabelsFor(a) should equal(Set(labelName("A")))
  }

  test("allKnownUnstableNodeLabelsFor should not include any labels for id-stable identifier") {
    val b = StableIdentifier("b", isIdStable = true)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(hasLabels("b", "B"))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(b))

    qgWithLeafInfo.allKnownUnstableNodeLabelsFor(b) should be(empty)
  }

  test("allKnownUnstableNodeLabelsFor should not include any solved labels for stable identifier") {
    val b = StableIdentifier("b", isIdStable = false)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val solvedExpression = hasLabels("b", "B2")
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(hasLabels("b", "B"), solvedExpression))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, solvedExpression.asPredicates, Set.empty, Some(b))

    qgWithLeafInfo.allKnownUnstableNodeLabelsFor(b) should equal(Set(labelName("B")))
  }

  test("allPossibleUnstableRelTypesFor should include all inlined rel types for unstable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq(relTypeName("R"), relTypeName("Q")), SimplePatternLength)
    val rIdent = UnstableIdentifier("r")

    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allPossibleUnstableRelTypesFor(rIdent) should equal(Set(relTypeName("R"), relTypeName("Q")))
  }

  test("allPossibleUnstableRelTypesFor should include all rel types from selections for unstable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val rIdent = UnstableIdentifier("r")

    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(hasTypes("r", "R"), or(hasTypes("r", "R2"), hasTypes("r", "R3"))))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allPossibleUnstableRelTypesFor(rIdent) should equal(Set(relTypeName("R"), relTypeName("R2"), relTypeName("R3")))
  }

  test("allPossibleUnstableRelTypesFor should include all rel types from HasLabelsOrTypes selections for unstable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val rIdent = UnstableIdentifier("r")

    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(hasTypes("r", "R"), or(hasLabelsOrTypes("r", "R2"), hasLabelsOrTypes("r", "R3"))))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allPossibleUnstableRelTypesFor(rIdent) should equal(Set(relTypeName("R"), relTypeName("R2"), relTypeName("R3")))
  }

  test("allPossibleUnstableRelTypesFor should include all types from optional matches") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val rIdent = UnstableIdentifier("r")
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      optionalMatches = IndexedSeq(QueryGraph(
        patternNodes = Set("a"),
        selections = Selections.from(hasTypes("r", "R"))
      ))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allPossibleUnstableRelTypesFor(rIdent) should equal(Set(relTypeName("R")))
  }

  test("allPossibleUnstableRelTypesFor should not include any types for id-stable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq(relTypeName("Q")), SimplePatternLength)
    val rIdent = StableIdentifier("r", isIdStable = true)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(hasTypes("r", "R"))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(rIdent))

    qgWithLeafInfo.allPossibleUnstableRelTypesFor(rIdent) should be(empty)
  }

  test("allPossibleUnstableRelTypesFor should not include any solved types for stable identifier") {
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq(relTypeName("R3")), SimplePatternLength)
    val rIdent = StableIdentifier("r", isIdStable = false)
    val solvedExpression = hasTypes("r", "R")
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(hasTypes("r", "R2"), solvedExpression))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, solvedExpression.asPredicates, Set.empty, Some(rIdent))

    qgWithLeafInfo.allPossibleUnstableRelTypesFor(rIdent) should equal(Set(relTypeName("R2"), relTypeName("R3")))
  }

  test("allKnownUnstablePropertiesFor should include all properties for unstable identifier") {
    val a = UnstableIdentifier("a")
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(equals(prop("a", "prop"), literalInt(5)))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allKnownUnstablePropertiesFor(a) should equal(Set(propName("prop")))
  }

  test("allKnownUnstablePropertiesFor should include all properties from optional matches") {
    val a = UnstableIdentifier("a")
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      optionalMatches = IndexedSeq(QueryGraph(
        patternNodes = Set("a"),
        selections = Selections.from(equals(prop("a", "prop"), literalInt(5)))
      ))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(StableIdentifier("b", isIdStable = false)))

    qgWithLeafInfo.allKnownUnstablePropertiesFor(a) should equal(Set(propName("prop")))
  }

  test("allKnownUnstablePropertiesFor should not include any properties for id-stable identifier") {
    val b = StableIdentifier("b", isIdStable = true)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(equals(prop("b", "prop"), literalInt(5)))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(b))

    qgWithLeafInfo.allKnownUnstablePropertiesFor(b) should be(empty)
  }

  test("allKnownUnstablePropertiesFor should not include any solved labels for stable identifier") {
    val b = StableIdentifier("b", isIdStable = false)
    val r = PatternRelationship("r", ("a", "b"), OUTGOING, Seq.empty, SimplePatternLength)
    val solvedExpression = equals(prop("b", "prop"), literalInt(5))
    val qg = QueryGraph(
      patternNodes = Set("a", "b", "c"),
      patternRelationships = Set(r),
      selections = Selections.from(Seq(solvedExpression, equals(prop("b", "prop2"), literalInt(5))))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, solvedExpression.asPredicates, Set.empty, Some(b))

    qgWithLeafInfo.allKnownUnstablePropertiesFor(b) should equal(Set(propName("prop2")))
  }

  test("allKnownUnstableNodeLabels includes arguments not proven to be nodes") {
    val a = StableIdentifier("a", isIdStable = false)
    val qg = QueryGraph(
      patternNodes = Set("a"),
      argumentIds = Set("b"),
      selections = Selections.from(Seq(hasLabelsOrTypes("b", "B")))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(a))

    qgWithLeafInfo.allKnownUnstableNodeLabels(semanticTable) should equal(Set(labelName("B")))
  }

  test("allKnownUnstableNodeProperties includes arguments not proven to be nodes") {
    val a = StableIdentifier("a", isIdStable = false)
    val qg = QueryGraph(
      patternNodes = Set("a"),
      argumentIds = Set("b"),
      selections = Selections.from(Seq(propEquality("b", "prop", 5)))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(a))

    qgWithLeafInfo.allKnownUnstableNodeProperties(semanticTable) should equal(Set(propName("prop")))
  }

  test("allKnownUnstableNodeProperties includes pattern expression property key names") {
    val a = StableIdentifier("a", isIdStable = false)
    val pExp = PatternExpression(RelationshipsPattern(RelationshipChain(
      NodePattern(Some(varFor("a")), Seq.empty, Some(MapExpression(Seq(propName("prop") -> literalInt(5)))(pos)), None)(pos),
      RelationshipPattern(None, Seq.empty, None, None, BOTH)(pos),
      NodePattern(None, Seq.empty, None, None)(pos)
    )(pos))(pos))(Set.empty, "", "")

    val qg = QueryGraph(
      patternNodes = Set("a"),
      argumentIds = Set("b"),
      selections = Selections.from(pExp)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(a))

    qgWithLeafInfo.allKnownUnstableNodeProperties(semanticTable) should equal(Set(propName("prop")))
  }

  test("allKnownUnstableRelProperties includes arguments not proven to be relationships") {
    val a = StableIdentifier("a", isIdStable = false)
    val qg = QueryGraph(
      patternNodes = Set("a"),
      argumentIds = Set("b"),
      selections = Selections.from(Seq(propEquality("b", "prop", 5)))
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(a))

    qgWithLeafInfo.allKnownUnstableRelProperties(semanticTable) should equal(Set(propName("prop")))
  }

  test("allKnownUnstableRelProperties includes pattern comprehension property key names") {
    val a = StableIdentifier("a", isIdStable = false)
    val pComp = PatternComprehension(None, RelationshipsPattern(RelationshipChain(
      NodePattern(Some(varFor("a")), Seq.empty, Some(MapExpression(Seq(propName("prop") -> literalInt(5)))(pos)), None)(pos),
      RelationshipPattern(None, Seq.empty, None, None, BOTH)(pos),
      NodePattern(None, Seq.empty, None, None)(pos)
    )(pos))(pos), None, literalInt(5))(pos, Set.empty, "", "")

    val qg = QueryGraph(
      patternNodes = Set("a"),
      argumentIds = Set("b"),
      selections = Selections.from(pComp)
    )
    val qgWithLeafInfo = QgWithLeafInfo(qg, Set.empty, Set.empty, Some(a))

    qgWithLeafInfo.allKnownUnstableRelProperties(semanticTable) should equal(Set(propName("prop")))
  }
}
