package io.github.onograph.cluster.raft.module.cuprot.current.info;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class MetaTest {

  @Test
  void testCraMeta() {
    assertEquals(1L, Meta.craMeta(1L, " str Fr").getLgIr());
    assertEquals(1L, Meta.craMeta(1L, " str Fr").getLgIr());
  }

  @Test
  void testEquals() {
    assertFalse(Meta.craMeta(1L, " str Fr").equals(null));
    assertFalse(Meta.craMeta(1L, " str Fr").equals("Different type to Meta"));
  }

  @Test
  void testEquals2() {
    Meta craMetaResult = Meta.craMeta(1L, " str Fr");
    assertTrue(craMetaResult.equals(craMetaResult));
    int expectedHashCodeResult = craMetaResult.hashCode();
    assertEquals(expectedHashCodeResult, craMetaResult.hashCode());
  }

  @Test
  void testEquals3() {
    Meta craMetaResult = Meta.craMeta(1L, " str Fr");
    Meta craMetaResult1 = Meta.craMeta(1L, " str Fr");
    assertTrue(craMetaResult.equals(craMetaResult1));
    int expectedHashCodeResult = craMetaResult.hashCode();
    assertEquals(expectedHashCodeResult, craMetaResult1.hashCode());
  }

  @Test
  void testEquals4() {
    Meta craMetaResult = Meta.craMeta(0L, " str Fr");
    assertFalse(craMetaResult.equals(Meta.craMeta(1L, " str Fr")));
  }

  @Test
  void testEquals5() {
    Meta craMetaResult = Meta.craMeta(1L, null);
    assertFalse(craMetaResult.equals(Meta.craMeta(1L, " str Fr")));
  }

  @Test
  void testRectfaeOptional() {
    Optional<String> actualRectfaeOptionalResult = Meta.craMeta(1L, " str Fr").rectfaeOptional();
    assertTrue(actualRectfaeOptionalResult.isPresent());
    assertEquals(" str Fr", actualRectfaeOptionalResult.get());
  }
}

