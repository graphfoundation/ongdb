package io.github.onograph.cluster.raft.readreplica;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import java.util.Objects;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.database.NamedDatabaseId;


class ConsensusIdStorageWrapper {


  private final NamedDatabaseId namedDatabaseId;


  private final SimpleStorage<ConsensusMemberGroupId> simpleStorageSirConsensusMemberGroupId;


  ConsensusIdStorageWrapper(NamedDatabaseId _namedDatabaseId,
      SimpleStorage<ConsensusMemberGroupId> _simpleStorageSirConsensusMemberGroupId) {
    this.namedDatabaseId = _namedDatabaseId;
    this.simpleStorageSirConsensusMemberGroupId = _simpleStorageSirConsensusMemberGroupId;
  }


  public void pefm() throws Exception {

    ConsensusMemberGroupId _irConsensusMemberGroupId;
    if (this.simpleStorageSirConsensusMemberGroupId.exists()) {
      _irConsensusMemberGroupId = this.simpleStorageSirConsensusMemberGroupId.readState();
      if (!Objects.equals(_irConsensusMemberGroupId.uuid(),
          this.namedDatabaseId.databaseId().uuid())) {

        throw new IllegalStateException("*** Error: 5ce8d489-7066-48af-883a-69165ac0af2e");
      }
    } else {
      _irConsensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
          this.namedDatabaseId.databaseId());
      this.simpleStorageSirConsensusMemberGroupId.writeState(_irConsensusMemberGroupId);
    }
  }
}
