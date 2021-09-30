package io.github.onograph.dbms;

import java.util.stream.Stream;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.graphdb.factory.module.GlobalModule;


public class ClusteringMediationDbmsManagers extends MediationDbmsManagers {


  private final DbmsManagerClusterImpl oicDbmsManagerClusterImpl = new DbmsManagerClusterImpl();


  public ClusteringMediationDbmsManagers(DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel,
      GlobalModule _globalModule, HealthMonitorService healthMonitorService,
      ReconciledTransactionTracker _ttrReconciledTransactionTracker) {
    super(_defaultSystemGraphDbmsModel, _globalModule, healthMonitorService,
        _ttrReconciledTransactionTracker);
  }


  public DbmsManagerClusterImpl getOicDbmsManagerClusterImpl() {
    return this.oicDbmsManagerClusterImpl;
  }

  @Override
  protected Stream<AbstractDbmsManager> innoerStream() {
    return Stream.concat(Stream.of(this.oicDbmsManagerClusterImpl), super.innoerStream());
  }
}
