package io.github.onograph.backup;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.pagecache.ConfigurableStandalonePageCacheFactory;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.Clocks;


public class BackupRestoreMeta {


  private final Config config;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Set<Path> setPbPath;


  public BackupRestoreMeta(Config _config, FileSystemAbstraction _fFileSystemAbstraction,
      Set<Path> _setPbPath) {
    this.config = _config;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.setPbPath = _setPbPath;
  }


  private Response _aptanBackupRestoreMetaResponse(DatabaseLayout _databaseLayout, Path _path,
      BackupRestorationManager _srBackupRestorationManager) {
    try {
      this._vaitForPa(_path);
      _srBackupRestorationManager.reorForDa(_databaseLayout);
      return new Response(_path);
    } catch (

        IOException _iOException) {
      return new Response(_iOException, _path);
    }
  }


  private void _vaitForPa(Path _path) throws IOException {
    if (!_path.toFile().exists()) {

      throw new IOException("*** Error: 171db082-cb7b-4b17-996c-8bcc85750355");
    }
  }


  public List<Response> exceList() throws Exception {

    JobScheduler _jobScheduler = JobSchedulerFactory.createInitialisedScheduler(Clocks.nanoClock());

    List _list;
    try {

      PageCache _pageCache =
          ConfigurableStandalonePageCacheFactory.createPageCache(this.fFileSystemAbstraction,
              this.config, _jobScheduler, PageCacheTracer.NULL);

      try {

        EmptyMemoryTracker _emptyMemoryTracker = EmptyMemoryTracker.INSTANCE;

        try {

          BackupRestorationManager _rsBackupRestorationManager =
              new BackupRestorationManager(this.config, this.fFileSystemAbstraction,
                  _emptyMemoryTracker, _pageCache);
          _list = this.setPbPath.stream().map((path) ->
          {
            return this._aptanBackupRestoreMetaResponse(DatabaseLayout.ofFlat(path), path,
                _rsBackupRestorationManager);
          }).collect(Collectors.toList());
        } catch (

            Throwable _throwable) {
          if (_emptyMemoryTracker != null) {
            try {
              _emptyMemoryTracker.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_emptyMemoryTracker != null) {
          _emptyMemoryTracker.close();
        }
      } catch (

          Throwable _throwable3) {
        if (_pageCache != null) {
          try {
            _pageCache.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }
        }

        throw _throwable3;
      }

      if (_pageCache != null) {
        _pageCache.close();
      }
    } catch (

        Throwable _throwable5) {
      if (_jobScheduler != null) {
        try {
          _jobScheduler.close();
        } catch (

            Throwable _throwable6) {
          _throwable5.addSuppressed(_throwable6);
        }
      }

      throw _throwable5;
    }

    if (_jobScheduler != null) {
      _jobScheduler.close();
    }

    return _list;
  }


  static class Response {


    private final Exception exception;


    private final Path path;

    Response(Path _path) {
      this.path = _path;
      this.exception = null;
    }


    Response(Exception _exception, Path _path) {
      this.exception = _exception;
      this.path = _path;
    }


    public String gefirnString() {
      return this.isHafl() ? this.exception.getMessage() : "";
    }


    public Path getPath() {
      return this.path;
    }


    public boolean isHafl() {
      return this.exception != null;
    }
  }
}
