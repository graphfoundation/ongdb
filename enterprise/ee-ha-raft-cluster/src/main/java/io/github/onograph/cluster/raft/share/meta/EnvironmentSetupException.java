package io.github.onograph.cluster.raft.share.meta;

import org.neo4j.kernel.database.NamedDatabaseId;


class EnvironmentSetupException extends RuntimeException {

  EnvironmentSetupException(Exception _cueException, NamedDatabaseId _namedDatabaseId) {
    super(io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.EnvironmentSetupException.super",
            _namedDatabaseId),
        _cueException);
  }
}
