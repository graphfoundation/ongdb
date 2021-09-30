package io.github.onograph.cluster.raft.share.meta.fsm.servicetrx;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import java.io.IOException;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.function.Consumer;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;


public class AbstractTransactionSync implements CoreNodeSyncableData {


  private final DatabaseId databaseId;


  private final long sz;


  private final PhysicalTransactionRepresentation tPhysicalTransactionRepresentation;

  public AbstractTransactionSync(
      PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation,
      DatabaseId _databaseId) {
    this.tPhysicalTransactionRepresentation = _tPhysicalTransactionRepresentation;
    this.databaseId = _databaseId;
    this.sz = -1L;
  }

  public AbstractTransactionSync(
      PhysicalTransactionRepresentation _tPhysicalTransactionRepresentation, DatabaseId _databaseId,
      long sz) {
    this.databaseId = _databaseId;
    this.sz = sz;
    this.tPhysicalTransactionRepresentation = _tPhysicalTransactionRepresentation;
  }

  @Override
  public DatabaseId daasidDatabaseId() {
    return this.databaseId;
  }

  @Override
  public void dipcForSy(AutoCloseableActionProcessor _dcAutoCloseableActionProcessor,
      Consumer<FSMData> _consumerClbcFSMData, long caIdx) {
    _dcAutoCloseableActionProcessor.dipcForSyCo(this, _consumerClbcFSMData, caIdx);
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      AbstractTransactionSync _tAbstractTransactionSync = (AbstractTransactionSync) obj;
      return Objects.equals(this.tPhysicalTransactionRepresentation,
          _tAbstractTransactionSync.tPhysicalTransactionRepresentation) &&
          Objects.equals(this.databaseId, _tAbstractTransactionSync.databaseId) && Objects.equals(
          this.sz, _tAbstractTransactionSync.sz);
    } else {
      return false;
    }
  }


  public PhysicalTransactionRepresentation getTPhysicalTransactionRepresentation() {
    return this.tPhysicalTransactionRepresentation;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.tPhysicalTransactionRepresentation, this.databaseId, this.sz);
  }

  @Override
  public OptionalLong sizOptionalLong() {
    return this.sz == -1L ? OptionalLong.empty() : OptionalLong.of(this.sz);
  }


}
