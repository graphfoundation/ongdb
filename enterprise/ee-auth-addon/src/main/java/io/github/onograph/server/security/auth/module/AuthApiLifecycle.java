package io.github.onograph.server.security.auth.module;


public interface AuthApiLifecycle {


  void setup(AuthApi _authApi) throws Exception;


  void shutdown();


  void start();


  void stop();


  class AuthApiLifecycleImpl implements AuthApiLifecycle {

    @Override
    public void setup(AuthApi _apoAuthApi) {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }
  }
}
