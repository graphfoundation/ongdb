package io.github.onograph.server.rest.cluster;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.dbms.CommunityDatabaseStateService;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.server.http.cypher.format.output.json.StreamingJsonFormat;
import org.neo4j.server.rest.repr.OutputFormat;

class RestGdbApiManagerTest {

  @Test
  void testBulClusterRestApi() throws DatabaseNotFoundException {
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    when(databaseManagementService.database((String) any()))
        .thenThrow(new DatabaseNotFoundException("An error occurred"));
    OutputFormat _outputFormat = new OutputFormat(new StreamingJsonFormat(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    MultiGdbService _scMultiGdbService = mock(MultiGdbService.class);
    assertTrue(
        RestGdbApiManager.bulClusterRestApi(databaseManagementService, "Gdb Name", _outputFormat,
            _scMultiGdbService, new CommunityDatabaseStateService(null)) instanceof ApiReplyDTO);
    verify(databaseManagementService).database((String) any());
  }

  @Test
  void testBulClusterRestApi2() throws DatabaseNotFoundException {
    DatabaseManagementService databaseManagementService = mock(DatabaseManagementService.class);
    when(databaseManagementService.database((String) any())).thenReturn(null);
    OutputFormat _outputFormat = new OutputFormat(new StreamingJsonFormat(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());

    MultiGdbService _scMultiGdbService = mock(MultiGdbService.class);
    assertTrue(
        RestGdbApiManager.bulClusterRestApi(databaseManagementService, "Gdb Name", _outputFormat,
            _scMultiGdbService, new CommunityDatabaseStateService(null)) instanceof ApiReplyDTO);
    verify(databaseManagementService).database((String) any());
  }
}

