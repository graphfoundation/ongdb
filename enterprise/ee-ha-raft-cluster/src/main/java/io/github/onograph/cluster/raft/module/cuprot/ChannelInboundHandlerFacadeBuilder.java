package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.control.AppComProFamilyGroupType;
import io.github.onograph.cluster.raft.control.ApplicationComProFamilyType;
import io.github.onograph.cluster.raft.control.CPFConfigurator;
import io.github.onograph.cluster.raft.control.CPFProComFamilyProvider;
import io.github.onograph.cluster.raft.control.MutableProtocols;
import io.github.onograph.cluster.raft.control.MutatingProComClientManager;
import io.github.onograph.cluster.raft.control.NettyChannelSetupManagerServerImpl;
import io.github.onograph.cluster.raft.control.PipelineBuilderManager;
import io.github.onograph.cluster.raft.control.connect.ApplicationCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerAppImpl;
import io.github.onograph.cluster.raft.control.connect.ComProFamilyManagerMutableImpl;
import io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler;
import io.github.onograph.cluster.raft.control.connect.MutatingCurrentActiveComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ServerNettyChannelInitializer;
import io.github.onograph.cluster.raft.module.cuprot.current.CurrentCPFServerServiceConfigurator;
import io.github.onograph.cluster.raft.netty.ClusterAdapter;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.netty.NettyNioSettings;
import io.github.onograph.cluster.raft.share.NodeServerInfoLogService;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.socket.ServerSocketChannel;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;


public final class ChannelInboundHandlerFacadeBuilder {

  private ChannelInboundHandlerFacadeBuilder() {
  }


  public static io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHAdapterChannelHandlerService bulrChannelInboundHandlerFacadeBuilderCIHAdapterChannelHandlerService() {
    return new io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CMBFlowCoordinator();
  }


  public interface CIHAdapterChannelHandlerService {


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHSocketAddress causvhnChannelInboundHandlerFacadeBuilderCIHSocketAddress(
        AdapterChannelHandlerService _adapterChannelHandlerService);
  }


  public interface CIHConfigurable {


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable botcoChannelInboundHandlerFacadeBuilderCIHConfigurable(
        NettyChannelClusterSettings<? extends ServerSocketChannel> _nettyChannelClusterSettingsVServerSocketChannel);


    ClusterAdapter bulClusterAdapter();


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable cauioevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(
        IncomingEventService _incomingEventService);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable cauptsChannelInboundHandlerFacadeBuilderCIHConfigurable(
        ApplicationCurrentActiveComProFamilyWrapper _applicationCurrentActiveComProFamilyWrapper);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable cumacChannelInboundHandlerFacadeBuilderCIHConfigurable(
        ByteBufAllocator _byteBufAllocator);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable hahevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(
        HandshakeEventHandler _handshakeEventHandler);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable hahtitChannelInboundHandlerFacadeBuilderCIHConfigurable(
        Duration _duration);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable inlprohnChannelInboundHandlerFacadeBuilderCIHConfigurable(
        CurrentProtocolStackManager _currentProtocolStackManager);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable losveChannelInboundHandlerFacadeBuilderCIHConfigurable(
        LogService _logService);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable moipolChannelInboundHandlerFacadeBuilderCIHConfigurable(
        Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionVaMutatingCurrentActiveComProFamilyWrapper);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable potrgtChannelInboundHandlerFacadeBuilderCIHConfigurable(
        ConnectorPortRegister _connectorPortRegister);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable sevneChannelInboundHandlerFacadeBuilderCIHConfigurable(
        String _strV);


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable sspiChannelInboundHandlerFacadeBuilderCIHConfigurable(
        SslPolicy _sslPolicy);
  }


  public interface CIHSocketAddress {


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CMBJobScheduler litarsChannelInboundHandlerFacadeBuilderCMBJobScheduler(
        SocketAddress _socketAddress);
  }


  public interface CMBJobScheduler {


    io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable scelChannelInboundHandlerFacadeBuilderCIHConfigurable(
        JobScheduler _jobScheduler);
  }


