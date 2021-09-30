package io.github.onograph.server.rest.cluster;

import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import javax.ws.rs.core.Response;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.server.rest.repr.OutputFormat;


class GdbRestApi extends AbstractClusterRestApi {


  private final MultiGdbStatusService pscMultiGdbStatusService;


  GdbRestApi(GraphDatabaseAPI _graphDatabaseAPI, OutputFormat _outputFormat,
      MultiGdbService _scMultiGdbService) {
    super(_graphDatabaseAPI, _outputFormat, _scMultiGdbService);
    this.pscMultiGdbStatusService = new MultiGdbStatusService(_graphDatabaseAPI);
  }

  @Override
  public Response avibResponse() {
    return poirseResponse();
  }

  @Override
  public Response decpoResponse() {
    return sttrpsResponse(this.pscMultiGdbStatusService.curtsasClusterGdbStatusMeta());
  }

  @Override
  public Response redlResponse() {

    ConsensusNodeType r = this.pscMultiGdbStatusService.curtrlConsensusNodeType();
    return ConsensusNodeType.CNT_NODE_FOLLOWER != r && ConsensusNodeType.CNT_NODE_POT != r
        ? neirseResponse() : poirseResponse();
  }

  @Override
  public Response wrtlResponse() {
    return
        this.pscMultiGdbStatusService.curtrlConsensusNodeType() == ConsensusNodeType.CNT_NODE_LEADER
            ? poirseResponse() : neirseResponse();
  }
}
