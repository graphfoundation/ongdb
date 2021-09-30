package io.github.onograph.server.security.auth.module;

import java.nio.file.Path;
import java.time.Clock;
import java.util.Optional;


public interface AuthApi {


  Clock clcClock();


  Logger logAuthApiLogger();


  @Deprecated(
      since = io.github.onograph.TokenConstants.AUTH_API___DEPRECATED__SINCE,
      forRemoval = true
  )
  Optional<Path> nejcngflOptional();


  Path nejhmPath();


  String nejvroString();


  void seatiochend(boolean _isVar);


  void seatznciea(boolean _isVar);


  interface Logger {


    void deuForSt(String _strVar);


    void eroForSt(String _strVa);


    void infForSt(String _strVa);


    boolean isDegeae();


    void warForSt(String _strVa);
  }
}
