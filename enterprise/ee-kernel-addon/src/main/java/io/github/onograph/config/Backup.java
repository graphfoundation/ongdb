package io.github.onograph.config;

import org.neo4j.annotations.api.PublicApi;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;


@PublicApi
public class Backup implements SettingsDeclaration {


  public static final String STD_BAK_HOS = io.github.onograph.TokenConstants.LOCALHOST;


  public static final int STD_BAK_POR = 6362;


  @Description(io.github.onograph.TokenConstants.BACKUP___DESCRIPTION__SETTING_INMLUA_TX_FLOW_TYPE)
  public static final Setting<TxFlowType> settingInmluaTxFlowType;


  @Description(io.github.onograph.TokenConstants.BACKUP___DESCRIPTION__SETTING_ONEUB_BOOLEAN)
  public static final Setting<Boolean> settingOneubBoolean;


  @Description(io.github.onograph.TokenConstants.BACKUP___DESCRIPTION__SETTING_ONEUTD_SOCKET_ADDRESS)
  public static final Setting<SocketAddress> settingOneutdSocketAddress;

  static {
    settingOneubBoolean = SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__BACKUP__ENABLED, SettingValueParsers.BOOL, true)
        .build();
    settingInmluaTxFlowType = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.DBMS__BACKUP__INCREMENTAL__STRATEGY,
            SettingValueParsers.ofEnum(TxFlowType.class),
            TxFlowType.TFT_UNLMT).dynamic().build();
    settingOneutdSocketAddress =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__BACKUP__LISTEN_ADDRESS,
            SettingValueParsers.SOCKET_ADDRESS,
            new SocketAddress(io.github.onograph.TokenConstants.V_127_0_0_1, 6362)).build();
  }
}
