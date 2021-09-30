package io.github.onograph.metrics;

import io.github.onograph.config.Metrics;
import io.github.onograph.metrics.incoming.JettyAdapter;
import io.github.onograph.metrics.incoming.cluster.DiscoveryCoreNodeAdapter;
import io.github.onograph.metrics.incoming.gdb.BoltAdapter;
import io.github.onograph.metrics.incoming.gdb.GdbActionsAdapter;
import io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl;
import io.github.onograph.metrics.incoming.gdb.NeoPageCacheAdapter;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterFileStatImpl;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterGarbageCollectionImpl;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterMBImpl;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterMemoryHeapImpl;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterPoolImpl;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterSDPImpl;
import io.github.onograph.metrics.incoming.jvm.JVMAdapterThreadMXImpl;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.configuration.connectors.HttpConnector;
import org.neo4j.configuration.connectors.HttpsConnector;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.LifeSupport;


public class MetricsEngine {


  private final Config config;


  private final MetricsServiceExtensionFactory.RequiredComponents dpnecRequiredComponents;


  private final ExtensionContext extensionContext;


  private final LifeSupport lifeSupport;


  private final MetricRegistryManager metricRegistryManager;


  MetricsEngine(Config _config,
      MetricsServiceExtensionFactory.RequiredComponents _dpnecRequiredComponents,
      ExtensionContext _extensionContext, LifeSupport _lifeSupport,
      MetricRegistryManager _metricRegistryManager) {
    this.config = _config;
    this.dpnecRequiredComponents = _dpnecRequiredComponents;
    this.extensionContext = _extensionContext;
    this.lifeSupport = _lifeSupport;
    this.metricRegistryManager = _metricRegistryManager;
  }


  public void exo() {

    String _strPmg =
        this.config.get(Metrics.settingMeceebBoolean) ? this.config.get(Metrics.settingMersexString)
            +
            io.github.onograph.TokenConstants.__DBMS
            : this.config.get(Metrics.settingMersexString);
    this.lifeSupport.add(new NeoPageCacheAdapter(_strPmg, this.metricRegistryManager,
        this.dpnecRequiredComponents.pacacorPageCacheCounters()));
    this.lifeSupport.add(new JVMAdapterGarbageCollectionImpl(_strPmg, this.metricRegistryManager));
    this.lifeSupport.add(new JVMAdapterMemoryHeapImpl(_strPmg, this.metricRegistryManager));
    this.lifeSupport.add(new JVMAdapterThreadMXImpl(_strPmg, this.metricRegistryManager));
    this.lifeSupport.add(new JVMAdapterPoolImpl(_strPmg, this.metricRegistryManager));
    this.lifeSupport.add(new JVMAdapterMBImpl(_strPmg, this.metricRegistryManager));
    this.lifeSupport.add(new JVMAdapterFileStatImpl(_strPmg, this.metricRegistryManager));
    this.lifeSupport.add(new JVMAdapterSDPImpl(_strPmg, this.metricRegistryManager,
        this.dpnecRequiredComponents.moirMonitors()));
    if (this.config.get(GraphDatabaseSettings.mode) == Mode.CORE) {
      this.lifeSupport.add(
          new DiscoveryCoreNodeAdapter(_strPmg, this.dpnecRequiredComponents.moirMonitors(),
              this.metricRegistryManager));
    }

    this.lifeSupport.add(new BoltAdapter(_strPmg, this.metricRegistryManager,
        this.dpnecRequiredComponents.moirMonitors()));
    this.lifeSupport.add(new GdbActionsAdapter(_strPmg, this.metricRegistryManager,
        this.dpnecRequiredComponents.daaoeocnDatabaseOperationCounts()));
    this.lifeSupport.add(
        new MemoryPoolsAdapterNeoStackImpl(this.config.get(Metrics.settingMersexString),
            this.metricRegistryManager,
            this.dpnecRequiredComponents.meoplMemoryPools()));

    boolean _isHohe =
        this.config.get(HttpConnector.enabled) || this.config.get(HttpsConnector.enabled);
    if (_isHohe) {
      this.lifeSupport.add(new JettyAdapter(_strPmg, this.metricRegistryManager,
          this.dpnecRequiredComponents.wecneteifSupplier()));
    }
  }
}
