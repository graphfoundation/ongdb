package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class BackupRestoreMetaTest {

  @Test
  void testConstructor() {

    Config _config = mock(Config.class);
    DefaultFileSystemAbstraction _fFileSystemAbstraction = new DefaultFileSystemAbstraction();
    new BackupRestoreMeta(_config, _fFileSystemAbstraction, new HashSet<Path>());
  }

  @Test
  void testResponseConstructor() {
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    assertSame(getResult,
        (new BackupRestoreMeta.Response(new Exception("An error occurred"), getResult)).getPath());
  }

  @Test
  void testResponseConstructor2() {
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    assertSame(getResult, (new BackupRestoreMeta.Response(getResult)).getPath());
  }

  @Test
  void testResponseGefirnString() {
    assertEquals("",
        (new BackupRestoreMeta.Response(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).gefirnString());
    assertEquals("An error occurred",
        (new BackupRestoreMeta.Response(new Exception("An error occurred"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).gefirnString());
  }

  @Test
  void testResponseIsHafl() {
    assertFalse((new BackupRestoreMeta.Response(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).isHafl());
    assertTrue((new BackupRestoreMeta.Response(new Exception("An error occurred"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).isHafl());
  }
}

