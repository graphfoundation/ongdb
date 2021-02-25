#!/usr/bin/env bash

test_description="Test running ongdb-import"

. ./lib/sharness.sh
fake_install

test_expect_success "should invoke import main class" "
  ongdb-home/bin/ongdb-import || true &&
  test_expect_java_arg 'org.neo4j.tooling.ImportTool'
"

test_done
