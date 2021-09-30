package io.github.onograph.kernel.srv.pagecache;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableLong;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.Resource;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.FileHandle;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.impl.FileIsNotMappedException;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.transaction.state.DatabaseFileListing.StoreFileProvider;
import org.neo4j.kernel.monitoring.tracing.Tracers;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreFileMetadata;


public class CachePopulator implements StoreFileProvider {


  public static final String PAAREE = io.github.onograph.TokenConstants.PAGE_CACHE_PROFILE_LOADER;


  public static final String SUXE = io.github.onograph.TokenConstants.__CACHEPROF;


  private static final int IOALLM = Runtime.getRuntime().availableProcessors();


  private static final String PAAA = io.github.onograph.TokenConstants.PAGE_CACHE_WARMER;


  private static final String PAARE = io.github.onograph.TokenConstants.PAGE_CACHE_PROFILER;


  private final Config config;


  private final PageShapeMetadata crPageShapeMetadata;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final String gdbName;


  private final JobScheduler jobScheduler;


  private final Log log;


  private final PageCache pageCache;


  private final PageCacheTracer pageCacheTracer;


  private final Path pdPath;


  private final Path pppPath;


  private ExecutorService executorService;


  private PageCacheServiceFactory flpPageCacheServiceFactory;


  private volatile boolean notRunning;


