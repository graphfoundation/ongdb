package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.LogProvider;


public class ReadReplicateGdbMetaClusterLog extends ClusterDiscoveryGdbLog<ReadReplicateGdbMeta> {

  public ReadReplicateGdbMetaClusterLog(Class<?> _classClObject, LogProvider _logProvider,
      ScHolderJobScheduler _stScHolderJobScheduler, Supplier<Set<DatabaseId>> _supplierSdaSet) {
    super(_classClObject, Mutated.EMT_MUTATED, _logProvider, _supplierSdaSet, BLK_LTM,
        _stScHolderJobScheduler);
  }

  @Override
  protected Optional<MutationInfo> copecaeOptional(String _strDc,
      ReadReplicateGdbMeta _inReadReplicateGdbMeta, ReadReplicateGdbMeta _ioReadReplicateGdbMeta) {

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapSsnsd = _inReadReplicateGdbMeta.getMapMssd();

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapSsosd = _ioReadReplicateGdbMeta.getMapMssd();

    HashMap<ServerId, DiscoveryGdbOperatorMetaWrapper> _hashMapBsusd = new HashMap();

    HashMap<ServerId, DiscoveryGdbOperatorMetaWrapper> _hashMapAsusd = new HashMap();

    Iterator _iterator = _mapSsnsd.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<ServerId, DiscoveryGdbOperatorMetaWrapper> _entryEtysd = (Entry) _iterator.next();

      ServerId _serverId = _entryEtysd.getKey();

      DiscoveryGdbOperatorMetaWrapper _snDiscoveryGdbOperatorMetaWrapper = _entryEtysd.getValue();

      DiscoveryGdbOperatorMetaWrapper _soDiscoveryGdbOperatorMetaWrapper = _mapSsosd.get(
          _entryEtysd.getKey());
      if (_mapSsosd.containsKey(_serverId) && !Objects.equals(_snDiscoveryGdbOperatorMetaWrapper,
          _soDiscoveryGdbOperatorMetaWrapper)) {
        _hashMapAsusd.put(_serverId, _snDiscoveryGdbOperatorMetaWrapper);
        _hashMapBsusd.put(_serverId, _soDiscoveryGdbOperatorMetaWrapper);
      }
    }

    return !_hashMapAsusd.isEmpty() ? Optional
        .of(new Mutated(_hashMapAsusd, _hashMapBsusd, _strDc)) : Optional.empty();
  }

  @Override
  protected DatabaseId excdaiDatabaseId(ReadReplicateGdbMeta _iReadReplicateGdbMeta) {
    return _iReadReplicateGdbMeta.getDatabaseId();
  }


  private static class Mutated implements MutationInfo {


    static final Mutated EMT_MUTATED = new Mutated(Map.of(), Map.of(), "");


    private final Map<ServerId, DiscoveryGdbOperatorMetaWrapper> mapAsusd;


    private final Map<ServerId, DiscoveryGdbOperatorMetaWrapper> mapBsusd;


    private final String strDs;


    Mutated(Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapAsusd,
        Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapBsusd, String _strDs) {
      this.mapAsusd = _mapAsusd;
      this.mapBsusd = _mapBsusd;
      this.strDs = _strDs;
    }


    private String _pruembString() {

      StringBuilder _rslStringBuilder = new StringBuilder();

      Iterator _iterator = this.mapAsusd.keySet().iterator();

      while (_iterator.hasNext()) {

        ServerId _serverId = (ServerId) _iterator.next();
        _rslStringBuilder.append(ClusterDiscoveryGdbLog.nepdleString());
        _rslStringBuilder.append(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.dprot.impl.ReadReplicateGdbMetaClusterLog.Mutated.append"))
            .append(_serverId)
            .append("=").append(this.mapAsusd.get(_serverId))
            .append(ClusterDiscoveryGdbLog.nepdleString());
        _rslStringBuilder.append(io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.module.dprot.impl.ReadReplicateGdbMetaClusterLog.Mutated.append2"))
            .append(_serverId)
            .append("=").append(this.mapBsusd.get(_serverId));
      }

      return _rslStringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        Mutated _thaMutated = (Mutated) obj;
        return Objects.equals(this.strDs, _thaMutated.strDs) &&
            Objects.equals(this.mapBsusd, _thaMutated.mapBsusd) &&
            Objects.equals(this.mapAsusd, _thaMutated.mapAsusd);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.strDs, this.mapBsusd, this.mapAsusd);
    }

    @Override
    public String spcitnString() {

      String _strVr00 = System.lineSeparator();
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.ReadReplicateGdbMetaClusterLog.Mutated.spcitnString",
          _strVr00,
          this._pruembString());
    }

    @Override
    public String tilString() {
      return this.strDs;
    }
  }
}
