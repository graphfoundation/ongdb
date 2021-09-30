package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupClusteredGdbManageService;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbFailedToStopException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.GdbStoreSyncCrlException;
import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreSyncFacade;
import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachException;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager;
import io.github.onograph.cluster.raft.share.meta.pit.NodeNotFoundException;
import io.github.onograph.cluster.raft.shared.ClusterGdbSeedValidator;
import io.github.onograph.cluster.raft.utils.RemoteStoreVerifier;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.DbmsManagerClusterImpl;
import io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.database.DatabaseStartAbortedException;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.internal.helpers.TimeoutStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StoreId;


class ReadReplicateIntegrator {


  private final CatchupClusteredGdbManageService catchupClusteredGdbManageService;


  private final ReadReplicaGdbWrapperEnvironment cdReadReplicaGdbWrapperEnvironment;


  private final ClusterStructureService clusterStructureService;


  private final Log dbgLog;


  private final DatabaseStartupControllerAbortableImpl dsaDatabaseStartupControllerAbortableImpl;


  private final SystemGraphDbmsModelClusterImpl mdsSystemGraphDbmsModelClusterImpl;


  private final DbmsManagerClusterImpl oiDbmsManagerClusterImpl;


  private final ServerId sdServerId;


  private final TimeoutStrategy srsTimeoutStrategy;


  private final NamedServiceApproachManager ssNamedServiceApproachManager;


  private final Log uLog;


  ReadReplicateIntegrator(
      DatabaseStartupControllerAbortableImpl _asdDatabaseStartupControllerAbortableImpl,
      CatchupClusteredGdbManageService catchupClusteredGdbManageService,
      ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      ClusterStructureService clusterStructureService, LogProvider _dbgLogProvider,
      SystemGraphDbmsModelClusterImpl _mdsSystemGraphDbmsModelClusterImpl,
      DbmsManagerClusterImpl _oiDbmsManagerClusterImpl, TimeoutStrategy _srsTimeoutStrategy,
      NamedServiceApproachManager _ssNamedServiceApproachManager, LogProvider _uLogProvider) {
    this.cdReadReplicaGdbWrapperEnvironment = _cdReadReplicaGdbWrapperEnvironment;
    this.ssNamedServiceApproachManager = _ssNamedServiceApproachManager;
    this.dsaDatabaseStartupControllerAbortableImpl = _asdDatabaseStartupControllerAbortableImpl;
    this.srsTimeoutStrategy = _srsTimeoutStrategy;
    this.dbgLog = _dbgLogProvider.getLog(this.getClass());
    this.uLog = _uLogProvider.getLog(this.getClass());
    this.clusterStructureService = clusterStructureService;
    this.oiDbmsManagerClusterImpl = _oiDbmsManagerClusterImpl;
    this.mdsSystemGraphDbmsModelClusterImpl = _mdsSystemGraphDbmsModelClusterImpl;
    this.catchupClusteredGdbManageService = catchupClusteredGdbManageService;
    this.sdServerId = this._saredstseServerId();
  }


  private void _awireyForTi(Timeout _pwrsTimeout) throws InterruptedException {
    Thread.sleep(_pwrsTimeout.getMillis());
    _pwrsTimeout.increment();
  }


  private Collection<ServerId> _geusmseCollection(
      ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment) {
    try {
      return this.ssNamedServiceApproachManager.beupasvfodaCollection(
          _cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId());
    } catch (

        NamedServiceApproachException _namedServiceApproachException) {

      return List.of();
    }
  }


  private boolean _isAlecttg() throws DatabaseStartAbortedException {

    NamedDatabaseId _namedDatabaseId = this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId();
    if (this.sdServerId != null) {
      ClusterGdbSeedValidator.alcnwiForSeNaCl(this.clusterStructureService, _namedDatabaseId,
          this.sdServerId);
    }

    if (this.dsaDatabaseStartupControllerAbortableImpl.shouldAbort(_namedDatabaseId)) {
      throw new DatabaseStartAbortedException(_namedDatabaseId);
    } else {
      return true;
    }
  }


  private boolean _isDaaim() {

    DatabaseId _rfsdDatabaseId = this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId()
        .databaseId();

    Optional<DatabaseId> _optionalIdfsDatabaseId = this.cdReadReplicaGdbWrapperEnvironment.redasifrdsOptional();
    return (Boolean) _optionalIdfsDatabaseId.map((databaseId) ->
    {
      return databaseId.equals(_rfsdDatabaseId);
    }).orElse(false);
  }


  private boolean _isTrsnwhseForSe(ServerId _suServerId) {
    try {

      this._systwrForReSe(this.cdReadReplicaGdbWrapperEnvironment, _suServerId);
      return true;
    } catch (

        NodeNotFoundException _nodeNotFoundException) {

      return false;
    } catch (

        GdbStoreSyncCrlException _gdbStoreSyncCrlException) {

      return false;
    } catch (

        GdbStoreException _gdbStoreException) {

      return false;
    } catch (

        IOException | GdbFailedToStopException _exception) {

      return false;
    }
  }


