package io.github.onograph.dbms;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.kernel.database.NamedDatabaseId;


class GdbInfoWrapper {


  static final GdbInfoWrapper EMT_GDB_INFO_WRAPPER = new GdbInfoWrapper(Set.of(), Set.of());


  private final Set<NamedDatabaseId> setCagdNamedDatabaseId;


  private final Set<NamedDatabaseId> setDopdNamedDatabaseId;

  GdbInfoWrapper(Set<NamedDatabaseId> _setCagdNamedDatabaseId,
      Set<NamedDatabaseId> _setDopdNamedDatabaseId) {
    this.setCagdNamedDatabaseId = _setCagdNamedDatabaseId;
    this.setDopdNamedDatabaseId = _setDopdNamedDatabaseId;
  }


  Set<NamedDatabaseId> allSet() {
    return Stream.concat(this.setDopdNamedDatabaseId.stream(), this.setCagdNamedDatabaseId.stream())
        .collect(Collectors.toSet());
  }


  Set<NamedDatabaseId> getSetCagdNamedDatabaseId() {
    return this.setCagdNamedDatabaseId;
  }


  Set<NamedDatabaseId> getSetDopdNamedDatabaseId() {
    return this.setDopdNamedDatabaseId;
  }
}
