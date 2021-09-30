package io.github.onograph.cluster.raft.control;

import io.github.onograph.config.EntProVer;


public interface ApplicationComProFamily extends ComProFamily<EntProVer> {

  default boolean isEq(ApplicationComProFamily _apApplicationComProFamily) {
    if (!this.caerString().equals(_apApplicationComProFamily.caerString())) {

      throw new IllegalArgumentException("*** Error:  13180ee2-37a5-4584-9bbe-ade94ff01ee8");
    } else {
      return this.getImpl().compareTo(_apApplicationComProFamily.getImpl()) == 0;
    }
  }


  default boolean isLesoeaForAp(ApplicationComProFamily _apApplicationComProFamily) {
    if (!this.caerString().equals(_apApplicationComProFamily.caerString())) {

      throw new IllegalArgumentException("*** Error:  984a42ab-4f10-4d29-99fe-fb7944f0a1f9");
    } else {
      return this.getImpl().compareTo(_apApplicationComProFamily.getImpl()) <= 0;
    }
  }
}
