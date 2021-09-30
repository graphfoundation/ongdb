package io.github.onograph.dbms.utils;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.eclipse.collections.api.factory.Maps;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.api.map.primitive.ImmutableIntObjectMap;
import org.eclipse.collections.api.map.primitive.MutableIntObjectMap;
import org.eclipse.collections.api.set.primitive.ImmutableIntSet;
import org.eclipse.collections.api.set.primitive.MutableIntSet;
import org.eclipse.collections.impl.factory.Sets;
import org.eclipse.collections.impl.map.mutable.primitive.IntObjectHashMap;
import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;
import org.neo4j.collection.Dependencies;
import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.DatabaseReadOnlyChecker;
import org.neo4j.configuration.pagecache.ConfigurableIOBufferFactory;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.batchimport.AdditionalInitialIds;
import org.neo4j.internal.batchimport.BatchImporter;
import org.neo4j.internal.batchimport.BatchImporterFactory;
import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.Configuration.Overridden;
import org.neo4j.internal.batchimport.ImportLogic;
import org.neo4j.internal.batchimport.IndexConfig;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.input.Groups;
import org.neo4j.internal.batchimport.input.IdType;
import org.neo4j.internal.batchimport.input.Input;
import org.neo4j.internal.batchimport.input.Input.Estimates;
import org.neo4j.internal.batchimport.input.InputChunk;
import org.neo4j.internal.batchimport.staging.ExecutionMonitor;
import org.neo4j.internal.batchimport.staging.ExecutionMonitors;
import org.neo4j.internal.batchimport.staging.SpectrumExecutionMonitor;
import org.neo4j.internal.id.ScanOnOpenReadOnlyIdGeneratorFactory;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.recordstorage.SchemaRuleAccess;
import org.neo4j.internal.recordstorage.StoreTokens;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.mem.MemoryAllocator;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.impl.SingleFilePageSwapperFactory;
import org.neo4j.io.pagecache.impl.muninn.MuninnPageCache;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.extension.DatabaseExtensions;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionFailureStrategies;
import org.neo4j.kernel.extension.context.DatabaseExtensionContext;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.impl.index.schema.IndexImporterFactoryImpl;
import org.neo4j.kernel.impl.scheduler.JobSchedulerFactory;
import org.neo4j.kernel.impl.store.CommonAbstractStore;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.NodeStore;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.RelationshipStore;
import org.neo4j.kernel.impl.store.StoreFactory;
import org.neo4j.kernel.impl.store.StoreHeader;
import org.neo4j.kernel.impl.store.format.RecordFormatSelector;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.RecordStorageCapability;
import org.neo4j.kernel.impl.store.format.aligned.PageAligned;
import org.neo4j.kernel.impl.store.format.standard.Standard;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.storemigration.IndexConfigMigrator;
import org.neo4j.kernel.impl.storemigration.IndexProviderMigrator;
import org.neo4j.kernel.impl.storemigration.RecordStorageMigrator;
import org.neo4j.kernel.impl.storemigration.legacy.SchemaStorage35;
import org.neo4j.kernel.impl.storemigration.legacy.SchemaStore35;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogInitializer;
import org.neo4j.kernel.impl.transaction.state.DefaultIndexProviderMap;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.DuplicatingLogProvider;
import org.neo4j.logging.Level;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.LogTimeZone;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.logging.internal.NullLogService;
import org.neo4j.logging.internal.SimpleLogService;
import org.neo4j.logging.log4j.Log4jLogProvider;
import org.neo4j.logging.log4j.LogConfig;
import org.neo4j.logging.log4j.Neo4jLoggerContext;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.monitoring.Monitors;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.time.SystemNanoClock;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.NamedToken;
import org.neo4j.token.api.TokenHolder;
import org.neo4j.token.api.TokensLoader;


public class NodeStoreWrapper {


  private static final String DST_COP_LT = io.github.onograph.TokenConstants.STORE_COPY;


  private final Config config;


  private final DatabaseLayout frDatabaseLayout;


  private final io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType frmt;


  private final boolean isVroe;


  private final List<String> listKonwlString;


  private final List<String> listLsString;


  private final List<String> listLwndString;


  private final List<TokenNamePropertyDTO> listPnokTokenNamePropertyDTO;


  private final List<TokenNamePropertyDTO> listPnsTokenNamePropertyDTO;


  private final List<TokenNamePropertyDTO> listProkTokenNamePropertyDTO;


  private final List<TokenNamePropertyDTO> listPrsTokenNamePropertyDTO;


  private final List<String> listRsString;


  private final List<String> listSpString;


  private final PrintStream oPrintStream;


  private final PageCacheTracer pageCacheTracer;


  private final SystemNanoClock systemNanoClock;


