#!/usr/bin/env bash

test_description="Test ongdb-admin argument handling"

. ./lib/sharness.sh
fake_install

test_expect_success "should delegate help to the Java tool" "
  ongdb-home/bin/ongdb-admin help &&
  test_expect_java_arg 'org.neo4j.cli.AdminTool'
"

test_expect_success "should delegate missing commands to the Java tool" "
  ongdb-home/bin/ongdb-admin &&
  test_expect_java_arg 'org.neo4j.cli.AdminTool'
"

test_expect_success "should delegate unknown commands to the Java tool" "
  ongdb-home/bin/ongdb-admin unknown &&
  test_expect_java_arg 'org.neo4j.cli.AdminTool'
"

test_expect_success "should specify heap size when given" "
  HEAP_SIZE=666m ongdb-home/bin/ongdb-admin backup &&
  test_expect_java_arg '-Xmx666m'
"

test_expect_success "should let higher heap size env var override memory setting when both given" "
  clear_config &&
  set_config 'dbms.memory.heap.initial_size' '111m' ongdb.conf &&
  set_config 'dbms.memory.heap.max_size' '222m' ongdb.conf &&
  HEAP_SIZE=666m ongdb-home/bin/ongdb-admin backup &&
  test_expect_java_arg '-Xmx666m'
  test_expect_java_arg '-Xms666m'
"

test_expect_success "should let lower heap size env var override memory setting when both given" "
  clear_config &&
  set_config 'dbms.memory.heap.initial_size' '666m' ongdb.conf &&
  set_config 'dbms.memory.heap.max_size' '777m' ongdb.conf &&
  HEAP_SIZE=222m ongdb-home/bin/ongdb-admin backup &&
  test_expect_java_arg '-Xmx222m'
  test_expect_java_arg '-Xms222m'
"

test_expect_success "should pass parallel collector option" "
  ongdb-home/bin/ongdb-admin &&
  test_expect_java_arg '-XX:+UseParallelGC'
"

test_done
