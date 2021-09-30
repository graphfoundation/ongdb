package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class ExitMetaJoinedImplTest {

  @Test
  void testConstructor() {

    new ExitMetaJoinedImpl(mock(ExitMeta.class), mock(ExitMeta.class), mock(ExitMeta.class),
        mock(ExitMeta.class));
  }

  @Test
  void testAndExitMeta() throws GdbStoreException {
    ExitMeta exitMeta = mock(ExitMeta.class);
    doNothing().when(exitMeta).asectu();
    ExitMeta exitMeta1 = mock(ExitMeta.class);
    doNothing().when(exitMeta1).asectu();
    ExitMeta exitMeta2 = mock(ExitMeta.class);
    doNothing().when(exitMeta2).asectu();
    ExitMeta exitMeta3 = mock(ExitMeta.class);
    doNothing().when(exitMeta3).asectu();
    ExitMetaJoinedImpl exitMetaJoinedImpl = new ExitMetaJoinedImpl(exitMeta, exitMeta1, exitMeta2,
        exitMeta3);
    ExitMeta exitMeta4 = mock(ExitMeta.class);
    doNothing().when(exitMeta4).asectu();
    ExitMeta actualAndExitMetaResult = exitMetaJoinedImpl.andExitMeta(exitMeta4);
    actualAndExitMetaResult.asectu();
    assertSame(exitMetaJoinedImpl, actualAndExitMetaResult);
    verify(exitMeta).asectu();
    verify(exitMeta1).asectu();
    verify(exitMeta2).asectu();
    verify(exitMeta3).asectu();
    verify(exitMeta4).asectu();
  }

  @Test
  void testAsectu() throws GdbStoreException {

    ExitMeta exitMeta = mock(ExitMeta.class);
    doNothing().when(exitMeta).asectu();
    ExitMeta exitMeta1 = mock(ExitMeta.class);
    doNothing().when(exitMeta1).asectu();
    ExitMeta exitMeta2 = mock(ExitMeta.class);
    doNothing().when(exitMeta2).asectu();
    ExitMeta exitMeta3 = mock(ExitMeta.class);
    doNothing().when(exitMeta3).asectu();
    (new ExitMetaJoinedImpl(exitMeta, exitMeta1, exitMeta2, exitMeta3)).asectu();
  }

  @Test
  void testAsectu2() throws GdbStoreException {
    ExitMeta exitMeta = mock(ExitMeta.class);
    doNothing().when(exitMeta).asectu();
    ExitMeta exitMeta1 = mock(ExitMeta.class);
    doNothing().when(exitMeta1).asectu();
    ExitMeta exitMeta2 = mock(ExitMeta.class);
    doNothing().when(exitMeta2).asectu();
    ExitMeta exitMeta3 = mock(ExitMeta.class);
    doThrow(new GdbStoreException("foo")).when(exitMeta3).asectu();
    assertThrows(GdbStoreException.class,
        () -> (new ExitMetaJoinedImpl(exitMeta, exitMeta1, exitMeta2, exitMeta3)).asectu());
    verify(exitMeta).asectu();
    verify(exitMeta1).asectu();
    verify(exitMeta2).asectu();
    verify(exitMeta3).asectu();
  }
}

