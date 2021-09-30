package io.github.onograph.fabric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.connectors.ConnectorPortRegister;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.internal.kernel.api.procs.FieldSignature;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.logging.Level;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.logging.shaded.log4j.core.LoggerContext;
import org.neo4j.procedure.Mode;

class RoutingProcedureInstallerTest {

  @Test
  void testCreateProcedure() {
    Config config = mock(Config.class);
    when(config.get(any())).thenReturn("Get");
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    EnterpriseFabricConfiguration _enterpriseFabricConfiguration = new EnterpriseFabricConfiguration(
        _dataStream,
        defaultDriverSettings, gdbRef, true, true,
        new ArrayList<SocketAddress>(), null, null);

    FabricDatabaseManager _fabricDatabaseManager = mock(FabricDatabaseManager.class);
    RoutingProcedureInstaller routingProcedureInstaller = new RoutingProcedureInstaller(null,
        config,
        _connectorPortRegister, null, _enterpriseFabricConfiguration,
        _fabricDatabaseManager,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    ProcedureSignature signatureResult = routingProcedureInstaller.createProcedure(
        new ArrayList<String>()).signature();
    assertFalse(signatureResult.admin());
    assertEquals(
        "getRoutingTable(context :: MAP?, database = null :: STRING?) :: (ttl :: INTEGER?, servers :: LIST?"
            + " OF MAP?)", signatureResult.toString());
    assertTrue(signatureResult.systemProcedure());
    List<FieldSignature> outputSignatureResult = signatureResult.outputSignature();
    assertEquals(2, outputSignatureResult.size());
    assertEquals(0, signatureResult.allowed().length);
    assertFalse(signatureResult.eager());
    assertEquals(Mode.DBMS, signatureResult.mode());
    List<FieldSignature> inputSignatureResult = signatureResult.inputSignature();
    assertEquals(2, inputSignatureResult.size());
    assertFalse(signatureResult.caseInsensitive());
    assertFalse(signatureResult.internal());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("getRoutingTable", nameResult.name());
    assertEquals(0, nameResult.namespace().length);
    FieldSignature getResult = inputSignatureResult.get(0);
    assertEquals("context :: MAP?", getResult.toString());
    FieldSignature getResult1 = outputSignatureResult.get(0);
    assertEquals("ttl :: INTEGER?", getResult1.toString());
    assertEquals("ttl", getResult1.name());
    assertFalse(getResult1.isSensitive());
    assertFalse(getResult1.isDeprecated());
    assertEquals("context", getResult.name());
    assertFalse(getResult.isSensitive());
    assertFalse(getResult.isDeprecated());
    FieldSignature getResult2 = outputSignatureResult.get(1);
    assertEquals("servers", getResult2.name());
    assertFalse(getResult2.isSensitive());
    assertFalse(getResult2.isDeprecated());
    FieldSignature getResult3 = inputSignatureResult.get(1);
    assertFalse(getResult3.isSensitive());
    assertEquals("database = null :: STRING?", getResult3.toString());
    assertEquals("servers :: LIST? OF MAP?", getResult2.toString());
    assertFalse(getResult3.isDeprecated());
    assertEquals("database", getResult3.name());
    verify(config).get(any());
  }

  @Test
  void testCreateProcedure2() {
    Config config = mock(Config.class);
    when(config.get(any())).thenReturn("foo");
    ConnectorPortRegister _connectorPortRegister = new ConnectorPortRegister();
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(1, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    EnterpriseFabricConfiguration _enterpriseFabricConfiguration = new EnterpriseFabricConfiguration(
        _dataStream,
        defaultDriverSettings, gdbRef, true, true,
        new ArrayList<SocketAddress>(), null, null);

    FabricDatabaseManager _fabricDatabaseManager = mock(FabricDatabaseManager.class);
    RoutingProcedureInstaller routingProcedureInstaller = new RoutingProcedureInstaller(null,
        config,
        _connectorPortRegister, null, _enterpriseFabricConfiguration,
        _fabricDatabaseManager,
        new Log4jLogProvider(
            new Neo4jLoggerContext(new LoggerContext("Name"),
                mock(Closeable.class))));
    ProcedureSignature signatureResult = routingProcedureInstaller.createProcedure(
        new ArrayList<String>()).signature();
    assertFalse(signatureResult.admin());
    assertEquals(
        "getRoutingTable(context :: MAP?, database = null :: STRING?) :: (ttl :: INTEGER?, servers :: LIST?"
            + " OF MAP?)", signatureResult.toString());
    assertTrue(signatureResult.systemProcedure());
    List<FieldSignature> outputSignatureResult = signatureResult.outputSignature();
    assertEquals(2, outputSignatureResult.size());
    assertEquals(0, signatureResult.allowed().length);
    assertFalse(signatureResult.eager());
    assertEquals(Mode.DBMS, signatureResult.mode());
    List<FieldSignature> inputSignatureResult = signatureResult.inputSignature();
    assertEquals(2, inputSignatureResult.size());
    assertFalse(signatureResult.caseInsensitive());
    assertFalse(signatureResult.internal());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("getRoutingTable", nameResult.name());
    assertEquals(0, nameResult.namespace().length);
    FieldSignature getResult = inputSignatureResult.get(0);
    assertEquals("context :: MAP?", getResult.toString());
    FieldSignature getResult1 = outputSignatureResult.get(0);
    assertEquals("ttl :: INTEGER?", getResult1.toString());
    assertEquals("ttl", getResult1.name());
    assertFalse(getResult1.isSensitive());
    assertFalse(getResult1.isDeprecated());
    assertEquals("context", getResult.name());
    assertFalse(getResult.isSensitive());
    assertFalse(getResult.isDeprecated());
    FieldSignature getResult2 = outputSignatureResult.get(1);
    assertEquals("servers", getResult2.name());
    assertFalse(getResult2.isSensitive());
    assertFalse(getResult2.isDeprecated());
    FieldSignature getResult3 = inputSignatureResult.get(1);
    assertFalse(getResult3.isSensitive());
    assertEquals("database = null :: STRING?", getResult3.toString());
    assertEquals("servers :: LIST? OF MAP?", getResult2.toString());
    assertFalse(getResult3.isDeprecated());
    assertEquals("database", getResult3.name());
    verify(config).get(any());
  }
}

