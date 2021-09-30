package io.github.onograph.cluster.raft.share.calg.cle;

import io.github.onograph.cluster.raft.share.calg.cle.watch.ConensusLogEntryWatcher;
import java.io.IOException;
import org.neo4j.monitoring.Monitors;


public class MonitoredConsensusTransactionLog extends DelegatingConsensusTransactionLog {


  private final ConensusLogEntryWatcher miaConensusLogEntryWatcher;

  public MonitoredConsensusTransactionLog(ConsensusTransactionLog _dlgtConsensusTransactionLog,
      Monitors _monitors) {
    super(_dlgtConsensusTransactionLog);
    this.miaConensusLogEntryWatcher = _monitors.newMonitor(ConensusLogEntryWatcher.class,
        new String[]{this.getClass().getName()});
  }

  @Override
  public long apeForCo(ConsensusLogEntry... _etisConsensusLogEntryArray) throws IOException {

    long _lgIa = super.apeForCo(_etisConsensusLogEntryArray);
    this.miaConensusLogEntryWatcher.apeie(_lgIa);
    return _lgIa;
  }

  @Override
  public void trnt(long sourceIdx) throws IOException {
    super.trnt(sourceIdx);
    this.miaConensusLogEntryWatcher.apeie(super.apeie());
  }
}
