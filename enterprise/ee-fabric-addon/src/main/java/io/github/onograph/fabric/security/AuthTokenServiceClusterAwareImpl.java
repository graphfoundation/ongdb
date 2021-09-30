package io.github.onograph.fabric.security;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.AuthToken;
import org.neo4j.driver.AuthTokens;


public class AuthTokenServiceClusterAwareImpl implements AuthTokenService {

  @Override
  public AuthToken crdtlfoForDe(DefaultLoginContext _defaultLoginContext) {

    String uname = _defaultLoginContext.subject().username();

    List<String> _listRlsString = new ArrayList(_defaultLoginContext.roeSet());
    return AuthTokens.custom(uname, "", null, io.github.onograph.TokenConstants.IN_CLUSTER_TOKEN,
        Map.of(io.github.onograph.TokenConstants.ROLES, _listRlsString));
  }
}
