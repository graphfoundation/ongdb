package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class GdbIdRepoTest {

  @Test
  void testConstructor() {

    new GdbIdRepo(new DefaultFileSystemAbstraction());
  }

  @Test
  void testGedtefpPath() {

    GdbIdRepo.gedtefpPath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testGedtefpPath2() {

    GdbIdRepo.gedtefpPath(Paths.get(System.getProperty(GdbIdRepo.FIL_NME), "More"));
  }

  @Test
  void testReddtaiOptional() {
    assertFalse((new GdbIdRepo(new DefaultFileSystemAbstraction()))
        .reddtaiOptional(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))
        .isPresent());
    assertFalse((new GdbIdRepo(new DefaultFileSystemAbstraction()))
        .reddtaiOptional(Paths.get(System.getProperty(GdbIdRepo.FIL_NME), "test.txt"))
        .isPresent());
    assertThrows(IllegalStateException.class,
        () -> (new GdbIdRepo(new DefaultFileSystemAbstraction()))
            .reddtaiOptional(Paths.get(System.getProperty("java.io.tmpdir"), "")));
  }
}

