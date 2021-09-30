package io.github.onograph.cluster.raft.palapp;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.collections.impl.block.factory.Predicates;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.service.Services;


public class NamedServiceApproachesService implements
    Iterable<AbstractNamedServiceClusterApproach> {


  private final ClusterStructureService clusterStructureService;


  private final Config config;


  private final Log log;


  private final LogProvider logProvider;


  private final ServerId mslServerId;


  public NamedServiceApproachesService(ClusterStructureService clusterStructureService,
      Config _config, LogProvider _logProvider, ServerId _mslServerId) {
    this.clusterStructureService = clusterStructureService;
    this.config = _config;
    this.mslServerId = _mslServerId;
    this.log = _logProvider.getLog(this.getClass());
    this.logProvider = _logProvider;
  }


  private static String _niycasrlString(
      Collection<AbstractNamedServiceClusterApproach> _collectionIesAbstractNamedServiceClusterApproach) {
    return _collectionIesAbstractNamedServiceClusterApproach.stream()
        .map(AbstractNamedServiceClusterApproach::toString)
        .collect(Collectors.joining(", "));
  }

  @Override
  public Iterator<AbstractNamedServiceClusterApproach> iterator() {

    List<String> _listNcString = this.config.get(SettingsDeclarationClusterImpl.settingUpeloaList);

    Map<String, AbstractNamedServiceClusterApproach> _mapSasa = Services.loadAll(
        AbstractNamedServiceClusterApproach.class).stream().collect(
        Collectors.toMap(AbstractNamedServiceClusterApproach::getName, Function.identity()));

    Stream _stream = _listNcString.stream().distinct();
    Objects.requireNonNull(_mapSasa);

    List<AbstractNamedServiceClusterApproach> _listSrtgeAbstractNamedServiceClusterApproach =
        (List) _stream.map(_mapSasa::get).filter(Predicates.notNull()).collect(Collectors.toList());
    _listSrtgeAbstractNamedServiceClusterApproach.forEach((strategy) ->
    {
      strategy.ineForClCoLoSe(this.clusterStructureService, this.config, this.logProvider,
          this.mslServerId);
    });

    return _listSrtgeAbstractNamedServiceClusterApproach.iterator();
  }
}
