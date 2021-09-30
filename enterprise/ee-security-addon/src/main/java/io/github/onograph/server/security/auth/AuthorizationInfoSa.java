package io.github.onograph.server.security.auth;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;


public interface AuthorizationInfoSa {


  AuthorizationInfo geatznhAuthorizationInfo(PrincipalCollection _principalCollection);
}
