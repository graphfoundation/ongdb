package io.github.onograph.fabric.service;

import org.junit.jupiter.api.Test;
import org.neo4j.fabric.executor.ExecutionOptions;

class RecordUtilsTest {

  @Test
  void testConstructor() {

    new RecordUtils();
  }

  @Test
  void testConstructor2() {

    new RecordUtils(new ExecutionOptions(123L));
  }

  @Test
  void testConstructor3() {

    new RecordUtils(new ExecutionOptions());
  }
}

