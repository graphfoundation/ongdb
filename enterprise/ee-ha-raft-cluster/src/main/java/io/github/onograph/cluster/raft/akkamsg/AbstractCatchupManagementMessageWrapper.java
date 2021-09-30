package io.github.onograph.cluster.raft.akkamsg;

import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.util.Objects;
import org.neo4j.kernel.database.DatabaseId;


public abstract class AbstractCatchupManagementMessageWrapper {


  protected final AskMessageType tNme;

  public AbstractCatchupManagementMessageWrapper(AskMessageType tNme) {
    this.tNme = tNme;
  }


  public abstract String decbString();


  public final AskMessageType getTNme() {
    return this.tNme;
  }


  public abstract static class CatchupManagementMessageWrapperIncDatabaseId extends
      AbstractCatchupManagementMessageWrapper {


    private final DatabaseId databaseId;


    protected CatchupManagementMessageWrapperIncDatabaseId(DatabaseId _databaseId,
        AskMessageType tNme) {
      super(tNme);
      this.databaseId = _databaseId;
    }

    @Override
    public String decbString() {

      String _strVr00 = this.getClass().getSimpleName();
      return io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.decbString",
          _strVr00, this.databaseId);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId
            _thCatchupManagementMessageWrapperIncDatabaseId =
            (io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId) obj;
        return this.tNme == _thCatchupManagementMessageWrapperIncDatabaseId.tNme &&
            Objects.equals(this.databaseId,
                _thCatchupManagementMessageWrapperIncDatabaseId.databaseId);
      } else {
        return false;
      }
    }


    public final DatabaseId getDatabaseId() {
      return this.databaseId;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.tNme, this.databaseId);
    }


  }
}
