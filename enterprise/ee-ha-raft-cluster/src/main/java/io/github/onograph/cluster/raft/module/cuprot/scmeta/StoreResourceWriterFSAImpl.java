package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;


public class StoreResourceWriterFSAImpl implements StoreResourceWriter {


  private final List<AutoCloseable> listCoebeAutoCloseable;


  private final StoreChannel storeChannel;

  private StoreResourceWriterFSAImpl(StoreChannel _storeChannel,
      AutoCloseable... _coebeAutoCloseableArray) {
    this.storeChannel = _storeChannel;
    this.listCoebeAutoCloseable = new ArrayList();
    this.listCoebeAutoCloseable.add(_storeChannel);
    this.listCoebeAutoCloseable.addAll(Arrays.asList(_coebeAutoCloseableArray));
  }


  static StoreResourceWriterFSAImpl frmflStoreResourceWriterFSAImpl(
      FileSystemAbstraction _fFileSystemAbstraction, Path _pfPath) throws IOException {
    return new StoreResourceWriterFSAImpl(_fFileSystemAbstraction.write(_pfPath));
  }

  @Override
  public void close() throws IOException {
    IOUtils.closeAll(this.listCoebeAutoCloseable);
  }

  @Override
  public void wrtForBy(ByteBuf _datByteBuf) throws IOException {

    int _iTe = _datByteBuf.readableBytes();

    int _iBwoeof;
    for (

        int _iWt = 0; _iWt < _iTe; _iWt += _iBwoeof) {
      _iBwoeof = _datByteBuf.readBytes(this.storeChannel, _iTe);
      if (_iBwoeof < 0) {

        throw new IOException("*** Error: 509e9d03-bc18-4ee4-b7ab-1e83ce156d8f");
      }
    }
  }
}
