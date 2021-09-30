package io.github.onograph.dbms;

import org.neo4j.dbms.DatabaseState;


@FunctionalInterface
public interface DatabaseStateUpdateHandler {


  void sttchgForDaDa(DatabaseState _databaseState, DatabaseState _databaseState2);
}
