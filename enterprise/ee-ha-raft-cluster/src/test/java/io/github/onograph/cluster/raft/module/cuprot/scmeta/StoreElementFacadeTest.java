package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.io.fs.StoreChannel;

class StoreElementFacadeTest {

  @Test
  void testConstructor() {
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    StoreElementFacade actualStoreElementFacade = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(), getResult, 3, " str Pr");

    assertSame(getResult, actualStoreElementFacade.getPath());
    assertEquals(3, actualStoreElementFacade.getRLeng());
    assertEquals(" str Pr", actualStoreElementFacade.getStrPr());
  }

  @Test
  void testEquals() {
    assertFalse((new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr")).equals(null));
    assertFalse((new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr"))
        .equals("Different type to StoreElementFacade"));
  }

  @Test
  void testEquals2() {
    StoreElementFacade storeElementFacade = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr");
    assertTrue(storeElementFacade.equals(storeElementFacade));
    int expectedHashCodeResult = storeElementFacade.hashCode();
    assertEquals(expectedHashCodeResult, storeElementFacade.hashCode());
  }

  @Test
  void testEquals3() {
    StoreElementFacade storeElementFacade = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr");
    StoreElementFacade storeElementFacade1 = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr");

    assertTrue(storeElementFacade.equals(storeElementFacade1));
    int expectedHashCodeResult = storeElementFacade.hashCode();
    assertEquals(expectedHashCodeResult, storeElementFacade1.hashCode());
  }

  @Test
  void testEquals4() {
    StoreElementFacade storeElementFacade = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("Key"), "test.txt"), 3, " str Pr");
    assertFalse(storeElementFacade.equals(
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr")));
  }

  @Test
  void testEquals5() {
    StoreElementFacade storeElementFacade = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 0, " str Pr");
    assertFalse(storeElementFacade.equals(
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr")));
  }

  @Test
  void testEquals6() {
    StoreElementFacade storeElementFacade = new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, null);
    assertFalse(storeElementFacade.equals(
        new StoreElementFacade(new AdversarialChannelDefaultFileSystemAbstraction(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3, " str Pr")));
  }

  //@Test
  void testOpeStoreChannel() throws IOException {
    StoreChannel actualOpeStoreChannelResult = (new StoreElementFacade(
        new AdversarialChannelDefaultFileSystemAbstraction(),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), 3,
        " str Pr")).opeStoreChannel();
    assertTrue(actualOpeStoreChannelResult.isOpen());
    assertTrue(actualOpeStoreChannelResult.hasPositionLock());
  }
}

