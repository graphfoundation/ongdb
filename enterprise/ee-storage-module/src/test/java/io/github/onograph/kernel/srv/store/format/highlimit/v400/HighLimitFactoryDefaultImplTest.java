package io.github.onograph.kernel.srv.store.format.highlimit.v400;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.store.format.RecordFormats;

class HighLimitFactoryDefaultImplTest {

  @Test
  void testNewInstance() {
    RecordFormats actualNewInstanceResult = (new HighLimitFactoryDefaultImpl()).newInstance();
    assertSame(((V400) actualNewInstanceResult).RCD_FMXS, actualNewInstanceResult);
  }

  @Test
  void testConstructor() {
    assertEquals(V400.TITLE, (new HighLimitFactoryDefaultImpl()).getName());
  }
}

