package io.github.onograph.cluster.raft.control;

import org.junit.jupiter.api.Test;

class MutatingProComClientManagerTest {

  @Test
  void testJdkZlibDecoderServerConstructor() {

    new MutatingProComClientManager.JdkZlibDecoderServer();
  }

  @Test
  void testJdkZlibEncoderClientConstructor() {

    new MutatingProComClientManager.JdkZlibEncoderClient();
  }

  @Test
  void testLz4ChecksumFrameDecoderServerConstructor() {

    new MutatingProComClientManager.Lz4ChecksumFrameDecoderServer();
  }

  @Test
  void testLz4FrameDecoderServerConstructor() {

    new MutatingProComClientManager.Lz4FrameDecoderServer();
  }

  @Test
  void testLz4FrameEncoderClientConstructor() {

    new MutatingProComClientManager.Lz4FrameEncoderClient();
  }

  @Test
  void testLz4FrameEncoderHighCompressionClientConstructor() {

    new MutatingProComClientManager.Lz4FrameEncoderHighCompressionClient();
  }

  @Test
  void testSnappyFrameDecoderServerConstructor() {

    new MutatingProComClientManager.SnappyFrameDecoderServer();
  }

  @Test
  void testSnappyFrameDecoderValidateChecksumsServerConstructor() {

    new MutatingProComClientManager.SnappyFrameDecoderValidateChecksumsServer();
  }

  @Test
  void testSnappyFrameEncoderClientConstructor() {

    new MutatingProComClientManager.SnappyFrameEncoderClient();
  }
}

