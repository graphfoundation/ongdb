package io.github.onograph.fabric.service;

import java.util.Optional;
import org.neo4j.driver.Bookmark;
import org.neo4j.driver.exceptions.ClientException;
import org.neo4j.driver.exceptions.Neo4jException;
import org.neo4j.driver.exceptions.TransientException;
import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.executor.FabricException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.api.exceptions.Status.Code;
import org.neo4j.kernel.api.exceptions.Status.Statement;


public class FabricDriverUtilities {


  private static FabricException _geirofiFabricException(Neo4jException _edNeo4jException) {
    return new FabricException(Statement.RemoteExecutionFailed,
        "*** Error: a011dcf9-5332-4fb1-b1ea-99c189851451", _edNeo4jException);
  }


  static RemoteBookmark corbkRemoteBookmark(Bookmark _bookmark) {
    if (_bookmark == null) {
      return null;
    } else if (_bookmark.values().size() != 1) {

      throw new IllegalArgumentException("*** Error:  ce747692-9c0e-48cf-8452-8b4bb80bfb32");
    } else {

      String _strBs = _bookmark.values().stream().findAny().get();
      return new RemoteBookmark(_strBs);
    }
  }


  static FabricException trnaeoFabricException(Neo4jException _edNeo4jException) {
    if (!(_edNeo4jException instanceof ClientException)
        && !(_edNeo4jException instanceof TransientException)) {
      return _geirofiFabricException(_edNeo4jException);
    } else {

      Optional<Status> _optionalCsStatus = Code.all().stream().filter((code) ->
      {
        return code.code().serialize().equals(_edNeo4jException.code());
      }).findAny();
      return _optionalCsStatus.isEmpty() ? _geirofiFabricException(_edNeo4jException)
          : new FabricException(_optionalCsStatus.get(), _edNeo4jException.getMessage(),
              _edNeo4jException);
    }
  }
}
