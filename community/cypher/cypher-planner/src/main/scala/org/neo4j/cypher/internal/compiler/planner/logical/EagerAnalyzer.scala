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
package org.neo4j.cypher.internal.compiler.planner.logical

import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.compiler.planner.logical.plans.rewriter.UnnestingRewriter
import org.neo4j.cypher.internal.ir.CallSubqueryHorizon
import org.neo4j.cypher.internal.ir.EagernessReason
import org.neo4j.cypher.internal.ir.Predicate
import org.neo4j.cypher.internal.ir.QgWithLeafInfo
import org.neo4j.cypher.internal.ir.QgWithLeafInfo.qgWithNoStableIdentifierAndOnlyLeaves
import org.neo4j.cypher.internal.ir.QueryGraph
import org.neo4j.cypher.internal.ir.SinglePlannerQuery
import org.neo4j.cypher.internal.ir.UpdateGraph.LeafPlansPredicatesResolver
import org.neo4j.cypher.internal.ir.UpdateGraph.SolvedPredicatesOfOneLeafPlan
import org.neo4j.cypher.internal.logical.plans.Apply
import org.neo4j.cypher.internal.logical.plans.Argument
import org.neo4j.cypher.internal.logical.plans.DirectedRelationshipByIdSeek
import org.neo4j.cypher.internal.logical.plans.Eager
import org.neo4j.cypher.internal.logical.plans.LogicalLeafPlan
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.logical.plans.Merge
import org.neo4j.cypher.internal.logical.plans.NodeByIdSeek
import org.neo4j.cypher.internal.logical.plans.NodeLogicalLeafPlan
import org.neo4j.cypher.internal.logical.plans.ProcedureCall
import org.neo4j.cypher.internal.logical.plans.RelationshipLogicalLeafPlan
import org.neo4j.cypher.internal.logical.plans.UndirectedRelationshipByIdSeek
import org.neo4j.cypher.internal.logical.plans.UpdatingPlan
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Cardinalities
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.ProvidedOrders
import org.neo4j.cypher.internal.planner.spi.PlanningAttributes.Solveds
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.internal.util.Rewriter
import org.neo4j.cypher.internal.util.attribution.Attributes
import org.neo4j.cypher.internal.util.bottomUp
import org.neo4j.cypher.internal.util.helpers.fixedPoint

import scala.annotation.tailrec

object EagerAnalyzer {

  case class unnestEager(
    override val solveds: Solveds,
    override val cardinalities: Cardinalities,
    override val providedOrders: ProvidedOrders,
    override val attributes: Attributes[LogicalPlan]
  ) extends Rewriter with UnnestingRewriter {

    /*
    Based on unnestApply (which references a paper)

    This rewriter does _not_ adhere to the contract of moving from a valid
    plan to a valid plan, but it is crucial to get eager plans placed correctly.

    Glossary:
      Ax : Apply
      L,R: Arbitrary operator, named Left and Right
      E : Eager
      Up : UpdatingPlan
     */

    private val instance: Rewriter = fixedPoint(bottomUp(Rewriter.lift {

      // L Ax (E R) => E Ax (L R), don't unnest when coming from a subquery
      case apply @ Apply(lhs, eager: Eager, false) =>
        unnestRightUnary(apply, lhs, eager)

      // MERGE is an updating plan that cannot be moved on top of apply since
      // it is closely tied to its source plan
      case apply @ Apply(_, _: Merge, _) => apply

      // L Ax (Up R) => Up Ax (L R), don't unnest when coming from a subquery
      case apply @ Apply(lhs, updatingPlan: UpdatingPlan, fromSubquery) if !fromSubquery =>
        unnestRightUnary(apply, lhs, updatingPlan)
    }))

    override def apply(input: AnyRef): AnyRef = instance.apply(input)
  }
}

class EagerAnalyzer(context: LogicalPlanningContext) {

  implicit private val semanticTable: SemanticTable = context.semanticTable

