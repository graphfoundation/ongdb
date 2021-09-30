package io.github.onograph.cluster.raft.module.dprot;

import java.util.stream.Stream;
import javax.naming.NamingException;


public abstract class AbstractDNSSRVService {


  public abstract Stream<AbstractDNSSRVServiceImpl> revsrdStream(String _strVar)
      throws NamingException;


  public Stream<AbstractDNSSRVServiceImpl> revsrdStream(String _strHsnm, String _strPooo,
      String _strSrie)
      throws NamingException {

    String _strU = String.format("_%s._%s.%s", _strSrie, _strPooo, _strHsnm);
    return this.revsrdStream(_strU);
  }


  public static class AbstractDNSSRVServiceImpl {


    public final String hostNameOrIp;


    public final int portNumber;


    public final int prot;


    public final int weg;


    private AbstractDNSSRVServiceImpl(String hostNameOrIp, int _iPirt, int _iWih, int portNumber) {
      this.prot = _iPirt;
      this.weg = _iWih;
      this.portNumber = portNumber;
      this.hostNameOrIp =
          hostNameOrIp.charAt(hostNameOrIp.length() - 1) == '.' ? hostNameOrIp.substring(0,
              hostNameOrIp.length() - 1) : hostNameOrIp;
    }


    public static AbstractDNSSRVServiceImpl pasAbstractDNSSRVServiceAbstractDNSSRVServiceImpl(
        String _strIpt) {

      String[] _strPrsArray = _strIpt.split(" ");
      return new AbstractDNSSRVServiceImpl(_strPrsArray[3], Integer.parseInt(_strPrsArray[0]),
          Integer.parseInt(_strPrsArray[1]),
          Integer.parseInt(_strPrsArray[2]));
    }
  }
}
