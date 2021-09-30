package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.share.meta.MetaWrapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;


public class SnapshotData {


  private final long befIdx;


  private final long befTLng;


  private final Map<MetaWrapper<?>, Object> mapCsmo = new HashMap();

  public SnapshotData(long befIdx, long befTLng) {
    this.befIdx = befIdx;
    this.befTLng = befTLng;
  }


  public <T> void addForMeT(MetaWrapper<T> tNme, T _tSae) {
    this.mapCsmo.put(tNme, _tSae);
  }


  public long getBefIdx() {
    return this.befIdx;
  }


  public long getBefTLng() {
    return this.befTLng;
  }


  public <T> T getCsmoForMW(MetaWrapper<T> tNme) {
    return (T) this.mapCsmo.get(tNme);
  }


  public int getMapCsmoSize() {
    return this.mapCsmo.size();
  }


  public static class MarshalChannelImplCMS extends SafeChannelMarshal<SnapshotData> {

    @Override
    public void marshal(SnapshotData _csSnapshotData, WritableChannel _writableChannel)
        throws IOException {
      _writableChannel.putLong(_csSnapshotData.befIdx);
      _writableChannel.putLong(_csSnapshotData.befTLng);
      _writableChannel.putInt(_csSnapshotData.getMapCsmoSize());

      Iterator _iterator = _csSnapshotData.mapCsmo.entrySet().iterator();

      while (_iterator.hasNext()) {

        Entry<MetaWrapper<?>, Object> _entryEtymo = (Entry) _iterator.next();

        MetaWrapper tNme = _entryEtymo.getKey();

        Object _obSae = _entryEtymo.getValue();
        _writableChannel.putInt(tNme.tyei());
        tNme.maslSafeStateMarshal().marshal(_obSae, _writableChannel);
      }
    }

    @Override
    public SnapshotData unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {

      long befIdx = _readableChannel.getLong();

      long befTLng = _readableChannel.getLong();

      SnapshotData _scSnapshotData = new SnapshotData(befIdx, befTLng);

      int _iCs = _readableChannel.getInt();

      for (

          int cur = 0; cur < _iCs; ++cur) {

        int _iOt = _readableChannel.getInt();

        MetaWrapper tNme = MetaWrapper.vauList().get(_iOt);

        Object _obSae = tNme.maslSafeStateMarshal().unmarshal(_readableChannel);
        _scSnapshotData.addForMeT(tNme, _obSae);
      }

      return _scSnapshotData;
    }


  }
}
