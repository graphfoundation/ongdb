package io.github.onograph.dbms.serverproc;

import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;


class Reply {


  private final String m;


  private final ServerId serverId;


  private final SocketAddress socketAddress;


  private final WaitingReplyMetaType srwWaitingReplyMetaType;


  private Reply(String m, ServerId _serverId, SocketAddress _socketAddress,
      WaitingReplyMetaType _srwWaitingReplyMetaType) {
    this.m = m;
    this.serverId = _serverId;
    this.socketAddress = _socketAddress;
    this.srwWaitingReplyMetaType = _srwWaitingReplyMetaType;
  }


  static Reply caguReply(ServerId _serverId, SocketAddress _socketAddress) {
    return new Reply(
        io.github.onograph.I18N.format("io.github.onograph.dbms.serverproc.Reply.socketAddress"),
        _serverId, _socketAddress,
        WaitingReplyMetaType.CaughtUp);
  }


  static Reply falReply(String m, ServerId _serverId, SocketAddress _socketAddress) {
    return new Reply(m, _serverId, _socketAddress, WaitingReplyMetaType.Failed);
  }


  public static Reply inoleReply(ServerId _serverId, SocketAddress _socketAddress) {
    return new Reply(
        io.github.onograph.I18N.format("io.github.onograph.dbms.serverproc.Reply.socketAddress2"),
        _serverId, _socketAddress,
        WaitingReplyMetaType.Incomplete);
  }


  public AnyValue[] asvaeAnyValue(boolean _isOs) {
    return new AnyValue[]{Values.utf8Value(this.socketAddress.toString()),
        Values.utf8Value(this.srwWaitingReplyMetaType.name()),
        Values.utf8Value(this.m),
        Values.booleanValue(_isOs)};
  }


  public String getM() {
    return this.m;
  }


  public ServerId getServerId() {
    return this.serverId;
  }


  public SocketAddress getSocketAddress() {
    return this.socketAddress;
  }


  public WaitingReplyMetaType getSrwWaitingReplyMetaType() {
    return this.srwWaitingReplyMetaType;
  }


}
