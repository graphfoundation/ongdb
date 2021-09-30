package io.github.onograph.server.security.auth;


public interface Lifecycle {


  void setup() throws Exception;


  void shutdown() throws Exception;


  void start() throws Exception;


  void stop() throws Exception;


  class LifecycleImpl implements Lifecycle {

    @Override
    public void setup() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() throws Exception {
    }

    @Override
    public void stop() throws Exception {
    }
  }
}
