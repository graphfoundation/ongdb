package io.github.onograph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class I18NTest {

  @Test
  void testBuildMessageMap() {

    I18N.buildMessageMap();
  }

  @Test
  void testFormat() {
    assertEquals("", I18N.format("Key"));
    assertEquals("MISSING VAL FOR KEY:Key", I18N.format("Key", "Args"));
  }

  @Test
  void testGetMessageMap() {
    Map<String, String> actualMessageMap = I18N.getMessageMap();
    assertEquals(493, actualMessageMap.size());
    assertEquals("Discovery system", actualMessageMap
        .get(
            "io.github.onograph.cluster.raft.module.dprot.impl.DefaultClusterStructureService.rettForStCa"));
    assertEquals(".{}", actualMessageMap
        .get(
            "io.github.onograph.metrics.outgoing.CsvScheduledReporter.crawtRotatingLogFileWriter"));
    assertEquals("ACCESS on database '%s' is not allowed.", actualMessageMap
        .get(
            "io.github.onograph.server.security.auth.EnterpriseLoginContextServiceDefaultImpl.format2"));
    assertEquals("{{}} {}",
        actualMessageMap
            .get(
                "io.github.onograph.server.security.auth.module.AuthorizingRealmPluginImpl.AuthApiProcImpl"
                    + ".authorizingRealmPluginName"));
    assertEquals(
        "Store copy failed due to store version mismatch. Could not find any upstream server with compatible"
            + " store id among %s",
        actualMessageMap.get(
            "io.github.onograph.cluster.raft.module.cuprot.scmeta.CatchupRemoteClusteredGdbManager.format"));
    assertEquals(", scheme '{}' is not supported.",
        actualMessageMap.get(
            "io.github.onograph.server.security.auth.LocalAuthManager.invalidToken2"));
    assertEquals("{} *",
        actualMessageMap.get(
            "io.github.onograph.server.security.auth.ElementEntitlementDTO.fospString2"));
    assertEquals(": {}",
        actualMessageMap.get(
            "io.github.onograph.server.security.auth.LocalAuthManager.invalidToken3"));
    assertEquals("{}:{}", actualMessageMap
        .get("io.github.onograph.cluster.raft.module.dprot.impl.stack.ClusterGatekeeperActor.add"));
    assertEquals("Unable to restart %s successfully after %s attempts",
        actualMessageMap.get(
            "io.github.onograph.cluster.raft.module.dprot.impl.AkkaActorSystemRetry.format"));
    assertEquals("{} Negotiated protocols: {}",
        actualMessageMap.get(
            "io.github.onograph.cluster.raft.control.connect.ServerException.super"));
  }
}

