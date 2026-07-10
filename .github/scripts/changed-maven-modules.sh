#!/usr/bin/env bash
# Map git changes to Maven module paths for -pl / -am / -amd.
# Usage: changed-maven-modules.sh <base-ref>
# Writes to GITHUB_OUTPUT (if set) and stdout:
#   mode=skip|affected|full
#   modules=path1,path2   (only when mode=affected)
set -euo pipefail

BASE_REF="${1:?Usage: $0 <base-ref>}"

if ! git rev-parse --verify "$BASE_REF" >/dev/null 2>&1; then
  echo "Base ref not found: $BASE_REF — defaulting to full reactor" >&2
  MODE=full
  MODULES=
else
  mapfile -t CHANGED < <(git diff --name-only "$BASE_REF"...HEAD | sed '/^$/d' || true)

  if [[ ${#CHANGED[@]} -eq 0 ]]; then
    MODE=skip
    MODULES=
  else
    declare -A MOD_SET=()
    FORCE_FULL=0
    ONLY_DOCS=1

    for f in "${CHANGED[@]}"; do
      case "$f" in
        *.md|*.adoc|*.txt|LICENSE*|NOTICE*|COPYRIGHT*|.gitignore)
          continue
          ;;
        .github/workflows/*|.github/scripts/*|pom.xml|build-resources/*)
          FORCE_FULL=1
          ONLY_DOCS=0
          ;;
        *)
          ONLY_DOCS=0
          ;;
      esac

      # Walk up to nearest directory containing pom.xml (module root)
      dir="$(dirname "$f")"
      while [[ "$dir" != "." && "$dir" != "/" ]]; do
        if [[ -f "${dir}/pom.xml" ]]; then
          # Root pom → full reactor
          if [[ "$dir" == "." ]]; then
            FORCE_FULL=1
          else
            MOD_SET["$dir"]=1
          fi
          break
        fi
        parent="$(dirname "$dir")"
        [[ "$parent" == "$dir" ]] && break
        dir="$parent"
      done
      if [[ -f pom.xml && ( "$f" == pom.xml || "$dir" == "." ) ]]; then
        if [[ "$f" == pom.xml ]]; then
          FORCE_FULL=1
        fi
      fi
    done

    if [[ "$ONLY_DOCS" -eq 1 ]]; then
      MODE=skip
      MODULES=
    elif [[ "$FORCE_FULL" -eq 1 ]]; then
      MODE=full
      MODULES=
    else
      MODULES="$(printf '%s\n' "${!MOD_SET[@]}" | sort | paste -sd, -)"
      if [[ -z "$MODULES" ]]; then
        MODE=full
      else
        # Cap: too many modules → full reactor is simpler/faster than huge -pl lists
        COUNT="$(awk -F',' '{print NF}' <<<"$MODULES")"
        if [[ "$COUNT" -gt 25 ]]; then
          MODE=full
          MODULES=
        else
          MODE=affected
        fi
      fi
    fi
  fi
fi

echo "mode=${MODE}"
echo "modules=${MODULES}"
if [[ -n "${GITHUB_OUTPUT:-}" ]]; then
  echo "mode=${MODE}" >> "$GITHUB_OUTPUT"
  echo "modules=${MODULES}" >> "$GITHUB_OUTPUT"
fi
