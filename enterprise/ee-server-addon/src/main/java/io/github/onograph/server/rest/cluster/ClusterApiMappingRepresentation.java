package io.github.onograph.server.rest.cluster;

import org.neo4j.server.rest.repr.MappingRepresentation;
import org.neo4j.server.rest.repr.MappingSerializer;


public class ClusterApiMappingRepresentation extends MappingRepresentation {


  private static final String DICE_REREAO_TPX = io.github.onograph.TokenConstants.DISCOVERY;


  private final String strPd;

  ClusterApiMappingRepresentation(String _strPd) {
    super(io.github.onograph.TokenConstants.DISCOVERY);
    this.strPd = _strPd;
  }

  @Override
  protected void serialize(MappingSerializer _mappingSerializer) {
    _mappingSerializer.putRelativeUri(io.github.onograph.TokenConstants.AVAILABLE,
        io.github.onograph.I18N.format(
            "io.github.onograph.server.rest.cluster.ClusterApiMappingRepresentation.putRelativeUri",
            this.strPd));
    _mappingSerializer.putRelativeUri(io.github.onograph.TokenConstants.READ_ONLY,
        io.github.onograph.I18N.format(
            "io.github.onograph.server.rest.cluster.ClusterApiMappingRepresentation.putRelativeUri2",
            this.strPd));
    _mappingSerializer.putRelativeUri(io.github.onograph.TokenConstants.WRITABLE,
        io.github.onograph.I18N.format(
            "io.github.onograph.server.rest.cluster.ClusterApiMappingRepresentation.putRelativeUri3",
            this.strPd));
    _mappingSerializer.putRelativeUri(io.github.onograph.TokenConstants.STATUS,
        io.github.onograph.I18N.format(
            "io.github.onograph.server.rest.cluster.ClusterApiMappingRepresentation.putRelativeUri4",
            this.strPd));
  }
}
