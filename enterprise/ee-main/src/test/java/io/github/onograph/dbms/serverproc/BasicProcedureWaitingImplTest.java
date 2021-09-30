package io.github.onograph.dbms.serverproc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.CommunityDatabaseStateService;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.internal.kernel.api.procs.FieldSignature;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.procedure.Mode;
import org.neo4j.time.Clocks;
import org.neo4j.time.FakeClock;

class BasicProcedureWaitingImplTest {

  @Test
  void testStnleBasicProcedureWaitingImpl() {
    FakeClock _clock = Clocks.fakeClock();
    Log4jLogProvider _logProvider = new Log4jLogProvider(
        new Neo4jLoggerContext(new LoggerContext("Name"), mock(Closeable.class)));
    ServerId _mslServerId = new ServerId(UUID.randomUUID());
    MetaService _piMetaService = new MetaService(null, new CommunityDatabaseStateService(null));

    ProcedureSignature signatureResult = BasicProcedureWaitingImpl
        .stnleBasicProcedureWaitingImpl(_clock, _logProvider, _mslServerId, _piMetaService,
            new SocketAddress("localhost"))
        .signature();
    assertTrue(signatureResult.admin());
    assertEquals(
        "dbms.admin.wait(systemTxId :: NUMBER?, databaseId :: STRING?, databaseName :: STRING?, timeoutSeconds"
            + " :: NUMBER?) :: (address :: STRING?, state :: STRING?, message :: STRING?, success :: BOOLEAN?)",
        signatureResult.toString());
    assertTrue(signatureResult.systemProcedure());
    List<FieldSignature> outputSignatureResult = signatureResult.outputSignature();
    assertEquals(4, outputSignatureResult.size());
    assertEquals(0, signatureResult.allowed().length);
    assertFalse(signatureResult.eager());
    assertEquals(Mode.DBMS, signatureResult.mode());
    List<FieldSignature> inputSignatureResult = signatureResult.inputSignature();
    assertEquals(4, inputSignatureResult.size());
    assertFalse(signatureResult.caseInsensitive());
    assertTrue(signatureResult.internal());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("wait", nameResult.name());
    assertEquals(2, nameResult.namespace().length);
    FieldSignature getResult = outputSignatureResult.get(2);
    assertEquals("message :: STRING?", getResult.toString());
    FieldSignature getResult1 = inputSignatureResult.get(3);
    assertEquals("timeoutSeconds", getResult1.name());
    assertFalse(getResult1.isSensitive());
    assertFalse(getResult1.isDeprecated());
    assertEquals("message", getResult.name());
    assertFalse(getResult.isSensitive());
    assertFalse(getResult.isDeprecated());
    FieldSignature getResult2 = inputSignatureResult.get(2);
    assertEquals("databaseName", getResult2.name());
    assertFalse(getResult2.isSensitive());
    assertFalse(getResult2.isDeprecated());
    FieldSignature getResult3 = outputSignatureResult.get(1);
    assertEquals("state", getResult3.name());
    assertFalse(getResult3.isSensitive());
    assertFalse(getResult3.isDeprecated());
    FieldSignature getResult4 = outputSignatureResult.get(0);
    assertFalse(getResult4.isSensitive());
    assertFalse(getResult4.isDeprecated());
    FieldSignature getResult5 = outputSignatureResult.get(3);
    assertEquals("success", getResult5.name());
    assertFalse(getResult5.isSensitive());
    assertFalse(getResult5.isDeprecated());
    FieldSignature getResult6 = inputSignatureResult.get(0);
    assertFalse(getResult6.isDeprecated());
    FieldSignature getResult7 = inputSignatureResult.get(1);
    assertEquals("databaseId", getResult7.name());
    assertFalse(getResult7.isSensitive());
    assertFalse(getResult7.isDeprecated());
    assertFalse(getResult6.isSensitive());
    assertEquals("systemTxId :: NUMBER?", getResult6.toString());
    assertEquals("databaseId :: STRING?", getResult7.toString());
    assertEquals("state :: STRING?", getResult3.toString());
    assertEquals("address", getResult4.name());
    assertEquals("success :: BOOLEAN?", getResult5.toString());
    assertEquals("systemTxId", getResult6.name());
    assertEquals("databaseName :: STRING?", getResult2.toString());
    assertEquals("address :: STRING?", getResult4.toString());
  }

