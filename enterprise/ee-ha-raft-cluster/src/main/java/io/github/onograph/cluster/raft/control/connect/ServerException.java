package io.github.onograph.cluster.raft.control.connect;


public class ServerException extends Exception {

  public ServerException(String m,
      io.github.onograph.cluster.raft.control.connect.ComProFamilyWrapper.ComProFamilyBuilder _bspComProFamilyBuilder) {
    super(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.control.connect.ServerException.super", m,
        _bspComProFamilyBuilder));
  }
}
