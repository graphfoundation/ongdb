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
package org.neo4j.cypher.internal.runtime.interpreted.commands.predicates

import org.neo4j.cypher.internal.runtime.CastSupport
import org.neo4j.cypher.internal.runtime.IsList
import org.neo4j.cypher.internal.runtime.IsNoValue
import org.neo4j.cypher.internal.runtime.ReadableRow
import org.neo4j.cypher.internal.runtime.interpreted.IsMap
import org.neo4j.cypher.internal.runtime.interpreted.commands.AstNode
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.AbstractCachedNodeProperty
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.AbstractCachedRelationshipProperty
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Expression
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.Literal
import org.neo4j.cypher.internal.runtime.interpreted.commands.expressions.ParameterFromSlot
import org.neo4j.cypher.internal.runtime.interpreted.commands.values.KeyToken
import org.neo4j.cypher.internal.runtime.interpreted.pipes.QueryState
import org.neo4j.cypher.internal.util.NonEmptyList
import org.neo4j.cypher.operations.CypherBoolean
import org.neo4j.exceptions.CypherTypeException
import org.neo4j.kernel.api.StatementConstants
import org.neo4j.values.storable.BooleanValue
import org.neo4j.values.storable.TextValue
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual.VirtualNodeValue
import org.neo4j.values.virtual.VirtualRelationshipValue

import java.util.regex.Pattern
import scala.util.Failure
import scala.util.Success
import scala.util.Try

abstract class Predicate extends Expression {
  override def apply(row: ReadableRow, state: QueryState): Value =
    isMatch(row, state).
      map(Values.booleanValue).
      getOrElse(Values.NO_VALUE)

  def isTrue(ctx: ReadableRow, state: QueryState): Boolean = isMatch(ctx, state).getOrElse(false)
  def andWith(other: Predicate): Predicate = Ands(this, other)
  def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean]

  // This is the un-dividable list of predicates. They can all be ANDed
  // together
  def atoms: Seq[Predicate] = Seq(this)
  def containsIsNull: Boolean

  def andWith(preds: Predicate*): Predicate =
    if (preds.isEmpty) this else preds.fold(this)(_ andWith _)
}

object Predicate {
  def fromSeq(in: Seq[Predicate]): Predicate = in.reduceOption(_ andWith _).getOrElse(True())
}

abstract class CompositeBooleanPredicate extends Predicate {

  def predicates: NonEmptyList[Predicate]

  def shouldExitWhen: Boolean

  override def containsIsNull: Boolean = predicates.exists(_.containsIsNull)

  /**
   * This algorithm handles the case where we combine multiple AND or multiple OR groups (CNF or DNF).
   * As well as performing shortcut evaluation so that a false (for AND) or true (for OR) will exit the
   * evaluation without performing any further predicate evaluations (including those that could throw
   * exceptions). Any exception thrown is held until the end (or until the exit state) so that it is
   * superceded by exit predicates (false for AND and true for OR).
   */
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    predicates.foldLeft[Try[Option[Boolean]]](Success(Some(!shouldExitWhen))) { (previousValue, predicate) =>
      previousValue match {
        // if a previous evaluation was true (false) the OR (AND) result is determined
        case Success(Some(result)) if result == shouldExitWhen => previousValue
        case _ =>
          Try(predicate.isMatch(ctx, state)) match {
            // If we get the exit case (false for AND and true for OR) ignore any error cases
            case Success(Some(result)) if result == shouldExitWhen => Success(Some(shouldExitWhen))
            // Handle null only for non error cases
            case Success(None) if previousValue.isSuccess => Success(None)
            // errors or non-exit cases propagate as normal
            case Failure(e) if previousValue.isSuccess => Failure(e)
            case _ => previousValue
          }
      }
    } match {
      case Failure(e) => throw e
      case Success(option) => option
    }
  }

  override def arguments: Seq[Expression] = predicates.toIndexedSeq

  override def atoms: Seq[Predicate] = predicates.toIndexedSeq
}

