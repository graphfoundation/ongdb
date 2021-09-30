package io.github.onograph.fabric.security;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.neo4j.driver.AuthToken;
import org.neo4j.driver.Values;
import org.neo4j.driver.internal.security.InternalAuthToken;
import org.neo4j.internal.kernel.api.security.AuthSubject;


public class AuthTokenServiceExternalImpl implements AuthTokenService {


  public static <T, V> T crdtlfoForDe(AuthSubject _authSubject, Function<Object, V> _functionMvov,
      Function<Map<String, V>, T> _functionPtmt) {

    Map<String, Object> _mapTaiso = AuthManagerFabricImpl.geitpautkMap(_authSubject);

    Map<String, V> _mapTacsv = new HashMap();
    _mapTaiso.forEach((key, value) ->
    {
      if ("credentials".equals(key)) {
        _mapTacsv.put(key, _functionMvov.apply(new String((byte[]) value)));
      } else {
        _mapTacsv.put(key, _functionMvov.apply(value));
      }
    });
    return _functionPtmt.apply(_mapTacsv);
  }

  @Override
  public AuthToken crdtlfoForDe(DefaultLoginContext _defaultLoginContext) {
    return crdtlfoForDe(_defaultLoginContext.subject(), Values::value, InternalAuthToken::new);
  }
}
