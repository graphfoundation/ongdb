package io.github.onograph.cluster.raft.module.cuprot.exhandlers;

import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import org.neo4j.kernel.availability.AvailabilityGuard;
import org.neo4j.logging.LogProvider;


public class AvailabilityHandler<T extends io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>
    extends ChannelInboundHandlerAdapterErrorImpl<T> {


  private final AvailabilityGuard availabilityGuard;


  public AvailabilityHandler(AvailabilityGuard _availabilityGuard, Class<T> _classTmT,
      LogProvider _logProvider, ServerRef _poooServerRef) {
    super(_classTmT, _logProvider, _poooServerRef);
    this.availabilityGuard = _availabilityGuard;
  }

  @Override
  CatchupProblem neerrseCatchupProblem(T _tRqet) {

    String _strSd =
        this.availabilityGuard.isShutdown() ? io.github.onograph.TokenConstants.SHUTDOWN
            : io.github.onograph.TokenConstants.UNAVAILABLE;
    return new CatchupProblem(
        String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.cuprot.exhandlers.AvailabilityHandler.format"),
            _tRqet, _tRqet.getDatabaseId(),
            _strSd), CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR);
  }
}
