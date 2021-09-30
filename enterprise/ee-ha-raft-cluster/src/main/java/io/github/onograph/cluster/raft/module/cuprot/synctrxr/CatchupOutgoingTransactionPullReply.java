package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import java.util.Objects;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.storageengine.api.StoreId;


public class CatchupOutgoingTransactionPullReply {


  public static final CatchupOutgoingTransactionPullReply EMT_CATCHUP_OUTGOING_TRANSACTION_PULL_REPLY =
      new CatchupOutgoingTransactionPullReply(null, null, null);


  private final KernelVersion kernelVersion;


  private final StoreId storeId;


  private final CommittedTransactionRepresentation tCommittedTransactionRepresentation;


  public CatchupOutgoingTransactionPullReply(KernelVersion _kernelVersion, StoreId _storeId,
      CommittedTransactionRepresentation _tCommittedTransactionRepresentation) {
    this.kernelVersion = _kernelVersion;
    this.storeId = _storeId;
    this.tCommittedTransactionRepresentation = _tCommittedTransactionRepresentation;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof CatchupOutgoingTransactionPullReply)) {
      return false;
    } else {

      CatchupOutgoingTransactionPullReply _tCatchupOutgoingTransactionPullReply = (CatchupOutgoingTransactionPullReply) obj;
      return Objects.equals(this.storeId, _tCatchupOutgoingTransactionPullReply.storeId) &&
          Objects.equals(this.tCommittedTransactionRepresentation,
              _tCatchupOutgoingTransactionPullReply.tCommittedTransactionRepresentation) &&
          this.kernelVersion == _tCatchupOutgoingTransactionPullReply.kernelVersion;
    }
  }


  public KernelVersion getKernelVersion() {
    return this.kernelVersion;
  }


  public StoreId getStoreId() {
    return this.storeId;
  }


  public CommittedTransactionRepresentation getTCommittedTransactionRepresentation() {
    return this.tCommittedTransactionRepresentation;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.storeId, this.tCommittedTransactionRepresentation, this.kernelVersion);
  }


}
