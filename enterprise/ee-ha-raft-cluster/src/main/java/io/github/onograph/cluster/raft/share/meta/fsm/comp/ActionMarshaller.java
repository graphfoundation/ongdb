package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import io.github.onograph.cluster.raft.akkamsg.DefaultReadableChecksumChannel;
import io.github.onograph.cluster.raft.akkamsg.WritableChecksumChannelStandardImpl;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommand;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryWriter;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageCommand;


public class ActionMarshaller {


  private static final byte[] NOOAS_BYTE_ARRAY = new byte[0];


  static List<StorageCommand> bytcmList(byte[] _cmadByteArray,
      CommandReaderFactory _commandReaderFactory) {

    ByteBuf _tbByteBuf = Unpooled.wrappedBuffer(_cmadByteArray);

    DefaultReadableChecksumChannel _defaultReadableChecksumChannel = new DefaultReadableChecksumChannel(
        _tbByteBuf);

    LogEntryReader RNME = new VersionAwareLogEntryReader(_commandReaderFactory);

    LinkedList _cmadLinkedList = new LinkedList();

    try {

      LogEntryCommand _reLogEntryCommand;
      while ((_reLogEntryCommand = (LogEntryCommand) RNME.readLogEntry(
          _defaultReadableChecksumChannel)) != null) {
        _cmadLinkedList.add(_reLogEntryCommand.getCommand());
      }

      return _cmadLinkedList;
    } catch (

        IOException _iOException) {

      throw new IllegalStateException("*** Error:  ffef1321-cf90-4d36-a756-09b2782e6479");
    }
  }


  public static byte[] contbForLi(List<StorageCommand> _listCmadStorageCommand) {
    if (_listCmadStorageCommand.isEmpty()) {
      return NOOAS_BYTE_ARRAY;
    } else {

      ByteBuf _bcByteBuf = Unpooled.buffer();

      WritableChecksumChannelStandardImpl _writableChecksumChannelStandardImpl = new WritableChecksumChannelStandardImpl(
          _bcByteBuf);

      try {

        LogEntryWriter<WritableChecksumChannelStandardImpl> _logEntryWriterWieWritableChecksumChannelStandardImpl =
            new LogEntryWriter(_writableChecksumChannelStandardImpl,
                _listCmadStorageCommand.get(0).version());
        _logEntryWriterWieWritableChecksumChannelStandardImpl.serialize(_listCmadStorageCommand);
      } catch (

          IOException _iOException) {

        throw new IllegalStateException("*** Error:  e995c348-893c-4aa6-9bed-21d18e34cdf4");
      }

      byte[] _cmadsByteArray = Arrays.copyOf(_bcByteBuf.array(), _bcByteBuf.writerIndex());
      _bcByteBuf.release();
      return _cmadsByteArray;
    }
  }
}
