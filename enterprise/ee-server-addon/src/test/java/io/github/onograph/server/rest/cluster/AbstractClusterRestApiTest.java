package io.github.onograph.server.rest.cluster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.jupiter.api.Test;

class AbstractClusterRestApiTest {

  @Test
  void testNeirseResponse() {
    Response actualNeirseResponseResult = AbstractClusterRestApi.neirseResponse();
    assertEquals(
        "OutboundJaxrsResponse{status=404, reason=Not Found, hasEntity=true, closed=false, buffered=false}",
        actualNeirseResponseResult.toString());
    assertEquals(1, actualNeirseResponseResult.getStringHeaders().size());
    assertEquals(404, actualNeirseResponseResult.getStatus());
    String expectedString = Boolean.FALSE.toString();
    assertEquals(expectedString, actualNeirseResponseResult.getEntity());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualNeirseResponseResult).getContext();
    assertNull(context.getLanguage());
    assertTrue(
        context.getEntityStream() instanceof org.glassfish.jersey.message.internal.CommittingOutputStream);
    Type expectedEntityClass = context.getEntityType();
    assertSame(expectedEntityClass, context.getEntityClass());
    assertEquals(0, context.getEntityAnnotations().length);
    assertNull(context.getConfiguration());
    assertFalse(context.isCommitted());
    Map<String, NewCookie> expectedRequestCookies = actualNeirseResponseResult.getCookies();
    assertSame(expectedRequestCookies, context.getRequestCookies());
    assertTrue(context.hasEntity());
    MediaType expectedMediaType = actualNeirseResponseResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  void testPoirseResponse() {
    Response actualPoirseResponseResult = AbstractClusterRestApi.poirseResponse();
    assertEquals(
        "OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}",
        actualPoirseResponseResult.toString());
    assertEquals(1, actualPoirseResponseResult.getStringHeaders().size());
    assertEquals(200, actualPoirseResponseResult.getStatus());
    String expectedString = Boolean.TRUE.toString();
    assertEquals(expectedString, actualPoirseResponseResult.getEntity());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualPoirseResponseResult).getContext();
    assertNull(context.getLanguage());
    assertTrue(
        context.getEntityStream() instanceof org.glassfish.jersey.message.internal.CommittingOutputStream);
    Type expectedEntityClass = context.getEntityType();
    assertSame(expectedEntityClass, context.getEntityClass());
    assertEquals(0, context.getEntityAnnotations().length);
    assertNull(context.getConfiguration());
    assertFalse(context.isCommitted());
    Map<String, NewCookie> expectedRequestCookies = actualPoirseResponseResult.getCookies();
    assertSame(expectedRequestCookies, context.getRequestCookies());
    assertTrue(context.hasEntity());
    MediaType expectedMediaType = actualPoirseResponseResult.getMediaType();
    assertSame(expectedMediaType, context.getMediaType());
  }

  @Test
  void testSttrpsResponse() {
    ArrayList<ConsensusNodeId> _collectionMvConsensusNodeId = new ArrayList<ConsensusNodeId>();
    UUID _imUUID = UUID.randomUUID();
    Response actualSttrpsResponseResult = AbstractClusterRestApi.sttrpsResponse(
        new ClusterGdbStatusMeta(
            _collectionMvConsensusNodeId, _imUUID, true, true, true, true, UUID.randomUUID(), 1L,
            null, 10.0));
    assertEquals(
        "OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}",
        actualSttrpsResponseResult.toString());
    assertEquals(1, actualSttrpsResponseResult.getStringHeaders().size());
    assertEquals(200, actualSttrpsResponseResult.getStatus());
    MediaType mediaType = actualSttrpsResponseResult.getMediaType();
    assertEquals("application", mediaType.getType());
    assertEquals("json", mediaType.getSubtype());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualSttrpsResponseResult).getContext();
    assertNull(context.getLanguage());
    assertTrue(
        context.getEntityStream() instanceof org.glassfish.jersey.message.internal.CommittingOutputStream);
    Type expectedEntityClass = context.getEntityType();
    assertSame(expectedEntityClass, context.getEntityClass());
    assertEquals(0, context.getEntityAnnotations().length);
    assertNull(context.getConfiguration());
    assertFalse(context.isCommitted());
    Map<String, NewCookie> expectedRequestCookies = actualSttrpsResponseResult.getCookies();
    assertSame(expectedRequestCookies, context.getRequestCookies());
    assertTrue(context.hasEntity());
    assertSame(mediaType, context.getMediaType());
  }

  @Test
  void testSttrpsResponse2() {
    ArrayList<ConsensusNodeId> consensusNodeIdList = new ArrayList<ConsensusNodeId>();
    consensusNodeIdList.add(new ConsensusNodeId(UUID.randomUUID()));
    UUID _imUUID = UUID.randomUUID();
    Response actualSttrpsResponseResult = AbstractClusterRestApi.sttrpsResponse(
        new ClusterGdbStatusMeta(
            consensusNodeIdList, _imUUID, true, true, true, true, UUID.randomUUID(), 1L, null,
            10.0));
    assertEquals(
        "OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}",
        actualSttrpsResponseResult.toString());
    assertEquals(1, actualSttrpsResponseResult.getStringHeaders().size());
    assertEquals(200, actualSttrpsResponseResult.getStatus());
    MediaType mediaType = actualSttrpsResponseResult.getMediaType();
    assertEquals("application", mediaType.getType());
    assertEquals("json", mediaType.getSubtype());
    OutboundMessageContext context = ((OutboundJaxrsResponse) actualSttrpsResponseResult).getContext();
    assertNull(context.getLanguage());
    assertTrue(
        context.getEntityStream() instanceof org.glassfish.jersey.message.internal.CommittingOutputStream);
    Type expectedEntityClass = context.getEntityType();
    assertSame(expectedEntityClass, context.getEntityClass());
    assertEquals(0, context.getEntityAnnotations().length);
    assertNull(context.getConfiguration());
    assertFalse(context.isCommitted());
    Map<String, NewCookie> expectedRequestCookies = actualSttrpsResponseResult.getCookies();
    assertSame(expectedRequestCookies, context.getRequestCookies());
    assertTrue(context.hasEntity());
    assertSame(mediaType, context.getMediaType());
  }
}

