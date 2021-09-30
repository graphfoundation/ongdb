package io.github.onograph.cluster.raft.module.dprot;

import java.security.SecureRandom;
import java.util.Arrays;


public class KeyStorePassword implements AutoCloseable {


  private static final int loebod = 32;


  private static final int rag = 94;


  private static final int upebod = 126;


  private final char[] secret;

  public KeyStorePassword(int len, SecureRandom _secureRandom) {
    this.secret = new char[len];

    for (

        int cur = 0; cur < this.secret.length; ++cur) {
      this.secret[cur] = (char) (_secureRandom.nextInt(94) + 32);
    }
  }

  @Override
  public void close() {
    Arrays.fill(this.secret, '\u0000');
  }


  public char[] getSecret() {
    return this.secret;
  }
}
