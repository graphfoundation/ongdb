package io.github.onograph.cluster.raft.module.cuprot.scmeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.ToLongFunction;
import org.junit.jupiter.api.Test;
import org.neo4j.graphdb.Entity;
import org.neo4j.internal.kernel.api.Cursor;
import org.neo4j.internal.kernel.api.NodeValueIndexCursor;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.impl.coreapi.internal.CursorEntityFactory;
import org.neo4j.kernel.impl.coreapi.internal.CursorIterator;

class StoreSyncResourceServiceTest {

  @Test
  void testConstructor() {
    NodeValueIndexCursor.Empty cursor = new NodeValueIndexCursor.Empty();
    ToLongFunction<Cursor> toReferenceFunction = (ToLongFunction<Cursor>) mock(
        ToLongFunction.class);
    CursorEntityFactory<Cursor, Entity> entityFactory = (CursorEntityFactory<Cursor, Entity>) mock(
        CursorEntityFactory.class);
    CursorIterator cursorIterator = new CursorIterator(cursor, toReferenceFunction, entityFactory,
        new ResourceTracker.EmptyResourceTracker());

    Path[] pathArray = new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")};
    Path[] prPathArray = (new StoreSyncResourceService(cursorIterator, pathArray)).getPrPathArray();
    assertEquals(3, prPathArray.length);
    assertNull(cursorIterator.getNextObject());
    assertFalse(cursorIterator.hasNext());
    assertTrue(cursorIterator.hasFetchedNext());
    assertSame(prPathArray, pathArray);
  }

  @Test
  void testConstructor2() {
    NodeValueIndexCursor.Empty cursor = new NodeValueIndexCursor.Empty();
    ToLongFunction<Cursor> toReferenceFunction = (ToLongFunction<Cursor>) mock(
        ToLongFunction.class);
    CursorEntityFactory<Cursor, Entity> entityFactory = (CursorEntityFactory<Cursor, Entity>) mock(
        CursorEntityFactory.class);
    Path[] pathArray = new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")};
    StoreSyncResourceService actualStoreSyncResourceService = new StoreSyncResourceService(
        new CursorIterator(cursor, toReferenceFunction, entityFactory,
            new ResourceTracker.EmptyResourceTracker()),
        pathArray);
    actualStoreSyncResourceService.close();
    assertSame(actualStoreSyncResourceService.getPrPathArray(), pathArray);
  }

  @Test
  void testClose() {

    NodeValueIndexCursor.Empty cursor = new NodeValueIndexCursor.Empty();
    ToLongFunction<Cursor> toReferenceFunction = (ToLongFunction<Cursor>) mock(
        ToLongFunction.class);
    CursorEntityFactory<Cursor, Entity> entityFactory = (CursorEntityFactory<Cursor, Entity>) mock(
        CursorEntityFactory.class);
    (new StoreSyncResourceService(
        new CursorIterator(cursor, toReferenceFunction, entityFactory,
            new ResourceTracker.EmptyResourceTracker()),
        new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")})).close();
  }

  @Test
  void testGeaofnoStream() {

    NodeValueIndexCursor.Empty cursor = new NodeValueIndexCursor.Empty();
    ToLongFunction<Cursor> toReferenceFunction = (ToLongFunction<Cursor>) mock(
        ToLongFunction.class);
    CursorEntityFactory<Cursor, Entity> entityFactory = (CursorEntityFactory<Cursor, Entity>) mock(
        CursorEntityFactory.class);
    (new StoreSyncResourceService(
        new CursorIterator(cursor, toReferenceFunction, entityFactory,
            new ResourceTracker.EmptyResourceTracker()),
        new Path[]{Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")})).geaofnoStream();
  }
}

