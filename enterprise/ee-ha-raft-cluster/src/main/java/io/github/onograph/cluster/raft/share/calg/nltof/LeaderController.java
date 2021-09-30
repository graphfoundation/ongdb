package io.github.onograph.cluster.raft.share.calg.nltof;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.id.CoreNodeServerIdentity;
import io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta;
import io.github.onograph.config.NodeGroupIdentifier;
import java.time.Clock;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


class LeaderController {


  private final Clock clock;


  private final CoreNodeServerIdentity imCoreNodeServerIdentity;


  private final io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>>
      incomingMessageProcessorHmArrivingMessageManager;


  private final ServerStatTags pdServerStatTags;


  private final NodeMemberFinder rmNodeMemberFinder;


  LeaderController(Clock _clock, CoreNodeServerIdentity _imCoreNodeServerIdentity,
      io.github.onograph.cluster.raft.akkamsg.InDirection.IncomingMessageProcessor<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<?>> _incomingMessageProcessorHmArrivingMessageManager,
      ServerStatTags _pdServerStatTags, NodeMemberFinder _rmNodeMemberFinder) {
    this.clock = _clock;
    this.imCoreNodeServerIdentity = _imCoreNodeServerIdentity;
    this.incomingMessageProcessorHmArrivingMessageManager = _incomingMessageProcessorHmArrivingMessageManager;
    this.pdServerStatTags = _pdServerStatTags;
    this.rmNodeMemberFinder = _rmNodeMemberFinder;
  }


  private LeaderElect _cratgLeaderElect(Collection<NamedDatabaseId> _collectionIdNamedDatabaseId,
      TransferElectApproach _ssTransferElectApproach) {
    if (!_collectionIdNamedDatabaseId.isEmpty()) {

      List<NodeOptions> _listDpctvNodeOptions =
          _collectionIdNamedDatabaseId.stream().flatMap(this::_fivatrecdefdStream)
              .collect(Collectors.toList());
      return _ssTransferElectApproach.seeLeaderElect(_listDpctvNodeOptions);
    } else {
      return LeaderElect.NOAE_LEADER_ELECT;
    }
  }


  private Stream<NodeOptions> _fivatrecdefdStream(NamedDatabaseId _namedDatabaseId) {

    HashSet<ServerId> _hashSetSvServerId = new HashSet(
        this.rmNodeMemberFinder.vovsSet(_namedDatabaseId));

    Predicate<ServerId> _predicateMosnServerId = (serverId) ->
    {
      return !Objects.equals(serverId, this.imCoreNodeServerIdentity.serverId()) &&
          this.pdServerStatTags.isNospdForDaSe(_namedDatabaseId.databaseId(), serverId);
    };

    Set<ServerId> _setSvServerId = _hashSetSvServerId.stream().filter(_predicateMosnServerId)
        .collect(Collectors.toSet());
    return _setSvServerId.isEmpty() ? Stream.empty()
        : Stream.of(new NodeOptions(_namedDatabaseId, _setSvServerId));
  }


  private boolean _isHadppaForLeSe(Set<NodeGroupIdentifier> _setGpNodeGroupIdentifier,
      LeaderElect _ttLeaderElect) {

    ConsensusMemberGroupId consensusMemberGroupId = ConsensusMemberGroupId.froConsensusMemberGroupId(
        _ttLeaderElect.getNamedDatabaseId().databaseId());

    ConsensusNodeId _froConsensusNodeId = this.imCoreNodeServerIdentity.ratmmriConsensusNodeId(
        _ttLeaderElect.getNamedDatabaseId());

    ConsensusNodeId _tConsensusNodeId =
        this.rmNodeMemberFinder.revrtmefsrConsensusNodeId(_ttLeaderElect.getNamedDatabaseId(),
            _ttLeaderElect.getServerId());
    if (_tConsensusNodeId == null) {
      return false;
    } else {

      ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec leaderRec =
          new ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec(_froConsensusNodeId,
              _tConsensusNodeId, _setGpNodeGroupIdentifier);

      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager<ConsensusMessageServiceMeta.LeaderChangeService.LeaderRec>
          m =
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.ArrivingMessageManager.ofConsensusMessageServiceMetaArrivingMessageManager(
              this.clock.instant(), consensusMemberGroupId, leaderRec);
      this.incomingMessageProcessorHmArrivingMessageManager.hadForM(m);
      return true;
    }
  }


  boolean isBacldiForCoTr(Collection<NamedDatabaseId> _collectionLaesNamedDatabaseId,
      TransferElectApproach _ssTransferElectApproach) {

    LeaderElect _treLeaderElect = this._cratgLeaderElect(_collectionLaesNamedDatabaseId,
        _ssTransferElectApproach);
    if (_treLeaderElect == LeaderElect.NOAE_LEADER_ELECT) {
      return false;
    } else {
      this._isHadppaForLeSe(Set.of(), _treLeaderElect);
      return true;
    }
  }


  boolean isToposgoForCoTrFu(Collection<NamedDatabaseId> _collectionLuNamedDatabaseId,
      Function<NamedDatabaseId, Set<NodeGroupIdentifier>> _functionPgpns,
      TransferElectApproach _ssTransferElectApproach) {

    LeaderElect _treLeaderElect = this._cratgLeaderElect(_collectionLuNamedDatabaseId,
        _ssTransferElectApproach);
    if (_treLeaderElect == LeaderElect.NOAE_LEADER_ELECT) {
      return false;
    } else {

      NamedDatabaseId _tdiNamedDatabaseId = _treLeaderElect.getNamedDatabaseId();

      Set<NodeGroupIdentifier> _setGpNodeGroupIdentifier = _functionPgpns.apply(
          _tdiNamedDatabaseId);
      if (_setGpNodeGroupIdentifier.isEmpty()) {

        throw new IllegalArgumentException("*** Error: 962819e2-6e13-4a6a-a067-a7a39a6346e7");
      } else {
        return this._isHadppaForLeSe(_setGpNodeGroupIdentifier, _treLeaderElect);
      }
    }
  }
}
