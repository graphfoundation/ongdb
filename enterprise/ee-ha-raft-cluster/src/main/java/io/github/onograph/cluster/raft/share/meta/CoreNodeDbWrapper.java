package io.github.onograph.cluster.raft.share.meta;

import java.util.function.Supplier;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.storageengine.api.TransactionIdStore;


public class CoreNodeDbWrapper {


  private Database database;


  public Supplier<IdGeneratorFactory> idgerfoSupplier() {
    return () ->
    {
      return (IdGeneratorFactory) this.database.getDependencyResolver()
          .resolveDependency(IdGeneratorFactory.class);
    };
  }


  public void retdteForDa(Database _database) {
    this.database = _database;
  }


  public Supplier<StorageEngine> streegeSupplier() {
    return () ->
    {
      return (StorageEngine) this.database.getDependencyResolver()
          .resolveDependency(StorageEngine.class);
    };
  }


  public Supplier<TransactionIdStore> txidsoSupplier() {
    return () ->
    {
      return (TransactionIdStore) this.database.getDependencyResolver()
          .resolveDependency(TransactionIdStore.class);
    };
  }


  public Supplier<LogicalTransactionStore> txsteSupplier() {
    return () ->
    {
      return (LogicalTransactionStore) this.database.getDependencyResolver()
          .resolveDependency(LogicalTransactionStore.class);
    };
  }
}
