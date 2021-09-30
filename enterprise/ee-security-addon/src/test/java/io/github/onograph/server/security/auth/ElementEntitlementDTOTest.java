package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.internal.kernel.api.security.Segment;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

class ElementEntitlementDTOTest {

  @Test
  void testConstructor() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS, dbms,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(PrivilegeAction.ACCESS, actualElementEntitlementDTO.getPrivilegeAction());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
  }

  @Test
  void testConstructor10() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294", PrivilegeAction.CREATE_CONSTRAINT,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_CONSTRAINT,
        actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor11() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294", PrivilegeAction.START_DATABASE,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.START_DATABASE, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor12() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294", PrivilegeAction.STOP_DATABASE,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.STOP_DATABASE, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor13() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294", PrivilegeAction.SHOW_TRANSACTION,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.SHOW_TRANSACTION,
        actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor14() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS, dbms,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.ACCESS, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor15() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_GENERAL, PrivilegeAction.ACCESS, dbms,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertTrue(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.ACCESS, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor16() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.TRAVERSE, graph,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.TRAVERSE, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor17() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_LABEL, dbms,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_LABEL, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor18() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.TRAVERSE, graph,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.TRAVERSE, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor19() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.TRAVERSE, graph,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.TRAVERSE, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor2() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO("Gdb Name",
        PrivilegeAction.ACCESS,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms,
        mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.ACCESS, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("Gdb Name", actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor20() throws InvalidArgumentsException {
    SecurityElement.Labels labels = new SecurityElement.Labels();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.SET_LABEL, labels,
        mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(labels, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.SET_LABEL, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor21() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_ELEMENT,
        graph,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_ELEMENT, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor22() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_INDEX, dbms,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_INDEX, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor23() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_CONSTRAINT,
        dbms,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_CONSTRAINT,
        actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor24() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.START_DATABASE,
        dbms,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.START_DATABASE, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor25() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.STOP_DATABASE,
        dbms,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.STOP_DATABASE, actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor26() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.SHOW_TRANSACTION,
        dbms,
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.SHOW_TRANSACTION,
        actualElementEntitlementDTO.getPrivilegeAction());
    assertTrue(actualElementEntitlementDTO.getIsDa());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor3() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO("Gdb Name",
        PrivilegeAction.TRAVERSE,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, graph,
        mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.TRAVERSE, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("Gdb Name", actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor4() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294", PrivilegeAction.CREATE_LABEL,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_LABEL, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor5() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO("Gdb Name",
        PrivilegeAction.TRAVERSE,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, graph,
        mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.TRAVERSE, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("Gdb Name", actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor6() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 25dc9e58-498d-4e39-97ee-9ffa7ae04ce2", PrivilegeAction.TRAVERSE,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, graph, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.TRAVERSE, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 25dc9e58-498d-4e39-97ee-9ffa7ae04ce2",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor7() throws InvalidArgumentsException {
    SecurityElement.Labels labels = new SecurityElement.Labels();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO("Gdb Name",
        PrivilegeAction.SET_LABEL,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, labels,
        mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(labels, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.SET_LABEL, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("Gdb Name", actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor8() throws InvalidArgumentsException {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO("Gdb Name",
        PrivilegeAction.CREATE_ELEMENT,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, graph,
        mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(graph, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_ELEMENT, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("Gdb Name", actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void testConstructor9() throws InvalidArgumentsException {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    ElementEntitlementDTO actualElementEntitlementDTO = new ElementEntitlementDTO(
        "*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294", PrivilegeAction.CREATE_INDEX,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, dbms, mock(Segment.class));

    assertFalse(actualElementEntitlementDTO.getDefGdbName());
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        actualElementEntitlementDTO.getTpEntitlementActionType());
    assertSame(dbms, actualElementEntitlementDTO.getSecurityElement());
    assertEquals(PrivilegeAction.CREATE_INDEX, actualElementEntitlementDTO.getPrivilegeAction());
    assertFalse(actualElementEntitlementDTO.getIsDa());
    assertEquals("*** Error: 38ac11c3-b1fe-4764-bcd6-a411f3d10294",
        actualElementEntitlementDTO.getGdbName());
  }

  @Test
  void test_ascoafList() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, "foo",
        " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList10() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_CONSTRAINT,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE CONSTRAINT ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList11() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.TRAVERSE,
            new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            ._ascoafList(true, "foo", " str Pd")
            .size());
  }

  @Test
  void test_ascoafList12() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.READ,
            new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            ._ascoafList(true, "foo", " str Pd")
            .size());
  }

  @Test
  void test_ascoafList13() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.CREATE_ELEMENT, new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(true, "foo",
            " str Pd").size());
  }

  @Test
  void test_ascoafList14() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.DELETE_ELEMENT, new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(true, "foo",
            " str Pd").size());
  }

  @Test
  void test_ascoafList15() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.SET_PROPERTY, new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(true, "foo",
            " str Pd").size());
  }

  @Test
  void test_ascoafList16() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.SET_LABEL,
        new SecurityElement.Labels(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT SET LABEL * ON GRAPH $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList17() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.REMOVE_LABEL,
        new SecurityElement.Labels(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT REMOVE LABEL * ON GRAPH $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList18() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE * FROM $ str Kr", actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList19() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_GENERAL, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON HOME DATABASE FROM $ str Kr", actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList2() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, "foo",
        " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList20() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO("Gdb Name",
        PrivilegeAction.ACCESS,
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT, new SecurityElement.Dbms(),
        mock(Segment.class)))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE `Gdb Name` FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList21() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        false, true,
        " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE * TO $ str Kr", actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList22() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, false,
        " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE * FROM ` str Kr`", actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList23() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_LABEL,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE NEW NODE LABEL ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList24() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_RELTYPE,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE NEW RELATIONSHIP TYPE ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList25() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_PROPERTYKEY,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE NEW PROPERTY NAME ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList26() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_INDEX,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE INDEX ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList27() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.DROP_INDEX,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT DROP INDEX ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList28() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.SHOW_INDEX,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT SHOW INDEX ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList29() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_CONSTRAINT,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE CONSTRAINT ON DATABASE * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList3() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        false, "foo",
        " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT ACCESS ON DATABASE $ str Pd TO `foo`", actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList30() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.TRAVERSE,
            new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            ._ascoafList(true, true, " str Kr")
            .size());
  }

  @Test
  void test_ascoafList31() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.READ,
            new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            ._ascoafList(true, true, " str Kr")
            .size());
  }

  @Test
  void test_ascoafList32() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.CREATE_ELEMENT, new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(true, true,
            " str Kr").size());
  }

  @Test
  void test_ascoafList33() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.DELETE_ELEMENT, new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(true, true,
            " str Kr").size());
  }

  @Test
  void test_ascoafList34() throws RuntimeException, InvalidArgumentsException {
    assertEquals(1,
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.SET_PROPERTY, new SecurityElement.Graph(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(true, true,
            " str Kr").size());
  }

  @Test
  void test_ascoafList35() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.SET_LABEL,
        new SecurityElement.Labels(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT SET LABEL * ON GRAPH * FROM $ str Kr", actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList36() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.REMOVE_LABEL,
        new SecurityElement.Labels(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, true, " str Kr");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT REMOVE LABEL * ON GRAPH * FROM $ str Kr",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList4() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_LABEL,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE NEW NODE LABEL ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList5() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_RELTYPE,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE NEW RELATIONSHIP TYPE ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList6() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_PROPERTYKEY,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE NEW PROPERTY NAME ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList7() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_INDEX,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        ._ascoafList(true, "foo", " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT CREATE INDEX ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList8() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.DROP_INDEX,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, "foo",
        " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT DROP INDEX ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void test_ascoafList9() throws RuntimeException, InvalidArgumentsException {
    List<String> actual_ascoafListResult = (new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.SHOW_INDEX,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))._ascoafList(
        true, "foo",
        " str Pd");
    assertEquals(1, actual_ascoafListResult.size());
    assertEquals("EAT_GRANT SHOW INDEX ON DATABASE $ str Pd FROM `foo`",
        actual_ascoafListResult.get(0));
  }

  @Test
  void testEquals() throws InvalidArgumentsException {
    assertFalse(
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            .equals(null));
    assertFalse(
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            .equals("Different type to ElementEntitlementDTO"));
  }

  @Test
  void testEquals2() throws InvalidArgumentsException {
    ElementEntitlementDTO elementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);
    assertTrue(elementEntitlementDTO.equals(elementEntitlementDTO));
    int expectedHashCodeResult = elementEntitlementDTO.hashCode();
    assertEquals(expectedHashCodeResult, elementEntitlementDTO.hashCode());
  }

  @Test
  void testEquals3() throws InvalidArgumentsException {
    ElementEntitlementDTO elementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(),
        mock(Segment.class), ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);
    assertFalse(elementEntitlementDTO.equals(
        new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT)));
  }

  @Test
  void testEquals4() throws InvalidArgumentsException {
    ElementEntitlementDTO elementEntitlementDTO = new ElementEntitlementDTO(
        ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING, PrivilegeAction.CREATE_LABEL,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT);
    assertFalse(elementEntitlementDTO.equals(
        new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT)));
  }

  @Test
  void testIsAplstForSt() throws InvalidArgumentsException {
    assertTrue(
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            .isAplstForSt(" str Dtbs"));
    assertFalse((new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_GENERAL,
        PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        .isAplstForSt(" str Dtbs"));
    assertTrue(
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            .isAplstForSt("system"));
    assertTrue((new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_GENERAL,
        PrivilegeAction.ACCESS,
        new SecurityElement.Dbms(), mock(Segment.class),
        ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
        .isAplstForSt(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX));
  }

  @Test
  void testIsDspi() throws InvalidArgumentsException {
    assertFalse(
        (new ElementEntitlementDTO(ElementEntitlementDTO.GdbEntitlementType.EAT_EVERYTHING,
            PrivilegeAction.ACCESS,
            new SecurityElement.Dbms(), mock(Segment.class),
            ElementEntitlementDTO.EntitlementActionType.EAT_GRANT))
            .isDspi());
  }

  @Test
  void testEntitlementActionTypeCreateUsingRelationshipType() {
    assertThrows(IllegalArgumentException.class,
        () -> ElementEntitlementDTO.EntitlementActionType.createUsingRelationshipType(
            "Relationship Type Name"));
    assertEquals(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT,
        ElementEntitlementDTO.EntitlementActionType.createUsingRelationshipType("GRANTED"));
  }

  @Test
  void testEntitlementActionTypeIsDe() {
    assertFalse(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT.isDe());
    assertTrue(ElementEntitlementDTO.EntitlementActionType.EAT_DENY.isDe());
  }

  @Test
  void testEntitlementActionTypeIsGrt() {
    assertTrue(ElementEntitlementDTO.EntitlementActionType.EAT_GRANT.isGrt());
    assertFalse(ElementEntitlementDTO.EntitlementActionType.EAT_DENY.isGrt());
  }
}

