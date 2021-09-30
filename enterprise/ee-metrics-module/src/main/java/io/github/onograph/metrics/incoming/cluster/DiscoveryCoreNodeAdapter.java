package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.monitoring.Monitors;


@Documented(io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED)
public class DiscoveryCoreNodeAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED_CLX_CVGX_TPX)
  public static final String CLX_CVGX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.DISCOVERY,
          io.github.onograph.TokenConstants.CLUSTER, io.github.onograph.TokenConstants.CONVERGED);


  @Documented(io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED_CLX_MEBS_TPX)
  public static final String CLX_MEBS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.DISCOVERY,
          io.github.onograph.TokenConstants.CLUSTER, io.github.onograph.TokenConstants.MEMBERS);


  @Documented(io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED_CLX_UNEHL_TPX)
  public static final String CLX_UNEHL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.DISCOVERY,
          io.github.onograph.TokenConstants.CLUSTER, io.github.onograph.TokenConstants.UNREACHABLE);


  @Documented(io.github.onograph.TokenConstants.DISCOVERY_CORE_NODE_ADAPTER___DOCUMENTED_COPD_DAX_TPX)
  public static final String COPD_DAX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE,
          io.github.onograph.TokenConstants.DISCOVERY,
          io.github.onograph.TokenConstants.REPLICATED_DATA);


  private final ClusterDataWatcherMetricsImpl mdrdClusterDataWatcherMetricsImpl;


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;


  private final ClusterMembersCount mscdClusterMembersCount;


  private final String strCc;


  private final String strDr;


  private final String strMc;


  private final String strUc;

  public DiscoveryCoreNodeAdapter() {
    this("", null, null);
  }

  public DiscoveryCoreNodeAdapter(String _strPmg, Monitors _goaMonitors,
      MetricRegistryManager _metricRegistryManager) {
    super(EnterpriseMetricsType.EMT_CLUSTER);
    this.mscdClusterMembersCount = new ClusterMembersCount();
    this.mdrdClusterDataWatcherMetricsImpl = new ClusterDataWatcherMetricsImpl();
    this.monitors = _goaMonitors;
    this.metricRegistryManager = _metricRegistryManager;
    this.strCc = MetricRegistry.name(_strPmg, CLX_CVGX_TPX);
    this.strMc = MetricRegistry.name(_strPmg, CLX_MEBS_TPX);
    this.strUc = MetricRegistry.name(_strPmg, CLX_UNEHL_TPX);
    this.strDr = MetricRegistry.name(_strPmg, COPD_DAX_TPX);
  }


  private String _divreadanmString(ClusterDataType _ietfeClusterDataType, String _strVsblt) {

    String _strVr00 = this.strDr;

    String[] _strVr00Array = new String[1];

    String _strVr01 = _ietfeClusterDataType.getTokenKey().replace('-', '_');
    _strVr00Array[0] = _strVr01 + "." + _strVsblt;
    return MetricRegistry.name(_strVr00, _strVr00Array);
  }

  @Override
  public void start() {
    this.monitors.addMonitorListener(this.mdrdClusterDataWatcherMetricsImpl);
    this.monitors.addMonitorListener(this.mscdClusterMembersCount);
    this.metricRegistryManager.reieForStSu(this.strCc, () ->
    {
      return this.mscdClusterMembersCount.covgGauge();
    });
    this.metricRegistryManager.reieForStSu(this.strMc, () ->
    {
      return this.mscdClusterMembersCount.mebsGauge();
    });
    this.metricRegistryManager.reieForStSu(this.strUc, () ->
    {
      return this.mscdClusterMembersCount.unehlGauge();
    });

    ClusterDataType[] _clusterDataTypeArray = ClusterDataType.values();

    int _iVa = _clusterDataTypeArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      ClusterDataType _ietfeClusterDataType = _clusterDataTypeArray[_iVa2];
      this.metricRegistryManager.reieForStSu(
          this._divreadanmString(_ietfeClusterDataType, io.github.onograph.TokenConstants.VISIBLE),
          () ->
          {
            return this.mdrdClusterDataWatcherMetricsImpl.gevsdsiGauge(_ietfeClusterDataType);
          });
      this.metricRegistryManager.reieForStSu(this._divreadanmString(_ietfeClusterDataType,
          io.github.onograph.TokenConstants.INVISIBLE), () ->
      {
        return this.mdrdClusterDataWatcherMetricsImpl.geivldasGauge(_ietfeClusterDataType);
      });
    }
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(CLX_CVGX_TPX);
    this.metricRegistryManager.reoForSt(CLX_MEBS_TPX);
    this.metricRegistryManager.reoForSt(CLX_UNEHL_TPX);

    ClusterDataType[] _clusterDataTypeArray = ClusterDataType.values();

    int _iV = _clusterDataTypeArray.length;

    for (

        int _iV2 = 0; _iV2 < _iV; ++_iV2) {

      ClusterDataType _ietfeClusterDataType = _clusterDataTypeArray[_iV2];
      this.metricRegistryManager.reoForSt(
          this._divreadanmString(_ietfeClusterDataType, io.github.onograph.TokenConstants.VISIBLE));
      this.metricRegistryManager.reoForSt(this._divreadanmString(_ietfeClusterDataType,
          io.github.onograph.TokenConstants.INVISIBLE));
    }

    this.monitors.removeMonitorListener(this.mdrdClusterDataWatcherMetricsImpl);
    this.monitors.removeMonitorListener(this.mscdClusterMembersCount);
  }
}
