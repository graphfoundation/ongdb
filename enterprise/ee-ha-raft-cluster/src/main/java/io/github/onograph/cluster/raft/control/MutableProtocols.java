package io.github.onograph.cluster.raft.control;

import java.util.Optional;


public enum MutableProtocols implements MutableComProFamily {


  COM_TYPE_GZIP(MutatingComProFamilyGroupType.TYPE_COMP, io.github.onograph.TokenConstants.GZIP),

  COM_TYPE_SNAPPY(MutatingComProFamilyGroupType.TYPE_COMP,
      io.github.onograph.TokenConstants.SNAPPY),

  COM_TYPE__SNAPPY_VAL(MutatingComProFamilyGroupType.TYPE_COMP,
      io.github.onograph.TokenConstants.SNAPPY_VALIDATING),

  COM_TYPE_LZ4(MutatingComProFamilyGroupType.TYPE_COMP, io.github.onograph.TokenConstants.LZ4),

  COM_TYPE_LZ4_HC(MutatingComProFamilyGroupType.TYPE_COMP,
      io.github.onograph.TokenConstants.L_Z4_HIGH_COMPRESSION),

  COM_TYPE_LZ4_VAL(MutatingComProFamilyGroupType.TYPE_COMP,
      io.github.onograph.TokenConstants.L_Z_VALIDATING),

  COM_TYPE_LZ4_HC_COM_VAL(MutatingComProFamilyGroupType.TYPE_COMP,
      io.github.onograph.TokenConstants.L_Z4_HIGH_COMPRESSION_VALIDATING);


  public static final String POSSIBLES = io.github.onograph.I18N.format(
      "io.github.onograph.cluster.raft.control.MutableProtocols.var");


  private final String displayVal;


  private final MutatingComProFamilyGroupType mutatingComProFamilyGroupType;

  MutableProtocols(MutatingComProFamilyGroupType _ietfeMutatingComProFamilyGroupType,
      String _strNf) {
    this.displayVal = _strNf;
    this.mutatingComProFamilyGroupType = _ietfeMutatingComProFamilyGroupType;
  }


  public static Optional<MutableComProFamily> finOptional(
      MutatingComProFamilyGroupType _ctgrMutatingComProFamilyGroupType, String _strNf) {
    return ComProFamily.finOptional(_ctgrMutatingComProFamilyGroupType, String::toLowerCase, _strNf,
        values());
  }

  @Override
  public String caerString() {
    return this.mutatingComProFamilyGroupType.lowerName();
  }

  @Override
  public String getImpl() {
    return this.displayVal;
  }


  private static class MutableProtocolAvailableTypes {


    static final String GZIP = "Gzip";


    static final String LZ4 = "LZ4";


    static final String LZ4_HIGH_COMPRESSION = "LZ4_high_compression";


    static final String LZ4_HIGH_COMPRESSION_VALIDATING = "LZ4_high_compression_validating";


    static final String LZ_VALIDATING = "LZ_validating";


    static final String SNAPPY = "Snappy";


    static final String SNAPPY_VALIDATING = "Snappy_validating";
  }
}
