#!/usr/bin/env bash
# Apply branch protection and release environment for graphfoundation/ongdb.
# Requires: gh auth with admin on the repo (gh auth refresh -h github.com).
set -euo pipefail

REPO="${REPO:-graphfoundation/ongdb}"
BRANCH="${RELEASE_BRANCH:-1.1}"

echo "Applying settings to ${REPO} (release branch ${BRANCH})"
gh api user --jq .login >/dev/null

gh api -X PUT "repos/${REPO}/branches/${BRANCH}/protection" --input - <<EOF
{
  "required_status_checks": {
    "strict": true,
    "contexts": [
      "compile-unit",
      "community-gate",
      "enterprise-security",
      "enterprise-backup"
    ]
  },
  "enforce_admins": true,
  "required_pull_request_reviews": {
    "required_approving_review_count": 1,
    "dismiss_stale_reviews": true,
    "require_code_owner_reviews": true
  },
  "restrictions": null,
  "allow_force_pushes": false,
  "allow_deletions": false,
  "required_conversation_resolution": true
}
EOF
echo "Branch protection applied on ${BRANCH}"

REVIEWER_LOGIN="${RELEASE_REVIEWER:-$(gh api user --jq .login)}"
REVIEWER_ID="$(gh api "users/${REVIEWER_LOGIN}" --jq .id)"

gh api -X PUT "repos/${REPO}/environments/release" --input - <<EOF
{
  "wait_timer": 0,
  "prevent_self_review": false,
  "reviewers": [
    {"type": "User", "id": ${REVIEWER_ID}}
  ],
  "deployment_branch_policy": null
}
EOF
echo "Environment 'release' created/updated with required reviewer @${REVIEWER_LOGIN}."
echo
echo "Manual steps remaining in GitHub UI:"
echo "  1. Org Billing → Budgets → Actions spend alert (larger runners \$0)"
echo "  2. Confirm ${REPO} is Public"
echo "  3. Ensure nightly.yml exists on the repository default branch (for cron),"
echo "     or use workflow_dispatch; job checks out 1.1-dev either way."
