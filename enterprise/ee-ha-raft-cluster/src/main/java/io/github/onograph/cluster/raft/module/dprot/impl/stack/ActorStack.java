package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.CoordinatedShutdown;
import akka.actor.ProviderSelection;
import akka.cluster.Cluster;
import akka.cluster.client.ClusterClientReceptionist;
import akka.cluster.ddata.DistributedData;
import akka.stream.ActorMaterializer;
import akka.stream.ActorMaterializerSettings;


public class ActorStack {


  private final ActorSystem actorSystem;


  private final CoordinatedShutdown coordinatedShutdown;


  private ActorMaterializer actorMaterializer;


  private Cluster cluster;


  private ClusterClientReceptionist clusterClientReceptionist;


  private ActorRef rpiaoActorRef;

  public ActorStack(ActorStackBuilder _fsaActorStackBuilder, ProviderSelection _providerSelection) {
    this.actorSystem = _fsaActorStackBuilder.crearseActorSystem(_providerSelection);
    this.coordinatedShutdown = CoordinatedShutdown.get(this.actorSystem);
  }


  ClusterClientReceptionist clecercoClusterClientReceptionist() {
    if (this.clusterClientReceptionist == null) {
      this.clusterClientReceptionist = ClusterClientReceptionist.get(this.actorSystem);
    }

    return this.clusterClientReceptionist;
  }


  public Cluster clsrCluster() {
    if (this.cluster == null) {
      this.cluster = Cluster.get(this.actorSystem);
    }

    return this.cluster;
  }


  public ActorSystem getActorSystem() {
    return this.actorSystem;
  }


  public CoordinatedShutdown getCoordinatedShutdown() {
    return this.coordinatedShutdown;
  }


  ActorMaterializer maeazActorMaterializer() {
    if (this.actorMaterializer == null) {

      ActorMaterializerSettings _actorMaterializerSettings =
          ActorMaterializerSettings.create(this.actorSystem)
              .withDispatcher(io.github.onograph.TokenConstants.DISCOVERY_TO_NEO4J_DISPATCHER);
      this.actorMaterializer = ActorMaterializer.create(_actorMaterializerSettings,
          this.actorSystem);
    }

    return this.actorMaterializer;
  }


  public ActorRef relarActorRef() {
    if (this.rpiaoActorRef == null) {
      this.rpiaoActorRef = DistributedData.get(this.actorSystem).replicator();
    }

    return this.rpiaoActorRef;
  }
}
