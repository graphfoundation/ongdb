package io.github.onograph.kernel.srv.store.format.highlimit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.store.format.RecordFormats;

class FactoryHighLimitRecordFormatsImplTest {

  @Test
  void testNewInstance() {
    RecordFormats actualNewInstanceResult = (new FactoryHighLimitRecordFormatsImpl()).newInstance();
    assertSame(((HighLimitRecordFormats) actualNewInstanceResult).RCD_FMXS,
        actualNewInstanceResult);
  }

  @Test
  void testConstructor() {
    assertEquals(HighLimitRecordFormats.TITLE, (new FactoryHighLimitRecordFormatsImpl()).getName());
  }
}

