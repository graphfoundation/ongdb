package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import org.neo4j.logging.Level;


enum Neo4jLogLevelWrapper {


  DEBUG(Level.DEBUG),

  INFO(Level.INFO),

  WARNING(Level.WARN),

  ERROR(Level.ERROR),

  OFF(Level.NONE);


  private final Level level;

  Neo4jLogLevelWrapper(Level _nojLevel) {
    this.level = _nojLevel;
  }


  static Neo4jLogLevelWrapper frmnolelNeo4jLogLevelWrapper(Level _nojLevel) {

    Neo4jLogLevelWrapper[] _neo4jLogLevelWrapperArray = values();

    int _iVar = _neo4jLogLevelWrapperArray.length;

    for (

        int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

      Neo4jLogLevelWrapper _alNeo4jLogLevelWrapper = _neo4jLogLevelWrapperArray[_iVar2];
      if (_alNeo4jLogLevelWrapper.level == _nojLevel) {
        return _alNeo4jLogLevelWrapper;
      }
    }

    throw new IllegalArgumentException("*** Error: 0b282b50-145a-40d4-b2da-bd660cb9754b");
  }


  public Level getLevel() {
    return this.level;
  }
}
