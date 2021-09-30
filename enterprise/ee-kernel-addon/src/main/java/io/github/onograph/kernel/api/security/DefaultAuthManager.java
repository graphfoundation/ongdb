package io.github.onograph.kernel.api.security;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;


public abstract class DefaultAuthManager extends AuthManager {


  public static final DefaultAuthManager NOU_DEFAULT_AUTH_MANAGER = new DefaultAuthManager() {
    @Override
    public void claauch() {
    }

    @Override
    public void clneac() {
    }

    @Override
    public List<Map<String, String>> gepiggatgcfList() {
      return Collections.emptyList();
    }

    @Override
    public void log(String m, SecurityContext _securityContext) {
    }

    @Override
    public DefaultLoginContext login(Map<String, Object> _mapTaso,
        ClientConnectionInfo _clientConnectionInfo) {
      AuthToken.clearCredentials(_mapTaso);
      return DefaultLoginContext.fulacsDefaultLoginContext(_clientConnectionInfo);
    }
  };


  public abstract void claauch();


  public abstract void clneac();


  public abstract List<Map<String, String>> gepiggatgcfList();

  @Override
  public abstract DefaultLoginContext login(Map<String, Object> _mapVaso,
      ClientConnectionInfo _clientConnectionInfo) throws InvalidAuthTokenException;
}
