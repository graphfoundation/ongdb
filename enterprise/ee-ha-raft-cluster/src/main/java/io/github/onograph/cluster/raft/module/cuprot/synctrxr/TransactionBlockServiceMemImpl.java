package io.github.onograph.cluster.raft.module.cuprot.synctrxr;

import io.github.onograph.cluster.raft.module.cuprot.AnswerMessageType;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.stream.ChunkedInput;
import java.util.LinkedList;
import java.util.Queue;
import org.neo4j.cursor.IOCursor;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.logging.Log;
import org.neo4j.storageengine.api.StoreId;


public class TransactionBlockServiceMemImpl implements TransactionBlockService,
    ChunkedInput<Object> {


  private final TransactionBlockLimiters cntanTransactionBlockLimiters;


  private final TransactionSyncEnvironment cptTransactionSyncEnvironment;


  private final IOCursor<CommittedTransactionRepresentation> iOCursorCtCommittedTransactionRepresentation;


  private final KernelVersion kernelVersion;


  private final long lgPit;


  private final Log log;


  private final ServerRef poooServerRef;


  private final Queue<Object> queuePnigObject = new LinkedList();


  private final StoreId storeId;


  private boolean isIoe;


  private boolean isNmt;


  private long lgEti;


  private long lgItl;


  TransactionBlockServiceMemImpl(Log _log, ServerRef _poooServerRef,
      TransactionSyncEnvironment _tpcTransactionSyncEnvironment) {
    this.log = _log;
    this.storeId = _tpcTransactionSyncEnvironment.getLclStoreId();
    this.lgEti = _tpcTransactionSyncEnvironment.getLgItf();
    this.lgPit = _tpcTransactionSyncEnvironment.getLgPit();
    this.iOCursorCtCommittedTransactionRepresentation = _tpcTransactionSyncEnvironment.getTasciTransactionCursor();
    this.cntanTransactionBlockLimiters = _tpcTransactionSyncEnvironment.getCntanTransactionBlockLimiters();
    this.kernelVersion = _tpcTransactionSyncEnvironment.getKernelVersion();
    this.cptTransactionSyncEnvironment = _tpcTransactionSyncEnvironment;
    this.poooServerRef = _poooServerRef;
  }


  private void _adcsForCa(CatchupStatusType _rslCatchupStatusType) {
    this.isNmt = true;
    this.poooServerRef.exeForE(
        io.github.onograph.cluster.raft.module.cuprot.ServerRef.CatchupManagerStatusType.STAT_MSG_TYPE);
    this.queuePnigObject.add(AnswerMessageType.AMT_TRX_IS_COMPLETE);
    this.queuePnigObject.add(new TransactionChunkingCompleted(this.lgItl, _rslCatchupStatusType));
  }


  private void _adeocleForEx(Exception _exception) {
    this._adcsForCa(CatchupStatusType.CST_ERR);
    this.queuePnigObject.add(_exception);
  }


  private void _adppcs() {
    if (this.lgItl != 0L) {
      this.queuePnigObject.add(
          CatchupOutgoingTransactionPullReply.EMT_CATCHUP_OUTGOING_TRANSACTION_PULL_REPLY);
    }

    CatchupStatusType _rslCatchupStatusType;
    if (this.lgItl >= this.lgPit) {
      _rslCatchupStatusType = CatchupStatusType.CST_OK_STREAM_COMPLETE;
    } else {
      _rslCatchupStatusType = CatchupStatusType.CST_TRX_PRN_ERR;


    }

    this._adcsForCa(_rslCatchupStatusType);
  }


  private void _adtForCo(CommittedTransactionRepresentation _tCommittedTransactionRepresentation) {

    boolean _isFi = this.lgItl == 0L;
    this.lgItl = _tCommittedTransactionRepresentation.getCommitEntry().getTxId();
    if (this.lgItl != this.lgEti) {

      this._adeocleForEx(
          new IllegalStateException("*** Error: 49c22fa4-de8b-4b1b-a67e-6dcefede100d"));
    } else {
      ++this.lgEti;
      if (_isFi) {
        this.queuePnigObject.add(AnswerMessageType.AMT_TRX);
      }

      KernelVersion _vtKernelVersion = _tCommittedTransactionRepresentation.getTransactionRepresentation()
          .version();

      KernelVersion _kernelVersion =
          _vtKernelVersion == null ? this.kernelVersion : _vtKernelVersion;
      this.queuePnigObject.add(new CatchupOutgoingTransactionPullReply(_kernelVersion, this.storeId,
          _tCommittedTransactionRepresentation));
    }
  }


  private boolean _isAdntt() {
    if (this.cntanTransactionBlockLimiters.isCole(this.lgItl)) {
      return false;
    } else if (this._isNotnitop()) {
      return false;
    } else {

      CommittedTransactionRepresentation _tCommittedTransactionRepresentation;
      try {
        if (!this.iOCursorCtCommittedTransactionRepresentation.next()) {
          return false;
        }

        _tCommittedTransactionRepresentation = this.iOCursorCtCommittedTransactionRepresentation.get();
      } catch (

          Exception _exception) {
        this._adeocleForEx(_exception);
        return true;
      }

      this._adtForCo(_tCommittedTransactionRepresentation);
      return true;
    }
  }


  private boolean _isNotnitop() {
    return this.cptTransactionSyncEnvironment.lacottatid() <= this.lgItl;
  }


  private Object _sedpnnObject() throws Exception {

    Object _obPp = this.queuePnigObject.poll();
    if (this.queuePnigObject.isEmpty() && this.isNmt) {
      this.isIoe = true;
    }

    if (_obPp instanceof Exception) {
      throw (Exception) _obPp;
    } else {
      return _obPp;
    }
  }

  @Override
  public void close() throws Exception {
    this.iOCursorCtCommittedTransactionRepresentation.close();
  }


  protected TransactionSyncEnvironment getCptTransactionSyncEnvironment() {
    return this.cptTransactionSyncEnvironment;
  }

  @Override
  public long getEndingTransactionId() {
    return this.lgItl;
  }

  @Override
  public long getStartingTransactionId() {
    return this.cptTransactionSyncEnvironment.getLgItf();
  }

  @Override
  public boolean isEndOfInput() {
    return this.isIoe;
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
  public Object readChunk(ChannelHandlerContext _cChannelHandlerContext) throws Exception {
    return this.readChunk(_cChannelHandlerContext.alloc());
  }

  @Override
  public Object readChunk(ByteBufAllocator _byteBufAllocator) throws Exception {
    assert !this.isIoe;

    if (!this.queuePnigObject.isEmpty()) {
      return this._sedpnnObject();
    } else {
      if (!this._isAdntt()) {
        this._adppcs();
      }

      return this._sedpnnObject();
    }
  }
}
