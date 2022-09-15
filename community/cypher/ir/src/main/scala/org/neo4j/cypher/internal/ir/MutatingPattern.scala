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
package org.neo4j.cypher.internal.ir

import org.neo4j.cypher.internal.expressions.Expression
import org.neo4j.cypher.internal.expressions.LabelName
import org.neo4j.cypher.internal.expressions.PropertyKeyName

import scala.util.hashing.MurmurHash3

sealed trait MutatingPattern extends Product {
  def coveredIds: Set[String]
  def dependencies: Set[String]
  protected def deps(expression: Expression): Set[String] = expression.dependencies.map(_.name)
  protected def deps(expression: Option[Expression]): Set[String] = {
    val expressionSet = expression.toSet
    expressionSet.flatMap(_.dependencies.map(_.name))
  }

  //We spend a lot of time hashing these objects,
  //since they are all immutable we can memoize the hashcode
  override val hashCode: Int = MurmurHash3.productHash(this)

}

sealed trait NoSymbols {
  self : MutatingPattern =>
  override def coveredIds = Set.empty[String]
}

sealed trait SimpleMutatingPattern extends MutatingPattern

sealed trait SetMutatingPattern extends SimpleMutatingPattern with NoSymbols

case class SetPropertyPattern(entityExpression: Expression, propertyKeyName: PropertyKeyName, expression: Expression) extends SetMutatingPattern
  with HasMappableExpressions[SetPropertyPattern] {
  override def dependencies: Set[String] = (entityExpression.dependencies ++ expression.dependencies).map(_.name)
  override def mapExpressions(f: Expression => Expression): SetPropertyPattern = copy(expression = f(expression))
}

case class SetPropertiesPattern(entityExpression: Expression, items: Seq[(PropertyKeyName, Expression)])
  extends SetMutatingPattern with HasMappableExpressions[SetPropertiesPattern] {

  override def dependencies: Set[String] = items.map(_._2).flatMap(deps).toSet ++ entityExpression.dependencies.map(_.name)

  override def mapExpressions(f: Expression => Expression): SetPropertiesPattern = {
    copy(items = items.map {
      case (k, e) => (k, f(e))
    })
  }
}

case class SetRelationshipPropertyPattern(idName: String, propertyKey: PropertyKeyName, expression: Expression) extends SetMutatingPattern
  with HasMappableExpressions[SetRelationshipPropertyPattern] {
  override def dependencies: Set[String] = deps(expression) + idName
  override def mapExpressions(f: Expression => Expression): SetRelationshipPropertyPattern = copy(expression = f(expression))
}

case class SetRelationshipPropertiesPattern(idName: String, items: Seq[(PropertyKeyName, Expression)])
  extends SetMutatingPattern with HasMappableExpressions[SetRelationshipPropertiesPattern] {

  override def dependencies: Set[String] = items.map(_._2).flatMap(deps).toSet + idName

  override def mapExpressions(f: Expression => Expression): SetRelationshipPropertiesPattern = {
    copy(items = items.map {
      case (k, e) => (k, f(e))
    })
  }
}

case class SetNodePropertiesFromMapPattern(idName: String, expression: Expression, removeOtherProps: Boolean) extends SetMutatingPattern
  with HasMappableExpressions[SetNodePropertiesFromMapPattern] {
  override def dependencies: Set[String] = deps(expression) + idName
  override def mapExpressions(f: Expression => Expression): SetNodePropertiesFromMapPattern = copy(expression = f(expression))
}

case class SetRelationshipPropertiesFromMapPattern(idName: String, expression: Expression, removeOtherProps: Boolean) extends SetMutatingPattern
  with HasMappableExpressions[SetRelationshipPropertiesFromMapPattern] {
  override def dependencies: Set[String] = deps(expression) + idName
  override def mapExpressions(f: Expression => Expression): SetRelationshipPropertiesFromMapPattern = copy(expression = f(expression))
}

case class SetPropertiesFromMapPattern(entityExpression: Expression, expression: Expression, removeOtherProps: Boolean) extends SetMutatingPattern
  with HasMappableExpressions[SetPropertiesFromMapPattern]{
  override def dependencies: Set[String] = (entityExpression.dependencies ++ expression.dependencies).map(_.name)
  override def mapExpressions(f: Expression => Expression): SetPropertiesFromMapPattern = copy(f(entityExpression), f(expression))
}

