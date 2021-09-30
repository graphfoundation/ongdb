package io.github.onograph.cluster.raft.share.calg.mnode;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeStateMarshal;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


public class NodeServerMemberTransactionLogDataMeta extends LifecycleAdapter {


  private MemberIndexWrapper apneMemberIndexWrapper;


  private MemberIndexWrapper cmitdMemberIndexWrapper;


  private long lgOdnl;

  public NodeServerMemberTransactionLogDataMeta() {
    this(null, null, -1L);
  }


  NodeServerMemberTransactionLogDataMeta(MemberIndexWrapper _apneMemberIndexWrapper,
      MemberIndexWrapper _cmitdMemberIndexWrapper, long _lgOdnl) {
    this.apneMemberIndexWrapper = _apneMemberIndexWrapper;
    this.cmitdMemberIndexWrapper = _cmitdMemberIndexWrapper;
    this.lgOdnl = _lgOdnl;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      NodeServerMemberTransactionLogDataMeta _tNodeServerMemberTransactionLogDataMeta = (NodeServerMemberTransactionLogDataMeta) obj;
      return this.lgOdnl == _tNodeServerMemberTransactionLogDataMeta.lgOdnl &&
          Objects.equals(this.cmitdMemberIndexWrapper,
              _tNodeServerMemberTransactionLogDataMeta.cmitdMemberIndexWrapper) &&
          Objects.equals(this.apneMemberIndexWrapper,
              _tNodeServerMemberTransactionLogDataMeta.apneMemberIndexWrapper);
    } else {
      return false;
    }
  }


  Set<ConsensusNodeId> geleSet() {
    return this.apneMemberIndexWrapper != null ? this.apneMemberIndexWrapper.getMbrs()
        : (this.cmitdMemberIndexWrapper != null ? this.cmitdMemberIndexWrapper.getMbrs()
            : new HashSet());
  }


  public MemberIndexWrapper getCmitdMemberIndexWrapper() {
    return this.cmitdMemberIndexWrapper;
  }


  public long getLgOdnl() {
    return this.lgOdnl;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.cmitdMemberIndexWrapper, this.apneMemberIndexWrapper, this.lgOdnl);
  }


  public boolean isApeForSe(long lgIdx, Set<ConsensusNodeId> mbrs) {
    if (this.apneMemberIndexWrapper != null && lgIdx <= this.apneMemberIndexWrapper.getLgIdx()) {
      return false;
    } else if (this.cmitdMemberIndexWrapper != null
        && lgIdx <= this.cmitdMemberIndexWrapper.getLgIdx()) {
      return false;
    } else {
      if (this.apneMemberIndexWrapper != null &&
          (this.cmitdMemberIndexWrapper == null || this.apneMemberIndexWrapper.getLgIdx()
              > this.cmitdMemberIndexWrapper.getLgIdx())) {
        this.cmitdMemberIndexWrapper = this.apneMemberIndexWrapper;
      }

      ++this.lgOdnl;
      this.apneMemberIndexWrapper = new MemberIndexWrapper(lgIdx, mbrs);
      return true;
    }
  }


  public boolean isCom(long _lgIc) {
    if (this.apneMemberIndexWrapper != null && _lgIc >= this.apneMemberIndexWrapper.getLgIdx()) {
      ++this.lgOdnl;
      this.cmitdMemberIndexWrapper = this.apneMemberIndexWrapper;
      this.apneMemberIndexWrapper = null;
      return true;
    } else {
      return false;
    }
  }


  public boolean isTrnt(long sourceIdx) {
    if (this.cmitdMemberIndexWrapper != null
        && sourceIdx <= this.cmitdMemberIndexWrapper.getLgIdx()) {

      throw new IllegalStateException("*** Error:  cc4ffd51-71ca-422a-8ac4-03eca897f0ce");
    } else if (this.apneMemberIndexWrapper != null
        && sourceIdx <= this.apneMemberIndexWrapper.getLgIdx()) {
      ++this.lgOdnl;
      this.apneMemberIndexWrapper = null;
      return true;
    } else {
      return false;
    }
  }


  boolean isUnmdmecnil() {
    return this.apneMemberIndexWrapper != null;
  }


  public NodeServerMemberTransactionLogDataMeta neitcNodeServerMemberTransactionLogDataMeta() {
    return new NodeServerMemberTransactionLogDataMeta(this.apneMemberIndexWrapper,
        this.cmitdMemberIndexWrapper, this.lgOdnl);
  }


  public static class MarshalChannelImplCMS extends
      SafeStateMarshal<NodeServerMemberTransactionLogDataMeta> {


    public static final io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS IT =
        new io.github.onograph.cluster.raft.share.calg.mnode.NodeServerMemberTransactionLogDataMeta.MarshalChannelImplCMS();


    MemberIndexWrapper.SafeStateMarshalImpl enrmahSafeStateMarshalImpl;

    private MarshalChannelImplCMS() {
      this.enrmahSafeStateMarshalImpl = MemberIndexWrapper.SafeStateMarshalImpl.IT;
    }

    @Override
    public void marshal(
        NodeServerMemberTransactionLogDataMeta _saeNodeServerMemberTransactionLogDataMeta,
        WritableChannel _writableChannel)
        throws IOException {
      _writableChannel.putLong(_saeNodeServerMemberTransactionLogDataMeta.lgOdnl);
      this.enrmahSafeStateMarshalImpl.marshal(
          _saeNodeServerMemberTransactionLogDataMeta.cmitdMemberIndexWrapper, _writableChannel);
      this.enrmahSafeStateMarshalImpl.marshal(
          _saeNodeServerMemberTransactionLogDataMeta.apneMemberIndexWrapper, _writableChannel);
    }

    @Override
    public long ordinal(
        NodeServerMemberTransactionLogDataMeta _saeNodeServerMemberTransactionLogDataMeta) {
      return _saeNodeServerMemberTransactionLogDataMeta.lgOdnl;
    }

    @Override
    public NodeServerMemberTransactionLogDataMeta startState() {
      return new NodeServerMemberTransactionLogDataMeta();
    }

    @Override
    public NodeServerMemberTransactionLogDataMeta unmarshal0(ReadableChannel _readableChannel)
        throws IOException, EndOfStreamException {

      long _lgOdnl = _readableChannel.getLong();

      MemberIndexWrapper _cmitdMemberIndexWrapper = this.enrmahSafeStateMarshalImpl.unmarshal(
          _readableChannel);

      MemberIndexWrapper _apneMemberIndexWrapper = this.enrmahSafeStateMarshalImpl.unmarshal(
          _readableChannel);
      return new NodeServerMemberTransactionLogDataMeta(_apneMemberIndexWrapper,
          _cmitdMemberIndexWrapper, _lgOdnl);
    }


  }
}
