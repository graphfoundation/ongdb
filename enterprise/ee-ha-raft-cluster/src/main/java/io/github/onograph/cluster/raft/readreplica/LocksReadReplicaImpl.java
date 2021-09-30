package io.github.onograph.cluster.raft.readreplica;

import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.exceptions.ReadOnlyDbException;
import org.neo4j.kernel.impl.api.LeaseClient;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.lock.AcquireLockTimeoutException;
import org.neo4j.lock.ActiveLock;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceType;
import org.neo4j.memory.MemoryTracker;


public class LocksReadReplicaImpl implements Locks {

  @Override
  public void accept(Visitor _visitor) {
  }

  @Override
  public void close() {
  }

  @Override
  public org.neo4j.kernel.impl.locking.Locks.Client newClient() {
    return new io.github.onograph.cluster.raft.readreplica.LocksReadReplicaImpl.LocksClientImpl();
  }


  private static class LocksClientImpl implements org.neo4j.kernel.impl.locking.Locks.Client {

    @Override
    public void acquireExclusive(LockTracer _lockTracer, ResourceType rtName, long... _lgIrArray)
        throws AcquireLockTimeoutException {
      throw new RuntimeException(new ReadOnlyDbException());
    }

    @Override
    public void acquireShared(LockTracer _lockTracer, ResourceType rtName, long... _lgIrArray)
        throws AcquireLockTimeoutException {
    }

    @Override
    public long activeLockCount() {
      return 0L;
    }

    @Override
    public Stream<ActiveLock> activeLocks() {
      return Stream.empty();
    }

    @Override
    public void close() {
    }

    @Override
    public int getLockSessionId() {
      return 0;
    }

    @Override
    public void initialize(LeaseClient _leaseClient, long transIdx, MemoryTracker _memoryTracker,
        Config _config) {
    }

    @Override
    public void prepareForCommit() {
    }

    @Override
    public void releaseExclusive(ResourceType rtName, long... _lgRiArray) {

      throw new IllegalStateException("*** Error:  9250e0de-1527-4cdc-88f7-5f7042020134");
    }

    @Override
    public void releaseShared(ResourceType rtName, long... _lgIrArray) {
    }

    @Override
    public void stop() {
    }

    @Override
    public boolean tryExclusiveLock(ResourceType rtName, long rxId) {
      throw new RuntimeException(new ReadOnlyDbException());
    }

    @Override
    public boolean trySharedLock(ResourceType rtName, long rxId) {
      return false;
    }
  }
}
