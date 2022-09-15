/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.cypher.internal.compiler.planner.logical.plans

import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.LeafPlanRestrictions
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.NodeIndexLeafPlanner
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.nodeIndexScanPlanProvider
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.nodeIndexSeekPlanProvider
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.nodeIndexStringSearchScanPlanProvider
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelToken
import org.neo4j.cypher.internal.expressions.NODE_TYPE
import org.neo4j.cypher.internal.expressions.PropertyKeyToken
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.Selections
import org.neo4j.cypher.internal.ir.helpers.ExpressionConverters.PredicateConverter
import org.neo4j.cypher.internal.logical.plans.CanGetValue
import org.neo4j.cypher.internal.logical.plans.CompositeQueryExpression
import org.neo4j.cypher.internal.logical.plans.DoNotGetValue
import org.neo4j.cypher.internal.logical.plans.ExclusiveBound
import org.neo4j.cypher.internal.logical.plans.ExistenceQueryExpression
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.IndexedProperty
import org.neo4j.cypher.internal.logical.plans.InequalitySeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.ManyQueryExpression
import org.neo4j.cypher.internal.logical.plans.NodeIndexContainsScan
import org.neo4j.cypher.internal.logical.plans.NodeIndexEndsWithScan
import org.neo4j.cypher.internal.logical.plans.NodeIndexScan
import org.neo4j.cypher.internal.logical.plans.NodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.PointDistanceRange
import org.neo4j.cypher.internal.logical.plans.PointDistanceSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.PrefixRange
import org.neo4j.cypher.internal.logical.plans.PrefixSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.RangeLessThan
import org.neo4j.cypher.internal.logical.plans.RangeQueryExpression
import org.neo4j.cypher.internal.logical.plans.SingleQueryExpression
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.PropertyKeyId
import org.neo4j.cypher.internal.util.symbols.CTInteger
import org.neo4j.cypher.internal.util.symbols.CTString
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.graphdb.schema.IndexType

class NodeIndexLeafPlannerTest  extends CypherFunSuite with LogicalPlanningTestSupport2 {

  private def nodeIndexLeafPlanner(restrictions: LeafPlanRestrictions) =
    NodeIndexLeafPlanner(Seq(nodeIndexSeekPlanProvider, nodeIndexStringSearchScanPlanProvider, nodeIndexScanPlanProvider), restrictions)

