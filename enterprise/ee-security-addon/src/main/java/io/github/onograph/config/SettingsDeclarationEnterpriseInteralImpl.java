package io.github.onograph.config;

import org.neo4j.configuration.Description;
import org.neo4j.configuration.Internal;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;


public class SettingsDeclarationEnterpriseInteralImpl implements SettingsDeclaration {


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_ENTERPRISE_INTERAL_IMPL___DESCRIPTION__SETTING_LDUIONOL_BOOLEAN)
  public static final Setting<Boolean> settingLduionolBoolean;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_ENTERPRISE_INTERAL_IMPL___DESCRIPTION__SETTING_PRRVTZNIN_STRING)
  @Deprecated
  public static final Setting<String> settingPrrvtzninString;


  @Internal
  @Description(io.github.onograph.TokenConstants.SETTINGS_DECLARATION_ENTERPRISE_INTERAL_IMPL___DESCRIPTION__SETTING_PRRVTZNL_BOOLEAN)
  @Deprecated
  public static final Setting<Boolean> settingPrrvtznlBoolean;

  static {
    settingLduionolBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.UNSUPPORTED__DBMS__SECURITY__LDAP__AUTHORIZATION__CONNECTION_POOLING,
            SettingValueParsers.BOOL, true).build();
    settingPrrvtznlBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__PROPERTY_LEVEL__ENABLED,
                SettingValueParsers.BOOL, false)
            .build();
    settingPrrvtzninString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__PROPERTY_LEVEL__BLACKLIST,
                SettingValueParsers.STRING, null)
            .build();
  }
}
