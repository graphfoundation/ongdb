package io.github.onograph.server.security.auth;

import org.junit.jupiter.api.Test;

class LifecycleTest {

  @Test
  void testLifecycleImplConstructor() throws Exception {

    Lifecycle.LifecycleImpl actualLifecycleImpl = new Lifecycle.LifecycleImpl();
    actualLifecycleImpl.setup();
    actualLifecycleImpl.shutdown();
    actualLifecycleImpl.start();
    actualLifecycleImpl.stop();
  }
}

