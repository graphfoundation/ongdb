package io.github.onograph.cluster.raft.share;

import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.pagecache.ExternallyManagedPageCache;

class GdbUtilWrapperServiceImplTest {

  @Test
  void testConstructor() {

    DefaultFileSystemAbstraction _fileSystemAbstraction = new DefaultFileSystemAbstraction();
    new GdbUtilWrapperServiceImpl(_fileSystemAbstraction, new ExternallyManagedPageCache(
        new ExternallyManagedPageCache(
            new ExternallyManagedPageCache(new ExternallyManagedPageCache(null)))));
  }
}

