.PHONY: help
script_names=ongdb ongdb-admin ongdb-backup ongdb-import ongdb-shell
scripts=$(patsubst %,src/main/distribution/shell-scripts/bin/%,${script_names})
help: ## Print this help text
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

generate-scripts: ${scripts} ## Build shell scripts using m4
		
%: %.m4 src/main/distribution/shell-scripts/bin/ongdb-shared.m4
	m4 $< > $@
	chmod 0755 $@	
