package io.github.onograph.dbms.service;

import static org.mockito.Mockito.mock;

import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.impl.factory.DbmsInfo;

class DatabaseManagementServiceFactoryClusteringImplTest {

  @Test
  void testConstructor() {

    new DatabaseManagementServiceFactoryClusteringImpl(DbmsInfo.UNKNOWN,
        (Function<GlobalModule, AbstractEditionModule>) mock(Function.class));
  }
}

