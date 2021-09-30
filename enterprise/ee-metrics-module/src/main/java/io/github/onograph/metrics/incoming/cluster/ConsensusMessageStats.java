package io.github.onograph.metrics.incoming.cluster;

import com.codahale.metrics.Reservoir;
import com.codahale.metrics.Timer;
import io.github.onograph.cluster.raft.share.calg.ConsensusProcessingDurationWatcher;
import java.time.Duration;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;


public class ConsensusMessageStats implements ConsensusProcessingDurationWatcher {


  private final AtomicLong dlyAtomicLong = new AtomicLong(0L);


  private final Map<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType, Timer> mapTtct =
      new EnumMap(
          io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.class);


  private final Timer timer;

  private ConsensusMessageStats(Supplier<Timer> _supplierFtTimer) {

    io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType[] _raftConsensusMessageTypeArray =
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType.values();

    int _iV = _raftConsensusMessageTypeArray.length;

    for (

        int _iV2 = 0; _iV2 < _iV; ++_iV2) {

      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme = _raftConsensusMessageTypeArray[_iV2];
      this.mapTtct.put(tNme, _supplierFtTimer.get());
    }

    this.timer = _supplierFtTimer.get();
  }


  public static ConsensusMessageStats craConsensusMessageStats() {
    return new ConsensusMessageStats(Timer::new);
  }


  public static ConsensusMessageStats craunConsensusMessageStats(
      Supplier<Reservoir> _supplierRsrorReservoir) {
    return new ConsensusMessageStats(() ->
    {
      return new Timer(_supplierRsrorReservoir.get());
    });
  }


  public long dea() {
    return this.dlyAtomicLong.get();
  }


  public Timer getTimer() {
    return this.timer;
  }


  public Timer getTimer(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme) {
    return this.mapTtct.get(tNme);
  }

  @Override
  public void sedaForDu(Duration _dlyDuration) {
    this.dlyAtomicLong.set(_dlyDuration.toMillis());
  }

  @Override
  public void upateForCoDu(Duration _duration,
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.RaftConsensusMessageType tNme) {

    long _lgNns = _duration.toNanos();
    this.timer.update(_lgNns, TimeUnit.NANOSECONDS);
    this.mapTtct.get(tNme).update(_lgNns, TimeUnit.NANOSECONDS);
  }
}
