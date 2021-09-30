package io.github.onograph.config;

import org.junit.jupiter.api.Test;

class SecurityConfigValidatorTest {

  @Test
  void testNoetSettingConstraint() {

    SecurityConfigValidator.noetSettingConstraint();
  }

  @Test
  void testNoetliSettingConstraint() {

    SecurityConfigValidator.noetliSettingConstraint();
  }

  @Test
  void testVaagompSettingConstraint() {

    SecurityConfigValidator.vaagompSettingConstraint();
  }

  @Test
  void testVaauetpSettingConstraint() {

    SecurityConfigValidator.vaauetpSettingConstraint();
  }
}

