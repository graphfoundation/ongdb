package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.github.onograph.cluster.raft.utils.ExceptionManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.stream.ChunkedInput;
import io.netty.util.ReferenceCountUtil;
import java.util.LinkedList;
import java.util.Queue;
import org.neo4j.kernel.database.DatabaseId;


public class ChunkedInputTxWrapper implements ChunkedInput<ByteBuf> {


  private static final int CHNI = 32768;


  private final DatabaseId databaseId;


  private final boolean isIsh;


  private final Queue<ByteBuf> queueCukByteBuf = new LinkedList();


  private final SyncableTransactionLogWriter wtSyncableTransactionLogWriter;


  private WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl;


  public ChunkedInputTxWrapper(boolean _isPsh, AbstractTransactionSync _tAbstractTransactionSync) {
    this.wtSyncableTransactionLogWriter = new SyncableTransactionLogWriter(
        _tAbstractTransactionSync.getTPhysicalTransactionRepresentation());
    this.databaseId = _tAbstractTransactionSync.daasidDatabaseId();
    this.isIsh = _isPsh;
  }


  private byte[] _getSafeMd(int val) {

    return this.isIsh ? Unpooled.buffer(4, 4).writeInt(val).array() : new byte[0];
  }


  private void _seraepo() {

    if (this.isIsh) {
      this.writableChecksumChannelDefaultImpl.semat(
          this._getSafeMd(this.writableChecksumChannelDefaultImpl.curtid() - 4));
    }
  }

  @Override
  public void close() {

    ExceptionManager _heExceptionManager = new ExceptionManager(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.ChunkedInputTxWrapper.heExceptionManager"));

    try {
      if (this.writableChecksumChannelDefaultImpl != null) {
        _heExceptionManager.exceForEx(() ->
        {
          this.writableChecksumChannelDefaultImpl.close();
        });
      }

      this.queueCukByteBuf.forEach((byteBuf) ->
      {
        _heExceptionManager.exceForEx(() ->
        {
          ReferenceCountUtil.release(byteBuf);
        });
      });
    } catch (

        Throwable _throwable) {
      try {
        _heExceptionManager.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _heExceptionManager.close();
  }

  @Override
  public boolean isEndOfInput() {
    return this.writableChecksumChannelDefaultImpl != null
        && this.writableChecksumChannelDefaultImpl.getIsCi() && this.queueCukByteBuf.isEmpty();
  }

  @Override
  public long length() {
    return -1L;
  }

  @Override
  public long progress() {
    return 0L;
  }

  @Override
  public ByteBuf readChunk(ChannelHandlerContext _cChannelHandlerContext) throws Exception {
    return this.readChunk(_cChannelHandlerContext.alloc());
  }

  @Override
  public ByteBuf readChunk(ByteBufAllocator _byteBufAllocator) throws Exception {
    if (this.isEndOfInput()) {
      return null;
    } else {
      if (this.writableChecksumChannelDefaultImpl == null) {
        this.writableChecksumChannelDefaultImpl =
            new WritableChecksumChannelDefaultImpl(_byteBufAllocator, this._getSafeMd(-1), 32768,
                this.queueCukByteBuf);
        DatabaseIdOnlySafeChannelMarshal.IT.marshal(this.databaseId,
            this.writableChecksumChannelDefaultImpl);
      }

      while (this.wtSyncableTransactionLogWriter.isCawt() && this.queueCukByteBuf.isEmpty()) {
        this.wtSyncableTransactionLogWriter.wrtForWr(this.writableChecksumChannelDefaultImpl);
        this._seraepo();
      }

      if (this.queueCukByteBuf.isEmpty()) {
        this.writableChecksumChannelDefaultImpl.close();
      }

      return this.queueCukByteBuf.poll();
    }
  }
}
