package io.github.onograph.fabric

import io.github.onograph.config.EnterpriseFabricConfiguration
import io.github.onograph.fabric.ClusteringEnterpriseCatalogManager.LeaderStatus
import org.neo4j.configuration.helpers.{NormalizedDatabaseName, SocketAddress}
import org.neo4j.dbms.api.DatabaseManagementService
import org.neo4j.fabric.eval.Catalog.InternalGraph
import org.neo4j.fabric.eval.{Catalog, DatabaseLookup}
import org.neo4j.fabric.executor.{FabricException, Location}
import org.neo4j.fabric.executor.Location.Local
import org.neo4j.fabric.executor.Location.Remote.Internal
import org.neo4j.kernel.api.exceptions.Status.Cluster
import org.neo4j.kernel.database.NamedDatabaseId


object ClusteringEnterpriseCatalogManager {

  sealed trait RoutingMode {
  }

  trait LeaderStatus {

  }

  class LeaderIsLocal() extends LeaderStatus {
    override def toString: String = "LeaderIsLocal"
  }

  class LeaderIsRemote(leaderSocketAddress: SocketAddress) extends LeaderStatus {
    override def toString: String = "LeaderIsRemote"

    def socketAddress: SocketAddress = leaderSocketAddress

  }

  class LeaderNotFound() extends LeaderStatus {
    override def toString: String = "LeaderNotFound"
  }

  case object RoutingPossible extends RoutingMode {
    override def toString: String = "RoutingPossible"
  }

  case object RoutingDisallowed extends RoutingMode {
    override def toString: String = "RoutingDisallowed"
  }

  case object RoutingDisabled extends RoutingMode {
    override def toString: String = "RoutingDisabled"
  }

}

class ClusterCatalogManager(databaseLookup: DatabaseLookup,
                            databaseManagementService: DatabaseManagementService,
                            leaderLookup: LeaderLookup,
                            fabricConfig: EnterpriseFabricConfiguration,
                            routingEnabled: Boolean) extends EnterpriseSingleCatalogManager(databaseLookup, databaseManagementService, fabricConfig) {

  /**
   *
   * @param graph
   * @param requireWritable
   * @param canRoute
   * @return
   */
  override def locationOf(sessionDatabase: NamedDatabaseId, graph: Catalog.Graph,
                          requireWritable: Boolean,
                          canRoute: Boolean): Location = {
    if (graph.isInstanceOf[InternalGraph]) {
      var normalizedDatabaseName: NormalizedDatabaseName = (graph.asInstanceOf[InternalGraph]).databaseName;

      var namedDatabaseId: NamedDatabaseId = this.databaseId(normalizedDatabaseName);

      if (requireWritable && canRoute) {
        var leaderStatus: LeaderStatus = this.determineLeader(namedDatabaseId)

        if (leaderStatus.toString.equals("LeaderIsLocal")) {
          return new Local(graph.id, graph.uuid, normalizedDatabaseName.name())
        } else {
          if (leaderStatus.toString.equals("LeaderIsRemote")) {
            new Internal(graph.id, graph.uuid, this.internalRemoteUri(leaderStatus.asInstanceOf[ClusteringEnterpriseCatalogManager.LeaderIsRemote].socketAddress), normalizedDatabaseName.name())
          } else {

          }
        }

      }
    }

    super.locationOf(sessionDatabase, graph, requireWritable, canRoute);
  }

  private def internalRemoteUri(socketAddress: SocketAddress) = new Location.RemoteUri("bolt", null, "")

  private def determineLeader(dbId: NamedDatabaseId): LeaderStatus = {
    // val dbId = this.databaseId(databaseName)
    val myId = this.leaderLookup.serverId
    val optionMemberId = leaderLookup.leaderId(dbId)

    if (optionMemberId.nonEmpty) {
      val newMemberId = optionMemberId.get
      if (newMemberId.equals(myId)) {
        return new ClusteringEnterpriseCatalogManager.LeaderIsRemote(leaderBoltAddress(dbId));
      }

    } else {
      if (None.equals(optionMemberId)) {
        this.noLeaderAddress(dbId.name())
      }
      throw new MatchError(optionMemberId)
    }

    return new ClusteringEnterpriseCatalogManager.LeaderIsLocal()
  }

  private def databaseId(databaseName: NormalizedDatabaseName): NamedDatabaseId = {
    val dbId: NamedDatabaseId = this.databaseLookup.databaseId(databaseName).getOrElse(
      null
    )

    if (dbId == null) {
      this.routingFailed("Unable to get database id for database %s", databaseName.name)
    }

    dbId
  }

  private def leaderBoltAddress(databaseId: NamedDatabaseId): SocketAddress = {
    val dbId: SocketAddress = leaderLookup.leaderBoltAddress(databaseId).getOrElse(
      null
    );

    if (dbId == null) {
      this.noLeaderAddress(databaseId.name())
    }

    dbId
  }

  private def noLeaderAddress(dbName: String): Unit = {
    this.routingFailed("Unable to get bolt address of LEADER for database %s", dbName)
  }

  private def routingFailed(msg: String, dbName: String): Unit = {
    throw new FabricException(Cluster.Routing, msg, dbName)
  }

}
