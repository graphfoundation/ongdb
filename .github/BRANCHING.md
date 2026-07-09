# ONgDB 1.1 branch model and audited releases

Public repository: [`graphfoundation/ongdb`](https://github.com/graphfoundation/ongdb).

| Ref | Purpose | Produces release? |
|-----|---------|-------------------|
| `1.1-dev` (and feature branches) | Integration + free CI | **No** |
| `1.1` | Audited release line (PR-only) | Source of release tags only |
| Tags `1.1.*` | Immutable release pointer from `1.1` | Triggers `release.yml` after environment approval |

## Flow

1. Optional: push WIP to private remote `dev` (`graphfoundation/ongdb-dev`).
2. Push or open a PR to public **`1.1-dev`** → free Actions CI (`pr.yml` / `nightly.yml`).
3. When ready to ship: open an **audit PR** `1.1-dev` → **`1.1`**.
4. Required review + green `pr.yml` checks → merge to `1.1`.
5. Create tag `1.1.x` from that commit on `1.1`.
6. Approve the GitHub Environment **`release`** → artifacts build and publish.

**Invariant:** GitHub Release assets come only from a tag whose commit is on protected `1.1`, after PR review into `1.1` and `release` environment approval. Nightly `ci-snapshot-*` artifacts are not releases.

## Repository settings (apply once)

`gh` must be authenticated as an org admin (`gh auth refresh -h github.com`). Prefer:

```bash
.github/scripts/apply-github-settings.sh
```

Or run the equivalent API calls below:

```bash
# Branch protection on release line 1.1
gh api -X PUT repos/graphfoundation/ongdb/branches/1.1/protection \
  --input - <<'EOF'
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
  "block_creations": false,
  "required_conversation_resolution": true
}
EOF

# Create release environment (add required reviewers in the UI after this)
gh api -X PUT repos/graphfoundation/ongdb/environments/release \
  --input - <<'EOF'
{
  "wait_timer": 0,
  "prevent_self_review": false,
  "deployment_branch_policy": null
}
EOF
```

Do **not** restrict the environment to tags-only if you want `workflow_dispatch` dry-runs; `release.yml` already refuses tags whose commit is not on `origin/1.1`.

Also in the GitHub UI:

- Confirm repository visibility remains **Public** (free standard runners on all branches).
- Settings → Actions → General: allow GitHub-hosted runners; leave larger runners disabled / budget **$0**.
- Organization → Billing → Budgets: set an Actions spend alert/budget so accidental larger-runner use cannot surprise-bill.

**Nightly cron:** GitHub only schedules workflows from the repository **default** branch (currently `1.0`). `nightly.yml` is therefore also committed on `1.0`; the job always checks out `1.1-dev` for the build. `workflow_dispatch` works from any branch that contains the file.

## Tag discipline

```bash
git fetch origin 1.1
git checkout 1.1
git pull --ff-only origin 1.1
git tag -a 1.1.0 -m "ONgDB 1.1.0"
git push origin 1.1.0
```

`release.yml` fails if the tagged commit is not an ancestor of `origin/1.1`.
