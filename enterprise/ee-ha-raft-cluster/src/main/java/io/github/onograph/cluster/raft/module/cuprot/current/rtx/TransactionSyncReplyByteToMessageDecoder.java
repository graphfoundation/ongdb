package io.github.onograph.cluster.raft.module.cuprot.current.rtx;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.ReadablePositionAwareChecksumChannelManager;
import io.github.onograph.cluster.raft.akkamsg.serialization.StoreIdSafeChannelMarshal;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.AttributeKey;
import java.util.List;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionCursor;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StoreId;


public class TransactionSyncReplyByteToMessageDecoder extends ByteToMessageDecoder {


  public static final AttributeKey<CommandReaderFactory> CONCMD_RDXR_GENR_ATR =
      AttributeKey.valueOf(io.github.onograph.TokenConstants.COMMAND_READER_FACTORY);


  private final ReadablePositionAwareChecksumChannelManager cdReadablePositionAwareChecksumChannelManager = new ReadablePositionAwareChecksumChannelManager();


  private io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder.TransactionMetaWrapper
      itnTransactionMetaWrapper;


  private PhysicalTransactionCursor physicalTransactionCursor;


  private StoreId storeId;

  public TransactionSyncReplyByteToMessageDecoder() {
    this.setCumulator(COMPOSITE_CUMULATOR);
  }


  private boolean _isFitcu() {
    return this.physicalTransactionCursor == null;
  }

  @Override
  protected void decode(ChannelHandlerContext _cChannelHandlerContext, ByteBuf _iByteBuf,
      List<Object> _listOObject) throws Exception {

    CommandReaderFactory _commandReaderFactory = _cChannelHandlerContext.channel()
        .attr(CONCMD_RDXR_GENR_ATR).get();
    this.cdReadablePositionAwareChecksumChannelManager.deettoForRe(
        new DefaultReadableChecksumChannel(_iByteBuf));
    if (this._isFitcu()) {
      if (_commandReaderFactory == null) {

        throw new IllegalStateException("*** Error:  63fdb0b5-219a-4490-bc85-b599cca54aef");
      }

      this.storeId = StoreIdSafeChannelMarshal.IT.unmarshal(
          this.cdReadablePositionAwareChecksumChannelManager);
      this.physicalTransactionCursor = new PhysicalTransactionCursor(
          this.cdReadablePositionAwareChecksumChannelManager,
          new VersionAwareLogEntryReader(_commandReaderFactory));
      this.itnTransactionMetaWrapper =
          new io.github.onograph.cluster.raft.module.cuprot.current.rtx.TransactionSyncReplyByteToMessageDecoder.TransactionMetaWrapper();
    }

    while (this.itnTransactionMetaWrapper.isCardnxtxForBy(_iByteBuf)) {

      int _iIst = _iByteBuf.readerIndex();
      this.physicalTransactionCursor.next();

      int _iSt = _iByteBuf.readerIndex() - _iIst;

      CommittedTransactionRepresentation _tCommittedTransactionRepresentation = this.physicalTransactionCursor.get();
      _listOObject.add(new CatchupIncomingTransactionReply(_iSt, this.storeId,
          _tCommittedTransactionRepresentation));
      this.itnTransactionMetaWrapper.upaForBy(_iByteBuf);
    }

    if (this.itnTransactionMetaWrapper.isNomot()) {
      this.physicalTransactionCursor.close();
      this.physicalTransactionCursor = null;
      this.itnTransactionMetaWrapper = null;
      _listOObject.add(CatchupIncomingTransactionReply.EMT_CATCHUP_INCOMING_TRANSACTION_REPLY);
    }
  }


  private static class TransactionMetaWrapper {


    private int iSn;


    private boolean isUkon = true;


    boolean isCardnxtxForBy(ByteBuf _byteBuf) {
      if (this.isUkon) {
        this.upaForBy(_byteBuf);
      }

      return !this.isUkon && this.iSn < _byteBuf.readableBytes();
    }


    boolean isNomot() {
      return !this.isUkon && this.iSn == 0;
    }


    void upaForBy(ByteBuf _byteBuf) {
      this.isUkon = !_byteBuf.isReadable();
      this.iSn = this.isUkon ? 0 : _byteBuf.readInt();
    }
  }
}
