package io.github.onograph.server.security.auth.module;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import org.apache.shiro.authc.AuthenticationToken;
import org.neo4j.server.security.auth.ShiroAuthToken;


public class ShiroAuthTokenAddonImpl extends ShiroAuthToken {


  private final char[] credsObj;

  private ShiroAuthTokenAddonImpl(Map<String, Object> _mapMtaso) {
    super(_mapMtaso);

    byte[] _ceetaByteArray = (byte[]) super.getCredentials();
    this.credsObj =
        _ceetaByteArray != null ? StandardCharsets.UTF_8.decode(ByteBuffer.wrap(_ceetaByteArray))
            .array() : null;
  }


  public static ShiroAuthTokenAddonImpl ofShiroAuthTokenAddonImpl(ShiroAuthToken _shiroAuthToken) {
    return new ShiroAuthTokenAddonImpl(_shiroAuthToken.getAuthTokenMap());
  }


  public static ShiroAuthTokenAddonImpl ofShiroAuthTokenAddonImpl(
      AuthenticationToken _authenticationToken) {

    ShiroAuthToken _shiroAuthToken = (ShiroAuthToken) _authenticationToken;
    return ofShiroAuthTokenAddonImpl(_shiroAuthToken);
  }


  void clcns() {
    if (this.credsObj != null) {
      Arrays.fill(this.credsObj, '\u0000');
    }
  }

  @Override
  public Object getCredentials() {
    return this.credsObj;
  }
}
