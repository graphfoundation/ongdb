package io.github.onograph.config;

import java.util.Collection;
import java.util.stream.Collectors;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.graphdb.config.Configuration;
import org.neo4j.graphdb.config.Setting;


class ClusterDiscoveryConfigVerifier {

  final Collection<Setting<?>> collectionRerstsSetting;

  ClusterDiscoveryConfigVerifier(Collection<Setting<?>> _collectionSrSetting) {
    this.collectionRerstsSetting = _collectionSrSetting;
  }


  private boolean _isSgiseForCo(Configuration _configuration) {
    return _configuration.get(GraphDatabaseSettings.mode) == Mode.SINGLE
        && EnterpriseClusterSettings.isCleeeForCo(_configuration);
  }


  private void _thomiiForClSe(Setting<?> _settingStigObject, ClusterDiscoveryMode tNme) {

    throw new IllegalArgumentException("*** Error: c1424d5d-cc61-4281-95ec-9450be86912a");
  }


  void chcseForClCo(Configuration _configuration, ClusterDiscoveryMode tNme) {
    this.collectionRerstsSetting.forEach((setting) ->
    {

      Object _obSr;
      try {
        _obSr = _configuration.get(setting);
      } catch (

          IllegalArgumentException _illegalArgumentException) {
        this._thomiiForClSe(setting, tNme);
        return;
      }

      if (!this._isSgiseForCo(_configuration) && _obSr == null) {
        this._thomiiForClSe(setting, tNme);
      }
    });
  }


  String sendciString(ClusterDiscoveryMode tNme) {
    return String.format(io.github.onograph.I18N.format(
            "io.github.onograph.config.ClusterDiscoveryConfigVerifier.format"), tNme.name(),
        this.collectionRerstsSetting.stream().map(Setting::name).collect(Collectors.toList()));
  }
}
