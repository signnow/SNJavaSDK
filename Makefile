.PHONY: mock-up mock-stop mock-restart test tests example examples

.SILENT: ;               # no need for @
.ONESHELL: ;             # recipes execute in same shell
.EXPORT_ALL_VARIABLES: ; # send all vars to shell

SHELL := /bin/bash
APP_DIR ?= ${PWD}

# Raise WireMock docker container to mock signNow API
mock-up:
	. ${APP_DIR}/src/test/resources/wiremock-config.env && \
	docker run -d --rm \
        -p $$WIREMOCK_PORT:8080 \
        -v $$WIREMOCK_ROOT_DIR:/home/wiremock/mappings \
        --name wiremock \
        $$WIREMOCK_IMAGE

# Stop WireMock docker container
mock-stop:
	docker stop wiremock

# Stop/Start WireMock docker container
mock-restart: mock-stop mock-up
	docker ps

# Run one test by specified argument
# Example:
#   make test T=SdkTest
#   make test T=TokenTest#testPostToken
test:
	mvn -Dtest=${T} test

# Run all the tests
tests:
	mvn test

# Run an example from examples/ directory
# Examples:
#   make example E=DocumentGetExample
#   make examples
example:
	@if [ -z "$(E)" ]; then echo "Usage: make example E=ExampleClassName"; exit 1; fi
	./examples/bin/run $(E)

# Run all examples
examples:
	./examples/bin/run all
