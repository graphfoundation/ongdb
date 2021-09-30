package io.github.onograph.cluster.raft.module.cuprot.current.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.neo4j.kernel.database.DatabaseId;


public class RequestStoreDatabaseIdCatchupManagement
    extends
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId {

  public RequestStoreDatabaseIdCatchupManagement(DatabaseId _databaseId) {
    super(_databaseId, AskMessageType.AMT_STORE_GUID_ASK);
  }
}
