package io.github.onograph.server.security;

import io.github.onograph.kernel.api.security.DefaultAuthManager;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.graphdb.event.TransactionEventListenerAdapter;


class TransactionEventListenerAdapterEnterpriseSecurityImpl extends
    TransactionEventListenerAdapter<Object>
    implements io.github.onograph.dbms.GdbReplicator.ListenEvents {


  private final DefaultAuthManager defaultAuthManager;

  TransactionEventListenerAdapterEnterpriseSecurityImpl(DefaultAuthManager _defaultAuthManager) {
    this.defaultAuthManager = _defaultAuthManager;
  }

  @Override
  public void afterCommit(TransactionData _transactionData, Object _obSae,
      GraphDatabaseService _graphDatabaseService) {
    this.defaultAuthManager.clneac();
  }

  @Override
  public void strread(long transIdx) {
    this.defaultAuthManager.clneac();
  }

  @Override
  public void tranci(long transIdx) {
    this.defaultAuthManager.clneac();
  }
}
