package io.github.onograph.server.security.auth;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DelegatingSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.Neo4jPrincipal;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;


public class DelegatingSubjectImpl extends DelegatingSubject {


  private final AuthenticationResult authenticationResult;


  private ShiroAuthenticationInfo shiroAuthenticationInfo;


  private String uname;


  public DelegatingSubjectImpl(AuthenticationResult _authenticationResult,
      SecurityManager _securityManager, String uname) {
    super(new SimplePrincipalCollection(uname, io.github.onograph.TokenConstants.ERROR), false,
        null, null, true, _securityManager);
    this.authenticationResult = _authenticationResult;
    this.uname = uname;
  }


  public DelegatingSubjectImpl(AuthenticationResult _authenticationResult, String hostNameOrIp,
      boolean _isAtetc, boolean _isEcs, PrincipalCollection _picplPrincipalCollection,
      SecurityManager _securityManager, Session _session,
      ShiroAuthenticationInfo _shiroAuthenticationInfo) {
    super(_picplPrincipalCollection, _isAtetc, hostNameOrIp, _session, _isEcs, _securityManager);
    this.authenticationResult = _authenticationResult;
    this.shiroAuthenticationInfo = _shiroAuthenticationInfo;
    this._seurm();
  }


  private void _seurm() {

    Object usrPrcpl = this.getPrincipal();
    if (usrPrcpl == null) {
      this.uname = null;
    } else if (usrPrcpl instanceof Neo4jPrincipal) {
      this.uname = ((Neo4jPrincipal) usrPrcpl).getUsername();
    } else {
      this.uname = usrPrcpl.toString();
    }
  }


  public void clantin() {
    this.shiroAuthenticationInfo = null;
  }


  public AuthenticationResult getAuthenticationResult() {
    return this.authenticationResult;
  }


  public ShiroAuthenticationInfo getShiroAuthenticationInfo() {
    return this.shiroAuthenticationInfo;
  }


  public String getUname() {
    return this.uname;
  }


  void upaurmForSt(String uname) {
    this.uname = uname;
  }
}
