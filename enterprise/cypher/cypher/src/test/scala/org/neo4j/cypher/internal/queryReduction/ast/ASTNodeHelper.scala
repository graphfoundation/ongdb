/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.cypher.internal.queryReduction.ast

object ASTNodeHelper {

  def getDepth(node: ASTNode): Int = {
    val children = getChildren(node)
    if (children.isEmpty) {
      0
    } else {
      children.map(getDepth).reduce(Math.max) + 1
    }
  }

  def countNodesOnLevel(node: ASTNode, level: Int): Int = {
    val children = getChildren(node)
    if (level == 0) {
      1
    } else {
      children.map(countNodesOnLevel(_, level - 1)).sum
    }
  }

  def getSize(node: ASTNode): Int = {
    getChildren(node).map(getSize).fold(1)(_ + _)
  }

  def forallNodes(node: ASTNode)(predicate: ASTNode => Boolean): Boolean = {
    getChildren(node).map(forallNodes(_)(predicate)).fold(predicate(node))(_ && _)
  }

  def existsNode(node: ASTNode)(predicate: ASTNode => Boolean): Boolean = {
    getChildren(node).map(existsNode(_)(predicate)).fold(predicate(node))(_ || _)
  }

}
