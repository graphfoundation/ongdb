package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.channel.DefaultEventLoop;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.scheduler.CallableExecutorService;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.OnDemandJobScheduler;

class GdbReconcilerExecutorWrapperTest {

  @Test
  void testConstructor() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    new GdbReconcilerExecutorWrapper(config, new OnDemandJobScheduler(true));

    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testConstructor2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(0);
    JobScheduler jobScheduler = mock(JobScheduler.class);
    CallableExecutorService callableExecutorService = new CallableExecutorService(
        new DefaultEventLoop());
    when(jobScheduler.executor((org.neo4j.scheduler.Group) any())).thenReturn(
        callableExecutorService);
    doNothing().when(jobScheduler).setParallelism((org.neo4j.scheduler.Group) any(), anyInt());
    assertSame(callableExecutorService,
        (new GdbReconcilerExecutorWrapper(config, jobScheduler)).getUbudExecutor());
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
    verify(jobScheduler, atLeast(1)).executor((org.neo4j.scheduler.Group) any());
    verify(jobScheduler).setParallelism((org.neo4j.scheduler.Group) any(), anyInt());
  }
}

