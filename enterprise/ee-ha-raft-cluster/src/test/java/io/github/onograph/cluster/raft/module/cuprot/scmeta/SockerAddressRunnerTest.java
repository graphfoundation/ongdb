package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.github.onograph.cluster.raft.module.cuprot.CatchupManagerService;
import io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.database.TestDatabaseIdRepository;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.storageengine.api.StoreId;
import org.neo4j.test.FakeClockJobScheduler;

class SockerAddressRunnerTest {

  @Test
  void testConstructor() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    ArrayBlockingQueue<Path> _blockingQueueDtfPath = new ArrayBlockingQueue<Path>(3);
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, _blockingQueueDtfPath, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testConstructor2() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testConstructor3() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    when(lifecycleCatchupManagerImpl.geceCatchupManagerService((org.neo4j.logging.Log) any(),
        (SocketAddress) any()))
        .thenReturn(mock(CatchupManagerService.class));
    StoreService _ccsStoreService = new StoreService(lifecycleCatchupManagerImpl,
        new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testConstructor4() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, null, _cdfRunnable,
        _clock, _epceStoreId,
        _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId, _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testConstructor5() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    when(lifecycleCatchupManagerImpl.geceCatchupManagerService((org.neo4j.logging.Log) any(),
        (SocketAddress) any()))
        .thenReturn(mock(CatchupManagerService.class));
    StoreService _ccsStoreService = new StoreService(lifecycleCatchupManagerImpl,
        new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, null, _namedDatabaseId, _pdPath,
        _psfsStoreResourceWriterService,
        new SocketAddress("localhost"))).run();
  }

  @Test
  void testConstructor6() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    when(lifecycleCatchupManagerImpl.geceCatchupManagerService((org.neo4j.logging.Log) any(),
        (SocketAddress) any()))
        .thenReturn(mock(CatchupManagerService.class));
    StoreService _ccsStoreService = new StoreService(lifecycleCatchupManagerImpl,
        new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        null,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testIsRensForStPa() {
    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    ArrayBlockingQueue<Path> _blockingQueueDtfPath = new ArrayBlockingQueue<Path>(3);
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    SockerAddressRunner sockerAddressRunner = new SockerAddressRunner(_atomicReferencePlInstant,
        _blockingQueueDtfPath,
        _ccsStoreService, _cdfRunnable, _clock, _epceStoreId, _hitTxIdProcessor, 1L, _log,
        _mntrGdbStoreTransferWatcher,
        _namedDatabaseId, _pdPath, _psfsStoreResourceWriterService,
        new SocketAddress("localhost"));
    Path _path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    assertTrue(sockerAddressRunner.isRensForStPa(_path,
        new StoreSyncCompleted(1L, StoreSyncCompleted.SetupGdbSyncReplyStateType.OK)));
  }

  @Test
  void testIsRensForStPa2() {
    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    ArrayBlockingQueue<Path> _blockingQueueDtfPath = new ArrayBlockingQueue<Path>(3);
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    SockerAddressRunner sockerAddressRunner = new SockerAddressRunner(_atomicReferencePlInstant,
        _blockingQueueDtfPath,
        _ccsStoreService, _cdfRunnable, _clock, _epceStoreId, _hitTxIdProcessor, 1L, _log,
        _mntrGdbStoreTransferWatcher,
        _namedDatabaseId, _pdPath, _psfsStoreResourceWriterService,
        new SocketAddress("localhost"));
    Path _path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    assertFalse(sockerAddressRunner.isRensForStPa(_path,
        new StoreSyncCompleted(1L,
            StoreSyncCompleted.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR)));
  }

  @Test
  void testRun() {

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    ArrayBlockingQueue<Path> _blockingQueueDtfPath = new ArrayBlockingQueue<Path>(3);
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, _blockingQueueDtfPath, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testRun2() {

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    StoreService _ccsStoreService = new StoreService(null, new AssertableLogProvider(true));

    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testRun3() {

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    when(lifecycleCatchupManagerImpl.geceCatchupManagerService((org.neo4j.logging.Log) any(),
        (SocketAddress) any()))
        .thenReturn(mock(CatchupManagerService.class));
    StoreService _ccsStoreService = new StoreService(lifecycleCatchupManagerImpl,
        new AssertableLogProvider(true));

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testRun4() {

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, null, _cdfRunnable,
        _clock, _epceStoreId,
        _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId, _pdPath,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }

  @Test
  void testRun5() {

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    when(lifecycleCatchupManagerImpl.geceCatchupManagerService((org.neo4j.logging.Log) any(),
        (SocketAddress) any()))
        .thenReturn(mock(CatchupManagerService.class));
    StoreService _ccsStoreService = new StoreService(lifecycleCatchupManagerImpl,
        new AssertableLogProvider(true));

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    Path _pdPath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, null, _namedDatabaseId, _pdPath,
        _psfsStoreResourceWriterService,
        new SocketAddress("localhost"))).run();
  }

  @Test
  void testRun6() {

    ArrayBlockingQueue<Path> arrayBlockingQueue = new ArrayBlockingQueue<Path>(3);
    arrayBlockingQueue.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl = mock(
        LifecycleCatchupManagerImpl.class);
    when(lifecycleCatchupManagerImpl.geceCatchupManagerService((org.neo4j.logging.Log) any(),
        (SocketAddress) any()))
        .thenReturn(mock(CatchupManagerService.class));
    StoreService _ccsStoreService = new StoreService(lifecycleCatchupManagerImpl,
        new AssertableLogProvider(true));

    AtomicReference<Instant> _atomicReferencePlInstant = new AtomicReference<Instant>();
    Runnable _cdfRunnable = mock(Runnable.class);
    FakeClockJobScheduler _clock = new FakeClockJobScheduler();
    StoreId _epceStoreId = new StoreId(1L);
    RemoteStoreServiceManager.TxIdProcessor _hitTxIdProcessor = new RemoteStoreServiceManager.TxIdProcessor(
        SetupGdbStoreSyncReply
            .eroSetupGdbStoreSyncReply(
                SetupGdbStoreSyncReply.SetupGdbSyncReplyStateType.SYNC_SGUID_NOT_MATCHING_ERR));
    BufferingLog _log = new BufferingLog();
    GdbStoreTransferWatcher.Connector _mntrGdbStoreTransferWatcher = new GdbStoreTransferWatcher.Connector();
    NamedDatabaseId _namedDatabaseId = TestDatabaseIdRepository.randomNamedDatabaseId();
    StoreResourceWriterService _psfsStoreResourceWriterService = mock(
        StoreResourceWriterService.class);
    (new SockerAddressRunner(_atomicReferencePlInstant, arrayBlockingQueue, _ccsStoreService,
        _cdfRunnable, _clock,
        _epceStoreId, _hitTxIdProcessor, 1L, _log, _mntrGdbStoreTransferWatcher, _namedDatabaseId,
        null,
        _psfsStoreResourceWriterService, new SocketAddress("localhost"))).run();
  }
}