  private static class CMBFlowCoordinator
      implements
      io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHAdapterChannelHandlerService,
      io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHSocketAddress,
      io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CMBJobScheduler,
      io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable {


    private ByteBufAllocator acByteBufAllocator;


    private Collection<MutatingCurrentActiveComProFamilyWrapper> collectionPmMutatingCurrentActiveComProFamilyWrapper;


    private ConnectorPortRegister connectorPortRegister;


    private HandshakeEventHandler handshakeEventHandler;


    private ChannelInboundHandler hpChannelInboundHandler;


    private AdapterChannelHandlerService hscAdapterChannelHandlerService;


    private Duration htDuration;


    private JobScheduler jobScheduler;


    private SocketAddress laSocketAddress;


    private IncomingEventService leicIncomingEventService;


    private LogService logService;


    private NettyChannelClusterSettings<? extends ServerSocketChannel> nettyChannelClusterSettingsCbServerSocketChannel;


    private ApplicationCurrentActiveComProFamilyWrapper pcApplicationCurrentActiveComProFamilyWrapper;


    private SslPolicy sslPolicy;


    private String strNs;

    private CMBFlowCoordinator() {
      this.pcApplicationCurrentActiveComProFamilyWrapper =
          ApplicationCurrentActiveComProFamilyWrapper.alkopolApplicationCurrentActiveComProFamilyWrapper(
              AppComProFamilyGroupType.CATCHUP_PROTOCOL);
      this.collectionPmMutatingCurrentActiveComProFamilyWrapper = List.of();
      this.hpChannelInboundHandler = new ChannelInboundHandlerAdapter();
      this.htDuration = Duration.ofSeconds(5L);
      this.connectorPortRegister = new ConnectorPortRegister();
      this.nettyChannelClusterSettingsCbServerSocketChannel = NettyNioSettings.nrcoNettyNioSettings();
      this.leicIncomingEventService = IncomingEventService.NOO_INCOMING_EVENT_SERVICE;
      this.acByteBufAllocator = PooledByteBufAllocator.DEFAULT;
      this.handshakeEventHandler = HandshakeEventHandler.NOO_HANDSHAKE_EVENT_HANDLER;
      this.strNs = io.github.onograph.TokenConstants.CATCHUP_SERVER;
      this.logService = NullLogService.getInstance();
    }


    private static List<io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFConfigurator.CPFDirection.InProcessor, ?>> _inlproList(
        LogProvider _dbgLogProvider, AdapterChannelHandlerService _hscAdapterChannelHandlerService,
        IncomingEventService _lseeIncomingEventService,
        PipelineBuilderManager _pipelineBuilderManager) {
      return List.of(
          new CurrentCPFServerServiceConfigurator.AbstractBuilder(_pipelineBuilderManager,
              _hscAdapterChannelHandlerService, _dbgLogProvider,
              _lseeIncomingEventService)
      );
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable botcoChannelInboundHandlerFacadeBuilderCIHConfigurable(
        NettyChannelClusterSettings<? extends ServerSocketChannel> _nettyChannelClusterSettingsCbServerSocketChannel) {
      this.nettyChannelClusterSettingsCbServerSocketChannel = _nettyChannelClusterSettingsCbServerSocketChannel;
      return this;
    }

    @Override
    public ClusterAdapter bulClusterAdapter() {

      NodeServerInfoLogService _snsNodeServerInfoLogService = new NodeServerInfoLogService(
          this.logService, this.strNs);

      ComProFamilyManagerAppImpl _rpaComProFamilyManagerAppImpl =
          new ComProFamilyManagerAppImpl(ApplicationComProFamilyType.values(),
              this.pcApplicationCurrentActiveComProFamilyWrapper);

      ComProFamilyManagerMutableImpl _rpmComProFamilyManagerMutableImpl =
          new ComProFamilyManagerMutableImpl(MutableProtocols.values(),
              this.collectionPmMutatingCurrentActiveComProFamilyWrapper);

      PipelineBuilderManager _fbpnPipelineBuilderManager = new PipelineBuilderManager(
          this.sslPolicy);

      Collection<io.github.onograph.cluster.raft.control.CPFConfigurator.AbstractBuilder<CPFConfigurator.CPFDirection.InProcessor, ?>>
          _collectionIpAbstractBuilder =
          _inlproList(_snsNodeServerInfoLogService.getInternalLogProvider(),
              this.hscAdapterChannelHandlerService, this.leicIncomingEventService,
              _fbpnPipelineBuilderManager);

      CPFProComFamilyProvider<CPFConfigurator.CPFDirection.InProcessor> _cPFProComFamilyProviderRipInProcessor =
          new CPFProComFamilyProvider(_collectionIpAbstractBuilder,
              MutatingProComClientManager.listAlsrinlMutatingProComClientManager);

      ServerNettyChannelInitializer _ihServerNettyChannelInitializer =
          new ServerNettyChannelInitializer(_rpaComProFamilyManagerAppImpl,
              _rpmComProFamilyManagerMutableImpl,
              _cPFProComFamilyProviderRipInProcessor,
              _fbpnPipelineBuilderManager, _snsNodeServerInfoLogService.getInternalLogProvider(),
              this.handshakeEventHandler);

      NettyChannelSetupManagerServerImpl _icNettyChannelSetupManagerServerImpl =
          new NettyChannelSetupManagerServerImpl(_ihServerNettyChannelInitializer,
              this.handshakeEventHandler, _fbpnPipelineBuilderManager,
              _snsNodeServerInfoLogService.getInternalLogProvider(), this.htDuration);

      Executor _executor = this.jobScheduler.executor(Group.CATCHUP_SERVER);
      return new ClusterAdapter(this.acByteBufAllocator, this.laSocketAddress,
          this.connectorPortRegister, _executor, this.hpChannelInboundHandler,
          _icNettyChannelSetupManagerServerImpl,
          this.nettyChannelClusterSettingsCbServerSocketChannel, _snsNodeServerInfoLogService);
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable cauioevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(
        IncomingEventService _lseeIncomingEventService) {
      this.leicIncomingEventService = _lseeIncomingEventService;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable cauptsChannelInboundHandlerFacadeBuilderCIHConfigurable(
        ApplicationCurrentActiveComProFamilyWrapper _pcApplicationCurrentActiveComProFamilyWrapper) {
      if (_pcApplicationCurrentActiveComProFamilyWrapper.getComProFamilyGroupCtgrT()
          != AppComProFamilyGroupType.CATCHUP_PROTOCOL) {

        throw new IllegalArgumentException("*** Error: 43a98bc5-8f60-46f2-baa1-c3ea9253d210");
      } else {
        this.pcApplicationCurrentActiveComProFamilyWrapper = _pcApplicationCurrentActiveComProFamilyWrapper;
        return this;
      }
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHSocketAddress causvhnChannelInboundHandlerFacadeBuilderCIHSocketAddress(
        AdapterChannelHandlerService _hscAdapterChannelHandlerService) {
      this.hscAdapterChannelHandlerService = _hscAdapterChannelHandlerService;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable cumacChannelInboundHandlerFacadeBuilderCIHConfigurable(
        ByteBufAllocator _acByteBufAllocator) {
      this.acByteBufAllocator = _acByteBufAllocator;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable hahevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(
        HandshakeEventHandler _leHandshakeEventHandler) {
      this.handshakeEventHandler = _leHandshakeEventHandler;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable hahtitChannelInboundHandlerFacadeBuilderCIHConfigurable(
        Duration _thDuration) {
      this.htDuration = _thDuration;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable inlprohnChannelInboundHandlerFacadeBuilderCIHConfigurable(
        CurrentProtocolStackManager _hpCurrentProtocolStackManager) {
      this.hpChannelInboundHandler = _hpCurrentProtocolStackManager;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CMBJobScheduler litarsChannelInboundHandlerFacadeBuilderCMBJobScheduler(
        SocketAddress _alSocketAddress) {
      this.laSocketAddress = _alSocketAddress;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable losveChannelInboundHandlerFacadeBuilderCIHConfigurable(
        LogService _logService) {
      this.logService = _logService;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable moipolChannelInboundHandlerFacadeBuilderCIHConfigurable(
        Collection<MutatingCurrentActiveComProFamilyWrapper> _collectionPmMutatingCurrentActiveComProFamilyWrapper) {
      this.collectionPmMutatingCurrentActiveComProFamilyWrapper = _collectionPmMutatingCurrentActiveComProFamilyWrapper;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable potrgtChannelInboundHandlerFacadeBuilderCIHConfigurable(
        ConnectorPortRegister _connectorPortRegister) {
      this.connectorPortRegister = _connectorPortRegister;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable scelChannelInboundHandlerFacadeBuilderCIHConfigurable(
        JobScheduler _jobScheduler) {
      this.jobScheduler = _jobScheduler;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable sevneChannelInboundHandlerFacadeBuilderCIHConfigurable(
        String _strNs) {
      this.strNs = _strNs;
      return this;
    }

    @Override
    public io.github.onograph.cluster.raft.module.cuprot.ChannelInboundHandlerFacadeBuilder.CIHConfigurable sspiChannelInboundHandlerFacadeBuilderCIHConfigurable(
        SslPolicy _sslPolicy) {
      this.sslPolicy = _sslPolicy;
      return this;
    }
  }
}
