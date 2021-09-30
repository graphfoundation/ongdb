package io.github.onograph.config;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigFactory;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.configuration.SettingConstraint;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.graphdb.config.Configuration;


final class ClusterSettingsValidatorUtil {

  private ClusterSettingsValidatorUtil() {
  }


  static <T> SettingConstraint<T> ifdcyctSettingConstraint(
      SettingConstraint<T> _settingConstraintCsT) {
    return SettingConstraints.ifCluster(_settingConstraintCsT, SettingConstraints
        .dependency(_settingConstraintCsT, SettingConstraints.unconstrained(),
            MainSettings.settingEnetgaoBoolean,
            SettingConstraints.is(true)));
  }


  static SettingConstraint<ClusterDiscoveryMode> vaaiidvmesSettingConstraint() {
    return ifdcyctSettingConstraint(new SettingConstraint<ClusterDiscoveryMode>() {
      @Override
      public String getDescription() {

        Stream _stream = Arrays.stream(ClusterDiscoveryMode.values())
            .map(ClusterDiscoveryMode::sendciString);
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.ClusterSettingsValidatorUtil.getDescription2",
            _stream.collect(Collectors.joining(", ")));
      }

      @Override
      public void validate(ClusterDiscoveryMode _tdClusterDiscoveryMode,
          Configuration _configuration) {
        _tdClusterDiscoveryMode.chcseForCo(_configuration);
      }
    });
  }


  static SettingConstraint<Path> vaamdacnSettingConstraint() {
    return ifdcyctSettingConstraint(new SettingConstraint<Path>() {
      @Override
      public String getDescription() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.ClusterSettingsValidatorUtil.getDescription");
      }

      @Override
      public void validate(Path _pcaPath, Configuration _configuration) {
        if (_pcaPath != null) {
          if (Files.notExists(_pcaPath) || !Files.isRegularFile(_pcaPath)) {

            throw new IllegalArgumentException("*** Error: fdd896b4-6271-48ee-b7eb-eb90b0f55d2f");
          }

          try {
            ConfigFactory.parseFileAnySyntax(_pcaPath.toFile());
          } catch (

              ConfigException _configException) {

            throw new IllegalArgumentException("*** Error: b85bcf50-5d2d-485c-8708-a30d66a63b53",
                _configException);
          }
        }
      }
    });
  }
}
