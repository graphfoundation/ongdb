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
package org.neo4j.cypher.internal.runtime.interpreted.commands.expressions

import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.util.symbols.CTString
import org.neo4j.cypher.internal.util.symbols.CypherType
import org.neo4j.cypher.operations.CypherFunctions
import org.neo4j.values.AnyValue
import org.neo4j.values.storable.Values.NO_VALUE

abstract class StringFunction(arg: Expression) extends NullInNullOutExpression(arg) {

  def innerExpectedType: CypherType = CTString

  override def arguments: Seq[Expression] = Seq(arg)

}

case class ToStringFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.toString(argument(ctx, state))

  override def rewrite(f: Expression => Expression): Expression = f(ToStringFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class ToStringOrNullFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.toStringOrNull(argument(ctx, state))

  override def rewrite(f: Expression => Expression): Expression = f(ToStringOrNullFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class ToStringListFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.toStringList(argument(ctx, state))

  override def rewrite(f: Expression => Expression): Expression = f(ToStringListFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class ToLowerFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue = CypherFunctions.toLower(value)

  override def rewrite(f: Expression => Expression): Expression = f(ToLowerFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class ToUpperFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue = CypherFunctions.toUpper(value)

  override def rewrite(f: Expression => Expression): Expression = f(ToUpperFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class LTrimFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.ltrim(value)

  override def rewrite(f: Expression => Expression): Expression = f(LTrimFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class RTrimFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.rtrim(value)

  override def rewrite(f: Expression => Expression): Expression = f(RTrimFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class TrimFunction(argument: Expression) extends StringFunction(argument) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.trim(value)

  override def rewrite(f: Expression => Expression): Expression = f(TrimFunction(argument.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(argument)
}

case class SubstringFunction(orig: Expression, start: Expression, length: Option[Expression])
  extends NullInNullOutExpression(orig) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue = length match {
    case None => CypherFunctions.substring(value, start(ctx, state))
    case Some(func) => CypherFunctions.substring(value, start(ctx, state), func(ctx, state))
  }

  override def arguments: Seq[Expression] = Seq(orig, start) ++ length

  override def children: Seq[AstNode[_]] = arguments

  override def rewrite(f: Expression => Expression): Expression = f(
    SubstringFunction(orig.rewrite(f), start.rewrite(f), length.map(_.rewrite(f))))

}

case class ReplaceFunction(orig: Expression, search: Expression, replaceWith: Expression)
  extends NullInNullOutExpression(orig) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue = {
      val searchVal = search(ctx, state)
      val replaceWithVal = replaceWith(ctx, state)
      if ((searchVal eq NO_VALUE) || (replaceWithVal eq NO_VALUE)) NO_VALUE
      else CypherFunctions.replace(value, searchVal, replaceWithVal)
  }

  override def arguments: Seq[Expression] = Seq(orig, search, replaceWith)

  override def children: Seq[AstNode[_]] = arguments

  override def rewrite(f: Expression => Expression): Expression = f(
    ReplaceFunction(orig.rewrite(f), search.rewrite(f), replaceWith.rewrite(f)))

}

case class SplitFunction(orig: Expression, separator: Expression)
  extends NullInNullOutExpression(orig) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue = {
    val sep = separator(ctx, state)
    if (sep eq NO_VALUE) NO_VALUE else CypherFunctions.split(value, sep)
  }

  override def arguments: Seq[Expression] = Seq(orig, separator)

  override def children: Seq[AstNode[_]] = arguments

  override def rewrite(f: Expression => Expression): Expression = f(SplitFunction(orig.rewrite(f), separator.rewrite(f)))
}

case class LeftFunction(orig: Expression, length: Expression)
  extends NullInNullOutExpression(orig) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.left(value, length(ctx, state))

  override def arguments: Seq[Expression] = Seq(orig, length)

  override def children: Seq[AstNode[_]] = arguments

  override def rewrite(f: Expression => Expression): Expression = f(LeftFunction(orig.rewrite(f), length.rewrite(f)))

}

case class RightFunction(orig: Expression, length: Expression)
  extends NullInNullOutExpression(orig) {

  override def compute(value: AnyValue, ctx: ReadableRow, state: QueryState): AnyValue =
    CypherFunctions.right(value, length(ctx, state))

  override def arguments: Seq[Expression] = Seq(orig, length)

  override def children: Seq[AstNode[_]] = arguments

  override def rewrite(f: Expression => Expression): Expression = f(RightFunction(orig.rewrite(f), length.rewrite(f)))

}
