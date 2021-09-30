package io.github.onograph.server.rest.cluster;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.ws.rs.core.Response;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.jupiter.api.Test;

class ApiReplyDTOTest {

  @Test
  void testConstructor() {

    new ApiReplyDTO(new OutboundJaxrsResponse(null, new OutboundMessageContext()));
  }

  @Test
  void testConstructor2() {

    new ApiReplyDTO(Response.Status.OK);
  }

  @Test
  void testAvibResponse() {
    assertTrue((new ApiReplyDTO(Response.Status.OK))
        .avibResponse() instanceof org.glassfish.jersey.message.internal.OutboundJaxrsResponse);
  }

  @Test
  void testDecpoResponse() {
    assertTrue((new ApiReplyDTO(Response.Status.OK))
        .decpoResponse() instanceof org.glassfish.jersey.message.internal.OutboundJaxrsResponse);
  }

  @Test
  void testDiceResponse() {
    assertTrue((new ApiReplyDTO(Response.Status.OK))
        .diceResponse() instanceof org.glassfish.jersey.message.internal.OutboundJaxrsResponse);
  }

  @Test
  void testRedlResponse() {
    assertTrue((new ApiReplyDTO(Response.Status.OK))
        .redlResponse() instanceof org.glassfish.jersey.message.internal.OutboundJaxrsResponse);
  }

  @Test
  void testWrtlResponse() {
    assertTrue((new ApiReplyDTO(Response.Status.OK))
        .wrtlResponse() instanceof org.glassfish.jersey.message.internal.OutboundJaxrsResponse);
  }
}

