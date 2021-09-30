package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.control.connect.HandshakeEventHandler;
import io.github.onograph.cluster.raft.control.connect.HandshakeLogger;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.IncomingEventServiceLog;
import io.github.onograph.cluster.raft.netty.ClusterAdapter;
import io.github.onograph.cluster.raft.netty.CurrentProtocolStackManager;
import io.github.onograph.cluster.raft.netty.NettyChannelClusterSettings;
import io.github.onograph.cluster.raft.share.ProFamilyManagementService;
import io.github.onograph.config.Backup;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import io.netty.buffer.ByteBufAllocator;
import java.time.Duration;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.configuration.ssl.SslPolicyScope;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.LogService;
import org.neo4j.logging.internal.PrefixedLogProvider;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.ssl.SslPolicy;
import org.neo4j.ssl.config.SslPolicyLoader;


public class ClusterCatchupNodeManager {


  public static final String BAK_SVX_NME = io.github.onograph.TokenConstants.BACKUP_SERVER;


  private static final String CACP_SVX_NME = io.github.onograph.TokenConstants.CATCHUP_SERVER;


  private static final Duration TXS_PUL_REQ_BACN_LTM = Duration.ofMinutes(5L);


  private final ByteBufAllocator abnByteBufAllocator;


  private final ConnectorPortRegister connectorPortRegister;


  private final Config goaConfig;


  private final JobScheduler jobScheduler;


  private final IncomingEventService leiIncomingEventService;


  private final LogService logService;


  private final ProFamilyManagementService proFamilyManagementService;


  private final SslPolicyLoader sslPolicyLoader;


  private ClusterCatchupNodeManager(ByteBufAllocator _abnByteBufAllocator,
      ConnectorPortRegister _connectorPortRegister, Config _goaConfig, JobScheduler _jobScheduler,
      IncomingEventService _leiIncomingEventService, LogService _logService,
      SslPolicyLoader _sslPolicyLoader) {
    this.leiIncomingEventService = _leiIncomingEventService;
    this.proFamilyManagementService = new ProFamilyManagementService(_goaConfig,
        _logService.getInternalLogProvider());
    this.sslPolicyLoader = _sslPolicyLoader;
    this.goaConfig = _goaConfig;
    this.jobScheduler = _jobScheduler;
    this.connectorPortRegister = _connectorPortRegister;
    this.logService = _logService;
    this.abnByteBufAllocator = _abnByteBufAllocator;
  }


  public static ClusterCatchupNodeManager fatyClusterCatchupNodeManager(GlobalModule _globalModule,
      SslPolicyLoader _sslPolicyLoader) {

    JobScheduler _jobScheduler = _globalModule.getJobScheduler();

    LogService _logService = _globalModule.getLogService();

    IncomingEventServiceLog _leiIncomingEventServiceLog = _globalModule.getGlobalLife()
        .add(new IncomingEventServiceLog(_jobScheduler,
            _logService.getInternalLogProvider(),
            TXS_PUL_REQ_BACN_LTM));
    return new ClusterCatchupNodeManager(
        _globalModule.getCentralBufferMangerHolder().getNettyBufferAllocator(),
        _globalModule.getConnectorPortRegister(),
        _globalModule.getGlobalConfig(), _jobScheduler, _leiIncomingEventServiceLog, _logService,
        _sslPolicyLoader);
  }


  public static boolean isBapieaForCo(Config _config) {
    return _config.get(Backup.settingOneubBoolean);
  }


  private SslPolicy _gespiSslPolicy(SslPolicyScope _sslPolicyScope) {
    return this.sslPolicyLoader.hasPolicyForSource(_sslPolicyScope)
        ? this.sslPolicyLoader.getPolicy(_sslPolicyScope) : null;
  }


  private HandshakeEventHandler _inncnloHandshakeEventHandler(LogProvider _itraLogProvider) {

    HandshakeLogger _canlHandshakeLogger = new HandshakeLogger(_itraLogProvider);
    _canlHandshakeLogger
        .loggeae(this.goaConfig.get(SettingsDeclarationClusterSystemImpl.settingInnnotzniaBoolean));
    this.goaConfig.addListener(SettingsDeclarationClusterSystemImpl.settingInnnotzniaBoolean,
        (before, after) ->
        {
          _canlHandshakeLogger.loggeae(after);
        });
    return _canlHandshakeLogger;
  }


