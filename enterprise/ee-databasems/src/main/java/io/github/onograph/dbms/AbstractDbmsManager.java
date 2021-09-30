package io.github.onograph.dbms;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.neo4j.util.VisibleForTesting;


public abstract class AbstractDbmsManager {


  private final AtomicReference<ManagerFacade> atomicReferenceCnetdManagerFacade = new AtomicReference();


  final void contForMa(ManagerFacade _cnetrManagerFacade) {
    Objects.requireNonNull(_cnetrManagerFacade);
    this.atomicReferenceCnetdManagerFacade.compareAndSet(null, _cnetrManagerFacade);
  }


  @VisibleForTesting
  final Optional<ManagerFacade> contOptional() {
    return Optional.ofNullable(this.atomicReferenceCnetdManagerFacade.get());
  }


  protected abstract Map<String, DatabaseStateEnterpriseImpl> deidMapEP();


  final void dicntForMa(ManagerFacade _cnetrManagerFacade) {
    this.atomicReferenceCnetdManagerFacade.compareAndSet(_cnetrManagerFacade, null);
  }


  final Map<String, DatabaseStateEnterpriseImpl> getPrefMap() {
    return Map.copyOf(this.deidMapEP());
  }


  final DbmsResolverMeta trgrDbmsResolverMeta(DbmsResolverAction _rqetDbmsResolverAction) {

    ManagerFacade _cnetrManagerFacade = this.atomicReferenceCnetdManagerFacade.get();
    return _cnetrManagerFacade == null ? DbmsResolverMeta.EMT_DBMS_RESOLVER_META
        : _cnetrManagerFacade.trgrDbmsResolverMeta(_rqetDbmsResolverAction);
  }
}
