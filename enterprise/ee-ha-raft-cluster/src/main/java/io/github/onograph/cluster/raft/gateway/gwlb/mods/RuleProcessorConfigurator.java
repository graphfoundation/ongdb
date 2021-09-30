package io.github.onograph.cluster.raft.gateway.gwlb.mods;

import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessor;
import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorDefinedLengthImpl;
import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorInitiatorImpl;
import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorJoiningImpl;
import io.github.onograph.cluster.raft.gateway.gwlb.interceptors.RuleProcessorKnownImpl;
import io.github.onograph.config.NodeGroupIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RuleProcessorConfigurator {

  private RuleProcessorConfigurator() {
  }


  private static RuleProcessor<LoadBalanceServerMeta> _fitfRuleProcessor(String[] _strAArray,
      String _strNf)
      throws FilterException {

    byte _byte1 = -1;
    switch (_strNf.hashCode()) {
      case -1237460524:
        if (_strNf.equals(io.github.onograph.TokenConstants.GROUPS)) {
          _byte1 = 0;
        }
        break;
      case 96673:
        if (_strNf.equals(io.github.onograph.TokenConstants.ALL)) {
          _byte1 = 2;
        }
        break;
      case 108114:
        if (_strNf.equals(io.github.onograph.TokenConstants.MIN)) {
          _byte1 = 1;
        }
        break;
      case 3194945:
        if (_strNf.equals(io.github.onograph.TokenConstants.HALT)) {
          _byte1 = 3;
        }
    }

    switch (_byte1) {
      case 0:
        if (_strAArray.length < 1) {

          throw new FilterException("*** Error: fb34128b-3d2d-40f6-b22d-99d2e348d66d");
        } else {

          String[] _strVarArray = _strAArray;

          int _iVa = _strAArray.length;

          for (

              int _iV = 0; _iV < _iVa; ++_iV) {

            String grp = _strVarArray[_iV];
            if (grp.matches("\\W")) {

              throw new FilterException("*** Error: c827ac00-c770-45be-9015-97b9e2118b5b");
            }
          }

          return new ServerInfoRuleProcessorMatchAnyGroupImpl(
              NodeGroupIdentifier.seoSet(_strAArray));
        }
      case 1:
        if (_strAArray.length != 1) {

          throw new FilterException("*** Error: 1917ca5e-31d8-4c87-a322-7e509a4e4eca");
        } else {

          int _iCm;
          try {
            _iCm = Integer.parseInt(_strAArray[0]);
          } catch (

              NumberFormatException _numberFormatException) {

            throw new FilterException(_numberFormatException,
                "*** Error: b9ba6c20-75f0-4985-8516-092513997b02");
          }

          return new RuleProcessorDefinedLengthImpl(_iCm);
        }
      case 2:
        if (_strAArray.length != 0) {

          throw new FilterException("*** Error: f105e465-623e-43b7-8868-efab3c1adb9b");
        }

        return RuleProcessorKnownImpl.asRuleProcessorKnownImpl();
      case 3:
        if (_strAArray.length != 0) {

          throw new FilterException("*** Error: af39c699-46ee-438c-8346-70432d9e9eb6");
        }

        return RuleProcessorForceStopImpl.IT;
      default:

        throw new FilterException("*** Error: a90db32f-d8f1-4b73-add5-46f094d0d82e");
    }
  }


  public static RuleProcessor<LoadBalanceServerMeta> pasRuleProcessor(String _strFc)
      throws FilterException {
    if (_strFc.length() == 0) {

      throw new FilterException("*** Error:  827ca7fe-4c4f-4953-8ddd-5c80bd0bb4b5");
    } else {

      List<RuleProcessorJoiningImpl<LoadBalanceServerMeta>> _listRlsRuleProcessorJoiningImpl = new ArrayList();

      String[] _strSrArray = _strFc.split(";");
      if (_strSrArray.length == 0) {

        throw new FilterException("*** Error:  fbe83f06-25d5-4668-a6a3-10333daa0758");
      } else {

        boolean _isEfh = false;

        String[] _strVarArray = _strSrArray;

        int _iVar = _strSrArray.length;

        for (

            int _iVar2 = 0; _iVar2 < _iVar; ++_iVar2) {

          String _strSr = _strVarArray[_iVar2];
          _strSr = _strSr.trim();

          List<RuleProcessor<LoadBalanceServerMeta>> _listCfRuleProcessor = new ArrayList();

          String[] _strSfArray = _strSr.split("->");

          boolean _isEfa = false;

          String[] _strVr1Array = _strSfArray;

          int _iVr2 = _strSfArray.length;

          for (

              int _iVr3 = 0; _iVr3 < _iVr2; ++_iVr3) {

            String _strSf = _strVr1Array[_iVr3];
            _strSf = _strSf.trim();

            String[] _strAanArray = _strSf.split("\\(", 0);
            if (_strAanArray.length != 2) {

              throw new FilterException("*** Error: b0c41905-88ce-452e-b1e9-41bd0132b3d5");
            }

            String _strPn = _strAanArray[0].trim();

            String _strPa = _strAanArray[1].trim();
            if (!_strPa.endsWith(")")) {

              throw new FilterException("*** Error: ab4023bf-d3d3-40f4-8c2b-ba1e275ce27a");
            }

            _strPa = _strPa.substring(0, _strPa.length() - 1);

            String _strNf = _strPn.trim();
            if (!_strNf.matches("\\w+")) {

              throw new FilterException("*** Error: 2d777b55-8d32-43d7-9901-9cb6ab834db4");
            }

            String[] _strAenArray = (String[]) ((List) Arrays.stream(_strPa.split(","))
                .map(String::trim).filter((s) ->
                {
                  return !s
                      .isEmpty();
                })
                .collect(Collectors.toList())).toArray(new String[0]);

            String[] _strVr9Array = _strAenArray;

            int _iVr0 = _strAenArray.length;

            for (

                int _iVr1 = 0; _iVr1 < _iVr0; ++_iVr1) {

              String _strA = _strVr9Array[_iVr1];
              if (!_strA.matches("[\\w-]+")) {

                throw new FilterException("*** Error: 3e7cf8c3-1a22-4947-b8e9-37ae872f0321");
              }
            }

            if (_isEfh) {
              if (_listCfRuleProcessor.size() > 0) {

                throw new FilterException("*** Error: 1d2ab81d-26eb-4f5f-8511-9a630b3944cf");
              }

              throw new FilterException("*** Error: fdad4a43-e733-4b7c-b648-82610062fe2b");
            }

            RuleProcessor<LoadBalanceServerMeta> _ruleProcessorFleLoadBalanceServerMeta = _fitfRuleProcessor(
                _strAenArray, _strNf);
            if (_ruleProcessorFleLoadBalanceServerMeta == RuleProcessorForceStopImpl.IT) {
              if (_listCfRuleProcessor.size() != 0) {

                throw new FilterException("*** Error: 62a17c7d-78b5-4ad0-a50b-6d2fcbf59aab");
              }

              _isEfh = true;
            } else if (_ruleProcessorFleLoadBalanceServerMeta == RuleProcessorKnownImpl.IT) {
              if (_isEfa || _listCfRuleProcessor.size() != 0) {

                throw new FilterException("*** Error: d47a948f-e19f-4676-abcb-606a3923711d");
              }

              _isEfa = true;
            } else {
              _listCfRuleProcessor.add(_ruleProcessorFleLoadBalanceServerMeta);
            }
          }

          if (_listCfRuleProcessor.size() > 0) {
            _listRlsRuleProcessorJoiningImpl.add(
                new RuleProcessorJoiningImpl(_listCfRuleProcessor));
          }
        }

        if (!_isEfh) {
          _listRlsRuleProcessorJoiningImpl.add(
              new RuleProcessorJoiningImpl(
                  Collections.singletonList(RuleProcessorKnownImpl.asRuleProcessorKnownImpl())));
        }

        return new RuleProcessorInitiatorImpl(_listRlsRuleProcessorJoiningImpl);
      }
    }
  }
}
