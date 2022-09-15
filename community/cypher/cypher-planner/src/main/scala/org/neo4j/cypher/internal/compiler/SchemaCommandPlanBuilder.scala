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
package org.neo4j.cypher.internal.compiler

import org.neo4j.common.EntityType
import org.neo4j.cypher.internal.ast.CreateBtreeNodeIndex
import org.neo4j.cypher.internal.ast.CreateBtreeRelationshipIndex
import org.neo4j.cypher.internal.ast.CreateFulltextNodeIndex
import org.neo4j.cypher.internal.ast.CreateFulltextRelationshipIndex
import org.neo4j.cypher.internal.ast.CreateIndexOldSyntax
import org.neo4j.cypher.internal.ast.CreateLookupIndex
import org.neo4j.cypher.internal.ast.CreateNodeKeyConstraint
import org.neo4j.cypher.internal.ast.CreateNodePropertyExistenceConstraint
import org.neo4j.cypher.internal.ast.CreatePointNodeIndex
import org.neo4j.cypher.internal.ast.CreatePointRelationshipIndex
import org.neo4j.cypher.internal.ast.CreateRangeNodeIndex
import org.neo4j.cypher.internal.ast.CreateRangeRelationshipIndex
import org.neo4j.cypher.internal.ast.CreateRelationshipPropertyExistenceConstraint
import org.neo4j.cypher.internal.ast.CreateTextNodeIndex
import org.neo4j.cypher.internal.ast.CreateTextRelationshipIndex
import org.neo4j.cypher.internal.ast.CreateUniquePropertyConstraint
import org.neo4j.cypher.internal.ast.DropConstraintOnName
import org.neo4j.cypher.internal.ast.DropIndex
import org.neo4j.cypher.internal.ast.DropIndexOnName
import org.neo4j.cypher.internal.ast.DropNodeKeyConstraint
import org.neo4j.cypher.internal.ast.DropNodePropertyExistenceConstraint
import org.neo4j.cypher.internal.ast.DropRelationshipPropertyExistenceConstraint
import org.neo4j.cypher.internal.ast.DropUniquePropertyConstraint
import org.neo4j.cypher.internal.ast.IfExistsDo
import org.neo4j.cypher.internal.ast.IfExistsDoNothing
import org.neo4j.cypher.internal.ast.NoOptions
import org.neo4j.cypher.internal.ast.Options
import org.neo4j.cypher.internal.compiler.phases.LogicalPlanState
import org.neo4j.cypher.internal.compiler.phases.PlannerContext
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.Property
import org.neo4j.cypher.internal.expressions.PropertyKeyName
import org.neo4j.cypher.internal.expressions.RelTypeName
import org.neo4j.cypher.internal.frontend.phases.BaseState
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer.CompilationPhase
import org.neo4j.cypher.internal.frontend.phases.CompilationPhaseTracer.CompilationPhase.PIPE_BUILDING
import org.neo4j.cypher.internal.frontend.phases.Phase
import org.neo4j.cypher.internal.logical.plans
import org.neo4j.cypher.internal.logical.plans.DoNothingIfExistsForIndex
import org.neo4j.cypher.internal.logical.plans.LogicalPlan
import org.neo4j.cypher.internal.planner.spi.AdministrationPlannerName
import org.neo4j.cypher.internal.util.StepSequencer
import org.neo4j.cypher.internal.util.attribution.SequentialIdGen
import org.neo4j.graphdb.schema.IndexType

/**
 * This planner takes on queries that requires no planning such as schema commands
 */