  private NodeStoreWrapperFilterSpec fcsNodeStoreWrapperFilterSpec;


  private MutableMap<String, List<NamedToken>> mutableMapRtsl;


  private NodeStore nodeStore;


  private PropertyStore propertyStore;


  private RelationshipStore relationshipStore;


  private NodeWrapperInfoMetrics sasNodeWrapperInfoMetrics;


  private TokenHolders tokenHolders;


  public NodeStoreWrapper(Config _config, DatabaseLayout _frDatabaseLayout,
      io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType frmt, boolean _isVroe,
      List<String> _listDnwlString, List<String> _listLsString, List<String> _listLwnokString,
      List<TokenNamePropertyDTO> _listPnokTokenNamePropertyDTO,
      List<TokenNamePropertyDTO> _listPnsTokenNamePropertyDTO,
      List<TokenNamePropertyDTO> _listProkTokenNamePropertyDTO,
      List<TokenNamePropertyDTO> _listPrsTokenNamePropertyDTO, List<String> _listPsString,
      List<String> _listSrString, PrintStream _oPrintStream, PageCacheTracer _pageCacheTracer,
      SystemNanoClock _systemNanoClock) {
    this.config = _config;
    this.frDatabaseLayout = _frDatabaseLayout;
    this.frmt = frmt;
    this.isVroe = _isVroe;
    this.listKonwlString = _listLwnokString;
    this.listLsString = _listLsString;
    this.listLwndString = _listDnwlString;
    this.listPnokTokenNamePropertyDTO = _listPnokTokenNamePropertyDTO;
    this.listPnsTokenNamePropertyDTO = _listPnsTokenNamePropertyDTO;
    this.listProkTokenNamePropertyDTO = _listProkTokenNamePropertyDTO;
    this.listPrsTokenNamePropertyDTO = _listPrsTokenNamePropertyDTO;
    this.listRsString = _listSrString;
    this.listSpString = _listPsString;
    this.oPrintStream = _oPrintStream;
    this.pageCacheTracer = _pageCacheTracer;
    this.systemNanoClock = _systemNanoClock;
  }


  private static NodeStoreWrapperFilterSpec _covtflrNodeStoreWrapperFilterSpec(
      List<TokenNamePropertyDTO> _listKonpTokenNamePropertyDTO, List<String> _listLsString,
      List<String> _listLwndString, List<String> _listLwnokString,
      List<TokenNamePropertyDTO> _listPnsTokenNamePropertyDTO,
      List<TokenNamePropertyDTO> _listProkTokenNamePropertyDTO,
      List<TokenNamePropertyDTO> _listPrsTokenNamePropertyDTO, List<String> _listPsString,
      List<String> _listRsString, NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics,
      TokenHolders _tokenHolders) {

    int[] _iIlwndArray = _geteidForLiTo(_listLwndString, _tokenHolders.labelTokens());

    int[] _iIlwnokArray = _geteidForLiTo(_listLwnokString, _tokenHolders.labelTokens());

    int[] _iIlsArray = _geteidForLiTo(_listLsString, _tokenHolders.labelTokens());

    int[] _iSpiArray = _geteidForLiTo(_listPsString, _tokenHolders.propertyKeyTokens());

    ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIpnsImmutableIntSet =
        _gepoycotniImmutableIntObjectMap(false, _listPnsTokenNamePropertyDTO,
            _tokenHolders.labelTokens(), _tokenHolders.propertyKeyTokens());

    ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIpnokImmutableIntSet =
        _gepoycotniImmutableIntObjectMap(true, _listKonpTokenNamePropertyDTO,
            _tokenHolders.labelTokens(), _tokenHolders.propertyKeyTokens());

    ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIprsImmutableIntSet =
        _gepoycotniImmutableIntObjectMap(false, _listPrsTokenNamePropertyDTO,
            _tokenHolders.relationshipTypeTokens(),
            _tokenHolders.propertyKeyTokens());

    ImmutableIntObjectMap<ImmutableIntSet> _immutableIntObjectMapIprokImmutableIntSet =
        _gepoycotniImmutableIntObjectMap(true, _listProkTokenNamePropertyDTO,
            _tokenHolders.relationshipTypeTokens(),
            _tokenHolders.propertyKeyTokens());

    int[] _iIrsArray = _geteidForLiTo(_listRsString, _tokenHolders.relationshipTypeTokens());
    return new NodeStoreWrapperFilterSpec(_iIlsArray, _iIlwndArray, _iIlwnokArray, _iSpiArray,
        _iIrsArray,
        _immutableIntObjectMapIpnokImmutableIntSet, _immutableIntObjectMapIpnsImmutableIntSet,
        _immutableIntObjectMapIprokImmutableIntSet, _immutableIntObjectMapIprsImmutableIntSet,
        _sasNodeWrapperInfoMetrics);
  }