  @Test
  void testStnleBasicProcedureWaitingImpl2() {
    FakeClock _clock = Clocks.fakeClock();
    Log4jLogProvider _logProvider = new Log4jLogProvider(new ByteArrayOutputStream(3));
    ServerId _mslServerId = new ServerId(UUID.randomUUID());
    MetaService _piMetaService = new MetaService(null, new CommunityDatabaseStateService(null));

    ProcedureSignature signatureResult = BasicProcedureWaitingImpl
        .stnleBasicProcedureWaitingImpl(_clock, _logProvider, _mslServerId, _piMetaService,
            new SocketAddress("localhost"))
        .signature();
    assertTrue(signatureResult.admin());
    assertEquals(
        "dbms.admin.wait(systemTxId :: NUMBER?, databaseId :: STRING?, databaseName :: STRING?, timeoutSeconds"
            + " :: NUMBER?) :: (address :: STRING?, state :: STRING?, message :: STRING?, success :: BOOLEAN?)",
        signatureResult.toString());
    assertTrue(signatureResult.systemProcedure());
    List<FieldSignature> outputSignatureResult = signatureResult.outputSignature();
    assertEquals(4, outputSignatureResult.size());
    assertEquals(0, signatureResult.allowed().length);
    assertFalse(signatureResult.eager());
    assertEquals(Mode.DBMS, signatureResult.mode());
    List<FieldSignature> inputSignatureResult = signatureResult.inputSignature();
    assertEquals(4, inputSignatureResult.size());
    assertFalse(signatureResult.caseInsensitive());
    assertTrue(signatureResult.internal());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("wait", nameResult.name());
    assertEquals(2, nameResult.namespace().length);
    FieldSignature getResult = outputSignatureResult.get(2);
    assertEquals("message :: STRING?", getResult.toString());
    FieldSignature getResult1 = inputSignatureResult.get(3);
    assertEquals("timeoutSeconds", getResult1.name());
    assertFalse(getResult1.isSensitive());
    assertFalse(getResult1.isDeprecated());
    assertEquals("message", getResult.name());
    assertFalse(getResult.isSensitive());
    assertFalse(getResult.isDeprecated());
    FieldSignature getResult2 = inputSignatureResult.get(2);
    assertEquals("databaseName", getResult2.name());
    assertFalse(getResult2.isSensitive());
    assertFalse(getResult2.isDeprecated());
    FieldSignature getResult3 = outputSignatureResult.get(1);
    assertEquals("state", getResult3.name());
    assertFalse(getResult3.isSensitive());
    assertFalse(getResult3.isDeprecated());
    FieldSignature getResult4 = outputSignatureResult.get(0);
    assertFalse(getResult4.isSensitive());
    assertFalse(getResult4.isDeprecated());
    FieldSignature getResult5 = outputSignatureResult.get(3);
    assertEquals("success", getResult5.name());
    assertFalse(getResult5.isSensitive());
    assertFalse(getResult5.isDeprecated());
    FieldSignature getResult6 = inputSignatureResult.get(0);
    assertFalse(getResult6.isDeprecated());
    FieldSignature getResult7 = inputSignatureResult.get(1);
    assertEquals("databaseId", getResult7.name());
    assertFalse(getResult7.isSensitive());
    assertFalse(getResult7.isDeprecated());
    assertFalse(getResult6.isSensitive());
    assertEquals("systemTxId :: NUMBER?", getResult6.toString());
    assertEquals("databaseId :: STRING?", getResult7.toString());
    assertEquals("state :: STRING?", getResult3.toString());
    assertEquals("address", getResult4.name());
    assertEquals("success :: BOOLEAN?", getResult5.toString());
    assertEquals("systemTxId", getResult6.name());
    assertEquals("databaseName :: STRING?", getResult2.toString());
    assertEquals("address :: STRING?", getResult4.toString());
  }
}

