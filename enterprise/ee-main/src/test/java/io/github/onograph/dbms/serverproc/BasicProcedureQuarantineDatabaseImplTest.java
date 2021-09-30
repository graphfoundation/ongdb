package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import io.github.onograph.dbms.HealthMonitorService;
import java.io.Closeable;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.procs.FieldSignature;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.kernel.database.MapCachingDatabaseIdRepository;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.procedure.Mode;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class BasicProcedureQuarantineDatabaseImplTest {

  @Test
  void testClsrBasicProcedureQuarantineDatabaseImpl() {
    FakeClock _clock = Clocks.fakeClock();
    MapCachingDatabaseIdRepository _databaseIdRepository = new MapCachingDatabaseIdRepository(
        new MapCachingDatabaseIdRepository(
            new MapCachingDatabaseIdRepository(new MapCachingDatabaseIdRepository(null))));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));

    ProcedureSignature signatureResult = BasicProcedureQuarantineDatabaseImpl
        .clsrBasicProcedureQuarantineDatabaseImpl(_clock, _databaseIdRepository,
            _oqDbmsManagerWatchTagImpl,
            ZoneOffset.ofTotalSeconds(1))
        .signature();
    assertTrue(signatureResult.admin());
    assertEquals(
        "dbms.cluster.quarantineDatabase(databaseName :: STRING?, setStatus :: BOOLEAN?, reason = No reason"
            + " given :: STRING?) :: (databaseName :: STRING?, quarantined :: BOOLEAN?, result :: STRING?)",
        signatureResult.toString());
    assertTrue(signatureResult.systemProcedure());
    List<FieldSignature> outputSignatureResult = signatureResult.outputSignature();
    assertEquals(3, outputSignatureResult.size());
    assertEquals(0, signatureResult.allowed().length);
    assertFalse(signatureResult.eager());
    assertEquals(Mode.DBMS, signatureResult.mode());
    List<FieldSignature> inputSignatureResult = signatureResult.inputSignature();
    assertEquals(3, inputSignatureResult.size());
    assertFalse(signatureResult.caseInsensitive());
    assertFalse(signatureResult.internal());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("quarantineDatabase", nameResult.name());
    assertEquals(2, nameResult.namespace().length);
    FieldSignature getResult = outputSignatureResult.get(1);
    assertEquals("quarantined :: BOOLEAN?", getResult.toString());
    FieldSignature getResult1 = inputSignatureResult.get(2);
    assertEquals("reason = No reason given :: STRING?", getResult1.toString());
    assertEquals("reason", getResult1.name());
    assertFalse(getResult1.isSensitive());
    assertFalse(getResult1.isDeprecated());
    assertEquals("quarantined", getResult.name());
    assertFalse(getResult.isSensitive());
    assertFalse(getResult.isDeprecated());
    FieldSignature getResult2 = inputSignatureResult.get(1);
    assertEquals("setStatus", getResult2.name());
    assertFalse(getResult2.isSensitive());
    assertFalse(getResult2.isDeprecated());
    FieldSignature getResult3 = outputSignatureResult.get(2);
    assertFalse(getResult3.isSensitive());
    assertFalse(getResult3.isDeprecated());
    FieldSignature getResult4 = outputSignatureResult.get(0);
    assertFalse(getResult4.isDeprecated());
    FieldSignature getResult5 = inputSignatureResult.get(0);
    assertEquals("databaseName", getResult5.name());
    assertFalse(getResult5.isSensitive());
    assertFalse(getResult5.isDeprecated());
    assertEquals("databaseName :: STRING?", getResult5.toString());
    assertEquals("result", getResult3.name());
    assertEquals("result :: STRING?", getResult3.toString());
    assertEquals("databaseName", getResult4.name());
    assertEquals("databaseName :: STRING?", getResult4.toString());
    assertEquals("setStatus :: BOOLEAN?", getResult2.toString());
    assertFalse(getResult4.isSensitive());
  }

  @Test
  void testStnleBasicProcedureQuarantineDatabaseImpl() {
    FakeClock _clock = Clocks.fakeClock();
    MapCachingDatabaseIdRepository _databaseIdRepository = new MapCachingDatabaseIdRepository(
        new MapCachingDatabaseIdRepository(
            new MapCachingDatabaseIdRepository(new MapCachingDatabaseIdRepository(null))));
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    HealthMonitorService healthMonitorService = new HealthMonitorService(_fFileSystemAbstraction,
        _logProvider,
        new LocalMemoryTracker(), null);

    DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl = new DbmsManagerWatchTagImpl(
        healthMonitorService,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));

    ProcedureSignature signatureResult = BasicProcedureQuarantineDatabaseImpl
        .stnleBasicProcedureQuarantineDatabaseImpl(_clock, _databaseIdRepository,
            _oqDbmsManagerWatchTagImpl,
            ZoneOffset.ofTotalSeconds(1))
        .signature();
    assertTrue(signatureResult.admin());
    assertEquals(
        "dbms.quarantineDatabase(databaseName :: STRING?, setStatus :: BOOLEAN?, reason = No reason given ::"
            + " STRING?) :: (databaseName :: STRING?, quarantined :: BOOLEAN?, result :: STRING?)",
        signatureResult.toString());
    assertTrue(signatureResult.systemProcedure());
    List<FieldSignature> outputSignatureResult = signatureResult.outputSignature();
    assertEquals(3, outputSignatureResult.size());
    assertEquals(0, signatureResult.allowed().length);
    assertFalse(signatureResult.eager());
    assertEquals(Mode.DBMS, signatureResult.mode());
    List<FieldSignature> inputSignatureResult = signatureResult.inputSignature();
    assertEquals(3, inputSignatureResult.size());
    assertFalse(signatureResult.caseInsensitive());
    assertFalse(signatureResult.internal());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("quarantineDatabase", nameResult.name());
    assertEquals(1, nameResult.namespace().length);
    FieldSignature getResult = outputSignatureResult.get(1);
    assertEquals("quarantined :: BOOLEAN?", getResult.toString());
    FieldSignature getResult1 = inputSignatureResult.get(2);
    assertEquals("reason = No reason given :: STRING?", getResult1.toString());
    assertEquals("reason", getResult1.name());
    assertFalse(getResult1.isSensitive());
    assertFalse(getResult1.isDeprecated());
    assertEquals("quarantined", getResult.name());
    assertFalse(getResult.isSensitive());
    assertFalse(getResult.isDeprecated());
    FieldSignature getResult2 = inputSignatureResult.get(1);
    assertEquals("setStatus", getResult2.name());
    assertFalse(getResult2.isSensitive());
    assertFalse(getResult2.isDeprecated());
    FieldSignature getResult3 = outputSignatureResult.get(2);
    assertFalse(getResult3.isSensitive());
    assertFalse(getResult3.isDeprecated());
    FieldSignature getResult4 = outputSignatureResult.get(0);
    assertFalse(getResult4.isDeprecated());
    FieldSignature getResult5 = inputSignatureResult.get(0);
    assertEquals("databaseName", getResult5.name());
    assertFalse(getResult5.isSensitive());
    assertFalse(getResult5.isDeprecated());
    assertEquals("databaseName :: STRING?", getResult5.toString());
    assertEquals("result", getResult3.name());
    assertEquals("result :: STRING?", getResult3.toString());
    assertEquals("databaseName", getResult4.name());
    assertEquals("databaseName :: STRING?", getResult4.toString());
    assertEquals("setStatus :: BOOLEAN?", getResult2.toString());
    assertFalse(getResult4.isSensitive());
  }
}

