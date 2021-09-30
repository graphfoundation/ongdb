package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.configuration.Config;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.time.SystemNanoClock;

class NodeStoreWrapperTest {

  @Test
  void testCoytForDaSt() throws Exception {
    Config config = mock(Config.class);
    when(config.get(any()))
        .thenThrow(new UncheckedIOException(new IOException("An error occurred")));
    DatabaseLayout _frDatabaseLayout = mock(DatabaseLayout.class);
    ArrayList<String> _listDnwlString = new ArrayList<String>();
    ArrayList<String> _listLsString = new ArrayList<String>();
    ArrayList<String> _listLwnokString = new ArrayList<String>();
    ArrayList<TokenNamePropertyDTO> _listPnokTokenNamePropertyDTO = new ArrayList<TokenNamePropertyDTO>();
    ArrayList<TokenNamePropertyDTO> _listPnsTokenNamePropertyDTO = new ArrayList<TokenNamePropertyDTO>();
    ArrayList<TokenNamePropertyDTO> _listProkTokenNamePropertyDTO = new ArrayList<TokenNamePropertyDTO>();
    ArrayList<TokenNamePropertyDTO> _listPrsTokenNamePropertyDTO = new ArrayList<TokenNamePropertyDTO>();
    ArrayList<String> _listPsString = new ArrayList<String>();
    ArrayList<String> _listSrString = new ArrayList<String>();
    PrintStream _oPrintStream = new PrintStream(new ByteArrayOutputStream(3));
    assertThrows(UncheckedIOException.class,
        () -> (new NodeStoreWrapper(config, _frDatabaseLayout,
            NodeStoreWrapper.StoreFormatType.SFT_MATCHING, true,
            _listDnwlString, _listLsString, _listLwnokString, _listPnokTokenNamePropertyDTO,
            _listPnsTokenNamePropertyDTO, _listProkTokenNamePropertyDTO,
            _listPrsTokenNamePropertyDTO, _listPsString,
            _listSrString, _oPrintStream, new DefaultPageCacheTracer(),
            mock(SystemNanoClock.class)))
            .coytForDaSt(" str Mcpf", mock(DatabaseLayout.class)));
    verify(config).get(any());
  }
}

