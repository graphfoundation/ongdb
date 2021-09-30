package io.github.onograph.server.rest.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class ClusterGdbStatusMetaTest {

  @Test
  void testConstructor() {
    ArrayList<ConsensusNodeId> consensusNodeIdList = new ArrayList<ConsensusNodeId>();
    UUID _imUUID = UUID.randomUUID();
    ClusterGdbStatusMeta actualClusterGdbStatusMeta = new ClusterGdbStatusMeta(consensusNodeIdList,
        _imUUID, true, true,
        true, true, UUID.randomUUID(), 1L, null, 10.0);

    assertEquals(consensusNodeIdList, actualClusterGdbStatusMeta.getCollectionMvString());
    assertTrue(actualClusterGdbStatusMeta.getIsCi());
    assertTrue(actualClusterGdbStatusMeta.getIsHdi());
    assertTrue(actualClusterGdbStatusMeta.getIsHi());
    assertTrue(actualClusterGdbStatusMeta.getIsIpirg());
    assertEquals(1L, actualClusterGdbStatusMeta.getLgIral());
    assertNull(actualClusterGdbStatusMeta.getLgMllsm());
    assertEquals(10.0, actualClusterGdbStatusMeta.getSpcrDouble().doubleValue());
  }

  @Test
  void testConstructor2() {
    ArrayList<ConsensusNodeId> consensusNodeIdList = new ArrayList<ConsensusNodeId>();
    UUID _imUUID = UUID.randomUUID();
    ClusterGdbStatusMeta actualClusterGdbStatusMeta = new ClusterGdbStatusMeta(consensusNodeIdList,
        _imUUID, true, true,
        true, true, UUID.randomUUID(), 1L, null, 10.0);

    assertEquals(consensusNodeIdList, actualClusterGdbStatusMeta.getCollectionMvString());
    assertEquals(10.0, actualClusterGdbStatusMeta.getSpcrDouble().doubleValue());
    assertNull(actualClusterGdbStatusMeta.getLgMllsm());
    assertEquals(1L, actualClusterGdbStatusMeta.getLgIral());
    assertTrue(actualClusterGdbStatusMeta.getIsIpirg());
    assertTrue(actualClusterGdbStatusMeta.getIsHi());
    assertTrue(actualClusterGdbStatusMeta.getIsHdi());
    assertTrue(actualClusterGdbStatusMeta.getIsCi());
  }

  @Test
  void testConstructor3() {
    ArrayList<ConsensusNodeId> consensusNodeIdList = new ArrayList<ConsensusNodeId>();
    consensusNodeIdList.add(new ConsensusNodeId(UUID.randomUUID()));
    UUID _imUUID = UUID.randomUUID();
    ClusterGdbStatusMeta actualClusterGdbStatusMeta = new ClusterGdbStatusMeta(consensusNodeIdList,
        _imUUID, true, true,
        true, true, UUID.randomUUID(), 1L, null, 10.0);

    assertEquals(1, actualClusterGdbStatusMeta.getCollectionMvString().size());
    assertEquals(10.0, actualClusterGdbStatusMeta.getSpcrDouble().doubleValue());
    assertNull(actualClusterGdbStatusMeta.getLgMllsm());
    assertEquals(1L, actualClusterGdbStatusMeta.getLgIral());
    assertTrue(actualClusterGdbStatusMeta.getIsIpirg());
    assertTrue(actualClusterGdbStatusMeta.getIsHi());
    assertTrue(actualClusterGdbStatusMeta.getIsHdi());
    assertTrue(actualClusterGdbStatusMeta.getIsCi());
  }

  @Test
  void testConstructor4() {
    ArrayList<ConsensusNodeId> consensusNodeIdList = new ArrayList<ConsensusNodeId>();
    consensusNodeIdList.add(new ConsensusNodeId(UUID.randomUUID()));
    consensusNodeIdList.add(new ConsensusNodeId(UUID.randomUUID()));
    UUID _imUUID = UUID.randomUUID();
    ClusterGdbStatusMeta actualClusterGdbStatusMeta = new ClusterGdbStatusMeta(consensusNodeIdList,
        _imUUID, true, true,
        true, true, UUID.randomUUID(), 1L, null, 10.0);

    assertEquals(2, actualClusterGdbStatusMeta.getCollectionMvString().size());
    assertEquals(10.0, actualClusterGdbStatusMeta.getSpcrDouble().doubleValue());
    assertNull(actualClusterGdbStatusMeta.getLgMllsm());
    assertEquals(1L, actualClusterGdbStatusMeta.getLgIral());
    assertTrue(actualClusterGdbStatusMeta.getIsIpirg());
    assertTrue(actualClusterGdbStatusMeta.getIsHi());
    assertTrue(actualClusterGdbStatusMeta.getIsHdi());
    assertTrue(actualClusterGdbStatusMeta.getIsCi());
  }
}

