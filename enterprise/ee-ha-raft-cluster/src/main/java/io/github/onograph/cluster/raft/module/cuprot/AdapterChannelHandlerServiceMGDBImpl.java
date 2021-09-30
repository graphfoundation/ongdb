package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.module.cuprot.current.core.RequestAuthMetaInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.RequestAllGdbIdsInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbIdInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.info.RequestMetaInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreResource;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.StoreSyncRequest;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.RequestStoreResourceInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResourceSyncProcessor;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncRequestSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncResourceServiceManager;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionSyncSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotData;
import io.github.onograph.cluster.raft.share.meta.pit.RequestSnapshotDataInboundHandler;
import io.github.onograph.cluster.raft.shared.ClusterTxConfiguratorApproach;
import io.github.onograph.config.TxFlowType;
import io.netty.channel.ChannelHandler;
import java.util.function.Supplier;
import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.database.Database;
import org.neo4j.logging.LogProvider;


public class AdapterChannelHandlerServiceMGDBImpl implements AdapterChannelHandlerService {


  private final DatabaseManager<?> databaseManagerMdObject;


  private final DatabaseStateService databaseStateService;


  private final DependencyResolver dependencyResolver;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final int largest;


  private final LogProvider logProvider;


  private final Supplier<TxFlowType> supplierPsstTxFlowType;


  private AdapterChannelHandlerServiceMGDBImpl(DatabaseManager<?> _databaseManagerDmObject,
      DatabaseStateService _databaseStateService, DependencyResolver _dependencyResolver,
      FileSystemAbstraction _fFileSystemAbstraction, int largest, LogProvider _logProvider,
      Supplier<TxFlowType> _supplierPsstTxFlowType) {
    this.databaseManagerMdObject = _databaseManagerDmObject;
    this.databaseStateService = _databaseStateService;
    this.dependencyResolver = _dependencyResolver;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.largest = largest;
    this.logProvider = _logProvider;
    this.supplierPsstTxFlowType = _supplierPsstTxFlowType;
  }


  private static RequestSnapshotDataInboundHandler _bucsnorurethlRequestSnapshotDataInboundHandler(
      Database _dDatabase, ServerRef _poooServerRef) {
    return new RequestSnapshotDataInboundHandler(_dDatabase, _poooServerRef);
  }


  private static RequestAllGdbIdsInboundHandler _bugaldbidruharRequestAllGdbIdsInboundHandler(
      DatabaseManager<?> _databaseManagerDmObject, ServerRef _poooServerRef) {
    return new RequestAllGdbIdsInboundHandler(_databaseManagerDmObject, _poooServerRef);
  }


  private static RequestMetaInboundHandler _buiharRequestMetaInboundHandler(
      DatabaseManager<?> _databaseManagerMdObject, DatabaseStateService _databaseStateService,
      ServerRef _poooServerRef) {
    return new RequestMetaInboundHandler(_databaseManagerMdObject, _databaseStateService,
        _poooServerRef);
  }


  private static RequestStoreDatabaseIdInboundHandler _busiruharRequestStoreDatabaseIdInboundHandler(
      Database _dDatabase, ServerRef _poooServerRef) {
    return new RequestStoreDatabaseIdInboundHandler(_dDatabase, _poooServerRef);
  }


  public static AdapterChannelHandlerServiceMGDBImpl bapsehdAdapterChannelHandlerServiceMGDBImpl(
      DatabaseManager<?> _databaseManagerMdObject, DatabaseStateService _databaseStateService,
      DependencyResolver _dependencyResolver, FileSystemAbstraction _fFileSystemAbstraction,
      int largest, LogProvider _logProvider,
      ClusterTxConfiguratorApproach _sspClusterTxConfiguratorApproach) {
    return new AdapterChannelHandlerServiceMGDBImpl(_databaseManagerMdObject, _databaseStateService,
        _dependencyResolver, _fFileSystemAbstraction, largest,
        _logProvider,
        _sspClusterTxConfiguratorApproach);
  }


  public static AdapterChannelHandlerServiceMGDBImpl causvhnAdapterChannelHandlerServiceMGDBImpl(
      DatabaseManager<?> _databaseManagerMdObject, DatabaseStateService _databaseStateService,
      DependencyResolver _dependencyResolver, FileSystemAbstraction _fFileSystemAbstraction,
      int largest, LogProvider _logProvider) {
    return new AdapterChannelHandlerServiceMGDBImpl(_databaseManagerMdObject, _databaseStateService,
        _dependencyResolver, _fFileSystemAbstraction, largest,
        _logProvider, () ->
    {
      return TxFlowType.TFT_UNLMT;
    });
  }


