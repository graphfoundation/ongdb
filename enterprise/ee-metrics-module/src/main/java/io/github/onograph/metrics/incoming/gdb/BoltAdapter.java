package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.bolt.runtime.BoltConnectionMetricsMonitor;
import org.neo4j.monitoring.Monitors;


@Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED)
public class BoltAdapter extends AbstractMetricsLifecycleAdapter {


  private static final String BOL_PRE = io.github.onograph.TokenConstants.BOLT;


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNT_PRCSG_LTM_TPX)
  private static final String CNT_PRCSG_LTM_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.ACCUMULATED_PROCESSING_TIME);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNT_QUU_LTM_TPX)
  private static final String CNT_QUU_LTM_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.ACCUMULATED_QUEUE_TIME);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_CLS_TPX)
  private static final String CNXS_CLS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.CONNECTIONS_CLOSED);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_IDL_TPX)
  private static final String CNXS_IDL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.CONNECTIONS_IDLE);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_OPN_TPX)
  private static final String CNXS_OPN_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.CONNECTIONS_OPENED);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_CNXS_RUNG_TPX)
  private static final String CNXS_RUNG_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.CONNECTIONS_RUNNING);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_BEG_TPX)
  private static final String MSXS_BEG_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.MESSAGES_STARTED);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_DON_TPX)
  private static final String MSXS_DON_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.MESSAGES_DONE);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_FAL_TPX)
  private static final String MSXS_FAL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.MESSAGES_FAILED);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_MSXS_REEE_TPX)
  private static final String MSXS_REEE_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.MESSAGES_RECEIVED);


  @Documented(io.github.onograph.TokenConstants.BOLT_ADAPTER___DOCUMENTED_SESN_BEG_TPX)
  private static final String SESN_BEG_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.BOLT,
          io.github.onograph.TokenConstants.SESSIONS_STARTED);


  private final String Cocsce;


  private final String Cocsi;


  private final String Cocsoe;


  private final String Cocsri;


  private final String Megrcd;


  private final String Megsa;


  private final String Mesedo;


  private final String Mesefae;


  private final String Seosa;


  private final String Toaquetm;


  private final String Topst;


  private final io.github.onograph.metrics.incoming.gdb.BoltAdapter.BoltConnectionMetricsMonitorImpl botmnoBoltConnectionMetricsMonitorImpl;


  private final MetricRegistryManager metricRegistryManager;


  private final Monitors monitors;

  public BoltAdapter() {
    this("", null, null);
  }

  public BoltAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      Monitors _monitors) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.botmnoBoltConnectionMetricsMonitorImpl = new io.github.onograph.metrics.incoming.gdb.BoltAdapter.BoltConnectionMetricsMonitorImpl();
    this.Seosa = MetricRegistry.name(mprnm, SESN_BEG_TPX);
    this.Cocsoe = MetricRegistry.name(mprnm, CNXS_OPN_TPX);
    this.Cocsce = MetricRegistry.name(mprnm, CNXS_CLS_TPX);
    this.Cocsri = MetricRegistry.name(mprnm, CNXS_RUNG_TPX);
    this.Cocsi = MetricRegistry.name(mprnm, CNXS_IDL_TPX);
    this.Megrcd = MetricRegistry.name(mprnm, MSXS_REEE_TPX);
    this.Megsa = MetricRegistry.name(mprnm, MSXS_BEG_TPX);
    this.Mesedo = MetricRegistry.name(mprnm, MSXS_DON_TPX);
    this.Mesefae = MetricRegistry.name(mprnm, MSXS_FAL_TPX);
    this.Toaquetm = MetricRegistry.name(mprnm, CNT_QUU_LTM_TPX);
    this.Topst = MetricRegistry.name(mprnm, CNT_PRCSG_LTM_TPX);
    this.metricRegistryManager = _metricRegistryManager;
    this.monitors = _monitors;
  }

  @Override
  public void start() {
    this.monitors.addMonitorListener(this.botmnoBoltConnectionMetricsMonitorImpl);
    this.metricRegistryManager.reieForStSu(this.Seosa, () ->
    {

      AtomicLong _atomicLong = this.botmnoBoltConnectionMetricsMonitorImpl.cocsoeAtomicLong;
      Objects.requireNonNull(_atomicLong);
      return new MetricsMeter(_atomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Cocsoe, () ->
    {
      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.cocsoeAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.cocsoeAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Cocsce, () ->
    {
      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.cocsceAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.cocsceAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Cocsri, () ->
    {
      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.cocsavAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.cocsavAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Cocsi, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.cocsiAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.cocsiAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Megrcd, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.megrcdAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.megrcdAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Megsa, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.megsaAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.megsaAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Mesedo, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.mesedoAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.mesedoAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Mesefae, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.mesefaeAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.mesefaeAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Toaquetm, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.quutiAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.quutiAtomicLong::get);
    });
    this.metricRegistryManager.reieForStSu(this.Topst, () ->
    {

      Objects.requireNonNull(botmnoBoltConnectionMetricsMonitorImpl.prcsgtmAtomicLong);
      return new MetricsMeter(botmnoBoltConnectionMetricsMonitorImpl.prcsgtmAtomicLong::get);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.Seosa);
    this.metricRegistryManager.reoForSt(this.Cocsoe);
    this.metricRegistryManager.reoForSt(this.Cocsce);
    this.metricRegistryManager.reoForSt(this.Cocsi);
    this.metricRegistryManager.reoForSt(this.Cocsri);
    this.metricRegistryManager.reoForSt(this.Megrcd);
    this.metricRegistryManager.reoForSt(this.Megsa);
    this.metricRegistryManager.reoForSt(this.Mesedo);
    this.metricRegistryManager.reoForSt(this.Mesefae);
    this.metricRegistryManager.reoForSt(this.Toaquetm);
    this.metricRegistryManager.reoForSt(this.Topst);
    this.monitors.removeMonitorListener(this.botmnoBoltConnectionMetricsMonitorImpl);
  }


  private static class BoltConnectionMetricsMonitorImpl implements BoltConnectionMetricsMonitor {

    final AtomicLong cocsavAtomicLong = new AtomicLong();

    final AtomicLong cocsceAtomicLong = new AtomicLong();

    final AtomicLong cocsiAtomicLong = new AtomicLong();

    final AtomicLong cocsoeAtomicLong = new AtomicLong();

    final AtomicLong megrcdAtomicLong = new AtomicLong();

    final AtomicLong megsaAtomicLong = new AtomicLong();

    final AtomicLong mesedoAtomicLong = new AtomicLong();

    final AtomicLong mesefaeAtomicLong = new AtomicLong();

    final AtomicLong prcsgtmAtomicLong = new AtomicLong();

    final AtomicLong quutiAtomicLong = new AtomicLong();

    @Override
    public void connectionActivated() {
      this.cocsavAtomicLong.incrementAndGet();
      this.cocsiAtomicLong.decrementAndGet();
    }

    @Override
    public void connectionClosed() {
      this.cocsceAtomicLong.incrementAndGet();
      this.cocsiAtomicLong.decrementAndGet();
    }

    @Override
    public void connectionOpened() {
      this.cocsoeAtomicLong.incrementAndGet();
      this.cocsiAtomicLong.incrementAndGet();
    }

    @Override
    public void connectionWaiting() {
      this.cocsiAtomicLong.incrementAndGet();
      this.cocsavAtomicLong.decrementAndGet();
    }

    @Override
    public void messageProcessingCompleted(long _lgTp) {
      this.prcsgtmAtomicLong.addAndGet(_lgTp);
      this.mesedoAtomicLong.incrementAndGet();
    }

    @Override
    public void messageProcessingFailed() {
      this.mesefaeAtomicLong.incrementAndGet();
    }

    @Override
    public void messageProcessingStarted(long _lgTq) {
      this.quutiAtomicLong.addAndGet(_lgTq);
      this.megsaAtomicLong.incrementAndGet();
    }

    @Override
    public void messageReceived() {
      this.megrcdAtomicLong.incrementAndGet();
    }
  }
}
