package io.github.onograph.cluster.raft.share.meta.fsm.comp;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataProcessor;
import io.github.onograph.cluster.raft.share.meta.AutoCloseableActionProcessor;
import io.github.onograph.cluster.raft.share.meta.FSMData;
import io.github.onograph.cluster.raft.share.meta.fsm.servicetrx.CoreNodeSyncableData;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;
import org.neo4j.kernel.database.DatabaseId;


public class RequestData implements CoreNodeSyncableData {


  private final byte[] cmadByteArray;


  private final DatabaseId databaseId;


  private final String strNt;


  private final ReplicaTokenType tNme;


  public RequestData(byte[] _cmadByteArray, DatabaseId _databaseId, String _strNt,
      ReplicaTokenType tNme) {
    this.cmadByteArray = _cmadByteArray;
    this.databaseId = _databaseId;
    this.strNt = _strNt;
    this.tNme = tNme;
  }

  @Override
  public DatabaseId daasidDatabaseId() {
    return this.databaseId;
  }

  @Override
  public void dipcForSy(SyncableDataProcessor _hcSyncableDataProcessor) throws IOException {
    _hcSyncableDataProcessor.process(this);
  }

  @Override
  public void dipcForSy(AutoCloseableActionProcessor _cdAutoCloseableActionProcessor,
      Consumer<FSMData> _consumerClbcFSMData, long caIdx) {
    _cdAutoCloseableActionProcessor.dipcForSyCo(_consumerClbcFSMData, caIdx, this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RequestData _thaRequestData = (RequestData) obj;
      if (this.tNme != _thaRequestData.tNme) {
        return false;
      } else {
        return this.strNt.equals(_thaRequestData.strNt) && Arrays.equals(this.cmadByteArray,
            _thaRequestData.cmadByteArray);
      }
    } else {
      return false;
    }
  }


  byte[] getCmadByteArray() {
    return this.cmadByteArray;
  }


  String getStrNt() {
    return this.strNt;
  }


  public ReplicaTokenType getTNme() {
    return this.tNme;
  }

  @Override
  public int hashCode() {

    int _iRsl = this.tNme.hashCode();
    _iRsl = 31 * _iRsl + this.strNt.hashCode();
    _iRsl = 31 * _iRsl + Arrays.hashCode(this.cmadByteArray);
    return _iRsl;
  }


}
