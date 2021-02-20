#!/usr/bin/env bash

test_description="Test shell argument handling."

. ./lib/sharness.sh
fake_install

test_expect_success "should invoke shell main class" "
  ongdb-home/bin/ongdb-shell || true &&
  test_expect_java_arg 'org.neo4j.shell.StartClient'
"

test_done
