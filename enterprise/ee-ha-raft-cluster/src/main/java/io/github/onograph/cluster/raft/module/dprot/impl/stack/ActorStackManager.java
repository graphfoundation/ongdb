package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.Done;
import akka.actor.ActorPath;
import akka.actor.ActorPaths;
import akka.actor.ActorRef;
import akka.actor.Address;
import akka.actor.CoordinatedShutdown;
import akka.actor.CoordinatedShutdown.Reason;
import akka.actor.Props;
import akka.actor.ProviderSelection;
import akka.cluster.Cluster;
import akka.cluster.client.ClusterClientReceptionist;
import akka.cluster.client.ClusterClientSettings;
import akka.event.EventStream;
import akka.japi.function.Procedure;
import akka.pattern.Patterns;
import akka.stream.OverflowStrategy;
import akka.stream.javadsl.Sink;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.SourceQueueWithComplete;
import io.github.onograph.cluster.raft.module.dprot.MemberNodeService;
import io.github.onograph.cluster.raft.module.dprot.impl.ActorLifecycleApproach;
import io.github.onograph.cluster.raft.module.dprot.impl.StartScheduler;
import io.github.onograph.cluster.raft.module.dprot.impl.structure.RestartMonitoringActor;
import io.github.onograph.config.ClusterMemberLimitAtCreationDTO;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.time.Duration;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.util.VisibleForTesting;
import scala.Option;
import scala.concurrent.duration.FiniteDuration;


public class ActorStackManager {


  private static final long ACO_SHTW_TMT_S = 15L;


  private static final int CLX_REOE_TMT_S = 10;


  private final ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO;


  private final Config config;


  private final ClusterJoinOrganizer fmjClusterJoinOrganizer;


  private final ActorStackBuilder fsaActorStackBuilder;


  private final Log log;


  private final MemberNodeService rsleMemberNodeService;


  private final ActorLifecycleApproach srsaActorLifecycleApproach;


  private final Duration tssaDuration;


  @VisibleForTesting
  protected ActorStack acsmcosActorStack;


  public ActorStackManager(ClusterMemberLimitAtCreationDTO clusterMemberLimitAtCreationDTO,
      Config _config, ClusterJoinOrganizer _fmjClusterJoinOrganizer,
      ActorStackBuilder _fsaActorStackBuilder, LogProvider _logProvider,
      MemberNodeService _rsleMemberNodeService,
      ActorLifecycleApproach _srsaaActorLifecycleApproach) {
    this.fsaActorStackBuilder = _fsaActorStackBuilder;
    this.rsleMemberNodeService = _rsleMemberNodeService;
    this.fmjClusterJoinOrganizer = _fmjClusterJoinOrganizer;
    this.config = _config;
    this.log = _logProvider.getLog(this.getClass());
    this.srsaActorLifecycleApproach = _srsaaActorLifecycleApproach;
    this.tssaDuration = this.config.get(SettingsDeclarationClusterSystemImpl.settingAkhweDuration);
    this.clusterMemberLimitAtCreationDTO = clusterMemberLimitAtCreationDTO;
  }


  private <T> CompletionStage<Done> _coptqueCompletionStage(
      SourceQueueWithComplete<T> _sourceQueueWithCompleteQeeT) {
    _sourceQueueWithCompleteQeeT.complete();
    return _sourceQueueWithCompleteQeeT.watchCompletion();
  }


  private CompletionStage<Done> _grfsunCompletionStage(ActorRef _actorRef) {
    return Patterns.gracefulStop(_actorRef, Duration.ofSeconds(15L)).thenApplyAsync((ignored) ->
    {
      return Done.done();
    }, this.acsmcosActorStack.getActorSystem().dispatcher());
  }


  private ActorRef _strrndlsnaoActorRef(StartScheduler _raStartScheduler) {

    Props _props = RestartMonitoringActor.prpProps(this.clsrCluster(), this.evnstaEventStream(),
        _raStartScheduler, this.getSrsaActorLifecycleApproach());
    return this.apcnaroActorRef(_props,
        io.github.onograph.TokenConstants.CC_CORE_RESTART_NEEDED_LISTENER);
  }


  private ActorPath _toacrptActorPath(SocketAddress _socketAddress) {

    String _strPa = String.format("%s://%s@%s/system/receptionist",
        io.github.onograph.TokenConstants.AKKA,
        io.github.onograph.TokenConstants.CC_DISCOVERY_ACTOR_SYSTEM, _socketAddress.toString());
    return ActorPaths.fromString(_strPa);
  }


