package io.github.onograph.server.rest.cluster;

import javax.ws.rs.core.Response;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.server.rest.repr.OutputFormat;


class ReadReplicaRestApi extends AbstractClusterRestApi {


  private final ClusterReadReplicaInfoService psrClusterReadReplicaInfoService;


  ReadReplicaRestApi(GraphDatabaseAPI _graphDatabaseAPI, OutputFormat _outputFormat,
      MultiGdbService _scMultiGdbService) {
    super(_graphDatabaseAPI, _outputFormat, _scMultiGdbService);
    this.psrClusterReadReplicaInfoService = new ClusterReadReplicaInfoService(_graphDatabaseAPI);
  }

  @Override
  public Response avibResponse() {
    return poirseResponse();
  }

  @Override
  public Response decpoResponse() {
    return sttrpsResponse(this.psrClusterReadReplicaInfoService.curtsasClusterGdbStatusMeta());
  }

  @Override
  public Response redlResponse() {
    return poirseResponse();
  }

  @Override
  public Response wrtlResponse() {
    return neirseResponse();
  }
}
