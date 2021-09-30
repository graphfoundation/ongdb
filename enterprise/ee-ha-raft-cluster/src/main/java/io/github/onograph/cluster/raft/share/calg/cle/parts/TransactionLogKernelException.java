package io.github.onograph.cluster.raft.share.calg.cle.parts;

import org.neo4j.exceptions.KernelException;
import org.neo4j.kernel.api.exceptions.Status.General;


public class TransactionLogKernelException extends KernelException {

  public TransactionLogKernelException(String frmt, Object... _obArgArray) {
    super(General.StorageDamageDetected, frmt, _obArgArray);
  }

  public TransactionLogKernelException(Throwable _cueThrowable, String frmt, Object... _obArArray) {
    super(General.StorageDamageDetected, _cueThrowable, frmt, _obArArray);
  }
}
