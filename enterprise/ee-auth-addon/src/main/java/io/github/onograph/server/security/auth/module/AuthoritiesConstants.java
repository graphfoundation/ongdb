package io.github.onograph.server.security.auth.module;

import java.util.List;


public final class AuthoritiesConstants {


  public static final String ADI = "admin";


  public static final String ARHE = "architect";


  public static final String EDT = "editor";


  public static final String PUL = io.github.onograph.TokenConstants.PUBLIC;


  public static final String PULH = "publisher";


  public static final String RNME = "reader";


  public static final List<String> listRoeString =
      List.of(io.github.onograph.TokenConstants.ADMIN, io.github.onograph.TokenConstants.ARCHITECT,
          io.github.onograph.TokenConstants.PUBLISHER, io.github.onograph.TokenConstants.EDITOR,
          io.github.onograph.TokenConstants.READER, io.github.onograph.TokenConstants.PUBLIC);

  private AuthoritiesConstants() {
  }
}
