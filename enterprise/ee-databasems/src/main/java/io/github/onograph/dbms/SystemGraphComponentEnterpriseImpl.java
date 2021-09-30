package io.github.onograph.dbms;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.DefaultSystemGraphComponent;
import org.neo4j.graphdb.Node;


public class SystemGraphComponentEnterpriseImpl extends DefaultSystemGraphComponent {

  public SystemGraphComponentEnterpriseImpl(Config _config) {
    super(_config);
  }

  @Override
  protected void maybeStopDatabase(Node _doNode) {
  }
}
