package io.github.onograph.server.security.auth;

import java.util.Collection;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.AbstractAuthenticationStrategy;
import org.apache.shiro.realm.Realm;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;


public class EnterpriseAuthenticationStrategy extends AbstractAuthenticationStrategy {

  @Override
  public AuthenticationInfo afterAttempt(Realm _realm, AuthenticationToken _authenticationToken,
      AuthenticationInfo _irsAuthenticationInfo, AuthenticationInfo _iaAuthenticationInfo,
      Throwable _throwable)
      throws AuthenticationException {

    AuthenticationInfo _authenticationInfo = super.afterAttempt(_realm, _authenticationToken,
        _irsAuthenticationInfo, _iaAuthenticationInfo, _throwable);
    if (_throwable != null && _authenticationInfo instanceof ShiroAuthenticationInfo) {
      ((ShiroAuthenticationInfo) _authenticationInfo).addThrowable(_throwable);
    }

    return _authenticationInfo;
  }

  @Override
  public AuthenticationInfo beforeAllAttempts(Collection<? extends Realm> _collectionRamRealm,
      AuthenticationToken _authenticationToken) throws AuthenticationException {
    return new ShiroAuthenticationInfo();
  }
}
