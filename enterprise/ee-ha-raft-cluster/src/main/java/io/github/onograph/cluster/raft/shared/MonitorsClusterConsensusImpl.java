package io.github.onograph.cluster.raft.shared;

import org.neo4j.collection.Dependencies;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.monitoring.Monitors;


public class MonitorsClusterConsensusImpl extends Monitors {

  private MonitorsClusterConsensusImpl(Monitors _prnMonitors) {
    super(_prnMonitors, NullLogProvider.getInstance());
  }


  public static MonitorsClusterConsensusImpl craMonitorsClusterConsensusImpl(
      Dependencies _cutrDependencies, Monitors _goaMonitors) {

    MonitorsClusterConsensusImpl _monitorsClusterConsensusImpl = new MonitorsClusterConsensusImpl(
        _goaMonitors);
    _cutrDependencies.satisfyDependency(_monitorsClusterConsensusImpl);
    return _monitorsClusterConsensusImpl;
  }
}
