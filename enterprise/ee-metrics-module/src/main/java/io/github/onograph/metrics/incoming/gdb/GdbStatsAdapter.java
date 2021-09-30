package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.function.Supplier;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.stats.StoreEntityCounters;


@Documented(io.github.onograph.TokenConstants.GDB_STATS_ADAPTER___DOCUMENTED)
public class GdbStatsAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.GDB_STATS_ADAPTER___DOCUMENTED_CON_ND_TPX)
  public static final String CON_ND_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.NEO4J__COUNT,
          io.github.onograph.TokenConstants.NODE);


  @Documented(io.github.onograph.TokenConstants.GDB_STATS_ADAPTER___DOCUMENTED_CON_REL_TPX)
  public static final String CON_REL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.NEO4J__COUNT,
          io.github.onograph.TokenConstants.RELATIONSHIP);


  private static final String CON_PRE = io.github.onograph.TokenConstants.NEO4J__COUNT;


  private static final String CSZ_ALL_NOE_LT = io.github.onograph.TokenConstants.COUNT_ALL_NODES_METRICS;


  private static final String CSZ_ALL_REL_LT = io.github.onograph.TokenConstants.COUNT_ALL_RELATIONSHIP_METRICS;


  private final MetricRegistryManager metricRegistryManager;


  private final PageCacheTracer pageCacheTracer;


  private final String strCn;


  private final String strRc;


  private final Supplier<StoreEntityCounters> supplierScStoreEntityCounters;

  public GdbStatsAdapter() {
    this("", null, null, null);
  }

  public GdbStatsAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      Supplier<StoreEntityCounters> _supplierScStoreEntityCounters,
      PageCacheTracer _pageCacheTracer) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.strCn = MetricRegistry.name(mprnm, CON_ND_TPX);
    this.strRc = MetricRegistry.name(mprnm, CON_REL_TPX);
    this.metricRegistryManager = _metricRegistryManager;
    this.supplierScStoreEntityCounters = _supplierScStoreEntityCounters;
    this.pageCacheTracer = _pageCacheTracer;
  }

  @Override
  public void start() {
    this.metricRegistryManager.reieForStSu(this.strCn, () ->
    {
      return new MetricsMeter(() ->
      {

        CursorContext _cursorContext =
            new CursorContext(this.pageCacheTracer.createPageCursorTracer(
                io.github.onograph.TokenConstants.COUNT_ALL_NODES_METRICS));

        Long _lgVa;
        try {
          _lgVa = this.supplierScStoreEntityCounters.get().allNodesCountStore(_cursorContext);
        } catch (

            Throwable _throwable) {
          try {
            _cursorContext.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }

          throw _throwable;
        }

        _cursorContext.close();
        return _lgVa;
      });
    });
    this.metricRegistryManager.reieForStSu(this.strRc, () ->
    {
      return new MetricsMeter(() ->
      {

        CursorContext _cursorContext2 =
            new CursorContext(this.pageCacheTracer.createPageCursorTracer(
                io.github.onograph.TokenConstants.COUNT_ALL_RELATIONSHIP_METRICS));

        Long _lgVar;
        try {
          _lgVar = this.supplierScStoreEntityCounters.get()
              .allRelationshipsCountStore(_cursorContext2);
        } catch (

            Throwable _throwable3) {
          try {
            _cursorContext2.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }

          throw _throwable3;
        }

        _cursorContext2.close();
        return _lgVar;
      });
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strRc);
    this.metricRegistryManager.reoForSt(this.strCn);
  }
}
