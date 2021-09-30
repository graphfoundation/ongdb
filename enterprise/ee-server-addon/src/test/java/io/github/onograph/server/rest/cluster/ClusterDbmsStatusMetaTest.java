package io.github.onograph.server.rest.cluster;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.ws.rs.WebApplicationException;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.dbms.database.DatabaseManagementServiceImpl;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.internal.event.GlobalTransactionEventListeners;
import org.neo4j.kernel.monitoring.DatabaseEventListeners;
import org.neo4j.time.Clocks;

class ClusterDbmsStatusMetaTest {

  @Test
  void testConstructor() {

    CompositeDatabaseAvailabilityGuard globalAvailabilityGuard = new CompositeDatabaseAvailabilityGuard(
        Clocks.fakeClock());
    NodeServerMemberTransactionLogDataMeta globalLife = new NodeServerMemberTransactionLogDataMeta();
    DatabaseEventListeners databaseEventListeners = new DatabaseEventListeners(new BufferingLog());
    GlobalTransactionEventListeners transactionEventListeners = new GlobalTransactionEventListeners();
    new ClusterDbmsStatusMeta(
        new DatabaseManagementServiceImpl(null, globalAvailabilityGuard, globalLife,
            databaseEventListeners, transactionEventListeners, new BufferingLog(),
            mock(Config.class)));
  }

  @Test
  void testWrite() throws IOException, WebApplicationException {
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    when(databaseManagementService.listDatabases()).thenReturn(new ArrayList<String>());
    ClusterDbmsStatusMeta clusterDbmsStatusMeta = new ClusterDbmsStatusMeta(
        databaseManagementService);
    clusterDbmsStatusMeta.write(new ByteArrayOutputStream(3));
    verify(databaseManagementService).listDatabases();
  }

  @Test
  void testWrite2() throws IOException, WebApplicationException, DatabaseNotFoundException {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    when(databaseManagementService.database((String) any()))
        .thenThrow(new DatabaseNotFoundException("An error occurred"));
    when(databaseManagementService.listDatabases()).thenReturn(stringList);
    ClusterDbmsStatusMeta clusterDbmsStatusMeta = new ClusterDbmsStatusMeta(
        databaseManagementService);
    clusterDbmsStatusMeta.write(new ByteArrayOutputStream(3));
    verify(databaseManagementService).database((String) any());
    verify(databaseManagementService).listDatabases();
  }
}

