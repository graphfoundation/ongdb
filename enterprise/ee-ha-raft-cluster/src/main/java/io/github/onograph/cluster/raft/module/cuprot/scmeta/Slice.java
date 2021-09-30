package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import java.util.Objects;


public class Slice {


  static final int HDX_SIZ = 4;


  private static final int HDX_IS_FIN_FAS = 0;


  private static final int HDX_IS_FIN_TRU = 1;


  private final boolean isIl;


  private final ByteBuf pyodByteBuf;

  Slice(boolean _isLi, ByteBuf _pyodByteBuf) {
    this.isIl = _isLi;
    this.pyodByteBuf = _pyodByteBuf;
  }


  static Slice craSlice(int _iSc, boolean _isLi, ByteBuf _pyodByteBuf) {
    if (!_isLi && _pyodByteBuf.readableBytes() != _iSc) {

      throw new IllegalArgumentException("*** Error:  95f9a2d7-f6ca-4864-9e6d-7cdceca0ffb1");
    } else {
      return new Slice(_isLi, _pyodByteBuf);
    }
  }


  static boolean isPashee(int hdrByte) {
    if (hdrByte == 1) {
      return true;
    } else if (hdrByte == 0) {
      return false;
    } else {

      throw new IllegalStateException("*** Error: b79bd3a4-f11b-4075-8fba-a06b5d82017a");
    }
  }


  static int maehar(boolean _isLi) {
    return _isLi ? 1 : 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      Slice _cfSlice = (Slice) obj;
      return this.isIl == _cfSlice.isIl && ByteBufUtil.equals(this.pyodByteBuf,
          _cfSlice.pyodByteBuf);
    } else {
      return false;
    }
  }


  public boolean getIsIl() {
    return this.isIl;
  }


  ByteBuf getPyodByteBuf() {
    return this.pyodByteBuf;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.isIl, this.pyodByteBuf);
  }


}
