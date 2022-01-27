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
package org.neo4j.cypher.internal.plandescription

import org.neo4j.common.EntityType
import org.neo4j.cypher.QueryPlanTestSupport.StubExecutionPlan
import org.neo4j.cypher.internal.ast.AllConstraints
import org.neo4j.cypher.internal.ast.AllDatabasesScope
import org.neo4j.cypher.internal.ast.AllFunctions
import org.neo4j.cypher.internal.ast.AllGraphsScope
import org.neo4j.cypher.internal.ast.AllIndexes
import org.neo4j.cypher.internal.ast.AllPropertyResource
import org.neo4j.cypher.internal.ast.BtreeIndexes
import org.neo4j.cypher.internal.ast.BuiltInFunctions
import org.neo4j.cypher.internal.ast.CreateDatabaseAction
import org.neo4j.cypher.internal.ast.CreateNodeLabelAction
import org.neo4j.cypher.internal.ast.CurrentUser
import org.neo4j.cypher.internal.ast.DefaultGraphScope
import org.neo4j.cypher.internal.ast.DropRoleAction
import org.neo4j.cypher.internal.ast.DumpData
import org.neo4j.cypher.internal.ast.ElementsAllQualifier
import org.neo4j.cypher.internal.ast.ExecuteAdminProcedureAction
import org.neo4j.cypher.internal.ast.ExecuteBoostedProcedureAction
import org.neo4j.cypher.internal.ast.ExecuteProcedureAction
import org.neo4j.cypher.internal.ast.ExistsConstraints
import org.neo4j.cypher.internal.ast.FulltextIndexes
import org.neo4j.cypher.internal.ast.IndefiniteWait
import org.neo4j.cypher.internal.ast.LabelQualifier
import org.neo4j.cypher.internal.ast.LookupIndexes
import org.neo4j.cypher.internal.ast.NamedDatabaseScope
import org.neo4j.cypher.internal.ast.NewSyntax
import org.neo4j.cypher.internal.ast.NoOptions
import org.neo4j.cypher.internal.ast.NoResource
import org.neo4j.cypher.internal.ast.NodeExistsConstraints
import org.neo4j.cypher.internal.ast.NodeKeyConstraints
import org.neo4j.cypher.internal.ast.OptionsMap
import org.neo4j.cypher.internal.ast.OptionsParam
import org.neo4j.cypher.internal.ast.PointIndexes
import org.neo4j.cypher.internal.ast.ProcedureAllQualifier
import org.neo4j.cypher.internal.ast.ProcedureQualifier
import org.neo4j.cypher.internal.ast.ProcedureResultItem
import org.neo4j.cypher.internal.ast.Query
import org.neo4j.cypher.internal.ast.RangeIndexes
import org.neo4j.cypher.internal.ast.ReadAction
import org.neo4j.cypher.internal.ast.ReadOnlyAccess
import org.neo4j.cypher.internal.ast.ReadWriteAccess
import org.neo4j.cypher.internal.ast.RelExistsConstraints
import org.neo4j.cypher.internal.ast.ShowProceduresClause
import org.neo4j.cypher.internal.ast.ShowUserAction
import org.neo4j.cypher.internal.ast.ShowUsersPrivileges
import org.neo4j.cypher.internal.ast.SingleQuery
import org.neo4j.cypher.internal.ast.StartDatabaseAction
import org.neo4j.cypher.internal.ast.StopDatabaseAction
import org.neo4j.cypher.internal.ast.TextIndexes
import org.neo4j.cypher.internal.ast.TraverseAction
import org.neo4j.cypher.internal.ast.UniqueConstraints
import org.neo4j.cypher.internal.ast.User
import org.neo4j.cypher.internal.ast.UserAllQualifier
import org.neo4j.cypher.internal.ast.UserDefinedFunctions
import org.neo4j.cypher.internal.ast.UserQualifier
import org.neo4j.cypher.internal.ast.WriteAction
import org.neo4j.cypher.internal.expressions.And
import org.neo4j.cypher.internal.expressions.AndedPropertyInequalities
import org.neo4j.cypher.internal.expressions.CachedProperty
import org.neo4j.cypher.internal.expressions.Equals
import org.neo4j.cypher.internal.expressions.ExplicitParameter
import org.neo4j.cypher.internal.expressions.FunctionInvocation
import org.neo4j.cypher.internal.expressions.FunctionName
import org.neo4j.cypher.internal.expressions.GreaterThanOrEqual
import org.neo4j.cypher.internal.expressions.In
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.LabelToken
import org.neo4j.cypher.internal.expressions.LessThan
import org.neo4j.cypher.internal.expressions.ListLiteral
import org.neo4j.cypher.internal.expressions.MapExpression
import org.neo4j.cypher.internal.expressions.NODE_TYPE
import org.neo4j.cypher.internal.expressions.Namespace
import org.neo4j.cypher.internal.expressions.NilPathStep
import org.neo4j.cypher.internal.expressions.NodePathStep
import org.neo4j.cypher.internal.expressions.Parameter
import org.neo4j.cypher.internal.expressions.PathExpression
import org.neo4j.cypher.internal.expressions.ProcedureName
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.PropertyKeyToken
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.expressions.SemanticDirection
import org.neo4j.cypher.internal.expressions.SemanticDirection.BOTH
import org.neo4j.cypher.internal.expressions.SemanticDirection.INCOMING
import org.neo4j.cypher.internal.expressions.SemanticDirection.OUTGOING
import org.neo4j.cypher.internal.expressions.SignedDecimalIntegerLiteral
import org.neo4j.cypher.internal.expressions.SingleRelationshipPathStep
import org.neo4j.cypher.internal.expressions.StringLiteral
import org.neo4j.cypher.internal.expressions.Variable
import org.neo4j.cypher.internal.expressions.functions.Collect
import org.neo4j.cypher.internal.expressions.functions.Count
import org.neo4j.cypher.internal.expressions.functions.Point
import org.neo4j.cypher.internal.ir
import org.neo4j.cypher.internal.ir.CreateNode
import org.neo4j.cypher.internal.ir.CreateRelationship
import org.neo4j.cypher.internal.ir.EagernessReason
import org.neo4j.cypher.internal.ir.NoHeaders
import org.neo4j.cypher.internal.ir.PatternRelationship
import org.neo4j.cypher.internal.ir.RemoveLabelPattern
import org.neo4j.cypher.internal.ir.SetLabelPattern
import org.neo4j.cypher.internal.ir.SetNodePropertiesPattern
import org.neo4j.cypher.internal.ir.SetNodePropertyPattern
import org.neo4j.cypher.internal.ir.ShortestPathPattern
import org.neo4j.cypher.internal.ir.VarPatternLength
import org.neo4j.cypher.internal.ir.ordering.ProvidedOrder
import org.neo4j.cypher.internal.logical.plans.Aggregation
import org.neo4j.cypher.internal.logical.plans.AllNodesScan
import org.neo4j.cypher.internal.logical.plans.AllowedNonAdministrationCommands
import org.neo4j.cypher.internal.logical.plans.AlterDatabase
import org.neo4j.cypher.internal.logical.plans.AlterUser
import org.neo4j.cypher.internal.logical.plans.Anti
import org.neo4j.cypher.internal.logical.plans.AntiConditionalApply
import org.neo4j.cypher.internal.logical.plans.AntiSemiApply
import org.neo4j.cypher.internal.logical.plans.Apply
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.Ascending
import org.neo4j.cypher.internal.logical.plans.AssertAllowedDatabaseAction
import org.neo4j.cypher.internal.logical.plans.AssertAllowedDbmsActions
import org.neo4j.cypher.internal.logical.plans.AssertAllowedDbmsActionsOrSelf
import org.neo4j.cypher.internal.logical.plans.AssertNotBlocked
import org.neo4j.cypher.internal.logical.plans.AssertNotCurrentUser
import org.neo4j.cypher.internal.logical.plans.AssertSameNode
import org.neo4j.cypher.internal.logical.plans.CacheProperties
import org.neo4j.cypher.internal.logical.plans.CartesianProduct
import org.neo4j.cypher.internal.logical.plans.ConditionalApply
import org.neo4j.cypher.internal.logical.plans.CopyRolePrivileges
import org.neo4j.cypher.internal.logical.plans.Create
import org.neo4j.cypher.internal.logical.plans.CreateBtreeIndex
import org.neo4j.cypher.internal.logical.plans.CreateDatabase
import org.neo4j.cypher.internal.logical.plans.CreateFulltextIndex
import org.neo4j.cypher.internal.logical.plans.CreateLookupIndex
import org.neo4j.cypher.internal.logical.plans.CreateNodeKeyConstraint
import org.neo4j.cypher.internal.logical.plans.CreateNodePropertyExistenceConstraint
import org.neo4j.cypher.internal.logical.plans.CreatePointIndex
import org.neo4j.cypher.internal.logical.plans.CreateRangeIndex
import org.neo4j.cypher.internal.logical.plans.CreateRelationshipPropertyExistenceConstraint
import org.neo4j.cypher.internal.logical.plans.CreateRole
import org.neo4j.cypher.internal.logical.plans.CreateTextIndex
import org.neo4j.cypher.internal.logical.plans.CreateUniquePropertyConstraint
import org.neo4j.cypher.internal.logical.plans.CreateUser
import org.neo4j.cypher.internal.logical.plans.DeleteExpression
import org.neo4j.cypher.internal.logical.plans.DeleteNode
import org.neo4j.cypher.internal.logical.plans.DeletePath
import org.neo4j.cypher.internal.logical.plans.DeleteRelationship
import org.neo4j.cypher.internal.logical.plans.DenyDatabaseAction
import org.neo4j.cypher.internal.logical.plans.DenyDbmsAction
import org.neo4j.cypher.internal.logical.plans.DenyGraphAction
import org.neo4j.cypher.internal.logical.plans.Descending
import org.neo4j.cypher.internal.logical.plans.DetachDeleteExpression
import org.neo4j.cypher.internal.logical.plans.DetachDeleteNode
import org.neo4j.cypher.internal.logical.plans.DetachDeletePath
import org.neo4j.cypher.internal.logical.plans.DirectedRelationshipByIdSeek
import org.neo4j.cypher.internal.logical.plans.DirectedRelationshipTypeScan
import org.neo4j.cypher.internal.logical.plans.Distinct
import org.neo4j.cypher.internal.logical.plans.DoNotGetValue
import org.neo4j.cypher.internal.logical.plans.DoNothingIfExists
import org.neo4j.cypher.internal.logical.plans.DoNothingIfExistsForConstraint
import org.neo4j.cypher.internal.logical.plans.DoNothingIfExistsForFulltextIndex
import org.neo4j.cypher.internal.logical.plans.DoNothingIfExistsForIndex
import org.neo4j.cypher.internal.logical.plans.DoNothingIfExistsForLookupIndex
import org.neo4j.cypher.internal.logical.plans.DoNothingIfNotExists
import org.neo4j.cypher.internal.logical.plans.DropConstraintOnName
import org.neo4j.cypher.internal.logical.plans.DropDatabase
import org.neo4j.cypher.internal.logical.plans.DropIndex
import org.neo4j.cypher.internal.logical.plans.DropIndexOnName
import org.neo4j.cypher.internal.logical.plans.DropNodeKeyConstraint
import org.neo4j.cypher.internal.logical.plans.DropNodePropertyExistenceConstraint
import org.neo4j.cypher.internal.logical.plans.DropRelationshipPropertyExistenceConstraint
import org.neo4j.cypher.internal.logical.plans.DropRole
import org.neo4j.cypher.internal.logical.plans.DropUniquePropertyConstraint
import org.neo4j.cypher.internal.logical.plans.DropUser
import org.neo4j.cypher.internal.logical.plans.Eager
import org.neo4j.cypher.internal.logical.plans.EmptyResult
import org.neo4j.cypher.internal.logical.plans.EnsureNodeExists
import org.neo4j.cypher.internal.logical.plans.EnsureValidNonSystemDatabase
import org.neo4j.cypher.internal.logical.plans.EnsureValidNumberOfDatabases
import org.neo4j.cypher.internal.logical.plans.ErrorPlan
import org.neo4j.cypher.internal.logical.plans.Expand
import org.neo4j.cypher.internal.logical.plans.ExpandAll
import org.neo4j.cypher.internal.logical.plans.ExpandInto
import org.neo4j.cypher.internal.logical.plans.FieldSignature
import org.neo4j.cypher.internal.logical.plans.FindShortestPaths
import org.neo4j.cypher.internal.logical.plans.Foreach
import org.neo4j.cypher.internal.logical.plans.ForeachApply
import org.neo4j.cypher.internal.logical.plans.GetValue
import org.neo4j.cypher.internal.logical.plans.GrantDatabaseAction
import org.neo4j.cypher.internal.logical.plans.GrantDbmsAction
import org.neo4j.cypher.internal.logical.plans.GrantGraphAction
import org.neo4j.cypher.internal.logical.plans.GrantRoleToUser
import org.neo4j.cypher.internal.logical.plans.IndexOrderNone
import org.neo4j.cypher.internal.logical.plans.IndexSeek.nodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.IndexSeek.relationshipIndexSeek
import org.neo4j.cypher.internal.logical.plans.IndexedProperty
import org.neo4j.cypher.internal.logical.plans.Input
import org.neo4j.cypher.internal.logical.plans.LeftOuterHashJoin
import org.neo4j.cypher.internal.logical.plans.LetAntiSemiApply
import org.neo4j.cypher.internal.logical.plans.LetSelectOrAntiSemiApply
import org.neo4j.cypher.internal.logical.plans.LetSelectOrSemiApply
import org.neo4j.cypher.internal.logical.plans.LetSemiApply
import org.neo4j.cypher.internal.logical.plans.Limit
import org.neo4j.cypher.internal.logical.plans.LoadCSV
import org.neo4j.cypher.internal.logical.plans.LogSystemCommand
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.ManyQueryExpression
import org.neo4j.cypher.internal.logical.plans.ManySeekableArgs
import org.neo4j.cypher.internal.logical.plans.Merge
import org.neo4j.cypher.internal.logical.plans.MultiNodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.NodeByIdSeek
import org.neo4j.cypher.internal.logical.plans.NodeByLabelScan
import org.neo4j.cypher.internal.logical.plans.NodeCountFromCountStore
import org.neo4j.cypher.internal.logical.plans.NodeHashJoin
import org.neo4j.cypher.internal.logical.plans.NodeIndexSeek
import org.neo4j.cypher.internal.logical.plans.NodeIndexSeekLeafPlan
import org.neo4j.cypher.internal.logical.plans.NodeKey
import org.neo4j.cypher.internal.logical.plans.NodePropertyExistence
import org.neo4j.cypher.internal.logical.plans.NodeUniqueIndexSeek
import org.neo4j.cypher.internal.logical.plans.Optional
import org.neo4j.cypher.internal.logical.plans.OptionalExpand
import org.neo4j.cypher.internal.logical.plans.OrderedAggregation
import org.neo4j.cypher.internal.logical.plans.OrderedDistinct
import org.neo4j.cypher.internal.logical.plans.PartialSort
import org.neo4j.cypher.internal.logical.plans.PartialTop
import org.neo4j.cypher.internal.logical.plans.PointBoundingBoxRange
import org.neo4j.cypher.internal.logical.plans.PointBoundingBoxSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.PointDistanceRange
import org.neo4j.cypher.internal.logical.plans.PointDistanceSeekRangeWrapper
import org.neo4j.cypher.internal.logical.plans.PreserveOrder
import org.neo4j.cypher.internal.logical.plans.ProcedureCall
import org.neo4j.cypher.internal.logical.plans.ProcedureReadOnlyAccess
import org.neo4j.cypher.internal.logical.plans.ProcedureSignature
import org.neo4j.cypher.internal.logical.plans.ProduceResult
import org.neo4j.cypher.internal.logical.plans.ProjectEndpoints
import org.neo4j.cypher.internal.logical.plans.Projection
import org.neo4j.cypher.internal.logical.plans.PruningVarExpand
import org.neo4j.cypher.internal.logical.plans.QualifiedName
import org.neo4j.cypher.internal.logical.plans.RangeQueryExpression
import org.neo4j.cypher.internal.logical.plans.RelationshipCountFromCountStore
import org.neo4j.cypher.internal.logical.plans.RelationshipPropertyExistence
import org.neo4j.cypher.internal.logical.plans.RemoveLabels
import org.neo4j.cypher.internal.logical.plans.RenameRole
import org.neo4j.cypher.internal.logical.plans.RenameUser
import org.neo4j.cypher.internal.logical.plans.RequireRole
import org.neo4j.cypher.internal.logical.plans.ResolvedCall
import org.neo4j.cypher.internal.logical.plans.ResolvedFunctionInvocation
import org.neo4j.cypher.internal.logical.plans.RevokeDatabaseAction
import org.neo4j.cypher.internal.logical.plans.RevokeDbmsAction
import org.neo4j.cypher.internal.logical.plans.RevokeGraphAction
import org.neo4j.cypher.internal.logical.plans.RevokeRoleFromUser
import org.neo4j.cypher.internal.logical.plans.RightOuterHashJoin
import org.neo4j.cypher.internal.logical.plans.RollUpApply
import org.neo4j.cypher.internal.logical.plans.SelectOrAntiSemiApply
import org.neo4j.cypher.internal.logical.plans.SelectOrSemiApply
import org.neo4j.cypher.internal.logical.plans.Selection
import org.neo4j.cypher.internal.logical.plans.SemiApply
import org.neo4j.cypher.internal.logical.plans.SetLabels
import org.neo4j.cypher.internal.logical.plans.SetNodeProperties
import org.neo4j.cypher.internal.logical.plans.SetNodePropertiesFromMap
import org.neo4j.cypher.internal.logical.plans.SetNodeProperty
import org.neo4j.cypher.internal.logical.plans.SetOwnPassword
import org.neo4j.cypher.internal.logical.plans.SetProperties
import org.neo4j.cypher.internal.logical.plans.SetPropertiesFromMap
import org.neo4j.cypher.internal.logical.plans.SetProperty
import org.neo4j.cypher.internal.logical.plans.SetRelationshipPropertiesFromMap
import org.neo4j.cypher.internal.logical.plans.SetRelationshipProperty
import org.neo4j.cypher.internal.logical.plans.ShowConstraints
import org.neo4j.cypher.internal.logical.plans.ShowCurrentUser
import org.neo4j.cypher.internal.logical.plans.ShowDatabase
import org.neo4j.cypher.internal.logical.plans.ShowFunctions
import org.neo4j.cypher.internal.logical.plans.ShowIndexes
import org.neo4j.cypher.internal.logical.plans.ShowPrivilegeCommands
import org.neo4j.cypher.internal.logical.plans.ShowPrivileges
import org.neo4j.cypher.internal.logical.plans.ShowProcedures
import org.neo4j.cypher.internal.logical.plans.ShowRoles
import org.neo4j.cypher.internal.logical.plans.ShowTransactions
import org.neo4j.cypher.internal.logical.plans.ShowUsers
import org.neo4j.cypher.internal.logical.plans.SingleSeekableArg
import org.neo4j.cypher.internal.logical.plans.Skip
import org.neo4j.cypher.internal.logical.plans.Sort
import org.neo4j.cypher.internal.logical.plans.StartDatabase
import org.neo4j.cypher.internal.logical.plans.StopDatabase
import org.neo4j.cypher.internal.logical.plans.TerminateTransactions
import org.neo4j.cypher.internal.logical.plans.Top
import org.neo4j.cypher.internal.logical.plans.TransactionApply
import org.neo4j.cypher.internal.logical.plans.TransactionForeach
import org.neo4j.cypher.internal.logical.plans.TriadicBuild
import org.neo4j.cypher.internal.logical.plans.TriadicFilter
import org.neo4j.cypher.internal.logical.plans.TriadicSelection
import org.neo4j.cypher.internal.logical.plans.UndirectedRelationshipByIdSeek
import org.neo4j.cypher.internal.logical.plans.UndirectedRelationshipTypeScan
import org.neo4j.cypher.internal.logical.plans.Union
import org.neo4j.cypher.internal.logical.plans.Uniqueness
import org.neo4j.cypher.internal.logical.plans.UnwindCollection
import org.neo4j.cypher.internal.logical.plans.UserFunctionSignature
import org.neo4j.cypher.internal.logical.plans.ValueHashJoin
import org.neo4j.cypher.internal.logical.plans.VarExpand
import org.neo4j.cypher.internal.logical.plans.VariablePredicate
import org.neo4j.cypher.internal.logical.plans.WaitForCompletion
import org.neo4j.cypher.internal.options.CypherVersion
import org.neo4j.cypher.internal.plandescription.Arguments.Details
import org.neo4j.cypher.internal.plandescription.Arguments.EstimatedRows
import org.neo4j.cypher.internal.plandescription.Arguments.Order
import org.neo4j.cypher.internal.plandescription.Arguments.Planner
import org.neo4j.cypher.internal.plandescription.Arguments.PlannerImpl
import org.neo4j.cypher.internal.plandescription.Arguments.PlannerVersion
import org.neo4j.cypher.internal.plandescription.Arguments.RuntimeVersion
import org.neo4j.cypher.internal.plandescription.Arguments.Version
import org.neo4j.cypher.internal.plandescription.LogicalPlan2PlanDescriptionTest.anonVar
import org.neo4j.cypher.internal.plandescription.LogicalPlan2PlanDescriptionTest.details
import org.neo4j.cypher.internal.plandescription.LogicalPlan2PlanDescriptionTest.planDescription
import org.neo4j.cypher.internal.plandescription.asPrettyString.PrettyStringInterpolator
import org.neo4j.cypher.internal.planner.spi.IDPPlannerName
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.EffectiveCardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.ProvidedOrders
import org.neo4j.cypher.internal.util.DummyPosition
import org.neo4j.cypher.internal.util.EffectiveCardinality
import org.neo4j.cypher.internal.util.InputPosition
import org.neo4j.cypher.internal.util.LabelId
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.PropertyKeyId
import org.neo4j.cypher.internal.util.attribution.Id
import org.neo4j.cypher.internal.util.attribution.IdGen
import org.neo4j.cypher.internal.util.attribution.SequentialIdGen
import org.neo4j.cypher.internal.util.symbols.BooleanType
import org.neo4j.cypher.internal.util.symbols.CTAny
import org.neo4j.cypher.internal.util.symbols.CTFloat
import org.neo4j.cypher.internal.util.symbols.CTInteger
import org.neo4j.cypher.internal.util.symbols.CTList
import org.neo4j.cypher.internal.util.symbols.CTMap
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.symbols.CTString
import org.neo4j.cypher.internal.util.symbols.CypherType
import org.neo4j.cypher.internal.util.test_helpers.CypherFunSuite
import org.neo4j.graphdb.schema.IndexType
import org.neo4j.values.storable.Values.stringValue
import org.scalatest.prop.TableDrivenPropertyChecks