  /**
   * Get a LeafPlansPredicatesResolver that looks at the leaves of the given plan.
   */
  private def getLeafPlansPredicatesResolver(plan: LogicalPlan): LeafPlansPredicatesResolver = (entityName: String) => {
    val leaves: Seq[LogicalLeafPlan] = plan.leaves.collect {
      case n: NodeLogicalLeafPlan if n.idName == entityName         => n
      case r: RelationshipLogicalLeafPlan if r.idName == entityName => r
    }

    leaves.map { p =>
      val solvedPredicates =
        context.planningAttributes.solveds(p.id).asSinglePlannerQuery.queryGraph.selections.predicates
      SolvedPredicatesOfOneLeafPlan(solvedPredicates.map(_.expr).toSeq)
    }.toList match {
      case head :: tail => LeafPlansPredicatesResolver.LeafPlansFound(NonEmptyList(head, tail: _*))
      case Nil          => LeafPlansPredicatesResolver.NoLeafPlansFound
    }
  }

  /**
   * Determines whether there is a conflict between the so-far planned LogicalPlan
   * and the remaining parts of the PlannerQuery. This function assumes that the
   * argument PlannerQuery is the very head of the PlannerQuery chain.
   */
  private def readWriteConflictInHead(
    plan: LogicalPlan,
    plannerQuery: SinglePlannerQuery
  ): Seq[EagernessReason.Reason] = {
    val entityProvidingLeaves: Seq[LogicalLeafPlan] = plan.leaves.collect {
      case n: NodeLogicalLeafPlan         => n
      case r: RelationshipLogicalLeafPlan => r
      // If in a subquery, we consider the argument to provide us with stable identifiers
      case a: Argument if context.isInSubquery && a.argumentIds.nonEmpty => a
    }

    if (entityProvidingLeaves.isEmpty)
      Seq.empty // the query did not start with a read, possibly CREATE () ...
    else {
      // In the following we determine if there are any stably solved predicates that we can leave out of the eagerness analysis.
      // The reasoning is as follows:
      // Cursors used for leaf operators iterate over a stable snapshot of the transaction state from the moment the cursor is initialized.
      // That means the very first leaf of the whole LogicalPlan can be considered stable; all other leaf cursors might get initialized multiple times.
      // The reads from predicates that are solved by that first leaf do not need to be protected against seeing conflicting writes from later in the query.

      // If we're in a subquery, the first leaf of that subquery is not actually the first leaf of the whole LogicalPlan.
      val (maybeStableLeaf, unstableLeaves) =
        if (context.isInSubquery) (None, entityProvidingLeaves)
        else (entityProvidingLeaves.headOption, entityProvidingLeaves.tail)

      // Collect all predicates solved by the first leaf and exclude them from the eagerness analysis.
      val stablySolvedPredicates: Set[Predicate] = maybeStableLeaf.map { p =>
        context.planningAttributes.solveds(p.id).asSinglePlannerQuery.queryGraph.selections.predicates
      }.getOrElse(Set.empty[Predicate])

      // We still need to distinguish the stable leaf from the others
      val stableIdentifier = maybeStableLeaf.map {

        case n: NodeLogicalLeafPlan         => QgWithLeafInfo.StableIdentifier(n.idName)
        case r: RelationshipLogicalLeafPlan => QgWithLeafInfo.StableIdentifier(r.idName)
      }

      val unstableLeafIdNames = unstableLeaves.flatMap {
        case n: NodeLogicalLeafPlan         => Set(n.idName)
        case r: RelationshipLogicalLeafPlan => Set(r.idName)
        case a: Argument                    => a.argumentIds
      }.toSet

      val leafPlansPredicatesResolver = getLeafPlansPredicatesResolver(plan)

      val headQgWithLeafInfo = QgWithLeafInfo(
        plannerQuery.queryGraph,
        stablySolvedPredicates,
        unstableLeaves = unstableLeafIdNames,
        stableIdentifier = stableIdentifier,
        isTerminatingProjection = plannerQuery.horizon.isTerminatingProjection
      )

      // Start recursion by checking the given plannerQuery against itself
      headConflicts(plannerQuery, plannerQuery, headQgWithLeafInfo, leafPlansPredicatesResolver)
    }
  }

