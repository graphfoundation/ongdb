package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.cluster.raft.control.ApplicationComProFamily;
import io.github.onograph.cluster.raft.control.MutableComProFamily;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.neo4j.internal.helpers.collection.Pair;


public class ClientException extends Exception {

  public ClientException(String m) {
    super(m);
  }


  public ClientException(List<Pair<String, Optional<MutableComProFamily>>> _listPmnPair, String m,
      @Nullable ApplicationComProFamily _panApplicationComProFamily) {
    super(io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.control.connect.ClientException.super", m,
        _panApplicationComProFamily, _listPmnPair));
  }
}
