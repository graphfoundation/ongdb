package io.github.onograph.dbms.gdb;

import io.github.onograph.config.MainSettings;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.dbms.api.DatabaseExistsException;
import org.neo4j.dbms.api.DatabaseLimitReachedException;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.dbms.database.AbstractDatabaseManager;
import org.neo4j.dbms.database.DatabaseOperationCounts.Counter;
import org.neo4j.dbms.database.SystemGraphDbmsModel;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.storageengine.migration.UpgradeNotAllowedException;


public abstract class AbstractMultipleGdbDatabaseManager<DB extends DefaultDatabaseContext> extends
    AbstractDatabaseManager<DB> {


  private final Counter coCounter;


  private final LifecycleAdapterGdbFlushingImpl ddrLifecycleAdapterGdbFlushingImpl;


  private final long lgDonm;


  private volatile boolean isSmd;


  public AbstractMultipleGdbDatabaseManager(AbstractEditionModule _abstractEditionModule,
      GlobalModule _globalModule) {
    this(_abstractEditionModule, _globalModule, false);
  }


  AbstractMultipleGdbDatabaseManager(AbstractEditionModule _abstractEditionModule,
      GlobalModule _globalModule, boolean _isSasodm) {
    super(_globalModule, _abstractEditionModule, _isSasodm);
    this.coCounter = _globalModule.getGlobalDependencies().resolveDependency(Counter.class);
    this.lgDonm = _globalModule.getGlobalConfig().get(MainSettings.settingMamfbLong);
    this.ddrLifecycleAdapterGdbFlushingImpl =
        new LifecycleAdapterGdbFlushingImpl(_globalModule.getGlobalClock(),
            _globalModule.getGlobalConfig(), _globalModule.getFileSystem());
  }


  private void _reuesaeForNa(NamedDatabaseId _namedDatabaseId) {
    if (!this.isSmd) {

      throw new IllegalStateException("*** Error: d6c9561f-5664-4b85-a331-e32872857978");
    }
  }

  @Override
  public DB createDatabase(NamedDatabaseId _namedDatabaseId) throws DatabaseManagementException {

    DB _dCd;
    try {

      Map<Setting<?>, Object> _mapDssso = this.redasscsnMap(_namedDatabaseId);
      _dCd = this.createDatabaseContext(_namedDatabaseId, _mapDssso);
    } catch (

        Exception _exception) {

      throw new DatabaseManagementException("*** Error: 83bc4030-3c47-4ae9-bb2f-4d2883100a47",
          _exception);
    }

    this.databaseMap.put(_namedDatabaseId, _dCd);
    this.databaseIdRepository().cache(_namedDatabaseId);
    this.coCounter.increaseCreateCount();
    return _dCd;
  }


  public void drdasdpdForNa(NamedDatabaseId _namedDatabaseId) throws DatabaseNotFoundException {
    this.removeGDB(true, _namedDatabaseId);
  }

  @Override
  public void dropDatabase(NamedDatabaseId _namedDatabaseId) throws DatabaseNotFoundException {
    this.removeGDB(false, _namedDatabaseId);
  }


  protected final void fosndasForNaBi(BiConsumer<NamedDatabaseId, DB> _biConsumerCnuend,
      NamedDatabaseId _namedDatabaseId) {
    this._reuesaeForNa(_namedDatabaseId);

    DB _dC = this.databaseMap.get(_namedDatabaseId);
    if (_dC == null) {

      throw new DatabaseNotFoundException("*** Error: 9a1192ca-2746-41ae-9b86-ec1c9aac1205");
    } else {
      _biConsumerCnuend.accept(_namedDatabaseId, _dC);
    }
  }

  @Override
  public Optional<DB> getDatabaseContext(NamedDatabaseId _namedDatabaseId) {
    return Optional.ofNullable(this.databaseMap.get(_namedDatabaseId));
  }


  protected LifecycleAdapterGdbFlushingImpl getDdrLifecycleAdapterGdbFlushingImpl() {
    return this.ddrLifecycleAdapterGdbFlushingImpl;
  }


  protected void processRemoveGdb(DB _dCnet, boolean _isDd, NamedDatabaseId _namedDatabaseId) {

    if (_isDd) {
      this.getDdrLifecycleAdapterGdbFlushingImpl().dumForDa(_dCnet);
    }

    Database _database = _dCnet.database();
    _database.drop();
  }


  protected Map<Setting<?>, Object> redasscsnMap(NamedDatabaseId _namedDatabaseId) {

    Map<Setting<?>, Object> _mapSsdso = Collections.emptyMap();
    if (!_namedDatabaseId.isSystemDatabase()) {

      Optional<DB> _optionalSdcDB = this.getDatabaseContext(
          DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID);
      if (_optionalSdcDB.isPresent()) {

        Transaction _tTransaction = _optionalSdcDB.get().databaseFacade().beginTx();

        try {

          Node _dNode = _tTransaction.findNode(SystemGraphDbmsModel.DATABASE_LABEL,
              io.github.onograph.TokenConstants.UUID,
              _namedDatabaseId.databaseId().uuid().toString());
          if (_dNode != null) {

            String _strNes = (String) _dNode.getProperty(
                io.github.onograph.TokenConstants.STORAGE_ENGINE, null);
            if (_strNes != null) {
              _mapSsdso = Collections.singletonMap(GraphDatabaseInternalSettings.storage_engine,
                  _strNes);
            }
          }
        } catch (

            Throwable _throwable) {
          if (_tTransaction != null) {
            try {
              _tTransaction.close();
            } catch (

                Throwable _throwable2) {
              _throwable.addSuppressed(_throwable2);
            }
          }

          throw _throwable;
        }

        if (_tTransaction != null) {
          _tTransaction.close();
        }
      }
    }

    return _mapSsdso;
  }


  public void reedbcotForNa(NamedDatabaseId _namedDatabaseId) {
    this.databaseMap.remove(_namedDatabaseId);
    this.coCounter.increaseDropCount();
  }


  private void removeGDB(boolean _isDd, NamedDatabaseId _namedDatabaseId)
      throws DatabaseNotFoundException {
    if ("system".equals(_namedDatabaseId.name())) {

      throw new DatabaseManagementException("*** Error:  66658913-c988-45c7-b663-1f2fff4b34c1");
    } else {
      this.fosndasForNaBi((id, context) ->
      {
        this.removeGDB(context, _isDd, id);
      }, _namedDatabaseId);
    }
  }


  protected void removeGDB(DB _dCnet, boolean _isDd, NamedDatabaseId _namedDatabaseId) {
    try {
      this.processRemoveGdb(_dCnet, _isDd, _namedDatabaseId);
      this.databaseIdRepository().invalidate(_namedDatabaseId);
      this.reedbcotForNa(_namedDatabaseId);
    } catch (

        Throwable _throwable) {

      throw new DatabaseManagementException("*** Error: 26429276-9e4f-4cff-b610-5af1bce079ee",
          _throwable);
    }
  }

  @Override
  public final void shutdown() {
    this.databaseMap.clear();
  }

  @Override
  public void start() throws Exception {
    if (!this.isSmd) {
      this.isSmd = true;
      super.start();
      this.ddrLifecycleAdapterGdbFlushingImpl.start();
    }
  }

  @Override
  public void startDatabase(NamedDatabaseId _namedDatabaseId) throws DatabaseNotFoundException {
    this.fosndasForNaBi(this::startDatabase, _namedDatabaseId);
    this.coCounter.increaseStartCount();
  }

  @Override
  protected void startDatabase(NamedDatabaseId _namedDatabaseId, DB _dCnet) {
    try {
      this.strdabeForNaDBEP(_dCnet, _namedDatabaseId);
    } catch (

        Throwable _throwable) {
      this.unetsadteForNaTh(_namedDatabaseId, _throwable);
    }
  }

  @Override
  public void stop() throws Exception {
    if (this.isSmd) {
      super.stop();
      this.isSmd = false;
      this.ddrLifecycleAdapterGdbFlushingImpl.stop();
    }
  }

  @Override
  public void stopDatabase(NamedDatabaseId _namedDatabaseId) throws DatabaseNotFoundException {
    this.fosndasForNaBi(this::stopDatabase, _namedDatabaseId);
    this.coCounter.increaseStopCount();
  }

  @Override
  protected void stopDatabase(NamedDatabaseId _namedDatabaseId, DB _dCnet) {
    try {

      _dCnet.enpdaGdb().stopLC();
    } catch (

        Throwable _throwable) {

      throw new DatabaseManagementException("*** Error: c0932ce3-84bf-47c8-9ffa-5798c16e7b65",
          _throwable);
    }
  }


  protected void strdabeForNaDBEP(DB _dCnet, NamedDatabaseId _namedDatabaseId) {

    _dCnet.enpdaGdb().startLC();
  }


  protected void unetsadteForNaTh(NamedDatabaseId _namedDatabaseId, Throwable _throwable) {

    String m = String.format("*** Error: [%s]:", _namedDatabaseId);
    if (ExceptionUtils.getRootCause(_throwable) instanceof UpgradeNotAllowedException) {
      m = m + "Needs to be updated.";
    }

    throw new DatabaseManagementException("*** Error: 510fbbfd-b8d1-4051-83f6-55188161de76",
        _throwable);
  }


  public void vaadtectForNa(NamedDatabaseId _namedDatabaseId) throws DatabaseManagementException {
    if (this.databaseMap.get(_namedDatabaseId) != null) {

      throw new DatabaseExistsException("*** Error: d7105bf3-59f1-4518-80c4-acc37080e5ef");
    } else if ((long) this.databaseMap.size() >= this.lgDonm) {

      throw new DatabaseLimitReachedException("*** Error: 05f5bde8-3aa6-4acb-88da-90a04aeb56b0");
    }
  }
}
