package org.neo4j.cypher.internal.javacompat;

import org.neo4j.cypher.internal.CompilerFactory;
import org.neo4j.cypher.internal.CypherRuntimeConfiguration;
import org.neo4j.cypher.internal.EnterpriseCompilerFactory;
import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration;


public class EnhancedCypherEngineProvider extends CommunityCypherEngineProvider {

  public EnhancedCypherEngineProvider() {
  }

  @Override
  protected int enginePriority() {
    return 1;
  }

  @Override
  protected CompilerFactory makeCompilerFactory(
      GraphDatabaseCypherService _qsGraphDatabaseCypherService, SPI _sPI,
      CypherPlannerConfiguration _cypherPlannerConfiguration,
      CypherRuntimeConfiguration _cypherRuntimeConfiguration) {
    return new EnterpriseCompilerFactory(_qsGraphDatabaseCypherService, _sPI,
        _cypherPlannerConfiguration, _cypherRuntimeConfiguration);
  }
}