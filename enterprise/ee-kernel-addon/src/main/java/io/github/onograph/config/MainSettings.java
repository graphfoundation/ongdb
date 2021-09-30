package io.github.onograph.config;

import java.util.List;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;


@PublicApi
public class MainSettings implements SettingsDeclaration {


  @Deprecated(
      since = io.github.onograph.TokenConstants.MAIN_SETTINGS___DEPRECATED__SETTING_DYITHI_LIST__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_DYITHI_LIST)
  public static final Setting<List<String>> settingDyithiList;


  @Description(io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_DYITLI_LIST)
  public static final Setting<List<String>> settingDyitliList;


  @Description(io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_ENETGAO_BOOLEAN)
  public static final Setting<Boolean> settingEnetgaoBoolean;


  @Description(io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_MAMFB_LONG)
  public static final Setting<Long> settingMamfbLong;


  @Description(io.github.onograph.TokenConstants.MAIN_SETTINGS___DESCRIPTION__SETTING_SHODA_BOOLEAN)
  public static final Setting<Boolean> settingShodaBoolean;

  static {
    settingMamfbLong =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__MAX_DATABASES,
                SettingValueParsers.LONG, 100L)
            .addConstraint(SettingConstraints.min(2L)).build();
    settingDyithiList =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__DYNAMIC__SETTING__WHITELIST,
            SettingValueParsers.listOf(SettingValueParsers.STRING),
            List.of("*")).build();
    settingDyitliList =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__DYNAMIC__SETTING__ALLOWLIST,
            SettingValueParsers.listOf(SettingValueParsers.STRING),
            List.of("*")).build();
    settingShodaBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__PANIC__SHUTDOWN_ON_PANIC,
            SettingValueParsers.BOOL, false).build();
    settingEnetgaoBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__CLUSTERING__ENABLE,
            SettingValueParsers.BOOL, false).build();
  }
}
