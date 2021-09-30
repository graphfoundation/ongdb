package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.function.Consumer;
import org.neo4j.kernel.database.DatabaseId;


public interface CoreNodeSyncableData extends SyncableData {


  DatabaseId daasidDatabaseId();


  void dipcForSy(AutoCloseableActionProcessor _autoCloseableActionProcessor,
      Consumer<FSMData> _consumerVarFSMData, long _lgVa);
}
