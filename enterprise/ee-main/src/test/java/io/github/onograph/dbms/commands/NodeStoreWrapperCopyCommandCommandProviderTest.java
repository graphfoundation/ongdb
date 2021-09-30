package io.github.onograph.dbms.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.Command;
import org.neo4j.cli.ExecutionContext;

class NodeStoreWrapperCopyCommandCommandProviderTest {

  @Test
  void testCommandType() {
    assertEquals(Command.CommandType.STORE_COPY,
        (new NodeStoreWrapperCopyCommandCommandProvider()).commandType());
  }

  @Test
  void testCreateCommand() {

    NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider = new NodeStoreWrapperCopyCommandCommandProvider();
    nodeStoreWrapperCopyCommandCommandProvider
        .createCommand(
            new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testCreateCommand2() {

    NodeStoreWrapperCopyCommandCommandProvider nodeStoreWrapperCopyCommandCommandProvider = new NodeStoreWrapperCopyCommandCommandProvider();
    nodeStoreWrapperCopyCommandCommandProvider.createCommand(new ExecutionContext(
        Paths.get(System.getProperty("Key"), "More"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

