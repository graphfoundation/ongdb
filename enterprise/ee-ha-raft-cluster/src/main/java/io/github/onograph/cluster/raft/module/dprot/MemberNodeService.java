package io.github.onograph.cluster.raft.module.dprot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.neo4j.configuration.helpers.SocketAddress;


public interface MemberNodeService {


  Optional<SocketAddress> fOptional();


  default boolean isRevoevjoat() {
    return false;
  }


  boolean isUsord();


  <COLL extends Collection<REMOTE>, REMOTE> COLL reoeCollection(
      Function<SocketAddress, REMOTE> _functionVasr, Supplier<COLL> _supplierVaCOLL);


  default <REMOTE> Collection<REMOTE> reoeCollection(
      Function<SocketAddress, REMOTE> _functionTasomsr) {
    return this.reoeCollection(_functionTasomsr, ArrayList::new);
  }
}
