package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.onograph.cluster.raft.module.cuprot.CatchupAnswerManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupProblem;
import io.github.onograph.cluster.raft.module.cuprot.CatchupReplyChannelManager;
import io.github.onograph.cluster.raft.module.cuprot.CatchupStatusType;
import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMeta;
import io.github.onograph.cluster.raft.module.cuprot.current.gdbi.AllGdbIds;
import io.github.onograph.cluster.raft.module.cuprot.current.ident.GdbId;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.CatchupIncomingTransactionReply;
import io.github.onograph.cluster.raft.module.cuprot.synctrxr.TransactionChunkingCompleted;
import io.github.onograph.cluster.raft.share.meta.pit.SnapshotData;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.PhysicalTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryCommit;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryStart;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StoreId;

class CatchupAnswerServiceHandlersObserveImplTest {

  @Test
  void testConstructor() {

    new CatchupAnswerServiceHandlersObserveImpl<Object>(new CatchupAnswerManager<Object>(),
        mock(StoreSyncStatusPusher.class));
  }

  @Test
  void testIsOnficttForCoSl() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    assertFalse(catchupAnswerServiceHandlersObserveImpl.isOnficttForCoSl(_completableFutureSgaT,
        Slice.craSlice(1, true, Unpooled.compositeBuffer(3))));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testIsOnficttForCoSl2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    assertFalse(catchupAnswerServiceHandlersObserveImpl.isOnficttForCoSl(_completableFutureSgaT,
        Slice.craSlice(1, true, Unpooled.compositeBuffer(3))));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOnccerresForCoCa() {

    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), mock(StoreSyncStatusPusher.class));
    CatchupProblem _recCatchupProblem = new CatchupProblem("foo",
        CatchupStatusType.CST_STORE_NOT_SAME_ERR);

    catchupAnswerServiceHandlersObserveImpl.onccerresForCoCa(_recCatchupProblem,
        new CompletableFuture<Object>());
  }

  @Test
  void testOnccerresForCoCa2() {

    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerServiceHandlersObserveImpl<Object>(new CatchupAnswerManager<Object>(),
            mock(StoreSyncStatusPusher.class)),
        mock(StoreSyncStatusPusher.class));
    CatchupProblem _recCatchupProblem = new CatchupProblem("foo",
        CatchupStatusType.CST_STORE_NOT_SAME_ERR);

    catchupAnswerServiceHandlersObserveImpl.onccerresForCoCa(_recCatchupProblem,
        new CompletableFuture<Object>());
  }

  @Test
  void testOncospoForCoSn() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.oncospoForCoSn(_completableFutureSgaT,
        new SnapshotData(1L, 1L));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOncospoForCoSn2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.oncospoForCoSn(_completableFutureSgaT,
        new SnapshotData(1L, 1L));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOnfesaceForCoSt() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.onfesaceForCoSt(_completableFutureSgaT,
        new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOnfesaceForCoSt2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.onfesaceForCoSt(_completableFutureSgaT,
        new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOnfihdForCoSl() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.onfihdForCoSl(_completableFutureSgaT,
        new SliceMeta(" str Nf"));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOnfihdForCoSl2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.onfihdForCoSl(_completableFutureSgaT,
        new SliceMeta(" str Nf"));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOngadteiresForCoAl() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    AllGdbIds _rsosAllGdbIds = new AllGdbIds(new HashSet<NamedDatabaseId>());
    catchupAnswerServiceHandlersObserveImpl.ongadteiresForCoAl(_rsosAllGdbIds,
        new CompletableFuture<Object>());
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOngadteiresForCoAl2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    AllGdbIds _rsosAllGdbIds = new AllGdbIds(new HashSet<NamedDatabaseId>());
    catchupAnswerServiceHandlersObserveImpl.ongadteiresForCoAl(_rsosAllGdbIds,
        new CompletableFuture<Object>());
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOngdairnForCoGd() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.ongdairnForCoGd(_completableFutureSgaT,
        new GdbId(TestDatabaseIdRepository.randomDatabaseId()));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOngdairnForCoGd2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.ongdairnForCoGd(_completableFutureSgaT,
        new GdbId(TestDatabaseIdRepository.randomDatabaseId()));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOngmarseForCoAu() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    AuthMeta _rsosAuthMeta = new AuthMeta(new ArrayList<String>());
    catchupAnswerServiceHandlersObserveImpl.ongmarseForCoAu(_rsosAuthMeta,
        new CompletableFuture<Object>());
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOngmarseForCoAu2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    AuthMeta _rsosAuthMeta = new AuthMeta(new ArrayList<String>());
    catchupAnswerServiceHandlersObserveImpl.ongmarseForCoAu(_rsosAuthMeta,
        new CompletableFuture<Object>());
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOngsirpForCoSt() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.ongsirpForCoSt(_completableFutureSgaT,
        new StoreDatabaseId(new StoreId(1L)));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOngsirpForCoSt2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.ongsirpForCoSt(_completableFutureSgaT,
        new StoreDatabaseId(new StoreId(1L)));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOninForCoMe() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSorT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.oninForCoMe(_completableFutureSorT,
        Meta.craMeta(1L, " str Fr"));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOninForCoMe2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSorT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.oninForCoMe(_completableFutureSorT,
        Meta.craMeta(1L, " str Fr"));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOnsrltresForCoSe() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.onsrltresForCoSe(_completableFutureSgaT,
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOnsrltresForCoSe2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.onsrltresForCoSe(_completableFutureSgaT,
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOntpurseForCoCaCa() throws UnsupportedEncodingException {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupIncomingTransactionReply _tCatchupIncomingTransactionReply = new CatchupIncomingTransactionReply(
        1, _storeId,
        new CommittedTransactionRepresentation(
            startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));

    CatchupReplyChannelManager catchupReplyChannelManager = new CatchupReplyChannelManager(
        new EmbeddedChannel());
    catchupAnswerServiceHandlersObserveImpl.ontpurseForCoCaCa(_tCatchupIncomingTransactionReply,
        catchupReplyChannelManager, new CompletableFuture<Object>());
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOntpurseForCoCaCa2() throws UnsupportedEncodingException {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    StoreId _storeId = new StoreId(1L);
    byte[] additionalHeader = "AAAAAAAAAAAAAAAAAAAAAAAA".getBytes("UTF-8");
    LogEntryStart startEntry = new LogEntryStart(10L, 1L, 1, additionalHeader,
        new LogPosition(1L, 1L));

    PhysicalTransactionRepresentation transactionRepresentation = new PhysicalTransactionRepresentation(
        new ArrayList<StorageCommand>());
    CatchupIncomingTransactionReply _tCatchupIncomingTransactionReply = new CatchupIncomingTransactionReply(
        1, _storeId,
        new CommittedTransactionRepresentation(
            startEntry, transactionRepresentation,
            new LogEntryCommit(123L, 10L, 1)));

    CatchupReplyChannelManager catchupReplyChannelManager = new CatchupReplyChannelManager(
        new EmbeddedChannel());
    catchupAnswerServiceHandlersObserveImpl.ontpurseForCoCaCa(_tCatchupIncomingTransactionReply,
        catchupReplyChannelManager, new CompletableFuture<Object>());
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }

  @Test
  void testOntstfhrseForCoTr() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.ontstfhrseForCoTr(_completableFutureSgaT,
        new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE));
    verify(storeSyncStatusPusher).pushStatus();
  }

  @Test
  void testOntstfhrseForCoTr2() {
    StoreSyncStatusPusher storeSyncStatusPusher = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> _catchupAnswerServiceHandlersDlgtT = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        new CatchupAnswerManager<Object>(), storeSyncStatusPusher);

    StoreSyncStatusPusher storeSyncStatusPusher1 = mock(StoreSyncStatusPusher.class);
    doNothing().when(storeSyncStatusPusher1).pushStatus();
    CatchupAnswerServiceHandlersObserveImpl<Object> catchupAnswerServiceHandlersObserveImpl = new CatchupAnswerServiceHandlersObserveImpl<Object>(
        _catchupAnswerServiceHandlersDlgtT, storeSyncStatusPusher1);
    CompletableFuture<Object> _completableFutureSgaT = new CompletableFuture<Object>();
    catchupAnswerServiceHandlersObserveImpl.ontstfhrseForCoTr(_completableFutureSgaT,
        new TransactionChunkingCompleted(1L, CatchupStatusType.CST_OK_STREAM_COMPLETE));
    verify(storeSyncStatusPusher).pushStatus();
    verify(storeSyncStatusPusher1).pushStatus();
  }
}

