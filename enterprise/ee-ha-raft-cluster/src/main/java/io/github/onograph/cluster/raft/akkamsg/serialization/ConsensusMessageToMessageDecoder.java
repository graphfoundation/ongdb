package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;


public class ConsensusMessageToMessageDecoder extends MessageToMessageDecoder<Object> {


  private final Clock clock;


  private final Queue<SyncableData> queueCrSyncableData = new LinkedList();


  private final Queue<Long> queueTelrLong = new LinkedList();


  private io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.IncomingConsensusMessageManager
      cmIncomingConsensusMessageManager;

  public ConsensusMessageToMessageDecoder(Clock _clock) {
    this.clock = _clock;
  }


  private void _claForCo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager m) {
    this.cmIncomingConsensusMessageManager = null;
    if (!this.queueCrSyncableData.isEmpty() || !this.queueTelrLong.isEmpty()) {

      throw new IllegalStateException("*** Error: 9c0b6d41-a2f8-4554-a7e9-d1aa7acea02f");
    }
  }


  private String _stiiString(Iterable<?> _iterableOjcsObject) {

    StringBuilder _stringBuilder = new StringBuilder();

    Iterator _iterator = _iterableOjcsObject.iterator();

    while (_iterator.hasNext()) {
      _stringBuilder.append(_iterator.next());
      if (_iterator.hasNext()) {
        _stringBuilder.append(", ");
      }
    }

    return _stringBuilder.toString();
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, Object m,
      List<Object> _listOObject) {
    if (m instanceof SyncableData) {
      this.queueCrSyncableData.add((SyncableData) m);
    } else if (m instanceof ConsensusTransactionLogElectionTermsWrapper) {

      long[] _lgVArray = ((ConsensusTransactionLogElectionTermsWrapper) m).getLgTerArray();

      int _iVar = _lgVArray.length;

      for (

          int _iV = 0; _iV < _iVar; ++_iV) {

        long _lgTer = _lgVArray[_iV];
        this.queueTelrLong.add(_lgTer);
      }
    } else {
      if (!(m instanceof io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.IncomingConsensusMessageManager)) {

        throw new IllegalStateException("*** Error: d94cbbc4-dc95-456a-ad9a-d59fdcdd9e2b");
      }

      if (this.cmIncomingConsensusMessageManager != null) {

        throw new IllegalStateException("*** Error:  356ff233-e477-4ba0-a4f7-02b65d065033");
      }

      this.cmIncomingConsensusMessageManager =
          (io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusByteToMessageDecoder.IncomingConsensusMessageManager) m;
    }

    if (this.cmIncomingConsensusMessageManager != null) {

      Optional<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager> _optionalMairArrivingMessageManager =
          this.cmIncomingConsensusMessageManager.mabcooOptional(this.clock,
              this.queueCrSyncableData, this.queueTelrLong);
      _optionalMairArrivingMessageManager.ifPresent((message) ->
      {
        this._claForCo(message);
        _listOObject.add(message);
      });
    }
  }
}