case class SetNodePropertyPattern(idName: String, propertyKey: PropertyKeyName, expression: Expression) extends SetMutatingPattern
  with HasMappableExpressions[SetNodePropertyPattern] {
  override def dependencies: Set[String] = deps(expression) + idName
  override def mapExpressions(f: Expression => Expression): SetNodePropertyPattern = copy(expression = f(expression))
}

case class SetNodePropertiesPattern(idName: String, items: Seq[(PropertyKeyName, Expression)])
  extends SetMutatingPattern with HasMappableExpressions[SetNodePropertiesPattern] {

  override def dependencies: Set[String] = items.map(_._2).flatMap(deps).toSet + idName

  override def mapExpressions(f: Expression => Expression): SetNodePropertiesPattern = {
    copy(items = items.map {
      case (k, e) => (k, f(e))
    })
  }
}

case class SetLabelPattern(idName: String, labels: Seq[LabelName]) extends SetMutatingPattern {
  override def dependencies: Set[String] = Set(idName)
}

case class RemoveLabelPattern(idName: String, labels: Seq[LabelName]) extends SimpleMutatingPattern with NoSymbols {
  override def dependencies: Set[String] = Set(idName)
}

case class CreatePattern(nodes: Seq[CreateNode], relationships: Seq[CreateRelationship]) extends SimpleMutatingPattern with HasMappableExpressions[CreatePattern] {
  override def coveredIds: Set[String] = {
    val builder = Set.newBuilder[String]
    for (node <- nodes)
      builder += node.idName
    for (relationship <- relationships) {
      builder += relationship.idName
    }
    builder.result()
  }
  override def dependencies: Set[String] = {
    val builder = Set.newBuilder[String]
    for (node <- nodes)
      builder ++= deps(node.properties)
    for (relationship <- relationships) {
      builder ++= deps(relationship.properties)
      builder += relationship.leftNode
      builder += relationship.rightNode
    }
    builder.result()
  }

  override def mapExpressions(f: Expression => Expression): CreatePattern = {
    copy(nodes = nodes.map(_.mapExpressions(f)), relationships = relationships.map(_.mapExpressions(f)))
  }
}

case class DeleteExpression(expression: Expression, forced: Boolean) extends SimpleMutatingPattern with NoSymbols with HasMappableExpressions[DeleteExpression] {
  override def dependencies: Set[String] = expression.dependencies.map(_.name)

  override def mapExpressions(f: Expression => Expression): DeleteExpression = copy(expression = f(expression))
}

sealed trait MergePattern {
  self : MutatingPattern =>
  def matchGraph: QueryGraph
}

case class MergeNodePattern(createNode: CreateNode,
                            matchGraph: QueryGraph,
                            onCreate: Seq[SetMutatingPattern],
                            onMatch: Seq[SetMutatingPattern]) extends MutatingPattern with MergePattern {
  override def coveredIds: Set[String] = matchGraph.allCoveredIds

  override def dependencies: Set[String] =
    createNode.properties.map(_.dependencies.map(_.name)).getOrElse(Set.empty) ++
      onCreate.flatMap(_.dependencies) ++
      onMatch.flatMap(_.dependencies)
}

case class MergeRelationshipPattern(createNodes: Seq[CreateNode],
                                    createRelationships: Seq[CreateRelationship],
                                    matchGraph: QueryGraph,
                                    onCreate: Seq[SetMutatingPattern],
                                    onMatch: Seq[SetMutatingPattern]) extends MutatingPattern with MergePattern {
  override def coveredIds: Set[String] = matchGraph.allCoveredIds

  override def dependencies: Set[String] =
    createNodes.flatMap(_.dependencies).toSet ++
    createRelationships.flatMap(_.dependencies).toSet ++
      onCreate.flatMap(_.dependencies) ++
      onMatch.flatMap(_.dependencies)
}

case class ForeachPattern(variable: String, expression: Expression, innerUpdates: SinglePlannerQuery) extends MutatingPattern with NoSymbols {
  override def dependencies: Set[String] = deps(expression) ++ innerUpdates.dependencies
}
