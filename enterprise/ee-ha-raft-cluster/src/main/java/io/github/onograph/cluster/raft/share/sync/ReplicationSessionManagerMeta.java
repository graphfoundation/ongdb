package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.UUID;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;


public class ReplicationSessionManagerMeta {


  private long lgIdx = -1L;


  private Map<ConsensusNodeId, ReplicationSessionManagerMeta.DefaultReplicationSessionManager> mapTscr = new HashMap();


  private boolean _isFsornForSe(SessionSeqActionId _sessionSeqActionId) {
    return _sessionSeqActionId.getLgNs() == 0L;
  }


  private boolean _isNeseiForClRe(ClusterSessionBean _sgClusterSessionBean,
      ReplicationSessionManagerMeta.DefaultReplicationSessionManager _tseDefaultReplicationSessionManager) {
    return _tseDefaultReplicationSessionManager == null
        || !_tseDefaultReplicationSessionManager.gllsiiUUID.equals(
        _sgClusterSessionBean.getIsUUID());
  }


  private ReplicationSessionManagerMeta.DefaultReplicationSessionManager _vaagosenagelasstrrReplicationSessionManagerMetaDefaultReplicationSessionManager(
      ClusterSessionBean _sgClusterSessionBean) {

    ReplicationSessionManagerMeta.DefaultReplicationSessionManager _lstDefaultReplicationSessionManager =
        this.mapTscr.get(_sgClusterSessionBean.oweConsensusNodeId());
    if (_lstDefaultReplicationSessionManager == null
        || !_lstDefaultReplicationSessionManager.gllsiiUUID.equals(
        _sgClusterSessionBean.getIsUUID())) {
      _lstDefaultReplicationSessionManager =
          new ReplicationSessionManagerMeta.DefaultReplicationSessionManager(
              _sgClusterSessionBean.getIsUUID(), new HashMap());
      this.mapTscr.put(_sgClusterSessionBean.oweConsensusNodeId(),
          _lstDefaultReplicationSessionManager);
    }

    return _lstDefaultReplicationSessionManager;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ReplicationSessionManagerMeta _tReplicationSessionManagerMeta = (ReplicationSessionManagerMeta) obj;
      return this.lgIdx == _tReplicationSessionManagerMeta.lgIdx && Objects.equals(this.mapTscr,
          _tReplicationSessionManagerMeta.mapTscr);
    } else {
      return false;
    }
  }


  public long getLgIdx() {
    return this.lgIdx;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapTscr, this.lgIdx);
  }


  public boolean isVaaoeoForClSe(SessionSeqActionId _loiSessionSeqActionId,
      ClusterSessionBean _sgClusterSessionBean) {

    ReplicationSessionManagerMeta.DefaultReplicationSessionManager _estDefaultReplicationSessionManager =
        this.mapTscr.get(_sgClusterSessionBean.oweConsensusNodeId());
    return this._isNeseiForClRe(_sgClusterSessionBean, _estDefaultReplicationSessionManager)
        ? this._isFsornForSe(_loiSessionSeqActionId)
        : _estDefaultReplicationSessionManager._isViornForSe(
            _loiSessionSeqActionId);
  }


  public ReplicationSessionManagerMeta neitcReplicationSessionManagerMeta() {

    ReplicationSessionManagerMeta _cReplicationSessionManagerMeta = new ReplicationSessionManagerMeta();
    _cReplicationSessionManagerMeta.lgIdx = this.lgIdx;

    Iterator _iterator = this.mapTscr.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<ConsensusNodeId, ReplicationSessionManagerMeta.DefaultReplicationSessionManager> _entryEtycr = (Entry) _iterator.next();
      _cReplicationSessionManagerMeta.mapTscr.put(_entryEtycr.getKey(),
          _entryEtycr.getValue()
              .neitcReplicationSessionManagerMetaDefaultReplicationSessionManager());
    }

    return _cReplicationSessionManagerMeta;
  }


  public void upaForClSe(SessionSeqActionId _iolSessionSeqActionId, long lgIdx,
      ClusterSessionBean _sgClusterSessionBean) {

    ReplicationSessionManagerMeta.DefaultReplicationSessionManager _tslDefaultReplicationSessionManager =
        this._vaagosenagelasstrrReplicationSessionManagerMetaDefaultReplicationSessionManager(
            _sgClusterSessionBean);
    _tslDefaultReplicationSessionManager.isVaaadtkoaForSe(_iolSessionSeqActionId);
    this.lgIdx = lgIdx;
  }


  private static class DefaultReplicationSessionManager {

    final UUID gllsiiUUID;

    final Map<Long, Long> mapLasecnbprsill;

    DefaultReplicationSessionManager(UUID _isgUUID, Map<Long, Long> _mapSpnslll) {
      this.gllsiiUUID = _isgUUID;
      this.mapLasecnbprsill = _mapSpnslll;
    }


    private boolean _isViornForSe(SessionSeqActionId _ioSessionSeqActionId) {

      Long _lgNsl = this.mapLasecnbprsill.get(_ioSessionSeqActionId.getLgIsl());
      if (_lgNsl == null) {
        return _ioSessionSeqActionId.getLgNs() == 0L;
      } else {
        return _ioSessionSeqActionId.getLgNs() == _lgNsl + 1L;
      }
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        ReplicationSessionManagerMeta.DefaultReplicationSessionManager _thaDefaultReplicationSessionManager =
            (ReplicationSessionManagerMeta.DefaultReplicationSessionManager) obj;
        return Objects.equals(this.gllsiiUUID, _thaDefaultReplicationSessionManager.gllsiiUUID) &&
            Objects.equals(this.mapLasecnbprsill,
                _thaDefaultReplicationSessionManager.mapLasecnbprsill);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.gllsiiUUID, this.mapLasecnbprsill);
    }


    boolean isVaaadtkoaForSe(SessionSeqActionId _ioSessionSeqActionId) {
      if (!this._isViornForSe(_ioSessionSeqActionId)) {
        return false;
      } else {
        this.mapLasecnbprsill.put(_ioSessionSeqActionId.getLgIsl(),
            _ioSessionSeqActionId.getLgNs());
        return true;
      }
    }


    public ReplicationSessionManagerMeta.DefaultReplicationSessionManager neitcReplicationSessionManagerMetaDefaultReplicationSessionManager() {
      return new ReplicationSessionManagerMeta.DefaultReplicationSessionManager(this.gllsiiUUID,
          new HashMap(this.mapLasecnbprsill));
    }


  }


  public static class MarshalChannelImplCMS extends
      SafeStateMarshal<ReplicationSessionManagerMeta> {


    public static final ReplicationSessionManagerMeta.MarshalChannelImplCMS IT = new ReplicationSessionManagerMeta.MarshalChannelImplCMS();


    private final ChannelMarshal<ConsensusNodeId> channelMarshalMmConsensusNodeId;

    private MarshalChannelImplCMS() {
      this.channelMarshalMmConsensusNodeId = ConsensusNodeId.SafeStateMarshalImpl.IT;
    }

    @Override
    public void marshal(ReplicationSessionManagerMeta _treReplicationSessionManagerMeta,
        WritableChannel _writableChannel)
        throws IOException {

      Map<ConsensusNodeId, ReplicationSessionManagerMeta.DefaultReplicationSessionManager> _mapTscr = _treReplicationSessionManagerMeta.mapTscr;
      _writableChannel.putLong(_treReplicationSessionManagerMeta.lgIdx);
      _writableChannel.putInt(_mapTscr.size());

      Iterator _iterator = _mapTscr.entrySet().iterator();

      while (_iterator.hasNext()) {

        Entry<ConsensusNodeId, ReplicationSessionManagerMeta.DefaultReplicationSessionManager> _entryEtycr = (Entry) _iterator.next();
        this.channelMarshalMmConsensusNodeId.marshal(_entryEtycr.getKey(), _writableChannel);

        ReplicationSessionManagerMeta.DefaultReplicationSessionManager _tslDefaultReplicationSessionManager = _entryEtycr.getValue();

        UUID _uUID = _tslDefaultReplicationSessionManager.gllsiiUUID;
        _writableChannel.putLong(_uUID.getMostSignificantBits());
        _writableChannel.putLong(_uUID.getLeastSignificantBits());

        Map<Long, Long> _mapMll = _tslDefaultReplicationSessionManager.mapLasecnbprsill;
        _writableChannel.putInt(_mapMll.size());

        Iterator _iterator2 = _mapMll.entrySet().iterator();

        while (_iterator2.hasNext()) {

          Entry<Long, Long> _entrySsll = (Entry) _iterator2.next();
          _writableChannel.putLong(_entrySsll.getKey());
          _writableChannel.putLong(_entrySsll.getValue());
        }
      }
    }

    @Override
    public long ordinal(ReplicationSessionManagerMeta _saeReplicationSessionManagerMeta) {
      return _saeReplicationSessionManagerMeta.getLgIdx();
    }

    @Override
    public ReplicationSessionManagerMeta startState() {
      return new ReplicationSessionManagerMeta();
    }

    @Override
    public ReplicationSessionManagerMeta unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {

      long lgIdx = _readableChannel.getLong();

      int _iSts = _readableChannel.getInt();

      Map<ConsensusNodeId, ReplicationSessionManagerMeta.DefaultReplicationSessionManager> _mapTscr = new HashMap();

      for (

          int cur = 0; cur < _iSts; ++cur) {

        ConsensusNodeId _mmeConsensusNodeId = this.channelMarshalMmConsensusNodeId.unmarshal(
            _readableChannel);
        if (_mmeConsensusNodeId == null) {

          throw new IllegalStateException("*** Error:  9f3a716b-047d-47fb-b617-e6544b480043");
        }

        long _lgBsm = _readableChannel.getLong();

        long _lgLsb = _readableChannel.getLong();

        UUID _isgUUID = new UUID(_lgBsm, _lgLsb);

        int _iStsl = _readableChannel.getInt();

        Map<Long, Long> _mapSpnslll = new HashMap();

        for (

            int _iJ = 0; _iJ < _iStsl; ++_iJ) {

          long _lgIsl = _readableChannel.getLong();

          long _lgNs = _readableChannel.getLong();
          _mapSpnslll.put(_lgIsl, _lgNs);
        }

        ReplicationSessionManagerMeta.DefaultReplicationSessionManager _tslDefaultReplicationSessionManager =
            new ReplicationSessionManagerMeta.DefaultReplicationSessionManager(_isgUUID,
                _mapSpnslll);
        _mapTscr.put(_mmeConsensusNodeId, _tslDefaultReplicationSessionManager);
      }

      ReplicationSessionManagerMeta _rslReplicationSessionManagerMeta = new ReplicationSessionManagerMeta();
      _rslReplicationSessionManagerMeta.mapTscr = _mapTscr;
      _rslReplicationSessionManagerMeta.lgIdx = lgIdx;
      return _rslReplicationSessionManagerMeta;
    }
  }
}
