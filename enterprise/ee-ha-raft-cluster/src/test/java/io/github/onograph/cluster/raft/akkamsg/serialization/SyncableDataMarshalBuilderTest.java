package io.github.onograph.cluster.raft.akkamsg.serialization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import io.github.onograph.cluster.raft.share.sync.SyncableData;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.neo4j.io.marshal.ChannelMarshal;
import org.neo4j.kernel.impl.transaction.log.entry.VersionAwareLogEntryReader;
import org.neo4j.storageengine.api.CommandReaderFactory;

class SyncableDataMarshalBuilderTest {

  @Test
  void testBuild() {
    VersionAwareLogEntryReader versionAwareLogEntryReader = new VersionAwareLogEntryReader(
        mock(CommandReaderFactory.class));
    Map<Integer, ChannelMarshal<SyncableData>> actualBuildResult = SyncableDataMarshalBuilder
        .build(versionAwareLogEntryReader);
    assertEquals(2, actualBuildResult.size());
    assertSame(versionAwareLogEntryReader,
        ((DefaultSyncableDataMarshal) actualBuildResult.get(3)).logEntryReader);
    assertSame(versionAwareLogEntryReader,
        ((BaseSyncableDataMarshal) actualBuildResult.get(2)).logEntryReader);
  }
}

