package io.github.onograph.internal.batchimport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import org.neo4j.configuration.Config;
import org.neo4j.internal.batchimport.AdditionalInitialIds;
import org.neo4j.internal.batchimport.BatchImporter;
import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.DataStatistics;
import org.neo4j.internal.batchimport.ImportLogic;
import org.neo4j.internal.batchimport.ImportLogic.Monitor;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.input.Input;
import org.neo4j.internal.batchimport.staging.ExecutionMonitor;
import org.neo4j.internal.batchimport.store.BatchingNeoStores;
import org.neo4j.internal.helpers.ArrayUtil;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.internal.helpers.collection.PrefetchingIterator;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.kernel.impl.store.StoreType;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogFilesInitializer;


public class EnterpriseBatchImporter implements BatchImporter {


  static final String FIL_NME_STAX = io.github.onograph.TokenConstants.STATE;


  private static final String BLK_IMPX_CPX =
      io.github.onograph.I18N.format(
          "io.github.onograph.internal.batchimport.EnterpriseBatchImporter.var");


  private static final String FIL_NME_REL_DITBI = io.github.onograph.TokenConstants.RELATIONSHIP_TYPE_DISTRIBUTION;


  private static final String STAX_BEG = io.github.onograph.TokenConstants.START;


  private static final String STAX_DAX_INX = io.github.onograph.TokenConstants.DATA_IMPORT;


  private static final String STAX_DAX_LIN = io.github.onograph.TokenConstants.DATA_LINK;


  private static final String STAX_DERMT = io.github.onograph.TokenConstants.DEFRAGMENT;


  private static final String STAX_INI = io.github.onograph.TokenConstants.INIT;


  private static final String STAX_NEW_INX = "";


  private final AdditionalInitialIds additionalInitialIds;


  private final Collector bCollector;


  private final Configuration configuration;


  private final Config dConfig;


  private final DatabaseLayout databaseLayout;


  private final ExecutionMonitor executionMonitor;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final IndexImporterFactory indexImporterFactory;


  private final JobScheduler jobScheduler;


  private final LogFilesInitializer logFilesInitializer;


  private final LogService logService;


  private final MemoryTracker memoryTracker;


  private final Monitor monitor;


  private final PageCacheTracer pageCacheTracer;


  private final RecordFormats recordFormats;


  private final RelationshipTypeStatsWrapper ssdRelationshipTypeStatsWrapper;


  public EnterpriseBatchImporter(AdditionalInitialIds _additionalInitialIds, Collector _bCollector,
      Configuration _configuration, Config _dConfig, DatabaseLayout _databaseLayout,
      ExecutionMonitor _executionMonitor, FileSystemAbstraction _fileSystemAbstraction,
      IndexImporterFactory _indexImporterFactory, JobScheduler _jobScheduler,
      LogFilesInitializer _logFilesInitializer, LogService _logService,
      MemoryTracker _memoryTracker, Monitor _monitor, PageCacheTracer _pageCacheTracer,
      RecordFormats _recordFormats) {
    this.databaseLayout = _databaseLayout;
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.pageCacheTracer = _pageCacheTracer;
    this.configuration = _configuration;
    this.logService = _logService;
    this.dConfig = _dConfig;
    this.recordFormats = _recordFormats;
    this.executionMonitor = _executionMonitor;
    this.additionalInitialIds = _additionalInitialIds;
    this.monitor = _monitor;
    this.indexImporterFactory = _indexImporterFactory;
    this.ssdRelationshipTypeStatsWrapper =
        new RelationshipTypeStatsWrapper(_fileSystemAbstraction,
            _memoryTracker,
            this.databaseLayout.databaseDirectory()
                .resolve(io.github.onograph.TokenConstants.RELATIONSHIP_TYPE_DISTRIBUTION));
    this.jobScheduler = _jobScheduler;
    this.bCollector = _bCollector;
    this.logFilesInitializer = _logFilesInitializer;
    this.memoryTracker = _memoryTracker;
  }


