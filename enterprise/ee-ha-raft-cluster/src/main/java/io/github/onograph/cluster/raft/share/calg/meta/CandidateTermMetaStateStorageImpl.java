package io.github.onograph.cluster.raft.share.calg.meta;

import io.github.onograph.cluster.raft.share.calg.cle.watch.ElectionTimeWatcher;
import java.io.IOException;
import org.neo4j.io.state.StateStorage;
import org.neo4j.monitoring.Monitors;


public class CandidateTermMetaStateStorageImpl implements StateStorage<CandidateTermMeta> {


  private static final String TER_LT = io.github.onograph.TokenConstants.TERM;


  private final ElectionTimeWatcher mtElectionTimeWatcher;


  private final StateStorage<CandidateTermMeta> stateStorageDlgtCandidateTermMeta;


  public CandidateTermMetaStateStorageImpl(Monitors _monitors,
      StateStorage<CandidateTermMeta> _stateStorageDlgtCandidateTermMeta) {
    this.stateStorageDlgtCandidateTermMeta = _stateStorageDlgtCandidateTermMeta;
    this.mtElectionTimeWatcher =
        _monitors.newMonitor(ElectionTimeWatcher.class,
            new String[]{this.getClass().getName(), io.github.onograph.TokenConstants.TERM});
  }

  @Override
  public boolean exists() {
    return this.stateStorageDlgtCandidateTermMeta.exists();
  }

  @Override
  public CandidateTermMeta getInitialState() {
    return this.stateStorageDlgtCandidateTermMeta.getInitialState();
  }

  @Override
  public void writeState(CandidateTermMeta _saeCandidateTermMeta) throws IOException {
    this.stateStorageDlgtCandidateTermMeta.writeState(_saeCandidateTermMeta);
    this.mtElectionTimeWatcher.termLength(_saeCandidateTermMeta.getLgT());
  }
}
