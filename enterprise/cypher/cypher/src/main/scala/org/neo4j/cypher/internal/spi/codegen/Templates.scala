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
package org.neo4j.cypher.internal.spi.codegen

import java.util
import java.util.Comparator
import java.util.function.Consumer
import java.util.stream.DoubleStream
import java.util.stream.IntStream
import java.util.stream.LongStream

import org.eclipse.collections.impl.map.mutable.primitive.LongIntHashMap
import org.neo4j.codegen.ExpressionTemplate._
import org.neo4j.codegen.MethodDeclaration.Builder
import org.neo4j.codegen.MethodReference._
import org.neo4j.codegen._
import org.neo4j.common.TokenNameLookup
import org.neo4j.cypher.internal.codegen.PrimitiveNodeStream
import org.neo4j.cypher.internal.codegen.PrimitiveRelationshipStream
import org.neo4j.cypher.internal.javacompat.ResultRowImpl
import org.neo4j.cypher.internal.runtime.ExecutionMode
import org.neo4j.cypher.internal.runtime.QueryContext
import org.neo4j.cypher.internal.runtime.QueryTransactionalContext
import org.neo4j.cypher.internal.runtime.compiled.codegen.Namer
import org.neo4j.cypher.internal.runtime.parallel.tracing.QueryExecutionTracer
import org.neo4j.cypher.internal.spi.codegen.Methods.newNodeEntityById
import org.neo4j.cypher.internal.spi.codegen.Methods.newRelationshipEntityById
import org.neo4j.cypher.internal.v4_0.frontend.helpers.using
import org.neo4j.exceptions.CypherExecutionException
import org.neo4j.exceptions.KernelException
import org.neo4j.graphdb.Direction
import org.neo4j.graphdb.Node
import org.neo4j.graphdb.Relationship
import org.neo4j.internal.kernel.api._
import org.neo4j.internal.kernel.api.exceptions.EntityNotFoundException
import org.neo4j.kernel.api.SilentTokenNameLookup
import org.neo4j.kernel.impl.api.RelationshipDataExtractor
import org.neo4j.kernel.impl.core.TransactionalEntityFactory
import org.neo4j.kernel.impl.util.ValueUtils
import org.neo4j.values.AnyValue
import org.neo4j.values.AnyValues
import org.neo4j.values.storable.Value
import org.neo4j.values.storable.ValueComparator
import org.neo4j.values.storable.Values
import org.neo4j.values.virtual._

object Templates {

  import org.neo4j.cypher.internal.spi.codegen.GeneratedQueryStructure.method
  import org.neo4j.cypher.internal.spi.codegen.GeneratedQueryStructure.param
  import org.neo4j.cypher.internal.spi.codegen.GeneratedQueryStructure.staticField
  import org.neo4j.cypher.internal.spi.codegen.GeneratedQueryStructure.typeRef

  val newCountingMap = createNewInstance(typeRef[LongIntHashMap])
  val noValue = Expression.getStatic(staticField[Values, Value]("NO_VALUE"))
  val incoming = Expression.getStatic(staticField[Direction, Direction](Direction.INCOMING.name()))
  val outgoing = Expression.getStatic(staticField[Direction, Direction](Direction.OUTGOING.name()))
  val both = Expression.getStatic(staticField[Direction, Direction](Direction.BOTH.name()))
  val newResultRow = Expression
    .invoke(Expression.newInstance(typeRef[ResultRowImpl]),
      MethodReference.constructorReference(typeRef[ResultRowImpl]))
  val newRelationshipDataExtractor = Expression
    .invoke(Expression.newInstance(typeRef[RelationshipDataExtractor]),
      MethodReference.constructorReference(typeRef[RelationshipDataExtractor]))
  val valueComparator = Expression.getStatic(staticField[Values, ValueComparator]("COMPARATOR"))
  val anyValueComparator = Expression.getStatic(staticField[AnyValues, Comparator[AnyValue]]("COMPARATOR"))
  val FIELD_NAMES = MethodTemplate.method(TypeReference.typeReference(classOf[Array[String]]), "fieldNames").
    returns(get(TypeReference.typeReference(classOf[Array[String]]), "COLUMNS")).
    build()

  def createNewInstance(valueType: TypeReference, args: (TypeReference, Expression)*): Expression = {
    val argTypes = args.map(_._1)
    val argExpression = args.map(_._2)
    Expression.invoke(Expression.newInstance(valueType),
      MethodReference.constructorReference(valueType, argTypes: _*), argExpression: _*)
  }