  private static void _fafodtlscpdseForBaImStPr(BatchingNeoStores _batchingNeoStores,
      byte[] _pcByteArray, PrefetchingIterator<ImportStatus> _prefetchingIteratorSaeImportStatus,
      ImportStateDAO _ssImportStateDAO, String _strNs) throws IOException {
    if ("".equals(_strNs)) {
      _batchingNeoStores.createNew();
      _ssImportStateDAO.setForSt(PropertyType.EMPTY_BYTE_ARRAY,
          io.github.onograph.TokenConstants.INIT);
    } else {

      Set<StoreType> _setKtsmStoreType = new HashSet();

      HashSet _ktstHashSet = new HashSet();

      while (_prefetchingIteratorSaeImportStatus.hasNext()) {

        ImportStatus _saeImportStatus = _prefetchingIteratorSaeImportStatus.peek();
        _setKtsmStoreType.addAll(Arrays.asList(_saeImportStatus.getMcStoreTypeArray()));
        _ktstHashSet.addAll(Arrays.asList(_saeImportStatus.getTcStoreTypeArray()));
        _saeImportStatus.prepare();
        if (_saeImportStatus.name().equals(_strNs)) {
          Objects.requireNonNull(_setKtsmStoreType);

          Predicate _predicate = _setKtsmStoreType::contains;
          Objects.requireNonNull(_ktstHashSet);
          _batchingNeoStores.pruneAndOpenExistingStore(_predicate, _ktstHashSet::contains);
          if (_pcByteArray.length == 0) {
            _prefetchingIteratorSaeImportStatus.next();
          }
          break;
        }

        _prefetchingIteratorSaeImportStatus.next();
      }
    }
  }


  private PrefetchingIterator<ImportStatus> _inassPrefetchingIterator(
      final BatchingNeoStores _batchingNeoStores, final ImportLogic _importLogic) {

    List<ImportStatus> _listSaeImportStatus = new ArrayList();
    _listSaeImportStatus.add(
        new ImportStatus(ArrayUtil.array(new StoreType[0]), ArrayUtil.array(new StoreType[0]),
            io.github.onograph.TokenConstants.INIT));
    _listSaeImportStatus.add(new ImportStatus(ArrayUtil.array(new StoreType[]{StoreType.META_DATA}),
        ArrayUtil.array(new StoreType[0]), io.github.onograph.TokenConstants.START));
    _listSaeImportStatus.add(new ImportStatus(ArrayUtil
        .array(new StoreType[]{StoreType.NODE, StoreType.NODE_LABEL, StoreType.LABEL_TOKEN,
            StoreType.LABEL_TOKEN_NAME, StoreType.RELATIONSHIP,
            StoreType.RELATIONSHIP_TYPE_TOKEN, StoreType.RELATIONSHIP_TYPE_TOKEN_NAME,
            StoreType.PROPERTY, StoreType.PROPERTY_ARRAY,
            StoreType.PROPERTY_STRING, StoreType.PROPERTY_KEY_TOKEN,
            StoreType.PROPERTY_KEY_TOKEN_NAME}),
        ArrayUtil.array(new StoreType[0]), io.github.onograph.TokenConstants.DATA_IMPORT) {
      @Override
      void persist() throws IOException {
        EnterpriseBatchImporter.this.ssdRelationshipTypeStatsWrapper.strForDa(
            _importLogic.getState(DataStatistics.class));
      }

      @Override
      void prepare() throws IOException {
        _importLogic.putState(
            EnterpriseBatchImporter.this.ssdRelationshipTypeStatsWrapper.loaDataStatistics());
      }

      @Override
      void runForIm(Checkpointable checkpointable, byte[] _pcfByteArray)
          throws IOException {
        _importLogic.importNodes();
        _importLogic.prepareIdMapper();
        _importLogic.importRelationships();
      }
    });
    _listSaeImportStatus.add(new ImportStatus(ArrayUtil.array(new StoreType[0]),
        ArrayUtil.array(new StoreType[]{StoreType.RELATIONSHIP_GROUP}),
        io.github.onograph.TokenConstants.DATA_LINK) {
      @Override
      void runForIm(Checkpointable checkpointable, byte[] _pcfByteArray) {
        _importLogic.calculateNodeDegrees();

        for (

            int tNme = 0; tNme != -1; tNme = _importLogic.linkRelationships(tNme)) {
        }
      }
    });
    _listSaeImportStatus.add(
        new ImportStatus(ArrayUtil.array(new StoreType[]{StoreType.RELATIONSHIP_GROUP}),
            ArrayUtil.array(new StoreType[0]), io.github.onograph.TokenConstants.DEFRAGMENT) {
          @Override
          void runForIm(Checkpointable checkpointable, byte[] _pcfByteArray) {
            _importLogic.defragmentRelationshipGroups();
          }
        });
    _listSaeImportStatus.add(
        new ImportStatus(ArrayUtil.array(new StoreType[0]), ArrayUtil.array(new StoreType[0]),
            null) {
          @Override
          void runForIm(Checkpointable checkpointable, byte[] _pcfByteArray)
              throws IOException {
            _importLogic.buildCountsStore();
            EnterpriseBatchImporter.this.logFilesInitializer
                .initializeLogFiles(EnterpriseBatchImporter.this.databaseLayout,
                    _batchingNeoStores.getNeoStores().getMetaDataStore(),
                    EnterpriseBatchImporter.this.fileSystemAbstraction,
                    io.github.onograph.I18N.format(
                        "io.github.onograph.internal.batchimport.EnterpriseBatchImporter.initializeLogFiles"));
          }
        });
    return Iterators.prefetching(_listSaeImportStatus.iterator());
  }


