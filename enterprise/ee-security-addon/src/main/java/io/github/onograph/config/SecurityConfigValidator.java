package io.github.onograph.config;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.neo4j.configuration.SettingConstraint;
import org.neo4j.graphdb.config.Configuration;


final class SecurityConfigValidator {


  private static final String GRP_DEIT = ";";


  private static final String MK_GRP = "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*";


  private static final String MK_VAU_DEIT = "=";


  private static final String MK_VAU_GRP = "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*=(\\s*([a-zA-Z0-9_]+)(,\\s*([a-zA-Z0-9_]+))*)?";


  private static final String RLX_DEIT = ",";


  private static final String RLX_GRP = "\\s*([a-zA-Z0-9_]+)";


  private static final String RLX_GRU = "(\\s*([a-zA-Z0-9_]+)(,\\s*([a-zA-Z0-9_]+))*)?";


  private static final Pattern kevuPattern =
      Pattern.compile(
          "\\s*('(.+)'|\"(.+)\"|(\\S)|(\\S.*\\S))\\s*=(\\s*([a-zA-Z0-9_]+)(,\\s*([a-zA-Z0-9_]+))*)?");

  private SecurityConfigValidator() {
  }


  static SettingConstraint<String> noetSettingConstraint() {
    return new SettingConstraint<String>() {
      @Override
      public String getDescription() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.SecurityConfigValidator.getDescription3");
      }

      @Override
      public void validate(String val, Configuration _configuration) {
        if (val.isEmpty()) {
          throw new IllegalArgumentException(this.getDescription());
        }
      }
    };
  }


  static SettingConstraint<List<String>> noetliSettingConstraint() {
    return new SettingConstraint<List<String>>() {
      @Override
      public String getDescription() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.SecurityConfigValidator.getDescription4");
      }

      @Override
      public void validate(List<String> val, Configuration _configuration) {
        if (val.isEmpty()) {
          throw new IllegalArgumentException(this.getDescription());
        }
      }
    };
  }


  static SettingConstraint<String> vaagompSettingConstraint() {
    return new SettingConstraint<String>() {
      @Override
      public String getDescription() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.SecurityConfigValidator.getDescription");
      }

      @Override
      public void validate(String _strGm, Configuration _configuration) {

        String[] _strVarArray = _strGm.split(";");

        int _iV = _strVarArray.length;

        for (

            int _iV2 = 0; _iV2 < _iV; ++_iV2) {

          String _strRag = _strVarArray[_iV2];
          if (!_strRag.isEmpty()) {

            Matcher _matcher = SecurityConfigValidator.kevuPattern.matcher(_strRag);
            if (!_matcher.find()) {

              throw new IllegalArgumentException("*** Error: 6a72741f-9cc5-4908-98fe-d61ad27e9149");
            }
          }
        }
      }
    };
  }


  static SettingConstraint<String> vaauetpSettingConstraint() {
    return new SettingConstraint<String>() {
      @Override
      public String getDescription() {
        return io.github.onograph.I18N.format(
            "io.github.onograph.config.SecurityConfigValidator.getDescription2");
      }

      @Override
      public void validate(String _strTmlt, Configuration _configuration) {
        if (!_strTmlt.contains("{0}")) {

          throw new IllegalArgumentException("*** Error: 19a133f5-16a9-47a2-934c-12f835d108a1");
        }
      }
    };
  }
}
