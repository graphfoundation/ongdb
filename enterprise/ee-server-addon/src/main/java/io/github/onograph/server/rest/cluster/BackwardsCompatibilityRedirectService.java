package io.github.onograph.server.rest.cluster;

import java.util.regex.Pattern;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.DatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.server.configuration.ServerSettings;
import org.neo4j.server.rest.repr.OutputFormat;


@Path(io.github.onograph.TokenConstants.BACKWARDS_COMPATIBILITY_REDIRECT_SERVICE___PATH)
public class BackwardsCompatibilityRedirectService extends AbstractMultiGdbService {


  static final String CCA = io.github.onograph.TokenConstants.P___SERVER__CLUSTER;


  public BackwardsCompatibilityRedirectService(@Context Config _config,
      @Context DatabaseManagementService _databaseManagementService,
      @Context OutputFormat _outputFormat, @Context DatabaseStateService _ssdDatabaseStateService) {
    super(_databaseManagementService, _config.get(GraphDatabaseSettings.default_database),
        _outputFormat, _ssdDatabaseStateService);
  }


  public static Pattern daalgclrupanPattern(Config _config) {
    return Pattern.compile(
        io.github.onograph.I18N.format(
            "io.github.onograph.server.rest.cluster.BackwardsCompatibilityRedirectService.compile",
            _config.get(ServerSettings.management_api_path).getPath()));
  }

  @Override
  public String reavpaString(String gdbName) {
    return io.github.onograph.TokenConstants.P___SERVER__CLUSTER;
  }
}
