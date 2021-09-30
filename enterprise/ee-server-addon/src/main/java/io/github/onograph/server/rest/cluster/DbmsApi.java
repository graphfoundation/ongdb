package io.github.onograph.server.rest.cluster;

import java.util.regex.Pattern;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.server.configuration.ServerSettings;


@Path(io.github.onograph.TokenConstants.DBMS_API___PATH)
public class DbmsApi {


  public static final String K = io.github.onograph.TokenConstants.P_DBMS__CLUSTER;


  static final String CLX_PAT = io.github.onograph.TokenConstants.P___CLUSTER;


  private final DatabaseManagementService databaseManagementService;

  public DbmsApi(@Context DatabaseManagementService _databaseManagementService) {
    this.databaseManagementService = _databaseManagementService;
  }


  public static String abudmcspaString(Config _config) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.server.rest.cluster.DbmsApi.abudmcspaString",
        _config.get(ServerSettings.dbms_api_path).getPath());
  }


  public static Pattern dbclrupanPattern() {
    return Pattern.compile(io.github.onograph.TokenConstants.P___DBMS__CLUSTER___STAR_);
  }


  @GET
  @Path(io.github.onograph.TokenConstants.DBMS_API___PATH___CONFIG)
  public Response sttResponse() {
    return Response.status(Status.OK).type(io.github.onograph.TokenConstants.P_APPLICATION__JSON)
        .entity(new ClusterDbmsStatusMeta(this.databaseManagementService)).build();
  }
}