  @tailrec
  private def headConflicts(
    head: SinglePlannerQuery,
    tail: SinglePlannerQuery,
    headQgWithLeafInfo: QgWithLeafInfo,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    // _.allQGsWithLeafInfo will remove the stable identifiers. As we want to keep the identifiers, we therefore need to treat headQgWithLeafInfo separately
    val allHeadQgsIncludingStableIterators =
      headQgWithLeafInfo +:
        headQgWithLeafInfo.queryGraph.allQGsWithLeafInfo
          .filterNot(_.queryGraph == headQgWithLeafInfo.queryGraph)
    val allHeadQgsIgnoringStableIterators = head.queryGraph.allQGsWithLeafInfo

    def overlapsHead(readQgs: Seq[QgWithLeafInfo])(writeQg: QueryGraph) =
      readQgs.flatMap(readQg => writeQg.overlaps(readQg, leafPlansPredicatesResolver))

    val conflictsWithQqInHorizon: Seq[EagernessReason.Reason] = tail.horizon match {
      // if we are running CALL { ... } IN TRANSACTIONS, we cannot rely on stable iterators
      case CallSubqueryHorizon(_, _, _, Some(_)) =>
        tail.horizon.allQueryGraphs.map(_.queryGraph).flatMap(overlapsHead(allHeadQgsIgnoringStableIterators))
      case _ =>
        tail.horizon.allQueryGraphs.map(_.queryGraph).flatMap(overlapsHead(allHeadQgsIncludingStableIterators))
    }
    val mergeReadWrite = head == tail && head.queryGraph.containsMergeRecursive

    val conflicts: Seq[EagernessReason.Reason] = {
      if (conflictsWithQqInHorizon.nonEmpty)
        conflictsWithQqInHorizon
      else if (tail.queryGraph.readOnly || mergeReadWrite)
        Seq.empty
      else
        tail.queryGraph.allQGsWithLeafInfo.flatMap(qg =>
          overlapsHead(allHeadQgsIncludingStableIterators)(qg.queryGraph)
        )
    }

    if (conflicts.nonEmpty)
      conflicts
    else if (tail.tail.isEmpty)
      Seq.empty
    else
      headConflicts(head, tail.tail.get, headQgWithLeafInfo, leafPlansPredicatesResolver)
  }

  def headReadWriteEagerize(inputPlan: LogicalPlan, query: SinglePlannerQuery): LogicalPlan = {
    val alwaysEager = context.config.updateStrategy.alwaysEager
    if (alwaysEager)
      context.logicalPlanProducer.planEager(inputPlan, context, Seq(EagernessReason.UpdateStrategyEager))
    else {
      val conflicts = readWriteConflictInHead(inputPlan, query)
      if (conflicts.nonEmpty)
        context.logicalPlanProducer.planEager(inputPlan, context, conflicts)
      else
        inputPlan
    }
  }

  def tailReadWriteEagerizeNonRecursive(inputPlan: LogicalPlan, query: SinglePlannerQuery): LogicalPlan = {
    val alwaysEager = context.config.updateStrategy.alwaysEager
    if (alwaysEager)
      context.logicalPlanProducer.planEager(inputPlan, context, Seq(EagernessReason.UpdateStrategyEager))
    else {
      val conflicts = readWriteConflict(query, query, getLeafPlansPredicatesResolver(inputPlan))
      if (conflicts.nonEmpty)
        context.logicalPlanProducer.planEager(inputPlan, context, conflicts)
      else
        inputPlan
    }
  }

  // NOTE: This does not check conflict within the query itself (like tailReadWriteEagerizeNonRecursive)
  def tailReadWriteEagerizeRecursive(inputPlan: LogicalPlan, query: SinglePlannerQuery): LogicalPlan = {
    val alwaysEager = context.config.updateStrategy.alwaysEager
    if (alwaysEager)
      context.logicalPlanProducer.planEager(inputPlan, context, Seq(EagernessReason.UpdateStrategyEager))
    else {
      val conflicts =
        if (query.tail.isDefined)
          readWriteConflictInTail(query, query.tail.get, getLeafPlansPredicatesResolver(inputPlan))
        else Seq.empty
      if (conflicts.nonEmpty)
        context.logicalPlanProducer.planEager(inputPlan, context, conflicts)
      else
        inputPlan
    }
  }

  def headWriteReadEagerize(inputPlan: LogicalPlan, query: SinglePlannerQuery): LogicalPlan = {
    val alwaysEager = context.config.updateStrategy.alwaysEager
    if (alwaysEager)
      context.logicalPlanProducer.planEager(inputPlan, context, Seq(EagernessReason.UpdateStrategyEager))
    else {
      val conflictsInHorizon =
        query.queryGraph.overlapsHorizon(query.horizon, getLeafPlansPredicatesResolver(inputPlan))
      val conflictsInHead =
        if (query.tail.isDefined)
          writeReadConflictInHead(query, query.tail.get, getLeafPlansPredicatesResolver(inputPlan))
        else Seq.empty
      val conflicts = conflictsInHorizon ++ conflictsInHead

      if (conflicts.nonEmpty)
        context.logicalPlanProducer.planEager(inputPlan, context, conflicts)
      else
        inputPlan
    }
  }

