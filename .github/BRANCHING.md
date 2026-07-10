# ONgDB branch model and CI gates

Public repository: [`graphfoundation/ongdb`](https://github.com/graphfoundation/ongdb).

| Ref | Purpose | Required CI | Produces release? |
|-----|---------|-------------|-------------------|
| `*-dev` (e.g. `1.1-dev`) | Integration | **`dev-quality-gate`** (module-aware) | **No** |
| Release lines `1.0` / `1.1` / `2.0` | Audited ship lines | **`full-reactor`** + nightly | Tags only |
| Tags `1.1.*` | Immutable release pointer | `release.yml` + Environment `release` | Yes |

Details: ongdb-dev [CI-BRANCH-STRATEGY.md](https://github.com/graphfoundation/ongdb-dev) (docs) / product scripts under `.github/scripts/`.

## Flow

1. Optional: push WIP to private remote `dev` (`graphfoundation/ongdb-dev`).
2. PR into **`1.1-dev`** → `dev-quality-gate` (changed modules + `-am`/`-amd`, or full if blast radius is large).
3. Audit PR **`1.1-dev` → `1.1`** → must pass **`full-reactor`**.
4. Tag `1.1.x` / `1.1.0-rc01` from `1.1` → approve Environment **`release`**.

**Invariant:** GitHub Release assets come only from a tag on protected `1.1` after Environment approval. Nightly snapshots are not releases.

## Repository settings

```bash
.github/scripts/apply-github-settings.sh
```

That script sets:

- Release branches `1.0`, `1.1`, `2.0` → require `full-reactor`
- Dev branches `1.0-dev`, `1.1-dev`, `2.0-dev` → require `dev-quality-gate`
- Environment `release` with required reviewer

**Nightly cron:** loaded from the repo **default** branch; builds matrix `1.0`, `1.1`, `2.0`.

## Tag discipline

```bash
git fetch origin 1.1
git checkout 1.1 && git pull --ff-only origin 1.1
# versions:set to match tag, then:
git tag -a 1.1.0-rc01 -m "ONgDB 1.1.0-rc01"
git push origin 1.1.0-rc01
```

`release.yml` fails if the tagged commit is not an ancestor of `origin/1.1`.