  def createNewNodeReference(expression: Expression): Expression =
    Expression.invoke(method[VirtualValues, NodeReference]("node", typeRef[Long]), expression)

  def createNewRelationshipReference(expression: Expression): Expression =
    Expression.invoke(method[VirtualValues, RelationshipReference]("relationship", typeRef[Long]), expression)

  def createNewNodeValueFromPrimitive(proxySpi: Expression, expression: Expression) =
    Expression.invoke(method[ValueUtils, NodeValue]("fromNodeProxy", typeRef[Node]),
      Expression.invoke(proxySpi, newNodeEntityById, expression))

  def createNewRelationshipValueFromPrimitive(proxySpi: Expression, expression: Expression) =
    Expression.invoke(method[ValueUtils, RelationshipValue]("fromRelationshipProxy", typeRef[Relationship]),
      Expression.invoke(proxySpi, newRelationshipEntityById, expression))

  def asList[T](values: Seq[Expression])(implicit manifest: Manifest[T]): Expression = Expression.invoke(
    methodReference(typeRef[util.Arrays], typeRef[util.List[T]], "asList", typeRef[Array[Object]]),
    Expression.newInitializedArray(typeRef[T], values: _*))

  def asAnyValueList(values: Seq[Expression]): Expression = Expression.invoke(
    methodReference(typeRef[VirtualValues], typeRef[ListValue], "list", typeRef[Array[AnyValue]]),
    Expression.newInitializedArray(typeRef[AnyValue], values: _*))

  def asPrimitiveNodeStream(values: Seq[Expression]): Expression = Expression.invoke(
    methodReference(typeRef[PrimitiveNodeStream], typeRef[PrimitiveNodeStream], "of", typeRef[Array[Long]]),
    Expression.newInitializedArray(typeRef[Long], values: _*))

  def asPrimitiveRelationshipStream(values: Seq[Expression]): Expression = Expression.invoke(
    methodReference(typeRef[PrimitiveRelationshipStream], typeRef[PrimitiveRelationshipStream], "of", typeRef[Array[Long]]),
    Expression.newInitializedArray(typeRef[Long], values: _*))

  def asLongStream(values: Seq[Expression]): Expression = Expression.invoke(
    methodReference(typeRef[LongStream], typeRef[LongStream], "of", typeRef[Array[Long]]),
    Expression.newInitializedArray(typeRef[Long], values: _*))

  def asDoubleStream(values: Seq[Expression]): Expression = Expression.invoke(
    methodReference(typeRef[DoubleStream], typeRef[DoubleStream], "of", typeRef[Array[Double]]),
    Expression.newInitializedArray(typeRef[Double], values: _*))

  def asIntStream(values: Seq[Expression]): Expression = Expression.invoke(
    methodReference(typeRef[IntStream], typeRef[IntStream], "of", typeRef[Array[Int]]),
    Expression.newInitializedArray(typeRef[Int], values: _*))

  def handleEntityNotFound[V](generate: CodeBlock, fields: Fields, namer: Namer)
                             (happyPath: CodeBlock => V)(onFailure: CodeBlock => V): V = {
    var result = null.asInstanceOf[V]

    generate.tryCatch(new Consumer[CodeBlock] {
      override def accept(innerBody: CodeBlock): Unit = result = happyPath(innerBody)
    }, new Consumer[CodeBlock] {
      override def accept(innerError: CodeBlock): Unit = {

        result = onFailure(innerError)
      }
    }, param[EntityNotFoundException](namer.newVarName()))
    result
  }

  def handleKernelExceptions[V](generate: CodeBlock, fields: Fields, finalizers: Seq[Boolean => CodeBlock => Unit], namer: Namer)
                               (block: CodeBlock => V): V = {
    var result = null.asInstanceOf[V]
    val e = namer.newVarName()
    generate.tryCatch(new Consumer[CodeBlock] {
      override def accept(body: CodeBlock) = {
        result = block(body)
      }
    }, new Consumer[CodeBlock]() {
      override def accept(handle: CodeBlock) = {
        finalizers.foreach(block => block(false)(handle))
        handle.throwException(Expression.invoke(
          Expression.newInstance(typeRef[CypherExecutionException]),
          MethodReference.constructorReference(typeRef[CypherExecutionException], typeRef[String], typeRef[Throwable]),
          Expression
            .invoke(handle.load(e), method[KernelException, String]("getUserMessage", typeRef[TokenNameLookup]),
              Expression.invoke(
                Expression.newInstance(typeRef[SilentTokenNameLookup]),
                MethodReference
                  .constructorReference(typeRef[SilentTokenNameLookup], typeRef[TokenRead]),
                Expression.get(handle.self(), fields.tokenRead))), handle.load(e)
        ))
      }
    }, param[KernelException](e))

    result
  }

