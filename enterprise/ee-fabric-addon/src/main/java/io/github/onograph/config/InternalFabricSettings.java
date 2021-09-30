package io.github.onograph.config;

import java.time.Duration;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.DocumentedDefaultValue;
import org.neo4j.configuration.Internal;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;


public class InternalFabricSettings implements SettingsDeclaration {


  @Internal
  @Description(io.github.onograph.TokenConstants.INTERNAL_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRCIV_DURATION)
  public static final Setting<Duration> settingDrrcivDuration;


  @Internal
  @Description(io.github.onograph.TokenConstants.INTERNAL_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRESO_BOOLEAN)
  public static final Setting<Boolean> settingDrresoBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.INTERNAL_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRTC_INTEGER)
  @DocumentedDefaultValue(io.github.onograph.TokenConstants.INTERNAL_FABRIC_SETTINGS___DOCUMENTED_DEFAULT_VALUE__SETTING_DRRTC_INTEGER)
  public static final Setting<Integer> settingDrrtcInteger;


  @Internal
  @Description(io.github.onograph.TokenConstants.INTERNAL_FABRIC_SETTINGS___DESCRIPTION__SETTING_DRRTU_DURATION)
  public static final Setting<Duration> settingDrrtuDuration;

  static {
    settingDrrtuDuration = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.FABRIC__DRIVER__TIMEOUT, SettingValueParsers.DURATION,
        Duration.ofMinutes(1L)).build();
    settingDrrcivDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.FABRIC__DRIVER__IDLE_CHECK_INTERVAL,
            SettingValueParsers.DURATION,
            Duration.ofMinutes(1L)).build();
    settingDrrtcInteger =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.FABRIC__DRIVER__EVENT_LOOP_COUNT,
                SettingValueParsers.INT,
                Runtime.getRuntime().availableProcessors())
            .build();
    settingDrresoBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.FABRIC__DRIVER__LOGGING__LEAKED_SESSIONS,
                SettingValueParsers.BOOL, false)
            .build();
  }
}
