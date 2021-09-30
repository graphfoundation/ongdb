package io.github.onograph.kernel.srv.pagecache;

import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class BasePageCacheLoadingWatcherTest {

  @Test
  void testConstructor() {

    BasePageCacheLoadingWatcher actualBasePageCacheLoadingWatcher = new BasePageCacheLoadingWatcher();
    actualBasePageCacheLoadingWatcher.prlcpdForNa(1L,
        TestDatabaseIdRepository.randomNamedDatabaseId());
    actualBasePageCacheLoadingWatcher.wamsrdForNa(TestDatabaseIdRepository.randomNamedDatabaseId());
    actualBasePageCacheLoadingWatcher.wapclForNa(1L,
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }
}

