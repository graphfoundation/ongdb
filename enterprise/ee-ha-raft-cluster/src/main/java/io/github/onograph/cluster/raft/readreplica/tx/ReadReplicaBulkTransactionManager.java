package io.github.onograph.cluster.raft.readreplica.tx;

import io.github.onograph.cluster.raft.readreplica.ReadReplicaGdbWrapperEnvironment;
import io.github.onograph.cluster.raft.share.meta.fsm.ActionIdxMonitor;
import org.neo4j.io.pagecache.context.VersionContextSupplier;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.api.InternalTransactionCommitProcess;
import org.neo4j.kernel.impl.transaction.log.TransactionAppender;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.storageengine.api.TransactionIdStore;


public class ReadReplicaBulkTransactionManager {


  private final ReadReplicaGdbWrapperEnvironment cdReadReplicaGdbWrapperEnvironment;


  private final io.github.onograph.dbms.GdbReplicator.FireEvents dedFireEvents;


  private final LogProvider logProvider;


  private final PageCacheTracer pageCacheTracer;


  private final ReadReplicaAsyncTransactionAdapter readReplicaAsyncTransactionAdapter;


  private final ActionIdxMonitor ticActionIdxMonitor;


  private final VersionContextSupplier versionContextSupplier;


  public ReadReplicaBulkTransactionManager(
      ReadReplicaGdbWrapperEnvironment _cdReadReplicaGdbWrapperEnvironment,
      io.github.onograph.dbms.GdbReplicator.FireEvents _dedFireEvents, LogProvider _logProvider,
      PageCacheTracer _pageCacheTracer,
      ReadReplicaAsyncTransactionAdapter readReplicaAsyncTransactionAdapter,
      ActionIdxMonitor _ticActionIdxMonitor, VersionContextSupplier _versionContextSupplier) {
    this.cdReadReplicaGdbWrapperEnvironment = _cdReadReplicaGdbWrapperEnvironment;
    this.dedFireEvents = _dedFireEvents;
    this.logProvider = _logProvider;
    this.pageCacheTracer = _pageCacheTracer;
    this.readReplicaAsyncTransactionAdapter = readReplicaAsyncTransactionAdapter;
    this.ticActionIdxMonitor = _ticActionIdxMonitor;
    this.versionContextSupplier = _versionContextSupplier;
  }


  public ReadReplicaTransactionBlockProcessor craReadReplicaTransactionBlockProcessor() {

    InternalTransactionCommitProcess _internalTransactionCommitProcess = new InternalTransactionCommitProcess(
        this.cdReadReplicaGdbWrapperEnvironment.getKreDatabase().getDependencyResolver()
            .resolveDependency(TransactionAppender.class),
        this.cdReadReplicaGdbWrapperEnvironment.getKreDatabase().getDependencyResolver()
            .resolveDependency(StorageEngine.class));

    long _lgItcl =
        this.cdReadReplicaGdbWrapperEnvironment.getKreDatabase().getDependencyResolver()
            .resolveDependency(TransactionIdStore.class)
            .getLastCommittedTransactionId();
    return new ReadReplicaTransactionBlockProcessor(this.readReplicaAsyncTransactionAdapter,
        this.dedFireEvents, _lgItcl,
        this.logProvider, this.cdReadReplicaGdbWrapperEnvironment.getMonitors(),
        this.pageCacheTracer,
        this.ticActionIdxMonitor, _internalTransactionCommitProcess, this.versionContextSupplier);
  }
}