object LogicalPlan2PlanDescriptionTest {

  def anonVar(number: String) = s"anon_$number"

  def details(infos: Seq[String]): Details = Details(infos.map(asPrettyString.raw))

  def details(info: String): Details = Details(asPrettyString.raw(info))

  def planDescription(id: Id,
                      name: String,
                      children: Children,
                      arguments: Seq[Argument] = Seq.empty,
                      variables: Set[String] = Set.empty): PlanDescriptionImpl = PlanDescriptionImpl(id, name, children, arguments, variables.map(asPrettyString.raw))
}

class LogicalPlan2PlanDescriptionTest extends CypherFunSuite with TableDrivenPropertyChecks {

  private val CYPHER_VERSION = Version("CYPHER 4.4")
  private val RUNTIME_VERSION = RuntimeVersion("4.4")
  private val PLANNER_VERSION = PlannerVersion("4.4")

  implicit val idGen: IdGen = new SequentialIdGen()
  private val readOnly = true
  private val effectiveCardinalities = new EffectiveCardinalities
  private val providedOrders = new ProvidedOrders
  private val id = Id.INVALID_ID

  implicit def lift(amount: Double): EffectiveCardinality = EffectiveCardinality(amount)

  private def attach[P <: LogicalPlan](plan: P, effectiveCardinality: EffectiveCardinality, providedOrder: ProvidedOrder = ProvidedOrder.empty): P = {
    effectiveCardinalities.set(plan.id, effectiveCardinality)
    providedOrders.set(plan.id, providedOrder)
    plan
  }

  private val privLhsLP = attach(AssertAllowedDbmsActions(ShowUserAction), 2.0, providedOrder = ProvidedOrder.empty)

  private val lhsLP = attach(AllNodesScan("a", Set.empty), EffectiveCardinality(2.0, Some(10.0)), ProvidedOrder.empty)
  private val lhsPD = PlanDescriptionImpl(id, "AllNodesScan", NoChildren, Seq(details("a"), EstimatedRows(2, Some(10))), Set(pretty"a"))

  private val rhsLP = attach(AllNodesScan("b", Set.empty), 2.0, providedOrder = ProvidedOrder.empty)
  private val rhsPD = PlanDescriptionImpl(id, "AllNodesScan", NoChildren, Seq(details("b"), EstimatedRows(2, Some(10))), Set(pretty"b"))

  private val pos: InputPosition = DummyPosition(0)

  test("Validate all arguments") {
    assertGood(
      attach(AllNodesScan("a", Set.empty), EffectiveCardinality(1.0, Some(15.0)), ProvidedOrder.asc(varFor("a"))),
      planDescription(id, "AllNodesScan", NoChildren, Seq(details("a"), EstimatedRows(1, Some(15)), Order(asPrettyString.raw("a ASC")), CYPHER_VERSION, RUNTIME_VERSION, Planner("COST"), PlannerImpl("IDP"), PLANNER_VERSION), Set("a")),
      validateAllArgs = true)

    assertGood(
      attach(AllNodesScan("  UNNAMED111", Set.empty), EffectiveCardinality(1.0, Some(10.0)), ProvidedOrder.asc(varFor("  UNNAMED111"))),
      planDescription(id, "AllNodesScan", NoChildren, Seq(details(anonVar("111")), EstimatedRows(1, Some(10)), Order(asPrettyString.raw(s"${anonVar("111")} ASC")), CYPHER_VERSION, RUNTIME_VERSION, Planner("COST"), PlannerImpl("IDP"), PLANNER_VERSION), Set(anonVar("111"))),
      validateAllArgs = true)

    assertGood(attach(Input(Seq("n1", "n2"), Seq("r"), Seq("v1", "v2"), nullable = false), EffectiveCardinality(42.3, Some(132))),
      planDescription(id, "Input", NoChildren, Seq(details(Seq("n1", "n2", "r", "v1", "v2")), EstimatedRows(42.3, Some(132)), CYPHER_VERSION, RUNTIME_VERSION, Planner("COST"), PlannerImpl("IDP"), PLANNER_VERSION), Set("n1", "n2", "r", "v1", "v2")),
      validateAllArgs = true)
  }

  // Leaf Plans
  test("AllNodesScan") {
    assertGood(
      attach(AllNodesScan("a", Set.empty), 1.0, providedOrder = ProvidedOrder.asc(varFor("a"))),
      planDescription(id, "AllNodesScan", NoChildren, Seq(details("a"), Order(asPrettyString.raw("a ASC"))), Set("a")))

    assertGood(
      attach(AllNodesScan("  UNNAMED111", Set.empty), 1.0, providedOrder = ProvidedOrder.asc(varFor("  UNNAMED111"))),
      planDescription(id, "AllNodesScan", NoChildren, Seq(details(anonVar("111")), Order(asPrettyString.raw(s"${anonVar("111")} ASC"))), Set(anonVar("111"))))

    assertGood(
      attach(AllNodesScan("b", Set.empty), 42.0, providedOrder = ProvidedOrder.asc(varFor("b")).desc(prop("b", "foo"))),
      planDescription(id, "AllNodesScan", NoChildren, Seq(details("b"), Order(asPrettyString.raw("b ASC, b.foo DESC"))), Set("b")))
  }

  test("NodeByLabelScan") {
    assertGood(
      attach(NodeByLabelScan("node", label("X"), Set.empty, IndexOrderNone), 33.0),
      planDescription(id, "NodeByLabelScan", NoChildren, Seq(details("node:X")), Set("node")))

    assertGood(
      attach(NodeByLabelScan("  UNNAMED123", label("X"), Set.empty, IndexOrderNone), 33.0),
      planDescription(id, "NodeByLabelScan", NoChildren, Seq(details(s"${anonVar("123")}:X")), Set(anonVar("123"))))
  }

  test("NodeByIdSeek") {
    assertGood(
      attach(NodeByIdSeek("node", ManySeekableArgs(ListLiteral(Seq(number("1"), number("32")))(pos)), Set.empty), 333.0),
      planDescription(id, "NodeByIdSeek", NoChildren, Seq(details("node WHERE id(node) IN [1,32]")), Set("node")))

    assertGood(
      attach(NodeByIdSeek("  UNNAMED11", ManySeekableArgs(ListLiteral(Seq(number("1"), number("32")))(pos)), Set.empty), 333.0),
      planDescription(id, "NodeByIdSeek", NoChildren, Seq(details(s"${anonVar("11")} WHERE id(${anonVar("11")}) IN [1,32]")), Set(anonVar("11"))))
  }

