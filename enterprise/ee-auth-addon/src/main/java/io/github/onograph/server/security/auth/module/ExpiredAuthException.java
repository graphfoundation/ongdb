package io.github.onograph.server.security.auth.module;


public class ExpiredAuthException extends RuntimeException {

  public ExpiredAuthException(String m) {
    super(m);
  }
}
