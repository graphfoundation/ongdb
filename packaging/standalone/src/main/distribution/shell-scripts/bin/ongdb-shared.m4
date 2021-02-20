
set -o errexit -o nounset -o pipefail
[[ "${TRACE:-}" ]] && set -o xtrace

declare -r PROGRAM="$(basename "$0")"

# Sets up the standard environment for running Neo4j shell scripts.
#
# Provides these environment variables:
#   ONGDB_HOME
#   ONGDB_CONF
#   ONGDB_DATA
#   ONGDB_LIB
#   ONGDB_LOGS
#   ONGDB_PIDFILE
#   ONGDB_PLUGINS
#   one per config setting, with dots converted to underscores
#
setup_environment() {
  _setup_calculated_paths
  _read_config
  _setup_configurable_paths
}

setup_heap() {
  JAVA_MEMORY_OPTS=()
  if [[ -n "${HEAP_SIZE:-}" ]]; then
    JAVA_MEMORY_OPTS+=("-Xmx${HEAP_SIZE}")
  fi
}

build_classpath() {
  CLASSPATH="${ONGDB_PLUGINS}:${ONGDB_CONF}:${ONGDB_LIB}/*:${ONGDB_PLUGINS}/*"

  # augment with tools.jar, will need JDK
  if [ "${JAVA_HOME:-}" ]; then
    JAVA_TOOLS="${JAVA_HOME}/lib/tools.jar"
    if [[ -e $JAVA_TOOLS ]]; then
      CLASSPATH="${CLASSPATH}:${JAVA_TOOLS}"
    fi
  fi
}

detect_os() {
  if uname -s | grep -q Darwin; then
    DIST_OS="macosx"
  elif [[ -e /etc/gentoo-release ]]; then
    DIST_OS="gentoo"
  else
    DIST_OS="other"
  fi
}

check_java() {
  _find_java_cmd

  version_command=("${JAVA_CMD}" "-version")
  [[ -n "${JAVA_MEMORY_OPTS:-}" ]] && version_command+=("${JAVA_MEMORY_OPTS[@]}")

  JAVA_VERSION=$("${version_command[@]}" 2>&1 | awk -F '"' '/version/ {print $2}')
  if [[ "${JAVA_VERSION}" < "1.8" ]]; then
    echo "ERROR! Neo4j cannot be started using java version ${JAVA_VERSION}. "
    _show_java_help
    exit 1
  fi

  if ! ("${version_command[@]}" 2>&1 | egrep -q "(Java HotSpot\\(TM\\)|OpenJDK|IBM) (64-Bit Server|Server|Client|J9) VM"); then
    echo "WARNING! You are using an unsupported Java runtime. "
    _show_java_help
  fi
}

