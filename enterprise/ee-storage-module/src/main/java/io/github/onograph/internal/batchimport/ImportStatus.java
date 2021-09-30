package io.github.onograph.internal.batchimport;

import java.io.IOException;
import org.neo4j.kernel.impl.store.StoreType;


class ImportStatus {


  private final StoreType[] mcStoreTypeArray;


  private final StoreType[] tcStoreTypeArray;


  private final String title;


  ImportStatus(StoreType[] _mcStoreTypeArray, StoreType[] _tcStoreTypeArray, String title) {
    this.mcStoreTypeArray = _mcStoreTypeArray;
    this.tcStoreTypeArray = _tcStoreTypeArray;
    this.title = title;
  }


  StoreType[] getMcStoreTypeArray() {
    return this.mcStoreTypeArray;
  }


  StoreType[] getTcStoreTypeArray() {
    return this.tcStoreTypeArray;
  }


  String name() {
    return this.title;
  }


  void persist() throws IOException {
  }


  void prepare() throws IOException {
  }


  void runForIm(Checkpointable checkpointable, byte[] _pcfByteArray)
      throws IOException {
  }


  interface Checkpointable {


    void chc(byte[] _byteArray) throws IOException;
  }
}