case class Not(a: Predicate) extends Predicate {
  def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = a.isMatch(ctx, state) match {
    case Some(x) => Some(!x)
    case None    => None
  }
  override def toString: String = "NOT(" + a + ")"
  override def containsIsNull: Boolean = a.containsIsNull
  override def rewrite(f: Expression => Expression): Expression = f(Not(a.rewriteAsPredicate(f)))
  override def arguments: Seq[Expression] = Seq(a)
  override def children: Seq[AstNode[_]] = Seq(a)
}

case class Xor(a: Predicate, b: Predicate) extends Predicate {
  def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] =
    (a.isMatch(ctx, state), b.isMatch(ctx, state)) match {
      case (None, _) => None
      case (_, None) => None
      case (Some(l), Some(r)) => Some(l ^ r)
    }

  override def toString: String = "(" + a + " XOR " + b + ")"
  override def containsIsNull: Boolean = a.containsIsNull || b.containsIsNull
  override def rewrite(f: Expression => Expression): Expression = f(Xor(a.rewriteAsPredicate(f), b.rewriteAsPredicate(f)))

  override def arguments: Seq[Expression] = Seq(a, b)

  override def children: Seq[AstNode[_]] = Seq(a, b)
}

case class IsNull(expression: Expression) extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = expression(ctx, state) match {
    case IsNoValue() => Some(true)
    case _ => Some(false)
  }

  override def toString: String = expression + " IS NULL"
  override def containsIsNull = true
  override def rewrite(f: Expression => Expression): Expression = f(IsNull(expression.rewrite(f)))
  override def arguments: Seq[Expression] = Seq(expression)
  override def children: Seq[AstNode[_]] = Seq(expression)
}

case class True() extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = Some(true)
  override def toString: String = "true"
  override def containsIsNull = false
  override def rewrite(f: Expression => Expression): Expression = f(this)
  override def arguments: Seq[Expression] = Seq.empty
  override def children: Seq[AstNode[_]] = Seq.empty
}

case class PropertyExists(variable: Expression, propertyKey: KeyToken) extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = variable(ctx, state) match {
    case pc: VirtualNodeValue =>
      Some(propertyKey.getOptId(state.query).exists(
        (propertyKeyId: Int) =>
          state.query.nodeReadOps.hasProperty(pc.id, propertyKeyId, state.cursors.nodeCursor, state.cursors.propertyCursor)))

    case pc: VirtualRelationshipValue =>
      Some(propertyKey.getOptId(state.query).exists(
        (propertyKeyId: Int) =>
          state.query.relationshipReadOps.hasProperty(pc.id, propertyKeyId, state.cursors.relationshipScanCursor, state.cursors.propertyCursor)))

    case IsMap(map) =>
      Some(map(state).get(propertyKey.name) != Values.NO_VALUE)

    case IsNoValue() => None
    case _ =>
      variable match {
        // resolve parameter name to value if possible/needed
        case p: ParameterFromSlot if state.params.length > p.offset =>
          throw new CypherTypeException("Invalid input for function 'exists()': Expected " + state.params(p.offset) + " to be a node, relationship or map")
        case _ =>
          throw new CypherTypeException("Invalid input for function 'exists()': Expected " + variable + " to be a node, relationship or map")
      }
  }

  override def toString: String = s"hasProp($variable.${propertyKey.name})"

  override def containsIsNull = false

  override def rewrite(f: Expression => Expression): Expression = f(PropertyExists(variable.rewrite(f), propertyKey.rewrite(f)))

  override def arguments: Seq[Expression] = Seq(variable)

  override def children: Seq[AstNode[_]] = Seq(variable, propertyKey)
}

