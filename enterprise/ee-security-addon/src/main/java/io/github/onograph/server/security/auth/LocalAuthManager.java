package io.github.onograph.server.security.auth;

import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.neo4j.graphdb.security.AuthorizationViolationException;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AccessMode.Static;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.exceptions.Status.Security;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.auth.UserRepository;


public class LocalAuthManager extends DefaultAuthManager {


  public static final String SCE = io.github.onograph.TokenConstants.IN_CLUSTER_TOKEN;


  private static final AuthSubject LOAB_AUTH_SUBJECT = new AuthSubject() {
    @Override
    public AuthenticationResult getAuthenticationResult() {
      return AuthenticationResult.SUCCESS;
    }

    @Override
    public boolean hasUsername(String uname) {
      return false;
    }

    @Override
    public String username() {
      return io.github.onograph.TokenConstants.LOOPBACK_OPERATOR;
    }
  };


  private final AbstractSecurityLog abstractSecurityLog;


  private final AuthenticationStrategy authenticationStrategy;


  private final boolean isLsl;


  private final UserRepository userRepository;


  private User user;


  public LocalAuthManager(AbstractSecurityLog _abstractSecurityLog,
      AuthenticationStrategy _authenticationStrategy, boolean _isLsl,
      UserRepository _userRepository) {
    this.abstractSecurityLog = _abstractSecurityLog;
    this.authenticationStrategy = _authenticationStrategy;
    this.isLsl = _isLsl;
    this.userRepository = _userRepository;
  }


  private static void _astvdsmForMa(Map<String, Object> _mapTknso)
      throws InvalidAuthTokenException {

    String _strShm = AuthToken.safeCast(io.github.onograph.TokenConstants.SCHEME, _mapTknso);
    if (_strShm.equals(io.github.onograph.TokenConstants.NONE)) {
      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.LocalAuthManager.invalidToken"));
    } else if (!_strShm.equals(io.github.onograph.TokenConstants.BASIC)) {
      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.LocalAuthManager.invalidToken2", _strShm));
    }
  }

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
      ClientConnectionInfo _clientConnectionInfo) throws InvalidAuthTokenException {

    ShiroAuthToken _shiroAuthToken = new ShiroAuthToken(_mapTaso);

    try {
      _astvdsmForMa(_mapTaso);

      byte[] secret;
      try {
        secret = AuthToken.safeCastCredentials(io.github.onograph.TokenConstants.CREDENTIALS,
            _shiroAuthToken.getAuthTokenMap());
      } catch (

          InvalidAuthTokenException _invalidAuthTokenException) {
        throw new UnsupportedTokenException(_invalidAuthTokenException);
      }

      AuthenticationResult _authenticationResult = this.authenticationStrategy.authenticate(
          this.user, secret);

      LoginContextImpl _loginContextImpl = new LoginContextImpl(_clientConnectionInfo,
          _authenticationResult);
      switch (_authenticationResult) {
        case SUCCESS:
          if (this.isLsl) {

          }
          break;
        case PASSWORD_CHANGE_REQUIRED:

          break;
        case FAILURE:

          break;
        case TOO_MANY_ATTEMPTS:

          break;
        default:
          throw new AuthenticationException();
      }

      return _loginContextImpl;
    } catch (

        InvalidAuthTokenException _invalidAuthTokenException2) {

      throw AuthToken.invalidToken(
          io.github.onograph.I18N.format(
              "io.github.onograph.server.security.auth.LocalAuthManager.invalidToken3",
              _shiroAuthToken));
    }
  }

  @Override
  public void start() throws Exception {
    this.userRepository.start();

    List<User> _listUesUser = this.userRepository.getSnapshot().values();
    if (_listUesUser.size() != 1) {

      throw new IllegalStateException("*** Error:  a8809f6c-8f6d-4e6e-95da-5e9b10cabc69");
    } else {
      this.user = _listUesUser.get(0).augment().withRequiredPasswordChange(false)
          .withoutFlag(io.github.onograph.TokenConstants.IS_SUSPENDED)
          .build();
    }
  }


  private class LoginContextImpl extends DefaultLoginContext {


    private final AuthenticationResult arAuthenticationResult;


    LoginContextImpl(ClientConnectionInfo _clientConnectionInfo,
        AuthenticationResult _raAuthenticationResult) {
      super(LocalAuthManager.LOAB_AUTH_SUBJECT, _clientConnectionInfo);
      this.arAuthenticationResult = _raAuthenticationResult;
    }

    @Override
    public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
        AbstractSecurityLog _abstractSecurityLog) {
      if (!this.arAuthenticationResult.equals(AuthenticationResult.SUCCESS)) {

        throw new AuthorizationViolationException(
            "*** Error:  cdf8d459-aa2d-46b7-a990-2f1c1668e8ac", Security.Unauthorized);
      } else {
        return SecurityContextEnterpriseImpl.auhdslSecurityContextEnterpriseImpl(
            ClientConnectionInfo.EMBEDDED_CONNECTION, Static.FULL, gdbName);
      }
    }

    @Override
    public Set<String> roeSet() {
      return Collections.emptySet();
    }
  }
}
