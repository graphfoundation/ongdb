package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.BufferingLog;
import org.neo4j.token.api.NamedToken;
import org.neo4j.token.api.NonUniqueTokenException;

class TokenHolderDefaultEnterpriseImplTest {

  @Test
  void testAddToken() throws NonUniqueTokenException {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl tokenHolderDefaultEnterpriseImpl = new TokenHolderDefaultEnterpriseImpl(
        newMapResult, new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");
    assertThrows(UnsupportedOperationException.class,
        () -> tokenHolderDefaultEnterpriseImpl.addToken(new NamedToken("Name", 1)));
  }

  @Test
  void testConstructor() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl actualTokenHolderDefaultEnterpriseImpl = new TokenHolderDefaultEnterpriseImpl(
        newMapResult, new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");

    assertTrue(
        ((Collection<NamedToken>) actualTokenHolderDefaultEnterpriseImpl.getAllTokens()).isEmpty());
    assertEquals(0, actualTokenHolderDefaultEnterpriseImpl.size());
    assertEquals(" str Tt", actualTokenHolderDefaultEnterpriseImpl.getTokenType());
    assertEquals(1, newMapResult.toList().size());
  }

  @Test
  void testGearceteneString() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertEquals(" str Tt_1",
        (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .gearceteneString(1));
  }

  @Test
  void testGearceteneString2() {
    UnifiedMap<String, List<NamedToken>> stringListMap = new UnifiedMap<String, List<NamedToken>>();
    stringListMap.put("foo", new ArrayList<NamedToken>());
    assertEquals(" str Tt_1",
        (new TokenHolderDefaultEnterpriseImpl(stringListMap,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .gearceteneString(1));
  }

  @Test
  void testGetAllTokens() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    Iterable<NamedToken> actualAllTokens = (new TokenHolderDefaultEnterpriseImpl(newMapResult,
        new NodeWrapperInfoMetrics(new BufferingLog()),
        " str Tt")).getAllTokens();
    actualAllTokens.iterator();
    assertTrue(((Collection<NamedToken>) actualAllTokens).isEmpty());
  }

  @Test
  void testGetIdByName() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertEquals(-1,
        (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .getIdByName("Dr"));
  }

  @Test
  void testGetIdsByNames() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertFalse(
        (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .getIdsByNames(new String[]{" str Nms Array"}, new int[]{}));
  }

  @Test
  void testGetOrCreateId() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertThrows(UnsupportedOperationException.class,
        () -> (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()),
            " str Tt")).getOrCreateId("Dr"));
  }

  @Test
  void testGetOrCreateIds() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertThrows(UnsupportedOperationException.class,
        () -> (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()),
            " str Tt")).getOrCreateIds(new String[]{" str Nms Array"}, new int[]{1, 1, 1, 1}));
  }

  @Test
  void testGetOrCreateInternalIds() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertThrows(UnsupportedOperationException.class,
        () -> (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()),
            " str Tt")).getOrCreateInternalIds(new String[]{" str Nms Array"},
            new int[]{1, 1, 1, 1}));
  }

  @Test
  void testGetTokenById() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl tokenHolderDefaultEnterpriseImpl = new TokenHolderDefaultEnterpriseImpl(
        newMapResult, new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");
    NamedToken actualTokenById = tokenHolderDefaultEnterpriseImpl.getTokenById(1);
    assertEquals(1, actualTokenById.id());
    assertEquals(" str Tt_1", actualTokenById.name());
    assertFalse(actualTokenById.isInternal());
    assertEquals(1,
        ((Collection<NamedToken>) tokenHolderDefaultEnterpriseImpl.getAllTokens()).size());
    assertEquals(1, tokenHolderDefaultEnterpriseImpl.size());
  }

  @Test
  void testGetTokenType() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertEquals(" str Tt",
        (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .getTokenType());
  }

  @Test
  void testHasToken() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertFalse(
        (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .hasToken(1));
  }

  @Test
  void testSetInitialTokens() throws NonUniqueTokenException {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl tokenHolderDefaultEnterpriseImpl = new TokenHolderDefaultEnterpriseImpl(
        newMapResult, new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");
    tokenHolderDefaultEnterpriseImpl.setInitialTokens(new ArrayList<NamedToken>());
    assertTrue(
        ((Collection<NamedToken>) tokenHolderDefaultEnterpriseImpl.getAllTokens()).isEmpty());
    assertEquals(0, tokenHolderDefaultEnterpriseImpl.size());
  }

  @Test
  void testSetInitialTokens2() throws NonUniqueTokenException {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    TokenHolderDefaultEnterpriseImpl tokenHolderDefaultEnterpriseImpl = new TokenHolderDefaultEnterpriseImpl(
        newMapResult, new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt");

    ArrayList<NamedToken> namedTokenList = new ArrayList<NamedToken>();
    namedTokenList.add(new NamedToken("Name", 1));
    tokenHolderDefaultEnterpriseImpl.setInitialTokens(namedTokenList);
    assertEquals(1,
        ((Collection<NamedToken>) tokenHolderDefaultEnterpriseImpl.getAllTokens()).size());
    assertEquals(1, tokenHolderDefaultEnterpriseImpl.size());
  }

  @Test
  void testSize() {
    UnifiedMap<String, List<NamedToken>> newMapResult = UnifiedMap.newMap();
    newMapResult.put("foo", new ArrayList<NamedToken>());
    assertEquals(0,
        (new TokenHolderDefaultEnterpriseImpl(newMapResult,
            new NodeWrapperInfoMetrics(new BufferingLog()), " str Tt"))
            .size());
  }
}

