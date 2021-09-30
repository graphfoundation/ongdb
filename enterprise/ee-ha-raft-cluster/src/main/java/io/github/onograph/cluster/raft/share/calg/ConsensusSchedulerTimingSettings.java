package io.github.onograph.cluster.raft.share.calg;

import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.time.Duration;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.helpers.DurationRange;


public class ConsensusSchedulerTimingSettings {


  static final int HERE_CSZ_IN_FALE_DEEI = 3;


  private final Duration hiDuration;


  private final DurationRange wdDurationRange;


  private final DurationRange wrDurationRange;

  ConsensusSchedulerTimingSettings(Config _config) {
    this.wdDurationRange = _config.get(SettingsDeclarationClusterImpl.settingLerutodDurationRange);
    this.wrDurationRange = _config.get(SettingsDeclarationClusterImpl.settingEliidtiDurationRange);

    Duration _mwdDuration = this.wdDurationRange.getMin();

    Duration _mwrDuration = this.wrDurationRange.getMin();
    if (_mwdDuration.toMillis() < _mwrDuration.toMillis()) {

      throw new IllegalArgumentException("*** Error: b25c6ff9-cd19-49c9-a0e8-822d78b58ae5");
    } else {
      this.hiDuration = this.wdDurationRange.getMin().dividedBy(3L);
    }
  }


  long detwimims() {
    return this.wdDurationRange.getMin().toMillis();
  }


  long getHealthDuration() {
    return this.hiDuration.toMillis();
  }


  long getWdDurationRangeDelta() {
    return this.wdDurationRange.getDelta().toMillis();
  }


  long getWdDurationRangeMax() {
    return this.wdDurationRange.getMax().toMillis();
  }


  long getWrDurationRangeMax() {
    return this.wrDurationRange.getMax().toMillis();
  }


  long getWrDurationRangeMin() {
    return this.wrDurationRange.getMin().toMillis();
  }
}
