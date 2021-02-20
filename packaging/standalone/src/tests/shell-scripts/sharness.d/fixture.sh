fake_install() {
  path="ongdb-home"

  mkdir -p "${path}/bin"
  cp ../../../main/distribution/shell-scripts/bin/* "${path}/bin" 2>/dev/null
  chmod +x "${path}/bin/neo4j"
  mkdir -p "${path}/conf"
  mkdir -p "${path}/data/databases"
  mkdir -p "${path}/lib"
  mkdir -p "${path}/logs"
  mkdir -p "${path}/run"
}

clear_config() {
  rm -f ongdb-home/conf/*
}

set_config() {
  name=$1
  value=$2
  file=$3
  echo "${name}=${value}" >>"${SHARNESS_TRASH_DIRECTORY}/ongdb-home/conf/${file}"
}

set_main_class() {
  class=$1
  sed -i.bak -e "s/#{neo4j\.mainClass}/${class}/" ongdb-home/bin/ongdb
}

neo4j_home() {
  echo "${SHARNESS_TRASH_DIRECTORY}/ongdb-home"
}

export JAVA_CMD="$(pwd)/sharness.d/fake-java"
