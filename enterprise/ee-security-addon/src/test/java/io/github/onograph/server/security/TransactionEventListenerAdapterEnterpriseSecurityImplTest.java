package io.github.onograph.server.security;

import static org.mockito.Mockito.mock;

import io.github.onograph.server.security.auth.ClusteringAuthManager;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;

class TransactionEventListenerAdapterEnterpriseSecurityImplTest {

  @Test
  void testStrread() {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    (new TransactionEventListenerAdapterEnterpriseSecurityImpl(
        new ClusteringAuthManager(_abstractSecurityLog,
            new CommunityDefaultDatabaseResolver(null,
                (Supplier<GraphDatabaseService>) mock(
                    Supplier.class)),
            true, null)))
        .strread(1L);
  }

  @Test
  void testTranci() {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    (new TransactionEventListenerAdapterEnterpriseSecurityImpl(
        new ClusteringAuthManager(_abstractSecurityLog,
            new CommunityDefaultDatabaseResolver(null,
                (Supplier<GraphDatabaseService>) mock(
                    Supplier.class)),
            true, null)))
        .tranci(1L);
  }
}

