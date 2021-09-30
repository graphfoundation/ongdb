package io.github.onograph.server.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.cache.ExecutorBasedCaffeineCacheFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.Logger;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;

class SecurityModuleEnterpriseImplTest {

  @Test
  void testConstructor() {

    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Config _config = mock(Config.class);
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, _config, _defaultDatabaseResolver,
        _defaultSecurityLog,
        null, _dependencies, _fileSystemAbstraction, _globalTransactionEventListeners,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))));
  }

  @Test
  void testConstructor2() {

    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    Config _config = mock(Config.class);
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    LoggerContext loggerContext = mock(LoggerContext.class);
    when(loggerContext.getLogger((String) any())).thenReturn(mock(Logger.class));
    new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, _config, _defaultDatabaseResolver,
        _defaultSecurityLog,
        null, _dependencies, _fileSystemAbstraction, _globalTransactionEventListeners,
        new Log4jLogProvider(new Neo4jLoggerContext(loggerContext, mock(Closeable.class))));
  }

  @Test
  void testCresrcoeDefaultSecuritySystemGraphComponent() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new RuntimeException("An error occurred"));
    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    assertThrows(RuntimeException.class,
        () -> SecurityModuleEnterpriseImpl.cresrcoeDefaultSecuritySystemGraphComponent(config,
            _defaultSecurityLog,
            _fileSystemAbstraction,
            new Log4jLogProvider(new Neo4jLoggerContext(
                new LoggerContext("Name"),
                mock(Closeable.class)))));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testGeoerurifPath() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new RuntimeException("An error occurred"));
    assertThrows(RuntimeException.class, () -> SecurityModuleEnterpriseImpl.geoerurifPath(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testMeantanahaList() {
    ArrayList<String> _listApString = new ArrayList<String>();
    assertTrue(SecurityModuleEnterpriseImpl.meantanahaList(_listApString, new ArrayList<String>())
        .isEmpty());
  }

  @Test
  void testMeantanahaList2() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    List<String> actualMeantanahaListResult = SecurityModuleEnterpriseImpl.meantanahaList(
        stringList,
        new ArrayList<String>());
    assertEquals(1, actualMeantanahaListResult.size());
    assertEquals("foo", actualMeantanahaListResult.get(0));
  }

  @Test
  void testMeantanahaList3() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    stringList.add("foo");
    assertThrows(IllegalArgumentException.class,
        () -> SecurityModuleEnterpriseImpl.meantanahaList(stringList, new ArrayList<String>()));
  }

  @Test
  void testMeantanahaList4() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    ArrayList<String> stringList1 = new ArrayList<String>();
    stringList1.add("foo");
    List<String> actualMeantanahaListResult = SecurityModuleEnterpriseImpl.meantanahaList(
        stringList, stringList1);
    assertEquals(1, actualMeantanahaListResult.size());
    assertEquals("foo", actualMeantanahaListResult.get(0));
  }

  @Test
  void testMeantanahaList5() {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    ArrayList<String> stringList1 = new ArrayList<String>();
    stringList1.add("42");
    stringList1.add("foo");
    List<String> actualMeantanahaListResult = SecurityModuleEnterpriseImpl.meantanahaList(
        stringList, stringList1);
    assertEquals(2, actualMeantanahaListResult.size());
    assertEquals("42", actualMeantanahaListResult.get(0));
    assertEquals("foo", actualMeantanahaListResult.get(1));
  }

  @Test
  void testAuthManager() {
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        null,
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    assertNull(
        (new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, null, _defaultDatabaseResolver,
            _defaultSecurityLog, null, _dependencies, _fileSystemAbstraction,
            _globalTransactionEventListeners,
            new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))))).authManager());
  }

  @Test
  void testInClusterAuthManager() {
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        null,
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    assertNull(
        (new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, null, _defaultDatabaseResolver,
            _defaultSecurityLog, null, _dependencies, _fileSystemAbstraction,
            _globalTransactionEventListeners,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))
            .inClusterAuthManager());
  }

  @Test
  void testLoopbackAuthManager() {
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        null,
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    assertNull(
        (new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, null, _defaultDatabaseResolver,
            _defaultSecurityLog, null, _dependencies, _fileSystemAbstraction,
            _globalTransactionEventListeners,
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))))
            .loopbackAuthManager());
  }

  @Test
  void testSetup() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new RuntimeException("An error occurred"));
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    assertThrows(RuntimeException.class,
        () -> (new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, config,
            _defaultDatabaseResolver,
            _defaultSecurityLog, null, _dependencies, _fileSystemAbstraction,
            _globalTransactionEventListeners,
            new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))))).setup());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testSetup2() {
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("42");
    objectList.add("42");
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(objectList);
    ExecutorBasedCaffeineCacheFactory _caffeineCacheFactory = new ExecutorBasedCaffeineCacheFactory(
        mock(Executor.class));
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Dependencies _dependencies = new Dependencies();
    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    GlobalTransactionEventListeners _globalTransactionEventListeners = new GlobalTransactionEventListeners();
    assertThrows(IllegalArgumentException.class,
        () -> (new SecurityModuleEnterpriseImpl(_caffeineCacheFactory, config,
            _defaultDatabaseResolver,
            _defaultSecurityLog, null, _dependencies, _fileSystemAbstraction,
            _globalTransactionEventListeners,
            new Log4jLogProvider(new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))))).setup());
    verify(config, atLeast(1)).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

