package io.github.onograph.server.security.auth;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.github.onograph.kernel.api.security.SecurityContextEnterpriseImpl;
import io.github.onograph.server.security.systemgraph.SimpleAuthorizationInfoSystemImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.shiro.authz.AuthorizationInfo;
import org.neo4j.graphdb.security.AuthorizationViolationException;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.internal.kernel.api.security.LoginContext;
import org.neo4j.internal.kernel.api.security.SecurityAuthorizationHandler;
import org.neo4j.kernel.api.exceptions.Status.Security;


public class EnterpriseLoginContextServiceDefaultImpl extends DefaultLoginContext {


  private final AuthManagerEnterpriseRealmsImpl authManagerEnterpriseRealmsImpl;


  private final String defGdbName;


  private final DelegatingSubjectImpl ssDelegatingSubjectImpl;


  EnterpriseLoginContextServiceDefaultImpl(
      AuthManagerEnterpriseRealmsImpl _authManagerEnterpriseRealmsImpl,
      ClientConnectionInfo _clientConnectionInfo, String defGdbName,
      DelegatingSubjectImpl _ssDelegatingSubjectImpl) {
    super(new AuthSubjectStandardImpl(_ssDelegatingSubjectImpl), _clientConnectionInfo);
    this.authManagerEnterpriseRealmsImpl = _authManagerEnterpriseRealmsImpl;
    this.ssDelegatingSubjectImpl = _ssDelegatingSubjectImpl;
    this.defGdbName = defGdbName;
  }


  private static String _bumgfmtwsString(List<Throwable> _listTrwbeThrowable, String _strMb) {
    if (_listTrwbeThrowable == null) {
      return _strMb;
    } else {

      StringBuilder _sStringBuilder = new StringBuilder(_strMb);

      Iterator _iterator = _listTrwbeThrowable.iterator();

      while (_iterator.hasNext()) {

        Throwable _throwable = (Throwable) _iterator.next();
        if (_throwable.getMessage() != null) {
          _sStringBuilder.append(" (");
          _sStringBuilder.append(_throwable.getMessage());
          _sStringBuilder.append(")");
        }

        Throwable _cueThrowable = _throwable.getCause();
        if (_cueThrowable != null && _cueThrowable.getMessage() != null) {
          _sStringBuilder.append(" (");
          _sStringBuilder.append(_cueThrowable.getMessage());
          _sStringBuilder.append(")");
        }

        Throwable _ccThrowable = _cueThrowable != null ? _cueThrowable.getCause() : null;
        if (_ccThrowable != null && _ccThrowable.getMessage() != null) {
          _sStringBuilder.append(" (");
          _sStringBuilder.append(_ccThrowable.getMessage());
          _sStringBuilder.append(")");
        }
      }

      return _sStringBuilder.toString();
    }
  }


  static AccessModeImpl _modAccessModeImpl(AbstractSecurityLog _abstractSecurityLog,
      AccessModeFactory _ambAccessModeFactory, String defGdbName, String gdbName,
      LoginContext _loginContext, Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO,
      Set<String> _setRlsString, String uname) {

    boolean _isDi = gdbName.equals(defGdbName);

    Iterator _iterator = _setPiieeElementEntitlementDTO.iterator();

    while (true) {

      ElementEntitlementDTO _piieeElementEntitlementDTO;
      do {
        if (!_iterator.hasNext()) {
          if (gdbName.equals(io.github.onograph.TokenConstants.SYSTEM)) {
            _ambAccessModeFactory.wihacsAccessModeFactory();
          }

          AccessModeImpl mdstr = _ambAccessModeFactory.bulAccessModeImpl();
          if (!mdstr.getIsAa()) {

            String m =
                String.format(io.github.onograph.I18N.format(
                        "io.github.onograph.server.security.auth.EnterpriseLoginContextServiceDefaultImpl.format"),
                    gdbName, uname,
                    new TreeSet(_setRlsString));

            throw new AuthorizationViolationException(
                "*** Error: 5424e109-aea8-417b-8d77-c4dbbcba70ba");
          }

          return mdstr;
        }

        _piieeElementEntitlementDTO = (ElementEntitlementDTO) _iterator.next();
      }
      while (!_piieeElementEntitlementDTO.isAplstForSt(gdbName) && (!_isDi
          || !_piieeElementEntitlementDTO.getDefGdbName()));

      _ambAccessModeFactory.adpveAccessModeFactory(_piieeElementEntitlementDTO);
    }
  }


  private AccessModeImpl _modAccessModeImpl(AbstractSecurityLog _abstractSecurityLog,
      String gdbName, IdLookup _rsleIdLookup) {

    boolean _isAi = this.ssDelegatingSubjectImpl.isAuthenticated();

    Collection<AuthorizationInfo> _collectionAilAuthorizationInfo =
        this.authManagerEnterpriseRealmsImpl.geatzniCollection(
            this.ssDelegatingSubjectImpl.getPrincipals());

    Iterator _iterator = _collectionAilAuthorizationInfo.iterator();

    while (_iterator.hasNext()) {

      AuthorizationInfo _authorizationInfo = (AuthorizationInfo) _iterator.next();
      if (_authorizationInfo instanceof SimpleAuthorizationInfoSystemImpl) {

        String uname = ((SimpleAuthorizationInfoSystemImpl) _authorizationInfo).getUname();
        this.ssDelegatingSubjectImpl.upaurmForSt(uname);
      }
    }

    Set<String> _setRlsString = this._qufrlneSet(_collectionAilAuthorizationInfo);

    AccessModeFactory _bmaAccessModeFactory = new AccessModeFactory(_isAi, _rsleIdLookup,
        _setRlsString, this.defGdbName, gdbName);

    Set<ElementEntitlementDTO> _setPiieeElementEntitlementDTO = this.authManagerEnterpriseRealmsImpl.gepmsnSet(
        _setRlsString);
    return _modAccessModeImpl(_abstractSecurityLog, _bmaAccessModeFactory, this.defGdbName, gdbName,
        this, _setPiieeElementEntitlementDTO, _setRlsString,
        this.subject().username());
  }


