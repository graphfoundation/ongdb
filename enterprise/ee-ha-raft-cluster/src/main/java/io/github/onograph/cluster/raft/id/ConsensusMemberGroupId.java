package io.github.onograph.cluster.raft.id;

import java.io.IOException;
import java.util.UUID;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeStateMarshal;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.util.Id;


public final class ConsensusMemberGroupId extends Id {

  public ConsensusMemberGroupId(UUID _uUID) {
    super(_uUID);
  }


  public static ConsensusMemberGroupId froConsensusMemberGroupId(DatabaseId _databaseId) {
    return new ConsensusMemberGroupId(_databaseId.uuid());
  }


  public static DatabaseId todabeiDatabaseId(ConsensusMemberGroupId consensusMemberGroupId) {
    return DatabaseIdFactory.from(consensusMemberGroupId.uuid());
  }


  public static class SafeStateMarshalImpl extends SafeStateMarshal<ConsensusMemberGroupId> {


    public static final SafeStateMarshalImpl IT = new SafeStateMarshalImpl();


    private static final UUID NIL_U_U_I_D = new UUID(0L, 0L);

    private SafeStateMarshalImpl() {
    }

    @Override
    public void marshal(ConsensusMemberGroupId consensusMemberGroupId,
        WritableChannel _writableChannel)
        throws IOException {

      UUID _uUID = consensusMemberGroupId == null ? NIL_U_U_I_D : consensusMemberGroupId.uuid();
      _writableChannel.putLong(_uUID.getMostSignificantBits());
      _writableChannel.putLong(_uUID.getLeastSignificantBits());
    }

    @Override
    public long ordinal(ConsensusMemberGroupId consensusMemberGroupId) {
      return consensusMemberGroupId == null ? 0L : 1L;
    }

    @Override
    public ConsensusMemberGroupId startState() {
      return null;
    }

    @Override
    public ConsensusMemberGroupId unmarshal0(ReadableChannel _readableChannel) throws IOException {

      long _lgMsb = _readableChannel.getLong();

      long _lgBsl = _readableChannel.getLong();

      UUID _uUID = new UUID(_lgMsb, _lgBsl);
      return _uUID.equals(NIL_U_U_I_D) ? null : new ConsensusMemberGroupId(_uUID);
    }


  }
}
