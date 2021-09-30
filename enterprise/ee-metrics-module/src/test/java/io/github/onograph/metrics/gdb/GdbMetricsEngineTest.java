package io.github.onograph.metrics.gdb;

import static org.mockito.Mockito.mock;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.common.DependencySatisfier;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.GlobbingPattern;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.extension.context.DatabaseExtensionContext;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.lifecycle.LifeSupport;

class GdbMetricsEngineTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    DatabaseExtensionContext _extensionContext = new DatabaseExtensionContext(
        mock(DatabaseLayout.class),
        DbmsInfo.UNKNOWN, mock(DependencySatisfier.class));

    LifeSupport _lifeSupport = new LifeSupport();
    ArrayList<GlobbingPattern> _listFmGlobbingPattern = new ArrayList<GlobbingPattern>();
    new GdbMetricsEngine(_config, null, _extensionContext, _lifeSupport,
        new MetricRegistryManager(_listFmGlobbingPattern, new MetricRegistry()));
  }
}

