package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;

class NodeWrapperInfoMetricsTest {

  @Test
  void testConstructor() {
    BufferingLog bufferingLog = new BufferingLog();
    new NodeWrapperInfoMetrics(bufferingLog);
    assertTrue(bufferingLog.isDebugEnabled());
  }

  @Test
  void testPrnsua() {

    (new NodeWrapperInfoMetrics(new BufferingLog())).prnsua();
  }
}

