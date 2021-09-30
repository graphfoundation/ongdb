package io.github.onograph.dbms.service;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.dbms.api.DatabaseExistsException;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.dbms.database.DatabaseManagementServiceImpl;
import org.neo4j.graphdb.config.Configuration;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.kernel.internal.event.InternalTransactionEventListener;
import org.neo4j.kernel.monitoring.DatabaseEventListeners;
import org.neo4j.time.Clocks;

class DatabaseManagementServiceClusterImplTest {

  @Test
  void testConstructor() {

    new DatabaseManagementServiceClusterImpl(
        new DatabaseManagementServiceClusterImpl(new DatabaseManagementServiceClusterImpl(
            new DatabaseManagementServiceClusterImpl(
                new DatabaseManagementServiceClusterImpl(null)))));
  }

  @Test
  void testCreateDatabase() throws DatabaseExistsException {
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    doNothing().when(databaseManagementService).createDatabase(any());
    (new DatabaseManagementServiceClusterImpl(
        new DatabaseManagementServiceClusterImpl(
            new DatabaseManagementServiceClusterImpl(databaseManagementService))))
        .createDatabase("Gdb Name", mock(Configuration.class));
    verify(databaseManagementService).createDatabase(any());
  }

  @Test
  void testDatabase() throws DatabaseNotFoundException {
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    when(databaseManagementService.database(any())).thenReturn(null);
    assertNull((new DatabaseManagementServiceClusterImpl(
        new DatabaseManagementServiceClusterImpl(
            new DatabaseManagementServiceClusterImpl(databaseManagementService))))
        .database("Gdb Name"));
    verify(databaseManagementService).database(any());
  }

  @Test
  void testRegisterTransactionEventListener() {

    CompositeDatabaseAvailabilityGuard globalAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        Clocks.fakeClock());
    NodeServerMemberTransactionLogDataMeta globalLife = new NodeServerMemberTransactionLogDataMeta();
    DatabaseEventListeners databaseEventListeners = new DatabaseEventListeners(new BufferingLog());
    GlobalTransactionEventListeners transactionEventListeners = new GlobalTransactionEventListeners();
    DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl = new DatabaseManagementServiceClusterImpl(
        new DatabaseManagementServiceClusterImpl(
            new DatabaseManagementServiceClusterImpl(
                new DatabaseManagementServiceImpl(null, globalAvailabilityGuard,
                    globalLife, databaseEventListeners,
                    transactionEventListeners, new BufferingLog(),
                    null))));
    databaseManagementServiceClusterImpl.registerTransactionEventListener("Gdb Name",
        new InternalTransactionEventListener.Adapter<Object>());
  }

  @Test
  void testUnregisterTransactionEventListener() {
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    doNothing().when(databaseManagementService)
        .unregisterTransactionEventListener(any(),
            any());
    DatabaseManagementServiceClusterImpl databaseManagementServiceClusterImpl = new DatabaseManagementServiceClusterImpl(
        new DatabaseManagementServiceClusterImpl(
            new DatabaseManagementServiceClusterImpl(databaseManagementService)));
    databaseManagementServiceClusterImpl.unregisterTransactionEventListener("Gdb Name",
        new InternalTransactionEventListener.Adapter<Object>());
    verify(databaseManagementService).unregisterTransactionEventListener(any(),
        any());
  }
}

