package io.github.onograph.cluster.raft.netty;

import io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper;
import io.github.onograph.cluster.raft.control.connect.ProComAttributeKey;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.pool.ChannelPool;
import io.netty.channel.pool.ChannelPoolHandler;
import io.netty.channel.socket.SocketChannel;
import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.function.Function;
import java.util.stream.Stream;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class NettyChannelPoolLifecycleAdapter<T> implements Lifecycle {


  protected static final Function<SocketAddress, InetSocketAddress> FUNCTION_SOKTNSI = (socketAddress) ->
  {
    return InetSocketAddress.createUnresolved(socketAddress.getHostname(), socketAddress.getPort());
  };


  private final ByteBufAllocator acByteBufAllocator;


  private final ChannelPoolHandler channelPoolHandler;


  private final WriteLock esWriteLock;


  private final Function<T, InetSocketAddress> functionAitkti;


  private final Group group;


  private final JobScheduler jobScheduler;


  private final NettyChannelClusterSettings<? extends SocketChannel> nettyChannelClusterSettingsBcSocketChannel;


  private final DefaultNettyChannelPoolMapImpl.NettyPoolGenerator<T> nettyPoolGeneratorFmpT;


  private final NettyChannelPoolBuilder pfNettyChannelPoolBuilder;


  private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();


  private final ReadLock ssReadLock;


  private CompletableFuture<ProtocolStackChannelWrapper> completableFutureEolProtocolStackChannelWrapper;


  private DefaultNettyChannelPoolMapImpl<T> defaultNettyChannelPoolMapImplMpT;


  private EventLoopGroup eventLoopGroup;


  public NettyChannelPoolLifecycleAdapter(ByteBufAllocator _acByteBufAllocator,
      ChannelPoolHandler _channelPoolHandler, NettyChannelPoolBuilder _fpNettyChannelPoolBuilder,
      Function<T, InetSocketAddress> _functionAitkti, Group grp, JobScheduler _jobScheduler,
      NettyChannelClusterSettings<? extends SocketChannel> _nettyChannelClusterSettingsBcSocketChannel,
      DefaultNettyChannelPoolMapImpl.NettyPoolGenerator<T> _nettyPoolGeneratorFmpT) {
    this.esWriteLock = this.reentrantReadWriteLock.writeLock();
    this.ssReadLock = this.reentrantReadWriteLock.readLock();
    this.nettyChannelClusterSettingsBcSocketChannel = _nettyChannelClusterSettingsBcSocketChannel;
    this.jobScheduler = _jobScheduler;
    this.group = grp;
    this.channelPoolHandler = _channelPoolHandler;
    this.pfNettyChannelPoolBuilder = _fpNettyChannelPoolBuilder;
    this.functionAitkti = _functionAitkti;
    this.nettyPoolGeneratorFmpT = _nettyPoolGeneratorFmpT;
    this.acByteBufAllocator = _acByteBufAllocator;
  }


  private static CompletionStage<ProtocolStackChannelWrapper> _crepecnCompletionStage(
      Channel _channel, ChannelPool plNm) {

    CompletableFuture<ComProFamilyWrapper> _completableFutureFpComProFamilyWrapper =
        _channel.attr(ProComAttributeKey.ATTRIBUTE_KEY_PRTOTK_COMPLETABLE_FUTURE).get();
    return _completableFutureFpComProFamilyWrapper == null ? CompletableFuture
        .failedFuture(new IllegalStateException("*** Error: 579447fb-5a44-490c-9ae0-a3e3228c7301"))
        : _completableFutureFpComProFamilyWrapper.thenApply((protocol) ->
        {
          return new ProtocolStackChannelWrapper(
              _channel, plNm, protocol);
        });
  }


  public CompletableFuture<ProtocolStackChannelWrapper> acueCompletableFuture(T _tAdes) {
    this.ssReadLock.lock();

    CompletableFuture _completableFuture;
    try {
      if (this.defaultNettyChannelPoolMapImplMpT == null) {

        CompletableFuture _completableFuture2 =

            CompletableFuture.failedFuture(
                new IllegalStateException("*** Error:  2bb1b9b8-5f0a-4c9f-9230-a96a0ebfc58f"));
        return _completableFuture2;
      }

      ChannelPool plNm = this.defaultNettyChannelPoolMapImplMpT.get(_tAdes);
      _completableFuture = FutureUtilities.tocpbftCompletableFuture(plNm.acquire())
          .thenCompose((channel) ->
          {
            return _crepecnCompletionStage(channel, plNm);
          })
          .applyToEither(this.completableFutureEolProtocolStackChannelWrapper, Function.identity());
    } finally {
      this.ssReadLock.unlock();
    }

    return _completableFuture;
  }

  @Override
  public void init() {
  }


  public Stream<Pair<SocketAddress, ComProFamilyWrapper>> inlproStream() {
    this.ssReadLock.lock();

    Stream _stream;
    try {
      _stream = this.defaultNettyChannelPoolMapImplMpT == null ? Stream.empty()
          : this.defaultNettyChannelPoolMapImplMpT.inlproStream();
    } finally {
      this.ssReadLock.unlock();
    }

    return _stream;
  }

  @Override
  public void shutdown() {
  }

  @Override
  public void start() {
    this.esWriteLock.lock();

    try {
      this.completableFutureEolProtocolStackChannelWrapper = new CompletableFuture();
      this.eventLoopGroup = this.nettyChannelClusterSettingsBcSocketChannel.evnloguEventLoopGroup(
          this.jobScheduler.executor(this.group));

      Bootstrap _basBootstrap =
          (new Bootstrap()).group(this.eventLoopGroup)
              .channel(this.nettyChannelClusterSettingsBcSocketChannel.chnlcaClass())
              .option(ChannelOption.ALLOCATOR, this.acByteBufAllocator);
      this.defaultNettyChannelPoolMapImplMpT =
          this.nettyPoolGeneratorFmpT.craDefaultNettyChannelPoolMapImpl(_basBootstrap,
              this.channelPoolHandler, this.pfNettyChannelPoolBuilder,
              this.functionAitkti);
    } finally {
      this.esWriteLock.unlock();
    }
  }

  @Override
  public void stop() {

    this.completableFutureEolProtocolStackChannelWrapper.completeExceptionally(
        new IllegalStateException("*** Error:  b5f9b187-e0a7-419f-8944-3104a9fb8566"));
    this.esWriteLock.lock();

    try {
      if (this.defaultNettyChannelPoolMapImplMpT != null) {
        this.defaultNettyChannelPoolMapImplMpT.close();
        this.defaultNettyChannelPoolMapImplMpT = null;
      }

      this.eventLoopGroup.shutdownGracefully(100L, 5000L, TimeUnit.MILLISECONDS)
          .syncUninterruptibly();
    } finally {
      this.esWriteLock.unlock();
    }
  }
}
