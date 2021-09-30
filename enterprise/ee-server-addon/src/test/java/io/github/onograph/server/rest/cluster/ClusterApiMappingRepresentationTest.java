package io.github.onograph.server.rest.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.neo4j.server.rest.repr.MappingSerializer;

class ClusterApiMappingRepresentationTest {

  @Test
  void testConstructor() {
    assertEquals("discovery",
        (new ClusterApiMappingRepresentation(" str Pd")).getRepresentationType().toString());
  }

  @Test
  void testSerialize() {
    ClusterApiMappingRepresentation clusterApiMappingRepresentation = new ClusterApiMappingRepresentation(
        " str Pd");
    MappingSerializer mappingSerializer = mock(MappingSerializer.class);
    doNothing().when(mappingSerializer).putRelativeUri((String) any(), (String) any());
    clusterApiMappingRepresentation.serialize(mappingSerializer);
    verify(mappingSerializer, atLeast(1)).putRelativeUri((String) any(), (String) any());
  }
}

