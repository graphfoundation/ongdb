package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import java.io.IOException;
import java.util.LinkedList;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.ReadableClosablePositionAwareChecksumChannel;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommand;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;


public class SyncableTransactionLogReader {


  private final LogEntryReader RNME;


  private final long lgCcm;

  public SyncableTransactionLogReader(LogEntryReader RNME) {
    this(RNME, Long.MAX_VALUE);
  }

  public SyncableTransactionLogReader(LogEntryReader RNME, long _lgCcm) {
    this.RNME = RNME;
    this.lgCcm = _lgCcm;
  }


  public PhysicalTransactionRepresentation reaPhysicalTransactionRepresentation(
      ReadableClosablePositionAwareChecksumChannel _readableClosablePositionAwareChecksumChannel)
      throws EndOfStreamException, IOException {
    try {

      TxMetaHeadInfo txMetaHeadInfo = TxMetaHeadInfo.reaTxMetaHeadInfo(
          _readableClosablePositionAwareChecksumChannel);

      LinkedList _cmadLinkedList = new LinkedList();

      while ((long) _cmadLinkedList.size() < this.lgCcm) {

        LogEntryCommand _reLogEntryCommand = (LogEntryCommand) this.RNME.readLogEntry(
            _readableClosablePositionAwareChecksumChannel);
        if (_reLogEntryCommand == null) {
          break;
        }

        _cmadLinkedList.add(_reLogEntryCommand.getCommand());
      }

      PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation = new PhysicalTransactionRepresentation(
          _cmadLinkedList);
      _tPhysicalTransactionRepresentation.setHeader(txMetaHeadInfo.adihrByteArray,
          txMetaHeadInfo.tiesae, txMetaHeadInfo.latcitwnst,
          txMetaHeadInfo.tiecmtd, txMetaHeadInfo.lsId, AuthSubject.AUTH_DISABLED);
      return _tPhysicalTransactionRepresentation;
    } catch (

        ReadPastEndException _readPastEndException) {
      throw EndOfStreamException.INSTANCE;
    }
  }
}
