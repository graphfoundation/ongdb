package io.github.onograph.server.rest.cluster;

import javax.ws.rs.core.Response;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.server.rest.repr.OutputFormat;


class SingleGdbRestApi extends AbstractClusterRestApi {


  private final SingleGdbInfoService pssSingleGdbInfoService;


  SingleGdbRestApi(GraphDatabaseAPI _graphDatabaseAPI, OutputFormat _outputFormat,
      MultiGdbService _scMultiGdbService) {
    super(_graphDatabaseAPI, _outputFormat, _scMultiGdbService);
    this.pssSingleGdbInfoService = new SingleGdbInfoService(_graphDatabaseAPI);
  }

  @Override
  public Response avibResponse() {
    return poirseResponse();
  }

  @Override
  public Response decpoResponse() {
    return sttrpsResponse(this.pssSingleGdbInfoService.curtsasClusterGdbStatusMeta());
  }

  @Override
  public Response redlResponse() {
    return neirseResponse();
  }

  @Override
  public Response wrtlResponse() {
    return poirseResponse();
  }
}