  def tryCatch(generate: CodeBlock)(tryBlock: CodeBlock => Unit)(exception: Parameter)(catchBlock: CodeBlock => Unit): Unit = {
    generate.tryCatch(new Consumer[CodeBlock] {
      override def accept(body: CodeBlock) = tryBlock(body)
    }, new Consumer[CodeBlock]() {
      override def accept(handle: CodeBlock) = catchBlock(handle)
    }, exception)
  }

  def constructor(classHandle: ClassHandle) = MethodTemplate.constructor(
    param[QueryContext]("queryContext"),
    param[QueryExecutionTracer]("tracer"),
    param[MapValue]("params")).
    invokeSuper().
    put(self(classHandle), typeRef[QueryContext], "queryContext", load("queryContext", typeRef[QueryContext])).
    put(self(classHandle), typeRef[QueryExecutionTracer], "tracer", load("tracer", typeRef[QueryExecutionTracer])).
    put(self(classHandle), typeRef[MapValue], "params", load("params", typeRef[MapValue])).
    put(self(classHandle), typeRef[TransactionalEntityFactory], "proxySpi",
      invoke(load("queryContext", typeRef[QueryContext]), method[QueryContext, QueryContext]("entityAccessor"))).
    put(self(classHandle), typeRef[AutoCloseable], "closeables", Expression.constant(false)).
    build()

