package io.github.onograph.fabric.service;

import org.neo4j.fabric.bookmark.RemoteBookmark;
import org.neo4j.fabric.stream.StatementResult;
import reactor.core.publisher.Mono;


public interface BookmarkableStatementResult extends StatementResult {


  Mono<RemoteBookmark> gebkrMono();
}
