package io.github.onograph.server.rest.cluster;

import javax.ws.rs.core.Response;


interface ClusterRestApi {


  Response avibResponse();


  Response decpoResponse();


  Response diceResponse();


  Response redlResponse();


  Response wrtlResponse();
}
