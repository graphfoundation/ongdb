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
package org.neo4j.cypher.internal.compiler.planner.logical.steps

import org.neo4j.cypher.internal.ast.Union.UnionMapping
import org.neo4j.cypher.internal.ast.UsingIndexHint
import org.neo4j.cypher.internal.compiler.planner.LogicalPlanningTestSupport2
import org.neo4j.cypher.internal.compiler.planner.logical.LogicalPlanningContext
import org.neo4j.cypher.internal.compiler.planner.logical.PlanMatchHelp
import org.neo4j.cypher.internal.expressions.EveryPath
import org.neo4j.cypher.internal.expressions.ExistsSubClause
import org.neo4j.cypher.internal.expressions.FunctionInvocation
import org.neo4j.cypher.internal.expressions.FunctionName
import org.neo4j.cypher.internal.expressions.Pattern
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.functions.Collect
import org.neo4j.cypher.internal.ir.CreateNode
import org.neo4j.cypher.internal.ir.CreatePattern
import org.neo4j.cypher.internal.ir.DeleteExpression
import org.neo4j.cypher.internal.ir.ForeachPattern
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.RemoveLabelPattern
import org.neo4j.cypher.internal.ir.SetLabelPattern
import org.neo4j.cypher.internal.ir.SetNodePropertiesFromMapPattern
import org.neo4j.cypher.internal.ir.SetNodePropertyPattern
import org.neo4j.cypher.internal.ir.SetPropertiesFromMapPattern
import org.neo4j.cypher.internal.ir.SetPropertyPattern
import org.neo4j.cypher.internal.ir.SetRelationshipPropertiesFromMapPattern
import org.neo4j.cypher.internal.ir.SetRelationshipPropertyPattern
import org.neo4j.cypher.internal.ir.SinglePlannerQuery
import org.neo4j.cypher.internal.ir.ordering.InterestingOrder
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.ir.ordering.RequiredOrderCandidate
import org.neo4j.cypher.internal.logical.plans.Ascending
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ProcedureReadOnlyAccess
import org.neo4j.cypher.internal.logical.plans.ProcedureReadWriteAccess
import org.neo4j.cypher.internal.logical.plans.ProcedureSignature
import org.neo4j.cypher.internal.logical.plans.QualifiedName
import org.neo4j.cypher.internal.logical.plans.ResolvedCall
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite

class LogicalPlanProducerTest extends CypherFunSuite with LogicalPlanningTestSupport2 with PlanMatchHelp{

