package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobScheduler;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.logging.LogProvider;
import org.neo4j.util.VisibleForTesting;


public class ClusterStructureLog extends ClusterDiscoveryGdbLog<ClusterStructure<?>> {

  public ClusterStructureLog(Class<?> _classClObject, LogProvider _logProvider,
      ScHolderJobScheduler _stScHolderJobScheduler, Supplier<Set<DatabaseId>> _supplierSdaSet) {
    this(_classClObject, _logProvider, _stScHolderJobScheduler, _supplierSdaSet, BLK_LTM);
  }


  @VisibleForTesting
  ClusterStructureLog(Class<?> _classClObject, LogProvider _logProvider,
      ScHolderJobScheduler _stScHolderJobScheduler, Supplier<Set<DatabaseId>> _supplierSdaSet,
      Duration _tbDuration) {
    super(_classClObject,
        io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.EMT_STRUCTURE_UPDATE_INFO,
        _logProvider, _supplierSdaSet, _tbDuration, _stScHolderJobScheduler);
  }

  @Override
  protected Optional<MutationInfo> copecaeOptional(String _strDt,
      ClusterStructure<?> _clusterStructureTnObject,
      ClusterStructure<?> _clusterStructureToObject) {

    Set<ServerId> _setScServerId = Collections.unmodifiableSet(
        _clusterStructureTnObject.sevsMap().keySet());

    HashSet<ServerId> _hashSetSlServerId = new HashSet(
        _clusterStructureToObject.sevsMap().keySet());
    _hashSetSlServerId.removeAll(_setScServerId);

    HashMap<ServerId, ? extends GdbDiscoveryMeta> _hashMapSnsg = new HashMap(
        _clusterStructureTnObject.sevsMap());
    _hashMapSnsg.keySet().removeAll(_clusterStructureToObject.sevsMap().keySet());
    return _hashMapSnsg.isEmpty() && _hashSetSlServerId.isEmpty() ? Optional.empty() : Optional
        .of(new io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo(
            _hashMapSnsg, _setScServerId,
            _hashSetSlServerId, _strDt));
  }

  @Override
  protected DatabaseId excdaiDatabaseId(ClusterStructure<?> _clusterStructureInfObject) {
    return _clusterStructureInfObject.daasidDatabaseId();
  }


  protected static class StructureUpdateInfo implements MutationInfo {


    static final io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo EMT_STRUCTURE_UPDATE_INFO =
        new io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo(
            Map.of(), Set.of(), Set.of(), "");


    Map<ServerId, ? extends GdbDiscoveryMeta> mapNembssg;


    Set<ServerId> setCurtmmrServerId;


    Set<ServerId> setLotmmrServerId;


    String toodst;


    StructureUpdateInfo(Map<ServerId, ? extends GdbDiscoveryMeta> _mapMnsg,
        Set<ServerId> _setCmServerId, Set<ServerId> _setMlServerId, String _strDt) {
      this.mapNembssg = _mapMnsg;
      this.setCurtmmrServerId = _setCmServerId;
      this.setLotmmrServerId = _setMlServerId;
      this.toodst = _strDt;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo _thaStructureUpdateInfo =
            (io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo) obj;
        return Objects.equals(this.toodst, _thaStructureUpdateInfo.toodst) &&
            Objects.equals(this.setCurtmmrServerId, _thaStructureUpdateInfo.setCurtmmrServerId) &&
            Objects.equals(this.setLotmmrServerId, _thaStructureUpdateInfo.setLotmmrServerId) &&
            Objects.equals(this.mapNembssg, _thaStructureUpdateInfo.mapNembssg);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.toodst, this.setCurtmmrServerId, this.setLotmmrServerId,
          this.mapNembssg);
    }

    @Override
    public String spcitnString() {

      String _strVr00 = String.format(io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.format"),
          this.setCurtmmrServerId.isEmpty() ? io.github.onograph.TokenConstants.EMPTY
              : ClusterDiscoveryGdbLog
                  .sertstsgString(this.setCurtmmrServerId));
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.spcitnString",
          _strVr00,
          System.lineSeparator(),
          (this.setLotmmrServerId.isEmpty() ? io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.var")
              : String
                  .format(io.github.onograph.I18N.format(
                          "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.format2"),
                      ClusterDiscoveryGdbLog.sertstsgString(this.setLotmmrServerId))),
          System.lineSeparator(),
          (this.mapNembssg.isEmpty() ? io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.var2")
              : String.format(io.github.onograph.I18N.format(
                      "io.github.onograph.cluster.raft.module.dprot.impl.ClusterStructureLog.StructureUpdateInfo.format3"),
                  ClusterDiscoveryGdbLog.nepdleString(),
                  ClusterDiscoveryGdbLog.sertsastString(this.mapNembssg))));
    }

    @Override
    public String tilString() {
      return this.toodst;
    }
  }
}