  def tailWriteReadEagerize(inputPlan: LogicalPlan, query: SinglePlannerQuery): LogicalPlan = {
    val alwaysEager = context.config.updateStrategy.alwaysEager
    if (alwaysEager)
      context.logicalPlanProducer.planEager(inputPlan, context, Seq(EagernessReason.UpdateStrategyEager))
    else {
      val conflictsInHorizon =
        query.queryGraph.overlapsHorizon(query.horizon, getLeafPlansPredicatesResolver(inputPlan))
      val conflictsInTail =
        if (query.tail.isDefined)
          writeReadConflictInTail(query, query.tail.get, getLeafPlansPredicatesResolver(inputPlan))
        else Seq.empty
      val conflicts = conflictsInHorizon ++ conflictsInTail

      if (conflicts.nonEmpty)
        context.logicalPlanProducer.planEager(inputPlan, context, conflicts)
      else
        inputPlan
    }
  }

  def horizonEagerize(inputPlan: LogicalPlan, query: SinglePlannerQuery): LogicalPlan = {
    val alwaysEager = context.config.updateStrategy.alwaysEager
    val pcWrappedPlan = inputPlan match {
      case ProcedureCall(left, call) if call.signature.eager =>
        context.logicalPlanProducer.planProcedureCall(
          context.logicalPlanProducer.planEager(left, context, Seq(EagernessReason.Unknown)),
          call,
          context
        )
      case _ =>
        inputPlan
    }

    if (alwaysEager)
      context.logicalPlanProducer.planEager(inputPlan, context, Seq(EagernessReason.UpdateStrategyEager))
    else {
      val leafPlansPredicatesResolver = getLeafPlansPredicatesResolver(inputPlan)
      val conflicts = horizonReadWriteConflict(query, leafPlansPredicatesResolver) ++ horizonWriteReadConflict(
        query,
        leafPlansPredicatesResolver
      )
      if (conflicts.nonEmpty)
        context.logicalPlanProducer.planEager(pcWrappedPlan, context, conflicts)
      else
        pcWrappedPlan
    }
  }

  private def horizonReadWriteConflict(
    query: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    query.tail.toSeq.flatMap(_.allQGsWithLeafInfo).flatMap(_.queryGraph.overlapsHorizon(
      query.horizon,
      leafPlansPredicatesResolver
    ))
  }

  private def horizonWriteReadConflict(
    query: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    val horizonQgs = query.horizon.allQueryGraphs.map(_.queryGraph)
    val tailQgs = query.tail.toSeq.flatMap(_.allQGsWithLeafInfo)

    tailQgs.flatMap(readQg => horizonQgs.flatMap(writeQg => writeQg.overlaps(readQg, leafPlansPredicatesResolver)))
  }

  /**
   * Determines whether there is a conflict between the two PlannerQuery objects.
   * This function assumes that none of the argument PlannerQuery objects is
   * the head of the PlannerQuery chain.
   */
  @tailrec
  private def readWriteConflictInTail(
    head: SinglePlannerQuery,
    tail: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    val conflicts = readWriteConflict(head, tail, leafPlansPredicatesResolver)
    if (conflicts.nonEmpty)
      conflicts
    else if (tail.tail.isEmpty)
      Seq.empty
    else
      readWriteConflictInTail(head, tail.tail.get, leafPlansPredicatesResolver)
  }

