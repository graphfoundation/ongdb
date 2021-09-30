package io.github.onograph.cluster.raft.share.meta.cm;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.state.SimpleFileStorage;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.util.Id;


public class ClusterMemberSyncer implements MetaUpgradeFlowAction {


  private final MemoryTracker memoryTracker;


  private final Neo4jLayout neo4jLayout;


  public ClusterMemberSyncer(MemoryTracker _memoryTracker, Neo4jLayout _neo4jLayout) {
    this.memoryTracker = _memoryTracker;
    this.neo4jLayout = _neo4jLayout;
  }


  private void _chorammidamnForUp(UpgradeMetaEnv _cUpgradeMetaEnv) {

    SimpleStorage<ServerId> _simpleStorageSisServerId = this._creseteSimpleStorage(
        _cUpgradeMetaEnv.getFFileSystemAbstraction());
    if (_simpleStorageSisServerId.exists()) {
      try {

        SimpleStorage<ConsensusNodeId> _simpleStorageSimnConsensusNodeId =
            _cUpgradeMetaEnv.getFsscClusterSimpleStorageFacade()
                .crermroSimpleStorage(io.github.onograph.TokenConstants.SYSTEM);
        if (_simpleStorageSimnConsensusNodeId.exists()) {
          return;
        }

        ServerId _serverId = _simpleStorageSisServerId.readState();
        if (_serverId == null) {

          throw new IllegalStateException("*** Error:  036dfac9-2382-49d3-ae95-be8202dd11cf");
        }

        ConsensusNodeId consensusNodeId = new ConsensusNodeId(_serverId.uuid());
        this._geanwmeifolmbiForCoUp(_cUpgradeMetaEnv, consensusNodeId);


      } catch (

          IOException _iOException) {

        throw new RuntimeException("*** Error:  5e34a8f4-efae-4f03-acce-701ef358312a",
            _iOException);
      }
    }
  }


  private SimpleStorage<ServerId> _creseteSimpleStorage(
      FileSystemAbstraction _fFileSystemAbstraction) {
    return new SimpleFileStorage(_fFileSystemAbstraction, this.neo4jLayout.serverIdFile(),
        Marshal.INSTANCE, this.memoryTracker);
  }


  private void _geanwmeifolmbiForCoUp(UpgradeMetaEnv _cUpgradeMetaEnv,
      ConsensusNodeId _imoConsensusNodeId) throws IOException {

    List<String> _listNdString = _cUpgradeMetaEnv.getLscClusterMetaTopologyInfo().alrtgosList();

    Iterator _iterator = _listNdString.iterator();

    while (_iterator.hasNext()) {

      String gdbName = (String) _iterator.next();

      SimpleStorage<ConsensusNodeId> _simpleStorageNmisConsensusNodeId =
          _cUpgradeMetaEnv.getFsscClusterSimpleStorageFacade().crermroSimpleStorage(gdbName);
      if (_simpleStorageNmisConsensusNodeId.exists()) {

        ConsensusNodeId _imnConsensusNodeId = _simpleStorageNmisConsensusNodeId.readState();
        if (!_imoConsensusNodeId.equals(_imnConsensusNodeId)) {

          throw new IllegalStateException("*** Error: 57003caa-86e1-46d1-8664-cdd30f629670");
        }
      } else {
        _simpleStorageNmisConsensusNodeId.writeState(_imoConsensusNodeId);
      }
    }
  }


  private void _geasridfommidForCoFi(FileSystemAbstraction _fFileSystemAbstraction,
      ConsensusNodeId _omiConsensusNodeId) {

    SimpleStorage<ServerId> _simpleStorageSisServerId = this._creseteSimpleStorage(
        _fFileSystemAbstraction);
    if (_simpleStorageSisServerId.exists()) {
      this._reancpseiForIdSi(_omiConsensusNodeId, _simpleStorageSisServerId);
    } else {
      this._wrtseeidForSiUU(_simpleStorageSisServerId, _omiConsensusNodeId.uuid());
    }
  }


  private void _reancpseiForIdSi(Id _mmeId, SimpleStorage<ServerId> _simpleStorageSisServerId) {
    try {

      ServerId _serverId = _simpleStorageSisServerId.readState();
      if (_serverId == null) {

        throw new IllegalStateException("*** Error:  c2f0ea5b-9317-4efd-ad87-235785cd0baf");
      } else if (!_serverId.uuid().equals(_mmeId.uuid())) {

        throw new IllegalStateException("*** Error:  d511425a-7499-42c0-8107-14ac521d0139");
      }
    } catch (

        IOException _iOException) {

      throw new RuntimeException("*** Error:  53b38a37-b6c3-4aa1-8b55-c7ac12941489",
          _iOException);
    }
  }


  private void _reancvmeiForSiUp(UpgradeMetaEnv _cUpgradeMetaEnv,
      SimpleStorage<ConsensusNodeId> _simpleStorageSimoConsensusNodeId) {
    try {

      ConsensusNodeId _imoConsensusNodeId = _simpleStorageSimoConsensusNodeId.readState();
      if (_imoConsensusNodeId == null) {

        throw new IllegalStateException("*** Error:  eb7d2d02-a042-48b9-82f9-e434be4e09d5");
      } else {
        this._geasridfommidForCoFi(_cUpgradeMetaEnv.getFFileSystemAbstraction(),
            _imoConsensusNodeId);
        this._geanwmeifolmbiForCoUp(_cUpgradeMetaEnv, _imoConsensusNodeId);
        _simpleStorageSimoConsensusNodeId.removeState();

        Path _pimoPath = _cUpgradeMetaEnv.getLscClusterMetaTopologyInfo().olmmidsefPath()
            .getParent();
        _cUpgradeMetaEnv.getFFileSystemAbstraction().deleteFile(_pimoPath);


      }
    } catch (

        IOException _iOException) {

      throw new RuntimeException("*** Error:  2251bae7-2455-4c2b-9542-3e668bdd5491",
          _iOException);
    }
  }


  private void _wrtseeidForSiUU(SimpleStorage<ServerId> _simpleStorageSsServerId, UUID _uUID) {
    try {
      _simpleStorageSsServerId.writeState(new ServerId(_uUID));
    } catch (

        IOException _iOException) {

      throw new RuntimeException("*** Error:  c7351c6c-24c4-49ed-a1b4-5f75637f1f0b",
          _iOException);
    }
  }

  @Override
  public void pefmseForUp(UpgradeMetaEnv _cUpgradeMetaEnv) {

    SimpleStorage<ConsensusNodeId> _simpleStorageSimoConsensusNodeId = _cUpgradeMetaEnv.getFsscClusterSimpleStorageFacade()
        .creomerSimpleStorage();
    if (_simpleStorageSimoConsensusNodeId.exists()) {
      this._reancvmeiForSiUp(_cUpgradeMetaEnv, _simpleStorageSimoConsensusNodeId);
    } else {
      this._chorammidamnForUp(_cUpgradeMetaEnv);
    }
  }
}