  private static PageCache _crepcPageCache(Config _config,
      FileSystemAbstraction _fileSystemAbstraction, JobScheduler _jobScheduler, String _strMmr,
      SystemNanoClock _systemNanoClock) {

    SingleFilePageSwapperFactory _singleFilePageSwapperFactory = new SingleFilePageSwapperFactory(
        _fileSystemAbstraction);

    EmptyMemoryTracker _emptyMemoryTracker = EmptyMemoryTracker.INSTANCE;

    MemoryAllocator _memoryAllocator = MemoryAllocator.createAllocator(ByteUnit.parse(_strMmr),
        _emptyMemoryTracker);

    org.neo4j.io.pagecache.impl.muninn.MuninnPageCache.Configuration _configuration =
        MuninnPageCache.config(_memoryAllocator).clock(_systemNanoClock)
            .bufferFactory(new ConfigurableIOBufferFactory(_config, _emptyMemoryTracker));
    return new MuninnPageCache(_singleFilePageSwapperFactory, _jobScheduler, _configuration);
  }


  private static TokensLoader _firditsTokensLoader(final TokensLoader _tokensLoader) {
    return new TokensLoader() {


      private List<NamedToken> getDistinctNamedTokens(List<NamedToken> _listTknNamedToken) {
        if (!_listTknNamedToken.isEmpty()) {

          Set<String> _setNmsString = new HashSet(_listTknNamedToken.size());

          int cur = 0;

          while (cur < _listTknNamedToken.size()) {
            if (_setNmsString.add(((NamedToken) _listTknNamedToken.get(cur)).name())) {
              ++cur;
            } else {
              this.removeNameTokens(_listTknNamedToken, cur);
            }
          }
        }

        return _listTknNamedToken;
      }

      @Override
      public List<NamedToken> getLabelTokens(CursorContext _cursorContext) {
        return this.getDistinctNamedTokens(_tokensLoader.getLabelTokens(_cursorContext));
      }

      @Override
      public List<NamedToken> getPropertyKeyTokens(CursorContext _cursorContext) {
        return this.getDistinctNamedTokens(_tokensLoader.getPropertyKeyTokens(_cursorContext));
      }

      @Override
      public List<NamedToken> getRelationshipTypeTokens(CursorContext _cursorContext) {
        return this.getDistinctNamedTokens(_tokensLoader.getRelationshipTypeTokens(_cursorContext));
      }


      private void removeNameTokens(List<NamedToken> _listLNamedToken, int idx) {

        int _iIl = _listLNamedToken.size() - 1;

        NamedToken _teNamedToken = (NamedToken) _listLNamedToken.remove(_iIl);
        if (idx < _iIl) {
          _listLNamedToken.set(idx, _teNamedToken);
        }
      }
    };
  }


  private static Path _gelfeptPath(Config _config) {
    return ((Path) _config.get(GraphDatabaseSettings.logs_directory))
        .resolve(
            String.format("neo4j-admin-copy-%s.log",
                (new SimpleDateFormat(
                    io.github.onograph.TokenConstants.YYYY__M_M_DD___H_H__MM__SS)).format(
                    new Date())));
  }


  private static ImmutableIntObjectMap<ImmutableIntSet> _gepoycotniImmutableIntObjectMap(
      boolean _isEobg, List<TokenNamePropertyDTO> _listTeowpTokenNamePropertyDTO,
      TokenHolder _teoTokenHolder, TokenHolder _tkpTokenHolder) {

    MutableIntObjectMap<MutableIntSet> _mutableIntObjectMapTcpMutableIntSet = new IntObjectHashMap();

    Iterator _iterator = _listTeowpTokenNamePropertyDTO.iterator();

    while (_iterator.hasNext()) {

      TokenNamePropertyDTO tokenNamePropertyDTO = (TokenNamePropertyDTO) _iterator.next();

      int _iIp = _tkpTokenHolder.getIdByName(tokenNamePropertyDTO.getStrNp());
      if (_iIp == -1) {

        throw new RuntimeException("*** Error: ab19ab6e-b07e-46b5-bdfe-21b80d0fb6f1");
      }

      int _iIteo = _teoTokenHolder.getIdByName(tokenNamePropertyDTO.getStrNt());
      if (_iIteo == -1) {

        throw new RuntimeException("*** Error: 0427f5a1-f9d9-412f-a16d-640e352f2772");
      }

      MutableIntSet _itpMutableIntSet;
      if (_isEobg) {
        _itpMutableIntSet = (MutableIntSet) _mutableIntObjectMapTcpMutableIntSet.getIfAbsentPut(
            _iIteo, IntHashSet::new);
        _itpMutableIntSet.add(_iIp);
      } else {
        _itpMutableIntSet = (MutableIntSet) _mutableIntObjectMapTcpMutableIntSet.getIfAbsentPut(
            _iIp, IntHashSet::new);
        _itpMutableIntSet.add(_iIteo);
      }
    }

    MutableIntObjectMap<ImmutableIntSet> _mutableIntObjectMapSiImmutableIntSet = new IntObjectHashMap();
    _mutableIntObjectMapTcpMutableIntSet.forEachKeyValue((i, integers) ->
    {
      _mutableIntObjectMapSiImmutableIntSet.put(i, integers.toImmutable());
    });
    return _mutableIntObjectMapSiImmutableIntSet.toImmutable();
  }


