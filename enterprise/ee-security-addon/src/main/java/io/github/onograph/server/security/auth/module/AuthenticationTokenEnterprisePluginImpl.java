package io.github.onograph.server.security.auth.module;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;


public class AuthenticationTokenEnterprisePluginImpl implements AuthenticationToken {


  private final char[] credsObj;


  private final Map<String, Object> mapPrmtrso;


  private final String usrPrcpl;


  private AuthenticationTokenEnterprisePluginImpl(char[] credsObj, Map<String, Object> _mapPrmtrso,
      String usrPrcpl) {
    this.credsObj = credsObj;
    this.mapPrmtrso = _mapPrmtrso;
    this.usrPrcpl = usrPrcpl;
  }


  public static AuthenticationTokenEnterprisePluginImpl crafmmpAuthenticationTokenEnterprisePluginImpl(
      Map<String, Object> _mapMtaso) throws InvalidAuthTokenException {

    String _strShm = org.neo4j.kernel.api.security.AuthToken.safeCast(
        io.github.onograph.TokenConstants.SCHEME, _mapMtaso);

    String usrPrcpl = org.neo4j.kernel.api.security.AuthToken.safeCast(
        io.github.onograph.TokenConstants.PRINCIPAL, _mapMtaso);

    byte[] credsObj = null;
    if (_strShm.equals(io.github.onograph.TokenConstants.BASIC)) {
      credsObj = org.neo4j.kernel.api.security.AuthToken.safeCastCredentials(
          io.github.onograph.TokenConstants.CREDENTIALS, _mapMtaso);
    } else {

      Object _obOc = _mapMtaso.get(io.github.onograph.TokenConstants.CREDENTIALS);
      if (_obOc instanceof byte[]) {
        credsObj = (byte[]) _obOc;
      }
    }

    Map<String, Object> _mapPrmtrso = org.neo4j.kernel.api.security.AuthToken.safeCastMap(
        io.github.onograph.TokenConstants.PARAMETERS, _mapMtaso);
    return ofAuthenticationTokenEnterprisePluginImpl(
        credsObj != null ? StandardCharsets.UTF_8.decode(ByteBuffer.wrap(credsObj)).array() : null,
        _mapPrmtrso, usrPrcpl);
  }


  public static AuthenticationTokenEnterprisePluginImpl ofAuthenticationTokenEnterprisePluginImpl(
      char[] credsObj, Map<String, Object> _mapPrmtrso, String usrPrcpl) {
    return new AuthenticationTokenEnterprisePluginImpl(credsObj, _mapPrmtrso, usrPrcpl);
  }


  void clcns() {
    if (this.credsObj != null) {
      Arrays.fill(this.credsObj, '\u0000');
    }
  }

  @Override
  public char[] crdtl() {
    return this.credsObj;
  }

  @Override
  public Map<String, Object> paatsMap() {
    return this.mapPrmtrso;
  }

  @Override
  public String prnpString() {
    return this.usrPrcpl;
  }
}
