package io.github.onograph.kernel.srv.pagecache;

import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.kernel.database.TestDatabaseIdRepository;

class PageCacheLoadingWatcherDefaultImplTest {

  @Test
  void testConstructor() {

    new PageCacheLoadingWatcherDefaultImpl(new BufferingLog());
  }

  @Test
  void testWamsrdForNa() {

    PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl = new PageCacheLoadingWatcherDefaultImpl(
        new BufferingLog());
    pageCacheLoadingWatcherDefaultImpl.wamsrdForNa(
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }

  @Test
  void testWapclForNa() {

    PageCacheLoadingWatcherDefaultImpl pageCacheLoadingWatcherDefaultImpl = new PageCacheLoadingWatcherDefaultImpl(
        new BufferingLog());
    pageCacheLoadingWatcherDefaultImpl.wamsrdForNa(
        TestDatabaseIdRepository.randomNamedDatabaseId());
    pageCacheLoadingWatcherDefaultImpl.wapclForNa(1L,
        TestDatabaseIdRepository.randomNamedDatabaseId());
  }
}

