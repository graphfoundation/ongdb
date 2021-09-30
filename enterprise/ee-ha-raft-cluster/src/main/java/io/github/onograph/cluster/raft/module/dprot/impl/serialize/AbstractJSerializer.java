package io.github.onograph.cluster.raft.module.dprot.impl.serialize;

import akka.remote.MessageSerializer.SerializationException;
import akka.serialization.JSerializer;
import io.github.onograph.cluster.raft.akkamsg.serialization.ReadableChannelDataInputStreamImpl;
import io.github.onograph.cluster.raft.akkamsg.serialization.WritableChecksumChannelDataOutputStreamImpl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.io.marshal.EndOfStreamException;


public abstract class AbstractJSerializer<T> extends JSerializer {


  static final int CND_SVX_DTINF_FOR_MB_UID = 1003;


  static final int CND_TOOG = 1007;


  static final int CONS_MB_UID = 1005;


  static final int CONS_UID = 1001;


  static final int COPD_CONS_MAPG = 1016;


  static final int COPD_GDB_STAX = 1013;


  static final int COPD_LED_DTINF = 1011;


  static final int DB_LED_DTINF = 1010;


  static final int GDB_STAX = 1015;


  static final int GDB_SVX = 1014;


  static final int GDB_UID = 1012;


  static final int LED_DTINF = 1000;


  static final int RDX_RELA_DTINF = 1006;


  static final int RDX_RELA_DTINF_FOR_MB_UID = 1004;


  static final int RDX_RELA_REOL = 1008;


  static final int RDX_RELA_TOOG = 1009;


  static final int UNQARS = 1002;


  private final ChannelMarshal<T> channelMarshalMrhlT;


  private final int iHs;


  private final int iI;


  protected AbstractJSerializer(ChannelMarshal<T> _channelMarshalMrhlT, int _iHs, int _iI) {
    this.channelMarshalMrhlT = _channelMarshalMrhlT;
    this.iHs = _iHs;
    this.iI = _iI;
  }

  @Override
  public Object fromBinaryJava(byte[] btCnt, Class<?> _classMnfsObject) {

    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(btCnt);

    ReadableChannelDataInputStreamImpl _readableChannelDataInputStreamImpl = new ReadableChannelDataInputStreamImpl(
        _byteArrayInputStream);

    try {
      return this.channelMarshalMrhlT.unmarshal(_readableChannelDataInputStreamImpl);
    } catch (

        EndOfStreamException | IOException _exception) {

      throw new SerializationException("*** Error:  42c5bd7f-3ac8-48ea-8a23-c7719f28fefe",
          _exception);
    }
  }


  int getIHs() {
    return this.iHs;
  }

  @Override
  public int identifier() {
    return this.iI;
  }

  @Override
  public boolean includeManifest() {
    return false;
  }

  @Override
  public byte[] toBinary(Object obj) {

    ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream(this.iHs);

    WritableChecksumChannelDataOutputStreamImpl _writableChecksumChannelDataOutputStreamImpl =
        new WritableChecksumChannelDataOutputStreamImpl(_byteArrayOutputStream);

    try {
      this.channelMarshalMrhlT.marshal((T) obj, _writableChecksumChannelDataOutputStreamImpl);
    } catch (

        IOException _iOException) {

      throw new SerializationException("*** Error:  80e5be5e-dc77-43fc-8138-f9352bf34a6d",
          _iOException);
    }

    return _byteArrayOutputStream.toByteArray();
  }
}
