package io.github.onograph.kernel.srv.pagecache;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.concurrent.Executor;
import org.junit.jupiter.api.Test;
import org.neo4j.io.pagecache.StubPagedFile;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;

class PageCacheServiceMultiThreadedImplTest {

  @Test
  void testConstructor() {

    Executor _executor = mock(Executor.class);
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    new PageCacheServiceMultiThreadedImpl(_executor, _pageCacheTracer, new StubPagedFile(3));
  }

  @Test
  void testClose() {

    Executor _executor = mock(Executor.class);
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    (new PageCacheServiceMultiThreadedImpl(_executor, _pageCacheTracer,
        new StubPagedFile(3))).close();
  }

  @Test
  void testPrepare() {
    Executor executor = mock(Executor.class);
    doNothing().when(executor).execute((Runnable) any());
    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    (new PageCacheServiceMultiThreadedImpl(executor, _pageCacheTracer,
        new StubPagedFile(3))).prepare(123L);
    verify(executor).execute((Runnable) any());
  }
}

