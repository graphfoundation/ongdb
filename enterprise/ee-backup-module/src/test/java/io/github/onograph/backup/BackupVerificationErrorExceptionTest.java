package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BackupVerificationErrorExceptionTest {

  @Test
  void testConstructor() {
    assertTrue((new BackupVerificationErrorException(new Throwable(), true, "foo")).getIsEtfcc());
    assertTrue((new BackupVerificationErrorException(true, "foo")).getIsEtfcc());
  }
}

