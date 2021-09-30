package io.github.onograph.cluster.raft.module.dprot.impl.gdb;

import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.neo4j.kernel.database.DatabaseId;


public class ReadReplicateGdbMetaManager {


  private final Map<DatabaseId, ReadReplicateGdbMeta> mapDsdr;

  ReadReplicateGdbMetaManager(Collection<ReadReplicateGdbMeta> _collectionSdReadReplicateGdbMeta) {
    this.mapDsdr = _collectionSdReadReplicateGdbMeta.stream()
        .collect(Collectors.toMap(ReadReplicateGdbMeta::getDatabaseId, Function.identity()));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ReadReplicateGdbMetaManager _thReadReplicateGdbMetaManager = (ReadReplicateGdbMetaManager) obj;
      return Objects.equals(this.mapDsdr, _thReadReplicateGdbMetaManager.mapDsdr);
    } else {
      return false;
    }
  }


  public Map<DatabaseId, ReadReplicateGdbMeta> getMapDsdr() {
    return this.mapDsdr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapDsdr);
  }
}
