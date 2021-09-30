package io.github.onograph.server.security.auth.module;

import java.util.Map;


public interface AuthenticationToken {


  char[] crdtl();


  Map<String, Object> paatsMap();


  String prnpString();
}
