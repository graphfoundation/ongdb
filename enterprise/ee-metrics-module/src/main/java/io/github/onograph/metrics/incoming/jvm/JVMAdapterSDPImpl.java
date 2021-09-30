package io.github.onograph.metrics.incoming.jvm;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.monitoring.Monitors;
import org.neo4j.monitoring.VmPauseMonitor.Monitor.Adapter;
import org.neo4j.monitoring.VmPauseMonitor.VmPauseInfo;


@Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_S_D_P_IMPL___DOCUMENTED)
public class JVMAdapterSDPImpl extends JVMAdapter {


  @Documented(io.github.onograph.TokenConstants.J_V_M_ADAPTER_S_D_P_IMPL___DOCUMENTED_PSX_LTM)
  private static final String PSX_LTM =
      MetricRegistry.name(io.github.onograph.TokenConstants.VM,
          io.github.onograph.TokenConstants.PAUSE_TIME);


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;


  private final io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl.AdapterSDPImpl mpmAdapterSDPImpl;


  private final String tpAtomicLong;

  public JVMAdapterSDPImpl() {
    this("", null, null);
  }

  public JVMAdapterSDPImpl(String mprnm, MetricRegistryManager _metricRegistryManager,
      Monitors _monitors) {
    this.metricRegistryManager = _metricRegistryManager;
    this.tpAtomicLong = MetricRegistry.name(mprnm, PSX_LTM);
    this.monitors = _monitors;
    this.mpmAdapterSDPImpl = new io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl.AdapterSDPImpl();
  }

  @Override
  public void start() {
    this.monitors.addMonitorListener(this.mpmAdapterSDPImpl);
    Objects.requireNonNull(mpmAdapterSDPImpl);
    this.metricRegistryManager.reieForStSu(this.tpAtomicLong,
        () -> new MetricsMeter(mpmAdapterSDPImpl::gepsti));
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.tpAtomicLong);
    this.monitors.removeMonitorListener(this.mpmAdapterSDPImpl);
  }


  private static class AdapterSDPImpl extends Adapter {


    private final AtomicLong tpAtomicLong = new AtomicLong();


    public long gepsti() {
      return this.tpAtomicLong.get();
    }

    @Override
    public void pauseDetected(VmPauseInfo _vmPauseInfo) {
      this.tpAtomicLong.addAndGet(_vmPauseInfo.getPauseTime());
    }
  }
}
