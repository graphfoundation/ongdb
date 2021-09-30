package io.github.onograph.fabric.service;

import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.stream.StatementResult;
import org.neo4j.values.virtual.MapValue;
import reactor.core.publisher.Mono;


public interface FabricTx {


  Mono<RemoteBookmark> comMono();


  Mono<Void> rolcMono();


  StatementResult runStatementResult(MapValue _mapValue, String _strVa);
}
