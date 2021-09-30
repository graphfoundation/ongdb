package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.DelegatingPageCache;

class TxMetaUtilTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    AdversarialChannelDefaultFileSystemAbstraction _fFileSystemAbstraction = new AdversarialChannelDefaultFileSystemAbstraction();
    new TxMetaUtil(_config, _fFileSystemAbstraction,
        new DelegatingPageCache(
            new DelegatingPageCache(new DelegatingPageCache(new DelegatingPageCache(null)))));
  }
}

