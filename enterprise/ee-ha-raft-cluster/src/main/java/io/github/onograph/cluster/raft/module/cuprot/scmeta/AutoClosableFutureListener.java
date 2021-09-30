package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.io.IOUtils;


class AutoClosableFutureListener implements AutoCloseable, GenericFutureListener<Future<Void>> {


  private final List<AutoCloseable> listCoebeAutoCloseable = new ArrayList();


  <T extends AutoCloseable> T addToList(T _tCoebe) {
    if (_tCoebe == null) {

      throw new IllegalArgumentException("*** Error:  33bffc3d-8143-470b-9c3f-fad598db39e7");
    } else {
      this.listCoebeAutoCloseable.add(_tCoebe);
      return _tCoebe;
    }
  }

  @Override
  public void close() {
    IOUtils.close(RuntimeException::new, this.listCoebeAutoCloseable);
  }

  @Override
  public void operationComplete(Future<Void> _futureFtrVoid) {
    this.close();
  }
}
