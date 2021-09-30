package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import java.io.IOException;
import java.util.Iterator;
import org.neo4j.function.ThrowingConsumer;
import org.neo4j.io.fs.WritableChecksumChannel;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryWriter;
import org.neo4j.storageengine.api.StorageCommand;


class SyncableTransactionLogWriter {


  private final Iterator<StorageCommand> iteratorCmadStorageCommand;


  private final KernelVersion kernelVersion;


  private ThrowingConsumer<WritableChecksumChannel, IOException> throwingConsumerJnwi;

  SyncableTransactionLogWriter(TransactionRepresentation _tTransactionRepresentation) {
    this.throwingConsumerJnwi = (channel) ->
    {
      TxMetaHeadInfo.wrtForTxWr(this._getatheTxMetaHeadInfo(_tTransactionRepresentation), channel);
    };
    this.iteratorCmadStorageCommand = _tTransactionRepresentation.iterator();
    this.kernelVersion = _tTransactionRepresentation.version();
  }


  private TxMetaHeadInfo _getatheTxMetaHeadInfo(
      TransactionRepresentation _trTransactionRepresentation) {

    byte[] _haByteArray = _trTransactionRepresentation.additionalHeader();

    int _iHl = _haByteArray == null ? 0 : _haByteArray.length;
    return new TxMetaHeadInfo(_haByteArray, _iHl,
        _trTransactionRepresentation.getTimeCommitted(),
        _trTransactionRepresentation.getTimeStarted(),
        _trTransactionRepresentation.getLatestCommittedTxWhenStarted(),
        _trTransactionRepresentation.getLeaseId());
  }


  boolean isCawt() {
    return this.throwingConsumerJnwi != null;
  }


  void wrtForWr(WritableChecksumChannel _writableChecksumChannel) throws IOException {
    this.throwingConsumerJnwi.accept(_writableChecksumChannel);
    if (this.iteratorCmadStorageCommand.hasNext()) {

      StorageCommand _storageCommand = this.iteratorCmadStorageCommand.next();
      this.throwingConsumerJnwi = (c) ->
      {
        (new LogEntryWriter(c, this.kernelVersion)).serialize(_storageCommand);
      };
    } else {
      this.throwingConsumerJnwi = null;
    }
  }
}
