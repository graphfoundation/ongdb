package io.github.onograph.cluster.raft.module.cuprot.exhandlers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement;
import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;

class GdbMissingHandlerTest {

  @Test
  void testConstructor() {

    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classMtT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    new GdbMissingHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
        _classMtT, _logProvider, new ServerRef());
  }

  @Test
  void testNeerrseCatchupProblem() {
    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classMtT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    GdbMissingHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> gdbMissingHandler =
        new GdbMissingHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
            _classMtT, _logProvider, new ServerRef());
    assertEquals(CatchupStatusType.CST_UNKNOWN_GDB_ERR,
        gdbMissingHandler
            .neerrseCatchupProblem(
                new RequestStoreDatabaseIdCatchupManagement(
                    TestDatabaseIdRepository.randomDatabaseId()))
            .getStat());
  }

  @Test
  void testConstructor2() {

    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classMtT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    new GdbMissingHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
        _classMtT, _logProvider, new ServerRef());
  }
}

