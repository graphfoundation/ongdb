package io.github.onograph.cluster.raft.module.cuprot.exhandlers;

import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.neo4j.logging.LogProvider;


public class GdbMissingHandler<T extends io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>
    extends ChannelInboundHandlerAdapterErrorImpl<T> {

  public GdbMissingHandler(Class<T> _classMtT, LogProvider _logProvider, ServerRef _poooServerRef) {
    super(_classMtT, _logProvider, _poooServerRef);
  }

  @Override
  CatchupProblem neerrseCatchupProblem(T _tRqet) {
    return new CatchupProblem(
        String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.cuprot.exhandlers.GdbMissingHandler.format"),
            _tRqet,
            _tRqet.getDatabaseId()), CatchupStatusType.CST_UNKNOWN_GDB_ERR);
  }
}
