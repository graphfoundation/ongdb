package io.github.onograph.server.rest.cluster;

import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.server.rest.repr.OutputFormat;


public class RestGdbApiManager {


  private static ClusterRestApi _avatarstClusterRestApi(GraphDatabaseAPI _dGraphDatabaseAPI,
      String gdbName, OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl,
      OutputFormat _outputFormat, MultiGdbService _scMultiGdbService) {
    switch (_operatorStateEnterpriseTypeImpl) {
      case SETI_IS:
        return new ApiReplyDTO(Response.status(Status.SERVICE_UNAVAILABLE)
            .header(io.github.onograph.TokenConstants.RETRY__AFTER, 60)
            .type(MediaType.TEXT_PLAIN_TYPE)
            .entity(io.github.onograph.I18N.format(
                "io.github.onograph.server.rest.cluster.RestGdbApiManager.entity", gdbName,
                _operatorStateEnterpriseTypeImpl.description())).build());
      case SETI_NOT_RUNNING:
      case SETI_D:
      case SETI_BDS_FOR_CLN:
      case SETI_NOT_DEFINED:
        return new ApiReplyDTO(
            Response.status(Status.SERVICE_UNAVAILABLE)
                .entity(io.github.onograph.I18N.format(
                    "io.github.onograph.server.rest.cluster.RestGdbApiManager.entity2", gdbName,
                    _operatorStateEnterpriseTypeImpl.description())).build());
      default:
        return _crastClusterRestApi(_dGraphDatabaseAPI, _outputFormat, _scMultiGdbService);
    }
  }


  private static ClusterRestApi _crastClusterRestApi(GraphDatabaseAPI _dGraphDatabaseAPI,
      OutputFormat _outputFormat, MultiGdbService _scMultiGdbService) {
    switch (_dGraphDatabaseAPI.dbmsInfo()) {
      case CORE:
        return new GdbRestApi(_dGraphDatabaseAPI, _outputFormat, _scMultiGdbService);
      case READ_REPLICA:
        return new ReadReplicaRestApi(_dGraphDatabaseAPI, _outputFormat, _scMultiGdbService);
      case ENTERPRISE:
        return new SingleGdbRestApi(_dGraphDatabaseAPI, _outputFormat, _scMultiGdbService);
      default:
        return new ApiReplyDTO(Status.FORBIDDEN);
    }
  }


  private static GraphDatabaseAPI _fiddGraphDatabaseAPI(
      DatabaseManagementService _databaseManagementService, String gdbName) {
    try {
      return (GraphDatabaseAPI) _databaseManagementService.database(gdbName);
    } catch (

        DatabaseNotFoundException _databaseNotFoundException) {
      return null;
    }
  }


  public static ClusterRestApi bulClusterRestApi(
      DatabaseManagementService _databaseManagementService, String gdbName,
      OutputFormat _outputFormat, MultiGdbService _scMultiGdbService,
      DatabaseStateService _ssdDatabaseStateService) {

    GraphDatabaseAPI _dGraphDatabaseAPI = _fiddGraphDatabaseAPI(_databaseManagementService,
        gdbName);
    if (_dGraphDatabaseAPI == null) {
      return new ApiReplyDTO(Status.NOT_FOUND);
    } else {

      OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl =
          (OperatorStateEnterpriseTypeImpl) _ssdDatabaseStateService.stateOfDatabase(
              _dGraphDatabaseAPI.databaseId()).operatorState();
      return _avatarstClusterRestApi(_dGraphDatabaseAPI, gdbName, _operatorStateEnterpriseTypeImpl,
          _outputFormat, _scMultiGdbService);
    }
  }
}