  private void _relesoForSt(StoreSyncFacade _pcsStoreSyncFacade)
      throws IOException, GdbStoreException, GdbFailedToStopException {

    this.cdReadReplicaGdbWrapperEnvironment.dee();

    io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl _poieSocketAddressServiceLocatorImpl =
        new io.github.onograph.cluster.raft.module.cuprot.SocketAddressService.SocketAddressServiceLocatorImpl(
            this.clusterStructureService,
            this.ssNamedServiceApproachManager);
    _pcsStoreSyncFacade.recwhsefForSo(_poieSocketAddressServiceLocatorImpl);


  }


  private ServerId _saredstseServerId() {

    NamedDatabaseId _namedDatabaseId = this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId();
    return _namedDatabaseId.isSystemDatabase() ? null
        : this.mdsSystemGraphDbmsModelClusterImpl.densrOptional(_namedDatabaseId).orElse(null);
  }


  private void _sycepsrForSt(StoreSyncFacade _pcsStoreSyncFacade)
      throws IOException, GdbStoreException, GdbFailedToStopException {

    this._relesoForSt(_pcsStoreSyncFacade);
  }


  private void _syexnsrForReStSt(
      ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      StoreSyncFacade _pcsStoreSyncFacade, StoreId _rmtStoreId)
      throws IOException, GdbStoreException, GdbFailedToStopException {

    boolean _isMisral = RemoteStoreVerifier
        .isVaretuetsofoForStStSt(_cdReadReplicaGdbWrapperEnvironment.stridStoreId(), _rmtStoreId,
            _cdReadReplicaGdbWrapperEnvironment.getKreDatabase().getStorageEngineFactory());

    boolean _isDim = this._isDaaim();
    if (_isMisral && _isDim) {

    } else if (this.sdServerId != null) {

      this._relesoForSt(_pcsStoreSyncFacade);
    } else {
      if (!_isMisral) {

        throw new IllegalStateException("*** Error: f965a60d-a62b-42bc-b3c6-36d15f82ecf6");
      }


    }
  }


  private void _systwrForReSe(ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      ServerId _ssServerId)
      throws IOException, GdbStoreSyncCrlException, GdbStoreException, GdbFailedToStopException, CatchupNodeNotFoundException {

    StoreSyncFacade _pcsStoreSyncFacade =
        this.catchupClusteredGdbManageService.stcprsStoreSyncFacade(
            _cdReadReplicaGdbWrapperEnvironment.stdocnStoreSyncEnvironment());

    SocketAddress _asSocketAddress = this.clusterStructureService.lopchadSocketAddress(_ssServerId);

    StoreId _rmtStoreId = _pcsStoreSyncFacade.gesridStoreId(_asSocketAddress);
    if (_cdReadReplicaGdbWrapperEnvironment.isEmy()) {
      this._sycepsrForSt(_pcsStoreSyncFacade);
    } else {
      this._syexnsrForReStSt(_cdReadReplicaGdbWrapperEnvironment, _pcsStoreSyncFacade, _rmtStoreId);
    }
  }


  public void pefm() throws Exception {

    io.github.onograph.dbms.DbmsManagerClusterImpl.IntegrationManager _hbIntegrationManager =
        this.oiDbmsManagerClusterImpl.botrDbmsManagerClusterImplIntegrationManager(
            this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId());

    try {

      Timeout _pwrsTimeout = this.srsTimeoutStrategy.newTimeout();

      while (this._isAlecttg()) {

        Iterator _iterator = this._geusmseCollection(this.cdReadReplicaGdbWrapperEnvironment)
            .iterator();

        while (_iterator.hasNext()) {

          ServerId _serverId = (ServerId) _iterator.next();
          if (this._isTrsnwhseForSe(_serverId)) {
            return;
          }
        }

        this._awireyForTi(_pwrsTimeout);
      }
    } catch (

        InterruptedException _interruptedException) {
      Thread.currentThread().interrupt();

      throw new RuntimeException(_interruptedException);
    } catch (

        IllegalStateException _illegalStateException) {

      throw new RuntimeException(_illegalStateException);
    } catch (

        DatabaseStartAbortedException _databaseStartAbortedException) {
      throw _databaseStartAbortedException;
    } catch (

        Exception _exception) {

      throw new RuntimeException(_exception);
    } finally {
      this.dsaDatabaseStartupControllerAbortableImpl.strdForNa(
          this.cdReadReplicaGdbWrapperEnvironment.nadaiNamedDatabaseId());
      _hbIntegrationManager.reee();
    }
  }
}
