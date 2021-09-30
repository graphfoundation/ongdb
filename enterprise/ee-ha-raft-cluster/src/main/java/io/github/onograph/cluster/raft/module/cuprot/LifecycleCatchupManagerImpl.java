package io.github.onograph.cluster.raft.module.cuprot;

import java.time.Duration;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.logging.Log;


public class LifecycleCatchupManagerImpl implements Lifecycle {


  private final Duration itDuration;


  private final CatchupNettyChannelPoolLifecycleAdapter plNm;


  public LifecycleCatchupManagerImpl(
      CatchupNettyChannelPoolLifecycleAdapter _spccCatchupNettyChannelPoolLifecycleAdapter,
      Duration _tiDuration) {
    this.itDuration = _tiDuration;
    this.plNm = _spccCatchupNettyChannelPoolLifecycleAdapter;
  }


  public CatchupManagerService geceCatchupManagerService(Log _log,
      SocketAddress _usraSocketAddress) {
    return new CatchupManagerServiceImpl(
        this.plNm.acueCompletableFuture(_usraSocketAddress).thenApply(PooledChannelFacade::new),
        _log,
        this.itDuration);
  }

  @Override
  public void init() {
    this.plNm.init();
  }

  @Override
  public void shutdown() {
    this.plNm.shutdown();
  }

  @Override
  public void start() {
    this.plNm.start();
  }

  @Override
  public void stop() {
    this.plNm.stop();
  }
}
