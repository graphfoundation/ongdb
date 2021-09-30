package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class BackupTest {

  @Test
  void testBakBackupBackupRespState() {
    assertThrows(RuntimeException.class, () -> Backup.froBackup(10, " str Ioh")
        .bakBackupBackupRespState("Gdb Name",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    assertThrows(RuntimeException.class, () -> Backup.froBackup(1, " str Ioh")
        .bakBackupBackupRespState("Gdb Name",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    assertThrows(RuntimeException.class, () -> Backup.froBackup(10, " str Ioh")
        .bakBackupBackupRespState("log4jUl",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    assertThrows(RuntimeException.class, () -> Backup.froBackup(10, " str Ioh")
        .bakBackupBackupRespState("log4jUl",
            Paths.get(System.getProperty("java.io.tmpdir"), "More")));
  }

  @Test
  void testFroBackup() {

    Backup.froBackup(10, " str Ioh");
  }

  @Test
  void testFroBackup2() {

    Backup.froBackup(10, " str Ioh");
  }

  @Test
  void testFroBackup3() {

    Backup.froBackup(65535, "foo");
  }

  @Test
  void testFroBackup4() {

    Backup.froBackup(" str Ioh");
  }
}

