package io.github.onograph.server;

import org.neo4j.internal.unsafe.IllegalAccessLoggerSuppressor;
import org.neo4j.server.BlockingBootstrapper;
import org.neo4j.server.Bootstrapper;
import org.neo4j.server.NeoBootstrapper;
import org.neo4j.server.startup.EntryPoint;


/**
 * Called in bin scripts.
 */

public class EntryPointImpl implements EntryPoint {


  private static Bootstrapper bootstrapper;


  public static void main(String[] _strArgArray) {
    IllegalAccessLoggerSuppressor.suppress();

    int stat = NeoBootstrapper.start(new EnhancedBootstrapper(), _strArgArray);
    if (stat != 0) {
      System.exit(stat);
    }
  }


  public static void startBootstrapper(String[] _strArgArray) {
    bootstrapper = new BlockingBootstrapper(new EnhancedBootstrapper());
    System.exit(NeoBootstrapper.start(bootstrapper, _strArgArray));
  }


  public static void stopBootstrapper(String[] _strArgArray) {
    if (bootstrapper != null) {
      bootstrapper.stop();
    }
  }

  @Override
  public Priority getPriority() {
    return Priority.MEDIUM;
  }
}
