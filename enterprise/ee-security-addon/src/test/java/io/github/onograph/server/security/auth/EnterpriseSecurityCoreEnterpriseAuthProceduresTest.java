package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.DefaultSecurityLog;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;

class EnterpriseSecurityCoreEnterpriseAuthProceduresTest {

  @Test
  void testClantca() {
    EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures = new EnterpriseSecurityCoreEnterpriseAuthProcedures();
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    ClusteringAuthManager clusteringAuthManager = new ClusteringAuthManager(_abstractSecurityLog,
        new CommunityDefaultDatabaseResolver(null,
            (Supplier<GraphDatabaseService>) mock(
                Supplier.class)), true, null);

    enterpriseSecurityCoreEnterpriseAuthProcedures.defaultAuthManager = clusteringAuthManager;
    enterpriseSecurityCoreEnterpriseAuthProcedures.clantca();
    assertSame(clusteringAuthManager,
        enterpriseSecurityCoreEnterpriseAuthProcedures.defaultAuthManager);
  }
}

