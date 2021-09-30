package io.github.onograph.fabric.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import io.netty.channel.local.LocalAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;
import org.neo4j.kernel.impl.query.clientconnection.BoltConnectionInfo;

class AuthManagerFabricImplTest {

  @Test
  void testClaauch() {

    DefaultAuthManager defaultAuthManager = mock(DefaultAuthManager.class);
    doNothing().when(defaultAuthManager).claauch();
    (new AuthManagerFabricImpl(
        new AuthManagerFabricImpl(new AuthManagerFabricImpl(defaultAuthManager)))).claauch();
  }

  @Test
  void testClneac() {

    DefaultAuthManager defaultAuthManager = mock(DefaultAuthManager.class);
    doNothing().when(defaultAuthManager).clneac();
    (new AuthManagerFabricImpl(
        new AuthManagerFabricImpl(new AuthManagerFabricImpl(defaultAuthManager)))).clneac();
  }

  @Test
  void testConstructor() {

    new AuthManagerFabricImpl(new AuthManagerFabricImpl(
        new AuthManagerFabricImpl(new AuthManagerFabricImpl(new AuthManagerFabricImpl(null)))));
  }

  @Test
  void testGeitpautkMap() {
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso2 = new HashMap<String, Object>(1);
    assertTrue(
        AuthManagerFabricImpl
            .geitpautkMap(
                new AuthSubjectFabricImpl(_mapTaiso,
                    new AuthSubjectFabricImpl(_mapTaiso1,
                        new AuthSubjectFabricImpl(_mapTaiso2,
                            new AuthSubjectFabricImpl(null, null)))))
            .isEmpty());
  }

  @Test
  void testGeitpautkMap2() {
    assertThrows(IllegalArgumentException.class, () -> AuthManagerFabricImpl.geitpautkMap(null));
  }

  @Test
  void testGepiggatgcfList() {
    DefaultAuthManager defaultAuthManager = mock(DefaultAuthManager.class);
    ArrayList<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
    when(defaultAuthManager.gepiggatgcfList()).thenReturn(mapList);
    List<Map<String, String>> actualGepiggatgcfListResult = (new AuthManagerFabricImpl(
        new AuthManagerFabricImpl(
            new AuthManagerFabricImpl(defaultAuthManager)))).gepiggatgcfList();
    assertSame(mapList, actualGepiggatgcfListResult);
    assertTrue(actualGepiggatgcfListResult.isEmpty());
    verify(defaultAuthManager).gepiggatgcfList();
  }

  @Test
  void testLogin() throws InvalidAuthTokenException {
    DefaultLoginContext defaultLoginContext = mock(DefaultLoginContext.class);
    LocalAddress clientAddress = new LocalAddress("42");
    BoltConnectionInfo boltConnectionInfo = new BoltConnectionInfo("42", "Dr Jane Doe",
        clientAddress,
        new LocalAddress("42"));

    when(defaultLoginContext.connectionInfo()).thenReturn(boltConnectionInfo);
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso2 = new HashMap<String, Object>(1);
    when(defaultLoginContext.subject())
        .thenReturn(new AuthSubjectFabricImpl(_mapTaiso, new AuthSubjectFabricImpl(_mapTaiso1,
            new AuthSubjectFabricImpl(_mapTaiso2,
                new AuthSubjectFabricImpl(null,
                    null)))));
    DefaultAuthManager defaultAuthManager = mock(DefaultAuthManager.class);
    when(defaultAuthManager.login(any(), any()))
        .thenReturn(defaultLoginContext);
    AuthManagerFabricImpl authManagerFabricImpl = new AuthManagerFabricImpl(
        new AuthManagerFabricImpl(new AuthManagerFabricImpl(defaultAuthManager)));
    HashMap<String, Object> _mapTaso = new HashMap<String, Object>(1);
    LocalAddress clientAddress1 = new LocalAddress("42");
    DefaultLoginContext actualLoginResult = authManagerFabricImpl.login(_mapTaso,
        new BoltConnectionInfo("42", "Dr Jane Doe", clientAddress1,
            new LocalAddress("42")));
    assertSame(boltConnectionInfo, actualLoginResult.connectionInfo());
    AuthSubject subjectResult = actualLoginResult.subject();
    assertTrue(subjectResult instanceof AuthSubjectFabricImpl);
    assertTrue(((AuthSubjectFabricImpl) subjectResult).getMapTaiso().isEmpty());
    verify(defaultAuthManager).login(any(), any());
    verify(defaultLoginContext).connectionInfo();
    verify(defaultLoginContext).subject();
  }

  @Test
  void testLogin2() throws InvalidAuthTokenException {
    DefaultLoginContext defaultLoginContext = mock(DefaultLoginContext.class);
    LocalAddress clientAddress = new LocalAddress("42");
    BoltConnectionInfo boltConnectionInfo = new BoltConnectionInfo("42", "Dr Jane Doe",
        clientAddress,
        new LocalAddress("42"));

    when(defaultLoginContext.connectionInfo()).thenReturn(boltConnectionInfo);
    HashMap<String, Object> _mapTaiso = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso1 = new HashMap<String, Object>(1);
    HashMap<String, Object> _mapTaiso2 = new HashMap<String, Object>(1);
    when(defaultLoginContext.subject())
        .thenReturn(new AuthSubjectFabricImpl(_mapTaiso, new AuthSubjectFabricImpl(_mapTaiso1,
            new AuthSubjectFabricImpl(_mapTaiso2,
                new AuthSubjectFabricImpl(null,
                    null)))));
    DefaultAuthManager defaultAuthManager = mock(DefaultAuthManager.class);
    when(defaultAuthManager.login(any(), any()))
        .thenReturn(defaultLoginContext);
    AuthManagerFabricImpl authManagerFabricImpl = new AuthManagerFabricImpl(
        new AuthManagerFabricImpl(new AuthManagerFabricImpl(defaultAuthManager)));

    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("Key", "Value");
    LocalAddress clientAddress1 = new LocalAddress("42");
    DefaultLoginContext actualLoginResult = authManagerFabricImpl.login(stringObjectMap,
        new BoltConnectionInfo("42", "Dr Jane Doe", clientAddress1,
            new LocalAddress("42")));
    assertSame(boltConnectionInfo, actualLoginResult.connectionInfo());
    AuthSubject subjectResult = actualLoginResult.subject();
    assertTrue(subjectResult instanceof AuthSubjectFabricImpl);
    assertEquals(1, ((AuthSubjectFabricImpl) subjectResult).getMapTaiso().size());
    verify(defaultAuthManager).login(any(), any());
    verify(defaultLoginContext).connectionInfo();
    verify(defaultLoginContext).subject();
  }
}

