package io.github.onograph.dbms.crash;

import static org.mockito.Mockito.mock;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.internal.SimpleLogService;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.test.OnDemandJobScheduler;

class CrashManagerImplTest {

  @Test
  void testConstructor() {

    GdbCrashGenerator gdbCrashGenerator = mock(GdbCrashGenerator.class);
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    new CrashManagerImpl(gdbCrashGenerator, _jobScheduler, new SimpleLogService(
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))));
  }

  @Test
  void testConstructor2() {

    GdbCrashGenerator gdbCrashGenerator = mock(GdbCrashGenerator.class);
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    new CrashManagerImpl(gdbCrashGenerator, _jobScheduler,
        new SimpleLogService(new Log4jLogProvider(new ByteArrayOutputStream(3))));
  }

  @Test
  void testAddtepcethlForNaLi() {

    GdbCrashGenerator gdbCrashGenerator = mock(GdbCrashGenerator.class);
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    CrashManagerImpl crashManagerImpl = new CrashManagerImpl(gdbCrashGenerator, _jobScheduler,
        new SimpleLogService(
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)))));
    crashManagerImpl.addtepcethlForNaLi(new ArrayList<DbmsCrashManager>(),
        mock(NamedDatabaseId.class));
  }

  @Test
  void testAddtepcethlForNaLi2() {

    GdbCrashGenerator gdbCrashGenerator = mock(GdbCrashGenerator.class);
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    CrashManagerImpl crashManagerImpl = new CrashManagerImpl(gdbCrashGenerator, _jobScheduler,
        new SimpleLogService(new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name", "External Context"),
                mock(Closeable.class)))));
    crashManagerImpl.addtepcethlForNaLi(new ArrayList<DbmsCrashManager>(),
        mock(NamedDatabaseId.class));
  }

  @Test
  void testReedbpaevharForNa() {

    GdbCrashGenerator gdbCrashGenerator = mock(GdbCrashGenerator.class);
    OnDemandJobScheduler _jobScheduler = new OnDemandJobScheduler(true);
    (new CrashManagerImpl(gdbCrashGenerator, _jobScheduler,
        new SimpleLogService(
            new Log4jLogProvider(
                new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class))))))
        .reedbpaevharForNa(mock(NamedDatabaseId.class));
  }
}

