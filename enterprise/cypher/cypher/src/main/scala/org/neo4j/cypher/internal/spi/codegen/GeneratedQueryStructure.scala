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

import java.lang.reflect.Modifier
import java.util.stream.{DoubleStream, IntStream, LongStream}

import org.neo4j.codegen.Expression.{constant, invoke, newInitializedArray, newInstance}
import org.neo4j.codegen.MethodReference.{constructorReference, methodReference}
import org.neo4j.codegen.TypeReference._
import org.neo4j.codegen.bytecode.ByteCode.{BYTECODE, VERIFY_GENERATED_BYTECODE}
import org.neo4j.codegen.source.SourceCode.SOURCECODE
import org.neo4j.codegen.source.{SourceCode, SourceVisitor}
import org.neo4j.codegen.{CodeGenerator, Parameter, TypeReference, _}
import org.neo4j.cypher.internal.codegen.{PrimitiveNodeStream, PrimitiveRelationshipStream}
import org.neo4j.kernel.impl.core.TransactionalEntityFactory
import org.neo4j.cypher.internal.executionplan.{GeneratedQuery, GeneratedQueryExecution}
import org.neo4j.cypher.internal.v4_0.frontend.helpers.using
import org.neo4j.cypher.internal.javacompat.ResultRecord
import org.neo4j.cypher.internal.runtime.compiled.codegen._
import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.expressions._
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.{CodeStructure, CodeStructureResult, MethodStructure}
import org.neo4j.cypher.internal.runtime.{ExecutionMode, QueryContext}
import org.neo4j.cypher.internal.v4_0.util.symbols
import org.neo4j.cypher.result.QueryResult.QueryResultVisitor
import org.neo4j.internal.kernel.api._
import org.neo4j.values.AnyValue
import org.neo4j.values.virtual.MapValue

import scala.collection.mutable
import org.neo4j.codegen.Expression
import org.neo4j.codegen.FieldReference
import org.neo4j.codegen.MethodReference
import org.neo4j.codegen.Parameter
import org.neo4j.codegen.TypeReference
import org.neo4j.cypher.internal.executionplan.GeneratedQuery
import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenConfiguration
import org.neo4j.cypher.internal.runtime.compiled.codegen.CodeGenContext
import org.neo4j.cypher.internal.runtime.compiled.codegen.ir.expressions.CodeGenType
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.CodeStructureResult
import org.neo4j.cypher.internal.runtime.compiled.codegen.spi.MethodStructure
import org.neo4j.cypher.internal.runtime.parallel.tracing.QueryExecutionTracer
import org.neo4j.cypher.internal.v4_0.util.attribution.Id

import scala.collection.mutable

object GeneratedQueryStructure extends CodeStructure[GeneratedQuery] {

  def generateQuery(className: String,
                    columns: Seq[String],
                    operatorIds: Map[String, Id],
                    conf: CodeGenConfiguration)
                   (methodStructure: MethodStructure[_] => Unit)
                   (implicit codeGenContext: CodeGenContext): GeneratedQueryStructureResult = {

    val sourceSaver = new CodeSaver
    val generator = createGenerator(conf, sourceSaver)
    val execution = using(
      generator.generateClass(conf.packageName, className + "Execution", typeRef[GeneratedQueryExecution])) { clazz =>
      val fields: Fields = createFields(columns, clazz)
      setOperatorIds(clazz, operatorIds)
      addSimpleMethods(clazz, fields)
      addAccept(methodStructure, generator, clazz, fields, conf)
      clazz.handle()
    }

    val query = using(generator.generateClass(conf.packageName, className, typeRef[GeneratedQuery])) { clazz =>
      using(clazz.generateMethod(typeRef[GeneratedQueryExecution], "execute",
        param[QueryContext]("queryContext"),
        param[QueryExecutionTracer]("tracer"),
        param[MapValue]("params"))) { execute =>
        execute.returns(
          invoke(
            newInstance(execution),
            constructorReference(execution,
              typeRef[QueryContext],
              typeRef[QueryExecutionTracer],
              typeRef[MapValue]),
            execute.load("queryContext"),

            execute.load("tracer"),
            execute.load("params")))
      }
      clazz.handle()
    }.newInstance().asInstanceOf[GeneratedQuery]

    val clazz: Class[_] = execution.loadClass()
    operatorIds.foreach {
      case (key, id) =>
        val anyRefId = id.asInstanceOf[AnyRef]
        setStaticField(clazz, key, anyRefId)
    }
    GeneratedQueryStructureResult(query, sourceSaver.sourceCode, sourceSaver.bytecode)
  }