  private RequestStoreResourceInboundHandler _busfrethlRequestStoreResourceInboundHandler(
      Database _dDatabase, ServerRef _poooServerRef) {
    return new RequestStoreResourceInboundHandler(_dDatabase, this.fFileSystemAbstraction,
        _poooServerRef,
        new StoreResourceSyncProcessor(this.largest));
  }


  private StoreSyncRequestSimpleChannelInboundHandler _buslnruharStoreSyncRequestSimpleChannelInboundHandler(
      Database _dDatabase, ServerRef _poooServerRef) {
    return new StoreSyncRequestSimpleChannelInboundHandler(_dDatabase, this.fFileSystemAbstraction,
        this.largest,
        new StoreSyncResourceServiceManager(_dDatabase), _poooServerRef);
  }


  private TransactionSyncSimpleChannelInboundHandler _butplrehnTransactionSyncSimpleChannelInboundHandler(
      Database _dDatabase, ServerRef _poooServerRef) {
    return TransactionSyncSimpleChannelInboundHandler.froTransactionSyncSimpleChannelInboundHandler(
        _dDatabase, _poooServerRef,
        this.supplierPsstTxFlowType.get());
  }

  @Override
  public ChannelHandler gealdbidChannelHandler(ServerRef _poooServerRef) {
    return _bugaldbidruharRequestAllGdbIdsInboundHandler(this.databaseManagerMdObject,
        _poooServerRef);
  }

  @Override
  public ChannelHandler gedteirqheChannelHandler(ServerRef _poooServerRef) {
    return new RequestGdbIdInboundHandler(this.databaseManagerMdObject, _poooServerRef);
  }

  @Override
  public ChannelHandler geioChannelHandler(ServerRef _poooServerRef) {
    return _buiharRequestMetaInboundHandler(this.databaseManagerMdObject, this.databaseStateService,
        _poooServerRef);
  }

  @Override
  public ChannelHandler gematChannelHandler(ServerRef _pscServerRef) {
    return new RequestAuthMetaInboundHandler(this.databaseManagerMdObject, this.dependencyResolver,
        _pscServerRef);
  }

  @Override
  public ChannelHandler gesoflruharChannelHandler(ServerRef _poooServerRef) {
    return new SimpleChannelInboundHandlerRequestImpl<>(RequestStoreResource.class,
        this.databaseManagerMdObject, (db) ->
    {
      return this._busfrethlRequestStoreResourceInboundHandler(db, _poooServerRef);
    }, this.logProvider, _poooServerRef);
  }

  @Override
  public ChannelHandler gesoirshdChannelHandler(ServerRef _poooServerRef) {
    return new SimpleChannelInboundHandlerRequestImpl<>(
        RequestStoreDatabaseIdCatchupManagement.class, this.databaseManagerMdObject, (db) ->
    {
      return _busiruharRequestStoreDatabaseIdInboundHandler(db, _poooServerRef);
    }, this.logProvider, _poooServerRef);
  }

  @Override
  public ChannelHandler snhhnChannelHandler(ServerRef _poooServerRef) {
    return new SimpleChannelInboundHandlerRequestImpl<>(RequestSnapshotData.class,
        this.databaseManagerMdObject, (db) ->
    {
      return _bucsnorurethlRequestSnapshotDataInboundHandler(db, _poooServerRef);
    }, this.logProvider, _poooServerRef);
  }

  @Override
  public ChannelHandler stlnruharChannelHandler(ServerRef _poooServerRef) {
    return new SimpleChannelInboundHandlerRequestImpl<>(StoreSyncRequest.class,
        this.databaseManagerMdObject, (db) ->
    {
      return this._buslnruharStoreSyncRequestSimpleChannelInboundHandler(db, _poooServerRef);
    }, this.logProvider, _poooServerRef);
  }

  @Override
  public ChannelHandler txplrehnChannelHandler(ServerRef _poooServerRef) {
    return new SimpleChannelInboundHandlerRequestImpl<>(RequestTransactionSync.class,
        this.databaseManagerMdObject, (db) ->
    {
      return this._butplrehnTransactionSyncSimpleChannelInboundHandler(db, _poooServerRef);
    }, this.logProvider, _poooServerRef);
  }
}
