/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.compatibility.v3_4.runtime.ast

import org.neo4j.cypher.internal.frontend.v3_4.SemanticCheck
import org.neo4j.cypher.internal.frontend.v3_4.semantics.{SemanticCheckResult, SemanticCheckableExpression}
import org.neo4j.cypher.internal.util.v3_4.AssertionUtils.ifAssertionsEnabled
import org.neo4j.cypher.internal.util.v3_4.{InputPosition, InternalException, Rewritable}
import org.neo4j.cypher.internal.v3_4.expressions.{Expression, LogicalProperty, PropertyKeyName}

abstract class RuntimeProperty(val prop: LogicalProperty) extends LogicalProperty with SemanticCheckableExpression{
  override def semanticCheck(ctx: Expression.SemanticContext): SemanticCheck = SemanticCheckResult.success

  override def position: InputPosition = InputPosition.NONE

  override def map: Expression = prop.map

  override def propertyKey: PropertyKeyName = prop.propertyKey

  override def dup(children: Seq[AnyRef]): this.type = {
    val constructor = Rewritable.copyConstructor(this)
    val args = children.toVector

    ifAssertionsEnabled {
      val params = constructor.getParameterTypes
      val ok = params.length == args.length + 1 && classOf[LogicalProperty].isAssignableFrom(params.last)
      if (!ok)
        throw new InternalException(s"Unexpected rewrite children $children")
    }

    val ctorArgs = args :+ prop // Add the original Property expression
    val duped = constructor.invoke(this, ctorArgs: _*)
    duped.asInstanceOf[this.type]
  }
}