  def getOrLoadCursors(clazz: ClassGenerator, fields: Fields) = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[CursorFactory], "getOrLoadCursors")
    using(clazz.generate(methodBuilder)) { generate =>
      val cursors = Expression.get(generate.self(), fields.cursors)
      using(generate.ifStatement(Expression.isNull(cursors))) { block =>
        val transactionalContext: MethodReference = method[QueryContext, QueryTransactionalContext]("transactionalContext")
        val cursors: MethodReference = method[QueryTransactionalContext, CursorFactory]("cursors")
        val queryContext = Expression.get(block.self(), fields.queryContext)
        block.put(block.self(), fields.cursors,
          Expression.invoke(Expression.invoke(queryContext, transactionalContext), cursors))
      }
      generate.returns(cursors)
    }
  }

  def getOrLoadDataRead(clazz: ClassGenerator, fields: Fields) = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[Read], "getOrLoadDataRead")
    using(clazz.generate(methodBuilder)) { generate =>
      val dataRead = Expression.get(generate.self(), fields.dataRead)
      using(generate.ifStatement(Expression.isNull(dataRead))) { block =>
        val transactionalContext: MethodReference = method[QueryContext, QueryTransactionalContext]("transactionalContext")
        val dataRead: MethodReference = method[QueryTransactionalContext, Read]("dataRead")
        val queryContext = Expression.get(block.self(), fields.queryContext)
        block.put(block.self(), fields.dataRead,
          Expression.invoke(Expression.invoke(queryContext, transactionalContext), dataRead))
      }
      generate.returns(dataRead)
    }
  }

  def getOrLoadTokenRead(clazz: ClassGenerator, fields: Fields) = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[TokenRead], "getOrLoadTokenRead")
    using(clazz.generate(methodBuilder)) { generate =>
      val tokenRead = Expression.get(generate.self(), fields.tokenRead)
      using(generate.ifStatement(Expression.isNull(tokenRead))) { block =>
        val transactionalContext: MethodReference = method[QueryContext, QueryTransactionalContext]("transactionalContext")
        val tokenRead: MethodReference = method[QueryTransactionalContext, TokenRead]("tokenRead")
        val queryContext = Expression.get(block.self(), fields.queryContext)
        block.put(block.self(), fields.tokenRead,
          Expression.invoke(Expression.invoke(queryContext, transactionalContext), tokenRead))
      }
      generate.returns(tokenRead)
    }
  }

  def getOrLoadSchemaRead(clazz: ClassGenerator, fields: Fields) = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[SchemaRead], "getOrLoadSchemaRead")
    using(clazz.generate(methodBuilder)) { generate =>
      val schemaRead = Expression.get(generate.self(), fields.schemaRead)
      using(generate.ifStatement(Expression.isNull(schemaRead))) { block =>
        val transactionalContext: MethodReference = method[QueryContext, QueryTransactionalContext]("transactionalContext")
        val schemaRead: MethodReference = method[QueryTransactionalContext, SchemaRead]("schemaRead")
        val queryContext = Expression.get(block.self(), fields.queryContext)
        block.put(block.self(), fields.schemaRead,
          Expression.invoke(Expression.invoke(queryContext, transactionalContext), schemaRead))
      }
      generate.returns(schemaRead)
    }
  }

  def executionMode(classHandle: ClassHandle) = MethodTemplate.method(typeRef[ExecutionMode], "executionMode").
    returns(get(self(classHandle), typeRef[ExecutionMode], "executionMode")).
    build()

  def nodeCursor(clazz: ClassGenerator, fields: Fields): Unit = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[NodeCursor], "nodeCursor")
    using(clazz.generate(methodBuilder)) { generate =>
      val nodeCursor = Expression.get(generate.self(), fields.nodeCursor)
      Expression.get(generate.self(), fields.cursors)
      val cursors = Expression.invoke(generate.self(),
        methodReference(generate.owner(), typeRef[CursorFactory], "getOrLoadCursors"))
      using(generate.ifStatement(Expression.isNull(nodeCursor))) { block =>
        block.put(block.self(), fields.nodeCursor,
          Expression.invoke(cursors, method[CursorFactory, NodeCursor]("allocateNodeCursor")))

      }
      generate.returns(nodeCursor)
    }
  }

  def relationshipScanCursor(clazz: ClassGenerator, fields: Fields): Unit = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[RelationshipScanCursor], "relationshipScanCursor")
    using(clazz.generate(methodBuilder)) { generate =>
      val relationshipCursor = Expression.get(generate.self(), fields.relationshipScanCursor)
      Expression.get(generate.self(), fields.cursors)
      val cursors = Expression.invoke(generate.self(),
        methodReference(generate.owner(), typeRef[CursorFactory], "getOrLoadCursors"))
      using(generate.ifStatement(Expression.isNull(relationshipCursor))) { block =>
        block.put(block.self(), fields.relationshipScanCursor,
          Expression.invoke(cursors, method[CursorFactory, RelationshipScanCursor]("allocateRelationshipScanCursor")))

      }
      generate.returns(relationshipCursor)
    }
  }

  def closeCursors(clazz: ClassGenerator, fields: Fields): Unit = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[Unit], "closeCursors")
    using(clazz.generate(methodBuilder)) { generate =>
      val nodeCursor = Expression.get(generate.self(), fields.nodeCursor)
      using(generate.ifStatement(Expression.notNull(nodeCursor))) { block =>
        block.expression(Expression.invoke(nodeCursor, method[NodeCursor, Unit]("close")))
      }
      val relationshipCursor = Expression.get(generate.self(), fields.relationshipScanCursor)
      using(generate.ifStatement(Expression.notNull(relationshipCursor))) { block =>
        block.expression(Expression.invoke(relationshipCursor, method[RelationshipScanCursor, Unit]("close")))
      }
      val propertyCursor = Expression.get(generate.self(), fields.propertyCursor)
      using(generate.ifStatement(Expression.notNull(propertyCursor))) { block =>
        block.expression(Expression.invoke(propertyCursor, method[PropertyCursor, Unit]("close")))
      }
    }
  }

  def propertyCursor(clazz: ClassGenerator, fields: Fields): Unit = {
    val methodBuilder: Builder = MethodDeclaration.method(typeRef[PropertyCursor], "propertyCursor")
    using(clazz.generate(methodBuilder)) { generate =>
      val propertyCursor = Expression.get(generate.self(), fields.propertyCursor)
      val cursors = Expression.invoke(generate.self(),
        methodReference(generate.owner(), typeRef[CursorFactory], "getOrLoadCursors"))
      using(generate.ifStatement(Expression.isNull(propertyCursor))) { block =>
        block.put(block.self(), fields.propertyCursor,
          Expression.invoke(cursors, method[CursorFactory, PropertyCursor]("allocatePropertyCursor")))

      }
      generate.returns(propertyCursor)
    }
  }
}
