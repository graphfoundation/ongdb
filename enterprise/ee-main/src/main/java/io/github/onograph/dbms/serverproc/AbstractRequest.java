package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;


abstract class AbstractRequest {


  protected final long Syttid;


  protected final ServerId serverId;


  private final Log log;


  private final NamedDatabaseId namedDatabaseId;


  private final SocketAddress socketAddress;


  AbstractRequest(long _lgSti, Log _log, NamedDatabaseId _namedDatabaseId, ServerId _serverId,
      SocketAddress _socketAddress) {
    this.Syttid = _lgSti;
    this.log = _log;
    this.namedDatabaseId = _namedDatabaseId;
    this.serverId = _serverId;
    this.socketAddress = _socketAddress;
  }


  private static Reply _hadrpsReply(Meta _iMeta, long _lgIts, NamedDatabaseId _namedDatabaseId,
      ServerId _serverId, SocketAddress _socketAddress) {
    if (_iMeta.rectfaeOptional().isPresent()) {

      String _strMuc =
          _iMeta.getLgIr() >= _lgIts ? io.github.onograph.I18N.format(
              "io.github.onograph.dbms.serverproc.AbstractRequest.var")
              : io.github.onograph.I18N.format(
                  "io.github.onograph.dbms.serverproc.AbstractRequest.var2");
      return Reply.falReply(
          io.github.onograph.I18N.format(
              "io.github.onograph.dbms.serverproc.AbstractRequest.falReply", _strMuc,
              _namedDatabaseId,
              _iMeta.rectfaeOptional().get()), _serverId,
          _socketAddress);
    } else {
      return _iMeta.getLgIr() >= _lgIts ? Reply.caguReply(_serverId, _socketAddress) : null;
    }
  }


  public Reply calReply() {
    try {

      Meta _riMeta = this.geioMeta(this.namedDatabaseId);
      return _hadrpsReply(_riMeta, this.Syttid, this.namedDatabaseId, this.serverId,
          this.socketAddress);
    } catch (

        Throwable _throwable) {

      return null;
    }
  }


  protected abstract Meta geioMeta(NamedDatabaseId _namedDatabaseId) throws Exception;


  public SocketAddress getSocketAddress() {
    return this.socketAddress;
  }
}
