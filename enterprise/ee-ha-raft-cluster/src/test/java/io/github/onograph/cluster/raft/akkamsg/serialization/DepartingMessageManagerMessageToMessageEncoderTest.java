package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import org.junit.jupiter.api.Test;

class DepartingMessageManagerMessageToMessageEncoderTest {

  @Test
  void testConstructor() {

    new DepartingMessageManagerMessageToMessageEncoder(
        new SyncableDataEncodingService(ApplicationComProFamilyType.RC));
  }

  @Test
  void testConstructor2() {

    new DepartingMessageManagerMessageToMessageEncoder(
        new SyncableDataEncodingService(ApplicationComProFamilyType.RC));
  }
}

