package io.github.onograph.dbms;

import org.neo4j.dbms.api.DatabaseManagementException;


public class ClusterDatabaseManagementException extends DatabaseManagementException {

  public ClusterDatabaseManagementException(String m) {
    super(m);
  }
}