  test("NodeIndexSeek") {
    assertGood(
      attach(nodeIndexSeek("x:Label(Prop)"), 23.0),
      planDescription(id, "NodeIndexScan", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop IS NOT NULL")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop)"), 23.0),
      planDescription(id, "NodeIndexScan", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop IS NOT NULL")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop)", getValue = _ => GetValue), 23.0),
      planDescription(id, "NodeIndexScan", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop IS NOT NULL, cache[x.Prop]")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop,Foo)"), 23.0),
      planDescription(id, "NodeIndexScan", NoChildren, Seq(details("BTREE INDEX x:Label(Prop, Foo) WHERE Prop IS NOT NULL AND Foo IS NOT NULL")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop,Foo)", getValue = _ => GetValue), 23.0),
      planDescription(id, "NodeIndexScan", NoChildren,
        Seq(details("BTREE INDEX x:Label(Prop, Foo) WHERE Prop IS NOT NULL AND Foo IS NOT NULL, cache[x.Prop], cache[x.Foo]")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 'Andres')"), 23.0),
      planDescription(id, "NodeIndexSeek", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop = \"Andres\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 'Andres')", getValue = _ => GetValue), 23.0),
      planDescription(id, "NodeIndexSeek", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop = \"Andres\", cache[x.Prop]")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 'Andres')", unique = true), 23.0),
      planDescription(id, "NodeUniqueIndexSeek", NoChildren, Seq(details("UNIQUE x:Label(Prop) WHERE Prop = \"Andres\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 'Andres' OR 'Pontus')"), 23.0),
      planDescription(id, "NodeIndexSeek", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop IN [\"Andres\", \"Pontus\"]")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 'Andres' OR 'Pontus')", unique = true), 23.0),
      planDescription(id, "NodeUniqueIndexSeek", NoChildren, Seq(details("UNIQUE x:Label(Prop) WHERE Prop IN [\"Andres\", \"Pontus\"]")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop > 9)"), 23.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop > 9")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop < 9)"), 23.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop < 9")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(9 <= Prop <= 11)"), 23.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop >= 9 AND Prop <= 11")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop STARTS WITH 'Foo')"), 23.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop STARTS WITH \"Foo\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop STARTS WITH 'Foo')", indexType = IndexType.TEXT), 23.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("TEXT INDEX x:Label(Prop) WHERE Prop STARTS WITH \"Foo\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop STARTS WITH 'Foo')", indexType = IndexType.FULLTEXT), 23.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("FULLTEXT INDEX x:Label(Prop) WHERE Prop STARTS WITH \"Foo\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop ENDS WITH 'Foo')"), 23.0),
      planDescription(id, "NodeIndexEndsWithScan", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop ENDS WITH \"Foo\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop CONTAINS 'Foo')"), 23.0),
      planDescription(id, "NodeIndexContainsScan", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE Prop CONTAINS \"Foo\"")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 10,Foo = 12)"), 23.0),
      planDescription(id, "NodeIndexSeek", NoChildren, Seq(details("BTREE INDEX x:Label(Prop, Foo) WHERE Prop = 10 AND Foo = 12")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop = 10,Foo = 12)", unique = true), 23.0),
      planDescription(id, "NodeUniqueIndexSeek", NoChildren, Seq(details("UNIQUE x:Label(Prop, Foo) WHERE Prop = 10 AND Foo = 12")), Set("x")))

    assertGood(
      attach(nodeIndexSeek("x:Label(Prop > 10,Foo)", indexType = IndexType.RANGE), 23.0),
      planDescription(id, "NodeIndexSeek", NoChildren, Seq(details("RANGE INDEX x:Label(Prop, Foo) WHERE Prop > 10 AND Foo IS NOT NULL")), Set("x")))

    // This is ManyQueryExpression with only a single expression. That is possible to get, but the test utility IndexSeek cannot create those.
    assertGood(
      attach(NodeUniqueIndexSeek("x", LabelToken("Label", LabelId(0)), Seq(IndexedProperty(PropertyKeyToken("Prop", PropertyKeyId(0)), DoNotGetValue, NODE_TYPE)),
        ManyQueryExpression(ListLiteral(Seq(stringLiteral("Andres")))(pos)), Set.empty, IndexOrderNone, IndexType.BTREE), 95.0),
      planDescription(id, "NodeUniqueIndexSeek", NoChildren, Seq(details("UNIQUE x:Label(Prop) WHERE Prop = \"Andres\"")), Set("x")))

    assertGood(
      attach(NodeIndexSeek("x", LabelToken("Label", LabelId(0)), Seq(IndexedProperty(PropertyKeyToken("Prop", PropertyKeyId(0)), DoNotGetValue, NODE_TYPE)),
        RangeQueryExpression(PointDistanceSeekRangeWrapper(PointDistanceRange(
          FunctionInvocation(MapExpression(Seq(
            (key("x"), number("1")),
            (key("y"), number("2")),
            (key("crs"), stringLiteral("cartesian"))
          ))(pos), FunctionName(Point.name)(pos)), number("10"), inclusive = true
        ))(pos)),
        Set.empty, IndexOrderNone, IndexType.POINT),
        95.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("POINT INDEX x:Label(Prop) WHERE point.distance(Prop, point(1, 2, \"cartesian\")) <= 10")), Set("x")))

    assertGood(
      attach(NodeIndexSeek("x", LabelToken("Label", LabelId(0)), Seq(IndexedProperty(PropertyKeyToken("Prop", PropertyKeyId(0)), DoNotGetValue, NODE_TYPE)),
        RangeQueryExpression(PointBoundingBoxSeekRangeWrapper(PointBoundingBoxRange(
          FunctionInvocation(MapExpression(Seq(
            (key("x"), number("0")),
            (key("y"), number("0")),
            (key("crs"), stringLiteral("cartesian"))
          ))(pos), FunctionName(Point.name)(pos)),
          FunctionInvocation(MapExpression(Seq(
            (key("x"), number("10")),
            (key("y"), number("10")),
            (key("crs"), stringLiteral("cartesian"))
          ))(pos), FunctionName(Point.name)(pos))))(pos)),
        Set.empty, IndexOrderNone, IndexType.BTREE),
        95.0),
      planDescription(id, "NodeIndexSeekByRange", NoChildren, Seq(details("BTREE INDEX x:Label(Prop) WHERE point.withinBBox(Prop, point(0, 0, \"cartesian\"), point(10, 10, \"cartesian\"))")), Set("x")))
  }

  test("RelationshipIndexSeek") {
    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop)]->(y)"), 23.0),
      planDescription(id, "DirectedRelationshipIndexScan", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]->(y) WHERE Prop IS NOT NULL")), Set("r", "x", "y")))
    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop)]-(y)"), 23.0),
      planDescription(id, "UndirectedRelationshipIndexScan", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]-(y) WHERE Prop IS NOT NULL")), Set("r", "x", "y")))

    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop = 42)]->(y)", getValue = _ => GetValue), 23.0),
      planDescription(id, "DirectedRelationshipIndexSeek", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]->(y) WHERE Prop = 42, cache[r.Prop]")), Set("r", "x", "y")))
    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop = 42)]-(y)", getValue = _ => GetValue), 23.0),
      planDescription(id, "UndirectedRelationshipIndexSeek", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]-(y) WHERE Prop = 42, cache[r.Prop]")), Set("r", "x", "y")))

    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop CONTAINS 'Foo')]->(y)"), 23.0),
      planDescription(id, "DirectedRelationshipIndexContainsScan", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]->(y) WHERE Prop CONTAINS \"Foo\"")), Set("r", "x", "y")))
    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop CONTAINS 'Foo')]-(y)"), 23.0),
      planDescription(id, "UndirectedRelationshipIndexContainsScan", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]-(y) WHERE Prop CONTAINS \"Foo\"")), Set("r", "x", "y")))

    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop ENDS WITH 'Foo')]->(y)", indexType = IndexType.TEXT), 23.0),
      planDescription(id, "DirectedRelationshipIndexEndsWithScan", NoChildren, Seq(details("TEXT INDEX (x)-[r:R(Prop)]->(y) WHERE Prop ENDS WITH \"Foo\"")), Set("r", "x", "y")))
    assertGood(
      attach(relationshipIndexSeek("(x)-[r:R(Prop ENDS WITH 'Foo')]-(y)"), 23.0),
      planDescription(id, "UndirectedRelationshipIndexEndsWithScan", NoChildren, Seq(details("BTREE INDEX (x)-[r:R(Prop)]-(y) WHERE Prop ENDS WITH \"Foo\"")), Set("r", "x", "y")))
  }

  test("RelationshipTypeScan") {
    assertGood(
      attach(DirectedRelationshipTypeScan("r", "x", RelTypeName("R")(InputPosition.NONE), "y", Set.empty, IndexOrderNone), 23.0),
      planDescription(id, "DirectedRelationshipTypeScan", NoChildren, Seq(details("(x)-[r:R]->(y)")), Set("r", "x", "y")))

    assertGood(
      attach(UndirectedRelationshipTypeScan("r", "x", RelTypeName("R")(InputPosition.NONE), "y", Set.empty, IndexOrderNone), 23.0),
      planDescription(id, "UndirectedRelationshipTypeScan", NoChildren, Seq(details("(x)-[r:R]-(y)")), Set("r", "x", "y")))
  }

  test("MultiNodeIndexSeek") {
    assertGood(
      attach(MultiNodeIndexSeek(Seq(nodeIndexSeek("x:Label(Prop = 10,Foo = 12)", unique = true).asInstanceOf[NodeIndexSeekLeafPlan], nodeIndexSeek("y:Label(Prop = 12)", unique = false).asInstanceOf[NodeIndexSeekLeafPlan])), 230.0),
      planDescription(id, "MultiNodeIndexSeek", NoChildren, Seq(details(Seq("UNIQUE x:Label(Prop, Foo) WHERE Prop = 10 AND Foo = 12", "BTREE INDEX y:Label(Prop) WHERE Prop = 12"))), Set("x", "y"))
    )
  }

  test("ProduceResult") {
    assertGood(attach(ProduceResult(lhsLP, Seq("a", "b", "c\nd")), 12.0),
      planDescription(id, "ProduceResults", SingleChild(lhsPD), Seq(details(Seq("a", "b", "cd"))), Set("a")))
  }

  test("Argument") {
    assertGood(attach(Argument(Set.empty), 95.0),
      planDescription(id, "EmptyRow", NoChildren, Seq.empty, Set.empty))

    assertGood(attach(Argument(Set("a", "b")), 95.0),
      planDescription(id, "Argument", NoChildren, Seq(details("a, b")), Set("a", "b")))
  }

  test("RelationshipByIdSeek") {
    assertGood(attach(DirectedRelationshipByIdSeek("r", SingleSeekableArg(number("1")), "a", "b", Set.empty), 70.0),
      planDescription(id, "DirectedRelationshipByIdSeek", NoChildren, Seq(details("(a)-[r]->(b) WHERE id(r) = 1")), Set("r", "a", "b")))

    assertGood(attach(DirectedRelationshipByIdSeek("r", SingleSeekableArg(number("1")), "a", "b", Set("x")), 70.0),
      planDescription(id, "DirectedRelationshipByIdSeek", NoChildren, Seq(details("(a)-[r]->(b) WHERE id(r) = 1")), Set("r", "a", "b", "x")))

    assertGood(attach(DirectedRelationshipByIdSeek("r", ManySeekableArgs(ListLiteral(Seq(number("1")))(pos)), "a", "b", Set("x")), 70.0),
      planDescription(id, "DirectedRelationshipByIdSeek", NoChildren, Seq(details("(a)-[r]->(b) WHERE id(r) = 1")), Set("r", "a", "b", "x")))

    assertGood(attach(DirectedRelationshipByIdSeek("r", ManySeekableArgs(ListLiteral(Seq(number("1"), number("2")))(pos)), "a", "b", Set("x")), 70.0),
      planDescription(id, "DirectedRelationshipByIdSeek", NoChildren, Seq(details("(a)-[r]->(b) WHERE id(r) IN [1,2]")), Set("r", "a", "b", "x")))

    assertGood(attach(DirectedRelationshipByIdSeek("r", ManySeekableArgs(number("1")), "a", "b", Set("x")), 70.0),
      planDescription(id, "DirectedRelationshipByIdSeek", NoChildren, Seq(details("(a)-[r]->(b) WHERE id(r) = 1")), Set("r", "a", "b", "x")))

    assertGood(attach(UndirectedRelationshipByIdSeek("r", ManySeekableArgs(number("1")), "a", "b", Set("x")), 70.0),
      planDescription(id, "UndirectedRelationshipByIdSeek", NoChildren, Seq(details("(a)-[r]-(b) WHERE id(r) = 1")), Set("r", "a", "b", "x")))

    assertGood(attach(UndirectedRelationshipByIdSeek("  UNNAMED2", ManySeekableArgs(number("1")), "a", "  UNNAMED32", Set("x")), 70.0),
      planDescription(id, "UndirectedRelationshipByIdSeek", NoChildren, Seq(details(s"(a)-[${anonVar("2")}]-(${anonVar("32")}) WHERE id(${anonVar("2")}) = 1")), Set(anonVar("2"), "a", anonVar("32"), "x")))
  }

  test("LoadCSV") {
    assertGood(
      attach(LoadCSV(lhsLP, stringLiteral("file:///tmp/foo.csv"), "u", NoHeaders, None, legacyCsvQuoteEscaping = false, csvBufferSize = 2), 27.6),
      planDescription(id, "LoadCSV", SingleChild(lhsPD), Seq(details("u")), Set("u", "a")))

    assertGood(
      attach(LoadCSV(lhsLP, stringLiteral("file:///tmp/foo.csv"), "  UNNAMED2", NoHeaders, None, legacyCsvQuoteEscaping = false, csvBufferSize = 2), 27.6),
      planDescription(id, "LoadCSV", SingleChild(lhsPD), Seq(details(anonVar("2"))), Set(anonVar("2"), "a")))
  }

  test("Input") {
    assertGood(attach(Input(Seq("n1", "n2"), Seq("r"), Seq("v1", "v2"), nullable = false), 4.0),
      planDescription(id, "Input", NoChildren, Seq(details(Seq("n1", "n2", "r", "v1", "v2"))), Set("n1", "n2", "r", "v1", "v2")))
  }

  test("NodeCountFromCountStore") {
    assertGood(attach(NodeCountFromCountStore("x", List(Some(label("LabelName"))), Set.empty), 54.2),
      planDescription(id, "NodeCountFromCountStore", NoChildren, Seq(details("count( (:LabelName) ) AS x")), Set("x")))

    assertGood(attach(NodeCountFromCountStore("x", List(Some(label("LabelName")), Some(label("LabelName2"))), Set.empty), 54.2),
      planDescription(id, "NodeCountFromCountStore", NoChildren, Seq(details("count( (:LabelName), (:LabelName2) ) AS x")), Set("x")))

    assertGood(attach(NodeCountFromCountStore("  UNNAMED123", List(Some(label("LabelName"))), Set.empty), 54.2),
      planDescription(id, "NodeCountFromCountStore", NoChildren, Seq(details(s"count( (:LabelName) ) AS ${anonVar("123")}")), Set(anonVar("123"))))

    assertGood(attach(NodeCountFromCountStore("x", List(None, None), Set.empty), 54.2),
      planDescription(id, "NodeCountFromCountStore", NoChildren, Seq(details("count( (), () ) AS x")), Set("x")))
  }

  test("ProcedureCall") {
    val ns = Namespace(List("my", "proc"))(pos)
    val name = ProcedureName("foo")(pos)
    val qualifiedName = QualifiedName(ns.parts, name.name)
    val signatureInputs = IndexedSeq(FieldSignature("a", CTInteger))
    val signatureOutputs = Some(IndexedSeq(FieldSignature("x", CTInteger), FieldSignature("y", CTList(CTNode))))
    val signature = ProcedureSignature(qualifiedName, signatureInputs, signatureOutputs, None, ProcedureReadOnlyAccess, id = 42)
    val callResults = IndexedSeq(ProcedureResultItem(varFor("x"))(pos), ProcedureResultItem(varFor("y"))(pos))
    val call = ResolvedCall(signature, Seq(varFor("a1")), callResults)(pos)

    assertGood(attach(ProcedureCall(lhsLP, call), 33.2),
      planDescription(id, "ProcedureCall", SingleChild(lhsPD), Seq(details("my.proc.foo(a1) :: (x :: INTEGER?, y :: LIST? OF NODE?)")), Set("a", "x", "y")))
  }

  test("RelationshipCountFromCountStore") {
    assertGood(attach(RelationshipCountFromCountStore("x", None, Seq(relType("LIKES"), relType("LOVES")), None, Set.empty), 54.2),
      planDescription(id, "RelationshipCountFromCountStore", NoChildren, Seq(details("count( ()-[:LIKES|LOVES]->() ) AS x")), Set("x")))

    assertGood(attach(RelationshipCountFromCountStore("  UNNAMED122", None, Seq(relType("LIKES")), None, Set.empty), 54.2),
      planDescription(id, "RelationshipCountFromCountStore", NoChildren, Seq(details(s"count( ()-[:LIKES]->() ) AS ${anonVar("122")}")), Set(anonVar("122"))))

    assertGood(attach(RelationshipCountFromCountStore("x", Some(label("StartLabel")), Seq(relType("LIKES"), relType("LOVES")), None, Set.empty), 54.2),
      planDescription(id, "RelationshipCountFromCountStore", NoChildren, Seq(details("count( (:StartLabel)-[:LIKES|LOVES]->() ) AS x")), Set("x")))

    assertGood(attach(RelationshipCountFromCountStore("x", Some(label("StartLabel")), Seq(relType("LIKES"), relType("LOVES")), Some(label("EndLabel")), Set.empty), 54.2),
      planDescription(id, "RelationshipCountFromCountStore", NoChildren, Seq(details("count( (:StartLabel)-[:LIKES|LOVES]->(:EndLabel) ) AS x")), Set("x")))

    assertGood(attach(RelationshipCountFromCountStore("x", Some(label("StartLabel")), Seq.empty, Some(label("EndLabel")), Set.empty), 54.2),
      planDescription(id, "RelationshipCountFromCountStore", NoChildren, Seq(details("count( (:StartLabel)-[]->(:EndLabel) ) AS x")), Set("x")))
  }

  test("CreateIndex") {

    // BTREE

    assertGood(attach(CreateBtreeIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("BTREE INDEX `$indexName` FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateBtreeIndex(None, Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("BTREE INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateBtreeIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("native-btree-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""BTREE INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS {indexProvider: "native-btree-1.0"}""")), Set.empty))

    assertGood(attach(CreateBtreeIndex(Some(DoNothingIfExistsForIndex(Left(label("Label")), List(key("prop")), IndexType.BTREE, None)),
      Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("BTREE INDEX FOR (:Label) ON (prop)")), Set.empty)
      ), Seq(details("BTREE INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateBtreeIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("BTREE INDEX `$indexName` FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateBtreeIndex(None, Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("BTREE INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateBtreeIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("native-btree-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""BTREE INDEX `$indexName` FOR ()-[:Label]-() ON (prop) OPTIONS {indexProvider: "native-btree-1.0"}""")), Set.empty))

    assertGood(attach(CreateBtreeIndex(Some(DoNothingIfExistsForIndex(Right(relType("Label")), List(key("prop")), IndexType.BTREE, None)),
      Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("BTREE INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty)
      ), Seq(details("BTREE INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateBtreeIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsParam(parameter("options", CTMap))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("BTREE INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS $options")), Set.empty))

    // RANGE

    assertGood(attach(CreateRangeIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("RANGE INDEX `$indexName` FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateRangeIndex(None, Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("RANGE INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateRangeIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("range-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""RANGE INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS {indexProvider: "range-1.0"}""")), Set.empty))

    assertGood(attach(CreateRangeIndex(Some(DoNothingIfExistsForIndex(Left(label("Label")), List(key("prop")), IndexType.RANGE, None)),
      Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("RANGE INDEX FOR (:Label) ON (prop)")), Set.empty)
      ), Seq(details("RANGE INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateRangeIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("RANGE INDEX `$indexName` FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateRangeIndex(None, Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("RANGE INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateRangeIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("range-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""RANGE INDEX `$indexName` FOR ()-[:Label]-() ON (prop) OPTIONS {indexProvider: "range-1.0"}""")), Set.empty))

    assertGood(attach(CreateRangeIndex(Some(DoNothingIfExistsForIndex(Right(relType("Label")), List(key("prop")), IndexType.RANGE, None)),
      Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("RANGE INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty)
      ), Seq(details("RANGE INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateRangeIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsParam(parameter("options", CTMap))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("RANGE INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS $options")), Set.empty))

    // LOOKUP

    assertGood(attach(CreateLookupIndex(None, EntityType.NODE, Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("LOOKUP INDEX `$indexName` FOR (n) ON EACH labels(n)")), Set.empty))

    assertGood(attach(CreateLookupIndex(Some(DoNothingIfExistsForLookupIndex(EntityType.NODE, None)), EntityType.NODE, None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("LOOKUP INDEX FOR (n) ON EACH labels(n)")), Set.empty)
      ), Seq(details("LOOKUP INDEX FOR (n) ON EACH labels(n)")), Set.empty))

    assertGood(attach(CreateLookupIndex(None, EntityType.NODE, Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("token-lookup-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""LOOKUP INDEX `$indexName` FOR (n) ON EACH labels(n) OPTIONS {indexProvider: "token-lookup-1.0"}""")), Set.empty))

    assertGood(attach(CreateLookupIndex(None, EntityType.RELATIONSHIP, Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("LOOKUP INDEX `$indexName` FOR ()-[r]-() ON EACH type(r)")), Set.empty))

    assertGood(attach(CreateLookupIndex(Some(DoNothingIfExistsForLookupIndex(EntityType.RELATIONSHIP, None)), EntityType.RELATIONSHIP, None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("LOOKUP INDEX FOR ()-[r]-() ON EACH type(r)")), Set.empty)
      ), Seq(details("LOOKUP INDEX FOR ()-[r]-() ON EACH type(r)")), Set.empty))

    assertGood(attach(CreateLookupIndex(None, EntityType.RELATIONSHIP, Some("$indexName"), OptionsMap(Map("indexConfig" -> MapExpression(Seq.empty)(pos)))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("LOOKUP INDEX `$indexName` FOR ()-[r]-() ON EACH type(r) OPTIONS {indexConfig: {}}")), Set.empty))

    // FULLTEXT

    assertGood(attach(CreateFulltextIndex(None, Left(List(label("Label"))), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("FULLTEXT INDEX `$indexName` FOR (:Label) ON EACH [prop]")), Set.empty))

    assertGood(attach(CreateFulltextIndex(None, Left(List(label("Label"))), List(key("prop1"), key("prop2")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("FULLTEXT INDEX FOR (:Label) ON EACH [prop1, prop2]")), Set.empty))

    assertGood(attach(CreateFulltextIndex(None, Left(List(label("Label1"), label("Label2"))), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("fulltext-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""FULLTEXT INDEX `$indexName` FOR (:Label1|Label2) ON EACH [prop] OPTIONS {indexProvider: "fulltext-1.0"}""")), Set.empty))

    assertGood(attach(CreateFulltextIndex(Some(DoNothingIfExistsForFulltextIndex(Left(List(label("Label"))), List(key("prop")), None)),
      Left(List(label("Label"))), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("FULLTEXT INDEX FOR (:Label) ON EACH [prop]")), Set.empty)
      ), Seq(details("FULLTEXT INDEX FOR (:Label) ON EACH [prop]")), Set.empty))

    assertGood(attach(CreateFulltextIndex(None, Right(List(relType("Label"))), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("FULLTEXT INDEX `$indexName` FOR ()-[:Label]-() ON EACH [prop]")), Set.empty))

    assertGood(attach(CreateFulltextIndex(None, Right(List(relType("Label"), relType("Type"))), List(key("prop1"), key("prop2")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("FULLTEXT INDEX FOR ()-[:Label|Type]-() ON EACH [prop1, prop2]")), Set.empty))

    assertGood(attach(CreateFulltextIndex(None, Right(List(relType("Label"))), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("fulltext-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""FULLTEXT INDEX `$indexName` FOR ()-[:Label]-() ON EACH [prop] OPTIONS {indexProvider: "fulltext-1.0"}""")), Set.empty))

    assertGood(attach(CreateFulltextIndex(Some(DoNothingIfExistsForFulltextIndex(Right(List(relType("Label"))), List(key("prop")), None)),
      Right(List(relType("Label"))), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("FULLTEXT INDEX FOR ()-[:Label]-() ON EACH [prop]")), Set.empty)
      ), Seq(details("FULLTEXT INDEX FOR ()-[:Label]-() ON EACH [prop]")), Set.empty))

    assertGood(attach(CreateFulltextIndex(None, Left(List(label("Label"))), List(key("prop")), Some("$indexName"), OptionsParam(parameter("ops", CTMap))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("FULLTEXT INDEX `$indexName` FOR (:Label) ON EACH [prop] OPTIONS $ops")), Set.empty))

    // TEXT

    assertGood(attach(CreateTextIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("TEXT INDEX `$indexName` FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateTextIndex(None, Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("TEXT INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateTextIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("text-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""TEXT INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS {indexProvider: "text-1.0"}""")), Set.empty))

    assertGood(attach(CreateTextIndex(Some(DoNothingIfExistsForIndex(Left(label("Label")), List(key("prop")), IndexType.TEXT, None)),
      Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("TEXT INDEX FOR (:Label) ON (prop)")), Set.empty)
      ), Seq(details("TEXT INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreateTextIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("TEXT INDEX `$indexName` FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateTextIndex(None, Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("TEXT INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateTextIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("text-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""TEXT INDEX `$indexName` FOR ()-[:Label]-() ON (prop) OPTIONS {indexProvider: "text-1.0"}""")), Set.empty))

    assertGood(attach(CreateTextIndex(Some(DoNothingIfExistsForIndex(Right(relType("Label")), List(key("prop")), IndexType.TEXT, None)),
      Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("TEXT INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty)
      ), Seq(details("TEXT INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreateTextIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsParam(parameter("options", CTMap))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("TEXT INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS $options")), Set.empty))

    // POINT

    assertGood(attach(CreatePointIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("POINT INDEX `$indexName` FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreatePointIndex(None, Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("POINT INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreatePointIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("point-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""POINT INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS {indexProvider: "point-1.0"}""")), Set.empty))

    assertGood(attach(CreatePointIndex(Some(DoNothingIfExistsForIndex(Left(label("Label")), List(key("prop")), IndexType.POINT, None)),
      Left(label("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("POINT INDEX FOR (:Label) ON (prop)")), Set.empty)
      ), Seq(details("POINT INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(CreatePointIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("POINT INDEX `$indexName` FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreatePointIndex(None, Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("POINT INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreatePointIndex(None, Right(relType("Label")), List(key("prop")), Some("$indexName"), OptionsMap(Map("indexProvider" -> stringLiteral("point-1.0")))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("""POINT INDEX `$indexName` FOR ()-[:Label]-() ON (prop) OPTIONS {indexProvider: "point-1.0"}""")), Set.empty))

    assertGood(attach(CreatePointIndex(Some(DoNothingIfExistsForIndex(Right(relType("Label")), List(key("prop")), IndexType.POINT, None)),
      Right(relType("Label")), List(key("prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateIndex", SingleChild(
        planDescription(id, "DoNothingIfExists(INDEX)", NoChildren, Seq(details("POINT INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty)
      ), Seq(details("POINT INDEX FOR ()-[:Label]-() ON (prop)")), Set.empty))

    assertGood(attach(CreatePointIndex(None, Left(label("Label")), List(key("prop")), Some("$indexName"), OptionsParam(parameter("options", CTMap))), 63.2),
      planDescription(id, "CreateIndex", NoChildren, Seq(details("POINT INDEX `$indexName` FOR (:Label) ON (prop) OPTIONS $options")), Set.empty))
  }

  test("DropIndex") {
    assertGood(attach(DropIndex(label("Label"), List(key("prop"))), 63.2),
      planDescription(id, "DropIndex", NoChildren, Seq(details("BTREE INDEX FOR (:Label) ON (prop)")), Set.empty))

    assertGood(attach(DropIndex(label("Label"), List(key("prop1"), key("prop2"))), 63.2),
      planDescription(id, "DropIndex", NoChildren, Seq(details("BTREE INDEX FOR (:Label) ON (prop1, prop2)")), Set.empty))
  }

  test("DropIndexOnName") {
    assertGood(attach(DropIndexOnName("indexName", ifExists = false), 63.2),
      planDescription(id, "DropIndex", NoChildren, Seq(details("INDEX indexName")), Set.empty))

    assertGood(attach(DropIndexOnName("indexName", ifExists = true), 63.2),
      planDescription(id, "DropIndex", NoChildren, Seq(details("INDEX indexName")), Set.empty))
  }

  test("ShowIndexes") {
    assertGood(attach(ShowIndexes(AllIndexes, verbose = true, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("allIndexes, allColumns")), Set.empty))

    assertGood(attach(ShowIndexes(BtreeIndexes, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("btreeIndexes, defaultColumns")), Set.empty))

    assertGood(attach(ShowIndexes(RangeIndexes, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("rangeIndexes, defaultColumns")), Set.empty))

    assertGood(attach(ShowIndexes(FulltextIndexes, verbose = true, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("fulltextIndexes, allColumns")), Set.empty))

    assertGood(attach(ShowIndexes(TextIndexes, verbose = true, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("textIndexes, allColumns")), Set.empty))

    assertGood(attach(ShowIndexes(PointIndexes, verbose = true, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("pointIndexes, allColumns")), Set.empty))

    assertGood(attach(ShowIndexes(LookupIndexes, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowIndexes", NoChildren, Seq(details("lookupIndexes, defaultColumns")), Set.empty))
  }

  test("CreateUniquePropertyConstraint") {
    assertGood(attach(CreateUniquePropertyConstraint(None, " x", label("Label"), Seq(prop(" x", "prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS UNIQUE")), Set.empty))

    assertGood(attach(CreateUniquePropertyConstraint(None, "x", label("Label"), Seq(prop("x", "prop")), Some("constraintName"), NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT constraintName FOR (x:Label) REQUIRE (x.prop) IS UNIQUE")), Set.empty))

    assertGood(attach(CreateUniquePropertyConstraint(None, "x", label("Label"), Seq(prop("x", "prop1"), prop("x", "prop2")), Some("constraintName"), NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT constraintName FOR (x:Label) REQUIRE (x.prop1, x.prop2) IS UNIQUE")), Set.empty))

    assertGood(attach(CreateUniquePropertyConstraint(None, "x", label("Label"), List(prop("x", "prop")), Some("$constraintName"), OptionsMap(Map("indexProvider" -> stringLiteral("native-btree-1.0")))), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("""CONSTRAINT `$constraintName` FOR (x:Label) REQUIRE (x.prop) IS UNIQUE OPTIONS {indexProvider: "native-btree-1.0"}""")), Set.empty))

    assertGood(attach(CreateUniquePropertyConstraint(Some(DoNothingIfExistsForConstraint(" x", scala.util.Left(label("Label")), Seq(prop(" x", "prop")), Uniqueness, None, NoOptions)),
      " x", label("Label"), Seq(prop(" x", "prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", SingleChild(
        planDescription(id, "DoNothingIfExists(CONSTRAINT)", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS UNIQUE")), Set.empty)
      ), Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS UNIQUE")), Set.empty))

    assertGood(attach(CreateUniquePropertyConstraint(None, " x", label("Label"), Seq(prop(" x", "prop")), None, OptionsParam(parameter("options", CTMap))), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS UNIQUE OPTIONS $options")), Set.empty))
  }

  test("CreateNodeKeyConstraint") {
    assertGood(attach(CreateNodeKeyConstraint(None, " x", label("Label"), Seq(prop(" x", "prop")), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS NODE KEY")), Set.empty))

    assertGood(attach(CreateNodeKeyConstraint(None, "x", label("Label"), Seq(prop("x", "prop1"), prop("x", "prop2")), Some("constraintName"), NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT constraintName FOR (x:Label) REQUIRE (x.prop1, x.prop2) IS NODE KEY")), Set.empty))

    assertGood(attach(CreateNodeKeyConstraint(None, "x", label("Label"), List(prop("x", "prop")), Some("$constraintName"), OptionsMap(Map("indexProvider" -> stringLiteral("native-btree-1.0")))), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("""CONSTRAINT `$constraintName` FOR (x:Label) REQUIRE (x.prop) IS NODE KEY OPTIONS {indexProvider: "native-btree-1.0"}""")), Set.empty))

    assertGood(attach(CreateNodeKeyConstraint(Some(DoNothingIfExistsForConstraint(" x", scala.util.Left(label("Label")), Seq(prop(" x", "prop")), NodeKey, Some("constraintName"), NoOptions)),
      " x", label("Label"), Seq(prop(" x", "prop")), Some("constraintName"), NoOptions), 63.2),
      planDescription(id, "CreateConstraint", SingleChild(
        planDescription(id, "DoNothingIfExists(CONSTRAINT)", NoChildren, Seq(details("CONSTRAINT constraintName FOR (` x`:Label) REQUIRE (` x`.prop) IS NODE KEY")), Set.empty)
      ), Seq(details("CONSTRAINT constraintName FOR (` x`:Label) REQUIRE (` x`.prop) IS NODE KEY")), Set.empty))

    assertGood(attach(CreateNodeKeyConstraint(None, " x", label("Label"), Seq(prop(" x", "prop")), None, OptionsParam(parameter("options", CTMap))), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS NODE KEY OPTIONS $options")), Set.empty))
  }

  test("CreateNodePropertyExistenceConstraint") {
    assertGood(attach(CreateNodePropertyExistenceConstraint(None, label("Label"), prop(" x", "prop"), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS NOT NULL")), Set.empty))

    assertGood(attach(CreateNodePropertyExistenceConstraint(None, label("Label"), prop("x","prop"), Some("constraintName"), NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT constraintName FOR (x:Label) REQUIRE (x.prop) IS NOT NULL")), Set.empty))

    assertGood(attach(CreateNodePropertyExistenceConstraint(Some(DoNothingIfExistsForConstraint(" x", scala.util.Left(label("Label")), Seq(prop(" x", "prop")), NodePropertyExistence, None, NoOptions)),
      label("Label"), prop(" x", "prop"), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", SingleChild(
        planDescription(id, "DoNothingIfExists(CONSTRAINT)", NoChildren, Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS NOT NULL")), Set.empty)
      ), Seq(details("CONSTRAINT FOR (` x`:Label) REQUIRE (` x`.prop) IS NOT NULL")), Set.empty))
  }

  test("CreateRelationshipPropertyExistenceConstraint") {
    assertGood(attach(CreateRelationshipPropertyExistenceConstraint(None, relType("R"), prop(" x", "prop"), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT FOR ()-[` x`:R]-() REQUIRE (` x`.prop) IS NOT NULL")), Set.empty))

    assertGood(attach(CreateRelationshipPropertyExistenceConstraint(None, relType("R"), prop(" x", "prop"), Some("constraintName"), NoOptions), 63.2),
      planDescription(id, "CreateConstraint", NoChildren, Seq(details("CONSTRAINT constraintName FOR ()-[` x`:R]-() REQUIRE (` x`.prop) IS NOT NULL")), Set.empty))

    assertGood(attach(CreateRelationshipPropertyExistenceConstraint(Some(DoNothingIfExistsForConstraint(" x", scala.util.Right(relType("R")), Seq(prop(" x", "prop")), RelationshipPropertyExistence, None, NoOptions)),
      relType("R"), prop(" x", "prop"), None, NoOptions), 63.2),
      planDescription(id, "CreateConstraint", SingleChild(
        planDescription(id, "DoNothingIfExists(CONSTRAINT)", NoChildren, Seq(details("CONSTRAINT FOR ()-[` x`:R]-() REQUIRE (` x`.prop) IS NOT NULL")), Set.empty)
      ), Seq(details("CONSTRAINT FOR ()-[` x`:R]-() REQUIRE (` x`.prop) IS NOT NULL")), Set.empty))
  }

  test("DropUniquePropertyConstraint") {
    assertGood(attach(DropUniquePropertyConstraint(label("Label"), Seq(prop(" x", "prop"), prop(" x", "prop2"))), 63.2),
      planDescription(id, "DropConstraint", NoChildren, Seq(details("CONSTRAINT ON (` x`:Label) ASSERT (` x`.prop, ` x`.prop2) IS UNIQUE")), Set.empty))
  }

  test("DropNodeKeyConstraint") {
    assertGood(attach(DropNodeKeyConstraint(label("Label"), Seq(prop(" x", "prop"), prop(" x", "prop2"))), 63.2),
      planDescription(id, "DropConstraint", NoChildren, Seq(details("CONSTRAINT ON (` x`:Label) ASSERT (` x`.prop, ` x`.prop2) IS NODE KEY")), Set.empty))
  }

  test("DropNodePropertyExistenceConstraint") {
    assertGood(attach(DropNodePropertyExistenceConstraint(label("Label"), prop("x", " prop")), 63.2),
      planDescription(id, "DropConstraint", NoChildren, Seq(details("CONSTRAINT ON (x:Label) ASSERT exists(x.` prop`)")), Set.empty))
  }

  test("DropRelationshipPropertyExistenceConstraint") {
    assertGood(attach(DropRelationshipPropertyExistenceConstraint(relType("$R"), prop("x", " prop")), 63.2),
      planDescription(id, "DropConstraint", NoChildren, Seq(details("CONSTRAINT ON ()-[x:`$R`]-() ASSERT exists(x.` prop`)")), Set.empty))
  }

  test("DropConstraintOnName") {
    assertGood(attach(DropConstraintOnName("name", ifExists = false), 63.2),
      planDescription(id, "DropConstraint", NoChildren, Seq(details("CONSTRAINT name")), Set.empty))

    assertGood(attach(DropConstraintOnName("name", ifExists = true), 63.2),
      planDescription(id, "DropConstraint", NoChildren, Seq(details("CONSTRAINT name")), Set.empty))
  }

  test("ShowConstraints") {
    assertGood(attach(ShowConstraints(constraintType = AllConstraints, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowConstraints", NoChildren, Seq(details("allConstraints, defaultColumns")), Set.empty))

    assertGood(attach(ShowConstraints(constraintType = UniqueConstraints, verbose = true, List.empty), 1.0),
      planDescription(id, "ShowConstraints", NoChildren, Seq(details("uniquenessConstraints, allColumns")), Set.empty))

    assertGood(attach(ShowConstraints(constraintType = NodeKeyConstraints, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowConstraints", NoChildren, Seq(details("nodeKeyConstraints, defaultColumns")), Set.empty))

    assertGood(attach(ShowConstraints(constraintType = ExistsConstraints(NewSyntax), verbose = true, List.empty), 1.0),
      planDescription(id, "ShowConstraints", NoChildren, Seq(details("existenceConstraints, allColumns")), Set.empty))

    assertGood(attach(ShowConstraints(constraintType = NodeExistsConstraints(), verbose = false, List.empty), 1.0),
      planDescription(id, "ShowConstraints", NoChildren, Seq(details("nodeExistenceConstraints, defaultColumns")), Set.empty))

    assertGood(attach(ShowConstraints(constraintType = RelExistsConstraints(), verbose = true, List.empty), 1.0),
      planDescription(id, "ShowConstraints", NoChildren, Seq(details("relationshipExistenceConstraints, allColumns")), Set.empty))
  }

  test("ShowProcedures") {
    assertGood(attach(ShowProcedures(None, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowProcedures", NoChildren, Seq(details("proceduresForUser(all), defaultColumns")), Set.empty))

    assertGood(attach(ShowProcedures(Some(CurrentUser), verbose = true, List.empty), 1.0),
      planDescription(id, "ShowProcedures", NoChildren, Seq(details("proceduresForUser(current), allColumns")), Set.empty))

    assertGood(attach(ShowProcedures(Some(User("foo")), verbose = false, List.empty), 1.0),
      planDescription(id, "ShowProcedures", NoChildren, Seq(details("proceduresForUser(foo), defaultColumns")), Set.empty))
  }

  test("ShowFunctions") {
    assertGood(attach(ShowFunctions(AllFunctions, None, verbose = false, List.empty), 1.0),
      planDescription(id, "ShowFunctions", NoChildren, Seq(details("allFunctions, functionsForUser(all), defaultColumns")), Set.empty))

    assertGood(attach(ShowFunctions(BuiltInFunctions, Some(CurrentUser), verbose = true, List.empty), 1.0),
      planDescription(id, "ShowFunctions", NoChildren, Seq(details("builtInFunctions, functionsForUser(current), allColumns")), Set.empty))

    assertGood(attach(ShowFunctions(UserDefinedFunctions, Some(User("foo")), verbose = false, List.empty), 1.0),
      planDescription(id, "ShowFunctions", NoChildren, Seq(details("userDefinedFunctions, functionsForUser(foo), defaultColumns")), Set.empty))
  }

  test("ShowTransactions") {
    assertGood(attach(ShowTransactions(Left(List.empty), verbose = false, List.empty), 1.0),
      planDescription(id, "ShowTransactions", NoChildren, Seq(details("defaultColumns, allTransactions")), Set.empty))

    assertGood(attach(ShowTransactions(Left(List("db1-transaction-123")), verbose = true, List.empty), 1.0),
      planDescription(id, "ShowTransactions", NoChildren, Seq(details("allColumns, transactions: db1-transaction-123")), Set.empty))

    assertGood(attach(ShowTransactions(Left(List("db1-transaction-123", "db2-transaction-456")), verbose = false, List.empty), 1.0),
      planDescription(id, "ShowTransactions", NoChildren, Seq(details("defaultColumns, transactions: db1-transaction-123, db2-transaction-456")), Set.empty))

    assertGood(attach(ShowTransactions(Right(ExplicitParameter("foo", CTAny)(pos)), verbose = true, List.empty), 1.0),
      planDescription(id, "ShowTransactions", NoChildren, Seq(details("allColumns, transactions: $foo")), Set.empty))
  }

  test("TerminateTransactions") {
    assertGood(attach(TerminateTransactions(Left(List("db1-transaction-123")), List.empty), 1.0),
      planDescription(id, "TerminateTransactions", NoChildren, Seq(details("transactions: db1-transaction-123")), Set.empty))

    assertGood(attach(TerminateTransactions(Left(List("db1-transaction-123", "db2-transaction-456")), List.empty), 1.0),
      planDescription(id, "TerminateTransactions", NoChildren, Seq(details("transactions: db1-transaction-123, db2-transaction-456")), Set.empty))

    assertGood(attach(TerminateTransactions(Right(ExplicitParameter("foo", CTAny)(pos)), List.empty), 1.0),
      planDescription(id, "TerminateTransactions", NoChildren, Seq(details("transactions: $foo")), Set.empty))
  }

  test("Aggregation") {
    // Aggregation 1 grouping, 0 aggregating
    assertGood(
      attach(Aggregation(lhsLP, Map("a" -> varFor("a")), Map.empty), 17.5),
      planDescription(id, "EagerAggregation", SingleChild(lhsPD), Seq(details("a")), Set("a")))

    // Aggregation 2 grouping, 0 aggregating
    assertGood(
      attach(Aggregation(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c")), Map.empty), 17.5),
      planDescription(id, "EagerAggregation", SingleChild(lhsPD), Seq(details("a, c AS b")), Set("a", "b")))

    val countFunction = FunctionInvocation(FunctionName(Count.name)(pos), distinct = false, IndexedSeq(varFor("c")))(pos)
    val collectDistinctFunction = FunctionInvocation(FunctionName(Collect.name)(pos), distinct = true, IndexedSeq(varFor("c")))(pos)

    // Aggregation 1 grouping, 1 aggregating
    assertGood(
      attach(Aggregation(lhsLP, Map("a" -> varFor("a")), Map("count" -> countFunction)), 1.3),
      planDescription(id, "EagerAggregation", SingleChild(lhsPD), Seq(details("a, count(c) AS count")), Set("a", "count")))

    // Aggregation 2 grouping, 2 aggregating
    assertGood(
      attach(Aggregation(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c")), Map("count(c)" -> countFunction, "collect" -> collectDistinctFunction)), 1.3),
      planDescription(id, "EagerAggregation", SingleChild(lhsPD), Seq(details("a, c AS b, count(c) AS `count(c)`, collect(DISTINCT c) AS collect")), Set("a", "b", "`count(c)`", "collect")))

    // Distinct 1 grouping
    assertGood(
      attach(Distinct(lhsLP, Map("  a@23" -> varFor("  a@23"))), 45.9),
      planDescription(id, "Distinct", SingleChild(lhsPD), Seq(details("a")), Set("a")))

    // Distinct 2 grouping
    assertGood(
      attach(Distinct(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c"))), 45.9),
      planDescription(id, "Distinct", SingleChild(lhsPD), Seq(details("a, c AS b")), Set("a", "b")))

    // OrderedDistinct 1 column, 1 sorted
    assertGood(
      attach(OrderedDistinct(lhsLP, Map("a" -> varFor("a")), Seq(varFor("a"))), 45.9),
      planDescription(id, "OrderedDistinct", SingleChild(lhsPD), Seq(details("a")), Set("a")))

    // OrderedDistinct 3 column, 2 sorted
    assertGood(
      attach(OrderedDistinct(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c"), "d" -> varFor("d")), Seq(varFor("d"), varFor("a"))), 45.9),
      planDescription(id, "OrderedDistinct", SingleChild(lhsPD), Seq(details("d, a, c AS b")), Set("a", "b", "d")))

    // OrderedAggregation 1 grouping, 0 aggregating, 1 sorted
    assertGood(
      attach(OrderedAggregation(lhsLP, Map("a" -> varFor("a")), Map.empty, Seq(varFor("a"))), 17.5),
      planDescription(id, "OrderedAggregation", SingleChild(lhsPD), Seq(details("a")), Set("a")))

    // OrderedAggregation 3 grouping, 0 aggregating, 2 sorted
    assertGood(
      attach(OrderedAggregation(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c"), "d" -> varFor("d")), Map.empty, Seq(varFor("d"), varFor("a"))), 17.5),
      planDescription(id, "OrderedAggregation", SingleChild(lhsPD), Seq(details("d, a, c AS b")), Set("a", "b", "d")))

    // OrderedAggregation 3 grouping, 1 aggregating with alias, 2 sorted
    assertGood(
      attach(OrderedAggregation(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c"), "d" -> varFor("d")), Map("count" -> countFunction), Seq(varFor("d"), varFor("a"))), 1.3),
      planDescription(id, "OrderedAggregation", SingleChild(lhsPD), Seq(details("d, a, c AS b, count(c) AS count")), Set("a", "b", "d", "count")))

    // OrderedAggregation 3 grouping, 1 aggregating without alias, 2 sorted
    assertGood(
      attach(OrderedAggregation(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c"), "d" -> varFor("d")), Map("collect(DISTINCT c)" -> collectDistinctFunction), Seq(varFor("d"), varFor("a"))), 1.3),
      planDescription(id, "OrderedAggregation", SingleChild(lhsPD), Seq(details("d, a, c AS b, collect(DISTINCT c) AS `collect(DISTINCT c)`")), Set("a", "b", "d", "`collect(DISTINCT c)`")))

    // OrderedAggregation 3 grouping, 1 aggregating with alias, sorted on aliased column
    assertGood(
      attach(OrderedAggregation(lhsLP, Map("a" -> varFor("a"), "b" -> varFor("c"), "d" -> varFor("d")), Map("collect(DISTINCT c)" -> collectDistinctFunction), Seq(varFor("d"), varFor("c"))), 1.3),
      planDescription(id, "OrderedAggregation", SingleChild(lhsPD), Seq(details("d, c AS b, a, collect(DISTINCT c) AS `collect(DISTINCT c)`")), Set("a", "b", "d", "`collect(DISTINCT c)`")))
  }

  test("FunctionInvocation") {
    val namespace = List("ns")
    val name = "datetime"
    val args = IndexedSeq(number("23391882379"))
    val functionSignature = UserFunctionSignature(
      QualifiedName(Seq.empty, "datetime"),
      IndexedSeq(FieldSignature("Input", CTAny, Some(stringValue("DEFAULT_TEMPORAL_ARGUMENT")))),
      BooleanType.instance, None, None, isAggregate = false, 1, builtIn = true
    )

    val functionInvocation = FunctionInvocation(
      namespace = Namespace(namespace)(pos),
      functionName = FunctionName(name)(pos),
      distinct = false,
      args = args,
    )(pos)
    assertGood(attach(SetRelationshipProperty(lhsLP, "x", key("prop"), functionInvocation), 1.0),
      planDescription(id, "SetProperty", SingleChild(lhsPD), Seq(details("x.prop = ns.datetime(23391882379)")), Set("a", "x")))

    val resolvedFunctionInvocation = ResolvedFunctionInvocation(
      qualifiedName = QualifiedName(namespace, name),
      fcnSignature = Some(functionSignature),
      callArguments = args)(pos)
    assertGood(attach(SetRelationshipProperty(lhsLP, "x", key("prop"), resolvedFunctionInvocation), 1.0),
      planDescription(id, "SetProperty", SingleChild(lhsPD), Seq(details("x.prop = ns.datetime(23391882379)")), Set("a", "x")))
  }

  test("Create") {
    val properties = MapExpression(Seq(
      (key("y"), number("1")),
      (key("crs"), stringLiteral("cartesian"))))(pos)

    assertGood(
      attach(Create(lhsLP, Seq(CreateNode("x", Seq.empty, None)), Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, None))), 32.2),
      planDescription(id, "Create", SingleChild(lhsPD), Seq(details(Seq("(x)", "(x)<-[r:R]-(y)"))), Set("a", "x", "r")))

    assertGood(
      attach(Create(lhsLP, Seq(CreateNode("x", Seq(label("Label")), None)), Seq(CreateRelationship("  UNNAMED67", "x", relType("R"), "y", SemanticDirection.INCOMING, None))), 32.2),
      planDescription(id, "Create", SingleChild(lhsPD), Seq(details(Seq("(x:Label)", s"(x)<-[${anonVar("67")}:R]-(y)"))), Set("a", "x", anonVar("67"))))

    assertGood(
      attach(Create(lhsLP, Seq(CreateNode("x", Seq(label("Label1"), label("Label2")), None)), Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, None))), 32.2),
      planDescription(id, "Create", SingleChild(lhsPD), Seq(details(Seq("(x:Label1:Label2)", "(x)<-[r:R]-(y)"))), Set("a", "x", "r")))

    assertGood(
      attach(Create(lhsLP, Seq(CreateNode("x", Seq(label("Label")), Some(properties))), Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, Some(properties)))), 32.2),
      planDescription(id, "Create", SingleChild(lhsPD), Seq(details(Seq("(x:Label {y: 1, crs: \"cartesian\"})", "(x)<-[r:R {y: 1, crs: \"cartesian\"}]-(y)"))), Set("a", "x", "r")))
  }

  test("Merge") {
    val properties = MapExpression(Seq(
      (key("x"), number("1")),
      (key("y"), stringLiteral("two"))))(pos)

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq.empty, None)), Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, None)),
        Seq.empty, Seq.empty, Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x), (x)<-[r:R]-(y)"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq(label("L")), None)), Seq.empty,
        Seq(SetLabelPattern("x", Seq(label("NEW")))), Seq.empty, Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x:L)", "ON MATCH SET x:NEW"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq(label("L")), None)), Seq.empty,
        Seq.empty, Seq(SetLabelPattern("x", Seq(label("NEW")))), Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x:L)", "ON CREATE SET x:NEW"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq(label("L")), None)), Seq.empty,
        Seq(SetLabelPattern("x", Seq(label("ON_MATCH")))), Seq(SetLabelPattern("x", Seq(label("ON_CREATE")))), Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x:L)", "ON MATCH SET x:ON_MATCH", "ON CREATE SET x:ON_CREATE"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq.empty, Some(properties))), Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, Some(properties))),
        Seq.empty, Seq.empty, Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x: {x: 1, y: \"two\"}), (x)<-[r:R {x: 1, y: \"two\"}]-(y)"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq(label("L")), Some(properties))), Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, Some(properties))),
        Seq.empty, Seq.empty, Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x:L {x: 1, y: \"two\"}), (x)<-[r:R {x: 1, y: \"two\"}]-(y)"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq.empty, Seq(CreateRelationship("r", "x", relType("R"), "y", SemanticDirection.INCOMING, None)),
        Seq.empty, Seq.empty, Set("x", "y")), 32.2),
      planDescription(id, "LockingMerge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x)<-[r:R]-(y)", "LOCK(x, y)"))), Set("a")))

    assertGood(
      attach(Merge(lhsLP, Seq(CreateNode("x", Seq(label("L")), None)), Seq.empty,
        Seq(SetNodePropertiesPattern("x", Seq((key("p1"), number("1")), (key("p2"), number("2"))))), Seq.empty, Set.empty), 32.2),
      planDescription(id, "Merge", SingleChild(lhsPD), Seq(details(Seq("CREATE (x:L)", "ON MATCH SET x.p1 = 1, x.p2 = 2"))), Set("a")))

  }

  test("foreach") {
    assertGood(
      attach(Foreach(lhsLP, "i", parameter("p", CTList(CTInteger)), Seq(SetNodePropertyPattern("x", PropertyKeyName("prop")(InputPosition.NONE), stringLiteral("foo")))), 32.2),
      planDescription(id, "Foreach", SingleChild(lhsPD), Seq(details(Seq("i IN $p", "SET x.prop = \"foo\""))), Set("a")))

    assertGood(
      attach(Foreach(lhsLP, "i", parameter("p", CTList(CTInteger)), Seq(RemoveLabelPattern("x", Seq(label("L"), label("M"))))), 32.2),
      planDescription(id, "Foreach", SingleChild(lhsPD), Seq(details(Seq("i IN $p", "REMOVE x:L:M"))), Set("a")))

    assertGood(
      attach(Foreach(lhsLP, "i", parameter("p", CTList(CTInteger)), Seq(ir.DeleteExpression(varFor("x"), forced = true))), 32.2),
      planDescription(id, "Foreach", SingleChild(lhsPD), Seq(details(Seq("i IN $p", "DETACH DELETE x"))), Set("a")))
    assertGood(
      attach(Foreach(lhsLP, "i", parameter("p", CTList(CTInteger)), Seq(ir.DeleteExpression(varFor("x"), forced = false))), 32.2),
      planDescription(id, "Foreach", SingleChild(lhsPD), Seq(details(Seq("i IN $p", "DELETE x"))), Set("a")))
  }

  test("Delete") {
    assertGood(attach(DeleteExpression(lhsLP, prop("x", "prop")), 34.5),
      planDescription(id, "Delete", SingleChild(lhsPD), Seq(details("x.prop")), Set("a")))

    assertGood(attach(DeleteNode(lhsLP, varFor("x")), 34.5),
      planDescription(id, "Delete", SingleChild(lhsPD), Seq(details("x")), Set("a")))

    assertGood(attach(DeletePath(lhsLP, varFor("x")), 34.5),
      planDescription(id, "Delete", SingleChild(lhsPD), Seq(details("x")), Set("a")))

    assertGood(attach(DeleteRelationship(lhsLP, varFor("x")), 34.5),
      planDescription(id, "Delete", SingleChild(lhsPD), Seq(details("x")), Set("a")))

    assertGood(attach(DetachDeleteExpression(lhsLP, varFor("x")), 34.5),
      planDescription(id, "DetachDelete", SingleChild(lhsPD), Seq(details("x")), Set("a")))

    assertGood(attach(DetachDeleteNode(lhsLP, varFor("x")), 34.5),
      planDescription(id, "DetachDelete", SingleChild(lhsPD), Seq(details("x")), Set("a")))

    assertGood(attach(DetachDeletePath(lhsLP, varFor("x")), 34.5),
      planDescription(id, "DetachDelete", SingleChild(lhsPD), Seq(details("x")), Set("a")))
  }

  test("Eager") {
    assertGood(attach(Eager(lhsLP, Seq.empty), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq.empty, Set("a")))

    assertGood(attach(Eager(lhsLP, Seq(EagernessReason.Unknown)), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq.empty, Set("a")))

    assertGood(attach(Eager(lhsLP, Seq(EagernessReason.UpdateStrategyEager)), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq(details(Seq("updateStrategy=eager"))), Set("a")))

    assertGood(attach(Eager(lhsLP, Seq(EagernessReason.OverlappingDeletedLabels(Seq("Foo", "Bar")))), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq(details(Seq("overlapping remove labels: Foo, Bar"))), Set("a")))

    assertGood(attach(Eager(lhsLP, Seq(EagernessReason.OverlappingSetLabels(Seq("Foo", "Bar")))), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq(details(Seq("overlapping set labels: Foo, Bar"))), Set("a")))

    assertGood(attach(Eager(lhsLP, Seq(EagernessReason.DeleteOverlap(Seq("b")))), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq(details(Seq("delete overlap: b"))), Set("a")))

    assertGood(attach(Eager(lhsLP, Seq(EagernessReason.DeleteOverlap(Seq("b")), EagernessReason.OverlappingSetLabels(Seq("Foo")))), 34.5),
      planDescription(id, "Eager", SingleChild(lhsPD), Seq(details(Seq("delete overlap: b", "overlapping set labels: Foo"))), Set("a")))
  }

  test("EmptyResult") {
    assertGood(attach(EmptyResult(lhsLP), 34.5),
      planDescription(id, "EmptyResult", SingleChild(lhsPD), Seq.empty, Set("a")))
  }

  test("ErrorPlan") {
    assertGood(attach(ErrorPlan(lhsLP, new Exception("Exception")), 12.5),
      planDescription(id, "Error", SingleChild(lhsPD), Seq.empty, Set("a")))
  }

  test("Expand") {
    assertGood(attach(Expand(lhsLP, "a", OUTGOING, Seq.empty, "  UNNAMED4", "r1", ExpandAll), 95.0),
      planDescription(id, "Expand(All)", SingleChild(lhsPD), Seq(details(s"(a)-[r1]->(${anonVar("4")})")), Set("a", anonVar("4"), "r1")))

    assertGood(attach(Expand(lhsLP, "a", INCOMING, Seq(relType("R")), "y", "r1", ExpandAll), 95.0),
      planDescription(id, "Expand(All)", SingleChild(lhsPD), Seq(details("(a)<-[r1:R]-(y)")), Set("a", "y", "r1")))

    assertGood(attach(Expand(lhsLP, "a", BOTH, Seq(relType("R1"), relType("R2")), "y", "r1", ExpandAll), 95.0),
      planDescription(id, "Expand(All)", SingleChild(lhsPD), Seq(details("(a)-[r1:R1|R2]-(y)")), Set("a", "y", "r1")))

    assertGood(attach(Expand(lhsLP, "a", OUTGOING, Seq.empty, "y", "r1", ExpandInto), 113.0),
      planDescription(id, "Expand(Into)", SingleChild(lhsPD), Seq(details("(a)-[r1]->(y)")), Set("a", "y", "r1")))

    assertGood(attach(Expand(lhsLP, "a", INCOMING, Seq(relType("R")), "y", "r1", ExpandInto), 113.0),
      planDescription(id, "Expand(Into)", SingleChild(lhsPD), Seq(details("(a)<-[r1:R]-(y)")), Set("a", "y", "r1")))

    assertGood(attach(Expand(lhsLP, "a", BOTH, Seq(relType("R1"), relType("R2")), "y", "r1", ExpandInto), 113.0),
      planDescription(id, "Expand(Into)", SingleChild(lhsPD), Seq(details("(a)-[r1:R1|R2]-(y)")), Set("a", "y", "r1")))

    assertGood(attach(Expand(lhsLP, "a", BOTH, Seq(relType("R1"), relType("R2")), "y", "  UNNAMED1", ExpandInto), 113.0),
      planDescription(id, "Expand(Into)", SingleChild(lhsPD), Seq(details(s"(a)-[${anonVar("1")}:R1|R2]-(y)")), Set("a", "y", anonVar("1"))))
  }

  test("Limit") {
    assertGood(attach(Limit(lhsLP, number("1")), 113.0),
      planDescription(id, "Limit", SingleChild(lhsPD), Seq(details("1")), Set("a")))
  }

  test("CachedProperties") {
    assertGood(attach(CacheProperties(lhsLP, Set(cachedProp("n", "prop"))), 113.0),
      planDescription(id, "CacheProperties", SingleChild(lhsPD), Seq(details("cache[n.prop]")), Set("a")))

    assertGood(attach(CacheProperties(lhsLP, Set(prop("n", "prop1"), prop("n", "prop2"))), 113.0),
      planDescription(id, "CacheProperties", SingleChild(lhsPD), Seq(details(Seq("n.prop1", "n.prop2"))), Set("a")))
  }

  test("OptionalExpand") {
    val predicate1 = Equals(varFor("to"), parameter("  AUTOINT2", CTInteger))(pos)
    val predicate2 = LessThan(varFor("a"), number("2002"))(pos)

    // Without predicate
    assertGood(attach(OptionalExpand(lhsLP, "a", INCOMING, Seq(relType("R")), "  UNNAMED5", "r", ExpandAll, None), 12.0),
      planDescription(id, "OptionalExpand(All)", SingleChild(lhsPD), Seq(details(s"(a)<-[r:R]-(${anonVar("5")})")), Set("a", anonVar("5"), "r")))

    // With predicate and no relationship types
    assertGood(attach(OptionalExpand(lhsLP, "a", OUTGOING, Seq(), "to", "r", ExpandAll, Some(predicate1)), 12.0),
      planDescription(id, "OptionalExpand(All)", SingleChild(lhsPD), Seq(details("(a)-[r]->(to) WHERE to = $autoint_2")), Set("a", "to", "r")))

    // With predicate and relationship types
    assertGood(attach(OptionalExpand(lhsLP, "a", BOTH, Seq(relType("R")), "to", "r", ExpandAll, Some(And(predicate1, predicate2)(pos))), 12.0),
      planDescription(id, "OptionalExpand(All)", SingleChild(lhsPD), Seq(details("(a)-[r:R]-(to) WHERE to = $autoint_2 AND a < 2002")), Set("a", "to", "r")))

    // With multiple relationship types
    assertGood(attach(OptionalExpand(lhsLP, "a", INCOMING, Seq(relType("R1"), relType("R2")), "to", "r", ExpandAll, None), 12.0),
      planDescription(id, "OptionalExpand(All)", SingleChild(lhsPD), Seq(details("(a)<-[r:R1|R2]-(to)")), Set("a", "to", "r")))
  }

  test("Projection") {
    val pathExpression = PathExpression(NodePathStep(varFor("c"),SingleRelationshipPathStep(varFor("  UNNAMED42"),OUTGOING,Some(varFor("  UNNAMED32")),NilPathStep()(pos))(pos))(pos))(pos)

    assertGood(attach(Projection(lhsLP, Map("x" -> varFor("y"))), 2345.0),
      planDescription(id, "Projection", SingleChild(lhsPD), Seq(details("y AS x")), Set("a", "x")))

    assertGood(attach(Projection(lhsLP, Map("x" -> pathExpression)), 2345.0),
      planDescription(id, "Projection", SingleChild(lhsPD), Seq(details(s"(c)-[${anonVar("42")}]->(${anonVar("32")}) AS x")), Set("a", "x")))

    assertGood(attach(Projection(lhsLP, Map("x" -> varFor("  UNNAMED42"), "n.prop" -> prop("n", "prop"))), 2345.0),
      planDescription(id, "Projection", SingleChild(lhsPD), Seq(details(Seq(s"${anonVar("42")} AS x", "n.prop AS `n.prop`"))), Set("a", "x", "`n.prop`")))

    // Projection should show up in the order they were specified in
    assertGood(attach(Projection(lhsLP, Map("n.prop" -> prop("n", "prop"), "x" -> varFor("y"))), 2345.0),
      planDescription(id, "Projection", SingleChild(lhsPD), Seq(details(Seq("n.prop AS `n.prop`", "y AS x"))), Set("a", "x", "`n.prop`")))
  }

  test("Selection") {
    val predicate1 = In(varFor("x"), parameter("  AUTOLIST1", CTList(CTInteger)))(pos)
    val predicate2 = LessThan(prop("a", "prop1"), number("2002"))(pos)
    val predicate3 = GreaterThanOrEqual(cachedProp("a", "prop1"), number("1001"))(pos)
    val predicate4 = AndedPropertyInequalities(varFor("a"), prop("a", "prop"), NonEmptyList(predicate2, predicate3))

    assertGood(attach(Selection(Seq(predicate1, predicate4), lhsLP), 2345.0),
      planDescription(id, "Filter", SingleChild(lhsPD), Seq(details("x IN $autolist_1 AND a.prop1 < 2002 AND cache[a.prop1] >= 1001")), Set("a")))
  }

  test("Skip") {
    assertGood(attach(Skip(lhsLP, number("78")), 2345.0),
      planDescription(id, "Skip", SingleChild(lhsPD), Seq(details("78")), Set("a")))
  }

  test("FindShortestPaths") {
    val predicate = Equals(prop("r", "prop"), parameter("  AUTOSTRING1", CTString))(pos)

    // with(out) relationship types
    // length variations

    // without: predicates, path name, relationship type
    assertGood(attach(FindShortestPaths(lhsLP, ShortestPathPattern(None, PatternRelationship("r", ("  UNNAMED23", "y"), SemanticDirection.BOTH, Seq.empty, VarPatternLength(2, Some(4))), single = true)(null), Seq.empty), 2345.0),
      planDescription(id, "ShortestPath", SingleChild(lhsPD), Seq(details(s"(${anonVar("23")})-[r*2..4]-(y)")), Set("r", "a", anonVar("23"), "y")))

    // with: predicates, path name, relationship type
    assertGood(attach(FindShortestPaths(lhsLP, ShortestPathPattern(Some("  UNNAMED12"), PatternRelationship("r", ("a", "y"), SemanticDirection.BOTH, Seq(relType("R")), VarPatternLength(2, Some(4))), single = true)(null), Seq(predicate)), 2345.0),
      planDescription(id, "ShortestPath", SingleChild(lhsPD), Seq(details(s"${anonVar("12")} = (a)-[r:R*2..4]-(y) WHERE r.prop = $$autostring_1")), Set("r", "a", "y", anonVar("12"))))

    // with: predicates, UNNAMED variables, relationship type, unbounded max length
    assertGood(attach(FindShortestPaths(lhsLP, ShortestPathPattern(None, PatternRelationship("r", ("a", "  UNNAMED2"), SemanticDirection.BOTH, Seq(relType("R")), VarPatternLength(2, None)), single = true)(null), Seq(predicate)), 2345.0),
      planDescription(id, "ShortestPath", SingleChild(lhsPD), Seq(details(s"(a)-[r:R*2..]-(${anonVar("2")}) WHERE r.prop = $$autostring_1")), Set("r", "a", anonVar("2"))))
  }

  test("Optional") {
    assertGood(attach(Optional(lhsLP, Set("a")), 113.0),
      planDescription(id, "Optional", SingleChild(lhsPD), Seq(details("a")), Set("a")))
  }

  test("Anti") {
    assertGood(attach(Anti(lhsLP), 113.0),
      planDescription(id, "Anti", SingleChild(lhsPD), Seq.empty, Set("a")))
  }

  test("ProjectEndpoints") {
    assertGood(attach(ProjectEndpoints(lhsLP, "r", "start", startInScope = true, "end", endInScope = true, None, directed = true, VarPatternLength(1, Some(1))), 234.2),
      planDescription(id, "ProjectEndpoints", SingleChild(lhsPD), Seq(details("(start)-[r]->(end)")), Set("a", "start", "r", "end")))

    assertGood(attach(ProjectEndpoints(lhsLP, "r", "start", startInScope = true, "end", endInScope = true, Some(Seq(relType("R"))), directed = false, VarPatternLength(1, Some(3))), 234.2),
      planDescription(id, "ProjectEndpoints(BOTH)", SingleChild(lhsPD), Seq(details("(start)-[r:R*..3]-(end)")), Set("a", "start", "r", "end")))
  }

  test("VarExpand") {
    val predicate = (varName: String) => Equals(prop(varName, "prop"), parameter("  AUTODOUBLE1", CTFloat))(pos)
    val nodePredicate = VariablePredicate(varFor("x"), predicate("x"))
    val relationshipPredicate = VariablePredicate(varFor("r"), predicate("r"))

    // -- PruningVarExpand --

    // With nodePredicate and relationshipPredicate
    assertGood(attach(PruningVarExpand(lhsLP, "a", SemanticDirection.OUTGOING, Seq(relType("R")), "y", 1, 4, Some(nodePredicate), Some(relationshipPredicate)), 1.0),
      planDescription(id, "VarLengthExpand(Pruning)", SingleChild(lhsPD), Seq(details("(a)-[r:R*..4]->(y) WHERE x.prop = $autodouble_1 AND r.prop = $autodouble_1")), Set("a", "y")))

    // With nodePredicate, without relationshipPredicate
    assertGood(attach(PruningVarExpand(lhsLP, "a", SemanticDirection.OUTGOING, Seq(relType("R")), "y", 2, 4, Some(nodePredicate), None), 1.0),
      planDescription(id, "VarLengthExpand(Pruning)", SingleChild(lhsPD), Seq(details("(a)-[:R*2..4]->(y) WHERE x.prop = $autodouble_1")), Set("a", "y")))

    // Without predicates, without relationship type
    assertGood(attach(PruningVarExpand(lhsLP, "a", SemanticDirection.OUTGOING, Seq(), "y", 2, 4, None, None), 1.0),
      planDescription(id, "VarLengthExpand(Pruning)", SingleChild(lhsPD), Seq(details("(a)-[*2..4]->(y)")), Set("a", "y")))

    // -- VarExpand --

    // With unnamed variables, without predicates
    assertGood(attach(VarExpand(lhsLP, "a", INCOMING, INCOMING, Seq(relType("LIKES"), relType("LOVES")), "  UNNAMED123", "  UNNAMED99", VarPatternLength(1, Some(1)), ExpandAll), 1.0),
      planDescription(id, "VarLengthExpand(All)", SingleChild(lhsPD), Seq(details(s"(a)<-[${anonVar("99")}:LIKES|LOVES]-(${anonVar("123")})")), Set("a", anonVar("99"), anonVar("123"))))

    // With nodePredicate and relationshipPredicate
    assertGood(attach(VarExpand(lhsLP, "a", INCOMING, INCOMING, Seq(relType("LIKES"), relType("LOVES")), "to", "rel", VarPatternLength(1, Some(1)), ExpandAll, Some(nodePredicate), Some(relationshipPredicate)), 1.0),
      planDescription(id, "VarLengthExpand(All)", SingleChild(lhsPD), Seq(details("(a)<-[rel:LIKES|LOVES]-(to) WHERE x.prop = $autodouble_1 AND r.prop = $autodouble_1")), Set("a", "to", "rel")))

    // With nodePredicate, without relationshipPredicate, with length
    assertGood(attach(VarExpand(lhsLP, "a", INCOMING, INCOMING, Seq(relType("LIKES"), relType("LOVES")), "to", "rel", VarPatternLength(2, Some(3)), ExpandAll, Some(nodePredicate)), 1.0),
      planDescription(id, "VarLengthExpand(All)", SingleChild(lhsPD), Seq(details("(a)<-[rel:LIKES|LOVES*2..3]-(to) WHERE x.prop = $autodouble_1")), Set("a", "to", "rel")))

    // With unbounded length
    assertGood(attach(VarExpand(lhsLP, "a", OUTGOING, OUTGOING, Seq(relType("LIKES"), relType("LOVES")), "to", "rel", VarPatternLength(2, None), ExpandAll), 1.0),
      planDescription(id, "VarLengthExpand(All)", SingleChild(lhsPD), Seq(details("(a)-[rel:LIKES|LOVES*2..]->(to)")), Set("a", "to", "rel")))
  }

  test("Updates") {
    // RemoveLabels
    assertGood(attach(RemoveLabels(lhsLP, "x", Seq(label("L1"))), 1.0),
      planDescription(id, "RemoveLabels", SingleChild(lhsPD), Seq(details("x:L1")), Set("a", "x")))

    assertGood(attach(RemoveLabels(lhsLP, "x", Seq(label("L1"), label("L2"))), 1.0),
      planDescription(id, "RemoveLabels", SingleChild(lhsPD), Seq(details("x:L1:L2")), Set("a", "x")))

    // SetLabels
    assertGood(attach(SetLabels(lhsLP, "x", Seq(label("L1"))), 1.0),
      planDescription(id, "SetLabels", SingleChild(lhsPD), Seq(details("x:L1")), Set("a", "x")))

    assertGood(attach(SetLabels(lhsLP, "x", Seq(label("L1"), label("L2"))), 1.0),
      planDescription(id, "SetLabels", SingleChild(lhsPD), Seq(details("x:L1:L2")), Set("a", "x")))

    val map = MapExpression(Seq(
      (key("foo"), number("1")),
      (key("bar"), number("2"))
    ))(pos)
    val prettifiedMapExpr = "{foo: 1, bar: 2}"

    // Set From Map
    assertGood(attach(SetNodePropertiesFromMap(lhsLP, "x", map, removeOtherProps = true), 1.0),
      planDescription(id, "SetNodePropertiesFromMap", SingleChild(lhsPD), Seq(details(s"x = $prettifiedMapExpr")), Set("a", "x")))

    assertGood(attach(SetNodePropertiesFromMap(lhsLP, "x", map, removeOtherProps = false), 1.0),
      planDescription(id, "SetNodePropertiesFromMap", SingleChild(lhsPD), Seq(details(s"x += $prettifiedMapExpr")), Set("a", "x")))

    assertGood(attach(SetRelationshipPropertiesFromMap(lhsLP, "x", map, removeOtherProps = true), 1.0),
      planDescription(id, "SetRelationshipPropertiesFromMap", SingleChild(lhsPD), Seq(details(s"x = $prettifiedMapExpr")), Set("a", "x")))

    assertGood(attach(SetRelationshipPropertiesFromMap(lhsLP, "x", map, removeOtherProps = false), 1.0),
      planDescription(id, "SetRelationshipPropertiesFromMap", SingleChild(lhsPD), Seq(details(s"x += $prettifiedMapExpr")), Set("a", "x")))

    assertGood(attach(SetPropertiesFromMap(lhsLP, varFor("x"), map, removeOtherProps = true), 1.0),
      planDescription(id, "SetPropertiesFromMap", SingleChild(lhsPD), Seq(details(s"x = $prettifiedMapExpr")), Set("a")))

    assertGood(attach(SetPropertiesFromMap(lhsLP, varFor("x"), map, removeOtherProps = false), 1.0),
      planDescription(id, "SetPropertiesFromMap", SingleChild(lhsPD), Seq(details(s"x += $prettifiedMapExpr")), Set("a")))

    // Set
    assertGood(attach(SetProperty(lhsLP, varFor("x"), key("prop"), number("1")), 1.0),
      planDescription(id, "SetProperty", SingleChild(lhsPD), Seq(details("x.prop = 1")), Set("a")))

    assertGood(attach(SetNodeProperty(lhsLP, "x", key("prop"), number("1")), 1.0),
      planDescription(id, "SetProperty", SingleChild(lhsPD), Seq(details("x.prop = 1")), Set("a", "x")))

    assertGood(attach(SetRelationshipProperty(lhsLP, "x", key("prop"), number("1")), 1.0),
      planDescription(id, "SetProperty", SingleChild(lhsPD), Seq(details("x.prop = 1")), Set("a", "x")))
    //Set multiple properties
    assertGood(attach(SetProperties(lhsLP, varFor("x"), Seq((key("p1"), number("1")), (key("p2"), number("2")))), 1.0),
      planDescription(id, "SetProperties", SingleChild(lhsPD), Seq(details("x.p1 = 1, x.p2 = 2")), Set("a")))

    assertGood(attach(SetNodeProperties(lhsLP, "x",  Seq((key("p1"), number("1")), (key("p2"), number("2")))), 1.0),
      planDescription(id, "SetProperties", SingleChild(lhsPD), Seq(details("x.p1 = 1, x.p2 = 2")), Set("a", "x")))

    assertGood(attach(SetNodeProperties(lhsLP, "x",  Seq((key("p1"), number("1")), (key("p2"), number("2")))), 1.0),
      planDescription(id, "SetProperties", SingleChild(lhsPD), Seq(details("x.p1 = 1, x.p2 = 2")), Set("a", "x")))

  }

  test("Sort") {
    // Sort
    assertGood(attach(Sort(lhsLP, Seq(Ascending("a"))), 1.0),
      planDescription(id, "Sort", SingleChild(lhsPD), Seq(details("a ASC")), Set("a")))

    assertGood(attach(Sort(lhsLP, Seq(Descending("a"), Ascending("y"))), 1.0),
      planDescription(id, "Sort", SingleChild(lhsPD), Seq(details("a DESC, y ASC")), Set("a")))

    // Top
    assertGood(attach(Top(lhsLP, Seq(Ascending("a")), number("3")), 1.0),
      planDescription(id, "Top", SingleChild(lhsPD), Seq(details("a ASC LIMIT 3")), Set("a")))

    assertGood(attach(Top(lhsLP, Seq(Descending("a"), Ascending("y")), number("3")), 1.0),
      planDescription(id, "Top", SingleChild(lhsPD), Seq(details("a DESC, y ASC LIMIT 3")), Set("a")))

    // Partial Sort
    assertGood(attach(PartialSort(lhsLP, Seq(Ascending("a")), Seq(Descending("y"))), 1.0),
      planDescription(id, "PartialSort", SingleChild(lhsPD), Seq(details("a ASC, y DESC")), Set("a")))

    // Partial Top
    assertGood(attach(PartialTop(lhsLP, Seq(Ascending("a")), Seq(Descending("y")), number("3")), 1.0),
      planDescription(id, "PartialTop", SingleChild(lhsPD), Seq(details("a ASC, y DESC LIMIT 3")), Set("a")))
  }

  test("Unwind") {
    assertGood(attach(UnwindCollection(lhsLP, "x", varFor("list")), 1.0),
      planDescription(id, "Unwind", SingleChild(lhsPD), Seq(details("list AS x")), Set("a", "x")))
  }

  test("PreserveOrder") {
    assertGood(attach(PreserveOrder(lhsLP), 1.0),
               planDescription(id, "PreserveOrder", SingleChild(lhsPD), Seq.empty,  Set("a")))
  }

  test("Admin") {
    val adminPlanDescription: PlanDescriptionImpl = planDescription(id, "AdministrationCommand", NoChildren, Seq.empty, Set.empty)

    assertGood(attach(AllowedNonAdministrationCommands(Query(None, SingleQuery(Seq(ShowProceduresClause(None, None, hasYield = false)(pos)))(pos))(pos)), 1.0), adminPlanDescription)

    assertGood(attach(ShowUsers(privLhsLP, List(), None, None), 1.0), adminPlanDescription)

    assertGood(attach(ShowCurrentUser(List(), None, None), 1.0), adminPlanDescription)

    assertGood(attach(
      CreateUser(privLhsLP, util.Left("name"), isEncryptedPassword = false, varFor("password"), requirePasswordChange = false, suspended = None, defaultDatabase = None),1.0), adminPlanDescription)

    assertGood(attach(RenameUser(privLhsLP, util.Left("user1"), Left("user2")), 1.0), adminPlanDescription)

    assertGood(attach(DropUser(privLhsLP, util.Left("name")), 1.0), adminPlanDescription)

    assertGood(attach(AlterUser(privLhsLP, util.Left("name"), isEncryptedPassword = Some(true), None, requirePasswordChange = Some(true), suspended = Some(false), defaultDatabase = None), 1.0), adminPlanDescription)

    assertGood(attach(SetOwnPassword(stringLiteral("oldPassword"), stringLiteral("newPassword")), 1.0), adminPlanDescription)

    assertGood(attach(ShowRoles(privLhsLP, withUsers = false, showAll = true, List(), None, None), 1.0), adminPlanDescription)

    assertGood(attach(DropRole(privLhsLP, util.Left("role")), 1.0), adminPlanDescription)

    assertGood(attach(CreateRole(privLhsLP, util.Left("role")), 1.0), adminPlanDescription)

    assertGood(attach(RenameRole(privLhsLP, util.Left("role1"), Left("role2")), 1.0), adminPlanDescription)

    assertGood(attach(RequireRole(privLhsLP, util.Left("role")), 1.0), adminPlanDescription)

    assertGood(attach(CopyRolePrivileges(privLhsLP, util.Left("role1"), util.Left("role2"), grantDeny = "DENIED"), 1.0), adminPlanDescription)

    assertGood(attach(GrantRoleToUser(privLhsLP, util.Left("role"), util.Left("user")), 1.0), adminPlanDescription)

    assertGood(attach(RevokeRoleFromUser(privLhsLP, util.Left("role"), util.Left("user")), 1.0), adminPlanDescription)

    assertGood(attach(GrantDbmsAction(privLhsLP, ExecuteProcedureAction, ProcedureAllQualifier()(pos), util.Left("role1")), 1.0), adminPlanDescription)

    assertGood(attach(
      DenyDbmsAction(privLhsLP, ExecuteBoostedProcedureAction, ProcedureQualifier(Namespace(List("apoc"))(pos), ProcedureName("sin")(pos))(pos), util.Left("role1")),
      1.0), adminPlanDescription)

    assertGood(attach(
      RevokeDbmsAction(privLhsLP, ExecuteAdminProcedureAction, ProcedureAllQualifier()(pos), util.Left("role1"), "GRANTED"), 1.0), adminPlanDescription)

    assertGood(attach(
      GrantDatabaseAction(privLhsLP, CreateNodeLabelAction, NamedDatabaseScope(util.Left("foo"))(pos), UserAllQualifier()(pos), util.Left("role1")),
      1.0), adminPlanDescription)

    assertGood(attach(
      DenyDatabaseAction(privLhsLP, CreateNodeLabelAction, AllDatabasesScope()(pos), UserQualifier(util.Left("user1"))(pos), util.Left("role1")),
      1.0), adminPlanDescription)

    assertGood(attach(
      RevokeDatabaseAction(privLhsLP, CreateNodeLabelAction, AllDatabasesScope()(pos), UserQualifier(util.Left("user1"))(pos), util.Left("role1"), "GRANTED"),
      1.0), adminPlanDescription)

    assertGood(attach(
      GrantGraphAction(privLhsLP, TraverseAction, NoResource()(pos), DefaultGraphScope()(pos), LabelQualifier("Label1")(pos), util.Left("role1")),
      1.0), adminPlanDescription)

    assertGood(attach(
      DenyGraphAction(privLhsLP, ReadAction, AllPropertyResource()(pos), DefaultGraphScope()(pos), LabelQualifier("Label1")(pos), util.Left("role1")),
      1.0), adminPlanDescription)

    assertGood(attach(
      RevokeGraphAction(privLhsLP, WriteAction, NoResource()(pos), AllGraphsScope()(pos), ElementsAllQualifier()(pos), util.Left("role1"), "GRANTED"),
      1.0), adminPlanDescription)

    assertGood(attach(
      ShowPrivileges(Some(privLhsLP), ShowUsersPrivileges(List(util.Left("user1"), util.Right(parameter("user2", CTString))))(pos), List(), None, None),
      1.0), adminPlanDescription)

    assertGood(attach(
      ShowPrivilegeCommands(Some(privLhsLP), ShowUsersPrivileges(List(util.Left("user1"), util.Right(parameter("user2", CTString))))(pos), asRevoke = false, List(), None, None),
      1.0), adminPlanDescription)

    assertGood(attach(ShowDatabase(AllDatabasesScope()(pos), false, List("foo", "bar"), None, None), 1.0), adminPlanDescription)

    assertGood(attach(CreateDatabase(privLhsLP, util.Left("db1"), NoOptions), 1.0), adminPlanDescription)

    assertGood(attach(DropDatabase(privLhsLP, util.Left("db1"), DumpData), 1.0), adminPlanDescription)

    assertGood(attach(AlterDatabase(privLhsLP, util.Left("db1"), ReadOnlyAccess), 1.0), adminPlanDescription)

    assertGood(attach(AlterDatabase(privLhsLP, util.Left("db1"), ReadWriteAccess), 1.0), adminPlanDescription)

    assertGood(attach(StartDatabase(privLhsLP, util.Left("db1")), 1.0), adminPlanDescription)

    assertGood(attach(StopDatabase(privLhsLP, util.Left("db1")), 1.0), adminPlanDescription)

    assertGood(attach(EnsureValidNonSystemDatabase(privLhsLP, util.Left("db1"), "action1"), 1.0), adminPlanDescription)

    assertGood(attach(EnsureValidNumberOfDatabases(CreateDatabase(privLhsLP, util.Left("db1"), NoOptions)), 1.0), adminPlanDescription)

    assertGood(attach(LogSystemCommand(privLhsLP, "command1"), 1.0), adminPlanDescription)

    assertGood(attach(DoNothingIfNotExists(privLhsLP, "User", util.Left("user1"), "delete"), 1.0), adminPlanDescription)

    assertGood(attach(DoNothingIfExists(privLhsLP, "User", util.Left("user1")), 1.0), adminPlanDescription)

    assertGood(attach(EnsureNodeExists(privLhsLP, "User", util.Left("user1"), labelDescription = "User", action = "delete"), 1.0), adminPlanDescription)

    assertGood(attach(AssertNotCurrentUser(privLhsLP, util.Left("user1"), "verb1", "validation message"), 1.0), adminPlanDescription)

    assertGood(attach(AssertAllowedDbmsActionsOrSelf(util.Left("user1"), DropRoleAction), 1.0), adminPlanDescription)

    assertGood(attach(AssertAllowedDatabaseAction(StopDatabaseAction, util.Left("db1"), None), 1.0), adminPlanDescription)

    assertGood(attach(AssertNotBlocked(CreateDatabaseAction), 1.0), adminPlanDescription)

    assertGood(attach(WaitForCompletion(
      StartDatabase(
        AssertAllowedDatabaseAction(StartDatabaseAction, Left("db1"), Some(privLhsLP)), Left("db1")), util.Left("db1"), IndefiniteWait), 1.0), adminPlanDescription)
  }

  test("AntiConditionalApply") {
    assertGood(attach(AntiConditionalApply(lhsLP, rhsLP, Seq("c")), 2345.0),
      planDescription(id, "AntiConditionalApply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a", "b", "c")))
  }

  test("AntiSemiApply") {
    assertGood(attach(AntiSemiApply(lhsLP, rhsLP), 2345.0),
      planDescription(id, "AntiSemiApply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a")))
  }

  test("ConditionalApply") {
    assertGood(attach(ConditionalApply(lhsLP, rhsLP, Seq("c")), 2345.0),
      planDescription(id, "ConditionalApply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a", "b", "c")))
  }

  test("Apply") {
    assertGood(attach(Apply(lhsLP, rhsLP), 2345.0),
      planDescription(id, "Apply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a", "b")))
  }

  test("AssertSameNode") {
    assertGood(attach(AssertSameNode("n", lhsLP, rhsLP), 2345.0),
      planDescription(id, "AssertSameNode", TwoChildren(lhsPD, rhsPD), Seq(details(Seq("n"))), Set("a", "b", "n")))
  }

  test("CartesianProduct") {
    assertGood(attach(CartesianProduct(lhsLP, rhsLP), 2345.0),
      planDescription(id, "CartesianProduct", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a", "b")))
  }

  test("NodeHashJoin") {
    assertGood(attach(NodeHashJoin(Set("a"), lhsLP, rhsLP), 2345.0),
      planDescription(id, "NodeHashJoin", TwoChildren(lhsPD, rhsPD), Seq(details("a")), Set("a", "b")))
  }

  test("ForeachApply") {
    val testCases = Seq(
      ("a", ListLiteral(Seq(number("1"), number("2")))(pos)) ->
        "a IN [1, 2]",
      ("b", parameter("param", CTList(CTInteger))) ->
        "b IN $param",
      ("c", ListLiteral(Seq.empty)(pos)) ->
        "c IN []",
      ("d", FunctionInvocation(number("1"), FunctionName("range")(pos), number("100"))) ->
        "d IN range(1, 100)",
    )

    for (((variable, expr), expectedDetails) <- testCases) {
      assertGood(attach(ForeachApply(lhsLP, rhsLP, variable, expr), 2345.0),
        planDescription(id, "Foreach", TwoChildren(lhsPD, rhsPD), Seq(details(expectedDetails)), Set("a")))
    }
  }

  test("LetSelectOrSemiApply") {
    assertGood(attach(LetSelectOrSemiApply(lhsLP, rhsLP, "x", Equals(prop("a", "foo"), number("42"))(pos)), 2345.0),
      planDescription(id, "LetSelectOrSemiApply", TwoChildren(lhsPD, rhsPD), Seq(details("a.foo = 42")), Set("a", "x")))
  }

  test("LetSelectOrAntiSemiApply") {
    assertGood(attach(LetSelectOrAntiSemiApply(lhsLP, rhsLP, "x", Equals(prop("a", "foo"), number("42"))(pos)), 2345.0),
      planDescription(id, "LetSelectOrAntiSemiApply", TwoChildren(lhsPD, rhsPD), Seq(details("a.foo = 42")), Set("a", "x")))
  }

  test("LetSemiApply") {
    assertGood(attach(LetSemiApply(lhsLP, rhsLP, "x"), 2345.0),
      planDescription(id, "LetSemiApply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a", "x")))
  }

  test("LetAntiSemiApply") {
    assertGood(attach(LetAntiSemiApply(lhsLP, rhsLP, "x"), 2345.0),
      planDescription(id, "LetAntiSemiApply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a", "x")))
  }

  test("LeftOuterHashJoin") {
    assertGood(attach(LeftOuterHashJoin(Set("a"), lhsLP, rhsLP), 2345.0),
      planDescription(id, "NodeLeftOuterHashJoin", TwoChildren(lhsPD, rhsPD), Seq(details("a")), Set("a", "b")))
  }

  test("RightOuterHashJoin") {
    assertGood(attach(RightOuterHashJoin(Set("a"), lhsLP, rhsLP), 2345.0),
      planDescription(id, "NodeRightOuterHashJoin", TwoChildren(lhsPD, rhsPD), Seq(details("a")), Set("a", "b")))
  }

  test("RollUpApply") {
    assertGood(attach(RollUpApply(lhsLP, rhsLP, "collection", "x"), 2345.0),
      planDescription(id, "RollUpApply", TwoChildren(lhsPD, rhsPD), Seq(details(Seq("collection", "x"))), Set("a", "collection")))
  }

  test("SelectOrAntiSemiApply") {
    assertGood(attach(SelectOrAntiSemiApply(lhsLP, rhsLP, Equals(prop("a", "foo"), number("42"))(pos)), 2345.0),
      planDescription(id, "SelectOrAntiSemiApply", TwoChildren(lhsPD, rhsPD), Seq(details("a.foo = 42")), Set("a")))
  }

  test("SelectOrSemiApply") {
    assertGood(attach(SelectOrSemiApply(lhsLP, rhsLP, Equals(prop("a", "foo"), number("42"))(pos)), 2345.0),
      planDescription(id, "SelectOrSemiApply", TwoChildren(lhsPD, rhsPD), Seq(details("a.foo = 42")), Set("a")))
  }

  test("SemiApply") {
    assertGood(attach(SemiApply(lhsLP, rhsLP), 2345.0),
      planDescription(id, "SemiApply", TwoChildren(lhsPD, rhsPD), Seq.empty, Set("a")))
  }

  test("TransactionForeach") {
    assertGood(attach(TransactionForeach(lhsLP, rhsLP, number("100")), 2345.0),
      planDescription(id, "TransactionForeach", TwoChildren(lhsPD, rhsPD), Seq(details("IN TRANSACTIONS OF 100 ROWS")), Set("a")))
  }

  test("TransactionApply") {
    assertGood(attach(TransactionApply(lhsLP, rhsLP, number("100")), 2345.0),
      planDescription(id, "TransactionApply", TwoChildren(lhsPD, rhsPD), Seq(details("IN TRANSACTIONS OF 100 ROWS")), Set("a", "b")))
  }

  test("TriadicBuild") {
    assertGood(attach(TriadicBuild(lhsLP, "a", "b", Some(Id(1))), 113.0),
      planDescription(id, "TriadicBuild", SingleChild(lhsPD), Seq(details("(a)--(b)")), Set("a")))
  }

  test("TriadicFilter") {
    assertGood(attach(TriadicFilter(lhsLP, positivePredicate = true, "a", "b", Some(Id(1))), 113.0),
      planDescription(id, "TriadicFilter", SingleChild(lhsPD), Seq(details("WHERE (a)--(b)")), Set("a")))

    assertGood(attach(TriadicFilter(lhsLP, positivePredicate = false, "a", "b", Some(Id(1))), 113.0),
      planDescription(id, "TriadicFilter", SingleChild(lhsPD), Seq(details("WHERE NOT (a)--(b)")), Set("a")))
  }

  test("TriadicSelection") {
    assertGood(attach(TriadicSelection(lhsLP, rhsLP, positivePredicate = true, "a", "b", "c"), 2345.0),
      planDescription(id, "TriadicSelection", TwoChildren(lhsPD, rhsPD), Seq(details("WHERE (a)--(c)")), Set("a", "b")))

    assertGood(attach(TriadicSelection(lhsLP, rhsLP, positivePredicate = false, "a", "b", "c"), 2345.0),
      planDescription(id, "TriadicSelection", TwoChildren(lhsPD, rhsPD), Seq(details("WHERE NOT (a)--(c)")), Set("a", "b")))
  }

  test("Union") {
    // leafs no overlapping variables
    assertGood(attach(Union(lhsLP, rhsLP), 2345.0),
      planDescription(id, "Union", TwoChildren(lhsPD, rhsPD), Seq.empty, Set.empty))

    // leafs with overlapping variables
    val lp = attach(AllNodesScan("a", Set.empty), 2.0, providedOrder = ProvidedOrder.empty)
    val pd = planDescription(id, "AllNodesScan", NoChildren, Seq(details("a")), Set("a"))
    assertGood(attach(Union(lhsLP, lp), 2345.0),
      planDescription(id, "Union", TwoChildren(lhsPD, pd), Seq.empty, Set("a")))
  }

  test("ValueHashJoin") {
    assertGood(attach(ValueHashJoin(lhsLP, rhsLP, Equals(prop("a", "foo"), prop("b", "foo"))(pos)), 2345.0),
      planDescription(id, "ValueHashJoin", TwoChildren(lhsPD, rhsPD), Seq(details("a.foo = b.foo")), Set("a", "b")))
  }

  def assertGood(logicalPlan: LogicalPlan, expectedPlanDescription: InternalPlanDescription, validateAllArgs: Boolean = false): Unit = {
    val producedPlanDescription = LogicalPlan2PlanDescription.create(logicalPlan, IDPPlannerName, CypherVersion.default, readOnly, effectiveCardinalities, withRawCardinalities = false, providedOrders = providedOrders, StubExecutionPlan().operatorMetadata)

    def shouldValidateArg(arg: Argument) =
      validateAllArgs ||
        !(arg.isInstanceOf[PlannerImpl] ||
          arg.isInstanceOf[Planner] ||
          arg.isInstanceOf[EstimatedRows] ||
          arg.isInstanceOf[Version] ||
          arg.isInstanceOf[RuntimeVersion] ||
          arg.isInstanceOf[PlannerVersion])

    def shouldBeEqual(a: InternalPlanDescription, b: InternalPlanDescription): Unit = {
      withClue("name")(a.name should equal(b.name))
      if (validateAllArgs) {
        withClue("arguments(all)")(a.arguments should equal(b.arguments))
      } else {
        val aArgsToValidate = a.arguments.filter(shouldValidateArg)
        val bArgsToValidate = b.arguments.filter(shouldValidateArg)

        withClue("arguments")(aArgsToValidate should equal(bArgsToValidate))
      }
      withClue("variables")(a.variables should equal(b.variables))
    }

    shouldBeEqual(producedPlanDescription, expectedPlanDescription)

    withClue("children") {
      (expectedPlanDescription.children, producedPlanDescription.children) match {
        case (NoChildren, NoChildren) =>
        case (SingleChild(expectedChild), SingleChild(producedChild)) =>
          shouldBeEqual(expectedChild, producedChild)
        case (TwoChildren(expectedLhs, expectedRhs), TwoChildren(producedLhs, producedRhs)) =>
          shouldBeEqual(expectedLhs, producedLhs)
          shouldBeEqual(expectedRhs, producedRhs)
        case (expected, produced) =>
          fail(s"${expected.getClass} does not equal ${produced.getClass}")
      }
    }
  }

  private def varFor(name: String): Variable = Variable(name)(pos)

  private def prop(varName: String, propName: String): Property = Property(varFor(varName), PropertyKeyName(propName)(pos))(pos)

  private def cachedProp(varName: String, propName: String): CachedProperty = CachedProperty(varName, varFor(varName), PropertyKeyName(propName)(pos), NODE_TYPE)(pos)

  private def label(name: String): LabelName = LabelName(name)(pos)

  private def relType(name: String): RelTypeName = RelTypeName(name)(pos)

  private def key(name: String): PropertyKeyName = PropertyKeyName(name)(pos)

  private def number(i: String): SignedDecimalIntegerLiteral = SignedDecimalIntegerLiteral(i)(pos)

  private def parameter(p: String, t: CypherType): Parameter = Parameter(p, t)(pos)

  private def stringLiteral(s: String): StringLiteral = StringLiteral(s)(pos)
}
