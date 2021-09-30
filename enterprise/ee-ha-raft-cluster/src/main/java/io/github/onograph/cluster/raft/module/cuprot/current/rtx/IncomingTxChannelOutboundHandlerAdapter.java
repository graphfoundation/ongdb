package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelDefaultImpl;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupOutgoingTransactionPullReply;
import io.github.onograph.cluster.raft.utils.ExceptionManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.util.ReferenceCountUtil;
import java.io.IOException;
import java.util.LinkedList;
import org.neo4j.io.ByteUnit;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryWriter;
import org.neo4j.util.VisibleForTesting;


public class IncomingTxChannelOutboundHandlerAdapter extends ChannelOutboundHandlerAdapter {


  private static final int STD_CHN_SIZ = (int) ByteUnit.mebiBytes(1L);


  private static final int TEMP_TXS_DTINF = -1;


  private final int iCs;


  private final LinkedList<ByteBuf> linkedListCpByteBuf;


  private WritableChecksumChannelDefaultImpl writableChecksumChannelDefaultImpl;

  @VisibleForTesting
  IncomingTxChannelOutboundHandlerAdapter(int _iSc) {
    this.linkedListCpByteBuf = new LinkedList();
    this.iCs = _iSc;
  }

  public IncomingTxChannelOutboundHandlerAdapter() {
    this(STD_CHN_SIZ);
  }


  private int _caltxs(int _iIst) {
    return (this.writableChecksumChannelDefaultImpl != null
        ? this.writableChecksumChannelDefaultImpl.curtid() : 0) +
        this.linkedListCpByteBuf.stream().mapToInt(ByteBuf::readableBytes).sum() - _iIst;
  }


  private void _hadfstxForChCa(ChannelHandlerContext _cChannelHandlerContext,
      CatchupOutgoingTransactionPullReply m) throws IOException {
    if (this._isEotstForCa(m)) {

      throw new IllegalArgumentException("*** Error:  43cc2cab-cccb-4acc-874a-af22cd1ffb55");
    } else {
      this.writableChecksumChannelDefaultImpl =
          new WritableChecksumChannelDefaultImpl(_cChannelHandlerContext.alloc(), this.iCs,
              this.linkedListCpByteBuf);
      StoreIdSafeChannelMarshal.IT.marshal(m.getStoreId(), this.writableChecksumChannelDefaultImpl);
    }
  }


  private boolean _isEotstForCa(CatchupOutgoingTransactionPullReply m) {
    return m.equals(
        CatchupOutgoingTransactionPullReply.EMT_CATCHUP_OUTGOING_TRANSACTION_PULL_REPLY);
  }


  private boolean _isFitt() {
    return this.writableChecksumChannelDefaultImpl == null;
  }


  private void _recpcdsz(int _iMi) {
    this.linkedListCpByteBuf.peek().setInt(_iMi, this._caltxs(_iMi + 4));
  }


  private void _wrpncnForChCh(ChannelHandlerContext _cChannelHandlerContext,
      ChannelPromise _channelPromise) {
    if (this.linkedListCpByteBuf.isEmpty()) {
      _channelPromise.setSuccess();
    } else {
      do {

        ByteBuf _cnByteBuf = this.linkedListCpByteBuf.poll();

        ChannelPromise _npChannelPromise = this.linkedListCpByteBuf.isEmpty() ? _channelPromise
            : _cChannelHandlerContext.voidPromise();
        _cChannelHandlerContext.write(_cnByteBuf, _npChannelPromise);
      }
      while (!this.linkedListCpByteBuf.isEmpty());
    }
  }


  private void _wrtreoeForChCaCh(ChannelHandlerContext _cChannelHandlerContext,
      CatchupOutgoingTransactionPullReply catchupOutgoingTransactionPullReply,
      ChannelPromise _channelPromise) throws IOException {
    assert this.linkedListCpByteBuf.isEmpty();

    if (this._isFitt()) {
      this._hadfstxForChCa(_cChannelHandlerContext, catchupOutgoingTransactionPullReply);
    }

    int _iIm = this.writableChecksumChannelDefaultImpl.curtid();
    this.writableChecksumChannelDefaultImpl.putInt(-1);
    if (this._isEotstForCa(catchupOutgoingTransactionPullReply)) {
      this.writableChecksumChannelDefaultImpl.close();
      this.writableChecksumChannelDefaultImpl = null;
    } else {

      CommittedTransactionRepresentation _tCommittedTransactionRepresentation =
          catchupOutgoingTransactionPullReply.getTCommittedTransactionRepresentation();
      (new LogEntryWriter(this.writableChecksumChannelDefaultImpl,
          catchupOutgoingTransactionPullReply.getKernelVersion())).serialize(
          _tCommittedTransactionRepresentation);
    }

    if (!this.linkedListCpByteBuf.isEmpty()) {
      this._recpcdsz(_iIm);
    }

    if (this.writableChecksumChannelDefaultImpl != null
        && this.writableChecksumChannelDefaultImpl.curtid() + 4 > this.iCs) {
      this.writableChecksumChannelDefaultImpl.flsWritableChecksumChannel();
    }

    this._wrpncnForChCh(_cChannelHandlerContext, _channelPromise);
  }

  @Override
  public void write(ChannelHandlerContext _cChannelHandlerContext, Object m,
      ChannelPromise _channelPromise) throws Exception {
    if (m instanceof CatchupOutgoingTransactionPullReply) {
      try {
        this._wrtreoeForChCaCh(_cChannelHandlerContext, (CatchupOutgoingTransactionPullReply) m,
            _channelPromise);
      } catch (

          Exception _exception) {

        Exception _exception2 = _exception;
        if (this.linkedListCpByteBuf.isEmpty()) {
          throw _exception;
        }

        ExceptionManager _heExceptionManager = new ExceptionManager(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.cuprot.current.rtx.IncomingTxChannelOutboundHandlerAdapter.heExceptionManager"));

        try {
          _heExceptionManager.addForTh(_exception2);
          this.linkedListCpByteBuf.forEach((byteBuf) ->
          {
            _heExceptionManager.exceForEx(() ->
            {
              ReferenceCountUtil.release(byteBuf);
            });
          });
          this.linkedListCpByteBuf.clear();
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
    } else {
      super.write(_cChannelHandlerContext, m, _channelPromise);
    }
  }
}
