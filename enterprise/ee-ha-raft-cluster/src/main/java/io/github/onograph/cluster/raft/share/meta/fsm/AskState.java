package io.github.onograph.cluster.raft.share.meta.fsm;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.akkamsg.serialization.UUIDSafeChannelMarshal;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.CoreNodeSyncableData;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class AskState implements CoreNodeSyncableData, EmptyReq {


  private final DatabaseId databaseId;


  private final ConsensusNodeId imConsensusNodeId;


  private final UUID miUUID;


  public AskState(DatabaseId _databaseId, ConsensusNodeId _imConsensusNodeId, UUID _imUUID) {
    this.databaseId = _databaseId;
    this.imConsensusNodeId = _imConsensusNodeId;
    this.miUUID = _imUUID;
  }

  @Override
  public DatabaseId daasidDatabaseId() {
    return this.databaseId;
  }

  @Override
  public void dipcForSy(AutoCloseableActionProcessor _dcAutoCloseableActionProcessor,
      Consumer<FSMData> _consumerClbcFSMData, long caIdx) {
    _dcAutoCloseableActionProcessor.dipcForSyCo(this, _consumerClbcFSMData, caIdx);
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof AskState)) {
      return false;
    } else {

      AskState _thaAskState = (AskState) obj;
      return Objects.equals(this.miUUID, _thaAskState.miUUID) && Objects.equals(this.databaseId,
          _thaAskState.databaseId) &&
          Objects.equals(this.imConsensusNodeId, _thaAskState.imConsensusNodeId);
    }
  }


  public ConsensusNodeId getImConsensusNodeId() {
    return this.imConsensusNodeId;
  }


  public UUID getMiUUID() {
    return this.miUUID;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.miUUID, this.databaseId, this.imConsensusNodeId);
  }


  public static class AskStateSafeChannelMarshal extends SafeChannelMarshal<AskState> {


    public static final SafeChannelMarshal<AskState> IT = new AskState.AskStateSafeChannelMarshal();

    @Override
    public void marshal(AskState _rsAskState, WritableChannel _writableChannel)
        throws IOException {
      UUIDSafeChannelMarshal.IT.marshal(_rsAskState.miUUID, _writableChannel);
      DatabaseIdOnlySafeChannelMarshal.IT.marshal(_rsAskState.databaseId, _writableChannel);
      ConsensusNodeId.SafeStateMarshalImpl.IT.marshal(_rsAskState.imConsensusNodeId,
          _writableChannel);
    }

    @Override
    protected AskState unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {
      return new AskState(DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel),
          ConsensusNodeId.SafeStateMarshalImpl.IT.unmarshal0(_readableChannel),
          UUIDSafeChannelMarshal.IT.unmarshal(_readableChannel));
    }
  }
}
