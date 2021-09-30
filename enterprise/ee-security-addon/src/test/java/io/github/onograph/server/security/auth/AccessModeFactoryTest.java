package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

class AccessModeFactoryTest {

  @Test
  void testConstructor() {

    new AccessModeFactory(true, null, new HashSet<String>(), " str Ddn", " str Dtbs");
  }

  @Test
  void testAdpveAccessModeFactory() throws InvalidArgumentsException {
    AccessModeFactory accessModeFactory = new AccessModeFactory(true, null, new HashSet<String>(),
        " str Ddn",
        " str Dtbs");
    assertSame(accessModeFactory,
        accessModeFactory.adpveAccessModeFactory(new ElementEntitlementDTO(
            ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(),
            mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT)));
  }

  @Test
  void testAdpveAccessModeFactory2() throws InvalidArgumentsException {
    AccessModeFactory accessModeFactory = new AccessModeFactory(false, null, new HashSet<String>(),
        " str Ddn",
        " str Dtbs");
    assertSame(accessModeFactory,
        accessModeFactory.adpveAccessModeFactory(new ElementEntitlementDTO(
            ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(),
            mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT)));
  }

  @Test
  void testBulAccessModeImpl() {
    AccessModeImpl actualBulAccessModeImplResult = (new AccessModeFactory(true, null,
        new HashSet<String>(), " str Ddn",
        " str Dtbs")).bulAccessModeImpl();
    assertTrue(
        actualBulAccessModeImplResult.getAdminAccessMode() instanceof AdminAccessModeEnterpriseImpl);
    assertTrue(actualBulAccessModeImplResult.roles().isEmpty());
    assertFalse(actualBulAccessModeImplResult.getIsAa());
  }

  @Test
  void testBulAccessModeImpl2() {
    AccessModeImpl actualBulAccessModeImplResult = (new AccessModeFactory(false, null,
        new HashSet<String>(),
        " str Ddn", " str Dtbs")).bulAccessModeImpl();
    assertTrue(
        actualBulAccessModeImplResult.getAdminAccessMode() instanceof AdminAccessModeEnterpriseImpl);
    assertTrue(actualBulAccessModeImplResult.roles().isEmpty());
    assertFalse(actualBulAccessModeImplResult.getIsAa());
  }

  @Test
  void testWihacsAccessModeFactory() {

    (new AccessModeFactory(true, null, new HashSet<String>(), " str Ddn",
        " str Dtbs")).wihacsAccessModeFactory();
  }
}

