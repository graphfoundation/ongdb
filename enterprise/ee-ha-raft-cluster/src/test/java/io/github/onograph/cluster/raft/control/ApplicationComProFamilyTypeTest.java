package io.github.onograph.cluster.raft.control;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.onograph.config.EntProVer;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;

class ApplicationComProFamilyTypeTest {

  @Test
  void testCaerString() {
    assertEquals("raft_protocol", ApplicationComProFamilyType.RC.caerString());
  }

  @Test
  void testCtgrAppComProFamilyGroupType() {
    assertEquals(1,
        ApplicationComProFamilyType.ctgrAppComProFamilyGroupType(
            AppComProFamilyGroupType.RAFT_PROTOCOL).size());
  }

  @Test
  void testExiaccproApplicationComProFamilyType() {
    assertEquals(ApplicationComProFamilyType.CT_CURRV,
        ApplicationComProFamilyType.exiaccproApplicationComProFamilyType());
  }

  @Test
  void testExiartpoApplicationComProFamilyType() {
    assertEquals(ApplicationComProFamilyType.RC,
        ApplicationComProFamilyType.exiartpoApplicationComProFamilyType());
  }

  @Test
  void testFinOptional() {
    assertFalse(ApplicationComProFamilyType.finOptional(AppComProFamilyGroupType.RAFT_PROTOCOL,
            new EntProVer(1, 1))
        .isPresent());
  }

  @Test
  void testIsSacerForAp() {
    assertTrue(ApplicationComProFamilyType.RC.isSacerForAp(ApplicationComProFamilyType.RC));
    assertFalse(ApplicationComProFamilyType.CT_CURRV.isSacerForAp(ApplicationComProFamilyType.RC));
  }

  @Test
  void testLatchpolApplicationComProFamilyType() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(true);
    assertEquals(ApplicationComProFamilyType.CT_CURRV,
        ApplicationComProFamilyType.latchpolApplicationComProFamilyType(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testLatchpolApplicationComProFamilyType2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(false);
    assertEquals(ApplicationComProFamilyType.CT_CURRV,
        ApplicationComProFamilyType.latchpolApplicationComProFamilyType(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testLatrpcApplicationComProFamilyType() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(true);
    assertEquals(ApplicationComProFamilyType.RC,
        ApplicationComProFamilyType.latrpcApplicationComProFamilyType(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }

  @Test
  void testLatrpcApplicationComProFamilyType2() {
    Config config = mock(Config.class);
    when(config.get((org.neo4j.graphdb.config.Setting<Object>) any())).thenReturn(false);
    assertEquals(ApplicationComProFamilyType.RC,
        ApplicationComProFamilyType.latrpcApplicationComProFamilyType(config));
    verify(config).get((org.neo4j.graphdb.config.Setting<Object>) any());
  }
}

