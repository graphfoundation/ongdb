package io.github.onograph.config;

import io.github.onograph.cluster.raft.gateway.gwlb.LoadBalancingResourceIntegrator;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParser;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.DurationRange;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.ByteUnit;
import org.neo4j.logging.Level;


@Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION)
@PublicApi
public class SettingsDeclarationClusterImpl implements SettingsDeclaration {


  public static final String STD_CLX_STAX_DIEO_NME = io.github.onograph.TokenConstants.CLUSTER_STATE;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CAUCE_INTEGER)
  public static final Setting<Integer> settingCauceInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CAUEAIM_DURATION)
  public static final Setting<Duration> settingCaueaimDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CAULTN_LIST)
  public static final Setting<List<EntProVer>> settingCaultnList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEDIT_DURATION)
  public static final Setting<Duration> settingCleditDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEODE_BOOLEAN)
  public static final Setting<Boolean> settingCleodeBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEODOE_BOOLEAN)
  public static final Setting<Boolean> settingCleodoeBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLEORS_DURATION)
  public static final Setting<Duration> settingCleorsDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CLETEY_PATH)
  public static final Setting<Path> settingCleteyPath;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_COCDTVORY_LIST)
  public static final Setting<List<NodeGroupIdentifier>> settingCocdtvoryList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_COENEAS_LIST)
  public static final Setting<List<String>> settingCoeneasList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_CONLAE_INTEGER)
  public static final Setting<Integer> settingConlaeInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DELDIOG_NODE_GROUP_IDENTIFIER)
  public static final Setting<NodeGroupIdentifier> settingDeldiogNodeGroupIdentifier;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DICETE_CLUSTER_DISCOVERY_MODE)
  public static final Setting<ClusterDiscoveryMode> settingDiceteClusterDiscoveryMode;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DIVDIDS_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingDivdidsSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_DIVIAS_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingDiviasSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_ELIIDTI_DURATION_RANGE)
  public static final Setting<DurationRange> settingEliidtiDurationRange;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_ENEO_BOOLEAN)
  public static final Setting<Boolean> settingEneoBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_GLLIASS_INTEGER)
  public static final Setting<Integer> settingGlliassInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_HAHIT_DURATION)
  public static final Setting<Duration> settingHahitDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INACYE_LIST)
  public static final Setting<List<SocketAddress>> settingInacyeList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INGCP_CONSENSUS_LOG_CACHE_STRATEGY_TYPE)
  public static final Setting<ConsensusLogCacheStrategyType> settingIngcpConsensusLogCacheStrategyType;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INGCXI_INTEGER)
  public static final Setting<Integer> settingIngcxiInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_INGCXS_LONG)
  public static final Setting<Long> settingIngcxsLong;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_JOAPA_DURATION)
  public static final Setting<Duration> settingJoapaDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_JOAPO_DURATION)
  public static final Setting<Duration> settingJoapoDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNAS_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingKunasSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNC_PATH)
  public static final Setting<Path> settingKuncPath;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNCEA_STRING)
  public static final Setting<String> settingKunceaString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNLST_STRING)
  public static final Setting<String> settingKunlstString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNNP_PATH)
  public static final Setting<Path> settingKunnpPath;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNSCT_STRING)
  public static final Setting<String> settingKunsctString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_KUNT_PATH)
  public static final Setting<Path> settingKuntPath;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LALDE_INTEGER)
  public static final Setting<Integer> settingLaldeInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LERN_LEADERSHIP_BALANCING_APPROACH_TYPE)
  public static final Setting<io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType>
      settingLernLeadershipBalancingApproachType;


  @Deprecated
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LERTIT_DURATION)
  public static final Setting<Duration> settingLertitDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LERUTOD_DURATION_RANGE)
  public static final Setting<DurationRange> settingLerutodDurationRange;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LOAIU_BOOLEAN)
  public static final Setting<Boolean> settingLoaiuBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LOAIU_STRING)
  public static final Setting<String> settingLoaiuString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LOIGA_INTEGER)
  public static final Setting<Integer> settingLoigaInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_LOIGYO_DURATION)
  public static final Setting<Duration> settingLoigyoDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MAFN_INTEGER)
  public static final Setting<Integer> settingMafnInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MIELNE_LEVEL)
  public static final Setting<Level> settingMielneLevel;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MIUETZOI_INTEGER)
  public static final Setting<Integer> settingMiuetzoiInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MIUETZUE_INTEGER)
  public static final Setting<Integer> settingMiuetzueInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_MUTCCS_BOOLEAN)
  public static final Setting<Boolean> settingMutccsBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_PULTV_DURATION)
  public static final Setting<Duration> settingPultvDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAARLS_INTEGER)
  public static final Setting<Integer> settingRaarlsInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RADIDS_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingRadidsSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAESTI_INTEGER)
  public static final Setting<Integer> settingRaestiInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAIAS_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingRaiasSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAMEI_LIST)
  public static final Setting<List<EntProVer>> settingRameiList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RANEAY_LONG)
  public static final Setting<Long> settingRaneayLong;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RANEY_LONG)
  public static final Setting<Long> settingRaneyLong;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAOAS_LONG)
  public static final Setting<Long> settingRaoasLong;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAODOE_INTEGER)
  public static final Setting<Integer> settingRaodoeInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAOLTN_STRING)
  public static final Setting<String> settingRaoltnString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAONRN_DURATION)
  public static final Setting<Duration> settingRaonrnDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RAONTG_STRING)
  public static final Setting<String> settingRaontgString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RECLSS_INTEGER)
  public static final Setting<Integer> settingReclssInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RECNEIE_DURATION)
  public static final Setting<Duration> settingRecneieDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RECNYOM_DURATION)
  public static final Setting<Duration> settingRecnyomDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_RECNYOS_DURATION)
  public static final Setting<Duration> settingRecnyosDuration;


  @Deprecated
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_REELR_BOOLEAN)
  public static final Setting<Boolean> settingReelrBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_SEVGU_LIST)
  public static final Setting<List<NodeGroupIdentifier>> settingSevguList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STCAE_INTEGER)
  public static final Setting<Integer> settingStcaeInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STCAREET_DURATION)
  public static final Setting<Duration> settingStcareetDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STCHI_INTEGER)
  public static final Setting<Integer> settingStchiInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STMNLBS_INTEGER)
  public static final Setting<Integer> settingStmnlbsInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STMNSDZ_INTEGER)
  public static final Setting<Integer> settingStmnsdzInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STSEE_BOOLEAN)
  public static final Setting<Boolean> settingStseeBoolean;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_STSUTO_DURATION)
  public static final Setting<Duration> settingStsutoDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_TEMASE_INTEGER)
  public static final Setting<Integer> settingTemaseInteger;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_TRANER_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingTranerSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_TRANRDE_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingTranrdeSocketAddress;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_UNWROGT_DURATION)
  public static final Setting<Duration> settingUnwrogtDuration;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_UPELOA_LIST)
  public static final Setting<List<String>> settingUpeloaList;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_USEDREIRY_STRING)
  public static final Setting<String> settingUsedreiryString;


  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_IMPL___DESCRIPTION__SETTING_VOEASE_INTEGER)
  public static final Setting<Integer> settingVoeaseInteger;


  private static final SettingValueParser<EntProVer> SETTING_VALUE_PARSER_APPTOE_ENT_PRO_VER;


  private static final int STD_CONS_POR = 7000;


  private static final int STD_DICE_POR = 5000;


  private static final int STD_TXS_POR = 6000;

  static {
    settingCleteyPath =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__DIRECTORIES__CLUSTER_STATE,
                SettingValueParsers.PATH,
                Path.of(io.github.onograph.TokenConstants.CLUSTER_STATE))
            .setDependency(GraphDatabaseSettings.data_directory).immutable().build();
    settingJoapoDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__JOIN_CATCH_UP_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofMinutes(10L)).build();
    settingJoapaDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__JOIN_CATCH_UP_MAX_LAG,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(10L)).build();
    settingLertitDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_ELECTION_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(7L)).build();
    settingLerutodDurationRange = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_FAILURE_DETECTION_WINDOW,
            SettingValueParsers.DURATION_RANGE,
            DurationRange.fromSeconds(20, 23))
        .build();
    settingEliidtiDurationRange = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__ELECTION_FAILURE_DETECTION_WINDOW,
            SettingValueParsers.DURATION_RANGE,
            DurationRange.fromSeconds(3, 6))
        .build();
    settingDeldiogNodeGroupIdentifier =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADERSHIP_PRIORITY_GROUP,
                NodeGroupIdentifier.SVX_GRP_NME,
                NodeGroupIdentifier.EMT_NODE_GROUP_IDENTIFIER)
            .build();
    settingLernLeadershipBalancingApproachType = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADERSHIP_BALANCING,
            SettingValueParsers.ofEnum(
                io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.class),
            io.github.onograph.config.SettingsDeclarationClusterImpl.LeadershipBalancingApproachType.LBAT_SPLIT)
        .build();
    settingReelrBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REFUSE_TO_BE_LEADER,
                SettingValueParsers.BOOL, false)
            .build();
    settingEneoBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__ENABLE_PRE_VOTING,
            SettingValueParsers.BOOL, true).build();
    settingCauceInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCHUP_BATCH_SIZE,
            SettingValueParsers.INT, 64).build();
    settingCleditDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_BINDING_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofMinutes(5L)).build();
    settingLoigaInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOG_SHIPPING_MAX_LAG,
                SettingValueParsers.INT, 256)
            .build();
    settingLoigyoDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOG_SHIPPING_RETRY_TIMEOUT,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(5L))
            .build();
    settingRaneyLong =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_IN_QUEUE_MAX_BYTES,
            SettingValueParsers.BYTES,
            ByteUnit.gibiBytes(2L)).build();
    settingRaneayLong =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_IN_QUEUE_MAX_BATCH_BYTES,
                SettingValueParsers.BYTES,
                ByteUnit.mebiBytes(8L))
            .build();
    settingMiuetzoiInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MINIMUM_CORE_CLUSTER_SIZE_AT_FORMATION,
                SettingValueParsers.INT, 3)
            .addConstraint(SettingConstraints.min(2)).build();
    settingMiuetzueInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MINIMUM_CORE_CLUSTER_SIZE_AT_RUNTIME,
                SettingValueParsers.INT, 3)
            .addConstraint(SettingConstraints.min(2)).addConstraint(
                SettingConstraints.ifCluster(
                    SettingConstraints.lessThanOrEqual(settingMiuetzoiInteger))).build();
    settingTranerSocketAddress =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__TRANSACTION_LISTEN_ADDRESS,
                SettingValueParsers.SOCKET_ADDRESS,
                new SocketAddress(6000))
            .setDependency(GraphDatabaseSettings.default_listen_address).build();
    settingTranrdeSocketAddress =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__TRANSACTION_ADVERTISED_ADDRESS,
                SettingValueParsers.SOCKET_ADDRESS,
                new SocketAddress(6000))
            .setDependency(GraphDatabaseSettings.default_advertised_address).build();
    settingRaiasSocketAddress =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LISTEN_ADDRESS,
                SettingValueParsers.SOCKET_ADDRESS,
                new SocketAddress(7000))
            .setDependency(GraphDatabaseSettings.default_listen_address).build();
    settingRadidsSocketAddress =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_ADVERTISED_ADDRESS,
                SettingValueParsers.SOCKET_ADDRESS,
                new SocketAddress(7000))
            .setDependency(GraphDatabaseSettings.default_advertised_address).build();
    settingDiviasSocketAddress =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_LISTEN_ADDRESS,
                SettingValueParsers.SOCKET_ADDRESS, new SocketAddress(5000))
            .setDependency(GraphDatabaseSettings.default_listen_address).build();
    settingDivdidsSocketAddress =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_ADVERTISED_ADDRESS,
                SettingValueParsers.SOCKET_ADDRESS, new SocketAddress(5000))
            .setDependency(GraphDatabaseSettings.default_advertised_address).build();
    settingInacyeList =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__INITIAL_DISCOVERY_MEMBERS,
                SettingValueParsers.listOf(SettingValueParsers.SOCKET_ADDRESS),
                null)
            .build();
    settingIngcpConsensusLogCacheStrategyType = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__IN_FLIGHT_CACHE__TYPE,
            SettingValueParsers.ofEnum(ConsensusLogCacheStrategyType.class),
            ConsensusLogCacheStrategyType.ST_FOLLOWING_CT)
        .build();
    settingIngcxiInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__IN_FLIGHT_CACHE__MAX_ENTRIES,
            SettingValueParsers.INT,
            1024).build();
    settingIngcxsLong =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__IN_FLIGHT_CACHE__MAX_BYTES,
            SettingValueParsers.BYTES,
            ByteUnit.gibiBytes(2L)).build();
    settingKunceaString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__CLUSTER_DOMAIN,
                SettingValueParsers.STRING,
                io.github.onograph.TokenConstants.CLUSTER__LOCAL)
            .build();
    settingKunasSocketAddress = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__ADDRESS,
            SettingValueParsers.SOCKET_ADDRESS,
            new SocketAddress(io.github.onograph.TokenConstants.KUBERNETES__DEFAULT__SVC, 443))
        .build();
    settingKuntPath = _paunaseSetting(
        io.github.onograph.TokenConstants.P___VAR__RUN__SECRETS__KUBERNETES__IO__SERVICEACCOUNT__TOKEN,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__TOKEN);
    settingKunnpPath =
        _paunaseSetting(
            io.github.onograph.TokenConstants.P___VAR__RUN__SECRETS__KUBERNETES__IO__SERVICEACCOUNT__NAMESPACE,
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__NAMESPACE);
    settingKuncPath =
        _paunaseSetting(
            io.github.onograph.TokenConstants.P___VAR__RUN__SECRETS__KUBERNETES__IO__SERVICEACCOUNT__CA__CRT,
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__CA_CRT);
    settingRaarlsInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_HANDLER_PARALLELISM,
                SettingValueParsers.INT,
                Math.min(Runtime.getRuntime().availableProcessors() * 2, 8))
            .addConstraint(SettingConstraints.min(1)).build();
    settingConlaeInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__COMMAND_APPLIER_PARALLELISM,
                SettingValueParsers.INT,
                Math.min(Runtime.getRuntime().availableProcessors() * 2, 8))
            .addConstraint(SettingConstraints.min(1)).build();
    settingStcaeInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STORE_COPY_PARALLELISM,
                SettingValueParsers.INT,
                Math.min(Runtime.getRuntime().availableProcessors() * 2, 8))
            .addConstraint(SettingConstraints.min(1)).build();
    settingKunlstString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__LABEL_SELECTOR,
            SettingValueParsers.STRING,
            null).build();
    settingKunsctString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__KUBERNETES__SERVICE_PORT_NAME,
            SettingValueParsers.STRING,
            null).build();
    settingDiceteClusterDiscoveryMode =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_TYPE,
                SettingValueParsers.ofEnum(ClusterDiscoveryMode.class), ClusterDiscoveryMode.LIST)
            .addConstraint(ClusterSettingsValidatorUtil.vaaiidvmesSettingConstraint()).build();
    settingMielneLevel =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__LOGGING__LEVEL,
            SettingValueParsers.ofEnum(Level.class), Level.WARN).build();
    settingLaldeInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LAST_APPLIED_STATE_SIZE,
                SettingValueParsers.INT, 1000)
            .build();
    settingRaestiInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_MEMBERSHIP_STATE_SIZE,
                SettingValueParsers.INT, 1000)
            .build();
    settingVoeaseInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_VOTE_STATE_SIZE,
                SettingValueParsers.INT, 1000)
            .build();
    settingTemaseInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_TERM_STATE_SIZE,
                SettingValueParsers.INT, 1000)
            .build();
    settingGlliassInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__GLOBAL_SESSION_TRACKER_STATE_SIZE,
            SettingValueParsers.INT,
            1000).build();
    settingReclssInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATED_LEASE_STATE_SIZE,
                SettingValueParsers.INT, 1000)
            .build();
    settingRecnyosDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATION_RETRY_TIMEOUT_BASE,
                SettingValueParsers.DURATION, Duration.ofSeconds(10L))
            .build();
    settingRecnyomDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATION_RETRY_TIMEOUT_LIMIT,
                SettingValueParsers.DURATION, Duration.ofSeconds(60L))
            .build();
    settingRecneieDuration =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__REPLICATION_LEADER_AWAIT_TIMEOUT,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(10L))
            .build();
    settingStmnsdzInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STATE_MACHINE_FLUSH_WINDOW_SIZE,
            SettingValueParsers.INT,
            4096).build();
    settingStmnlbsInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STATE_MACHINE_APPLY_MAX_BATCH_SIZE,
            SettingValueParsers.INT,
            16).build();
    settingRaontgString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_PRUNE_STRATEGY,
            SettingValueParsers.STRING, "1g size").build();
    settingRaoltnString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_IMPLEMENTATION,
            SettingValueParsers.STRING,
            io.github.onograph.TokenConstants.SEGMENTED).build();
    settingRaoasLong =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_ROTATION_SIZE,
                SettingValueParsers.BYTES,
                ByteUnit.mebiBytes(250L))
            .addConstraint(SettingConstraints.min(1024L)).build();
    settingRaodoeInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_READER_POOL_SIZE,
                SettingValueParsers.INT, 8)
            .build();
    settingRaonrnDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_LOG_PRUNING_FREQUENCY,
                SettingValueParsers.DURATION,
                Duration.ofMinutes(10L))
            .build();
    settingPultvDuration = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__PULL_INTERVAL,
        SettingValueParsers.DURATION,
        Duration.ofSeconds(1L)).build();
    settingCaueaimDuration =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCH_UP_CLIENT_INACTIVITY_TIMEOUT,
                SettingValueParsers.DURATION, Duration.ofMinutes(10L))
            .build();
    settingStcareetDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STORE_COPY_MAX_RETRY_TIME_PER_REQUEST,
                SettingValueParsers.DURATION,
                Duration.ofMinutes(20L))
            .build();
    settingStchiInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STORE_COPY_CHUNK_SIZE,
                SettingValueParsers.INT,
                (int) ByteUnit.kibiBytes(32L))
            .addConstraint(SettingConstraints.range((int) ByteUnit.kibiBytes(4L),
                (int) ByteUnit.mebiBytes(1L))).build();
    settingUnwrogtDuration =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__UNKNOWN_ADDRESS_LOGGING_THROTTLE,
                SettingValueParsers.DURATION,
                Duration.ofMillis(10000L))
            .build();
    settingCleodoeBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_ALLOW_READS_ON_FOLLOWERS,
            SettingValueParsers.BOOL,
            true).build();
    settingCleodeBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_ALLOW_READS_ON_LEADER,
            SettingValueParsers.BOOL,
            false).dynamic().build();
    settingCleorsDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_TOPOLOGY_REFRESH,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(5L))
            .addConstraint(SettingConstraints.min(Duration.ofSeconds(1L))).build();
    settingUpeloaList = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__UPSTREAM_SELECTION_STRATEGY,
            SettingValueParsers.listOf(SettingValueParsers.STRING),
            List.of(io.github.onograph.TokenConstants.DEFAULT))
        .build();
    settingUsedreiryString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__USER_DEFINED_UPSTREAM_STRATEGY,
            SettingValueParsers.STRING,
            "").build();
    settingCocdtvoryList = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CONNECT_RANDOMLY_TO_SERVER_GROUP2,
            SettingValueParsers.listOf(NodeGroupIdentifier.SVX_GRP_NME),
            Collections.emptyList()).dynamic().build();
    settingSevguList = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__SERVER_GROUPS,
            SettingValueParsers.listOf(NodeGroupIdentifier.SVX_GRP_NME),
            Collections.emptyList())
        .dynamic().build();
    settingLoaiuString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOAD_BALANCING__PLUGIN,
                SettingValueParsers.STRING,
                io.github.onograph.TokenConstants.SERVER_POLICIES)
            .addConstraint(SettingConstraints.ifCluster(
                LoadBalancingResourceIntegrator.hapgSettingConstraint())).build();
    settingHahitDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__HANDSHAKE_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(20L)).build();
    settingLoaiuBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LOAD_BALANCING__SHUFFLE,
                SettingValueParsers.BOOL, true)
            .build();
    settingStseeBoolean = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.DBMS__SECURITY__CAUSAL_CLUSTERING_STATUS_AUTH_ENABLED,
        SettingValueParsers.BOOL, true).build();
    settingStsutoDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STATUS_THROUGHPUT_WINDOW,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(5L))
            .addConstraint(SettingConstraints.range(Duration.ofSeconds(1L), Duration.ofMinutes(5L)))
            .build();
    settingMutccsBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MULTI_DC_LICENSE,
            SettingValueParsers.BOOL, false).build();
    SETTING_VALUE_PARSER_APPTOE_ENT_PRO_VER = new SettingValueParser<EntProVer>() {
      @Override
      public EntProVer parse(String val) {
        return EntProVer.pasEntProVer(val);
      }

      @Override
      public String getDescription() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.SettingsDeclarationClusterImpl.getDescription");
      }

      @Override
      public Class<EntProVer> getType() {
        return EntProVer.class;
      }
    };
    settingRameiList = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__PROTOCOL_IMPLEMENTATIONS__RAFT,
            SettingValueParsers.listOf(SETTING_VALUE_PARSER_APPTOE_ENT_PRO_VER),
            Collections.emptyList())
        .build();
    settingCaultnList = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__PROTOCOL_IMPLEMENTATIONS__CATCHUP,
            SettingValueParsers.listOf(SETTING_VALUE_PARSER_APPTOE_ENT_PRO_VER),
            Collections.emptyList())
        .build();
    settingCoeneasList = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__PROTOCOL_IMPLEMENTATIONS__COMPRESSION,
            SettingValueParsers.listOf(SettingValueParsers.STRING),
            Collections.emptyList()).build();
    settingMafnInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MAX_RAFT_CHANNELS,
            SettingValueParsers.INT, 8).build();
  }


  private static Setting<Path> _paunaseSetting(String _strP, String title) {

    Iterator _iterator = FileSystems.getDefault().getRootDirectories().iterator();
    if (_iterator.hasNext()) {

      Path _roPath = (Path) _iterator.next();
      return SettingImpl.newBuilder(title, SettingValueParsers.PATH, _roPath.resolve(_strP))
          .build();
    } else {
      return SettingImpl.newBuilder(title, SettingValueParsers.PATH, Path.of("//").resolve(_strP))
          .build();
    }
  }


  public enum LeadershipBalancingApproachType {


    LBAT_BAL_OFF,

    LBAT_SPLIT
  }
}
