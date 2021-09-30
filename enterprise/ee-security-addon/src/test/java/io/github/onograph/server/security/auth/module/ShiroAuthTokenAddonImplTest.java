package io.github.onograph.server.security.auth.module;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.apache.shiro.authc.AuthenticationToken;
import org.junit.jupiter.api.Test;
import org.neo4j.server.security.auth.ShiroAuthToken;

class ShiroAuthTokenAddonImplTest {

  @Test
  void testOfShiroAuthTokenAddonImpl() {
    assertNull(ShiroAuthTokenAddonImpl.ofShiroAuthTokenAddonImpl(
            new ShiroAuthToken(new HashMap<String, Object>(1)))
        .getCredentials());
  }

  @Test
  void testOfShiroAuthTokenAddonImpl2() {
    ShiroAuthTokenAddonImpl actualOfShiroAuthTokenAddonImplResult = ShiroAuthTokenAddonImpl
        .ofShiroAuthTokenAddonImpl(
            (AuthenticationToken) new ShiroAuthToken(new HashMap<String, Object>(1)));
    assertTrue(actualOfShiroAuthTokenAddonImplResult.getAuthTokenMap().isEmpty());
    assertNull(actualOfShiroAuthTokenAddonImplResult.getCredentials());
  }

  @Test
  void testOfShiroAuthTokenAddonImpl3() {
    ShiroAuthTokenAddonImpl actualOfShiroAuthTokenAddonImplResult = ShiroAuthTokenAddonImpl
        .ofShiroAuthTokenAddonImpl((AuthenticationToken) ShiroAuthTokenAddonImpl
            .ofShiroAuthTokenAddonImpl(new ShiroAuthToken(new HashMap<String, Object>(1))));
    assertTrue(actualOfShiroAuthTokenAddonImplResult.getAuthTokenMap().isEmpty());
    assertNull(actualOfShiroAuthTokenAddonImplResult.getCredentials());
  }

  @Test
  void testOfShiroAuthTokenAddonImpl4() {
    ShiroAuthTokenAddonImpl actualOfShiroAuthTokenAddonImplResult = ShiroAuthTokenAddonImpl
        .ofShiroAuthTokenAddonImpl(new ShiroAuthToken(new HashMap<String, Object>(1)));
    assertTrue(actualOfShiroAuthTokenAddonImplResult.getAuthTokenMap().isEmpty());
    assertNull(actualOfShiroAuthTokenAddonImplResult.getCredentials());
  }

  @Test
  void testOfShiroAuthTokenAddonImpl5() {
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("Key", "Value");
    stringObjectMap.put("Key", "Value");
    ShiroAuthTokenAddonImpl actualOfShiroAuthTokenAddonImplResult = ShiroAuthTokenAddonImpl
        .ofShiroAuthTokenAddonImpl(new ShiroAuthToken(stringObjectMap));
    assertEquals(1, actualOfShiroAuthTokenAddonImplResult.getAuthTokenMap().size());
    assertNull(actualOfShiroAuthTokenAddonImplResult.getCredentials());
  }

  @Test
  void testClcns() {

    ShiroAuthTokenAddonImpl.ofShiroAuthTokenAddonImpl(
        new ShiroAuthToken(new HashMap<String, Object>(1))).clcns();
  }
}

