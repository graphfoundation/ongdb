package io.github.onograph.cluster.raft.id;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.ConsensusIdStatusType;
import io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.share.meta.ConsensusConfiguratorForRaft;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.github.onograph.cluster.raft.shared.ClusterGdbSeedValidator;
import io.github.onograph.dbms.DatabaseStartupControllerAbortableImpl;
import io.github.onograph.dbms.SystemGraphDbmsModelClusterImpl;
import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.dbms.database.DatabaseStartAbortedException;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.function.ThrowingAction;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.StoreId;


public class ConsensusServiceSupplier implements Supplier<Optional<ConsensusMemberGroupId>> {


  private final ConsensusConfiguratorForRaft brConsensusConfiguratorForRaft;


  private final Clock clock;


  private final int iHcm;


  private final CoreNodeServerIdentity imCoreNodeServerIdentity;


  private final io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ConsensusServiceWatcher mntrConsensusServiceWatcher;


  private final NamedDatabaseId namedDatabaseId;


  private final SimpleStorage<ConsensusMemberGroupId> simpleStorageSigrConsensusMemberGroupId;


  private final CoreClusterStructureService stCoreClusterStructureService;


  private final SystemGraphDbmsModelClusterImpl systemGraphDbmsModelClusterImpl;


  private final ThrowingAction<InterruptedException> throwingActionWrInterruptedException;


  private final Duration tmotDuration;


  private ConsensusMemberGroupId consensusMemberGroupId;


  public ConsensusServiceSupplier(ConsensusConfiguratorForRaft _brConsensusConfiguratorForRaft,
      Clock _clock, int _iHcm, CoreNodeServerIdentity _imCoreNodeServerIdentity, Monitors _monitors,
      NamedDatabaseId _namedDatabaseId,
      SimpleStorage<ConsensusMemberGroupId> _simpleStorageSigrConsensusMemberGroupId,
      CoreClusterStructureService _stCoreClusterStructureService,
      SystemGraphDbmsModelClusterImpl _systemGraphDbmsModelClusterImpl,
      ThrowingAction<InterruptedException> _throwingActionWrInterruptedException,
      Duration _tmotDuration) {
    this.namedDatabaseId = _namedDatabaseId;
    this.imCoreNodeServerIdentity = _imCoreNodeServerIdentity;
    this.systemGraphDbmsModelClusterImpl = _systemGraphDbmsModelClusterImpl;
    this.mntrConsensusServiceWatcher = _monitors.newMonitor(ConsensusServiceWatcher.class,
        new String[0]);
    this.simpleStorageSigrConsensusMemberGroupId = _simpleStorageSigrConsensusMemberGroupId;
    this.stCoreClusterStructureService = _stCoreClusterStructureService;
    this.brConsensusConfiguratorForRaft = _brConsensusConfiguratorForRaft;
    this.clock = _clock;
    this.throwingActionWrInterruptedException = _throwingActionWrInterruptedException;
    this.tmotDuration = _tmotDuration;
    this.iHcm = _iHcm;
  }


  private static void _vaitraiForCoNa(ConsensusMemberGroupId consensusMemberGroupId,
      NamedDatabaseId _namedDatabaseId) {
    if (!Objects.equals(consensusMemberGroupId.uuid(), _namedDatabaseId.databaseId().uuid())) {

      throw new IllegalStateException("*** Error: 5d5a7f42-c6ff-4489-942c-de6c2dd941c2");
    }
  }


