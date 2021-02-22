#!/usr/bin/env bash

test_description="Test happy path operations for the daemon"

. ./lib/sharness.sh
fake_install

test_expect_success "should report that it's not running before started" "
  test_expect_code 3 ongdb-home/bin/ongdb status
"

test_expect_success "should start" "
  start_daemon >neo4j.stdout
"

test_expect_success "should output server URL" "
  test_expect_file_matching 'http://localhost:7474' neo4j.stdout
"

test_expect_success "should report that it's running" "
  ongdb-home/bin/ongdb status
"

test_expect_success "should redirect output to neo4j.log" "
  test_expect_file_matching 'stdout from java' ongdb-home/logs/neo4j.log &&
  test_expect_file_matching 'stderr from java' ongdb-home/logs/neo4j.log
"

test_expect_success "should display log path" "
  test_expect_file_matching 'See $(ongdb_home)/logs/neo4j.log for current status.' neo4j.stdout
"

test_expect_success "should exit 0 if already running" "
  ongdb-home/bin/ongdb start
"

test_expect_success "should stop" "
  ongdb-home/bin/ongdb stop
"

test_expect_success "should exit 0 if already stopped" "
  ongdb-home/bin/ongdb stop
"

test_expect_success "should report that it's not running once stopped" "
  test_expect_code 3 ongdb-home/bin/ongdb status
"

test_done
