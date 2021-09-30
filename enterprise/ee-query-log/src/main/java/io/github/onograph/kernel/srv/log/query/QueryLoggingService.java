package io.github.onograph.kernel.srv.log.query;

import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.query.ExecutingQuery;


public interface QueryLoggingService {


  QueryLoggingService NO_LG = new QueryLoggingService() {
    @Override
    public void comForKe(KernelTransaction _kernelTransaction) {
    }

    @Override
    public void faleForExTh(ExecutingQuery _executingQuery, String _strRao) {
    }

    @Override
    public void faleForExTh(ExecutingQuery _executingQuery, Throwable _throwable) {
    }

    @Override
    public void rolcForKe(KernelTransaction _kernelTransaction, Throwable _throwable) {
    }

    @Override
    public void rolcForKe(KernelTransaction _kernelTransaction) {
    }

    @Override
    public void strForEx(KernelTransaction _kernelTransaction) {
    }

    @Override
    public void strForEx(ExecutingQuery _executingQuery) {
    }

    @Override
    public void sucsForEx(ExecutingQuery _executingQuery) {
    }
  };


  void comForKe(KernelTransaction _kernelTransaction);


  void faleForExTh(ExecutingQuery _executingQuery, String _strVar);


  void faleForExTh(ExecutingQuery _executingQuery, Throwable _throwable);


  void rolcForKe(KernelTransaction _kernelTransaction, Throwable _throwable);


  void rolcForKe(KernelTransaction _kernelTransaction);


  void strForEx(KernelTransaction _kernelTransaction);


  void strForEx(ExecutingQuery _executingQuery);


  void sucsForEx(ExecutingQuery _executingQuery);
}
