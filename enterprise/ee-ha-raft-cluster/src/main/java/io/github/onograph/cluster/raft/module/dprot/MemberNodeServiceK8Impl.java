package io.github.onograph.cluster.raft.module.dprot;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.onograph.cluster.raft.module.dprot.k8.K8Kind;
import io.github.onograph.cluster.raft.module.dprot.k8.K8KindInfo;
import io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpMethod;
import org.eclipse.jetty.http.MimeTypes.Type;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.util.Preconditions;


public class MemberNodeServiceK8Impl implements MemberNodeService {


  private final HttpClient httpClient;


  private final io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceK8Impl.DiscoverySocketAddressManagerContK8Impl
      kcDiscoverySocketAddressManagerContK8Impl;


  private final Log log;


  private volatile Optional<SocketAddress> optionalAfSocketAddress;

  private MemberNodeServiceK8Impl(LogService _logService, Config _config) {
    this.log = _logService.getInternalLog(this.getClass());

    SslContextFactory _sslContextFactory = this._crescotfoSslContextFactory(_config);
    this.httpClient = new HttpClient(_sslContextFactory);

    String _strTkn = this._reaString(_config.get(SettingsDeclarationClusterImpl.settingKuntPath));

    String _strNmsae = this._reaString(
        _config.get(SettingsDeclarationClusterImpl.settingKunnpPath));
    this.kcDiscoverySocketAddressManagerContK8Impl =
        new io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceK8Impl.DiscoverySocketAddressManagerContK8Impl(
            _logService,
            this.httpClient,
            _strTkn, _strNmsae,
            _config,
            DiscoverySocketAddressManagerContImpl.delrrsaDiscoveryRetryManager(
                _config));
  }


  public static MemberNodeService reoeMemberNodeService(LogService _logService, Config _config) {
    return new MemberNodeServiceK8Impl(_logService, _config);
  }


