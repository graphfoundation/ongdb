package io.github.onograph.server.security.systemgraph.versions;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class NodeGdbPrivFacadeTest {

  @Test
  void testGepveNode() {
    assertNull((new NodeGdbPrivFacade()).gepveNode(NodeGdbPrivFacade.PRIVILEGE.ACC_NODE_TRAV));
  }
}

