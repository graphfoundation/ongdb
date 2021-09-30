package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.internal.kernel.api.exceptions.LabelNotFoundKernelException;
import org.neo4j.internal.kernel.api.exceptions.PropertyKeyIdNotFoundKernelException;
import org.neo4j.internal.kernel.api.exceptions.RelationshipTypeIdNotFoundKernelException;
import org.neo4j.token.DelegatingTokenHolder;
import org.neo4j.token.TokenCreator;
import org.neo4j.token.TokenHolders;
import org.neo4j.token.api.NamedToken;

class TokenReadImmutableImplTest {

  @Test
  void testConstructor() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")));
  }

  @Test
  void testLabelCount() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(0, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).labelCount());
  }

  @Test
  void testLabelCount2() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "([III)V");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(0, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).labelCount());
  }

  @Test
  void testLabelGetName() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such label: 1]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).labelGetName(1));
  }

  @Test
  void testLabelGetName2() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl labelTokens = new TokenHolderDefaultEnterpriseImpl(
        newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(" str Tt_1",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).labelGetName(1));
  }

  @Test
  void testLabelGetName3() {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("Name",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, delegatingTokenHolder,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).labelGetName(1));
  }

  @Test
  void testLabelGetName4() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such label: 0]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).labelGetName(0));
  }

  @Test
  void testLabelGetName5() {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1, true));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such label: 1]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            delegatingTokenHolder,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).labelGetName(1));
  }

  @Test
  void testLabelsGetAllTokens() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).labelsGetAllTokens();
  }

  @Test
  void testLabelsGetAllTokens2() {

    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, delegatingTokenHolder,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).labelsGetAllTokens();
  }

  @Test
  void testLabelsGetAllTokens3() {

    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 123));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, delegatingTokenHolder,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).labelsGetAllTokens();
  }

  @Test
  void testLabelsGetAllTokens4() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "([III)V");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).labelsGetAllTokens();
  }

  @Test
  void testNodeLabel() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(-1, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).nodeLabel(
        "Dr"));
  }

  @Test
  void testNodeLabel2() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(-1, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).nodeLabel(
        "Title"));
  }

  @Test
  void testNodeLabelName() throws LabelNotFoundKernelException {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(LabelNotFoundKernelException.class,
        () -> (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).nodeLabelName(
            1));
  }

  @Test
  void testNodeLabelName2() throws LabelNotFoundKernelException {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl labelTokens = new TokenHolderDefaultEnterpriseImpl(
        newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(" str Tt_1",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).nodeLabelName(1));
  }

  @Test
  void testNodeLabelName3() throws LabelNotFoundKernelException {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("Name",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, delegatingTokenHolder,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).nodeLabelName(1));
  }

  @Test
  void testNodeLabelName4() throws LabelNotFoundKernelException {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(LabelNotFoundKernelException.class,
        () -> (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).nodeLabelName(
            0));
  }

  @Test
  void testPropertyKey() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(-1, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).propertyKey(
        "Dr"));
  }

  @Test
  void testPropertyKey2() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(-1, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).propertyKey(
        "Title"));
  }

  @Test
  void testPropertyKeyCount() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(0, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).propertyKeyCount());
  }

  @Test
  void testPropertyKeyCount2() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "([III)V");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(0, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).propertyKeyCount());
  }

  @Test
  void testPropertyKeyGetAllTokens() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).propertyKeyGetAllTokens();
  }

  @Test
  void testPropertyKeyGetAllTokens2() {

    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(delegatingTokenHolder, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).propertyKeyGetAllTokens();
  }

  @Test
  void testPropertyKeyGetAllTokens3() {

    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 123));
    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(delegatingTokenHolder, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).propertyKeyGetAllTokens();
  }

  @Test
  void testPropertyKeyGetAllTokens4() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "([III)V");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123")))).propertyKeyGetAllTokens();
  }

  @Test
  void testPropertyKeyGetName() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such property key: 1]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyGetName(
            1));
  }

  @Test
  void testPropertyKeyGetName2() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl propertyKeyTokens = new TokenHolderDefaultEnterpriseImpl(
        newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()),
        " str Tt");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(" str Tt_1",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyGetName(1));
  }

  @Test
  void testPropertyKeyGetName3() {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("Name",
        (new TokenReadImmutableImpl(new TokenHolders(delegatingTokenHolder, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyGetName(1));
  }

  @Test
  void testPropertyKeyGetName4() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such property key: 0]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyGetName(
            0));
  }

  @Test
  void testPropertyKeyGetName5() {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1, true));
    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such property key: 1]",
        (new TokenReadImmutableImpl(new TokenHolders(delegatingTokenHolder,
            labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyGetName(
            1));
  }

  @Test
  void testPropertyKeyName() throws PropertyKeyIdNotFoundKernelException {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(PropertyKeyIdNotFoundKernelException.class,
        () -> (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyName(1));
  }

  @Test
  void testPropertyKeyName2() throws PropertyKeyIdNotFoundKernelException {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl propertyKeyTokens = new TokenHolderDefaultEnterpriseImpl(
        newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()),
        " str Tt");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(" str Tt_1",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyName(1));
  }

  @Test
  void testPropertyKeyName3() throws PropertyKeyIdNotFoundKernelException {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("Name",
        (new TokenReadImmutableImpl(new TokenHolders(delegatingTokenHolder, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyName(1));
  }

  @Test
  void testPropertyKeyName4() throws PropertyKeyIdNotFoundKernelException {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(PropertyKeyIdNotFoundKernelException.class,
        () -> (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).propertyKeyName(0));
  }

  @Test
  void testRelationshipType() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(-1, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).relationshipType("Dr"));
  }

  @Test
  void testRelationshipType2() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(-1, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).relationshipType("Title"));
  }

  @Test
  void testRelationshipTypeCount() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(0, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).relationshipTypeCount());
  }

  @Test
  void testRelationshipTypeCount2() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "([III)V");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(0, (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).relationshipTypeCount());
  }

  @Test
  void testRelationshipTypeGetName() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such relationship type: 1]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).relationshipTypeGetName(
            1));
  }

  @Test
  void testRelationshipTypeGetName2() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl relationshipTypeTokens = new TokenHolderDefaultEnterpriseImpl(
        newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()),
        " str Tt");

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(" str Tt_1",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"),
            relationshipTypeTokens)))
            .relationshipTypeGetName(1));
  }

  @Test
  void testRelationshipTypeGetName3() {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("Name",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"),
            delegatingTokenHolder)))
            .relationshipTypeGetName(1));
  }

  @Test
  void testRelationshipTypeGetName4() {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such relationship type: 0]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).relationshipTypeGetName(
            0));
  }

  @Test
  void testRelationshipTypeGetName5() {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1, true));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("[no such relationship type: 1]",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"),
            delegatingTokenHolder)))
            .relationshipTypeGetName(1));
  }

  @Test
  void testRelationshipTypeName() throws RelationshipTypeIdNotFoundKernelException {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(RelationshipTypeIdNotFoundKernelException.class,
        () -> (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).relationshipTypeName(1));
  }

  @Test
  void testRelationshipTypeName2() throws RelationshipTypeIdNotFoundKernelException {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl relationshipTypeTokens = new TokenHolderDefaultEnterpriseImpl(
        newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()),
        " str Tt");

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals(" str Tt_1",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"),
            relationshipTypeTokens)))
            .relationshipTypeName(1));
  }

  @Test
  void testRelationshipTypeName3() throws RelationshipTypeIdNotFoundKernelException {
    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertEquals("Name",
        (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"),
            delegatingTokenHolder)))
            .relationshipTypeName(1));
  }

  @Test
  void testRelationshipTypeName4() throws RelationshipTypeIdNotFoundKernelException {
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    assertThrows(RelationshipTypeIdNotFoundKernelException.class,
        () -> (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
            new DelegatingTokenHolder(mock(TokenCreator.class),
                "ABC123")))).relationshipTypeName(0));
  }

  @Test
  void testRelationshipTypesGetAllTokens() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).relationshipTypesGetAllTokens();
  }

  @Test
  void testRelationshipTypesGetAllTokens2() {

    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 1));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"), delegatingTokenHolder)))
        .relationshipTypesGetAllTokens();
  }

  @Test
  void testRelationshipTypesGetAllTokens3() {

    DelegatingTokenHolder delegatingTokenHolder = new DelegatingTokenHolder(
        mock(TokenCreator.class), "ABC123");
    delegatingTokenHolder.addToken(new NamedToken("Name", 123));
    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class), "ABC123"), delegatingTokenHolder)))
        .relationshipTypesGetAllTokens();
  }

  @Test
  void testRelationshipTypesGetAllTokens4() {

    DelegatingTokenHolder propertyKeyTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "([III)V");

    DelegatingTokenHolder labelTokens = new DelegatingTokenHolder(mock(TokenCreator.class),
        "ABC123");

    (new TokenReadImmutableImpl(new TokenHolders(propertyKeyTokens, labelTokens,
        new DelegatingTokenHolder(mock(TokenCreator.class),
            "ABC123")))).relationshipTypesGetAllTokens();
  }
}

