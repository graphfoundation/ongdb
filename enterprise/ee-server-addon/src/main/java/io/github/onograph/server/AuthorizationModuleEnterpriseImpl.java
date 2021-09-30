package io.github.onograph.server;

import io.github.onograph.server.rest.dbms.AuthorizationDisabledFilterEnterpriseImpl;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.logging.LogProvider;
import org.neo4j.server.modules.AuthorizationModule;
import org.neo4j.server.rest.dbms.AuthorizationDisabledFilter;
import org.neo4j.server.web.WebServer;


public class AuthorizationModuleEnterpriseImpl extends AuthorizationModule {

  public AuthorizationModuleEnterpriseImpl(Config _config, List<Pattern> _listWuPattern,
      LogProvider _logProvider, Supplier<AuthManager> _supplierAmAuthManager,
      WebServer _webServer) {
    super(_webServer, _supplierAmAuthManager, _logProvider, _config, _listWuPattern);
  }

  @Override
  protected AuthorizationDisabledFilter createAuthorizationDisabledFilter() {
    return new AuthorizationDisabledFilterEnterpriseImpl();
  }
}
