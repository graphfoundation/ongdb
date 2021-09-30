package io.github.onograph.test;

import static io.github.onograph.kernel.api.security.DefaultAuthManager.NOU_DEFAULT_AUTH_MANAGER;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.neo4j.internal.kernel.api.security.SecurityContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModErrTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test1");
    }
    io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures0 = new io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures();
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager1 = NOU_DEFAULT_AUTH_MANAGER;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.defaultAuthManager = defaultAuthManager1;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.clantca();
  }

  @Test
  public void test2() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test2");
    }
    io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures0 = new io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures();
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = enterpriseSecurityCoreEnterpriseAuthProcedures0.securityContext;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.defaultAuthManager = NOU_DEFAULT_AUTH_MANAGER;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.clantca();
  }

  @Test
  public void test3() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test3");
    }
    io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures0 = new io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures();
    org.neo4j.graphdb.Transaction transaction1 = enterpriseSecurityCoreEnterpriseAuthProcedures0.transaction;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.defaultAuthManager = NOU_DEFAULT_AUTH_MANAGER;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.clantca();
  }

  @Test
  public void test4() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test4");
    }
    io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures0 = new io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures();
    enterpriseSecurityCoreEnterpriseAuthProcedures0.defaultAuthManager = NOU_DEFAULT_AUTH_MANAGER;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.securityContext = SecurityContext.AUTH_DISABLED;
    java.util.stream.Stream<io.github.onograph.server.security.auth.CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo> userAuthProcReturnInfoStream2 = enterpriseSecurityCoreEnterpriseAuthProcedures0.shcutuStream();
  }

  @Test
  public void test5() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test5");
    }
    io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures0 = new io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures();
    enterpriseSecurityCoreEnterpriseAuthProcedures0.securityContext = SecurityContext.AUTH_DISABLED;
    org.neo4j.internal.kernel.api.security.SecurityContext securityContext1 = enterpriseSecurityCoreEnterpriseAuthProcedures0.securityContext;
    io.github.onograph.kernel.api.security.DefaultAuthManager defaultAuthManager2 = enterpriseSecurityCoreEnterpriseAuthProcedures0.defaultAuthManager;
    org.neo4j.graphdb.Transaction transaction3 = enterpriseSecurityCoreEnterpriseAuthProcedures0.transaction;
    java.util.stream.Stream<io.github.onograph.server.security.auth.CoreEnterpriseAuthProcedures.UserAuthProcReturnInfo> userAuthProcReturnInfoStream4 = enterpriseSecurityCoreEnterpriseAuthProcedures0.shcutuStream();
  }

  @Test
  public void test6() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test6");
    }
    io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures enterpriseSecurityCoreEnterpriseAuthProcedures0 = new io.github.onograph.server.security.auth.EnterpriseSecurityCoreEnterpriseAuthProcedures();
    enterpriseSecurityCoreEnterpriseAuthProcedures0.securityContext = SecurityContext.AUTH_DISABLED;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.defaultAuthManager = NOU_DEFAULT_AUTH_MANAGER;
    enterpriseSecurityCoreEnterpriseAuthProcedures0.clantca();
  }
}

