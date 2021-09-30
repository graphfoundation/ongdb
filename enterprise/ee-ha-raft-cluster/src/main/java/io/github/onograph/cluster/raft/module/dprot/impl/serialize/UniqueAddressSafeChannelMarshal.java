package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.actor.Address;
import akka.cluster.UniqueAddress;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import java.io.IOException;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public final class UniqueAddressSafeChannelMarshal extends SafeChannelMarshal<UniqueAddress> {


  public static UniqueAddressSafeChannelMarshal IT = new UniqueAddressSafeChannelMarshal();

  private UniqueAddressSafeChannelMarshal() {
  }

  @Override
  public void marshal(UniqueAddress _uniqueAddress, WritableChannel _writableChannel)
      throws IOException {

    Address _address = _uniqueAddress.address();
    BasicStringSerializationHandler.maslForBySt(_address.protocol(), _writableChannel);
    BasicStringSerializationHandler.maslForBySt(_address.system(), _writableChannel);
    if (_address.host().isDefined()) {
      BasicStringSerializationHandler.maslForBySt(_address.host().get(), _writableChannel);
    } else {
      BasicStringSerializationHandler.maslForBySt(null, _writableChannel);
    }

    if (_address.port().isDefined()) {
      _writableChannel.putInt((Integer) _address.port().get());
    } else {
      _writableChannel.putInt(-1);
    }

    _writableChannel.putLong(_uniqueAddress.longUid());
  }

  @Override
  protected UniqueAddress unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    String _strPooo = BasicStringSerializationHandler.unahString(_readableChannel);

    String _strSse = BasicStringSerializationHandler.unahString(_readableChannel);

    String hostNameOrIp = BasicStringSerializationHandler.unahString(_readableChannel);

    int portNumber = _readableChannel.getInt();

    long _lgU = _readableChannel.getLong();

    Address _address;
    if (hostNameOrIp != null) {
      _address = new Address(_strPooo, _strSse, hostNameOrIp, portNumber);
    } else {
      _address = new Address(_strPooo, _strSse);
    }

    return new UniqueAddress(_address, _lgU);
  }
}
