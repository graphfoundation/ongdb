package io.github.onograph.metrics.gdb;

import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsService;
import java.util.Optional;
import org.neo4j.exceptions.UnsatisfiedDependencyException;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.kernel.lifecycle.Lifecycle;


public class GdbMetricsLifecycle implements Lifecycle {


  private final io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents dpnecDependentComponents;


  private final ExtensionContext extensionContext;


  private final LifeSupport lifeSupport = new LifeSupport();


  public GdbMetricsLifecycle(
      io.github.onograph.metrics.gdb.ExtensionFactoryGdbMetricsImpl.DependentComponents _dpnecDependentComponents,
      ExtensionContext _extensionContext) {
    this.dpnecDependentComponents = _dpnecDependentComponents;
    this.extensionContext = _extensionContext;
  }


  private Optional<MetricsService> _gemtmeOptional() {
    try {
      return Optional.of(this.dpnecDependentComponents.mersmneMetricsService());
    } catch (

        UnsatisfiedDependencyException _unsatisfiedDependencyException) {
      return Optional.empty();
    }
  }

  @Override
  public void init() {

    Optional<MetricsService> _optionalMoMetricsService = this._gemtmeOptional();
    _optionalMoMetricsService.ifPresent((metricsManager) ->
    {
      if (metricsManager.isCoir()) {

        MetricRegistryManager _metricRegistryManager = metricsManager.gerirMetricRegistryManager();
        (new GdbMetricsEngine(this.dpnecDependentComponents.cofutnConfig(),
            this.dpnecDependentComponents,
            this.extensionContext,
            this.lifeSupport, _metricRegistryManager)).exo();
      }
    });
    this.lifeSupport.init();
  }

  @Override
  public void shutdown() {
    this.lifeSupport.shutdown();
  }

  @Override
  public void start() {
    this.lifeSupport.start();
  }

  @Override
  public void stop() {
    this.lifeSupport.stop();
  }
}
