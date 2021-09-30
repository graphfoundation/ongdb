package io.github.onograph.cluster.raft.module.dprot;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.neo4j.ssl.SslPolicy;


public class SSLContextManager {


  private final SslPolicy sslPolicy;

  public SSLContextManager(SslPolicy _sslPolicy) {
    this.sslPolicy = _sslPolicy;
  }


  public SSLContext sscttSSLContext() {
    try {

      KeyStorePassword _psKeyStorePassword = new KeyStorePassword(32, new SecureRandom());

      SSLContext _sSLContext;
      try {

        char[] secret = _psKeyStorePassword.getSecret();

        KeyManagerFactory _keyManagerFactory = KeyManagerFactory.getInstance(
            KeyManagerFactory.getDefaultAlgorithm());

        KeyStore _keyStore = this.sslPolicy.getKeyStore(secret, secret);
        _keyManagerFactory.init(_keyStore, secret);

        SSLContext _sSLContext2 = SSLContext.getInstance(io.github.onograph.TokenConstants.TLS);

        KeyManager[] _sKeyManagerArray = _keyManagerFactory.getKeyManagers();

        TrustManager[] _sTrustManagerArray = this.sslPolicy.getTrustManagerFactory()
            .getTrustManagers();
        _sSLContext2.init(_sKeyManagerArray, _sTrustManagerArray, null);
        _sSLContext = _sSLContext2;
      } catch (

          Throwable _throwable) {
        try {
          _psKeyStorePassword.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _psKeyStorePassword.close();
      return _sSLContext;
    } catch (

        KeyManagementException | UnrecoverableKeyException | KeyStoreException | NoSuchAlgorithmException _generalSecurityException) {

      throw new RuntimeException("*** Error:  0adaf703-0969-4b04-962c-f6804ef667d7",
          _generalSecurityException);
    }
  }
}
