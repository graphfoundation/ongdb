package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeType;
import java.util.Set;


interface ConsensusNodeMetaCoordinator {


  void oneny();


  void onex();


  ConsensusNodeMetaCoordinator onflsceConsensusNodeMetaCoordinator(
      ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaVarConsensusNodeId);


  ConsensusNodeMetaCoordinator onlditnConsensusNodeMetaCoordinator(boolean _isVar);


  ConsensusNodeMetaCoordinator onmsmeConsensusNodeMetaCoordinator(ConsensusNodeId _consensusNodeId);


  ConsensusNodeMetaCoordinator onroConsensusNodeMetaCoordinator(
      ConsensusNodeType _consensusNodeType);


  ConsensusNodeMetaCoordinator onrtgpciConsensusNodeMetaCoordinator();


  ConsensusNodeMetaCoordinator onseommConsensusNodeMetaCoordinator(
      ConsensusNodeId _consensusNodeId);


  ConsensusNodeMetaCoordinator ontgcaConsensusNodeMetaCoordinator(
      Set<ConsensusNodeId> _setVaConsensusNodeId);


  abstract class AbstractConsensusNodeMetaCoordinator implements ConsensusNodeMetaCoordinator {

    @Override
    public void oneny() {
    }

    @Override
    public void onex() {
    }

    @Override
    public ConsensusNodeMetaCoordinator onflsceConsensusNodeMetaCoordinator(
        ConsensusNodeFollowersMeta<ConsensusNodeId> _consensusNodeFollowersMetaSfConsensusNodeId) {
      return this;
    }

    @Override
    public ConsensusNodeMetaCoordinator onlditnConsensusNodeMetaCoordinator(boolean _isTa) {
      return this;
    }

    @Override
    public ConsensusNodeMetaCoordinator onmsmeConsensusNodeMetaCoordinator(
        ConsensusNodeId _mmeConsensusNodeId) {
      return this;
    }

    @Override
    public ConsensusNodeMetaCoordinator onroConsensusNodeMetaCoordinator(ConsensusNodeType r) {
      return this;
    }

    @Override
    public ConsensusNodeMetaCoordinator onrtgpciConsensusNodeMetaCoordinator() {
      return this;
    }

    @Override
    public ConsensusNodeMetaCoordinator onseommConsensusNodeMetaCoordinator(
        ConsensusNodeId _mmeConsensusNodeId) {
      return this;
    }

    @Override
    public ConsensusNodeMetaCoordinator ontgcaConsensusNodeMetaCoordinator(
        Set<ConsensusNodeId> _setTmConsensusNodeId) {
      return this;
    }
  }
}
