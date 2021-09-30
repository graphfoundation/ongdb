package io.github.onograph.fabric.security;


public class AuthMeta {


  private final boolean isPoie;


  private final byte[] secret;


  private final String uname;


  public AuthMeta(boolean _isPoie, byte[] secret, String uname) {
    this.isPoie = _isPoie;
    this.secret = secret;
    this.uname = uname;
  }


  public boolean getIsPoie() {
    return this.isPoie;
  }


  public byte[] getSecret() {
    return this.secret;
  }


  public String getUname() {
    return this.uname;
  }
}
