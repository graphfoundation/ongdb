package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;
import org.neo4j.server.security.auth.ShiroAuthenticationInfo;

class EnterpriseAuthenticationStrategyTest {

  @Test
  void testAfterAttempt() throws AuthenticationException {
    EnterpriseAuthenticationStrategy enterpriseAuthenticationStrategy = new EnterpriseAuthenticationStrategy();
    SimpleAccountRealm _realm = new SimpleAccountRealm();
    UsernamePasswordToken _authenticationToken = new UsernamePasswordToken("janedoe", "iloveyou");

    SimpleAccount _irsAuthenticationInfo = new SimpleAccount(new SimplePrincipalCollection(),
        "Credentials");

    SimpleAccount simpleAccount = new SimpleAccount(new SimplePrincipalCollection(), "Credentials");

    assertSame(simpleAccount,
        enterpriseAuthenticationStrategy.afterAttempt(_realm, _authenticationToken,
            _irsAuthenticationInfo, simpleAccount, new Throwable()));
  }

  @Test
  void testBeforeAllAttempts() throws AuthenticationException {
    EnterpriseAuthenticationStrategy enterpriseAuthenticationStrategy = new EnterpriseAuthenticationStrategy();
    ArrayList<Realm> realmList = new ArrayList<Realm>();
    assertEquals(AuthenticationResult.FAILURE,
        ((ShiroAuthenticationInfo) enterpriseAuthenticationStrategy
            .beforeAllAttempts(realmList,
                new UsernamePasswordToken("janedoe", "iloveyou"))).getAuthenticationResult());
    assertEquals(realmList,
        ((ShiroAuthenticationInfo) enterpriseAuthenticationStrategy.beforeAllAttempts(realmList,
            new UsernamePasswordToken("janedoe",
                "iloveyou"))).getThrowables());
  }
}

