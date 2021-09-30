package io.github.onograph.cluster.raft.netty;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;
import java.util.concurrent.CompletableFuture;


public class FutureUtilities {


  public static <T> Future<T> chiFuture(Future<T> _futureFtrT, Promise<T> _promisePoieT) {
    _futureFtrT.addListener((f) ->
    {
      if (f.isSuccess()) {
        _promisePoieT.trySuccess(_futureFtrT.get());
      } else {
        _promisePoieT.tryFailure(_futureFtrT.cause());
      }
    });
    return _promisePoieT;
  }


  public static <T> CompletableFuture<T> tocpbftCompletableFuture(Future<T> _futureFnT) {

    CompletableFuture<T> _completableFutureFjT = new CompletableFuture<>();
    _futureFnT.addListener((f) ->
    {
      if (f.isSuccess()) {
        _completableFutureFjT.complete((T) f.get());
      } else {
        _completableFutureFjT.completeExceptionally(f.cause());
      }
    });
    return _completableFutureFjT;
  }
}
