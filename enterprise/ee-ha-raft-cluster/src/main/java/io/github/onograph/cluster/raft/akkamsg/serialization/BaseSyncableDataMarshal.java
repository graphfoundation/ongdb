package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.calg.LeaderNodeDataSDWrapper;
import io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapper;
import io.github.onograph.cluster.raft.share.calg.mnode.ConsensusNodeServerMemberIdWrapperMarshaller;
import io.github.onograph.cluster.raft.share.meta.fsm.AskState;
import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.DataMarshaller;
import io.github.onograph.cluster.raft.share.meta.fsm.comp.RequestData;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableSerializer;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.SyncableLeasableCoreNodeData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.AbstractTransactionSync;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.DefaultTransactionSyncMarshalWrapper;
import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;


public class BaseSyncableDataMarshal extends SafeChannelMarshal<SyncableData> {


  protected final LogEntryReader logEntryReader;

  public BaseSyncableDataMarshal(LogEntryReader _logEntryReader) {
    this.logEntryReader = _logEntryReader;
  }


  protected SyncableDataProcessor gemslSyncableDataProcessor(WritableChannel _writableChannel) {
    return new Processor(_writableChannel);
  }

  @Override
  public void marshal(SyncableData _crSyncableData, WritableChannel _writableChannel)
      throws IOException {
    _crSyncableData.dipcForSy(this.gemslSyncableDataProcessor(_writableChannel));
  }


  public DataManagerFactory<SyncableData> unahDataManagerFactory(ReadableChannel _readableChannel,
      byte _tcByte) throws IOException, EndOfStreamException {
    switch (_tcByte) {
      case 0:
        return DataManagerFactory.fiieDataManagerFactory(
            DefaultTransactionSyncMarshalWrapper.unahAbstractTransactionSync(this.logEntryReader,
                _readableChannel));
      case 1:
        return DataManagerFactory.fiieDataManagerFactory(
            ConsensusNodeServerMemberIdWrapperMarshaller.unahConsensusNodeServerMemberIdWrapper(
                _readableChannel));
      case 2:
      case 3:
      default:

        throw new IllegalStateException("*** Error: 1fc27463-a6b2-4806-a34a-44954f6d12e2");
      case 4:
        return DataManagerFactory.fiieDataManagerFactory(
            DataMarshaller.unahRequestData(_readableChannel));
      case 5:
        return DataManagerFactory.fiieDataManagerFactory(new LeaderNodeDataSDWrapper());
      case 6:
        return DataManagerFactory.fiieDataManagerFactory(
            LeasableSerializer.unahSyncableLeasableCoreNodeData(_readableChannel));
      case 7:
        return DataSyncClusterAction.deeazDataManagerFactory(_readableChannel);
      case 8:
        return DataManagerFactory.fiieDataManagerFactory(
            DefaultSDEmptyReq.DefaultSDEmptyReqSafeChannelMarshal.IT.unmarshal(_readableChannel));
      case 9:
        return DataManagerFactory.fiieDataManagerFactory(
            AskState.AskStateSafeChannelMarshal.IT.unmarshal(_readableChannel));
    }
  }

  @Override
  protected SyncableData unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    byte tNme = _readableChannel.get();

    DataManagerFactory _bcDataManagerFactory;
    for (_bcDataManagerFactory = this.unahDataManagerFactory(_readableChannel, tNme);
        !_bcDataManagerFactory.getIsCi();
        _bcDataManagerFactory = _bcDataManagerFactory.cobeDataManagerFactory(
            this.unahDataManagerFactory(_readableChannel, tNme))) {
      tNme = _readableChannel.get();
    }

    return (SyncableData) _bcDataManagerFactory.bul();
  }


  protected static class Processor implements SyncableDataProcessor {


    protected final WritableChannel writableChannel;

    Processor(WritableChannel _writableChannel) {
      this.writableChannel = _writableChannel;
    }

    @Override
    public void process(AbstractTransactionSync _tAbstractTransactionSync) throws IOException {
      this.writableChannel.put((byte) 0);
      DefaultTransactionSyncMarshalWrapper.maslForWrAb(_tAbstractTransactionSync,
          this.writableChannel);
    }

    @Override
    public void process(ConsensusNodeServerMemberIdWrapper _simConsensusNodeServerMemberIdWrapper)
        throws IOException {
      this.writableChannel.put((byte) 1);
      ConsensusNodeServerMemberIdWrapperMarshaller.maslForCoWr(
          _simConsensusNodeServerMemberIdWrapper, this.writableChannel);
    }

    @Override
    public void process(RequestData _rtrRequestData) throws IOException {
      this.writableChannel.put((byte) 4);
      DataMarshaller.maslForReBy(_rtrRequestData, this.writableChannel);
    }

    @Override
    public void process(LeaderNodeDataSDWrapper _blnLeaderNodeDataSDWrapper) throws IOException {
      this.writableChannel.put((byte) 5);
    }

    @Override
    public void process(SyncableLeasableCoreNodeData _rlrSyncableLeasableCoreNodeData)
        throws IOException {
      this.writableChannel.put((byte) 6);
      LeasableSerializer.maslForSyWr(_rlrSyncableLeasableCoreNodeData, this.writableChannel);
    }

    @Override
    public void process(DataSyncClusterAction _odDataSyncClusterAction) throws IOException {
      this.writableChannel.put((byte) 7);
      _odDataSyncClusterAction.maamadForWr(this.writableChannel);
    }

    @Override
    public void process(DefaultSDEmptyReq _rdDefaultSDEmptyReq) throws IOException {
      this.writableChannel.put((byte) 8);
      DefaultSDEmptyReq.DefaultSDEmptyReqSafeChannelMarshal.IT.marshal(_rdDefaultSDEmptyReq,
          this.writableChannel);
    }

    @Override
    public void process(AskState _rsAskState) throws IOException {
      this.writableChannel.put((byte) 9);
      (new AskState.AskStateSafeChannelMarshal()).marshal(_rsAskState, this.writableChannel);
    }
  }
}