  private static Collection<String> _geshsteCollection(
      List<ConstraintDescriptor> _listCntanConstraintDescriptor,
      Map<String, IndexDescriptor> _mapIdxssi, NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics,
      TokenHolders _tokenHolders) {

    TokenRead _tokenRead = new TokenReadImmutableImpl(_tokenHolders);

    Map<String, String> _mapSsss = new HashMap();

    Iterator _iterator = _mapIdxssi.values().iterator();

    while (_iterator.hasNext()) {

      IndexDescriptor idx = (IndexDescriptor) _iterator.next();

      try {
        if (!idx.isUnique()) {
          _mapSsss.put(idx.getName(), SchemaQueryGenService.geidshsteString(idx, _tokenRead));
        }
      } catch (

          Exception _exception) {
        _sasNodeWrapperInfoMetrics.inadidForInEx(_exception, idx);
      }
    }

    _iterator = _listCntanConstraintDescriptor.iterator();

    while (_iterator.hasNext()) {

      ConstraintDescriptor _constraintDescriptor = (ConstraintDescriptor) _iterator.next();

      try {

        String _strVr00 = _constraintDescriptor.getName();
        Objects.requireNonNull(_mapIdxssi);
        _mapSsss.put(_strVr00,
            SchemaQueryGenService.gecnhsteString(_constraintDescriptor, _mapIdxssi::get,
                _tokenRead));
      } catch (

          Exception _exception2) {
        _sasNodeWrapperInfoMetrics.inicsnForCoEx(_constraintDescriptor, _exception2);
      }
    }

    return _mapSsss.values();
  }


  private static Collection<String> _geshsteCollectionNV(CursorContext _cursorContext,
      NeoStores _neoStores, NodeWrapperInfoMetrics _sasNodeWrapperInfoMetrics,
      TokenHolders _tokenHolders) {

    SchemaRuleAccess _schemaRuleAccess = SchemaRuleAccess.getSchemaRuleAccess(
        _neoStores.getSchemaStore(), _tokenHolders, _neoStores.getMetaDataStore());

    Map<String, IndexDescriptor> _mapIdxssi = new HashMap<>();

    List<ConstraintDescriptor> _listCntanConstraintDescriptor = new ArrayList<>();
    _schemaRuleAccess.indexesGetAllIgnoreMalformed(_cursorContext).forEachRemaining((index) ->
    {
      if (!index.isTokenIndex()) {
        _mapIdxssi.put(index.getName(), index);
      }
    });

    Iterator<ConstraintDescriptor> _iteratorVr00ConstraintDescriptor = _schemaRuleAccess.constraintsGetAllIgnoreMalformed(
        _cursorContext);
    Objects.requireNonNull(_listCntanConstraintDescriptor);
    _iteratorVr00ConstraintDescriptor.forEachRemaining(_listCntanConstraintDescriptor::add);
    return _geshsteCollection(_listCntanConstraintDescriptor, _mapIdxssi,
        _sasNodeWrapperInfoMetrics, _tokenHolders);
  }


  private static int[] _geteidForLiTo(List<String> _listNtString, TokenHolder _tokenHolder) {

    int[] _iIlArray = new int[_listNtString.size()];

    int cur = 0;

    int _iIl;
    for (

        Iterator _iterator = _listNtString.iterator(); _iterator.hasNext();
        _iIlArray[cur++] = _iIl) {

      String _strNt = (String) _iterator.next();
      _iIl = _tokenHolder.getIdByName(_strNt);
      if (_iIl == -1) {

        throw new RuntimeException("*** Error: 8fc04463-2f90-47e5-ad93-37b0eb35baef");
      }
    }

    return _iIlArray;
  }


