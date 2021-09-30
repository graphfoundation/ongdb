package io.github.onograph.server.security.systemgraph;

import com.github.benmanes.caffeine.cache.Cache;
import io.github.onograph.server.security.auth.AuthorizationInfoSa;
import io.github.onograph.server.security.auth.ElementEntitlementDTO;
import io.github.onograph.server.security.auth.Lifecycle;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory;
import org.neo4j.cypher.internal.security.FormatException;
import org.neo4j.function.ThrowingFunction;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthToken;
import org.neo4j.server.security.systemgraph.SystemGraphRealmHelper;


public class AuthorizingRealmSystemImpl extends AuthorizingRealm implements Lifecycle,
    AuthorizationInfoSa, CredentialsMatcher {


  private final AuthenticationStrategy authenticationStrategy;


  private final Cache<String, Set<ElementEntitlementDTO>> cacheCpss;


  private final DefaultSecuritySystemGraphComponent defaultSecuritySystemGraphComponent;


  private final boolean isEa;


  private final boolean isEa2;


  private final SystemGraphRealmHelper systemGraphRealmHelper;


  public AuthorizingRealmSystemImpl(AuthenticationStrategy _authenticationStrategy,
      CaffeineCacheFactory _caffeineCacheFactory,
      DefaultSecuritySystemGraphComponent defaultSecuritySystemGraphComponent, boolean _isEa,
      boolean _isEa2, SystemGraphRealmHelper _systemGraphRealmHelper) {
    this.systemGraphRealmHelper = _systemGraphRealmHelper;
    this.authenticationStrategy = _authenticationStrategy;
    this.isEa = _isEa;
    this.defaultSecuritySystemGraphComponent = defaultSecuritySystemGraphComponent;
    this.setAuthenticationCachingEnabled(true);
    this.setName(io.github.onograph.TokenConstants.NATIVE);
    this.isEa2 = _isEa2;
    this.cacheCpss = _caffeineCacheFactory.createCache(10000, Duration.ofHours(1L).toMillis());
    this.setAuthorizationCachingEnabled(true);
    this.setCredentialsMatcher(this);
  }


  public void clcfrl() {
    this.cacheCpss.invalidateAll();
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
        if (_user.hasFlag(io.github.onograph.TokenConstants.IS_SUSPENDED)) {

          throw new DisabledAccountException("*** Error: 096bff5f-cced-4fb8-93ea-30a7b0135d64");
        }

        if (_user.passwordChangeRequired()) {
          _authenticationResult = AuthenticationResult.PASSWORD_CHANGE_REQUIRED;
        }

        _ioShiroAuthenticationInfoSystemGdbImpl.seatioruForAu(_authenticationResult);
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
  public AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken _authenticationToken) {
    if (!this.isEa) {
      return null;
    } else {

      ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;

      String uname;
      try {
        uname = AuthToken.safeCast(io.github.onograph.TokenConstants.PRINCIPAL,
            _shiroAuthToken.getAuthTokenMap());
        AuthToken.safeCastCredentials(io.github.onograph.TokenConstants.CREDENTIALS,
            _shiroAuthToken.getAuthTokenMap());
      } catch (

          InvalidAuthTokenException _invalidAuthTokenException) {
        throw new UnsupportedTokenException(_invalidAuthTokenException);
      }

      User _user;
      try {
        _user = this.systemGraphRealmHelper.getUser(uname);
      } catch (

          FormatException | InvalidArgumentsException _exception) {
        throw new UnknownAccountException();
      }

      return new ShiroAuthenticationInfoSystemGdbImpl(_user, this.getName());
    }
  }

  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(
      PrincipalCollection _picplPrincipalCollection) {
    if (!this.isEa2) {
      return null;
    } else {

      Object usrPrcpl = this.getAvailablePrincipal(_picplPrincipalCollection);
      if (usrPrcpl instanceof Neo4jPrincipal) {

        Optional<String> _optionalIString = ((Neo4jPrincipal) usrPrcpl).getId();

        String uname = ((Neo4jPrincipal) usrPrcpl).getUsername();

        ThrowingFunction _flThrowingFunction = (txx) ->
        {
          return ((Transaction) txx).findNode(Label.label(io.github.onograph.TokenConstants.USER2),
              io.github.onograph.TokenConstants.ID, _optionalIString.get());
        };
        if (_optionalIString.isEmpty()) {
          return null;
        } else {
          if (_optionalIString.get().equals(io.github.onograph.TokenConstants.NO_ID)) {
            _flThrowingFunction = (txx) ->
            {
              return ((Transaction) txx).findNode(
                  Label.label(io.github.onograph.TokenConstants.USER2),
                  io.github.onograph.TokenConstants.NAME, uname);
            };
          }

          boolean _isUe = false;

          String title = null;

          boolean _isSsedd = false;

          TreeSet _rnTreeSet = new TreeSet();

          try {

            Transaction _tTransaction = this.systemGraphRealmHelper.getSystemDb().beginTx();

            try {

              Node _usNode = (Node) _flThrowingFunction.apply(_tTransaction);
              if (_usNode != null) {
                _isUe = true;
                title = _usNode.getProperty(io.github.onograph.TokenConstants.NAME).toString();
                _isSsedd = (Boolean) _usNode.getProperty(
                    io.github.onograph.TokenConstants.SUSPENDED);

                Iterable<Relationship> _iterableRelRelationship =
                    _usNode.getRelationships(Direction.OUTGOING,
                        RelationshipType.withName(io.github.onograph.TokenConstants.HAS_ROLE));
                _iterableRelRelationship.forEach((rel) ->
                {
                  _rnTreeSet.add(
                      rel.getEndNode().getProperty(io.github.onograph.TokenConstants.NAME));
                });
              }

              _tTransaction.commit();
            } catch (

                Throwable _throwable) {
              if (_tTransaction != null) {
                try {
                  _tTransaction.close();
                } catch (

                    Throwable _throwable2) {
                  _throwable.addSuppressed(_throwable2);
                }
              }

              throw (NotFoundException) _throwable;
            }

            if (_tTransaction != null) {
              _tTransaction.close();
            }
          } catch (

              NotFoundException _notFoundException) {
            return null;
          }

          if (!_isUe) {
            return null;
          } else {
            return _isSsedd ? new SimpleAuthorizationInfoSystemImpl(title)
                : new SimpleAuthorizationInfoSystemImpl(_rnTreeSet, title);
          }
        }
      } else {

        throw new IllegalStateException("*** Error: 8750fde3-2fb7-4236-b13e-0fea4def2cd3");
      }
    }
  }

  @Override
  public AuthorizationInfo geatznhAuthorizationInfo(PrincipalCollection _principalCollection) {
    return this.getAuthorizationInfo(_principalCollection);
  }


  public HashSet<ElementEntitlementDTO> gepigfrrsHashSet(Set<String> _setRlsString) {

    HashSet<ElementEntitlementDTO> _hashSetPiieeElementEntitlementDTO = new HashSet();

    List<String> _listLtrString = new ArrayList();

    Iterator _iterator = _setRlsString.iterator();

    while (_iterator.hasNext()) {

      String r = (String) _iterator.next();

      Set<ElementEntitlementDTO> _setPfrElementEntitlementDTO = this.cacheCpss.getIfPresent(r);
      if (_setPfrElementEntitlementDTO == null) {
        _listLtrString.add(r);
      } else {
        _hashSetPiieeElementEntitlementDTO.addAll(_setPfrElementEntitlementDTO);
      }
    }

    if (!_listLtrString.isEmpty()) {

      Transaction _tTransaction = this.systemGraphRealmHelper.getSystemDb().beginTx();

      try {
        _hashSetPiieeElementEntitlementDTO.addAll(
            this.defaultSecuritySystemGraphComponent.gepigfrSet(this.cacheCpss, _listLtrString,
                _tTransaction));
        _tTransaction.commit();
      } catch (

          Throwable _throwable) {
        if (_tTransaction != null) {
          try {
            _tTransaction.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_tTransaction != null) {
        _tTransaction.close();
      }
    }

    return _hashSetPiieeElementEntitlementDTO;
  }

  @Override
  protected Object getAuthenticationCacheKey(AuthenticationToken _authenticationToken) {

    Object usrPrcpl = _authenticationToken != null ? _authenticationToken.getPrincipal() : null;
    return usrPrcpl != null ? usrPrcpl : "";
  }

  @Override
  protected Object getAuthenticationCacheKey(PrincipalCollection _picplPrincipalCollection) {

    Object usrPrcpl = this.getAvailablePrincipal(_picplPrincipalCollection);
    return usrPrcpl == null ? "" : usrPrcpl;
  }

  @Override
  protected Object getAuthorizationCacheKey(PrincipalCollection _picplPrincipalCollection) {
    return this.getAvailablePrincipal(_picplPrincipalCollection);
  }


  public String geuriString(String uname) {

    String _strI = io.github.onograph.TokenConstants.NO_ID;

    try {

      Transaction _tTransaction = this.systemGraphRealmHelper.getSystemDb().beginTx();

      try {

        Node _usNode =
            _tTransaction.findNode(Label.label(io.github.onograph.TokenConstants.USER2),
                io.github.onograph.TokenConstants.NAME,
                uname);
        if (_usNode != null && _usNode.hasProperty(io.github.onograph.TokenConstants.ID)) {
          _strI = (String) _usNode.getProperty(io.github.onograph.TokenConstants.ID);
        }

        _tTransaction.commit();
      } catch (

          Throwable _throwable) {
        if (_tTransaction != null) {
          try {
            _tTransaction.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_tTransaction != null) {
        _tTransaction.close();
      }

      return _strI;
    } catch (

        NotFoundException _notFoundException) {
      return null;
    }
  }

  @Override
  public void setup() {
  }

  @Override
  public void shutdown() {
  }

  @Override
  public void start() {
  }

  @Override
  public void stop() {
  }

  @Override
  public boolean supports(AuthenticationToken _authenticationToken) {
    try {
      if (!(_authenticationToken instanceof ShiroAuthToken)) {
        return false;
      } else {

        ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;
        return _shiroAuthToken.getScheme().equals(io.github.onograph.TokenConstants.BASIC) &&
            _shiroAuthToken.supportsRealm(io.github.onograph.TokenConstants.NATIVE);
      }
    } catch (

        InvalidAuthTokenException _invalidAuthTokenException) {
      return false;
    }
  }
}
