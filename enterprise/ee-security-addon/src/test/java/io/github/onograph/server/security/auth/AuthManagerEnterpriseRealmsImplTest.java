package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.DefaultSecurityLog;
import java.util.ArrayList;
import java.util.function.Supplier;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;

class AuthManagerEnterpriseRealmsImplTest {

  @Test
  void testConstructor() {
    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    CacheManager _cacheManager = mock(CacheManager.class);

    ArrayList<Realm> realmList = new ArrayList<Realm>();
    realmList.add(new SimpleAccountRealm());
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new UnsupportedTokenException("An error occurred"));
    assertThrows(UnsupportedTokenException.class,
        () -> new AuthManagerEnterpriseRealmsImpl(_abstractSecurityLog,
            _cacheManager, realmList, config,
            new CommunityDefaultDatabaseResolver(mock(Config.class),
                (Supplier<GraphDatabaseService>) mock(
                    Supplier.class)),
            null));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {

    DefaultSecurityLog _abstractSecurityLog = new DefaultSecurityLog(new BufferingLog());
    CacheManager _cacheManager = mock(CacheManager.class);

    ArrayList<Realm> realmList = new ArrayList<Realm>();
    realmList.add(new SimpleAccountRealm());
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(true);
    new AuthManagerEnterpriseRealmsImpl(_abstractSecurityLog, _cacheManager, realmList, config,
        new CommunityDefaultDatabaseResolver(mock(Config.class),
            (Supplier<GraphDatabaseService>) mock(Supplier.class)),
        null);
  }
}

