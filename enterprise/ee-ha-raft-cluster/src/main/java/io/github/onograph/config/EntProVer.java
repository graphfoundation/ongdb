package io.github.onograph.config;

import io.netty.buffer.ByteBuf;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.neo4j.annotations.api.PublicApi;
import org.neo4j.util.Preconditions;


@PublicApi
public class EntProVer implements Comparable<EntProVer> {


  private final int iMjr;


  private final int iMnr;

  private final int iPtch;

  public EntProVer(int _iMjr, int _iMnr) {
    this.iMjr = Preconditions.requireNonNegative(_iMjr);
    this.iMnr = Preconditions.requireNonNegative(_iMnr);
    this.iPtch = 0;
  }

  public EntProVer(int _iMjr, int _iMnr, int _iPtch) {
    this.iMjr = Preconditions.requireNonNegative(_iMjr);
    this.iMnr = Preconditions.requireNonNegative(_iMnr);
    this.iPtch = Preconditions.requireNonNegative(_iPtch);
  }


  private static RuntimeException _ilasivlRuntimeException(String val) {
    return new IllegalArgumentException("*** Error: 6b3bc487-e8e0-4aa2-b6d9-b170b9c65c30");
  }


  public static EntProVer deoEntProVer(ByteBuf _byteBuf) {
    return new EntProVer(_byteBuf.readInt(), _byteBuf.readInt());
  }


  public static EntProVer pasEntProVer(String val) {
    if (val == null || StringUtils.isBlank(val)) {

      throw new IllegalArgumentException("*** Error: 0f1727aa-e1eb-417f-b753-944a8abf59e0");
    }

    String[] _strSltArray = val.split("\\.");
    if (_strSltArray.length < 2) {

      throw new IllegalArgumentException("*** Error: 9007ff7a-ea55-4f7d-a51e-b1aa0249e2fd");
    } else {
      try {

        int _iMjr = Integer.parseInt(_strSltArray[0]);

        int _iMnr = Integer.parseInt(_strSltArray[1]);

        int _iPtch = (_strSltArray.length == 3) ? Integer.parseInt(_strSltArray[2]) : 0;

        return new EntProVer(_iMjr, _iMnr, _iPtch);
      } catch (

          NumberFormatException _numberFormatException) {

        throw new IllegalArgumentException("*** Error: a1c5a262-9f94-4fd5-9e4f-40531cdec809");
      }
    }
  }

  @Override
  public int compareTo(EntProVer _ohrEntProVer) {

    int _iMc = Integer.compare(this.iMjr, _ohrEntProVer.iMjr);
    return _iMc == 0 ? Integer.compare(this.iMnr, _ohrEntProVer.iMnr) : _iMc;
  }


  public void enoForBy(ByteBuf _byteBuf) {
    _byteBuf.writeInt(this.iMjr);
    _byteBuf.writeInt(this.iMnr);
    // Add Patch
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      EntProVer _thaEntProVer = (EntProVer) obj;
      return this.iMjr == _thaEntProVer.iMjr && this.iMnr == _thaEntProVer.iMnr
          && this.iPtch == _thaEntProVer.iPtch;
    } else {
      return false;
    }
  }


  public int getIMjr() {
    return this.iMjr;
  }


  public int getIMnr() {
    return this.iMnr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.iMjr, this.iMnr, this.iPtch);
  }

  @Override
  public String toString() {
    return io.github.onograph.I18N.format("io.github.onograph.config.EntProVer.toString", this.iMjr,
        this.iMnr, this.iPtch);
  }
}
