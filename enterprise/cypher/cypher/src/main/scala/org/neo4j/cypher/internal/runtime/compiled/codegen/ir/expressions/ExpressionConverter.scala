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
package org.neo4j.cypher.internal.runtime.compiled.codegen.ir.expressions

//import org.neo4j.cypher.internal.compiler.v3_6.planner.CantCompileQueryException

import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.expressions
import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.functions.functionConverter
import org.neo4j.cypher.internal.v4_0.expressions.False
import org.neo4j.cypher.internal.v4_0.expressions.True
//import org.neo4j.cypher.internal.v3_6.logical.plans.{CachedNodeProperty, CoerceToPredicate}
//import org.neo4j.cypher.internal.v4_0.util.symbols._
//import org.neo4j.cypher.internal.v3_6.{expressions => ast}
import org.neo4j.cypher.internal.logical.plans.CoerceToPredicate
import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenContext
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.MethodStructure
import org.neo4j.cypher.internal.v4_0.expressions.Add
import org.neo4j.cypher.internal.v4_0.expressions.Divide
import org.neo4j.cypher.internal.v4_0.expressions.DoubleLiteral
import org.neo4j.cypher.internal.v4_0.expressions.Expression
import org.neo4j.cypher.internal.v4_0.util.symbols._
//import org.neo4j.cypher.internal.v4_0.expressions.Expression
import org.neo4j.cypher.internal.v4_0.expressions.FunctionInvocation
import org.neo4j.cypher.internal.v4_0.expressions.HasLabels
import org.neo4j.cypher.internal.v4_0.expressions.IntegerLiteral
import org.neo4j.cypher.internal.v4_0.expressions.LogicalVariable
import org.neo4j.cypher.internal.v4_0.expressions.MapExpression
import org.neo4j.cypher.internal.v4_0.expressions.Multiply
import org.neo4j.cypher.internal.v4_0.expressions.Property
import org.neo4j.cypher.internal.v4_0.expressions.PropertyKeyName
import org.neo4j.cypher.internal.v4_0.expressions.StringLiteral
import org.neo4j.cypher.internal.v4_0.expressions.Subtract
import org.neo4j.cypher.internal.v4_0.util.symbols.CypherType
import org.neo4j.exceptions.CantCompileQueryException

object ExpressionConverter {

  implicit class ExpressionToPredicate(expression: CodeGenExpression) {

    def asPredicate = new CodeGenExpression {

      override def generateExpression[E](structure: MethodStructure[E])(implicit context: CodeGenContext) = {
        if (expression.nullable || !expression.codeGenType.isPrimitive) {
          structure.coerceToBoolean(expression.generateExpression(structure))
        } else {
          expression.generateExpression(structure)
        }
      }

      override def init[E](generator: MethodStructure[E])(implicit context: CodeGenContext) = expression.init(generator)

      override def nullable(implicit context: CodeGenContext) = false

      override def codeGenType(implicit context: CodeGenContext) =
        if (nullable) {
          CypherCodeGenType(CTBoolean, ReferenceType)
        } else {
          expression.codeGenType
        }
    }
  }

  def createPredicate(expression: Expression)
                     (implicit context: CodeGenContext): CodeGenExpression = expression match {
    case HasLabels(x: LogicalVariable, label :: Nil) =>
      val labelIdVariable = context.namer.newVarName()
      val nodeVariable = context.getVariable(x.name)
      HasLabel(nodeVariable, labelIdVariable, label.name).asPredicate

    case exp@Property(x: LogicalVariable, propKey) if context.semanticTable.isNode(x) =>
      createExpression(exp).asPredicate

    case exp@Property(x: LogicalVariable, propKey) if context.semanticTable.isRelationship(x) =>
      createExpression(exp).asPredicate
    // case Not(test) => codegen.Expression.not(compileExpression(test, block))
    case org.neo4j.cypher.internal.v4_0.expressions.Not(e) => Not(createExpression(e)).asPredicate

    case org.neo4j.cypher.internal.v4_0.expressions.Equals(lhs, rhs) => Equals(createExpression(lhs), createExpression(rhs)).asPredicate

    case org.neo4j.cypher.internal.v4_0.expressions.Or(lhs, rhs) => Or(createExpression(lhs), createExpression(rhs)).asPredicate

    case exp: LogicalVariable =>
      createExpression(exp).asPredicate

    case _: False => False
    case _: True => True

    case CoerceToPredicate(inner) => createPredicate(inner)

    case other =>
      throw new CantCompileQueryException(s"Predicate of $other not yet supported")

  }

  def createExpression(expression: Expression)
                      (implicit context: CodeGenContext): CodeGenExpression = expressionConverter(expression, createExpression)

