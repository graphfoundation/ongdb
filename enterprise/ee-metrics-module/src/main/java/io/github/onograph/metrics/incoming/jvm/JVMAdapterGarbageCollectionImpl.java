package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_GARBAGE_COLLECTION_IMPL___DOCUMENTED)
public class JVMAdapterGarbageCollectionImpl extends JVMAdapter {


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_GARBAGE_COLLECTION_IMPL___DOCUMENTED_GC_CSZ_TPX)
  private static final String GC_CSZ_TPX;


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_GARBAGE_COLLECTION_IMPL___DOCUMENTED_GC_LTM_TPX)
  private static final String GC_LTM_TPX;


  private static final String GC_PRE = MetricRegistry.name(io.github.onograph.TokenConstants.VM,
      io.github.onograph.TokenConstants.GC);

  static {
    GC_LTM_TPX = MetricRegistry.name(GC_PRE, io.github.onograph.TokenConstants.TIME, "%s");
    GC_CSZ_TPX = MetricRegistry.name(GC_PRE, io.github.onograph.TokenConstants.COUNT, "%s");
  }


  private final MetricRegistryManager metricRegistryManager;


  private final String strCg;


  private final String strPg;


  private final String strTg;

  public JVMAdapterGarbageCollectionImpl() {
    this("", null);
  }

  public JVMAdapterGarbageCollectionImpl(String mprnm,
      MetricRegistryManager _metricRegistryManager) {
    this.metricRegistryManager = _metricRegistryManager;
    this.strPg = MetricRegistry.name(mprnm, GC_PRE);
    this.strTg = MetricRegistry.name(mprnm, GC_LTM_TPX);
    this.strCg = MetricRegistry.name(mprnm, GC_CSZ_TPX);
  }

  @Override
  public String moydmdmineString(String _strMti) {
    return _strMti.replace("%s", "<gc>");
  }

  @Override
  public void start() {

    Iterator _iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();

    while (_iterator.hasNext()) {

      GarbageCollectorMXBean _bgGarbageCollectorMXBean = (GarbageCollectorMXBean) _iterator.next();
      this.metricRegistryManager.reieForStSu(
          String.format(this.strTg, prtfnaString(_bgGarbageCollectorMXBean.getName())), () ->
          {
            Objects.requireNonNull(_bgGarbageCollectorMXBean);
            return new MetricsMeter(_bgGarbageCollectorMXBean::getCollectionTime);
          });
      this.metricRegistryManager.reieForStSu(
          String.format(this.strCg, prtfnaString(_bgGarbageCollectorMXBean.getName())), () ->
          {
            Objects.requireNonNull(_bgGarbageCollectorMXBean);
            return new MetricsMeter(_bgGarbageCollectorMXBean::getCollectionCount);
          });
    }
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reomcnForMe((name, metric) ->
    {
      return name.startsWith(this.strPg);
    });
  }
}
