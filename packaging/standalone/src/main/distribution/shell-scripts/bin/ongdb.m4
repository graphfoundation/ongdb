#!/usr/bin/env bash
# Copyright (c) 2002-2018 "Neo Technology,"
# Network Engine for Objects in Lund AB [http://neotechnology.com]
#
# This file is part of Neo4j.
#
# Neo4j is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
#
# Callers may provide the following environment variables to customize this script:
#  * JAVA_HOME
#  * JAVA_CMD
#  * ONGDB_HOME
#  * ONGDB_CONF
#  * ONGDB_START_WAIT

include(src/main/distribution/shell-scripts/bin/ongdb-shared.m4)

setup_arbiter_options() {
  is_arbiter() {
    compgen -G "${ONGDB_LIB}/ongdb-server-enterprise-*.jar" >/dev/null && \
      [[ "$(echo "${dbms_mode:-}" | tr [:lower:] [:upper:])" == "ARBITER" ]]
  }

  if is_arbiter; then
    SHUTDOWN_TIMEOUT=20
    MIN_ALLOWED_OPEN_FILES=1
    MAIN_CLASS="org.neo4j.server.enterprise.ArbiterEntryPoint"

    print_start_message() {
      echo "Started in ARBITER mode."
      echo "This instance is now joining the cluster."
    }
  else
    SHUTDOWN_TIMEOUT="${ONGDB_SHUTDOWN_TIMEOUT:-120}"
    MIN_ALLOWED_OPEN_FILES=40000
    MAIN_CLASS="#{neo4j.mainClass}"

    print_start_message() {
      # Global default
      ONGDB_DEFAULT_ADDRESS="${dbms_connectors_default_listen_address:-localhost}"

      if [[ "${dbms_connector_http_enabled:-true}" == "false" ]]; then
        # Only HTTPS connector enabled
        # First read deprecated 'address' setting
        ONGDB_SERVER_ADDRESS="${dbms_connector_https_address:-:7473}"
        # Overridden by newer 'listen_address' if specified
        ONGDB_SERVER_ADDRESS="${dbms_connector_https_listen_address:-${ONGDB_SERVER_ADDRESS}}"
        # If it's only a port we need to add the address (it starts with a colon in that case)
        case ${ONGDB_SERVER_ADDRESS} in
          :*)
            ONGDB_SERVER_ADDRESS="${ONGDB_DEFAULT_ADDRESS}${ONGDB_SERVER_ADDRESS}";;
        esac
        # Add protocol
        ONGDB_SERVER_ADDRESS="https://${ONGDB_SERVER_ADDRESS}"
      else
        # HTTP connector enabled - same as https but different settings
        ONGDB_SERVER_ADDRESS="${dbms_connector_http_address:-:7474}"
        ONGDB_SERVER_ADDRESS="${dbms_connector_http_listen_address:-${ONGDB_SERVER_ADDRESS}}"
        case ${ONGDB_SERVER_ADDRESS} in
          :*)
            ONGDB_SERVER_ADDRESS="${ONGDB_DEFAULT_ADDRESS}${ONGDB_SERVER_ADDRESS}";;
        esac
        ONGDB_SERVER_ADDRESS="http://${ONGDB_SERVER_ADDRESS}"
      fi

      echo "Starting ongdb (pid ${ONGDB_PID}). It is available at ${ONGDB_SERVER_ADDRESS}/"

      if [[ "$(echo "${dbms_mode:-}" | tr [:lower:] [:upper:])" == "HA" ]]; then
        echo "This HA instance will be operational once it has joined the cluster."
      else
        echo "There may be a short delay until the server is ready."
      fi
    }
  fi
}

check_status() {
  if [ -e "${ONGDB_PIDFILE}" ] ; then
    ONGDB_PID=$(cat "${ONGDB_PIDFILE}")
    kill -0 "${ONGDB_PID}" 2>/dev/null || unset ONGDB_PID
  fi
}

check_limits() {
  detect_os
  if [ "${DIST_OS}" != "macosx" ] ; then
    ALLOWED_OPEN_FILES="$(ulimit -n)"

    if [ "${ALLOWED_OPEN_FILES}" -lt "${MIN_ALLOWED_OPEN_FILES}" ]; then
      echo "WARNING: Max ${ALLOWED_OPEN_FILES} open files allowed, minimum of ${MIN_ALLOWED_OPEN_FILES} recommended. See the Neo4j manual."
    fi
  fi
}

