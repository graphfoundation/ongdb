package io.github.onograph.fabric

import io.github.onograph.cluster.raft.gateway.gwlb.ClusterLeader
import io.github.onograph.cluster.raft.module.dprot.{ClusterStructureService, DiscoverySocketAddresses, GdbDiscoveryMetaCoreImpl}
import org.neo4j.configuration.helpers.SocketAddress
import org.neo4j.dbms.identity.ServerId
import org.neo4j.kernel.database.NamedDatabaseId

import scala.collection.JavaConverters._

trait LeaderLookup {
  def serverId: ServerId

  def leaderId(databaseId: NamedDatabaseId): Option[ServerId]

  def leaderBoltAddress(databaseId: NamedDatabaseId): Option[SocketAddress]
}

object LeaderLookup {

  private def getAddress(connectors: DiscoverySocketAddresses): Option[SocketAddress] = {
    val address = connectors.incebtaeOptional
    if (address.isPresent) {
      return Option(address.get)
    }
    else {
      Option.empty[SocketAddress]
    }
  }

  class Core(topologyService: ClusterStructureService, leaderService: ClusterLeader) extends LeaderLookup {
    def serverId: ServerId = topologyService.seviServerId

    def leaderId(databaseId: NamedDatabaseId): Option[ServerId] = Option(leaderService.geldiOptional(databaseId).get())

    def leaderBoltAddress(databaseId: NamedDatabaseId): Option[SocketAddress] = Option(leaderService.gelaboadOptional(databaseId).get())
  }

  class ReadReplica(topologyService: ClusterStructureService) extends LeaderLookup {
    def serverId: ServerId = topologyService.seviServerId

    def leaderBoltAddress(databaseId: NamedDatabaseId): Option[SocketAddress] = {
      leaderId(databaseId).map((leader) => (leader, topologyService.cotogfdaDatabaseCoreClusterStructure(databaseId).sevsMap().asScala.toMap)).flatMap((t) => {
        val leader: ServerId = t._1
        val members: Map[ServerId, GdbDiscoveryMetaCoreImpl] = t._2
        val address = getAddress(members.get(leader).map(leaderInfo => leaderInfo.contsDiscoverySocketAddresses).get)
        return address
      })
    }

    override def leaderId(databaseId: NamedDatabaseId): Option[ServerId] = {

      Some(this.topologyService.alcesrrMap.asScala.find(tuple2 => {
        val mId: ServerId = tuple2._1

        topologyService.geldNodeServerMemberLeaderMeta(databaseId).getImConsensusNodeId() == mId

      }).get._1)
    }
  }

}