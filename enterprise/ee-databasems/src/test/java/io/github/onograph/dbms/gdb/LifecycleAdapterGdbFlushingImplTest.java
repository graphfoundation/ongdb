package io.github.onograph.dbms.gdb;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class LifecycleAdapterGdbFlushingImplTest {

  @Test
  void testConstructor() {

    FakeClock _clock = Clocks.fakeClock();
    Config _config = mock(Config.class);
    new LifecycleAdapterGdbFlushingImpl(_clock, _config, new DefaultFileSystemAbstraction());
  }

  @Test
  void testConstructor2() {
    FakeClock _clock = Clocks.fakeClock();
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any()))
        .thenThrow(new DatabaseManagementException("An error occurred"));
    assertThrows(DatabaseManagementException.class,
        () -> new LifecycleAdapterGdbFlushingImpl(_clock, config,
            new DefaultFileSystemAbstraction()));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

