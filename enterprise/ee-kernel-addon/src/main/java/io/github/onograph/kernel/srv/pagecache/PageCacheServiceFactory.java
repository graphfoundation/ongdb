package io.github.onograph.kernel.srv.pagecache;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;


class PageCacheServiceFactory {


  private final ExecutorService executorService;

  PageCacheServiceFactory(ExecutorService _executorService) {
    this.executorService = _executorService;
  }


  PageCacheService geldPageCacheService(PageCacheTracer _pageCacheTracer, PagedFile _pagedFile)
      throws IOException {
    return FileUtils.highIODevice(_pagedFile.path()) ? new PageCacheServiceMultiThreadedImpl(
        this.executorService, _pageCacheTracer, _pagedFile)
        : new PageCacheServiceDefaultImpl(_pageCacheTracer, _pagedFile);
  }
}
