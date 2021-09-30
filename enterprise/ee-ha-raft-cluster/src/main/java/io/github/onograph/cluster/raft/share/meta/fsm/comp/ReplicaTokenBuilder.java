package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import org.neo4j.kernel.api.txstate.TransactionState;


public interface ReplicaTokenBuilder {


  void crateForTrSt(TransactionState _transactionState, String _strVar, boolean _isVar, int _iVa);
}
