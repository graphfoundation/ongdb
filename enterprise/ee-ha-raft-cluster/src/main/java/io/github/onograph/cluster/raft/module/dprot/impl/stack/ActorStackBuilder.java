package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.ActorSystem;
import akka.actor.BootstrapSetup;
import akka.actor.ProviderSelection;
import akka.actor.setup.ActorSystemSetup;
import akka.remote.artery.tcp.SSLEngineProvider;
import akka.remote.artery.tcp.SSLEngineProviderSetup;
import io.github.onograph.cluster.raft.module.dprot.DiscoveryInitialProcChecker;
import io.github.onograph.config.ClusterMemberLimitAtCreationDTO;
import java.util.Optional;
import org.neo4j.configuration.Config;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ActorStackBuilder {


  public static final String ACO_SYT_NME = io.github.onograph.TokenConstants.CC_DISCOVERY_ACTOR_SYSTEM;


  private final Log log;


  private final LogProvider logProvider;


  private final Optional<SSLEngineProvider> optionalPesSSLEngineProvider;


  private final TypesafeManagementAdapter scTypesafeManagementAdapter;

  public ActorStackBuilder(Optional<SSLEngineProvider> _optionalPesSSLEngineProvider,
      DiscoveryInitialProcChecker _dsfDiscoveryInitialProcChecker, Config _config,
      LogProvider _logProvider, ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO) {
    this.logProvider = _logProvider;
    this.optionalPesSSLEngineProvider = _optionalPesSSLEngineProvider;

    io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType _taArteryRemotingType =
        _optionalPesSSLEngineProvider.isPresent()
            ? io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TLS_TCP
            : io.github.onograph.cluster.raft.module.dprot.impl.stack.TypesafeManagementAdapter.ArteryRemotingType.RT_TCP;
    this.scTypesafeManagementAdapter =
        new TypesafeManagementAdapter(clusterMemberLimitAtCreationDTO, _config,
            _dsfDiscoveryInitialProcChecker, _taArteryRemotingType);
    this.log = _logProvider.getLog(this.getClass());
  }


  ActorSystem crearseActorSystem(ProviderSelection _providerSelection) {

    com.typesafe.config.Config _tConfig = this.scTypesafeManagementAdapter.geetConfig();
    if (this.log.isDebugEnabled()) {

    }

    BootstrapSetup _bootstrapSetup = BootstrapSetup.create(_tConfig)
        .withActorRefProvider(_providerSelection);

    ActorSystemSetup _actorSystemSetup = ActorSystemSetup.create(_bootstrapSetup);
    if (this.optionalPesSSLEngineProvider.isPresent()) {
      _actorSystemSetup = _actorSystemSetup.withSetup(SSLEngineProviderSetup.create((system) ->
      {
        return this.optionalPesSSLEngineProvider.get();
      }));
    }

    LoggingFilterImpl.enbForLo(this.logProvider);
    MessageLoggerActor.enbForLo(this.logProvider);

    ActorSystem _actorSystem = ActorSystem.create(
        io.github.onograph.TokenConstants.CC_DISCOVERY_ACTOR_SYSTEM, _actorSystemSetup);
    MessageLoggerActor.enbForLo(_actorSystem, this.logProvider);
    return _actorSystem;
  }
}
