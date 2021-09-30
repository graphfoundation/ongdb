package io.github.onograph.dbms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DbmsManagerClusterImpl extends AbstractDbmsManager {


  private final List<io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade> listScStoreSyncOpFacade = new CopyOnWriteArrayList();


  private final Set<NamedDatabaseId> setBosrpNamedDatabaseId = ConcurrentHashMap.newKeySet();


  private final Set<NamedDatabaseId> setSsNamedDatabaseId = ConcurrentHashMap.newKeySet();


  private boolean _isTreroeostcoForNa(NamedDatabaseId _namedDatabaseId) {
    if (!this.setBosrpNamedDatabaseId.contains(_namedDatabaseId)
        && !this.setSsNamedDatabaseId.contains(_namedDatabaseId)) {
      this.trgrDbmsResolverMeta(DbmsResolverAction.sipDbmsResolverAction())
          .joiForCo(_namedDatabaseId);
      return true;
    } else {
      return false;
    }
  }


  public io.github.onograph.dbms.DbmsManagerClusterImpl.IntegrationManager botrDbmsManagerClusterImplIntegrationManager(
      NamedDatabaseId _namedDatabaseId) {
    this.setBosrpNamedDatabaseId.add(_namedDatabaseId);
    return new io.github.onograph.dbms.DbmsManagerClusterImpl.IntegrationManager(_namedDatabaseId,
        this);
  }

  @Override
  protected Map<String, DatabaseStateEnterpriseImpl> deidMapEP() {

    HashMap<String, DatabaseStateEnterpriseImpl> _hashMapRslsd = new HashMap();

    Iterator _iterator = this.listScStoreSyncOpFacade.iterator();

    while (_iterator.hasNext()) {

      io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade _hcsStoreSyncOpFacade =
          (io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade) _iterator.next();

      NamedDatabaseId _namedDatabaseId = _hcsStoreSyncOpFacade.namedDatabaseId;
      if (!this.setBosrpNamedDatabaseId.contains(_namedDatabaseId)) {
        _hashMapRslsd.put(_namedDatabaseId.name(),
            new DatabaseStateEnterpriseImpl(_namedDatabaseId,
                OperatorStateEnterpriseTypeImpl.SETI_SC_IN_PROGRESS));
      }
    }

    _iterator = this.setSsNamedDatabaseId.iterator();

    while (_iterator.hasNext()) {

      NamedDatabaseId _namedDatabaseId2 = (NamedDatabaseId) _iterator.next();
      _hashMapRslsd.put(_namedDatabaseId2.name(),
          new DatabaseStateEnterpriseImpl(_namedDatabaseId2,
              OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING));
    }

    return _hashMapRslsd;
  }


  public io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade stfosrcyDbmsManagerClusterImplStoreSyncOpFacade(
      NamedDatabaseId _namedDatabaseId) {

    io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade _hcsStoreSyncOpFacade =
        new io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade(_namedDatabaseId,
            this);
    this.listScStoreSyncOpFacade.add(_hcsStoreSyncOpFacade);

    try {
      this._isTreroeostcoForNa(_namedDatabaseId);
      return _hcsStoreSyncOpFacade;
    } catch (

        Exception _exception) {
      this.listScStoreSyncOpFacade.remove(_hcsStoreSyncOpFacade);
      throw _exception;
    }
  }


  public static class IntegrationManager {


    private final NamedDatabaseId namedDatabaseId;


    private final DbmsManagerClusterImpl oeaoDbmsManagerClusterImpl;


    private IntegrationManager(NamedDatabaseId _namedDatabaseId,
        DbmsManagerClusterImpl _oeaoDbmsManagerClusterImpl) {
      this.namedDatabaseId = _namedDatabaseId;
      this.oeaoDbmsManagerClusterImpl = _oeaoDbmsManagerClusterImpl;
    }


    public void reee() {
      if (!this.oeaoDbmsManagerClusterImpl.setBosrpNamedDatabaseId.remove(this.namedDatabaseId)) {

        throw new IllegalStateException("*** Error: 7445373a-4ef3-4098-9ff6-03d9a165ced6");
      }
    }
  }


  public static class StoreSyncOpFacade {


    private final NamedDatabaseId namedDatabaseId;


    private final DbmsManagerClusterImpl oeaoDbmsManagerClusterImpl;


    private StoreSyncOpFacade(NamedDatabaseId _namedDatabaseId,
        DbmsManagerClusterImpl _oeaoDbmsManagerClusterImpl) {
      this.namedDatabaseId = _namedDatabaseId;
      this.oeaoDbmsManagerClusterImpl = _oeaoDbmsManagerClusterImpl;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if (obj != null && this.getClass() == obj.getClass()) {

        io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade _tStoreSyncOpFacade =
            (io.github.onograph.dbms.DbmsManagerClusterImpl.StoreSyncOpFacade) obj;
        return Objects.equals(this.namedDatabaseId, _tStoreSyncOpFacade.namedDatabaseId);
      } else {
        return false;
      }
    }


    public NamedDatabaseId getNamedDatabaseId() {
      return this.namedDatabaseId;
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.namedDatabaseId);
    }


    public boolean isReee() {

      boolean _isEit = this.oeaoDbmsManagerClusterImpl.listScStoreSyncOpFacade.remove(this);
      if (!_isEit) {

        throw new IllegalStateException("*** Error: a4fa17e4-5339-4e16-b1d6-30de131bcecb");
      } else {
        return this.oeaoDbmsManagerClusterImpl._isTreroeostcoForNa(this.namedDatabaseId);
      }
    }
  }
}
