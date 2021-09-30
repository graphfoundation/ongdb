package io.github.onograph.dbms.gdb;

import org.neo4j.dbms.database.StandaloneDatabaseContext;
import org.neo4j.kernel.database.Database;


public class DefaultStandaloneDatabaseContext extends StandaloneDatabaseContext implements
    DefaultDatabaseContext {


  private final Gdb gdb;

  public DefaultStandaloneDatabaseContext(Database _database, Gdb gdb) {
    super(_database);
    this.gdb = gdb;
  }

  @Override
  public Gdb enpdaGdb() {
    return this.gdb;
  }
}
