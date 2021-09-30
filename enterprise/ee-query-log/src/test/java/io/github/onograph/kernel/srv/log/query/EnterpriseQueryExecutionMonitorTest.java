package io.github.onograph.kernel.srv.log.query;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.Config;

class EnterpriseQueryExecutionMonitorTest {

  @Test
  void testConstructor() {

    new EnterpriseQueryExecutionMonitor(null, new AdversarialChannelDefaultFileSystemAbstraction());
  }

  @Test
  void testConstructor2() {

    Config _config = mock(Config.class);
    new EnterpriseQueryExecutionMonitor(_config,
        new AdversarialChannelDefaultFileSystemAbstraction());
  }

  @Test
  void testCommit() {

    (new EnterpriseQueryExecutionMonitor(null,
        new AdversarialChannelDefaultFileSystemAbstraction())).commit(null);
  }

  @Test
  void testRollback() {

    (new EnterpriseQueryExecutionMonitor(null,
        new AdversarialChannelDefaultFileSystemAbstraction())).rollback(null);
  }

  @Test
  void testRollback2() {

    EnterpriseQueryExecutionMonitor enterpriseQueryExecutionMonitor = new EnterpriseQueryExecutionMonitor(
        null,
        new AdversarialChannelDefaultFileSystemAbstraction());
    enterpriseQueryExecutionMonitor.rollback(null, new Throwable());
  }

  @Test
  void testShutdown() {

    (new EnterpriseQueryExecutionMonitor(null,
        new AdversarialChannelDefaultFileSystemAbstraction())).shutdown();
  }

  @Test
  void testStart() {

    (new EnterpriseQueryExecutionMonitor(null,
        new AdversarialChannelDefaultFileSystemAbstraction())).start(null);
  }
}

