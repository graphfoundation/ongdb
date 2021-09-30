package io.github.onograph.backup;

import org.junit.jupiter.api.Test;

class BackupRunnerTest {

  @Test
  void testBuldeuBackupRunner() {

    BackupRunner.buldeuBackupRunner();
  }

  @Test
  void testBulrBackupRunnerGenerator() {

    BackupRunner.bulrBackupRunnerGenerator();
  }

  @Test
  void testGeneratorBulBackupRunner() {

    BackupRunner.bulrBackupRunnerGenerator().bulBackupRunner();
  }
}

