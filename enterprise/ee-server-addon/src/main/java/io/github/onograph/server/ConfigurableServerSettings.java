package io.github.onograph.server;

import java.time.Duration;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;


@Description(io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION)
public class ConfigurableServerSettings implements SettingsDeclaration {
  // Names must be specific for backwards compatibility


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_ALLOW_OUTGOING_BROWSER_CONNECTIONS)
  public static final Setting<Boolean> browser_allow_outgoing_browser_connections;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_CREDENTIAL_TIMEOUT)
  public static final Setting<Duration> browser_credential_timeout;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_RETAIN_CONNECTION_CREDENTIALS)
  public static final Setting<Boolean> browser_retain_connection_credentials;


  @Description(io.github.onograph.TokenConstants.CONFIGURABLE_SERVER_SETTINGS___DESCRIPTION__BROWSER_RETAIN_EDITOR_HISTORY)
  public static final Setting<Boolean> browser_retain_editor_history;

  static {
    browser_credential_timeout =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.BROWSER__CREDENTIAL_TIMEOUT,
                SettingValueParsers.DURATION, Duration.ZERO)
            .build();
    browser_retain_connection_credentials =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.BROWSER__RETAIN_CONNECTION_CREDENTIALS,
                SettingValueParsers.BOOL, true)
            .build();
    browser_allow_outgoing_browser_connections =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.BROWSER__ALLOW_OUTGOING_CONNECTIONS,
            SettingValueParsers.BOOL, true).build();
    browser_retain_editor_history =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.BROWSER__RETAIN_EDITOR_HISTORY,
            SettingValueParsers.BOOL, true).build();
  }
}
