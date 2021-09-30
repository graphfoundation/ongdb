package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;

class AdminAccessModeEnterpriseImplTest {

  @Test
  void testConstructor() {

    HashSet<AdminActionOnResource> _hashSetBakitAdminActionOnResource = new HashSet<AdminActionOnResource>();
    new AdminAccessModeEnterpriseImpl(_hashSetBakitAdminActionOnResource,
        new HashSet<AdminActionOnResource>());
  }

  @Test
  void testFactoryAloAdminAccessModeEnterpriseImplFactory() {
    AdminAccessModeEnterpriseImpl.Factory factory = new AdminAccessModeEnterpriseImpl.Factory();
    assertSame(factory,
        factory.aloAdminAccessModeEnterpriseImplFactory(
            new AdminActionOnResource(PrivilegeAction.ACCESS,
                new AdminActionOnResource.DatabaseScope("Name"),
                mock(Segment.class))));
  }

  @Test
  void testFactoryBulAdminAccessModeEnterpriseImpl() {
    AdminAccessModeEnterpriseImpl actualBulAdminAccessModeEnterpriseImplResult = (new AdminAccessModeEnterpriseImpl.Factory())
        .bulAdminAccessModeEnterpriseImpl();
    assertFalse(actualBulAdminAccessModeEnterpriseImplResult.allows(
        new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
  }

  @Test
  void testFactoryDenAdminAccessModeEnterpriseImplFactory() {
    AdminAccessModeEnterpriseImpl.Factory factory = new AdminAccessModeEnterpriseImpl.Factory();
    assertSame(factory,
        factory.denAdminAccessModeEnterpriseImplFactory(
            new AdminActionOnResource(PrivilegeAction.ACCESS,
                new AdminActionOnResource.DatabaseScope("Name"),
                mock(Segment.class))));
  }

  @Test
  void testFactoryFulAdminAccessModeEnterpriseImplFactory() {
    AdminAccessModeEnterpriseImpl.Factory factory = new AdminAccessModeEnterpriseImpl.Factory();
    assertSame(factory, factory.fulAdminAccessModeEnterpriseImplFactory());
  }

  @Test
  void testIsMacsForHaAd() {
    AdminActionOnResource _adminActionOnResource = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), mock(Segment.class));

    assertFalse(
        AdminAccessModeEnterpriseImpl.isMacsForHaAd(_adminActionOnResource,
            new HashSet<AdminActionOnResource>()));
  }

  @Test
  void testIsMacsForHaAd2() {
    AdminActionOnResource _adminActionOnResource = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), mock(Segment.class));

    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    assertTrue(AdminAccessModeEnterpriseImpl.isMacsForHaAd(_adminActionOnResource,
        adminActionOnResourceSet));
    verify(segment).satisfies((Segment) any());
  }

  @Test
  void testIsMacsForHaAd3() {
    AdminActionOnResource _adminActionOnResource = new AdminActionOnResource(
        PrivilegeAction.TRAVERSE,
        new AdminActionOnResource.DatabaseScope("Name"), mock(Segment.class));

    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    assertFalse(AdminAccessModeEnterpriseImpl.isMacsForHaAd(_adminActionOnResource,
        adminActionOnResourceSet));
  }

  @Test
  void testIsMacsForHaAd4() {
    AdminActionOnResource _adminActionOnResource = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("*"), mock(Segment.class));

    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    assertFalse(AdminAccessModeEnterpriseImpl.isMacsForHaAd(_adminActionOnResource,
        adminActionOnResourceSet));
  }

  @Test
  void testAllows() {
    HashSet<AdminActionOnResource> _hashSetBakitAdminActionOnResource = new HashSet<AdminActionOnResource>();
    AdminAccessModeEnterpriseImpl adminAccessModeEnterpriseImpl = new AdminAccessModeEnterpriseImpl(
        _hashSetBakitAdminActionOnResource, new HashSet<AdminActionOnResource>());
    assertFalse(
        adminAccessModeEnterpriseImpl.allows(new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
  }

  @Test
  void testAllows2() {
    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    AdminAccessModeEnterpriseImpl adminAccessModeEnterpriseImpl = new AdminAccessModeEnterpriseImpl(
        new HashSet<AdminActionOnResource>(), adminActionOnResourceSet);
    assertTrue(
        adminAccessModeEnterpriseImpl.allows(new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
    verify(segment).satisfies((Segment) any());
  }

  @Test
  void testAllows3() {
    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    Segment segment1 = mock(Segment.class);
    when(segment1.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e1 = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment1);

    HashSet<AdminActionOnResource> adminActionOnResourceSet1 = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet1.add(e1);
    AdminAccessModeEnterpriseImpl adminAccessModeEnterpriseImpl = new AdminAccessModeEnterpriseImpl(
        adminActionOnResourceSet, adminActionOnResourceSet1);
    assertFalse(
        adminAccessModeEnterpriseImpl.allows(new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
    verify(segment).satisfies((Segment) any());
    verify(segment1).satisfies((Segment) any());
  }

  @Test
  void testAllows4() {
    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.TRAVERSE,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    Segment segment1 = mock(Segment.class);
    when(segment1.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e1 = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment1);

    HashSet<AdminActionOnResource> adminActionOnResourceSet1 = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet1.add(e1);
    AdminAccessModeEnterpriseImpl adminAccessModeEnterpriseImpl = new AdminAccessModeEnterpriseImpl(
        adminActionOnResourceSet, adminActionOnResourceSet1);
    assertTrue(
        adminAccessModeEnterpriseImpl.allows(new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
    verify(segment1).satisfies((Segment) any());
  }

  @Test
  void testAllows5() {
    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("*"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    Segment segment1 = mock(Segment.class);
    when(segment1.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e1 = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment1);

    HashSet<AdminActionOnResource> adminActionOnResourceSet1 = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet1.add(e1);
    AdminAccessModeEnterpriseImpl adminAccessModeEnterpriseImpl = new AdminAccessModeEnterpriseImpl(
        adminActionOnResourceSet, adminActionOnResourceSet1);
    assertTrue(
        adminAccessModeEnterpriseImpl.allows(new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
    verify(segment1).satisfies((Segment) any());
  }

  @Test
  void testAllows6() {
    Segment segment = mock(Segment.class);
    when(segment.satisfies((Segment) any())).thenReturn(false);
    AdminActionOnResource e = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment);

    HashSet<AdminActionOnResource> adminActionOnResourceSet = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet.add(e);
    Segment segment1 = mock(Segment.class);
    when(segment1.satisfies((Segment) any())).thenReturn(true);
    AdminActionOnResource e1 = new AdminActionOnResource(PrivilegeAction.ACCESS,
        new AdminActionOnResource.DatabaseScope("Name"), segment1);

    HashSet<AdminActionOnResource> adminActionOnResourceSet1 = new HashSet<AdminActionOnResource>();
    adminActionOnResourceSet1.add(e1);
    AdminAccessModeEnterpriseImpl adminAccessModeEnterpriseImpl = new AdminAccessModeEnterpriseImpl(
        adminActionOnResourceSet, adminActionOnResourceSet1);
    assertTrue(
        adminAccessModeEnterpriseImpl.allows(new AdminActionOnResource(PrivilegeAction.ACCESS,
            new AdminActionOnResource.DatabaseScope("Name"),
            mock(Segment.class))));
    verify(segment).satisfies((Segment) any());
    verify(segment1).satisfies((Segment) any());
  }
}

