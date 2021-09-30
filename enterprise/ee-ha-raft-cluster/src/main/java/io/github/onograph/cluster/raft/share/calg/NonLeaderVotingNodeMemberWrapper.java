package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.cluster.raft.share.calg.resp.ConsensusNodeFollowersMeta;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class NonLeaderVotingNodeMemberWrapper {

  private NonLeaderVotingNodeMemberWrapper() {
  }


  public static <MEMBER> long qumanieForSeCo(
      ConsensusNodeFollowersMeta<MEMBER> _consensusNodeFollowersMetaSaeMEMBER,
      Set<MEMBER> _setMvMEMBER) {

    TreeMap<Long, Integer> _treeMapCali = new TreeMap<>();

    Iterator<MEMBER> _iteratorVarMEMBER = _setMvMEMBER.iterator();

    while (_iteratorVarMEMBER.hasNext()) {

      MEMBER _mmeMme = _iteratorVarMEMBER.next();

      long transIdx = _consensusNodeFollowersMetaSaeMEMBER.getConsensusNodeFollowerMeta(_mmeMme)
          .getLgIm();
      _treeMapCali.merge(transIdx, 1, (a, b) ->
      {
        return a + b;
      });
    }

    int _iTtl = 0;

    Iterator _iterator = _treeMapCali.descendingMap().entrySet().iterator();

    Entry _entry;
    do {
      if (!_iterator.hasNext()) {
        return -1L;
      }

      _entry = (Entry) _iterator.next();
      _iTtl += (Integer) _entry.getValue();
    }
    while (!VotingMemberThreshold.isQuu(_setMvMEMBER.size(), _iTtl));

    return (Long) _entry.getKey();
  }
}
