package io.github.onograph.fabric.service;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.neo4j.bolt.runtime.AccessMode;
import org.neo4j.driver.Bookmark;
import org.neo4j.driver.Driver;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.TransactionConfig;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.executor.Location.Remote;
import org.neo4j.fabric.transaction.FabricTransactionInfo;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Mono;


public abstract class FabricDriver {


  private final Consumer<FabricDriver> consumerCrFabricDriver;


  private final AtomicInteger crAtomicInteger = new AtomicInteger();


  private final Driver driver;


  private Instant tulInstant;


  FabricDriver(Consumer<FabricDriver> _consumerCrFabricDriver, Driver _driver) {
    this.consumerCrFabricDriver = _consumerCrFabricDriver;
    this.driver = _driver;
  }


  private org.neo4j.driver.AccessMode _trlacmForAc(AccessMode _accessMode) {
    return _accessMode == AccessMode.READ ? org.neo4j.driver.AccessMode.READ
        : org.neo4j.driver.AccessMode.WRITE;
  }


  public abstract Mono<FabricTx> betanMono(AccessMode _accessMode,
      ExecutionOptions _executionOptions, FabricTransactionInfo _fabricTransactionInfo,
      List<RemoteBookmark> _listVaRemoteBookmark, Remote _remote);


  void cls() {
    this.driver.close();
  }


  protected SessionConfig cresicnForLoAcLi(AccessMode _accessMode, Remote _lctoRemote,
      List<RemoteBookmark> _listBomrsRemoteBookmark) {

    SessionConfig.Builder _builder = SessionConfig.builder()
        .withDefaultAccessMode(this._trlacmForAc(_accessMode));

    HashSet<String> _hashSetBmString = new HashSet();
    _listBomrsRemoteBookmark.forEach((remoteBookmark) ->
    {
      _hashSetBmString.add(remoteBookmark.getSerialisedState());
    });
    _builder.withBookmarks(Bookmark.from(_hashSetBmString));
    if (_lctoRemote.getDatabaseName() != null) {
      _builder.withDatabase(_lctoRemote.getDatabaseName());
    }

    return _builder.build();
  }


  AtomicInteger getCrAtomicInteger() {
    return this.crAtomicInteger;
  }


  Instant getTulInstant() {
    return this.tulInstant;
  }


  protected TransactionConfig getatcoForFa(FabricTransactionInfo _fabricTransactionInfo) {

    TransactionConfig.Builder _builder = TransactionConfig.builder();
    if (!_fabricTransactionInfo.getTxTimeout().equals(Duration.ZERO)) {
      _builder.withTimeout(_fabricTransactionInfo.getTxTimeout());
    }

    if (_fabricTransactionInfo.getTxMetadata() != null) {
      _builder.withMetadata(_fabricTransactionInfo.getTxMetadata());
    }

    return _builder.build();
  }


  public void reee() {
    this.consumerCrFabricDriver.accept(this);
  }


  public abstract BookmarkableStatementResult runBookmarkableStatementResult(AccessMode _accessMode,
      ExecutionOptions _executionOptions, FabricTransactionInfo _fabricTransactionInfo,
      List<RemoteBookmark> _listVRemoteBookmark, MapValue _mapValue, Remote _remote, String _strV);


  void selsudtsForIn(Instant _lutInstant) {
    this.tulInstant = _lutInstant;
  }
}
