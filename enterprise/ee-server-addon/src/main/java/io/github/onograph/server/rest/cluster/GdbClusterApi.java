package io.github.onograph.server.rest.cluster;

import java.util.regex.Pattern;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.rest.repr.OutputFormat;


@Path(io.github.onograph.TokenConstants.GDB_CLUSTER_API___PATH)
public class GdbClusterApi extends AbstractMultiGdbService {


  public static final String K = io.github.onograph.TokenConstants.P_DB__CLUSTER;


  static final String DB_CLX_PAT = "/{databaseName}/cluster";


  private static final String CLX_PAT = io.github.onograph.TokenConstants.P___CLUSTER;


  private static final String DB_NME = io.github.onograph.TokenConstants.DATABASE_NAME;


  public GdbClusterApi(@Context DatabaseManagementService _databaseManagementService,
      @Context DatabaseStateService _databaseStateService,
      @PathParam(io.github.onograph.TokenConstants.GDB_CLUSTER_API___PATH_PARAM__GDB_NAME) String gdbName,
      @Context OutputFormat _outputFormat) {
    super(_databaseManagementService, gdbName, _outputFormat, _databaseStateService);
  }


  public static String abudtectptString(Config _config) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.server.rest.cluster.GdbClusterApi.abudtectptString",
        _config.get(ServerSettings.db_api_path).getPath());
  }


  public static Pattern daacuuptPattern(Config _config) {
    return Pattern.compile(io.github.onograph.I18N.format(
        "io.github.onograph.server.rest.cluster.GdbClusterApi.compile",
        _config.get(ServerSettings.db_api_path).getPath()));
  }

  @Override
  public String reavpaString(String gdbName) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.server.rest.cluster.GdbClusterApi.reavpaString", gdbName);
  }
}
