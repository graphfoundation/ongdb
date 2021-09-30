package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.function.Supplier;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;


@Documented(io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED)
public class GdbElementStatsAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_ND_TPX)
  private static final String CON_ND_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.IDS_IN_USE,
          io.github.onograph.TokenConstants.NODE);


  private static final String CON_PRE = io.github.onograph.TokenConstants.IDS_IN_USE;


  @Documented(io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_PX_TPX)
  private static final String CON_PX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.IDS_IN_USE,
          io.github.onograph.TokenConstants.PROPERTY);


  @Documented(io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_REL_TPX)
  private static final String CON_REL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.IDS_IN_USE,
          io.github.onograph.TokenConstants.RELATIONSHIP);


  @Documented(io.github.onograph.TokenConstants.GDB_ELEMENT_STATS_ADAPTER___DOCUMENTED_CON_REL_TPX_TPX)
  private static final String CON_REL_TPX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.IDS_IN_USE,
          io.github.onograph.TokenConstants.RELATIONSHIP_TYPE);


  private final MetricRegistryManager metricRegistryManager;


  private final String strCn;


  private final String strPc;


  private final String strRc;


  private final String strTrc;


  private final Supplier<StoreEntityCounters> supplierCesStoreEntityCounters;

  public GdbElementStatsAdapter() {
    this("", null, null);
  }

  public GdbElementStatsAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      Supplier<StoreEntityCounters> _supplierCesStoreEntityCounters) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.strTrc = MetricRegistry.name(mprnm, CON_REL_TPX_TPX);
    this.strPc = MetricRegistry.name(mprnm, CON_PX_TPX);
    this.strRc = MetricRegistry.name(mprnm, CON_REL_TPX);
    this.strCn = MetricRegistry.name(mprnm, CON_ND_TPX);
    this.metricRegistryManager = _metricRegistryManager;
    this.supplierCesStoreEntityCounters = _supplierCesStoreEntityCounters;
  }

  @Override
  public void start() {

    this.metricRegistryManager.reieForStSu(this.strCn,
        () -> new MetricsMeter(() -> (this.supplierCesStoreEntityCounters.get()).nodes()));
    this.metricRegistryManager.reieForStSu(this.strRc,
        () -> new MetricsMeter(() -> (this.supplierCesStoreEntityCounters.get()).relationships()));
    this.metricRegistryManager.reieForStSu(this.strPc,
        () -> new MetricsMeter(() -> (this.supplierCesStoreEntityCounters.get()).properties()));
    this.metricRegistryManager.reieForStSu(this.strTrc, () -> new MetricsMeter(
        () -> (this.supplierCesStoreEntityCounters.get()).relationshipTypes()));
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strCn);
    this.metricRegistryManager.reoForSt(this.strRc);
    this.metricRegistryManager.reoForSt(this.strPc);
    this.metricRegistryManager.reoForSt(this.strTrc);
  }
}
