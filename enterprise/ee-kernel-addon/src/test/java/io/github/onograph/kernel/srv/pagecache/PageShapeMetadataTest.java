package io.github.onograph.kernel.srv.pagecache;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class PageShapeMetadataTest {

  @Test
  void testDemrecnForPa() {

    PageShapeMetadata pageShapeMetadata = new PageShapeMetadata();
    pageShapeMetadata
        .demrecnForPa(new PageShape[]{
            PageShape.fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))});
  }

  @Test
  void testInmrecnForPa() {

    PageShapeMetadata pageShapeMetadata = new PageShapeMetadata();
    pageShapeMetadata
        .inmrecnForPa(new PageShape[]{
            PageShape.fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))});
  }

  @Test
  void testIsCotnForPa() {
    PageShapeMetadata pageShapeMetadata = new PageShapeMetadata();
    assertFalse(pageShapeMetadata.isCotnForPa(
        PageShape.fPageShape(Paths.get(System.getProperty("java.io.tmpdir"), ""),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }
}

