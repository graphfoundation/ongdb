package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class SyncableDataDataManagerFactoryDecodingServiceTest {

  @Test
  void testConstructor() {

    new SyncableDataDataManagerFactoryDecodingService(new ContentTypeRef());
  }

  @Test
  void testDecode() {

    SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService = new SyncableDataDataManagerFactoryDecodingService(
        new ContentTypeRef());
    DataManagerFactory<SyncableData> m = DataManagerFactory.<SyncableData>emuiDataManagerFactory();
    syncableDataDataManagerFactoryDecodingService.decode(null, m, new ArrayList<Object>());
  }

  @Test
  void testDecode2() {
    SyncableDataDataManagerFactoryDecodingService syncableDataDataManagerFactoryDecodingService = new SyncableDataDataManagerFactoryDecodingService(
        new ContentTypeRef());
    DataManagerFactory<SyncableData> m = DataManagerFactory.<SyncableData>fiieDataManagerFactory(
        new SyncableData() {
          @Override
          public void dipcForSy(SyncableDataProcessor _syncableDataProcessor) throws IOException {

          }
        });
    ArrayList<Object> objectList = new ArrayList<Object>();
    syncableDataDataManagerFactoryDecodingService.decode(null, m, objectList);
    assertEquals(1, objectList.size());
  }
}

