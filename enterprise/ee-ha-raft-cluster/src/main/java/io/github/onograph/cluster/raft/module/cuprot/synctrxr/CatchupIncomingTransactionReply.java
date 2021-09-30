package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import java.util.Objects;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.storageengine.api.StoreId;


public class CatchupIncomingTransactionReply {


  public static final CatchupIncomingTransactionReply EMT_CATCHUP_INCOMING_TRANSACTION_REPLY = new CatchupIncomingTransactionReply(
      -1, null, null);


  private final int iSt;


  private final StoreId storeId;


  private final CommittedTransactionRepresentation tCommittedTransactionRepresentation;


  public CatchupIncomingTransactionReply(int _iSt, StoreId _storeId,
      CommittedTransactionRepresentation _tCommittedTransactionRepresentation) {
    this.iSt = _iSt;
    this.storeId = _storeId;
    this.tCommittedTransactionRepresentation = _tCommittedTransactionRepresentation;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof CatchupIncomingTransactionReply)) {
      return false;
    } else {

      CatchupIncomingTransactionReply _thCatchupIncomingTransactionReply = (CatchupIncomingTransactionReply) obj;
      return this.iSt == _thCatchupIncomingTransactionReply.iSt && Objects.equals(this.storeId,
          _thCatchupIncomingTransactionReply.storeId) &&
          Objects.equals(this.tCommittedTransactionRepresentation,
              _thCatchupIncomingTransactionReply.tCommittedTransactionRepresentation);
    }
  }


  public int getISt() {
    return this.iSt;
  }


  public StoreId getStoreId() {
    return this.storeId;
  }


  public CommittedTransactionRepresentation getTCommittedTransactionRepresentation() {
    return this.tCommittedTransactionRepresentation;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.storeId, this.tCommittedTransactionRepresentation, this.iSt);
  }


}
