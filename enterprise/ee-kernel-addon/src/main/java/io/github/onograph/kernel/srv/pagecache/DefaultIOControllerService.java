package io.github.onograph.kernel.srv.pagecache;

import org.neo4j.configuration.Config;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.kernel.impl.pagecache.IOControllerService;
import org.neo4j.time.SystemNanoClock;


public class DefaultIOControllerService implements IOControllerService {

  @Override
  public IOController createIOController(Config _config, SystemNanoClock _systemNanoClock) {
    return new DefaultIOController(_config, _systemNanoClock);
  }

  @Override
  public int getPriority() {
    return 10;
  }
}
