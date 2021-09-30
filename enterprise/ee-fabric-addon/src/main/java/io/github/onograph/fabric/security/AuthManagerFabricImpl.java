package io.github.onograph.fabric.security;

import io.github.onograph.kernel.api.security.DefaultAuthManager;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;


public class AuthManagerFabricImpl extends DefaultAuthManager {


  private final DefaultAuthManager wamDefaultAuthManager;

  public AuthManagerFabricImpl(DefaultAuthManager _wamDefaultAuthManager) {
    this.wamDefaultAuthManager = _wamDefaultAuthManager;
  }


  public static Map<String, Object> geitpautkMap(AuthSubject _authSubject) {
    if (!(_authSubject instanceof AuthSubjectFabricImpl)) {

      throw new IllegalArgumentException("*** Error: 707a7dae-ba5d-4ce6-948f-39a396a879ee");
    } else {
      return ((AuthSubjectFabricImpl) _authSubject).getMapTaiso();
    }
  }


  private Map<String, Object> _coyattonMap(Map<String, Object> _mapTaso)
      throws InvalidAuthTokenException {

    Map<String, Object> _mapTcso = new HashMap();

    Iterator _iterator = _mapTaso.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<String, Object> _entryEtyso = (Entry) _iterator.next();
      if ("credentials".equals(_entryEtyso.getKey())) {

        byte[] _ocByteArray = AuthToken.safeCastCredentials(
            io.github.onograph.TokenConstants.CREDENTIALS, _mapTaso);

        byte[] _ccByteArray = Arrays.copyOf(_ocByteArray, _ocByteArray.length);
        _mapTcso.put(_entryEtyso.getKey(), _ccByteArray);
      } else {
        _mapTcso.put(_entryEtyso.getKey(), _entryEtyso.getValue());
      }
    }

    return _mapTcso;
  }

  @Override
  public void claauch() {
    this.wamDefaultAuthManager.claauch();
  }

  @Override
  public void clneac() {
    this.wamDefaultAuthManager.clneac();
  }

  @Override
  public List<Map<String, String>> gepiggatgcfList() {
    return this.wamDefaultAuthManager.gepiggatgcfList();
  }

  @Override
  public void log(String m, SecurityContext _securityContext) {
    this.wamDefaultAuthManager.log(m, _securityContext);
  }

  @Override
  public DefaultLoginContext login(Map<String, Object> _mapTaso,
      ClientConnectionInfo _clientConnectionInfo) throws InvalidAuthTokenException {

    Map<String, Object> _mapTacso = this._coyattonMap(_mapTaso);

    DefaultLoginContext _clwDefaultLoginContext = this.wamDefaultAuthManager.login(_mapTaso,
        _clientConnectionInfo);

    AuthSubjectFabricImpl _safAuthSubjectFabricImpl = new AuthSubjectFabricImpl(_mapTacso,
        _clwDefaultLoginContext.subject());
    return new EnterpriseLoginContextServiceFabricImpl(_safAuthSubjectFabricImpl,
        _clwDefaultLoginContext);
  }
}
