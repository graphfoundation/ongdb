package io.github.onograph.cluster.raft.share;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import io.github.onograph.config.SettingsDeclarationClusterSystemImpl;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingMigrator;
import org.neo4j.configuration.SettingMigrators;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.helpers.DurationRange;
import org.neo4j.logging.Level;
import org.neo4j.logging.Log;


public class SettingsMigratorImpl implements SettingMigrator {


  static final int STD_FALE_DEEI_LIMT_WID_IN_SEOS = 5;


  private static Level _paslelLevel(String val) {

    int _iIl = Integer.parseInt(val);
    if (_iIl == java.util.logging.Level.OFF.intValue()) {
      return Level.NONE;
    } else if (_iIl <= java.util.logging.Level.FINE.intValue()) {
      return Level.DEBUG;
    } else if (_iIl <= java.util.logging.Level.INFO.intValue()) {
      return Level.INFO;
    } else {
      return _iIl <= java.util.logging.Level.WARNING.intValue() ? Level.WARN : Level.ERROR;
    }
  }


  private void _corectuForMaMaStStLo(Log _log, Map<String, String> _mapVdss, String _strVtel,
      String _strVwrf, Map<String, String> valArr) {

    String _strLets = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_ELECTION_TIMEOUT;

    String _strSwdf = SettingsDeclarationClusterImpl.settingLerutodDurationRange.name();

    String _strSwrf = SettingsDeclarationClusterImpl.settingEliidtiDurationRange.name();

    Duration _mDuration = SettingValueParsers.DURATION.parse(_strVtel);

    Duration _mDuration2 = _mDuration.plusMillis(Math.min(_mDuration.toMillis(), 5000L));

    String _strVwdf = (new DurationRange(_mDuration, _mDuration2)).valueToString();
    valArr.put(_strSwdf, _strVwdf);
    if (StringUtils.isBlank(_strVwrf)) {

      DurationRange _wrfdDurationRange = SettingsDeclarationClusterImpl.settingEliidtiDurationRange.defaultValue();

      String _strVwrfo = _mapVdss.get(_strSwrf);
      if (StringUtils.isNotBlank(_strVwrfo)) {
        _wrfdDurationRange = SettingValueParsers.DURATION_RANGE.parse(_strVwrfo);
      }

      if (_mDuration.toMillis() < _wrfdDurationRange.getMin().toMillis()) {
        valArr.put(_strSwrf, _strVwdf);
      }
    }
  }


  private void _mitaeearsForMaMaLo(Log _log, Map<String, String> _mapVdss,
      Map<String, String> valArr) {
    SettingMigrators.migrateAdvertisedAddressInheritanceChange(valArr, _mapVdss, _log,
        SettingsDeclarationClusterImpl.settingTranerSocketAddress.name(),
        SettingsDeclarationClusterImpl.settingTranrdeSocketAddress.name());
    SettingMigrators.migrateAdvertisedAddressInheritanceChange(valArr, _mapVdss, _log,
        SettingsDeclarationClusterImpl.settingRaiasSocketAddress.name(),
        SettingsDeclarationClusterImpl.settingRadidsSocketAddress.name());
    SettingMigrators.migrateAdvertisedAddressInheritanceChange(valArr, _mapVdss, _log,
        SettingsDeclarationClusterImpl.settingDiviasSocketAddress.name(),
        SettingsDeclarationClusterImpl.settingDivdidsSocketAddress.name());
  }


  private void _mitcnralForMaLo(Log _log, Map<String, String> valArr) {
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CONNECT_RANDOMLY_TO_SERVER_GROUP,
        SettingsDeclarationClusterImpl.settingCocdtvoryList);
  }


  private void _mitdamiwlogForMaLo(Log _log, Map<String, String> valArr) {

    String _strSo = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__DISABLE_MIDDLEWARE_LOGGING;

    String _strSn = SettingsDeclarationClusterImpl.settingMielneLevel.name();

    String val = valArr.remove(_strSo);
    if (Objects.equals(io.github.onograph.TokenConstants.TRUE, val)) {

      valArr.put(_strSn, Level.NONE.toString());
    }
  }


  private void _mitectuForMaMaLo(Log _log, Map<String, String> _mapDvss,
      Map<String, String> valArr) {

    String _strLets = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__LEADER_ELECTION_TIMEOUT;

    String _strSwdf = SettingsDeclarationClusterImpl.settingLerutodDurationRange.name();

    String _strSwrf = SettingsDeclarationClusterImpl.settingEliidtiDurationRange.name();

    String _strLetv = valArr.get(_strLets);

    String _strVwdf = valArr.get(_strSwdf);

    String _strVwrf = valArr.get(_strSwrf);
    if (StringUtils.isNotBlank(_strLetv)) {
      if (StringUtils.isNotBlank(_strVwdf)) {

      } else {
        this._corectuForMaMaStStLo(_log, _mapDvss, _strLetv, _strVwrf, valArr);
      }
    }
  }


  private void _mitmdraaForMaLo(Log _log, Map<String, String> valArr) {
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__DEFAULT_PARALLELISM,
        SettingsDeclarationClusterSystemImpl.settingMieaetlseInteger);
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__SINK_PARALLELISM,
        SettingsDeclarationClusterSystemImpl.settingMieairleInteger);
    SettingMigrators
        .migrateSettingNameChange(valArr, _log,
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__BIND_TIMEOUT,
            SettingsDeclarationClusterSystemImpl.settingAkimDuration);
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__CONNECTION_TIMEOUT,
        SettingsDeclarationClusterSystemImpl.settingAkotitDuration);
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE__AKKA__HANDSHAKE_TIMEOUT,
        SettingsDeclarationClusterSystemImpl.settingAkaamDuration);
  }


  private void _mitmdrlglesegForMaLo(Log _log, Map<String, String> _mapIptss) {

    String _strSo = io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__MIDDLEWARE_LOGGING__LEVEL;

    String _strNs = SettingsDeclarationClusterImpl.settingMielneLevel.name();

    String val = _mapIptss.remove(_strSo);
    if (StringUtils.isNotBlank(val) && NumberUtils.isParsable(val)) {

      _mapIptss.put(_strNs, val);
    }
  }


  private void _mitmdrlglevaForMaLo(Log _log, Map<String, String> valArr) {

    String _strStig = SettingsDeclarationClusterImpl.settingMielneLevel.name();

    String val = valArr.get(_strStig);
    if (StringUtils.isNotBlank(val) && NumberUtils.isParsable(val)) {

      String _strLvl = _paslelLevel(val).toString();

      valArr.put(_strStig, _strLvl);
    }
  }


  private void _mitrtttForMaLo(Log _log, Map<String, String> valArr) {
    SettingMigrators.migrateSettingNameChange(valArr, _log,
        io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CLUSTER_ROUTING_TTL,
        GraphDatabaseSettings.routing_ttl);
  }

  @Override
  public void migrate(Map<String, String> valArr, Map<String, String> _mapVdss, Log _log) {
    this._mitrtttForMaLo(_log, valArr);
    this._mitdamiwlogForMaLo(_log, valArr);
    this._mitmdrlglesegForMaLo(_log, valArr);
    this._mitmdrlglevaForMaLo(_log, valArr);
    this._mitaeearsForMaMaLo(_log, _mapVdss, valArr);
    this._mitectuForMaMaLo(_log, _mapVdss, valArr);
    this._mitcnralForMaLo(_log, valArr);
    this._mitmdraaForMaLo(_log, valArr);
  }
}
