package io.github.onograph.cluster.raft.palapp;

import java.time.Clock;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.CappedLogger;


public class NamedServiceApproachManager {


  private final CappedLogger cappedLogger;


  private final Log log;


  private final Set<AbstractNamedServiceClusterApproach> setSrtgeAbstractNamedServiceClusterApproach = new LinkedHashSet();


  private Collection<ServerId> collectionUlServerId;


  public NamedServiceApproachManager(Clock _clock,
      AbstractNamedServiceClusterApproach _dsAbstractNamedServiceClusterApproach,
      Iterable<AbstractNamedServiceClusterApproach> _iterableSoAbstractNamedServiceClusterApproach,
      LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
    this.cappedLogger = new CappedLogger(this.log, 1L, TimeUnit.MINUTES, _clock);
    Iterables.addAll(this.setSrtgeAbstractNamedServiceClusterApproach,
        _iterableSoAbstractNamedServiceClusterApproach);
    this.setSrtgeAbstractNamedServiceClusterApproach.add(_dsAbstractNamedServiceClusterApproach);


  }


  private NamedServiceApproachException _catfueecoNamedServiceApproachException(
      NamedDatabaseId _namedDatabaseId) {
    return new NamedServiceApproachException("*** Error: 0783e4b2-9ff0-4b6a-8182-b11fd3d86a5d");
  }


  private <T> boolean _isComemForCoCo(Collection<T> _collectionCletoT,
      Collection<T> _collectionCletoT2) {
    return _collectionCletoT != null && _collectionCletoT2 != null && _collectionCletoT.containsAll(
        _collectionCletoT2) &&
        _collectionCletoT2.containsAll(_collectionCletoT);
  }


  public Collection<ServerId> beupasvfodaCollection(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {

    Iterator<AbstractNamedServiceClusterApproach> _iteratorVaAbstractNamedServiceClusterApproach =
        this.setSrtgeAbstractNamedServiceClusterApproach.iterator();

    Collection<ServerId> _collectionSuServerId;
    do {
      if (!_iteratorVaAbstractNamedServiceClusterApproach.hasNext()) {
        throw this._catfueecoNamedServiceApproachException(_namedDatabaseId);
      }

      AbstractNamedServiceClusterApproach _srtgAbstractNamedServiceClusterApproach = _iteratorVaAbstractNamedServiceClusterApproach.next();
      _collectionSuServerId = _srtgAbstractNamedServiceClusterApproach.upesrfdteCollection(
          _namedDatabaseId);
    }
    while (_collectionSuServerId.isEmpty());

    String _strMl = _collectionSuServerId.stream().map(ServerId::toString)
        .collect(Collectors.joining(",", io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager.joining"),
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.palapp.NamedServiceApproachManager.joining2",
                _namedDatabaseId.name())));
    if (this._isComemForCoCo(this.collectionUlServerId, _collectionSuServerId)) {

    } else {

      this.collectionUlServerId = _collectionSuServerId;
    }

    return _collectionSuServerId;
  }


  public ServerId beupasvfrdbServerId(NamedDatabaseId _namedDatabaseId)
      throws NamedServiceApproachException {

    Iterator _iterator = this.setSrtgeAbstractNamedServiceClusterApproach.iterator();

    Optional _suOptional;
    do {
      if (!_iterator.hasNext()) {
        throw this._catfueecoNamedServiceApproachException(_namedDatabaseId);
      }

      AbstractNamedServiceClusterApproach _srtgAbstractNamedServiceClusterApproach = (AbstractNamedServiceClusterApproach) _iterator.next();
      _suOptional = _srtgAbstractNamedServiceClusterApproach.upesrfodaOptional(_namedDatabaseId);
    }
    while (!_suOptional.isPresent());

    ServerId _cocServerId = (ServerId) _suOptional.get();

    return _cocServerId;
  }
}
