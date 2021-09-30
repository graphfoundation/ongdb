package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class ReadReplicateGdbMeta {


  private final DatabaseId databaseId;


  private final boolean isSc;


  private final Map<ServerId, DiscoveryGdbOperatorMetaWrapper> mapMssd;


  private final String title;


  private ReadReplicateGdbMeta(DatabaseId _databaseId, boolean _isSci,
      Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapSmsd) {
    this.databaseId = _databaseId;
    this.mapMssd = _mapSmsd;
    this.isSc = _isSci;
    this.title = _isSci ? io.github.onograph.TokenConstants.CORE_REPLICATED_DATABASE_STATE
        : io.github.onograph.TokenConstants.READ_REPLICA_REPLICATED_DATABASE_STATE;
  }


  public static ReadReplicateGdbMeta ofcosReadReplicateGdbMeta(DatabaseId _databaseId,
      Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapSmsd) {
    return new ReadReplicateGdbMeta(_databaseId, true, _mapSmsd);
  }


  public static ReadReplicateGdbMeta ofrerlaReadReplicateGdbMeta(DatabaseId _databaseId,
      Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapSmsd) {
    return new ReadReplicateGdbMeta(_databaseId, false, _mapSmsd);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ReadReplicateGdbMeta _tReadReplicateGdbMeta = (ReadReplicateGdbMeta) obj;
      return this.isSc == _tReadReplicateGdbMeta.isSc && Objects.equals(this.databaseId,
          _tReadReplicateGdbMeta.databaseId) &&
          Objects.equals(this.mapMssd, _tReadReplicateGdbMeta.mapMssd);
    } else {
      return false;
    }
  }


  public DatabaseId getDatabaseId() {
    return this.databaseId;
  }


  public boolean getIsSc() {
    return this.isSc;
  }


  public Map<ServerId, DiscoveryGdbOperatorMetaWrapper> getMapMssd() {
    return this.mapMssd;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.databaseId, this.mapMssd, this.isSc);
  }


  public boolean isEmy() {
    return this.mapMssd.isEmpty();
  }


  public Optional<DiscoveryGdbOperatorMetaWrapper> sttfoOptional(ServerId _serverId) {
    return Optional.ofNullable(this.mapMssd.get(_serverId));
  }


}
