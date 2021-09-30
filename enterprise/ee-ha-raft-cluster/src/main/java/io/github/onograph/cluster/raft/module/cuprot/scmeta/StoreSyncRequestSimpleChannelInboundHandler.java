package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.graphdb.Resource;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.logging.Log;
import org.neo4j.storageengine.api.StoreFileMetadata;


public class StoreSyncRequestSimpleChannelInboundHandler extends
    SimpleChannelInboundHandler<StoreSyncRequest> {


  private final Database dDatabase;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Log log;


  private final StoreSyncResourceServiceManager pfcspStoreSyncResourceServiceManager;


  private final ServerRef poooServerRef;


  private final StoreResourceSyncProcessor spStoreResourceSyncProcessor;


  public StoreSyncRequestSimpleChannelInboundHandler(Database _dDatabase,
      FileSystemAbstraction _fFileSystemAbstraction, int largest,
      StoreSyncResourceServiceManager _pfcspStoreSyncResourceServiceManager,
      ServerRef _pscServerRef) {
    this.poooServerRef = _pscServerRef;
    this.dDatabase = _dDatabase;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.spStoreResourceSyncProcessor = new StoreResourceSyncProcessor(largest);
    this.log = _dDatabase.getInternalLogProvider().getLog(this.getClass());
    this.pfcspStoreSyncResourceServiceManager = _pfcspStoreSyncResourceServiceManager;
  }


  private SetupGdbStoreSyncReply _creselroSetupGdbStoreSyncReply(CheckPointer _checkPointer,
      Path[] _fpdePathArray) {

    long _lgItpcl = _checkPointer.lastCheckPointedTransactionId();
    return SetupGdbStoreSyncReply.sucsSetupGdbStoreSyncReply(_lgItpcl, _fpdePathArray);
  }


  private boolean _isCapefsocpForDa(Database _dDatabase) {
    if (!_dDatabase.getDatabaseAvailabilityGuard().isAvailable()) {

      return false;
    } else {
      return true;
    }
  }


  private StoreElementFacade _tosrroStoreElementFacade(StoreFileMetadata _storeFileMetadata) {

    Path _dpPath = this.dDatabase.getDatabaseLayout().databaseDirectory();

    Path _pfPath = _storeFileMetadata.path();

    String _strRp = _dpPath.relativize(_pfPath).toString();
    return new StoreElementFacade(this.fFileSystemAbstraction, _pfPath,
        _storeFileMetadata.recordSize(), _strRp);
  }


  private Resource _trceiadaimtResource(CheckPointer _checkPointer) throws IOException {
    return this.dDatabase.getStoreCopyCheckPointMutex().storeCopy(() ->
    {
      _checkPointer.tryCheckPoint(new SimpleTriggerInfo(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncRequestSimpleChannelInboundHandler.checkPointer")));
    });
  }

  @Override
  protected void channelRead0(ChannelHandlerContext _channelHandlerContext,
      StoreSyncRequest _rcspStoreSyncRequest) throws IOException {

    AutoClosableFutureListener _lcAutoClosableFutureListener = new AutoClosableFutureListener();

    SetupGdbStoreSyncReply _rsosSetupGdbStoreSyncReply = SetupGdbStoreSyncReply.eroSetupGdbStoreSyncReply(
        io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_TLS_S_ERR);

    try {
      if (!this._isCapefsocpForDa(this.dDatabase)) {
        return;
      }

      if (!_rcspStoreSyncRequest.getStoreId()
          .equalsIgnoringLocalUpgradeMetadata(this.dDatabase.getStoreId())) {
        _rsosSetupGdbStoreSyncReply = SetupGdbStoreSyncReply.eroSetupGdbStoreSyncReply(
            io.github.onograph.cluster.raft.module.cuprot.scmeta.SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR);
      } else {

        CheckPointer _checkPointer = (CheckPointer) this.dDatabase.getDependencyResolver()
            .resolveDependency(CheckPointer.class);
        _lcAutoClosableFutureListener.addToList(this._trceiadaimtResource(_checkPointer));

        StoreSyncResourceService _fcspStoreSyncResourceService =
            (StoreSyncResourceService) _lcAutoClosableFutureListener.addToList(
                this.pfcspStoreSyncResourceServiceManager.prrsrcyfsStoreSyncResourceService());
        _fcspStoreSyncResourceService.geaofnoStream().forEach((storeFileMetadata) ->
        {
          this.spStoreResourceSyncProcessor
              .steForChSt(_channelHandlerContext,
                  this._tosrroStoreElementFacade(storeFileMetadata));
        });
        _rsosSetupGdbStoreSyncReply = this._creselroSetupGdbStoreSyncReply(_checkPointer,
            _fcspStoreSyncResourceService.getPrPathArray());
      }
    } finally {
      _channelHandlerContext.write(AnswerMessageType.AMT_SETUP_CT_ANSWER);
      _channelHandlerContext.writeAndFlush(_rsosSetupGdbStoreSyncReply)
          .addListener(_lcAutoClosableFutureListener);
      this.poooServerRef.exeForE(
          io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
    }
  }
}
