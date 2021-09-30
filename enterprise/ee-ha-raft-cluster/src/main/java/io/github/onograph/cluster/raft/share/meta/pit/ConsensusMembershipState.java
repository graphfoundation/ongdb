package io.github.onograph.cluster.raft.share.meta.pit;

import io.github.onograph.cluster.raft.share.calg.mnode.MemberIndexWrapper;
import java.io.IOException;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;


public class ConsensusMembershipState {


  private final MemberIndexWrapper cmitdMemberIndexWrapper;

  public ConsensusMembershipState(MemberIndexWrapper _cmitdMemberIndexWrapper) {
    this.cmitdMemberIndexWrapper = _cmitdMemberIndexWrapper;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ConsensusMembershipState _tConsensusMembershipState = (ConsensusMembershipState) obj;
      return Objects.equals(this.cmitdMemberIndexWrapper,
          _tConsensusMembershipState.cmitdMemberIndexWrapper);
    } else {
      return false;
    }
  }


  public MemberIndexWrapper getCmitdMemberIndexWrapper() {
    return this.cmitdMemberIndexWrapper;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.cmitdMemberIndexWrapper);
  }


  public static class SafeStateMarshalImpl extends SafeStateMarshal<ConsensusMembershipState> {


    public static final SafeStateMarshalImpl IT = new SafeStateMarshalImpl();


    private static final MemberIndexWrapper.SafeStateMarshalImpl MBX_MASL;

    static {
      MBX_MASL = MemberIndexWrapper.SafeStateMarshalImpl.IT;
    }

    private SafeStateMarshalImpl() {
    }

    @Override
    public void marshal(ConsensusMembershipState consensusMembershipState,
        WritableChannel _writableChannel)
        throws IOException {
      MBX_MASL.marshal(consensusMembershipState.getCmitdMemberIndexWrapper(), _writableChannel);
    }

    @Override
    public long ordinal(ConsensusMembershipState consensusMembershipState) {
      return 0L;
    }

    @Override
    public ConsensusMembershipState startState() {
      return null;
    }

    @Override
    protected ConsensusMembershipState unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {
      return new ConsensusMembershipState(MBX_MASL.unmarshal(_readableChannel));
    }


  }
}
