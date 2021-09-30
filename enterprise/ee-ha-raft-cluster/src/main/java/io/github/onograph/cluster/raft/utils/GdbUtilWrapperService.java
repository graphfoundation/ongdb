package io.github.onograph.cluster.raft.utils;

import java.nio.file.Path;
import org.neo4j.configuration.Config;


public interface GdbUtilWrapperService {


  GdbUtilWrapper sttrdasGdbUtilWrapper(Config _config, boolean _isVar, Path _varPath);
}
