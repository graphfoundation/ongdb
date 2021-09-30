package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.SetupPreparerContainer;
import io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper;
import io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LeasableMeta;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.TransactionLogHeadWrapper;
import io.github.onograph.cluster.raft.share.meta.pit.ConsensusMembershipState;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.github.onograph.cluster.raft.share.sync.ReplicationSessionManagerMeta;
import io.github.onograph.cluster.raft.utils.GdbUtilWrapper;
import io.github.onograph.cluster.raft.utils.GdbUtilWrapperService;
import io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Clock;
import java.util.Collections;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.DatabasePageCache;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.TransactionLogWriter;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.lifecycle.Lifespan;
import org.neo4j.kernel.recovery.Recovery;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.MetadataProvider;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.storageengine.api.TransactionIdStore;


public class ConsensusConfiguratorForRaft {


  private static final long C1_IDX = 0L;


  private static final long C1_TER = 0L;


  private static final String CONS_BOTR_LT = io.github.onograph.TokenConstants.RAFT_BOOTSTRAP;


  private final StoreGdbEnvironmentWrapper cbStoreGdbEnvironmentWrapper;

  private final Clock clock;

  private final Config config;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final GdbUtilWrapperService fdtGdbUtilWrapperService;


  private final Log log;


  private final MemoryTracker memoryTracker;


  private final PageCache pageCache;


  private final PageCacheTracer pageCacheTracer;


  private final SetupManager sbSetupManager;


  private final StorageEngineFactory storageEngineFactory;


  public ConsensusConfiguratorForRaft(Clock _clock,
      StoreGdbEnvironmentWrapper _cbStoreGdbEnvironmentWrapper, Config _config,
      FileSystemAbstraction _fFileSystemAbstraction,
      GdbUtilWrapperService _fdtGdbUtilWrapperService, LogProvider _logProvider,
      MemoryTracker _memoryTracker, PageCache _pageCache, PageCacheTracer _pageCacheTracer,
      SetupManager _sbSetupManager, StorageEngineFactory _storageEngineFactory) {
    this.clock = _clock;
    this.cbStoreGdbEnvironmentWrapper = _cbStoreGdbEnvironmentWrapper;
    this.fdtGdbUtilWrapperService = _fdtGdbUtilWrapperService;
    this.pageCache = _pageCache;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.log = _logProvider.getLog(this.getClass());
    this.storageEngineFactory = _storageEngineFactory;
    this.config = _config;
    this.sbSetupManager = _sbSetupManager;
    this.pageCacheTracer = _pageCacheTracer;
    this.memoryTracker = _memoryTracker;
  }


