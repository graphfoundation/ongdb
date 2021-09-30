package io.github.onograph.cluster.raft.control.connect;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.config.EntProVer;
import org.junit.jupiter.api.Test;

class ComProFamilyManagerAppImplTest {

  @Test
  void testConstructor() {
    ApplicationComProFamily applicationComProFamily = mock(ApplicationComProFamily.class);
    when(applicationComProFamily.getImpl()).thenReturn(new EntProVer(1, 1));
    when(applicationComProFamily.caerString()).thenReturn("Caer String");
    ApplicationCurrentActiveComProFamilyWrapper alkopolApplicationCurrentActiveComProFamilyWrapperResult = ApplicationCurrentActiveComProFamilyWrapper
        .alkopolApplicationCurrentActiveComProFamilyWrapper(null);
    assertSame(alkopolApplicationCurrentActiveComProFamilyWrapperResult,
        (new ComProFamilyManagerAppImpl(new ApplicationComProFamily[]{applicationComProFamily},
            alkopolApplicationCurrentActiveComProFamilyWrapperResult))
            .getPsApplicationCurrentActiveComProFamilyWrapper());
    verify(applicationComProFamily).caerString();
    verify(applicationComProFamily).getImpl();
  }

  @Test
  void testConstructor2() {
    ApplicationComProFamily applicationComProFamily = mock(ApplicationComProFamily.class);
    when(applicationComProFamily.getImpl()).thenReturn(null);
    when(applicationComProFamily.caerString()).thenReturn("Caer String");
    ApplicationCurrentActiveComProFamilyWrapper alkopolApplicationCurrentActiveComProFamilyWrapperResult = ApplicationCurrentActiveComProFamilyWrapper
        .alkopolApplicationCurrentActiveComProFamilyWrapper(null);
    assertSame(alkopolApplicationCurrentActiveComProFamilyWrapperResult,
        (new ComProFamilyManagerAppImpl(new ApplicationComProFamily[]{applicationComProFamily},
            alkopolApplicationCurrentActiveComProFamilyWrapperResult))
            .getPsApplicationCurrentActiveComProFamilyWrapper());
    verify(applicationComProFamily).caerString();
    verify(applicationComProFamily).getImpl();
  }
}

