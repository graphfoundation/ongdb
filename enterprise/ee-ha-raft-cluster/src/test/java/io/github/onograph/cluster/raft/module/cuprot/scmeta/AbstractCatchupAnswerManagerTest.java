package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class AbstractCatchupAnswerManagerTest {

  @Test
  void testFicadrAbstractCatchupAnswerManager() {

    AbstractCatchupAnswerManager.ficadrAbstractCatchupAnswerManager(new BufferingLog(),
        mock(StoreResourceWriterService.class));
  }

  @Test
  void testPrrsrcyatAbstractCatchupAnswerManager() {

    AbstractCatchupAnswerManager.prrsrcyatAbstractCatchupAnswerManager(new BufferingLog(),
        mock(StoreResourceWriterService.class));
  }
}

