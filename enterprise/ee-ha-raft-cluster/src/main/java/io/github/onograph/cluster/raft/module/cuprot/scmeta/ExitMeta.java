package io.github.onograph.cluster.raft.module.cuprot.scmeta;


@FunctionalInterface
public interface ExitMeta {


  ExitMeta CONDI_EXIT_META = () ->
  {
  };


  default ExitMeta andExitMeta(ExitMeta _ohrExitMeta) {
    return _ohrExitMeta instanceof ExitMetaJoinedImpl ? _ohrExitMeta.andExitMeta(this)
        : new ExitMetaJoinedImpl(this,
            new ExitMeta[]{
                _ohrExitMeta});
  }


  void asectu() throws GdbStoreException;
}
