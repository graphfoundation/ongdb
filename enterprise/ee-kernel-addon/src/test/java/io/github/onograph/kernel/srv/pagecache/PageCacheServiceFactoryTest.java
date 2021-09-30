package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.netty.channel.DefaultEventLoop;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.neo4j.io.pagecache.StubPagedFile;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;

class PageCacheServiceFactoryTest {

  @Test
  void testConstructor() {

    new PageCacheServiceFactory(new DefaultEventLoop());
  }

  @Test
  void testGeldPageCacheService() throws IOException {
    PageCacheServiceFactory pageCacheServiceFactory = new PageCacheServiceFactory(
        new DefaultEventLoop());
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    assertTrue(pageCacheServiceFactory.geldPageCacheService(_pageCacheTracer,
        new StubPagedFile(3)) instanceof PageCacheServiceMultiThreadedImpl);
  }
}

