package io.github.onograph.fabric.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.neo4j.driver.Value;
import org.neo4j.driver.internal.security.InternalAuthToken;

class AuthTokenServiceExternalImplTest {

  @Test
  void testCrdtlfoForDe() {
    AuthTokenServiceExternalImpl authTokenServiceExternalImpl = new AuthTokenServiceExternalImpl();
    DefaultLoginContext defaultLoginContext = mock(DefaultLoginContext.class);
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso2 = new HashMap<String, Object>(1);
    when(defaultLoginContext.subject())
        .thenReturn(new AuthSubjectFabricImpl(_mapTaiso, new AuthSubjectFabricImpl(_mapTaiso1,
            new AuthSubjectFabricImpl(_mapTaiso2,
                new AuthSubjectFabricImpl(null,
                    null)))));
    assertTrue(
        ((InternalAuthToken) authTokenServiceExternalImpl.crdtlfoForDe(defaultLoginContext)).toMap()
            .isEmpty());
    verify(defaultLoginContext).subject();
  }

  @Test
  void testCrdtlfoForDe2() {
    AuthTokenServiceExternalImpl authTokenServiceExternalImpl = new AuthTokenServiceExternalImpl();

    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("Key", "Value");
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    DefaultLoginContext defaultLoginContext = mock(DefaultLoginContext.class);
    when(defaultLoginContext.subject())
        .thenReturn(new AuthSubjectFabricImpl(stringObjectMap, new AuthSubjectFabricImpl(_mapTaiso,
            new AuthSubjectFabricImpl(_mapTaiso1,
                new AuthSubjectFabricImpl(null,
                    null)))));
    Map<String, Value> toMapResult = ((InternalAuthToken) authTokenServiceExternalImpl
        .crdtlfoForDe(defaultLoginContext)).toMap();
    assertEquals(1, toMapResult.size());
    assertFalse(toMapResult.get("Key").isEmpty());
    verify(defaultLoginContext).subject();
  }

  @Test
  void testCrdtlfoForDe3() {
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso2 = new HashMap<String, Object>(1);
    AuthSubjectFabricImpl _authSubject = new AuthSubjectFabricImpl(_mapTaiso,
        new AuthSubjectFabricImpl(_mapTaiso1,
            new AuthSubjectFabricImpl(_mapTaiso2,
                new AuthSubjectFabricImpl(
                    null,
                    null))));

    Function<Object, Object> _functionMvov = (Function<Object, Object>) mock(Function.class);
    Function<Map<String, Object>, Object> function = (Function<Map<String, Object>, Object>) mock(
        Function.class);
    when(function.apply((Map<String, Object>) any())).thenReturn("Apply");
    assertEquals("Apply",
        AuthTokenServiceExternalImpl.<Object, Object>crdtlfoForDe(_authSubject, _functionMvov,
            function));
    verify(function).apply((Map<String, Object>) any());
  }

  @Test
  void testCrdtlfoForDe4() {
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("Key", "Value");
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    AuthSubjectFabricImpl _authSubject = new AuthSubjectFabricImpl(stringObjectMap,
        new AuthSubjectFabricImpl(_mapTaiso,
            new AuthSubjectFabricImpl(_mapTaiso1,
                new AuthSubjectFabricImpl(
                    null,
                    null))));

    Function<Object, Object> function = (Function<Object, Object>) mock(Function.class);
    when(function.apply((Object) any())).thenReturn("Apply");
    Function<Map<String, Object>, Object> function1 = (Function<Map<String, Object>, Object>) mock(
        Function.class);
    when(function1.apply((Map<String, Object>) any())).thenReturn("Apply");
    assertEquals("Apply",
        AuthTokenServiceExternalImpl.<Object, Object>crdtlfoForDe(_authSubject, function,
            function1));
    verify(function).apply((Object) any());
    verify(function1).apply((Map<String, Object>) any());
  }
}

