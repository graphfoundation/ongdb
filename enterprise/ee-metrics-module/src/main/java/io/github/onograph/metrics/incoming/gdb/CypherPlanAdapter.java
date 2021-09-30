package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.cypher.PlanCacheMetricsMonitor;
import org.neo4j.monitoring.Monitors;


@Documented(io.github.onograph.TokenConstants.CYPHER_PLAN_ADAPTER___DOCUMENTED)
public class CypherPlanAdapter extends AbstractMetricsLifecycleAdapter {


  private static final String CYH_PRE = io.github.onograph.TokenConstants.CYPHER;


  @Documented(io.github.onograph.TokenConstants.CYPHER_PLAN_ADAPTER___DOCUMENTED_REL_EVXS_TPX)
  private static final String REL_EVXS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CYPHER,
          io.github.onograph.TokenConstants.REPLAN_EVENTS);


  @Documented(io.github.onograph.TokenConstants.CYPHER_PLAN_ADAPTER___DOCUMENTED_REL_WAI_LTM_TPX)
  private static final String REL_WAI_LTM_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.CYPHER,
          io.github.onograph.TokenConstants.REPLAN_WAIT_TIME);


  private final PlanCacheMetricsMonitor cmPlanCacheMetricsMonitor;


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;


  private final String strEr;


  private final String strTwr;

  public CypherPlanAdapter() {
    this("", null, null);
  }

  public CypherPlanAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      Monitors _monitors) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.cmPlanCacheMetricsMonitor = new PlanCacheMetricsMonitor();
    this.strEr = MetricRegistry.name(mprnm, REL_EVXS_TPX);
    this.strTwr = MetricRegistry.name(mprnm, REL_WAI_LTM_TPX);
    this.metricRegistryManager = _metricRegistryManager;
    this.monitors = _monitors;
  }

  @Override
  public void start() {
    this.monitors.addMonitorListener(this.cmPlanCacheMetricsMonitor);
    this.metricRegistryManager.reieForStSu(this.strEr, () ->
    {

      PlanCacheMetricsMonitor _planCacheMetricsMonitor = this.cmPlanCacheMetricsMonitor;
      Objects.requireNonNull(_planCacheMetricsMonitor);
      return new MetricsMeter(_planCacheMetricsMonitor::numberOfReplans);
    });
    this.metricRegistryManager.reieForStSu(this.strTwr, () ->
    {

      PlanCacheMetricsMonitor _planCacheMetricsMonitor2 = this.cmPlanCacheMetricsMonitor;
      Objects.requireNonNull(_planCacheMetricsMonitor2);
      return new MetricsMeter(_planCacheMetricsMonitor2::replanWaitTime);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strEr);
    this.metricRegistryManager.reoForSt(this.strTwr);
    this.monitors.removeMonitorListener(this.cmPlanCacheMetricsMonitor);
  }
}