case class CachedNodePropertyExists(cachedNodeProperty: Expression) extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    cachedNodeProperty match {
      case cp: AbstractCachedNodeProperty =>
        val nodeId = cp.getId(ctx)
        if (nodeId == StatementConstants.NO_SUCH_NODE) {
          None
        } else {
          cp.getPropertyKey(state.query) match {
            case StatementConstants.NO_SUCH_PROPERTY_KEY =>
              Some(false)
            case propId =>
              state.query.nodeReadOps.hasTxStatePropertyForCachedProperty(nodeId, propId) match {
                case None => // no change in TX state
                  cp.getCachedProperty(ctx) match {
                    case null =>
                      // the cached node property has been invalidated
                      val property = state.query.nodeReadOps.getProperty(nodeId, propId, state.cursors.nodeCursor, state.cursors.propertyCursor, throwOnDeleted = false)
                      // Re-cache the value
                      cp.setCachedProperty(ctx, property)
                      Some(!(property eq Values.NO_VALUE))
                    case IsNoValue() =>
                      Some(false)
                    case _ =>
                      Some(true)
                  }
                case changedInTXState =>
                  changedInTXState
              }
          }
        }
      case _ => throw new CypherTypeException("Expected " + cachedNodeProperty + " to be a cached node property.")
    }
  }

  override def toString: String = s"hasCachedNodeProp($cachedNodeProperty)"

  override def containsIsNull = false

  override def rewrite(f: Expression => Expression): Expression = f(CachedNodePropertyExists(cachedNodeProperty.rewrite(f)))

  override def arguments: Seq[Expression] = Seq(cachedNodeProperty)

  override def children: Seq[AstNode[_]] = Seq(cachedNodeProperty)
}

case class CachedRelationshipPropertyExists(cachedRelProperty: Expression) extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    cachedRelProperty match {
      case cp: AbstractCachedRelationshipProperty =>
        val relId = cp.getId(ctx)
        if (relId == StatementConstants.NO_SUCH_RELATIONSHIP) {
          None
        } else {
          cp.getPropertyKey(state.query) match {
            case StatementConstants.NO_SUCH_PROPERTY_KEY =>
              Some(false)
            case propId =>
              state.query.relationshipReadOps.hasTxStatePropertyForCachedProperty(relId, propId) match {
                case None => // no change in TX state
                  cp.getCachedProperty(ctx) match {
                    case null =>
                      // the cached rel property has been invalidated
                      val property = state.query.relationshipReadOps.getProperty(relId, propId, state.cursors.relationshipScanCursor, state.cursors.propertyCursor, throwOnDeleted = false)
                      // Re-cache the value
                      cp.setCachedProperty(ctx, property)
                      Some(!(property eq Values.NO_VALUE))
                    case IsNoValue() =>
                      Some(false)
                    case _ =>
                      Some(true)
                  }
                case changedInTXState =>
                  changedInTXState
              }
          }
        }
      case _ => throw new CypherTypeException("Expected " + cachedRelProperty + " to be a cached relationship property.")
    }
  }

  override def toString: String = s"hasCachedRelationshipProp($cachedRelProperty)"

  override def containsIsNull = false

  override def rewrite(f: Expression => Expression): Expression = f(CachedRelationshipPropertyExists(cachedRelProperty.rewrite(f)))

  override def arguments: Seq[Expression] = Seq(cachedRelProperty)

  override def children: Seq[AstNode[_]] = Seq(cachedRelProperty)
}

trait StringOperator {
  self: Predicate =>
  override def isMatch(m: ReadableRow, state: QueryState): Option[Boolean] = (lhs(m, state), rhs(m, state)) match {
    case (l: TextValue, r: TextValue) => Some(compare(l, r))
    case (_, _) => None
  }

  def lhs: Expression
  def rhs: Expression
  def compare(a: TextValue, b: TextValue): Boolean
  override def containsIsNull = false
  override def arguments: Seq[Expression] = Seq(lhs, rhs)
}

