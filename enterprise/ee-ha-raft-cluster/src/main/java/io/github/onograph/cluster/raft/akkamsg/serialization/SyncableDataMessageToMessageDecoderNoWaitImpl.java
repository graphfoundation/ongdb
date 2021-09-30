package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import org.neo4j.function.ThrowingFunction;


public class SyncableDataMessageToMessageDecoderNoWaitImpl implements
    SyncableDataMessageToMessageDecoder {


  private final ThrowingFunction<DefaultReadableChecksumChannel, DataManagerFactory<SyncableData>, Exception> RNME;


  private DataManagerFactory<SyncableData> dataManagerFactoryBcSyncableData;

  public SyncableDataMessageToMessageDecoderNoWaitImpl(
      ThrowingFunction<DefaultReadableChecksumChannel, DataManagerFactory<SyncableData>, Exception> RNME) {
    this.RNME = RNME;
  }

  @Override
  public void coseForDe(DefaultReadableChecksumChannel _defaultReadableChecksumChannel)
      throws Exception {
    if (this.dataManagerFactoryBcSyncableData != null) {

      throw new IllegalStateException("*** Error:  cdf69b4c-35dc-467c-a307-5fd5d4beea82");
    } else {
      this.dataManagerFactoryBcSyncableData = this.RNME.apply(_defaultReadableChecksumChannel);
    }
  }

  @Override
  public DataManagerFactory<SyncableData> cracttDataManagerFactory() {
    if (this.dataManagerFactoryBcSyncableData == null) {

      throw new IllegalStateException("*** Error:  69bee98f-4519-4e6e-8b7f-5d1bc8d25fa3");
    } else {
      return this.dataManagerFactoryBcSyncableData;
    }
  }
}
