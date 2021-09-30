package io.github.onograph.fabric

import io.github.onograph.config.EnterpriseFabricConfiguration
import io.github.onograph.config.EnterpriseFabricConfiguration.GdbWrapper
import org.neo4j.dbms.api.DatabaseManagementService
import org.neo4j.fabric.eval.Catalog.ExternalGraph
import org.neo4j.fabric.eval.{Catalog, CommunityCatalogManager, DatabaseLookup}
import org.neo4j.fabric.executor.Location
import org.neo4j.fabric.executor.Location.Remote.External
import org.neo4j.fabric.executor.Location.RemoteUri
import org.neo4j.kernel.database.NamedDatabaseId

import java.util.UUID
import scala.collection.JavaConverters._
import scala.collection.immutable.Set

class EnterpriseSingleCatalogManager(val databaseLookup: DatabaseLookup,
                                     val databaseManagementService: DatabaseManagementService,
                                     val fabricConfig: EnterpriseFabricConfiguration) extends CommunityCatalogManager(databaseLookup, databaseManagementService) {

  override def createCatalog: Catalog = {
    var catalog: Catalog = null
    if (fabricConfig.getGdbRef() == null) {
      return super.createCatalog()
    }

    val fabricNamespace: Option[String] = Option(fabricConfig.getGdbRef.getTitle.name)
    val fabricGraphs: Set[GdbWrapper] = fabricConfig.getGdbRef.getGdbWrappers.asScala.toSet
    val external = this.asExternal(fabricGraphs)
    val maxId: Long = external.reduceLeft((a, b) =>
      if (a.id > b.id) a else b
    ).id

    val internal: Seq[Catalog.InternalGraph] = asInternal(maxId)

    return Catalog.create(internal, external, fabricNamespace)

  }

  private def asExternal(graphs: Set[GdbWrapper]): Seq[ExternalGraph] = {
    graphs.map(g => ExternalGraph(g.getLgI, Option(g.getTitle.name()), new UUID(g.getLgI, 0L))).toSeq
  }

  override def locationOf(sessionDatabase: NamedDatabaseId, graph: Catalog.Graph, requireWritable: Boolean, canRoute: Boolean): Location = {
    if (graph.isInstanceOf[ExternalGraph]) {
      //val externalGraph: ExternalGraph = graph.asInstanceOf[ExternalGraph]
      val graphForId: GdbWrapper = this.graphsById.apply(graph.id)

      return new External(graph.id, graph.uuid, externalRemoteUri(graphForId.getFabricURI), graphForId.getStrDtbs).asInstanceOf[Location]

    }

    return super.locationOf(sessionDatabase, graph, requireWritable, canRoute)
  }

  private def graphsById: Map[Long, GdbWrapper] = {

    fabricConfig.getGdbRef.getGdbWrappers.asScala.map(g => g.getLgI -> g).toMap
  }

  private def externalRemoteUri(configUri: EnterpriseFabricConfiguration.FabricURI): RemoteUri = new Location.RemoteUri(configUri.getStrShm, configUri.getListAdessSocketAddress, configUri.getStrQey)
}