  private static RecordFormats _serdfaRecordFormats(RecordFormats _frfRecordFormats,
      io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType frmt) {
    if (frmt == io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_MATCHING) {
      return (RecordFormats) RecordFormatSelector.findLatestFormatInFamily(_frfRecordFormats)
          .orElseThrow(() ->
          {
            return new IllegalArgumentException(
                "*** Error: 97b27211-abda-43dc-9001-22b6f0e75bc4");
          });
    } else if (frmt == io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_HL_TYPE) {
      try {
        return RecordFormatSelector
            .selectForConfig(Config.defaults(GraphDatabaseSettings.record_format,
                    io.github.onograph.TokenConstants.HIGH_LIMIT),
                NullLogProvider.getInstance());
      } catch (

          IllegalArgumentException _illegalArgumentException) {

        throw new IllegalArgumentException("*** Error:  226624c6-f672-4465-988f-89da51835bc8",
            _illegalArgumentException);
      }
    } else {
      return frmt == io.github.onograph.dbms.utils.NodeStoreWrapper.StoreFormatType.SFT_ALIGNED
          ? PageAligned.LATEST_RECORD_FORMATS
          : Standard.LATEST_RECORD_FORMATS;
    }
  }


  private static long _strsiForCo(
      CommonAbstractStore<? extends AbstractBaseRecord, ? extends StoreHeader> _commonAbstractStoreSoeas) {
    try {
      return _commonAbstractStoreSoeas.getStoreSize();
    } catch (

        IOException _iOException) {
      throw new UncheckedIOException(_iOException);
    }
  }


  private IndexConfig _creixciIndexConfig(CursorContext _cursorContext, NeoStores _neoStores) {
    if (_neoStores.getRecordFormats()
        .hasCapability(RecordStorageCapability.FLEXIBLE_SCHEMA_STORE)) {

      SchemaRuleAccess _schemaRuleAccess =
          SchemaRuleAccess.getSchemaRuleAccess(_neoStores.getSchemaStore(), this.tokenHolders,
              _neoStores.getMetaDataStore());

      IndexConfig _indexConfig = IndexConfig.create();
      _schemaRuleAccess.tokenIndexes(_cursorContext).forEachRemaining((index) ->
      {
        if (index.schema().entityType() == EntityType.NODE) {
          _indexConfig.withLabelIndex(index.getName());
        }

        if (index.schema().entityType() == EntityType.RELATIONSHIP) {
          _indexConfig.withRelationshipTypeIndex(index.getName());
        }
      });
      return _indexConfig;
    } else {
      return IndexConfig.create().withLabelIndex();
    }
  }


  private TokenHolder _cretnheTokenHolder(String _strTt) {
    return new TokenHolderDefaultEnterpriseImpl(this.mutableMapRtsl, this.sasNodeWrapperInfoMetrics,
        _strTt);
  }


  private TokenHolders _cretnheTokenHolders(CursorContext _cursorContext, NeoStores _neoStores) {

    TokenHolder _pktTokenHolder = this._cretnheTokenHolder(
        io.github.onograph.TokenConstants.PROPERTY_KEY);

    TokenHolder _tlTokenHolder = this._cretnheTokenHolder(io.github.onograph.TokenConstants.LABEL);

    TokenHolder _rttTokenHolder = this._cretnheTokenHolder(
        io.github.onograph.TokenConstants.RELATIONSHIP_TYPE2);

    TokenHolders _tokenHolders = new TokenHolders(_pktTokenHolder, _tlTokenHolder, _rttTokenHolder);
    _tokenHolders.setInitialTokens(_firditsTokensLoader(StoreTokens.allReadableTokens(_neoStores)),
        _cursorContext);
    return _tokenHolders;
  }


  private Estimates _geeitInputEstimates() {

    long _lgSsp =
        _strsiForCo(this.propertyStore) / 2L + _strsiForCo(this.propertyStore.getStringStore()) / 2L
            +
            _strsiForCo(this.propertyStore.getArrayStore()) / 2L;
    return Input
        .knownEstimates(this.nodeStore.getNumberOfIdsInUse(),
            this.relationshipStore.getNumberOfIdsInUse(), this.propertyStore.getNumberOfIdsInUse(),
            this.propertyStore.getNumberOfIdsInUse(), _lgSsp / 2L, _lgSsp / 2L,
            (long) this.tokenHolders.labelTokens().size());
  }


  private Log4jLogProvider _gelLog4jLogProvider(OutputStream _outputStream) {

    Neo4jLoggerContext _neo4jLoggerContext = LogConfig.createBuilder(_outputStream,
            this.isVroe ? Level.DEBUG : Level.INFO)
        .withTimezone((LogTimeZone) this.config.get(GraphDatabaseSettings.db_timezone)).build();
    return new Log4jLogProvider(_neo4jLoggerContext);
  }


