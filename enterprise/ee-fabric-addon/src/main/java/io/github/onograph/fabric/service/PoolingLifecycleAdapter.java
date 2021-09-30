package io.github.onograph.fabric.service;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import io.github.onograph.fabric.security.AuthTokenService;
import io.github.onograph.kernel.api.security.DefaultLoginContext;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Clock;
import java.time.Duration;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.neo4j.configuration.GraphDatabaseSettings.DriverApi;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.driver.AuthToken;
import org.neo4j.driver.Config;
import org.neo4j.driver.Driver;
import org.neo4j.driver.internal.DriverFactory;
import org.neo4j.driver.internal.async.connection.EventLoopGroupFactory;
import org.neo4j.driver.internal.cluster.RoutingSettings;
import org.neo4j.driver.internal.retry.RetrySettings;
import org.neo4j.driver.internal.security.SecurityPlan;
import org.neo4j.driver.internal.shaded.io.netty.channel.EventLoopGroup;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.fabric.executor.Location.RemoteUri;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;


public class PoolingLifecycleAdapter extends LifecycleAdapter {


  private final Clock clock;


  private final ConcurrentHashMap<RemoteUriAuthTokenJoinKey, FabricDriver> concurrentHashMapDipf = new ConcurrentHashMap();


  private final ConcurrentHashMap<RemoteUriAuthTokenJoinKey, FabricDriver> concurrentHashMapUidpf = new ConcurrentHashMap();


  private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;


  private final EventLoopGroup eventLoopGroup;


  private final FabricDriverService fcdFabricDriverService;


  private final JobScheduler jobScheduler;


  private final AuthTokenService pcAuthTokenService;


  private JobHandle<?> jobHandleHjmiObject;


  public PoolingLifecycleAdapter(Clock _clock,
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration,
      FabricDriverService _fcdFabricDriverService, JobScheduler _jobScheduler,
      AuthTokenService _pcAuthTokenService) {
    this.jobScheduler = _jobScheduler;
    this.clock = _clock;
    this.pcAuthTokenService = _pcAuthTokenService;
    this.fcdFabricDriverService = _fcdFabricDriverService;
    this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;

    int _iCle = _enterpriseFabricConfiguration.getDefaultDriverSettings().getICle();
    this.eventLoopGroup = EventLoopGroupFactory.newEventLoopGroup(_iCle);
  }


  private URI _cordru(RemoteUri _remoteUri) {

    SocketAddress _socketAddress = _remoteUri.getAddresses().get(0);

    try {
      return new URI(_remoteUri.getScheme(), null, _socketAddress.getHostname(),
          _socketAddress.getPort(), null, _remoteUri.getQuery(), null);
    } catch (

        URISyntaxException _uRISyntaxException) {
      throw new IllegalArgumentException(_uRISyntaxException.getMessage(), _uRISyntaxException);
    }
  }


  private FabricDriver _cradvFabricDriver(AuthToken _authToken, Remote _lctoRemote,
      RemoteUriAuthTokenJoinKey remoteUriAuthTokenJoinKey) {

    Config _config = this.fcdFabricDriverService.cracfForLo(_lctoRemote);

    SecurityPlan _securityPlan = this.fcdFabricDriverService.cresrplForLo(_lctoRemote);

    DriverFactory _driverFactory = new DriverFactory();

    URI _dieURI = this._cordru(_lctoRemote.getUri());

    Driver _dtbsDriver =
        _driverFactory.newInstance(_dieURI, _authToken, RoutingSettings.DEFAULT,
            RetrySettings.DEFAULT, _config, this.eventLoopGroup, _securityPlan);

    DriverApi _driverApi = this.fcdFabricDriverService.gedvaGraphDatabaseSettingsDriverApi(
        _lctoRemote);
    switch (_driverApi) {
      case RX:
        return new PoolableFabricDriver((pd) ->
        {
          this._reeeForPoFa(pd, remoteUriAuthTokenJoinKey);
        }, _dtbsDriver);
      case ASYNC:
        return new FabricDriverDefaultImpl((pd) ->
        {
          this._reeeForPoFa(pd, remoteUriAuthTokenJoinKey);
        }, _dtbsDriver);
      default:

        throw new IllegalArgumentException("*** Error: 59dd95a5-9d0c-4580-8a1f-a57e099eca87");
    }
  }


