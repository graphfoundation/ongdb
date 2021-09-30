package io.github.onograph.config;

import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.ByteUnit;


@PublicApi
public class Metrics implements SettingsDeclaration {


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_BOEEB_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_BOEEB_BOOLEAN)
  public static final Setting<Boolean> settingBoeebBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_CALTGL_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CALTGL_BOOLEAN)
  public static final Setting<Boolean> settingCaltglBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSCSRO_COMPRESSION_OPTION)
  public static final Setting<Metrics.CompressionOption> settingCscsroCompressionOption;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSEBD_BOOLEAN)
  public static final Setting<Boolean> settingCsebdBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSIEA_DURATION)
  public static final Setting<Duration> settingCsieaDuration;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSMAHE_INTEGER)
  public static final Setting<Integer> settingCsmaheInteger;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSPH_PATH)
  public static final Setting<Path> settingCsphPath;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CSTNS_LONG)
  public static final Setting<Long> settingCstnsLong;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_CYRNND_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_CYRNND_BOOLEAN)
  public static final Setting<Boolean> settingCyrnndBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_DAAEONB_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_DAAEONB_BOOLEAN)
  public static final Setting<Boolean> settingDaaeonbBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_DAAUND_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_DAAUND_BOOLEAN)
  public static final Setting<Boolean> settingDaaundBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_GRIA_BOOLEAN)
  public static final Setting<Boolean> settingGriaBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_GRITL_DURATION)
  public static final Setting<Duration> settingGritlDuration;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_GRPTEE_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingGrpteeSocketAddress;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JMEBD_BOOLEAN)
  public static final Setting<Boolean> settingJmebdBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVFEE_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVFEE_BOOLEAN)
  public static final Setting<Boolean> settingJvfeeBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVGNL_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVGNL_BOOLEAN)
  public static final Setting<Boolean> settingJvgnlBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVHPAE_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVHPAE_BOOLEAN)
  public static final Setting<Boolean> settingJvhpaeBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVLCOA_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVLCOA_BOOLEAN)
  public static final Setting<Boolean> settingJvlcoaBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVMND_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVMND_BOOLEAN)
  public static final Setting<Boolean> settingJvmndBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVREE_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVREE_BOOLEAN)
  public static final Setting<Boolean> settingJvreeBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_JVUMB_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_JVUMB_BOOLEAN)
  public static final Setting<Boolean> settingJvumbBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_MECEEB_BOOLEAN)
  public static final Setting<Boolean> settingMeceebBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_MERSAE_BOOLEAN)
  public static final Setting<Boolean> settingMersaeBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_MERSEX_STRING)
  public static final Setting<String> settingMersexString;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_MERSLR_LIST)
  public static final Setting<List<GlobbingPattern>> settingMerslrList;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEATOA_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEATOA_BOOLEAN)
  public static final Setting<Boolean> settingNeatoaBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEEIGL_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEEIGL_BOOLEAN)
  public static final Setting<Boolean> settingNeeiglBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEGHB_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEGHB_BOOLEAN)
  public static final Setting<Boolean> settingNeghbBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEMOND_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEMOND_BOOLEAN)
  public static final Setting<Boolean> settingNemondBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEOZB_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEOZB_BOOLEAN)
  public static final Setting<Boolean> settingNeozbBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NERND_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NERND_BOOLEAN)
  public static final Setting<Boolean> settingNerndBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NETNL_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NETNL_BOOLEAN)
  public static final Setting<Boolean> settingNetnlBoolean;


  @Deprecated(
      since = io.github.onograph.TokenConstants.METRICS___DEPRECATED__SETTING_NEUND_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_NEUND_BOOLEAN)
  public static final Setting<Boolean> settingNeundBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_PRTEE_BOOLEAN)
  public static final Setting<Boolean> settingPrteeBoolean;


  @Description(io.github.onograph.TokenConstants.METRICS___DESCRIPTION__SETTING_PRTEI_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingPrteiSocketAddress;

  static {
    settingMersexString = SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__PREFIX,
        SettingValueParsers.STRING,
        io.github.onograph.TokenConstants.NEO4J).build();
    settingMeceebBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NAMESPACES__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingMersaeBoolean = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.METRICS__ENABLED, SettingValueParsers.BOOL, true).build();
    settingMerslrList =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__FILTER,
            SettingValueParsers.listOf(SettingValueParsers.GLOBBING_PATTERN),
            GlobbingPattern.create(io.github.onograph.TokenConstants._STAR_BOLT__CONNECTIONS_STAR_,
                io.github.onograph.TokenConstants._STAR_BOLT__MESSAGES_RECEIVED_STAR_,
                io.github.onograph.TokenConstants._STAR_BOLT__MESSAGES_STARTED_STAR_,
                io.github.onograph.TokenConstants._STAR_DBMS__POOL__BOLT__FREE,
                io.github.onograph.TokenConstants._STAR_DBMS__POOL__BOLT__TOTAL_SIZE,
                io.github.onograph.TokenConstants._STAR_DBMS__POOL__BOLT__TOTAL_USED,
                io.github.onograph.TokenConstants._STAR_DBMS__POOL__BOLT__USED_HEAP,
                io.github.onograph.TokenConstants._STAR_CAUSAL_CLUSTERING__CORE__IS_LEADER,
                io.github.onograph.TokenConstants._STAR_CAUSAL_CLUSTERING__CORE__LAST_LEADER_MESSAGE,
                io.github.onograph.TokenConstants._STAR_CAUSAL_CLUSTERING__CORE__REPLICATION_ATTEMPT,
                io.github.onograph.TokenConstants._STAR_CAUSAL_CLUSTERING__CORE__REPLICATION_FAIL,
                io.github.onograph.TokenConstants._STAR_CHECK_POINT__DURATION,
                io.github.onograph.TokenConstants._STAR_CHECK_POINT__TOTAL_TIME,
                io.github.onograph.TokenConstants._STAR_CYPHER__REPLAN_EVENTS,
                io.github.onograph.TokenConstants._STAR_IDS_IN_USE__NODE,
                io.github.onograph.TokenConstants._STAR_IDS_IN_USE__PROPERTY,
                io.github.onograph.TokenConstants._STAR_IDS_IN_USE__RELATIONSHIP,
                io.github.onograph.TokenConstants._STAR_POOL__TRANSACTION___STAR___TOTAL_USED,
                io.github.onograph.TokenConstants._STAR_POOL__TRANSACTION___STAR___USED_HEAP,
                io.github.onograph.TokenConstants._STAR_POOL__TRANSACTION___STAR___USED_NATIVE,
                io.github.onograph.TokenConstants._STAR_STORE__SIZE_STAR_,
                io.github.onograph.TokenConstants._STAR_TRANSACTION__ACTIVE_READ,
                io.github.onograph.TokenConstants._STAR_TRANSACTION__ACTIVE_WRITE,
                io.github.onograph.TokenConstants._STAR_TRANSACTION__COMMITTED_STAR_,
                io.github.onograph.TokenConstants._STAR_TRANSACTION__LAST_COMMITTED_TX_ID,
                io.github.onograph.TokenConstants._STAR_TRANSACTION__PEAK_CONCURRENT,
                io.github.onograph.TokenConstants._STAR_TRANSACTION__ROLLBACKS_STAR_,
                io.github.onograph.TokenConstants._STAR_PAGE_CACHE__HIT_STAR_,
                io.github.onograph.TokenConstants._STAR_PAGE_CACHE__PAGE_FAULTS,
                io.github.onograph.TokenConstants._STAR_PAGE_CACHE__USAGE_RATIO,
                io.github.onograph.TokenConstants._STAR_VM__FILE__DESCRIPTORS__COUNT,
                io.github.onograph.TokenConstants._STAR_VM__GC__TIME___STAR_,
                io.github.onograph.TokenConstants._STAR_VM__HEAP__USED,
                io.github.onograph.TokenConstants._STAR_VM__MEMORY__BUFFER__DIRECT__USED,
                io.github.onograph.TokenConstants._STAR_VM__MEMORY__POOL__G1_EDEN_SPACE,
                io.github.onograph.TokenConstants._STAR_VM__MEMORY__POOL__G1_OLD_GEN,
                io.github.onograph.TokenConstants._STAR_VM__PAUSE_TIME,
                io.github.onograph.TokenConstants._STAR_VM__THREAD_STAR_,
                io.github.onograph.TokenConstants._STAR_DB__QUERY__EXECUTION_STAR_)).build();
    settingNetnlBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__TX__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingNeghbBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__PAGECACHE__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingNeundBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__COUNTS__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingNeozbBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__SIZE__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingDaaundBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.METRICS__NEO4J__DATA__COUNTS__ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingCaltglBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.METRICS__NEO4J__CAUSAL_CLUSTERING__ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingDaaeonbBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.METRICS__NEO4J__DATABASE_OPERATION_COUNT__ENABLED,
            SettingValueParsers.BOOL,
            false).build();
    settingNeeiglBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.METRICS__NEO4J__CHECKPOINTING__ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingNeatoaBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__LOGS__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingNerndBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__SERVER__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingJvgnlBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__JVM__GC__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingJvhpaeBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__JVM__HEAP__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingJvmndBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__JVM__MEMORY__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingJvfeeBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__JVM__BUFFERS__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingJvreeBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__JVM__THREADS__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingJvlcoaBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.METRICS__JVM__FILE__DESCRIPTORS__ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingJvumbBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__JVM__PAUSE_TIME__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingCyrnndBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.METRICS__CYPHER__REPLANNING__ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingBoeebBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__BOLT__MESSAGES__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingNemondBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__NEO4J__POOLS__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingCsebdBoolean = SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.METRICS__CSV__ENABLED, SettingValueParsers.BOOL, true)
        .build();
    settingCsphPath = SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__DIRECTORIES__METRICS, SettingValueParsers.PATH,
            Path.of(io.github.onograph.TokenConstants.METRICS))
        .setDependency(GraphDatabaseSettings.neo4j_home).immutable().build();
    settingCsieaDuration = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.METRICS__CSV__INTERVAL, SettingValueParsers.DURATION,
        Duration.ofSeconds(30L)).build();
    settingCstnsLong = SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.METRICS__CSV__ROTATION__SIZE, SettingValueParsers.BYTES,
            ByteUnit.mebiBytes(10L))
        .addConstraint(SettingConstraints.range(0L, Long.MAX_VALUE)).build();
    settingCsmaheInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.METRICS__CSV__ROTATION__KEEP_NUMBER,
                SettingValueParsers.INT, 7)
            .addConstraint(SettingConstraints.min(1))
            .build();
    settingCscsroCompressionOption = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.METRICS__CSV__ROTATION__COMPRESSION,
            SettingValueParsers.ofEnum(Metrics.CompressionOption.class),
            Metrics.CompressionOption.NONE).build();
    settingGriaBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__GRAPHITE__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingGrpteeSocketAddress =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__GRAPHITE__SERVER,
                SettingValueParsers.SOCKET_ADDRESS,
                new SocketAddress(2003))
            .setDependency(GraphDatabaseSettings.default_listen_address).build();
    settingGritlDuration = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.METRICS__GRAPHITE__INTERVAL, SettingValueParsers.DURATION,
        Duration.ofSeconds(30L)).build();
    settingPrteeBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__PROMETHEUS__ENABLED,
            SettingValueParsers.BOOL, false).build();
    settingPrteiSocketAddress =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.METRICS__PROMETHEUS__ENDPOINT,
                SettingValueParsers.SOCKET_ADDRESS,
                new SocketAddress(io.github.onograph.TokenConstants.LOCALHOST, 2004))
            .setDependency(GraphDatabaseSettings.default_listen_address).build();
    settingJmebdBoolean = SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.METRICS__JMX__ENABLED, SettingValueParsers.BOOL, true)
        .build();
  }


  public enum CompressionOption {


    NONE,

    ZIP,

    GZ
  }
}