  private Collection<String> _geshsteCollection(CursorContext _cursorContext,
      FileSystemAbstraction _fFileSystemAbstraction, PageCache _froPageCache,
      JobScheduler _jobScheduler, Log _log, RecordFormats _recordFormats,
      TokenHolders _tokenHolders) {

    Map<String, IndexDescriptor> _mapIdxssi = new HashMap();

    List<ConstraintDescriptor> _listCntanConstraintDescriptor = new ArrayList();

    LifeSupport _lifeSupport = new LifeSupport();

    DatabaseReadOnlyChecker _databaseReadOnlyChecker = DatabaseReadOnlyChecker.readOnly();

    List _list;
    try {

      SchemaStore35 _schemaStore35 =
          new SchemaStore35(this.frDatabaseLayout.schemaStore(),
              this.frDatabaseLayout.idSchemaStore(), this.config,
              org.neo4j.internal.id.IdType.SCHEMA,
              new ScanOnOpenReadOnlyIdGeneratorFactory(), _froPageCache,
              NullLogProvider.getInstance(), _recordFormats,
              _databaseReadOnlyChecker,
              this.frDatabaseLayout.getDatabaseName(), Sets.immutable.empty());

      try {
        _schemaStore35.initialise(true, _cursorContext);

        SchemaStorage35 _schemaStorage35 = new SchemaStorage35(_schemaStore35);

        Dependencies _depDependencies = new Dependencies();

        Monitors _monitors = new Monitors();
        _depDependencies.satisfyDependencies(
            new Object[]{_fFileSystemAbstraction, this.config, _froPageCache,
                NullLogService.getInstance(), _monitors,
                RecoveryCleanupWorkCollector.immediate(),
                this.pageCacheTracer, this.frDatabaseLayout, _jobScheduler, _tokenHolders,
                _databaseReadOnlyChecker});

        DatabaseExtensionContext _databaseExtensionContext = new DatabaseExtensionContext(
            this.frDatabaseLayout, DbmsInfo.UNKNOWN, _depDependencies);

        Iterable<ExtensionFactory<?>> _iterableFeExtensionFactory = GraphDatabaseDependencies.newDependencies()
            .extensions();

        DatabaseExtensions _databaseExtensions = (DatabaseExtensions) _lifeSupport
            .add(new DatabaseExtensions(_databaseExtensionContext, _iterableFeExtensionFactory,
                _depDependencies,
                ExtensionFailureStrategies.ignore()));

        DefaultIndexProviderMap _defaultIndexProviderMap =
            (DefaultIndexProviderMap) _lifeSupport.add(
                new DefaultIndexProviderMap(_databaseExtensions, this.config));
        _lifeSupport.start();

        Map<Long, SchemaRule> _mapIbrls = new LinkedHashMap();

        Iterable<SchemaRule> _iterableSrSchemaRule = _schemaStorage35.getAllIgnoreMalformed(
            _cursorContext);
        _iterableSrSchemaRule.forEach((rule) ->
        {
          _mapIbrls.put(rule.getId(), rule);
        });
        RecordStorageMigrator.schemaGenerateNames(_iterableSrSchemaRule, _tokenHolders, _mapIbrls);

        Iterator _iterator = _mapIbrls.entrySet().iterator();

        while (_iterator.hasNext()) {

          Entry<Long, SchemaRule> _entryEtyls = (Entry) _iterator.next();

          SchemaRule _schemaRule = (SchemaRule) _entryEtyls.getValue();
          if (_schemaRule instanceof IndexDescriptor) {

            IndexDescriptor _indexDescriptor = (IndexDescriptor) _schemaRule;

            try {
              _indexDescriptor = (IndexDescriptor) IndexConfigMigrator
                  .migrateIndexConfig(_indexDescriptor, this.frDatabaseLayout,
                      _fFileSystemAbstraction, _froPageCache,
                      _defaultIndexProviderMap, _log, _cursorContext);
              _indexDescriptor = (IndexDescriptor) IndexProviderMigrator.upgradeIndexProvider(
                  _indexDescriptor);
              _mapIdxssi.put(_indexDescriptor.getName(), _indexDescriptor);
            } catch (

                IOException _iOException) {
              this.sasNodeWrapperInfoMetrics.inadidForInEx(_iOException, _indexDescriptor);
            }
          } else if (_schemaRule instanceof ConstraintDescriptor) {
            _listCntanConstraintDescriptor.add((ConstraintDescriptor) _schemaRule);
          }
        }
      } catch (

          Throwable _throwable) {
        try {
          _schemaStore35.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _schemaStore35.close();
      return _geshsteCollection(_listCntanConstraintDescriptor, _mapIdxssi,
          this.sasNodeWrapperInfoMetrics, _tokenHolders);
    } catch (

        Exception _exception) {

      _list = Collections.emptyList();
    } finally {
      _lifeSupport.shutdown();
    }

    return _list;
  }


  private InputIteratorInputChunkImpl _noeietInputIteratorInputChunkImpl(
      final PageCacheTracer _pageCacheTracer) {
    return new InputIteratorInputChunkImpl(this.nodeStore) {
      @Override
      public InputChunk newChunk() {
        return new NodeReadingInputChunk(
            NodeStoreWrapper.this.fcsNodeStoreWrapperFilterSpec, NodeStoreWrapper.this.nodeStore,
            _pageCacheTracer,
            NodeStoreWrapper.this.propertyStore, NodeStoreWrapper.this.sasNodeWrapperInfoMetrics,
            NodeStoreWrapper.this.tokenHolders);
      }
    };
  }


  private InputIteratorInputChunkImpl _reiiirInputIteratorInputChunkImpl(
      final PageCacheTracer _pageCacheTracer) {
    return new InputIteratorInputChunkImpl(this.relationshipStore) {
      @Override
      public InputChunk newChunk() {
        return new RelationshipReadingInputChunk(
            NodeStoreWrapper.this.fcsNodeStoreWrapperFilterSpec, _pageCacheTracer,
            NodeStoreWrapper.this.propertyStore, NodeStoreWrapper.this.relationshipStore,
            NodeStoreWrapper.this.sasNodeWrapperInfoMetrics,
            NodeStoreWrapper.this.tokenHolders);
      }
    };
  }


  public void coytForDaSt(String _strMcpf, DatabaseLayout _tDatabaseLayout) throws Exception {

    Path _pplPath = _gelfeptPath(this.config);

    BufferedOutputStream _flBufferedOutputStream = new BufferedOutputStream(
        Files.newOutputStream(_pplPath));

    try {

      Log4jLogProvider _logLog4jLogProvider = this._gelLog4jLogProvider(_flBufferedOutputStream);

      try {

        Log4jLogProvider _loLog4jLogProvider = this._gelLog4jLogProvider(this.oPrintStream);

        try {

          LogProvider _logProvider = new DuplicatingLogProvider(_logLog4jLogProvider,
              _loLog4jLogProvider);

          Log _log = _logProvider.getLog(io.github.onograph.TokenConstants.STORE_COPY);

          CursorContext _cursorContext =
              new CursorContext(this.pageCacheTracer.createPageCursorTracer(
                  io.github.onograph.TokenConstants.STORE_COPY2));

          try {

            DefaultFileSystemAbstraction _fDefaultFileSystemAbstraction = new DefaultFileSystemAbstraction();

            try {

              JobScheduler _jobScheduler = JobSchedulerFactory.createInitialisedScheduler();

              try {

                PageCache _froPageCache =
                    _crepcPageCache(this.config, _fDefaultFileSystemAbstraction, _jobScheduler,
                        _strMcpf, this.systemNanoClock);

                try {

                  NeoStores _neoStores =
                      (new StoreFactory(this.frDatabaseLayout, this.config,
                          new ScanOnOpenReadOnlyIdGeneratorFactory(), _froPageCache,
                          _fDefaultFileSystemAbstraction,
                          NullLogProvider.getInstance(), this.pageCacheTracer,
                          DatabaseReadOnlyChecker.readOnly()))
                          .openAllNeoStores();

                  try {

                    this.nodeStore = _neoStores.getNodeStore();
                    this.propertyStore = _neoStores.getPropertyStore();
                    this.relationshipStore = _neoStores.getRelationshipStore();
                    this.mutableMapRtsl = Maps.mutable.empty();
                    this.sasNodeWrapperInfoMetrics = new NodeWrapperInfoMetrics(_log);
                    this.tokenHolders = this._cretnheTokenHolders(_cursorContext, _neoStores);
                    this.fcsNodeStoreWrapperFilterSpec =
                        _covtflrNodeStoreWrapperFilterSpec(this.listPnokTokenNamePropertyDTO,
                            this.listLsString, this.listLwndString,
                            this.listKonwlString,
                            this.listPnsTokenNamePropertyDTO, this.listProkTokenNamePropertyDTO,
                            this.listPrsTokenNamePropertyDTO,
                            this.listSpString, this.listRsString, this.sasNodeWrapperInfoMetrics,
                            this.tokenHolders);

                    RecordFormats _recordFormats = _serdfaRecordFormats(
                        _neoStores.getRecordFormats(), this.frmt);

                    ExecutionMonitor _executionMonitor =
                        this.isVroe ? new SpectrumExecutionMonitor(2L, TimeUnit.SECONDS,
                            this.oPrintStream, 100)
                            : ExecutionMonitors.defaultVisible();

                    final IndexConfig _indexConfig = this._creixciIndexConfig(_cursorContext,
                        _neoStores);

                    Configuration _icConfiguration =
                        new Overridden(Configuration.defaultConfiguration(
                            _tDatabaseLayout.databaseDirectory())) {
                          @Override
                          public IndexConfig indexConfig() {
                            return _indexConfig;
                          }
                        };

                    BatchImporter _batchImporter = BatchImporterFactory.withHighestPriority()
                        .instantiate(_tDatabaseLayout, _fDefaultFileSystemAbstraction,
                            PageCacheTracer.NULL,
                            _icConfiguration, new SimpleLogService(_logProvider),
                            (ExecutionMonitor) _executionMonitor,
                            AdditionalInitialIds.EMPTY, this.config,
                            _recordFormats,
                            ImportLogic.NO_MONITOR, _jobScheduler, Collector.EMPTY,
                            TransactionLogInitializer.getLogFilesInitializer(),
                            new IndexImporterFactoryImpl(this.config),
                            EmptyMemoryTracker.INSTANCE);
                    _batchImporter.doImport(Input.input(() ->
                    {
                      return this._noeietInputIteratorInputChunkImpl(this.pageCacheTracer);
                    }, () ->
                    {
                      return this._reiiirInputIteratorInputChunkImpl(this.pageCacheTracer);
                    }, IdType.INTEGER, this._geeitInputEstimates(), new Groups()));
                    this.sasNodeWrapperInfoMetrics.prnsua();

                    Collection _ssCollection;
                    if (_neoStores.getRecordFormats()
                        .hasCapability(RecordStorageCapability.FLEXIBLE_SCHEMA_STORE)) {
                      _ssCollection =
                          _geshsteCollectionNV(_cursorContext, _neoStores,
                              this.sasNodeWrapperInfoMetrics, this.tokenHolders);
                    } else {
                      _ssCollection =
                          this._geshsteCollection(_cursorContext, _fDefaultFileSystemAbstraction,
                              _froPageCache, _jobScheduler, _log,
                              _neoStores.getRecordFormats(), this.tokenHolders);
                    }

                    int _iCs = _ssCollection.size();
                    if (_iCs == 0) {

                    } else {

                      String _strLn = System.lineSeparator();

                      if (_iCs > 1) {

                      }
                    }

                    if (this.mutableMapRtsl.notEmpty()) {

                      this.mutableMapRtsl.forEach((type, tokens) ->
                      {

                        Iterator _iterator = tokens.iterator();

                        while (_iterator.hasNext()) {

                          NamedToken _namedToken = (NamedToken) _iterator.next();


                        }
                      });
                    }
                  } catch (

                      Throwable _throwable) {
                    if (_neoStores != null) {
                      try {
                        _neoStores.close();
                      } catch (

                          Throwable _throwable2) {
                        _throwable.addSuppressed(_throwable2);
                      }
                    }

                    throw _throwable;
                  }

                  if (_neoStores != null) {
                    _neoStores.close();
                  }
                } catch (

                    Throwable _throwable3) {
                  if (_froPageCache != null) {
                    try {
                      _froPageCache.close();
                    } catch (

                        Throwable _throwable4) {
                      _throwable3.addSuppressed(_throwable4);
                    }
                  }

                  throw _throwable3;
                }

                if (_froPageCache != null) {
                  _froPageCache.close();
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
            } catch (

                Throwable _throwable7) {
              try {
                _fDefaultFileSystemAbstraction.close();
              } catch (

                  Throwable _throwable8) {
                _throwable7.addSuppressed(_throwable8);
              }

              throw _throwable7;
            }

            _fDefaultFileSystemAbstraction.close();
          } catch (

              Throwable _throwable9) {
            try {
              _cursorContext.close();
            } catch (

                Throwable _throwable10) {
              _throwable9.addSuppressed(_throwable10);
            }

            throw _throwable9;
          }

          _cursorContext.close();
        } catch (

            Throwable _throwable11) {
          if (_loLog4jLogProvider != null) {
            try {
              _loLog4jLogProvider.close();
            } catch (

                Throwable _throwable12) {
              _throwable11.addSuppressed(_throwable12);
            }
          }

          throw _throwable11;
        }

        if (_loLog4jLogProvider != null) {
          _loLog4jLogProvider.close();
        }
      } catch (

          Throwable _throwable13) {
        if (_logLog4jLogProvider != null) {
          try {
            _logLog4jLogProvider.close();
          } catch (

              Throwable _throwable14) {
            _throwable13.addSuppressed(_throwable14);
          }
        }

        throw _throwable13;
      }

      if (_logLog4jLogProvider != null) {
        _logLog4jLogProvider.close();
      }
    } catch (

        Throwable _throwable15) {
      try {
        _flBufferedOutputStream.close();
      } catch (

          Throwable _throwable16) {
        _throwable15.addSuppressed(_throwable16);
      }

      throw _throwable15;
    }

    _flBufferedOutputStream.close();
  }


  public static enum StoreFormatType {


    SFT_MATCHING,

    SFT_STANDARD,

    SFT_HL_TYPE,

    SFT_ALIGNED;
  }
}
