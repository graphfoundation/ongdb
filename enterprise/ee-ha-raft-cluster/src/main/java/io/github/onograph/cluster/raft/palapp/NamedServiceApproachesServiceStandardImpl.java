package io.github.onograph.cluster.raft.palapp;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.neo4j.logging.NullLogProvider;


public class NamedServiceApproachesServiceStandardImpl extends NamedServiceApproachesService {

  public NamedServiceApproachesServiceStandardImpl() {
    super(null, null, NullLogProvider.getInstance(), null);
  }

  @Override
  public Iterator<AbstractNamedServiceClusterApproach> iterator() {
    return new Iterator<AbstractNamedServiceClusterApproach>() {
      @Override
      public boolean hasNext() {
        return false;
      }

      @Override
      public AbstractNamedServiceClusterApproach next() {
        throw new NoSuchElementException();
      }
    };
  }
}
