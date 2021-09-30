package io.github.onograph.server.rest.cluster;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


class ApiReplyDTO implements ClusterRestApi {


  private final Response response;

  ApiReplyDTO(Response _response) {
    this.response = _response;
  }

  ApiReplyDTO(Status stat) {
    this(Response.status(stat).build());
  }

  @Override
  public Response avibResponse() {
    return this.response;
  }

  @Override
  public Response decpoResponse() {
    return this.response;
  }

  @Override
  public Response diceResponse() {
    return this.response;
  }

  @Override
  public Response redlResponse() {
    return this.response;
  }

  @Override
  public Response wrtlResponse() {
    return this.response;
  }
}
