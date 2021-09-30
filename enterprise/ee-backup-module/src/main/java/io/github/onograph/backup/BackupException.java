package io.github.onograph.backup;


public class BackupException extends Exception {

  BackupException(String m) {
    super(m);
  }

  BackupException(Throwable _cueThrowable) {
    super(_cueThrowable);
  }
}