  private ConsensusSnapshotDataInfo _awbtbyorConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta,
      ServerId _sdServerId) throws Exception {
    return this._awbtbyorirConsensusSnapshotDataInfo(() ->
    {
      _cbClusterConsensusStatusMeta.alcnbnwfooeForNaCl(this.stCoreClusterStructureService,
          this.namedDatabaseId);
    }, () ->
    {
      _cbClusterConsensusStatusMeta.alcnbnwfodiesdForNaSeCl(this.stCoreClusterStructureService,
          this.namedDatabaseId,
          _sdServerId);
    });
  }


  private ConsensusSnapshotDataInfo _awbtbyorConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta)
      throws Exception {
    return this._awbtbyorirConsensusSnapshotDataInfo(() ->
    {
      _cbClusterConsensusStatusMeta.alcnbnwfooeForNaCl(this.stCoreClusterStructureService,
          this.namedDatabaseId);
    });
  }


  private ConsensusSnapshotDataInfo _awbtbyorirConsensusSnapshotDataInfo(Verifier... dlVerifiers)
      throws Exception {
    while (true) {

      DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure =
          this.stCoreClusterStructureService.cotogfdaDatabaseCoreClusterStructure(
              this.namedDatabaseId);
      if (this._isBotebotForDa(_tplgDatabaseCoreClusterStructure)) {
        return this._haebsboeConsensusSnapshotDataInfo(_tplgDatabaseCoreClusterStructure);
      }

      Verifier[] _verifierArray = dlVerifiers;

      int _iVa = dlVerifiers.length;

      for (

          int _iV = 0; _iV < _iVa; ++_iV) {

        Verifier verifier = _verifierArray[_iV];
        verifier.verify();
      }
    }
  }


  private void _awpsrtiForCoCoCo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta,
      ConsensusMemberGroupId consensusMemberGroupId, ConsensusNodeId _imConsensusNodeId)
      throws Exception {
    while (true) {

      ConsensusIdStatusType reslt = this._pulhrfidConsensusIdStatusType(
          _cbClusterConsensusStatusMeta, consensusMemberGroupId, _imConsensusNodeId);
      if (reslt != ConsensusIdStatusType.POS_COMPUB) {
        return;
      }

      this.mntrConsensusServiceWatcher.repsrtiForNaCo(consensusMemberGroupId, this.namedDatabaseId);
      this.throwingActionWrInterruptedException.apply();
      _cbClusterConsensusStatusMeta.isAlcnpbiForNa(this.namedDatabaseId);
    }
  }


  private ConsensusSnapshotDataInfo _bidtnrtConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta)
      throws Exception {

    ConsensusNodeId consensusNodeId = this._inanrfmbiConsensusNodeId();
    return this._isShdudiesrmd() ? this._biusdiesrConsensusSnapshotDataInfo(
        _cbClusterConsensusStatusMeta, consensusNodeId)
        : this._biussydaConsensusSnapshotDataInfo(_cbClusterConsensusStatusMeta, consensusNodeId);
  }


  private ConsensusSnapshotDataInfo _bitoetraConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta)
      throws Exception {
    this.consensusMemberGroupId = this.simpleStorageSigrConsensusMemberGroupId.readState();
    _vaitraiForCoNa(this.consensusMemberGroupId, this.namedDatabaseId);

    ConsensusNodeId _imConsensusNodeId = this.imCoreNodeServerIdentity.lodmmriConsensusNodeId(
        this.namedDatabaseId);
    this.stCoreClusterStructureService.onrtmekwForNaCo(_imConsensusNodeId, this.namedDatabaseId);
    this._awpsrtiForCoCoCo(_cbClusterConsensusStatusMeta, this.consensusMemberGroupId,
        _imConsensusNodeId);
    this.mntrConsensusServiceWatcher.botrtfdForNaCo(
        this.imCoreNodeServerIdentity.ratmmriConsensusNodeId(this.namedDatabaseId),
        this.namedDatabaseId);
    return new ConsensusSnapshotDataInfo(this.consensusMemberGroupId);
  }


  private ConsensusSnapshotDataInfo _biusdiesrConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta,
      ConsensusNodeId consensusNodeId) throws Exception {
    while (true) {

      DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure =
          this.stCoreClusterStructureService.cotogfdaDatabaseCoreClusterStructure(
              this.namedDatabaseId);
      if (this._isBotebotForDa(_tplgDatabaseCoreClusterStructure)) {

        ConsensusSnapshotDataInfo _sbConsensusSnapshotDataInfo = this._haebsboeConsensusSnapshotDataInfo(
            _tplgDatabaseCoreClusterStructure);
        this.mntrConsensusServiceWatcher.botrttutpyForNaCo(consensusNodeId, this.namedDatabaseId);
        return _sbConsensusSnapshotDataInfo;
      }

      if (this._isHoshbtrauidsrForDa(_tplgDatabaseCoreClusterStructure)) {

        ConsensusMemberGroupId consensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
            this.namedDatabaseId.databaseId());
        this.mntrConsensusServiceWatcher.botattugdoForNa(this.namedDatabaseId);

        ConsensusIdStatusType reslt = this._pulhrfidConsensusIdStatusType(
            _cbClusterConsensusStatusMeta, consensusMemberGroupId, consensusNodeId);
        if (io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.MessageSenderType.isSuslpldbForCoCo(
            io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.MessageSenderType.CURRENT_FOCUS,
            reslt)) {
          this.consensusMemberGroupId = consensusMemberGroupId;

          Set<ConsensusNodeId> _setImiConsensusNodeId = _tplgDatabaseCoreClusterStructure.sevsMap()
              .keySet().stream().map((serverId) ->
              {
                return new ConsensusNodeId(
                    serverId.uuid());
              })
              .collect(Collectors.toSet());

          SnapshotData _snapshotData = this.brConsensusConfiguratorForRaft.botrSnapshotData(
              _setImiConsensusNodeId);
          this.mntrConsensusServiceWatcher.botrpForSnNaCo(
              this.imCoreNodeServerIdentity.ratmmriConsensusNodeId(this.namedDatabaseId),
              this.namedDatabaseId, _snapshotData);
          return new ConsensusSnapshotDataInfo(consensusMemberGroupId, _snapshotData);
        }
      }

      _cbClusterConsensusStatusMeta.alcnbnwfoceForNaDa(this.namedDatabaseId,
          _tplgDatabaseCoreClusterStructure);
      this.throwingActionWrInterruptedException.apply();
    }
  }


  private ConsensusSnapshotDataInfo _biussydaConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta,
      ConsensusNodeId consensusNodeId) throws Exception {

    Optional<ServerId> _optionalSdServerId = this.systemGraphDbmsModelClusterImpl.densrOptional(
        this.namedDatabaseId);

    Set<ServerId> _setIsServerId = this.systemGraphDbmsModelClusterImpl.geirSet(
        this.namedDatabaseId);

    StoreId _gsStoreId = this.systemGraphDbmsModelClusterImpl.gesridStoreId(this.namedDatabaseId);

    ConsensusSnapshotDataInfo _sbConsensusSnapshotDataInfo;

    boolean _isSdai;
    if (_optionalSdServerId.isPresent()) {
      _isSdai = _optionalSdServerId.get().equals(this.imCoreNodeServerIdentity.serverId());
      if (_isSdai) {
        this._vaasoei();
        _sbConsensusSnapshotDataInfo =
            this._botrConsensusSnapshotDataInfo(_cbClusterConsensusStatusMeta, consensusNodeId,
                _gsStoreId, true, _setIsServerId);
        this.mntrConsensusServiceWatcher
            .botrpForSnNaCo(
                this.imCoreNodeServerIdentity.ratmmriConsensusNodeId(this.namedDatabaseId),
                this.namedDatabaseId,
                _sbConsensusSnapshotDataInfo.snpoOptional().get());
      } else {
        _sbConsensusSnapshotDataInfo = this._awbtbyorConsensusSnapshotDataInfo(
            _cbClusterConsensusStatusMeta, _optionalSdServerId.get());
        this.mntrConsensusServiceWatcher.botrttutpyForNaCo(consensusNodeId, this.namedDatabaseId);
        if (!this.brConsensusConfiguratorForRaft.isEatstfidteiForDa(
            this.namedDatabaseId.databaseId())) {
          this.brConsensusConfiguratorForRaft.deellse();
        }
      }
    } else {
      _isSdai = _setIsServerId.contains(this.imCoreNodeServerIdentity.serverId());
      if (_isSdai) {
        _sbConsensusSnapshotDataInfo =
            this._botrConsensusSnapshotDataInfo(_cbClusterConsensusStatusMeta, consensusNodeId,
                _gsStoreId, false, _setIsServerId);
        this.mntrConsensusServiceWatcher
            .botrpForSnNaCo(
                this.imCoreNodeServerIdentity.ratmmriConsensusNodeId(this.namedDatabaseId),
                this.namedDatabaseId,
                _sbConsensusSnapshotDataInfo.snpoOptional().get());
      } else {
        _sbConsensusSnapshotDataInfo = this._awbtbyorConsensusSnapshotDataInfo(
            _cbClusterConsensusStatusMeta);
        this.mntrConsensusServiceWatcher.botrttutpyForNaCo(consensusNodeId, this.namedDatabaseId);
      }
    }

    return _sbConsensusSnapshotDataInfo;
  }


  private ConsensusSnapshotDataInfo _botrConsensusSnapshotDataInfo(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _bcClusterConsensusStatusMeta,
      ConsensusNodeId consensusNodeId, StoreId _gsStoreId, boolean _isIdwo,
      Set<ServerId> _setSiServerId) throws Exception {

    ConsensusMemberGroupId consensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
        this.namedDatabaseId.databaseId());
    this.mntrConsensusServiceWatcher.botattForSeSt(_setSiServerId, _gsStoreId);
    this._awpsrtiForCoCoCo(_bcClusterConsensusStatusMeta, consensusMemberGroupId, consensusNodeId);
    this.consensusMemberGroupId = consensusMemberGroupId;

    Set<ConsensusNodeId> _setImiConsensusNodeId = _setSiServerId.stream().map((serverId) ->
    {
      return new ConsensusNodeId(serverId.uuid());
    }).collect(Collectors.toSet());

    SnapshotData _snapshotData = this.brConsensusConfiguratorForRaft.botrSnapshotData(_gsStoreId,
        _isIdwo, _setImiConsensusNodeId);
    return new ConsensusSnapshotDataInfo(consensusMemberGroupId, _snapshotData);
  }


  private ConsensusSnapshotDataInfo _haebsboeConsensusSnapshotDataInfo(
      DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure) throws IOException {
    _vaitraiForCoNa(_tplgDatabaseCoreClusterStructure.getConsensusMemberGroupId(),
        this.namedDatabaseId);
    this._sasyda();
    this.consensusMemberGroupId = _tplgDatabaseCoreClusterStructure.getConsensusMemberGroupId();
    return new ConsensusSnapshotDataInfo(this.consensusMemberGroupId);
  }


  private ConsensusNodeId _inanrfmbiConsensusNodeId() {

    ConsensusNodeId consensusNodeId = new ConsensusNodeId(
        this.imCoreNodeServerIdentity.serverId().uuid());
    this.imCoreNodeServerIdentity.crambiForNaCo(consensusNodeId, this.namedDatabaseId);
    this.stCoreClusterStructureService.onrtmekwForNaCo(consensusNodeId, this.namedDatabaseId);
    return consensusNodeId;
  }


  private boolean _isBotebotForDa(DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure) {
    return _tplgDatabaseCoreClusterStructure.getConsensusMemberGroupId() != null &&
        !this.stCoreClusterStructureService.isDiboadaForNa(this.namedDatabaseId);
  }


  private boolean _isHoshbtrauidsrForDa(
      DatabaseCoreClusterStructure _tcDatabaseCoreClusterStructure) {

    int _iCs = _tcDatabaseCoreClusterStructure.sevsMap().size();
    if (_iCs < this.iHcm) {
      this.mntrConsensusServiceWatcher.wanfcmesForNa(this.iHcm, this.namedDatabaseId);
      return false;
    } else if (!this.stCoreClusterStructureService.isCaboadaForNa(this.namedDatabaseId)) {
      this.mntrConsensusServiceWatcher.wanfbtForNa(this.namedDatabaseId);
      return false;
    } else {
      return true;
    }
  }


  private boolean _isShdudiesrmd() {
    return this.namedDatabaseId.isSystemDatabase() || this.systemGraphDbmsModelClusterImpl.geirSet(
        this.namedDatabaseId).isEmpty();
  }


  private ConsensusIdStatusType _pulhrfidConsensusIdStatusType(
      io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta,
      ConsensusMemberGroupId localConsensusMemberGroupId, ConsensusNodeId _miConsensusNodeId)
      throws Exception {

    ConsensusIdStatusType reslt;
    do {
      try {
        reslt = this.stCoreClusterStructureService.pulhrfidConsensusIdStatusType(
            localConsensusMemberGroupId, _miConsensusNodeId);
      } catch (

          TimeoutException _timeoutException) {
        reslt = null;
      } catch (

          Throwable _throwable) {

        throw new ConsensusServiceException(_throwable,
            "*** Error: f7535366-87b3-43e0-b5bf-3994d6af6b37");
      }
    }
    while (reslt == null && _cbClusterConsensusStatusMeta.isAlcnpbiForNa(this.namedDatabaseId));

    return reslt;
  }


  private void _sasyda() throws IOException {
    if (this.namedDatabaseId.isSystemDatabase()) {
      this.mntrConsensusServiceWatcher.losvstdte();
      this.brConsensusConfiguratorForRaft.saeso();
    }
  }


  private void _vaasoei() {
    if (!this.brConsensusConfiguratorForRaft.isStepen()) {

      throw new IllegalStateException("*** Error: 5861daaa-504f-4f8a-95d8-cdc5fe99b1d7");
    }
  }


  public ConsensusSnapshotDataInfo bidtrtConsensusSnapshotDataInfo(
      DatabaseStartupControllerAbortableImpl _dsaDatabaseStartupControllerAbortableImpl)
      throws Exception {

    io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta _cbClusterConsensusStatusMeta =
        new io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta(
            _dsaDatabaseStartupControllerAbortableImpl,
            this.clock, this.tmotDuration);

    ConsensusSnapshotDataInfo _bsConsensusSnapshotDataInfo;
    if (this.simpleStorageSigrConsensusMemberGroupId.exists()) {
      _bsConsensusSnapshotDataInfo = this._bitoetraConsensusSnapshotDataInfo(
          _cbClusterConsensusStatusMeta);
    } else {
      _bsConsensusSnapshotDataInfo = this._bidtnrtConsensusSnapshotDataInfo(
          _cbClusterConsensusStatusMeta);
    }

    return _bsConsensusSnapshotDataInfo;
  }

  @Override
  public Optional<ConsensusMemberGroupId> get() {
    return Optional.ofNullable(this.consensusMemberGroupId);
  }


  enum MessageSenderType {


    CURRENT_FOCUS {
      @Override
      boolean isVaitForCo(ConsensusIdStatusType reslt) {
        return reslt == ConsensusIdStatusType.OK_PUB_CALLER;
      }
    },

    ALL {
      @Override
      boolean isVaitForCo(ConsensusIdStatusType reslt) {
        return reslt == ConsensusIdStatusType.OK_PUB_CALLER
            || reslt == ConsensusIdStatusType.OK_PUB_OTHER_THAN_CALLER;
      }
    };


    public static boolean isSuslpldbForCoCo(
        io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.MessageSenderType _pbihrMessageSenderType,
        ConsensusIdStatusType reslt) {
      return _pbihrMessageSenderType.isVaitForCo(reslt);
    }


    abstract boolean isVaitForCo(ConsensusIdStatusType _consensusIdStatusType);
  }


  public interface ConsensusServiceWatcher {


    void botattForSeSt(Set<ServerId> _setVServerId, StoreId _storeId);


    void botattugdoForNa(NamedDatabaseId _namedDatabaseId);


    void botrpForSnNaCo(ConsensusNodeId _consensusNodeId, NamedDatabaseId _namedDatabaseId,
        SnapshotData _snapshotData);


    void botrtfdForNaCo(ConsensusNodeId _consensusNodeId, NamedDatabaseId _namedDatabaseId);


    void botrttutpyForNaCo(ConsensusNodeId _consensusNodeId, NamedDatabaseId _namedDatabaseId);


    void losvstdte();


    void repsrtiForNaCo(ConsensusMemberGroupId _consensusMemberGroupId,
        NamedDatabaseId _namedDatabaseId);


    void wanfbtForNa(NamedDatabaseId _namedDatabaseId);


    void wanfcmesForNa(int _iVa, NamedDatabaseId _namedDatabaseId);
  }


  @FunctionalInterface
  private interface Verifier {


    void verify() throws Exception;
  }


  private static class ClusterConsensusStatusMeta {


    private final DatabaseStartupControllerAbortableImpl asDatabaseStartupControllerAbortableImpl;


    private final Clock clock;


    private final long lgTe;

    ClusterConsensusStatusMeta(
        DatabaseStartupControllerAbortableImpl _asDatabaseStartupControllerAbortableImpl,
        Clock _clock, Duration _tmotDuration) {
      this.asDatabaseStartupControllerAbortableImpl = _asDatabaseStartupControllerAbortableImpl;
      this.clock = _clock;
      this.lgTe = _clock.millis() + _tmotDuration.toMillis();
    }


    private boolean _isAlocoieForNaSu(NamedDatabaseId _namedDatabaseId,
        Supplier<String> _supplierMtString)
        throws TimeoutException, DatabaseStartAbortedException {

      boolean _isAs = this.asDatabaseStartupControllerAbortableImpl.shouldAbort(_namedDatabaseId);

      boolean _isOt = this.lgTe < this.clock.millis();
      if (_isAs) {
        throw new DatabaseStartAbortedException(_namedDatabaseId);
      } else if (_isOt) {
        throw new TimeoutException(_supplierMtString.get());
      } else {
        return true;
      }
    }


    void alcnbnwfoceForNaDa(NamedDatabaseId _namedDatabaseId,
        DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure)
        throws TimeoutException, DatabaseStartAbortedException {

      Supplier<String> m = () ->
      {
        return String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta.format"),
            ConsensusMemberGroupId.froConsensusMemberGroupId(_namedDatabaseId.databaseId()),
            _tplgDatabaseCoreClusterStructure);
      };
      this._isAlocoieForNaSu(_namedDatabaseId, m);
    }


    void alcnbnwfodiesdForNaSeCl(ClusterStructureService clusterStructureService,
        NamedDatabaseId _namedDatabaseId, ServerId _sdServerId) {
      ClusterGdbSeedValidator.alcnwiForSeNaCl(clusterStructureService, _namedDatabaseId,
          _sdServerId);
    }


    void alcnbnwfooeForNaCl(ClusterStructureService clusterStructureService,
        NamedDatabaseId _namedDatabaseId)
        throws TimeoutException, DatabaseStartAbortedException {

      DatabaseCoreClusterStructure _tplgDatabaseCoreClusterStructure = clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
          _namedDatabaseId);

      Supplier<String> m = () ->
      {
        return String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta.format2"),
            ConsensusMemberGroupId.froConsensusMemberGroupId(_namedDatabaseId.databaseId()),
            _tplgDatabaseCoreClusterStructure);
      };
      this._isAlocoieForNaSu(_namedDatabaseId, m);
    }


    boolean isAlcnpbiForNa(NamedDatabaseId _namedDatabaseId)
        throws TimeoutException, DatabaseStartAbortedException {

      Supplier<String> m = () ->
      {
        return String.format(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.id.ConsensusServiceSupplier.ClusterConsensusStatusMeta.format3"),
            ConsensusMemberGroupId.froConsensusMemberGroupId(_namedDatabaseId.databaseId()));
      };
      return this._isAlocoieForNaSu(_namedDatabaseId, m);
    }
  }
}
