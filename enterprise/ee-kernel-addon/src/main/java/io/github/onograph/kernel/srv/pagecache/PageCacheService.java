package io.github.onograph.kernel.srv.pagecache;

import java.io.Closeable;
import java.io.IOException;


interface PageCacheService extends Closeable {


  void prepare(long _lgVar) throws IOException;
}
