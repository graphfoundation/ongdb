package io.github.onograph.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.neo4j.configuration.SettingMigrator;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.logging.Log;


public class SettingMigratorMetricImpl implements SettingMigrator {


  private static void _adealymttofeForMaLoLiStSeLiLi(Map<String, String> valArr, Log _log,
      List<String> _listMfString, String _strSo, PrefixUtil _bpPrefixUtil,
      List<String> _listDmString, List<String> _listMgString) {

    String val = valArr.remove(_strSo);
    if ("true".equalsIgnoreCase(val)) {

      Iterator _iterator = _listDmString.iterator();

      String _strMg;
      while (_iterator.hasNext()) {
        _strMg = (String) _iterator.next();
        _listMfString.add(_bpPrefixUtil.prxdbmenString(_strMg));
      }

      _iterator = _listMgString.iterator();

      while (_iterator.hasNext()) {
        _strMg = (String) _iterator.next();
        _listMfString.add(_bpPrefixUtil.prxgamrnmString(_strMg));
      }
    }
  }


  private static void _mitebmestmtfrForMaLo(Map<String, String> valArr, Log _log) {

    PrefixUtil _bpPrefixUtil = new PrefixUtil(valArr);

    List<String> _listFmaString = new ArrayList();
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingNetnlBoolean.name(),
        _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.TRANSACTION___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingNeghbBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(), List.of(io.github.onograph.TokenConstants.PAGE_CACHE___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingNeundBoolean.name(),
        _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.IDS_IN_USE___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingNeozbBoolean.name(),
        _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.STORE__SIZE___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingDaaundBoolean.name(), _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.NEO4J__COUNT___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingCaltglBoolean.name(), _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE___STAR_,
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CATCHUP___STAR_,
            io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__READ_REPLICA___STAR_),
        List.of(io.github.onograph.TokenConstants.CAUSAL_CLUSTERING__CORE__DISCOVERY___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingDaaeonbBoolean.name(), _bpPrefixUtil,
        Collections.emptyList(),
        List.of(io.github.onograph.TokenConstants.DB__OPERATION__COUNT___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingNeeiglBoolean.name(), _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.CHECK_POINT___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingNeatoaBoolean.name(), _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.LOG___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        io.github.onograph.TokenConstants.METRICS__NEO4J__LOGROTATION__ENABLED,
        _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.LOG___STAR_),
        Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingNerndBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(), List.of(io.github.onograph.TokenConstants.SERVER___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingJvgnlBoolean.name(),
        _bpPrefixUtil, Collections.emptyList(),
        List.of(io.github.onograph.TokenConstants.VM__GC___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingJvhpaeBoolean.name(), _bpPrefixUtil,
        Collections.emptyList(), List.of(io.github.onograph.TokenConstants.VM__HEAP___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingJvmndBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(),
        List.of(io.github.onograph.TokenConstants.VM__MEMORY__POOL___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingJvfeeBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(),
        List.of(io.github.onograph.TokenConstants.VM__MEMORY__BUFFER___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingJvreeBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(), List.of(io.github.onograph.TokenConstants.VM__THREAD___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingJvlcoaBoolean.name(), _bpPrefixUtil,
        Collections.emptyList(),
        List.of(io.github.onograph.TokenConstants.VM__FILE__DESCRIPTORS___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingJvumbBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(), List.of(io.github.onograph.TokenConstants.VM__PAUSE_TIME___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingCyrnndBoolean.name(), _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.CYPHER___STAR_), Collections.emptyList());
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString, Metrics.settingBoeebBoolean.name(),
        _bpPrefixUtil,
        Collections.emptyList(), List.of(io.github.onograph.TokenConstants.BOLT___STAR_));
    _adealymttofeForMaLoLiStSeLiLi(valArr, _log, _listFmaString,
        Metrics.settingNemondBoolean.name(), _bpPrefixUtil,
        List.of(io.github.onograph.TokenConstants.POOL___STAR_),
        List.of(io.github.onograph.TokenConstants.POOL___STAR_,
            io.github.onograph.TokenConstants.DBMS__POOL___STAR_));
    if (_listFmaString.size() != 0) {

      String _strFm = valArr.get(Metrics.settingMerslrList.name());
      if (_strFm == null) {

        Iterator _iterator = ((List) Metrics.settingMerslrList.defaultValue()).iterator();

        while (_iterator.hasNext()) {

          GlobbingPattern _globbingPattern = (GlobbingPattern) _iterator.next();
          _listFmaString.add(_globbingPattern.toString());
        }
      } else if (!_strFm.isEmpty()) {
        _listFmaString.add(_strFm);
      }

      valArr.put(Metrics.settingMerslrList.name(), String.join(",", _listFmaString));
    }
  }

  @Override
  public void migrate(Map<String, String> valArr, Map<String, String> _mapVdss, Log _log) {
    _mitebmestmtfrForMaLo(valArr, _log);
  }


  private static class PrefixUtil {


    private final String strPmd;


    private final String strPmg;

    PrefixUtil(Map<String, String> valArr) {

      String mprnm =
          valArr.getOrDefault(Metrics.settingMersexString.name(),
              Metrics.settingMersexString.defaultValue());

      StringBuilder _pmgStringBuilder = new StringBuilder(mprnm);

      StringBuilder _pmdStringBuilder = new StringBuilder(mprnm);
      _pmgStringBuilder.append('.');
      _pmdStringBuilder.append('.');
      if (_isNapeeForMa(valArr)) {
        _pmgStringBuilder.append(io.github.onograph.TokenConstants.DBMS__);
        _pmdStringBuilder.append(io.github.onograph.TokenConstants.DATABASE__);
      }

      _pmdStringBuilder.append("*.");
      this.strPmg = _pmgStringBuilder.toString();
      this.strPmd = _pmdStringBuilder.toString();
    }


    private static boolean _isNapeeForMa(Map<String, String> valArr) {

      String _strSen = valArr.get(Metrics.settingMeceebBoolean.name());

      boolean _isBen = Metrics.settingMeceebBoolean.defaultValue();
      if (_strSen != null) {
        _isBen = SettingValueParsers.BOOL.parse(_strSen);
      }

      return _isBen;
    }


    String prxdbmenString(String _strNm) {
      return this.strPmd + _strNm;
    }


    String prxgamrnmString(String _strNm) {
      return this.strPmg + _strNm;
    }
  }
}
