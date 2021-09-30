package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.serialization.DataManagerFactory;
import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMessageToMessageDecoder;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommand;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.storageengine.api.StorageCommand;


public class SyncableDataMessageToMessageDecoderImpl implements
    SyncableDataMessageToMessageDecoder {


  private final LogEntryReader RNME;


  private final List<StorageCommand> listCmadStorageCommand;


  private DatabaseId databaseId;


  private TxMetaHeadInfo hdrByte;


  private int iTrb;


  private StatusType statusType;

  public SyncableDataMessageToMessageDecoderImpl(LogEntryReader RNME) {
    this.statusType = StatusType.ST_PROC_HEADER_D;
    this.listCmadStorageCommand = new ArrayList();
    this.RNME = RNME;
  }


  private void _reaForDeMuEntr(DefaultReadableChecksumChannel _defaultReadableChecksumChannel,
      MutableInt _irvMutableInt)
      throws IOException, EndOfStreamException {
    switch (this.statusType) {
      case ST_PROC_HEADER_D:
        this.databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(
            _defaultReadableChecksumChannel);
        this.hdrByte = TxMetaHeadInfo.reaTxMetaHeadInfo(_defaultReadableChecksumChannel);
        _irvMutableInt.setValue(_defaultReadableChecksumChannel.redbt());
        this.statusType = StatusType.ST_PROC_COMMANDS;
      case ST_PROC_COMMANDS:
        this._redcmnForDeMu(_irvMutableInt, _defaultReadableChecksumChannel);
        return;
      default:
        throw new IllegalStateException();
    }
  }


  private void _redcmnForDeMu(MutableInt _cbMutableInt,
      DefaultReadableChecksumChannel _defaultReadableChecksumChannel) throws IOException {

    LogEntryCommand _reLogEntryCommand;
    while ((_reLogEntryCommand = (LogEntryCommand) this.RNME.readLogEntry(
        _defaultReadableChecksumChannel)) != null) {
      this.listCmadStorageCommand.add(_reLogEntryCommand.getCommand());
      _cbMutableInt.setValue(_defaultReadableChecksumChannel.redbt());
    }
  }

  @Override
  public void coseForDe(DefaultReadableChecksumChannel _defaultReadableChecksumChannel)
      throws IOException {

    int _iIrs = _defaultReadableChecksumChannel.redbt();

    MutableInt _irvMutableInt = new MutableInt(_iIrs);

    try {
      this._reaForDeMuEntr(_defaultReadableChecksumChannel, _irvMutableInt);
      this.iTrb += _irvMutableInt.getValue() - _iIrs;
    } catch (

        EndOfStreamException | ReadPastEndException _exception) {
    }

    _defaultReadableChecksumChannel.serdbt(_irvMutableInt.getValue());
  }

  @Override
  public DataManagerFactory<SyncableData> cracttDataManagerFactory() {
    if (this.statusType != StatusType.ST_PROC_COMMANDS) {

      throw new IllegalStateException("*** Error:  13bbb721-a664-43f3-b39f-8fe832364154");
    } else {
      return DataManagerFactory.fiieDataManagerFactory(new AbstractTransactionSync(
          new PhysicalTransactionRepresentation(this.listCmadStorageCommand,
              this.hdrByte.adihrByteArray, this.hdrByte.tiesae,
              this.hdrByte.latcitwnst, this.hdrByte.tiecmtd, this.hdrByte.lsId,
              AuthSubject.AUTH_DISABLED), this.databaseId, this.iTrb));
    }
  }


  enum StatusType {


    ST_PROC_HEADER_D,

    ST_PROC_COMMANDS
  }
}
