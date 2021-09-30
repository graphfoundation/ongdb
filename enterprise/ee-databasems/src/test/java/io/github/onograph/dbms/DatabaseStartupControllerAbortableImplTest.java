package io.github.onograph.dbms;

import static org.mockito.Mockito.mock;

import io.github.onograph.dbms.crash.GdbCrashCauseInfo;
import io.github.onograph.dbms.crash.GdbCrashEvent;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.kernel.availability.CompositeDatabaseAvailabilityGuard;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class DatabaseStartupControllerAbortableImplTest {

  @Test
  void testConstructor() {

    FakeClock _clock = Clocks.fakeClock();
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    new DatabaseStartupControllerAbortableImpl(_clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null);
  }

  @Test
  void testConstructor2() {

    FakeClock _clock = Clocks.fakeClock(1L, TimeUnit.NANOSECONDS);
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    new DatabaseStartupControllerAbortableImpl(_clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null);
  }

  @Test
  void testAluabForNaDa() {

    FakeClock _clock = Clocks.fakeClock();
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    (new DatabaseStartupControllerAbortableImpl(_clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null)).aluabForNaDa(
        mock(NamedDatabaseId.class),
        DatabaseStartupControllerAbortableImpl.PreventReason.PR_SC);
  }

  @Test
  void testHandleCrash() {

    FakeClock _clock = Clocks.fakeClock();
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    DatabaseStartupControllerAbortableImpl databaseStartupControllerAbortableImpl = new DatabaseStartupControllerAbortableImpl(
        _clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null);
    databaseStartupControllerAbortableImpl
        .handleCrash(new GdbCrashEvent(new Throwable(), mock(NamedDatabaseId.class),
            GdbCrashCauseInfo.CCI_IT));
  }

  @Test
  void testPrnuratForNaDa() {

    FakeClock _clock = Clocks.fakeClock();
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    (new DatabaseStartupControllerAbortableImpl(_clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null)).prnuratForNaDa(
        mock(NamedDatabaseId.class),
        DatabaseStartupControllerAbortableImpl.PreventReason.PR_SC);
  }

  @Test
  void testReefoForNa() {

    FakeClock _clock = Clocks.fakeClock();
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    (new DatabaseStartupControllerAbortableImpl(_clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null)).reefoForNa(
        mock(NamedDatabaseId.class));
  }

  @Test
  void testStrdForNa() {

    FakeClock _clock = Clocks.fakeClock();
    DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel = new DefaultSystemGraphDbmsModel(
        (Supplier<GraphDatabaseService>) mock(Supplier.class));
    (new DatabaseStartupControllerAbortableImpl(_clock, _defaultSystemGraphDbmsModel,
        new CompositeDatabaseAvailabilityGuard(Clocks.fakeClock()), null)).strdForNa(
        mock(NamedDatabaseId.class));
  }
}

