package io.github.onograph.fabric.security;

import io.github.onograph.kernel.api.security.DefaultLoginContext;
import org.neo4j.driver.AuthToken;


public interface AuthTokenService {


  AuthToken crdtlfoForDe(DefaultLoginContext _defaultLoginContext);
}
