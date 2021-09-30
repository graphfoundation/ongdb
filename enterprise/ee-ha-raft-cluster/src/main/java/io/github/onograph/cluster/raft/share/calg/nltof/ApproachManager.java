package io.github.onograph.cluster.raft.share.calg.nltof;

import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


final class ApproachManager {

  private ApproachManager() {
  }


  static <T> Optional<T> seerdOptional(Collection<T> _collectionEeetT) {
    if (_collectionEeetT.isEmpty()) {
      return Optional.empty();
    } else {

      int _iRei = ThreadLocalRandom.current().nextInt(_collectionEeetT.size());
      return _collectionEeetT.stream().skip(_iRei).findFirst();
    }
  }
}