  public void adsearsForCo(Collection<Address> _collectionAdessAddress) {
    this.fmjClusterJoinOrganizer.adsearsForCo(_collectionAdessAddress);
  }


  public ActorRef apcnaroActorRef(Props _props, String title) {

    ActorRef _actorRef = this.acsmcosActorStack.getActorSystem().actorOf(_props, title);
    this.acsmcosActorStack.getCoordinatedShutdown()
        .addTask(CoordinatedShutdown.PhaseServiceUnbind(), io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager.addTask2",
            title), () ->
        {
          return this._grfsunCompletionStage(_actorRef);
        });
    return _actorRef;
  }


  public ClusterClientReceptionist clecercoClusterClientReceptionist() {
    return this.acsmcosActorStack.clecercoClusterClientReceptionist();
  }


  public ClusterClientSettings clecestsClusterClientSettings() {

    Set<ActorPath> _setPaActorPath = this.rsleMemberNodeService.reoeCollection(
        this::_toacrptActorPath, HashSet::new);
    return ClusterClientSettings.create(this.acsmcosActorStack.getActorSystem())
        .withInitialContacts(_setPaActorPath)
        .withReconnectTimeout(Option.apply(FiniteDuration.apply(10L, TimeUnit.SECONDS)));
  }


  public Cluster clsrCluster() {
    return this.acsmcosActorStack.clsrCluster();
  }


  public void crecnaost() {
    this.acsmcosActorStack = new ActorStack(this.fsaActorStackBuilder, ProviderSelection.remote());
  }


  public void crectatssForSt(StartScheduler _raStartScheduler) {
    this.acsmcosActorStack = new ActorStack(this.fsaActorStackBuilder, ProviderSelection.cluster());

    Props _props = ClusterGatekeeperActor
        .prpProps(this._strrndlsnaoActorRef(_raStartScheduler), this.clsrCluster(),
            this.clusterMemberLimitAtCreationDTO, this.config,
            this.rsleMemberNodeService);
    this.apcnaroActorRef(_props, io.github.onograph.TokenConstants.JOINER)
        .tell(this.fmjClusterJoinOrganizer.meseJoinCluster(), ActorRef.noSender());
  }


  @VisibleForTesting
  void doshdnForAc(ActorStack _csaActorStack) throws Exception {
    _csaActorStack.getCoordinatedShutdown()
        .runAll(
            io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager.ReasonShutdownBySystemOriginationImpl.IT)
        .toCompletableFuture()
        .get(this.tssaDuration.toSeconds(), TimeUnit.SECONDS);
  }


  public EventStream evnstaEventStream() {
    return this.acsmcosActorStack.getActorSystem().eventStream();
  }


  public ActorLifecycleApproach getSrsaActorLifecycleApproach() {
    return this.srsaActorLifecycleApproach;
  }


  public <T> SourceQueueWithComplete<T> qumreSourceQueueWithComplete(Procedure<T> _procedureST) {

    SourceQueueWithComplete<T> _sourceQueueWithCompleteQeeT =
        (SourceQueueWithComplete<T>) Source.queue(1, OverflowStrategy.dropHead())
            .to(Sink.foreach((Procedure<Object>) _procedureST))
            .run(this.acsmcosActorStack.maeazActorMaterializer());
    this.acsmcosActorStack.getCoordinatedShutdown()
        .addTask(CoordinatedShutdown.PhaseServiceStop(), io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager.addTask",
            UUID.randomUUID()), () ->
        {
          return this._coptqueCompletionStage(_sourceQueueWithCompleteQeeT);
        });
    return _sourceQueueWithCompleteQeeT;
  }


  public ActorRef relarActorRef() {
    return this.acsmcosActorStack.relarActorRef();
  }


  public void shtw() throws Exception {
    if (this.acsmcosActorStack != null) {
      try {
        this.doshdnForAc(this.acsmcosActorStack);
      } catch (

          Exception _exception) {

        throw _exception;
      } finally {
        MessageLoggerActor.diaeForAc(this.acsmcosActorStack.getActorSystem());
        this.acsmcosActorStack = null;
      }
    }
  }


  public ActorRef sytaoofActorRef(Props _props, String title) {
    return this.acsmcosActorStack.getActorSystem().actorOf(_props, title);
  }


  private static class ReasonShutdownBySystemOriginationImpl implements Reason {


    static io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager.ReasonShutdownBySystemOriginationImpl IT =
        new io.github.onograph.cluster.raft.module.dprot.impl.stack.ActorStackManager.ReasonShutdownBySystemOriginationImpl();
  }
}
