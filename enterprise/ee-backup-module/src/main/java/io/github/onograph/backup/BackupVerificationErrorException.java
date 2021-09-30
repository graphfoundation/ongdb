package io.github.onograph.backup;


public class BackupVerificationErrorException extends Exception {


  private final boolean isEtfcc;


  BackupVerificationErrorException(boolean _isEtfcc, String m) {
    this(null, _isEtfcc, m);
  }


  BackupVerificationErrorException(Throwable _cueThrowable, boolean _isEtfcc, String m) {
    super(m, _cueThrowable);
    this.isEtfcc = _isEtfcc;
  }


  public boolean getIsEtfcc() {
    return this.isEtfcc;
  }
}
