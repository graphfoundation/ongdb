package io.github.onograph.dbms.crash;

import java.util.Objects;
import org.neo4j.kernel.database.NamedDatabaseId;


public final class GdbCrashEvent extends AbstractCrashEvent {


  private final NamedDatabaseId namedDatabaseId;


  public GdbCrashEvent(Throwable _cueThrowable, NamedDatabaseId _namedDatabaseId,
      GdbCrashCauseInfo _raoGdbCrashCauseInfo) {
    super(_raoGdbCrashCauseInfo, _cueThrowable);
    this.namedDatabaseId = _namedDatabaseId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbCrashEvent ev = (GdbCrashEvent) obj;
      return super.equals(ev) && this.namedDatabaseId.equals(ev.namedDatabaseId);
    } else {
      return false;
    }
  }


  public NamedDatabaseId getNamedDatabaseId() {
    return this.namedDatabaseId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.namedDatabaseId);
  }


}
