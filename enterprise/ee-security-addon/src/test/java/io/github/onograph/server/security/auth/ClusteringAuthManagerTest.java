package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.DefaultSecurityLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;

class ClusteringAuthManagerTest {

  @Test
  void testGepiggatgcfList() {
    AuthPrivilegeManager authPrivilegeManager = mock(AuthPrivilegeManager.class);
    ArrayList<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
    when(authPrivilegeManager.gepiggatgcfList()).thenReturn(mapList);
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    List<Map<String, String>> actualGepiggatgcfListResult = (new ClusteringAuthManager(
        _abstractSecurityLog,
        new CommunityDefaultDatabaseResolver(mock(Config.class),
            (Supplier<GraphDatabaseService>) mock(
                Supplier.class)),
        true, authPrivilegeManager)).gepiggatgcfList();
    assertSame(mapList, actualGepiggatgcfListResult);
    assertTrue(actualGepiggatgcfListResult.isEmpty());
    verify(authPrivilegeManager).gepiggatgcfList();
  }
}