case object SchemaCommandPlanBuilder extends Phase[PlannerContext, BaseState, LogicalPlanState] {

  override def phase: CompilationPhase = PIPE_BUILDING

  override def postConditions: Set[StepSequencer.Condition] = Set.empty

  override def process(from: BaseState, context: PlannerContext): LogicalPlanState = {
    implicit val idGen: SequentialIdGen = new SequentialIdGen()

    def handleIfExistsDo(entityName: Either[LabelName, RelTypeName],
                         props: List[Property],
                         indexType: IndexType,
                         name: Option[String],
                         ifExistsDo: IfExistsDo,
                         options: Options): (List[PropertyKeyName], Option[DoNothingIfExistsForIndex]) = {
      val propKeys = props.map(_.propertyKey)
      val source = ifExistsDo match {
        case IfExistsDoNothing => Some(plans.DoNothingIfExistsForIndex(entityName, propKeys, indexType, name, options))
        case _ => None
      }
      (propKeys, source)
    }

    def createBtreeIndex(entityName: Either[LabelName, RelTypeName],
                         props: List[Property],
                         name: Option[String],
                         ifExistsDo: IfExistsDo,
                         options: Options): Option[LogicalPlan] = {
      val (propKeys, source) = handleIfExistsDo(entityName, props, IndexType.BTREE, name, ifExistsDo, options)
      Some(plans.CreateBtreeIndex(source, entityName, propKeys, name, options))
    }

    def createRangeIndex(entityName: Either[LabelName, RelTypeName],
                         props: List[Property],
                         name: Option[String],
                         ifExistsDo: IfExistsDo,
                         options: Options): Option[LogicalPlan] = {
      val (propKeys, source) = handleIfExistsDo(entityName, props, IndexType.RANGE, name, ifExistsDo, options)
      Some(plans.CreateRangeIndex(source, entityName, propKeys, name, options))
    }

    def createFulltextIndex(entityNames: Either[List[LabelName], List[RelTypeName]],
                            props: List[Property],
                            name: Option[String],
                            ifExistsDo: IfExistsDo,
                            options: Options): Option[LogicalPlan] = {
      val propKeys = props.map(_.propertyKey)
      val source = ifExistsDo match {
        case IfExistsDoNothing => Some(plans.DoNothingIfExistsForFulltextIndex(entityNames, propKeys, name, options))
        case _ => None
      }
      Some(plans.CreateFulltextIndex(source, entityNames, propKeys, name, options))
    }

    def createTextIndex(entityName: Either[LabelName, RelTypeName],
                        props: List[Property],
                        name: Option[String],
                        ifExistsDo: IfExistsDo,
                        options: Options): Option[LogicalPlan] = {
      val (propKeys, source) = handleIfExistsDo(entityName, props, IndexType.TEXT, name, ifExistsDo, options)
      Some(plans.CreateTextIndex(source, entityName, propKeys, name, options))
    }

    def createPointIndex(entityName: Either[LabelName, RelTypeName],
                        props: List[Property],
                        name: Option[String],
                        ifExistsDo: IfExistsDo,
                        options: Options): Option[LogicalPlan] = {
      val (propKeys, source) = handleIfExistsDo(entityName, props, IndexType.POINT, name, ifExistsDo, options)
      Some(plans.CreatePointIndex(source, entityName, propKeys, name, options))
    }

    val maybeLogicalPlan: Option[LogicalPlan] = from.statement() match {
      // CREATE CONSTRAINT [name] [IF NOT EXISTS] FOR (node:Label) REQUIRE (node.prop1,node.prop2) IS NODE KEY [OPTIONS {...}]
      case CreateNodeKeyConstraint(node, label, props, name, ifExistsDo, options, _, _, _) =>
        val source = ifExistsDo match {
          case IfExistsDoNothing => Some(plans.DoNothingIfExistsForConstraint(node.name, scala.util.Left(label), props, plans.NodeKey, name, options))
          case _ => None
        }
        Some(plans.CreateNodeKeyConstraint(source, node.name, label, props, name, options))

      // DROP CONSTRAINT ON (node:Label) ASSERT (node.prop1,node.prop2) IS NODE KEY
      case DropNodeKeyConstraint(_, label, props, _) =>
        Some(plans.DropNodeKeyConstraint(label, props))

      // CREATE CONSTRAINT [name] [IF NOT EXISTS] FOR (node:Label) REQUIRE node.prop IS UNIQUE [OPTIONS {...}]
      // CREATE CONSTRAINT [name] [IF NOT EXISTS] FOR (node:Label) REQUIRE (node.prop1,node.prop2) IS UNIQUE [OPTIONS {...}]
      case CreateUniquePropertyConstraint(node, label, props, name, ifExistsDo, options, _, _, _) =>
        val source = ifExistsDo match {
          case IfExistsDoNothing => Some(plans.DoNothingIfExistsForConstraint(node.name, scala.util.Left(label), props, plans.Uniqueness, name, options))
          case _ => None
        }
        Some(plans.CreateUniquePropertyConstraint(source, node.name, label, props, name, options))

      // DROP CONSTRAINT ON (node:Label) ASSERT node.prop IS UNIQUE
      // DROP CONSTRAINT ON (node:Label) ASSERT (node.prop1,node.prop2) IS UNIQUE
      case DropUniquePropertyConstraint(_, label, props, _) =>
        Some(plans.DropUniquePropertyConstraint(label, props))

      // CREATE CONSTRAINT [name] [IF NOT EXISTS] FOR (node:Label) REQUIRE node.prop IS NOT NULL
      case CreateNodePropertyExistenceConstraint(_, label, prop, name, ifExistsDo, options, _, _, _) =>
        val source = ifExistsDo match {
          case IfExistsDoNothing => Some(plans.DoNothingIfExistsForConstraint(prop.map.asCanonicalStringVal, scala.util.Left(label), Seq(prop), plans.NodePropertyExistence, name, options))
          case _ => None
        }
        Some(plans.CreateNodePropertyExistenceConstraint(source, label, prop, name, options))

      // DROP CONSTRAINT ON (node:Label) ASSERT EXISTS (node.prop)
      case DropNodePropertyExistenceConstraint(_, label, prop, _) =>
        Some(plans.DropNodePropertyExistenceConstraint(label, prop))

      // CREATE CONSTRAINT [name] [IF NOT EXISTS] FOR ()-[r:R]-() REQUIRE r.prop IS NOT NULL
      case CreateRelationshipPropertyExistenceConstraint(_, relType, prop, name, ifExistsDo, options, _, _, _) =>
        val source = ifExistsDo match {
          case IfExistsDoNothing => Some(plans.DoNothingIfExistsForConstraint(prop.map.asCanonicalStringVal, scala.util.Right(relType), Seq(prop), plans.RelationshipPropertyExistence, name, options))
          case _ => None
        }
        Some(plans.CreateRelationshipPropertyExistenceConstraint(source, relType, prop, name, options))

      // DROP CONSTRAINT ON ()-[r:R]-() ASSERT EXISTS (r.prop)
      case DropRelationshipPropertyExistenceConstraint(_, relType, prop, _) =>
        Some(plans.DropRelationshipPropertyExistenceConstraint(relType, prop))

      // DROP CONSTRAINT name [IF EXISTS]
      case DropConstraintOnName(name, ifExists, _) =>
        Some(plans.DropConstraintOnName(name, ifExists))
        
      // CREATE INDEX ON :LABEL(prop)
      case CreateIndexOldSyntax(label, props, _) =>
        Some(plans.CreateBtreeIndex(None, Left(label), props, None, NoOptions))

      // CREATE BTREE INDEX [name] [IF NOT EXISTS] FOR (n:LABEL) ON (n.prop) [OPTIONS {...}]
      case CreateBtreeNodeIndex(_, label, props, name, ifExistsDo, options, _) =>
        createBtreeIndex(Left(label), props, name, ifExistsDo, options)

      // CREATE BTREE INDEX [name] [IF NOT EXISTS] FOR ()-[r:RELATIONSHIP_TYPE]->() ON (r.prop) [OPTIONS {...}]
      case CreateBtreeRelationshipIndex(_, relType, props, name, ifExistsDo, options, _) =>
        createBtreeIndex(Right(relType), props, name, ifExistsDo, options)

      // CREATE [RANGE] INDEX [name] [IF NOT EXISTS] FOR (n:LABEL) ON (n.prop) [OPTIONS {...}]
      case CreateRangeNodeIndex(_, label, props, name, ifExistsDo, options, fromDefault, _) =>
        // We want to make RANGE default eventually, but for now we keep the behavior of BTREE being default
        if (fromDefault) createBtreeIndex(Left(label), props, name, ifExistsDo, options)
        else createRangeIndex(Left(label), props, name, ifExistsDo, options)

      // CREATE [RANGE] INDEX [name] [IF NOT EXISTS] FOR ()-[r:RELATIONSHIP_TYPE]->() ON (r.prop) [OPTIONS {...}]
      case CreateRangeRelationshipIndex(_, relType, props, name, ifExistsDo, options, fromDefault, _) =>
        // We want to make RANGE default eventually, but for now we keep the behavior of BTREE being default
        if (fromDefault) createBtreeIndex(Right(relType), props, name, ifExistsDo, options)
        else createRangeIndex(Right(relType), props, name, ifExistsDo, options)

      // CREATE LOOKUP INDEX [name] [IF NOT EXISTS] FOR (n) ON EACH labels(n)
      // CREATE LOOKUP INDEX [name] [IF NOT EXISTS] FOR ()-[r]-() ON [EACH] type(r)
      case CreateLookupIndex(_, isNodeIndex, _, name, ifExistsDo, options, _) =>
        val entityType = if (isNodeIndex) EntityType.NODE else EntityType.RELATIONSHIP
        val source = ifExistsDo match {
          case IfExistsDoNothing => Some(plans.DoNothingIfExistsForLookupIndex(entityType, name, options))
          case _ => None
        }
        Some(plans.CreateLookupIndex(source, entityType, name, options))

      // CREATE FULLTEXT INDEX [name] [IF NOT EXISTS] FOR (n[:LABEL[|...]]) ON EACH (n.prop[, ...]) [OPTIONS {...}]
      case CreateFulltextNodeIndex(_, labels, props, name, ifExistsDo, options, _) =>
        createFulltextIndex(Left(labels), props, name, ifExistsDo, options)

      // CREATE FULLTEXT INDEX [name] [IF NOT EXISTS] FOR ()-[r[:RELATIONSHIP_TYPE[|...]]]->() ON EACH (r.prop[, ...]) [OPTIONS {...}]
      case CreateFulltextRelationshipIndex(_, relTypes, props, name, ifExistsDo, options, _) =>
        createFulltextIndex(Right(relTypes), props, name, ifExistsDo, options)

      // CREATE TEXT INDEX [name] [IF NOT EXISTS] FOR (n:LABEL) ON (n.prop) [OPTIONS {...}]
      case CreateTextNodeIndex(_, label, props, name, ifExistsDo, options, _) =>
        createTextIndex(Left(label), props, name, ifExistsDo, options)

      // CREATE TEXT INDEX [name] [IF NOT EXISTS] FOR ()-[r:RELATIONSHIP_TYPE]->() ON (r.prop) [OPTIONS {...}]
      case CreateTextRelationshipIndex(_, relType, props, name, ifExistsDo, options, _) =>
        createTextIndex(Right(relType), props, name, ifExistsDo, options)

      // CREATE POINT INDEX [name] [IF NOT EXISTS] FOR (n:LABEL) ON (n.prop) [OPTIONS {...}]
      case CreatePointNodeIndex(_, label, props, name, ifExistsDo, options, _) =>
        createPointIndex(Left(label), props, name, ifExistsDo, options)

      // CREATE POINT INDEX [name] [IF NOT EXISTS] FOR ()-[r:RELATIONSHIP_TYPE]->() ON (r.prop) [OPTIONS {...}]
      case CreatePointRelationshipIndex(_, relType, props, name, ifExistsDo, options, _) =>
        createPointIndex(Right(relType), props, name, ifExistsDo, options)

      // DROP INDEX ON :LABEL(prop)
      case DropIndex(label, props, _) =>
        Some(plans.DropIndex(label, props))

      // DROP INDEX name [IF EXISTS]
      case DropIndexOnName(name, ifExists, _) =>
        Some(plans.DropIndexOnName(name, ifExists))

      case _ => None
    }

    val planState = LogicalPlanState(from)

    if (maybeLogicalPlan.isDefined)
      planState.copy(maybeLogicalPlan = maybeLogicalPlan, plannerName = AdministrationPlannerName)
    else planState
  }
}
