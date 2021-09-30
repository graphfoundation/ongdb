package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.impl.serialize.DatabaseIdOnlySafeChannelMarshal;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DataMarshaller {

  private DataMarshaller() {

    throw new AssertionError("*** Error:  795af546-8e33-40b1-b70a-3dc921745360");
  }


  public static void maslForReBy(RequestData _rtRequestData, WritableChannel _writableChannel)
      throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_rtRequestData.daasidDatabaseId(),
        _writableChannel);
    _writableChannel.putInt(_rtRequestData.getTNme().ordinal());
    BasicStringSerializationHandler.maslForBySt(_rtRequestData.getStrNt(), _writableChannel);
    _writableChannel.putInt(_rtRequestData.getCmadByteArray().length);
    _writableChannel.put(_rtRequestData.getCmadByteArray(),
        _rtRequestData.getCmadByteArray().length);
  }


  public static void maslForReBy(ByteBuf _bfeByteBuf, RequestData btval) {
    _bfeByteBuf.writeInt(btval.getTNme().ordinal());
    BasicStringSerializationHandler.maslForBySt(_bfeByteBuf, btval.getStrNt());
    _bfeByteBuf.writeInt(btval.getCmadByteArray().length);
    _bfeByteBuf.writeBytes(btval.getCmadByteArray());
  }


  public static RequestData unahRequestData(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    ReplicaTokenType tNme = ReplicaTokenType.values()[_readableChannel.getInt()];

    String _strNt = BasicStringSerializationHandler.unahString(_readableChannel);

    int _iLbc = _readableChannel.getInt();

    byte[] _cmadByteArray = new byte[_iLbc];
    _readableChannel.get(_cmadByteArray, _iLbc);
    return new RequestData(_cmadByteArray, _databaseId, _strNt, tNme);
  }


  public static RequestData unahRequestData(ByteBuf _bfeByteBuf, NamedDatabaseId _namedDatabaseId) {

    ReplicaTokenType tNme = ReplicaTokenType.values()[_bfeByteBuf.readInt()];

    String _strTn = BasicStringSerializationHandler.unahString(_bfeByteBuf);

    int _iLbc = _bfeByteBuf.readInt();

    byte[] _cmadByteArray = new byte[_iLbc];
    _bfeByteBuf.readBytes(_cmadByteArray);
    return new RequestData(_cmadByteArray, _namedDatabaseId.databaseId(), _strTn, tNme);
  }
}
