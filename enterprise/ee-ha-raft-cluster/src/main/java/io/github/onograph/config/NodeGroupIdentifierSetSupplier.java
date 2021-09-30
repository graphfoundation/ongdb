package io.github.onograph.config;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.neo4j.configuration.Config;


public class NodeGroupIdentifierSetSupplier implements Supplier<Set<NodeGroupIdentifier>> {


  public static NodeGroupIdentifierSetSupplier EMT_NODE_GROUP_IDENTIFIER_SET_SUPPLIER = new NodeGroupIdentifierSetSupplier();


  private Set<NodeGroupIdentifier> setCretNodeGroupIdentifier = Set.of();

  private NodeGroupIdentifierSetSupplier() {
  }


  public static NodeGroupIdentifierSetSupplier litNodeGroupIdentifierSetSupplier(Config _config) {

    NodeGroupIdentifierSetSupplier _pgsNodeGroupIdentifierSetSupplier = new NodeGroupIdentifierSetSupplier();
    _pgsNodeGroupIdentifierSetSupplier._upaForLi(
        _config.get(SettingsDeclarationClusterImpl.settingSevguList));
    _config.addListener(SettingsDeclarationClusterImpl.settingSevguList, (before, after) ->
    {
      _pgsNodeGroupIdentifierSetSupplier._upaForLi(after);
    });
    return _pgsNodeGroupIdentifierSetSupplier;
  }


  private synchronized void _upaForLi(List<NodeGroupIdentifier> _listNgNodeGroupIdentifier) {
    this.setCretNodeGroupIdentifier = Set.copyOf(_listNgNodeGroupIdentifier);
  }

  @Override
  public Set<NodeGroupIdentifier> get() {
    return this.setCretNodeGroupIdentifier;
  }
}
