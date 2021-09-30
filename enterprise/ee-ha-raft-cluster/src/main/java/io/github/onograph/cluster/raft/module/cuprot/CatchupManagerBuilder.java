package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.control.AppComProFamilyGroupType;
import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.CPFProComFamilyProvider;
import io.github.onograph.cluster.raft.control.MutableProtocols;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.NettyChannelInitializerClientImpl;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ClientNettyChannelInitializer;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerMutableImpl;
import io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.module.cuprot.current.CurrentCPFClientServiceConfigurator;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.netty.NettyNioSettings;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.socket.SocketChannel;
import java.time.Clock;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.time.Clocks;


public final class CatchupManagerBuilder {

  private CatchupManagerBuilder() {
  }


  public static io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl bulrCatchupManagerBuilderCatchupVersionedManagerImpl(
      JobScheduler _jobScheduler) {
    return new io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl(
        _jobScheduler);
  }


  public static class CatchupVersionedManagerImpl {


    private final JobScheduler jobScheduler;


    private ByteBufAllocator acByteBufAllocator;


    private Clock clock;


    private Collection<MutatingCurrentActiveComProFamilyWrapper> collectionPmMutatingCurrentActiveComProFamilyWrapper;


    private LogProvider dbgLogProvider;


    private NettyChannelClusterSettings<? extends SocketChannel> nettyChannelClusterSettingsCbSocketChannel;


    private NewChannelEventHandler newChannelEventHandler;


    private ApplicationCurrentActiveComProFamilyWrapper pcApplicationCurrentActiveComProFamilyWrapper;


    private SslPolicy sslPolicy;


    private Duration thDuration;


    private Duration tiDuration;

    private CatchupVersionedManagerImpl(JobScheduler _jobScheduler) {
      this.pcApplicationCurrentActiveComProFamilyWrapper =
          ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
              AppComProFamilyGroupType.CATCHUP_PROTOCOL);
      this.collectionPmMutatingCurrentActiveComProFamilyWrapper = List.of();
      this.dbgLogProvider = NullLogProvider.getInstance();
      this.tiDuration = Duration.ofMinutes(1L);
      this.thDuration = Duration.ofSeconds(5L);
      this.clock = Clocks.nanoClock();
      this.acByteBufAllocator = ByteBufAllocator.DEFAULT;
      this.nettyChannelClusterSettingsCbSocketChannel = NettyNioSettings.nicicoNettyNioSettings();
      this.newChannelEventHandler = NewChannelEventHandler.DEFAULT;
      this.jobScheduler = _jobScheduler;
    }


