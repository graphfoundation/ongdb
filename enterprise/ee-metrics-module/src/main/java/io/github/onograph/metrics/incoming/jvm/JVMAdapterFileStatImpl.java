package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.util.function.LongSupplier;
import org.apache.commons.lang3.SystemUtils;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.os.OsBeanUtil;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_FILE_STAT_IMPL___DOCUMENTED)
public class JVMAdapterFileStatImpl extends JVMAdapter {


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_FILE_STAT_IMPL___DOCUMENTED_FIL_CSZ_TPX)
  private static final String FIL_CSZ_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.FILE__DESCRIPTORS__COUNT);


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_FILE_STAT_IMPL___DOCUMENTED_FIL_LIMT_TPX)
  private static final String FIL_LIMT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.FILE__DESCRIPTORS__MAXIMUM);


  private final MetricRegistryManager metricRegistryManager;


  private final String strCf;


  private final String strMf;

  public JVMAdapterFileStatImpl() {
    this("", null);
  }

  public JVMAdapterFileStatImpl(String mprnm, MetricRegistryManager _metricRegistryManager) {
    this.metricRegistryManager = _metricRegistryManager;
    this.strCf = MetricRegistry.name(mprnm, FIL_CSZ_TPX);
    this.strMf = MetricRegistry.name(mprnm, FIL_LIMT_TPX);
  }

  @Override
  public void start() {
    if (SystemUtils.IS_OS_UNIX) {
      this.metricRegistryManager.reieForStSu(this.strCf, () ->
      {
        return new MetricsMeter(OsBeanUtil::getOpenFileDescriptors);
      });
      this.metricRegistryManager.reieForStSu(this.strMf, () ->
      {
        return new MetricsMeter(OsBeanUtil::getMaxFileDescriptors);
      });
    } else {

      LongSupplier _epyLongSupplier = new LongSupplier() {

        @Override
        public long getAsLong() {
          return -1;
        }
      };
      this.metricRegistryManager.reieForStSu(this.strCf, () ->
      {
        return new MetricsMeter(_epyLongSupplier);
      });
      this.metricRegistryManager.reieForStSu(this.strMf, () ->
      {
        return new MetricsMeter(_epyLongSupplier);
      });
    }
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strCf);
    this.metricRegistryManager.reoForSt(this.strMf);
  }
}
