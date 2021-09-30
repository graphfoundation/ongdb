package io.github.onograph.cluster.raft.control.connect;

import io.netty.util.AttributeKey;
import java.util.concurrent.CompletableFuture;


public class ProComAttributeKey {


  public static final AttributeKey<CompletableFuture<ComProFamilyWrapper>> ATTRIBUTE_KEY_PRTOTK_COMPLETABLE_FUTURE =
      AttributeKey.valueOf(io.github.onograph.TokenConstants.PROTOCOL_STACK);
}
