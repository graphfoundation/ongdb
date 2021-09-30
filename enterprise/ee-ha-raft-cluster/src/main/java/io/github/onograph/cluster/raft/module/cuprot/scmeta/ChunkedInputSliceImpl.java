package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.stream.ChunkedInput;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.io.fs.StoreChannel;


class ChunkedInputSliceImpl implements ChunkedInput<Slice> {


  private final int largest;


  private final StoreElementFacade rsucStoreElementFacade;


  private ByteBuf pnByteBuf;


  private io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType saeActionStatusType;


  private StoreChannel storeChannel;


  ChunkedInputSliceImpl(int largest, StoreElementFacade _rsucStoreElementFacade) {
    this.saeActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.BEFORE_SETUP;
    this.rsucStoreElementFacade = _rsucStoreElementFacade;
    this.largest = largest;
  }


  private ByteBuf _prfcByteBuf(ByteBufAllocator _byteBufAllocator) throws IOException {

    ByteBuf _pyodByteBuf = _byteBufAllocator.ioBuffer(this.largest);

    int _iRt = 0;

    try {
      _iRt = this._reaForBy(_pyodByteBuf);
    } finally {
      if (_iRt == 0) {
        _pyodByteBuf.release();
        _pyodByteBuf = null;
      }
    }

    return _pyodByteBuf;
  }


  private int _reaForBy(ByteBuf _pyodByteBuf) throws IOException {

    int _iRt = 0;

    do {

      int _iFoeorb = _pyodByteBuf.writeBytes(this.storeChannel, this.largest - _iRt);
      if (_iFoeorb < 0) {
        break;
      }

      _iRt += _iFoeorb;
    }
    while (_iRt < this.largest);

    return _iRt;
  }

  @Override
  public void close() throws Exception {
    if (this.storeChannel != null) {
      this.storeChannel.close();
      this.storeChannel = null;
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ChunkedInputSliceImpl _thChunkedInputSliceImpl = (ChunkedInputSliceImpl) obj;
      return Objects.equals(this.rsucStoreElementFacade,
          _thChunkedInputSliceImpl.rsucStoreElementFacade);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rsucStoreElementFacade);
  }

  @Override
  public boolean isEndOfInput() {
    return this.saeActionStatusType
        == io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.COMPLETED;
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
  public Slice readChunk(ByteBufAllocator _byteBufAllocator) throws Exception {
    if (this.saeActionStatusType
        == io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.COMPLETED) {
      return null;
    } else {
      if (this.saeActionStatusType
          == io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.BEFORE_SETUP) {
        this.storeChannel = this.rsucStoreElementFacade.opeStoreChannel();
        this.pnByteBuf = this._prfcByteBuf(_byteBufAllocator);
        if (this.pnByteBuf == null) {
          this.saeActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.COMPLETED;
          return Slice.craSlice(this.largest, true, Unpooled.EMPTY_BUFFER);
        }

        this.saeActionStatusType = this.pnByteBuf.readableBytes() < this.largest
            ? io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.FINAL_WAITING
            : io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.AT_FULL_WAITING;
      }

      if (this.saeActionStatusType ==
          io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.AT_FULL_WAITING) {

        ByteBuf _stByteBuf = this.pnByteBuf;
        this.pnByteBuf = this._prfcByteBuf(_byteBufAllocator);
        if (this.pnByteBuf == null) {
          this.saeActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.COMPLETED;
          return Slice.craSlice(this.largest, true, _stByteBuf);
        } else if (this.pnByteBuf.readableBytes() < this.largest) {
          this.saeActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.FINAL_WAITING;
          return Slice.craSlice(this.largest, false, _stByteBuf);
        } else {
          return Slice.craSlice(this.largest, false, _stByteBuf);
        }
      } else if (this.saeActionStatusType ==
          io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.FINAL_WAITING) {
        this.saeActionStatusType = io.github.onograph.cluster.raft.module.cuprot.scmeta.ChunkedInputSliceImpl.ActionStatusType.COMPLETED;
        return Slice.craSlice(this.largest, true, this.pnByteBuf);
      } else {
        throw new IllegalStateException();
      }
    }
  }

  @Override
  public Slice readChunk(ChannelHandlerContext _cChannelHandlerContext) throws Exception {
    return this.readChunk(_cChannelHandlerContext.alloc());
  }


  enum ActionStatusType {


    BEFORE_SETUP,

    AT_FULL_WAITING,

    FINAL_WAITING,

    COMPLETED
  }
}
