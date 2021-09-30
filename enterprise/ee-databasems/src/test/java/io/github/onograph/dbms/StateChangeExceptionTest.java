package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class StateChangeExceptionTest {

  @Test
  void testConstructor() {
    Throwable _cueThrowable = new Throwable();
    DatabaseStateEnterpriseImpl inaunidDatabaseStateEnterpriseImplResult = DatabaseStateEnterpriseImpl
        .inaunidDatabaseStateEnterpriseImpl();
    assertSame(inaunidDatabaseStateEnterpriseImplResult,
        (new StateChangeException(_cueThrowable, inaunidDatabaseStateEnterpriseImplResult))
            .getSefDatabaseStateEnterpriseImpl());
  }
}

