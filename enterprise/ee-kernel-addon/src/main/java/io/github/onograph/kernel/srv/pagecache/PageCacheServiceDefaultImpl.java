package io.github.onograph.kernel.srv.pagecache;

import java.io.IOException;
import org.neo4j.io.IOUtils;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;


class PageCacheServiceDefaultImpl implements PageCacheService {


  private final CursorContext cursorContext;


  private final PageCursor pageCursor;


  PageCacheServiceDefaultImpl(PageCacheTracer _pageCacheTracer, PagedFile _pagedFile)
      throws IOException {
    this.cursorContext = new CursorContext(_pageCacheTracer.createPageCursorTracer(
        io.github.onograph.TokenConstants.PAGE_CACHE_PROFILE_LOADER));
    this.pageCursor = _pagedFile.io(0L, 1, this.cursorContext);
  }

  @Override
  public void close() {
    IOUtils.closeAllUnchecked(this.pageCursor, this.cursorContext);
  }

  @Override
  public void prepare(long pId) throws IOException {
    this.pageCursor.next(pId);
  }
}
