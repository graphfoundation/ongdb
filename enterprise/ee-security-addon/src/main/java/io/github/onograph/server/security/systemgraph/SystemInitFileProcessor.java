package io.github.onograph.server.security.systemgraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Result.ResultRow;
import org.neo4j.graphdb.Result.ResultVisitor;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.AbstractSecurityLog;


public class SystemInitFileProcessor {


  private final AbstractSecurityLog abstractSecurityLog;


  private final Config config;


  public SystemInitFileProcessor(AbstractSecurityLog _abstractSecurityLog, Config _config) {
    this.abstractSecurityLog = _abstractSecurityLog;
    this.config = _config;
  }


  private static boolean _isComdiviForSt(String _strCmad) {
    return !_strCmad.matches("^\\s*.*//") && _strCmad.replaceAll("\n", " ").matches("^\\s*\\w+.*");
  }


  private void _doctscyiiaForTr(Transaction _tTransaction) throws IOException {

    Path _piPath = this.config.get(GraphDatabaseInternalSettings.system_init_file);

    BufferedReader RNME = Files.newBufferedReader(_piPath);

    String[] _strCmadArray;
    try {
      _strCmadArray = RNME.lines().filter((line) ->
      {
        return !line.matches("^\\s*//");
      }).collect(Collectors.joining("\n")).split(";\\s*\n");
    } catch (

        Throwable _throwable) {
      if (RNME != null) {
        try {
          RNME.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (RNME != null) {
      RNME.close();
    }

    String[] _strVr1Array = _strCmadArray;

    int _iVar = _strCmadArray.length;

    for (

        int _iVa = 0; _iVa < _iVar; ++_iVa) {

      String _strCmad = _strVr1Array[_iVa];
      if (_isComdiviForSt(_strCmad)) {

        Result _result = _tTransaction.execute(_strCmad);
        _result.accept(new ResultVisitorDefaultImpl(_result.columns()));
        _result.close();
      } else {

      }
    }
  }


  public void intleForTr(Transaction _tTransaction) throws IOException {
    if (this.config.isExplicitlySet(GraphDatabaseInternalSettings.system_init_file)) {
      this._doctscyiiaForTr(_tTransaction);
    }
  }


  private class ResultVisitorDefaultImpl implements ResultVisitor<RuntimeException> {


    private final List<String> listClmsString;

    private ResultVisitorDefaultImpl(List<String> _listClmsString) {
      this.listClmsString = _listClmsString;
    }

    @Override
    public boolean visit(ResultRow _resultRow) {

      StringBuilder _sStringBuilder = new StringBuilder();

      String _strClm;
      for (

          Iterator _iterator = this.listClmsString.iterator(); _iterator.hasNext();
          _sStringBuilder.append(_strClm).append(":").append(_resultRow.get(_strClm).toString())) {
        _strClm = (String) _iterator.next();
        if (_sStringBuilder.length() > 0) {
          _sStringBuilder.append(", ");
        }
      }

      return true;
    }
  }
}
