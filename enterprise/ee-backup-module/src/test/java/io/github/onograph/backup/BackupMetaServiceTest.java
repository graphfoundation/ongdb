package io.github.onograph.backup;

import static org.mockito.Mockito.mock;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.pagecache.ExternallyManagedPageCache;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;

class BackupMetaServiceTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Path _lbPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    ExternallyManagedPageCache _pageCache = new ExternallyManagedPageCache(
        new ExternallyManagedPageCache(
            new ExternallyManagedPageCache(new ExternallyManagedPageCache(null))));
    new BackupMetaService(_fFileSystemAbstraction, "Gdb Name", _lbPath, _logProvider, _pageCache,
        new DefaultPageCacheTracer());
  }

  @Test
  void testCrebulaBackupMetaDTO() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Path _lbPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    ExternallyManagedPageCache _pageCache = new ExternallyManagedPageCache(
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));
    (new BackupMetaService(_fFileSystemAbstraction, "Gdb Name", _lbPath, _logProvider, _pageCache,
        new DefaultPageCacheTracer())).crebulaBackupMetaDTO();
  }

  @Test
  void testCrebulaBackupMetaDTO2() {

    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Path _lbPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    ExternallyManagedPageCache _pageCache = new ExternallyManagedPageCache(
        new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)));
    (new BackupMetaService(_fFileSystemAbstraction, "Gdb Name", _lbPath, _logProvider, _pageCache,
        new DefaultPageCacheTracer())).crebulaBackupMetaDTO();
  }
}

