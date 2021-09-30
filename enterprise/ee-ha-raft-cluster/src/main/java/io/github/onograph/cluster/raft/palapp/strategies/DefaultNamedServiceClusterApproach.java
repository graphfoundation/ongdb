package io.github.onograph.cluster.raft.palapp.strategies;

import io.github.onograph.cluster.raft.palapp.AbstractNamedServiceClusterApproach;
import io.github.onograph.config.NodeGroupIdentifier;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DefaultNamedServiceClusterApproach extends AbstractNamedServiceClusterApproach {


  static final String IDNT = io.github.onograph.TokenConstants.CONNECT_RANDOMLY_TO_SERVER_GROUP;


  private DefaultConnectionServiceManager isDefaultConnectionServiceManager;

  public DefaultNamedServiceClusterApproach() {
    super(io.github.onograph.TokenConstants.CONNECT_RANDOMLY_TO_SERVER_GROUP);
  }


  private void _locnupForCo(Collection<NodeGroupIdentifier> _collectionGcNodeGroupIdentifier) {
    if (_collectionGcNodeGroupIdentifier.isEmpty()) {

    } else {

      String _strRg = String.join(", ", _collectionGcNodeGroupIdentifier);


    }
  }

  @Override
  public void setup() {
    this.config.addListener(SettingsDeclarationClusterImpl.settingCocdtvoryList, (before, after) ->
    {
      this._locnupForCo(after);
    });

    Supplier<Set<NodeGroupIdentifier>> _supplierGpSet = () ->
    {
      return Set.copyOf(
          (Collection) this.config.get(SettingsDeclarationClusterImpl.settingCocdtvoryList));
    };
    this.isDefaultConnectionServiceManager = new DefaultConnectionServiceManager(
        this.clusterStructureService, this.myeServerId, _supplierGpSet);
    this._locnupForCo(_supplierGpSet.get());
  }

  @Override
  public Collection<ServerId> upesrfdteCollection(NamedDatabaseId _namedDatabaseId) {
    return this.isDefaultConnectionServiceManager.upesrfdteCollection(_namedDatabaseId);
  }

  @Override
  public Optional<ServerId> upesrfodaOptional(NamedDatabaseId _namedDatabaseId) {
    return this.isDefaultConnectionServiceManager.upesrfodaOptional(_namedDatabaseId);
  }
}
