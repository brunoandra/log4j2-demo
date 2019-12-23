#!/bin/bash
build: copyfile assignpermission
copyfile:
	echo "teste";
	if [ -d "../.git/hooks/" ]; then \
		echo "teste1"; \
		cp -f pre-push ../.git/hooks/; \
	fi
assignpermission :
	if [ -e "../.git/hooks/pre-push" ]; then \
		chmod +x ../.git/hooks/pre-push; \
	fi
