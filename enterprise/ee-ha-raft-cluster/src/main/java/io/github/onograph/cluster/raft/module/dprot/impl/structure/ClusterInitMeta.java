package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import akka.cluster.UniqueAddress;
import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.neo4j.kernel.database.NamedDatabaseId;


public class ClusterInitMeta {


  public static final ClusterInitMeta EMT_CLUSTER_INIT_META;

  static {
    EMT_CLUSTER_INIT_META = new ClusterInitMeta(Map.of(), StructureInfo.EMT_STRUCTURE_INFO, null,
        ViewClusterInfo.EMT_VIEW_CLUSTER_INFO);
  }


  private final UniqueAddress asUniqueAddress;


  private final StructureInfo dmStructureInfo;


  private final Map<ConsensusMemberGroupId, ConsensusNodeId> mapBpcc;


  private final ViewClusterInfo vcViewClusterInfo;


  ClusterInitMeta(Map<ConsensusMemberGroupId, ConsensusNodeId> _mapBpcc,
      StructureInfo _mdStructureInfo, UniqueAddress _saUniqueAddress,
      ViewClusterInfo _vcViewClusterInfo) {
    this.vcViewClusterInfo = Objects.requireNonNull(_vcViewClusterInfo);
    this.dmStructureInfo = Objects.requireNonNull(_mdStructureInfo);
    this.asUniqueAddress = _saUniqueAddress;
    this.mapBpcc = _mapBpcc;
  }


  private static boolean _isPelleForGdNa(
      GdbDiscoveryMetaCoreWrapper _mfiGdbDiscoveryMetaCoreWrapper,
      NamedDatabaseId _namedDatabaseId) {

    GdbDiscoveryMetaCoreImpl _iGdbDiscoveryMetaCoreImpl = _mfiGdbDiscoveryMetaCoreWrapper.getIscGdbDiscoveryMetaCoreImpl();
    return _iGdbDiscoveryMetaCoreImpl.stedaiSet().contains(_namedDatabaseId.databaseId());
  }


  private boolean _isIafrptaldForNa(NamedDatabaseId _namedDatabaseId) {

    Optional<UniqueAddress> _optionalLpfUniqueAddress = this.vcViewClusterInfo.avamesStream()
        .filter((member) ->
        {
          return this._isPelleForGdNa(member,
              _namedDatabaseId);
        }).findFirst();
    return _optionalLpfUniqueAddress.map((address) ->
    {
      return Objects.equals(address, this.asUniqueAddress);
    }).orElse(false);
  }


  private boolean _isPelleForGdNa(UniqueAddress _mmeUniqueAddress,
      NamedDatabaseId _namedDatabaseId) {
    return this.dmStructureInfo.geoOptional(_mmeUniqueAddress).map((metadata) ->
    {
      return _isPelleForGdNa(metadata, _namedDatabaseId);
    }).orElse(false);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ClusterInitMeta _thClusterInitMeta = (ClusterInitMeta) obj;
      return Objects.equals(this.vcViewClusterInfo, _thClusterInitMeta.vcViewClusterInfo) &&
          Objects.equals(this.dmStructureInfo, _thClusterInitMeta.dmStructureInfo) &&
          Objects.equals(this.asUniqueAddress, _thClusterInitMeta.asUniqueAddress)
          && Objects.equals(this.mapBpcc, _thClusterInitMeta.mapBpcc);
    } else {
      return false;
    }
  }


  public Optional<ConsensusNodeId> geboaOptional(NamedDatabaseId _namedDatabaseId) {

    ConsensusMemberGroupId _rfiConsensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
        _namedDatabaseId.databaseId());

    ConsensusNodeId _bosrpConsensusNodeId = this.mapBpcc.get(_rfiConsensusMemberGroupId);
    return Optional.ofNullable(_bosrpConsensusNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.vcViewClusterInfo, this.dmStructureInfo, this.asUniqueAddress,
        this.mapBpcc);
  }


  public boolean isCaboartForNa(NamedDatabaseId _namedDatabaseId) {

    boolean _isChc = this.vcViewClusterInfo.getIsCnegd();

    boolean _isLpfai = this._isIafrptaldForNa(_namedDatabaseId);
    return _isChc && _isLpfai;
  }


  public boolean isMerbsprfForNaCo(ConsensusNodeId consensusNodeId,
      NamedDatabaseId _namedDatabaseId) {

    ConsensusMemberGroupId _rfiConsensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
        _namedDatabaseId.databaseId());

    ConsensusNodeId _bosrpConsensusNodeId = this.mapBpcc.get(_rfiConsensusMemberGroupId);
    return Objects.equals(consensusNodeId, _bosrpConsensusNodeId);
  }


}
