package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;


public class StoreChannelFileWrapper implements Closeable {


  private final long lgVrin;


  private final StoreChannel storeChannel;


  private long lgSt;


  StoreChannelFileWrapper(FileSystemAbstraction _fFileSystemAbstraction, long _lgVrin, Path _path)
      throws IOException {
    this.storeChannel = _fFileSystemAbstraction.read(_path);
    this.lgVrin = _lgVrin;
  }

  @Override
  public void close() throws IOException {
    this.storeChannel.close();
  }


  long getLgSt() {
    return this.lgSt;
  }


  public long getLgVrin() {
    return this.lgVrin;
  }


  public StoreChannel getStoreChannel() {
    return this.storeChannel;
  }


  void setesa(long _lgSt) {
    this.lgSt = _lgSt;
  }
}
