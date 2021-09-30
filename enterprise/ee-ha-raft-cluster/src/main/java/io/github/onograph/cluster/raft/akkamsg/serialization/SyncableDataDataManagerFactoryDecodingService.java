package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.module.cuprot.Ref;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;


public class SyncableDataDataManagerFactoryDecodingService extends
    MessageToMessageDecoder<DataManagerFactory<SyncableData>> {


  private final Ref<MessageDataType> refPoooMessageDataType;


  private DataManagerFactory<SyncableData> dataManagerFactoryBcSyncableData = DataManagerFactory.emuiDataManagerFactory();

  public SyncableDataDataManagerFactoryDecodingService(
      Ref<MessageDataType> _refPoooMessageDataType) {
    this.refPoooMessageDataType = _refPoooMessageDataType;
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext,
      DataManagerFactory<SyncableData> m, List<Object> _listOObject) {
    this.dataManagerFactoryBcSyncableData.cobeDataManagerFactory(m);
    if (this.dataManagerFactoryBcSyncableData.getIsCi()) {
      _listOObject.add(this.dataManagerFactoryBcSyncableData.bul());
      this.dataManagerFactoryBcSyncableData = DataManagerFactory.emuiDataManagerFactory();
      this.refPoooMessageDataType.exeForE(MessageDataType.CT);
    }
  }
}
