package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.Iterator;
import org.neo4j.annotations.documented.Documented;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_POOL_IMPL___DOCUMENTED)
public class JVMAdapterPoolImpl extends JVMAdapter {


  private static final String MEO_PC_PRE =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.MEMORY__POOL);


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_POOL_IMPL___DOCUMENTED_MEO_PC_USX_TPX)
  private static final String MEO_PC_USX_TPX;

  static {
    MEO_PC_USX_TPX = MetricRegistry.name(MEO_PC_PRE, "%s");
  }


  private final MetricRegistryManager metricRegistryManager;


  private final String strPm;


  private final String strPpm;

  public JVMAdapterPoolImpl() {
    this("", null);
  }

  public JVMAdapterPoolImpl(String mprnm, MetricRegistryManager _metricRegistryManager) {
    this.metricRegistryManager = _metricRegistryManager;
    this.strPpm = MetricRegistry.name(mprnm, MEO_PC_PRE);
    this.strPm = MetricRegistry.name(mprnm, MEO_PC_USX_TPX);
  }

  @Override
  public String moydmdmineString(String _strMti) {
    return _strMti.replace("%s", "<pool>");
  }

  @Override
  public void start() {

    Iterator _iterator = ManagementFactory.getMemoryPoolMXBeans().iterator();

    while (_iterator.hasNext()) {

      MemoryPoolMXBean _pmMemoryPoolMXBean = (MemoryPoolMXBean) _iterator.next();
      this.metricRegistryManager.reieForStSu(
          String.format(this.strPm, prtfnaString(_pmMemoryPoolMXBean.getName())),
          () -> new MetricsMeter(() -> _pmMemoryPoolMXBean.getUsage().getUsed()));
    }
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reomcnForMe((name, metric) ->
    {
      return name.startsWith(this.strPpm);
    });
  }
}
