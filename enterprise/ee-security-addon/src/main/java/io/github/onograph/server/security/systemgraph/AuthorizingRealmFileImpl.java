package io.github.onograph.server.security.systemgraph;

import io.github.onograph.server.security.auth.AuthorizationInfoSa;
import io.github.onograph.server.security.auth.Lifecycle;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.auth.UserRepository;


public class AuthorizingRealmFileImpl extends AuthorizingRealm implements Lifecycle,
    AuthorizationInfoSa, CredentialsMatcher {


  private static final String REL_NME = io.github.onograph.TokenConstants.FILE;


  private final AuthenticationStrategy authenticationStrategy;


  private final String strU;


  private final UserRepository userRepository;

  public AuthorizingRealmFileImpl(AuthenticationStrategy _authenticationStrategy, String _strUs,
      UserRepository _userRepository) {
    this.authenticationStrategy = _authenticationStrategy;
    this.strU = _strUs;
    this.userRepository = _userRepository;
    this.setName(REL_NME);
    this.setCredentialsMatcher(this);
  }

  @Override
  public boolean doCredentialsMatch(AuthenticationToken _authenticationToken,
      AuthenticationInfo _authenticationInfo) {

    ShiroAuthenticationInfoSystemGdbImpl _ioShiroAuthenticationInfoSystemGdbImpl = (ShiroAuthenticationInfoSystemGdbImpl) _authenticationInfo;

    User _user = _ioShiroAuthenticationInfoSystemGdbImpl.getRUser();

    byte[] secret;
    try {

      ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;
      secret = AuthToken.safeCastCredentials(io.github.onograph.TokenConstants.CREDENTIALS,
          _shiroAuthToken.getAuthTokenMap());
    } catch (

        InvalidAuthTokenException _invalidAuthTokenException) {
      throw new UnsupportedTokenException(_invalidAuthTokenException);
    }

    AuthenticationResult _authenticationResult = this.authenticationStrategy.authenticate(_user,
        secret);
    switch (_authenticationResult) {
      case SUCCESS:
      case PASSWORD_CHANGE_REQUIRED:
        _ioShiroAuthenticationInfoSystemGdbImpl.seatioruForAu(AuthenticationResult.SUCCESS);
        return true;
      case FAILURE:
        throw new IncorrectCredentialsException();
      case TOO_MANY_ATTEMPTS:
        throw new ExcessiveAttemptsException();
      default:
        throw new AuthenticationException();
    }
  }

  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken _authenticationToken)
      throws AuthenticationException {

    ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;

    String uname = (String) _shiroAuthToken.getPrincipal();

    User _user = this.userRepository.getUserByName(uname);
    if (_user == null) {
      throw new UnknownAccountException();
    } else {
      return new ShiroAuthenticationInfoSystemGdbImpl(_user, this.getName());
    }
  }

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection _principalCollection) {
    return null;
  }

  @Override
  public AuthorizationInfo geatznhAuthorizationInfo(PrincipalCollection usrPrcpl) {
    return null;
  }

  @Override
  public void setup() throws Exception {
    this.userRepository.init();
  }

  @Override
  public void shutdown() throws Exception {
    this.userRepository.shutdown();
  }

  @Override
  public void start() throws Exception {
    this.userRepository.start();
  }

  @Override
  public void stop() throws Exception {
    this.userRepository.stop();
  }

  @Override
  public boolean supports(AuthenticationToken _authenticationToken) {
    if (_authenticationToken instanceof ShiroAuthToken) {

      ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;

      try {
        AuthToken.safeCast(io.github.onograph.TokenConstants.PRINCIPAL,
            _shiroAuthToken.getAuthTokenMap());
        AuthToken.safeCastCredentials(io.github.onograph.TokenConstants.CREDENTIALS,
            _shiroAuthToken.getAuthTokenMap());
      } catch (

          InvalidAuthTokenException _invalidAuthTokenException) {
        return false;
      }

      return _shiroAuthToken.supportsRealm(this.getName());
    } else {
      return false;
    }
  }
}
