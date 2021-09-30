package io.github.onograph.dbms.gdb;

import io.github.onograph.dbms.DatabaseStateEnterpriseImpl;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.CommunityDatabaseState;
import org.neo4j.dbms.database.DatabaseOperationCounts;

class DatabaseStateUpdateHandlerOppStatsImplTest {

  @Test
  void testConstructor() {

    new DatabaseStateUpdateHandlerOppStatsImpl(new DatabaseOperationCounts.Counter());
  }

  @Test
  void testSttchgForDaDa() {

    DatabaseStateUpdateHandlerOppStatsImpl databaseStateUpdateHandlerOppStatsImpl = new DatabaseStateUpdateHandlerOppStatsImpl(
        new DatabaseOperationCounts.Counter());
    DatabaseStateEnterpriseImpl _spDatabaseState = DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl();
    databaseStateUpdateHandlerOppStatsImpl.sttchgForDaDa(_spDatabaseState,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
  }

  @Test
  void testSttchgForDaDa2() {

    DatabaseStateUpdateHandlerOppStatsImpl databaseStateUpdateHandlerOppStatsImpl = new DatabaseStateUpdateHandlerOppStatsImpl(
        new DatabaseOperationCounts.Counter());
    CommunityDatabaseState _spDatabaseState = new CommunityDatabaseState(null, true, true,
        new Throwable());

    databaseStateUpdateHandlerOppStatsImpl.sttchgForDaDa(_spDatabaseState,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
  }

  @Test
  void testSttchgForDaDa3() {

    DatabaseStateUpdateHandlerOppStatsImpl databaseStateUpdateHandlerOppStatsImpl = new DatabaseStateUpdateHandlerOppStatsImpl(
        new DatabaseOperationCounts.Counter());
    DatabaseStateEnterpriseImpl _spDatabaseState = DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl();
    databaseStateUpdateHandlerOppStatsImpl.sttchgForDaDa(_spDatabaseState,
        new CommunityDatabaseState(null, true, true, new Throwable()));
  }

  @Test
  void testSttchgForDaDa4() {

    DatabaseStateUpdateHandlerOppStatsImpl databaseStateUpdateHandlerOppStatsImpl = new DatabaseStateUpdateHandlerOppStatsImpl(
        null);
    CommunityDatabaseState _spDatabaseState = new CommunityDatabaseState(null, true, true,
        new Throwable());

    databaseStateUpdateHandlerOppStatsImpl.sttchgForDaDa(_spDatabaseState,
        new CommunityDatabaseState(null, true, true, new Throwable()));
  }

  @Test
  void testSttchgForDaDa5() {

    DatabaseStateUpdateHandlerOppStatsImpl databaseStateUpdateHandlerOppStatsImpl = new DatabaseStateUpdateHandlerOppStatsImpl(
        new DatabaseOperationCounts.Counter());
    CommunityDatabaseState _spDatabaseState = new CommunityDatabaseState(null, true, false,
        new Throwable());

    databaseStateUpdateHandlerOppStatsImpl.sttchgForDaDa(_spDatabaseState,
        DatabaseStateEnterpriseImpl.inaunidDatabaseStateEnterpriseImpl());
  }
}