  def method[O <: AnyRef, R](name: String, params: TypeReference*)
                            (implicit owner: Manifest[O], returns: Manifest[R]): MethodReference =
    MethodReference.methodReference(typeReference(owner), typeReference(returns), name, Modifier.PUBLIC, params: _*)

  def staticField[O <: AnyRef, R](name: String)(implicit owner: Manifest[O], fieldType: Manifest[R]): FieldReference =
    FieldReference.staticField(typeReference(owner), typeReference(fieldType), name)

  def param[T <: AnyRef](name: String)(implicit manifest: Manifest[T]): Parameter =
    Parameter.param(typeReference(manifest), name)

  def typeRef[T](implicit manifest: Manifest[T]): TypeReference = typeReference(manifest)

  def typeReference(manifest: Manifest[_]): TypeReference = {
    val arguments = manifest.typeArguments
    val base = TypeReference.typeReference(manifest.runtimeClass)
    if (arguments.nonEmpty) {
      TypeReference.parameterizedType(base, arguments.map(typeReference): _*)
    } else {
      base
    }
  }

  def lowerType(cType: CodeGenType): TypeReference = cType match {
    case CypherCodeGenType(symbols.CTNode, LongType) => typeRef[Long]
    case CypherCodeGenType(symbols.CTRelationship, LongType) => typeRef[Long]
    case CypherCodeGenType(symbols.CTInteger, LongType) => typeRef[Long]
    case CypherCodeGenType(symbols.CTFloat, FloatType) => typeRef[Double]
    case CypherCodeGenType(symbols.CTBoolean, BoolType) => typeRef[Boolean]
    case CypherCodeGenType(symbols.ListType(symbols.CTNode), ListReferenceType(LongType)) => typeRef[PrimitiveNodeStream]
    case CypherCodeGenType(symbols.ListType(symbols.CTRelationship), ListReferenceType(LongType)) => typeRef[PrimitiveRelationshipStream]
    case CypherCodeGenType(symbols.ListType(_), ListReferenceType(LongType)) => typeRef[LongStream]
    case CypherCodeGenType(symbols.ListType(_), ListReferenceType(FloatType)) => typeRef[DoubleStream]
    case CypherCodeGenType(symbols.ListType(_), ListReferenceType(BoolType)) => typeRef[IntStream]
    case CodeGenType.javaInt => typeRef[Int]
    case CypherCodeGenType(_, _: AnyValueType) => typeRef[AnyValue]
    case _ => typeRef[Object]
  }

  def lowerTypeScalarSubset(cType: CodeGenType): TypeReference = cType match {
    case CypherCodeGenType(symbols.CTNode, LongType) => lowerType(cType)
    case CypherCodeGenType(symbols.CTRelationship, LongType) => lowerType(cType)
    case CypherCodeGenType(symbols.CTInteger, LongType) => lowerType(cType)
    case CypherCodeGenType(symbols.CTFloat, FloatType) => lowerType(cType)
    case CypherCodeGenType(symbols.CTBoolean, BoolType) => lowerType(cType)
    case CodeGenType.javaInt => lowerType(cType)
    case CypherCodeGenType(_, _: AnyValueType) => lowerType(cType)
    case _ => typeRef[Object]
  }

  def nullValue(cType: CodeGenType): Expression = cType match {
    case CypherCodeGenType(symbols.CTNode, LongType) => constant(-1L)
    case CypherCodeGenType(symbols.CTRelationship, LongType) => constant(-1L)
    case CypherCodeGenType(_, _: AnyValueType) => Templates.noValue
    case _ => constant(null)
  }

  private def createGenerator(conf: CodeGenConfiguration, code: CodeSaver) = {
    val mode = conf.mode match {
      case SourceCodeMode => SOURCECODE
      case ByteCodeMode => BYTECODE
    }
    val options = mutable.ListBuffer.empty[CodeGeneratorOption]
    if (conf.showSource) {
      options += code.saveSourceCode
    }
    if (conf.showByteCode) {
      options += code.saveByteCode
    }
    if (getClass.desiredAssertionStatus()) {
      options += VERIFY_GENERATED_BYTECODE
    }
    conf.saveSource.foreach(path => {
      options += SourceCode.sourceLocation(path)
    })

    CodeGenerator.generateCode(classOf[CodeStructure[_]].getClassLoader, mode, options: _*)
  }

