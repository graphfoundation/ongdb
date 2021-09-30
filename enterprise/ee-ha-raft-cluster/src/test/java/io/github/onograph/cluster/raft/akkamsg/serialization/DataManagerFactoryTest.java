package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class DataManagerFactoryTest {

  @Test
  void testEmuiDataManagerFactory() {
    assertFalse(DataManagerFactory.<Object>emuiDataManagerFactory().getIsCi());
    assertFalse(DataManagerFactory.<Object>emuiDataManagerFactory().getIsCi());
  }

  @Test
  void testFiieDataManagerFactory() {
    assertTrue(DataManagerFactory.<Object>fiieDataManagerFactory("Btval").getIsCi());
  }

  @Test
  void testUndDataManagerFactory() {
    assertFalse(
        DataManagerFactory.<Object>undDataManagerFactory(
            (Function<Object, Object>) mock(Function.class)).getIsCi());
  }

  @Test
  void testBul() {
    assertThrows(IllegalStateException.class,
        () -> DataManagerFactory.<Object>emuiDataManagerFactory().bul());
    assertEquals("Btval", DataManagerFactory.<Object>fiieDataManagerFactory("Btval").bul());
  }

  @Test
  void testCobeDataManagerFactory() {
    DataManagerFactory<Object> emuiDataManagerFactoryResult = DataManagerFactory.<Object>emuiDataManagerFactory();
    DataManagerFactory<Object> actualCobeDataManagerFactoryResult = emuiDataManagerFactoryResult
        .cobeDataManagerFactory(DataManagerFactory.<Object>emuiDataManagerFactory());
    assertSame(emuiDataManagerFactoryResult, actualCobeDataManagerFactoryResult);
    assertFalse(actualCobeDataManagerFactoryResult.getIsCi());
  }

  @Test
  void testCobeDataManagerFactory2() {
    Function<Object, Object> function = (Function<Object, Object>) mock(Function.class);
    when(function.compose((Function<? super Object, ?>) any()))
        .thenReturn((Function<Object, Object>) mock(Function.class));
    DataManagerFactory<Object> undDataManagerFactoryResult = DataManagerFactory.<Object>undDataManagerFactory(
        function);
    DataManagerFactory<Object> actualCobeDataManagerFactoryResult = undDataManagerFactoryResult
        .cobeDataManagerFactory(DataManagerFactory.<Object>emuiDataManagerFactory());
    assertSame(undDataManagerFactoryResult, actualCobeDataManagerFactoryResult);
    assertFalse(actualCobeDataManagerFactoryResult.getIsCi());
    verify(function).compose((Function<? super Object, ?>) any());
  }

  @Test
  void testCobeDataManagerFactory3() {
    DataManagerFactory<Object> fiieDataManagerFactoryResult = DataManagerFactory
        .<Object>fiieDataManagerFactory("Btval");
    assertThrows(IllegalStateException.class,
        () -> fiieDataManagerFactoryResult.cobeDataManagerFactory(
            DataManagerFactory.<Object>emuiDataManagerFactory()));
  }

  @Test
  void testCobeDataManagerFactory4() {
    assertThrows(IllegalStateException.class,
        () -> DataManagerFactory.<Object>fiieDataManagerFactory("Btval")
            .cobeDataManagerFactory(null));
  }
}

