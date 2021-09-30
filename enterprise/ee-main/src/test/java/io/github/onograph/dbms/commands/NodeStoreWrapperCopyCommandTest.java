package io.github.onograph.dbms.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;

class NodeStoreWrapperCopyCommandTest {

  @Test
  void testConstructor() {

    NodeStoreWrapperCopyCommand actualNodeStoreWrapperCopyCommand = new NodeStoreWrapperCopyCommand(
        new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    actualNodeStoreWrapperCopyCommand.sepgchtcForPa(new DefaultPageCacheTracer());
  }

  @Test
  void testConstructor2() {

    new NodeStoreWrapperCopyCommand(
        new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testConstructor3() {

    new NodeStoreWrapperCopyCommand(
        new ExecutionContext(Paths.get(System.getProperty("Key"), "More"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testITypeConverterListofStringListImplConvert() {
    assertThrows(picocli.CommandLine.TypeConversionException.class,
        () -> (new NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl()).convert(
            "Val"));
    assertThrows(picocli.CommandLine.TypeConversionException.class,
        () -> (new NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl())
            .convert("*** Error: b8eae59d-2406-4eb0-86b3-ed43a02cc245"));
    assertThrows(picocli.CommandLine.TypeConversionException.class,
        () -> (new NodeStoreWrapperCopyCommand.ITypeConverterListofStringListImpl()).convert(
            "java.lang.String"));
  }

  @Test
  void testITypeConverterStringListImplConvert() {
    List<String> actualConvertResult = (new NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl()).convert(
        "Val");
    assertEquals(1, actualConvertResult.size());
    assertEquals("Val", actualConvertResult.get(0));
  }

  @Test
  void testITypeConverterStringListImplConvert2() {
    List<String> actualConvertResult = (new NodeStoreWrapperCopyCommand.ITypeConverterStringListImpl()).convert(
        "42");
    assertEquals(1, actualConvertResult.size());
    assertEquals("42", actualConvertResult.get(0));
  }

  @Test
  void testQuasList() {
    List<String> actualQuasListResult = NodeStoreWrapperCopyCommand.quasList('A', true, "Val");
    assertEquals(1, actualQuasListResult.size());
    assertEquals("Val", actualQuasListResult.get(0));
  }

  @Test
  void testQuasList2() {
    assertThrows(picocli.CommandLine.TypeConversionException.class,
        () -> NodeStoreWrapperCopyCommand.quasList('V', true, "Val"));
  }

  @Test
  void testQuasList3() {
    List<String> actualQuasListResult = NodeStoreWrapperCopyCommand.quasList('a', true, "Val");
    assertEquals(2, actualQuasListResult.size());
    assertEquals("V", actualQuasListResult.get(0));
    assertEquals("l", actualQuasListResult.get(1));
  }

  @Test
  void testQuasList4() {
    assertThrows(picocli.CommandLine.TypeConversionException.class,
        () -> NodeStoreWrapperCopyCommand.quasList('l', true, "Val"));
  }

  @Test
  void testQuasList5() {
    List<String> actualQuasListResult = NodeStoreWrapperCopyCommand.quasList('A', false, "Val");
    assertEquals(1, actualQuasListResult.size());
    assertEquals("Val", actualQuasListResult.get(0));
  }

  @Test
  void testQuasList6() {
    assertThrows(picocli.CommandLine.TypeConversionException.class,
        () -> NodeStoreWrapperCopyCommand.quasList('A', true, "`"));
  }
}

