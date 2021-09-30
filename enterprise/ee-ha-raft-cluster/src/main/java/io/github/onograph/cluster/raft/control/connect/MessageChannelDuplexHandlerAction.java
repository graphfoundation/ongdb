package io.github.onograph.cluster.raft.control.connect;

import java.util.Objects;


public class MessageChannelDuplexHandlerAction {


  private static final MessageChannelDuplexHandlerAction FALE_MESSAGE_CHANNEL_DUPLEX_HANDLER_ACTION = new MessageChannelDuplexHandlerAction(
      false);


  private static final MessageChannelDuplexHandlerAction SUCS_MESSAGE_CHANNEL_DUPLEX_HANDLER_ACTION = new MessageChannelDuplexHandlerAction(
      true);


  private final boolean isSi;

  private MessageChannelDuplexHandlerAction(boolean _isSi) {
    this.isSi = _isSi;
  }


  public static MessageChannelDuplexHandlerAction gefleMessageChannelDuplexHandlerAction() {
    return FALE_MESSAGE_CHANNEL_DUPLEX_HANDLER_ACTION;
  }


  public static MessageChannelDuplexHandlerAction gescsMessageChannelDuplexHandlerAction() {
    return SUCS_MESSAGE_CHANNEL_DUPLEX_HANDLER_ACTION;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      MessageChannelDuplexHandlerAction _thMessageChannelDuplexHandlerAction = (MessageChannelDuplexHandlerAction) obj;
      return this.isSi == _thMessageChannelDuplexHandlerAction.isSi;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.isSi);
  }
}
