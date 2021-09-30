package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.kernel.database.DatabaseId;


public class CoreClusterStructureServiceHandler {


  private final Set<io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler> setLseesCoreStructureHandler =
      ConcurrentHashMap.newKeySet();


  public void adcrtolnForCo(
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _lseeCoreStructureHandler) {
    this.setLseesCoreStructureHandler.add(_lseeCoreStructureHandler);
  }


  public void noyleForDaSe(DatabaseId _databaseId, Set<ConsensusNodeId> _setImConsensusNodeId) {

    Iterator _iterator = this.setLseesCoreStructureHandler.iterator();

    while (_iterator.hasNext()) {

      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _lseeCoreStructureHandler =
          (io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler) _iterator.next();
      if (_lseeCoreStructureHandler.nadaiNamedDatabaseId().databaseId().equals(_databaseId)) {
        _lseeCoreStructureHandler.oncetlchForSe(_setImConsensusNodeId);
      }
    }
  }


  public void reectolsrForCo(
      io.github.onograph.cluster.raft.module.dprot.CoreClusterStructureService.CoreStructureHandler _lseeCoreStructureHandler) {
    this.setLseesCoreStructureHandler.remove(_lseeCoreStructureHandler);
  }
}
