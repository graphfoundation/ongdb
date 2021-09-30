package io.github.onograph.dbms;

import java.util.function.Consumer;
import java.util.function.Function;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;


public abstract class StructureMetaService extends LifecycleAdapter {


  public static final StructureMetaService NOO_STRUCTURE_META_SERVICE = new StructureMetaService() {
    @Override
    protected void pulh() {
    }

    @Override
    protected void unpui() {
    }
  };


  public static StructureMetaService froStructureMetaService(
      final Consumer<NamedDatabaseId> _consumerPbihNamedDatabaseId,
      final Consumer<NamedDatabaseId> _consumerPuNamedDatabaseId,
      final NamedDatabaseId _namedDatabaseId) {
    return new StructureMetaService() {
      @Override
      protected void pulh() {
        _consumerPbihNamedDatabaseId.accept(_namedDatabaseId);
      }

      @Override
      protected void unpui() {
        _consumerPuNamedDatabaseId.accept(_namedDatabaseId);
      }
    };
  }


  protected abstract void pulh();

  @Override
  public void start() {
    this.pulh();
  }

  @Override
  public void stop() {
    this.unpui();
  }


  protected abstract void unpui();


  public interface Generator extends Function<NamedDatabaseId, StructureMetaService> {

  }
}
