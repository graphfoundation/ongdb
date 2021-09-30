package io.github.onograph.server.security.auth.module;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class AuthenticationTokenEnterprisePluginImplTest {

  @Test
  void testOfAuthenticationTokenEnterprisePluginImpl() {
    char[] credsObj = "AAAA".toCharArray();
    assertEquals(4,
        AuthenticationTokenEnterprisePluginImpl
            .ofAuthenticationTokenEnterprisePluginImpl(credsObj, new HashMap<String, Object>(1),
                "Usr Prcpl")
            .crdtl().length);
  }

  @Test
  void testClcns() {

    char[] credsObj = "AAAAAAAA".toCharArray();
    AuthenticationTokenEnterprisePluginImpl
        .ofAuthenticationTokenEnterprisePluginImpl(credsObj, new HashMap<String, Object>(1),
            "Usr Prcpl")
        .clcns();
  }

  @Test
  void testClcns2() {

    AuthenticationTokenEnterprisePluginImpl
        .ofAuthenticationTokenEnterprisePluginImpl(null, new HashMap<String, Object>(1),
            "Usr Prcpl")
        .clcns();
  }

  @Test
  void testCrdtl() {
    char[] credsObj = "AAAAAAAA".toCharArray();
    char[] actualCrdtlResult = AuthenticationTokenEnterprisePluginImpl
        .ofAuthenticationTokenEnterprisePluginImpl(credsObj, new HashMap<String, Object>(1),
            "Usr Prcpl")
        .crdtl();
    assertEquals(8, actualCrdtlResult.length);
    assertEquals('A', actualCrdtlResult[0]);
    assertEquals('A', actualCrdtlResult[1]);
    assertEquals('A', actualCrdtlResult[2]);
    assertEquals('A', actualCrdtlResult[3]);
    assertEquals('A', actualCrdtlResult[4]);
    assertEquals('A', actualCrdtlResult[5]);
    assertEquals('A', actualCrdtlResult[6]);
    assertEquals('A', actualCrdtlResult[7]);
  }

  @Test
  void testPaatsMap() {
    char[] credsObj = "AAAAAAAA".toCharArray();
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    Map<String, Object> actualPaatsMapResult = AuthenticationTokenEnterprisePluginImpl
        .ofAuthenticationTokenEnterprisePluginImpl(credsObj, stringObjectMap, "Usr Prcpl")
        .paatsMap();
    assertSame(stringObjectMap, actualPaatsMapResult);
    assertTrue(actualPaatsMapResult.isEmpty());
  }

  @Test
  void testPrnpString() {
    char[] credsObj = "AAAAAAAA".toCharArray();
    assertEquals("Usr Prcpl",
        AuthenticationTokenEnterprisePluginImpl
            .ofAuthenticationTokenEnterprisePluginImpl(credsObj, new HashMap<String, Object>(1),
                "Usr Prcpl")
            .prnpString());
  }
}

