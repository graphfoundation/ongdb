package io.github.onograph.cluster.raft.share.calg.cle.parts;

import io.github.onograph.cluster.raft.akkamsg.serialization.SyncableDataMarshalBuilder;
import io.github.onograph.cluster.raft.share.calg.cle.ConsensusLogEntryData;
import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import org.neo4j.cursor.IOCursor;
import org.neo4j.internal.helpers.Args;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.kernel.impl.transaction.log.entry.LogEntryReader;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.time.Clocks;


class TransactionLogPartRunner {


  private static final io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.PrintStreamProvider SYMRR_PRINT_STREAM_PROVIDER =
      new io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.PrintStreamProvider() {
        @Override
        public void close() {
        }

        @Override
        public PrintStream gefPrintStream(String _strF) {
          return System.out;
        }
      };


  private static final String TOI = io.github.onograph.TokenConstants.TOFILE;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final MemoryTracker memoryTracker;

  private TransactionLogPartRunner(FileSystemAbstraction _fileSystemAbstraction,
      MemoryTracker _memoryTracker) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.memoryTracker = _memoryTracker;
  }


  private static io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.PrintStreamProvider _gepnrTransactionLogPartRunnerPrintStreamProvider(
      Args _args) {

    boolean _isFt = _args.getBoolean(io.github.onograph.TokenConstants.TOFILE, false, true);
    return _isFt ? new TransactionLogPartRunner.PrintStreamProviderFileImpl()
        : SYMRR_PRINT_STREAM_PROVIDER;
  }


  private static Function<Integer, ChannelMarshal<SyncableData>> _maaseFunction() {

    StorageEngineFactory _storageEngineFactory = StorageEngineFactory.defaultStorageEngine();

    LogEntryReader RNME = new VersionAwareLogEntryReader(
        _storageEngineFactory.commandReaderFactory());

    Map<Integer, ChannelMarshal<SyncableData>> _mapVr00ic = SyncableDataMarshalBuilder.build(RNME);
    Objects.requireNonNull(_mapVr00ic);
    return _mapVr00ic::get;
  }


  public static void main(String[] _strArgArray) {

    Args _agmnsArgs = Args.withFlags(new String[]{io.github.onograph.TokenConstants.TOFILE})
        .parse(_strArgArray);

    io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.PrintStreamProvider _pitrPrintStreamProvider =
        _gepnrTransactionLogPartRunnerPrintStreamProvider(_agmnsArgs);

    try {

      Iterator _iterator = _agmnsArgs.orphans().iterator();

      while (_iterator.hasNext()) {

        String _strSaf = (String) _iterator.next();

        try {

          DefaultFileSystemAbstraction _defaultFileSystemAbstraction = new DefaultFileSystemAbstraction();

          try {
            (new TransactionLogPartRunner(_defaultFileSystemAbstraction,
                EmptyMemoryTracker.INSTANCE))._dumForStPr(
                _pitrPrintStreamProvider.gefPrintStream(_strSaf), _strSaf);
          } catch (

              Throwable _throwable) {
            try {
              _defaultFileSystemAbstraction.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }

            throw _throwable;
          }

          _defaultFileSystemAbstraction.close();
        } catch (

            TransactionLogPartMissingException | TransactionLogKernelException | IOException _exception) {
          _exception.printStackTrace();
        }
      }
    } catch (

        Throwable _throwable3) {
      if (_pitrPrintStreamProvider != null) {
        try {
          _pitrPrintStreamProvider.close();
        } catch (

            Throwable _throwable4) {
          _throwable3.addSuppressed(_throwable4);
        }
      }

      throw _throwable3;
    }

    if (_pitrPrintStreamProvider != null) {
      _pitrPrintStreamProvider.close();
    }
  }


  private int _dumForStPr(PrintStream _oPrintStream, String _strDof)
      throws IOException, TransactionLogKernelException, TransactionLogPartMissingException {

    LogProvider _logProvider = NullLogProvider.getInstance();

    int[] _iLfArray = new int[]{0};

    LogFilePathManager _nfLogFilePathManager = new LogFilePathManager(Path.of(_strDof));

    StoreFileWrapperFASManager _prStoreFileWrapperFASManager =
        new StoreFileWrapperFASManager(Clocks.systemClock(), this.fileSystemAbstraction, 0,
            _logProvider, _nfLogFilePathManager);

    RepairManager _prRepairManager =
        new RepairManager(this.fileSystemAbstraction, _maaseFunction(), _logProvider,
            this.memoryTracker, _nfLogFilePathManager,
            _prStoreFileWrapperFASManager);

    TransactionLogParts _sgetTransactionLogParts = _prRepairManager.runTransactionLogPartMeta()
        .getSgetTransactionLogParts();
    _sgetTransactionLogParts.viiForVi((segment) ->
    {

      int _iVr00 = _iLfArray[0]++;
      _oPrintStream.println(io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.println",
          segment.gefemString()));

      PartRecordDataHeader hdrByte = segment.getHdrByte();
      _oPrintStream.println(hdrByte.toString());

      try {

        IOCursor<ConsensusLogEntryData> _iOCursorCroConsensusLogEntryData =
            segment.gecsIOCursor(hdrByte.getBefIdx() + 1L);

        try {
          while (_iOCursorCroConsensusLogEntryData.next()) {
            _oPrintStream.println(_iOCursorCroConsensusLogEntryData.get().toString());
          }
        } catch (

            Throwable _throwable) {
          if (_iOCursorCroConsensusLogEntryData != null) {
            try {
              _iOCursorCroConsensusLogEntryData.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_iOCursorCroConsensusLogEntryData != null) {
          _iOCursorCroConsensusLogEntryData.close();
        }

        return false;
      } catch (

          IOException | TransactionLogPartMissingException _exception) {
        _exception.printStackTrace();
        System.exit(-1);
        return true;
      }
    });
    return _iLfArray[0];
  }


  interface PrintStreamProvider extends AutoCloseable {

    @Override
    void close();


    PrintStream gefPrintStream(String _strVar) throws IOException;
  }


  private static class PrintStreamProviderFileImpl
      implements
      io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.PrintStreamProvider {


    private PrintStream oPrintStream;


    private Path pdPath;

    @Override
    public void close() {
      if (this.oPrintStream != null) {
        this.oPrintStream.close();
      }
    }

    @Override
    public PrintStream gefPrintStream(String _strFil) throws IOException {

      Path _paPath = Path.of(_strFil).toAbsolutePath();

      Path _pdPath = Files.isDirectory(_paPath) ? _paPath : _paPath.getParent();
      if (!_pdPath.equals(this.pdPath)) {
        this.close();

        Path _pdPath2 = _pdPath.resolve(io.github.onograph.TokenConstants.DUMP_LOGICAL_LOG__TXT);
        System.out.println(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.calg.cle.parts.TransactionLogPartRunner.PrintStreamProviderFileImpl.println",
            _pdPath2));
        this.oPrintStream = new PrintStream(Files.newOutputStream(_pdPath2));
        this.pdPath = _pdPath;
      }

      return this.oPrintStream;
    }
  }
}
