package io.github.onograph.backup;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.pagecache.ExternallyManagedPageCache;
import org.neo4j.memory.LocalMemoryTracker;

class BackupRestorationManagerTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    LocalMemoryTracker _memoryTracker = new LocalMemoryTracker();
    new BackupRestorationManager(_config, _fFileSystemAbstraction, _memoryTracker,
        new ExternallyManagedPageCache(
            new ExternallyManagedPageCache(
                new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)))));
  }
}

