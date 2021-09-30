package io.github.onograph.fabric.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;

class AuthMetaTest {

  @Test
  void testConstructor() throws UnsupportedEncodingException {
    AuthMeta actualAuthMeta = new AuthMeta(true, "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8"),
        "Uname");

    assertTrue(actualAuthMeta.getIsPoie());
    assertEquals("Uname", actualAuthMeta.getUname());
  }
}

