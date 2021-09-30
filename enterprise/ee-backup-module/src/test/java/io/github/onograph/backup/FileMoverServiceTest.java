package io.github.onograph.backup;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class FileMoverServiceTest {

  @Test
  void testCovifeseFileMoverService() {

    FileMoverService.covifeseFileMoverService(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }

  @Test
  void testMovifeseFileMoverService() {

    FileMoverService.movifeseFileMoverService(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
  }
}

