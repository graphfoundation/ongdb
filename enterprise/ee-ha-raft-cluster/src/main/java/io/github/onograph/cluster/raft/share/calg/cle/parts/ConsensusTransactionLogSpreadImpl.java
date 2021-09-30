package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntry;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryRawCursor;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusTransactionLog;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.time.Clock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.function.Function;
import org.neo4j.cursor.IOCursor;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;


public class ConsensusTransactionLogSpreadImpl extends LifecycleAdapter implements
    ConsensusTransactionLog {


  private final Path dpPath;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final LogFilePathManager fnLogFilePathManager;


  private final Function<Integer, ChannelMarshal<SyncableData>> functionMsic;


  private final int iRae_o = 1;


  private final JobScheduler jobScheduler;


  private final long lgSar;


  private final Log log;


  private final LogProvider logProvider;


  private final MemoryTracker memoryTracker;


  private final StoreFileWrapperFASManager prStoreFileWrapperFASManager;


  private final PartClipperManager puePartClipperManager;


  private final ReadLock readLock;


  private final WriteLock writeLock;


  private boolean isRn;


  private JobHandle<?> jobHandleRppObject;


  private TransactionLogPartMeta saeTransactionLogPartMeta;


  public ConsensusTransactionLogSpreadImpl(Clock _clock,
      FileSystemAbstraction _fileSystemAbstraction,
      Function<Integer, ChannelMarshal<SyncableData>> _functionSmic, int _iSpr,
      JobScheduler _jobScheduler, long _lgSar, LogProvider _logProvider,
      MemoryTracker _memoryTracker, Path _pdPath, PartClipperService _psPartClipperService) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.dpPath = _pdPath;
    this.lgSar = _lgSar;
    this.functionMsic = _functionSmic;
    this.logProvider = _logProvider;
    this.jobScheduler = _jobScheduler;
    this.fnLogFilePathManager = new LogFilePathManager(_pdPath);
    this.memoryTracker = _memoryTracker;
    this.prStoreFileWrapperFASManager = new StoreFileWrapperFASManager(_clock,
        _fileSystemAbstraction, _iSpr, _logProvider, this.fnLogFilePathManager);
    this.puePartClipperManager = new PartClipperManager(_psPartClipperService);
    this.log = _logProvider.getLog(this.getClass());

    ReentrantReadWriteLock _reentrantReadWriteLock = new ReentrantReadWriteLock();
    this.readLock = _reentrantReadWriteLock.readLock();
    this.writeLock = _reentrantReadWriteLock.writeLock();
  }


  private void _enuo() {
    if (this.isRn) {

      throw new IllegalStateException("*** Error:  9ee5a101-ebad-47f5-894e-5a2a9c43b8a7");
    }
  }


  private ConsensusLogEntry _redlgetConsensusLogEntry(long lgIdx) throws IOException {

    ConsensusLogEntryDataIOCursor _consensusLogEntryDataIOCursor =
        new ConsensusLogEntryDataIOCursor(lgIdx,
            this.saeTransactionLogPartMeta.getSgetTransactionLogParts());

    ConsensusLogEntry _consensusLogEntry;
    try {
      _consensusLogEntry =
          _consensusLogEntryDataIOCursor.next()
              ? ((ConsensusLogEntryData) _consensusLogEntryDataIOCursor.get()).getConsensusLogEntry()
              : null;
    } catch (

        Throwable _throwable) {
      try {
        _consensusLogEntryDataIOCursor.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _consensusLogEntryDataIOCursor.close();
    return _consensusLogEntry;
  }


  private void _roasmt(long befIdx, long befTLng, long lstFIdx) throws IOException {
    this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
        .lasTransactionLogPartFileSystemWrapper().clswre();
    this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
        .roaTransactionLogPartFileSystemWrapper(befIdx, befTLng, lstFIdx);
  }


  private void _skpsgn(long befIdx, long befTLng, long lstFIdx) throws IOException {
    this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
        .lasTransactionLogPartFileSystemWrapper().clswre();
    this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
        .skiTransactionLogPartFileSystemWrapper(befIdx, befTLng, lstFIdx);
  }


  private void _trasg(long befIdx, long befTLng, long lstFIdx) throws IOException {
    this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
        .lasTransactionLogPartFileSystemWrapper().clswre();
    this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
        .trntTransactionLogPartFileSystemWrapper(befIdx, befTLng, lstFIdx);
  }

  @Override
  public long apeForCo(ConsensusLogEntry... _etisConsensusLogEntryArray) throws IOException {
    this.writeLock.lock();

    long _lgVr1;
    try {
      this._enuo();

      try {

        ConsensusLogEntry[] _consensusLogEntryArray = _etisConsensusLogEntryArray;

        int _iV = _etisConsensusLogEntryArray.length;

        int _iVa = 0;

        while (true) {
          if (_iVa >= _iV) {
            this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
                .lasTransactionLogPartFileSystemWrapper().fls();
            break;
          }

          ConsensusLogEntry _consensusLogEntry = _consensusLogEntryArray[_iVa];
          this.saeTransactionLogPartMeta.seaeie(this.saeTransactionLogPartMeta.getLgIa() + 1L);
          this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper()
              .ape(this.saeTransactionLogPartMeta.getLgIa(), _consensusLogEntry.getLgTe());
          this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
              .lasTransactionLogPartFileSystemWrapper()
              .wrtForCo(_consensusLogEntry, this.saeTransactionLogPartMeta.getLgIa());
          ++_iVa;
        }
      } catch (

          Throwable _throwable) {
        this.isRn = true;
        throw _throwable;
      }

      if (this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
          .lasTransactionLogPartFileSystemWrapper().poio() >= this.lgSar) {
        this._roasmt(this.saeTransactionLogPartMeta.getLgIa(),
            this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper().lae(),
            this.saeTransactionLogPartMeta.getLgIa());
      }

      _lgVr1 = this.saeTransactionLogPartMeta.getLgIa();
    } finally {
      this.writeLock.unlock();
    }

    return _lgVr1;
  }

  @Override
  public long apeie() {
    this.readLock.lock();

    long _lgVa;
    try {
      _lgVa = this.saeTransactionLogPartMeta.getLgIa();
    } finally {
      this.readLock.unlock();
    }

    return _lgVa;
  }

  @Override
  public ConsensusLogEntryRawCursor geercuoConsensusLogEntryRawCursor(long sourceIdx) {

    IOCursor<ConsensusLogEntryData> _iOCursorInrConsensusLogEntryData =
        new ConsensusLogEntryDataIOCursor(sourceIdx,
            this.saeTransactionLogPartMeta.getSgetTransactionLogParts());
    return new ConsensusLogEntryRawCursorSpreadImpl(_iOCursorInrConsensusLogEntryData, sourceIdx);
  }

  @Override
  public long pass(long _lgTn, long _lgIn) throws IOException {
    this.writeLock.lock();

    long _lgVar;
    try {

      if (this.saeTransactionLogPartMeta.getLgIa() < _lgIn) {
        this._skpsgn(_lgIn, _lgTn, this.saeTransactionLogPartMeta.getLgIa());
        this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper().pass(_lgTn, _lgIn);
        this.saeTransactionLogPartMeta.sepvid(_lgIn);
        this.saeTransactionLogPartMeta.sepvtr(_lgTn);
        this.saeTransactionLogPartMeta.seaeie(_lgIn);
      }

      _lgVar = this.saeTransactionLogPartMeta.getLgIa();
    } finally {
      this.writeLock.unlock();
    }

    return _lgVar;
  }

  @Override
  public long prn(long _lgIs) {
    this.writeLock.lock();

    long _lgVr0;
    try {

      long _lgPi = this.puePartClipperManager.geidtpfForTr(_lgIs,
          this.saeTransactionLogPartMeta.getSgetTransactionLogParts());

      TransactionLogPartFileSystemWrapper _dnoTransactionLogPartFileSystemWrapper =
          this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
              .prnTransactionLogPartFileSystemWrapper(_lgPi);

      long _lgIpn = _dnoTransactionLogPartFileSystemWrapper.getHdrByte().getBefIdx();

      long _lgTpn = _dnoTransactionLogPartFileSystemWrapper.getHdrByte().getBefTLng();
      if (_lgIpn > this.saeTransactionLogPartMeta.getBefIdx()) {
        this.saeTransactionLogPartMeta.sepvid(_lgIpn);
      }

      if (_lgTpn > this.saeTransactionLogPartMeta.getBefTLng()) {
        this.saeTransactionLogPartMeta.sepvtr(_lgTpn);
      }

      this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper()
          .prn(this.saeTransactionLogPartMeta.getBefIdx());
      _lgVr0 = this.saeTransactionLogPartMeta.getBefIdx();
    } finally {
      this.writeLock.unlock();
    }

    return _lgVr0;
  }

  @Override
  public long prvid() {
    this.readLock.lock();

    long _lgV;
    try {
      _lgV = this.saeTransactionLogPartMeta.getBefIdx();
    } finally {
      this.readLock.unlock();
    }

    return _lgV;
  }

  @Override
  public long redettm(long lgIdx) throws IOException {
    this.readLock.lock();

    long _lgVa;
    try {

      long _lgTe;
      if (lgIdx > this.saeTransactionLogPartMeta.getLgIa()) {
        _lgTe = -1L;
        return _lgTe;
      }

      _lgTe = this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper().findLgTrs(lgIdx);
      if (_lgTe == -1L && lgIdx >= this.saeTransactionLogPartMeta.getBefIdx()) {

        ConsensusLogEntry _consensusLogEntry = this._redlgetConsensusLogEntry(lgIdx);
        _lgTe = _consensusLogEntry != null ? _consensusLogEntry.getLgTe() : -1L;

        long _lgVa2 = _lgTe;
        return _lgVa2;
      }

      _lgVa = _lgTe;
    } finally {
      this.readLock.unlock();
    }

    return _lgVa;
  }

  @Override
  public void start()
      throws IOException, TransactionLogKernelException, TransactionLogPartMissingException {
    this.writeLock.lock();

    try {
      if (Files.notExists(this.dpPath, new LinkOption[0])) {
        Files.createDirectories(this.dpPath);
      }

      try {
        this.saeTransactionLogPartMeta =
            (new RepairManager(this.fileSystemAbstraction, this.functionMsic, this.logProvider,
                this.memoryTracker, this.fnLogFilePathManager,
                this.prStoreFileWrapperFASManager))
                .runTransactionLogPartMeta();
      } catch (

          Exception _exception) {
        throw new RuntimeException(_exception);
      }

      TransactionLogPartFileSystemWrapper _slTransactionLogPartFileSystemWrapper =
          this.saeTransactionLogPartMeta.getSgetTransactionLogParts()
              .lasTransactionLogPartFileSystemWrapper();
      if (_slTransactionLogPartFileSystemWrapper.getFileSize()
          > _slTransactionLogPartFileSystemWrapper.getHdrByte().getIOr() ||
          _slTransactionLogPartFileSystemWrapper.getHdrByte().getIVf() != 3) {
        this._roasmt(this.saeTransactionLogPartMeta.getLgIa(),
            this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper().lae(),
            this.saeTransactionLogPartMeta.getLgIa());
      }

      this.jobHandleRppObject = this.jobScheduler.scheduleRecurring(Group.RAFT_READER_POOL_PRUNER,
          () ->
          {
            this.prStoreFileWrapperFASManager.prnForTi(1L, TimeUnit.MINUTES);
          }, 1L, 1L, TimeUnit.MINUTES);
    } finally {
      this.writeLock.unlock();
    }
  }

  @Override
  public void stop() throws Exception {
    this.writeLock.lock();

    try {
      if (this.jobHandleRppObject != null) {
        this.jobHandleRppObject.cancel();
      }

      this.prStoreFileWrapperFASManager.cls();
      this.saeTransactionLogPartMeta.getSgetTransactionLogParts().close();
    } finally {
      this.writeLock.unlock();
    }
  }

  @Override
  public void trnt(long sourceIdx) throws IOException {
    this.writeLock.lock();

    try {

      if (this.saeTransactionLogPartMeta.getLgIa() < sourceIdx) {

        throw new IllegalArgumentException("*** Error: 9fee0fab-6d13-4cf6-a6f7-68783134087a");
      }

      long _lgIan = sourceIdx - 1L;

      long _lgTn = this.redettm(_lgIan);
      this._trasg(_lgIan, _lgTn, this.saeTransactionLogPartMeta.getLgIa());
      this.saeTransactionLogPartMeta.seaeie(_lgIan);
      this.saeTransactionLogPartMeta.getTrsCandidateTermWrapper().trnt(sourceIdx);
    } finally {
      this.writeLock.unlock();
    }
  }
}
