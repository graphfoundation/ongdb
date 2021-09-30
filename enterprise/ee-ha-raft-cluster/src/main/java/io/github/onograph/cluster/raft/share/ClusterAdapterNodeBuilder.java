package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.akkamsg.InDirectionLogImpl;
import io.github.onograph.cluster.raft.akkamsg.serialization.ConsensusMessageToMessageDecoder;
import io.github.onograph.cluster.raft.akkamsg.serialization.MessageRequestCIHAManager;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataByteToMessageDecoder;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoderController;
import io.github.onograph.cluster.raft.akkamsg.serialization.current.decoding.CurrentConsensusByteToMessageDecoder;
import io.github.onograph.cluster.raft.control.AppComProFamilyGroupType;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.CPFProComFamilyProvider;
import io.github.onograph.cluster.raft.control.ComProFamilyUtilities;
import io.github.onograph.cluster.raft.control.MutableProtocols;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.NettyChannelSetupManagerServerImpl;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerMutableImpl;
import io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler;
import io.github.onograph.cluster.raft.control.connect.HandshakeLogger;
import io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ServerNettyChannelInitializer;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.logservice.ConsensusMessageLogService;
import io.github.onograph.cluster.raft.netty.ClusterAdapter;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageSimpleChannelInboundHandler;
import io.github.onograph.cluster.raft.share.calg.ConsensusNodeServerConfigurator;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelInboundHandler;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.CallableExecutor;
import org.neo4j.scheduler.Group;
import org.neo4j.time.SystemNanoClock;


public class ClusterAdapterNodeBuilder {


  public static final String CONS_SVX_NME = io.github.onograph.TokenConstants.RAFT_SERVER;


  private final ByteBufAllocator acByteBufAllocator;


  private final Collection<MutatingCurrentActiveComProFamilyWrapper> collectionSmpMutatingCurrentActiveComProFamilyWrapper;


  private final ConsensusMessageLogService<ConsensusNodeId> consensusMessageLogServiceLmrConsensusNodeId;


  private final ConsensusCommandReaderFactoryProvider crfsConsensusCommandReaderFactoryProvider;


  private final DatabaseIdRepository databaseIdRepository;


  private final GlobalModule globalModule;


  private final LogProvider itraLogProvider;


  private final ApplicationCurrentActiveComProFamilyWrapper pasApplicationCurrentActiveComProFamilyWrapper;


  private final PipelineBuilderManager pbfPipelineBuilderManager;


  private final NodeServerInfoLogService snsNodeServerInfoLogService;


  ClusterAdapterNodeBuilder(
      Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionSmpMutatingCurrentActiveComProFamilyWrapper,
      ConsensusMessageLogService<ConsensusNodeId> _consensusMessageLogServiceLmrConsensusNodeId,
      DatabaseIdRepository _databaseIdRepository, GlobalModule _globalModule,
      ApplicationCurrentActiveComProFamilyWrapper _pasApplicationCurrentActiveComProFamilyWrapper,
      PipelineBuilderManager _pbfPipelineBuilderManager,
      ConsensusCommandReaderFactoryProvider _sfrcConsensusCommandReaderFactoryProvider) {
    this.crfsConsensusCommandReaderFactoryProvider = _sfrcConsensusCommandReaderFactoryProvider;
    if (_pasApplicationCurrentActiveComProFamilyWrapper.getComProFamilyGroupCtgrT()
        != AppComProFamilyGroupType.RAFT_PROTOCOL) {

      throw new IllegalArgumentException("*** Error: e10e16ca-2a18-409c-9904-d93bbe69fd08");
    } else {
      this.globalModule = _globalModule;
      this.pasApplicationCurrentActiveComProFamilyWrapper = _pasApplicationCurrentActiveComProFamilyWrapper;
      this.consensusMessageLogServiceLmrConsensusNodeId = _consensusMessageLogServiceLmrConsensusNodeId;
      this.pbfPipelineBuilderManager = _pbfPipelineBuilderManager;
      this.collectionSmpMutatingCurrentActiveComProFamilyWrapper = _collectionSmpMutatingCurrentActiveComProFamilyWrapper;
      this.databaseIdRepository = _databaseIdRepository;
      this.snsNodeServerInfoLogService =
          new NodeServerInfoLogService(_globalModule.getLogService(),
              io.github.onograph.TokenConstants.RAFT_SERVER);
      this.itraLogProvider = this.snsNodeServerInfoLogService.getInternalLogProvider();
      this.acByteBufAllocator = _globalModule.getCentralBufferMangerHolder()
          .getNettyBufferAllocator();
    }
  }


  private Function<ApplicationComProFamilyType, Supplier<SyncableDataByteToMessageDecoder>> _gecudcFunction() {
    return (protocol) ->
    {

      SyncableDataMessageToMessageDecoderController _pdSyncableDataMessageToMessageDecoderController =
          new SyncableDataMessageToMessageDecoderController();

      boolean _isPsh = ComProFamilyUtilities.isCurrentSupported(protocol);
      return () ->
      {
        return new SyncableDataByteToMessageDecoder(_isPsh,
            _pdSyncableDataMessageToMessageDecoderController);
      };
    };
  }


