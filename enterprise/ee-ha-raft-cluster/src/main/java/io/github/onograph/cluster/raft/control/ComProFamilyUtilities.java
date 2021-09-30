package io.github.onograph.cluster.raft.control;


public class ComProFamilyUtilities {


  public static boolean isCurrentSupported(
      ApplicationComProFamilyType _paApplicationComProFamilyType) {
    return !_paApplicationComProFamilyType.isEq(ApplicationComProFamilyType.RC);
  }
}
