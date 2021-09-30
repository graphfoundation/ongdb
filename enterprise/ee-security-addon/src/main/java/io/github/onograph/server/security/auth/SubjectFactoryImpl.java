package io.github.onograph.server.security.auth;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SubjectFactory;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;


public class SubjectFactoryImpl implements SubjectFactory {

  @Override
  public Subject createSubject(SubjectContext _subjectContext) {

    SecurityManager _securityManager = _subjectContext.resolveSecurityManager();

    Session _session = _subjectContext.resolveSession();

    boolean _isEcs = _subjectContext.isSessionCreationEnabled();

    PrincipalCollection _picplPrincipalCollection = _subjectContext.resolvePrincipals();

    boolean _isAtetc = _subjectContext.resolveAuthenticated();

    String hostNameOrIp = _subjectContext.resolveHost();

    ShiroAuthenticationInfo _iaShiroAuthenticationInfo = (ShiroAuthenticationInfo) _subjectContext.getAuthenticationInfo();
    return new DelegatingSubjectImpl(_iaShiroAuthenticationInfo.getAuthenticationResult(),
        hostNameOrIp, _isAtetc, _isEcs, _picplPrincipalCollection,
        _securityManager, _session,
        _iaShiroAuthenticationInfo);
  }
}
