package io.github.onograph.dbms;

import java.util.stream.Stream;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.logging.LogProvider;


public class MediationDbmsManagers {


  private final DbmsManagerDefaultImpl olDbmsManagerDefaultImpl;


  private final DbmsManagerWatchTagImpl oqDbmsManagerWatchTagImpl;


  private final DbmsManagerShutdownImpl osDbmsManagerShutdownImpl;


  private final KernelDbmsManager osrKernelDbmsManager;


  private final InitializerDbmsManager ossInitializerDbmsManager;


  public MediationDbmsManagers(DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel,
      GlobalModule _globalModule, HealthMonitorService healthMonitorService,
      ReconciledTransactionTracker _ttrReconciledTransactionTracker) {

    LogProvider _itraLogProvider = _globalModule.getLogService().getInternalLogProvider();

    Mode mdstr = _globalModule.getGlobalConfig().get(GraphDatabaseSettings.mode);
    this.olDbmsManagerDefaultImpl = new DbmsManagerDefaultImpl();
    this.ossInitializerDbmsManager = new InitializerDbmsManager(_globalModule.getGlobalConfig(),
        _defaultSystemGraphDbmsModel, _itraLogProvider);
    this.osrKernelDbmsManager = new KernelDbmsManager(_defaultSystemGraphDbmsModel,
        _itraLogProvider, mdstr, _ttrReconciledTransactionTracker);
    this.osDbmsManagerShutdownImpl = new DbmsManagerShutdownImpl(_globalModule.getGlobalConfig());
    this.oqDbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(healthMonitorService,
        _itraLogProvider);
    _globalModule.getGlobalDependencies()
        .satisfyDependencies(this.olDbmsManagerDefaultImpl, this.osrKernelDbmsManager,
            this.oqDbmsManagerWatchTagImpl);
  }


  public DbmsManagerWatchTagImpl getOqDbmsManagerWatchTagImpl() {
    return this.oqDbmsManagerWatchTagImpl;
  }


  public DbmsManagerShutdownImpl getOsDbmsManagerShutdownImpl() {
    return this.osDbmsManagerShutdownImpl;
  }


  public KernelDbmsManager getOsrKernelDbmsManager() {
    return this.osrKernelDbmsManager;
  }


  public InitializerDbmsManager getOssInitializerDbmsManager() {
    return this.ossInitializerDbmsManager;
  }


  protected Stream<AbstractDbmsManager> innoerStream() {
    return Stream.of(this.olDbmsManagerDefaultImpl, this.osDbmsManagerShutdownImpl,
        this.oqDbmsManagerWatchTagImpl);
  }
}
