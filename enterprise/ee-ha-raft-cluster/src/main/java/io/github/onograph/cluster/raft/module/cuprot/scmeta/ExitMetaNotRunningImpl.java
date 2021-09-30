package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;


public class ExitMetaNotRunningImpl implements ExitMeta {


  private final CompositeDatabaseAvailabilityGuard compositeDatabaseAvailabilityGuard;

  ExitMetaNotRunningImpl(CompositeDatabaseAvailabilityGuard _compositeDatabaseAvailabilityGuard) {
    this.compositeDatabaseAvailabilityGuard = _compositeDatabaseAvailabilityGuard;
  }

  @Override
  public void asectu() throws GdbStoreException {
    if (this.compositeDatabaseAvailabilityGuard.isShutdown()) {

      throw new GdbStoreException("*** Error:  113c0dba-2c0c-40aa-a4ef-22e99222f9a6");
    }
  }
}