  private def readWriteConflict(
    readQuery: SinglePlannerQuery,
    writeQuery: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    val readQGsWithLeafInfo = readQuery.queryGraph.allQGsWithLeafInfo
    def overlapsWithReadQg(writeQg: QueryGraph): Seq[EagernessReason.Reason] =
      readQGsWithLeafInfo.flatMap(readQgWithLeafInfo =>
        writeQg.overlaps(readQgWithLeafInfo, leafPlansPredicatesResolver)
      )

    val conflictsWithQgInHorizon = writeQuery.horizon.allQueryGraphs.map(_.queryGraph).flatMap(overlapsWithReadQg)
    val mergeReadWrite = readQuery == writeQuery && readQuery.queryGraph.containsMergeRecursive

    if (conflictsWithQgInHorizon.nonEmpty)
      conflictsWithQgInHorizon
    else if (writeQuery.queryGraph.readOnly || mergeReadWrite)
      Seq.empty
    else
      writeQuery.queryGraph.allQGsWithLeafInfo.map(_.queryGraph).flatMap(overlapsWithReadQg)
  }

  @tailrec
  private def writeReadConflictInTail(
    head: SinglePlannerQuery,
    tail: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    val readQGsWithLeafInfo = tail.queryGraph.allQGsWithLeafInfo
    def overlapsWithReadQg(writeQg: QueryGraph): Seq[EagernessReason.Reason] =
      readQGsWithLeafInfo.flatMap(readQgWithLeafInfo =>
        writeQg.overlaps(readQgWithLeafInfo, leafPlansPredicatesResolver)
      )

    val conflicts =
      if (tail.queryGraph.writeOnly) Seq.empty
      else {
        val qgS = head.queryGraph.allQGsWithLeafInfo.map(_.queryGraph)
        qgS.flatMap(overlapsWithReadQg) ++
          qgS.flatMap(_.overlapsHorizon(tail.horizon, leafPlansPredicatesResolver)) ++
          qgS.flatMap(deleteReadOverlap(_, tail.queryGraph))
      }
    if (conflicts.nonEmpty)
      conflicts
    else if (tail.tail.isEmpty)
      Seq.empty
    else
      writeReadConflictInTail(head, tail.tail.get, leafPlansPredicatesResolver)
  }

  private def deleteReadOverlap(from: QueryGraph, to: QueryGraph): Seq[EagernessReason.Reason] = {
    val deleted = from.identifiersToDelete
    if (deletedRelationshipsOverlap(deleted, to) || deletedNodesOverlap(deleted, to))
      Seq(EagernessReason.Unknown)
    else
      Seq.empty
  }

  private def deletedRelationshipsOverlap(deleted: Set[String], to: QueryGraph): Boolean = {
    val relsToRead = to.allPatternRelationshipsRead
    val relsDeleted = deleted.filter(id => semanticTable.isRelationship(id))
    relsToRead.nonEmpty && relsDeleted.nonEmpty
  }

  private def deletedNodesOverlap(deleted: Set[String], to: QueryGraph): Boolean = {
    val nodesToRead = to.allPatternNodesRead
    val nodesDeleted = deleted.filter(id => semanticTable.isNode(id))
    nodesToRead.nonEmpty && nodesDeleted.nonEmpty
  }

  private def writeReadConflictInHead(
    head: SinglePlannerQuery,
    tail: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Seq[EagernessReason.Reason] = {
    // If the first planner query is write only, we can use a different overlaps method (writeOnlyHeadOverlaps)
    // that makes us less eager
    if (head.queryGraph.writeOnly) {
      val overlap = writeReadConflictInHeadRecursive(head, tail, leafPlansPredicatesResolver)
      if (overlap.nonEmpty)
        Seq(overlap.get)
      else
        Seq.empty
    } else
      writeReadConflictInTail(head, tail, leafPlansPredicatesResolver)
  }

  @tailrec
  private def writeReadConflictInHeadRecursive(
    head: SinglePlannerQuery,
    tail: SinglePlannerQuery,
    leafPlansPredicatesResolver: LeafPlansPredicatesResolver
  ): Option[EagernessReason.Reason] = {
    // TODO:H Refactor: This is same as writeReadConflictInTail, but with different overlaps method. Pass as a parameter
    if (!tail.queryGraph.writeOnly)
      // NOTE: Here we do not check writeOnlyHeadOverlapsHorizon, because we do not know of any case where a
      // write-only head could cause problems with reads in future horizons
      head.queryGraph.writeOnlyHeadOverlaps(
        qgWithNoStableIdentifierAndOnlyLeaves(tail.queryGraph),
        leafPlansPredicatesResolver
      )
    else if (tail.tail.isEmpty)
      None
    else
      writeReadConflictInHeadRecursive(head, tail.tail.get, leafPlansPredicatesResolver)
  }
}
