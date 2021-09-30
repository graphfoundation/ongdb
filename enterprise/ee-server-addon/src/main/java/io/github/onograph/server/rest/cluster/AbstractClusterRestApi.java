package io.github.onograph.server.rest.cluster;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.server.rest.domain.JsonHelper;
import org.neo4j.server.rest.repr.OutputFormat;


abstract class AbstractClusterRestApi implements ClusterRestApi {


  protected final GraphDatabaseAPI dbGraphDatabaseAPI;


  protected final OutputFormat outputFormat;


  private final MultiGdbService scMultiGdbService;


  AbstractClusterRestApi(GraphDatabaseAPI _dGraphDatabaseAPI, OutputFormat _outputFormat,
      MultiGdbService _scMultiGdbService) {
    this.dbGraphDatabaseAPI = _dGraphDatabaseAPI;
    this.outputFormat = _outputFormat;
    this.scMultiGdbService = _scMultiGdbService;
  }


  private static Response _pltresResponse(Status stat, String _strBe) {
    return Response.status(stat).type(MediaType.TEXT_PLAIN_TYPE).entity(_strBe).build();
  }


  static Response neirseResponse() {
    return _pltresResponse(Status.NOT_FOUND, io.github.onograph.TokenConstants.FALSE);
  }


  static Response poirseResponse() {
    return _pltresResponse(Status.OK, io.github.onograph.TokenConstants.TRUE);
  }


  static Response sttrpsResponse(ClusterGdbStatusMeta _csrClusterGdbStatusMeta) {

    String _strOj = JsonHelper.writeValueAsString(_csrClusterGdbStatusMeta);
    return Response.status(Status.OK).type(io.github.onograph.TokenConstants.P_APPLICATION__JSON)
        .entity(_strOj).build();
  }

  @Override
  public final Response diceResponse() {
    return this.outputFormat.ok(new ClusterApiMappingRepresentation(
        this.scMultiGdbService.reavpaString(this.dbGraphDatabaseAPI.databaseName())));
  }
}
