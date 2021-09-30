package org.neo4j.cypher.internal

import org.neo4j.cypher.internal.plandescription.Argument
import org.neo4j.cypher.internal.plandescription.Arguments.SourceCode

import scala.collection.Seq

object CodeGenPlanDescriptionHelper {

  def metadata(codeSaver: org.neo4j.codegen.api.CodeGeneration.CodeSaver): Seq[Argument] = {
    codeSaver.sourceCode.map((s) => new SourceCode(s._1, s._2))
  }

  def metadata(log: Any, codeSaver: org.neo4j.codegen.api.CodeGeneration.CodeSaver): Seq[Argument] = {
    // Log
    codeSaver.sourceCode.map((s) => new SourceCode(s._1, s._2))
  }

  def metadataCleaner(codeSaver: org.neo4j.codegen.api.CodeGeneration.CodeSaver): Seq[Argument] = {
    codeSaver.sourceCode.map((s) => new SourceCode(s._1, s._2))
  }
}