  private void _rurmnstForBaImIt(BatchingNeoStores _batchingNeoStores,
      Iterator<ImportStatus> _iteratorSaeImportStatus, byte[] _pcByteArray,
      ImportStateDAO _ssImportStateDAO)
      throws IOException {
    while (_iteratorSaeImportStatus.hasNext()) {

      ImportStatus _saeImportStatus = _iteratorSaeImportStatus.next();

      String _strNs = _saeImportStatus.name();
      _saeImportStatus.runForIm((cp) ->
      {
        this._wrtsteForBaImSt(_batchingNeoStores, cp, _ssImportStateDAO, _strNs);
      }, _pcByteArray);
      _saeImportStatus.persist();
      this._wrtsteForBaImSt(_batchingNeoStores, _pcByteArray = PropertyType.EMPTY_BYTE_ARRAY,
          _ssImportStateDAO, _strNs);
    }
  }


  private void _wrtsteForBaImSt(BatchingNeoStores _batchingNeoStores, byte[] _cpByteArray,
      ImportStateDAO _importStateDAO, String _strNs)
      throws IOException {
    _batchingNeoStores.flushAndForce(CursorContext.NULL);
    if (_strNs != null) {
      _importStateDAO.setForSt(_cpByteArray, _strNs);
    } else {
      _importStateDAO.reo();
      this.ssdRelationshipTypeStatsWrapper.reo();
    }
  }

  @Override
  public void doImport(Input _input) throws IOException {

    BatchingNeoStores _batchingNeoStores = ImportLogic
        .instantiateNeoStores(this.fileSystemAbstraction, this.databaseLayout, this.pageCacheTracer,
            this.recordFormats, this.configuration,
            this.logService,
            this.additionalInitialIds, this.dConfig, this.jobScheduler, this.memoryTracker);

    try {

      ImportLogic _importLogic =
          new ImportLogic(this.databaseLayout, _batchingNeoStores, this.configuration, this.dConfig,
              this.logService, this.executionMonitor,
              this.recordFormats,
              this.bCollector, this.monitor, this.pageCacheTracer, this.indexImporterFactory,
              this.memoryTracker);

      try {

        ImportStateDAO _ssImportStateDAO =
            new ImportStateDAO(this.fileSystemAbstraction, this.memoryTracker,
                this.databaseLayout.databaseDirectory()
                    .resolve(io.github.onograph.TokenConstants.STATE));

        PrefetchingIterator<ImportStatus> _prefetchingIteratorSaeImportStatus = this._inassPrefetchingIterator(
            _batchingNeoStores, _importLogic);

        Pair<String, byte[]> _refPair = _ssImportStateDAO.getPair();
        _fafodtlscpdseForBaImStPr(_batchingNeoStores, _refPair.other(),
            _prefetchingIteratorSaeImportStatus, _ssImportStateDAO, _refPair.first());
        _importLogic.initialize(_input);
        this._rurmnstForBaImIt(_batchingNeoStores, _prefetchingIteratorSaeImportStatus,
            _refPair.other(), _ssImportStateDAO);
        _importLogic.success();
      } catch (

          Throwable _throwable) {
        try {
          _importLogic.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _importLogic.close();
    } catch (

        Throwable _throwable3) {
      if (_batchingNeoStores != null) {
        try {
          _batchingNeoStores.close();
        } catch (

            Throwable _throwable4) {
          _throwable3.addSuppressed(_throwable4);
        }
      }

      throw _throwable3;
    }

    if (_batchingNeoStores != null) {
      _batchingNeoStores.close();
    }
  }
}
