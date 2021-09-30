package io.github.onograph.dbms;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.kernel.database.NamedDatabaseId;


public final class DbmsResolverMeta {


  public static final DbmsResolverMeta EMT_DBMS_RESOLVER_META = new DbmsResolverMeta(
      Collections.emptyMap());


  private final CompletableFuture<Void> completableFutureFcVoid;


  private final Map<String, CompletableFuture<ReconcilePointStateMeta>> mapFrsc;

  DbmsResolverMeta(Map<String, CompletableFuture<ReconcilePointStateMeta>> _mapFrsc) {
    this.mapFrsc = _mapFrsc;
    this.completableFutureFcVoid = _cobefteCompletableFuture(_mapFrsc);
  }


  private static CompletableFuture<Void> _cobefteCompletableFuture(
      Map<String, CompletableFuture<ReconcilePointStateMeta>> _mapFrsc) {

    CompletableFuture<?>[] _completableFutureFaObjectArray = (CompletableFuture[]) _mapFrsc.values()
        .toArray((i) ->
        {
          return new CompletableFuture[i];
        });
    return CompletableFuture.allOf(_completableFutureFaObjectArray);
  }


  private void _cocatesForCo(
      Collection<CompletableFuture<ReconcilePointStateMeta>> _collectionFtrsCompletableFuture)
      throws DatabaseManagementException {

    Map<NamedDatabaseId, Throwable> _mapErrnt = _collectionFtrsCompletableFuture.stream()
        .map(CompletableFuture::join).filter((result) ->
        {
          return result.getEsThrowable() !=
              null;
        })
        .collect(Collectors.toMap((result) ->
            {
              return result
                  .getSdDatabaseStateEnterpriseImpl()
                  .databaseId();
            },
            ReconcilePointStateMeta::getEsThrowable));
    if (!_mapErrnt.isEmpty()) {

      String _strDtbss =
          _mapErrnt.keySet().stream().map(NamedDatabaseId::name)
              .collect(Collectors.joining(",", "[", "]"));

      Throwable _cueThrowable = _mapErrnt.values().stream().reduce(null, Exceptions::chain);

      throw new DatabaseManagementException("*** Error: 0bf71476-4055-4600-9b5d-c914dd23bff7",
          _cueThrowable);
    }
  }


  private List<CompletableFuture<ReconcilePointStateMeta>> _gefusList(
      Collection<NamedDatabaseId> _collectionIdnNamedDatabaseId) {
    return (List) _collectionIdnNamedDatabaseId.stream().map((id) ->
    {
      return (CompletableFuture) this.mapFrsc.get(id.name());
    }).flatMap(Stream::ofNullable).collect(Collectors.toList());
  }


  public void awiForNa(NamedDatabaseId _namedDatabaseId) {

    CompletableFuture<ReconcilePointStateMeta> _completableFutureFtrReconcilePointStateMeta = this.mapFrsc.get(
        _namedDatabaseId.name());
    if (_completableFutureFtrReconcilePointStateMeta != null) {
      _completableFutureFtrReconcilePointStateMeta.join();
    }
  }


  public void awiForNa(Collection<NamedDatabaseId> _collectionIdnNamedDatabaseId) {

    CompletableFuture<?>[] _completableFutureAfObjectArray = (CompletableFuture[]) this._gefusList(
        _collectionIdnNamedDatabaseId).toArray((i) ->
    {
      return new CompletableFuture[i];
    });
    CompletableFuture.allOf(_completableFutureAfObjectArray).join();
  }


  void awial() {
    this.completableFutureFcVoid.join();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      DbmsResolverMeta _thaDbmsResolverMeta = (DbmsResolverMeta) obj;
      return Objects.equals(this.mapFrsc, _thaDbmsResolverMeta.mapFrsc);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.mapFrsc);
  }


  public void joiForCo(NamedDatabaseId _namedDatabaseId) throws DatabaseManagementException {

    CompletableFuture<ReconcilePointStateMeta> _completableFutureFtrReconcilePointStateMeta = this.mapFrsc.get(
        _namedDatabaseId.name());
    if (_completableFutureFtrReconcilePointStateMeta != null) {

      ReconcilePointStateMeta _rslReconcilePointStateMeta = _completableFutureFtrReconcilePointStateMeta.join();
      if (_rslReconcilePointStateMeta.getEsThrowable() != null) {

        throw new DatabaseManagementException("*** Error:  42dfac34-e376-4bba-884e-2607388606cb",
            _rslReconcilePointStateMeta.getEsThrowable());
      }
    }
  }


  public void joiForCo(Collection<NamedDatabaseId> _collectionIdnNamedDatabaseId)
      throws DatabaseManagementException {
    this._cocatesForCo(this._gefusList(_collectionIdnNamedDatabaseId));
  }


  public void jonal() throws DatabaseManagementException {
    this._cocatesForCo(this.mapFrsc.values());
  }


  void whncmeForRu(Runnable _atoRunnable) {
    this.completableFutureFcVoid.whenComplete((ignore, error) ->
    {
      _atoRunnable.run();
    });
  }


}
