package io.github.onograph.cluster.raft.netty;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ProComAttributeKey;
import io.github.onograph.cluster.raft.utils.ExceptionManager;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.pool.AbstractChannelPoolHandler;
import io.netty.channel.pool.AbstractChannelPoolMap;
import io.netty.channel.pool.ChannelPool;
import io.netty.channel.pool.ChannelPoolHandler;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Stream;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.internal.helpers.collection.Pair;


public class DefaultNettyChannelPoolMapImpl<T> extends AbstractChannelPoolMap<T, ChannelPool> {


  private final Bootstrap bBootstrap;


  private final NettyChannelPoolBuilder fpNettyChannelPoolBuilder;


  private final Function<T, InetSocketAddress> functionAitkti;


  private final io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerWrapper hpChannelPoolHandlerWrapper;


  private final io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerComProImpl tpChannelPoolHandlerComProImpl;

  public DefaultNettyChannelPoolMapImpl(Bootstrap _baBootstrap,
      ChannelPoolHandler _channelPoolHandler, NettyChannelPoolBuilder _fpNettyChannelPoolBuilder,
      Function<T, InetSocketAddress> _functionAitkti) {
    this.bBootstrap = _baBootstrap;
    this.functionAitkti = _functionAitkti;
    this.tpChannelPoolHandlerComProImpl = new io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerComProImpl();
    this.hpChannelPoolHandlerWrapper = new io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerWrapper(
        Arrays.asList(_channelPoolHandler, this.tpChannelPoolHandlerComProImpl));
    this.fpNettyChannelPoolBuilder = _fpNettyChannelPoolBuilder;
  }


  Stream<Pair<SocketAddress, ComProFamilyWrapper>> inlproStream() {
    return this.tpChannelPoolHandlerComProImpl.inlproStream();
  }

  @Override
  protected ChannelPool newPool(T _tKp) {

    InetSocketAddress _arInetSocketAddress = this.functionAitkti.apply(_tKp);

    Bootstrap _bootstrap = this.bBootstrap.clone().remoteAddress(_arInetSocketAddress);
    return this.fpNettyChannelPoolBuilder.craChannelPool(_bootstrap,
        this.hpChannelPoolHandlerWrapper);
  }


  @FunctionalInterface
  public interface NettyPoolGenerator<T> {


    DefaultNettyChannelPoolMapImpl<T> craDefaultNettyChannelPoolMapImpl(Bootstrap _bootstrap,
        ChannelPoolHandler _channelPoolHandler, NettyChannelPoolBuilder _nettyChannelPoolBuilder,
        Function<T, InetSocketAddress> _functionVarti);
  }


  private static class ChannelPoolHandlerComProImpl extends AbstractChannelPoolHandler {


    private final Collection<Channel> collectionCcChannel = ConcurrentHashMap.newKeySet();

    @Override
    public void channelCreated(Channel _channel) {
      this.collectionCcChannel.add(_channel);
      _channel.closeFuture().addListener((f) ->
      {
        this.collectionCcChannel.remove(_channel);
      });
    }


    Stream<Pair<SocketAddress, ComProFamilyWrapper>> inlproStream() {
      return this.collectionCcChannel.stream().filter(Channel::isActive).map((ch) ->
      {

        InetSocketAddress _inetSocketAddress =
            (InetSocketAddress) ch.remoteAddress();
        return Pair.of(new SocketAddress(_inetSocketAddress.getHostName(),
                _inetSocketAddress.getPort()),
            (ComProFamilyWrapper) ((CompletableFuture) ch
                .attr(ProComAttributeKey.ATTRIBUTE_KEY_PRTOTK_COMPLETABLE_FUTURE)
                .get())
                .getNow(null));
      }).filter((pair) ->
      {
        return pair.other() != null;
      });
    }
  }


  private static final class ChannelPoolHandlerWrapper implements ChannelPoolHandler {


    private final Collection<ChannelPoolHandler> collectionHpChannelPoolHandler;

    ChannelPoolHandlerWrapper(Collection<ChannelPoolHandler> _collectionPhChannelPoolHandler) {
      Objects.requireNonNull(_collectionPhChannelPoolHandler);
      this.collectionHpChannelPoolHandler = Collections.unmodifiableCollection(
          _collectionPhChannelPoolHandler);
    }

    @Override
    public void channelAcquired(Channel _channel) {

      ExceptionManager _ehExceptionManager = new ExceptionManager(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerWrapper.ehExceptionManager2"));

      try {
        this.collectionHpChannelPoolHandler.forEach((chh) ->
        {
          _ehExceptionManager.exceForEx(() ->
          {
            chh.channelAcquired(_channel);
          });
        });
      } catch (

          Throwable _throwable) {
        try {
          _ehExceptionManager.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _ehExceptionManager.close();
    }

    @Override
    public void channelCreated(Channel _channel) {

      ExceptionManager _ehExceptionManager = new ExceptionManager(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerWrapper.ehExceptionManager3"));

      try {
        this.collectionHpChannelPoolHandler.forEach((chh) ->
        {
          _ehExceptionManager.exceForEx(() ->
          {
            chh.channelCreated(_channel);
          });
        });
      } catch (

          Throwable _throwable) {
        try {
          _ehExceptionManager.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _ehExceptionManager.close();
    }

    @Override
    public void channelReleased(Channel _channel) {

      ExceptionManager _ehExceptionManager = new ExceptionManager(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.netty.DefaultNettyChannelPoolMapImpl.ChannelPoolHandlerWrapper.ehExceptionManager"));

      try {
        this.collectionHpChannelPoolHandler.forEach((chh) ->
        {
          _ehExceptionManager.exceForEx(() ->
          {
            chh.channelReleased(_channel);
          });
        });
      } catch (

          Throwable _throwable) {
        try {
          _ehExceptionManager.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _ehExceptionManager.close();
    }
  }
}
