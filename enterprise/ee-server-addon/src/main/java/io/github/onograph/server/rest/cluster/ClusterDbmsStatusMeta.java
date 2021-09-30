package io.github.onograph.server.rest.cluster;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.kernel.impl.factory.DbmsInfo;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.server.rest.domain.JsonHelper;


public class ClusterDbmsStatusMeta implements StreamingOutput {


  private static final String NME_PROP = io.github.onograph.TokenConstants.DATABASE_NAME;


  private static final String STS_PROP = io.github.onograph.TokenConstants.DATABASE_STATUS;


  private static final String UUI_PROP = io.github.onograph.TokenConstants.DATABASE_UUID;


  private final DatabaseManagementService databaseManagementService;

  public ClusterDbmsStatusMeta(DatabaseManagementService _databaseManagementService) {
    this.databaseManagementService = _databaseManagementService;
  }


  private static ClusterGdbStatusMeta _bucestClusterGdbStatusMeta(
      GraphDatabaseAPI _dGraphDatabaseAPI) {

    DbmsInfo _diDbmsInfo = _dGraphDatabaseAPI.dbmsInfo();
    switch (_diDbmsInfo) {
      case CORE:

        MultiGdbStatusService _scMultiGdbStatusService = new MultiGdbStatusService(
            _dGraphDatabaseAPI);
        return _scMultiGdbStatusService.curtsasClusterGdbStatusMeta();
      case READ_REPLICA:

        ClusterReadReplicaInfoService _srrClusterReadReplicaInfoService = new ClusterReadReplicaInfoService(
            _dGraphDatabaseAPI);
        return _srrClusterReadReplicaInfoService.curtsasClusterGdbStatusMeta();
      case ENTERPRISE:

        SingleGdbInfoService _ssSingleGdbInfoService = new SingleGdbInfoService(_dGraphDatabaseAPI);
        return _ssSingleGdbInfoService.curtsasClusterGdbStatusMeta();
      default:

        throw new IllegalStateException("*** Error: 6b0beb9c-868f-4527-bdac-5fd230bbf17e");
    }
  }


  private void _wrdasaForJsSt(String gdbName, JsonGenerator _jsonGenerator)
      throws IOException {
    try {

      GraphDatabaseAPI _dGraphDatabaseAPI = (GraphDatabaseAPI) this.databaseManagementService.database(
          gdbName);
      if (!_dGraphDatabaseAPI.isAvailable(0L)) {
        return;
      }

      _jsonGenerator.writeStartObject();
      _jsonGenerator.writeObjectField(io.github.onograph.TokenConstants.DATABASE_NAME, gdbName);
      _jsonGenerator.writeObjectField(io.github.onograph.TokenConstants.DATABASE_UUID,
          _dGraphDatabaseAPI.databaseId().databaseId().uuid());
      _jsonGenerator.writeObjectField(io.github.onograph.TokenConstants.DATABASE_STATUS,
          _bucestClusterGdbStatusMeta(_dGraphDatabaseAPI));
      _jsonGenerator.writeEndObject();
    } catch (

        DatabaseNotFoundException _databaseNotFoundException) {
    }
  }


  private void _wrdasasForJs(JsonGenerator _jsonGenerator) throws IOException {

    Iterator _iterator = this.databaseManagementService.listDatabases().iterator();

    while (_iterator.hasNext()) {

      String gdbName = (String) _iterator.next();
      this._wrdasaForJsSt(gdbName, _jsonGenerator);
    }
  }

  @Override
  public void write(OutputStream _outputStream) throws IOException, WebApplicationException {

    JsonGenerator _jsonGenerator = JsonHelper.newJsonGenerator(_outputStream);
    _jsonGenerator.writeStartArray();
    this._wrdasasForJs(_jsonGenerator);
    _jsonGenerator.writeEndArray();
    _jsonGenerator.flush();
  }
}
