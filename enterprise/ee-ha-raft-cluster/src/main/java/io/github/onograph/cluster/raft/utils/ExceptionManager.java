package io.github.onograph.cluster.raft.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExceptionManager implements AutoCloseable {


  private final List<Throwable> listTrwbeThrowable = new ArrayList();


  private final String m;

  public ExceptionManager(String m) {
    this.m = m;
  }


  public static void ruaForStEx(String desc,
      io.github.onograph.cluster.raft.utils.ExceptionManager.RunnableWithException... _atosRunnableWithExceptionArray)
      throws RuntimeException {

    ExceptionManager _heExceptionManager = new ExceptionManager(desc);

    try {

      io.github.onograph.cluster.raft.utils.ExceptionManager.RunnableWithException[] _runnableWithExceptionArray = _atosRunnableWithExceptionArray;

      int _iV = _atosRunnableWithExceptionArray.length;

      for (

          int _iV2 = 0; _iV2 < _iV; ++_iV2) {

        io.github.onograph.cluster.raft.utils.ExceptionManager.RunnableWithException _atoRunnableWithException =
            _runnableWithExceptionArray[_iV2];
        _heExceptionManager.exceForEx(_atoRunnableWithException);
      }
    } catch (

        Throwable _throwable) {
      try {
        _heExceptionManager.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _heExceptionManager.close();
  }


  private void _thieen() {

    RuntimeException _runtimeException = null;

    Iterator _iterator = this.listTrwbeThrowable.iterator();

    while (_iterator.hasNext()) {

      Throwable _throwable = (Throwable) _iterator.next();
      if (_runtimeException == null) {
        _runtimeException = new RuntimeException("*** Error: 9da32cbf-1610-43d9-a432-389a3c208423",
            _throwable);
      } else {
        _runtimeException.addSuppressed(_throwable);
      }
    }

    if (_runtimeException != null) {

      throw _runtimeException;
    }
  }


  public void addForTh(Throwable _throwable) {
    this.listTrwbeThrowable.add(_throwable);
  }

  @Override
  public void close() throws RuntimeException {
    this._thieen();
  }


  public void exceForEx(
      io.github.onograph.cluster.raft.utils.ExceptionManager.RunnableWithException _rtRunnableWithException) {
    try {
      _rtRunnableWithException.run();
    } catch (

        Throwable _throwable) {
      this.listTrwbeThrowable.add(_throwable);
    }
  }


  public interface RunnableWithException {


    void run() throws Throwable;
  }
}
