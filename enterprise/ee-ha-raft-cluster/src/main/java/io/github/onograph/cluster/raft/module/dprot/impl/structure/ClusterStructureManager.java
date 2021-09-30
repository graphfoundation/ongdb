package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.cluster.UniqueAddress;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.module.dprot.DatabaseCoreClusterStructure;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public class ClusterStructureManager {


  DatabaseCoreClusterStructure buctogDatabaseCoreClusterStructure(
      @Nullable ConsensusMemberGroupId consensusMemberGroupId, DatabaseId _databaseId,
      StructureInfo _mdStructureInfo, ViewClusterInfo _viewClusterInfo) {

    Stream<UniqueAddress> _streamVr00UniqueAddress = _viewClusterInfo.avamesStream();
    Objects.requireNonNull(_mdStructureInfo);

    Map<ServerId, GdbDiscoveryMetaCoreImpl> _mapMcsg = _streamVr00UniqueAddress.flatMap(
        _mdStructureInfo::geseStream).filter((member) ->
    {
      return member.getIscGdbDiscoveryMetaCoreImpl()
          .stedaiSet()
          .contains(
              _databaseId);
    }).collect(
        Collectors.toMap(GdbDiscoveryMetaCoreWrapper::getServerId,
            GdbDiscoveryMetaCoreWrapper::getIscGdbDiscoveryMetaCoreImpl));
    return new DatabaseCoreClusterStructure(consensusMemberGroupId, _databaseId, _mapMcsg);
  }
}
