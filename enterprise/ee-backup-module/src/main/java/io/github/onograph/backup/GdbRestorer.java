package io.github.onograph.backup;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.neo4j.cli.CommandFailedException;
import org.neo4j.commandline.Util;
import org.neo4j.commandline.dbms.CannotWriteException;
import org.neo4j.commandline.dbms.LockChecker;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.transaction.log.files.LogFiles;
import org.neo4j.kernel.impl.transaction.log.files.LogFilesBuilder;
import org.neo4j.kernel.impl.util.Validators;
import org.neo4j.kernel.internal.locker.FileLockException;


public class GdbRestorer {


  static final String RERA = io.github.onograph.TokenConstants.RESTORE_METADATA__CYPHER;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Path fdpPath;


  private final Path ftbPath;


  private final boolean isFm;


  private final boolean isOf;


  private final PrintStream ocPrintStream;


  private final Path psPath;


  private final Path rgpPath;


  private final DatabaseLayout treDatabaseLayout;


  public GdbRestorer(FileSystemAbstraction _fFileSystemAbstraction, boolean _isFm, boolean _isOf,
      PrintStream _ocPrintStream, Path _pdfPath, Path _rgpPath, DatabaseLayout _treDatabaseLayout) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.ocPrintStream = _ocPrintStream;
    this.fdpPath = _pdfPath;
    this.ftbPath = DatabaseLayout.ofFlat(_pdfPath).backupToolsFolder();
    this.isOf = _isOf;
    this.isFm = _isFm;
    this.treDatabaseLayout = _treDatabaseLayout;
    this.rgpPath = _rgpPath;
    this.psPath = _treDatabaseLayout.getScriptDirectory();
  }


  private void _clttdce() throws IOException {

    Path _dpPath = this.treDatabaseLayout.databaseDirectory();

    Path _pltPath = this.treDatabaseLayout.getTransactionLogsDirectory();

    Path _pldPath = this.treDatabaseLayout.databaseLockFile();

    Path[] _fptrPathArray = this.fFileSystemAbstraction.listFiles(_dpPath, (path) ->
    {
      return !path.getFileName().equals(_pldPath.getFileName());
    });
    if (_fptrPathArray != null) {

      Path[] _vaPathArray = _fptrPathArray;

      int _iVa = _fptrPathArray.length;

      for (

          int _iVar = 0; _iVar < _iVa; ++_iVar) {

        Path _pfPath = _vaPathArray[_iVar];
        this.fFileSystemAbstraction.delete(_pfPath);
      }
    }

    if (!Util.isSameOrChildFile(_dpPath, _pltPath)) {
      this.fFileSystemAbstraction.deleteRecursively(_pltPath);
    }

    if (this.fFileSystemAbstraction.fileExists(this.gemtaspPath())) {
      this.fFileSystemAbstraction.delete(this.gemtaspPath());
    }
  }


  private void _rerdaf() throws IOException {

    Set<Path> _setDsfPath = Set.of(this.fFileSystemAbstraction.listFiles(this.fdpPath));

    Set<Path> _setFtPath = Collections.emptySet();
    if (this.fFileSystemAbstraction.fileExists(this.ftbPath)) {
      _setFtPath = Set.of(this.fFileSystemAbstraction.listFiles(this.ftbPath, (pathx) ->
      {
        return !pathx.getFileName().toString()
            .equals(io.github.onograph.TokenConstants.DATABASE__ID);
      }));
    }

    LogFiles _tasciLogFiles = LogFilesBuilder.logFilesBasedOnlyBuilder(this.fdpPath,
        this.fFileSystemAbstraction).build();

    Path _pdPath = this.treDatabaseLayout.databaseDirectory();

    Path _pltPath = this.treDatabaseLayout.getTransactionLogsDirectory();

    Path _pldPath = this.treDatabaseLayout.databaseLockFile();

    Path _ftPath = this.treDatabaseLayout.backupToolsFolder();

    Iterator _iterator = _setDsfPath.iterator();

    Path _path;
    while (_iterator.hasNext()) {
      _path = (Path) _iterator.next();

      Path _ptPath;
      if (Files.isDirectory(_path)) {
        if (this.isFm) {
          this.fFileSystemAbstraction.moveToDirectory(_path, _pdPath);
        } else {
          _ptPath = _pdPath.resolve(_path.getFileName());
          this.fFileSystemAbstraction.mkdirs(_ptPath);
          this.fFileSystemAbstraction.copyRecursively(_path, _ptPath);
        }
      } else {
        _ptPath = _tasciLogFiles.isLogFile(_path) ? _pltPath : _pdPath;

        Path _ptPath2 = _ptPath.resolve(_path.getFileName());
        if (!_pldPath.equals(_ptPath2)) {
          if (this.isFm) {
            this.fFileSystemAbstraction.moveToDirectory(_path, _ptPath);
          } else {
            this.fFileSystemAbstraction.copyToDirectory(_path, _ptPath);
          }
        }
      }
    }

    _iterator = _setFtPath.iterator();

    while (_iterator.hasNext()) {
      _path = (Path) _iterator.next();
      if (BackupMetadataRepository.isMedaflForPa(_path)) {
        if (this.isFm) {
          this.fFileSystemAbstraction.moveToDirectory(_path, this.psPath);
        } else {
          this.fFileSystemAbstraction.mkdirs(this.psPath);
          this.fFileSystemAbstraction.copyToDirectory(_path, this.psPath);
        }

        this.fFileSystemAbstraction.renameFile(this.psPath.resolve(_path.getFileName()),
            this.gemtaspPath());

      }
    }

    if (this.isFm) {
      this.fFileSystemAbstraction.deleteRecursively(this.fdpPath);
      this.fFileSystemAbstraction.deleteRecursively(_ftPath);
    }
  }


  public void exce() throws IOException {
    if (!this.fFileSystemAbstraction.fileExists(this.fdpPath)) {

      throw new IllegalArgumentException("*** Error: d56b20f2-0869-433d-89eb-5bcb2ecd0432");
    } else {
      try {
        Validators.CONTAINS_EXISTING_DATABASE.validate(this.fdpPath);
      } catch (

          IllegalArgumentException _illegalArgumentException) {

        throw new IllegalArgumentException("*** Error: 56a52bcb-732f-41ee-b176-dbd6375dad7d",
            _illegalArgumentException);
      }

      if (this.fFileSystemAbstraction.fileExists(this.treDatabaseLayout.databaseDirectory())
          && !this.isOf) {

        throw new IllegalArgumentException("*** Error: 81d1da1b-f8da-4e64-8575-11b7e1515bb1");
      } else if (this.fFileSystemAbstraction.fileExists(this.gemtaspPath()) && !this.isOf) {

        throw new IllegalArgumentException("*** Error: d37d74ec-3cf5-4cd1-bd40-782836f3fb25");
      } else if (this.fFileSystemAbstraction.fileExists(this.rgpPath)) {

        throw new IllegalArgumentException("*** Error: fa5696b4-9a86-4695-bddc-594cdbb642a9");
      } else {
        this.fFileSystemAbstraction.mkdirs(this.treDatabaseLayout.databaseDirectory());

        try {

          Closeable _inrdCloseable = LockChecker.checkDatabaseLock(this.treDatabaseLayout);

          try {
            this._clttdce();
            this._rerdaf();
          } catch (

              Throwable _throwable) {
            if (_inrdCloseable != null) {
              try {
                _inrdCloseable.close();
              } catch (

                  Throwable _throwable2) {
                _throwable.addSuppressed(_throwable2);
              }
            }

            throw _throwable;
          }

          if (_inrdCloseable != null) {
            _inrdCloseable.close();
          }
        } catch (

            FileLockException _fileLockException) {

          throw new CommandFailedException("*** Error: 97f0161e-7103-406d-9a02-7ef2d80f84bc",
              _fileLockException);
        } catch (

            CannotWriteException _cannotWriteException) {

          throw new CommandFailedException("*** Error:  e30202a4-4241-44f6-bc53-db4e985e1d72",
              _cannotWriteException);
        }
      }
    }
  }


  Path gemtaspPath() {
    return this.psPath.resolve(io.github.onograph.TokenConstants.RESTORE_METADATA__CYPHER);
  }
}
