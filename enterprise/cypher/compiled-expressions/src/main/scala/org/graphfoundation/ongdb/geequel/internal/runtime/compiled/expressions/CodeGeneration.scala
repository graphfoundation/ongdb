/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
package org.graphfoundation.ongdb.geequel.internal.runtime.compiled.expressions

import org.neo4j.codegen.ClassGenerator
import org.neo4j.codegen.CodeGenerator.generateCode
import org.neo4j.codegen.TypeReference
import org.neo4j.codegen.bytecode.ByteCode
import org.neo4j.cypher.internal.v3_5.expressions.Expression
import org.neo4j.cypher.internal.v3_5.frontend.helpers.using

import scala.util.Random

object CodeGeneration {

  private val COMPILED_EXPRESSION_CLASS = classOf[CompiledExpression]
  private val COMPILED_PROJECTION_CLASS = classOf[CompiledProjection]
  private val COMPILER_GENERATED_PACKAGE_NAME = "org.neo4j.cypher.internal.compiler.v3_5.generated"

  private def randomClassName(): String = {
    val random = new Random(System.nanoTime())
    s"CompiledExpression_${random.nextLong()}"
  }

  def compileExpression(expression: Expression): CompiledExpression = {
    val handle = using(
      generateCode(classOf[CompiledExpression].getClassLoader, ByteCode.BYTECODE)
        .generateClass(
          COMPILER_GENERATED_PACKAGE_NAME,
          randomClassName(),
          COMPILED_EXPRESSION_CLASS
        )
    ) { gen: ClassGenerator =>
      using(gen.generateConstructor()) { code =>
        code.expression(org.neo4j.codegen.Expression.invokeSuper(TypeReference.OBJECT))
      }
      gen.handle()
    }
    handle.loadClass().newInstance().asInstanceOf[CompiledExpression]
  }

  def compileProjection(expression: Expression): CompiledProjection = {
    val handle = using(
      generateCode(classOf[CompiledExpression].getClassLoader, ByteCode.BYTECODE)
        .generateClass(
          COMPILER_GENERATED_PACKAGE_NAME,
          randomClassName(),
          COMPILED_PROJECTION_CLASS
        )
    ) { gen: ClassGenerator =>
      using(gen.generateConstructor()) { code =>
        code.expression(org.neo4j.codegen.Expression.invokeSuper(TypeReference.OBJECT))
      }
      gen.handle()
    }
    handle.loadClass().newInstance().asInstanceOf[CompiledProjection]
  }
}
