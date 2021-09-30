package io.github.onograph.procedure.builtin;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.neo4j.common.DependencyResolver;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;
import org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo;
import org.neo4j.procedure.builtin.IndexProcedures;


public class Procedures {


  @Context
  public DependencyResolver dependencyResolver;


  @Context
  public KernelTransaction kernelTransaction;


  private IndexProviderDescriptor _geidpordrrIndexProviderDescriptor(String _strNp) {
    return this.dependencyResolver.resolveDependency(IndexingService.class)
        .indexProviderByName(_strNp);
  }


  private IndexProcedures _inpdIndexProcedures() {
    return new IndexProcedures(this.kernelTransaction,
        this.dependencyResolver.resolveDependency(IndexingService.class));
  }


  @Deprecated(
      since = io.github.onograph.TokenConstants.PROCEDURES___DEPRECATED__SINCE,
      forRemoval = true
  )
  @Description(io.github.onograph.TokenConstants.PROCEDURES___DESCRIPTION)
  @Procedure(
      name = io.github.onograph.TokenConstants.PROCEDURES___PROCEDURE__NAME,
      mode = Mode.SCHEMA,
      deprecatedBy = io.github.onograph.TokenConstants.PROCEDURES___PROCEDURE__DEPRECATED_BY
  )
  public Stream<SchemaIndexInfo> cranekyStream(
      @Name(io.github.onograph.TokenConstants.PROCEDURES___NAME___STR_NC) String _strNc,
      @Name(io.github.onograph.TokenConstants.PROCEDURES___NAME___LIST_LBL_STRING) List<String> _listLblString,
      @Name(io.github.onograph.TokenConstants.PROCEDURES___NAME___LIST_POETE_STRING) List<String> _listPoeteString,
      @Name(io.github.onograph.TokenConstants.PROCEDURES___NAME___STR_PN) String _strPn,
      @Name(value = io.github.onograph.TokenConstants.PROCEDURES___NAME___MAP_CNISO__VALUE, defaultValue = io.github.onograph.TokenConstants.PROCEDURES___NAME___MAP_CNISO__DEFAULT_VALUE) Map<String, Object> _mapCniso)
      throws ProcedureException {

    IndexProcedures _indexProcedures = this._inpdIndexProcedures();

    IndexProviderDescriptor _indexProviderDescriptor = this._geidpordrrIndexProviderDescriptor(
        _strPn);
    return _indexProcedures.createNodeKey(_strNc, _listLblString, _listPoeteString,
        _indexProviderDescriptor, _mapCniso);
  }
}
