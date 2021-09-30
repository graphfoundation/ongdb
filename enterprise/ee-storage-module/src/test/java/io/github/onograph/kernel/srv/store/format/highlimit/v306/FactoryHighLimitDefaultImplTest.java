package io.github.onograph.kernel.srv.store.format.highlimit.v306;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.store.format.RecordFormats;

class FactoryHighLimitDefaultImplTest {

  @Test
  void testNewInstance() {
    RecordFormats actualNewInstanceResult = (new FactoryHighLimitDefaultImpl()).newInstance();
    assertSame(((V306) actualNewInstanceResult).RCD_FMXS, actualNewInstanceResult);
  }

  @Test
  void testConstructor() {
    assertEquals(V306.TITLE, (new FactoryHighLimitDefaultImpl()).getName());
  }
}

