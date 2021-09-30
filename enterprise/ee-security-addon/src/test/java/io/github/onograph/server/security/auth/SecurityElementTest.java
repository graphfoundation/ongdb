package io.github.onograph.server.security.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

class SecurityElementTest {

  @Test
  void testDbmsAstvdcioForPr() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.ACCESS);
  }

  @Test
  void testDbmsAstvdcioForPr2() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.ACCESS);
  }

  @Test
  void testDbmsAstvdcioForPr3() throws InvalidArgumentsException {
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.TRAVERSE));
  }

  @Test
  void testDbmsAstvdcioForPr4() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.CREATE_LABEL);
  }

  @Test
  void testDbmsAstvdcioForPr5() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.CREATE_INDEX);
  }

  @Test
  void testDbmsAstvdcioForPr6() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.CREATE_CONSTRAINT);
  }

  @Test
  void testDbmsAstvdcioForPr7() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.START_DATABASE);
  }

  @Test
  void testDbmsAstvdcioForPr8() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.STOP_DATABASE);
  }

  @Test
  void testDbmsAstvdcioForPr9() throws InvalidArgumentsException {

    (new SecurityElement.Dbms()).astvdcioForPr(PrivilegeAction.SHOW_TRANSACTION);
  }

  @Test
  void testGraphAstvdcioForPr() throws InvalidArgumentsException {
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Graph()).astvdcioForPr(PrivilegeAction.ACCESS));
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Graph()).astvdcioForPr(PrivilegeAction.SET_LABEL));
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Graph()).astvdcioForPr(PrivilegeAction.REMOVE_LABEL));
  }

  @Test
  void testGraphAstvdcioForPr2() throws InvalidArgumentsException {

    (new SecurityElement.Graph()).astvdcioForPr(PrivilegeAction.TRAVERSE);
  }

  @Test
  void testGraphAstvdcioForPr3() throws InvalidArgumentsException {

    (new SecurityElement.Graph()).astvdcioForPr(PrivilegeAction.CREATE_ELEMENT);
  }

  @Test
  void testLabelAstvdcioForPr() throws InvalidArgumentsException {
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Label("Lbl")).astvdcioForPr(PrivilegeAction.ACCESS));
  }

  @Test
  void testLabelAstvdcioForPr2() throws InvalidArgumentsException {

    (new SecurityElement.Label("Lbl")).astvdcioForPr(PrivilegeAction.SET_LABEL);
  }

  @Test
  void testLabelAstvdcioForPr3() throws InvalidArgumentsException {

    (new SecurityElement.Label("Lbl")).astvdcioForPr(PrivilegeAction.REMOVE_LABEL);
  }

  @Test
  void testLabelsAstvdcioForPr() throws InvalidArgumentsException {
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Labels()).astvdcioForPr(PrivilegeAction.ACCESS));
  }

  @Test
  void testLabelsAstvdcioForPr2() throws InvalidArgumentsException {

    (new SecurityElement.Labels()).astvdcioForPr(PrivilegeAction.SET_LABEL);
  }

  @Test
  void testLabelsAstvdcioForPr3() throws InvalidArgumentsException {

    (new SecurityElement.Labels()).astvdcioForPr(PrivilegeAction.REMOVE_LABEL);
  }

  @Test
  void testPropertiesAstvdcioForPr() throws InvalidArgumentsException {
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Properties()).astvdcioForPr(PrivilegeAction.ACCESS));
  }

  @Test
  void testPropertiesAstvdcioForPr2() throws InvalidArgumentsException {

    (new SecurityElement.Properties()).astvdcioForPr(PrivilegeAction.READ);
  }

  @Test
  void testPropertiesAstvdcioForPr3() throws InvalidArgumentsException {

    (new SecurityElement.Properties()).astvdcioForPr(PrivilegeAction.SET_PROPERTY);
  }

  @Test
  void testPropertyAstvdcioForPr() throws InvalidArgumentsException {
    assertThrows(InvalidArgumentsException.class,
        () -> (new SecurityElement.Property("Prop")).astvdcioForPr(PrivilegeAction.ACCESS));
  }

  @Test
  void testPropertyAstvdcioForPr2() throws InvalidArgumentsException {

    (new SecurityElement.Property("Prop")).astvdcioForPr(PrivilegeAction.READ);
  }

  @Test
  void testPropertyAstvdcioForPr3() throws InvalidArgumentsException {

    (new SecurityElement.Property("Prop")).astvdcioForPr(PrivilegeAction.SET_PROPERTY);
  }

  @Test
  void testDbmsTypSecurityElementElementType() {
    assertEquals(SecurityElement.ElementType.DATABASE,
        (new SecurityElement.Dbms()).typSecurityElementElementType());
  }

  @Test
  void testGraphTypSecurityElementElementType() {
    assertEquals(SecurityElement.ElementType.GRAPH,
        (new SecurityElement.Graph()).typSecurityElementElementType());
  }

  @Test
  void testLabelTypSecurityElementElementType() {
    assertEquals(SecurityElement.ElementType.LABEL,
        (new SecurityElement.Label("Lbl")).typSecurityElementElementType());
  }

  @Test
  void testLabelsTypSecurityElementElementType() {
    assertEquals(SecurityElement.ElementType.ALL_LABELS,
        (new SecurityElement.Labels()).typSecurityElementElementType());
  }

  @Test
  void testPropertiesTypSecurityElementElementType() {
    assertEquals(SecurityElement.ElementType.ALL_PROPERTIES,
        (new SecurityElement.Properties()).typSecurityElementElementType());
  }

  @Test
  void testPropertyTypSecurityElementElementType() {
    assertEquals(SecurityElement.ElementType.PROPERTY,
        (new SecurityElement.Property("Prop")).typSecurityElementElementType());
  }

  @Test
  void testDbmsConstructor() {
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        (new SecurityElement.Dbms()).toString());
  }

  @Test
  void testDbmsEquals() {
    assertFalse((new SecurityElement.Dbms()).equals(null));
    assertFalse((new SecurityElement.Dbms()).equals("Different type to Dbms"));
    assertFalse((new SecurityElement.Dbms()).equals(0));
  }

  @Test
  void testDbmsEquals2() {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    assertTrue(dbms.equals(dbms));
    int expectedHashCodeResult = dbms.hashCode();
    assertEquals(expectedHashCodeResult, dbms.hashCode());
  }

  @Test
  void testDbmsEquals3() {
    SecurityElement.Dbms dbms = new SecurityElement.Dbms();
    SecurityElement.Dbms dbms1 = new SecurityElement.Dbms();
    assertTrue(dbms.equals(dbms1));
    int expectedHashCodeResult = dbms.hashCode();
    assertEquals(expectedHashCodeResult, dbms1.hashCode());
  }

  @Test
  void testGraphConstructor() {
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        (new SecurityElement.Graph()).toString());
  }

  @Test
  void testGraphEquals() {
    assertFalse((new SecurityElement.Graph()).equals(null));
    assertFalse((new SecurityElement.Graph()).equals("Different type to Graph"));
    assertFalse((new SecurityElement.Graph()).equals(0));
  }

  @Test
  void testGraphEquals2() {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    assertTrue(graph.equals(graph));
    int expectedHashCodeResult = graph.hashCode();
    assertEquals(expectedHashCodeResult, graph.hashCode());
  }

  @Test
  void testGraphEquals3() {
    SecurityElement.Graph graph = new SecurityElement.Graph();
    SecurityElement.Graph graph1 = new SecurityElement.Graph();
    assertTrue(graph.equals(graph1));
    int expectedHashCodeResult = graph.hashCode();
    assertEquals(expectedHashCodeResult, graph1.hashCode());
  }

  @Test
  void testLabelConstructor() {
    assertEquals("Lbl", (new SecurityElement.Label("Lbl")).toString());
  }

  @Test
  void testLabelEquals() {
    assertFalse((new SecurityElement.Label("Lbl")).equals(null));
    assertFalse((new SecurityElement.Label("Lbl")).equals("Different type to Label"));
  }

  @Test
  void testLabelEquals2() {
    SecurityElement.Label label = new SecurityElement.Label("Lbl");
    assertTrue(label.equals(label));
    int expectedHashCodeResult = label.hashCode();
    assertEquals(expectedHashCodeResult, label.hashCode());
  }

  @Test
  void testLabelEquals3() {
    SecurityElement.Label label = new SecurityElement.Label("Lbl");
    SecurityElement.Label label1 = new SecurityElement.Label("Lbl");
    assertTrue(label.equals(label1));
    int expectedHashCodeResult = label.hashCode();
    assertEquals(expectedHashCodeResult, label1.hashCode());
  }

  @Test
  void testLabelEquals4() {
    SecurityElement.Label label = new SecurityElement.Label(null);
    assertFalse(label.equals(new SecurityElement.Label("Lbl")));
  }

  @Test
  void testLabelEquals5() {
    SecurityElement.Label label = new SecurityElement.Label("42");
    assertFalse(label.equals(new SecurityElement.Label("Lbl")));
  }

  @Test
  void testLabelEquals6() {
    SecurityElement.Label label = new SecurityElement.Label(null);
    SecurityElement.Label label1 = new SecurityElement.Label(null);
    assertTrue(label.equals(label1));
    int expectedHashCodeResult = label.hashCode();
    assertEquals(expectedHashCodeResult, label1.hashCode());
  }

  @Test
  void testLabelGeleString() {
    assertEquals("Lbl", (new SecurityElement.Label("Lbl")).geleString());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        (new SecurityElement.Label(null)).geleString());
  }

  @Test
  void testLabelsConstructor() {
    assertEquals("*", (new SecurityElement.Labels()).toString());
  }

  @Test
  void testLabelsEquals() {
    assertFalse((new SecurityElement.Labels()).equals(null));
    assertFalse((new SecurityElement.Labels()).equals("Different type to Labels"));
    assertFalse((new SecurityElement.Labels()).equals(0));
  }

  @Test
  void testLabelsEquals2() {
    SecurityElement.Labels labels = new SecurityElement.Labels();
    assertTrue(labels.equals(labels));
    int expectedHashCodeResult = labels.hashCode();
    assertEquals(expectedHashCodeResult, labels.hashCode());
  }

  @Test
  void testLabelsEquals3() {
    SecurityElement.Labels labels = new SecurityElement.Labels();
    SecurityElement.Labels labels1 = new SecurityElement.Labels();
    assertTrue(labels.equals(labels1));
    int expectedHashCodeResult = labels.hashCode();
    assertEquals(expectedHashCodeResult, labels1.hashCode());
  }

  @Test
  void testPropertiesConstructor() {
    assertEquals("*", (new SecurityElement.Properties()).toString());
  }

  @Test
  void testPropertiesEquals() {
    assertFalse((new SecurityElement.Properties()).equals(null));
    assertFalse((new SecurityElement.Properties()).equals("Different type to Properties"));
    assertFalse((new SecurityElement.Properties()).equals(0));
  }

  @Test
  void testPropertiesEquals2() {
    SecurityElement.Properties properties = new SecurityElement.Properties();
    assertTrue(properties.equals(properties));
    int expectedHashCodeResult = properties.hashCode();
    assertEquals(expectedHashCodeResult, properties.hashCode());
  }

  @Test
  void testPropertiesEquals3() {
    SecurityElement.Properties properties = new SecurityElement.Properties();
    SecurityElement.Properties properties1 = new SecurityElement.Properties();
    assertTrue(properties.equals(properties1));
    int expectedHashCodeResult = properties.hashCode();
    assertEquals(expectedHashCodeResult, properties1.hashCode());
  }

  @Test
  void testPropertyConstructor() {
    assertEquals("Prop", (new SecurityElement.Property("Prop")).toString());
  }

  @Test
  void testPropertyEquals() {
    assertFalse((new SecurityElement.Property("Prop")).equals(null));
    assertFalse((new SecurityElement.Property("Prop")).equals("Different type to Property"));
  }

  @Test
  void testPropertyEquals2() {
    SecurityElement.Property property = new SecurityElement.Property("Prop");
    assertTrue(property.equals(property));
    int expectedHashCodeResult = property.hashCode();
    assertEquals(expectedHashCodeResult, property.hashCode());
  }

  @Test
  void testPropertyEquals3() {
    SecurityElement.Property property = new SecurityElement.Property("Prop");
    SecurityElement.Property property1 = new SecurityElement.Property("Prop");
    assertTrue(property.equals(property1));
    int expectedHashCodeResult = property.hashCode();
    assertEquals(expectedHashCodeResult, property1.hashCode());
  }

  @Test
  void testPropertyEquals4() {
    SecurityElement.Property property = new SecurityElement.Property(null);
    assertFalse(property.equals(new SecurityElement.Property("Prop")));
  }

  @Test
  void testPropertyEquals5() {
    SecurityElement.Property property = new SecurityElement.Property("42");
    assertFalse(property.equals(new SecurityElement.Property("Prop")));
  }

  @Test
  void testPropertyEquals6() {
    SecurityElement.Property property = new SecurityElement.Property(null);
    SecurityElement.Property property1 = new SecurityElement.Property(null);
    assertTrue(property.equals(property1));
    int expectedHashCodeResult = property.hashCode();
    assertEquals(expectedHashCodeResult, property1.hashCode());
  }

  @Test
  void testPropertyGepptString() {
    assertEquals("Prop", (new SecurityElement.Property("Prop")).gepptString());
    assertEquals(EnterpriseDefaultLdapRealm.LDA_CNX_DEN_CLX_MSX,
        (new SecurityElement.Property(null)).gepptString());
  }
}

