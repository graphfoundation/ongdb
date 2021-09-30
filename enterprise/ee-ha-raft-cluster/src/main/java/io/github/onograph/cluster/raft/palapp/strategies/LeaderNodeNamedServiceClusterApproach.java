package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.module.dprot.ClusterNodeRoleType;
import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.cluster.raft.palapp.NamedServiceApproachException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class LeaderNodeNamedServiceClusterApproach extends AbstractNamedServiceClusterApproach {


  public static final String IDNT = io.github.onograph.TokenConstants.LEADER_ONLY;

  public LeaderNodeNamedServiceClusterApproach() {
    super(io.github.onograph.TokenConstants.LEADER_ONLY);
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {

    Set<ServerId> _setIscServerId = this.clusterStructureService.cotogfdaDatabaseCoreClusterStructure(
        _namedDatabaseId).sevsMap().keySet();
    if (_setIscServerId.isEmpty()) {

      throw new NamedServiceApproachException("*** Error:  0a2a53f0-c885-4dd1-a84e-7000332d55b1");
    } else {

      Iterator _iterator = _setIscServerId.iterator();

      ServerId _serverId;

      ClusterNodeRoleType r;
      do {
        if (!_iterator.hasNext()) {
          return Optional.empty();
        }

        _serverId = (ServerId) _iterator.next();
        r = this.clusterStructureService.lokreClusterNodeRoleType(_namedDatabaseId, _serverId);
      }
      while (r != ClusterNodeRoleType.LEADER || Objects.equals(this.myeServerId, _serverId));

      return Optional.of(_serverId);
    }
  }
}
