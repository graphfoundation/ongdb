package io.github.onograph.server.security.auth.module;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;


class ShiroAuthenticationInfoAuthenticationOnlyImpl extends ShiroAuthenticationInfo implements
    AuthenticationTokenCheckerService {


  private PrincipalServiceCredentialCachingImpl.AuthTokenComparer authTokenComparer;


  private ShiroAuthenticationInfoAuthenticationOnlyImpl(
      PrincipalServiceCredentialCachingImpl.AuthTokenComparer authTokenComparer, String realm,
      Object usrPrcpl) {
    super(new Neo4jPrincipal(usrPrcpl.toString()), realm, AuthenticationResult.SUCCESS);
    this.authTokenComparer = authTokenComparer;
  }


  private ShiroAuthenticationInfoAuthenticationOnlyImpl(Object _obCh, String realm,
      ByteSource _scByteSource, Object usrPrcpl) {
    super(new Neo4jPrincipal(usrPrcpl.toString()), _obCh, _scByteSource, realm,
        AuthenticationResult.SUCCESS);
  }


  private static ShiroAuthenticationInfoAuthenticationOnlyImpl _craShiroAuthenticationInfoAuthenticationOnlyImpl(
      PluginPrincipalService _iaPluginPrincipalService, String realm) {
    return new ShiroAuthenticationInfoAuthenticationOnlyImpl(null, realm,
        _iaPluginPrincipalService.getPrincipal());
  }


  private static ShiroAuthenticationInfoAuthenticationOnlyImpl _craShiroAuthenticationInfoAuthenticationOnlyImpl(
      SimpleHash _chSimpleHash, PluginPrincipalService _iaPluginPrincipalService, String realm) {
    return new ShiroAuthenticationInfoAuthenticationOnlyImpl(_chSimpleHash.getBytes(), realm,
        _chSimpleHash.getSalt(),
        _iaPluginPrincipalService.getPrincipal());
  }


  public static ShiroAuthenticationInfoAuthenticationOnlyImpl creceShiroAuthenticationInfoAuthenticationOnlyImpl(
      PluginPrincipalService _iaPluginPrincipalService, String realm, SecureHasher _secureHasher) {
    if (_iaPluginPrincipalService instanceof PrincipalServiceCredentialCachingImpl) {

      PrincipalServiceCredentialCachingImpl _iPrincipalServiceCredentialCachingImpl = (PrincipalServiceCredentialCachingImpl) _iaPluginPrincipalService;
      return new ShiroAuthenticationInfoAuthenticationOnlyImpl(
          _iPrincipalServiceCredentialCachingImpl.getAuthTokenComparer(), realm,
          _iaPluginPrincipalService.getPrincipal());
    } else if (_iaPluginPrincipalService instanceof PrincipalServiceDefaultImpl) {

      byte[] credsObj = ((PrincipalServiceDefaultImpl) _iaPluginPrincipalService).crdtl();

      SimpleHash _chSimpleHash = _secureHasher.hash(credsObj);
      return _craShiroAuthenticationInfoAuthenticationOnlyImpl(_chSimpleHash,
          _iaPluginPrincipalService, realm);
    } else {
      return _craShiroAuthenticationInfoAuthenticationOnlyImpl(_iaPluginPrincipalService, realm);
    }
  }

  @Override
  public PrincipalServiceCredentialCachingImpl.AuthTokenComparer geceimarPrincipalServiceCredentialCachingImplAuthTokenComparer() {
    return this.authTokenComparer;
  }
}
