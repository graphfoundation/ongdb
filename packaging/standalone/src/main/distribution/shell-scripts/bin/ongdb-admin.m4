#!/usr/bin/env bash

include(src/main/distribution/shell-scripts/bin/ongdb-shared.m4)

setup_heap
call_main_class "org.neo4j.commandline.admin.AdminTool" "$@"
