package io.github.onograph.cluster.raft.module.dprot;

import akka.remote.artery.tcp.SSLEngineProvider;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import org.neo4j.configuration.ssl.ClientAuth;
import org.neo4j.ssl.ClientSideHostnameVerificationEngineModification;
import org.neo4j.ssl.EssentialEngineModifications;
import org.neo4j.ssl.SslPolicy;
import scala.Option;


public class SSLEngineProviderDefaultImpl implements SSLEngineProvider {


  private final SSLContext sSLContext;


  private final SslPolicy sslPolicy;

  public SSLEngineProviderDefaultImpl(SslPolicy _sslPolicy) {
    this.sslPolicy = _sslPolicy;
    this.sSLContext = (new SSLContextManager(this.sslPolicy)).sscttSSLContext();
  }


  private SSLEngine _cresslenSSLEngine(boolean _isCi, int portNumber, String _strHsnm) {

    SSLEngine _sSLEngine = this.sSLContext.createSSLEngine(_strHsnm, portNumber);
    _sSLEngine = (new EssentialEngineModifications(this.sslPolicy.getTlsVersions(), _isCi)).apply(
        _sSLEngine);
    if (this.sslPolicy.getCipherSuites() != null) {
      _sSLEngine.setEnabledCipherSuites(this.sslPolicy.getCipherSuites().toArray(new String[0]));
    }

    return _sSLEngine;
  }

  @Override
  public SSLEngine createClientSSLEngine(String _strHsnm, int portNumber) {

    SSLEngine _sSLEngine = this._cresslenSSLEngine(true, portNumber, _strHsnm);
    if (this.sslPolicy.isVerifyHostname()) {
      _sSLEngine = (new ClientSideHostnameVerificationEngineModification()).apply(_sSLEngine);
    }

    return _sSLEngine;
  }

  @Override
  public SSLEngine createServerSSLEngine(String _strHsnm, int portNumber) {

    SSLEngine _sSLEngine = this._cresslenSSLEngine(false, portNumber, _strHsnm);
    _sSLEngine.setWantClientAuth(ClientAuth.OPTIONAL.equals(this.sslPolicy.getClientAuth()));
    _sSLEngine.setNeedClientAuth(ClientAuth.REQUIRE.equals(this.sslPolicy.getClientAuth()));
    return _sSLEngine;
  }

  @Override
  public Option<Throwable> verifyClientSession(String _strHsnm, SSLSession _sSLSession) {
    return Option.apply(null);
  }

  @Override
  public Option<Throwable> verifyServerSession(String _strHsnm, SSLSession _sSLSession) {
    return Option.apply(null);
  }
}
