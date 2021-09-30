package io.github.onograph.server.security.systemgraph.versions;

import java.util.HashMap;
import java.util.Map;
import org.neo4j.graphdb.Node;


public class NodeGdbPrivFacade {


  private final Map<NodeGdbPrivFacade.PRIVILEGE, Node> mapMnpnn = new HashMap();


  Node gepveNode(NodeGdbPrivFacade.PRIVILEGE _pRIVILEGE) {
    return this.mapMnpnn.get(_pRIVILEGE);
  }


  void sepveForNoNo(Node _node, NodeGdbPrivFacade.PRIVILEGE _pRIVILEGE) {
    this.mapMnpnn.put(_pRIVILEGE, _node);
  }


  enum PRIVILEGE {


    ACC_NODE_TRAV,

    ACC_REL_TRAV,

    ACC_NODE_PROP_READ,

    READ_REL_PROP,

    ACC_MATCH_NODE,

    ACC_REL_MATCH,

    ACC_CREATE_UPDATE_NODE,

    ACC_REL_WRITE,

    ACC_EVERYTHING,

    STANDARD,

    ACC_IDX,

    ACC_CONS,

    ACC_TKN,

    ACC_ADMIN,

    ACC_GDB_START,

    ACC_GDB_STOP,

    ACC_TRX,

    ACC_ALL_GDBS,

    ACC_SCHEMA_COM,

    ACC_ALLOWED_EVERY_FUNC,

    ACC_ALLOWED_EVERY_PROC
  }
}
