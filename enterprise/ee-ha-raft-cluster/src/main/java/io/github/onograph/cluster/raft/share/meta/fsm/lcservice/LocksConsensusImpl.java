package io.github.onograph.cluster.raft.share.meta.fsm.lcservice;

import java.util.stream.Stream;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.api.LeaseClient;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.lock.AcquireLockTimeoutException;
import org.neo4j.lock.ActiveLock;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceType;
import org.neo4j.memory.MemoryTracker;


public class LocksConsensusImpl implements Locks {


  private final Locks lclLocks;

  public LocksConsensusImpl(Locks _lclLocks) {
    this.lclLocks = _lclLocks;
  }

  @Override
  public void accept(Visitor _visitor) {
    this.lclLocks.accept(_visitor);
  }

  @Override
  public void close() {
    this.lclLocks.close();
  }

  @Override
  public Client newClient() {
    return new io.github.onograph.cluster.raft.share.meta.fsm.lcservice.LocksConsensusImpl.LocksClientConsensusImpl(
        this.lclLocks.newClient());
  }


  private static class LocksClientConsensusImpl implements Client {


    private final Client lclClient;


    private LeaseClient leaseClient;

    LocksClientConsensusImpl(Client _lclClient) {
      this.lclClient = _lclClient;
    }

    @Override
    public void acquireExclusive(LockTracer _lockTracer, ResourceType rtName, long... rxId)
        throws AcquireLockTimeoutException {
      this.eneeulcabace();
      this.lclClient.acquireExclusive(_lockTracer, rtName, rxId);
    }

    @Override
    public void acquireShared(LockTracer _lockTracer, ResourceType rtName, long... rxId)
        throws AcquireLockTimeoutException {
      this.lclClient.acquireShared(_lockTracer, rtName, rxId);
    }

    @Override
    public long activeLockCount() {
      return this.lclClient.activeLockCount();
    }

    @Override
    public Stream<ActiveLock> activeLocks() {
      return this.lclClient.activeLocks();
    }

    @Override
    public void close() {
      this.lclClient.close();
    }


    void eneeulcabace() {
      this.leaseClient.ensureValid();
    }

    @Override
    public int getLockSessionId() {
      return this.leaseClient.leaseId();
    }

    @Override
    public void initialize(LeaseClient _leaseClient, long transIdx, MemoryTracker _memoryTracker,
        Config _config) {
      this.lclClient.initialize(_leaseClient, transIdx, _memoryTracker, _config);
      this.leaseClient = _leaseClient;
    }

    @Override
    public void prepareForCommit() {
      this.lclClient.prepareForCommit();
    }

    @Override
    public void releaseExclusive(ResourceType rtName, long... _lgIrArray) {
      this.lclClient.releaseExclusive(rtName, _lgIrArray);
    }

    @Override
    public void releaseShared(ResourceType rtName, long... _lgIrArray) {
      this.lclClient.releaseShared(rtName, _lgIrArray);
    }

    @Override
    public void stop() {
      this.lclClient.stop();
    }

    @Override
    public boolean tryExclusiveLock(ResourceType rtName, long rxId) {
      this.eneeulcabace();
      return this.lclClient.tryExclusiveLock(rtName, rxId);
    }

    @Override
    public boolean trySharedLock(ResourceType rtName, long rxId) {
      return this.lclClient.trySharedLock(rtName, rxId);
    }
  }
}
