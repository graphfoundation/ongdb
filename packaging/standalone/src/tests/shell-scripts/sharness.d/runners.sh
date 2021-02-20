run_console() {
  ongdb-home/bin/ongdb console
}

start_daemon() {
  export JAVA_SENTINEL=$(mktemp /tmp/java-sentinel.XXXXX)
  trap "rm -rf ${JAVA_SENTINEL}" EXIT
  ongdb-home/bin/ongdb start
}

run_daemon() {
  start_daemon && \
    FAKE_JAVA_DISABLE_RECORD_ARGS="t" ongdb-home/bin/ongdb stop
}