  test("should rename provided order of property columns in projection if property projected") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("x","foo")))
      // projection
      val projections = Map("xfoo" -> prop("x", "foo"))

      //when
      val result = lpp.planRegularProjection(plan, projections, Some(projections), context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("xfoo")).fromLeft)
    }
  }

  test("should rename provided order of property columns in projection if node projected") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("x","foo")))
      // projection
      val projections = Map("y" -> varFor("x"))

      //when
      val result = lpp.planRegularProjection(plan, projections, Some(projections), context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(prop("y","foo")).fromLeft)
    }
  }

  test("should rename provided order of variable columns in projection if variable projected") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(varFor("x")))
      // projection
      val projections = Map("y" -> varFor("x"))

      //when
      val result = lpp.planRegularProjection(plan, projections, Some(projections), context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("y")).fromLeft)
    }
  }

  test("should rename provided order of variable columns in projection if cached node property is projected") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("x","foo")))
      // projection
      val projections = Map("carrot" -> cachedNodeProp("x", "foo"))

      //when
      val result = lpp.planRegularProjection(plan, projections, Some(projections), context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("carrot")).fromLeft)
    }
  }

  test("should rename provided order of property columns in distinct if property projected") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("x","foo")))
      // projection
      val projections = Map("xfoo" -> prop("x", "foo"))

      //when
      val result = lpp.planDistinct(plan, projections, projections, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("xfoo")).fromLeft)
    }
  }

  test("should rename provided order of function if function projected") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "id(n)")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(id(varFor("n"))))
      // projection
      val projections = Map("id(n)" -> id(varFor("n")))

      //when
      val result = lpp.planDistinct(plan, projections, projections, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("id(n)")).fromLeft)
    }
  }

  test("should trim provided order (1 column) of property column if a sort column is also not a grouping column") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo", "y")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("x","foo")))

      val aggregations = Map("xfoo" -> prop("x", "foo"))
      val groupings = Map("y" -> varFor("y"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.empty)
    }
  }

  test("should trim provided order (2 columns) in aggregation of property column if a sort column is also not a grouping column") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo", "y")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(varFor("y")).asc(prop("x","foo")))

      val aggregations = Map("xfoo" -> prop("x", "foo"))
      val groupings = Map("y" -> varFor("y"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("y")).fromLeft)
    }
  }

  test("should trim provided order (2 columns) in aggregation of property column and rename") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo", "y")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(varFor("y")).asc(prop("x","foo")))

      val aggregations = Map("xfoo" -> prop("x", "foo"))
      val groupings = Map("z" -> varFor("y"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("z")).fromLeft)
    }
  }

  test("should trim provided order (2 columns) in aggregation and only keep exact grouping column matches") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo", "y.bar")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("y","bar")).asc(prop("x","foo")))

      val aggregations = Map("xfoo" -> prop("x", "foo"))
      val groupings = Map("z" -> varFor("y"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.empty)
    }
  }

  test("should trim provided order (2 columns) in aggregation of property column and rename property") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo", "y.bar")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("y","bar")).asc(prop("x","foo")))

      val aggregations = Map("xfoo" -> prop("x", "foo"))
      val groupings = Map("z" -> prop("y", "bar"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("z")).fromLeft)
    }
  }

  test("should trim provided order (2 columns) in aggregation of property column and rename cached node property") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo", "y.bar")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(prop("y","bar")).asc(prop("x","foo")))

      val aggregations = Map("xfoo" -> prop("x", "foo"))
      val groupings = Map("z" -> cachedNodeProp("y", "bar"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("z")).fromLeft)
    }
  }

  test("should trim provided order in left outer hash join after variable access") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val lhs = fakeLogicalPlanFor(context.planningAttributes, "x", "z.bar")
      context.planningAttributes.providedOrders.set(lhs.id, ProvidedOrder.asc(prop("z","bar")).desc(varFor("x")))
      val rhs = fakeLogicalPlanFor(context.planningAttributes, "x", "y.bar", "x.foo")
      context.planningAttributes.providedOrders.set(rhs.id, ProvidedOrder.asc(prop("y","bar")).asc(varFor("x")).asc(prop("x","foo")))

      val joinColumns = Set("x")

      //when
      val result = lpp.planLeftOuterHashJoin(joinColumns, lhs, rhs, Set.empty, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(prop("y","bar")).fromRight)
    }
  }

  test("should trim provided order in left outer hash join after property access") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val lhs = fakeLogicalPlanFor(context.planningAttributes, "x", "z.bar")
      context.planningAttributes.providedOrders.set(lhs.id, ProvidedOrder.asc(prop("z","bar")).desc(varFor("x")))
      val rhs = fakeLogicalPlanFor(context.planningAttributes, "x", "y.bar", "x.foo")
      context.planningAttributes.providedOrders.set(rhs.id, ProvidedOrder.asc(prop("y","bar")).asc(prop("x","foo")).asc(prop("y","foo")))

      val joinColumns = Set("x")

      //when
      val result = lpp.planLeftOuterHashJoin(joinColumns, lhs, rhs, Set.empty, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(prop("y","bar")).fromRight)
    }
  }

  test("should trim provided order in left outer hash join after complex property access") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val lhs = fakeLogicalPlanFor(context.planningAttributes, "x", "z.bar")
      context.planningAttributes.providedOrders.set(lhs.id, ProvidedOrder.asc(prop("z","bar")).desc(varFor("x")))
      val rhs = fakeLogicalPlanFor(context.planningAttributes, "x", "y.bar", "x.foo")
      context.planningAttributes.providedOrders.set(rhs.id, ProvidedOrder.asc(prop("y","bar")).asc(add(literalInt(10), prop("x","foo"))).asc(prop("y","foo")))

      val joinColumns = Set("x")

      //when
      val result = lpp.planLeftOuterHashJoin(joinColumns, lhs, rhs, Set.empty, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(prop("y","bar")).fromRight)
    }
  }

  test("should trim provided order (2 columns) in aggregation of function column if a sort column is also not a grouping column") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "size(x)", "y")
      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(varFor("y")).asc(function("size", varFor("x"))))

      val aggregations = Map("size(x)" -> function("size", varFor("x")))
      val groupings = Map("y" -> varFor("y"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("y")).fromLeft)
    }
  }

  test("should trim provided order (2 columns) in aggregation of property of property column if a sort column is also not a grouping column") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
      // plan with provided order
      val plan = fakeLogicalPlanFor(context.planningAttributes, "x.foo.bar", "y")

      val propOfProp = prop(prop("x","foo"), "bar")

      context.planningAttributes.providedOrders.set(plan.id, ProvidedOrder.asc(varFor("y")).asc(propOfProp))

      val aggregations = Map("xfoobar" -> propOfProp)
      val groupings = Map("y" -> varFor("y"))

      //when
      val result = lpp.planAggregation(plan, groupings, aggregations, groupings, aggregations, None, context)

      // then
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.asc(varFor("y")).fromLeft)
    }
  }

  test("Create should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planCreate(ctx.lhs, CreatePattern(Seq(CreateNode("n", Seq(), None)), Seq()), ctx.context))
  }

  test("MERGE ... ON MATCH should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planMerge(ctx.lhs, Seq(CreateNode("n", Seq(), None)), Seq.empty,
        Seq(SetNodePropertyPattern("x", PropertyKeyName("p")(pos),  literalInt(1))), Seq.empty, Set.empty, ctx.context))
  }

  test("MERGE without ON MATCH should not eliminate provided order") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planMerge(ctx.lhs, Seq(CreateNode("n", Seq(), None)), Seq.empty, Seq.empty, Seq.empty,  Set.empty, ctx.context))
  }

  test("DeleteNode should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planDeleteNode(ctx.lhs, DeleteExpression(varFor("n"), false), ctx.context))
  }

  test("DeleteRelationship should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planDeleteRelationship(ctx.lhs, DeleteExpression(varFor("r"), false), ctx.context))
  }

  test("DeletePath should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planDeletePath(ctx.lhs, DeleteExpression(varFor("p"), false), ctx.context))
  }

  test("DeleteExpression should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planDeleteExpression(ctx.lhs, DeleteExpression(varFor("x"), false), ctx.context))
  }

  test("Setlabel should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetLabel(ctx.lhs, SetLabelPattern("n", Seq(labelName("N"))), ctx.context))
  }

  test("RemoveLabel should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planRemoveLabel(ctx.lhs, RemoveLabelPattern("n", Seq(labelName("N"))), ctx.context))
  }

  test("SetProperty should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetProperty(ctx.lhs, SetPropertyPattern(varFor("x"), PropertyKeyName("p")(pos), literalInt(1)), ctx.context))
  }

  test("SetPropertiesFromMap should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetPropertiesFromMap(ctx.lhs, SetPropertiesFromMapPattern(varFor("x"), mapOfInt("p" -> 1), false), ctx.context))
  }

  test("SetNodeProperty should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetNodeProperty(ctx.lhs, SetNodePropertyPattern("x", PropertyKeyName("p")(pos), literalInt(1)), ctx.context))
  }

  test("SetNodePropertiesFromMap should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetNodePropertiesFromMap(ctx.lhs, SetNodePropertiesFromMapPattern("x", mapOfInt("p" -> 1), false), ctx.context))
  }

  test("SetRelationshipProperty should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetRelationshipProperty(ctx.lhs, SetRelationshipPropertyPattern("x", PropertyKeyName("p")(pos), literalInt(1)), ctx.context))
  }

  test("SetRelationshipPropertiesFromMap should eliminate provided order") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSetRelationshipPropertiesFromMap(ctx.lhs, SetRelationshipPropertiesFromMapPattern("r", mapOfInt("p" -> 1), false), ctx.context))
  }

  test("ProcedureCall RW should eliminate provided order") {
    val writer = ProcedureSignature(
      QualifiedName(Seq(),"writer"),
      IndexedSeq(),
      None,
      None,
      ProcedureReadWriteAccess,
      id = 0)
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planProcedureCall(ctx.lhs, ResolvedCall(writer, Seq(), IndexedSeq())(pos), ctx.context))
  }

  test("ProcedureCall RO should retain provided order") {
    val reader = ProcedureSignature(
      QualifiedName(Seq(), "reader"),
      IndexedSeq(),
      None,
      None,
      ProcedureReadOnlyAccess,
      id = 1)

    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planProcedureCall(ctx.lhs, ResolvedCall(reader, Seq(), IndexedSeq())(pos), ctx.context))
  }

  test("CartesianProduct should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planCartesianProduct(ctx.lhs, ctx.rhsWithUpdate, ctx.context))
  }

  test("CartesianProduct should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planCartesianProduct(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context))
  }

  test("Apply should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planApply(ctx.lhs, ctx.rhsWithUpdate, ctx.context)
    )
  }

  test("Apply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planApply(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context)
    )
  }

  test("uncorrelated Subquery should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithUpdate, ctx.context, correlated = false, yielding = true, inTransactionsParameters = None)
    )
  }

  test("uncorrelated Subquery should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context, correlated = false, yielding = true, inTransactionsParameters = None)
    )
  }

  test("correlated Subquery should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithUpdate, ctx.context, correlated = true, yielding = true, inTransactionsParameters = None)
    )
  }

  test("correlated Subquery should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context, correlated = true, yielding = true, inTransactionsParameters = None)
    )
  }

  test("uncorrelated unit Subquery should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithUpdate, ctx.context, correlated = false, yielding = false, inTransactionsParameters = None)
    )
  }

  test("uncorrelated unit Subquery should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context, correlated = false, yielding = false, inTransactionsParameters = None)
    )
  }

  test("correlated unit Subquery should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithUpdate, ctx.context, correlated = true, yielding = false, inTransactionsParameters = None)
    )
  }

  test("correlated unit Subquery should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSubquery(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context, correlated = true, yielding = false, inTransactionsParameters = None)
    )
  }

  test("ForPatternExpressionSolver.planApply fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.ForPatternExpressionSolver.planApply(ctx.lhs, ctx.rhsWithUpdate, ctx.context)
    )
  }

  test("ForPatternExpressionSolver.planApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.ForPatternExpressionSolver.planApply(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context)
    )
  }

  test("ForPatternExpressionSolver.planRollup should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.ForPatternExpressionSolver.planRollup(ctx.lhs, ctx.rhsWithUpdate, "x", "y", ctx.context)
    )
  }

  test("ForPatternExpressionSolver.planRollup should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.ForPatternExpressionSolver.planRollup(ctx.lhs, ctx.rhsWithoutUpdate, "x", "y", ctx.context)
    )
  }

  test("TriadicSelection should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planTriadicSelection(positivePredicate = true, ctx.lhs, "a", "b", "c", ctx.rhsWithUpdate, varFor("x"), ctx.context)
    )
  }

  test("TriadicSelection should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planTriadicSelection(positivePredicate = true, ctx.lhs, "a", "b", "c", ctx.rhsWithoutUpdate, varFor("x"), ctx.context)
    )
  }

  test("ConditionalApply should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planConditionalApply(ctx.lhs, ctx.rhsWithUpdate, Seq("a"), ctx.context)
    )
  }

  test("ConditionalApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planConditionalApply(ctx.lhs, ctx.rhsWithoutUpdate, Seq("a"), ctx.context)
    )
  }

  test("AntiConditionalApply should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planAntiConditionalApply(ctx.lhs, ctx.rhsWithUpdate, Seq("a"), ctx.context)
    )
  }

  test("AntiConditionalApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planAntiConditionalApply(ctx.lhs, ctx.rhsWithoutUpdate, Seq("a"), ctx.context)
    )
  }

  test("TailApply should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planTailApply(ctx.lhs, ctx.rhsWithUpdate, ctx.context)
    )
  }

  test("TailApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planTailApply(ctx.lhs, ctx.rhsWithoutUpdate, ctx.context)
    )
  }

  test("InputApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planInputApply(ctx.lhs, ctx.rhsWithUpdate, Seq("x"), ctx.context)
    )
  }

  test("InputApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planInputApply(ctx.lhs, ctx.rhsWithoutUpdate, Seq("x"), ctx.context)
    )
  }

  test("ForeachApply should eliminate provided order when rhs contains update") {
    shouldEliminateProvidedOrder(ctx =>
      ctx.producer.planForeachApply(ctx.lhs, ctx.rhsWithUpdate, ForeachPattern("x", varFor("x"), SinglePlannerQuery.empty), ctx.context, varFor("x"))
    )
  }

  test("ForeachApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planForeachApply(ctx.lhs, ctx.rhsWithoutUpdate, ForeachPattern("x", varFor("x"), SinglePlannerQuery.empty), ctx.context, varFor("x"))
    )
  }

  test("SemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planSemiApply(ctx.lhs, ctx.rhsWithUpdate, varFor("x"), ctx.context)
    )
  }

  test("SemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, varFor("x"), ctx.context)
    )
  }

  test("AntiSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planAntiSemiApply(ctx.lhs, ctx.rhsWithUpdate, varFor("x"), ctx.context)
    )
  }

  test("AntiSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planAntiSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, varFor("x"), ctx.context)
    )
  }

  test("LetSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planLetSemiApply(ctx.lhs, ctx.rhsWithUpdate, "x", ctx.context)
    )
  }

  test("LetSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planLetSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, "x", ctx.context)
    )
  }

  test("LetAntiSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planLetAntiSemiApply(ctx.lhs, ctx.rhsWithUpdate, "x", ctx.context)
    )
  }

  test("LetAntiSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planLetAntiSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, "x", ctx.context)
    )
  }

  test("SelectOrSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planSelectOrSemiApply(ctx.lhs, ctx.rhsWithUpdate, varFor("x"), ctx.context)
    )
  }

  test("SelectOrSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSelectOrSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, varFor("x"), ctx.context)
    )
  }

  test("SelectOrAntiSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planSelectOrAntiSemiApply(ctx.lhs, ctx.rhsWithUpdate, varFor("x"), ctx.context)
    )
  }

  test("SelectOrAntiSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSelectOrAntiSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, varFor("x"), ctx.context)
    )
  }

  test("LetSelectOrSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planLetSelectOrSemiApply(ctx.lhs, ctx.rhsWithUpdate, "x", varFor("x"), ctx.context)
    )
  }

  test("LetSelectOrSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planLetSelectOrSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, "x", varFor("x"), ctx.context)
    )
  }

  test("LetSelectOrAntiSemiApply should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planLetSelectOrAntiSemiApply(ctx.lhs, ctx.rhsWithUpdate, "x", varFor("x"), ctx.context)
    )
  }

  test("LetSelectOrAntiSemiApply should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planLetSelectOrAntiSemiApply(ctx.lhs, ctx.rhsWithoutUpdate, "x", varFor("x"), ctx.context)
    )
  }

  test("SemiApplyInHorizon should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planSemiApplyInHorizon(ctx.lhs, ctx.rhsWithUpdate, ExistsSubClause(Pattern(Seq(EveryPath(nodePat("x"))))(pos), None)(pos, Set.empty), ctx.context)
    )
  }

  test("SemiApplyInHorizon should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planSemiApplyInHorizon(ctx.lhs, ctx.rhsWithoutUpdate, ExistsSubClause(Pattern(Seq(EveryPath(nodePat("x"))))(pos), None)(pos, Set.empty), ctx.context)
    )
  }

  test("AntiSemiApplyInHorizon should fail when rhs contains update") {
    shouldFailAssertion(ctx =>
      ctx.producer.planAntiSemiApplyInHorizon(ctx.lhs, ctx.rhsWithUpdate, ExistsSubClause(Pattern(Seq(EveryPath(nodePat("x"))))(pos), None)(pos, Set.empty), ctx.context)
    )
  }

  test("AntiSemiApplyInHorizon should retain provided order when rhs contains no update") {
    shouldRetainProvidedOrder(ctx =>
      ctx.producer.planAntiSemiApplyInHorizon(ctx.lhs, ctx.rhsWithoutUpdate, ExistsSubClause(Pattern(Seq(EveryPath(nodePat("x"))))(pos), None)(pos, Set.empty), ctx.context)
    )
  }

  case class PlanCreationContext(
    producer: LogicalPlanProducer,
    context: LogicalPlanningContext,
    lhs: LogicalPlan,
    rhsWithUpdate: LogicalPlan,
    rhsWithoutUpdate: LogicalPlan,
  )

  private def shouldEliminateProvidedOrder(createPlan: PlanCreationContext => LogicalPlan) = {
    new given().withLogicalPlanningContext { (_, context) =>
      val result = getPlan(context, createPlan)
      context.planningAttributes.providedOrders.get(result.id) should be(ProvidedOrder.empty)
    }
  }

  private def shouldRetainProvidedOrder(createPlan: PlanCreationContext => LogicalPlan) = {
    new given().withLogicalPlanningContext { (_, context) =>
      val result = getPlan(context, createPlan)
      val lhsOrder = context.planningAttributes.providedOrders.get(result.lhs.get.id)
      context.planningAttributes.providedOrders.get(result.id) should be(lhsOrder.fromLeft)
    }
  }

  private def shouldFailAssertion(createPlan: PlanCreationContext => LogicalPlan) = {
    new given().withLogicalPlanningContext { (_, context) =>
      intercept[AssertionError](getPlan(context, createPlan))
    }
  }

  private def getPlan(context: LogicalPlanningContext, createPlan: PlanCreationContext => LogicalPlan) = {
    val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)
    val lhs = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
    val providedOrder = ProvidedOrder.asc(varFor("y")).asc(varFor("x"))
    context.planningAttributes.providedOrders.set(lhs.id, providedOrder)

    val rhs = fakeLogicalPlanFor(context.planningAttributes, "a")
    val rhsWithUpdate = lpp.planSetLabel(rhs, SetLabelPattern("n", Seq(labelName("N"))), context)
    createPlan(PlanCreationContext(lpp, context, lhs, rhsWithUpdate, rhs))
  }

  test("should mark leveraged order in plans and their origin") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)

      val initialOrder = ProvidedOrder.asc(varFor("x"))
      // plan with provided order
      def plan() = {
        val p = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
        context.planningAttributes.providedOrders.set(p.id, initialOrder)
        p
      }
      def plan2() = {
        val p = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
        context.planningAttributes.providedOrders.set(p.id, initialOrder)
        p
      }

      val vx = varFor("x")
      val x_vx = Map("x" -> vx)
      val foo_vx = Map("foo" -> vx)
      val foo_collect = Map("foo" -> FunctionInvocation(vx, FunctionName(Collect.name)(pos)))
      val interesting_vx = InterestingOrder.required(RequiredOrderCandidate.asc(vx))
      val one = literalInt(1)
      val unionMappings = List(UnionMapping(varFor("x"),varFor("x"),varFor("x")),
                               UnionMapping(varFor("y"),varFor("y"),varFor("y")))

      //when
      val resultsAndNames = Seq(
        ("PartialSort", lpp.planPartialSort(plan(), Seq(Ascending("x")), Seq(Ascending("y")), initialOrder.asc(varFor("y")).columns, InterestingOrder.empty, context)),
        ("OrderedAggregation with grouping", lpp.planOrderedAggregation(plan(), x_vx, foo_vx, Seq(vx), x_vx, foo_vx, context)),
        ("OrderedDistinct", lpp.planOrderedDistinct(plan(), foo_vx, Seq(vx), foo_vx, context)),
        ("OrderedUnion", lpp.planOrderedUnion(plan(), plan2(), unionMappings, Seq(Ascending("x")), context)),
        ("OrderedDistinct for Union", lpp.planOrderedDistinctForUnion(lpp.planOrderedUnion(plan(), plan2(), unionMappings, Seq(Ascending("x")), context), Seq(vx), context)),
        ("Limit for aggregation", lpp.planLimitForAggregation(plan(), x_vx, foo_vx, InterestingOrder.empty, context).lhs.get), // Get the Limit under the Optional
        ("Limit", lpp.planLimit(plan(), one, one, interesting_vx, context)),
        ("Skip", lpp.planSkip(plan(), one, interesting_vx, context)),
        ("Collect with previous required order", lpp.planAggregation(plan(), Map.empty, foo_collect, Map.empty, foo_collect, Some(interesting_vx), context)),
        ("ProduceResult", lpp.planProduceResult(plan(), Seq("x"), Some(interesting_vx))),
      )

      // then
      resultsAndNames.foreach { case (name, result) =>
        withClue(name) {
          context.planningAttributes.leveragedOrders.get(result.id) should be(true)
          result.lhs.foreach { lhs => context.planningAttributes.leveragedOrders.get(lhs.id) should be(true) }
          result.rhs.foreach { rhs => context.planningAttributes.leveragedOrders.get(rhs.id) should be(true) }
        }
      }
    }
  }

  test("should traverse tree towards order origin when marking leveraged order") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)

      val initialOrder = ProvidedOrder.asc(varFor("x"))

      val leaf1 = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
      val leaf2 = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
      val p1 = lpp.planSort(leaf1, Seq(Ascending("x")), initialOrder.columns, InterestingOrder.empty, context)
      val p2 = lpp.planEager(p1, context, Seq.empty)
      val p3 = lpp.planRightOuterHashJoin(Set("x"), leaf2, p2, Set.empty, context)

      // when
      val result = lpp.planProduceResult(p3, Seq("x"), Some(InterestingOrder.required(RequiredOrderCandidate.asc(varFor("x")))))

      // then
      context.planningAttributes.leveragedOrders.get(result.id) should be(true)
      context.planningAttributes.leveragedOrders.get(p3.id) should be(true)
      context.planningAttributes.leveragedOrders.get(p2.id) should be(true)
      context.planningAttributes.leveragedOrders.get(p1.id) should be(true)
      context.planningAttributes.leveragedOrders.get(leaf1.id) should be(false)
      context.planningAttributes.leveragedOrders.get(leaf2.id) should be(false)
    }
  }

  test("should traverse tree towards multiple order origins when marking leveraged order") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)

      val initialOrder = ProvidedOrder.asc(varFor("x"))

      val leaf1 = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
      val leaf2 = fakeLogicalPlanFor(context.planningAttributes, "x", "y")
      val sort1 = lpp.planSort(leaf1, Seq(Ascending("x")), initialOrder.columns, InterestingOrder.empty, context)
      val sort2 = lpp.planSort(leaf2, Seq(Ascending("x")), initialOrder.columns, InterestingOrder.empty, context)
      val u = lpp.planOrderedUnion(sort1, sort2, List(), Seq(Ascending("x")), context)

      // when
      val result = lpp.planProduceResult(u, Seq("x"), Some(InterestingOrder.required(RequiredOrderCandidate.asc(varFor("x")))))

      // then
      context.planningAttributes.leveragedOrders.get(result.id) should be(true)
      context.planningAttributes.leveragedOrders.get(u.id) should be(true)
      context.planningAttributes.leveragedOrders.get(sort1.id) should be(true)
      context.planningAttributes.leveragedOrders.get(sort2.id) should be(true)
      context.planningAttributes.leveragedOrders.get(leaf1.id) should be(false)
      context.planningAttributes.leveragedOrders.get(leaf2.id) should be(false)
    }
  }

  test("should retain solved hints when planning union for leaf plans") {
    new given().withLogicalPlanningContext { (_, context) =>
      val lpp = LogicalPlanProducer(context.cardinality, context.planningAttributes, idGen)

      val lhs = fakeLogicalPlanFor("x", "y")
      val rhs = fakeLogicalPlanFor("x", "y")
      val hint1 = UsingIndexHint(varFor("foo"), labelOrRelTypeName("bar"), Seq())(InputPosition.NONE)
      val hint2 = UsingIndexHint(varFor("blah"), labelOrRelTypeName("meh"), Seq())(InputPosition.NONE)

      val solveds = context.planningAttributes.solveds
      val spqLhs = SinglePlannerQuery.empty.amendQueryGraph(qg => qg.copy(hints = qg.hints + hint1 ))
      val spqRhs = SinglePlannerQuery.empty.amendQueryGraph(qg => qg.copy(hints = qg.hints + hint2 ))

      solveds.set(lhs.id, spqLhs)
      context.planningAttributes.providedOrders.set(lhs.id, ProvidedOrder.empty)

      solveds.set(rhs.id, spqRhs)
      context.planningAttributes.providedOrders.set(rhs.id, ProvidedOrder.empty)

      val p1 = lpp.planUnion(lhs, rhs, List(), context)
      val p2 = lpp.planDistinctForUnion(p1, context)
      val p3 = lpp.updateSolvedForOr(p2, QueryGraph(), context)

      solveds.get(p3.id).allHints shouldBe(Set(hint1, hint2))
      context.planningAttributes.providedOrders.get(p3.id) shouldBe(ProvidedOrder.empty)
    }
  }
}
