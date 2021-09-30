package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.share.meta.fsm.CoreGdbFSMService;
import org.neo4j.graphdb.factory.module.id.DatabaseIdContext;
import org.neo4j.kernel.impl.api.CommitProcessFactory;
import org.neo4j.kernel.impl.api.LeaseService;
import org.neo4j.kernel.impl.factory.AccessCapabilityFactory;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.token.TokenHolders;


public class CoreNodeWrapper {


  private final AccessCapabilityFactory accessCapabilityFactory;


  private final CommitProcessFactory commitProcessFactory;


  private final DatabaseIdContext databaseIdContext;


  private final LeaseService leaseService;


  private final Locks mlLocks;


  private final CoreGdbFSMService msCoreGdbFSMService;


  private final TokenHolders tokenHolders;


  public CoreNodeWrapper(AccessCapabilityFactory _accessCapabilityFactory,
      CommitProcessFactory _commitProcessFactory, DatabaseIdContext _databaseIdContext,
      LeaseService _leaseService, Locks _mlLocks, CoreGdbFSMService _msCoreGdbFSMService,
      TokenHolders _tokenHolders) {
    this.accessCapabilityFactory = _accessCapabilityFactory;
    this.commitProcessFactory = _commitProcessFactory;
    this.databaseIdContext = _databaseIdContext;
    this.leaseService = _leaseService;
    this.mlLocks = _mlLocks;
    this.msCoreGdbFSMService = _msCoreGdbFSMService;
    this.tokenHolders = _tokenHolders;
  }


  public AccessCapabilityFactory getAccessCapabilityFactory() {
    return this.accessCapabilityFactory;
  }


  public CommitProcessFactory getCommitProcessFactory() {
    return this.commitProcessFactory;
  }


  public DatabaseIdContext getDatabaseIdContext() {
    return this.databaseIdContext;
  }


  public LeaseService getLeaseService() {
    return this.leaseService;
  }


  public Locks getMlLocks() {
    return this.mlLocks;
  }


  public CoreGdbFSMService getMsCoreGdbFSMService() {
    return this.msCoreGdbFSMService;
  }


  public TokenHolders getTokenHolders() {
    return this.tokenHolders;
  }
}
