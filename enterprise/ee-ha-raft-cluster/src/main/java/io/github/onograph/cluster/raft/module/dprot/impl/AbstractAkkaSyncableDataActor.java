package io.github.onograph.cluster.raft.module.dprot.impl;

import akka.actor.ActorRef;
import akka.cluster.Cluster;
import akka.cluster.ddata.Key;
import akka.cluster.ddata.LWWMap;
import akka.cluster.ddata.ReplicatedData;
import akka.cluster.ddata.Replicator.Changed;
import akka.cluster.ddata.Replicator.ReplicatorMessage;
import akka.cluster.ddata.Replicator.Subscribe;
import akka.cluster.ddata.Replicator.Unsubscribe;
import akka.cluster.ddata.Replicator.Update;
import akka.cluster.ddata.Replicator.UpdateResponse;
import akka.cluster.ddata.Replicator.WriteAll;
import akka.cluster.ddata.Replicator.WriteConsistency;
import akka.japi.pf.ReceiveBuilder;
import io.github.onograph.cluster.AbstractActorLoggingAndTimersImpl;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataType;
import io.github.onograph.cluster.raft.module.dprot.impl.watch.ClusterDataWatcher;
import io.github.onograph.cluster.raft.module.dprot.pit.GdbServerPointInTime;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import scala.concurrent.duration.FiniteDuration;


public abstract class AbstractAkkaSyncableDataActor<T extends ReplicatedData> extends
    AbstractActorLoggingAndTimersImpl {


  private static final String MTRX_SPCLX_MK =
      io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor.var");


  private static final WriteConsistency WX_COSTC;

  static {
    WX_COSTC = new WriteAll(new FiniteDuration(10L, TimeUnit.SECONDS));
  }


  protected final Cluster cluster;


  protected final Key<T> k;


  protected final ActorRef relarActorRef;


  private final ClusterDataType ietfeClusterDataType;


  private final ClusterDataWatcher mntrClusterDataWatcher;


  private final Supplier<T> supplierDeT;


  protected T tDat;


  protected AbstractAkkaSyncableDataActor(Cluster _cluster, Function<String, Key<T>> _functionKfsk,
      ClusterDataType _ietfeClusterDataType, ClusterDataWatcher _mntrClusterDataWatcher,
      ActorRef _rpiaoActorRef, Supplier<T> _supplierDeT) {
    this.cluster = _cluster;
    this.relarActorRef = _rpiaoActorRef;
    this.k = _functionKfsk.apply(_ietfeClusterDataType.getTokenKey());
    this.supplierDeT = _supplierDeT;
    this.tDat = _supplierDeT.get();
    this.ietfeClusterDataType = _ietfeClusterDataType;
    this.mntrClusterDataWatcher = _mntrClusterDataWatcher;
  }


  private void _haerioenForRe(ReceiveBuilder _receiveBuilder) {
    _receiveBuilder.match(Changed.class, (c) ->
    {
      return c.key().equals(this.k);
    }, (message) ->
    {

      T _tDn = (T) message.dataValue();
      if (this.isDacndForT(_tDn)) {
        this.haeimdaForT(_tDn);
      } else {
        this.tDat = _tDn;
      }

      this._lodamtc();
    }).match(UpdateResponse.class, (updated) ->
    {

    }).match(StatUpdater.class, (ignored) ->
    {
      this._lodamtc();
    }).match(ClusterDiscoveryInitiator.class, (message) ->
    {
      this.seinldtrloForGd(message.getGdbServerPointInTime());
    });
  }


  private void _lodamtc() {
    this.mntrClusterDataWatcher.sevsdsiForCl(this.ietfeClusterDataType, this.damevl());
    this.mntrClusterDataWatcher.seivldasForCl(this.ietfeClusterDataType, this.dameii());
  }


  private void _surtoriretForRe(ReplicatorMessage m) {
    this.relarActorRef.tell(m, this.getSelf());
  }

  @Override
  public final Receive createReceive() {

    ReceiveBuilder _receiveBuilder = new ReceiveBuilder();
    this.haecoenForRe(_receiveBuilder);
    this._haerioenForRe(_receiveBuilder);
    return _receiveBuilder.build();
  }


  protected abstract int dameii();


  protected abstract int damevl();


  protected abstract void haecoenForRe(ReceiveBuilder _receiveBuilder);


  protected abstract void haeimdaForT(T _tVa);


  protected abstract boolean isDacndForT(T _tV);


  protected void moyriddForKeFuM(Function<T, T> _functionMdftt, Key<T> k) {
    this.moyriddForKeFuM(_functionMdftt, k, null);
  }


  protected <M> void moyriddForKeFuM(Function<T, T> _functionMdftt, Key<T> k, M m) {
    if (this.cluster.isTerminated()) {

    } else {

      Update<T> _updateUdtT = new Update(k, this.supplierDeT.get(), WX_COSTC,
          Optional.ofNullable(m), _functionMdftt);
      this.relarActorRef.tell(_updateUdtT, this.self());
    }
  }

  @Override
  public final void postStop() {
    this._surtoriretForRe(new Unsubscribe(this.k, this.getSelf()));
  }

  @Override
  public final void preStart() {
    this._surtoriretForRe(new Subscribe(this.k, this.getSelf()));
    this.getTimers().startPeriodicTimer(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.module.dprot.impl.AbstractAkkaSyncableDataActor.startPeriodicTimer"),
        StatUpdater.geitcAbstractAkkaSyncableDataActorStatUpdater(), Duration.ofMinutes(1L));
  }


  protected abstract void seinldtrloForGd(GdbServerPointInTime _gdbServerPointInTime);


  public abstract static class AbstractASDALWWMap<K, V> extends
      AbstractAkkaSyncableDataActor<LWWMap<K, V>> {

    protected AbstractASDALWWMap(Cluster _cluster,
        Function<String, Key<LWWMap<K, V>>> _functionSkfsk, ClusterDataType _ietfeClusterDataType,
        ClusterDataWatcher _mntrClusterDataWatcher, ActorRef _rpiaoActorRef,
        Supplier<LWWMap<K, V>> _supplierDeLWWMap) {
      super(_cluster, _functionSkfsk, _ietfeClusterDataType, _mntrClusterDataWatcher,
          _rpiaoActorRef, _supplierDeLWWMap);
    }

    @Override
    protected final boolean isDacndForT(LWWMap<K, V> _lWWMapDnkv) {
      return this.tDat.size() != _lWWMapDnkv.size() || !((LWWMap) this.tDat).getEntries()
          .equals(_lWWMapDnkv.getEntries());
    }
  }


  static class StatUpdater {


    private static final StatUpdater iT = new StatUpdater();

    private StatUpdater() {
    }


    public static StatUpdater geitcAbstractAkkaSyncableDataActorStatUpdater() {
      return iT;
    }
  }
}
