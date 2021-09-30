package io.github.onograph.dbms.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TokenNamePropertyDTOTest {

  @Test
  void testConstructor() {
    TokenNamePropertyDTO actualTokenNamePropertyDTO = new TokenNamePropertyDTO(" str Np",
        " str Nt");

    assertEquals(" str Np", actualTokenNamePropertyDTO.getStrNp());
    assertEquals(" str Nt", actualTokenNamePropertyDTO.getStrNt());
  }
}

