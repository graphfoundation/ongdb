package io.github.onograph.fabric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.ArrayList;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.internal.kernel.api.procs.UserFunctionSignature;
import org.neo4j.logging.Level;

class CallableUserFunctionFabricGraphIdsImplTest {

  @Test
  void testConstructor() {
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

    UserFunctionSignature signatureResult = (new CallableUserFunctionFabricGraphIdsImpl(
        new EnterpriseFabricConfiguration(_dataStream, defaultDriverSettings, gdbRef, true, true,
            new ArrayList<SocketAddress>(), null, null))).signature();
    assertEquals(0, signatureResult.allowed().length);
    assertEquals("name.graphIds() :: (LIST? OF INTEGER?)", signatureResult.toString());
    assertTrue(signatureResult.isBuiltIn());
    assertTrue(signatureResult.caseInsensitive());
    assertTrue(signatureResult.inputSignature().isEmpty());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("graphIds", nameResult.name());
    assertEquals(1, nameResult.namespace().length);
  }

  @Test
  void testConstructor2() {
    FabricConfig.DataStream _dataStream = new FabricConfig.DataStream(0, 3, 3, 1);

    EnterpriseFabricConfiguration.DefaultDriverSettings defaultDriverSettings = new EnterpriseFabricConfiguration.DefaultDriverSettings(
        new EnterpriseFabricConfiguration.DriverSettings(GraphDatabaseSettings.DriverApi.RX, 1,
            true, null, Level.DEBUG,
            null, null, null),
        1, null, null);

    HashSet<EnterpriseFabricConfiguration.GdbWrapper> gdbWrappers = new HashSet<EnterpriseFabricConfiguration.GdbWrapper>();
    EnterpriseFabricConfiguration.GdbRef gdbRef = new EnterpriseFabricConfiguration.GdbRef(
        gdbWrappers,
        new NormalizedDatabaseName("Name"));

    UserFunctionSignature signatureResult = (new CallableUserFunctionFabricGraphIdsImpl(
        new EnterpriseFabricConfiguration(_dataStream, defaultDriverSettings, gdbRef, true, true,
            new ArrayList<SocketAddress>(), null, null))).signature();
    assertEquals(0, signatureResult.allowed().length);
    assertEquals("name.graphIds() :: (LIST? OF INTEGER?)", signatureResult.toString());
    assertTrue(signatureResult.isBuiltIn());
    assertTrue(signatureResult.caseInsensitive());
    assertTrue(signatureResult.inputSignature().isEmpty());
    QualifiedName nameResult = signatureResult.name();
    assertEquals("graphIds", nameResult.name());
    assertEquals(1, nameResult.namespace().length);
  }

  @Test
  void testSignature() {

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

    (new CallableUserFunctionFabricGraphIdsImpl(
        new EnterpriseFabricConfiguration(_dataStream, defaultDriverSettings,
            gdbRef, true, true, new ArrayList<SocketAddress>(), null,
            null))).signature();
  }

  @Test
  void testThreadSafe() {
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

    assertTrue(
        (new CallableUserFunctionFabricGraphIdsImpl(new EnterpriseFabricConfiguration(_dataStream,
            defaultDriverSettings, gdbRef, true, true,
            new ArrayList<SocketAddress>(), null,
            null))).threadSafe());
  }
}

