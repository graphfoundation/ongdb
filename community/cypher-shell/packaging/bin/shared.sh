#!/bin/bash
# Parse the version from a cypher shell tar ball like 'cypher-shell-4.3.0-SNAPSHOT.zip'
# and parses out
# version: 3.2.0-SNAPSHOT
# deb_version: 3.2.0~SNAPSHOT
# rpm_version: 3.2.0
# version_label: SNAPSHOT (or empty if no label present)
parse_version_from_zipfile() {
  local filename name_stripped name_and_extension_stripped
  filename=$(basename "${1}")
  name_stripped=${filename#"cypher-shell-"}
  name_and_extension_stripped=${name_stripped%".zip"}

  parse_version "${name_and_extension_stripped}"
}

parse_version() {
  version="${1}"
  # Deb-files do not include the epoch in their filename so provide an
  # epoch-less variant for Make
  deb_version=${version/-/"~"}
  # Need the 1: prefix (epoch) to make sure that newer debian packages
  # are in fact considered newer, to overrule bad version numbers in
  # old versions. We also add -1 to get a unique filename because
  # epochs are not included in deb-filenames.
  deb_version_full="1:${deb_version}"
  rpm_version=${version%-*}
  version_label=${version#*-}
  # if no label
  if [[ "${version_label}" = "${rpm_version}" ]]; then
    version_label=""
  fi
  # https://fedoraproject.org/wiki/Packaging:Versioning
  if [ -z ${version_label} ]; then
    # Release version
    rpm_release="1"
  else
    # Pre-release version
    rpm_release="0.${version_label}.1"
  fi

  export version
  export version_label
  export deb_version
  export deb_version_full
  export rpm_version
  export rpm_release
}
