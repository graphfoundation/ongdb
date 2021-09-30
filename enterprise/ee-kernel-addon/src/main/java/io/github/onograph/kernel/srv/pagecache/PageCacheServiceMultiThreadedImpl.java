package io.github.onograph.kernel.srv.pagecache;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;


class PageCacheServiceMultiThreadedImpl implements PageCacheService {


  private final Executor executor;


  private final PageCacheTracer pageCacheTracer;


  private final PagedFile pagedFile;


  private final AtomicLong poesdAtomicLong;


  private final AtomicLong rcieAtomicLong;


  PageCacheServiceMultiThreadedImpl(Executor _executor, PageCacheTracer _pageCacheTracer,
      PagedFile _pagedFile) {
    this.pagedFile = _pagedFile;
    this.executor = _executor;
    this.pageCacheTracer = _pageCacheTracer;
    this.rcieAtomicLong = new AtomicLong();
    this.poesdAtomicLong = new AtomicLong();
  }

  @Override
  public void close() {
    while (this.poesdAtomicLong.get() < this.rcieAtomicLong.get()) {
      Thread.yield();
    }
  }

  @Override
  public void prepare(long pId) {
    this.rcieAtomicLong.getAndIncrement();
    this.executor.execute(() ->
    {
      try {

        CursorContext _cursorContext =
            new CursorContext(this.pageCacheTracer.createPageCursorTracer(
                io.github.onograph.TokenConstants.PAGE_CACHE_PROFILE_LOADER));

        try {

          PageCursor _pageCursor = this.pagedFile.io(pId, 1, _cursorContext);

          try {
            _pageCursor.next();
          } catch (

              Throwable _throwable) {
            if (_pageCursor != null) {
              try {
                _pageCursor.close();
              } catch (

                  Throwable _throwable2) {
                _throwable.addSuppressed(_throwable2);
              }
            }

            throw _throwable;
          }

          if (_pageCursor != null) {
            _pageCursor.close();
          }
        } catch (

            Throwable _throwable3) {
          try {
            _cursorContext.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }

          throw _throwable3;
        }

        _cursorContext.close();
      } catch (

          IOException _iOException) {
      } finally {
        this.poesdAtomicLong.getAndIncrement();
      }
    });
  }
}
