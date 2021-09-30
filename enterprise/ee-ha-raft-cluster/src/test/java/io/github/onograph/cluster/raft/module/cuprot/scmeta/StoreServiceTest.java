package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl;
import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;

class StoreServiceTest {

  @Test
  void testConstructor() {

    new StoreService(null, new AssertableLogProvider(true));
  }

  @Test
  void testConstructor2() {

    new StoreService(null, new Log4jLogProvider(new ByteArrayOutputStream(3)));
  }

  @Test
  void testConstructor3() {

    LifecycleCatchupManagerImpl _fccLifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    new StoreService(_fccLifecycleCatchupManagerImpl, new AssertableLogProvider(false));
  }
}

