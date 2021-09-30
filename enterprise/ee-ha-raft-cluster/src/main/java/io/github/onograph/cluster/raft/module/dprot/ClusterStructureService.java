package io.github.onograph.cluster.raft.module.dprot;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.cuprot.CatchupNodeNotFoundException;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.cluster.raft.share.calg.NodeServerMemberLeaderMeta;
import io.github.onograph.dbms.DatabaseStateUpdateHandler;
import java.util.Map;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.Lifecycle;


public interface ClusterStructureService extends Lifecycle, DatabaseStateUpdateHandler {


  Map<ServerId, GdbDiscoveryMetaCoreImpl> alcesrrMap();


  Map<ServerId, DiscoveryGdbOperatorMetaWrapper> alcrstfrdbMap(NamedDatabaseId _namedDatabaseId);


  Map<ServerId, GdbDiscoveryMetaReadReplicaImpl> alrarlMap();


  Map<ServerId, DiscoveryGdbOperatorMetaWrapper> alrarlstfdteMap(NamedDatabaseId _namedDatabaseId);


  DatabaseCoreClusterStructure cotogfdaDatabaseCoreClusterStructure(
      NamedDatabaseId _namedDatabaseId);


  NodeServerMemberLeaderMeta geldNodeServerMemberLeaderMeta(NamedDatabaseId _namedDatabaseId);


  boolean isHet();


  ClusterNodeRoleType lokreClusterNodeRoleType(NamedDatabaseId _namedDatabaseId,
      ServerId _serverId);


  SocketAddress lopchadSocketAddress(ServerId _serverId) throws CatchupNodeNotFoundException;


  DiscoveryGdbOperatorMetaWrapper lopdbstDiscoveryGdbOperatorMetaWrapper(
      NamedDatabaseId _namedDatabaseId, ServerId _serverId);


  void ondabesoForNa(NamedDatabaseId _namedDatabaseId);


  void ondasForNa(NamedDatabaseId _namedDatabaseId);


  DatabaseReadReplicaClusterStructure rereatlfodaDatabaseReadReplicaClusterStructure(
      NamedDatabaseId _namedDatabaseId);


  ConsensusNodeId revrtmefsrConsensusNodeId(NamedDatabaseId _namedDatabaseId, ServerId _serverId);


  ServerId revsvfrrmrServerId(ConsensusNodeId _consensusNodeId);


  ServerId seviServerId();
}
