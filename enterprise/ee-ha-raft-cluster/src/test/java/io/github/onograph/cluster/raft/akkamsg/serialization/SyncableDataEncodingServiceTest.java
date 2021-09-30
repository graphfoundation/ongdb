package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SyncableDataEncodingServiceTest {

  @Test
  void testConstructor() {

    new SyncableDataEncodingService(ApplicationComProFamilyType.RC);
  }

  @Test
  void testProcess() throws IOException {
    SyncableDataEncodingService syncableDataEncodingService = new SyncableDataEncodingService(
        ApplicationComProFamilyType.RC);
    ArrayList<Object> _listOtuObject = new ArrayList<Object>();
    SyncableData syncableData = mock(SyncableData.class);
    doNothing().when(syncableData).dipcForSy((SyncableDataProcessor) any());
    syncableDataEncodingService.process(_listOtuObject, syncableData);
    verify(syncableData).dipcForSy((SyncableDataProcessor) any());
  }
}

