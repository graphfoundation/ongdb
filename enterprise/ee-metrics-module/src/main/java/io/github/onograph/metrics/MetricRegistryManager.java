package io.github.onograph.metrics;

import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import java.util.List;
import java.util.SortedSet;
import java.util.function.Supplier;
import org.neo4j.configuration.helpers.GlobbingPattern;


public class MetricRegistryManager {


  private final List<GlobbingPattern> listFmGlobbingPattern;


  private final MetricRegistry metricRegistry;


  public MetricRegistryManager(List<GlobbingPattern> _listFmGlobbingPattern,
      MetricRegistry _metricRegistry) {
    this.metricRegistry = _metricRegistry;
    this.listFmGlobbingPattern = List.copyOf(_listFmGlobbingPattern);
  }


  public SortedSet<String> geneSortedSet() {
    return this.metricRegistry.getNames();
  }


  public boolean isEnlForSt(String _strNm) {
    return this.listFmGlobbingPattern.stream().anyMatch((pattern) ->
    {
      return pattern.matches(_strNm);
    });
  }


  public <T extends Metric> void reieForStSu(String _strNm, Supplier<T> _supplierCmT) {
    if (this.isEnlForSt(_strNm)) {
      this.metricRegistry.register(_strNm, (Metric) _supplierCmT.get());
    }
  }


  public void reoForSt(String _strNm) {
    this.metricRegistry.remove(_strNm);
  }


  public void reomcnForMe(MetricFilter _metricFilter) {
    this.metricRegistry.removeMatching(_metricFilter);
  }
}