case class StartsWith(lhs: Expression, rhs: Expression) extends Predicate with StringOperator {
  override def compare(a: TextValue, b: TextValue): Boolean = a.startsWith(b)

  override def rewrite(f: Expression => Expression): Expression = f(copy(lhs.rewrite(f), rhs.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(lhs, rhs)
}

case class EndsWith(lhs: Expression, rhs: Expression) extends Predicate with StringOperator {
  override def compare(a: TextValue, b: TextValue): Boolean = a.endsWith(b)

  override def rewrite(f: Expression => Expression): Expression = f(copy(lhs.rewrite(f), rhs.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(lhs, rhs)
}

case class Contains(lhs: Expression, rhs: Expression) extends Predicate with StringOperator {
  override def compare(a: TextValue, b: TextValue): Boolean = a.contains(b)

  override def rewrite(f: Expression => Expression): Expression = f(copy(lhs.rewrite(f), rhs.rewrite(f)))

  override def children: Seq[AstNode[_]] = Seq(lhs, rhs)
}

case class LiteralRegularExpression(lhsExpr: Expression, regexExpr: Literal)
                                   (implicit converter: TextValue => TextValue = identity) extends Predicate {
  lazy val pattern: Pattern = converter(regexExpr.value.asInstanceOf[TextValue]).stringValue().r.pattern

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] =
    lhsExpr(ctx, state) match {
      case s: TextValue => Some(pattern.matcher(s.stringValue()).matches())
      case _ => None
    }

  override def containsIsNull = false

  override def rewrite(f: Expression => Expression): Expression = f(regexExpr.rewrite(f) match {
    case lit: Literal => LiteralRegularExpression(lhsExpr.rewrite(f), lit)(converter)
    case other        => RegularExpression(lhsExpr.rewrite(f), other)(converter)
  })

  override def arguments: Seq[Expression] = Seq(lhsExpr, regexExpr)

  override def children: Seq[AstNode[_]] = Seq(lhsExpr, regexExpr)
  override def toString = s"$lhsExpr =~ $regexExpr"
}

case class RegularExpression(lhsExpr: Expression, regexExpr: Expression)
                            (implicit converter: TextValue => TextValue = identity) extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    val lValue = lhsExpr(ctx, state)
    val rValue = regexExpr(ctx, state)
    (lValue, rValue) match {
      case (lhs: TextValue, rhs) if !(rhs eq Values.NO_VALUE) =>
        val rhsAsRegexString = converter(CastSupport.castOrFail[TextValue](rhs))
        Some(CypherBoolean.regex(lhs, rhsAsRegexString).booleanValue())
      case _ => None
    }
  }

  override def toString: String = lhsExpr.toString() + " ~= /" + regexExpr.toString() + "/"

  override def containsIsNull = false

  override def rewrite(f: Expression => Expression): Expression = f(regexExpr.rewrite(f) match {
    case lit:Literal => LiteralRegularExpression(lhsExpr.rewrite(f), lit)(converter)
    case other => RegularExpression(lhsExpr.rewrite(f), other)(converter)
  })

  override def arguments: Seq[Expression] = Seq(lhsExpr, regexExpr)

  override def children: Seq[AstNode[_]] = Seq(lhsExpr, regexExpr)
}

case class NonEmpty(collection: Expression) extends Predicate {
  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = {
    collection(ctx, state) match {
      case IsList(x) => Some(x.nonEmpty)
      case IsNoValue() => None
      case x => throw new CypherTypeException(s"Expected a collection, got `$x`")
    }
  }

  override def toString: String = "nonEmpty(" + collection.toString() + ")"

  override def containsIsNull = false

  override def rewrite(f: Expression => Expression): Expression = f(NonEmpty(collection.rewrite(f)))

  override def arguments: Seq[Expression] = Seq(collection)

  override def children: Seq[AstNode[_]] = Seq(collection)
}

case class HasLabelOrType(entity: Expression, labelOrType: String) extends Predicate {

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = entity(ctx, state) match {

    case IsNoValue() =>
      None

    case node: VirtualNodeValue =>
      val nodeId = node.id
      val queryCtx = state.query
      val token = state.query.nodeLabel(labelOrType)
      if (token == StatementConstants.NO_SUCH_LABEL) Some(false)
      else Some(queryCtx.isLabelSetOnNode(token, nodeId, state.cursors.nodeCursor))

    case relationship: VirtualRelationshipValue =>
      val relId = relationship.id
      val queryCtx = state.query
      val token = state.query.relationshipType(labelOrType)
      if (token == StatementConstants.NO_SUCH_RELATIONSHIP_TYPE) Some(false)
      else Some(queryCtx.isTypeSetOnRelationship(token, relId, state.cursors.relationshipScanCursor))

    case value =>
      throw new CypherTypeException(
        s"Expected $value to be a Node or Relationship, but it was a ${value.getClass.getName}")
  }

  override def toString = s"$entity:$labelOrType"

  override def rewrite(f: Expression => Expression): Expression = f(HasLabelOrType(entity.rewrite(f), labelOrType))

  override def children: Seq[Expression] = Seq(entity)

  override def arguments: Seq[Expression] = Seq(entity)

  override def containsIsNull = false
}

case class HasLabel(entity: Expression, label: KeyToken) extends Predicate {

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = entity(ctx, state) match {

    case IsNoValue() =>
      None

    case value =>
      val node = CastSupport.castOrFail[VirtualNodeValue](value)
      val nodeId = node.id
      val queryCtx = state.query

      label.getOptId(state.query) match {
        case None =>
          Some(false)
        case Some(labelId) =>
          Some(queryCtx.isLabelSetOnNode(labelId, nodeId, state.cursors.nodeCursor))
      }
  }

  override def toString = s"$entity:${label.name}"

  override def rewrite(f: Expression => Expression): Expression = f(HasLabel(entity.rewrite(f), label.typedRewrite[KeyToken](f)))

  override def children: Seq[Expression] = Seq(label, entity)

  override def arguments: Seq[Expression] = Seq(entity)

  override def containsIsNull = false
}

case class HasAnyLabel(entity: Expression, labels: Seq[KeyToken]) extends Predicate {

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = entity(ctx, state) match {
    case IsNoValue() =>
      None

    case value =>
      val nodeId = CastSupport.castOrFail[VirtualNodeValue](value).id()
      val tokens = labels.flatMap(_.getOptId(state.query)).toArray
      Some(state.query.isAnyLabelSetOnNode(tokens, nodeId, state.cursors.nodeCursor))
  }

  override def toString = s"$entity:${labels.mkString("|")}"

  override def rewrite(f: Expression => Expression): Expression = f(HasAnyLabel(entity.rewrite(f), labels.map(_.typedRewrite[KeyToken](f))))

  override def children: Seq[Expression] = labels :+ entity

  override def arguments: Seq[Expression] = Seq(entity)

  override def containsIsNull = false
}

case class HasType(entity: Expression, typ: KeyToken) extends Predicate {

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = entity(ctx, state) match {

    case IsNoValue() =>
      None

    case value =>
      val relationship = CastSupport.castOrFail[VirtualRelationshipValue](value)
      val relationshipId = relationship.id
      val queryCtx = state.query

      typ.getOptId(state.query) match {
        case None =>
          Some(false)
        case Some(relTypeId) =>
          Some(queryCtx.isTypeSetOnRelationship(relTypeId, relationshipId, state.cursors.relationshipScanCursor))
      }
  }

  override def toString = s"$entity:${typ.name}"

  override def rewrite(f: Expression => Expression): Expression = f(HasType(entity.rewrite(f), typ.typedRewrite[KeyToken](f)))

  override def children: Seq[Expression] = Seq(typ, entity)

  override def arguments: Seq[Expression] = Seq(entity)

  override def containsIsNull = false
}

case class CoercedPredicate(inner: Expression) extends Predicate {
  override def arguments: Seq[Expression] = Seq(inner)

  override def children: Seq[AstNode[_]] = Seq(inner)

  override def isMatch(ctx: ReadableRow, state: QueryState): Option[Boolean] = inner(ctx, state) match {
    case x: BooleanValue => Some(x.booleanValue())
    case IsNoValue() => None
    case IsList(coll) => Some(coll.nonEmpty)
    case x => throw new CypherTypeException(s"Don't know how to treat that as a predicate: $x")
  }

  override def rewrite(f: Expression => Expression): Expression = f(CoercedPredicate(inner.rewrite(f)))

  override def containsIsNull = false

  override def toString: String = inner.toString
}