  CachePopulator(Config _config, FileSystemAbstraction _fFileSystemAbstraction, String gdbName,
      JobScheduler _jobScheduler, Log _log, PageCache _pageCache, Path _pdPath, Tracers _tracers) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.pageCache = _pageCache;
    this.jobScheduler = _jobScheduler;
    this.pdPath = _pdPath;
    this.gdbName = gdbName;
    this.pppPath = _pdPath.resolve(io.github.onograph.TokenConstants.PROFILES);
    this.log = _log;
    this.pageCacheTracer = _tracers.getPageCacheTracer();
    this.crPageShapeMetadata = new PageShapeMetadata();
    this.config = _config;
  }


  private static ExecutorService _buetsrExecutorService(JobScheduler _jobScheduler) {

    BlockingQueue<Runnable> _blockingQueueQwRunnable = new LinkedBlockingQueue(IOALLM * 4);

    RejectedExecutionHandler _prRejectedExecutionHandler = new CallerRunsPolicy();

    ThreadFactory _threadFactory = _jobScheduler.threadFactory(Group.FILE_IO_HELPER);
    return new ThreadPoolExecutor(0, IOALLM, 10L, TimeUnit.SECONDS, _blockingQueueQwRunnable,
        _threadFactory, _prRejectedExecutionHandler);
  }


  private static Stream<PageShape> _fitrenStream(PagedFile _pagedFile,
      PageShape[] _poiePageShapeArray) {
    return Stream.of(_poiePageShapeArray).filter(PageShape.reentoPredicate(_pagedFile));
  }


  private static boolean _isSarevphForPaPaPaPa(Path _pdPath, Path _pppPath, Path _pppPath2,
      Path _pppPath3) {

    Path _prppPath = _pppPath2.relativize(_pppPath3).getParent();

    Path _prppPath2 = _pdPath.relativize(_pppPath).getParent();
    if (_prppPath != null) {
      return _prppPath.equals(_prppPath2);
    } else {
      return _prppPath2 == null;
    }
  }


  private Stream<? extends PageShape> _excreplStream(List<Path> _listAppPath, Path _pppPath) {
    return _listAppPath.stream().filter((profilePath) ->
    {
      return _isSarevphForPaPaPaPa(this.pdPath, _pppPath, this.pppPath, profilePath);
    }).flatMap((profilePath) ->
    {
      return PageShape.paplneStream(this.pdPath, _pppPath, profilePath);
    });
  }


  private PageShape[] _fiexnpfPageShape(List<PagedFile> _listDifpPagedFile) throws IOException {

    List<Path> _listPpaPath = this.fFileSystemAbstraction.streamFilesRecursive(this.pppPath)
        .map(FileHandle::getPath).collect(Collectors.toList());
    return _listDifpPagedFile.stream().map(PagedFile::path).flatMap((pagedFilePath) ->
    {
      return this
          ._excreplStream(_listPpaPath, pagedFilePath);
    }).toArray((i) ->
    {
      return new PageShape[i];
    });
  }


  private boolean _isVeiccuForPa(PageShape _poiePageShape) {
    try {

      InputStream _inputStream = _poiePageShape.reaInputStream(this.fFileSystemAbstraction);

      int el2;
      try {
        do {
          el2 = _inputStream.read();
        }
        while (el2 != -1);
      } catch (

          Throwable _throwable) {
        if (_inputStream != null) {
          try {
            _inputStream.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_inputStream != null) {
        _inputStream.close();
      }

      return true;
    } catch (

        IOException _iOException) {
      return false;
    }
  }


  private long _lodeetn() {
    try {

      Pattern _laPattern = Pattern.compile(
          this.config.get(GraphDatabaseSettings.pagecache_warmup_prefetch_allowlist));

      List<JobHandle> _listHnlsJobHandle = new ArrayList();

      AtomicLong _lpAtomicLong = new AtomicLong();

      long _lgPcm = this.pageCache.maxCachedPages();

      PageLoadChecker _cnrlePageLoadChecker = () ->
      {
        return _lpAtomicLong.incrementAndGet() < _lgPcm;
      };

      Iterator _iterator = this.pageCache.listExistingMappings().iterator();

      while (_iterator.hasNext()) {

        PagedFile _pagedFile = (PagedFile) _iterator.next();
        if (_laPattern.matcher(_pagedFile.path().toString()).find()) {

          Path _npfPath = _pagedFile.path().getFileName();

          JobMonitoringParams _jobMonitoringParams =
              JobMonitoringParams.systemJob(this.gdbName, io.github.onograph.I18N.format(
                  "io.github.onograph.kernel.srv.pagecache.CachePopulator.systemJob", _npfPath));
          _listHnlsJobHandle.add(
              this.jobScheduler.schedule(Group.FILE_IO_HELPER, _jobMonitoringParams, () ->
              {
                this._tocalpasForPaCa(_cnrlePageLoadChecker, _pagedFile);
              }));
        }
      }

      _iterator = _listHnlsJobHandle.iterator();

      while (_iterator.hasNext()) {

        JobHandle _jobHandle = (JobHandle) _iterator.next();
        _jobHandle.waitTermination();
      }

      return _lpAtomicLong.get();
    } catch (

        IOException _iOException) {

      throw new RuntimeException("*** Error:  4575f721-53a8-4a16-b6e9-51de8a19afa1", _iOException);
    } catch (

        InterruptedException | ExecutionException _exception) {

      throw new RuntimeException("*** Error:  790476e2-b176-4a43-85c4-6106afff336e", _exception);
    }
  }


  private long _loevhfrpo() throws IOException {

    MutableLong _lpMutableLong = new MutableLong();

    long _lgPcm = this.pageCache.maxCachedPages();

    PageLoadChecker _cnrlePageLoadChecker = () ->
    {
      return _lpMutableLong.incrementAndGet() < _lgPcm;
    };

    List<PagedFile> _listDifpPagedFile = this.pageCache.listExistingMappings();

    PageShape[] _pePageShapeArray = this._fiexnpfPageShape(_listDifpPagedFile);

    Iterator _iterator = _listDifpPagedFile.iterator();

    while (_iterator.hasNext()) {

      PagedFile _pagedFile = (PagedFile) _iterator.next();

      try {
        this.reeOptionalLong(_cnrlePageLoadChecker, _pagedFile, _pePageShapeArray);
      } catch (

          FileIsNotMappedException _fileIsNotMappedException) {
      }
    }

    return _lpMutableLong.getValue();
  }


  public synchronized OptionalLong _prfeForPaPa() throws IOException {
    if (this.notRunning) {
      return OptionalLong.empty();
    } else {

      long _lgPim = 0L;

      List<PagedFile> _listDifpPagedFile = this.pageCache.listExistingMappings();

      PageShape[] _epPageShapeArray = this._fiexnpfPageShape(_listDifpPagedFile);

      Iterator _iterator = _listDifpPagedFile.iterator();

      while (_iterator.hasNext()) {

        PagedFile _pagedFile = (PagedFile) _iterator.next();

        try {
          _lgPim += this._prfeForPaPa(_pagedFile, _epPageShapeArray);
        } catch (

            FileIsNotMappedException _fileIsNotMappedException) {
        }

        if (this.notRunning) {
          return OptionalLong.empty();
        }
      }

      return OptionalLong.of(_lgPim);
    }
  }


  private long _prfeForPaPa(PagedFile _pagedFile, PageShape[] _pePageShapeArray)
      throws IOException {

    long _lgMip = 0L;

    PageShape _pnPageShape = _fitrenStream(_pagedFile, _pePageShapeArray).max(
            Comparator.naturalOrder()).map(PageShape::nexPageShape)
        .orElse(PageShape.fPageShape(this.pdPath, _pagedFile.path()));

    CursorContext _cursorContext =
        new CursorContext(this.pageCacheTracer.createPageCursorTracer(
            io.github.onograph.TokenConstants.PAGE_CACHE_PROFILER));

    try {

      OutputStream _outputStream = _pnPageShape.wrtOutputStream(this.fFileSystemAbstraction);

      try {

        PageCursor _pageCursor = _pagedFile.io(0L, 17, _cursorContext);

        try {

          int _iSepr = 0;

          int el2 = 0;

          while (true) {
            if (!_pageCursor.next()) {
              _outputStream.write(el2);
              _outputStream.flush();
              break;
            }

            if (_pageCursor.getCurrentPageId() != -1L) {
              ++_lgMip;
              el2 |= 1 << _iSepr;
            }

            ++_iSepr;
            if (_iSepr == 8) {
              _outputStream.write(el2);
              el2 = 0;
              _iSepr = 0;
            }
          }
        } catch (

            Throwable _throwable) {
          if (_pageCursor != null) {
            try {
              _pageCursor.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_pageCursor != null) {
          _pageCursor.close();
        }
      } catch (

          Throwable _throwable3) {
        if (_outputStream != null) {
          try {
            _outputStream.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }
        }

        throw _throwable3;
      }

      if (_outputStream != null) {
        _outputStream.close();
      }
    } catch (

        Throwable _throwable5) {
      try {
        _cursorContext.close();
      } catch (

          Throwable _throwable6) {
        _throwable5.addSuppressed(_throwable6);
      }

      throw _throwable5;
    }

    _cursorContext.close();
    _fitrenStream(_pagedFile, _pePageShapeArray).filter((profile) ->
    {
      return !this.crPageShapeMetadata.isCotnForPa(profile);
    }).forEach(IOUtils.uncheckedConsumer((profile) ->
    {
      profile.deeForFi(this.fFileSystemAbstraction);
    }));
    return _lgMip;
  }


  private synchronized void _shutdown() {
    if (this.executorService != null) {
      this.executorService.shutdown();
    }
  }


  private void _tocalpasForPaCa(PageLoadChecker _cnrlePageLoadChecker, PagedFile _pagedFile) {

    try {

      CursorContext _cursorContext =
          new CursorContext(this.pageCacheTracer.createPageCursorTracer(
              io.github.onograph.TokenConstants.PAGE_CACHE_WARMER));

      label66:
      {
        try {

          PageCursor _pageCursor;
          label73:
          {
            _pageCursor = _pagedFile.io(0L, 9, _cursorContext);

            try {
              while (!this.notRunning && _pageCursor.next()) {
                if (!_cnrlePageLoadChecker.isLoaded()) {
                  break label73;
                }
              }
            } catch (

                Throwable _throwable) {
              if (_pageCursor != null) {
                try {
                  _pageCursor.close();
                } catch (

                    Throwable _throwable2) {
                  _throwable.addSuppressed(_throwable2);
                }
              }

              throw _throwable;
            }

            if (_pageCursor != null) {
              _pageCursor.close();
            }
            break label66;
          }

          if (_pageCursor != null) {
            _pageCursor.close();
          }
        } catch (

            Throwable _throwable3) {
          try {
            _cursorContext.close();
          } catch (

              Throwable _throwable4) {
            _throwable3.addSuppressed(_throwable4);
          }

          throw _throwable3;
        }

        _cursorContext.close();
        return;
      }

      _cursorContext.close();
    } catch (

        IOException _iOException) {

      throw new RuntimeException("*** Error:  1e3a00c1-eba9-47c3-b739-a69117be352c", _iOException);
    }
  }

  @Override
  public synchronized Resource addFilesTo(
      Collection<StoreFileMetadata> _collectionColStoreFileMetadata) throws IOException {
    if (this.notRunning) {
      return Resource.EMPTY;
    } else {

      List<PagedFile> _listPfidPagedFile = this.pageCache.listExistingMappings();

      PageShape[] _pePageShapeArray = this._fiexnpfPageShape(_listPfidPagedFile);

      PageShape[] _pageShapeArray = _pePageShapeArray;

      int _iV = _pePageShapeArray.length;

      for (

          int _iV2 = 0; _iV2 < _iV; ++_iV2) {

        PageShape _poiePageShape = _pageShapeArray[_iV2];
        _collectionColStoreFileMetadata.add(
            new StoreFileMetadata(_poiePageShape.getPppPath(), 1, false));
      }

      this.crPageShapeMetadata.inmrecnForPa(_pePageShapeArray);
      return () ->
      {
        this.crPageShapeMetadata.demrecnForPa(_pePageShapeArray);
      };
    }
  }


  public void kill() {
    this.notRunning = true;
    this._shutdown();
  }


  synchronized OptionalLong reeOptionalLong() throws IOException {
    if (this.notRunning) {
      return OptionalLong.empty();
    } else {
      return this.config.get(GraphDatabaseSettings.pagecache_warmup_prefetch) ? OptionalLong.of(
          this._lodeetn())
          : OptionalLong.of(this._loevhfrpo());
    }
  }


  private void reeOptionalLong(PageLoadChecker _cnrlePageLoadChecker, PagedFile _pagedFile,
      PageShape[] _pePageShapeArray)
      throws IOException {

    Optional<PageShape> _optionalSpPageShape =
        _fitrenStream(_pagedFile, _pePageShapeArray).sorted(Comparator.reverseOrder())
            .filter(this::_isVeiccuForPa).findFirst();
    if (!_optionalSpPageShape.isEmpty()) {

      InputStream _inputStream = _optionalSpPageShape.get()
          .reaInputStream(this.fFileSystemAbstraction);

      label108:
      {
        label109:
        {
          try {

            PageCacheService _laePageCacheService;
            label111:
            {
              label112:
              {
                _laePageCacheService = this.flpPageCacheServiceFactory.geldPageCacheService(
                    this.pageCacheTracer, _pagedFile);

                try {

                  long pId = 0L;

                  label93:
                  while (true) {

                    int el2;
                    if ((el2 = _inputStream.read()) == -1) {
                      break label111;
                    }

                    for (

                        int cur = 0; cur < 8; ++cur) {
                      if (this.notRunning) {
                        break label93;
                      }

                      if ((el2 & 1) == 1) {
                        _laePageCacheService.prepare(pId);
                        if (!_cnrlePageLoadChecker.isLoaded()) {
                          break label112;
                        }
                      }

                      el2 >>= 1;
                      ++pId;
                    }
                  }
                } catch (

                    Throwable _throwable) {
                  if (_laePageCacheService != null) {
                    try {
                      _laePageCacheService.close();
                    } catch (

                        Throwable _throwable2) {
                      _throwable.addSuppressed(_throwable2);
                    }
                  }

                  throw _throwable;
                }

                if (_laePageCacheService != null) {
                  _laePageCacheService.close();
                }
                break label108;
              }

              if (_laePageCacheService != null) {
                _laePageCacheService.close();
              }
              break label109;
            }

            if (_laePageCacheService != null) {
              _laePageCacheService.close();
            }
          } catch (

              Throwable _throwable3) {
            if (_inputStream != null) {
              try {
                _inputStream.close();
              } catch (

                  Throwable _throwable4) {
                _throwable3.addSuppressed(_throwable4);
              }
            }

            throw _throwable3;
          }

          if (_inputStream != null) {
            _inputStream.close();
          }

          return;
        }

        if (_inputStream != null) {
          _inputStream.close();
        }

        return;
      }

      if (_inputStream != null) {
        _inputStream.close();
      }
    }
  }


  public synchronized void str() {
    this.notRunning = false;
    this.executorService = _buetsrExecutorService(this.jobScheduler);
    this.flpPageCacheServiceFactory = new PageCacheServiceFactory(this.executorService);
  }


  private interface PageLoadChecker {


    boolean isLoaded();
  }
}
