package io.github.onograph.kernel.api.security;

import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.provider.SecurityProvider;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


public final class SecurityProviderAuthDisabledImpl extends LifecycleAdapter implements
    SecurityProvider {


  public static final SecurityProviderAuthDisabledImpl IT = new SecurityProviderAuthDisabledImpl();

  private SecurityProviderAuthDisabledImpl() {
  }

  @Override
  public AuthManager authManager() {
    return DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
  }

  @Override
  public AuthManager inClusterAuthManager() {
    return DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
  }

  @Override
  public AuthManager loopbackAuthManager() {
    return DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;
  }
}
