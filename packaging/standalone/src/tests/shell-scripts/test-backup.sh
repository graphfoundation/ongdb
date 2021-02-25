#!/usr/bin/env bash

test_description="Test running ongdb-backup"

. ./lib/sharness.sh
fake_install

test_expect_success "should invoke backup main class" "
  ongdb-home/bin/ongdb-backup || true &&
  test_expect_java_arg 'org.neo4j.backup.BackupTool'
"

test_done
