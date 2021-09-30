package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.function.Predicate;
import org.junit.jupiter.api.Test;
import org.neo4j.adversaries.fs.AdversarialChannelDefaultFileSystemAbstraction;
import org.neo4j.io.pagecache.StubPagedFile;

class PageShapeTest {

  @Test
  void testPaplneStream() {

    PageShape.paplneStream(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testPaplneStream2() {

    PageShape.paplneStream(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), CachePopulator.SUXE));
  }

  @Test
  void testReentoPredicate() {
    Predicate<PageShape> actualReentoPredicateResult = PageShape.reentoPredicate(
        new StubPagedFile(3));
    assertFalse(
        actualReentoPredicateResult.test(
            PageShape.fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testDeeForFi() throws IOException {

    PageShape fPageShapeResult = PageShape.fPageShape(
        Paths.get(System.getProperty("java.io.tmpdir"), ""),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    fPageShapeResult.deeForFi(new AdversarialChannelDefaultFileSystemAbstraction());
  }

  @Test
  void testNexPageShape() {
    PageShape actualNexPageShapeResult = PageShape
        .fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))
        .nexPageShape();
    assertEquals(1,
        actualNexPageShapeResult.compareTo(
            PageShape.fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testNexPageShape2() {
    PageShape actualNexPageShapeResult = PageShape
        .fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
            Paths.get(System.getProperty("java.io.tmpdir"), "More"))
        .nexPageShape();
    assertEquals(-39,
        actualNexPageShapeResult.compareTo(
            PageShape.fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  @Test
  void testReaInputStream() throws IOException {
    PageShape fPageShapeResult = PageShape.fPageShape(
        Paths.get(System.getProperty("java.io.tmpdir"), ""),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertThrows(IOException.class,
        () -> fPageShapeResult.reaInputStream(
            new AdversarialChannelDefaultFileSystemAbstraction()));
  }

  @Test
  void testReaInputStream2() throws IOException {
    PageShape fPageShapeResult = PageShape.fPageShape(
        Paths.get(System.getProperty("java.io.tmpdir")),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertThrows(IOException.class,
        () -> fPageShapeResult.reaInputStream(
            new AdversarialChannelDefaultFileSystemAbstraction()));
  }
}

