package io.github.onograph.metrics.incoming;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.util.function.Supplier;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.server.web.WebContainerThreadInfo;


@Documented(io.github.onograph.TokenConstants.JETTY_ADAPTER___DOCUMENTED)
public class JettyAdapter extends AbstractMetricsLifecycleAdapter {


  private static final String SVX_PRE = io.github.onograph.TokenConstants.SERVER;


  @Documented(io.github.onograph.TokenConstants.JETTY_ADAPTER___DOCUMENTED_THX_JET_ALL_TPX)
  private static final String THX_JET_ALL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.SERVER,
          io.github.onograph.TokenConstants.THREADS__JETTY__ALL);


  @Documented(io.github.onograph.TokenConstants.JETTY_ADAPTER___DOCUMENTED_THX_JET_IDL_TPX)
  private static final String THX_JET_IDL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.SERVER,
          io.github.onograph.TokenConstants.THREADS__JETTY__IDLE);


  private final MetricRegistryManager metricRegistryManager;


  private final String strAjt;


  private final String strIjt;


  private final Supplier<WebContainerThreadInfo> supplierItcwWebContainerThreadInfo;

  public JettyAdapter() {
    this("", null, null);
  }

  public JettyAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      Supplier<WebContainerThreadInfo> _supplierWtiWebContainerThreadInfo) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.metricRegistryManager = _metricRegistryManager;
    this.strIjt = MetricRegistry.name(mprnm, THX_JET_IDL_TPX);
    this.strAjt = MetricRegistry.name(mprnm, THX_JET_ALL_TPX);
    this.supplierItcwWebContainerThreadInfo = _supplierWtiWebContainerThreadInfo;
  }

  @Override
  public void start() {
    this.metricRegistryManager.reieForStSu(this.strIjt, () -> new MetricsMeter(
        () -> (this.supplierItcwWebContainerThreadInfo.get()).idleThreads()));
    this.metricRegistryManager.reieForStSu(this.strAjt,
        () -> new MetricsMeter(() -> (this.supplierItcwWebContainerThreadInfo.get()).allThreads()));
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strIjt);
    this.metricRegistryManager.reoForSt(this.strAjt);
  }
}