  public ClusterAdapter crebusvClusterAdapter(
      AdapterChannelHandlerService _cshAdapterChannelHandlerService,
      CurrentProtocolStackManager _hpiCurrentProtocolStackManager) {

    SocketAddress _abSocketAddress = this.goaConfig.get(Backup.settingOneutdSocketAddress);
    return ChannelInboundHandlerFacadeBuilder.bulrChannelInboundHandlerFacadeBuilderCIHAdapterChannelHandlerService()
        .causvhnChannelInboundHandlerFacadeBuilderCIHSocketAddress(_cshAdapterChannelHandlerService)
        .litarsChannelInboundHandlerFacadeBuilderCMBJobScheduler(_abSocketAddress)
        .scelChannelInboundHandlerFacadeBuilderCIHConfigurable(this.jobScheduler)
        .cauptsChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this.proFamilyManagementService.surcappoApplicationCurrentActiveComProFamilyWrapper())
        .inlprohnChannelInboundHandlerFacadeBuilderCIHConfigurable(_hpiCurrentProtocolStackManager)
        .sspiChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this._gespiSslPolicy(SslPolicyScope.BACKUP))
        .botcoChannelInboundHandlerFacadeBuilderCIHConfigurable(
            NettyChannelClusterSettings.sevcfNettyChannelClusterSettings(this.goaConfig))
        .moipolChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this.proFamilyManagementService.surmoeptsList())
        .potrgtChannelInboundHandlerFacadeBuilderCIHConfigurable(this.connectorPortRegister)
        .sevneChannelInboundHandlerFacadeBuilderCIHConfigurable(
            io.github.onograph.TokenConstants.BACKUP_SERVER)
        .losveChannelInboundHandlerFacadeBuilderCIHConfigurable(this.logService)
        .hahtitChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this.goaConfig.get(SettingsDeclarationClusterImpl.settingHahitDuration))
        .cauioevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(
            new DefaultIncomingEventServiceLog(
                new PrefixedLogProvider(this.logService.getInternalLogProvider(),
                    io.github.onograph.TokenConstants.BACKUP_SERVER)))
        .cumacChannelInboundHandlerFacadeBuilderCIHConfigurable(this.abnByteBufAllocator)
        .bulClusterAdapter();
  }


  public ClusterAdapter crechsrClusterAdapter(
      CurrentProtocolStackManager _hpiCurrentProtocolStackManager,
      AdapterChannelHandlerService _hscAdapterChannelHandlerService) {

    SocketAddress _acSocketAddress = this.goaConfig.get(
        SettingsDeclarationClusterImpl.settingTranerSocketAddress);
    return ChannelInboundHandlerFacadeBuilder.bulrChannelInboundHandlerFacadeBuilderCIHAdapterChannelHandlerService()
        .causvhnChannelInboundHandlerFacadeBuilderCIHSocketAddress(_hscAdapterChannelHandlerService)
        .litarsChannelInboundHandlerFacadeBuilderCMBJobScheduler(_acSocketAddress)
        .scelChannelInboundHandlerFacadeBuilderCIHConfigurable(this.jobScheduler)
        .cauptsChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this.proFamilyManagementService.surcappoApplicationCurrentActiveComProFamilyWrapper())
        .botcoChannelInboundHandlerFacadeBuilderCIHConfigurable(
            NettyChannelClusterSettings.sevcfNettyChannelClusterSettings(this.goaConfig))
        .potrgtChannelInboundHandlerFacadeBuilderCIHConfigurable(this.connectorPortRegister)
        .inlprohnChannelInboundHandlerFacadeBuilderCIHConfigurable(_hpiCurrentProtocolStackManager)
        .sevneChannelInboundHandlerFacadeBuilderCIHConfigurable(
            io.github.onograph.TokenConstants.CATCHUP_SERVER)
        .losveChannelInboundHandlerFacadeBuilderCIHConfigurable(this.logService)
        .moipolChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this.proFamilyManagementService.surmoeptsList())
        .sspiChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this._gespiSslPolicy(SslPolicyScope.CLUSTER))
        .hahtitChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this.goaConfig.get(SettingsDeclarationClusterImpl.settingHahitDuration))
        .cauioevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(this.leiIncomingEventService)
        .cumacChannelInboundHandlerFacadeBuilderCIHConfigurable(this.abnByteBufAllocator)
        .hahevlieChannelInboundHandlerFacadeBuilderCIHConfigurable(
            this._inncnloHandshakeEventHandler(
                new PrefixedLogProvider(this.logService.getInternalLogProvider(),
                    io.github.onograph.TokenConstants.CATCHUP_SERVER)))
        .bulClusterAdapter();
  }
}
