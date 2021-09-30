package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import org.neo4j.annotations.documented.Documented;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_M_B_IMPL___DOCUMENTED)
public class JVMAdapterMBImpl extends JVMAdapter {


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_M_B_IMPL___DOCUMENTED_MEO_BUF_CAAT_TPX)
  private static final String MEO_BUF_CAAT_TPX;


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_M_B_IMPL___DOCUMENTED_MEO_BUF_CSZ_TPX)
  private static final String MEO_BUF_CSZ_TPX;


  private static final String MEO_BUF_PRE =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.MEMORY__BUFFER);


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_M_B_IMPL___DOCUMENTED_MEO_BUF_USE_TPX)
  private static final String MEO_BUF_USE_TPX;

  static {
    MEO_BUF_CSZ_TPX = MetricRegistry.name(MEO_BUF_PRE, "%s",
        io.github.onograph.TokenConstants.COUNT);
    MEO_BUF_USE_TPX = MetricRegistry.name(MEO_BUF_PRE, "%s",
        io.github.onograph.TokenConstants.USED);
    MEO_BUF_CAAT_TPX = MetricRegistry.name(MEO_BUF_PRE, "%s",
        io.github.onograph.TokenConstants.CAPACITY);
  }


  private final MetricRegistryManager metricRegistryManager;


  private final String strCbm;


  private final String strCbm2;


  private final String strMbp;


  private final String strMbu;

  public JVMAdapterMBImpl() {
    this("", null);
  }

  public JVMAdapterMBImpl(String mprnm, MetricRegistryManager _metricRegistryManager) {
    this.metricRegistryManager = _metricRegistryManager;
    this.strMbp = MetricRegistry.name(mprnm, MEO_BUF_PRE);
    this.strCbm = MetricRegistry.name(mprnm, MEO_BUF_CSZ_TPX);
    this.strMbu = MetricRegistry.name(mprnm, MEO_BUF_USE_TPX);
    this.strCbm2 = MetricRegistry.name(mprnm, MEO_BUF_CAAT_TPX);
  }

  @Override
  public String moydmdmineString(String _strMti) {
    return _strMti.replace("%s", "<bufferpool>");
  }

  @Override
  public void start() {

    Iterator<BufferPoolMXBean> _iteratorVBufferPoolMXBean = ManagementFactory.getPlatformMXBeans(
        BufferPoolMXBean.class).iterator();

    while (_iteratorVBufferPoolMXBean.hasNext()) {

      BufferPoolMXBean plNm = _iteratorVBufferPoolMXBean.next();

      String _strNpp = prtfnaString(plNm.getName());
      this.metricRegistryManager.reieForStSu(String.format(this.strCbm, _strNpp),
          () -> new MetricsMeter(plNm::getCount));
      this.metricRegistryManager.reieForStSu(String.format(this.strMbu, _strNpp),
          () -> new MetricsMeter(plNm::getMemoryUsed));
      this.metricRegistryManager.reieForStSu(String.format(this.strCbm2, _strNpp),
          () -> new MetricsMeter(plNm::getTotalCapacity));
    }
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reomcnForMe((name, metric) ->
    {
      return name.startsWith(this.strMbp);
    });
  }
}