setup_java_opts() {
  JAVA_OPTS=("-server")

  if [[ -n "${dbms_memory_heap_initial_size:-}" ]]; then
    local mem="${dbms_memory_heap_initial_size}"
    if ! [[ ${mem} =~ .*[gGmMkK] ]]; then
      mem="${mem}m"
      cat >&2 <<EOF
WARNING: dbms.memory.heap.initial_size will require a unit suffix in a
         future version of ONgDB. Please add a unit suffix to your
         configuration. Example:

         dbms.memory.heap.initial_size=512m
                                          ^
EOF
    fi
    JAVA_MEMORY_OPTS+=("-Xms${mem}")
  fi
  if [[ -n "${dbms_memory_heap_max_size:-}" ]]; then
    local mem="${dbms_memory_heap_max_size}"
    if ! [[ ${mem} =~ .*[gGmMkK] ]]; then
      mem="${mem}m"
      cat >&2 <<EOF
WARNING: dbms.memory.heap.max_size will require a unit suffix in a
         future version of ONgDB. Please add a unit suffix to your
         configuration. Example:

         dbms.memory.heap.max_size=512m
                                      ^
EOF
    fi
    JAVA_MEMORY_OPTS+=("-Xmx${mem}")
  fi
  [[ -n "${JAVA_MEMORY_OPTS:-}" ]] && JAVA_OPTS+=("${JAVA_MEMORY_OPTS[@]}")

  if [[ "${dbms_logs_gc_enabled:-}" = "true" ]]; then
    JAVA_OPTS+=("-Xloggc:${ONGDB_LOGS}/gc.log" \
                "-XX:+UseGCLogFileRotation" \
                "-XX:NumberOfGCLogFiles=${dbms_logs_gc_rotation_keep_number:-5}" \
                "-XX:GCLogFileSize=${dbms_logs_gc_rotation_size:-20m}")
    if [[ -n "${dbms_logs_gc_options:-}" ]]; then
      JAVA_OPTS+=(${dbms_logs_gc_options}) # unquoted to split on spaces
    else
      JAVA_OPTS+=("-XX:+PrintGCDetails" "-XX:+PrintGCDateStamps" "-XX:+PrintGCApplicationStoppedTime" \
                  "-XX:+PrintPromotionFailure" "-XX:+PrintTenuringDistribution")
    fi
  fi

  if [[ -n "${dbms_jvm_additional:-}" ]]; then
    JAVA_OPTS+=(${dbms_jvm_additional}) # unquoted to split on spaces
  fi
}

assemble_command_line() {
  retval=("${JAVA_CMD}" "-cp" "${CLASSPATH}" "${JAVA_OPTS[@]}" "-Dfile.encoding=UTF-8" "${MAIN_CLASS}" \
          "--home-dir=${ONGDB_HOME}" "--config-dir=${ONGDB_CONF}")
}

do_console() {
  check_status
  if [[ "${ONGDB_PID:-}" ]] ; then
    echo "Neo4j is already running (pid ${ONGDB_PID})."
    exit 1
  fi

  echo "Starting ONgDB."

  check_limits
  build_classpath

  assemble_command_line
  command_line=("${retval[@]}")
  exec "${command_line[@]}"
}

do_start() {
  check_status
  if [[ "${ONGDB_PID:-}" ]] ; then
    echo "Neo4j is already running (pid ${ONGDB_PID})."
    exit 0
  fi

  echo "Starting ONgDB."

  check_limits
  build_classpath

  assemble_command_line
  command_line=("${retval[@]}")
  nohup "${command_line[@]}" >>"${CONSOLE_LOG}" 2>&1 &
  echo "$!" >"${ONGDB_PIDFILE}"

  : "${ONGDB_START_WAIT:=5}"
  end="$((SECONDS+ONGDB_START_WAIT))"
  while true; do
    check_status

    if [[ "${ONGDB_PID:-}" ]]; then
      break
    fi

    if [[ "${SECONDS}" -ge "${end}" ]]; then
      echo "Unable to start. See ${CONSOLE_LOG} for details."
      rm "${ONGDB_PIDFILE}"
      return 1
    fi

    sleep 1
  done

  print_start_message
  echo "See ${CONSOLE_LOG} for current status."
}

do_stop() {
  check_status

  if [[ ! "${ONGDB_PID:-}" ]] ; then
    echo "Neo4j not running"
    [ -e "${ONGDB_PIDFILE}" ] && rm "${ONGDB_PIDFILE}"
    return 0
  else
    echo -n "Stopping ONgDB."
    end="$((SECONDS+SHUTDOWN_TIMEOUT))"
    while true; do
      check_status

      if [[ ! "${ONGDB_PID:-}" ]]; then
        echo " stopped"
        [ -e "${ONGDB_PIDFILE}" ] && rm "${ONGDB_PIDFILE}"
        return 0
      fi

      kill "${ONGDB_PID}" 2>/dev/null || true

      if [[ "${SECONDS}" -ge "${end}" ]]; then
        echo " failed to stop"
        echo "Neo4j (pid ${ONGDB_PID}) took more than ${SHUTDOWN_TIMEOUT} seconds to stop."
        echo "Please see ${CONSOLE_LOG} for details."
        return 1
      fi

      echo -n "."
      sleep 1
    done
  fi
}

do_status() {
  check_status
  if [[ ! "${ONGDB_PID:-}" ]] ; then
    echo "Neo4j is not running"
    exit 3
  else
    echo "Neo4j is running at pid ${ONGDB_PID}"
  fi
}

do_version() {
  build_classpath

  assemble_command_line
  command_line=("${retval[@]}" "--version")
  exec "${command_line[@]}"
}

main() {
  setup_environment
  CONSOLE_LOG="${ONGDB_LOGS}/ongdb.log"
  ONGDB_PIDFILE="${ONGDB_RUN}/neo4j.pid"
  readonly CONSOLE_LOG ONGDB_PIDFILE

  setup_java_opts
  check_java
  setup_arbiter_options

  case "${1:-}" in
    console)
      print_active_database
      print_configurable_paths
      do_console
      ;;

    start)
      print_active_database
      print_configurable_paths
      do_start
      ;;

    stop)
      do_stop
      ;;

    restart)
      do_stop
      do_start
      ;;

    status)
      do_status
      ;;

    --version|version)
      do_version
      ;;

    help)
      echo "Usage: ${PROGRAM} { console | start | stop | restart | status | version }"
      ;;

    *)
      echo >&2 "Usage: ${PROGRAM} { console | start | stop | restart | status | version }"
      exit 1
      ;;
  esac
}

main "$@"
