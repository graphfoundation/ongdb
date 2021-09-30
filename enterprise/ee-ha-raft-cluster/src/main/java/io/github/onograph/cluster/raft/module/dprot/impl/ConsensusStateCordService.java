package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.ConsensusGdbServerCoordinator;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.Log;


public class ConsensusStateCordService {


  private final Log log;


  private final Map<ServerId, Map<DatabaseId, ConsensusNodeId>> mapSbmrsm = new ConcurrentHashMap();


  private final Set<UUID> setMposUUID = ConcurrentHashMap.newKeySet();


  private volatile int iCm;


  private volatile Map<ConsensusNodeId, ServerId> mapMrbscs;

  ConsensusStateCordService(Log _log) {
    this.log = _log;
    this.mapMrbscs = new HashMap();
    this.iCm = 0;
  }


  private static <K, V> boolean _isHaeaenyForMaMa(Entry<K, V> _entryEtykv, Map<K, V> _mapMkv) {
    return _mapMkv.containsKey(_entryEtykv.getKey()) && _entryEtykv.getValue()
        .equals(_mapMkv.get(_entryEtykv.getKey()));
  }


  private HashSet<DatabaseId> _chedaiHashSet(Map<DatabaseId, ConsensusNodeId> _mapCmdc,
      Map<DatabaseId, ConsensusNodeId> _mapMndc, ServerId _serverId) {

    HashMap<DatabaseId, ConsensusNodeId> _hashMapRedc = new HashMap(_mapCmdc);
    _hashMapRedc.keySet().removeAll(_mapMndc.keySet());

    HashSet<DatabaseId> _hashSetCdiDatabaseId = new HashSet(_hashMapRedc.keySet());

    HashMap<DatabaseId, ConsensusNodeId> _hashMapEcoadc = new HashMap(_mapMndc);
    _hashMapEcoadc.entrySet().removeIf((entry) ->
    {
      return _isHaeaenyForMaMa(entry, _mapCmdc);
    });
    _hashSetCdiDatabaseId.addAll(_hashMapEcoadc.keySet());
    this._lorfmpchForSeSeMa(_hashMapEcoadc, _serverId, _hashMapRedc.keySet());
    return _hashSetCdiDatabaseId;
  }


  private void _lorfmpchForSeSeMa(Map<DatabaseId, ConsensusNodeId> _mapEcoadc, ServerId _serverId,
      Set<DatabaseId> _setErDatabaseId) {
    if (_mapEcoadc.isEmpty()) {

    } else {

    }
  }


  private void _maervsma() {

    int _iCm = 0;

    Map<ServerId, Map<DatabaseId, ConsensusNodeId>> _mapSbmrsm = Map.copyOf(this.mapSbmrsm);

    HashMap<ConsensusNodeId, ServerId> _hashMapMrbscs = new HashMap<>();

    Iterator<Entry<ServerId, Map<DatabaseId, ConsensusNodeId>>> _iteratorVaEntry = _mapSbmrsm.entrySet()
        .iterator();

    while (_iteratorVaEntry.hasNext()) {

      Entry<ServerId, Map<DatabaseId, ConsensusNodeId>> _entryEtysm = _iteratorVaEntry.next();
      _iCm += (_entryEtysm.getValue()).size();
      (_entryEtysm.getValue()).values().forEach((raftMemberId) ->
      {
        _hashMapMrbscs.put(raftMemberId, (ServerId) _entryEtysm.getKey());
      });
    }

    this.iCm = _iCm;
    this.mapMrbscs = _hashMapMrbscs;
  }


  void clredForSe(ServerId _lclServerId) {
    this.mapSbmrsm.entrySet().removeIf((entry) ->
    {
      return !((ServerId) entry.getKey()).equals(_lclServerId);
    });
    this.mapMrbscs.entrySet().removeIf((entry) ->
    {
      return !((ServerId) entry.getValue()).equals(_lclServerId);
    });


  }


  ConsensusNodeId revrtmefsrConsensusNodeId(DatabaseId _databaseId, ServerId _serverId) {

    Map<DatabaseId, ConsensusNodeId> _mapIdbrdc = (Map) this.mapSbmrsm.get(_serverId);
    if (_mapIdbrdc == null) {
      if (this.setMposUUID.contains(_serverId.uuid())) {

        return null;
      } else {

        return new ConsensusNodeId(_serverId.uuid());
      }
    } else {

      ConsensusNodeId consensusNodeId = (ConsensusNodeId) _mapIdbrdc.get(_databaseId);
      if (consensusNodeId == null) {
        if (this.setMposUUID.contains(_serverId.uuid())) {

          return null;
        } else {

          return new ConsensusNodeId(_serverId.uuid());
        }
      } else {
        return consensusNodeId;
      }
    }
  }


  ServerId revsvfrrmrServerId(ConsensusNodeId consensusNodeId) {

    ServerId _rslServerId = (ServerId) this.mapMrbscs.get(consensusNodeId);
    if (_rslServerId == null) {
      if (this.setMposUUID.contains(consensusNodeId.uuid())) {

        return null;
      } else {

        return new ServerId(consensusNodeId.uuid());
      }
    } else {
      return _rslServerId;
    }
  }


  Set<DatabaseId> upaSet(ConsensusGdbServerCoordinator _mpigConsensusGdbServerCoordinator) {

    ServerId _serverId = _mpigConsensusGdbServerCoordinator.getServerId();

    Map<DatabaseId, ConsensusNodeId> _mapMndc = _mpigConsensusGdbServerCoordinator.daatrmaMap();

    Map<DatabaseId, ConsensusNodeId> _mapMcdc = (Map) this.mapSbmrsm.getOrDefault(_serverId,
        Collections.emptyMap());
    if (Objects.equals(_mapMndc, _mapMcdc)) {
      return Collections.emptySet();
    } else {
      if (!_mapMndc.isEmpty()) {
        this.mapSbmrsm.put(_serverId, _mapMndc);
        this._maervsma();
        this.setMposUUID.add(_serverId.uuid());
      } else if (!_mapMcdc.isEmpty()) {
        this.mapSbmrsm.remove(_serverId);
        this._maervsma();
      }

      return this._chedaiHashSet(_mapMcdc, _mapMndc, _serverId);
    }
  }
}
