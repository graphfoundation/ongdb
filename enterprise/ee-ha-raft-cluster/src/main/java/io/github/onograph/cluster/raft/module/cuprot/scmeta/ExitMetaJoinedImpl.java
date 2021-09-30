package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.internal.helpers.Exceptions;


class ExitMetaJoinedImpl implements ExitMeta {


  private final Set<ExitMeta> setCaExitMeta;

  ExitMetaJoinedImpl(ExitMeta isStrt, ExitMeta... _ohrExitMetaArray) {
    this.setCaExitMeta = Stream.concat(Stream.of(isStrt), Stream.of(_ohrExitMetaArray))
        .collect(Collectors.toSet());
  }

  @Override
  public ExitMeta andExitMeta(ExitMeta _ohrExitMeta) {
    if (_ohrExitMeta instanceof ExitMetaJoinedImpl) {
      this.setCaExitMeta.addAll(((ExitMetaJoinedImpl) _ohrExitMeta).setCaExitMeta);
    } else {
      this.setCaExitMeta.add(_ohrExitMeta);
    }

    return this;
  }

  @Override
  public void asectu() throws GdbStoreException {

    Exception _errException = null;

    Iterator _iterator = this.setCaExitMeta.iterator();

    while (_iterator.hasNext()) {

      ExitMeta _cniinExitMeta = (ExitMeta) _iterator.next();

      try {
        _cniinExitMeta.asectu();
      } catch (

          GdbStoreException _gdbStoreException) {
        _errException = Exceptions.chain(_errException, _gdbStoreException);
      }
    }

    if (_errException != null) {

      throw new GdbStoreException(_errException,
          "*** Error:  ff07e706-4ba4-4e3a-90a4-e7adfe2962f3");
    }
  }
}