  test("finds all types of index plans") {

    val lit42: Expression = literalInt(42)
    val lit6: Expression = literalInt(6)
    val litFoo = literalString("foo")
    val litBar = literalString("bar")

    val nProp = prop("n", "prop")
    val mProp = prop("m", "prop")
    val oProp = prop("o", "prop")
    val oFoo = prop("o", "foo")
    val oBar = prop("o", "bar")
    val oAaa = prop("o", "aaa")
    val oBbb = prop("o", "bbb")
    val oCcc = prop("o", "ccc")
    val xProp = prop("x", "prop")

    val nPropEqualsXProp = Equals(nProp, xProp)(pos)
    val nPropEqualsLit42 = equals(lit42, nProp)
    val nPropEqualsLitFoo = equals(litFoo, nProp)
    val nPropInLit6Lit42 = in(nProp, listOf(lit6, lit42))
    val nPropInLitFooLitBar = in(nProp, listOf(litFoo, litBar))
    val nPropLessThanLit6 = lessThan(nProp, lit6)
    val nPropLessThanLitFoo = lessThan(nProp, litFoo)
    val nPropStartsWithLitFoo = startsWith(nProp, litFoo)
    val nPropEndsWithLitFoo = endsWith(nProp, litFoo)
    val nPropContainsLitFoo = contains(nProp, litFoo)
    val point = function("point", mapOfInt("x" -> 1, "y" -> 2))
    val nPropDistance = greaterThan(lit42, function(List("point"), "distance", nProp, point))
    val mPropEqualsXProp = Equals(mProp, xProp)(pos)
    val mPropIsNotNull = isNotNull(mProp)
    val oPropIsNotNull = isNotNull(oProp)
    val oPropExists = exists(oProp)
    val oFooExists = exists(oFoo)
    val oFooEqualsLit6 = equals(oFoo, lit6)
    val oBarEqualsLit42 = equals(oBar, lit42)
    val oAaaEqualsLit42 = equals(oAaa, lit42)
    val oBbbLessThan6 = lessThan(oBbb, lit6)
    val oCccLessThan6 = lessThan(oCcc, lit6)
    new given {
      addTypeToSemanticTable(nProp, CTInteger.invariant)
      addTypeToSemanticTable(mProp, CTInteger.invariant)
      addTypeToSemanticTable(oProp, CTInteger.invariant)
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      addTypeToSemanticTable(lit6, CTInteger.invariant)
      addTypeToSemanticTable(litFoo, CTString.invariant)
      addTypeToSemanticTable(litBar, CTString.invariant)

      val predicates: Set[Expression] = Set(
        hasLabels("n", "Awesome"),
        hasLabels("m", "Awesome"),
        hasLabels("o", "Awesome"),
        hasLabels("x", "Awesome"),
        nPropInLit6Lit42,
        nPropInLitFooLitBar,
        nPropLessThanLit6,
        nPropLessThanLitFoo,
        nPropEqualsLit42,
        nPropEqualsLitFoo,
        nPropStartsWithLitFoo,
        nPropEndsWithLitFoo,
        nPropContainsLitFoo,
        nPropDistance,
        nPropEqualsXProp,
        mPropEqualsXProp,
        mPropIsNotNull,
        oPropIsNotNull,
        oPropExists,
        oFooExists,
        oFooEqualsLit6,
        oBarEqualsLit42,
        oAaaEqualsLit42,
        oBbbLessThan6,
        oCccLessThan6,
      )

      qg = QueryGraph(
        selections = Selections(predicates.flatMap(_.asPredicates)),
        patternNodes = Set("n", "m", "o", "x"),
        argumentIds = Set("x")
      )

      indexOn("Awesome", "prop")
      textIndexOn("Awesome", "prop")
      indexOn("Awesome", "foo", "bar")
      indexOn("Awesome", "aaa", "bbb", "ccc")
    }.withLogicalPlanningContext { (cfg, ctx) =>

      // when
      val restriction = LeafPlanRestrictions.OnlyIndexSeekPlansFor("m", Set("x"))
      val resultPlans = nodeIndexLeafPlanner(restriction)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      val labelToken = LabelToken("Awesome", LabelId(0))
      val propToken = PropertyKeyToken("prop", PropertyKeyId(0))
      val fooToken = PropertyKeyToken("foo", PropertyKeyId(1))
      val barToken = PropertyKeyToken("bar", PropertyKeyId(2))
      val aaaToken = PropertyKeyToken("aaa", PropertyKeyId(3))
      val bbbToken = PropertyKeyToken("bbb", PropertyKeyId(4))
      val cccToken = PropertyKeyToken("ccc", PropertyKeyId(5))

      resultPlans shouldEqual Set(
        // nPropInLit6Lit42
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), ManyQueryExpression(listOf(lit6, lit42)), Set("x"), IndexOrderNone, IndexType.BTREE),
        // nPropInLitFooLitBar
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), ManyQueryExpression(listOf(litFoo, litBar)), Set("x"), IndexOrderNone, IndexType.BTREE),
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), ManyQueryExpression(listOf(litFoo, litBar)), Set("x"), IndexOrderNone, IndexType.TEXT),
        // nPropLessThanLit6
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(lit6))))(pos)), Set("x"), IndexOrderNone, IndexType.BTREE),
        // nPropLessThanLitFoo
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(litFoo))))(pos)), Set("x"), IndexOrderNone, IndexType.BTREE),
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(litFoo))))(pos)), Set("x"), IndexOrderNone, IndexType.TEXT),
        // nPropEqualsLit42
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), SingleQueryExpression(lit42), Set("x"), IndexOrderNone, IndexType.BTREE),
        // nPropEqualsLitFoo
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), SingleQueryExpression(litFoo), Set("x"), IndexOrderNone, IndexType.BTREE),
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), SingleQueryExpression(litFoo), Set("x"), IndexOrderNone, IndexType.TEXT),
        // nPropStartsWithLitFoo
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(PrefixSeekRangeWrapper(PrefixRange(litFoo))(pos)), Set("x"), IndexOrderNone, IndexType.BTREE),
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(PrefixSeekRangeWrapper(PrefixRange(litFoo))(pos)), Set("x"), IndexOrderNone, IndexType.TEXT),
        // nPropDistance
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(PointDistanceSeekRangeWrapper(PointDistanceRange(point, lit42, inclusive = false))(pos)), Set("x"), IndexOrderNone, IndexType.BTREE),
        // nPropEqualsXProp
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), SingleQueryExpression(xProp), Set("x"), IndexOrderNone, IndexType.BTREE),
        // mPropEqualsXProp
        NodeIndexSeek("m", labelToken, Seq(IndexedProperty(propToken, CanGetValue, NODE_TYPE)), SingleQueryExpression(xProp), Set("x"), IndexOrderNone, IndexType.BTREE),
        // oFooEqualsLit6, oBarEqualsLit42
        NodeIndexSeek("o", labelToken, Seq(IndexedProperty(fooToken, CanGetValue, NODE_TYPE), IndexedProperty(barToken, CanGetValue, NODE_TYPE)), CompositeQueryExpression(Seq(SingleQueryExpression(lit6), SingleQueryExpression(lit42))), Set("x"), IndexOrderNone, IndexType.BTREE),
        // oAaaEqualsLit42, oBbbLessThan6, oCccLessThan6
        NodeIndexSeek("o", labelToken, Seq(IndexedProperty(aaaToken, CanGetValue, NODE_TYPE), IndexedProperty(bbbToken, DoNotGetValue, NODE_TYPE), IndexedProperty(cccToken, DoNotGetValue, NODE_TYPE)),
          CompositeQueryExpression(Seq(SingleQueryExpression(lit42), RangeQueryExpression(InequalitySeekRangeWrapper(RangeLessThan(NonEmptyList(ExclusiveBound(lit6))))(pos)), ExistenceQueryExpression())), Set("x"), IndexOrderNone, IndexType.BTREE),
        // nPropContainsLitFoo
        NodeIndexContainsScan("n", labelToken, IndexedProperty(propToken, DoNotGetValue, NODE_TYPE), litFoo, Set("x"), IndexOrderNone, IndexType.BTREE),
        NodeIndexContainsScan("n", labelToken, IndexedProperty(propToken, DoNotGetValue, NODE_TYPE), litFoo, Set("x"), IndexOrderNone, IndexType.TEXT),
        // nPropEndsWithLitFoo
        NodeIndexEndsWithScan("n", labelToken, IndexedProperty(propToken, DoNotGetValue, NODE_TYPE), litFoo, Set("x"), IndexOrderNone, IndexType.BTREE),
        NodeIndexEndsWithScan("n", labelToken, IndexedProperty(propToken, DoNotGetValue, NODE_TYPE), litFoo, Set("x"), IndexOrderNone, IndexType.TEXT),
        // ..several..
        NodeIndexScan("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), Set("x"), IndexOrderNone, IndexType.BTREE),
        // oPropIsNotNull, oPropExists
        NodeIndexScan("o", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), Set("x"), IndexOrderNone, IndexType.BTREE),
        // oFooExists, oFooEqualsLit6, oBarEqualsLit42,
        NodeIndexScan("o", labelToken, Seq(IndexedProperty(fooToken, DoNotGetValue, NODE_TYPE), IndexedProperty(barToken, DoNotGetValue, NODE_TYPE)), Set("x"), IndexOrderNone, IndexType.BTREE),
        // oAaaEqualsLit42, oBbbLessThan6, oCccLessThan6
        NodeIndexScan("o", labelToken, Seq(IndexedProperty(aaaToken, DoNotGetValue, NODE_TYPE), IndexedProperty(bbbToken, DoNotGetValue, NODE_TYPE), IndexedProperty(cccToken, DoNotGetValue, NODE_TYPE)), Set("x"), IndexOrderNone, IndexType.BTREE),
      )

    }
  }

  test("should not find node index scans for text indexes") {

    val litFoo = literalString("foo")

    val nProp = prop("n", "prop")

    val nPropStartsWithLitFoo = startsWith(nProp, litFoo)
    val nPropEndsWithLitFoo = endsWith(nProp, litFoo)
    val nPropContainsLitFoo = contains(nProp, litFoo)
    val nPropIsNotNull = isNotNull(nProp)
    new given {
      addTypeToSemanticTable(nProp, CTInteger.invariant)

      val predicates: Set[Expression] = Set(
        hasLabels("n", "Awesome"),
        nPropStartsWithLitFoo,
        nPropEndsWithLitFoo,
        nPropContainsLitFoo,
        nPropIsNotNull,
      )

      qg = QueryGraph(
        selections = Selections(predicates.flatMap(_.asPredicates)),
        patternNodes = Set("n"),
      )

      textIndexOn("Awesome", "prop")

    }.withLogicalPlanningContext { (cfg, ctx) =>

      // when
      val restriction = LeafPlanRestrictions.NoRestrictions
      val resultPlans = nodeIndexLeafPlanner(restriction)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      val labelToken = LabelToken("Awesome", LabelId(0))
      val propToken = PropertyKeyToken("prop", PropertyKeyId(0))

      resultPlans shouldEqual Set(
        // nPropStartsWithLitFoo
        NodeIndexSeek("n", labelToken, Seq(IndexedProperty(propToken, DoNotGetValue, NODE_TYPE)), RangeQueryExpression(PrefixSeekRangeWrapper(PrefixRange(litFoo))(pos)), Set(), IndexOrderNone, IndexType.TEXT),
        // nPropEndsWithLitFoo
        NodeIndexEndsWithScan("n", labelToken, IndexedProperty(propToken, DoNotGetValue, NODE_TYPE), litFoo, Set(), IndexOrderNone, IndexType.TEXT),
        // nPropContainsLitFoo
        NodeIndexContainsScan("n", labelToken, IndexedProperty(propToken, DoNotGetValue, NODE_TYPE), litFoo, Set(), IndexOrderNone, IndexType.TEXT),
        // no scan plans
      )
    }
  }
}
