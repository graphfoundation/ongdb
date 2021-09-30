package io.github.onograph.kernel.srv.pagecache;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.ClassGuardedAdversary;
import org.neo4j.adversaries.CountingAdversary;
import org.neo4j.adversaries.pagecache.AdversarialPagedFile;
import org.neo4j.io.pagecache.DelegatingPagedFile;
import org.neo4j.io.pagecache.StubPagedFile;
import org.neo4j.io.pagecache.checking.AccessCheckingPagedFile;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;

class PageCacheServiceDefaultImplTest {

  @Test
  void testConstructor() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    new PageCacheServiceDefaultImpl(_pageCacheTracer, new StubPagedFile(3));
  }

  @Test
  void testConstructor2() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    new PageCacheServiceDefaultImpl(_pageCacheTracer, new StubPagedFile(0));
  }

  @Test
  void testConstructor3() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    new PageCacheServiceDefaultImpl(_pageCacheTracer,
        new DelegatingPagedFile(new StubPagedFile(3)));
  }

  @Test
  void testConstructor4() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    new PageCacheServiceDefaultImpl(_pageCacheTracer,
        new AccessCheckingPagedFile(new StubPagedFile(3)));
  }

  @Test
  void testConstructor5() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    StubPagedFile delegate = new StubPagedFile(3);
    new PageCacheServiceDefaultImpl(_pageCacheTracer,
        new AdversarialPagedFile(delegate, new CountingAdversary(3, true)));
  }

  @Test
  void testConstructor6() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    Predicate<StackWalker.StackFrame> predicate = (Predicate<StackWalker.StackFrame>) mock(
        Predicate.class);
    when(predicate.test((StackWalker.StackFrame) any())).thenReturn(true);
    ClassGuardedAdversary adversary = new ClassGuardedAdversary(new CountingAdversary(3, true),
        predicate);

    new PageCacheServiceDefaultImpl(_pageCacheTracer,
        new AdversarialPagedFile(new StubPagedFile(3), adversary));
  }

  @Test
  void testClose() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    (new PageCacheServiceDefaultImpl(_pageCacheTracer, new StubPagedFile(3))).close();
  }

  @Test
  void testPrepare() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    (new PageCacheServiceDefaultImpl(_pageCacheTracer, new StubPagedFile(3))).prepare(123L);
  }

  @Test
  void testPrepare2() throws IOException {

    DefaultPageCacheTracer _pageCacheTracer = new DefaultPageCacheTracer();
    StubPagedFile delegate = new StubPagedFile(3);
    (new PageCacheServiceDefaultImpl(_pageCacheTracer,
        new AdversarialPagedFile(delegate, new CountingAdversary(3, true)))).prepare(123L);
  }
}

