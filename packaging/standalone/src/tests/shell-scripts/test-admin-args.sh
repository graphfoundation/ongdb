#!/usr/bin/env bash

test_description="Test ongdb-admin argument handling"

. ./lib/sharness.sh
fake_install

test_expect_success "should delegate help to the Java tool" "
  ongdb-home/bin/ongdb-admin help &&
  test_expect_java_arg 'org.neo4j.commandline.admin.AdminTool'
"

test_expect_success "should delegate missing commands to the Java tool" "
  ongdb-home/bin/ongdb-admin &&
  test_expect_java_arg 'org.neo4j.commandline.admin.AdminTool'
"

test_expect_success "should delegate unknown commands to the Java tool" "
  ongdb-home/bin/ongdb-admin unknown &&
  test_expect_java_arg 'org.neo4j.commandline.admin.AdminTool'
"

test_expect_success "should specify heap size when given" "
  HEAP_SIZE=666m ongdb-home/bin/ongdb-admin backup &&
  test_expect_java_arg '-Xmx666m'
"

test_done
