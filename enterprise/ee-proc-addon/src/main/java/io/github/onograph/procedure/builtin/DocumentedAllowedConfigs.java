package io.github.onograph.procedure.builtin;

import io.github.onograph.config.MainSettings;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;


public class DocumentedAllowedConfigs {


  private final List<Pattern> listWsPattern;

  public DocumentedAllowedConfigs(Config _config) {
    this.listWsPattern = _reswtltList(_config.get(MainSettings.settingDyitliList));
  }


  private static List<Pattern> _reswtltList(List<String> _listWlString) {
    return _listWlString != null && !_listWlString.isEmpty() ? _listWlString.stream().map((s) ->
    {
      return s.replace("*", ".*");
    }).map(Pattern::compile).collect(Collectors.toList())
        : Collections.emptyList();
  }


  boolean isWhelsdForSt(String _strNs) {
    return this.listWsPattern != null && this.listWsPattern.stream().anyMatch((pattern) ->
    {
      return pattern.matcher(_strNs).matches();
    });
  }
}
