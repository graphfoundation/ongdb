package org.neo4j.cypher.internal

import org.neo4j.cypher.internal.options.CypherRuntimeOption

object EnterpriseRuntimeFactory {
  val interpreted: FallbackRuntime[EnterpriseRuntimeContext] = {
    new FallbackRuntime[EnterpriseRuntimeContext](List(SchemaCommandRuntime, InterpretedRuntime), CypherRuntimeOption.interpreted)
  }


  val default: FallbackRuntime[EnterpriseRuntimeContext] = {
    new FallbackRuntime[EnterpriseRuntimeContext](List(InterpretedRuntime), CypherRuntimeOption.default)
  }

  def getRuntime(cypherRuntime: CypherRuntimeOption, disallowFallback: Boolean): CypherRuntime[EnterpriseRuntimeContext] = {
    cypherRuntime match {
      case CypherRuntimeOption.interpreted => interpreted

      case CypherRuntimeOption.default => default
    }
  }
}