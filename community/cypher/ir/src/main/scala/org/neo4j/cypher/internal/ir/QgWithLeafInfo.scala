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

import org.neo4j.cypher.internal.ast.semantics.SemanticTable
import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.PatternComprehension
import org.neo4j.cypher.internal.expressions.PatternExpression
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.ir.QgWithLeafInfo.Identifier
import org.neo4j.cypher.internal.ir.QgWithLeafInfo.StableIdentifier
import org.neo4j.cypher.internal.ir.QgWithLeafInfo.UnstableIdentifier
import org.neo4j.cypher.internal.ir.helpers.CachedFunction
import org.neo4j.cypher.internal.util.Foldable.FoldableAny
import org.neo4j.cypher.internal.util.symbols.CTNode
import org.neo4j.cypher.internal.util.symbols.CTRelationship

object QgWithLeafInfo {

  sealed trait Identifier {
    def name: String

    def isStable: Boolean
    def isIdStable: Boolean
  }

  case class StableIdentifier(override val name: String,
                              override val isIdStable: Boolean) extends Identifier {
    override def isStable: Boolean = true
  }

  case class UnstableIdentifier(override val name: String) extends Identifier {
    override def isStable: Boolean = false
    override def isIdStable: Boolean = false
  }

  /**
   * @return a QgWithInfo, where there is no stable identifier. Moreover all variables are assumed to be leaves.
   */
  def qgWithNoStableIdentifierAndOnlyLeaves(qg: QueryGraph): QgWithLeafInfo =
    QgWithLeafInfo(qg, Set.empty, qg.allCoveredIds, None)

}

/**
 * Encapsulates a query graph with info necessary for certain eager-analysis.
 * Specifically, this includes information about the leaves used to plan the query graph
 * and their stability.
 *
 * @param solvedQg               The query graph that has already been solved by some plan.
 * @param stablySolvedPredicates The predicates solved by the leaf plan that solves the stable identifier.
 * @param unstableLeaves         The unstable leaves of the considered plan.
 * @param stableIdentifier       The identifier of the node found in the stable iterator.
 */
case class QgWithLeafInfo(private val solvedQg: QueryGraph,
                          private val stablySolvedPredicates: Set[Predicate],
                          private val unstableLeaves: Set[String],
                          private val stableIdentifier: Option[StableIdentifier]) {

  /**
   * We exclude all stably solved predicates from the eagerness analysis.
   * These are the predicates solved by the leaf plan that solves the stable identifier.
   */
  val queryGraph: QueryGraph = solvedQg.removePredicates(stablySolvedPredicates)

  def hasUnstableLeaves: Boolean = unstableLeaves.nonEmpty

  lazy val unstablePatternNodes: Set[String] = queryGraph.allPatternNodesRead -- stableIdentifier.map(_.name)

  lazy val unstablePatternRelationships: Set[PatternRelationship] = queryGraph.allPatternRelationshipsRead.filterNot(rel => stableIdentifier.exists(i => i.name == rel.name))

  lazy val patternNodes: Set[Identifier] = {
    val unstableIdentifiers: Set[Identifier] = unstablePatternNodes.map(UnstableIdentifier)
    val maybeStableIdentifier = stableIdentifier.filter(i => queryGraph.patternNodes.contains(i.name))
    unstableIdentifiers ++ maybeStableIdentifier
  }

  lazy val leafPatternNodes: Set[Identifier] = {
    patternNodes.filter {
      case UnstableIdentifier(name) => unstableLeaves.contains(name)
      case _: StableIdentifier => true
    }
  }

  val entityArguments: SemanticTable => Set[String] = CachedFunction((semanticTable: SemanticTable) => {
    val nonEntityArguments = queryGraph.selections.predicates
      .flatMap(_.expr.dependencies)
      // find expressions that we know for certain are not entities
      .filterNot(couldBeEntity(semanticTable, _)).map(_.name)

    // Remove nonEntityArguments from argumentIds to avoid being eager on simple projections like `WITH a.prop AS prop`,
    queryGraph.argumentIds -- nonEntityArguments
  })

  val nonArgumentPatternNodes: SemanticTable => Set[Identifier] = CachedFunction((semanticTable: SemanticTable) => {
    patternNodes.filterNot(node => entityArguments(semanticTable).contains(node.name))
  })

  val patternNodesAndArguments: SemanticTable => Set[Identifier] = CachedFunction((semanticTable: SemanticTable) => {
    patternNodes ++ entityArguments(semanticTable).map(UnstableIdentifier)
  })

  val patternRelationshipsAndArguments: SemanticTable => Set[Identifier] = CachedFunction((semanticTable: SemanticTable) => {
    patternRelationships ++ entityArguments(semanticTable).map(UnstableIdentifier)
  })

  lazy val patternRelationships: Set[Identifier] = {
    val unstableIdentifiers: Set[Identifier] = unstablePatternRelationships.map(rel => UnstableIdentifier(rel.name))
    val maybeStableIdentifier = stableIdentifier.filter(i => queryGraph.patternRelationships.exists(rel => i.name == rel.name))
    unstableIdentifiers ++ maybeStableIdentifier
  }

  val allKnownUnstableNodeLabelsFor: Identifier => Set[LabelName] = CachedFunction((identifier:Identifier) => {
    if (identifier.isIdStable) Set.empty[LabelName]
    else queryGraph.allPossibleLabelsOnNode(identifier.name)
  })

  val allPossibleUnstableRelTypesFor: Identifier => Set[RelTypeName] = CachedFunction((identifier:Identifier) => {
    if (identifier.isIdStable) Set.empty[RelTypeName]
    else queryGraph.allPossibleTypesOnRel(identifier.name)
  })

  val allKnownUnstablePropertiesFor: Identifier => Set[PropertyKeyName] = CachedFunction((identifier:Identifier) => {
    if (identifier.isIdStable) Set.empty[PropertyKeyName]
    else queryGraph.allKnownPropertiesOnIdentifier(identifier.name)
  })

  val allKnownUnstableNodeLabels: SemanticTable => Set[LabelName] = CachedFunction((semanticTable: SemanticTable) => {
    patternNodesAndArguments(semanticTable).flatMap(allKnownUnstableNodeLabelsFor)
  })

  val allKnownUnstableNodeProperties: SemanticTable => Set[PropertyKeyName] = CachedFunction((semanticTable: SemanticTable) => {
    patternNodesAndArguments(semanticTable).flatMap(allKnownUnstablePropertiesFor) ++ patternExpressionProperties
  })

  val allKnownUnstableRelProperties: SemanticTable => Set[PropertyKeyName] = CachedFunction((semanticTable: SemanticTable) => {
    patternRelationshipsAndArguments(semanticTable).flatMap(allKnownUnstablePropertiesFor) ++ patternExpressionProperties
  })

  private lazy val patternExpressionProperties: Set[PropertyKeyName] = {
    (queryGraph.findAllByClass[PatternComprehension] ++ queryGraph.findAllByClass[PatternExpression]).flatMap {
      _.findAllByClass[PropertyKeyName]
    }.toSet
  }

  /**
   * Checks whether the given expression could be of type `CTNode` or `CTRelationship`.
   */
  private def couldBeEntity(semanticTable: SemanticTable, exp: Expression): Boolean =
    semanticTable.types.get(exp) match {
      case Some(expressionTypeInfo) =>
        val actualType = expressionTypeInfo.actual
        actualType.contains(CTNode) || actualType.contains(CTRelationship)

      case None =>
        // No type information available, we have to be conservative
        true
    }
}
