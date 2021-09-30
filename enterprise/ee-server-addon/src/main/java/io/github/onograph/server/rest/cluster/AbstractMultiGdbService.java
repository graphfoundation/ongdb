package io.github.onograph.server.rest.cluster;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.server.rest.repr.OutputFormat;


public abstract class AbstractMultiGdbService implements MultiGdbService {


  static final String AVIB = io.github.onograph.TokenConstants.AVAILABLE;


  static final String RDX_ONL = io.github.onograph.TokenConstants.READ_ONLY;


  static final String STAT = io.github.onograph.TokenConstants.STATUS;


  static final String WRTL = io.github.onograph.TokenConstants.WRITABLE;


  private final ClusterRestApi stat;


  AbstractMultiGdbService(DatabaseManagementService _databaseManagementService, String gdbName,
      OutputFormat _outputFormat, DatabaseStateService _ssdDatabaseStateService) {
    this.stat = this._crastClusterRestApi(_databaseManagementService, _ssdDatabaseStateService,
        gdbName, _outputFormat);
  }


  private ClusterRestApi _crastClusterRestApi(DatabaseManagementService _databaseManagementService,
      DatabaseStateService _dssDatabaseStateService, String gdbName, OutputFormat _outputFormat) {
    try {
      return RestGdbApiManager.bulClusterRestApi(_databaseManagementService, gdbName, _outputFormat,
          this, _dssDatabaseStateService);
    } catch (

        Exception _exception) {
      return new ApiReplyDTO(
          Response.status(Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN_TYPE)
              .entity(_exception.toString()).build());
    }
  }


  @GET
  @Path(io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION3)
  public Response avllResponse() {
    return this.stat.avibResponse();
  }


  @GET
  public Response diceResponse() {
    return this.stat.diceResponse();
  }


  @GET
  @Path(io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION2)
  public Response reoyResponse() {
    return this.stat.redlResponse();
  }


  @GET
  @Path(io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION4)
  public Response sttResponse() {
    return this.stat.decpoResponse();
  }


  @GET
  @Path(io.github.onograph.TokenConstants.ABSTRACT_MULTI_GDB_SERVICE___PATH___EXCEPTION)
  public Response wraeResponse() {
    return this.stat.wrtlResponse();
  }
}
