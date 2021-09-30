package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.time.Clock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.CappedLogger;


public class InactiveNodeWatcher {


  private final Clock clock;


  private final long lgMlt;


  private final Log log;


  private final Map<ConsensusNodeId, CappedLogger> mapLgescc = new ConcurrentHashMap();


  public InactiveNodeWatcher(Clock _clock, long _lgMlt, Log _log) {
    this.clock = _clock;
    this.lgMlt = _lgMlt;
    this.log = _log;
  }


  public void loattsdtmmwinkasForCo(ConsensusNodeId _tConsensusNodeId) {

    CappedLogger _cappedLogger = this.mapLgescc.get(_tConsensusNodeId);
    if (_cappedLogger == null) {
      _cappedLogger = new CappedLogger(this.log, this.lgMlt, TimeUnit.MILLISECONDS, this.clock);
      this.mapLgescc.put(_tConsensusNodeId, _cappedLogger);
    }


  }
}
