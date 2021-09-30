package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.Gauge;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;


public class ClusterDataWatcherMetricsImpl implements ClusterDataWatcher {


  private static final Integer DEF = 0;


  private final Map<ClusterDataType, Integer> mapIdsci = new EnumMap(ClusterDataType.class);


  private final Map<ClusterDataType, Integer> mapSdvci = new EnumMap(ClusterDataType.class);


  private static Integer _reuInteger(ClusterDataType k, Map<ClusterDataType, Integer> _mapMci) {

    Integer _iRsl = _mapMci.get(k);
    return Objects.requireNonNullElse(_iRsl, DEF);
  }


  public Gauge<Integer> geivldasGauge(ClusterDataType k) {
    return () ->
    {
      return _reuInteger(k, this.mapIdsci);
    };
  }


  public Gauge<Integer> gevsdsiGauge(ClusterDataType k) {
    return () ->
    {
      return _reuInteger(k, this.mapSdvci);
    };
  }

  @Override
  public void seivldasForCl(ClusterDataType k, int sz) {
    this.mapIdsci.put(k, sz);
  }

  @Override
  public void sevsdsiForCl(ClusterDataType k, int sz) {
    this.mapSdvci.put(k, sz);
  }
}
