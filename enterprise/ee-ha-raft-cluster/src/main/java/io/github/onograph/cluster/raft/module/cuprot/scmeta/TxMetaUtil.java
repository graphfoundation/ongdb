package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.io.IOException;
import java.util.Optional;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.transaction.CommittedTransactionRepresentation;
import org.neo4j.kernel.impl.transaction.log.NoSuchTransactionException;
import org.neo4j.kernel.impl.transaction.log.ReadOnlyTransactionStore;
import org.neo4j.kernel.impl.transaction.log.TransactionCursor;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.lifecycle.Lifespan;
import org.neo4j.monitoring.Monitors;
import org.neo4j.storageengine.api.CommandReaderFactory;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.TransactionIdStore;


public class TxMetaUtil {


  private final Config config;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final PageCache pageCache;


  public TxMetaUtil(Config _config, FileSystemAbstraction _fFileSystemAbstraction,
      PageCache _pageCache) {
    this.config = _config;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.pageCache = _pageCache;
  }


  private Optional<Long> _gelttrclidOptional(CommandReaderFactory _commandReaderFactory,
      DatabaseLayout _databaseLayout, long _lgIts)
      throws IOException {
    if (!this.isHatloForDaCo(_commandReaderFactory, _databaseLayout)) {
      return Optional.empty();
    } else {

      ReadOnlyTransactionStore _stReadOnlyTransactionStore =
          new ReadOnlyTransactionStore(this.pageCache, this.fFileSystemAbstraction, _databaseLayout,
              this.config, new Monitors(),
              _commandReaderFactory);

      long _lgItl = 1L;

      try {

        Lifespan _inrdLifespan = new Lifespan(_stReadOnlyTransactionStore);

        Optional _optional;
        try {

          TransactionCursor _transactionCursor = _stReadOnlyTransactionStore.getTransactions(
              _lgIts);

          try {
            while (_transactionCursor.next()) {

              CommittedTransactionRepresentation _tCommittedTransactionRepresentation = _transactionCursor.get();
              _lgItl = _tCommittedTransactionRepresentation.getCommitEntry().getTxId();
            }

            _optional = Optional.of(_lgItl);
          } catch (

              Throwable _throwable) {
            if (_transactionCursor != null) {
              try {
                _transactionCursor.close();
              } catch (

                  Throwable _throwable2) {
                _throwable.addSuppressed(_throwable2);
              }
            }

            throw _throwable;
          }

          if (_transactionCursor != null) {
            _transactionCursor.close();
          }
        } catch (

            Throwable _throwable3) {
          try {
            _inrdLifespan.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }

          throw _throwable3;
        }

        _inrdLifespan.close();
        return _optional;
      } catch (

          NoSuchTransactionException _noSuchTransactionException) {
        return Optional.empty();
      }
    }
  }


  TxMeta gesrsteTxMeta(CursorContext _cursorContext, DatabaseLayout _databaseLayout,
      StorageEngineFactory _storageEngineFactory) throws IOException {

    TransactionIdStore _tisTransactionIdStore =
        _storageEngineFactory.readOnlyTransactionIdStore(this.fFileSystemAbstraction,
            _databaseLayout, this.pageCache, _cursorContext);

    long _lgItcl = _tisTransactionIdStore.getLastCommittedTransactionId();

    Optional<Long> _optionalIltlLong =
        this._gelttrclidOptional(_storageEngineFactory.commandReaderFactory(), _databaseLayout,
            _lgItcl);
    return _optionalIltlLong.map((lastLogIdx) ->
    {
      return new TxMeta(lastLogIdx, _lgItcl);
    }).orElse(new TxMeta(_lgItcl));
  }


  public boolean isHatloForDaCo(CommandReaderFactory _commandReaderFactory,
      DatabaseLayout _databaseLayout) throws IOException {
    return LogFilesBuilder.activeFilesBuilder(_databaseLayout, this.fFileSystemAbstraction,
            this.pageCache).withConfig(this.config)
        .withCommandReaderFactory(_commandReaderFactory).build().logFiles().length > 0;
  }
}
