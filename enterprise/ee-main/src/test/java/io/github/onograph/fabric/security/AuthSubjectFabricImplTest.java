package io.github.onograph.fabric.security;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

class AuthSubjectFabricImplTest {

  @Test
  void testConstructor() {
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    HashMap<String, Object> stringObjectMap1 = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    AuthSubjectFabricImpl authSubjectFabricImpl = new AuthSubjectFabricImpl(stringObjectMap1,
        new AuthSubjectFabricImpl(
            _mapTaiso,
            new AuthSubjectFabricImpl(_mapTaiso1, new AuthSubjectFabricImpl(null, null))));

    assertSame(stringObjectMap,
        (new AuthSubjectFabricImpl(stringObjectMap, authSubjectFabricImpl)).getMapTaiso());
    assertSame(stringObjectMap1, authSubjectFabricImpl.getMapTaiso());
  }
}

