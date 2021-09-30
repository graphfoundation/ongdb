package io.github.onograph.server.rest.cluster;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.time.Duration;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;


@JsonSerialize
public class ClusterGdbStatusMeta {


  private final Collection<String> collectionMvString;


  private final boolean isCi;


  private final boolean isHdi;


  private final boolean isHi;


  private final boolean isIpirg;


  private final long lgIral;


  private final Long lgMllsm;


  private final Double spcrDouble;


  private final String strIm;


  private final String strLae;


  ClusterGdbStatusMeta(Collection<ConsensusNodeId> _collectionMvConsensusNodeId, UUID _imUUID,
      boolean _isCi, boolean _isGripi, boolean _isHdi, boolean _isHi, UUID _laeUUID, long _lgIral,
      Duration _mllsmDuration, Double _spcrDouble) {
    this.lgIral = _lgIral;
    this.isIpirg = _isGripi;
    this.collectionMvString = _collectionMvConsensusNodeId.stream().map((member) ->
    {
      return member.uuid().toString();
    }).sorted().collect(Collectors.toList());
    this.isHi = _isHi;
    this.strIm = _imUUID.toString();
    this.strLae = _laeUUID == null ? null : _laeUUID.toString();
    this.lgMllsm = _mllsmDuration == null ? null : _mllsmDuration.toMillis();
    this.spcrDouble = _spcrDouble;
    this.isCi = _isCi;
    this.isHdi = _isHdi;
  }


  public Collection<String> getCollectionMvString() {
    return this.collectionMvString;
  }


  public boolean getIsCi() {
    return this.isCi;
  }


  public boolean getIsHdi() {
    return this.isHdi;
  }


  public boolean getIsHi() {
    return this.isHi;
  }


  public boolean getIsIpirg() {
    return this.isIpirg;
  }


  public long getLgIral() {
    return this.lgIral;
  }


  public Long getLgMllsm() {
    return this.lgMllsm;
  }


  public Double getSpcrDouble() {
    return this.spcrDouble;
  }


  public String getStrIm() {
    return this.strIm;
  }


  public String getStrLae() {
    return this.strLae;
  }
}
