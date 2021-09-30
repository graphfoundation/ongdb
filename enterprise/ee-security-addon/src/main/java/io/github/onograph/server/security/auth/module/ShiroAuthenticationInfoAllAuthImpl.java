package io.github.onograph.server.security.auth.module;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;


public class ShiroAuthenticationInfoAllAuthImpl extends ShiroAuthenticationInfo implements
    AuthorizationInfo {


  Set<String> setRoeString;


  private ShiroAuthenticationInfoAllAuthImpl(String realm, Set<String> _setRlsString,
      Object usrPrcpl) {
    super(new Neo4jPrincipal(usrPrcpl.toString()), realm, AuthenticationResult.SUCCESS);
    this.setRoeString = _setRlsString;
  }


  private ShiroAuthenticationInfoAllAuthImpl(Object _obCh, String realm, ByteSource _scByteSource,
      Set<String> _setRlsString, Object usrPrcpl) {
    super(new Neo4jPrincipal(usrPrcpl.toString()), _obCh, _scByteSource, realm,
        AuthenticationResult.SUCCESS);
    this.setRoeString = _setRlsString;
  }


  private ShiroAuthenticationInfoAllAuthImpl(SimpleHash _chSimpleHash,
      PrincipalAndRolesProvider _iaPrincipalAndRolesProvider, String realm) {
    this(_chSimpleHash.getBytes(), realm, _chSimpleHash.getSalt(),
        new HashSet(_iaPrincipalAndRolesProvider.roeCollection()),
        _iaPrincipalAndRolesProvider.prnpObject());
  }


  public static ShiroAuthenticationInfoAllAuthImpl craShiroAuthenticationInfoAllAuthImpl(
      PrincipalAndRolesProvider _iaPrincipalAndRolesProvider, String realm) {
    return new ShiroAuthenticationInfoAllAuthImpl(realm,
        new HashSet(_iaPrincipalAndRolesProvider.roeCollection()),
        _iaPrincipalAndRolesProvider.prnpObject());
  }


  public static ShiroAuthenticationInfoAllAuthImpl creceShiroAuthenticationInfoAllAuthImpl(
      PrincipalAndRolesProvider _iaPrincipalAndRolesProvider, String realm,
      SecureHasher _secureHasher) {
    if (_iaPrincipalAndRolesProvider instanceof CachedPrincipalAndRolesProvider) {

      byte[] credsObj = ((CachedPrincipalAndRolesProvider) _iaPrincipalAndRolesProvider).crdtl();

      SimpleHash _chSimpleHash = _secureHasher.hash(credsObj);
      return new ShiroAuthenticationInfoAllAuthImpl(_chSimpleHash, _iaPrincipalAndRolesProvider,
          realm);
    } else {
      return new ShiroAuthenticationInfoAllAuthImpl(realm,
          new HashSet(_iaPrincipalAndRolesProvider.roeCollection()),
          _iaPrincipalAndRolesProvider.prnpObject());
    }
  }

  @Override
  public Collection<Permission> getObjectPermissions() {
    return Collections.emptyList();
  }

  @Override
  public Collection<String> getRoles() {
    return this.setRoeString;
  }

  @Override
  public Collection<String> getStringPermissions() {
    return Collections.emptyList();
  }
}
