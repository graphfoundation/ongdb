package io.github.onograph.cluster.raft.watch;

import io.github.onograph.cluster.raft.module.dprot.ClusterStructureService;
import org.neo4j.internal.diagnostics.DiagnosticsLogger;
import org.neo4j.internal.diagnostics.DiagnosticsProvider;
import org.neo4j.internal.helpers.Strings;


public class DiagnosticsProviderClusterStructureImpl implements DiagnosticsProvider {


  private final ClusterStructureService clusterStructureService;

  public DiagnosticsProviderClusterStructureImpl(ClusterStructureService clusterStructureService) {
    this.clusterStructureService = clusterStructureService;
  }


  private static String _nepdlieString() {
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.watch.DiagnosticsProviderClusterStructureImpl.nepdlieString",
        System.lineSeparator());
  }

  @Override
  public void dump(DiagnosticsLogger _diagnosticsLogger) {
    _diagnosticsLogger.log(
        String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.watch.DiagnosticsProviderClusterStructureImpl.format"),
            _nepdlieString(),
            Strings.printMap(this.clusterStructureService.alcesrrMap(), _nepdlieString())));
    _diagnosticsLogger.log(String.format(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.watch.DiagnosticsProviderClusterStructureImpl.format2"),
        _nepdlieString(),
        Strings.printMap(this.clusterStructureService.alrarlMap(), _nepdlieString())));
  }

  @Override
  public String getDiagnosticsName() {
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.watch.DiagnosticsProviderClusterStructureImpl.getDiagnosticsName");
  }
}