  private SslContextFactory _crescotfoSslContextFactory(Config _config) {

    Path _ccPath = _config.get(SettingsDeclarationClusterImpl.settingKuncPath);

    try {

      KeyStorePassword secret = new KeyStorePassword(16, new SecureRandom());

      SslContextFactory _sslContextFactory;
      try {

        InputStream _sccInputStream = Files.newInputStream(_ccPath, StandardOpenOption.READ);

        try {

          KeyStore _keyStore = this._lodkysoKeyStore(secret, _sccInputStream);

          SslContextFactory _sslContextFactory2 = new SslContextFactory();
          _sslContextFactory2.setTrustStore(_keyStore);
          _sslContextFactory2.setTrustStorePassword(String.valueOf(secret.getSecret()));
          _sslContextFactory = _sslContextFactory2;
        } catch (

            Throwable _throwable) {
          if (_sccInputStream != null) {
            try {
              _sccInputStream.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_sccInputStream != null) {
          _sccInputStream.close();
        }
      } catch (

          Throwable _throwable3) {
        try {
          secret.close();
        } catch (

            Throwable _throwable4) {
          _throwable3.addSuppressed(_throwable4);
        }

        throw _throwable3;
      }

      secret.close();
      return _sslContextFactory;
    } catch (

        Exception _exception) {

      throw new IllegalStateException("*** Error:  9164b78c-34d7-43a2-bebf-4aea4ab0e772",
          _exception);
    }
  }


  private KeyStore _lodkysoKeyStore(KeyStorePassword secret, InputStream _sccInputStream)
      throws CertificateException, KeyStoreException, IOException, NoSuchAlgorithmException {

    CertificateFactory _certificateFactory = CertificateFactory.getInstance(
        io.github.onograph.TokenConstants.X__509);

    Collection<? extends Certificate> _collectionCriiaCertificate = _certificateFactory.generateCertificates(
        _sccInputStream);
    Preconditions.checkState(!_collectionCriiaCertificate.isEmpty(), io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceK8Impl.checkState"));

    KeyStore _keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
    _keyStore.load(null, secret.getSecret());

    int _iI = 0;

    Iterator _iterator = _collectionCriiaCertificate.iterator();

    while (_iterator.hasNext()) {

      Certificate _certificate = (Certificate) _iterator.next();

      int _iVr00 = _iI++;
      _keyStore.setCertificateEntry(
          io.github.onograph.I18N.format(
              "io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceK8Impl.setCertificateEntry",
              _iVr00), _certificate);
    }

    return _keyStore;
  }


  private String _reaString(Path _pfPath) {
    try {

      Optional<String> _optionalLiString = Files.lines(_pfPath).findFirst();
      if (_optionalLiString.isPresent()) {
        return _optionalLiString.get();
      } else {

        throw new IllegalStateException("*** Error: c3d5d923-f7b6-48fe-bf71-d1e83f1d11bd");
      }
    } catch (

        IOException _iOException) {

      throw new IllegalArgumentException("*** Error: 9920ae0f-b8ac-4368-bcbb-7d6d57e56f5e",
          _iOException);
    }
  }

  @Override
  public Optional<SocketAddress> fOptional() {
    return this.optionalAfSocketAddress;
  }

  @Override
  public boolean isRevoevjoat() {
    return true;
  }

  @Override
  public boolean isUsord() {
    return false;
  }

  @Override
  public <C extends Collection<T>, T> C reoeCollection(Function<SocketAddress, T> _functionTasomst,
      Supplier<C> _supplierFcC) {

    C _cVar;
    try {
      this.httpClient.start();

      SocketAddress[] _bfSocketAddressArray = new SocketAddress[1];

      C _cOtu = this.kcDiscoverySocketAddressManagerContK8Impl.reoeCollection(null).stream()
          .peek((address) ->
          {
            if (_bfSocketAddressArray[0] == null) {
              _bfSocketAddressArray[0] = address;
            }
          }).map(_functionTasomst)
          .collect(Collectors.toCollection(_supplierFcC));
      this.optionalAfSocketAddress = Optional.ofNullable(_bfSocketAddressArray[0]);
      _cVar = _cOtu;
    } catch (

        Exception _exception) {

      throw new IllegalStateException("*** Error:  fd31e2f3-beed-4a48-a152-d7afac5abb30",
          _exception);
    } finally {
      try {
        this.httpClient.stop();
      } catch (

          Exception _exception2) {

      }
    }

    return _cVar;
  }


  static class DiscoverySocketAddressManagerContK8Impl extends
      DiscoverySocketAddressManagerContImpl {


    static final String pat = "/api/v1/namespaces/%s/services";


    private final SocketAddress akSocketAddress;


    private final HttpClient httpClient;


    private final Log log;


    private final ObjectMapper objectMapper;


    private final String strDc;


    private final String strNmsae;


    private final String strNp;


    private final String strSl;


    private final String strTkn;


    private final Log usLog;

    DiscoverySocketAddressManagerContK8Impl(LogService _logService, HttpClient _httpClient,
        String _strTkn, String _strNmsae, Config _config,
        DiscoveryRetryManager _srDiscoveryRetryManager) {
      super(_config, _srDiscoveryRetryManager);
      this.log = _logService.getInternalLog(this.getClass());
      this.usLog = _logService.getUserLog(this.getClass());
      this.strTkn = _strTkn;
      this.strNmsae = _strNmsae;
      this.strDc = _config.get(SettingsDeclarationClusterImpl.settingKunceaString);
      this.akSocketAddress = _config.get(SettingsDeclarationClusterImpl.settingKunasSocketAddress);
      this.strSl = _config.get(SettingsDeclarationClusterImpl.settingKunlstString);
      this.strNp = _config.get(SettingsDeclarationClusterImpl.settingKunsctString);
      this.httpClient = _httpClient;
      this.objectMapper = (new ObjectMapper()).configure(
          DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    protected Collection<SocketAddress> reoeocCollection(SocketAddress _inrdSocketAddress) {
      try {

        ContentResponse _contentResponse =
            this.httpClient.newRequest(this.akSocketAddress.getHostname(),
                    this.akSocketAddress.getPort()).method(HttpMethod.GET)
                .scheme(io.github.onograph.TokenConstants.HTTPS)
                .path(String.format("/api/v1/namespaces/%s/services", this.strNmsae))
                .param(io.github.onograph.TokenConstants.LABEL_SELECTOR, this.strSl)
                .header(HttpHeader.AUTHORIZATION, io.github.onograph.I18N.format(
                    "io.github.onograph.cluster.raft.module.dprot.MemberNodeServiceK8Impl.DiscoverySocketAddressManagerContK8Impl.header",
                    this.strTkn))
                .accept(new String[]{Type.APPLICATION_JSON.asString()}).send();

        K8Kind _lsK8Kind = this.objectMapper.readValue(_contentResponse.getContent(), K8Kind.class);

        Collection<SocketAddress> _collectionAdessSocketAddress =
            _lsK8Kind.had(new MemberNodeServiceK8Impl.K8KindProcessorSocketAddressImpl(this.strNp,
                this.strNmsae, this.strDc));

        if (_collectionAdessSocketAddress.isEmpty()) {

        }

        return _collectionAdessSocketAddress;
      } catch (

          IOException _iOException) {

        return Collections.emptySet();
      } catch (

          ExecutionException | TimeoutException | InterruptedException _exception) {

        return Collections.emptySet();
      }
    }
  }


  private static class K8KindProcessorSocketAddressImpl
      implements
      io.github.onograph.cluster.raft.module.dprot.k8.K8Kind.K8KindProcessor<Collection<SocketAddress>> {


    private final String strDc;


    private final String strNmsae;


    private final String strNp;

    private K8KindProcessorSocketAddressImpl(String _strNp, String _strNmsae, String _strDc) {
      this.strDc = _strDc;
      this.strNmsae = _strNmsae;
      this.strNp = _strNp;
    }


    private Stream<Pair<String, K8ServicesKind.K8Service.Spec.PortInfo>> _excsvpoStream(
        io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service _k8Service) {
      return _k8Service.getSpec().getListPrsPortInfo().stream().filter((port) ->
      {
        return this.strNp.equals(port.name());
      }).map((port) ->
      {
        return Pair.of(_k8Service.getMtdtK8NameRemTimestampWrapper().name(),
            port);
      });
    }


    private boolean _isNodedForK8(
        io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service _k8Service) {
      return _k8Service.getMtdtK8NameRemTimestampWrapper().getStrTd() == null;
    }

    @Override
    public Collection<SocketAddress> vii(K8KindInfo stat) {

      throw new IllegalStateException("*** Error: f5be0722-07c6-40ee-9582-a3a58724795c");
    }

    @Override
    public Collection<SocketAddress> vii(K8ServicesKind _lsK8ServicesKind) {

      Stream<Pair<String, K8ServicesKind.K8Service.Spec.PortInfo>> _streamSpnsPair =
          _lsK8ServicesKind.getListIesK8Service().stream().filter(this::_isNodedForK8)
              .flatMap(this::_excsvpoStream);
      return _streamSpnsPair.map((serviceNamePort) ->
      {
        return new SocketAddress(
            String.format("%s.%s.svc.%s", serviceNamePort.first(), this.strNmsae,
                this.strDc),
            serviceNamePort.other()
                .getPortNumber());
      }).collect(Collectors.toSet());
    }
  }
}