  private List<io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFConfigurator.CPFDirection.InProcessor, ?>> _inlproList(
      Function<ApplicationComProFamilyType, Supplier<SyncableDataByteToMessageDecoder>> _functionDccas,
      ConsensusMessageSimpleChannelInboundHandler _hnConsensusMessageSimpleChannelInboundHandler) {

    SystemNanoClock _systemNanoClock = this.globalModule.getGlobalClock();

    ConsensusNodeServerConfigurator.CPFConfiguratorBuilder _vfCPFConfiguratorBuilder3 =
        new ConsensusNodeServerConfigurator.CPFConfiguratorBuilder(
            _hnConsensusMessageSimpleChannelInboundHandler, this.pbfPipelineBuilderManager,
            this.itraLogProvider, (c) ->
        {
          return new MessageRequestCIHAManager(c, this.itraLogProvider,
              new CurrentConsensusByteToMessageDecoder(
                  c,
                  this.crfsConsensusCommandReaderFactoryProvider),
              _functionDccas.apply(
                  ApplicationComProFamilyType.RC));
        }, () ->
        {
          return new ConsensusMessageToMessageDecoder(_systemNanoClock);
        }, ApplicationComProFamilyType.RC);

    return List.of(_vfCPFConfiguratorBuilder3);
  }


  private HandshakeEventHandler _inncnloHandshakeEventHandler(Config _config,
      LogProvider _logProvider) {

    HandshakeLogger _canlHandshakeLogger = new HandshakeLogger(_logProvider);
    _canlHandshakeLogger.loggeae(
        _config.get(SettingsDeclarationClusterSystemImpl.settingInnnotzniaBoolean));
    _config.addListener(SettingsDeclarationClusterSystemImpl.settingInnnotzniaBoolean,
        (before, after) ->
        {
          _canlHandshakeLogger.loggeae(after);
        });
    return _canlHandshakeLogger;
  }


  ClusterAdapter crersrClusterAdapter(
      ConsensusIncomingMessageManager _dmrConsensusIncomingMessageManager,
      ChannelInboundHandler _hpiChannelInboundHandler) {

    Config _config = this.globalModule.getGlobalConfig();

    ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl =
        new ComProFamilyManagerAppImpl(ApplicationComProFamilyType.values(),
            this.pasApplicationCurrentActiveComProFamilyWrapper);

    ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl =
        new ComProFamilyManagerMutableImpl(MutableProtocols.values(),
            this.collectionSmpMutatingCurrentActiveComProFamilyWrapper);

    ConsensusMessageSimpleChannelInboundHandler _hnConsensusMessageSimpleChannelInboundHandler =
        new ConsensusMessageSimpleChannelInboundHandler(this.itraLogProvider);

    CPFProComFamilyProvider<CPFConfigurator.CPFDirection.InProcessor> _cPFProComFamilyProviderRipInProcessor =
        new CPFProComFamilyProvider(this._inlproList(this._gecudcFunction(),
            _hnConsensusMessageSimpleChannelInboundHandler),
            MutatingProComClientManager.listAlsrinlMutatingProComClientManager);

    HandshakeEventHandler _lciHandshakeEventHandler = this._inncnloHandshakeEventHandler(_config,
        this.itraLogProvider);

    ServerNettyChannelInitializer _ihServerNettyChannelInitializer =
        new ServerNettyChannelInitializer(_rpaComProFamilyManagerAppImpl,
            _rpmComProFamilyManagerMutableImpl, _cPFProComFamilyProviderRipInProcessor,
            this.pbfPipelineBuilderManager, this.itraLogProvider, _lciHandshakeEventHandler);

    Duration _thDuration = _config.get(SettingsDeclarationClusterImpl.settingHahitDuration);

    NettyChannelSetupManagerServerImpl _ciNettyChannelSetupManagerServerImpl =
        new NettyChannelSetupManagerServerImpl(_ihServerNettyChannelInitializer,
            _lciHandshakeEventHandler, this.pbfPipelineBuilderManager, this.itraLogProvider,
            _thDuration);

    SocketAddress _alrSocketAddress = _config.get(
        SettingsDeclarationClusterImpl.settingRaiasSocketAddress);

    CallableExecutor _esrCallableExecutor = this.globalModule.getJobScheduler()
        .executor(Group.RAFT_SERVER);

    ClusterAdapter _srClusterAdapter = new ClusterAdapter(this.acByteBufAllocator,
        _alrSocketAddress,
        this.globalModule.getConnectorPortRegister(), _esrCallableExecutor,
        _hpiChannelInboundHandler,
        _ciNettyChannelSetupManagerServerImpl,
        NettyChannelClusterSettings.sevcfNettyChannelClusterSettings(_config),
        this.snsNodeServerInfoLogService);

    InDirectionLogImpl _irlInDirectionLogImpl = new InDirectionLogImpl(
        this.consensusMessageLogServiceLmrConsensusNodeId, this.databaseIdRepository,
        _hnConsensusMessageSimpleChannelInboundHandler);
    _irlInDirectionLogImpl.rethnForIn(_dmrConsensusIncomingMessageManager);
    return _srClusterAdapter;
  }
}
