package io.github.onograph.config;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.DocumentedDefaultValue;
import org.neo4j.configuration.GraphDatabaseSettings.DriverApi;
import org.neo4j.configuration.GroupSetting;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.NormalizedGraphName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.logging.Level;


@PublicApi
public class ConfigurableFabricSettings implements SettingsDeclaration {


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_BURAAT_INTEGER)
  public static final Setting<Integer> settingBuraatInteger;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_BURSN_INTEGER)
  public static final Setting<Integer> settingBursnInteger;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_COCRC_INTEGER)
  @DocumentedDefaultValue(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_COCRC_INTEGER)
  public static final Setting<Integer> settingCocrcInteger;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DAASA_STRING)
  public static final Setting<String> settingDaasaString;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRREM_DURATION)
  public static final Setting<Duration> settingDrremDuration;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRENIOE_DURATION)
  public static final Setting<Duration> settingDrrenioeDuration;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRIV_LEVEL)
  @DocumentedDefaultValue(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRRIV_LEVEL)
  public static final Setting<Level> settingDrrivLevel;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRROTIM_DURATION)
  public static final Setting<Duration> settingDrrotimDuration;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRROTOZ_INTEGER)
  @DocumentedDefaultValue(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRROTOZ_INTEGER)
  public static final Setting<Integer> settingDrrotozInteger;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRTECCT_DURATION)
  @DocumentedDefaultValue(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRRTECCT_DURATION)
  public static final Setting<Duration> settingDrrtecctDuration;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRVA_DRIVER_API)
  public static final Setting<DriverApi> settingDrvaDriverApi;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_FACET_LIST)
  public static final Setting<List<SocketAddress>> settingFacetList;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_FABRIC_SETTINGS___DESCRIPTION__SETTING_RONSN_DURATION)
  public static final Setting<Duration> settingRonsnDuration;


  static final String DRV_LG_LEK_SESN = io.github.onograph.TokenConstants.DRIVER__LOGGING__LEAKED_SESSIONS;


  private static final String DRRIV = io.github.onograph.TokenConstants.DRIVER__LOGGING__LEVEL;


  private static final String DRVA = io.github.onograph.TokenConstants.DRIVER__API;


  private static final String DRV_CNX_ACUIO_TMT = io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__ACQUISITION_TIMEOUT;


  private static final String DRV_CONT_TMT = io.github.onograph.TokenConstants.DRIVER__CONNECTION__CONNECT_TIMEOUT;


  private static final String DRV_IDL_LTM_BEO_CNX_TES = io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__IDLE_TEST;


  private static final String DRV_LIMT_CNX_PC_SIZ = io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__MAX_SIZE;


  private static final String DRV_LIMT_CNX_TLVD = io.github.onograph.TokenConstants.DRIVER__CONNECTION__MAX_LIFETIME;

  static {
    settingFacetList =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__ROUTING__SERVERS,
                SettingValueParsers.listOf(SettingValueParsers.SOCKET_ADDRESS), null).dynamic()
            .build();
    settingDaasaString =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__DATABASE__NAME,
            SettingValueParsers.DATABASENAME, null).build();
    settingRonsnDuration =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__ROUTING__TTL,
                SettingValueParsers.DURATION, Duration.ofMinutes(1L))
            .build();
    settingDrrivLevel =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__DRIVER__LOGGING__LEVEL,
            SettingValueParsers.ofEnum(Level.class),
            null).build();
    settingDrrotozInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__POOL__MAX_SIZE,
                SettingValueParsers.INT, -1)
            .build();
    settingDrrtecctDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__POOL__IDLE_TEST,
            SettingValueParsers.DURATION,
            null).build();
    settingDrrotimDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__MAX_LIFETIME,
            SettingValueParsers.DURATION,
            Duration.ofHours(1L)).build();
    settingDrrenioeDuration =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__POOL__ACQUISITION_TIMEOUT,
                SettingValueParsers.DURATION, Duration.ofSeconds(60L))
            .build();
    settingDrremDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.FABRIC__DRIVER__CONNECTION__CONNECT_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(5L)).build();
    settingBursnInteger =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__STREAM__BUFFER__SIZE,
                SettingValueParsers.INT, 1000)
            .addConstraint(SettingConstraints.min(1))
            .build();
    settingBuraatInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.FABRIC__STREAM__BUFFER__LOW_WATERMARK,
                SettingValueParsers.INT, 300)
            .addConstraint(SettingConstraints.min(0))
            .build();
    settingCocrcInteger =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__STREAM__CONCURRENCY,
                SettingValueParsers.INT, null)
            .addConstraint(SettingConstraints.min(1))
            .build();
    settingDrvaDriverApi =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__DRIVER__API,
            SettingValueParsers.ofEnum(DriverApi.class),
            DriverApi.RX).build();
  }


  public static class FabricGroupSetting extends GroupSetting {


    @Description(io.github.onograph.TokenConstants.FABRIC_GROUP_SETTING___DESCRIPTION__SETTING_DAAS_STRING)
    @DocumentedDefaultValue(io.github.onograph.TokenConstants.FABRIC_GROUP_SETTING___DOCUMENTED_DEFAULT_VALUE__SETTING_DAAS_STRING)
    public final Setting<String> settingDaasString;


    public final Setting<Duration> settingDrremDuration;


    public final Setting<Duration> settingDrrenioeDuration;


    public final Setting<Boolean> settingDrresoBoolean;


    public final Setting<Level> settingDrrivLevel;


    public final Setting<Duration> settingDrrotimDuration;


    public final Setting<Integer> settingDrrotozInteger;


    public final Setting<Duration> settingDrrtecctDuration;


    public final Setting<DriverApi> settingDrvaDriverApi;


    @Description(io.github.onograph.TokenConstants.FABRIC_GROUP_SETTING___DESCRIPTION__SETTING_SSEBD_BOOLEAN)
    public final Setting<Boolean> settingSsebdBoolean;


    @Description(io.github.onograph.TokenConstants.FABRIC_GROUP_SETTING___DESCRIPTION__SETTING_URI_LIST)
    public final Setting<List<URI>> settingUriList;


    @Description(io.github.onograph.TokenConstants.FABRIC_GROUP_SETTING___DESCRIPTION__TITLE)
    public final Setting<NormalizedGraphName> title;

    protected FabricGroupSetting(String title) {
      super(title);
      this.settingUriList =
          this.getBuilder(io.github.onograph.TokenConstants.URI,
              SettingValueParsers.listOf(SettingValueParsers.URI), null).build();
      this.settingDaasString = this.getBuilder(io.github.onograph.TokenConstants.DATABASE,
          SettingValueParsers.STRING, null).build();
      this.title = this.getBuilder(io.github.onograph.TokenConstants.NAME,
          SettingValueParsers.GRAPHNAME, null).build();
      this.settingDrrivLevel =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__LOGGING__LEVEL,
              SettingValueParsers.ofEnum(Level.class), null).build();
      this.settingDrresoBoolean =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__LOGGING__LEAKED_SESSIONS,
              SettingValueParsers.BOOL, null).build();
      this.settingDrrotozInteger =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__MAX_SIZE,
              SettingValueParsers.INT, null).build();
      this.settingDrrtecctDuration =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__IDLE_TEST,
              SettingValueParsers.DURATION, null).build();
      this.settingDrrotimDuration =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__MAX_LIFETIME,
              SettingValueParsers.DURATION, null).build();
      this.settingDrrenioeDuration =
          this.getBuilder(
              io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__ACQUISITION_TIMEOUT,
              SettingValueParsers.DURATION,
              null).build();
      this.settingDrremDuration =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__CONNECT_TIMEOUT,
              SettingValueParsers.DURATION, null).build();
      this.settingDrvaDriverApi =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__API,
              SettingValueParsers.ofEnum(DriverApi.class), null).build();
      this.settingSsebdBoolean = this.getBuilder(
              io.github.onograph.TokenConstants.DRIVER__SSL_ENABLED, SettingValueParsers.BOOL, true)
          .build();
    }

    public FabricGroupSetting() {
      super(null);
      this.settingUriList =
          this.getBuilder(io.github.onograph.TokenConstants.URI,
              SettingValueParsers.listOf(SettingValueParsers.URI), null).build();
      this.settingDaasString = this.getBuilder(io.github.onograph.TokenConstants.DATABASE,
          SettingValueParsers.STRING, null).build();
      this.title = this.getBuilder(io.github.onograph.TokenConstants.NAME,
          SettingValueParsers.GRAPHNAME, null).build();
      this.settingDrrivLevel =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__LOGGING__LEVEL,
              SettingValueParsers.ofEnum(Level.class), null).build();
      this.settingDrresoBoolean =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__LOGGING__LEAKED_SESSIONS,
              SettingValueParsers.BOOL, null).build();
      this.settingDrrotozInteger =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__MAX_SIZE,
              SettingValueParsers.INT, null).build();
      this.settingDrrtecctDuration =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__IDLE_TEST,
              SettingValueParsers.DURATION, null).build();
      this.settingDrrotimDuration =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__MAX_LIFETIME,
              SettingValueParsers.DURATION, null).build();
      this.settingDrrenioeDuration =
          this.getBuilder(
              io.github.onograph.TokenConstants.DRIVER__CONNECTION__POOL__ACQUISITION_TIMEOUT,
              SettingValueParsers.DURATION,
              null).build();
      this.settingDrremDuration =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__CONNECTION__CONNECT_TIMEOUT,
              SettingValueParsers.DURATION, null).build();
      this.settingDrvaDriverApi =
          this.getBuilder(io.github.onograph.TokenConstants.DRIVER__API,
              SettingValueParsers.ofEnum(DriverApi.class), null).build();
      this.settingSsebdBoolean = this.getBuilder(
              io.github.onograph.TokenConstants.DRIVER__SSL_ENABLED, SettingValueParsers.BOOL, true)
          .build();
    }


    public static FabricGroupSetting ofConfigurableFabricSettingsFabricGroupSetting(String title) {
      return new FabricGroupSetting(title);
    }

    @Override
    public String getPrefix() {
      return io.github.onograph.TokenConstants.FABRIC__GRAPH;
    }
  }
}
