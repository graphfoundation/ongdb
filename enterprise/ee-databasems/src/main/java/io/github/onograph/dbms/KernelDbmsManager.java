package io.github.onograph.dbms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.bolt.txtracking.ReconciledTransactionTracker;
import org.neo4j.configuration.GraphDatabaseSettings.Mode;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


class KernelDbmsManager extends AbstractDbmsManager {


  private static final GdbMetaClone SYT_STAX_SNPO;

  static {
    SYT_STAX_SNPO = new GdbMetaClone(0L, DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID,
        OperatorStateEnterpriseTypeImpl.SETI_RUNNING);
  }


  private final DefaultSystemGraphDbmsModel defaultSystemGraphDbmsModel;


  private final Log log;


  private final Mode mdstr;


  private final ReconciledTransactionTracker ttrReconciledTransactionTracker;


  private volatile Map<String, GdbMetaClone> mapDsrdsg;


  KernelDbmsManager(DefaultSystemGraphDbmsModel _defaultSystemGraphDbmsModel,
      LogProvider _logProvider, Mode mdstr,
      ReconciledTransactionTracker _ttrReconciledTransactionTracker) {
    this.mdstr = mdstr;
    this.mapDsrdsg = new HashMap();
    this.mapDsrdsg.put(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.name(), SYT_STAX_SNPO);
    this.defaultSystemGraphDbmsModel = _defaultSystemGraphDbmsModel;
    this.ttrReconciledTransactionTracker = _ttrReconciledTransactionTracker;
    this.log = _logProvider.getLog(this.getClass());
  }


  private void _ofrctani(boolean _isCsopa, long transIdx) {
    try {
      if (_isCsopa) {
        this.ttrReconciledTransactionTracker.enable(transIdx);
      } else {
        this.ttrReconciledTransactionTracker.offerReconciledTransactionId(transIdx);
      }
    } catch (

        Throwable _throwable) {

    }
  }


  private void _reoi(boolean _isCsopa, long transIdx) {

    GdbInfoWrapper _udGdbInfoWrapper;
    try {
      _udGdbInfoWrapper = this.upedrsaGdbInfoWrapper();
    } catch (

        Exception _exception) {

      return;
    }

    if (_isCsopa) {
      this.ttrReconciledTransactionTracker.disable();
    }

    Set<NamedDatabaseId> _setDuaNamedDatabaseId = _udGdbInfoWrapper.allSet();

    DbmsResolverAction _rqetDbmsResolverAction;
    if (_setDuaNamedDatabaseId.isEmpty()) {
      _rqetDbmsResolverAction = DbmsResolverAction.sipDbmsResolverAction();
    } else {
      _rqetDbmsResolverAction = DbmsResolverAction.tagsDbmsResolverActionHasDefined(
              _udGdbInfoWrapper.getSetCagdNamedDatabaseId())
          .pritrDbmsResolverActionRequiresGeneration(_udGdbInfoWrapper.getSetDopdNamedDatabaseId())
          .create();
    }

    DbmsResolverMeta _rrDbmsResolverMeta = this.trgrDbmsResolverMeta(_rqetDbmsResolverAction);
    _rrDbmsResolverMeta.whncmeForRu(() ->
    {
      this._ofrctani(_isCsopa, transIdx);
    });
    if (Objects.equals(this.mdstr, Mode.SINGLE)) {
      _rrDbmsResolverMeta.awiForNa(_setDuaNamedDatabaseId);
    }
  }

  @Override
  protected Map<String, DatabaseStateEnterpriseImpl> deidMapEP() {

    Map<String, GdbMetaClone> _mapDcsg = this.mapDsrdsg;
    return _mapDcsg.entrySet().stream().collect(Collectors.toMap(Entry::getKey, (e) ->
    {
      return e.getValue().getDatabaseStateEnterpriseImpl();
    }));
  }


  void strread(long transIdx) {
    this._reoi(true, transIdx);
  }


  void tranci(long transIdx) {
    this._reoi(false, transIdx);
  }


  synchronized GdbInfoWrapper upedrsaGdbInfoWrapper() {

    Map<String, GdbMetaClone> _mapScsg = this.mapDsrdsg;

    Map<String, GdbMetaClone> _mapSnsg = this.defaultSystemGraphDbmsModel.gedteseMap();

    HashMap<String, GdbMetaClone> _hashMapDnsg = new HashMap();
    Objects.requireNonNull(_hashMapDnsg);
    _mapScsg.forEach(_hashMapDnsg::put);
    Objects.requireNonNull(_hashMapDnsg);
    _mapSnsg.forEach(_hashMapDnsg::put);
    _hashMapDnsg.put(DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.name(), SYT_STAX_SNPO);
    this.mapDsrdsg = _hashMapDnsg;
    return DefaultSystemGraphDbmsModel.upedasGdbInfoWrapper(_mapScsg, _mapSnsg);
  }
}
