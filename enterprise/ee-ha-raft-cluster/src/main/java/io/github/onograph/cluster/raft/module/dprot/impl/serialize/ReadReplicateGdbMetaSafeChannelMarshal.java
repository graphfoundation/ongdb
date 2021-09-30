package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.ReadReplicateGdbMeta;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.dbms.identity.ServerId.Marshal;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class ReadReplicateGdbMetaSafeChannelMarshal extends
    SafeChannelMarshal<ReadReplicateGdbMeta> {


  public static final ReadReplicateGdbMetaSafeChannelMarshal IT = new ReadReplicateGdbMetaSafeChannelMarshal();

  private ReadReplicateGdbMetaSafeChannelMarshal() {
  }

  @Override
  public void marshal(ReadReplicateGdbMeta _sdcReadReplicateGdbMeta,
      WritableChannel _writableChannel) throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_sdcReadReplicateGdbMeta.getDatabaseId(),
        _writableChannel);
    BasicBoolSerializationHandler.maslForWr(_sdcReadReplicateGdbMeta.getIsSc(), _writableChannel);

    Map<ServerId, DiscoveryGdbOperatorMetaWrapper> _mapMssd = Map.copyOf(
        _sdcReadReplicateGdbMeta.getMapMssd());
    _writableChannel.putInt(_mapMssd.size());

    Iterator _iterator = _mapMssd.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<ServerId, DiscoveryGdbOperatorMetaWrapper> _entryEtysd = (Entry) _iterator.next();

      ServerId _serverId = _entryEtysd.getKey();

      DiscoveryGdbOperatorMetaWrapper _sdDiscoveryGdbOperatorMetaWrapper = _entryEtysd.getValue();
      Marshal.INSTANCE.marshal(_serverId, _writableChannel);
      DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal.IT.marshal(
          _sdDiscoveryGdbOperatorMetaWrapper, _writableChannel);
    }
  }

  @Override
  protected ReadReplicateGdbMeta unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    boolean _isMcc = BasicBoolSerializationHandler.isUnahForRe(_readableChannel);

    int _iCm = _readableChannel.getInt();

    HashMap<ServerId, DiscoveryGdbOperatorMetaWrapper> _hashMapSmsd = new HashMap();

    for (

        int cur = 0; cur < _iCm; ++cur) {

      ServerId _imServerId = Marshal.INSTANCE.unmarshal(_readableChannel);

      DiscoveryGdbOperatorMetaWrapper _sdDiscoveryGdbOperatorMetaWrapper =
          DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal.IT.unmarshal(_readableChannel);
      _hashMapSmsd.put(_imServerId, _sdDiscoveryGdbOperatorMetaWrapper);
    }

    return _isMcc ? ReadReplicateGdbMeta.ofcosReadReplicateGdbMeta(_databaseId, _hashMapSmsd)
        : ReadReplicateGdbMeta.ofrerlaReadReplicateGdbMeta(_databaseId, _hashMapSmsd);
  }
}
