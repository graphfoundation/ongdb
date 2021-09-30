package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.cluster.UniqueAddress;
import akka.cluster.ddata.LWWMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.neo4j.util.VisibleForTesting;


public class StructureInfo {


  public static final StructureInfo EMT_STRUCTURE_INFO = new StructureInfo(Collections.emptyMap());


  private final Map<UniqueAddress, GdbDiscoveryMetaCoreWrapper> mapMtdtug;

  public StructureInfo(LWWMap<UniqueAddress, GdbDiscoveryMetaCoreWrapper> _lWWMapMtdtug) {
    this(_lWWMapMtdtug.getEntries());
  }

  @VisibleForTesting
  public StructureInfo(Map<UniqueAddress, GdbDiscoveryMetaCoreWrapper> _mapMtdtug) {
    this.mapMtdtug = Collections.unmodifiableMap(_mapMtdtug);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      StructureInfo _thStructureInfo = (StructureInfo) obj;
      return Objects.equals(this.mapMtdtug, _thStructureInfo.mapMtdtug);
    } else {
      return false;
    }
  }


  public Optional<GdbDiscoveryMetaCoreWrapper> geoOptional(UniqueAddress _uniqueAddress) {
    return Optional.ofNullable(this.mapMtdtug.get(_uniqueAddress));
  }


  public Stream<GdbDiscoveryMetaCoreWrapper> geseStream(UniqueAddress _uniqueAddress) {
    return Stream.ofNullable(this.mapMtdtug.get(_uniqueAddress));
  }


  public Stream<GdbDiscoveryMetaCoreWrapper> geseStream() {
    return this.mapMtdtug.values().stream();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapMtdtug);
  }


}
