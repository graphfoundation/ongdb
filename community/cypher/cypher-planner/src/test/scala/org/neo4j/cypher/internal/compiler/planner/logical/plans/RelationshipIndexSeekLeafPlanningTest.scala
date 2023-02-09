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
package org.neo4j.cypher.internal.compiler.planner.logical.plans

import org.neo4j.cypher.internal.ast.AstConstructionTestSupport
import org.neo4j.cypher.internal.ast.SeekOnly
import org.neo4j.cypher.internal.ast.UsingIndexHint
import org.neo4j.cypher.internal.compiler.helpers.LogicalPlanBuilder
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.LeafPlanRestrictions
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.ordering.InterestingOrderConfig
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.RelationshipIndexLeafPlanner
import org.neo4j.cypher.internal.compiler.planner.logical.steps.index.RelationshipIndexSeekPlanProvider
import org.neo4j.cypher.internal.expressions.AndedPropertyInequalities
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.PartialPredicate
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.SemanticDirection.BOTH
import org.neo4j.cypher.internal.expressions.SemanticDirection.INCOMING
import org.neo4j.cypher.internal.expressions.SemanticDirection.OUTGOING
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.Predicate
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.Selections
import org.neo4j.cypher.internal.ir.SimplePatternLength
import org.neo4j.cypher.internal.ir.helpers.ExpressionConverters.PredicateConverter
import org.neo4j.cypher.internal.logical.plans.CanGetValue
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.symbols.CTInteger
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class RelationshipIndexSeekLeafPlanningTest extends CypherFunSuite
                                            with LogicalPlanningTestSupport2
                                            with AstConstructionTestSupport {
  private val relName = "r"
  private val startNodeName = "start"
  private val endNodeName = "end"
  private val prop = "prop"
  private val foo = "foo"
  private val relTypeName = "REL"

  private val rProp = prop(relName, prop)
  private val rFoo = prop(relName, foo)
  private val lit42 = literalInt(42)
  private val lit6 = literalInt(6)

  private val rPropIsNotNull = isNotNull(rProp)
  private val rPropInLit42 = in(rProp, listOf(lit42))
  private val rPropEndsWithLitText = endsWith(rProp, literalString("Text"))
  private val rPropContainsLitText = contains(rProp, literalString("Text"))
  private val rPropLessThanLit42 = AndedPropertyInequalities(varFor(relName), rProp, NonEmptyList(lessThan(rProp, lit42)))
  private val rFooIsNotNull = isNotNull(rFoo)
  private val rFooLessThanLit42 = AndedPropertyInequalities(varFor(relName), rFoo, NonEmptyList(lessThan(rFoo, lit42)))

  private def indexSeekLeafPlanner(restrictions: LeafPlanRestrictions) =
    RelationshipIndexLeafPlanner(Seq(RelationshipIndexSeekPlanProvider), restrictions)

  private def solvedPredicates(plan: LogicalPlan, ctx: LogicalPlanningContext) =
    ctx.planningAttributes.solveds.get(plan.id).asSinglePlannerQuery.queryGraph.selections.predicates.map(_.expr)

  private def queryGraph(types: Seq[String], semanticDirection: SemanticDirection, predicates: Expression*) =
    QueryGraph(
      selections = Selections(predicates.map(Predicate(Set(relName), _)).toSet),
      patternRelationships = Set(PatternRelationship(
        relName,
        (startNodeName, endNodeName),
        semanticDirection,
        types.map(super[AstConstructionTestSupport].relTypeName),
        SimplePatternLength))
    )

  test("does not plan index seek when no index exist") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rPropInLit42)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans shouldBe empty
    }
  }

  test("index seek (IN predicate) when there is an index on the property for when matching on undirected relationship") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rPropInLit42)
      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ${lit42.stringVal})]-($endNodeName)", getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("index seek (IN predicate) when there is an index on the property for when matching on incoming relationship") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), INCOMING, rPropInLit42)
      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)<-[$relName:$relTypeName($prop = ${lit42.stringVal})]-($endNodeName)", getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("index seek (IN predicate) when there is an index on the property for when matching on outgoing relationship") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), OUTGOING, rPropInLit42)
      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ${lit42.stringVal})]->($endNodeName)", getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("index seek (< predicate) when there is an index on the property") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rPropLessThanLit42)

      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop < ${lit42.stringVal})]-($endNodeName)")
          .build()
      ))
    }
  }

  test("index seek with values (< predicate) when there is an index on the property which can provide values") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rPropLessThanLit42)

      relationshipIndexOn(relTypeName, prop).providesValues()
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop < ${lit42.stringVal})]-($endNodeName)", getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("plans index seeks when variable exists as an argument") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      val x: Expression = varFor("x")
      qg = queryGraph(Seq(relTypeName), BOTH, in(rProp, listOf(x))).addArgumentIds(Seq("x"))

      addTypeToSemanticTable(x, CTNode.invariant)
      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val x = cfg.x
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ???)]-($endNodeName)",
            paramExpr = Some(x),
            argumentIds = Set("x"),
            getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("does not plan an index seek when the RHS expression does not have its dependencies in scope") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, in(rProp, listOf(varFor("x"))))

      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans shouldBe empty
    }
  }

  test("plans only index plans that match the dependencies of the restriction") {
    val x = "x"
    val xProp = prop(x, prop)
    val rPropEqualsXProp = equals(rProp, xProp)
    val rPropEquals = equals(lit42, rProp)
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      addTypeToSemanticTable(lit6, CTInteger.invariant)
      addTypeToSemanticTable(rProp, CTInteger.invariant)
      val predicates: Set[Expression] = Set(
        in(rProp, listOf(lit42)),
        AndedPropertyInequalities(varFor(relName), rProp, NonEmptyList(lessThan(rProp, lit6))),
        rPropEquals,
        startsWith(rProp, literalString(foo)),
        endsWith(rProp, literalString(foo)),
        contains(rProp, literalString(foo)),
        greaterThan(lit42, function(List("point"), "distance", rProp, function("point", mapOfInt("x" -> 1, "y" -> 2)))),
        rPropEqualsXProp,
      )

      qg = QueryGraph(
        selections = Selections(predicates.flatMap(_.asPredicates)),
        patternRelationships = Set(
          PatternRelationship(
            relName,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength),
          PatternRelationship(
            x,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength)
        ),
        argumentIds = Set(x)
      )

      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val restriction = LeafPlanRestrictions.OnlyIndexSeekPlansFor(relName, Set(x))
      val resultPlans = indexSeekLeafPlanner(restriction)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ???)]-($endNodeName)",
            paramExpr = Some(xProp),
            argumentIds = Set(x),
            getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("plans only index plans that match the dependencies of the restriction for composite index") {
    val x = "x"
    val xProp = prop(x, prop)

    val rPropEqualsXProp = equals(rProp, xProp)
    val rPropEquals = equals(lit42, rProp)

    val rFoo = prop(relName, foo)
    val rFooEqualsXProp = Equals(rFoo, xProp)(pos)
    val rFooEquals = equals(lit42, rFoo)

    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      addTypeToSemanticTable(lit6, CTInteger.invariant)
      addTypeToSemanticTable(rProp, CTInteger.invariant)
      addTypeToSemanticTable(rFoo, CTInteger.invariant)
      val predicates: Set[Expression] = Set(
        rPropEquals,
        rPropEqualsXProp,
        rFooEquals,
        rFooEqualsXProp,
      )

      qg = QueryGraph(
        selections = Selections(predicates.flatMap(_.asPredicates)),
        patternRelationships = Set(
          PatternRelationship(
            relName,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength),
          PatternRelationship(
            x,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength)
        ),
        argumentIds = Set(x)
      )

      relationshipIndexOn(relTypeName, prop, foo)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val restriction = LeafPlanRestrictions.OnlyIndexSeekPlansFor(relName, Set("x"))
      val resultPlans = indexSeekLeafPlanner(restriction)(cfg.qg, InterestingOrderConfig.empty, ctx).toSet


      // then
      // This contains all combinations except r.prop = 42 AND r.foo = 42, because it does not depend on x
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = 42, foo = ???)]-($endNodeName)",
            paramExpr = Some(xProp),
            argumentIds = Set(x),
            getValue = _ => CanGetValue)
          .build(),
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ???, foo = 42)]-($endNodeName)",
            paramExpr = Some(xProp),
            argumentIds = Set(x),
            getValue = _ => CanGetValue)
          .build(),
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ???, foo = ???)]-($endNodeName)",
            paramExpr = Seq(xProp, xProp),
            argumentIds = Set(x),
            getValue = _ => CanGetValue)
          .build(),
      ))
    }
  }

  test("plans index plans for unrestricted variables") {
    val x = "x"
    val m = "m"
    val xProp = prop(x, prop)
    val rPropEqualsXProp = Equals(rProp, xProp)(pos)
    val rPropEquals = equals(lit42, rProp)
    val rPropIn = in(rProp, listOf(lit6, lit42))
    val rPropLessThan = AndedPropertyInequalities(varFor(relName), rProp, NonEmptyList(lessThan(rProp, lit6)))
    val literalFoo = literalString(foo)
    val rPropStartsWith = startsWith(rProp, literalFoo)
    val rPropEndsWith = endsWith(rProp, literalFoo)
    val rPropContains = contains(rProp, literalFoo)
    val point = function("point", mapOfInt("x" -> 1, "y" -> 2))
    new given {
      addTypeToSemanticTable(rProp, CTInteger.invariant)
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      addTypeToSemanticTable(lit6, CTInteger.invariant)

      val predicates: Set[Expression] = Set(
        rPropIn,
        rPropLessThan,
        rPropEquals,
        rPropStartsWith,
        rPropEndsWith,
        rPropContains,
        rPropEqualsXProp,
      )

      qg = QueryGraph(
        selections = Selections(predicates.flatMap(_.asPredicates)),
        patternRelationships = Set(
          PatternRelationship(
            relName,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength),
          PatternRelationship(
            x,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength),
          PatternRelationship(
            m,
            (startNodeName, endNodeName),
            BOTH,
            Seq(relTypeName(relTypeName)),
            SimplePatternLength),
        ),
        argumentIds = Set(x)
      )

      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val restriction = LeafPlanRestrictions.OnlyIndexSeekPlansFor("m", Set(x))
      val resultPlans = indexSeekLeafPlanner(restriction)(cfg.qg, InterestingOrderConfig.empty, ctx).toSet

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop STARTS WITH '$foo')]-($endNodeName)",
            argumentIds = Set(x))
          .build(),
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = 6 OR 42)]-($endNodeName)",
            getValue = _ => CanGetValue,
            argumentIds = Set(x))
          .build(),
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = 42)]-($endNodeName)",
            getValue = _ => CanGetValue,
            argumentIds = Set(x))
          .build(),
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop < 6)]-($endNodeName)",
            argumentIds = Set(x))
          .build(),
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = ???)]-($endNodeName)",
            paramExpr = Some(xProp),
            argumentIds = Set(x),
            getValue = _ => CanGetValue)
          .build()
      ))
    }
  }

  test("plans index seek such that it solves index hint") {
    val hint: UsingIndexHint = UsingIndexHint(varFor(relName), labelOrRelTypeName(relTypeName), Seq(PropertyKeyName(prop)(pos))) _

    new given {
      qg = queryGraph(Seq(relTypeName), BOTH, rPropInLit42).addHints(Some(hint))
      relationshipIndexOn(relTypeName, prop).providesValues()
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = 42)]-($endNodeName)", getValue = _ => CanGetValue)
          .build()
      ))
      val plan = resultPlans.head
      ctx.planningAttributes.solveds.get(plan.id).asSinglePlannerQuery.queryGraph.hints should equal(Set(hint))
    }
  }

  test("plans index seek such that it solves index seek hint") {
    val hint: UsingIndexHint = UsingIndexHint(varFor(relName), labelOrRelTypeName(relTypeName), Seq(PropertyKeyName(prop)(pos)), SeekOnly) _

    new given {
      qg = queryGraph(Seq(relTypeName), BOTH, rPropInLit42).addHints(Some(hint))
      relationshipIndexOn(relTypeName, prop).providesValues()
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop = 42)]-($endNodeName)", getValue = _ => CanGetValue)
          .build()
      ))
      val plan = resultPlans.head
      ctx.planningAttributes.solveds.get(plan.id).asSinglePlannerQuery.queryGraph.hints should equal(Set(hint))
    }
  }

  test("should not plan using implicit IS NOT NULL if explicit IS NOT NULL exists") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rPropLessThanLit42, rFooIsNotNull)

      relationshipPropertyExistenceConstraintOn(relTypeName, Set(prop, foo))
      relationshipIndexOn(relTypeName, prop, foo)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($prop < 42, foo)]-($endNodeName)")
          .build()
      ))

      // We should not consider solutions that use an implicit r.foo IS NOT NULL, since we have one explicitly in the query
      // Otherwise we risk mixing up the solveds, since the plans would be exactly the same
      val implicitIsNotNullSolutions = ctx.planningAttributes.solveds.toSeq
                                       .filter(_.hasValue)
                                       .map(_.value.asSinglePlannerQuery.queryGraph.selections.flatPredicatesSet)
                                       .filter(_ == Set(rPropLessThanLit42))

      implicitIsNotNullSolutions shouldEqual Seq.empty
    }
  }

  test("should plan seek with ENDS WITH as existence after range") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rFooLessThanLit42, rPropEndsWithLitText)
      relationshipIndexOn(relTypeName, foo, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($foo < 42, prop)]-($endNodeName)")
          .build()
      ))
      val plan = resultPlans.head
      solvedPredicates(plan, ctx) should equal(Set(
        rFooLessThanLit42,
        PartialPredicate(rPropIsNotNull, rPropEndsWithLitText),
      ))
    }
  }

  test("should plan seek with CONTAINS as existence after range") {
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rFooLessThanLit42, rPropContainsLitText)
      relationshipIndexOn(relTypeName, foo, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($foo < 42, prop)]-($endNodeName)")
          .build()
      ))
      val plan = resultPlans.head
      solvedPredicates(plan, ctx) should equal(Set(
        rFooLessThanLit42,
        PartialPredicate(rPropIsNotNull, rPropContainsLitText),
      ))
    }
  }

  test("should plan seek with Regex as existence after range") {
    val reg = regex(rProp, literalString("Text"))
    new given {
      addTypeToSemanticTable(lit42, CTInteger.invariant)
      qg = queryGraph(Seq(relTypeName), BOTH, rFooLessThanLit42, reg)
      relationshipIndexOn(relTypeName, foo, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans should equal(Set(
        new LogicalPlanBuilder(wholePlan = false)
          .relationshipIndexOperator(s"($startNodeName)-[$relName:$relTypeName($foo < 42, prop)]-($endNodeName)")
          .build()
      ))

      val plan = resultPlans.head
      solvedPredicates(plan, ctx) should equal(Set(
        rFooLessThanLit42,
        PartialPredicate(rPropIsNotNull, reg),
      ))
    }
  }

  test("should not plan relationship index seek for self-loop") {
    new given {
      qg = QueryGraph(
        selections = Selections(Set(Predicate(Set(relName), rPropIsNotNull))),
        patternRelationships = Set(PatternRelationship(
          relName,
          (startNodeName, startNodeName),
          BOTH,
          Seq(relTypeName(relTypeName)),
          SimplePatternLength)))
      relationshipIndexOn(relTypeName, prop)
    }.withLogicalPlanningContext { (cfg, ctx) =>
      // when
      val resultPlans = indexSeekLeafPlanner(LeafPlanRestrictions.NoRestrictions)(cfg.qg, InterestingOrderConfig.empty, ctx)

      // then
      resultPlans shouldBe empty
    }
  }
}
