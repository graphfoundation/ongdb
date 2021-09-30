package io.github.onograph.metrics.incoming.jvm;

import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;


public abstract class JVMAdapter extends AbstractMetricsLifecycleAdapter {


  static final String VM_NME_PRE = io.github.onograph.TokenConstants.VM;

  public JVMAdapter() {
    super(EnterpriseMetricsType.EMT_JVM);
  }


  static String prtfnaString(String title) {
    return title.toLowerCase().replace(' ', '_');
  }
}
