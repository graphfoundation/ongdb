package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.pagecache.monitoring.PageCacheCounters;


@Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED)
public class NeoPageCacheAdapter extends AbstractMetricsLifecycleAdapter {


  private static final String PAG_CAH_PRE = io.github.onograph.TokenConstants.PAGE_CACHE;


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_BTXS_IOX_TPX)
  private static final String PC_BTXS_IOX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.BYTES_WRITTEN);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_BTXS_RDX_TPX)
  private static final String PC_BTXS_RDX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.BYTES_READ);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_EVCO_ERRS_TPX)
  private static final String PC_EVCO_ERRS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.EVICTION_EXCEPTIONS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_EVCO_TPX)
  private static final String PC_EVCO_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.EVICTIONS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_FLSS_TPX)
  private static final String PC_FLSS_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.FLUSHES);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_HIT_RAI_TPX)
  private static final String PC_HIT_RAI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.HIT_RATIO);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_HIT_TPX)
  private static final String PC_HIT_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.HITS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_IOP_LIIR_MIL_TPX)
  private static final String PC_IOP_LIIR_MIL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.THROTTLED__MILLIS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_IOP_LIIR_TIE_TPX)
  private static final String PC_IOP_LIIR_TIE_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.THROTTLED__TIMES);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_IOP_TPX)
  private static final String PC_IOP_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.IOPS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_MEG_TPX)
  private static final String PC_MEG_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.MERGES);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_PAG_FAL_TPX)
  private static final String PC_PAG_FAL_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.PAGE_FAULTS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_PIN_TPX)
  private static final String PC_PIN_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.PINS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_UNI_TPX)
  private static final String PC_UNI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.UNPINS);


  @Documented(io.github.onograph.TokenConstants.NEO_PAGE_CACHE_ADAPTER___DOCUMENTED_PC_USX_RAI_TPX)
  private static final String PC_USX_RAI_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.PAGE_CACHE,
          io.github.onograph.TokenConstants.USAGE_RATIO);


  private final MetricRegistryManager metricRegistryManager;


  private final PageCacheCounters pageCacheCounters;


  private final String strEep;


  private final String strEp;


  private final String strFp;


  private final String strFpp;


  private final String strMloip;


  private final String strPbw;


  private final String strPh;


  private final String strPm;


  private final String strPp;


  private final String strPqpoip;


  private final String strRbp;


  private final String strRhp;


  private final String strRup;


  private final String strTloip;


  private final String strUp;

  public NeoPageCacheAdapter() {
    this("", null, null);
  }

  public NeoPageCacheAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      PageCacheCounters _pageCacheCounters) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.metricRegistryManager = _metricRegistryManager;
    this.pageCacheCounters = _pageCacheCounters;
    this.strEep = MetricRegistry.name(mprnm, PC_EVCO_ERRS_TPX);
    this.strFp = MetricRegistry.name(mprnm, PC_FLSS_TPX);
    this.strPm = MetricRegistry.name(mprnm, PC_MEG_TPX);
    this.strUp = MetricRegistry.name(mprnm, PC_UNI_TPX);
    this.strPp = MetricRegistry.name(mprnm, PC_PIN_TPX);
    this.strEp = MetricRegistry.name(mprnm, PC_EVCO_TPX);
    this.strFpp = MetricRegistry.name(mprnm, PC_PAG_FAL_TPX);
    this.strPh = MetricRegistry.name(mprnm, PC_HIT_TPX);
    this.strRhp = MetricRegistry.name(mprnm, PC_HIT_RAI_TPX);
    this.strRup = MetricRegistry.name(mprnm, PC_USX_RAI_TPX);
    this.strRbp = MetricRegistry.name(mprnm, PC_BTXS_RDX_TPX);
    this.strPbw = MetricRegistry.name(mprnm, PC_BTXS_IOX_TPX);
    this.strPqpoip = MetricRegistry.name(mprnm, PC_IOP_TPX);
    this.strTloip = MetricRegistry.name(mprnm, PC_IOP_LIIR_TIE_TPX);
    this.strMloip = MetricRegistry.name(mprnm, PC_IOP_LIIR_MIL_TPX);
  }

  @Override
  public void start() {
    Objects.requireNonNull(pageCacheCounters);
    this.metricRegistryManager.reieForStSu(this.strFpp, () ->
    {

      return new MetricsMeter(pageCacheCounters::faults);
    });
    this.metricRegistryManager.reieForStSu(this.strEp, () ->
    {

      return new MetricsMeter(pageCacheCounters::evictions);
    });
    this.metricRegistryManager.reieForStSu(this.strPp, () ->
    {

      return new MetricsMeter(pageCacheCounters::pins);
    });
    this.metricRegistryManager.reieForStSu(this.strUp, () ->
    {

      return new MetricsMeter(pageCacheCounters::unpins);
    });
    this.metricRegistryManager.reieForStSu(this.strPh, () ->
    {

      return new MetricsMeter(pageCacheCounters::hits);
    });
    this.metricRegistryManager.reieForStSu(this.strFp, () ->
    {

      return new MetricsMeter(pageCacheCounters::flushes);
    });
    this.metricRegistryManager.reieForStSu(this.strPm, () ->
    {

      return new MetricsMeter(pageCacheCounters::merges);
    });
    this.metricRegistryManager.reieForStSu(this.strEep, () ->
    {

      return new MetricsMeter(pageCacheCounters::evictionExceptions);
    });
    this.metricRegistryManager.reieForStSu(this.strRhp, () ->
    {
      return new GaugePageCacheCountersImpl(this.pageCacheCounters);
    });
    this.metricRegistryManager.reieForStSu(this.strRup, () ->
    {

      return new MetricsMeter(() -> Double.doubleToLongBits(pageCacheCounters.usageRatio()));
    });
    this.metricRegistryManager.reieForStSu(this.strRbp, () ->
    {

      return new MetricsMeter(pageCacheCounters::bytesRead);
    });
    this.metricRegistryManager.reieForStSu(this.strPbw, () ->
    {

      return new MetricsMeter(pageCacheCounters::bytesWritten);
    });

    this.metricRegistryManager.reieForStSu(this.strPqpoip, () ->
    {

      return new MetricsMeter(pageCacheCounters::iopqPerformed);
    });

    this.metricRegistryManager.reieForStSu(this.strTloip, () ->
    {

      return new MetricsMeter(pageCacheCounters::ioLimitedTimes);
    });

    this.metricRegistryManager.reieForStSu(this.strMloip, () ->
    {

      return new MetricsMeter(pageCacheCounters::ioLimitedMillis);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strFpp);
    this.metricRegistryManager.reoForSt(this.strEp);
    this.metricRegistryManager.reoForSt(this.strPp);
    this.metricRegistryManager.reoForSt(this.strUp);
    this.metricRegistryManager.reoForSt(this.strPh);
    this.metricRegistryManager.reoForSt(this.strPm);
    this.metricRegistryManager.reoForSt(this.strFp);
    this.metricRegistryManager.reoForSt(this.strEep);
    this.metricRegistryManager.reoForSt(this.strRhp);
    this.metricRegistryManager.reoForSt(this.strRup);
    this.metricRegistryManager.reoForSt(this.strRbp);
    this.metricRegistryManager.reoForSt(this.strPbw);
    this.metricRegistryManager.reoForSt(this.strPqpoip);
    this.metricRegistryManager.reoForSt(this.strTloip);
    this.metricRegistryManager.reoForSt(this.strMloip);
  }
}