# Resolve a path relative to $ONGDB_HOME.  Don't resolve if
# the path is absolute.
resolve_path() {
    orig_filename=$1
    if [[ ${orig_filename} == /* ]]; then
        filename="${orig_filename}"
    else
        filename="${ONGDB_HOME}/${orig_filename}"
    fi
    echo "${filename}"
}

call_main_class() {
  setup_environment
  check_java
  build_classpath
  EXTRA_JVM_ARGUMENTS="-Dfile.encoding=UTF-8"
  class_name=$1
  shift

  export ONGDB_HOME ONGDB_CONF

  exec "${JAVA_CMD}" ${JAVA_OPTS:-} ${JAVA_MEMORY_OPTS[@]:-} \
    -classpath "${CLASSPATH}" \
    ${EXTRA_JVM_ARGUMENTS:-} \
    $class_name "$@"
}

_find_java_cmd() {
  [[ "${JAVA_CMD:-}" ]] && return
  detect_os
  _find_java_home

  if [[ "${JAVA_HOME:-}" ]] ; then
    JAVA_CMD="${JAVA_HOME}/bin/java"
    if [[ ! -f "${JAVA_CMD}" ]]; then
      echo "ERROR: JAVA_HOME is incorrectly defined as ${JAVA_HOME} (the executable ${JAVA_CMD} does not exist)"
      exit 1
    fi
  else
    if [ "${DIST_OS}" != "macosx" ] ; then
      # Don't use default java on Darwin because it displays a misleading dialog box
      JAVA_CMD="$(which java || true)"
    fi
  fi

  if [[ ! "${JAVA_CMD:-}" ]]; then
    echo "ERROR: Unable to find Java executable."
    _show_java_help
    exit 1
  fi
}

_find_java_home() {
  [[ "${JAVA_HOME:-}" ]] && return

  case "${DIST_OS}" in
    "macosx")
      JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"
      ;;
    "gentoo")
      JAVA_HOME="$(java-config --jre-home)"
      ;;
  esac
}

_show_java_help() {
  echo "* Please use Oracle(R) Java(TM) 8, OpenJDK(TM) or IBM J9 to run Neo4j."
  echo "* Please see https://neo4j.com/docs/ for Neo4j installation instructions."
}

_setup_calculated_paths() {
  if [[ -z "${ONGDB_HOME:-}" ]]; then
    ONGDB_HOME="$(cd "$(dirname "$0")"/.. && pwd)"
  fi
  : "${ONGDB_CONF:="${ONGDB_HOME}/conf"}"
  readonly ONGDB_HOME ONGDB_CONF
}

_read_config() {
  # - plain key-value pairs become environment variables
  # - keys have '.' chars changed to '_'
  # - keys of the form KEY.# (where # is a number) are concatenated into a single environment variable named KEY
  parse_line() {
    line="$1"
    if [[ "${line}" =~ ^([^#\s][^=]+)=(.+)$ ]]; then
      key="${BASH_REMATCH[1]//./_}"
      value="${BASH_REMATCH[2]}"
      if [[ "${key}" =~ ^(.*)_([0-9]+)$ ]]; then
        key="${BASH_REMATCH[1]}"
      fi
      if [[ "${!key:-}" ]]; then
        export ${key}="${!key} ${value}"
      else
        export ${key}="${value}"
      fi
    fi
  }

  if [[ -f "${ONGDB_CONF}/ongdb-wrapper.conf" ]]; then
    cat >&2 <<EOF
WARNING: ongdb-wrapper.conf is deprecated and support for it will be removed in a future
         version of Neo4j; please move all your settings to ongdb.conf
EOF
  fi

  for file in "ongdb-wrapper.conf" "ongdb.conf"; do
    path="${ONGDB_CONF}/${file}"
    if [ -e "${path}" ]; then
      while read line; do
        parse_line "${line}"
      done <"${path}"
    fi
  done
}

_setup_configurable_paths() {
  ONGDB_DATA=$(resolve_path "${dbms_directories_data:-data}")
  ONGDB_LIB=$(resolve_path "${dbms_directories_lib:-lib}")
  ONGDB_LOGS=$(resolve_path "${dbms_directories_logs:-logs}")
  ONGDB_PLUGINS=$(resolve_path "${dbms_directories_plugins:-plugins}")
  ONGDB_RUN=$(resolve_path "${dbms_directories_run:-run}")
  ONGDB_CERTS=$(resolve_path "${dbms_directories_certificates:-certificates}")

  if [ -z "${dbms_directories_import:-}" ]; then
    ONGDB_IMPORT="NOT SET"
  else
    ONGDB_IMPORT=$(resolve_path "${dbms_directories_import:-}")
  fi

  readonly ONGDB_DATA ONGDB_LIB ONGDB_LOGS ONGDB_PLUGINS ONGDB_RUN ONGDB_IMPORT ONGDB_CERTS
}

print_configurable_paths() {
  cat <<EOF
Directories in use:
  home:         ${ONGDB_HOME}
  config:       ${ONGDB_CONF}
  logs:         ${ONGDB_LOGS}
  plugins:      ${ONGDB_PLUGINS}
  import:       ${ONGDB_IMPORT}
  data:         ${ONGDB_DATA}
  certificates: ${ONGDB_CERTS}
  run:          ${ONGDB_RUN}
EOF
}

print_active_database() {
  echo "Active database: ${dbms_active_database:-graph.db}"
}
