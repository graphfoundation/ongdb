package io.github.onograph.cluster.raft.akkamsg.serialization;

import io.netty.handler.codec.DecoderException;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.storageengine.api.StoreId;


public final class StoreIdSafeChannelMarshal extends SafeChannelMarshal<StoreId> {


  public static final StoreIdSafeChannelMarshal IT = new StoreIdSafeChannelMarshal();

  private StoreIdSafeChannelMarshal() {
  }

  @Override
  public void marshal(StoreId _storeId, WritableChannel _writableChannel) throws IOException {
    if (_storeId == null) {
      _writableChannel.put((byte) 0);
    } else {
      _writableChannel.put((byte) 1);
      _writableChannel.putLong(_storeId.getCreationTime());
      _writableChannel.putLong(_storeId.getRandomId());
      _writableChannel.putLong(_storeId.getStoreVersion());
      _writableChannel.putLong(_storeId.getUpgradeTime());
      _writableChannel.putLong(_storeId.getUpgradeTxId());
    }
  }

  @Override
  protected StoreId unmarshal0(ReadableChannel _readableChannel) throws IOException {

    byte _eitByte = _readableChannel.get();
    if (_eitByte == 0) {
      return null;
    } else if (_eitByte != 1) {

      throw new DecoderException("*** Error: 8556f68d-dc03-473c-9ed6-513e9b884360");
    } else {

      long _lgCt = _readableChannel.getLong();

      long _lgIr = _readableChannel.getLong();

      long _lgVs = _readableChannel.getLong();

      long _lgTu = _readableChannel.getLong();

      long _lgUi = _readableChannel.getLong();
      return new StoreId(_lgCt, _lgIr, _lgVs, _lgTu, _lgUi);
    }
  }
}
