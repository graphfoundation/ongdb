package io.github.onograph.dbms;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class ManagerFacade {


  private final DbmsStateResolverFacade rcnieDbmsStateResolverFacade;


  protected volatile Set<AbstractDbmsManager> setOproAbstractDbmsManager;

  ManagerFacade(DbmsStateResolverFacade _rcnieDbmsStateResolverFacade) {
    this.rcnieDbmsStateResolverFacade = _rcnieDbmsStateResolverFacade;
    this.setOproAbstractDbmsManager = Set.of();
  }


  synchronized void seoroForCo(
      Collection<AbstractDbmsManager> _collectionOeaosAbstractDbmsManager) {

    Set<AbstractDbmsManager> _setOrAbstractDbmsManager = Set.copyOf(
        _collectionOeaosAbstractDbmsManager);

    Stream _stream = this.setOproAbstractDbmsManager.stream();
    Objects.requireNonNull(_setOrAbstractDbmsManager);

    Stream<AbstractDbmsManager> _streamOrAbstractDbmsManager = _stream.filter(
        Predicate.not(_setOrAbstractDbmsManager::contains));
    _stream = _setOrAbstractDbmsManager.stream();

    Set _set = this.setOproAbstractDbmsManager;
    Objects.requireNonNull(_set);

    Stream<AbstractDbmsManager> _streamOnAbstractDbmsManager = _stream.filter(
        Predicate.not(_set::contains));
    _streamOrAbstractDbmsManager.forEach((op) ->
    {
      op.dicntForMa(this);
    });
    _streamOnAbstractDbmsManager.forEach((op) ->
    {
      op.contForMa(this);
    });
    this.setOproAbstractDbmsManager = _setOrAbstractDbmsManager;
  }


  public synchronized DbmsResolverMeta trgrDbmsResolverMeta(
      DbmsResolverAction _rqetDbmsResolverAction) {
    return this.rcnieDbmsStateResolverFacade.reoiDbmsResolverMeta(this.setOproAbstractDbmsManager,
        _rqetDbmsResolverAction);
  }
}
