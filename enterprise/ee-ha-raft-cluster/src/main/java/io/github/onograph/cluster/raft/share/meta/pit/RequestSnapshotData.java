package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import org.neo4j.kernel.database.DatabaseId;


public class RequestSnapshotData
    extends
    io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId {

  public RequestSnapshotData(DatabaseId _databaseId) {
    super(_databaseId, AskMessageType.AMT_CS_ASK);
  }
}