  private def addAccept(methodStructure: (MethodStructure[_]) => Unit,
                        generator: CodeGenerator,
                        clazz: ClassGenerator,
                        fields: Fields,
                        conf: CodeGenConfiguration)(implicit codeGenContext: CodeGenContext) = {
    using(clazz.generate(MethodDeclaration.method(typeRef[Unit], "accept",
      Parameter.param(parameterizedType(classOf[QueryResultVisitor[_]],
        typeParameter("E")), "visitor")).
      parameterizedWith("E", extending(typeRef[Exception])).
      throwsException(typeParameter("E")))) { (codeBlock: CodeBlock) =>
      val structure = new GeneratedMethodStructure(fields, codeBlock, new AuxGenerator(conf.packageName, generator), onClose =
        Seq((success: Boolean) => (block: CodeBlock) => {
          block.expression(invoke(block.self(), methodReference(block.owner(), TypeReference.VOID, "closeCursors")))
        }))
      codeBlock.assign(typeRef[ResultRecord], "row",
        invoke(newInstance(typeRef[ResultRecord]),
          MethodReference.constructorReference(typeRef[ResultRecord], typeRef[Int]),
          constant(codeGenContext.numberOfColumns()))
      )
      methodStructure(structure)
      structure.finalizers.foreach(_ (true)(codeBlock))
    }
  }

  private def addSimpleMethods(clazz: ClassGenerator, fields: Fields) = {
    clazz.generate(Templates.constructor(clazz.handle()))
    Templates.getOrLoadDataRead(clazz, fields)
    Templates.getOrLoadTokenRead(clazz, fields)
    Templates.getOrLoadSchemaRead(clazz, fields)
    Templates.getOrLoadCursors(clazz, fields)
    Templates.nodeCursor(clazz, fields)
    Templates.relationshipScanCursor(clazz, fields)
    Templates.propertyCursor(clazz, fields)
    Templates.closeCursors(clazz, fields)
    clazz.generate(Templates.executionMode(clazz.handle()))
    //clazz.generate(Templates.executionPlanDescription(clazz.handle()))
    clazz.generate(Templates.FIELD_NAMES)
  }

  private def setOperatorIds(clazz: ClassGenerator, operatorIds: Map[String, Id]) = {
    operatorIds.keys.foreach { opId =>
      clazz.publicStaticField(typeRef[Id], opId)
    }
  }

  private def createFields(columns: Seq[String], clazz: ClassGenerator) = {

    clazz.privateStaticFinalField(TypeReference.typeReference(classOf[Array[String]]),
      "COLUMNS", newInitializedArray(typeRef[String],
        columns.map(key => constant(key)): _*))

    Fields(
      entityAccessor = clazz.field(typeRef[TransactionalEntityFactory], "proxySpi"),
      tracer = clazz.field(typeRef[QueryExecutionTracer], "tracer"),
      params = clazz.field(typeRef[MapValue], "params"),
      queryContext = clazz.field(typeRef[QueryContext], "queryContext"),
      cursors = clazz.field(typeRef[CursorFactory], "cursors"),
      nodeCursor = clazz.field(typeRef[NodeCursor], "nodeCursor"),
      relationshipScanCursor = clazz.field(typeRef[RelationshipScanCursor], "relationshipScanCursor"),
      propertyCursor = clazz.field(typeRef[PropertyCursor], "propertyCursor"),
      dataRead = clazz.field(typeRef[Read], "dataRead"),
      tokenRead = clazz.field(typeRef[TokenRead], "tokenRead"),
      schemaRead = clazz.field(typeRef[SchemaRead], "schemaRead"),
      closeables = clazz.field(typeRef[AutoCloseable], "closeables")
    )
  }

  case class GeneratedQueryStructureResult(query: GeneratedQuery, source: Seq[(String, String)], bytecode: Seq[(String, String)])
    extends CodeStructureResult[GeneratedQuery]

  class CodeSaver {
    private var _source: Seq[(String, String)] = Seq.empty
    private var _bytecode: Seq[(String, String)] = Seq.empty

    def saveSourceCode = new SourceVisitor {
      override protected def visitSource(reference: TypeReference, sourceCode: CharSequence): Unit =
        _source = _source :+ (reference.name() -> sourceCode.toString)
    }

    def saveByteCode = new DisassemblyVisitor {
      override protected def visitDisassembly(className: String, disassembly: CharSequence): Unit =
        _bytecode = _bytecode :+ (className -> disassembly.toString)
    }

    def sourceCode: Seq[(String, String)] = _source

    def bytecode: Seq[(String, String)] = _bytecode
  }
}
