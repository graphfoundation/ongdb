package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import io.github.onograph.config.NodeGroupIdentifier;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


abstract class GdbDiscoveryMetaSafeChannelMarshal<T extends GdbDiscoveryMeta> extends
    SafeChannelMarshal<T> {


  static void maadaiForGdWr(GdbDiscoveryMeta _inGdbDiscoveryMeta, WritableChannel _writableChannel)
      throws IOException {

    Set<DatabaseId> _setIdDatabaseId = _inGdbDiscoveryMeta.stedaiSet();
    _writableChannel.putInt(_setIdDatabaseId.size());

    Iterator _iterator = _setIdDatabaseId.iterator();

    while (_iterator.hasNext()) {

      DatabaseId _databaseId = (DatabaseId) _iterator.next();
      DatabaseIdOnlySafeChannelMarshal.IT.marshal(_databaseId, _writableChannel);
    }
  }


  static void maslgosForGdWr(GdbDiscoveryMeta _infGdbDiscoveryMeta,
      WritableChannel _writableChannel)
      throws IOException {

    Set<NodeGroupIdentifier> _setGopNodeGroupIdentifier = _infGdbDiscoveryMeta.gruSet();
    _writableChannel.putInt(_setGopNodeGroupIdentifier.size());

    Iterator _iterator = _setGopNodeGroupIdentifier.iterator();

    while (_iterator.hasNext()) {

      NodeGroupIdentifier grp = (NodeGroupIdentifier) _iterator.next();
      BasicStringSerializationHandler.maslForBySt(grp.getVal(), _writableChannel);
    }
  }


  static Set<DatabaseId> unsdasiSet(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    int sz = _readableChannel.getInt();

    HashSet<DatabaseId> _hashSetIdDatabaseId = new HashSet(sz);

    for (

        int cur = 0; cur < sz; ++cur) {
      _hashSetIdDatabaseId.add(DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel));
    }

    return _hashSetIdDatabaseId;
  }


  static Set<NodeGroupIdentifier> unsgrSet(ReadableChannel _readableChannel) throws IOException {

    int sz = _readableChannel.getInt();

    String[] _strGopArray = new String[sz];

    for (

        int cur = 0; cur < sz; ++cur) {
      _strGopArray[cur] = BasicStringSerializationHandler.unahString(_readableChannel);
    }

    return NodeGroupIdentifier.seoSet(_strGopArray);
  }
}
