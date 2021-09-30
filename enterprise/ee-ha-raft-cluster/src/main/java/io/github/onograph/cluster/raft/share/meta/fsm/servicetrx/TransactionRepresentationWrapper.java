package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import org.neo4j.kernel.impl.transaction.TransactionRepresentation;


public interface TransactionRepresentationWrapper {


  TransactionRepresentation exrtTransactionRepresentation(
      AbstractTransactionSync _abstractTransactionSync);
}
