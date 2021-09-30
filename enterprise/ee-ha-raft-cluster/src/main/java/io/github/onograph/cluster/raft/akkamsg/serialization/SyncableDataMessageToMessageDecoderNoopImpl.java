package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class SyncableDataMessageToMessageDecoderNoopImpl implements
    SyncableDataMessageToMessageDecoder {


  ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

  @Override
  public void coseForDe(DefaultReadableChecksumChannel _defaultReadableChecksumChannel)
      throws IOException {

    int _iBa = _defaultReadableChecksumChannel.avibbe();
    if (_iBa != 0) {

      byte[] btCnt = new byte[_iBa];
      _defaultReadableChecksumChannel.get(btCnt, _iBa);
      this.byteArrayOutputStream.write(btCnt);
    }
  }

  @Override
  public DataManagerFactory<SyncableData> cracttDataManagerFactory() {
    return DataManagerFactory.fiieDataManagerFactory(
        new DefaultSDEmptyReq(this.byteArrayOutputStream.toByteArray()));
  }
}
