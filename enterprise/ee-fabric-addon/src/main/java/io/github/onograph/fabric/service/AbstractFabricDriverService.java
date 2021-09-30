package io.github.onograph.fabric.service;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.driver.Logging;
import org.neo4j.driver.internal.RevocationStrategy;
import org.neo4j.driver.internal.security.SecurityPlan;
import org.neo4j.logging.Level;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;


public abstract class AbstractFabricDriverService implements FabricDriverService {


  private final SSLContext sSLContext;


  private final Level slLevel;


  private final SslPolicy sslPolicy;

  protected AbstractFabricDriverService(Config _sreConfig, SslPolicyLoader _sslPolicyLoader,
      SslPolicyScope _sslPolicyScope) {
    this.slLevel = _sreConfig.get(GraphDatabaseSettings.store_internal_log_level);
    if (_sslPolicyLoader.hasPolicyForSource(_sslPolicyScope)) {
      this.sslPolicy = _sslPolicyLoader.getPolicy(_sslPolicyScope);
      this.sSLContext = _crescotSSLContext(this.sslPolicy);
    } else {
      this.sslPolicy = null;
      this.sSLContext = null;
    }
  }


  private static SSLContext _crescotSSLContext(SslPolicy _sslPolicy) {
    try {

      KeyManagerFactory _keyManagerFactory = null;
      if (_sslPolicy.privateKey() != null && _sslPolicy.certificateChain() != null) {

        KeyStore _kKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        _kKeyStore.load(null, null);
        _kKeyStore.setKeyEntry(io.github.onograph.TokenConstants.CLIENT_PRIVATE_KEY,
            _sslPolicy.privateKey(), null,
            _sslPolicy.certificateChain());
        _keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        _keyManagerFactory.init(_kKeyStore, null);
      }

      TrustManagerFactory _trustManagerFactory = _sslPolicy.getTrustManagerFactory();

      SSLContext _cSSLContext = SSLContext.getInstance(io.github.onograph.TokenConstants.TLS);

      KeyManager[] _sKeyManagerArray =
          _keyManagerFactory == null ? null : _keyManagerFactory.getKeyManagers();

      TrustManager[] _sTrustManagerArray =
          _trustManagerFactory == null ? null : _trustManagerFactory.getTrustManagers();
      _cSSLContext.init(_sKeyManagerArray, _sTrustManagerArray, null);
      return _cSSLContext;
    } catch (

        IOException | GeneralSecurityException _exception) {

      throw new IllegalArgumentException("*** Error:  013eab14-5f33-4bc0-9c18-c3e35c75c06c",
          _exception);
    }
  }


  private java.util.logging.Level _gelglLevel(ConfigAccessor configAccessor) {

    Level _lgigLevel = configAccessor.getConf(
        EnterpriseFabricConfiguration.DriverSettings::getLgigLevel);
    if (_lgigLevel == null) {
      _lgigLevel = this.slLevel;
    }

    switch (_lgigLevel) {
      case NONE:
        return java.util.logging.Level.OFF;
      case ERROR:
        return java.util.logging.Level.SEVERE;
      case WARN:
        return java.util.logging.Level.WARNING;
      case INFO:
        return java.util.logging.Level.INFO;
      case DEBUG:
        return java.util.logging.Level.FINE;
      default:

        throw new IllegalArgumentException("*** Error: a1192702-b961-45d5-8270-0e89acf8d58d");
    }
  }


  protected SecurityPlan cresrpl(boolean _isSd) {
    return this.sslPolicy != null && !_isSd ? new FabricSecurityPlan(true,
        this.sslPolicy.isVerifyHostname(), this.sSLContext)
        : new FabricSecurityPlan(false, false, null);
  }


  protected org.neo4j.driver.Config.ConfigBuilder prblcoiForAb(ConfigAccessor configAccessor) {

    org.neo4j.driver.Config.ConfigBuilder _configBuilder = org.neo4j.driver.Config.builder();

    Boolean _isSll = configAccessor.getConf(EnterpriseFabricConfiguration.DriverSettings::getIsSll);
    if (_isSll) {
      _configBuilder.withLeakedSessionsLogging();
    }

    Duration _tcbtiDuration = configAccessor.getConf(
        EnterpriseFabricConfiguration.DriverSettings::getItbctDuration);
    if (_tcbtiDuration != null) {
      _configBuilder.withConnectionLivenessCheckTimeout(_tcbtiDuration.toMillis(),
          TimeUnit.MILLISECONDS);
    } else {
      _configBuilder.withConnectionLivenessCheckTimeout(-1L, TimeUnit.MILLISECONDS);
    }

    Duration _mclDuration = configAccessor.getConf(
        EnterpriseFabricConfiguration.DriverSettings::getLcmDuration);
    if (_mclDuration != null) {
      _configBuilder.withMaxConnectionLifetime(_mclDuration.toMillis(), TimeUnit.MILLISECONDS);
    }

    Duration _tacDuration = configAccessor.getConf(
        EnterpriseFabricConfiguration.DriverSettings::getTacDuration);
    if (_tacDuration != null) {
      _configBuilder.withConnectionAcquisitionTimeout(_tacDuration.toMillis(),
          TimeUnit.MILLISECONDS);
    }

    Duration _tcDuration = configAccessor.getConf(
        EnterpriseFabricConfiguration.DriverSettings::getTcDuration);
    if (_tcDuration != null) {
      _configBuilder.withConnectionTimeout(_tcDuration.toMillis(), TimeUnit.MILLISECONDS);
    }

    Integer _iSpcm = configAccessor.getConf(EnterpriseFabricConfiguration.DriverSettings::getISpcm);
    if (_iSpcm != null) {
      _configBuilder.withMaxConnectionPoolSize(_iSpcm);
    }

    return _configBuilder.withLogging(Logging.javaUtilLogging(this._gelglLevel(configAccessor)));
  }


  protected interface ConfigAccessor {

    <T> T getConf(Function<EnterpriseFabricConfiguration.DriverSettings, T> _functionVaet);
  }


  private static final class FabricSecurityPlan implements SecurityPlan {


    private final boolean isEr;


    private final boolean isVhr;


    private final SSLContext sSLContext;


    FabricSecurityPlan(boolean _isEr, boolean _isVhr, SSLContext _sSLContext) {
      this.isEr = _isEr;
      this.isVhr = _isVhr;
      this.sSLContext = _sSLContext;
    }

    @Override
    public boolean requiresEncryption() {
      return this.isEr;
    }

    @Override
    public boolean requiresHostnameVerification() {
      return this.isVhr;
    }

    @Override
    public RevocationStrategy revocationStrategy() {
      return RevocationStrategy.NO_CHECKS;
    }

    @Override
    public SSLContext sslContext() {
      return this.sSLContext;
    }
  }
}
