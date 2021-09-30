package io.github.onograph.fabric.security;

import java.util.Map;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.internal.kernel.api.security.AuthenticationResult;


public class AuthSubjectFabricImpl implements AuthSubject {


  private final Map<String, Object> mapTaiso;


  private final AuthSubject wapdAuthSubject;


  public AuthSubjectFabricImpl(Map<String, Object> _mapTaiso, AuthSubject _wapdAuthSubject) {
    this.mapTaiso = _mapTaiso;
    this.wapdAuthSubject = _wapdAuthSubject;
  }

  @Override
  public AuthenticationResult getAuthenticationResult() {
    return this.wapdAuthSubject.getAuthenticationResult();
  }


  public Map<String, Object> getMapTaiso() {
    return this.mapTaiso;
  }

  @Override
  public boolean hasUsername(String uname) {
    return this.wapdAuthSubject.hasUsername(uname);
  }

  @Override
  public String username() {
    return this.wapdAuthSubject.username();
  }
}
