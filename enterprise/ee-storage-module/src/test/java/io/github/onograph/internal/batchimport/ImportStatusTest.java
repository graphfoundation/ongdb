package io.github.onograph.internal.batchimport;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.impl.store.StoreType;

class ImportStatusTest {

  @Test
  void testConstructor() throws IOException {
    StoreType[] storeTypeArray = new StoreType[]{StoreType.NODE_LABEL, StoreType.NODE_LABEL,
        StoreType.NODE_LABEL};
    StoreType[] storeTypeArray1 = new StoreType[]{StoreType.NODE_LABEL, StoreType.NODE_LABEL,
        StoreType.NODE_LABEL};
    ImportStatus actualImportStatus = new ImportStatus(storeTypeArray, storeTypeArray1, "Dr");
    actualImportStatus.persist();
    actualImportStatus.prepare();
    byte[] bytes = "AAAAAAAA".getBytes("UTF-8");
    actualImportStatus.runForIm(null, bytes);
    StoreType[] mcStoreTypeArray = actualImportStatus.getMcStoreTypeArray();
    assertEquals(3, mcStoreTypeArray.length);
    assertArrayEquals(
        new StoreType[]{StoreType.NODE_LABEL, StoreType.NODE_LABEL, StoreType.NODE_LABEL},
        mcStoreTypeArray);
    assertEquals(StoreType.NODE_LABEL, mcStoreTypeArray[0]);
    assertEquals(StoreType.NODE_LABEL, mcStoreTypeArray[1]);
    assertEquals(StoreType.NODE_LABEL, mcStoreTypeArray[2]);
    StoreType[] tcStoreTypeArray = actualImportStatus.getTcStoreTypeArray();
    assertEquals(3, tcStoreTypeArray.length);
    assertArrayEquals(
        new StoreType[]{StoreType.NODE_LABEL, StoreType.NODE_LABEL, StoreType.NODE_LABEL},
        tcStoreTypeArray);
    assertEquals(StoreType.NODE_LABEL, tcStoreTypeArray[0]);
    assertEquals(StoreType.NODE_LABEL, tcStoreTypeArray[1]);
    assertEquals(StoreType.NODE_LABEL, tcStoreTypeArray[2]);
    assertSame(mcStoreTypeArray, storeTypeArray);
    assertSame(tcStoreTypeArray, storeTypeArray1);
    assertEquals(8, bytes.length);
    assertArrayEquals("AAAAAAAA".getBytes("UTF-8"), bytes);
    assertEquals('A', bytes[0]);
    assertEquals('A', bytes[1]);
    assertEquals('A', bytes[2]);
    assertEquals('A', bytes[3]);
    assertEquals('A', bytes[4]);
    assertEquals('A', bytes[5]);
    assertEquals('A', bytes[6]);
    assertEquals('A', bytes[7]);
  }

  @Test
  void testName() {
    assertEquals("Dr",
        (new ImportStatus(
            new StoreType[]{StoreType.NODE_LABEL, StoreType.NODE_LABEL, StoreType.NODE_LABEL},
            new StoreType[]{StoreType.NODE_LABEL, StoreType.NODE_LABEL, StoreType.NODE_LABEL},
            "Dr")).name());
  }
}

