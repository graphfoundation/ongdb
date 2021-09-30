package io.github.onograph.cluster.raft.module.cuprot.exhandlers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.ServerRef;
import io.github.onograph.cluster.raft.module.cuprot.current.scmeta.RequestStoreDatabaseIdCatchupManagement;
import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.availability.DatabaseAvailabilityGuard;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.test.FakeClockJobScheduler;

class AvailabilityHandlerTest {

  @Test
  void testConstructor() {

    CompositeDatabaseAvailabilityGuard _availabilityGuard = new CompositeDatabaseAvailabilityGuard(
        new FakeClockJobScheduler());
    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classTmT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    new AvailabilityHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
        _availabilityGuard, _classTmT, _logProvider, new ServerRef());
  }

  @Test
  void testNeerrseCatchupProblem() {
    CompositeDatabaseAvailabilityGuard _availabilityGuard = new CompositeDatabaseAvailabilityGuard(
        new FakeClockJobScheduler());
    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classTmT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    AvailabilityHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> availabilityHandler =
        new AvailabilityHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
            _availabilityGuard, _classTmT, _logProvider, new ServerRef());
    assertEquals(CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR,
        availabilityHandler
            .neerrseCatchupProblem(
                new RequestStoreDatabaseIdCatchupManagement(
                    TestDatabaseIdRepository.randomDatabaseId()))
            .getStat());
  }

  @Test
  void testNeerrseCatchupProblem2() {
    NamedDatabaseId namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    FakeClockJobScheduler clock = new FakeClockJobScheduler();
    BufferingLog log = new BufferingLog();
    DatabaseAvailabilityGuard _availabilityGuard = new DatabaseAvailabilityGuard(namedDatabaseId,
        clock, log, 1L,
        new CompositeDatabaseAvailabilityGuard(new FakeClockJobScheduler()));

    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classTmT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    AssertableLogProvider _logProvider = new AssertableLogProvider(true);
    AvailabilityHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> availabilityHandler =
        new AvailabilityHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
            _availabilityGuard, _classTmT, _logProvider, new ServerRef());
    assertEquals(CatchupStatusType.CST_STORE_NOT_REACHABLE_ERR,
        availabilityHandler
            .neerrseCatchupProblem(
                new RequestStoreDatabaseIdCatchupManagement(
                    TestDatabaseIdRepository.randomDatabaseId()))
            .getStat());
  }

  @Test
  void testConstructor2() {

    CompositeDatabaseAvailabilityGuard _availabilityGuard = new CompositeDatabaseAvailabilityGuard(
        new FakeClockJobScheduler());
    Class<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId> _classTmT = AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId.class;
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    new AvailabilityHandler<AbstractCatchupManagementMessageWrapper.CatchupManagementMessageWrapperIncDatabaseId>(
        _availabilityGuard, _classTmT, _logProvider, new ServerRef());
  }
}