    private Map<ApplicationComProFamily, io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFConfigurator.CPFDirection.OutProcessor, ?>> _bupcmpMap(
        CatchupAnswerLimitHandler _catchupAnswerLimitHandler,
        PipelineBuilderManager _fpPipelineBuilderManager) {
      return Map.of(
          ApplicationComProFamilyType.CT_CURRV,
          new CurrentCPFClientServiceConfigurator.AbstractBuilder(_catchupAnswerLimitHandler,
              this.dbgLogProvider, _fpPipelineBuilderManager)
      );
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl botcoCatchupManagerBuilderCatchupVersionedManagerImpl(
        NettyChannelClusterSettings<? extends SocketChannel> _nettyChannelClusterSettingsCbSocketChannel) {
      this.nettyChannelClusterSettingsCbSocketChannel = _nettyChannelClusterSettingsCbSocketChannel;
      return this;
    }


    public LifecycleCatchupManagerImpl bulLifecycleCatchupManagerImpl() {

      ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl =
          new ComProFamilyManagerAppImpl(ApplicationComProFamilyType.values(),
              this.pcApplicationCurrentActiveComProFamilyWrapper);

      ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl =
          new ComProFamilyManagerMutableImpl(MutableProtocols.values(),
              this.collectionPmMutatingCurrentActiveComProFamilyWrapper);

      PipelineBuilderManager _fpPipelineBuilderManager = new PipelineBuilderManager(this.sslPolicy);

      Function<CatchupAnswerLimitHandler, NettyChannelInitializerClientImpl> _functionFiccn = (handler) ->
      {

        Collection<io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFConfigurator.CPFDirection.OutProcessor, ?>>
            _collectionIsalrAbstractBuilder =
            this._bupcmpMap(handler, _fpPipelineBuilderManager).values();

        CPFProComFamilyProvider<CPFConfigurator.CPFDirection.OutProcessor> _cPFProComFamilyProviderRipOutProcessor =
            new CPFProComFamilyProvider(_collectionIsalrAbstractBuilder,
                MutatingProComClientManager.listAlciinlMutatingProComClientManager);

        ClientNettyChannelInitializer _ihClientNettyChannelInitializer =
            new ClientNettyChannelInitializer(_rpaComProFamilyManagerAppImpl,
                _rpmComProFamilyManagerMutableImpl,
                _cPFProComFamilyProviderRipOutProcessor, _fpPipelineBuilderManager,
                this.thDuration, this.dbgLogProvider, this.dbgLogProvider);
        return new NettyChannelInitializerClientImpl(_ihClientNettyChannelInitializer,
            _fpPipelineBuilderManager, this.dbgLogProvider,
            this.thDuration);
      };

      CatchupNettyChannelPoolLifecycleAdapter _ccpsCatchupNettyChannelPoolLifecycleAdapter =
          new CatchupNettyChannelPoolLifecycleAdapter(this.acByteBufAllocator, this.clock,
              _functionFiccn, this.jobScheduler,
              this.nettyChannelClusterSettingsCbSocketChannel,
              this.newChannelEventHandler);
      return new LifecycleCatchupManagerImpl(_ccpsCatchupNettyChannelPoolLifecycleAdapter,
          this.tiDuration);
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl cauptsCatchupManagerBuilderCatchupVersionedManagerImpl(
        ApplicationCurrentActiveComProFamilyWrapper _pcApplicationCurrentActiveComProFamilyWrapper) {
      if (_pcApplicationCurrentActiveComProFamilyWrapper.getComProFamilyGroupCtgrT()
          != AppComProFamilyGroupType.CATCHUP_PROTOCOL) {

        AppComProFamilyGroupType _appComProFamilyGroupType = AppComProFamilyGroupType.CATCHUP_PROTOCOL;

        throw new IllegalArgumentException("*** Error: 6277d1dd-917f-4f68-9e81-12b9c81b285d");
      } else {
        this.pcApplicationCurrentActiveComProFamilyWrapper = _pcApplicationCurrentActiveComProFamilyWrapper;
        return this;
      }
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl checalieCatchupManagerBuilderCatchupVersionedManagerImpl(
        NewChannelEventHandler newChannelEventHandler) {
      this.newChannelEventHandler = newChannelEventHandler;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl clcCatchupManagerBuilderCatchupVersionedManagerImpl(
        Clock _clock) {
      this.clock = _clock;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl cumacCatchupManagerBuilderCatchupVersionedManagerImpl(
        ByteBufAllocator _caByteBufAllocator) {
      this.acByteBufAllocator = _caByteBufAllocator;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl delporCatchupManagerBuilderCatchupVersionedManagerImpl(
        LogProvider _dbgLogProvider) {
      this.dbgLogProvider = _dbgLogProvider;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl hashtitCatchupManagerBuilderCatchupVersionedManagerImpl(
        Duration _thDuration) {
      this.thDuration = _thDuration;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl inituCatchupManagerBuilderCatchupVersionedManagerImpl(
        Duration _tiDuration) {
      this.tiDuration = _tiDuration;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl moipolCatchupManagerBuilderCatchupVersionedManagerImpl(
        Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionPmMutatingCurrentActiveComProFamilyWrapper) {
      this.collectionPmMutatingCurrentActiveComProFamilyWrapper = _collectionPmMutatingCurrentActiveComProFamilyWrapper;
      return this;
    }


    public io.github.onograph.cluster.raft.module.cuprot.CatchupManagerBuilder.CatchupVersionedManagerImpl sspiCatchupManagerBuilderCatchupVersionedManagerImpl(
        SslPolicy _sslPolicy) {
      this.sslPolicy = _sslPolicy;
      return this;
    }
  }
}
