package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.time.Clock;
import java.time.Duration;


public class ExitMetaTimeStatsImpl implements ExitMeta {


  private final Clock clock;


  private final Duration duration;


  private final long lgTe;


  ExitMetaTimeStatsImpl(Clock _clock, Duration _duration) {
    this.duration = _duration;
    this.lgTe = _clock.millis() + _duration.toMillis();
    this.clock = _clock;
  }

  @Override
  public void asectu() throws GdbStoreException {
    if (this.clock.millis() > this.lgTe) {

      throw new GdbStoreException("*** Error: 0351d674-11a2-4c5c-a0fc-1961779544cc");
    }
  }
}
