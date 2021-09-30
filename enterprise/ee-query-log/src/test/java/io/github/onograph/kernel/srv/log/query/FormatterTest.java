package io.github.onograph.kernel.srv.log.query;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.OptionalLong;
import org.junit.jupiter.api.Test;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.values.AnyValueWriter;

class FormatterTest {

  @Test
  void testFommForStMa() {

    HashMap<String, Object> _mapPrmso = new HashMap<String, Object>(1);
    Formatter.fommForStMa(_mapPrmso, new StringBuilder("Str"));
  }

  @Test
  void testFommForStMa2() {

    Formatter.fommForStMa(null, new StringBuilder("Str"));
  }

  @Test
  void testFommForStMa3() {

    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("", "Value");
    Formatter.fommForStMa(stringObjectMap, new StringBuilder("Str"));
  }

  @Test
  void testFommForStMa4() {

    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("", 42);
    Formatter.fommForStMa(stringObjectMap, new StringBuilder("Str"));
  }

  @Test
  void testFommForStMa5() {

    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("", null);
    Formatter.fommForStMa(stringObjectMap, new StringBuilder("Str"));
  }

  @Test
  void testFommForStMa6() {

    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>(1);
    stringObjectMap.put("", new HashMap<Object, Object>(1));
    Formatter.fommForStMa(stringObjectMap, new StringBuilder("Str"));
  }

  @Test
  void testFommvuForStMaAn() {

    Formatter.fommvuForStMaAn(AnyValueWriter.EntityMode.REFERENCE, 1, null,
        new StringBuilder("Str"));
  }

  @Test
  void testFotacbForStQu() {
    QuerySnapshot querySnapshot = mock(QuerySnapshot.class);
    when(querySnapshot.allocatedBytes()).thenReturn(1L);
    Formatter.fotacbForStQu(querySnapshot, new StringBuilder("Str"));
    verify(querySnapshot).allocatedBytes();
  }

  @Test
  void testFotacbForStQu2() {
    QuerySnapshot querySnapshot = mock(QuerySnapshot.class);
    when(querySnapshot.allocatedBytes()).thenReturn(0L);
    Formatter.fotacbForStQu(querySnapshot, new StringBuilder("Str"));
    verify(querySnapshot).allocatedBytes();
  }

  @Test
  void testFotacbForStQu3() {
    QuerySnapshot querySnapshot = mock(QuerySnapshot.class);
    when(querySnapshot.allocatedBytes()).thenReturn(0L);

    StringBuilder stringBuilder = new StringBuilder("Str");
    stringBuilder.deleteCharAt(1);
    Formatter.fotacbForStQu(querySnapshot, stringBuilder);
    verify(querySnapshot).allocatedBytes();
  }

  @Test
  void testFotditiForStQu() {
    QuerySnapshot querySnapshot = mock(QuerySnapshot.class);
    when(querySnapshot.waitTimeMicros()).thenReturn(1L);
    when(querySnapshot.cpuTimeMicros()).thenReturn(OptionalLong.of(42L));
    when(querySnapshot.compilationTimeMicros()).thenReturn(1L);
    Formatter.fotditiForStQu(querySnapshot, new StringBuilder("Str"));
    verify(querySnapshot).compilationTimeMicros();
    verify(querySnapshot).cpuTimeMicros();
    verify(querySnapshot).waitTimeMicros();
  }

  @Test
  void testFotpdlForStQu() {
    QuerySnapshot querySnapshot = mock(QuerySnapshot.class);
    when(querySnapshot.pageFaults()).thenReturn(1L);
    when(querySnapshot.pageHits()).thenReturn(1L);
    Formatter.fotpdlForStQu(querySnapshot, new StringBuilder("Str"));
    verify(querySnapshot).pageFaults();
    verify(querySnapshot).pageHits();
  }
}