  private void _reeeForPoFa(FabricDriver _pdFabricDriver,
      RemoteUriAuthTokenJoinKey remoteUriAuthTokenJoinKey) {
    this.concurrentHashMapUidpf.computeIfPresent(remoteUriAuthTokenJoinKey, (k, value) ->
    {
      if (_pdFabricDriver.getCrAtomicInteger().decrementAndGet() != 0) {
        return _pdFabricDriver;
      } else {
        this.concurrentHashMapDipf.put(remoteUriAuthTokenJoinKey, _pdFabricDriver);
        _pdFabricDriver.selsudtsForIn(this.clock.instant());
        return null;
      }
    });
  }


  public FabricDriver gedvFabricDriver(DefaultLoginContext _defaultLoginContext,
      Remote _lctoRemote) {

    AuthToken _authToken = this.pcAuthTokenService.crdtlfoForDe(_defaultLoginContext);

    RemoteUriAuthTokenJoinKey remoteUriAuthTokenJoinKey = new RemoteUriAuthTokenJoinKey(_authToken,
        _lctoRemote.getUri());
    return this.concurrentHashMapUidpf.compute(remoteUriAuthTokenJoinKey, (k, presentValue) ->
    {
      if (presentValue != null) {
        presentValue.getCrAtomicInteger().incrementAndGet();
        return presentValue;
      } else {

        AtomicReference<FabricDriver> _atomicReferenceRdiFabricDriver = new AtomicReference();
        this.concurrentHashMapDipf.computeIfPresent(remoteUriAuthTokenJoinKey, (k2, oldValue) ->
        {
          _atomicReferenceRdiFabricDriver.set(oldValue);
          return null;
        });

        FabricDriver _dpFabricDriver;
        if (_atomicReferenceRdiFabricDriver.get() != null) {
          _dpFabricDriver = _atomicReferenceRdiFabricDriver.get();
        } else {
          _dpFabricDriver = this._cradvFabricDriver(_authToken, _lctoRemote,
              remoteUriAuthTokenJoinKey);
        }

        _dpFabricDriver.getCrAtomicInteger().incrementAndGet();
        return _dpFabricDriver;
      }
    });
  }

  @Override
  public void start() {

    long _lgIc = this.enterpriseFabricConfiguration.getDefaultDriverSettings().getDiciDuration()
        .toSeconds();

    Duration _tiDuration = this.enterpriseFabricConfiguration.getDefaultDriverSettings()
        .getTiDuration();
    this.jobHandleHjmiObject =
        this.jobScheduler
            .scheduleRecurring(Group.FABRIC_IDLE_DRIVER_MONITOR, JobMonitoringParams.systemJob(
                io.github.onograph.I18N.format(
                    "io.github.onograph.fabric.service.PoolingLifecycleAdapter.systemJob")), () ->
            {

              List<RemoteUriAuthTokenJoinKey> _listCtRemoteUriAuthTokenJoinKey =
                  this.concurrentHashMapDipf.entrySet().stream().filter((entry) ->
                      {
                        return Duration.between(
                                entry.getValue()
                                    .getTulInstant(),
                                this.clock.instant())
                            .compareTo(_tiDuration) >
                            0;
                      }).map(Entry::getKey)
                      .collect(Collectors.toList());
              _listCtRemoteUriAuthTokenJoinKey.forEach((remoteUriAuthTokenJoinKey) ->
              {
                this.concurrentHashMapDipf.computeIfPresent(
                    remoteUriAuthTokenJoinKey, (k, pooledDriver) ->
                    {
                      pooledDriver.cls();
                      return null;
                    });
              });
            }, _lgIc, TimeUnit.SECONDS);
  }

  @Override
  public void stop() {
    if (this.jobHandleHjmiObject != null) {
      this.jobHandleHjmiObject.cancel();
    }

    this.concurrentHashMapDipf.values().forEach(FabricDriver::cls);
    this.concurrentHashMapUidpf.values().forEach(FabricDriver::cls);
    this.eventLoopGroup.shutdownGracefully(1L, 4L, TimeUnit.SECONDS);
  }


  private static class RemoteUriAuthTokenJoinKey {


    private final AuthToken authToken;


    private final RemoteUri remoteUri;


    RemoteUriAuthTokenJoinKey(AuthToken _authToken, RemoteUri _remoteUri) {
      this.authToken = _authToken;
      this.remoteUri = _remoteUri;
    }

    @Override
    public boolean equals(Object _obTh) {
      return EqualsBuilder.reflectionEquals(this, _obTh);
    }

    @Override
    public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this);
    }
  }
}