  private void _botexnstdte() throws IOException {

    io.github.onograph.cluster.raft.share.SetupPreparerContainer.SetupPreparerContainerFSAImpl _brdSetupPreparerContainerFSAImpl =
        SetupPreparerContainer.clbeaafSetupPreparerContainerSetupPreparerContainerFSAImpl(
            this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout(),
            this.fFileSystemAbstraction);

    try {

      Path _pddtPath = _brdSetupPreparerContainerFSAImpl.getTeborpaPath()
          .resolve(io.github.onograph.TokenConstants.SYSTEM);
      this.fFileSystemAbstraction.copyRecursively(
          this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout().databaseDirectory(), _pddtPath);
      this.fFileSystemAbstraction.copyRecursively(
          this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout().getTransactionLogsDirectory(),
          _pddtPath);

      DatabaseLayout _tDatabaseLayout = this._inasutdasDatabaseLayout(true,
          _brdSetupPreparerContainerFSAImpl.getTeborpaPath());
      this.cbStoreGdbEnvironmentWrapper.relewtForPa(_tDatabaseLayout.databaseDirectory());
    } catch (

        Throwable _throwable) {
      if (_brdSetupPreparerContainerFSAImpl != null) {
        try {
          _brdSetupPreparerContainerFSAImpl.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_brdSetupPreparerContainerFSAImpl != null) {
      _brdSetupPreparerContainerFSAImpl.close();
    }
  }


  private SnapshotData _bucsnoSnapshotData(Set<ConsensusNodeId> _setMrConsensusNodeId) {

    ConsensusMembershipState consensusMembershipState = new ConsensusMembershipState(
        new MemberIndexWrapper(0L, _setMrConsensusNodeId));

    ReplicationSessionManagerMeta _stsReplicationSessionManagerMeta = new ReplicationSessionManagerMeta();

    SnapshotData _scSnapshotData = new SnapshotData(0L, 0L);
    _scSnapshotData.addForMeT(MetaWrapper.CONS_CND_STAX, consensusMembershipState);
    _scSnapshotData.addForMeT(MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META,
        _stsReplicationSessionManagerMeta);
    _scSnapshotData.addForMeT(MetaWrapper.META_WRAPPER_LES_LEASABLE_META,
        LeasableMeta.INTL_LES_STAX);
    return _scSnapshotData;
  }


  private void _crasrForStCu(CursorContext _cursorContext, StoreId _gsStoreId, boolean _isDsi)
      throws IOException {

    io.github.onograph.cluster.raft.share.SetupPreparerContainer.SetupPreparerContainerFSAImpl _drbSetupPreparerContainerFSAImpl =
        SetupPreparerContainer.clbeaafSetupPreparerContainerSetupPreparerContainerFSAImpl(
            this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout(),
            this.fFileSystemAbstraction);

    try {

      Log _log = this.log;

      NamedDatabaseId _namedDatabaseId = this.cbStoreGdbEnvironmentWrapper.getNamedDatabaseId();

      DatabaseLayout _bosrpDatabaseLayout = this._inasutdasDatabaseLayout(_isDsi,
          _drbSetupPreparerContainerFSAImpl.getTeborpaPath());
      if (_gsStoreId != null) {

        long _lgLv = this.storageEngineFactory.storeId(this.fFileSystemAbstraction,
                _bosrpDatabaseLayout, this.pageCache, _cursorContext)
            .getStoreVersion();

        StoreId _storeId = new StoreId(_gsStoreId.getCreationTime(), _gsStoreId.getRandomId(),
            _lgLv);
        this.storageEngineFactory.setStoreId(this.fFileSystemAbstraction, _bosrpDatabaseLayout,
            this.pageCache, _cursorContext, _storeId, -559063315L,
            0L);
      }

      this.cbStoreGdbEnvironmentWrapper.relewtForPa(_bosrpDatabaseLayout.databaseDirectory());
      this.cbStoreGdbEnvironmentWrapper.reetsols();
    } catch (

        Throwable _throwable) {
      if (_drbSetupPreparerContainerFSAImpl != null) {
        try {
          _drbSetupPreparerContainerFSAImpl.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_drbSetupPreparerContainerFSAImpl != null) {
      _drbSetupPreparerContainerFSAImpl.close();
    }
  }


  private void _enervotoForStCoMe(StoreGdbEnvironmentWrapper _cbStoreGdbEnvironmentWrapper,
      Config _config, MemoryTracker _memoryTracker)
      throws Exception {
    if (Recovery.isRecoveryRequired(this.fFileSystemAbstraction,
        _cbStoreGdbEnvironmentWrapper.getDatabaseLayout(), _config, _memoryTracker)) {

      String m = "Cannot bootstrap " + _cbStoreGdbEnvironmentWrapper.getNamedDatabaseId() +
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft.var");

      throw new IllegalStateException("*** Error: 7318c361-bbfe-42d4-8f44-38d1868c78b9");
    }
  }


  private DatabaseLayout _inasutdasDatabaseLayout(boolean _isSi, Path _prbPath) {

    GdbUtilWrapper _dtGdbUtilWrapper = this.fdtGdbUtilWrapperService.sttrdasGdbUtilWrapper(
        this.config, _isSi, _prbPath);

    DatabaseLayout _databaseLayout;
    try {
      if (_isSi) {
        SystemGraphDbmsModelClusterImpl.clceppeForGr(_dtGdbUtilWrapper.getGraphDatabaseAPI());
      }

      _databaseLayout = _dtGdbUtilWrapper.daadrrDatabaseLayout();
    } catch (

        Throwable _throwable) {
      if (_dtGdbUtilWrapper != null) {
        try {
          _dtGdbUtilWrapper.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_dtGdbUtilWrapper != null) {
      _dtGdbUtilWrapper.close();
    }

    return _databaseLayout;
  }


  private void _upetsolamtdaseForStCu(StoreGdbEnvironmentWrapper _cbStoreGdbEnvironmentWrapper,
      CursorContext _cursorContext, boolean _isIdwo)
      throws IOException {

    DatabaseLayout _databaseLayout = _cbStoreGdbEnvironmentWrapper.getDatabaseLayout();

    DatabasePageCache _databasePageCache = new DatabasePageCache(this.pageCache,
        IOController.DISABLED);

    try {

      StoreId _storeId = this.storageEngineFactory.storeId(this.fFileSystemAbstraction,
          _databaseLayout, this.pageCache, _cursorContext);

      TransactionIdStore _orTransactionIdStore =
          this.storageEngineFactory.readOnlyTransactionIdStore(this.fFileSystemAbstraction,
              _databaseLayout, _databasePageCache, _cursorContext);

      LogFiles _logFiles =
          LogFilesBuilder.activeFilesBuilder(_databaseLayout, this.fFileSystemAbstraction,
                  _databasePageCache).withConfig(this.config)
              .withStoreId(_storeId)
              .withLastCommittedTransactionIdSupplier(() ->
              {
                return _orTransactionIdStore.getLastClosedTransactionId() - 1L;
              })
              .withCommandReaderFactory(this.storageEngineFactory.commandReaderFactory()).build();

      Lifespan _inrdLifespan = new Lifespan(_logFiles);

      long _lgDti;

      LogPosition _cpLogPosition;
      try {

        LogFile _logFile = _logFiles.getLogFile();

        TransactionLogWriter _transactionLogWriter = _logFile.getTransactionLogWriter();

        long _lgItcl = _orTransactionIdStore.getLastCommittedTransactionId();

        PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation = new PhysicalTransactionRepresentation(
            Collections.emptyList());

        byte[] _htByteArray = TransactionLogHeadWrapper.enelinastha(-1L);
        _tPhysicalTransactionRepresentation.setHeader(_htByteArray, -1L, _lgItcl, -1L, -1,
            AuthSubject.AUTH_DISABLED);
        _lgDti = _lgItcl + 1L;
        _cpLogPosition = _transactionLogWriter.getCurrentPosition();
        _transactionLogWriter.append(_tPhysicalTransactionRepresentation, _lgDti, -559063315);
        _logFile.flush();
      } catch (

          Throwable _throwable) {
        try {
          _inrdLifespan.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _inrdLifespan.close();

      MetadataProvider _metadataProvider =
          this.storageEngineFactory.transactionMetaDataStore(this.fFileSystemAbstraction,
              _databaseLayout, this.config, _databasePageCache,
              PageCacheTracer.NULL);

      try {
        _metadataProvider.setLastCommittedAndClosedTransactionId(_lgDti, 0,
            System.currentTimeMillis(), _cpLogPosition.getByteOffset(),
            _cpLogPosition.getLogVersion(), _cursorContext);
        if (_isIdwo) {
          _metadataProvider.setDatabaseIdUuid(
              _cbStoreGdbEnvironmentWrapper.getNamedDatabaseId().databaseId().uuid(),
              _cursorContext);
        }
      } catch (

          Throwable _throwable3) {
        if (_metadataProvider != null) {
          try {
            _metadataProvider.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }
        }

        throw _throwable3;
      }

      if (_metadataProvider != null) {
        _metadataProvider.close();
      }
    } catch (

        Throwable _throwable5) {
      try {
        _databasePageCache.close();
      } catch (

          Throwable _throwable6) {
        _throwable5.addSuppressed(_throwable6);
      }

      throw _throwable5;
    }

    _databasePageCache.close();
  }


  public SnapshotData botrSnapshotData(Set<ConsensusNodeId> _setMrConsensusNodeId) {
    return this.botrSnapshotData(_setMrConsensusNodeId, null);
  }


  public SnapshotData botrSnapshotData(Set<ConsensusNodeId> _setMrConsensusNodeId,
      StoreId _storeId) {
    return this.botrSnapshotData(_storeId, false, _setMrConsensusNodeId);
  }


  public SnapshotData botrSnapshotData(StoreId _gsStoreId, boolean _isOwdi,
      Set<ConsensusNodeId> _setMrConsensusNodeId) {
    try {

      CursorContext _cursorContext =
          new CursorContext(this.pageCacheTracer.createPageCursorTracer(
              io.github.onograph.TokenConstants.RAFT_BOOTSTRAP));

      SnapshotData _snapshotData;
      try {

        Log _log = this.log;

        NamedDatabaseId _namedDatabaseId = this.cbStoreGdbEnvironmentWrapper.getNamedDatabaseId();

        if (this.isStepen()) {
          this._enervotoForStCoMe(this.cbStoreGdbEnvironmentWrapper, this.config,
              this.memoryTracker);
          if (this.cbStoreGdbEnvironmentWrapper.getNamedDatabaseId().isSystemDatabase()) {
            this._botexnstdte();
          }
        } else {
          this._crasrForStCu(_cursorContext, _gsStoreId,
              this.cbStoreGdbEnvironmentWrapper.getNamedDatabaseId().isSystemDatabase());
        }

        this._upetsolamtdaseForStCu(this.cbStoreGdbEnvironmentWrapper, _cursorContext, _isOwdi);

        SnapshotData _snapshotData2 = this._bucsnoSnapshotData(_setMrConsensusNodeId);
        _log = this.log;
        _namedDatabaseId = this.cbStoreGdbEnvironmentWrapper.getNamedDatabaseId();

        _snapshotData = _snapshotData2;
      } catch (

          Throwable _throwable) {
        try {
          _cursorContext.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _cursorContext.close();
      return _snapshotData;
    } catch (

        Exception _exception) {
      throw new EnvironmentSetupException(_exception,
          this.cbStoreGdbEnvironmentWrapper.getNamedDatabaseId());
    }
  }


  public void deellse() throws IOException {
    this.cbStoreGdbEnvironmentWrapper.deesefs();
  }


  public boolean isEatstfidteiForDa(DatabaseId _databaseId) {

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.RAFT_BOOTSTRAP));

    boolean _isVar;
    try {

      DatabaseLayout _databaseLayout = this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout();
      _isVar = this.storageEngineFactory.databaseIdUuid(this.fFileSystemAbstraction,
              _databaseLayout, this.pageCache, _cursorContext).map((uuid) ->
          {
            return uuid.equals(
                _databaseId
                    .uuid());
          })
          .orElse(false);
    } catch (

        Throwable _throwable) {
      try {
        _cursorContext.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _cursorContext.close();
    return _isVar;
  }


  public boolean isStepen() {
    return this.storageEngineFactory.storageExists(this.fFileSystemAbstraction,
        this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout(), this.pageCache);
  }


  public void saeso() throws IOException {

    DatabaseLayout _databaseLayout = this.cbStoreGdbEnvironmentWrapper.getDatabaseLayout();
    this.sbSetupManager.savForDa(_databaseLayout);
  }
}
