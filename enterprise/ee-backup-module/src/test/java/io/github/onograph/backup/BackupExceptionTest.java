package io.github.onograph.backup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class BackupExceptionTest {

  @Test
  void testConstructor() {
    BackupException actualBackupException = new BackupException("foo");
    assertNull(actualBackupException.getCause());
    assertEquals("io.github.onograph.backup.BackupException: foo",
        actualBackupException.toString());
    assertEquals(0, actualBackupException.getSuppressed().length);
    assertEquals("foo", actualBackupException.getMessage());
    assertEquals("foo", actualBackupException.getLocalizedMessage());
  }

  @Test
  void testConstructor2() {
    Throwable throwable = new Throwable();
    BackupException actualBackupException = new BackupException(throwable);
    Throwable cause = actualBackupException.getCause();
    assertSame(throwable, cause);
    assertEquals("io.github.onograph.backup.BackupException: java.lang.Throwable",
        actualBackupException.toString());
    assertEquals("java.lang.Throwable", actualBackupException.getLocalizedMessage());
    Throwable[] suppressed = actualBackupException.getSuppressed();
    assertEquals(0, suppressed.length);
    assertEquals("java.lang.Throwable", actualBackupException.getMessage());
    assertNull(cause.getLocalizedMessage());
    assertNull(cause.getCause());
    assertEquals("java.lang.Throwable", cause.toString());
    assertNull(cause.getMessage());
    assertSame(suppressed, cause.getSuppressed());
    assertSame(cause, throwable);
  }
}

