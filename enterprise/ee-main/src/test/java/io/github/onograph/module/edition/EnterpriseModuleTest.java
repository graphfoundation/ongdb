package io.github.onograph.module.edition;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.server.security.DefaultSecurityLog;
import java.io.Closeable;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.collection.Dependencies;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.logging.internal.LogService;
import org.neo4j.logging.internal.SimpleLogService;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.scheduler.MonitoredJobExecutor;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;
import org.neo4j.test.OnDemandJobScheduler;

class EnterpriseModuleTest {

  @Test
  void testMadetdbreeEnhancedDefaultDatabaseResolver() {
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies());
    when(globalModule.getGlobalConfig()).thenReturn(mock(Config.class));
    when(globalModule.getJobScheduler()).thenReturn(new OnDemandJobScheduler(true));
    EnterpriseModule.madetdbreeEnhancedDefaultDatabaseResolver(globalModule);
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
  }

  @Test
  void testMadetdbreeEnhancedDefaultDatabaseResolver2() {
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies(new Dependencies()));
    when(globalModule.getGlobalConfig()).thenReturn(mock(Config.class));
    when(globalModule.getJobScheduler()).thenReturn(new OnDemandJobScheduler(true));
    EnterpriseModule.madetdbreeEnhancedDefaultDatabaseResolver(globalModule);
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
  }

  @Test
  void testMadetdbreeEnhancedDefaultDatabaseResolver3() {
    JobScheduler jobScheduler = mock(JobScheduler.class);
    when(jobScheduler.monitoredJobExecutor(any()))
        .thenReturn(mock(MonitoredJobExecutor.class));
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies());
    when(globalModule.getGlobalConfig()).thenReturn(mock(Config.class));
    when(globalModule.getJobScheduler()).thenReturn(jobScheduler);
    EnterpriseModule.madetdbreeEnhancedDefaultDatabaseResolver(globalModule);
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
    verify(jobScheduler).monitoredJobExecutor(any());
  }

  @Test
  void testMaenrsetmuSecurityProvider() {
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = new DefaultSecurityLog(new BufferingLog());
    Config config = mock(Config.class);
    when(config.get(any()))
        .thenThrow(new RuntimeException("An error occurred"));
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getJobScheduler()).thenReturn(new OnDemandJobScheduler(true));
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies());
    when(globalModule.getLogService()).thenReturn(new SimpleLogService(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))));
    when(globalModule.getGlobalConfig()).thenReturn(config);
    assertThrows(RuntimeException.class,
        () -> EnterpriseModule.maenrsetmuSecurityProvider(_defaultDatabaseResolver,
            _defaultSecurityLog, globalModule));
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
    verify(globalModule).getLogService();
    verify(config).get(any());
  }

  @Test
  void testMaenrsetmuSecurityProvider2() {
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = mock(DefaultSecurityLog.class);
    Config config = mock(Config.class);
    when(config.get(any()))
        .thenThrow(new RuntimeException("An error occurred"));
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getJobScheduler()).thenReturn(new OnDemandJobScheduler(true));
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies());
    when(globalModule.getLogService()).thenReturn(new SimpleLogService(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))));
    when(globalModule.getGlobalConfig()).thenReturn(config);
    assertThrows(RuntimeException.class,
        () -> EnterpriseModule.maenrsetmuSecurityProvider(_defaultDatabaseResolver,
            _defaultSecurityLog, globalModule));
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
    verify(globalModule).getLogService();
    verify(config).get(any());
  }

  @Test
  void testMaenrsetmuSecurityProvider3() {
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = mock(DefaultSecurityLog.class);
    Config config = mock(Config.class);
    when(config.get(any()))
        .thenThrow(new RuntimeException("An error occurred"));
    JobScheduler jobScheduler = mock(JobScheduler.class);
    when(jobScheduler.monitoredJobExecutor(any()))
        .thenReturn(mock(MonitoredJobExecutor.class));
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getJobScheduler()).thenReturn(jobScheduler);
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies());
    when(globalModule.getLogService()).thenReturn(new SimpleLogService(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))));
    when(globalModule.getGlobalConfig()).thenReturn(config);
    assertThrows(RuntimeException.class,
        () -> EnterpriseModule.maenrsetmuSecurityProvider(_defaultDatabaseResolver,
            _defaultSecurityLog, globalModule));
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
    verify(globalModule).getLogService();
    verify(jobScheduler).monitoredJobExecutor(any());
    verify(config).get(any());
  }

  @Test
  void testMaenrsetmuSecurityProvider4() {
    CommunityDefaultDatabaseResolver _defaultDatabaseResolver = new CommunityDefaultDatabaseResolver(
        mock(Config.class),
        (Supplier<GraphDatabaseService>) mock(
            Supplier.class));

    DefaultSecurityLog _defaultSecurityLog = mock(DefaultSecurityLog.class);
    Config config = mock(Config.class);
    when(config.get(any()))
        .thenThrow(new RuntimeException("An error occurred"));
    LogService logService = mock(LogService.class);
    when(logService.getUserLogProvider())
        .thenReturn(new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))));
    JobScheduler jobScheduler = mock(JobScheduler.class);
    when(jobScheduler.monitoredJobExecutor(any()))
        .thenReturn(mock(MonitoredJobExecutor.class));
    GlobalModule globalModule = mock(GlobalModule.class);
    when(globalModule.getJobScheduler()).thenReturn(jobScheduler);
    when(globalModule.getGlobalDependencies()).thenReturn(new Dependencies());
    when(globalModule.getLogService()).thenReturn(logService);
    when(globalModule.getGlobalConfig()).thenReturn(config);
    assertThrows(RuntimeException.class,
        () -> EnterpriseModule.maenrsetmuSecurityProvider(_defaultDatabaseResolver,
            _defaultSecurityLog, globalModule));
    verify(globalModule).getGlobalConfig();
    verify(globalModule).getGlobalDependencies();
    verify(globalModule).getJobScheduler();
    verify(globalModule).getLogService();
    verify(jobScheduler).monitoredJobExecutor(any());
    verify(logService).getUserLogProvider();
    verify(config).get(any());
  }
}

