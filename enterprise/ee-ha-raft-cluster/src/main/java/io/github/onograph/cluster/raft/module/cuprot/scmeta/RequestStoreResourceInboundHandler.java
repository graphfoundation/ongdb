package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.storageengine.api.StoreFileMetadata;
import org.neo4j.util.VisibleForTesting;


public class RequestStoreResourceInboundHandler extends
    SimpleChannelInboundHandler<RequestStoreResource> {


  private final Database dDatabase;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Log log;


  private final ServerRef poooServerRef;


  private final StoreResourceSyncProcessor psfsStoreResourceSyncProcessor;


  public RequestStoreResourceInboundHandler(Database _dDatabase,
      FileSystemAbstraction _fFileSystemAbstraction, ServerRef _poooServerRef,
      StoreResourceSyncProcessor _psfsStoreResourceSyncProcessor) {
    this.poooServerRef = _poooServerRef;
    this.dDatabase = _dDatabase;
    this.psfsStoreResourceSyncProcessor = _psfsStoreResourceSyncProcessor;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.log = _dDatabase.getInternalLogProvider().getLog(this.getClass());
  }


  private static Predicate<StoreFileMetadata> _maerudPredicate(String _strNf) {
    return (f) ->
    {
      return f.path().getFileName().toString().equals(_strNf);
    };
  }


  private static Iterator<StoreFileMetadata> _onyoeIterator(String desc,
      List<StoreFileMetadata> _listFlsStoreFileMetadata) {
    if (_listFlsStoreFileMetadata.size() != 1) {

      throw new IllegalStateException("*** Error: 245dfa64-f1d0-4da1-b32b-0aefa43b04bc");
    } else {
      return _listFlsStoreFileMetadata.iterator();
    }
  }


  private void _trayceiForDaCh(CheckPointer _checkPointer, Database _dDatabase) {

    JobMonitoringParams _jobMonitoringParams =
        JobMonitoringParams.systemJob(_dDatabase.getNamedDatabaseId().name(),
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.cuprot.scmeta.RequestStoreResourceInboundHandler.systemJob"));
    _dDatabase.getScheduler().schedule(Group.CHECKPOINT, _jobMonitoringParams, () ->
    {
      try {
        _checkPointer.tryCheckPointNoWait(new SimpleTriggerInfo(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.cuprot.scmeta.RequestStoreResourceInboundHandler.jobMonitoringParams")));
      } catch (

          IOException _iOException) {

      }
    });
  }

  @Override
  protected final void channelRead0(ChannelHandlerContext _cChannelHandlerContext,
      RequestStoreResource _requestStoreResource)
      throws Exception {

    io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType _srSetupGdbSyncReplyStateType =
        io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_GENERAL_ERR;

    long _lgTcl = -1L;

    try {

      CheckPointer _checkPointer = this.dDatabase.getDependencyResolver()
          .resolveDependency(CheckPointer.class);
      if (!_requestStoreResource.getEpceStoreId()
          .equalsIgnoringLocalUpgradeMetadata(this.dDatabase.getStoreId())) {
        _srSetupGdbSyncReplyStateType =
            io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR;
      } else if (_checkPointer.lastCheckPointedTransactionId() < _requestStoreResource.getLgItr()) {
        _srSetupGdbSyncReplyStateType =
            io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_NO_CU_ERR;
        this._trayceiForDaCh(_checkPointer, this.dDatabase);
      } else {

        Path _pdPath = this.dDatabase.getDatabaseLayout().databaseDirectory();

        ResourceIterator _resourceIterator = this.fieResourceIterator(this.dDatabase,
            _requestStoreResource);

        try {
          while (_resourceIterator.hasNext()) {

            StoreFileMetadata _storeFileMetadata = (StoreFileMetadata) _resourceIterator.next();

            StoreElementFacade _rsStoreElementFacade =
                new StoreElementFacade(this.fFileSystemAbstraction, _storeFileMetadata.path(),
                    _storeFileMetadata.recordSize(),
                    _pdPath.relativize(_storeFileMetadata.path()).toString());
            this.psfsStoreResourceSyncProcessor.steForChSt(_cChannelHandlerContext,
                _rsStoreElementFacade);
          }
        } catch (

            Throwable _throwable) {
          if (_resourceIterator != null) {
            try {
              _resourceIterator.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_resourceIterator != null) {
          _resourceIterator.close();
        }

        _lgTcl = _checkPointer.lastCheckPointedTransactionId();
        _srSetupGdbSyncReplyStateType = io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncCompleted.SetupGdbSyncReplyStateType.OK;
      }
    } finally {
      this.psfsStoreResourceSyncProcessor.endFuture(_cChannelHandlerContext, _lgTcl,
          _srSetupGdbSyncReplyStateType);
      this.poooServerRef.exeForE(
          io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
    }
  }


  @VisibleForTesting
  ResourceIterator<StoreFileMetadata> fieResourceIterator(Database _database,
      RequestStoreResource _requestStoreResource) throws IOException {

    ResourceIterator _resourceIterator = _database.listStoreFiles(false);

    ResourceIterator _resourceIterator2;
    try {

      String _strFn = _requestStoreResource.getPath().getFileName().toString();
      _resourceIterator2 = Iterators.asResourceIterator(
          _onyoeIterator(_strFn, (List) _resourceIterator.stream().filter(_maerudPredicate(_strFn))
              .collect(Collectors.toList())));
    } catch (

        Throwable _throwable) {
      if (_resourceIterator != null) {
        try {
          _resourceIterator.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_resourceIterator != null) {
      _resourceIterator.close();
    }

    return _resourceIterator2;
  }
}
