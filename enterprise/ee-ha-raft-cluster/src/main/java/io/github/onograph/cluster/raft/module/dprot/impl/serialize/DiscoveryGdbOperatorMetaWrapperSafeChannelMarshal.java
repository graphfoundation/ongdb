package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import io.github.onograph.cluster.raft.akkamsg.serialization.BasicBoolSerializationHandler;
import io.github.onograph.cluster.raft.akkamsg.serialization.BasicStringSerializationHandler;
import io.github.onograph.cluster.raft.module.dprot.impl.gdb.DiscoveryGdbOperatorMetaWrapper;
import io.github.onograph.dbms.ClusterDatabaseManagementException;
import io.github.onograph.dbms.OperatorStateEnterpriseTypeImpl;
import java.io.IOException;
import java.util.Optional;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.SafeChannelMarshal;
import org.neo4j.kernel.database.DatabaseId;


public class DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal extends
    SafeChannelMarshal<DiscoveryGdbOperatorMetaWrapper> {


  public static final DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal IT = new DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal();

  private DiscoveryGdbOperatorMetaWrapperSafeChannelMarshal() {
  }


  private OperatorStateEnterpriseTypeImpl _geoerseOperatorStateEnterpriseTypeImpl(int _iOdnl) {

    OperatorStateEnterpriseTypeImpl[] _soOperatorStateEnterpriseTypeImplArray = OperatorStateEnterpriseTypeImpl.values();
    return _iOdnl >= 0 && _iOdnl < _soOperatorStateEnterpriseTypeImplArray.length
        ? _soOperatorStateEnterpriseTypeImplArray[_iOdnl]
        : OperatorStateEnterpriseTypeImpl.SETI_NOT_DEFINED;
  }

  @Override
  public void marshal(DiscoveryGdbOperatorMetaWrapper _sdDiscoveryGdbOperatorMetaWrapper,
      WritableChannel _writableChannel)
      throws IOException {
    DatabaseIdOnlySafeChannelMarshal.IT.marshal(_sdDiscoveryGdbOperatorMetaWrapper.getDatabaseId(),
        _writableChannel);
    _writableChannel.putInt(_sdDiscoveryGdbOperatorMetaWrapper.getOperatorState().ordinal());
    BasicBoolSerializationHandler.maslForWr(_sdDiscoveryGdbOperatorMetaWrapper.isHafl(),
        _writableChannel);

    Optional<Throwable> _optionalFiueThrowable = _sdDiscoveryGdbOperatorMetaWrapper.faleOptional();
    if (_optionalFiueThrowable.isPresent()) {
      BasicStringSerializationHandler.maslForBySt(_optionalFiueThrowable.get().getMessage(),
          _writableChannel);
    }
  }

  @Override
  protected DiscoveryGdbOperatorMetaWrapper unmarshal0(ReadableChannel _readableChannel)
      throws IOException, EndOfStreamException {

    DatabaseId _databaseId = DatabaseIdOnlySafeChannelMarshal.IT.unmarshal(_readableChannel);

    OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl = this._geoerseOperatorStateEnterpriseTypeImpl(
        _readableChannel.getInt());

    boolean _isHf = BasicBoolSerializationHandler.isUnahForRe(_readableChannel);

    ClusterDatabaseManagementException _fiueClusterDatabaseManagementException;
    if (_isHf) {

      String _strMf = BasicStringSerializationHandler.unahString(_readableChannel);
      _fiueClusterDatabaseManagementException = new ClusterDatabaseManagementException(
          "*** Error: de3dc215-afcb-481d-8d5f-657e62a42968");
    } else {
      _fiueClusterDatabaseManagementException = null;
    }

    return new DiscoveryGdbOperatorMetaWrapper(_databaseId, _fiueClusterDatabaseManagementException,
        _operatorStateEnterpriseTypeImpl);
  }
}
