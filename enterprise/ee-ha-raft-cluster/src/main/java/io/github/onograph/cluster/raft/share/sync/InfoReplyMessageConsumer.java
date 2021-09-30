package io.github.onograph.cluster.raft.share.sync;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;


public final class InfoReplyMessageConsumer implements
    Consumer<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> {


  private final Map<UUID, io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer.InfoReplyMessageStats> mapMrtrui =
      new ConcurrentHashMap();


  private void _adrpsForCo(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage) {
    this.mapMrtrui.computeIfPresent(_rsInfoReplyMessage.getIrUUID(), (key, value) ->
    {
      value.adrpsForCo(_rsInfoReplyMessage);
      return value;
    });
  }

  @Override
  public void accept(
      io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage) {
    this._adrpsForCo(_rsInfoReplyMessage);
  }


  void extfostefForUU(int _iNor, UUID _irUUID) {
    this.mapMrtrui.computeIfAbsent(_irUUID, (r) ->
    {
      return new io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer.InfoReplyMessageStats(
          _iNor);
    });
  }


  List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> geasteList(
      UUID _irUUID, Duration _tmotDuration)
      throws InterruptedException {

    io.github.onograph.cluster.raft.share.sync.InfoReplyMessageConsumer.InfoReplyMessageStats val =
        this.mapMrtrui.get(_irUUID);
    if (val == null) {
      return List.of();
    } else {
      val.countDownLatch.await(_tmotDuration.toMillis(), TimeUnit.MILLISECONDS);
      this.mapMrtrui.remove(_irUUID);
      return val.listRsossInfoReplyMessage;
    }
  }


  private static class InfoReplyMessageStats {


    private final CountDownLatch countDownLatch;


    private final List<io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage> listRsossInfoReplyMessage =
        new ArrayList();

    InfoReplyMessageStats(int _iRon) {
      this.countDownLatch = new CountDownLatch(_iRon);
    }


    void adrpsForCo(
        io.github.onograph.cluster.raft.share.calg.ConsensusMessageServiceMeta.InfoReplyMessage _rsInfoReplyMessage) {
      this.listRsossInfoReplyMessage.add(_rsInfoReplyMessage);
      this.countDownLatch.countDown();
    }
  }
}
