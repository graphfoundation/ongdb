package io.github.onograph.config;

import java.nio.file.Path;
import java.time.Duration;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.Internal;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;


public class SettingsDeclarationClusterSystemImpl implements SettingsDeclaration {


  public static final String TEM_BOTR_DIEO_NME = io.github.onograph.TokenConstants.TEMP_BOOTSTRAP;


  public static final String TEM_DST_COP_DIEO_NME = io.github.onograph.TokenConstants.TEMP_COPY;


  public static final String TEM_SAV_DIEO_NME = io.github.onograph.TokenConstants.TEMP_SAVE;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAAM_DURATION)
  public static final Setting<Duration> settingAkaamDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECAPZ_INTEGER)
  public static final Setting<Integer> settingAkaecapzInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECCAEEU_DURATION)
  public static final Setting<Duration> settingAkaeccaeeuDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECEETL_DURATION)
  public static final Setting<Duration> settingAkaeceetlDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECHO_DOUBLE)
  public static final Setting<Double> settingAkaechoDouble;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECIDT_DURATION)
  public static final Setting<Duration> settingAkaecidtDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECORNES_INTEGER)
  public static final Setting<Integer> settingAkaecornesInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKAECXEPA_DURATION)
  public static final Setting<Duration> settingAkaecxepaDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKHWE_DURATION)
  public static final Setting<Duration> settingAkhweDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKIM_DURATION)
  public static final Setting<Duration> settingAkimDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKOTIT_DURATION)
  public static final Setting<Duration> settingAkotitDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_CLEDEIT_DURATION)
  public static final Setting<Duration> settingCledeitDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_CLETQMUT_DURATION)
  public static final Setting<Duration> settingCletqmutDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_DIVETENA_DURATION)
  public static final Setting<Duration> settingDivetenaDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_DIVETIT_DURATION)
  public static final Setting<Duration> settingDivetitDuration;


  @Internal
  public static final Setting<Boolean> settingExiacroBoolean;


  @Internal
  public static final Setting<Boolean> settingExiatoBoolean;


  @Internal
  public static final Setting<Boolean> settingInnnotzniaBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_LERSEBF_DURATION)
  public static final Setting<Duration> settingLersebfDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_LERSIT_DURATION)
  public static final Setting<Duration> settingLersitDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_LERSNA_DURATION)
  public static final Setting<Duration> settingLersnaDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAEDE_DURATION)
  public static final Setting<Duration> settingMieaedeDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAEDENTT_DURATION)
  public static final Setting<Duration> settingMieaedenttDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAETLSE_INTEGER)
  public static final Setting<Integer> settingMieaetlseInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAIBMROI_INTEGER)
  public static final Setting<Integer> settingMieaibmroiInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAIRLE_INTEGER)
  public static final Setting<Integer> settingMieairleInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEALNEOA_BOOLEAN)
  public static final Setting<Boolean> settingMiealneoaBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAORANO_BOOLEAN)
  public static final Setting<Boolean> settingMieaoranoBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_MIEAXAF_PATH)
  public static final Setting<Path> settingMieaxafPath;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RADIM_DURATION)
  public static final Setting<Duration> settingRadimDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RAEEEE_BOOLEAN)
  public static final Setting<Boolean> settingRaeeeeBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RAEEP_PATH)
  public static final Setting<Path> settingRaeepPath;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RANE_INTEGER)
  public static final Setting<Integer> settingRaneInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_RANEA_INTEGER)
  public static final Setting<Integer> settingRaneaInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_REEASOLAI_INTEGER)
  public static final Setting<Integer> settingReeasolaiInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_REEASOLAUE_INTEGER)
  public static final Setting<Integer> settingReeasolaueInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_STCAFA_DURATION)
  public static final Setting<Duration> settingStcafaDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_USTRO_BOOLEAN)
  public static final Setting<Boolean> settingUstroBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKCYMSAP_INTEGER)
  public static Setting<Integer> settingAkcymsapInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKCYRRAA_DURATION)
  public static Setting<Duration> settingAkcyrraaDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_CLUSTER_SYSTEM_IMPL___DESCRIPTION__SETTING_AKCYRRNLY_DURATION)
  public static Setting<Duration> settingAkcyrrnlyDuration;

  static {
    settingLersitDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_TRANSFER_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(3L)).build();
    settingLersnaDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_TRANSFER_INTERVAL,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(15L))
            .build();
    settingLersebfDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_TRANSFER_MEMBER_BACKOFF,
                SettingValueParsers.DURATION, Duration.ofSeconds(30L))
            .build();
    settingCledeitDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_BINDING_RETRY_TIMEOUT,
                SettingValueParsers.DURATION,
                Duration.ofMinutes(1L))
            .build();
    settingRaneInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_IN_QUEUE_SIZE,
            SettingValueParsers.INT, 1024).build();
    settingRaneaInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_IN_QUEUE_MAX_BATCH,
                SettingValueParsers.INT, 128)
            .build();
    settingUstroBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__USE_NATIVE_TRANSPORT,
                SettingValueParsers.BOOL, true)
            .build();
    settingRadimDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_ID_PUBLISH_TIMEOUT,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(15L))
            .build();
    settingDivetenaDuration =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_RESOLUTION_RETRY_INTERVAL,
                SettingValueParsers.DURATION, Duration.ofSeconds(5L))
            .build();
    settingDivetitDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISCOVERY_RESOLUTION_TIMEOUT,
                SettingValueParsers.DURATION,
                Duration.ofMinutes(5L))
            .build();
    settingMieaoranoBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__DOWN_UNREACHABLE_ON_NEW_JOINER,
            SettingValueParsers.BOOL, true).build();
    settingMieaxafPath =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__EXTERNAL_CONFIG,
                SettingValueParsers.PATH,
                null)
            .addConstraint(ClusterSettingsValidatorUtil.vaamdacnSettingConstraint()).build();
    settingMieaibmroiInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CLUSTER__MIN_NR_OF_MEMBERS,
            SettingValueParsers.INT, 2).build();
    settingMiealneoaBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__ALLOW_ANY_CORE_TO_BOOTSTRAP,
            SettingValueParsers.BOOL, false).build();
    settingMieaetlseInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__DEFAULT_PARALLELISM2,
            SettingValueParsers.INT, 4).build();
    settingMieairleInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__SINK_PARALLELISM2,
            SettingValueParsers.INT, 2).build();
    settingAkimDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__BIND_TIMEOUT2,
                SettingValueParsers.DURATION, Duration.ofSeconds(10L))
            .build();
    settingAkotitDuration =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CONNECTION_TIMEOUT2,
                SettingValueParsers.DURATION, Duration.ofSeconds(10L))
            .build();
    settingAkaamDuration =
        SettingImpl
            .newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__HANDSHAKE_TIMEOUT2,
                SettingValueParsers.DURATION, Duration.ofSeconds(30L))
            .build();
    settingMieaedeDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CLUSTER__SEED_NODE_TIMEOUT,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(30L))
            .addConstraint(
                SettingConstraints.lessThanOrEqual(Duration::toMillis, settingCledeitDuration,
                    (clusterBindingTimeout) ->
                    {
                      return clusterBindingTimeout / 2L;
                    }, io.github.onograph.I18N.format(
                        "io.github.onograph.config.SettingsDeclarationClusterSystemImpl.lessThanOrEqual")))
            .build();
    settingMieaedenttDuration = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CLUSTER__SEED_NODE_TIMEOUT_ON_FIRST_START,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(3L))
        .addConstraint(
            SettingConstraints.lessThanOrEqual(Duration::toMillis, settingMieaedeDuration)).build();
    settingAkaeceetlDuration = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__HEARTBEAT_INTERVAL,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(1L))
        .build();
    settingAkaechoDouble =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__THRESHOLD,
            SettingValueParsers.DOUBLE, 12.0D).build();
    settingAkaecapzInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__MAX_SAMPLE_SIZE,
            SettingValueParsers.INT, 1000).build();
    settingAkaecidtDuration = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__MIN_STD_DEVIATION,
            SettingValueParsers.DURATION,
            Duration.ofMillis(100L))
        .build();
    settingAkaeccaeeuDuration = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__ACCEPTABLE_HEARTBEAT_PAUSE,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(30L)).build();
    settingAkaecornesInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__MONITORED_BY_NR_OF_MEMBERS,
                SettingValueParsers.INT, 5)
            .build();
    settingAkaecxepaDuration = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__FAILURE_DETECTOR__EXPECTED_RESPONSE_AFTER,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(10L)).build();
    settingRaeeeeBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_MESSAGES_LOG_ENABLE,
                SettingValueParsers.BOOL, false)
            .build();
    settingRaeepPath = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__RAFT_MESSAGES_LOG_PATH,
            SettingValueParsers.PATH,
            Path.of(io.github.onograph.TokenConstants.RAFT_MESSAGES__LOG))
        .setDependency(GraphDatabaseSettings.logs_directory).immutable().build();
    settingStcafaDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__STORE_COPY_BACKOFF_MAX_WAIT,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(5L))
            .build();
    settingReeasolaiInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA_TRANSACTION_APPLIER_BATCH_SIZE,
                SettingValueParsers.INT, 1)
            .addConstraint(SettingConstraints.min(1)).build();
    settingReeasolaueInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA_TRANSACTION_APPLIER_MAX_QUEUE_SIZE,
                SettingValueParsers.INT, 10)
            .addConstraint(SettingConstraints.min(1)).build();
    settingInnnotzniaBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.UNSUPPORTED__CAUSAL_CLUSTERING__INBOUND_CONNECTION_INITIALIZATION_LOGGING_ENABLED,
                SettingValueParsers.BOOL,
                true)
            .dynamic().build();
    settingExiatoBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.UNSUPPORTED__CAUSAL_CLUSTERING__EXPERIMENTAL_RAFT_PROTOCOL_ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingExiacroBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.UNSUPPORTED__CAUSAL_CLUSTERING__EXPERIMENTAL_CATCHUP_PROTOCOL_ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingCletqmutDuration = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.UNSUPPORTED__CAUSAL_CLUSTERING__CLUSTER_STATUS_REQUEST_MAXIMUM_WAIT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(5L))
        .build();
    settingAkhweDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__SHUTDOWN_TIMEOUT,
                SettingValueParsers.DURATION, Duration.ofMinutes(2L))
            .build();
    settingAkcyrrnlyDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__AKKA_ACTOR_SYSTEM_RESTARTER__INITIAL_DELAY,
                SettingValueParsers.DURATION,
                Duration.ofSeconds(1L))
            .build();
    settingAkcyrraaDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__AKKA_ACTOR_SYSTEM_RESTARTER__MAX_DELAY,
                SettingValueParsers.DURATION,
                Duration.ofMinutes(1L))
            .build();
    settingAkcymsapInteger =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__AKKA_ACTOR_SYSTEM_RESTARTER__MAX_ACCEPTABLE_FAILURES,
            SettingValueParsers.INT, 8).build();
  }
}
