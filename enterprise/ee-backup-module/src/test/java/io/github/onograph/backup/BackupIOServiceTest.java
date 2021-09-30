package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class BackupIOServiceTest {

  @Test
  void testConstructor() {

    new BackupIOService(new DefaultFileSystemAbstraction());
  }

  @Test
  void testCoydleForPaPa() throws IOException {

    (new BackupIOService(new DefaultFileSystemAbstraction())).coydleForPaPa(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testDeedForPa() throws IOException {

    (new BackupIOService(new DefaultFileSystemAbstraction()))
        .deedForPa(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testDeedForPa2() throws IOException {

    (new BackupIOService(new DefaultFileSystemAbstraction()))
        .deedForPa(Paths.get(System.getProperty("Key"), "test.txt"));
  }

  @Test
  void testDeedForPa3() throws IOException {

    (new BackupIOService(new DefaultFileSystemAbstraction())).deedForPa(
        Paths.get(System.getProperty("Key"), ""));
  }

  @Test
  void testIsDitdontetoieForPa() throws IOException {
    assertTrue((new BackupIOService(new DefaultFileSystemAbstraction()))
        .isDitdontetoieForPa(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    assertTrue((new BackupIOService(new DefaultFileSystemAbstraction()))
        .isDitdontetoieForPa(Paths.get(System.getProperty("Key"), "test.txt")));
    assertFalse((new BackupIOService(new DefaultFileSystemAbstraction()))
        .isDitdontetoieForPa(Paths.get(System.getProperty("java.io.tmpdir"), "")));
  }

  @Test
  void testIsExsForPa() {
    assertFalse((new BackupIOService(new DefaultFileSystemAbstraction()))
        .isExsForPa(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    assertFalse((new BackupIOService(new DefaultFileSystemAbstraction()))
        .isExsForPa(Paths.get(System.getProperty("Key"), "test.txt")));
    assertTrue((new BackupIOService(new DefaultFileSystemAbstraction()))
        .isExsForPa(Paths.get(System.getProperty("java.io.tmpdir"), "")));
  }
}

