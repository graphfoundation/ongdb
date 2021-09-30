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
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.ByteUnit;
import org.neo4j.logging.FormattedLogFormat;
import org.neo4j.logging.Level;
import org.neo4j.string.SecureString;


@PublicApi
public class Security implements SettingsDeclaration {


  public static final String LDA_REL_NME = io.github.onograph.TokenConstants.LDAP;


  public static final String NAI_REL_NME = io.github.onograph.TokenConstants.NATIVE;


  public static final String PLGX_REL_NME_PRE = io.github.onograph.TokenConstants.PLUGIN_;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AUAAA_INTEGER)
  public static final Setting<Integer> settingAuaaaInteger;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AUAS_BOOLEAN)
  public static final Setting<Boolean> settingAuasBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AUHCT_DURATION)
  public static final Setting<Duration> settingAuhctDuration;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AUNTRE_LIST)
  public static final Setting<List<String>> settingAuntreList;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_AURIOR_LIST)
  public static final Setting<List<String>> settingAuriorList;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDEM_DURATION)
  public static final Setting<Duration> settingLdemDuration;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDOTIT_DURATION)
  public static final Setting<Duration> settingLdotitDuration;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDPFR_STRING)
  public static final Setting<String> settingLdpfrString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDPRR_STRING)
  public static final Setting<String> settingLdprrString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDSR_BOOLEAN)
  public static final Setting<Boolean> settingLdsrBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOEREU_STRING)
  public static final Setting<String> settingLduioereuString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIORCE_STRING)
  public static final Setting<String> settingLduiorceString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIORCT_STRING)
  public static final Setting<String> settingLduiorctString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOSMU_BOOLEAN)
  public static final Setting<Boolean> settingLduiosmuBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOTEE_STRING)
  public static final Setting<String> settingLduioteeString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOTSD_SECURE_STRING)
  public static final Setting<SecureString> settingLduiotsdSecureString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOUBIRES_LIST)
  public static final Setting<List<String>> settingLduioubiresList;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUIOUOP_STRING)
  public static final Setting<String> settingLduiouopString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTICA_BOOLEAN)
  public static final Setting<Boolean> settingLduticaBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTICS_STRING)
  public static final Setting<String> settingLduticsString;


  @Deprecated(
      since = io.github.onograph.TokenConstants.SECURITY___DEPRECATED__SETTING_LDUTIECT_BOOLEAN__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIECT_BOOLEAN)
  public static final Setting<Boolean> settingLdutiectBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIEET_STRING)
  public static final Setting<String> settingLdutieetString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIEI_BOOLEAN)
  public static final Setting<Boolean> settingLdutieiBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_LDUTIERTTE_STRING)
  public static final Setting<String> settingLdutiertteString;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_SEIGA_FORMATTED_LOG_FORMAT)
  public static final Setting<FormattedLogFormat> settingSeigaFormattedLogFormat;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_SEIGELEA_BOOLEAN)
  public static final Setting<Boolean> settingSeigeleaBoolean;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_SEIGL_LEVEL)
  public static final Setting<Level> settingSeiglLevel;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_SEIGN_PATH)
  public static final Setting<Path> settingSeignPath;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_STSIGRE_INTEGER)
  public static final Setting<Integer> settingStsigreInteger;


  @Deprecated(
      since = io.github.onograph.TokenConstants.SECURITY___DEPRECATED__SETTING_STSIGTE_DURATION__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_STSIGTE_DURATION)
  public static final Setting<Duration> settingStsigteDuration;


  @Description(io.github.onograph.TokenConstants.SECURITY___DESCRIPTION__SETTING_STSIGTHO_LONG)
  public static final Setting<Long> settingStsigthoLong;

  static {
    settingAuntreList = SettingImpl
        .newBuilder(io.github.onograph.TokenConstants.DBMS__SECURITY__AUTHENTICATION_PROVIDERS,
            SettingValueParsers.listOf(SettingValueParsers.STRING),
            List.of(io.github.onograph.TokenConstants.NATIVE)).build();
    settingAuriorList =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__AUTHORIZATION_PROVIDERS,
                SettingValueParsers.listOf(SettingValueParsers.STRING),
                List.of(io.github.onograph.TokenConstants.NATIVE))
            .build();
    settingLdprrString = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__HOST, SettingValueParsers.STRING,
        io.github.onograph.TokenConstants.LOCALHOST).build();
    settingLdsrBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__USE_STARTTLS,
            SettingValueParsers.BOOL, false).build();
    settingLdpfrString = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__REFERRAL,
        SettingValueParsers.STRING,
        io.github.onograph.TokenConstants.FOLLOW).build();
    settingLdotitDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__CONNECTION_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(30L)).build();
    settingLdemDuration =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__READ_TIMEOUT,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(30L)).build();
    settingLduticsString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__MECHANISM,
            SettingValueParsers.STRING,
            io.github.onograph.TokenConstants.SIMPLE).build();
    settingLdutieetString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__USER_DN_TEMPLATE,
                SettingValueParsers.STRING,
                "uid={0},ou=users,dc=example,dc=com")
            .addConstraint(SecurityConfigValidator.vaauetpSettingConstraint()).dynamic().build();
    settingLduticaBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__CACHE_ENABLED,
            SettingValueParsers.BOOL,
            true).build();
    settingLdutiectBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__USE_SAMACCOUNTNAME,
            SettingValueParsers.BOOL, false).build();
    settingLdutieiBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__SEARCH_FOR_ATTRIBUTE,
            SettingValueParsers.BOOL, false).build();
    settingLdutiertteString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHENTICATION__ATTRIBUTE,
                SettingValueParsers.STRING,
                io.github.onograph.TokenConstants.SAMACCOUNTNAME)
            .addConstraint(
                SettingConstraints.matches("[A-Za-z0-9-]*", io.github.onograph.I18N.format(
                    "io.github.onograph.config.Security.matches")))
            .dynamic().build();
    settingLduiosmuBoolean =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__USE_SYSTEM_ACCOUNT,
            SettingValueParsers.BOOL, false).build();
    settingLduioteeString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__SYSTEM_USERNAME,
            SettingValueParsers.STRING, null).build();
    settingLduiotsdSecureString =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__SYSTEM_PASSWORD,
            SettingValueParsers.SECURE_STRING, null).build();
    settingLduiorceString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__USER_SEARCH_BASE,
                SettingValueParsers.STRING,
                "ou=users,dc=example,dc=com")
            .addConstraint(SecurityConfigValidator.noetSettingConstraint()).dynamic().build();
    settingLduiorctString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__USER_SEARCH_FILTER,
                SettingValueParsers.STRING,
                "(&(objectClass=*)(uid={0}))")
            .dynamic().build();
    settingLduioubiresList = SettingImpl
        .newBuilder(
            io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__GROUP_MEMBERSHIP_ATTRIBUTES,
            SettingValueParsers.listOf(SettingValueParsers.STRING),
            List.of(io.github.onograph.TokenConstants.MEMBER_OF))
        .addConstraint(SecurityConfigValidator.noetliSettingConstraint())
        .dynamic().build();
    settingLduiouopString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__GROUP_TO_ROLE_MAPPING,
                SettingValueParsers.STRING, "")
            .addConstraint(SecurityConfigValidator.vaagompSettingConstraint()).dynamic().build();
    settingLduioereuString =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LDAP__AUTHORIZATION__ACCESS_PERMITTED_GROUP,
                SettingValueParsers.STRING, "")
            .dynamic().build();
    settingAuhctDuration = SettingImpl.newBuilder(
        io.github.onograph.TokenConstants.DBMS__SECURITY__AUTH_CACHE_TTL,
        SettingValueParsers.DURATION,
        Duration.ofMinutes(10L)).build();
    settingAuasBoolean =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__SECURITY__AUTH_CACHE_USE_TTL,
            SettingValueParsers.BOOL, true).build();
    settingAuaaaInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__AUTH_CACHE_MAX_CAPACITY,
                SettingValueParsers.INT, 10000)
            .build();
    settingSeignPath =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__PATH,
                SettingValueParsers.PATH,
                Path.of(io.github.onograph.TokenConstants.SECURITY__LOG)).immutable()
            .setDependency(GraphDatabaseSettings.logs_directory).build();
    settingSeigaFormattedLogFormat = SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__FORMAT,
            SettingValueParsers.ofEnum(FormattedLogFormat.class), null)
        .setDependency(GraphDatabaseSettings.default_log_format).build();
    settingSeiglLevel =
        SettingImpl.newBuilder(io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__LEVEL,
            SettingValueParsers.ofEnum(Level.class),
            Level.INFO).build();
    settingSeigeleaBoolean =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__SECURITY__LOG_SUCCESSFUL_AUTHENTICATION,
                SettingValueParsers.BOOL, true)
            .build();
    settingStsigthoLong =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__ROTATION__SIZE,
                SettingValueParsers.BYTES,
                ByteUnit.mebiBytes(20L))
            .addConstraint(SettingConstraints.range(0L, Long.MAX_VALUE)).build();
    settingStsigteDuration =
        SettingImpl.newBuilder(
            io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__ROTATION__DELAY,
            SettingValueParsers.DURATION,
            Duration.ofSeconds(300L)).build();
    settingStsigreInteger =
        SettingImpl.newBuilder(
                io.github.onograph.TokenConstants.DBMS__LOGS__SECURITY__ROTATION__KEEP_NUMBER,
                SettingValueParsers.INT, 7)
            .addConstraint(SettingConstraints.min(1))
            .build();
  }
}