  private Set<String> _qufrlneSet(Collection<AuthorizationInfo> _collectionLiaAuthorizationInfo) {

    Set<String> _setCletoString = _collectionLiaAuthorizationInfo.stream().flatMap((authInfo) ->
    {

      Collection<String> _collectionRlsString = authInfo.getRoles();
      return _collectionRlsString == null ? Stream.empty()
          : _collectionRlsString.stream();
    }).collect(Collectors.toSet());
    _setCletoString.add(io.github.onograph.TokenConstants.PUBLIC);
    return _setCletoString;
  }

  @Override
  public SecurityContextEnterpriseImpl authorize(IdLookup _idLookup, String gdbName,
      AbstractSecurityLog _abstractSecurityLog) {
    if (!this.ssDelegatingSubjectImpl.isAuthenticated()) {

      throw new AuthorizationViolationException("*** Error:  0e7c30ba-3ede-4037-9527-b359401540df",
          Security.Unauthorized);
    } else if (!gdbName.equals(io.github.onograph.TokenConstants.SYSTEM) &&
        this.ssDelegatingSubjectImpl.getAuthenticationResult()
            .equals(AuthenticationResult.PASSWORD_CHANGE_REQUIRED)) {

      String m =
          SecurityAuthorizationHandler
              .generateCredentialsExpiredMessage(String.format(io.github.onograph.I18N.format(
                      "io.github.onograph.server.security.auth.EnterpriseLoginContextServiceDefaultImpl.format2"),
                  gdbName));

      throw new AuthorizationViolationException("*** Error: 1c51826d-13b1-4232-8377-9346d1c5e9f0",
          Security.CredentialsExpired);
    } else {

      AccessModeImpl mdstr = this._modAccessModeImpl(_abstractSecurityLog, gdbName, _idLookup);
      return new SecurityContextEnterpriseImpl(mdstr.getAdminAccessMode(), this.subject(),
          this.connectionInfo(), mdstr, mdstr.roles(), gdbName);
    }
  }

  @Override
  public Set<String> roeSet() {

    Collection<AuthorizationInfo> _collectionLiaAuthorizationInfo =
        this.authManagerEnterpriseRealmsImpl.geatzniCollection(
            this.ssDelegatingSubjectImpl.getPrincipals());
    return this._qufrlneSet(_collectionLiaAuthorizationInfo);
  }

  @Override
  public AuthSubjectStandardImpl subject() {
    return (AuthSubjectStandardImpl) this.subject;
  }


  static class AuthSubjectStandardImpl implements AuthSubject {


    private final DelegatingSubjectImpl ssDelegatingSubjectImpl;

    AuthSubjectStandardImpl(DelegatingSubjectImpl _ssDelegatingSubjectImpl) {
      this.ssDelegatingSubjectImpl = _ssDelegatingSubjectImpl;
    }


    void clantin() {
      this.ssDelegatingSubjectImpl.clantin();
    }


    String geatioflmeeString() {

      String m = "";

      List<Throwable> _listTrwbeThrowable = this.ssDelegatingSubjectImpl.getShiroAuthenticationInfo()
          .getThrowables();
      switch (this.ssDelegatingSubjectImpl.getAuthenticationResult()) {
        case FAILURE:
          m = EnterpriseLoginContextServiceDefaultImpl._bumgfmtwsString(_listTrwbeThrowable,
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl.bumgfmtwsString"));
          break;
        case TOO_MANY_ATTEMPTS:
          m = EnterpriseLoginContextServiceDefaultImpl._bumgfmtwsString(_listTrwbeThrowable,
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl.bumgfmtwsString2"));
          break;
        case PASSWORD_CHANGE_REQUIRED:
          m = EnterpriseLoginContextServiceDefaultImpl._bumgfmtwsString(_listTrwbeThrowable,
              io.github.onograph.I18N.format(
                  "io.github.onograph.server.security.auth.EnterpriseLoginContextServiceDefaultImpl.AuthSubjectStandardImpl.bumgfmtwsString3"));
      }

      return m;
    }

    @Override
    public AuthenticationResult getAuthenticationResult() {
      return this.ssDelegatingSubjectImpl.getAuthenticationResult();
    }

    @Override
    public boolean hasUsername(String uname) {

      String _strUs = this.ssDelegatingSubjectImpl.getUname();
      return uname != null && uname.equals(_strUs);
    }

    @Override
    public String username() {

      String uname = this.ssDelegatingSubjectImpl.getUname();
      return Objects.requireNonNullElse(uname, "");
    }
  }
}
