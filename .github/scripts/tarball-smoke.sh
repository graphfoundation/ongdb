#!/usr/bin/env bash
# Smoke-test an ONgDB standalone unix tarball: extract, start, wait for HTTP, stop.
set -euo pipefail

TARBALL="${1:?Usage: tarball-smoke.sh <ongdb-*-unix.tar.gz>}"
if [[ ! -f "$TARBALL" ]]; then
  echo "Tarball not found: $TARBALL" >&2
  exit 1
fi

WORKDIR="$(mktemp -d)"
cleanup() {
  if [[ -n "${ONGDB_HOME:-}" && -x "${ONGDB_HOME}/bin/ongdb" ]]; then
    "${ONGDB_HOME}/bin/ongdb" stop || true
  fi
  rm -rf "$WORKDIR"
}
trap cleanup EXIT

tar -xzf "$TARBALL" -C "$WORKDIR"
ONGDB_HOME="$(find "$WORKDIR" -mindepth 1 -maxdepth 1 -type d | head -n 1)"
if [[ -z "$ONGDB_HOME" || ! -x "${ONGDB_HOME}/bin/ongdb" ]]; then
  echo "Could not locate bin/ongdb under extracted tarball" >&2
  exit 1
fi

echo "Starting ONgDB from ${ONGDB_HOME}"
"${ONGDB_HOME}/bin/ongdb" start

HTTP_PORT=7474
ATTEMPTS=0
RETRIES=90
STATUS=0
until [[ "$STATUS" == "200" ]]; do
  ATTEMPTS=$((ATTEMPTS + 1))
  STATUS="$(curl -s -o /dev/null -w '%{http_code}' --connect-timeout 1 --max-time 3 \
    "http://127.0.0.1:${HTTP_PORT}" || echo 0)"
  if [[ "$ATTEMPTS" -gt "$RETRIES" ]]; then
    echo "ONgDB did not become ready on :${HTTP_PORT} within ${RETRIES}s (last status=${STATUS})" >&2
    "${ONGDB_HOME}/bin/ongdb" status || true
    exit 1
  fi
  sleep 1
done

echo "ONgDB HTTP ready (status ${STATUS}) after ${ATTEMPTS}s"
"${ONGDB_HOME}/bin/ongdb" stop
echo "Tarball smoke OK: $(basename "$TARBALL")"
