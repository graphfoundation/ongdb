#!/usr/bin/env bash
# Apply branch protection for release vs dev lines on graphfoundation/ongdb.
#
# Solo-maintainer model (GitHub has no "self-approve own PR"):
#   - Everyone else: must get an approving review (+ CODEOWNERS) before merge
#   - Maintainer: listed in bypass_pull_request_allowances so they can merge
#     their own PRs without a second person, while still needing status checks
#   - enforce_admins=true so status checks apply even to admins
#
# Requires: gh auth with admin on the repo.
set -euo pipefail

REPO="${REPO:-graphfoundation/ongdb}"
MAINTAINER_LOGIN="${RELEASE_REVIEWER:-$(gh api user --jq .login)}"
MAINTAINER_ID="$(gh api "users/${MAINTAINER_LOGIN}" --jq .id)"

echo "Applying settings to ${REPO} (maintainer bypass: @${MAINTAINER_LOGIN})"
gh api user --jq .login >/dev/null

protect_release() {
  local branch="$1"
  echo "Release protection: ${branch} (full-reactor + reviews; @${MAINTAINER_LOGIN} may bypass reviews)"
  gh api -X PUT "repos/${REPO}/branches/${branch}/protection" --input - <<EOF
{
  "required_status_checks": {
    "strict": true,
    "contexts": ["full-reactor"]
  },
  "enforce_admins": true,
  "required_pull_request_reviews": {
    "required_approving_review_count": 1,
    "dismiss_stale_reviews": true,
    "require_code_owner_reviews": true,
    "bypass_pull_request_allowances": {
      "users": ["${MAINTAINER_LOGIN}"]
    }
  },
  "restrictions": null,
  "allow_force_pushes": false,
  "allow_deletions": false,
  "required_conversation_resolution": true
}
EOF
}

protect_dev() {
  local branch="$1"
  echo "Dev protection: ${branch} (dev-quality-gate + reviews; @${MAINTAINER_LOGIN} may bypass reviews)"
  gh api -X PUT "repos/${REPO}/branches/${branch}/protection" --input - <<EOF
{
  "required_status_checks": {
    "strict": true,
    "contexts": ["dev-quality-gate"]
  },
  "enforce_admins": true,
  "required_pull_request_reviews": {
    "required_approving_review_count": 1,
    "dismiss_stale_reviews": true,
    "require_code_owner_reviews": true,
    "bypass_pull_request_allowances": {
      "users": ["${MAINTAINER_LOGIN}"]
    }
  },
  "restrictions": null,
  "allow_force_pushes": false,
  "allow_deletions": false,
  "required_conversation_resolution": false
}
EOF
}

for b in 1.0 1.1 2.0; do
  protect_release "$b" || echo "WARN: could not protect ${b} (branch missing?)"
done

for b in 1.0-dev 1.1-dev 2.0-dev; do
  protect_dev "$b" || echo "WARN: could not protect ${b} (branch missing?)"
done

# Environment approval is separate from PR reviews: prevent_self_review=false lets
# the maintainer approve their own release deployment after tagging.
gh api -X PUT "repos/${REPO}/environments/release" --input - <<EOF
{
  "wait_timer": 0,
  "prevent_self_review": false,
  "reviewers": [
    {"type": "User", "id": ${MAINTAINER_ID}}
  ],
  "deployment_branch_policy": null
}
EOF
echo "Environment 'release' ensured; @${MAINTAINER_LOGIN} can self-approve deployments."
echo
echo "Manual: Org Billing → Actions spend budget (larger runners \$0)."
echo "Ensure nightly.yml + full-reactor-public.yml exist on each release line (or default branch)."