  def createMaterializeExpressionForVariable(variableQueryVariable: String)
                                            (implicit context: CodeGenContext): CodeGenExpression = {

    val variable = context.getVariable(variableQueryVariable)

    variable.codeGenType match {
      case CypherCodeGenType(CTNode, _) => NodeProjection(variable)
      case CypherCodeGenType(CTRelationship, _) => RelationshipProjection(variable)
      case CypherCodeGenType(CTString, _) |
           CypherCodeGenType(CTBoolean, _) |
           CypherCodeGenType(CTInteger, _) |
           CypherCodeGenType(CTFloat, _) =>
        LoadVariable(variable)
      case CypherCodeGenType(ListType(CTInteger), ListReferenceType(LongType)) =>
        // TODO: PrimitiveProjection(variable)
        AnyProjection(variable) // Temporarily resort to runtime projection
      case CypherCodeGenType(ListType(CTFloat), ListReferenceType(FloatType)) =>
        // TODO: PrimitiveProjection(variable)
        AnyProjection(variable) // Temporarily resort to runtime projection
      case CypherCodeGenType(ListType(CTBoolean), ListReferenceType(BoolType)) =>
        // TODO: PrimitiveProjection(variable)
        AnyProjection(variable) // Temporarily resort to runtime projection
      case CypherCodeGenType(ListType(CTString), _) |
           CypherCodeGenType(ListType(CTBoolean), _) |
           CypherCodeGenType(ListType(CTInteger), _) |
           CypherCodeGenType(ListType(CTFloat), _) =>
        LoadVariable(variable)
      case CypherCodeGenType(CTAny, _) => AnyProjection(variable)
      case CypherCodeGenType(CTMap, _) => AnyProjection(variable)
      case CypherCodeGenType(ListType(_), _) => AnyProjection(variable) // TODO: We could have a more specialized projection when the inner type is known to be node or relationship
      case _ => throw new CantCompileQueryException(s"The compiled runtime cannot handle results of type ${variable.codeGenType}")
    }
  }

  private def expressionConverter(expression: Expression, callback: Expression => CodeGenExpression)
                                 (implicit context: CodeGenContext): CodeGenExpression = {

    expression match {
      case node: LogicalVariable if context.semanticTable.isNode(node) =>
        NodeExpression(context.getVariable(node.name))

      case rel: LogicalVariable if context.semanticTable.isRelationship(rel) =>
        RelationshipExpression(context.getVariable(rel.name))

      case Property(node: LogicalVariable, propKey) if context.semanticTable.isNode(node) =>
        val token = context.semanticTable.id(propKey).map(_.id)
        NodeProperty(token, propKey.name, context.getVariable(node.name), context.namer.newVarName())

      case Property(rel: LogicalVariable, propKey) if context.semanticTable.isRelationship(rel) =>
        val token = context.semanticTable.id(propKey).map(_.id)
        RelProperty(token, propKey.name, context.getVariable(rel.name), context.namer.newVarName())

      case Property(mapExpression, PropertyKeyName(propKeyName)) =>
        MapProperty(callback(mapExpression), propKeyName)

      case org.neo4j.cypher.internal.v4_0.expressions.Parameter(name, cypherType) =>
        // Parameters always comes as AnyValue
        expressions.Parameter(name, context.namer.newVarName(), CypherCodeGenType(cypherType.asInstanceOf[CypherType], AnyValueType))

      case lit: IntegerLiteral => Literal(lit.value)

      case lit: DoubleLiteral => Literal(lit.value)

      case lit: StringLiteral => Literal(lit.value)

      case lit: Literal => Literal(lit.value)

      case org.neo4j.cypher.internal.v4_0.expressions.ListLiteral(exprs) =>
        expressions.ListLiteral(exprs.map(e => callback(e)))

      case Add(lhs, rhs) =>
        val leftOp = callback(lhs)
        val rightOp = callback(rhs)
        Addition(leftOp, rightOp)

      case Subtract(lhs, rhs) =>
        val leftOp = callback(lhs)
        val rightOp = callback(rhs)
        Subtraction(leftOp, rightOp)

      case Multiply(lhs, rhs) =>
        val leftOp = callback(lhs)
        val rightOp = callback(rhs)
        Multiplication(leftOp, rightOp)

      case Divide(lhs, rhs) =>
        val leftOp = callback(lhs)
        val rightOp = callback(rhs)
        Division(leftOp, rightOp)

      case org.neo4j.cypher.internal.v4_0.expressions.Modulo(lhs, rhs) =>
        val leftOp = callback(lhs)
        val rightOp = callback(rhs)
        Modulo(leftOp, rightOp)

      case org.neo4j.cypher.internal.v4_0.expressions.Pow(lhs, rhs) =>
        val leftOp = callback(lhs)
        val rightOp = callback(rhs)
        Pow(leftOp, rightOp)

      case MapExpression(items) =>
        val map = items.map {
          case (key, expr) => (key.name, callback(expr))
        }.toMap
        MyMap(map)

      case HasLabels(x: LogicalVariable, label :: Nil) =>
        val labelIdVariable = context.namer.newVarName()
        val nodeVariable = context.getVariable(x.name)
        HasLabel(nodeVariable, labelIdVariable, label.name)

      case org.neo4j.cypher.internal.v4_0.expressions.Equals(lhs, rhs) => Equals(callback(lhs), callback(rhs))

      case org.neo4j.cypher.internal.v4_0.expressions.Or(lhs, rhs) => Or(callback(lhs), callback(rhs))

      case org.neo4j.cypher.internal.v4_0.expressions.Not(inner) => Not(callback(inner))

      case f: FunctionInvocation => functionConverter(f, callback)

      case x: LogicalVariable => LoadVariable(context.getVariable(x.name))

      //case x: CachedNodeProperty => LoadVariable(context.getVariable(x.cacheKey))

      case other => throw new CantCompileQueryException(s"Expression of $other not yet supported")
    }
  }

}
