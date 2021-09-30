package io.github.onograph.kernel.srv.store.format.highlimit.v300;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.store.format.RecordFormats;

class FactoryHighLimitDefaultImplTest {

  @Test
  void testNewInstance() {
    RecordFormats actualNewInstanceResult = (new FactoryHighLimitDefaultImpl()).newInstance();
    assertSame(((V300) actualNewInstanceResult).RCD_FMXS, actualNewInstanceResult);
  }

  @Test
  void testConstructor() {
    assertEquals(V300.TITLE, (new FactoryHighLimitDefaultImpl()).getName());
  }
}

