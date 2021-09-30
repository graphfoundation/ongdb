package io.github.onograph.metrics;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.config.Metrics;
import io.github.onograph.metrics.gdb.GdbMetricsEngine;
import io.github.onograph.metrics.outgoing.CsvScheduledReporter;
import io.github.onograph.metrics.outgoing.ReportingService;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.event.DatabaseEventContext;
import org.neo4j.graphdb.event.DatabaseEventListenerAdapter;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.monitoring.DatabaseEventListeners;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.logging.log4j.RotatingLogFileWriter;


public class MetricsServiceLifecycle implements Lifecycle, MetricsService {


  private final DatabaseEventListeners databaseEventListeners;


  private final MetricsServiceExtensionFactory.RequiredComponents dpnecRequiredComponents;


  private final ExtensionContext extensionContext;


  private final Log gLog;


  private final boolean isCniue;


  private final LifeSupport lifeSupport = new LifeSupport();


  private final MetricsIOResourceManager metricsIOResourceManager;


  private final MetricRegistryManager rmMetricRegistryManager;


  public MetricsServiceLifecycle(
      MetricsServiceExtensionFactory.RequiredComponents _dpnecRequiredComponents,
      ExtensionContext _extensionContext) {

    LogService _logService = _dpnecRequiredComponents.losveLogService();

    Config _config = _dpnecRequiredComponents.cofutnConfig();

    FileSystemAbstraction _fileSystemAbstraction = _dpnecRequiredComponents.fyaanFileSystemAbstraction();
    this.extensionContext = _extensionContext;
    this.dpnecRequiredComponents = _dpnecRequiredComponents;
    this.gLog = _logService.getUserLog(this.getClass());

    MetricRegistry _metricRegistry = new MetricRegistry();

    CsvScheduledReporter _crCsvScheduledReporter =
        new CsvScheduledReporter(_metricRegistry, _fileSystemAbstraction,
            _config.get(Metrics.settingCsphPath),
            _config.get(Metrics.settingCstnsLong),
            _config.get(Metrics.settingCsmaheInteger),
            _config.get(Metrics.settingCscsroCompressionOption),
            RotatingLogFileWriter::new, this.gLog);
    this.rmMetricRegistryManager = new MetricRegistryManager(_config.get(Metrics.settingMerslrList),
        _metricRegistry);
    this.metricsIOResourceManager = new MetricsIOResourceManager(_config, this.gLog,
        _crCsvScheduledReporter);
    this.isCniue =
        (new ReportingService(_config, _dpnecRequiredComponents.potrgtConnectorPortRegister(),
            _crCsvScheduledReporter, _fileSystemAbstraction,
            this.gLog, this.lifeSupport, _metricRegistry))
            .isCofu();
    this.databaseEventListeners = _dpnecRequiredComponents.daaeelsrDatabaseEventListeners();
  }

  @Override
  public MetricRegistryManager gerirMetricRegistryManager() {
    return this.rmMetricRegistryManager;
  }

  @Override
  public void init() {
    this.databaseEventListeners.registerDatabaseEventListener(this.metricsIOResourceManager);

    Config _config = this.dpnecRequiredComponents.cofutnConfig();
    if (_config.get(Metrics.settingMersaeBoolean)) {
      if (!this.isCniue) {

      } else {
        (new MetricsEngine(_config, this.dpnecRequiredComponents, this.extensionContext,
            this.lifeSupport, this.rmMetricRegistryManager)).exo();
        this.lifeSupport.init();
      }
    }
  }

  @Override
  public boolean isCoir() {
    return this.isCniue;
  }

  @Override
  public void shutdown() {
    this.lifeSupport.shutdown();
    this.databaseEventListeners.unregisterDatabaseEventListener(this.metricsIOResourceManager);
  }

  @Override
  public void start() {
    this.lifeSupport.start();
  }

  @Override
  public void stop() {
  }


  private static final class MetricsIOResourceManager extends DatabaseEventListenerAdapter {


    private final Config config;


    private final CsvScheduledReporter crCsvScheduledReporter;


    private final Log gLog;


    private MetricsIOResourceManager(Config _config, Log _gLog,
        CsvScheduledReporter _rcCsvScheduledReporter) {
      this.config = _config;
      this.crCsvScheduledReporter = _rcCsvScheduledReporter;
      this.gLog = _gLog;
    }

    @Override
    public void databaseDrop(DatabaseEventContext _databaseEventContext) {
      if (!(Boolean) this.config.get(Metrics.settingMeceebBoolean)) {
        if (this.config.get(Metrics.settingCsebdBoolean)) {

        }
      } else {
        this.crCsvScheduledReporter.deeaForSt(
            GdbMetricsEngine.daamtpxString(this.config, _databaseEventContext.getDatabaseName()));
      }
    }
  }
}
