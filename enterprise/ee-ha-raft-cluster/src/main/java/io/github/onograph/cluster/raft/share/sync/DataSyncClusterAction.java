package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.UUID;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;


public class DataSyncClusterAction implements SyncableData {


  private final SyncableData btval;


  private final SessionSeqActionId ioSessionSeqActionId;


  private final ClusterSessionBean sgClusterSessionBean;


  public DataSyncClusterAction(SyncableData btval, SessionSeqActionId _ioSessionSeqActionId,
      ClusterSessionBean _sgClusterSessionBean) {
    this.btval = btval;
    this.ioSessionSeqActionId = _ioSessionSeqActionId;
    this.sgClusterSessionBean = _sgClusterSessionBean;
  }


  public static DataManagerFactory<SyncableData> deeazDataManagerFactory(
      ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    long _lgBsm = _readableChannel.getLong();

    long _lgBsl = _readableChannel.getLong();

    ConsensusNodeId _onrConsensusNodeId = ConsensusNodeId.SafeStateMarshalImpl.IT.unmarshal(
        _readableChannel);

    ClusterSessionBean _sgClusterSessionBean = new ClusterSessionBean(new UUID(_lgBsm, _lgBsl),
        _onrConsensusNodeId);

    long _lgLsi = _readableChannel.getLong();

    long _lgNs = _readableChannel.getLong();

    SessionSeqActionId _iolSessionSeqActionId = new SessionSeqActionId(_lgLsi, _lgNs);
    return DataManagerFactory.undDataManagerFactory((subContent) ->
    {
      return new DataSyncClusterAction(subContent, _iolSessionSeqActionId, _sgClusterSessionBean);
    });
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
    this.getBtval().dipcForSy(_hcSyncableDataProcessor);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DataSyncClusterAction _tDataSyncClusterAction = (DataSyncClusterAction) obj;
      return Objects.equals(this.btval, _tDataSyncClusterAction.btval) &&
          Objects.equals(this.sgClusterSessionBean, _tDataSyncClusterAction.sgClusterSessionBean) &&
          Objects.equals(this.ioSessionSeqActionId, _tDataSyncClusterAction.ioSessionSeqActionId);
    } else {
      return false;
    }
  }


  public SyncableData getBtval() {
    return this.btval;
  }


  public SessionSeqActionId getIoSessionSeqActionId() {
    return this.ioSessionSeqActionId;
  }


  public ClusterSessionBean getSgClusterSessionBean() {
    return this.sgClusterSessionBean;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.btval, this.sgClusterSessionBean, this.ioSessionSeqActionId);
  }


  public void maamadForWr(WritableChannel _writableChannel) throws IOException {
    _writableChannel.putLong(this.getSgClusterSessionBean().getIsUUID().getMostSignificantBits());
    _writableChannel.putLong(this.getSgClusterSessionBean().getIsUUID().getLeastSignificantBits());
    ConsensusNodeId.SafeStateMarshalImpl.IT.marshal(
        this.getSgClusterSessionBean().oweConsensusNodeId(), _writableChannel);
    _writableChannel.putLong(this.ioSessionSeqActionId.getLgIsl());
    _writableChannel.putLong(this.ioSessionSeqActionId.getLgNs());
  }

  @Override
  public OptionalLong sizOptionalLong() {
    return this.btval.sizOptionalLong();
  }


}
