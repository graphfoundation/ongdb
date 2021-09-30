package io.github.onograph.fabric.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.neo4j.driver.Bookmark;
import org.neo4j.driver.exceptions.ClientException;
import org.neo4j.driver.exceptions.TransientException;
import org.neo4j.fabric.executor.FabricException;
import org.neo4j.kernel.api.exceptions.Status;

class FabricDriverUtilitiesTest {

  @Test
  void testCorbkRemoteBookmark() {
    assertNull(FabricDriverUtilities.corbkRemoteBookmark(null));
  }

  @Test
  void testCorbkRemoteBookmark2() {
    Bookmark bookmark = mock(Bookmark.class);
    when(bookmark.values()).thenReturn(new HashSet<String>());
    assertThrows(IllegalArgumentException.class,
        () -> FabricDriverUtilities.corbkRemoteBookmark(bookmark));
    verify(bookmark).values();
  }

  @Test
  void testCorbkRemoteBookmark3() {
    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("*** Error:  ce747692-9c0e-48cf-8452-8b4bb80bfb32");
    Bookmark bookmark = mock(Bookmark.class);
    when(bookmark.values()).thenReturn(stringSet);
    assertEquals("*** Error:  ce747692-9c0e-48cf-8452-8b4bb80bfb32",
        FabricDriverUtilities.corbkRemoteBookmark(bookmark).getSerialisedState());
    verify(bookmark, atLeast(1)).values();
  }

  @Test
  void testCorbkRemoteBookmark4() {
    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("foo");
    stringSet.add(null);
    Bookmark bookmark = mock(Bookmark.class);
    when(bookmark.values()).thenReturn(stringSet);
    assertThrows(IllegalArgumentException.class,
        () -> FabricDriverUtilities.corbkRemoteBookmark(bookmark));
    verify(bookmark).values();
  }

  @Test
  void testTrnaeoFabricException() {
    FabricException actualTrnaeoFabricExceptionResult = FabricDriverUtilities
        .trnaeoFabricException(new ClientException("An error occurred"));
    assertTrue(actualTrnaeoFabricExceptionResult.status() instanceof Status.Statement);
    assertNull(actualTrnaeoFabricExceptionResult.query());
  }

  @Test
  void testTrnaeoFabricException2() {
    FabricException actualTrnaeoFabricExceptionResult = FabricDriverUtilities
        .trnaeoFabricException(new TransientException("Code", "An error occurred"));
    assertTrue(actualTrnaeoFabricExceptionResult.status() instanceof Status.Statement);
    assertNull(actualTrnaeoFabricExceptionResult.query());
  }

  @Test
  void testTrnaeoFabricException3() {
    FabricException actualTrnaeoFabricExceptionResult = FabricDriverUtilities.trnaeoFabricException(
        null);
    assertTrue(actualTrnaeoFabricExceptionResult.status() instanceof Status.Statement);
    assertNull(actualTrnaeoFabricExceptionResult.query());
  }

  @Test
  void testTrnaeoFabricException4() {
    FabricException actualTrnaeoFabricExceptionResult = FabricDriverUtilities.trnaeoFabricException(
        new TransientException("Neo.DatabaseError.Fabric.RemoteExecutionFailed",
            "An error occurred"));
    assertTrue(actualTrnaeoFabricExceptionResult.status() instanceof Status.Fabric);
    assertNull(actualTrnaeoFabricExceptionResult.query());
  }
}

