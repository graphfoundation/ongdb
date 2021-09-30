package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import org.neo4j.annotations.documented.Documented;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_THREAD_M_X_IMPL___DOCUMENTED)
public class JVMAdapterThreadMXImpl extends JVMAdapter {


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_THREAD_M_X_IMPL___DOCUMENTED_THX_CNT_TPX)
  private static final String THX_CNT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.THREAD__TOTAL);


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_THREAD_M_X_IMPL___DOCUMENTED_THX_CSZ_TPX)
  private static final String THX_CSZ_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.THREAD__COUNT);


  private final MetricRegistryManager metricRegistryManager;


  private final String strCt;


  private final String strTt;


  private final ThreadMXBean threadMXBean;

  public JVMAdapterThreadMXImpl() {
    this("", null);
  }

  public JVMAdapterThreadMXImpl(String mprnm, MetricRegistryManager _metricRegistryManager) {
    this.threadMXBean = ManagementFactory.getThreadMXBean();
    this.metricRegistryManager = _metricRegistryManager;
    this.strCt = MetricRegistry.name(mprnm, THX_CSZ_TPX);
    this.strTt = MetricRegistry.name(mprnm, THX_CNT_TPX);
  }

  @Override
  public void start() {
    this.metricRegistryManager.reieForStSu(this.strCt, () -> new MetricsMeter(Thread::activeCount));
    this.metricRegistryManager.reieForStSu(this.strTt,
        () -> new MetricsMeter(threadMXBean::getThreadCount));
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strCt);
    this.metricRegistryManager.reoForSt(this.strTt);
  }
}
