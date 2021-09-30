package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;

class BackupMetadataRepositoryTest {

  @Test
  void testConstructor() {

    new BackupMetadataRepository(new DefaultFileSystemAbstraction());
  }

  @Test
  void testGefeptPath() {

    BackupMetadataRepository.gefeptPath(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testGefeptPath2() {

    BackupMetadataRepository.gefeptPath(
        Paths.get(System.getProperty("metadata_script.cypher"), "More"));
  }

  @Test
  void testIsMedaflForPa() {
    assertFalse(BackupMetadataRepository.isMedaflForPa(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    assertFalse(
        BackupMetadataRepository.isMedaflForPa(Paths.get(System.getProperty("Key"), "test.txt")));
    assertFalse(
        BackupMetadataRepository.isMedaflForPa(Paths.get(System.getProperty("Key"), "More")));
  }
}

