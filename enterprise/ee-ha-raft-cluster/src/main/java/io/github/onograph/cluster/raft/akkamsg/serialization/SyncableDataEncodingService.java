package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.ComProFamilyUtilities;
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
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ChunkedInputTxWrapper;
import io.github.onograph.cluster.raft.share.sync.DataSyncClusterAction;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.util.List;
import java.util.Objects;


public class SyncableDataEncodingService {


  private final boolean isPsh;

  public SyncableDataEncodingService(ApplicationComProFamilyType _paApplicationComProFamilyType) {
    this.isPsh = ComProFamilyUtilities.isCurrentSupported(_paApplicationComProFamilyType);
  }


  public void process(List<Object> _listOtuObject, SyncableData tNme) throws IOException {
    tNme.dipcForSy(new Processor(this.isPsh, _listOtuObject));
  }


  private static class Processor implements SyncableDataProcessor {


    private final boolean isPsh;


    private final List<Object> listOtuObject;


    Processor(boolean _isPsh, List<Object> _listOtuObject) {
      this.isPsh = _isPsh;
      this.listOtuObject = _listOtuObject;
    }

    @Override
    public void process(AbstractTransactionSync _rtAbstractTransactionSync) {
      this.listOtuObject.add(
          ByteBufChunkedInputSyncDataImpl.chndChunkedInput(
              new ChunkedInputTxWrapper(this.isPsh, _rtAbstractTransactionSync), (byte) 0));
    }

    @Override
    public void process(ConsensusNodeServerMemberIdWrapper _misConsensusNodeServerMemberIdWrapper) {
      this.listOtuObject.add(
          ByteBufChunkedInputSyncDataImpl.sigChunkedInput(this.isPsh, (byte) 1, (channel) ->
          {
            ConsensusNodeServerMemberIdWrapperMarshaller.maslForCoWr(
                _misConsensusNodeServerMemberIdWrapper, channel);
          }));
    }

    @Override
    public void process(RequestData _rtrRequestData) {
      this.listOtuObject.add(
          ByteBufChunkedInputSyncDataImpl.sigChunkedInput(this.isPsh, (byte) 4, (channel) ->
          {
            DataMarshaller.maslForReBy(_rtrRequestData, channel);
          }));
    }

    @Override
    public void process(LeaderNodeDataSDWrapper _blnLeaderNodeDataSDWrapper) {
      this.listOtuObject.add(
          ByteBufChunkedInputSyncDataImpl.sigChunkedInput(this.isPsh, (byte) 5, (channel) ->
          {
          }));
    }

    @Override
    public void process(SyncableLeasableCoreNodeData _rlrSyncableLeasableCoreNodeData) {
      this.listOtuObject.add(
          ByteBufChunkedInputSyncDataImpl.sigChunkedInput(this.isPsh, (byte) 6, (channel) ->
          {
            LeasableSerializer.maslForSyWr(_rlrSyncableLeasableCoreNodeData, channel);
          }));
    }

    @Override
    public void process(DataSyncClusterAction _odDataSyncClusterAction) {

      List _list = this.listOtuObject;
      Objects.requireNonNull(_odDataSyncClusterAction);
      _list.add(ByteBufChunkedInputSyncDataImpl.sigChunkedInput(this.isPsh, (byte) 7,
          _odDataSyncClusterAction::maamadForWr));
    }

    @Override
    public void process(DefaultSDEmptyReq _rdDefaultSDEmptyReq) {
      this.listOtuObject.add(ByteBufChunkedInputSyncDataImpl.chndChunkedInput(
          _rdDefaultSDEmptyReq.enorChunkedInput(this.isPsh), (byte) 8));
    }

    @Override
    public void process(AskState _rsAskState) throws IOException {
      this.listOtuObject.add(
          ByteBufChunkedInputSyncDataImpl.sigChunkedInput(this.isPsh, (byte) 9, (channel) ->
          {
            (new AskState.AskStateSafeChannelMarshal()).marshal(_rsAskState, channel);
          }));
    }
  }
}
