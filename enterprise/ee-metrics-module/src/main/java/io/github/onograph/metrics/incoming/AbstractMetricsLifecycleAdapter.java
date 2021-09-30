package io.github.onograph.metrics.incoming;

import org.neo4j.annotations.service.Service;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


@Service
public abstract class AbstractMetricsLifecycleAdapter extends LifecycleAdapter {


  private final EnterpriseMetricsType grp;

  public AbstractMetricsLifecycleAdapter(EnterpriseMetricsType grp) {
    this.grp = grp;
  }


  public EnterpriseMetricsType getGrp() {
    return this.grp;
  }


  public String moydmdmineString(String _strMti) {
    return _strMti;
  }

  @Override
  public abstract void start();

  @Override
  public abstract void stop();
}
