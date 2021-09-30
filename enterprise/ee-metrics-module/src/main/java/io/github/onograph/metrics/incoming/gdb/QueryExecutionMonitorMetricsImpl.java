package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.UniformReservoir;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.impl.query.QueryExecutionMonitor;
import org.neo4j.monitoring.Monitors;


@Documented(io.github.onograph.TokenConstants.QUERY_EXECUTION_MONITOR_METRICS_IMPL___DOCUMENTED)
public class QueryExecutionMonitorMetricsImpl extends AbstractMetricsLifecycleAdapter implements
    QueryExecutionMonitor {


  public static final String PRF = io.github.onograph.TokenConstants.DB__QUERY__EXECUTION;


  private final Meter cfMeter;


  private final Meter csMeter;


  private final Histogram ltnyHistogram;


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;


  private final String strNcf;


  private final String strNcs;


  private final String strNl;

  public QueryExecutionMonitorMetricsImpl(String mprnm,
      MetricRegistryManager _metricRegistryManager, Monitors _monitors) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.strNcs = MetricRegistry.name(mprnm,
        MetricRegistry.name(io.github.onograph.TokenConstants.DB__QUERY__EXECUTION,
            io.github.onograph.TokenConstants.SUCCESS));
    this.strNcf = MetricRegistry.name(mprnm,
        MetricRegistry.name(io.github.onograph.TokenConstants.DB__QUERY__EXECUTION,
            io.github.onograph.TokenConstants.FAILURE));
    this.strNl = MetricRegistry.name(mprnm,
        MetricRegistry.name(io.github.onograph.TokenConstants.DB__QUERY__EXECUTION,
            io.github.onograph.TokenConstants.LATENCY,
            io.github.onograph.TokenConstants.MILLIS));
    this.metricRegistryManager = _metricRegistryManager;
    this.monitors = _monitors;
    this.csMeter = new Meter();
    this.cfMeter = new Meter();
    this.ltnyHistogram = new Histogram(new UniformReservoir());
  }

  @Override
  public void endFailure(ExecutingQuery _executingQuery, Throwable _fiueThrowable) {
    this.cfMeter.mark();
  }

  @Override
  public void endFailure(ExecutingQuery _executingQuery, String _strRao) {
    this.cfMeter.mark();
  }

  @Override
  public void endSuccess(ExecutingQuery _executingQuery) {
    this.csMeter.mark();
    this.ltnyHistogram.update(_executingQuery.elapsedMillis());
  }

  @Override
  public void start() {
    this.metricRegistryManager.reieForStSu(this.strNcs, () ->
    {
      return this.csMeter;
    });
    this.metricRegistryManager.reieForStSu(this.strNcf, () ->
    {
      return this.cfMeter;
    });
    this.metricRegistryManager.reieForStSu(this.strNl, () ->
    {
      return this.ltnyHistogram;
    });
    this.monitors.addMonitorListener(this);
  }

  @Override
  public void startExecution(ExecutingQuery _executingQuery) {
  }

  @Override
  public void startProcessing(ExecutingQuery _executingQuery) {
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strNcs);
    this.metricRegistryManager.reoForSt(this.strNcf);
    this.metricRegistryManager.reoForSt(this.strNl);
    this.monitors.removeMonitorListener(this);
  }
}
