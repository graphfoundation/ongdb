package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED)
public class JVMAdapterMemoryHeapImpl extends JVMAdapter {


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED_HEA_CMTX_TPX)
  public static final String HEA_CMTX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.HEAP__COMMITTED);


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED_HEA_LIMT_TPX)
  public static final String HEA_LIMT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.HEAP__MAX);


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_MEMORY_HEAP_IMPL___DOCUMENTED_HEA_USE_TPX)
  public static final String HEA_USE_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.HEAP__USED);


  private final MetricRegistryManager metricRegistryManager;


  private final String strHc;


  private final String strHm;


  private final String strUh;

  public JVMAdapterMemoryHeapImpl() {
    this("", null);
  }

  public JVMAdapterMemoryHeapImpl(String mprnm, MetricRegistryManager _metricRegistryManager) {
    this.metricRegistryManager = _metricRegistryManager;
    this.strHc = MetricRegistry.name(mprnm, HEA_CMTX_TPX);
    this.strUh = MetricRegistry.name(mprnm, HEA_USE_TPX);
    this.strHm = MetricRegistry.name(mprnm, HEA_LIMT_TPX);
  }

  @Override
  public void start() {

    io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.MemoryUsageMxBeanWrapper _sumMemoryUsageMxBeanWrapper =
        new io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl.MemoryUsageMxBeanWrapper();
    Objects.requireNonNull(_sumMemoryUsageMxBeanWrapper);
    this.metricRegistryManager.reieForStSu(this.strHc,
        () -> new MetricsMeter(_sumMemoryUsageMxBeanWrapper::_gecmt));
    this.metricRegistryManager.reieForStSu(this.strUh,
        () -> new MetricsMeter(_sumMemoryUsageMxBeanWrapper::_geud));
    this.metricRegistryManager.reieForStSu(this.strHm,
        () -> new MetricsMeter(_sumMemoryUsageMxBeanWrapper::_gem));
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strHm);
    this.metricRegistryManager.reoForSt(this.strUh);
    this.metricRegistryManager.reoForSt(this.strHc);
  }


  private static class MemoryUsageMxBeanWrapper {


    private final MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();


    private volatile MemoryUsage lMemoryUsage;

    private MemoryUsageMxBeanWrapper() {
      this.lMemoryUsage = this.memoryMXBean.getHeapMemoryUsage();
    }


    private long _gecmt() {
      this.lMemoryUsage = this.memoryMXBean.getHeapMemoryUsage();
      return this.lMemoryUsage.getCommitted();
    }


    private long _gem() {
      return this.lMemoryUsage.getMax();
    }


    private long _geud() {
      return this.lMemoryUsage.getUsed();
    }
  }
}
