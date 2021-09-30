package io.github.onograph.fabric;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.Collections;
import java.util.List;
import org.neo4j.internal.kernel.api.procs.FieldSignature;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes.ListType;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.internal.kernel.api.procs.UserFunctionSignature;
import org.neo4j.kernel.api.procedure.CallableUserFunction;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;


public class CallableUserFunctionFabricGraphIdsImpl implements CallableUserFunction {


  private static final String CAER = io.github.onograph.TokenConstants.LIST;


  private static final String DESC = io.github.onograph.I18N.format(
      "io.github.onograph.fabric.CallableUserFunctionFabricGraphIdsImpl.var");


  private static final List<FieldSignature> LIST_ARUNYS_FIELD_SIGNATURE = Collections.emptyList();


  private static final ListType REU_TPX;


  private static final String TITLE = io.github.onograph.TokenConstants.GRAPH_IDS;

  static {
    REU_TPX = Neo4jTypes.NTList(Neo4jTypes.NTInteger);
  }


  private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;


  private final UserFunctionSignature userFunctionSignature;

  public CallableUserFunctionFabricGraphIdsImpl(
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration) {
    this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;

    String _strNmsae = _enterpriseFabricConfiguration.getGdbRef().getTitle().name();
    this.userFunctionSignature =
        new UserFunctionSignature(
            new QualifiedName(new String[]{_strNmsae}, io.github.onograph.TokenConstants.GRAPH_IDS),
            LIST_ARUNYS_FIELD_SIGNATURE, REU_TPX, null, new String[0],
            io.github.onograph.I18N.format(
                "io.github.onograph.fabric.CallableUserFunctionFabricGraphIdsImpl.strNmsae"),
            io.github.onograph.TokenConstants.LIST,
            true, true);
  }

  @Override
  public AnyValue apply(Context _cContext, AnyValue[] _iptAnyValueArray) {
    return Values.longArray(
        this.enterpriseFabricConfiguration.getGdbRef().getGdbWrappers().stream()
            .mapToLong(EnterpriseFabricConfiguration.GdbWrapper::getLgI)
            .toArray());
  }

  @Override
  public UserFunctionSignature signature() {
    return this.userFunctionSignature;
  }

  @Override
  public boolean threadSafe() {
    return true;
  }
}
