package io.github.onograph.cluster.raft.module.cuprot.current.ident;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.AskMessageType;
import java.util.Objects;


public class RequestGdbId extends AbstractCatchupManagementMessageWrapper {


  private final String gdbName;

  public RequestGdbId(String gdbName) {
    super(AskMessageType.AMT_GDB_GUID);
    this.gdbName = gdbName;
  }

  @Override
  public String decbString() {

    String _strVr00 = this.getClass().getSimpleName();
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.module.cuprot.current.ident.RequestGdbId.decbString",
        _strVr00,
        this.gdbName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      RequestGdbId _thRequestGdbId = (RequestGdbId) obj;
      return this.tNme == _thRequestGdbId.tNme && Objects.equals(this.gdbName,
          _thRequestGdbId.gdbName);
    } else {
      return false;
    }
  }


  public String getGdbName() {
    return this.gdbName;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.tNme, this.gdbName);
  }
}
